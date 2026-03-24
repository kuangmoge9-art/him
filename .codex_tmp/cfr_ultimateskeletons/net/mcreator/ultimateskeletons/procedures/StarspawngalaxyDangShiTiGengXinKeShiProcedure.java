/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.StarspawngalaxyEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;

public class StarspawngalaxyDangShiTiGengXinKeShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        StarspawngalaxyEntity _datEntI;
        StarspawngalaxyEntity _datEntI2;
        if (entity == null) {
            return;
        }
        if (entity instanceof StarspawngalaxyEntity) {
            ((StarspawngalaxyEntity)entity).setAnimation("animation.starspawngalaxy");
        }
        if (entity instanceof StarspawngalaxyEntity) {
            int n5;
            StarspawngalaxyEntity _datEntSetI = (StarspawngalaxyEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof StarspawngalaxyEntity) {
                _datEntI2 = (StarspawngalaxyEntity)entity;
                n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarspawngalaxyEntity.DATA_spawnTick);
            } else {
                n5 = 0;
            }
            synchedEntityData.m_135381_(StarspawngalaxyEntity.DATA_spawnTick, (Object)(n5 + 1));
        }
        if (entity instanceof StarspawngalaxyEntity) {
            _datEntI = (StarspawngalaxyEntity)entity;
            n4 = (Integer)_datEntI.m_20088_().m_135370_(StarspawngalaxyEntity.DATA_spawnTick);
        } else {
            n4 = 0;
        }
        if (n4 >= 11) {
            int n6;
            if (entity instanceof StarspawngalaxyEntity) {
                _datEntI2 = (StarspawngalaxyEntity)entity;
                n6 = (Integer)_datEntI2.m_20088_().m_135370_(StarspawngalaxyEntity.DATA_spawnTick);
            } else {
                n6 = 0;
            }
            if (n6 <= 16) {
                for (int index0 = 0; index0 < 100; ++index0) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-120.0, (double)120.0), y, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-120.0, (double)120.0), 0.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)-12.0), 0.0);
                }
            }
        }
        if (entity instanceof StarspawngalaxyEntity) {
            _datEntI = (StarspawngalaxyEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(StarspawngalaxyEntity.DATA_spawnTick);
        } else {
            n3 = 0;
        }
        if (n3 >= 25) {
            int n7;
            if (entity instanceof StarspawngalaxyEntity) {
                _datEntI2 = (StarspawngalaxyEntity)entity;
                n7 = (Integer)_datEntI2.m_20088_().m_135370_(StarspawngalaxyEntity.DATA_spawnTick);
            } else {
                n7 = 0;
            }
            if (n7 <= 50) {
                for (int index1 = 0; index1 < 24; ++index1) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-12.0, (double)12.0), y, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-12.0, (double)12.0), 0.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)-8.0), 0.0);
                }
                for (int index2 = 0; index2 < 6; ++index2) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SUN.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), y, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), 0.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)-8.0), 0.0);
                }
            }
        }
        if (entity instanceof StarspawngalaxyEntity) {
            _datEntI = (StarspawngalaxyEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(StarspawngalaxyEntity.DATA_spawnTick);
        } else {
            n2 = 0;
        }
        if (n2 == 40 && world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STAR_SPIRIT.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
        }
        if (entity instanceof StarspawngalaxyEntity) {
            _datEntI = (StarspawngalaxyEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(StarspawngalaxyEntity.DATA_spawnTick);
        } else {
            n = 0;
        }
        if (n >= 80) {
            if (entity instanceof StarspawngalaxyEntity) {
                StarspawngalaxyEntity _datEntSetI = (StarspawngalaxyEntity)entity;
                _datEntSetI.m_20088_().m_135381_(StarspawngalaxyEntity.DATA_spawnTick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
        }
    }
}

