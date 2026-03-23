package com.himdev.him.guardian;

import com.himdev.him.registry.HimDamageTypes;
import com.himdev.him.util.HimLog;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

import java.util.UUID;

public final class DivinePunisher {
    private static final float MINIMUM_PUNISH_DAMAGE = 1024.0F;

    public void punish(ServerLevel level, UUID targetId) {
        Entity target = level.getEntity(targetId);
        if (target == null) {
            HimLog.info("punishment skipped target={} reason=missing_entity", targetId);
            return;
        }
        punish(level, target);
    }

    public void punish(ServerLevel level, Entity target) {
        if (!target.isAlive()) {
            HimLog.info("punishment skipped target={} reason=already_dead", target.getUUID());
            return;
        }

        if (target instanceof LivingEntity livingEntity) {
            livingEntity.invulnerableTime = 0;
            float punishDamage = Math.max(MINIMUM_PUNISH_DAMAGE, livingEntity.getMaxHealth() * 4.0F);
            livingEntity.hurt(HimDamageTypes.divinePunishment(level), punishDamage);
            HimLog.info("punished target={} type=living damage={}", target.getUUID(), punishDamage);
            return;
        }

        target.hurt(HimDamageTypes.divinePunishment(level), MINIMUM_PUNISH_DAMAGE);
        HimLog.info("punished target={} type=entity damage={}", target.getUUID(), MINIMUM_PUNISH_DAMAGE);
    }
}
