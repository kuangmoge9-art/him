/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.server.network.ServerGamePacketListenerImpl
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.levelgen.Heightmap$Types
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec2
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class StarlightDeathUltimateATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block705: {
            int n;
            int n2;
            int n3;
            StarlightDeathEntity _datEntI;
            Object entityToSpawn;
            ServerLevel _level;
            List<Entity> _entfound;
            StarlightDeathEntity _datEntI2;
            block709: {
                List<Entity> _entfound2;
                Vec3 _center;
                block708: {
                    int n4;
                    int n5;
                    block707: {
                        block706: {
                            int n6;
                            int n7;
                            int n8;
                            int n9;
                            int n10;
                            int n11;
                            float f;
                            LivingEntity livingEntity;
                            int n12;
                            Mob _mobEnt;
                            Mob _mobEnt2;
                            ServerPlayer _serverPlayer;
                            LivingEntity _ent;
                            Object _mobEnt3;
                            Mob _mobEnt4;
                            StarlightDeathEntity _datEntI3;
                            block700: {
                                int n13;
                                int n14;
                                int n15;
                                block704: {
                                    block703: {
                                        int n16;
                                        int n17;
                                        block702: {
                                            block701: {
                                                int n18;
                                                int n19;
                                                int n20;
                                                int n21;
                                                float f2;
                                                LivingEntity livingEntity2;
                                                int n22;
                                                int n23;
                                                int n24;
                                                int n25;
                                                int n26;
                                                Vec3 _center2;
                                                Level _level2;
                                                StarlightDeathEntity _datEntI4;
                                                int n27;
                                                StarlightDeathEntity _datEntSetI;
                                                int n28;
                                                int n29;
                                                float f3;
                                                int n30;
                                                StarlightDeathEntity _datEntSetI2;
                                                int n31;
                                                LivingEntity _entity;
                                                if (entity == null) {
                                                    return;
                                                }
                                                double theta = 0.0;
                                                if (entity instanceof StarlightDeathEntity) {
                                                    StarlightDeathEntity animatable = (StarlightDeathEntity)entity;
                                                    animatable.setTexture("xing_hui_ku_lou_");
                                                }
                                                if (entity instanceof LivingEntity) {
                                                    ((LivingEntity)entity).f_20919_ = 0;
                                                }
                                                ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                                }
                                                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                                                }
                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                if (entity instanceof StarlightDeathEntity) {
                                                    StarlightDeathEntity _datEntI32 = (StarlightDeathEntity)entity;
                                                    n31 = (Integer)_datEntI32.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                } else {
                                                    n31 = 0;
                                                }
                                                if (n31 == 0 && entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarlightDeathEntity) {
                                                    _datEntSetI2 = (StarlightDeathEntity)entity;
                                                    _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)0);
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n30 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                } else {
                                                    n30 = 0;
                                                }
                                                if (n30 != 0 && entity instanceof StarlightDeathEntity) {
                                                    int n32;
                                                    StarlightDeathEntity _datEntSetI22 = (StarlightDeathEntity)entity;
                                                    SynchedEntityData synchedEntityData = _datEntSetI22.m_20088_();
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        StarlightDeathEntity _datEntI42 = (StarlightDeathEntity)entity;
                                                        n32 = (Integer)_datEntI42.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n32 = 0;
                                                    }
                                                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)(n32 + 1));
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    int n33;
                                                    StarlightDeathEntity _datEntSetI3 = (StarlightDeathEntity)entity;
                                                    SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        StarlightDeathEntity _datEntI22 = (StarlightDeathEntity)entity;
                                                        n33 = (Integer)_datEntI22.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                    } else {
                                                        n33 = 0;
                                                    }
                                                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_spawnTick, (Object)(n33 + 1));
                                                }
                                                if (entity instanceof LivingEntity) {
                                                    LivingEntity _livEnt = (LivingEntity)entity;
                                                    f3 = _livEnt.m_21223_();
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (f3 <= 400000.0f) {
                                                    if (entity instanceof LivingEntity) {
                                                        ((LivingEntity)entity).f_20919_ = 0;
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)20);
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n29 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                } else {
                                                    n29 = 0;
                                                }
                                                if (n29 == 182 && entity instanceof StarlightDeathEntity) {
                                                    _datEntSetI2 = (StarlightDeathEntity)entity;
                                                    _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)11);
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n28 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                } else {
                                                    n28 = 0;
                                                }
                                                if (n28 > 183) {
                                                    int n34;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n34 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                    } else {
                                                        n34 = 0;
                                                    }
                                                    if (n34 == 0) {
                                                        if (entity.m_5446_().getString().equals("\u6da1\u6d41") && entity instanceof StarlightDeathEntity) {
                                                            _datEntSetI = (StarlightDeathEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)30);
                                                        }
                                                        if (entity.m_5446_().getString().equals("\u672a\u77e5") && entity instanceof StarlightDeathEntity) {
                                                            _datEntSetI = (StarlightDeathEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)20);
                                                        }
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n27 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                } else {
                                                    n27 = 0;
                                                }
                                                if (n27 < 182) {
                                                    int n35;
                                                    int n36;
                                                    int n37;
                                                    int n38;
                                                    int n39;
                                                    int n40;
                                                    entity.f_19802_ = 20;
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (entity instanceof Mob) {
                                                        Mob _entity2 = (Mob)entity;
                                                        _entity2.m_6710_(null);
                                                    }
                                                    if (entity instanceof LivingEntity) {
                                                        ((LivingEntity)entity).f_20919_ = 0;
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n40 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                    } else {
                                                        n40 = 0;
                                                    }
                                                    if (n40 > 0) {
                                                        int n41;
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            _datEntI4 = (StarlightDeathEntity)entity;
                                                            n41 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                        } else {
                                                            n41 = 0;
                                                        }
                                                        if (n41 <= 5) {
                                                            int n42;
                                                            for (int index0 = 0; index0 < 24; ++index0) {
                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                                            }
                                                            SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get();
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                StarlightDeathEntity _datEntI5 = (StarlightDeathEntity)entity;
                                                                n42 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                            } else {
                                                                n42 = 0;
                                                            }
                                                            world.m_7106_((ParticleOptions)simpleParticleType, x, y + (double)(n42 * 2), z, 0.0, 1.0, 0.0);
                                                            _center = new Vec3(x, y, z);
                                                            List<Entity> _entfound22 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(240.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                            Iterator iterator = _entfound22.iterator();
                                                            while (iterator.hasNext()) {
                                                                Entity entityiterator = (Entity)iterator.next();
                                                                if (entityiterator instanceof StarlightDeathEntity) continue;
                                                                double _setval = 4.0;
                                                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                    capability.camerashake = _setval;
                                                                    capability.syncPlayerVariables(entityiterator);
                                                                });
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n39 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                    } else {
                                                        n39 = 0;
                                                    }
                                                    if (n39 == 76) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                            }
                                                        }
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                            }
                                                        }
                                                        for (int index1 = 0; index1 < 32; ++index1) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0), 0.0, 0.0, 0.0);
                                                        }
                                                        for (int index2 = 0; index2 < 240; ++index2) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 30.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-60.0, (double)60.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-60.0, (double)60.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-60.0, (double)60.0));
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                                                        for (Entity entity2 : _entfound) {
                                                            if (entity2 instanceof StarlightDeathEntity) continue;
                                                            double _setval = 3.0;
                                                            entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                capability.camerashake = _setval;
                                                                capability.syncPlayerVariables(entity2);
                                                            });
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n38 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                    } else {
                                                        n38 = 0;
                                                    }
                                                    if (n38 == 101) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                                                            }
                                                        }
                                                        for (int index3 = 0; index3 < 4; ++index3) {
                                                            if (!(world instanceof ServerLevel)) continue;
                                                            _level = (ServerLevel)world;
                                                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 80.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn == null) continue;
                                                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                        }
                                                        for (int index4 = 0; index4 < 4000; ++index4) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.FLAME.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-320.0, (double)320.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.1, (double)48.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-320.0, (double)320.0), 0.0, 0.0, 0.0);
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                                                        for (Entity entity3 : _entfound) {
                                                            if (entity3 instanceof StarlightDeathEntity) continue;
                                                            double _setval = 12.0;
                                                            entity3.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                capability.camerashake = _setval;
                                                                capability.syncPlayerVariables(entity3);
                                                            });
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n37 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                    } else {
                                                        n37 = 0;
                                                    }
                                                    if (n37 == 111) {
                                                        for (int index5 = 0; index5 < 4; ++index5) {
                                                            if (!(world instanceof ServerLevel)) continue;
                                                            _level = (ServerLevel)world;
                                                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 80.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn == null) continue;
                                                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                        }
                                                        for (int index6 = 0; index6 < 2000; ++index6) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.FLAME.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-320.0, (double)320.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.1, (double)32.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-320.0, (double)320.0), 0.0, 0.0, 0.0);
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                                                        for (Entity entity4 : _entfound) {
                                                            if (entity4 instanceof StarlightskeletonEntity) continue;
                                                            double _setval = 8.0;
                                                            entity4.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                capability.camerashake = _setval;
                                                                capability.syncPlayerVariables(entity4);
                                                            });
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n36 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                    } else {
                                                        n36 = 0;
                                                    }
                                                    if (n36 == 151 && world instanceof Level) {
                                                        _level2 = (Level)world;
                                                        if (!_level2.m_5776_()) {
                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                                                        } else {
                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n35 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_spawnTick);
                                                    } else {
                                                        n35 = 0;
                                                    }
                                                    if (n35 < 10 && entity instanceof StarlightDeathEntity) {
                                                        ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.born");
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n26 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                } else {
                                                    n26 = 0;
                                                }
                                                if (n26 < 10) {
                                                    int n43;
                                                    int n44;
                                                    int n45;
                                                    int n46;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n46 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                                    } else {
                                                        n46 = 0;
                                                    }
                                                    if (n46 >= 30) {
                                                        ((StarlightDeathEntity)entity).setHEALTS(4000000.0);
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            int n47;
                                                            _datEntSetI = (StarlightDeathEntity)entity;
                                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI = (StarlightDeathEntity)entity;
                                                                n47 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                            } else {
                                                                n47 = 0;
                                                            }
                                                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_Tick, (Object)(n47 + 1));
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            _datEntSetI = (StarlightDeathEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            _datEntSetI = (StarlightDeathEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof LivingEntity) {
                                                            ((LivingEntity)entity).f_20919_ = 0;
                                                        }
                                                        entity.f_19802_ = 20;
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n45 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                    } else {
                                                        n45 = 0;
                                                    }
                                                    if (n45 >= 15) {
                                                        int n48;
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            _datEntI4 = (StarlightDeathEntity)entity;
                                                            n48 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                        } else {
                                                            n48 = 0;
                                                        }
                                                        if (n48 <= 30 && entity instanceof StarlightDeathEntity) {
                                                            ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.changeto1");
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n44 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                    } else {
                                                        n44 = 0;
                                                    }
                                                    if (n44 == 57) {
                                                        if (world instanceof Level) {
                                                            Level _level22 = (Level)world;
                                                            if (!_level22.m_5776_()) {
                                                                _level22.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                            } else {
                                                                _level22.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                            }
                                                        }
                                                        for (int index7 = 0; index7 < 24; ++index7) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0), 0.0, 0.0, 0.0);
                                                        }
                                                        Vec3 _center22 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center22, _center22).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                                                        for (Entity entity5 : _entfound) {
                                                            if (entity5 instanceof StarlightDeathEntity) continue;
                                                            double _setval = 6.0;
                                                            entity5.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                capability.camerashake = _setval;
                                                                capability.syncPlayerVariables(entity5);
                                                            });
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n43 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                    } else {
                                                        n43 = 0;
                                                    }
                                                    if (n43 >= 108 && entity instanceof StarlightDeathEntity) {
                                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                                    }
                                                } else {
                                                    int n49;
                                                    int n50;
                                                    int n51;
                                                    int n52;
                                                    if (entity instanceof LivingEntity) {
                                                        ((LivingEntity)entity).f_20919_ = 0;
                                                    }
                                                    entity.f_19802_ = 20;
                                                    ((StarlightDeathEntity)entity).setHEALTS(4000000.0);
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        int n53;
                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            _datEntI4 = (StarlightDeathEntity)entity;
                                                            n53 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                        } else {
                                                            n53 = 0;
                                                        }
                                                        synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryTick, (Object)(n53 + 1));
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n52 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                    } else {
                                                        n52 = 0;
                                                    }
                                                    if (n52 == 2 && world instanceof Level) {
                                                        _level2 = (Level)world;
                                                        if (!_level2.m_5776_()) {
                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angrybeginning")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                                                        } else {
                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angrybeginning")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n51 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                    } else {
                                                        n51 = 0;
                                                    }
                                                    if (n51 >= 15) {
                                                        int n54;
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            _datEntI4 = (StarlightDeathEntity)entity;
                                                            n54 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                        } else {
                                                            n54 = 0;
                                                        }
                                                        if (n54 <= 30 && entity instanceof StarlightDeathEntity) {
                                                            ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.changetoangry");
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n50 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                    } else {
                                                        n50 = 0;
                                                    }
                                                    if (n50 == 41) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                            }
                                                        }
                                                        if (world instanceof ServerLevel) {
                                                            _level2 = (ServerLevel)world;
                                                            Entity entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)x, (double)(y + 76.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn2 != null) {
                                                                entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                            }
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                                                        for (Entity entity6 : _entfound) {
                                                            if (entity6 instanceof StarlightskeletonEntity) continue;
                                                            double _setval = 6.0;
                                                            entity6.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                capability.camerashake = _setval;
                                                                capability.syncPlayerVariables(entity6);
                                                            });
                                                        }
                                                        for (int index8 = 0; index8 < 4000; ++index8) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.FLAME.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-240.0, (double)240.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)32.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-240.0, (double)240.0), 0.0, 0.0, 0.0);
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n49 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                    } else {
                                                        n49 = 0;
                                                    }
                                                    if (n49 >= 75 && entity instanceof StarlightDeathEntity) {
                                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n25 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                } else {
                                                    n25 = 0;
                                                }
                                                if (n25 < 10) {
                                                    int n55;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n55 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                                    } else {
                                                        n55 = 0;
                                                    }
                                                    if (n55 < 30) {
                                                        LivingEntity livingEntity3;
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            StarlightDeathEntity _datEntSetI4 = (StarlightDeathEntity)entity;
                                                            _datEntSetI4.m_20088_().m_135381_(StarlightDeathEntity.DATA_Tick, (Object)0);
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            StarlightDeathEntity _datEntSetI5 = (StarlightDeathEntity)entity;
                                                            _datEntSetI5.m_20088_().m_135381_(StarlightDeathEntity.DATA_angryTick, (Object)0);
                                                        }
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt6 = (Mob)entity;
                                                            livingEntity3 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity3 = null;
                                                        }
                                                        if (livingEntity3 != null) {
                                                            float f4;
                                                            LivingEntity livingEntity4;
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt5 = (Mob)entity;
                                                                v38 = _mobEnt5.m_5448_();
                                                            } else {
                                                                v38 = livingEntity4 = null;
                                                            }
                                                            if (livingEntity4 instanceof LivingEntity) {
                                                                LivingEntity _livEnt = livingEntity4;
                                                                f4 = _livEnt.m_21223_();
                                                            } else {
                                                                f4 = -1.0f;
                                                            }
                                                            if (f4 > 0.0f) {
                                                                float f5;
                                                                LivingEntity livingEntity5;
                                                                Mob _mobEnt5;
                                                                LivingEntity livingEntity6;
                                                                float f6;
                                                                LivingEntity livingEntity7;
                                                                float f7;
                                                                LivingEntity livingEntity8;
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity8 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity8 = null;
                                                                }
                                                                if (livingEntity8 != null) {
                                                                    LivingEntity livingEntity9;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt8 = (Mob)entity;
                                                                        livingEntity9 = _mobEnt8.m_5448_();
                                                                    } else {
                                                                        livingEntity9 = null;
                                                                    }
                                                                    f7 = entity.m_20270_(livingEntity9);
                                                                } else {
                                                                    f7 = -1.0f;
                                                                }
                                                                if (f7 >= 160.0f) {
                                                                    entity.m_6858_(true);
                                                                } else {
                                                                    entity.m_6858_(false);
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity7 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity7 = null;
                                                                }
                                                                if (livingEntity7 != null) {
                                                                    LivingEntity livingEntity10;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt9 = (Mob)entity;
                                                                        livingEntity10 = _mobEnt9.m_5448_();
                                                                    } else {
                                                                        livingEntity10 = null;
                                                                    }
                                                                    f6 = entity.m_20270_(livingEntity10);
                                                                } else {
                                                                    f6 = -1.0f;
                                                                }
                                                                if (f6 > 4.0f) {
                                                                    int n56;
                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                        StarlightDeathEntity _datEntI6 = (StarlightDeathEntity)entity;
                                                                        n56 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                    } else {
                                                                        n56 = 0;
                                                                    }
                                                                    if (n56 == 0) {
                                                                        LivingEntity livingEntity11;
                                                                        LivingEntity livingEntity12;
                                                                        LivingEntity livingEntity13;
                                                                        LivingEntity livingEntity14;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt32 = (Mob)entity;
                                                                            livingEntity14 = _mobEnt32.m_5448_();
                                                                        } else {
                                                                            livingEntity14 = null;
                                                                        }
                                                                        double d = livingEntity14.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt7 = (Mob)entity;
                                                                            livingEntity13 = _mobEnt7.m_5448_();
                                                                        } else {
                                                                            livingEntity13 = null;
                                                                        }
                                                                        double d2 = livingEntity13.m_20186_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt4 = (Mob)entity;
                                                                            livingEntity12 = _mobEnt4.m_5448_();
                                                                        } else {
                                                                            livingEntity12 = null;
                                                                        }
                                                                        double d3 = d2 + (double)livingEntity12.m_20206_() / 1.5;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt4 = (Mob)entity;
                                                                            livingEntity11 = _mobEnt4.m_5448_();
                                                                        } else {
                                                                            livingEntity11 = null;
                                                                        }
                                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity11.m_20189_()));
                                                                    }
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity6 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity6 = null;
                                                                }
                                                                if (livingEntity6.m_20206_() > 8.0f) {
                                                                    float f8;
                                                                    LivingEntity livingEntity15;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt10 = (Mob)entity;
                                                                        livingEntity15 = _mobEnt10.m_5448_();
                                                                    } else {
                                                                        livingEntity15 = null;
                                                                    }
                                                                    if (livingEntity15 != null) {
                                                                        LivingEntity livingEntity16;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt11 = (Mob)entity;
                                                                            livingEntity16 = _mobEnt11.m_5448_();
                                                                        } else {
                                                                            livingEntity16 = null;
                                                                        }
                                                                        f8 = entity.m_20270_(livingEntity16);
                                                                    } else {
                                                                        f8 = -1.0f;
                                                                    }
                                                                    if (f8 > 56.0f) {
                                                                        float f9;
                                                                        LivingEntity livingEntity17;
                                                                        LivingEntity livingEntity18;
                                                                        float f10;
                                                                        LivingEntity livingEntity19;
                                                                        LivingEntity livingEntity20;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity20 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity20 = null;
                                                                        }
                                                                        double d = livingEntity20.m_20185_() - entity.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt5 = (Mob)entity;
                                                                            livingEntity19 = _mobEnt5.m_5448_();
                                                                        } else {
                                                                            livingEntity19 = null;
                                                                        }
                                                                        if (livingEntity19 != null) {
                                                                            LivingEntity livingEntity21;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt4 = (Mob)entity;
                                                                                livingEntity21 = _mobEnt4.m_5448_();
                                                                            } else {
                                                                                livingEntity21 = null;
                                                                            }
                                                                            f10 = entity.m_20270_(livingEntity21);
                                                                        } else {
                                                                            f10 = -1.0f;
                                                                        }
                                                                        double d4 = d / (double)f10;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity18 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity18 = null;
                                                                        }
                                                                        double d5 = livingEntity18.m_20189_() - entity.m_20189_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt5 = (Mob)entity;
                                                                            livingEntity17 = _mobEnt5.m_5448_();
                                                                        } else {
                                                                            livingEntity17 = null;
                                                                        }
                                                                        if (livingEntity17 != null) {
                                                                            LivingEntity livingEntity22;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt4 = (Mob)entity;
                                                                                livingEntity22 = _mobEnt4.m_5448_();
                                                                            } else {
                                                                                livingEntity22 = null;
                                                                            }
                                                                            f9 = entity.m_20270_(livingEntity22);
                                                                        } else {
                                                                            f9 = -1.0f;
                                                                        }
                                                                        entity.m_20256_(new Vec3(d4, 0.0, d5 / (double)f9));
                                                                    }
                                                                } else {
                                                                    float f11;
                                                                    LivingEntity livingEntity23;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt12 = (Mob)entity;
                                                                        livingEntity23 = _mobEnt12.m_5448_();
                                                                    } else {
                                                                        livingEntity23 = null;
                                                                    }
                                                                    if (livingEntity23 != null) {
                                                                        LivingEntity livingEntity24;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt13 = (Mob)entity;
                                                                            livingEntity24 = _mobEnt13.m_5448_();
                                                                        } else {
                                                                            livingEntity24 = null;
                                                                        }
                                                                        f11 = entity.m_20270_(livingEntity24);
                                                                    } else {
                                                                        f11 = -1.0f;
                                                                    }
                                                                    if (f11 > 12.0f) {
                                                                        float f12;
                                                                        LivingEntity livingEntity25;
                                                                        LivingEntity livingEntity26;
                                                                        float f13;
                                                                        LivingEntity livingEntity27;
                                                                        LivingEntity livingEntity28;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity28 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity28 = null;
                                                                        }
                                                                        double d = livingEntity28.m_20185_() - entity.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt5 = (Mob)entity;
                                                                            livingEntity27 = _mobEnt5.m_5448_();
                                                                        } else {
                                                                            livingEntity27 = null;
                                                                        }
                                                                        if (livingEntity27 != null) {
                                                                            LivingEntity livingEntity29;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt4 = (Mob)entity;
                                                                                livingEntity29 = _mobEnt4.m_5448_();
                                                                            } else {
                                                                                livingEntity29 = null;
                                                                            }
                                                                            f13 = entity.m_20270_(livingEntity29);
                                                                        } else {
                                                                            f13 = -1.0f;
                                                                        }
                                                                        double d6 = d / (double)f13;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity26 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity26 = null;
                                                                        }
                                                                        double d7 = livingEntity26.m_20189_() - entity.m_20189_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt5 = (Mob)entity;
                                                                            livingEntity25 = _mobEnt5.m_5448_();
                                                                        } else {
                                                                            livingEntity25 = null;
                                                                        }
                                                                        if (livingEntity25 != null) {
                                                                            LivingEntity livingEntity30;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt4 = (Mob)entity;
                                                                                livingEntity30 = _mobEnt4.m_5448_();
                                                                            } else {
                                                                                livingEntity30 = null;
                                                                            }
                                                                            f12 = entity.m_20270_(livingEntity30);
                                                                        } else {
                                                                            f12 = -1.0f;
                                                                        }
                                                                        entity.m_20256_(new Vec3(d6, 0.0, d7 / (double)f12));
                                                                    }
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity5 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity5 = null;
                                                                }
                                                                if (livingEntity5 != null) {
                                                                    LivingEntity livingEntity31;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt14 = (Mob)entity;
                                                                        livingEntity31 = _mobEnt14.m_5448_();
                                                                    } else {
                                                                        livingEntity31 = null;
                                                                    }
                                                                    f5 = entity.m_20270_(livingEntity31);
                                                                } else {
                                                                    f5 = -1.0f;
                                                                }
                                                                if (f5 < 500.0f && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5 && !world.m_5776_()) {
                                                                    int n57;
                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                        StarlightDeathEntity _datEntI7 = (StarlightDeathEntity)entity;
                                                                        n57 = (Integer)_datEntI7.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                    } else {
                                                                        n57 = 0;
                                                                    }
                                                                    if (n57 == 0) {
                                                                        LivingEntity livingEntity32;
                                                                        LivingEntity livingEntity33;
                                                                        LivingEntity livingEntity34;
                                                                        LivingEntity livingEntity35;
                                                                        if (entity instanceof StarlightDeathEntity) {
                                                                            StarlightDeathEntity _datEntSetI6 = (StarlightDeathEntity)entity;
                                                                            _datEntSetI6.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                                                        }
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt4 = (Mob)entity;
                                                                            livingEntity35 = _mobEnt4.m_5448_();
                                                                        } else {
                                                                            livingEntity35 = null;
                                                                        }
                                                                        double d = livingEntity35.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt5 = (Mob)entity;
                                                                            livingEntity34 = _mobEnt5.m_5448_();
                                                                        } else {
                                                                            livingEntity34 = null;
                                                                        }
                                                                        double d8 = livingEntity34.m_20186_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt4 = (Mob)entity;
                                                                            livingEntity33 = _mobEnt4.m_5448_();
                                                                        } else {
                                                                            livingEntity33 = null;
                                                                        }
                                                                        double d9 = d8 + (double)livingEntity33.m_20206_() / 1.5;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt4 = (Mob)entity;
                                                                            livingEntity32 = _mobEnt4.m_5448_();
                                                                        } else {
                                                                            livingEntity32 = null;
                                                                        }
                                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d9, livingEntity32.m_20189_()));
                                                                    }
                                                                }
                                                            } else if (!entity.m_20096_()) {
                                                                if (entity.m_20186_() > -63.0) {
                                                                    entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
                                                                } else {
                                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                }
                                                            }
                                                        } else if (!entity.m_20096_()) {
                                                            if (entity.m_20186_() > -63.0) {
                                                                entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
                                                            } else {
                                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                            }
                                                        }
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n24 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                } else {
                                                    n24 = 0;
                                                }
                                                if (n24 == 1) {
                                                    int n58;
                                                    int n59;
                                                    int n60;
                                                    int n61;
                                                    int n62;
                                                    float f14;
                                                    LivingEntity livingEntity36;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.backflip2");
                                                    }
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt22 = (Mob)entity;
                                                        livingEntity36 = _mobEnt22.m_5448_();
                                                    } else {
                                                        livingEntity36 = null;
                                                    }
                                                    if (livingEntity36 != null) {
                                                        LivingEntity livingEntity37;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt15 = (Mob)entity;
                                                            livingEntity37 = _mobEnt15.m_5448_();
                                                        } else {
                                                            livingEntity37 = null;
                                                        }
                                                        f14 = entity.m_20270_(livingEntity37);
                                                    } else {
                                                        f14 = -1.0f;
                                                    }
                                                    if (f14 > 1.0f) {
                                                        LivingEntity livingEntity38;
                                                        LivingEntity livingEntity39;
                                                        LivingEntity livingEntity40;
                                                        LivingEntity livingEntity41;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            v98 = _mobEnt3.m_5448_();
                                                        } else {
                                                            v98 = _ent = null;
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity41 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity41 = null;
                                                        }
                                                        double d = livingEntity41.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity40 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity40 = null;
                                                        }
                                                        int n63 = (int)livingEntity40.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity39 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity39 = null;
                                                        }
                                                        double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n63, (int)livingEntity39.m_20189_());
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity38 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity38 = null;
                                                        }
                                                        _ent.m_6021_(d, d10, livingEntity38.m_20189_());
                                                        if (_ent instanceof ServerPlayer) {
                                                            LivingEntity livingEntity42;
                                                            LivingEntity livingEntity43;
                                                            LivingEntity livingEntity44;
                                                            LivingEntity livingEntity45;
                                                            _serverPlayer = (ServerPlayer)_ent;
                                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity45 = mob.m_5448_();
                                                            } else {
                                                                livingEntity45 = null;
                                                            }
                                                            double d11 = livingEntity45.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt16 = (Mob)entity;
                                                                livingEntity44 = _mobEnt16.m_5448_();
                                                            } else {
                                                                livingEntity44 = null;
                                                            }
                                                            int n64 = (int)livingEntity44.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt17 = (Mob)entity;
                                                                livingEntity43 = _mobEnt17.m_5448_();
                                                            } else {
                                                                livingEntity43 = null;
                                                            }
                                                            double d12 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n64, (int)livingEntity43.m_20189_());
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity42 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity42 = null;
                                                            }
                                                            serverGamePacketListenerImpl.m_9774_(d11, d12, livingEntity42.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n62 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n62 = 0;
                                                    }
                                                    if (n62 == 1) {
                                                        float f15;
                                                        LivingEntity livingEntity46;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt18 = (Mob)entity;
                                                            livingEntity46 = _mobEnt18.m_5448_();
                                                        } else {
                                                            livingEntity46 = null;
                                                        }
                                                        if (livingEntity46 != null) {
                                                            LivingEntity livingEntity47;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt2 = (Mob)entity;
                                                                livingEntity47 = _mobEnt2.m_5448_();
                                                            } else {
                                                                livingEntity47 = null;
                                                            }
                                                            f15 = entity.m_20270_(livingEntity47);
                                                        } else {
                                                            f15 = -1.0f;
                                                        }
                                                        if ((double)f15 > 0.1) {
                                                            LivingEntity livingEntity48;
                                                            LivingEntity livingEntity49;
                                                            LivingEntity livingEntity50;
                                                            LivingEntity livingEntity51;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity51 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity51 = null;
                                                            }
                                                            double d = livingEntity51.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity50 = mob.m_5448_();
                                                            } else {
                                                                livingEntity50 = null;
                                                            }
                                                            double d13 = livingEntity50.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity49 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity49 = null;
                                                            }
                                                            double d14 = d13 + (double)livingEntity49.m_20206_() / 1.5;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity48 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity48 = null;
                                                            }
                                                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d14, livingEntity48.m_20189_()));
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n61 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n61 = 0;
                                                    }
                                                    if (n61 == 24) {
                                                        float f16;
                                                        LivingEntity livingEntity52;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt19 = (Mob)entity;
                                                            livingEntity52 = _mobEnt19.m_5448_();
                                                        } else {
                                                            livingEntity52 = null;
                                                        }
                                                        if (livingEntity52 != null) {
                                                            LivingEntity livingEntity53;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt2 = (Mob)entity;
                                                                livingEntity53 = _mobEnt2.m_5448_();
                                                            } else {
                                                                livingEntity53 = null;
                                                            }
                                                            f16 = entity.m_20270_(livingEntity53);
                                                        } else {
                                                            f16 = -1.0f;
                                                        }
                                                        if (f16 > 1.0f) {
                                                            LivingEntity livingEntity54;
                                                            LivingEntity livingEntity55;
                                                            LivingEntity livingEntity56;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity56 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity56 = null;
                                                            }
                                                            double d = (livingEntity56.m_20185_() - entity.m_20185_()) * 2.0;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity55 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity55 = null;
                                                            }
                                                            double d15 = (livingEntity55.m_20186_() - entity.m_20186_()) * 2.0;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity54 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity54 = null;
                                                            }
                                                            entity.m_20256_(new Vec3(d, d15, (livingEntity54.m_20189_() - entity.m_20189_()) * 2.0));
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n60 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n60 = 0;
                                                    }
                                                    if (n60 == 26) {
                                                        if (world instanceof Level) {
                                                            Level _level3 = (Level)world;
                                                            if (!_level3.m_5776_()) {
                                                                _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        if (world instanceof Level) {
                                                            Level _level4 = (Level)world;
                                                            if (!_level4.m_5776_()) {
                                                                _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        Vec3 _center3 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                        for (Entity entity7 : _entfound) {
                                                            float f17;
                                                            if (entity7 instanceof StarlightDeathEntity) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity7 instanceof LivingEntity) {
                                                                LivingEntity _livEnt = (LivingEntity)entity7;
                                                                f17 = _livEnt.m_21233_();
                                                            } else {
                                                                f17 = -1.0f;
                                                            }
                                                            entity7.m_6469_(damageSource, f17 / 4.0f + 2000000.0f);
                                                            if (entity7 instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entity7 instanceof Player) continue;
                                                            entity7.f_19802_ = 0;
                                                            Deathlist.normalattack(entity7);
                                                        }
                                                        if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                            ServerLevel _level5 = (ServerLevel)world;
                                                            _level5.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level5, 4, "", (Component)Component.m_237113_((String)""), _level5.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                        }
                                                        for (int index9 = 0; index9 < 200; ++index9) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 40.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n59 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n59 = 0;
                                                    }
                                                    if (n59 == 45) {
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            int n65;
                                                            StarlightDeathEntity _datEntSetI7 = (StarlightDeathEntity)entity;
                                                            SynchedEntityData synchedEntityData = _datEntSetI7.m_20088_();
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI = (StarlightDeathEntity)entity;
                                                                n65 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                                            } else {
                                                                n65 = 0;
                                                            }
                                                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n65 + 1));
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            int n66;
                                                            StarlightDeathEntity _datEntSetI8 = (StarlightDeathEntity)entity;
                                                            SynchedEntityData synchedEntityData = _datEntSetI8.m_20088_();
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI = (StarlightDeathEntity)entity;
                                                                n66 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                            } else {
                                                                n66 = 0;
                                                            }
                                                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n66 + 1));
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n58 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n58 = 0;
                                                    }
                                                    if (n58 >= 45) {
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            StarlightDeathEntity _datEntSetI9 = (StarlightDeathEntity)entity;
                                                            _datEntSetI9.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            StarlightDeathEntity _datEntSetI10 = (StarlightDeathEntity)entity;
                                                            _datEntSetI10.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            ((StarlightDeathEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n23 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                } else {
                                                    n23 = 0;
                                                }
                                                if (n23 == 3) {
                                                    int n67;
                                                    int n68;
                                                    int n69;
                                                    int n70;
                                                    int n71;
                                                    int n72;
                                                    int n73;
                                                    float f18;
                                                    LivingEntity livingEntity57;
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.front");
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity57 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity57 = null;
                                                    }
                                                    if (livingEntity57 != null) {
                                                        LivingEntity livingEntity58;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt20 = (Mob)entity;
                                                            livingEntity58 = _mobEnt20.m_5448_();
                                                        } else {
                                                            livingEntity58 = null;
                                                        }
                                                        f18 = entity.m_20270_(livingEntity58);
                                                    } else {
                                                        f18 = -1.0f;
                                                    }
                                                    if (f18 > 1.0f) {
                                                        LivingEntity livingEntity59;
                                                        LivingEntity livingEntity60;
                                                        LivingEntity livingEntity61;
                                                        LivingEntity livingEntity62;
                                                        LivingEntity livingEntity63;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            v147 = _mobEnt3.m_5448_();
                                                        } else {
                                                            v147 = _ent = null;
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity63 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity63 = null;
                                                        }
                                                        double d = livingEntity63.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity62 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity62 = null;
                                                        }
                                                        int n74 = (int)livingEntity62.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity61 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity61 = null;
                                                        }
                                                        double d16 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n74, (int)livingEntity61.m_20189_());
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity60 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity60 = null;
                                                        }
                                                        _ent.m_6021_(d, d16, livingEntity60.m_20189_());
                                                        if (_ent instanceof ServerPlayer) {
                                                            LivingEntity livingEntity64;
                                                            LivingEntity livingEntity65;
                                                            LivingEntity livingEntity66;
                                                            LivingEntity livingEntity67;
                                                            _serverPlayer = (ServerPlayer)_ent;
                                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity67 = mob.m_5448_();
                                                            } else {
                                                                livingEntity67 = null;
                                                            }
                                                            double d17 = livingEntity67.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt21 = (Mob)entity;
                                                                livingEntity66 = _mobEnt21.m_5448_();
                                                            } else {
                                                                livingEntity66 = null;
                                                            }
                                                            int n75 = (int)livingEntity66.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt22 = (Mob)entity;
                                                                livingEntity65 = _mobEnt22.m_5448_();
                                                            } else {
                                                                livingEntity65 = null;
                                                            }
                                                            double d18 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n75, (int)livingEntity65.m_20189_());
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity64 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity64 = null;
                                                            }
                                                            serverGamePacketListenerImpl.m_9774_(d17, d18, livingEntity64.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity59 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity59 = null;
                                                        }
                                                        livingEntity59.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n73 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n73 = 0;
                                                    }
                                                    if (n73 == 1) {
                                                        float f19;
                                                        LivingEntity livingEntity68;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt23 = (Mob)entity;
                                                            livingEntity68 = _mobEnt23.m_5448_();
                                                        } else {
                                                            livingEntity68 = null;
                                                        }
                                                        if (livingEntity68 != null) {
                                                            LivingEntity livingEntity69;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt2 = (Mob)entity;
                                                                livingEntity69 = _mobEnt2.m_5448_();
                                                            } else {
                                                                livingEntity69 = null;
                                                            }
                                                            f19 = entity.m_20270_(livingEntity69);
                                                        } else {
                                                            f19 = -1.0f;
                                                        }
                                                        if (f19 > 1.0f) {
                                                            LivingEntity livingEntity70;
                                                            LivingEntity livingEntity71;
                                                            LivingEntity livingEntity72;
                                                            LivingEntity livingEntity73;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity73 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity73 = null;
                                                            }
                                                            double d = livingEntity73.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity72 = mob.m_5448_();
                                                            } else {
                                                                livingEntity72 = null;
                                                            }
                                                            double d19 = livingEntity72.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity71 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity71 = null;
                                                            }
                                                            double d20 = d19 + (double)livingEntity71.m_20206_() / 1.5;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity70 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity70 = null;
                                                            }
                                                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity70.m_20189_()));
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n72 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n72 = 0;
                                                    }
                                                    if (n72 == 17 && world instanceof Level) {
                                                        Level _level6 = (Level)world;
                                                        if (!_level6.m_5776_()) {
                                                            _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n71 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n71 = 0;
                                                    }
                                                    if (n71 == 22) {
                                                        if (world instanceof Level) {
                                                            Level _level7 = (Level)world;
                                                            if (!_level7.m_5776_()) {
                                                                _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        Vec3 _center4 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                                                        for (Entity entity8 : _entfound) {
                                                            float f20;
                                                            if (entity8 instanceof StarlightDeathEntity) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity8 instanceof LivingEntity) {
                                                                LivingEntity _livEnt = (LivingEntity)entity8;
                                                                f20 = _livEnt.m_21233_();
                                                            } else {
                                                                f20 = -1.0f;
                                                            }
                                                            entity8.m_6469_(damageSource, f20 / 4.0f + 0.0f);
                                                            if (!(entity8 instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity8 instanceof Player)) {
                                                                entity8.f_19802_ = 0;
                                                                Deathlist.normalattack(entity8);
                                                            }
                                                            if (entity8 instanceof Player) continue;
                                                            entity8.f_19802_ = 0;
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n70 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n70 = 0;
                                                    }
                                                    if (n70 == 47 && world instanceof Level) {
                                                        Level _level8 = (Level)world;
                                                        if (!_level8.m_5776_()) {
                                                            _level8.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level8.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n69 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n69 = 0;
                                                    }
                                                    if (n69 >= 52) {
                                                        int n76;
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            StarlightDeathEntity _datEntI8 = (StarlightDeathEntity)entity;
                                                            n76 = (Integer)_datEntI8.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                        } else {
                                                            n76 = 0;
                                                        }
                                                        if (n76 <= 66) {
                                                            _center = new Vec3(x, y, z);
                                                            _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                            for (Entity entityiterator : _entfound2) {
                                                                float f21;
                                                                if (entityiterator instanceof StarlightDeathEntity) continue;
                                                                if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                                    entityiterator.f_19802_ = 0;
                                                                    Deathlist.normalattack(entityiterator);
                                                                }
                                                                if (entityiterator instanceof GalaxyEntity) continue;
                                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                if (entityiterator instanceof LivingEntity) {
                                                                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                                                                    f21 = _livEnt.m_21233_();
                                                                } else {
                                                                    f21 = -1.0f;
                                                                }
                                                                entityiterator.m_6469_(damageSource, f21 / 4.0f + 1000000.0f);
                                                                if (entityiterator instanceof Player) continue;
                                                                CompoundTag nbt = entityiterator.m_20240_(new CompoundTag());
                                                                nbt.m_128350_("Health", 0.0f);
                                                                nbt.m_128405_("Health", 0);
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n68 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n68 = 0;
                                                    }
                                                    if (n68 == 67) {
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            int n77;
                                                            StarlightDeathEntity _datEntSetI11 = (StarlightDeathEntity)entity;
                                                            SynchedEntityData synchedEntityData = _datEntSetI11.m_20088_();
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI = (StarlightDeathEntity)entity;
                                                                n77 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                                            } else {
                                                                n77 = 0;
                                                            }
                                                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n77 + 2));
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            int n78;
                                                            StarlightDeathEntity _datEntSetI12 = (StarlightDeathEntity)entity;
                                                            SynchedEntityData synchedEntityData = _datEntSetI12.m_20088_();
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI = (StarlightDeathEntity)entity;
                                                                n78 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                            } else {
                                                                n78 = 0;
                                                            }
                                                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n78 + 1));
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n67 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n67 = 0;
                                                    }
                                                    if (n67 >= 67) {
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            StarlightDeathEntity _datEntSetI13 = (StarlightDeathEntity)entity;
                                                            _datEntSetI13.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            StarlightDeathEntity _datEntSetI14 = (StarlightDeathEntity)entity;
                                                            _datEntSetI14.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof StarlightDeathEntity) {
                                                            ((StarlightDeathEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n22 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                } else {
                                                    n22 = 0;
                                                }
                                                if (n22 != 2) break block700;
                                                if (entity instanceof StarlightDeathEntity) {
                                                    ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.doubleslash");
                                                }
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity2 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity2 = null;
                                                }
                                                if (livingEntity2 != null) {
                                                    LivingEntity livingEntity74;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt24 = (Mob)entity;
                                                        livingEntity74 = _mobEnt24.m_5448_();
                                                    } else {
                                                        livingEntity74 = null;
                                                    }
                                                    f2 = entity.m_20270_(livingEntity74);
                                                } else {
                                                    f2 = -1.0f;
                                                }
                                                if (f2 > 1.0f) {
                                                    LivingEntity livingEntity75;
                                                    LivingEntity livingEntity76;
                                                    LivingEntity livingEntity77;
                                                    LivingEntity livingEntity78;
                                                    LivingEntity livingEntity79;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt3 = (Mob)entity;
                                                        v194 = _mobEnt3.m_5448_();
                                                    } else {
                                                        v194 = _ent = null;
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt3 = (Mob)entity;
                                                        livingEntity79 = _mobEnt3.m_5448_();
                                                    } else {
                                                        livingEntity79 = null;
                                                    }
                                                    double d = livingEntity79.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt3 = (Mob)entity;
                                                        livingEntity78 = _mobEnt3.m_5448_();
                                                    } else {
                                                        livingEntity78 = null;
                                                    }
                                                    int n79 = (int)livingEntity78.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt3 = (Mob)entity;
                                                        livingEntity77 = _mobEnt3.m_5448_();
                                                    } else {
                                                        livingEntity77 = null;
                                                    }
                                                    double d21 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n79, (int)livingEntity77.m_20189_());
                                                    if (entity instanceof Mob) {
                                                        _mobEnt3 = (Mob)entity;
                                                        livingEntity76 = _mobEnt3.m_5448_();
                                                    } else {
                                                        livingEntity76 = null;
                                                    }
                                                    _ent.m_6021_(d, d21, livingEntity76.m_20189_());
                                                    if (_ent instanceof ServerPlayer) {
                                                        LivingEntity livingEntity80;
                                                        LivingEntity livingEntity81;
                                                        LivingEntity livingEntity82;
                                                        LivingEntity livingEntity83;
                                                        _serverPlayer = (ServerPlayer)_ent;
                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                                        if (entity instanceof Mob) {
                                                            Mob mob = (Mob)entity;
                                                            livingEntity83 = mob.m_5448_();
                                                        } else {
                                                            livingEntity83 = null;
                                                        }
                                                        double d22 = livingEntity83.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt25 = (Mob)entity;
                                                            livingEntity82 = _mobEnt25.m_5448_();
                                                        } else {
                                                            livingEntity82 = null;
                                                        }
                                                        int n80 = (int)livingEntity82.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt26 = (Mob)entity;
                                                            livingEntity81 = _mobEnt26.m_5448_();
                                                        } else {
                                                            livingEntity81 = null;
                                                        }
                                                        double d23 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n80, (int)livingEntity81.m_20189_());
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity80 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity80 = null;
                                                        }
                                                        serverGamePacketListenerImpl.m_9774_(d22, d23, livingEntity80.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity75 = _mobEnt2.m_5448_();
                                                    } else {
                                                        livingEntity75 = null;
                                                    }
                                                    livingEntity75.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                    n21 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n21 = 0;
                                                }
                                                if (n21 == 1) {
                                                    float f22;
                                                    LivingEntity livingEntity84;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt27 = (Mob)entity;
                                                        livingEntity84 = _mobEnt27.m_5448_();
                                                    } else {
                                                        livingEntity84 = null;
                                                    }
                                                    if (livingEntity84 != null) {
                                                        LivingEntity livingEntity85;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity85 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity85 = null;
                                                        }
                                                        f22 = entity.m_20270_(livingEntity85);
                                                    } else {
                                                        f22 = -1.0f;
                                                    }
                                                    if (f22 > 1.0f) {
                                                        LivingEntity livingEntity86;
                                                        LivingEntity livingEntity87;
                                                        LivingEntity livingEntity88;
                                                        LivingEntity livingEntity89;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity89 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity89 = null;
                                                        }
                                                        double d = livingEntity89.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            Mob mob = (Mob)entity;
                                                            livingEntity88 = mob.m_5448_();
                                                        } else {
                                                            livingEntity88 = null;
                                                        }
                                                        double d24 = livingEntity88.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity87 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity87 = null;
                                                        }
                                                        double d25 = d24 + (double)livingEntity87.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity86 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity86 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d25, livingEntity86.m_20189_()));
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                    n20 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n20 = 0;
                                                }
                                                if (n20 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                    ServerLevel _level9 = (ServerLevel)world;
                                                    _level9.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level9, 4, "", (Component)Component.m_237113_((String)""), _level9.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                    n19 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n19 = 0;
                                                }
                                                if (n19 == 15) break block701;
                                                if (entity instanceof StarlightDeathEntity) {
                                                    StarlightDeathEntity _datEntI9 = (StarlightDeathEntity)entity;
                                                    n18 = (Integer)_datEntI9.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n18 = 0;
                                                }
                                                if (n18 != 62) break block702;
                                            }
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                }
                                            }
                                        }
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI2 = (StarlightDeathEntity)entity;
                                            n17 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n17 = 0;
                                        }
                                        if (n17 == 17) break block703;
                                        if (entity instanceof StarlightDeathEntity) {
                                            StarlightDeathEntity _datEntI10 = (StarlightDeathEntity)entity;
                                            n16 = (Integer)_datEntI10.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n16 = 0;
                                        }
                                        if (n16 != 64) break block704;
                                    }
                                    if (world instanceof Level) {
                                        _level = (Level)world;
                                        if (!_level.m_5776_()) {
                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                        } else {
                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                        }
                                    }
                                    _center = new Vec3(x, y, z);
                                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    for (Entity entityiterator : _entfound2) {
                                        float f23;
                                        if (entityiterator instanceof StarlightDeathEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            LivingEntity _livEnt = (LivingEntity)entityiterator;
                                            f23 = _livEnt.m_21233_();
                                        } else {
                                            f23 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f23 / 4.0f + 2000000.0f);
                                        if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                            entityiterator.f_19802_ = 0;
                                            Deathlist.normalattack(entityiterator);
                                        }
                                        if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                        for (int index10 = 0; index10 < 2; ++index10) {
                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                        }
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n15 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n15 = 0;
                                }
                                if (n15 == 37) {
                                    LivingEntity _entity;
                                    if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                        _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                    }
                                    if (world instanceof Level) {
                                        Level _level10 = (Level)world;
                                        if (!_level10.m_5776_()) {
                                            _level10.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                        } else {
                                            _level10.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                        }
                                    }
                                    if (world instanceof Level) {
                                        Level _level11 = (Level)world;
                                        if (!_level11.m_5776_()) {
                                            _level11.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                        } else {
                                            _level11.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                        }
                                    }
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 60.0, y + 0.1, z + entity.m_20154_().f_82481_ * 60.0, 0.0, 0.0, 0.0);
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 60.0, y + 0.2, z + entity.m_20154_().f_82481_ * 60.0, 0.0, 0.0, 0.0);
                                    for (int index11 = 0; index11 < 32; ++index11) {
                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel)world;
                                            entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                                            entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                            entityToSpawn.m_20874_(true);
                                            _level.m_7967_((Entity)entityToSpawn);
                                        }
                                        if (!(world instanceof ServerLevel)) continue;
                                        _level = (ServerLevel)world;
                                        entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                        if (entityToSpawn == null) continue;
                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                    }
                                    Vec3 _center5 = new Vec3(x, y, z);
                                    _entfound = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                                    for (Entity entity9 : _entfound) {
                                        float f24;
                                        if (entity9 instanceof StarlightDeathEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entity9 instanceof LivingEntity) {
                                            LivingEntity _livEnt = (LivingEntity)entity9;
                                            f24 = _livEnt.m_21233_();
                                        } else {
                                            f24 = -1.0f;
                                        }
                                        entity9.m_6469_(damageSource, f24 / 4.0f + 2000000.0f);
                                        double _setval = 8.0;
                                        entity9.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                            capability.camerashake = _setval;
                                            capability.syncPlayerVariables(entity9);
                                        });
                                        if (!(entity9 instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity9 instanceof Player)) {
                                            entity9.f_19802_ = 0;
                                            Deathlist.normalattack(entity9);
                                        }
                                        if (entity9 instanceof Player || entity9 instanceof LightningBolt || entity9 instanceof OriginallightningEntity) continue;
                                        entity9.m_142687_(Entity.RemovalReason.KILLED);
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n14 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 == 82) {
                                    if (entity instanceof StarlightDeathEntity) {
                                        int n81;
                                        StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI = (StarlightDeathEntity)entity;
                                            n81 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                        } else {
                                            n81 = 0;
                                        }
                                        synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n81 + 3));
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        int n82;
                                        StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI = (StarlightDeathEntity)entity;
                                            n82 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                        } else {
                                            n82 = 0;
                                        }
                                        synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n82 + 1));
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n13 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 >= 82) {
                                    if (entity instanceof StarlightDeathEntity) {
                                        StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                    }
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI3 = (StarlightDeathEntity)entity;
                                n12 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                            } else {
                                n12 = 0;
                            }
                            if (n12 != 4) break block705;
                            if (entity instanceof StarlightDeathEntity) {
                                ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.swordups");
                            }
                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity = _mobEnt.m_5448_();
                            } else {
                                livingEntity = null;
                            }
                            if (livingEntity != null) {
                                LivingEntity livingEntity90;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt28 = (Mob)entity;
                                    livingEntity90 = _mobEnt28.m_5448_();
                                } else {
                                    livingEntity90 = null;
                                }
                                f = entity.m_20270_(livingEntity90);
                            } else {
                                f = -1.0f;
                            }
                            if (f > 1.0f) {
                                LivingEntity livingEntity91;
                                LivingEntity livingEntity92;
                                LivingEntity livingEntity93;
                                LivingEntity livingEntity94;
                                LivingEntity livingEntity95;
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    v242 = _mobEnt3.m_5448_();
                                } else {
                                    v242 = _ent = null;
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity95 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity95 = null;
                                }
                                double d = livingEntity95.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity94 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity94 = null;
                                }
                                int n83 = (int)livingEntity94.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity93 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity93 = null;
                                }
                                double d26 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n83, (int)livingEntity93.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity92 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity92 = null;
                                }
                                _ent.m_6021_(d, d26, livingEntity92.m_20189_());
                                if (_ent instanceof ServerPlayer) {
                                    LivingEntity livingEntity96;
                                    LivingEntity livingEntity97;
                                    LivingEntity livingEntity98;
                                    LivingEntity livingEntity99;
                                    _serverPlayer = (ServerPlayer)_ent;
                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity99 = mob.m_5448_();
                                    } else {
                                        livingEntity99 = null;
                                    }
                                    double d27 = livingEntity99.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt29 = (Mob)entity;
                                        livingEntity98 = _mobEnt29.m_5448_();
                                    } else {
                                        livingEntity98 = null;
                                    }
                                    int n84 = (int)livingEntity98.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt30 = (Mob)entity;
                                        livingEntity97 = _mobEnt30.m_5448_();
                                    } else {
                                        livingEntity97 = null;
                                    }
                                    double d28 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n84, (int)livingEntity97.m_20189_());
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity96 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity96 = null;
                                    }
                                    serverGamePacketListenerImpl.m_9774_(d27, d28, livingEntity96.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity91 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity91 = null;
                                }
                                livingEntity91.m_20256_(new Vec3(0.0, 0.0, 0.0));
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n11 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n11 = 0;
                            }
                            if (n11 == 1) {
                                float f25;
                                LivingEntity livingEntity100;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt31 = (Mob)entity;
                                    livingEntity100 = _mobEnt31.m_5448_();
                                } else {
                                    livingEntity100 = null;
                                }
                                if (livingEntity100 != null) {
                                    LivingEntity livingEntity101;
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity101 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity101 = null;
                                    }
                                    f25 = entity.m_20270_(livingEntity101);
                                } else {
                                    f25 = -1.0f;
                                }
                                if (f25 > 1.0f) {
                                    LivingEntity livingEntity102;
                                    LivingEntity livingEntity103;
                                    LivingEntity livingEntity104;
                                    LivingEntity livingEntity105;
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity105 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity105 = null;
                                    }
                                    double d = livingEntity105.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity104 = mob.m_5448_();
                                    } else {
                                        livingEntity104 = null;
                                    }
                                    double d29 = livingEntity104.m_20186_();
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity103 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity103 = null;
                                    }
                                    double d30 = d29 + (double)livingEntity103.m_20206_() / 1.5;
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity102 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity102 = null;
                                    }
                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d30, livingEntity102.m_20189_()));
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n10 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n10 = 0;
                            }
                            if (n10 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                ServerLevel _level12 = (ServerLevel)world;
                                _level12.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level12, 4, "", (Component)Component.m_237113_((String)""), _level12.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n9 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n9 = 0;
                            }
                            if (n9 == 18) {
                                if (world instanceof Level) {
                                    Level _level13 = (Level)world;
                                    if (!_level13.m_5776_()) {
                                        _level13.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level13.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                Vec3 _center6 = new Vec3(x, y, z);
                                _entfound = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                                for (Entity entity10 : _entfound) {
                                    float f26;
                                    if (entity10 instanceof StarlightDeathEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entity10 instanceof LivingEntity) {
                                        LivingEntity _livEnt = (LivingEntity)entity10;
                                        f26 = _livEnt.m_21233_();
                                    } else {
                                        f26 = -1.0f;
                                    }
                                    entity10.m_6469_(damageSource, f26 / 4.0f + 1000000.0f);
                                    if (entity10 instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entity10 instanceof Player) continue;
                                    entity10.f_19802_ = 0;
                                    Deathlist.normalattack(entity10);
                                }
                                for (int index12 = 0; index12 < 200; ++index12) {
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 30.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)5.0, (double)15.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0));
                                }
                                for (int index13 = 0; index13 < 400; ++index13) {
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 40.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-50, (int)50), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-50, (int)50), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-50, (int)50));
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n8 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n8 = 0;
                            }
                            if (n8 == 40) {
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ZHAN.get()), x, y + 80.0, z, 0.0, 0.0, 0.0);
                                if (world instanceof Level) {
                                    Level _level14 = (Level)world;
                                    if (!_level14.m_5776_()) {
                                        _level14.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level14.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                for (int index14 = 0; index14 < 2; ++index14) {
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.BLADERUSH.get()), x + entity.m_20154_().f_82479_ * 20.0, y + 30.0, z + entity.m_20154_().f_82481_ * 20.0, 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n7 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n7 = 0;
                            }
                            if (n7 == 61) break block706;
                            if (entity instanceof StarlightDeathEntity) {
                                StarlightDeathEntity _datEntI11 = (StarlightDeathEntity)entity;
                                n6 = (Integer)_datEntI11.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n6 = 0;
                            }
                            if (n6 != 67) break block707;
                        }
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                            }
                        }
                    }
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI2 = (StarlightDeathEntity)entity;
                        n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n5 = 0;
                    }
                    if (n5 == 63) break block708;
                    if (entity instanceof StarlightDeathEntity) {
                        StarlightDeathEntity _datEntI12 = (StarlightDeathEntity)entity;
                        n4 = (Integer)_datEntI12.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n4 = 0;
                    }
                    if (n4 != 69) break block709;
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound2) {
                    float f;
                    if (entityiterator instanceof StarlightDeathEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f / 4.0f + 2000000.0f);
                    double _setval = 4.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    if (entityiterator instanceof Player || entityiterator instanceof OriginallightningEntity || !(entityiterator instanceof LivingEntity)) continue;
                    for (int index15 = 0; index15 < 2; ++index15) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                    }
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n3 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n3 = 0;
            }
            if (n3 == 90) {
                int n85;
                LivingEntity _entity;
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    Level _level15 = (Level)world;
                    if (!_level15.m_5776_()) {
                        _level15.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level15.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level16 = (Level)world;
                    if (!_level16.m_5776_()) {
                        _level16.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level16.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 60.0, y + 0.1, z + entity.m_20154_().f_82481_ * 60.0, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 60.0, y + 0.2, z + entity.m_20154_().f_82481_ * 60.0, 0.0, 0.0, 0.0);
                for (int index16 = 0; index16 < 32; ++index16) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                        entityToSpawn.m_20874_(true);
                        _level.m_7967_((Entity)entityToSpawn);
                    }
                    if (!(world instanceof ServerLevel)) continue;
                    _level = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                if (entity instanceof StarlightDeathEntity) {
                    StarlightDeathEntity _datEntI13 = (StarlightDeathEntity)entity;
                    n85 = (Integer)_datEntI13.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                } else {
                    n85 = 0;
                }
                if (n85 >= 6 && entity instanceof Mob) {
                    Mob _entity3 = (Mob)entity;
                    _entity3.m_6710_(null);
                }
                Vec3 _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity11 : _entfound) {
                    int n86;
                    float f;
                    if (entity11 instanceof StarlightDeathEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entity11;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entity11.m_6469_(damageSource, f * 4.0f + 1.0E7f);
                    double _setval = 6.0;
                    entity11.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entity11);
                    });
                    if (!(entity11 instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity11 instanceof Player)) {
                        entity11.f_19802_ = 0;
                        Deathlist.normalattack(entity11);
                    }
                    if (entity11 instanceof Player || entity11 instanceof OriginallightningEntity || !(entity11 instanceof Titangodentity) || !(entity11 instanceof LivingEntity)) continue;
                    entity11.m_142687_(Entity.RemovalReason.KILLED);
                    if (entity instanceof StarlightDeathEntity) {
                        StarlightDeathEntity _datEntI14 = (StarlightDeathEntity)entity;
                        n86 = (Integer)_datEntI14.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                    } else {
                        n86 = 0;
                    }
                    if (n86 < 9) continue;
                    Deathlist.normalattack(entity11);
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 == 107) {
                if (entity instanceof StarlightDeathEntity) {
                    int n87;
                    StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI = (StarlightDeathEntity)entity;
                        n87 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                    } else {
                        n87 = 0;
                    }
                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n87 + 3));
                }
                if (entity instanceof StarlightDeathEntity) {
                    int n88;
                    StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI = (StarlightDeathEntity)entity;
                        n88 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                    } else {
                        n88 = 0;
                    }
                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n88 + 1));
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n = 0;
            }
            if (n >= 107) {
                if (entity instanceof StarlightDeathEntity) {
                    StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarlightDeathEntity) {
                    StarlightDeathEntity _datEntSetI = (StarlightDeathEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarlightDeathEntity) {
                    ((StarlightDeathEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

