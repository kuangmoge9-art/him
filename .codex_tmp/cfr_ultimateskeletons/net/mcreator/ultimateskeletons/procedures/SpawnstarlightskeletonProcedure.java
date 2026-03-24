/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class SpawnstarlightskeletonProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTFAZHEN.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
        }
        for (int index0 = 0; index0 < 20; ++index0) {
            if (!(world instanceof ServerLevel)) continue;
            ServerLevel _level = (ServerLevel)world;
            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0))), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn == null) continue;
            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
        }
        for (int index1 = 0; index1 < 8; ++index1) {
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)3.0, (double)80.0), z, 0.0, 1.0, 0.0);
        }
    }
}

