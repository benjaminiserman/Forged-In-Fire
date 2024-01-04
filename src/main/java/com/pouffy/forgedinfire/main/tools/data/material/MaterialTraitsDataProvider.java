package com.pouffy.forgedinfire.main.tools.data.material;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;
import slimeknights.tconstruct.library.modifiers.ModifierId;
import slimeknights.tconstruct.tools.TinkerModifiers;

public class MaterialTraitsDataProvider extends AbstractMaterialTraitDataProvider {
    public MaterialTraitsDataProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    public String getName() {
        return "Forged In Fire Material Traits";
    }
    @Override
    protected void addMaterialTraits() {
        addDefaultTraits(ForgedMaterialIds.dragon_scale, TinkerModifiers.fiery);
        addDefaultTraits(ForgedMaterialIds.dragon_bone, TinkerModifiers.firestarter);
        addDefaultTraits(ForgedMaterialIds.fireDragonsteel, ModifierId.tryParse("forgedinfire:flamed"));
        addDefaultTraits(ForgedMaterialIds.iceDragonsteel, ModifierId.tryParse("forgedinfire:iced"));
        addDefaultTraits(ForgedMaterialIds.lightningDragonsteel, ModifierId.tryParse("forgedinfire:lightning"));
    }
}
