package com.pouffy.forgedinfire.main.tools.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;
import com.pouffy.forgedinfire.ForgedInFire;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;
import slimeknights.mantle.client.TooltipKey;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;
import slimeknights.tconstruct.library.utils.Util;

import javax.annotation.Nullable;
import java.util.List;

public class IcedModifier extends Modifier {
    private static final Component ICED_BONUS = ForgedInFire.makeTranslation("modifier", "iced.attack_bonus");

    @Override
    public int afterEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getAttacker();

        if (target != null) {
            FrozenProperties.setFrozenFor(target, 200);
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2));
            target.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 100, 2));
            target.knockback(1.0, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        }
        if (target instanceof EntityFireDragon) {
            target.hurt(DamageSource.DROWN, 13.5F);
        }
        return 0;
    }
    @Override
    public void addInformation(IToolStackView tool, int level, @Nullable Player player, List<Component> tooltip, TooltipKey tooltipKey, TooltipFlag tooltipFlag) {
        float amount = 8.0f;
        tooltip.add(applyStyle(new TextComponent(Util.BONUS_FORMAT.format(amount)).append(" ").append(ICED_BONUS)));
    }
}
