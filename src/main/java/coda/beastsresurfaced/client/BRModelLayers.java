package coda.beastsresurfaced.client;

import coda.beastsresurfaced.BeastsResurfaced;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class BRModelLayers {

    public static final ModelLayerLocation ANEMONE_CRAWLER = create("anemone_crawler");
    public static final ModelLayerLocation SEACOW = create("seacow");

    private static ModelLayerLocation create(String name) {
        return new ModelLayerLocation(new ResourceLocation(BeastsResurfaced.MOD_ID, name), "main");
    }
}
