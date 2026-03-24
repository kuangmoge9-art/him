/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
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
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class SwordssummonstarProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        Level _level;
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
        if (world instanceof Level && !(_level = (Level)world).m_5776_()) {
            _level.m_254849_(null, x, y, z, 8.0f, Level.ExplosionInteraction.NONE);
        }
        if (world instanceof ServerLevel) {
            _level = (ServerLevel)world;
            LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
            entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)y, (double)z)));
            _level.m_7967_((Entity)entityToSpawn);
        }
    }
}

