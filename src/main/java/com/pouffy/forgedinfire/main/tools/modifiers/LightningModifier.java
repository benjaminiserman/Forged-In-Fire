package com.pouffy.forgedinfire.main.tools.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.pouffy.forgedinfire.ForgedInFire;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.TooltipFlag;
import slimeknights.mantle.client.TooltipKey;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;
import slimeknights.tconstruct.library.utils.Util;

import javax.annotation.Nullable;
import java.util.List;

public class LightningModifier extends Modifier {
    private static final Component LIGHTNING_BONUS = ForgedInFire.makeTranslation("modifier", "lightning.attack_bonus");

    @Override
    public int afterEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getAttacker();
        boolean flag = true;
        if (attacker instanceof Player && (double)attacker.attackAnim > 0.2) {
            flag = false;
        }

        if (!attacker.level.isClientSide && flag) {
            LightningBolt lightningboltentity = (LightningBolt) EntityType.LIGHTNING_BOLT.create(target.level);
            lightningboltentity.moveTo(target.position());
            if (!target.level.isClientSide) {
                target.level.addFreshEntity(lightningboltentity);
            }
        }

        if (target instanceof EntityFireDragon || target instanceof EntityIceDragon) {
            target.hurt(DamageSource.LIGHTNING_BOLT, 9.5F);
        }

        target.knockback(1.0, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        return 0;
    }
    @Override
    public void addInformation(IToolStackView tool, int level, @Nullable Player player, List<Component> tooltip, TooltipKey tooltipKey, TooltipFlag tooltipFlag) {
        float amount = 4.0f;
        tooltip.add(applyStyle(new TextComponent(Util.BONUS_FORMAT.format(amount)).append(" ").append(LIGHTNING_BONUS)));
    }
}
