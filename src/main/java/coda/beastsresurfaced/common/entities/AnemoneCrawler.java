package coda.beastsresurfaced.common.entities;

import coda.beastsresurfaced.registry.BREntities;
import coda.beastsresurfaced.registry.BRItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

public class AnemoneCrawler extends Animal {

    public AnemoneCrawler(EntityType<? extends Animal> p_30341_, Level level) {
        super(p_30341_, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(0, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.15D));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.25D));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, LivingEntity.class, 1.0F));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    public float getStepHeight() {
        return 1.0F;
    }

    @Override
    public ItemStack getPickedResult(HitResult target) {
        return new ItemStack(BRItems.ANEMONE_CRAWLER_SPAWN_EGG.get());
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(BRItems.MEAT_SCRAPS.get());
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob parent) {
        return new AnemoneCrawler(BREntities.ANEMONE_CRAWLER.get(), level);
    }
}
