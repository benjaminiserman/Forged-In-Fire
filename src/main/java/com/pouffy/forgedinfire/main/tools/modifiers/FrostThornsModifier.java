package com.pouffy.forgedinfire.main.tools.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.EquipmentContext;
import slimeknights.tconstruct.library.tools.helper.ToolDamageUtil;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class FrostThornsModifier extends Modifier {
    public FrostThornsModifier() {
    }
    
    public void onAttacked(IToolStackView tool, int level, EquipmentContext context, EquipmentSlot slotType, DamageSource source, float amount, boolean isDirectDamage) {
        LivingEntity attacker = (LivingEntity) source.getEntity();
        if (attacker != null && isDirectDamage) {
                LivingEntity user = context.getEntity();
                ToolDamageUtil.damageAnimated(tool, 1, user, slotType);
                FrozenProperties.setFrozenFor(attacker, 60);
                attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2));
                attacker.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 100, 2));
                attacker.knockback(1.0, 0.0, 0.0);
                if (attacker instanceof EntityFireDragon) {
                    attacker.knockback(1.0, user.getX() - attacker.getX(), user.getZ() - attacker.getZ());
                    attacker.hurt(DamageSource.DROWN, 13.5F);
                }
            }
    }
}
