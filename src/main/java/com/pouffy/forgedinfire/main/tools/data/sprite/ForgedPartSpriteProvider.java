package com.pouffy.forgedinfire.main.tools.data.sprite;

import com.pouffy.forgedinfire.ForgedInFire;
import slimeknights.tconstruct.library.client.data.material.AbstractPartSpriteProvider;
import slimeknights.tconstruct.library.materials.stats.MaterialStatsId;

public class ForgedPartSpriteProvider extends AbstractPartSpriteProvider {
    public ForgedPartSpriteProvider() {
        super(ForgedInFire.MOD_ID);
    }
    public static final MaterialStatsId SCALE_PLATE = new MaterialStatsId("forgedinfire", "plate");
    @Override
    public String getName() {
        return "Forged In Fire Parts";
    }
    @Override
    protected void addAllSpites() {

        buildTool("glaive").withLarge().addBreakableHead("head").addHandle("handle").addHandle("grip").addBinding("accessory");
        this.addSprite("armor/plate/helmet_modifiers/tconstruct_embellishment_scale", SCALE_PLATE);
        this.addSprite("armor/plate/helmet_modifiers/tconstruct_embellishment_broken_scale", SCALE_PLATE);
        this.addSprite("armor/plate/chestplate_modifiers/tconstruct_embellishment_scale", SCALE_PLATE);
        this.addSprite("armor/plate/chestplate_modifiers/tconstruct_embellishment_broken_scale", SCALE_PLATE);
        this.addSprite("armor/plate/leggings_modifiers/tconstruct_embellishment_scale", SCALE_PLATE);
        this.addSprite("armor/plate/leggings_modifiers/tconstruct_embellishment_broken_scale", SCALE_PLATE);
        this.addSprite("armor/plate/boot_modifiers/tconstruct_embellishment_scale", SCALE_PLATE);
        this.addSprite("armor/plate/boot_modifiers/tconstruct_embellishment_broken_scale", SCALE_PLATE);
        this.addTexture("models/armor/plate/layer_1_scale", SCALE_PLATE);
        this.addTexture("models/armor/plate/layer_2_scale", SCALE_PLATE);
    }
}
