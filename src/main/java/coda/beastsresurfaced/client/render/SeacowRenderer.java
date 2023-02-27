package coda.beastsresurfaced.client.render;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.client.BRModelLayers;
import coda.beastsresurfaced.client.model.SeacowModel;
import coda.beastsresurfaced.common.entities.Seacow;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SeacowRenderer extends MobRenderer<Seacow, SeacowModel<Seacow>> {
    private static final ResourceLocation TEX = new ResourceLocation(BeastsResurfaced.MOD_ID, "texture/entity/seacow/seacow.png");

    public SeacowRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SeacowModel<>(renderManager.bakeLayer(BRModelLayers.ANEMONE_CRAWLER)), 0.6F);
    }

    @Override
    public ResourceLocation getTextureLocation(Seacow o) {
        return TEX;
    }
}