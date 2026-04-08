package com.himdev.him.registry;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class HimEntityTypes {
    private static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HimMod.MOD_ID);

    public static final RegistryObject<EntityType<HimEntity>> HIM = ENTITY_TYPES.register(
            "him",
            () -> EntityType.Builder.of(HimEntity::new, MobCategory.MISC)
                    .noSummon()
                    .sized(0.6F, 1.95F)
                    .clientTrackingRange(32)
                    .build("him")
    );

    private HimEntityTypes() {
    }

    public static void register(IEventBus modEventBus) {
        ENTITY_TYPES.register(modEventBus);
        modEventBus.addListener(HimEntityTypes::registerAttributes);
    }

    private static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(HIM.get(), HimEntity.createAttributes().build());
    }
}
