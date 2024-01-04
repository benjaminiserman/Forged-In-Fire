package com.pouffy.forgedinfire.main.tools.modifiers;

import com.pouffy.forgedinfire.ForgedInFire;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import slimeknights.tconstruct.library.data.tinkering.AbstractModifierProvider;
import slimeknights.tconstruct.library.modifiers.ModifierManager;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

@SuppressWarnings("unused")
public class ForgedModifiers extends AbstractModifierProvider {
    public static final ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(ForgedInFire.MOD_ID);
    public static final StaticModifier<FlamedModifier> flamed = MODIFIERS.register("flamed", FlamedModifier::new);
    public static final StaticModifier<IcedModifier> iced = MODIFIERS.register("iced", IcedModifier::new);
    public static final StaticModifier<LightningModifier> lightning = MODIFIERS.register("lightning", LightningModifier::new);
    public static final StaticModifier<FrostThornsModifier> frost_thorns_BLUE = MODIFIERS.register("frost_thorns_blue", FrostThornsModifier::new);
    public static final StaticModifier<FrostThornsModifier> frost_thorns_SAPPHIRE = MODIFIERS.register("frost_thorns_sapphire", FrostThornsModifier::new);
    public static final StaticModifier<FrostThornsModifier> frost_thorns_SILVER = MODIFIERS.register("frost_thorns_silver", FrostThornsModifier::new);
    public static final StaticModifier<FrostThornsModifier> frost_thorns_WHITE = MODIFIERS.register("frost_thorns_white", FrostThornsModifier::new);
    public static final StaticModifier<ScorchThornsModifier> scorch_thorns_BRONZE = MODIFIERS.register("scorch_thorns_bronze", ScorchThornsModifier::new);
    public static final StaticModifier<ScorchThornsModifier> scorch_thorns_EMERALD = MODIFIERS.register("scorch_thorns_emerald", ScorchThornsModifier::new);
    public static final StaticModifier<ScorchThornsModifier> scorch_thorns_GRAY = MODIFIERS.register("scorch_thorns_gray", ScorchThornsModifier::new);
    public static final StaticModifier<ScorchThornsModifier> scorch_thorns_RED = MODIFIERS.register("scorch_thorns_red", ScorchThornsModifier::new);
    public static final StaticModifier<ShockThornsModifier> shock_thorns_AMETHYST = MODIFIERS.register("shock_thorns_amethyst", ShockThornsModifier::new);
    public static final StaticModifier<ShockThornsModifier> shock_thorns_BLACK = MODIFIERS.register("shock_thorns_black", ShockThornsModifier::new);
    public static final StaticModifier<ShockThornsModifier> shock_thorns_COPPER = MODIFIERS.register("shock_thorns_copper", ShockThornsModifier::new);
    public static final StaticModifier<ShockThornsModifier> shock_thorns_ELECTRIC_BLUE = MODIFIERS.register("shock_thorns_electric_blue", ShockThornsModifier::new);
    @Override
    protected void addModifiers() {

    }
    public ForgedModifiers(DataGenerator generator) {
        super(generator);
    }
    @Override
    public String getName() {
        return null;
    }
}
