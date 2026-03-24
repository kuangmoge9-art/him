/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.entity.StarlightfazhenEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class StarlightspawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        StarlightfazhenEntity _datEntI;
        if (entity == null) {
            return;
        }
        double theta = 0.0;
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            _level.m_8615_(18000L);
        }
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        if (entity instanceof StarlightfazhenEntity) {
            int n9;
            StarlightfazhenEntity _datEntSetI = (StarlightfazhenEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof StarlightfazhenEntity) {
                StarlightfazhenEntity _datEntI2 = (StarlightfazhenEntity)entity;
                n9 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
            } else {
                n9 = 0;
            }
            synchedEntityData.m_135381_(StarlightfazhenEntity.DATA_Tick, (Object)(n9 + 1));
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(2000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entity2 : _entfound) {
            double _setval = 1.0;
            entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                capability.camerashake = _setval;
                capability.syncPlayerVariables(entity2);
            });
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n8 = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n8 = 0;
        }
        if (n8 == 1) {
            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            Vec3 _center2 = new Vec3(x, y, z);
            List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(2000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
            for (Entity entityiterator : _entfound2) {
                double _setval = 4.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
            }
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEEXPLOSION.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n7 = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n7 = 0;
        }
        if (n7 == 70) {
            for (int index0 = 0; index0 < 2; ++index0) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x, y + 120.0, z, 0.0, 0.0, 0.0);
            }
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n6 = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n6 = 0;
        }
        if (n6 == 95) {
            for (int index1 = 0; index1 < 2; ++index1) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.BLACKHOLETEST.get()), x, y + 120.0, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.PAN.get()), x, y + 120.0, z, 0.0, 0.0, 0.0);
            }
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n5 = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n5 = 0;
        }
        if (n5 >= 70 && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 2) {
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0), 0.0, 0.0, 0.0);
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n4 = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n4 = 0;
        }
        if (n4 >= 110) {
            int n10;
            if (entity instanceof StarlightfazhenEntity) {
                StarlightfazhenEntity _datEntI3 = (StarlightfazhenEntity)entity;
                n10 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
            } else {
                n10 = 0;
            }
            if (n10 <= 255) {
                for (int index2 = 0; index2 < 32; ++index2) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STARBLOCK.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-8.0, (double)8.0), y + 120.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-8.0, (double)8.0), 0.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-10.0, (double)-6.0), 0.0);
                }
            }
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n3 = 0;
        }
        if (n3 <= 55) {
            if (theta >= 360.0) {
                theta = 0.0;
            }
            if (theta == 0.0) {
                int index3 = 0;
                while (true) {
                    int n11;
                    int n12;
                    int n13;
                    if (entity instanceof StarlightfazhenEntity) {
                        StarlightfazhenEntity _datEntI5 = (StarlightfazhenEntity)entity;
                        n13 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
                    } else {
                        n13 = 0;
                    }
                    if (index3 >= 120 + n13 * 4) break;
                    SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.STARBLOCK.get();
                    if (entity instanceof StarlightfazhenEntity) {
                        StarlightfazhenEntity starlightfazhenEntity = (StarlightfazhenEntity)entity;
                        n12 = (Integer)starlightfazhenEntity.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
                    } else {
                        n12 = 0;
                    }
                    double d = x + (double)(n12 * 2) * Math.cos(theta);
                    if (entity instanceof StarlightfazhenEntity) {
                        StarlightfazhenEntity starlightfazhenEntity = (StarlightfazhenEntity)entity;
                        n11 = (Integer)starlightfazhenEntity.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
                    } else {
                        n11 = 0;
                    }
                    world.m_7106_((ParticleOptions)simpleParticleType, d, y + 0.01, z + (double)(n11 * 2) * Math.sin(theta), 0.0, 1.0, 0.0);
                    theta += 1.0;
                    ++index3;
                }
            }
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n2 = 0;
        }
        if (n2 == 270) {
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHT_DEATH.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 0.1), (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.BALL.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 0.1), (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            for (int index4 = 0; index4 < 48; ++index4) {
                if (!(world instanceof ServerLevel)) continue;
                ServerLevel _level = (ServerLevel)world;
                Entity entity3 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0)), (double)(y + 0.1), (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0))), MobSpawnType.MOB_SUMMONED);
                if (entity3 == null) continue;
                entity3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
        }
        if (entity instanceof StarlightfazhenEntity) {
            _datEntI = (StarlightfazhenEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(StarlightfazhenEntity.DATA_Tick);
        } else {
            n = 0;
        }
        if (n >= 271) {
            if (entity instanceof StarlightfazhenEntity) {
                StarlightfazhenEntity _datEntSetI = (StarlightfazhenEntity)entity;
                _datEntSetI.m_20088_().m_135381_(StarlightfazhenEntity.DATA_Tick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
        }
    }
}

