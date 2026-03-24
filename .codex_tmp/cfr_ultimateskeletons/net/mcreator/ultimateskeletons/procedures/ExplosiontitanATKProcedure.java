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
import net.mcreator.ultimateskeletons.entity.ExplosiontitanEntity;
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

public class ExplosiontitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        ExplosiontitanEntity _datEntI;
        if (entity == null) {
            return;
        }
        double theta = 0.0;
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        if (entity instanceof ExplosiontitanEntity) {
            int n9;
            ExplosiontitanEntity _datEntSetI = (ExplosiontitanEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof ExplosiontitanEntity) {
                ExplosiontitanEntity _datEntI2 = (ExplosiontitanEntity)entity;
                n9 = (Integer)_datEntI2.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
            } else {
                n9 = 0;
            }
            synchedEntityData.m_135381_(ExplosiontitanEntity.DATA_Tick, (Object)(n9 + 1));
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n8 = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n8 = 0;
        }
        if (n8 == 1) {
            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitanexplosion")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitanexplosion")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(2000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                double _setval = 16.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
            }
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEEXPLOSION.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n7 = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n7 = 0;
        }
        if (n7 == 43) {
            for (int index0 = 0; index0 < 2; ++index0) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.NAH.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
            }
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n6 = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n6 = 0;
        }
        if (n6 == 45 && world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.EXPLOSIONSHOCKWAVE.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n5 = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n5 = 0;
        }
        if (n5 >= 50) {
            for (int index1 = 0; index1 < 32; ++index1) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 0.1, z, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
            }
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n4 = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n4 = 0;
        }
        if (n4 >= 20) {
            int n10;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 2) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0), 0.0, 0.0, 0.0);
            }
            if (entity instanceof ExplosiontitanEntity) {
                ExplosiontitanEntity _datEntI3 = (ExplosiontitanEntity)entity;
                n10 = (Integer)_datEntI3.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
            } else {
                n10 = 0;
            }
            if (n10 <= 65) {
                int n11;
                Vec3 _center = new Vec3(x, y, z);
                AABB aABB = new AABB(_center, _center);
                if (entity instanceof ExplosiontitanEntity) {
                    ExplosiontitanEntity _datEntI4 = (ExplosiontitanEntity)entity;
                    n11 = (Integer)_datEntI4.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
                } else {
                    n11 = 0;
                }
                List<Entity> _entfound = world.m_6443_(Entity.class, aABB.m_82400_((double)(12 * (n11 - 25)) / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    double _setval = 3.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                }
            }
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n3 = 0;
        }
        if (n3 == 42) {
            if (theta >= 360.0) {
                theta = 0.0;
            }
            if (theta == 0.0) {
                for (int index2 = 0; index2 < 360; ++index2) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STARBLOCK.get()), x + 1.0 * Math.cos(theta), y + 36.0, z + 1.0 * Math.sin(theta), 6.0 * Math.cos(theta), 0.4, 6.0 * Math.sin(theta));
                    theta += 1.0;
                }
            }
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n2 = 0;
        }
        if (n2 >= 20) {
            int n12;
            if (entity instanceof ExplosiontitanEntity) {
                ExplosiontitanEntity _datEntI5 = (ExplosiontitanEntity)entity;
                n12 = (Integer)_datEntI5.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
            } else {
                n12 = 0;
            }
            if (n12 <= 22) {
                if (theta >= 360.0) {
                    theta = 0.0;
                }
                if (theta == 0.0) {
                    for (int index3 = 0; index3 < 360; ++index3) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STARBLOCK.get()), x + 1.0 * Math.cos(theta), y + 0.9, z + 1.0 * Math.sin(theta), 6.0 * Math.cos(theta), 0.0, 6.0 * Math.sin(theta));
                        theta += 1.0;
                    }
                }
            }
        }
        if (entity instanceof ExplosiontitanEntity) {
            _datEntI = (ExplosiontitanEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(ExplosiontitanEntity.DATA_Tick);
        } else {
            n = 0;
        }
        if (n >= 100) {
            if (entity instanceof ExplosiontitanEntity) {
                ExplosiontitanEntity _datEntSetI = (ExplosiontitanEntity)entity;
                _datEntSetI.m_20088_().m_135381_(ExplosiontitanEntity.DATA_Tick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
        }
    }
}

