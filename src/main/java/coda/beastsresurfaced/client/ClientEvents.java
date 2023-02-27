package coda.beastsresurfaced.client;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.client.model.AnemoneCrawlerModel;
import coda.beastsresurfaced.client.model.SeacowModel;
import coda.beastsresurfaced.client.render.AnemoneCrawlerRenderer;
import coda.beastsresurfaced.client.render.SeacowRenderer;
import coda.beastsresurfaced.registry.BREntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = {Dist.CLIENT}, bus = Mod.EventBusSubscriber.Bus.MOD, modid = BeastsResurfaced.MOD_ID)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent e) {
        EntityRenderers.register(BREntities.ANEMONE_CRAWLER.get(), AnemoneCrawlerRenderer::new);
        EntityRenderers.register(BREntities.SEACOW.get(), SeacowRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions e) {
        e.registerLayerDefinition(BRModelLayers.ANEMONE_CRAWLER, AnemoneCrawlerModel::createBodyLayer);
        e.registerLayerDefinition(BRModelLayers.SEACOW, SeacowModel::createBodyLayer);
    }
}
