package com.pouffy.forgedinfire.main.tools.data.sprite;

import com.pouffy.forgedinfire.ForgedInFire;
import com.pouffy.forgedinfire.main.tools.data.material.ForgedMaterialIds;
import net.minecraft.resources.ResourceLocation;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToSpriteTransformer;
import slimeknights.tconstruct.tools.data.sprite.TinkerPartSpriteProvider;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.RepairKitStats;

public class ForgedMaterialSpriteProvider extends AbstractMaterialSpriteProvider {

    @Override
    public String getName() {
        return "Forged In Fire Materials";
    }

    protected String genFolder(String material, int tintIndex) {
        return "item/materials/generator/" + material + "_" + tintIndex;
    }
    @Override
    protected void addAllMaterials() {
        buildMaterial(ForgedMaterialIds.dragon_bone)
                .meleeHarvest().ranged()
                .fallbacks("bone", "rock")
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF4c4a3f).addARGB(102, 0xFF807a68).addARGB(140, 0xFF969083).addARGB(178, 0xFFa39f93).addARGB(216, 0xFFa8a39b).addARGB(255, 0xFFc9c4bb).build());
        buildMaterial(ForgedMaterialIds.dragon_scale)
                .statType(RepairKitStats.ID, ExtraMaterialStats.ID)
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF3D1C10).addARGB(102, 0xFF542716).addARGB(140, 0xFF893B25).addARGB(178, 0xFF9E492A).addARGB(216, 0xFFC65C35).addARGB(255, 0xFFD76B43).build());
        ResourceLocation fire63 = ForgedInFire.getResource(genFolder("firedsteel", 63));
        ResourceLocation ice63 = ForgedInFire.getResource(genFolder("icedsteel", 63));
        ResourceLocation lightning63 = ForgedInFire.getResource(genFolder("lightningdsteel", 63));
        ResourceLocation fire102 = ForgedInFire.getResource(genFolder("firedsteel", 102));
        ResourceLocation ice102 = ForgedInFire.getResource(genFolder("icedsteel", 102));
        ResourceLocation lightning102 = ForgedInFire.getResource(genFolder("lightningdsteel", 102));
        ResourceLocation fire140 = ForgedInFire.getResource(genFolder("firedsteel", 140));
        ResourceLocation ice140 = ForgedInFire.getResource(genFolder("icedsteel", 140));
        ResourceLocation lightning140 = ForgedInFire.getResource(genFolder("lightningdsteel", 140));
        ResourceLocation fire178 = ForgedInFire.getResource(genFolder("firedsteel", 178));
        ResourceLocation ice178 = ForgedInFire.getResource(genFolder("icedsteel", 178));
        ResourceLocation lightning178 = ForgedInFire.getResource(genFolder("lightningdsteel", 178));
        buildMaterial(ForgedMaterialIds.iceDragonsteel)
                .meleeHarvest().ranged().statType(RepairKitStats.ID, ExtraMaterialStats.ID, TinkerPartSpriteProvider.PLATE)
                .fallbacks("bone", "metal")
                .transformer(GreyToSpriteTransformer.builderFromBlack()
                        .addTexture( 63, ice63,    0xFF4d6465).addTexture(102, ice102)
                        .addTexture(140, ice140,      0xFFa1e7e0).addTexture(178, ice178)
                        .addARGB(216, 0xFFBAEAEC).addARGB(255, 0xFFFFFFFF)
                        .build());
        buildMaterial(ForgedMaterialIds.fireDragonsteel)
                .meleeHarvest().ranged().statType(RepairKitStats.ID, ExtraMaterialStats.ID, TinkerPartSpriteProvider.PLATE)
                .fallbacks("bone", "metal")
                .transformer(GreyToSpriteTransformer.builderFromBlack()
                        .addTexture( 63, fire63,    0xFF241512).addTexture(102, fire102)
                        .addTexture(140, fire140,      0xFF221a19).addTexture(178, fire178)
                        .addARGB(216, 0xFFBD9FA7).addARGB(255, 0xFFEAD0D0)
                        .build());
        buildMaterial(ForgedMaterialIds.lightningDragonsteel)
                .meleeHarvest().ranged().statType(RepairKitStats.ID, ExtraMaterialStats.ID, TinkerPartSpriteProvider.PLATE)
                .fallbacks("bone", "metal")
                .transformer(GreyToSpriteTransformer.builderFromBlack()
                        .addTexture( 63, lightning63,    0xFF9872d5).addTexture(102, lightning102)
                        .addTexture(140, lightning140,      0xFF6f39c3).addTexture(178, lightning178)
                        .addARGB(216, 0xFFCAA4DA).addARGB(255, 0xFFE5CBF7)
                        .build());    }
}
