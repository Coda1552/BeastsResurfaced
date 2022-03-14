package coda.beastsresurfaced.client.model;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.common.entities.AnemoneCrawlerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class AnemoneCrawlerModel extends AnimatedTickingGeoModel<AnemoneCrawlerEntity> {

    @Override
    public ResourceLocation getModelLocation(AnemoneCrawlerEntity object) {
        return new ResourceLocation(BeastsResurfaced.MOD_ID, "geo/anemone_crawler.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AnemoneCrawlerEntity object) {
        return new ResourceLocation(BeastsResurfaced.MOD_ID, "textures/entity/anemone_crawler.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AnemoneCrawlerEntity animatable) {
        return new ResourceLocation(BeastsResurfaced.MOD_ID, "animations/anemone_crawler.animation.json");
    }

    @Override
    public void setLivingAnimations(AnemoneCrawlerEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone fish = this.getAnimationProcessor().getBone("fish");
        IBone head = this.getAnimationProcessor().getBone("head");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);

        if (entity.isBaby()) {
            fish.setScaleX(0.5F);
            fish.setScaleY(0.5F);
            fish.setScaleZ(0.5F);
            fish.setPositionY(-2.75F);

            head.setScaleX(1.5F);
            head.setScaleY(1.5F);
            head.setScaleZ(1.5F);
            head.setPositionY(1.0F);
        }
    }
}
