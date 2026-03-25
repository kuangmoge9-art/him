package com.himdev.him.compat;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.registries.ForgeRegistries;

import java.lang.reflect.Field;

public final class UltimateSkeletonsPunishmentCompat {
    private static final String MOD_ID = "ultimateskeletons";
    private static final ResourceLocation TITANGOD_DAMAGE_ID = ResourceLocation.fromNamespaceAndPath(MOD_ID, "titangoddamage");
    private static final float COMPAT_PUNISH_DAMAGE = 5.0E7F;

    private UltimateSkeletonsPunishmentCompat() {
    }

    public static boolean shouldUseCompat(Entity target) {
        ResourceLocation entityId = ForgeRegistries.ENTITY_TYPES.getKey(target.getType());
        return entityId != null && MOD_ID.equals(entityId.getNamespace());
    }

    public static boolean punish(ServerLevel level, Entity target) {
        DamageSource damageSource = titangodDamage(level);
        if (damageSource == null) {
            return false;
        }

        if (target instanceof LivingEntity livingEntity) {
            livingEntity.invulnerableTime = 0;
            livingEntity.setHealth(0.0F);
        }

        boolean accepted = target.hurt(damageSource, COMPAT_PUNISH_DAMAGE);
        if (target.isAlive()) {
            primeDeathTickForForcedRemoval(target);
            UltimateSkeletonsDeathlistCompat.executeSafeNormalAttack(target);
        }
        return accepted || !target.isAlive();
    }

    private static DamageSource titangodDamage(ServerLevel level) {
        Holder.Reference<net.minecraft.world.damagesource.DamageType> damageType = level.registryAccess()
                .registryOrThrow(Registries.DAMAGE_TYPE)
                .getHolder(ResourceKey.create(Registries.DAMAGE_TYPE, TITANGOD_DAMAGE_ID))
                .orElse(null);
        if (damageType == null) {
            return null;
        }
        return new DamageSource(damageType);
    }

    @SuppressWarnings("unchecked")
    private static void primeDeathTickForForcedRemoval(Entity target) {
        try {
            Field accessorField = findField(target.getClass(), "DATA_deathTick");
            if (accessorField == null) {
                return;
            }
            EntityDataAccessor<Integer> deathTickAccessor = (EntityDataAccessor<Integer>) accessorField.get(null);
            target.getEntityData().set(deathTickAccessor, 430);
        } catch (IllegalAccessException ignored) {
        }
    }

    private static Field findField(Class<?> type, String fieldName) {
        Class<?> current = type;
        while (current != null) {
            try {
                Field field = current.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException ignored) {
                current = current.getSuperclass();
            }
        }
        return null;
    }
}
