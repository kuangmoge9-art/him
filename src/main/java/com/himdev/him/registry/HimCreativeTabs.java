package com.himdev.him.registry;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

public final class HimCreativeTabs {
    private HimCreativeTabs() {
    }

    public static void addToTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(HimItems.HIM_SPAWN_EGG);
        }
    }
}
