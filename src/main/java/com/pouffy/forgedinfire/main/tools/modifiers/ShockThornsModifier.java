package com.pouffy.forgedinfire.main.tools.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.EquipmentContext;
import slimeknights.tconstruct.library.tools.helper.ToolDamageUtil;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class ShockThornsModifier extends Modifier {
    
    public ShockThornsModifier() {
    }
    
    public void onAttacked(IToolStackView tool, int level, EquipmentContext context, EquipmentSlot slotType, DamageSource source, float amount, boolean isDirectDamage) {
        LivingEntity attacker = (LivingEntity) source.getEntity();
        if (attacker != null && isDirectDamage) {
                LivingEntity user = context.getEntity();
                ToolDamageUtil.damageAnimated(tool, 1, user, slotType);
                boolean flag = true;
                if (user instanceof Player && (double)user.attackAnim > 0.2) {
                    flag = false;
                }
                if (!user.level.isClientSide && flag) {
                    //make the user immune to lightning
                    LightningBolt lightningboltentity = EntityType.LIGHTNING_BOLT.create(attacker.level);
                    lightningboltentity.moveTo(attacker.position());
                    if (!attacker.level.isClientSide) {
                        attacker.knockback(1.0, user.getX() - attacker.getX(), user.getZ() - attacker.getZ());
                        attacker.level.addFreshEntity(lightningboltentity);
                    }
                }
                if (attacker instanceof EntityFireDragon || attacker instanceof EntityIceDragon) {
                    attacker.hurt(DamageSource.LIGHTNING_BOLT, 9.5F);
                }
            }
    }
}
