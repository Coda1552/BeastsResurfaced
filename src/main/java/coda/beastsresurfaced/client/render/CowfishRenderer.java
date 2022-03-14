package coda.beastsresurfaced.client.render;

import coda.beastsresurfaced.client.model.CowfishModel;
import coda.beastsresurfaced.common.entities.CowfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CowfishRenderer extends GeoEntityRenderer<CowfishEntity> {

    public CowfishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CowfishModel());
        this.shadowRadius = 0.75F;
    }
}