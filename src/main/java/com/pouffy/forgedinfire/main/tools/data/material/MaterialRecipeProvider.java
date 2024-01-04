package com.pouffy.forgedinfire.main.tools.data.material;

import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.pouffy.forgedinfire.main.ForgedTags;
import com.pouffy.forgedinfire.main.fluid.ForgedFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import com.pouffy.forgedinfire.main.tools.data.BaseRecipeProvider;
import slimeknights.mantle.recipe.helper.ItemOutput;
import slimeknights.tconstruct.library.data.recipe.IMaterialRecipeHelper;
import slimeknights.tconstruct.tools.data.material.MaterialIds;

import java.util.function.Consumer;

public class MaterialRecipeProvider extends BaseRecipeProvider implements IMaterialRecipeHelper {
    public MaterialRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Forged In Fire Material Recipe";
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        addMaterialItems(consumer);
        addMaterialSmeltery(consumer);
    }

    private void addMaterialItems(Consumer<FinishedRecipe> consumer) {
        String folder = "tools/materials/";
        materialRecipe(consumer, ForgedMaterialIds.dragon_scale,   Ingredient.of(ForgedTags.Items.DRAGON_SCALES), 1, 2, folder + "scales/dragon");

        materialRecipe(consumer, ForgedMaterialIds.red,           Ingredient.of(IafItemRegistry.DRAGONSCALES_RED.get()),      1, 1, folder + "scales/dragon/red");
        materialRecipe(consumer, ForgedMaterialIds.emerald,       Ingredient.of(IafItemRegistry.DRAGONSCALES_GREEN.get()),      1, 1, folder + "scales/dragon/emerald");
        materialRecipe(consumer, ForgedMaterialIds.bronze,        Ingredient.of(IafItemRegistry.DRAGONSCALES_BRONZE.get()),      1, 1, folder + "scales/dragon/bronze");
        materialRecipe(consumer, ForgedMaterialIds.amethyst,      Ingredient.of(IafItemRegistry.DRAGONSCALES_AMYTHEST.get()),      1, 1, folder + "scales/dragon/amethyst");
        materialRecipe(consumer, ForgedMaterialIds.black,         Ingredient.of(IafItemRegistry.DRAGONSCALES_BLACK.get()),      1, 1, folder + "scales/dragon/black");
        materialRecipe(consumer, ForgedMaterialIds.blue,          Ingredient.of(IafItemRegistry.DRAGONSCALES_BLUE.get()),      1, 1, folder + "scales/dragon/blue");
        materialRecipe(consumer, ForgedMaterialIds.copper,        Ingredient.of(IafItemRegistry.DRAGONSCALES_COPPER.get()),      1, 1, folder + "scales/dragon/copper");
        materialRecipe(consumer, ForgedMaterialIds.electric_blue, Ingredient.of(IafItemRegistry.DRAGONSCALES_ELECTRIC.get()),      1, 1, folder + "scales/dragon/electric_blue");
        materialRecipe(consumer, ForgedMaterialIds.gray,          Ingredient.of(IafItemRegistry.DRAGONSCALES_GRAY.get()),      1, 1, folder + "scales/dragon/gray");
        materialRecipe(consumer, ForgedMaterialIds.sapphire,      Ingredient.of(IafItemRegistry.DRAGONSCALES_SAPPHIRE.get()),      1, 1, folder + "scales/dragon/sapphire");
        materialRecipe(consumer, ForgedMaterialIds.silver,        Ingredient.of(IafItemRegistry.DRAGONSCALES_SILVER.get()),      1, 1, folder + "scales/dragon/silver");
        materialRecipe(consumer, ForgedMaterialIds.white,         Ingredient.of(IafItemRegistry.DRAGONSCALES_WHITE.get()),      1, 1, folder + "scales/dragon/white");
        materialRecipe(consumer, ForgedMaterialIds.red,           Ingredient.of(IafBlockRegistry.DRAGON_SCALE_RED.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_RED.get())), folder + "scales/dragon/red_block");
        materialRecipe(consumer, ForgedMaterialIds.emerald,       Ingredient.of(IafBlockRegistry.DRAGON_SCALE_GREEN.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_GREEN.get())), folder + "scales/dragon/emerald_block");
        materialRecipe(consumer, ForgedMaterialIds.bronze,        Ingredient.of(IafBlockRegistry.DRAGON_SCALE_BRONZE.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_BRONZE.get())), folder + "scales/dragon/bronze_block");
        materialRecipe(consumer, ForgedMaterialIds.amethyst,      Ingredient.of(IafBlockRegistry.DRAGON_SCALE_AMYTHEST.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_AMYTHEST.get())), folder + "scales/dragon/amethyst_block");
        materialRecipe(consumer, ForgedMaterialIds.black,         Ingredient.of(IafBlockRegistry.DRAGON_SCALE_BLACK.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_BLACK.get())), folder + "scales/dragon/black_block");
        materialRecipe(consumer, ForgedMaterialIds.blue,          Ingredient.of(IafBlockRegistry.DRAGON_SCALE_BLUE.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_BLUE.get())), folder + "scales/dragon/blue_block");
        materialRecipe(consumer, ForgedMaterialIds.copper,        Ingredient.of(IafBlockRegistry.DRAGON_SCALE_COPPER.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_COPPER.get())), folder + "scales/dragon/copper_block");
        materialRecipe(consumer, ForgedMaterialIds.electric_blue, Ingredient.of(IafBlockRegistry.DRAGON_SCALE_ELECTRIC.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_ELECTRIC.get())), folder + "scales/dragon/electric_blue_block");
        materialRecipe(consumer, ForgedMaterialIds.gray,          Ingredient.of(IafBlockRegistry.DRAGON_SCALE_GRAY.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_GRAY.get())), folder + "scales/dragon/gray_block");
        materialRecipe(consumer, ForgedMaterialIds.sapphire,      Ingredient.of(IafBlockRegistry.DRAGON_SCALE_SAPPHIRE.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_SAPPHIRE.get())), folder + "scales/dragon/sapphire_block");
        materialRecipe(consumer, ForgedMaterialIds.silver,        Ingredient.of(IafBlockRegistry.DRAGON_SCALE_SILVER.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_SILVER.get())), folder + "scales/dragon/silver_block");
        materialRecipe(consumer, ForgedMaterialIds.white,         Ingredient.of(IafBlockRegistry.DRAGON_SCALE_WHITE.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGONSCALES_WHITE.get())), folder + "scales/dragon/white_block");

        materialRecipe(consumer, ForgedMaterialIds.dragon_bone,   Ingredient.of(IafItemRegistry.DRAGON_BONE.get()),      1, 1, folder + "dragon_bone");
        materialRecipe(consumer, MaterialIds.necroticBone,   Ingredient.of(IafItemRegistry.WITHERBONE.get()),      1, 1, folder + "wither_bone");
        materialRecipe(consumer, ForgedMaterialIds.dragon_bone,   Ingredient.of(IafItemRegistry.DRAGON_SKULL_FIRE.get()),      4, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGON_BONE.get())), folder + "dragon_bone_from_fire_skull");
        materialRecipe(consumer, ForgedMaterialIds.dragon_bone,   Ingredient.of(IafItemRegistry.DRAGON_SKULL_ICE.get()),      4, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGON_BONE.get())), folder + "dragon_bone_from_ice_skull");
        materialRecipe(consumer, ForgedMaterialIds.dragon_bone,   Ingredient.of(IafItemRegistry.DRAGON_SKULL_LIGHTNING.get()),      4, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGON_BONE.get())), folder + "dragon_bone_from_lightning_skull");
        materialRecipe(consumer, ForgedMaterialIds.dragon_bone,   Ingredient.of(IafBlockRegistry.DRAGON_BONE_BLOCK.get()),      9, 1, ItemOutput.fromStack(new ItemStack(IafItemRegistry.DRAGON_BONE.get())), folder + "dragon_bone_block");

    }
    private void addMaterialSmeltery(Consumer<FinishedRecipe> consumer) {
        String folder = "tools/materials/";
        materialMeltingCasting(consumer, ForgedMaterialIds.fireDragonsteel, ForgedFluids.moltenFireDragonsteel, false, folder);
        materialMeltingCasting(consumer, ForgedMaterialIds.iceDragonsteel, ForgedFluids.moltenIceDragonsteel, false, folder);
        materialMeltingCasting(consumer, ForgedMaterialIds.lightningDragonsteel, ForgedFluids.moltenLightningDragonsteel, false, folder);
    }
}
