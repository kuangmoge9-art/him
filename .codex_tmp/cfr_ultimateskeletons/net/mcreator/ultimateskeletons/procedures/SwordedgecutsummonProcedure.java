/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.Level$ExplosionInteraction
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class SwordedgecutsummonProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        Level _level;
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.TEMPLARLIGHTNING.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
        if (world instanceof Level && !(_level = (Level)world).m_5776_()) {
            _level.m_254849_(null, x, y, z, 8.0f, Level.ExplosionInteraction.BLOCK);
        }
        for (int index0 = 0; index0 < 24; ++index0) {
            if (!(world instanceof ServerLevel)) continue;
            ServerLevel _level2 = (ServerLevel)world;
            LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level2);
            entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-16, (int)16)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-16, (int)16)))));
            _level2.m_7967_((Entity)entityToSpawn);
        }
    }
}

