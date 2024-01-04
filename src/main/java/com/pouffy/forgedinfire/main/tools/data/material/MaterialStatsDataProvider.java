package com.pouffy.forgedinfire.main.tools.data.material;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialStatsDataProvider;
import slimeknights.tconstruct.tools.stats.*;

import static net.minecraft.world.item.Tiers.*;

public class MaterialStatsDataProvider  extends AbstractMaterialStatsDataProvider {
    public MaterialStatsDataProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    public String getName() {
        return "Forged In Fire Material Stats";
    }

    @Override
    protected void addMaterialStats() {
        addMeleeHarvest();
        addRanged();
        addMisc();
    }

    private void addMeleeHarvest() {
        addMaterialStats(ForgedMaterialIds.dragon_bone,
                new HeadMaterialStats(200, 2.5f, IRON, 1.2f),
                HandleMaterialStats.DEFAULT.withDurability(1.05f).withAttackSpeed(1.25f),
                ExtraMaterialStats.DEFAULT);
        addMaterialStats(ForgedMaterialIds.dragon_scale, ExtraMaterialStats.DEFAULT, BowstringMaterialStats.DEFAULT, GripMaterialStats.DEFAULT.withDurability(1.1f).withAccuracy(0.25f).withMeleeAttack(3));
        addMaterialStats(ForgedMaterialIds.fireDragonsteel,
                new HeadMaterialStats(500, 3.0f, NETHERITE, 2.4f),
                HandleMaterialStats.DEFAULT.withDurability(2.5f).withAttackSpeed(0.75f),
                ExtraMaterialStats.DEFAULT);
        addMaterialStats(ForgedMaterialIds.iceDragonsteel,
                new HeadMaterialStats(500, 3.0f, NETHERITE, 2.4f),
                HandleMaterialStats.DEFAULT.withDurability(2.5f).withAttackSpeed(0.75f),
                ExtraMaterialStats.DEFAULT);
        addMaterialStats(ForgedMaterialIds.lightningDragonsteel,
                new HeadMaterialStats(500, 3.0f, NETHERITE, 2.4f),
                HandleMaterialStats.DEFAULT.withDurability(2.5f).withAttackSpeed(0.75f),
                ExtraMaterialStats.DEFAULT);
    }
    private void addRanged() {
        addMaterialStats(ForgedMaterialIds.dragon_bone,
                new LimbMaterialStats(200, 0.07f, -0.07f, 0.07f),
                new GripMaterialStats(1.0f, 0.15f, 1.5f));
        addMaterialStats(ForgedMaterialIds.fireDragonsteel,
                new LimbMaterialStats(400, 0.25f, 0.25f, 0.3f),
                new GripMaterialStats(2.0f, 0.25f, 2.5f));
        addMaterialStats(ForgedMaterialIds.iceDragonsteel,
                new LimbMaterialStats(400, 0.25f, 0.25f, 0.3f),
                new GripMaterialStats(2.0f, 0.25f, 2.5f));
        addMaterialStats(ForgedMaterialIds.lightningDragonsteel,
                new LimbMaterialStats(400, 0.25f, 0.25f, 0.3f),
                new GripMaterialStats(2.0f, 0.25f, 2.5f));
    }
    private void addMisc() {
        addMaterialStats(ForgedMaterialIds.dragon_bone,  new SkullStats(200, 0));
        addMaterialStats(ForgedMaterialIds.dragon_scale, new RepairKitStats(250));
        addMaterialStats(ForgedMaterialIds.fireDragonsteel, new RepairKitStats(500));
        addMaterialStats(ForgedMaterialIds.iceDragonsteel, new RepairKitStats(500));
        addMaterialStats(ForgedMaterialIds.lightningDragonsteel, new RepairKitStats(500));

    }

}
