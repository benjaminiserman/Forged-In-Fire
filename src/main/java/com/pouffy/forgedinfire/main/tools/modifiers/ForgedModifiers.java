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
