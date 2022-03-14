package coda.beastsresurfaced.registry;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.common.entities.AnemoneCrawlerEntity;
import coda.beastsresurfaced.common.entities.CowfishEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BREntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, BeastsResurfaced.MOD_ID);

    public static final RegistryObject<EntityType<AnemoneCrawlerEntity>> ANEMONE_CRAWLER = create("anemone_crawler", EntityType.Builder.of(AnemoneCrawlerEntity::new, MobCategory.CREATURE).sized(0.85F, 0.55F));
    public static final RegistryObject<EntityType<CowfishEntity>> COWFISH = create("cowfish", EntityType.Builder.of(CowfishEntity::new, MobCategory.CREATURE).sized(1.85F, 1.55F));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return ENTITIES.register(name, () -> builder.build(BeastsResurfaced.MOD_ID + "." + name));
    }
}