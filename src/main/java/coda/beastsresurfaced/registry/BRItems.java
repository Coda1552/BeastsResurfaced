package coda.beastsresurfaced.registry;

import coda.beastsresurfaced.BeastsResurfaced;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BRItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeastsResurfaced.MOD_ID);

    public static final RegistryObject<Item> MEAT_SCRAPS = ITEMS.register("meat_scraps", () -> new Item(new Item.Properties().tab(BeastsResurfaced.TAB)));

    // Spawn Eggs
    public static final RegistryObject<Item> ANEMONE_CRAWLER_SPAWN_EGG = ITEMS.register("anemone_crawler_spawn_egg", () -> new ForgeSpawnEggItem(BREntities.ANEMONE_CRAWLER, 0xf87a2d, 0xf2f2f0, new Item.Properties().tab(BeastsResurfaced.TAB)));
    public static final RegistryObject<Item> COWFISH_SPAWN_EGG = ITEMS.register("cowfish_spawn_egg", () -> new ForgeSpawnEggItem(BREntities.COWFISH, 0xf6f66f, 0x70afe8, new Item.Properties().tab(BeastsResurfaced.TAB)));
}
