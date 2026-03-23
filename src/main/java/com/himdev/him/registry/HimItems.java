package com.himdev.him.registry;

import com.himdev.him.HimMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class HimItems {
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HimMod.MOD_ID);

    public static final RegistryObject<Item> HIM_SPAWN_EGG = ITEMS.register(
            "him_spawn_egg",
            () -> new ForgeSpawnEggItem(HimEntityTypes.HIM, 0xF0F0F0, 0x1A1A1A, new Item.Properties())
    );

    private HimItems() {
    }

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
