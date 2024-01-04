package com.pouffy.forgedinfire.main;

import com.pouffy.forgedinfire.ForgedInFire;
import com.pouffy.forgedinfire.main.item.ForgedBookItem;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.Logger;
import slimeknights.mantle.registration.object.ItemObject;
import slimeknights.tconstruct.common.registration.ItemDeferredRegisterExtension;

import static com.pouffy.forgedinfire.main.ForgedModule.TAB_GENERAL;


public class ForgedCommons{
    static final Logger log = Util.getLogger("forged_commons");
    public static final ItemDeferredRegisterExtension ITEMS = new ItemDeferredRegisterExtension(ForgedInFire.MOD_ID);

    private static final Item.Properties BOOK = new Item.Properties().tab(TAB_GENERAL).stacksTo(1);
    private static final Item.Properties NUGGET = new Item.Properties().tab(TAB_GENERAL).stacksTo(64);
    public static final ItemObject<ForgedBookItem> draconicWeaponry = ITEMS.register("draconic_weaponry", () -> new ForgedBookItem(BOOK, ForgedBookItem.BookType.DRACONIC_WEAPONRY));
    public static final ItemObject<Item> fireDragonsteelNugget = ITEMS.register("dragonsteel_fire_nugget", () -> new Item(NUGGET));
    public static final ItemObject<Item> iceDragonsteelNugget = ITEMS.register("dragonsteel_ice_nugget", () -> new Item(NUGGET));
    public static final ItemObject<Item> lightningDragonsteelNugget = ITEMS.register("dragonsteel_lightning_nugget", () -> new Item(NUGGET));

    @SubscribeEvent
    void gatherData(final GatherDataEvent event) {
        if (event.includeServer()) {
            DataGenerator datagenerator = event.getGenerator();
            datagenerator.addProvider(new CommonRecipeProvider(datagenerator));
        }
    }
}
