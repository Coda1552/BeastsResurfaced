package coda.beastsresurfaced.client;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.client.render.AnemoneCrawlerRenderer;
import coda.beastsresurfaced.client.render.CowfishRenderer;
import coda.beastsresurfaced.registry.BREntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = {Dist.CLIENT}, bus = Mod.EventBusSubscriber.Bus.MOD, modid = BeastsResurfaced.MOD_ID)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(BREntities.ANEMONE_CRAWLER.get(), AnemoneCrawlerRenderer::new);
        EntityRenderers.register(BREntities.COWFISH.get(), CowfishRenderer::new);
    }
}
