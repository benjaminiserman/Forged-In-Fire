package com.pouffy.forgedinfire.main.tools.data.material;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

public class MaterialRenderInfoProvider extends AbstractMaterialRenderInfoProvider {
    public MaterialRenderInfoProvider(DataGenerator gen, AbstractMaterialSpriteProvider spriteProvider) {
        super(gen, spriteProvider);
    }
    @Override
    protected void addMaterialRenderInfo() {
        buildRenderInfo(ForgedMaterialIds.dragon_bone).color(0xA39F93).fallbacks("bone", "rock");

        buildRenderInfo(ForgedMaterialIds.dragon_scale).color(0x700C0C);
        buildRenderInfo(ForgedMaterialIds.red).color(0x700C0C);
        buildRenderInfo(ForgedMaterialIds.emerald).color(0x40502c);
        buildRenderInfo(ForgedMaterialIds.bronze).color(0x7b622b);
        buildRenderInfo(ForgedMaterialIds.amethyst).color(0x361c59);
        buildRenderInfo(ForgedMaterialIds.black).color(0x232323);
        buildRenderInfo(ForgedMaterialIds.blue).color(0xafd1e1);
        buildRenderInfo(ForgedMaterialIds.copper).color(0x5a3428);
        buildRenderInfo(ForgedMaterialIds.electric_blue).color(0x241c59);
        buildRenderInfo(ForgedMaterialIds.gray).color(0x4b443f);
        buildRenderInfo(ForgedMaterialIds.sapphire).color(0x185084);
        buildRenderInfo(ForgedMaterialIds.silver).color(0x595c5e);
        buildRenderInfo(ForgedMaterialIds.white).color(0xf1f1f1);
        buildRenderInfo(ForgedMaterialIds.fireDragonsteel).color(0x774153).fallbacks("bone", "metal").luminosity(2);
        buildRenderInfo(ForgedMaterialIds.iceDragonsteel).color(0xBAEAEC).fallbacks("bone", "metal").luminosity(2);
        buildRenderInfo(ForgedMaterialIds.lightningDragonsteel).color(0x917DD2).fallbacks("bone", "metal").luminosity(2);


    }
    @Override
    public String getName() {
        return "Forged In Fire Material Render Info Provider";
    }

}
