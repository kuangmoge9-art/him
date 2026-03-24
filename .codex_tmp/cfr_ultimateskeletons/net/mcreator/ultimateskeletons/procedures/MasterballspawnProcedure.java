/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.ZombiepigmantitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombietitanEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class MasterballspawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ServerLevel _level;
        Entity entityToSpawn;
        if (entity == null) {
            return;
        }
        if (entity instanceof ZombietitanEntity) {
            for (int index0 = 0; index0 < Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)8); ++index0) {
                if (!(world instanceof ServerLevel) || (entityToSpawn = EntityType.f_20501_.m_262496_(_level = (ServerLevel)world, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0)), (double)(y + 1.0), (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0))), MobSpawnType.MOB_SUMMONED)) == null) continue;
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
            for (int index1 = 0; index1 < Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2); ++index1) {
                if (!(world instanceof ServerLevel) || (entityToSpawn = EntityType.f_20454_.m_262496_(_level = (ServerLevel)world, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0)), (double)(y + 1.0), (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0))), MobSpawnType.MOB_SUMMONED)) == null) continue;
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
        }
        if (entity instanceof ZombiepigmantitanEntity) {
            for (int index2 = 0; index2 < Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)8); ++index2) {
                if (!(world instanceof ServerLevel) || (entityToSpawn = EntityType.f_20531_.m_262496_(_level = (ServerLevel)world, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0)), (double)(y + 1.0), (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0))), MobSpawnType.MOB_SUMMONED)) == null) continue;
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
            for (int index3 = 0; index3 < Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2); ++index3) {
                if (!(world instanceof ServerLevel) || (entityToSpawn = EntityType.f_20453_.m_262496_(_level = (ServerLevel)world, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0)), (double)(y + 1.0), (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0))), MobSpawnType.MOB_SUMMONED)) == null) continue;
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
        }
    }
}

