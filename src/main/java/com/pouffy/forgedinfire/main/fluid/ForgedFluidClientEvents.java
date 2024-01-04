package com.pouffy.forgedinfire.main.fluid;

import com.pouffy.forgedinfire.ForgedInFire;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.common.ClientEventBase;
@Mod.EventBusSubscriber(modid = ForgedInFire.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgedFluidClientEvents extends ClientEventBase {
    @SubscribeEvent
    static void clientSetup(final FMLClientSetupEvent event) {
        setTranslucent(ForgedFluids.fireBlood);
        setTranslucent(ForgedFluids.iceBlood);
        setTranslucent(ForgedFluids.lightningBlood);
    }
    private static void setTranslucent(FluidObject<?> fluid) {
        ItemBlockRenderTypes.setRenderLayer(fluid.getStill(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(fluid.getFlowing(), RenderType.translucent());
    }
}
