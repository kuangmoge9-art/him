package com.himdev.him.compat;

import com.himdev.him.entity.HimEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

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
            living.setHealth(0.0F);
        }

        entity.remove(Entity.RemovalReason.KILLED);
        if (!entity.isRemoved()) {
            entity.discard();
        }
    }
}
