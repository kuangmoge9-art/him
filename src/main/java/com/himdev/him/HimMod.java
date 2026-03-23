package com.himdev.him;

import com.himdev.him.registry.HimCreativeTabs;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.registry.HimEffects;
import com.himdev.him.registry.HimItems;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HimMod.MOD_ID)
public final class HimMod {
    public static final String MOD_ID = "him";

    public HimMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        HimEntityTypes.register(modEventBus);
        HimItems.register(modEventBus);
        HimEffects.register(modEventBus);
        modEventBus.addListener(this::addCreativeTabContents);
    }

    private void addCreativeTabContents(BuildCreativeModeTabContentsEvent event) {
        HimCreativeTabs.addToTabs(event);
    }
}
