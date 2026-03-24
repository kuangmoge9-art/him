package com.himdev.him.compat;

import com.himdev.him.entity.HimEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Comparator;
import java.util.List;

public final class UltimateSkeletonsClearCompat {
    private static final ResourceLocation SWING_SOUND_ID = new ResourceLocation("ultimateskeletons", "swing");
    private static final ResourceLocation TITANGOD_DAMAGE_ID = new ResourceLocation("ultimateskeletons", "titangoddamage");
    private static final double CLEAR_SWING_RADIUS = 100000.0D;
    private static final double CLEAR_USE_RADIUS = 250.0D;

    private UltimateSkeletonsClearCompat() {
    }

    public static boolean hasHimInRange(LevelAccessor level, double x, double y, double z, double radius) {
        Vec3 center = new Vec3(x, y, z);
        return findEntities(level, center, radius).stream().anyMatch(HimEntity.class::isInstance);
    }

    public static void executeClearSwingExcludingHim(LevelAccessor level, double x, double y, double z, Entity source) {
        Vec3 center = new Vec3(x, y, z);
        for (Entity target : findEntities(level, center, CLEAR_SWING_RADIUS)) {
            if (target instanceof Player || target instanceof HimEntity) {
                continue;
            }
            UltimateSkeletonsDeathlistCompat.executeSafeNormalAttack(target);
        }
    }

    public static void executeClearUseExcludingHim(LevelAccessor level, double x, double y, double z) {
        playSwingSound(level, x, y, z);

        DamageSource damageSource = titangodDamage(level);
        if (damageSource == null) {
            return;
        }

        Vec3 center = new Vec3(x, y, z);
        for (Entity target : findEntities(level, center, CLEAR_USE_RADIUS)) {
            if (target instanceof Player || target instanceof HimEntity) {
                continue;
            }
            if (target instanceof LivingEntity living) {
                living.setHealth(0.0F);
            }
            target.hurt(damageSource, 5.0E7F);
        }
    }

    private static List<Entity> findEntities(LevelAccessor level, Vec3 center, double radius) {
        return level.getEntitiesOfClass(Entity.class, new AABB(center, center).inflate(radius), entity -> true)
                .stream()
                .sorted(Comparator.comparingDouble(entity -> entity.distanceToSqr(center)))
                .toList();
    }

    private static void playSwingSound(LevelAccessor level, double x, double y, double z) {
        if (!(level instanceof Level actualLevel)) {
            return;
        }

        SoundEvent swingSound = ForgeRegistries.SOUND_EVENTS.getValue(SWING_SOUND_ID);
        if (swingSound == null) {
            return;
        }

        BlockPos pos = BlockPos.containing(x, y, z);
        if (!actualLevel.isClientSide()) {
            actualLevel.playSound(null, pos, swingSound, SoundSource.NEUTRAL, 20.0F, 1.0F);
        } else {
            actualLevel.playLocalSound(x, y, z, swingSound, SoundSource.NEUTRAL, 20.0F, 1.0F, false);
        }
    }

    private static DamageSource titangodDamage(LevelAccessor level) {
        if (!(level instanceof Level actualLevel)) {
            return null;
        }
        Holder.Reference<net.minecraft.world.damagesource.DamageType> damageType = actualLevel.registryAccess()
                .registryOrThrow(Registries.DAMAGE_TYPE)
                .getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, TITANGOD_DAMAGE_ID));
        return new DamageSource(damageType);
    }
}
