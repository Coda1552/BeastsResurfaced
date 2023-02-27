package coda.beastsresurfaced.client.render;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.client.BRModelLayers;
import coda.beastsresurfaced.client.model.AnemoneCrawlerModel;
import coda.beastsresurfaced.common.entities.AnemoneCrawler;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AnemoneCrawlerRenderer extends MobRenderer<AnemoneCrawler, AnemoneCrawlerModel<AnemoneCrawler>> {
    private static final ResourceLocation TEX = new ResourceLocation(BeastsResurfaced.MOD_ID, "textures/entity/anemone_crawler/anemone_crawler.png");

    public AnemoneCrawlerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AnemoneCrawlerModel<>(renderManager.bakeLayer(BRModelLayers.ANEMONE_CRAWLER)), 0.35F);
    }

    @Override
    public ResourceLocation getTextureLocation(AnemoneCrawler o) {
        return TEX;
    }
}