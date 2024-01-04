package com.pouffy.forgedinfire.main.tools.data;

import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.pouffy.forgedinfire.main.ForgedCommons;
import com.pouffy.forgedinfire.main.fluid.ForgedFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import slimeknights.mantle.recipe.data.ICommonRecipeHelper;
import slimeknights.tconstruct.fluids.TinkerFluids;
import slimeknights.tconstruct.library.data.recipe.IByproduct;
import slimeknights.tconstruct.library.data.recipe.ISmelteryRecipeHelper;
import slimeknights.tconstruct.library.recipe.casting.ItemCastingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.melting.MeltingRecipeBuilder;

import java.util.function.Consumer;

public class SmelteryRecipeProvider extends BaseRecipeProvider implements ISmelteryRecipeHelper, ICommonRecipeHelper {
    public SmelteryRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        this.addMeltingRecipes(consumer);
        this.addCastingRecipes(consumer);
    }

    @Override
    public String getName() {
        return "Forged In Fire Smeltery Recipes";
    }
    private void addMeltingRecipes(Consumer<FinishedRecipe> consumer) {
        String folder = "smeltery/melting/";
        String metalFolder = folder + "metal/";
        metalMelting(consumer, ForgedFluids.moltenFireDragonsteel.get(), "dragonsteel_fire", false, metalFolder, false, new IByproduct[0]);
        metalMelting(consumer, ForgedFluids.moltenIceDragonsteel.get(), "dragonsteel_ice", false, metalFolder, false, new IByproduct[0]);
        metalMelting(consumer, ForgedFluids.moltenLightningDragonsteel.get(), "dragonsteel_lightning", false, metalFolder, false, new IByproduct[0]);
        
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_INGOT.get()), ForgedFluids.moltenFireDragonsteel.get(), 90).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/ingot"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_INGOT.get()), ForgedFluids.moltenIceDragonsteel.get(), 90).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/ingot"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_INGOT.get()), ForgedFluids.moltenLightningDragonsteel.get(), 90).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/ingot"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafBlockRegistry.DRAGONSTEEL_FIRE_BLOCK.get()), ForgedFluids.moltenFireDragonsteel.get(), 810).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/block"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafBlockRegistry.DRAGONSTEEL_ICE_BLOCK.get()), ForgedFluids.moltenIceDragonsteel.get(), 810).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/block"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafBlockRegistry.DRAGONSTEEL_LIGHTNING_BLOCK.get()), ForgedFluids.moltenLightningDragonsteel.get(), 810).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/block"));
        MeltingRecipeBuilder.melting(Ingredient.of(ForgedCommons.fireDragonsteelNugget.get()), ForgedFluids.moltenFireDragonsteel.get(), 10).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/nugget"));
        MeltingRecipeBuilder.melting(Ingredient.of(ForgedCommons.iceDragonsteelNugget.get()), ForgedFluids.moltenIceDragonsteel.get(), 10).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/nugget"));
        MeltingRecipeBuilder.melting(Ingredient.of(ForgedCommons.lightningDragonsteelNugget.get()), ForgedFluids.moltenLightningDragonsteel.get(), 10).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/nugget"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_AXE.get()), ForgedFluids.moltenFireDragonsteel.get(), 270).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/axe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_BOOTS.get()), ForgedFluids.moltenFireDragonsteel.get(), 360).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/boots"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_CHESTPLATE.get()), ForgedFluids.moltenFireDragonsteel.get(), 720).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/chestplate"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_HELMET.get()), ForgedFluids.moltenFireDragonsteel.get(), 450).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/helmet"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_HOE.get()), ForgedFluids.moltenFireDragonsteel.get(), 180).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/hoe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_LEGGINGS.get()), ForgedFluids.moltenFireDragonsteel.get(), 630).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/leggings"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_PICKAXE.get()), ForgedFluids.moltenFireDragonsteel.get(), 270).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/pickaxe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_SHOVEL.get()), ForgedFluids.moltenFireDragonsteel.get(), 90).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/shovel"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_FIRE_SWORD.get()), ForgedFluids.moltenFireDragonsteel.get(), 180).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/sword"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_AXE.get()), ForgedFluids.moltenIceDragonsteel.get(), 270).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/axe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_BOOTS.get()), ForgedFluids.moltenIceDragonsteel.get(), 360).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/boots"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_CHESTPLATE.get()), ForgedFluids.moltenIceDragonsteel.get(), 720).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/chestplate"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_HELMET.get()), ForgedFluids.moltenIceDragonsteel.get(), 450).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/helmet"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_HOE.get()), ForgedFluids.moltenIceDragonsteel.get(), 180).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/hoe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_LEGGINGS.get()), ForgedFluids.moltenIceDragonsteel.get(), 630).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/leggings"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_PICKAXE.get()), ForgedFluids.moltenIceDragonsteel.get(), 270).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/pickaxe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_SHOVEL.get()), ForgedFluids.moltenIceDragonsteel.get(), 90).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/shovel"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_ICE_SWORD.get()), ForgedFluids.moltenIceDragonsteel.get(), 180).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/sword"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_AXE.get()), ForgedFluids.moltenLightningDragonsteel.get(), 270).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/axe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_BOOTS.get()), ForgedFluids.moltenLightningDragonsteel.get(), 360).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/boots"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_CHESTPLATE.get()), ForgedFluids.moltenLightningDragonsteel.get(), 720).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/chestplate"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_HELMET.get()), ForgedFluids.moltenLightningDragonsteel.get(), 450).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/helmet"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_HOE.get()), ForgedFluids.moltenLightningDragonsteel.get(), 180).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/hoe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_LEGGINGS.get()), ForgedFluids.moltenLightningDragonsteel.get(), 630).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/leggings"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_PICKAXE.get()), ForgedFluids.moltenLightningDragonsteel.get(), 270).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/pickaxe"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_SHOVEL.get()), ForgedFluids.moltenLightningDragonsteel.get(), 90).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/shovel"));
        MeltingRecipeBuilder.melting(Ingredient.of(IafItemRegistry.DRAGONSTEEL_LIGHTNING_SWORD.get()), ForgedFluids.moltenLightningDragonsteel.get(), 180).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/sword"));

    }
    private void addCastingRecipes(Consumer<FinishedRecipe> consumer) {
        String folder = "smeltery/casting/";
        String metalFolder = folder + "metal/";
        this.metalCasting(consumer, ForgedFluids.moltenFireDragonsteel, true, IafBlockRegistry.DRAGONSTEEL_FIRE_BLOCK.get(), IafItemRegistry.DRAGONSTEEL_FIRE_INGOT.get(), ForgedCommons.fireDragonsteelNugget.get(), metalFolder, "dragonsteel_fire");
        this.metalCasting(consumer, ForgedFluids.moltenIceDragonsteel, true, IafBlockRegistry.DRAGONSTEEL_ICE_BLOCK.get(), IafItemRegistry.DRAGONSTEEL_ICE_INGOT.get(), ForgedCommons.iceDragonsteelNugget.get(), metalFolder, "dragonsteel_ice");
        this.metalCasting(consumer, ForgedFluids.moltenLightningDragonsteel, true, IafBlockRegistry.DRAGONSTEEL_LIGHTNING_BLOCK.get(), IafItemRegistry.DRAGONSTEEL_LIGHTNING_INGOT.get(), ForgedCommons.lightningDragonsteelNugget.get(), metalFolder, "dragonsteel_lightning");
        //this.ingotCasting(consumer, ForgedFluids.moltenFireDragonsteel, false, IafItemRegistry.DRAGONSTEEL_FIRE_INGOT.get(), metalFolder + "dragonsteel_fire/ingot");
        //this.ingotCasting(consumer, ForgedFluids.moltenIceDragonsteel, false, IafItemRegistry.DRAGONSTEEL_ICE_INGOT.get(), metalFolder + "dragonsteel_ice/ingot");
        //this.ingotCasting(consumer, ForgedFluids.moltenLightningDragonsteel, false, IafItemRegistry.DRAGONSTEEL_LIGHTNING_INGOT.get(), metalFolder + "dragonsteel_lightning/ingot");
        //this.nuggetCasting(consumer, ForgedFluids.moltenFireDragonsteel, false, ForgedCommons.fireDragonsteelNugget.get(), metalFolder + "dragonsteel_fire/nugget");
        //this.nuggetCasting(consumer, ForgedFluids.moltenIceDragonsteel, false, ForgedCommons.iceDragonsteelNugget.get(), metalFolder + "dragonsteel_ice/nugget");
        //this.nuggetCasting(consumer, ForgedFluids.moltenLightningDragonsteel, false, ForgedCommons.lightningDragonsteelNugget.get(), metalFolder + "dragonsteel_lightning/nugget");
        //ItemCastingRecipeBuilder.basinRecipe(IafBlockRegistry.DRAGONSTEEL_FIRE_BLOCK.get()).setFluidAndTime(ForgedFluids.moltenFireDragonsteel, false, 810).save(consumer, this.modResource(metalFolder + "dragonsteel_fire/block"));
        //ItemCastingRecipeBuilder.basinRecipe(IafBlockRegistry.DRAGONSTEEL_ICE_BLOCK.get()).setFluidAndTime(ForgedFluids.moltenIceDragonsteel, false, 810).save(consumer, this.modResource(metalFolder + "dragonsteel_ice/block"));
        //ItemCastingRecipeBuilder.basinRecipe(IafBlockRegistry.DRAGONSTEEL_LIGHTNING_BLOCK.get()).setFluidAndTime(ForgedFluids.moltenLightningDragonsteel, false, 810).save(consumer, this.modResource(metalFolder + "dragonsteel_lightning/block"));
    }
}
