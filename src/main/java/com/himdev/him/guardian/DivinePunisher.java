package com.himdev.him.guardian;

import com.himdev.him.compat.UltimateSkeletonsPunishmentCompat;
import com.himdev.him.registry.HimDamageTypes;
import com.himdev.him.util.HimLog;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
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
        DamageSource divinePunishment = HimDamageTypes.divinePunishment(level);

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
            punishLiving(level, livingEntity, divinePunishment);
            return;
        }

        boolean accepted = target.hurt(divinePunishment, MINIMUM_PUNISH_DAMAGE);
        boolean fallbackApplied = ensureEntityRemoved(level, target);
        HimLog.info(
                "punished target={} type=entity damage={} accepted={} fallback={} alive={} removed={} reason={}",
                target.getUUID(),
                MINIMUM_PUNISH_DAMAGE,
                accepted,
                fallbackApplied,
                target.isAlive(),
                target.isRemoved(),
                target.getRemovalReason()
        );
    }

    private void punishLiving(ServerLevel level, LivingEntity target, DamageSource divinePunishment) {
        if (target instanceof Slime slime) {
            SplittingMobCleanupTracker.track(level, slime);
        }

        target.invulnerableTime = 0;
        float punishDamage = Math.max(MINIMUM_PUNISH_DAMAGE, target.getMaxHealth() * 4.0F);
        boolean accepted = target.hurt(divinePunishment, punishDamage);
        boolean fallbackApplied = ensureLivingEntityDies(level, target);
        HimLog.info(
                "punished target={} type=living damage={} accepted={} fallback={} alive={} removed={} reason={} health={}",
                target.getUUID(),
                punishDamage,
                accepted,
                fallbackApplied,
                target.isAlive(),
                target.isRemoved(),
                target.getRemovalReason(),
                target.getHealth()
        );
    }

    private boolean ensureLivingEntityDies(ServerLevel level, LivingEntity target) {
        if (!target.isAlive()) {
            return false;
        }

        target.invulnerableTime = 0;
        target.setAbsorptionAmount(0.0F);
        boolean genericKillAccepted = target.hurt(level.damageSources().genericKill(), Float.MAX_VALUE);
        if (!target.isAlive()) {
            return true;
        }

        target.invulnerableTime = 0;
        boolean voidKillAccepted = target.hurt(level.damageSources().fellOutOfWorld(), Float.MAX_VALUE);
        if (!target.isAlive()) {
            return true;
        }

        target.remove(Entity.RemovalReason.KILLED);
        return genericKillAccepted || voidKillAccepted || target.isRemoved();
    }

    private boolean ensureEntityRemoved(ServerLevel level, Entity target) {
        if (!target.isAlive()) {
            return false;
        }

        boolean genericKillAccepted = target.hurt(level.damageSources().genericKill(), Float.MAX_VALUE);
        if (!target.isAlive()) {
            return true;
        }

        target.remove(Entity.RemovalReason.KILLED);
        return genericKillAccepted || target.isRemoved();
    }
}
