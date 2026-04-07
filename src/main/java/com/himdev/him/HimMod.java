package com.himdev.him;

import com.himdev.him.network.HimNetwork;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.registry.HimEffects;
import com.himdev.him.registry.HimItems;
import com.himdev.him.world.HimChunkLoading;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HimMod.MOD_ID)
public final class HimMod {
    public static final String MOD_ID = "him";

    public HimMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(HimMod::commonSetup);
        HimNetwork.register();
        HimEntityTypes.register(modEventBus);
        HimEffects.register(modEventBus);
        HimItems.register(modEventBus);
    }

    private static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(HimChunkLoading::registerValidationCallback);
    }
}
