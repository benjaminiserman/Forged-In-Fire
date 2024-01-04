package com.pouffy.forgedinfire.main;

import com.pouffy.forgedinfire.ForgedInFire;
import com.pouffy.forgedinfire.main.item.book.ForgedBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.font.FontManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import slimeknights.tconstruct.common.ClientEventBase;
@Mod.EventBusSubscriber(modid = ForgedInFire.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonsClientEvents extends ClientEventBase {
    @SubscribeEvent
    static void clientSetup(final FMLClientSetupEvent event) {
        Font unicode = unicodeFontRender();
        ForgedBook.DRACONIC_WEAPONRY.fontRenderer = unicode;
    }
    private static Font unicodeRenderer;
    public static Font unicodeFontRender() {
        if (unicodeRenderer == null)
            unicodeRenderer = new Font(rl -> {
                FontManager resourceManager = Minecraft.getInstance().fontManager;
                return resourceManager.fontSets.get(Minecraft.UNIFORM_FONT);
            });

        return unicodeRenderer;
    }
}
