package coda.beastsresurfaced;

import coda.beastsresurfaced.common.entities.AnemoneCrawler;
import coda.beastsresurfaced.common.entities.Seacow;
import coda.beastsresurfaced.registry.BREntities;
import coda.beastsresurfaced.registry.BRItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BeastsResurfaced.MOD_ID)
public class BeastsResurfaced {
    public static final String MOD_ID = "beastsresurfaced";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BRItems.ANEMONE_CRAWLER_SPAWN_EGG.get());
        }
    };

    public BeastsResurfaced() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        BREntities.ENTITIES.register(bus);
        BRItems.ITEMS.register(bus);

        bus.addListener(this::registerEntityAttributes);
    }

    private void registerEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(BREntities.ANEMONE_CRAWLER.get(), AnemoneCrawler.createAttributes().build());
        event.put(BREntities.SEACOW.get(), Seacow.createAttributes().build());
    }

}
