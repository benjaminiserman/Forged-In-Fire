package com.pouffy.forgedinfire.main.tools.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.pouffy.forgedinfire.ForgedInFire;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.TooltipFlag;
import slimeknights.mantle.client.TooltipKey;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.impl.IncrementalModifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;
import slimeknights.tconstruct.library.utils.Util;

import javax.annotation.Nullable;
import net.minecraft.network.chat.Component;

import java.util.List;

public class FlamedModifier extends Modifier {
    private static final Component FLAMED_BONUS = ForgedInFire.makeTranslation("modifier", "flamed.attack_bonus");
    @Override
    public float beforeEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damage, float baseKnockback, float knockback) {
        // vanilla hack: apply fire so the entity drops the proper items on instant kill
        LivingEntity target = context.getLivingTarget();
        if (target != null && !target.isOnFire()) {
            target.setRemainingFireTicks(1);
        }
        return knockback;
    }

    @Override
    public void failedEntityHit(IToolStackView tool, int level, ToolAttackContext context) {
        // conclusion of vanilla hack: we don't want the target on fire if we did not hit them
        LivingEntity target = context.getLivingTarget();
        if (target != null && target.isOnFire()) {
            target.clearFire();
        }
    }

    @Override
    public int afterEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getAttacker();
        if (target != null) {
            target.setSecondsOnFire(5);
            target.knockback(1.0, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        }
        if (target instanceof EntityIceDragon) {
            target.hurt(DamageSource.IN_FIRE, 13.5F);
        }
        return 0;
    }
    @Override
    public void addInformation(IToolStackView tool, int level, @Nullable Player player, List<Component> tooltip, TooltipKey tooltipKey, TooltipFlag tooltipFlag) {
        float amount = 8.0f;
        tooltip.add(applyStyle(new TextComponent(Util.BONUS_FORMAT.format(amount)).append(" ").append(FLAMED_BONUS)));
    }
}
