package coda.beastsresurfaced.registry;

import coda.beastsresurfaced.BeastsResurfaced;
import coda.beastsresurfaced.common.entities.AnemoneCrawler;
import coda.beastsresurfaced.common.entities.Seacow;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BREntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BeastsResurfaced.MOD_ID);

    public static final RegistryObject<EntityType<AnemoneCrawler>> ANEMONE_CRAWLER = create("anemone_crawler", EntityType.Builder.of(AnemoneCrawler::new, MobCategory.CREATURE).sized(0.4F, 0.5F));
    public static final RegistryObject<EntityType<Seacow>> SEACOW = create("seacow", EntityType.Builder.of(Seacow::new, MobCategory.CREATURE).sized(1.7F, 1.5F));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return ENTITIES.register(name, () -> builder.build(BeastsResurfaced.MOD_ID + "." + name));
    }
}