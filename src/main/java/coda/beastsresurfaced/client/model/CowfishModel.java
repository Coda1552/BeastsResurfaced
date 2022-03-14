package coda.beastsresurfaced.client.model;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.common.entities.CowfishEntity;
import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

import java.util.Map;

public class CowfishModel extends AnimatedTickingGeoModel<CowfishEntity> {
    public static final Map<Integer, ResourceLocation> TEXTURES = Util.make(Maps.newHashMap(), (hashMap) -> {
        hashMap.put(0, new ResourceLocation(BeastsResurfaced.MOD_ID, "textures/entity/cowfish/cowfish.png"));
        hashMap.put(1, new ResourceLocation(BeastsResurfaced.MOD_ID, "textures/entity/cowfish/spotted.png"));
    });

    @Override
    public ResourceLocation getModelLocation(CowfishEntity object) {
        return new ResourceLocation(BeastsResurfaced.MOD_ID, "geo/cowfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CowfishEntity object) {
        return TEXTURES.getOrDefault(object.getVariant(), TEXTURES.get(0));
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CowfishEntity animatable) {
        return new ResourceLocation(BeastsResurfaced.MOD_ID, "animations/cowfish.animation.json");
    }

    @Override
    public void setLivingAnimations(CowfishEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone fish = this.getAnimationProcessor().getBone("cow_fish");
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
