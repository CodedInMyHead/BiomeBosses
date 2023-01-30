package com.codedinmyhead.biome;

import com.codedinmyhead.biome.common.BiomeBossesCreativeTabs;
import com.codedinmyhead.biome.events.CommonEvents;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.codedinmyhead.biome.init.EntityInit.ENTITIES;
import static com.codedinmyhead.biome.init.ItemInit.*;
import static com.codedinmyhead.biome.util.Util.MODID;
import static com.codedinmyhead.biome.init.BlockInit.BLOCKS;

@Mod(MODID)
public class Main {

    private static final Logger LOGGER = LogUtils.getLogger();
    public Main() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(CommonEvents::commonSetup);
        BLOCKS.register(bus);
        ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::addCreative);
        ENTITIES.register(bus);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == BiomeBossesCreativeTabs.MICHA)
            event.accept(SCYTHE);
            event.accept(SWORD_ICE);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
