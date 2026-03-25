package com.himdev.him.guardian;

import com.himdev.him.compat.UltimateSkeletonsPunishmentCompat;
import com.himdev.him.registry.HimDamageTypes;
import com.himdev.him.util.HimLog;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Slime;

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

        if (UltimateSkeletonsPunishmentCompat.shouldUseCompat(target)) {
            boolean compatApplied = UltimateSkeletonsPunishmentCompat.punish(level, target);
            HimLog.info("punished target={} type=compat accepted={} alive={} removed={} reason={} health={}",
                    target.getUUID(),
                    compatApplied,
                    target.isAlive(),
                    target.isRemoved(),
                    target.getRemovalReason(),
                    target instanceof LivingEntity living ? living.getHealth() : -1.0F);
            if (compatApplied || !target.isAlive()) {
                return;
            }
        }

        if (target instanceof LivingEntity livingEntity) {
            if (livingEntity instanceof Slime slime) {
                SplittingMobCleanupTracker.track(level, slime);
            }
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
