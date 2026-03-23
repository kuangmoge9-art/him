package com.himdev.him.registry;

import com.himdev.him.HimMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;

public final class HimDamageTypes {
    public static final ResourceKey<DamageType> DIVINE_PUNISHMENT = ResourceKey.create(
            Registries.DAMAGE_TYPE,
            ResourceLocation.fromNamespaceAndPath(HimMod.MOD_ID, "divine_punishment")
    );

    private HimDamageTypes() {
    }

    public static DamageSource divinePunishment(ServerLevel level) {
        Registry<DamageType> registry = level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE);
        Holder<DamageType> damageType = registry.getHolderOrThrow(DIVINE_PUNISHMENT);
        return new DamageSource(damageType);
    }
}
