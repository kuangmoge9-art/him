package com.himdev.him.registry;

import com.himdev.him.HimMod;
import com.himdev.him.item.GuardianPhoneItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class HimItems {
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HimMod.MOD_ID);

    public static final RegistryObject<Item> GUARDIAN_PHONE = ITEMS.register(
            "guardian_phone",
            () -> new GuardianPhoneItem(new Item.Properties().stacksTo(1))
    );

    private HimItems() {
    }

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        modEventBus.addListener(HimItems::buildCreativeTabContents);
    }

    private static void buildCreativeTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(GUARDIAN_PHONE);
        }
    }
}
