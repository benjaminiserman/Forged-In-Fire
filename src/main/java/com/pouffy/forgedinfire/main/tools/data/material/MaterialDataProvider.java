package com.pouffy.forgedinfire.main.tools.data.material;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;

public class MaterialDataProvider extends AbstractMaterialDataProvider {
    public MaterialDataProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    public String getName() {
        return "Forged In Fire Materials";
    }

    @Override
    protected void addMaterials() {
        addMaterial(ForgedMaterialIds.dragon_bone,   7, ORDER_COMPAT, true);
        addMaterial(ForgedMaterialIds.dragon_scale, 7, ORDER_COMPAT, true);
        addMaterial(ForgedMaterialIds.fireDragonsteel, 7, ORDER_COMPAT, false);
        addMaterial(ForgedMaterialIds.iceDragonsteel, 7, ORDER_COMPAT, false);
        addMaterial(ForgedMaterialIds.lightningDragonsteel, 7, ORDER_COMPAT, false);

    }
}
