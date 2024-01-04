package com.pouffy.forgedinfire.main.tools.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.EquipmentContext;
import slimeknights.tconstruct.library.tools.helper.ToolDamageUtil;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class ScorchThornsModifier extends Modifier {
    
    public ScorchThornsModifier() {
    }
    
    public void onAttacked(IToolStackView tool, int level, EquipmentContext context, EquipmentSlot slotType, DamageSource source, float amount, boolean isDirectDamage) {
        LivingEntity attacker = (LivingEntity) source.getEntity();
        if (attacker != null && isDirectDamage) {
                LivingEntity user = context.getEntity();
                ToolDamageUtil.damageAnimated(tool, 1, user, slotType);
                if (!attacker.isOnFire()) {
                    attacker.setSecondsOnFire(5);
                    attacker.knockback(1.0, user.getX() - attacker.getX(), user.getZ() - attacker.getZ());
                }
                if (attacker instanceof EntityIceDragon) {
                    attacker.hurt(DamageSource.IN_FIRE, 13.5F);
                }
            }
    }
}

