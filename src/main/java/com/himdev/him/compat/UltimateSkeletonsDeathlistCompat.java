package com.himdev.him.compat;

import com.himdev.him.entity.HimEntity;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class UltimateSkeletonsDeathlistCompat {
    private UltimateSkeletonsDeathlistCompat() {
    }

    public static void executeSafeNormalAttack(Entity entity) {
        if (entity == null || entity instanceof Player || entity instanceof HimEntity) {
            return;
        }

        entity.stopRiding();
        entity.ejectPassengers();

        if (entity instanceof LivingEntity living) {
            living.removeAllEffects();
            forceLivingHealthToZero(living);
        }

        entity.setRemoved(Entity.RemovalReason.KILLED);
        if (!entity.isRemoved()) {
            entity.setRemoved(Entity.RemovalReason.DISCARDED);
        }
    }

    @SuppressWarnings("unchecked")
    private static void forceLivingHealthToZero(LivingEntity living) {
        forceTitanHealthToZero(living);
        try {
            Field healthAccessorField = LivingEntity.class.getDeclaredField("DATA_HEALTH_ID");
            healthAccessorField.setAccessible(true);
            EntityDataAccessor<Float> healthAccessor = (EntityDataAccessor<Float>) healthAccessorField.get(null);
            living.getEntityData().set(healthAccessor, 0.0F);
        } catch (NoSuchFieldException | IllegalAccessException ignored) {
        }
        living.invulnerableTime = 0;
        living.setHealth(0.0F);
    }

    private static void forceTitanHealthToZero(LivingEntity living) {
        Method setHealts = findMethod(living.getClass(), "setHEALTS", double.class);
        if (setHealts == null) {
            return;
        }
        try {
            setHealts.invoke(living, 0.0D);
        } catch (IllegalAccessException | InvocationTargetException ignored) {
        }
    }

    private static Method findMethod(Class<?> type, String name, Class<?>... parameterTypes) {
        Class<?> current = type;
        while (current != null) {
            try {
                Method method = current.getDeclaredMethod(name, parameterTypes);
                method.setAccessible(true);
                return method;
            } catch (NoSuchMethodException ignored) {
                current = current.getSuperclass();
            }
        }
        return null;
    }
}
