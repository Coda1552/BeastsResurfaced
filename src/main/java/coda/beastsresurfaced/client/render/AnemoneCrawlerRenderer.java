package coda.beastsresurfaced.client.render;

import coda.beastsresurfaced.client.model.AnemoneCrawlerModel;
import coda.beastsresurfaced.common.entities.AnemoneCrawlerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AnemoneCrawlerRenderer extends GeoEntityRenderer<AnemoneCrawlerEntity> {

    public AnemoneCrawlerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AnemoneCrawlerModel());
        this.shadowRadius = 0.25F;
    }
}