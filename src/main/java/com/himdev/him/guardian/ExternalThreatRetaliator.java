package com.himdev.him.guardian;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.util.HimLog;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;

public final class ExternalThreatRetaliator {
    private static final double PRIMARY_SEARCH_RADIUS = 32.0D;
    private static final double COHORT_SEARCH_RADIUS = 12.0D;
    private static final String ULTIMATE_SKELETONS_NAMESPACE = "ultimateskeletons";

    private static final DivinePunisher DIVINE_PUNISHER = new DivinePunisher();
    private static volatile Method ultimateSkeletonsKillEntity;
    private static volatile Method ultimateSkeletonsNormalAttack;
    private static volatile boolean ultimateSkeletonsMethodsLoaded;

    public void retaliate(ServerLevel level, Vec3 incidentCenter) {
        Entity primaryThreat = findPrimaryThreat(level, incidentCenter);
        if (primaryThreat == null) {
            HimLog.info("retaliation skipped reason=no_threat_found center={}", incidentCenter);
            return;
        }

        List<Entity> retaliationTargets = level.getEntitiesOfClass(
                Entity.class,
                primaryThreat.getBoundingBox().inflate(COHORT_SEARCH_RADIUS),
                entity -> shouldRetaliateAgainst(entity, primaryThreat)
        );
        if (retaliationTargets.isEmpty()) {
            retaliationTargets = List.of(primaryThreat);
        }

        HimLog.info(
                "retaliation triggered primary={} type={} cohort_size={} center={}",
                primaryThreat.getUUID(),
                entityKey(primaryThreat),
                retaliationTargets.size(),
                incidentCenter
        );
        for (Entity target : retaliationTargets) {
            forceRemove(level, target);
        }
    }

    private Entity findPrimaryThreat(ServerLevel level, Vec3 incidentCenter) {
        AABB searchBox = AABB.ofSize(incidentCenter, PRIMARY_SEARCH_RADIUS * 2.0D, PRIMARY_SEARCH_RADIUS * 2.0D, PRIMARY_SEARCH_RADIUS * 2.0D);
        return level.getEntitiesOfClass(Entity.class, searchBox, this::isRetaliationCandidate)
                .stream()
                .min(Comparator
                        .comparingInt((Entity entity) -> isUltimateSkeletonsEntity(entity) ? 0 : 1)
                        .thenComparingDouble(entity -> entity.distanceToSqr(incidentCenter))
                        .thenComparingDouble(this::negativeThreatWeight))
                .orElse(null);
    }

    private boolean shouldRetaliateAgainst(Entity candidate, Entity primaryThreat) {
        if (!isRetaliationCandidate(candidate)) {
            return false;
        }
        if (candidate.getUUID().equals(primaryThreat.getUUID())) {
            return true;
        }

        if (candidate.getClass() == primaryThreat.getClass()) {
            return true;
        }

        String primaryNamespace = namespace(primaryThreat);
        return !primaryNamespace.isEmpty()
                && !ResourceLocation.DEFAULT_NAMESPACE.equals(primaryNamespace)
                && primaryNamespace.equals(namespace(candidate));
    }

    private boolean isRetaliationCandidate(Entity entity) {
        return entity.isAlive()
                && !entity.isRemoved()
                && entity instanceof Enemy
                && !(entity instanceof Player)
                && !(entity instanceof HimEntity);
    }

    private double negativeThreatWeight(Entity entity) {
        double healthWeight = entity instanceof LivingEntity living ? living.getMaxHealth() : 0.0D;
        double sizeWeight = entity.getBbWidth() * entity.getBbHeight();
        return -(healthWeight + sizeWeight * 10.0D);
    }

    private void forceRemove(ServerLevel level, Entity target) {
        if (!target.isAlive() || target.isRemoved()) {
            return;
        }

        if (isUltimateSkeletonsEntity(target) && invokeUltimateSkeletonsDelete(target)) {
            HimLog.info("retaliation removed target={} mode=ultimate_skeletons key={}", target.getUUID(), entityKey(target));
            return;
        }

        DIVINE_PUNISHER.punish(level, target);
        if (!target.isAlive() || target.isRemoved()) {
            HimLog.info("retaliation removed target={} mode=divine key={}", target.getUUID(), entityKey(target));
            return;
        }

        target.remove(Entity.RemovalReason.KILLED);
        if (!target.isAlive() || target.isRemoved()) {
            HimLog.info("retaliation removed target={} mode=generic_remove key={}", target.getUUID(), entityKey(target));
            return;
        }

        target.setRemoved(Entity.RemovalReason.KILLED);
        HimLog.info(
                "retaliation final_state target={} key={} alive={} removed={}",
                target.getUUID(),
                entityKey(target),
                target.isAlive(),
                target.isRemoved()
        );
    }

    private boolean invokeUltimateSkeletonsDelete(Entity target) {
        loadUltimateSkeletonsMethods();
        try {
            if (ultimateSkeletonsKillEntity != null) {
                ultimateSkeletonsKillEntity.invoke(null, target);
            }
            if ((target.isAlive() && !target.isRemoved()) && ultimateSkeletonsNormalAttack != null) {
                ultimateSkeletonsNormalAttack.invoke(null, target);
            }
            return !target.isAlive() || target.isRemoved();
        } catch (ReflectiveOperationException exception) {
            HimLog.info("retaliation reflection_failed target={} reason={}", target.getUUID(), exception.toString());
            return false;
        }
    }

    private void loadUltimateSkeletonsMethods() {
        if (ultimateSkeletonsMethodsLoaded) {
            return;
        }

        synchronized (ExternalThreatRetaliator.class) {
            if (ultimateSkeletonsMethodsLoaded) {
                return;
            }
            try {
                Class<?> deathlistClass = Class.forName("net.mcreator.ultimateskeletons.Deathlist");
                ultimateSkeletonsKillEntity = deathlistClass.getMethod("killEntity", Entity.class);
                ultimateSkeletonsNormalAttack = deathlistClass.getMethod("normalattack", Entity.class);
            } catch (ReflectiveOperationException exception) {
                HimLog.info("retaliation ultimate_skeletons_hooks_unavailable reason={}", exception.toString());
            } finally {
                ultimateSkeletonsMethodsLoaded = true;
            }
        }
    }

    private boolean isUltimateSkeletonsEntity(Entity entity) {
        return ULTIMATE_SKELETONS_NAMESPACE.equals(namespace(entity))
                || entity.getClass().getName().startsWith("net.mcreator.ultimateskeletons.");
    }

    private String namespace(Entity entity) {
        ResourceLocation key = ForgeRegistries.ENTITY_TYPES.getKey(entity.getType());
        return key != null ? key.getNamespace() : "";
    }

    private String entityKey(Entity entity) {
        ResourceLocation key = ForgeRegistries.ENTITY_TYPES.getKey(entity.getType());
        return key != null ? key.toString() : entity.getType().toString();
    }
}
