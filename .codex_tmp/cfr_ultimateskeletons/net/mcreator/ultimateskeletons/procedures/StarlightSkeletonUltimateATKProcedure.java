/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
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
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
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

public class StarlightSkeletonUltimateATKProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        Object entityToSpawn;
        ServerLevel _level;
        List<Entity> _entfound;
        StarlightskeletonEntity _datEntI;
        StarlightskeletonEntity _datEntI2;
        block660: {
            List<Entity> _entfound2;
            Vec3 _center;
            block659: {
                int n3;
                int n4;
                block658: {
                    block657: {
                        int n5;
                        int n6;
                        int n7;
                        int n8;
                        int n9;
                        float f;
                        LivingEntity livingEntity;
                        float f2;
                        LivingEntity livingEntity2;
                        int n10;
                        ServerPlayer _serverPlayer;
                        LivingEntity _ent;
                        Object _mobEnt;
                        Mob _mobEnt2;
                        Mob _mobEnt3;
                        Mob _mobEnt4;
                        StarlightskeletonEntity _datEntI3;
                        block652: {
                            int n11;
                            int n12;
                            int n13;
                            block656: {
                                block655: {
                                    int n14;
                                    int n15;
                                    block654: {
                                        block653: {
                                            int n16;
                                            int n17;
                                            int n18;
                                            float f3;
                                            LivingEntity livingEntity3;
                                            float f4;
                                            LivingEntity livingEntity4;
                                            int n19;
                                            int n20;
                                            block648: {
                                                block649: {
                                                    block650: {
                                                        int n21;
                                                        block651: {
                                                            float f5;
                                                            LivingEntity livingEntity5;
                                                            float f6;
                                                            LivingEntity livingEntity6;
                                                            float f7;
                                                            LivingEntity livingEntity7;
                                                            Mob _mobEnt5;
                                                            float f8;
                                                            LivingEntity livingEntity8;
                                                            float f9;
                                                            LivingEntity livingEntity9;
                                                            float f10;
                                                            LivingEntity livingEntity10;
                                                            LivingEntity livingEntity11;
                                                            int n22;
                                                            int n23;
                                                            int n24;
                                                            Vec3 _center2;
                                                            Level _level2;
                                                            int n25;
                                                            int n26;
                                                            StarlightskeletonEntity _datEntSetI;
                                                            int n27;
                                                            LivingEntity _livEnt;
                                                            LivingEntity _entity;
                                                            float f11;
                                                            int n28;
                                                            StarlightskeletonEntity _datEntI4;
                                                            StarlightskeletonEntity _datEntSetI2;
                                                            int n29;
                                                            LivingEntity _entity2;
                                                            if (entity == null) {
                                                                return;
                                                            }
                                                            double theta = 0.0;
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                StarlightskeletonEntity animatable = (StarlightskeletonEntity)entity;
                                                                animatable.setTexture("xing_hui_ku_lou_");
                                                            }
                                                            ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 100, 3));
                                                            }
                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 100, 5));
                                                            }
                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19603_, 100, 4));
                                                            }
                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 100, 10));
                                                            }
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                n29 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                            } else {
                                                                n29 = 0;
                                                            }
                                                            if (n29 != 0 && entity instanceof StarlightskeletonEntity) {
                                                                int n30;
                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI4 = (StarlightskeletonEntity)entity;
                                                                    n30 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n30 = 0;
                                                                }
                                                                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)(n30 + 1));
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                n28 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                            } else {
                                                                n28 = 0;
                                                            }
                                                            if (n28 == 0 && entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarlightskeletonEntity) {
                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)0);
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                int n31;
                                                                StarlightskeletonEntity _datEntSetI3 = (StarlightskeletonEntity)entity;
                                                                SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n31 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                } else {
                                                                    n31 = 0;
                                                                }
                                                                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_spawnTick, (Object)(n31 + 1));
                                                            }
                                                            if (entity instanceof LivingEntity) {
                                                                LivingEntity _livEnt2 = (LivingEntity)entity;
                                                                f11 = _livEnt2.m_21223_();
                                                            } else {
                                                                f11 = -1.0f;
                                                            }
                                                            if (f11 <= 0.0f) {
                                                                if (entity instanceof LivingEntity) {
                                                                    ((LivingEntity)entity).f_20919_ = 0;
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    ((StarlightskeletonEntity)entity).setAnimation("empty");
                                                                }
                                                                if (entity instanceof LivingEntity) {
                                                                    float f12;
                                                                    _entity = (LivingEntity)entity;
                                                                    if (entity instanceof LivingEntity) {
                                                                        _livEnt = (LivingEntity)entity;
                                                                        f12 = _livEnt.m_21233_();
                                                                    } else {
                                                                        f12 = -1.0f;
                                                                    }
                                                                    _entity.m_21153_(f12);
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)20);
                                                                }
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                n27 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                            } else {
                                                                n27 = 0;
                                                            }
                                                            if (n27 > 183) {
                                                                int n32;
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n32 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                } else {
                                                                    n32 = 0;
                                                                }
                                                                if (n32 == 0) {
                                                                    if (entity.m_5446_().getString().equals("\u6da1\u6d41") && entity instanceof StarlightskeletonEntity) {
                                                                        _datEntSetI = (StarlightskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)50);
                                                                    }
                                                                    if (entity.m_5446_().getString().equals("\u672a\u77e5") && entity instanceof StarlightskeletonEntity) {
                                                                        _datEntSetI = (StarlightskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)20);
                                                                    }
                                                                }
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                n26 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                            } else {
                                                                n26 = 0;
                                                            }
                                                            if (n26 == 182 && entity instanceof StarlightskeletonEntity) {
                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)11);
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                n25 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                            } else {
                                                                n25 = 0;
                                                            }
                                                            if (n25 < 182) {
                                                                int n33;
                                                                int n34;
                                                                int n35;
                                                                int n36;
                                                                int n37;
                                                                int n38;
                                                                entity.f_19802_ = 20;
                                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                if (entity instanceof Mob) {
                                                                    _entity = (Mob)entity;
                                                                    _entity.m_6710_(null);
                                                                }
                                                                if (entity instanceof LivingEntity) {
                                                                    ((LivingEntity)entity).f_20919_ = 0;
                                                                }
                                                                if (entity instanceof LivingEntity) {
                                                                    float f13;
                                                                    _entity = (LivingEntity)entity;
                                                                    if (entity instanceof LivingEntity) {
                                                                        _livEnt = (LivingEntity)entity;
                                                                        f13 = _livEnt.m_21233_();
                                                                    } else {
                                                                        f13 = -1.0f;
                                                                    }
                                                                    _entity.m_21153_(f13);
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n38 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                } else {
                                                                    n38 = 0;
                                                                }
                                                                if (n38 >= 0) {
                                                                    int n39;
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntI4 = (StarlightskeletonEntity)entity;
                                                                        n39 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                    } else {
                                                                        n39 = 0;
                                                                    }
                                                                    if (n39 <= 4) {
                                                                        int n40;
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                                                        SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get();
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI = (StarlightskeletonEntity)entity;
                                                                            n40 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                        } else {
                                                                            n40 = 0;
                                                                        }
                                                                        world.m_7106_((ParticleOptions)simpleParticleType, x, y + (double)(n40 * 2), z, 0.0, 1.0, 0.0);
                                                                        _center = new Vec3(x, y, z);
                                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                        for (Entity entityiterator : _entfound2) {
                                                                            if (entityiterator instanceof StarlightskeletonEntity) continue;
                                                                            double _setval = 4.0;
                                                                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                capability.camerashake = _setval;
                                                                                capability.syncPlayerVariables(entityiterator);
                                                                            });
                                                                        }
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n37 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                } else {
                                                                    n37 = 0;
                                                                }
                                                                if (n37 == 76) {
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
                                                                    for (int index0 = 0; index0 < 32; ++index0) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-80.0, (double)80.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-80.0, (double)80.0), 0.0, 0.0, 0.0);
                                                                    }
                                                                    for (int index1 = 0; index1 < 240; ++index1) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0));
                                                                    }
                                                                    _center2 = new Vec3(x, y, z);
                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                    for (Entity entity2 : _entfound) {
                                                                        if (entity2 instanceof StarlightskeletonEntity) continue;
                                                                        double _setval = 3.0;
                                                                        entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entity2);
                                                                        });
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n36 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                } else {
                                                                    n36 = 0;
                                                                }
                                                                if (n36 == 101) {
                                                                    if (world instanceof Level) {
                                                                        _level2 = (Level)world;
                                                                        if (!_level2.m_5776_()) {
                                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                                                                        } else {
                                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    for (int index2 = 0; index2 < 4; ++index2) {
                                                                        if (!(world instanceof ServerLevel)) continue;
                                                                        _level = (ServerLevel)world;
                                                                        entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 8.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                                                        if (entityToSpawn == null) continue;
                                                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                    }
                                                                    for (int index3 = 0; index3 < 12; ++index3) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.FLAME.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.0, 0.0);
                                                                    }
                                                                    _center2 = new Vec3(x, y, z);
                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                    for (Entity entity3 : _entfound) {
                                                                        if (entity3 instanceof StarlightskeletonEntity) continue;
                                                                        double _setval = 12.0;
                                                                        entity3.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entity3);
                                                                        });
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n35 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                } else {
                                                                    n35 = 0;
                                                                }
                                                                if (n35 == 111) {
                                                                    for (int index4 = 0; index4 < 4; ++index4) {
                                                                        if (!(world instanceof ServerLevel)) continue;
                                                                        _level = (ServerLevel)world;
                                                                        entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 8.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                                                        if (entityToSpawn == null) continue;
                                                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                    }
                                                                    for (int index5 = 0; index5 < 12; ++index5) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.FLAME.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.0, 0.0);
                                                                    }
                                                                    _center2 = new Vec3(x, y, z);
                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                    for (Entity entity4 : _entfound) {
                                                                        if (entity4 instanceof StarlightskeletonEntity) continue;
                                                                        double _setval = 8.0;
                                                                        entity4.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entity4);
                                                                        });
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n34 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                } else {
                                                                    n34 = 0;
                                                                }
                                                                if (n34 == 151 && world instanceof Level) {
                                                                    _level2 = (Level)world;
                                                                    if (!_level2.m_5776_()) {
                                                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                                                                    } else {
                                                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n33 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_spawnTick);
                                                                } else {
                                                                    n33 = 0;
                                                                }
                                                                if (n33 < 10 && entity instanceof StarlightskeletonEntity) {
                                                                    ((StarlightskeletonEntity)entity).setAnimation("animation.starlightskeleton.born");
                                                                }
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                n24 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                                            } else {
                                                                n24 = 0;
                                                            }
                                                            if (n24 < 10) {
                                                                int n41;
                                                                int n42;
                                                                int n43;
                                                                int n44;
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n44 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                                                } else {
                                                                    n44 = 0;
                                                                }
                                                                if (n44 >= 30) {
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        int n45;
                                                                        _datEntSetI = (StarlightskeletonEntity)entity;
                                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI = (StarlightskeletonEntity)entity;
                                                                            n45 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                        } else {
                                                                            n45 = 0;
                                                                        }
                                                                        synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_Tick, (Object)(n45 + 1));
                                                                    }
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntSetI = (StarlightskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntSetI = (StarlightskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                                    }
                                                                    if (entity instanceof LivingEntity) {
                                                                        ((LivingEntity)entity).f_20919_ = 0;
                                                                    }
                                                                    entity.f_19802_ = 20;
                                                                    if (entity instanceof LivingEntity) {
                                                                        float f14;
                                                                        LivingEntity _entity3 = (LivingEntity)entity;
                                                                        if (entity instanceof LivingEntity) {
                                                                            LivingEntity _livEnt3 = (LivingEntity)entity;
                                                                            f14 = _livEnt3.m_21233_();
                                                                        } else {
                                                                            f14 = -1.0f;
                                                                        }
                                                                        _entity3.m_21153_(f14);
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n43 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                } else {
                                                                    n43 = 0;
                                                                }
                                                                if (n43 >= 15) {
                                                                    int n46;
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntI4 = (StarlightskeletonEntity)entity;
                                                                        n46 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                    } else {
                                                                        n46 = 0;
                                                                    }
                                                                    if (n46 <= 30 && entity instanceof StarlightskeletonEntity) {
                                                                        ((StarlightskeletonEntity)entity).setAnimation("animation.starlightskeleton.changeto1");
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n42 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                } else {
                                                                    n42 = 0;
                                                                }
                                                                if (n42 == 57) {
                                                                    if (world instanceof Level) {
                                                                        _level2 = (Level)world;
                                                                        if (!_level2.m_5776_()) {
                                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                        } else {
                                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    for (int index6 = 0; index6 < 24; ++index6) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0), 0.0, 0.0, 0.0);
                                                                    }
                                                                    _center2 = new Vec3(x, y, z);
                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                    for (Entity entity5 : _entfound) {
                                                                        if (entity5 instanceof StarlightskeletonEntity) continue;
                                                                        double _setval = 6.0;
                                                                        entity5.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entity5);
                                                                        });
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n41 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                } else {
                                                                    n41 = 0;
                                                                }
                                                                if (n41 >= 108 && entity instanceof StarlightskeletonEntity) {
                                                                    ((StarlightskeletonEntity)entity).setAnimation("empty");
                                                                }
                                                            } else {
                                                                int n47;
                                                                int n48;
                                                                int n49;
                                                                int n50;
                                                                if (entity instanceof LivingEntity) {
                                                                    ((LivingEntity)entity).f_20919_ = 0;
                                                                }
                                                                if (entity instanceof LivingEntity) {
                                                                    float f15;
                                                                    _entity = (LivingEntity)entity;
                                                                    if (entity instanceof LivingEntity) {
                                                                        _livEnt = (LivingEntity)entity;
                                                                        f15 = _livEnt.m_21233_();
                                                                    } else {
                                                                        f15 = -1.0f;
                                                                    }
                                                                    _entity.m_21153_(f15);
                                                                }
                                                                entity.f_19802_ = 20;
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    int n51;
                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntI4 = (StarlightskeletonEntity)entity;
                                                                        n51 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                    } else {
                                                                        n51 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryTick, (Object)(n51 + 1));
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n50 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                } else {
                                                                    n50 = 0;
                                                                }
                                                                if (n50 == 2 && world instanceof Level) {
                                                                    _level2 = (Level)world;
                                                                    if (!_level2.m_5776_()) {
                                                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angrybeginning")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                                                                    } else {
                                                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angrybeginning")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n49 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                } else {
                                                                    n49 = 0;
                                                                }
                                                                if (n49 >= 15) {
                                                                    int n52;
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntI4 = (StarlightskeletonEntity)entity;
                                                                        n52 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                    } else {
                                                                        n52 = 0;
                                                                    }
                                                                    if (n52 <= 30 && entity instanceof StarlightskeletonEntity) {
                                                                        ((StarlightskeletonEntity)entity).setAnimation("animation.starlightskeleton.changetoangry");
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n48 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                } else {
                                                                    n48 = 0;
                                                                }
                                                                if (n48 == 41) {
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
                                                                        Entity entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)x, (double)(y + 7.6), (double)z), MobSpawnType.MOB_SUMMONED);
                                                                        if (entityToSpawn2 != null) {
                                                                            entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                        }
                                                                    }
                                                                    _center2 = new Vec3(x, y, z);
                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                    for (Entity entity6 : _entfound) {
                                                                        if (entity6 instanceof StarlightskeletonEntity) continue;
                                                                        double _setval = 6.0;
                                                                        entity6.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entity6);
                                                                        });
                                                                    }
                                                                    for (int index7 = 0; index7 < 12; ++index7) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.FLAME.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + 0.1, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.0, 0.0);
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n47 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                } else {
                                                                    n47 = 0;
                                                                }
                                                                if (n47 >= 75 && entity instanceof StarlightskeletonEntity) {
                                                                    ((StarlightskeletonEntity)entity).setAnimation("empty");
                                                                }
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                n23 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                                            } else {
                                                                n23 = 0;
                                                            }
                                                            if (n23 >= 10) break block648;
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                                n22 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                                            } else {
                                                                n22 = 0;
                                                            }
                                                            if (n22 >= 30) break block648;
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                StarlightskeletonEntity _datEntSetI4 = (StarlightskeletonEntity)entity;
                                                                _datEntSetI4.m_20088_().m_135381_(StarlightskeletonEntity.DATA_Tick, (Object)0);
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                StarlightskeletonEntity _datEntSetI5 = (StarlightskeletonEntity)entity;
                                                                _datEntSetI5.m_20088_().m_135381_(StarlightskeletonEntity.DATA_angryTick, (Object)0);
                                                            }
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt6 = (Mob)entity;
                                                                livingEntity11 = _mobEnt6.m_5448_();
                                                            } else {
                                                                livingEntity11 = null;
                                                            }
                                                            if (livingEntity11 == null) break block649;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                v42 = _mobEnt4.m_5448_();
                                                            } else {
                                                                v42 = livingEntity10 = null;
                                                            }
                                                            if (livingEntity10 instanceof LivingEntity) {
                                                                LivingEntity _livEnt4 = livingEntity10;
                                                                f10 = _livEnt4.m_21223_();
                                                            } else {
                                                                f10 = -1.0f;
                                                            }
                                                            if (!(f10 > 0.0f)) break block650;
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity9 = mob.m_5448_();
                                                            } else {
                                                                livingEntity9 = null;
                                                            }
                                                            if (livingEntity9 != null) {
                                                                LivingEntity livingEntity12;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt7 = (Mob)entity;
                                                                    livingEntity12 = _mobEnt7.m_5448_();
                                                                } else {
                                                                    livingEntity12 = null;
                                                                }
                                                                f9 = entity.m_20270_(livingEntity12);
                                                            } else {
                                                                f9 = -1.0f;
                                                            }
                                                            if (f9 >= 20.0f) {
                                                                entity.m_6858_(true);
                                                            } else {
                                                                entity.m_6858_(false);
                                                            }
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity8 = mob.m_5448_();
                                                            } else {
                                                                livingEntity8 = null;
                                                            }
                                                            if (livingEntity8 != null) {
                                                                LivingEntity livingEntity13;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt8 = (Mob)entity;
                                                                    livingEntity13 = _mobEnt8.m_5448_();
                                                                } else {
                                                                    livingEntity13 = null;
                                                                }
                                                                f8 = entity.m_20270_(livingEntity13);
                                                            } else {
                                                                f8 = -1.0f;
                                                            }
                                                            if (f8 > 1.0f) {
                                                                int n53;
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    StarlightskeletonEntity _datEntI5 = (StarlightskeletonEntity)entity;
                                                                    n53 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                } else {
                                                                    n53 = 0;
                                                                }
                                                                if (n53 == 0) {
                                                                    LivingEntity livingEntity14;
                                                                    LivingEntity livingEntity15;
                                                                    LivingEntity livingEntity16;
                                                                    LivingEntity livingEntity17;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity17 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity17 = null;
                                                                    }
                                                                    double d = livingEntity17.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt5 = (Mob)entity;
                                                                        livingEntity16 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        livingEntity16 = null;
                                                                    }
                                                                    double d2 = livingEntity16.m_20186_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity15 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity15 = null;
                                                                    }
                                                                    double d3 = d2 + (double)livingEntity15.m_20206_() / 1.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity14 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity14 = null;
                                                                    }
                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity14.m_20189_()));
                                                                }
                                                            }
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity7 = mob.m_5448_();
                                                            } else {
                                                                livingEntity7 = null;
                                                            }
                                                            if (livingEntity7 != null) {
                                                                LivingEntity livingEntity18;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt9 = (Mob)entity;
                                                                    livingEntity18 = _mobEnt9.m_5448_();
                                                                } else {
                                                                    livingEntity18 = null;
                                                                }
                                                                f7 = entity.m_20270_(livingEntity18);
                                                            } else {
                                                                f7 = -1.0f;
                                                            }
                                                            if (f7 > 8.0f) {
                                                                float f16;
                                                                LivingEntity livingEntity19;
                                                                LivingEntity livingEntity20;
                                                                float f17;
                                                                LivingEntity livingEntity21;
                                                                LivingEntity livingEntity22;
                                                                float f18;
                                                                LivingEntity livingEntity23;
                                                                LivingEntity livingEntity24;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt5 = (Mob)entity;
                                                                    livingEntity24 = _mobEnt5.m_5448_();
                                                                } else {
                                                                    livingEntity24 = null;
                                                                }
                                                                double d = livingEntity24.m_20185_() - entity.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity23 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity23 = null;
                                                                }
                                                                if (livingEntity23 != null) {
                                                                    LivingEntity livingEntity25;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt10 = (Mob)entity;
                                                                        livingEntity25 = _mobEnt10.m_5448_();
                                                                    } else {
                                                                        livingEntity25 = null;
                                                                    }
                                                                    f18 = entity.m_20270_(livingEntity25);
                                                                } else {
                                                                    f18 = -1.0f;
                                                                }
                                                                double d4 = d / (double)f18 * 0.8;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt5 = (Mob)entity;
                                                                    livingEntity22 = _mobEnt5.m_5448_();
                                                                } else {
                                                                    livingEntity22 = null;
                                                                }
                                                                double d5 = livingEntity22.m_20186_() - entity.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity21 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity21 = null;
                                                                }
                                                                if (livingEntity21 != null) {
                                                                    LivingEntity livingEntity26;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt11 = (Mob)entity;
                                                                        livingEntity26 = _mobEnt11.m_5448_();
                                                                    } else {
                                                                        livingEntity26 = null;
                                                                    }
                                                                    f17 = entity.m_20270_(livingEntity26);
                                                                } else {
                                                                    f17 = -1.0f;
                                                                }
                                                                double d6 = d5 / (double)f17 * 0.8;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt5 = (Mob)entity;
                                                                    livingEntity20 = _mobEnt5.m_5448_();
                                                                } else {
                                                                    livingEntity20 = null;
                                                                }
                                                                double d7 = livingEntity20.m_20189_() - entity.m_20189_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity19 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity19 = null;
                                                                }
                                                                if (livingEntity19 != null) {
                                                                    LivingEntity livingEntity27;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt12 = (Mob)entity;
                                                                        livingEntity27 = _mobEnt12.m_5448_();
                                                                    } else {
                                                                        livingEntity27 = null;
                                                                    }
                                                                    f16 = entity.m_20270_(livingEntity27);
                                                                } else {
                                                                    f16 = -1.0f;
                                                                }
                                                                entity.m_20256_(new Vec3(d4, d6, d7 / (double)f16 * 0.8));
                                                            }
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity6 = mob.m_5448_();
                                                            } else {
                                                                livingEntity6 = null;
                                                            }
                                                            if (livingEntity6 != null) {
                                                                LivingEntity livingEntity28;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt13 = (Mob)entity;
                                                                    livingEntity28 = _mobEnt13.m_5448_();
                                                                } else {
                                                                    livingEntity28 = null;
                                                                }
                                                                f6 = entity.m_20270_(livingEntity28);
                                                            } else {
                                                                f6 = -1.0f;
                                                            }
                                                            if (!(f6 < 12.0f)) break block648;
                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) break block651;
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt14 = (Mob)entity;
                                                                livingEntity5 = _mobEnt14.m_5448_();
                                                            } else {
                                                                livingEntity5 = null;
                                                            }
                                                            if (livingEntity5 != null) {
                                                                LivingEntity livingEntity29;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity29 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity29 = null;
                                                                }
                                                                f5 = entity.m_20270_(livingEntity29);
                                                            } else {
                                                                f5 = -1.0f;
                                                            }
                                                            if (!(f5 <= 8.0f)) break block648;
                                                        }
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            StarlightskeletonEntity _datEntI6 = (StarlightskeletonEntity)entity;
                                                            n21 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                        } else {
                                                            n21 = 0;
                                                        }
                                                        if (n21 == 0) {
                                                            StarlightskeletonEntity _datEntSetI;
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntSetI = (StarlightskeletonEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntSetI = (StarlightskeletonEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                                            }
                                                        }
                                                        break block648;
                                                    }
                                                    if (entity.m_20186_() < -63.0) {
                                                        entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                    }
                                                    break block648;
                                                }
                                                if (entity.m_20186_() < -63.0) {
                                                    entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                }
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                n20 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                            } else {
                                                n20 = 0;
                                            }
                                            if (n20 == 1) {
                                                int n54;
                                                int n55;
                                                int n56;
                                                int n57;
                                                float f19;
                                                LivingEntity livingEntity30;
                                                float f20;
                                                LivingEntity livingEntity31;
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity31 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity31 = null;
                                                }
                                                if (livingEntity31 != null) {
                                                    LivingEntity livingEntity32;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt15 = (Mob)entity;
                                                        livingEntity32 = _mobEnt15.m_5448_();
                                                    } else {
                                                        livingEntity32 = null;
                                                    }
                                                    f20 = entity.m_20270_(livingEntity32);
                                                } else {
                                                    f20 = -1.0f;
                                                }
                                                if (f20 > 1.0f) {
                                                    LivingEntity livingEntity33;
                                                    LivingEntity livingEntity34;
                                                    LivingEntity livingEntity35;
                                                    LivingEntity livingEntity36;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        v89 = _mobEnt.m_5448_();
                                                    } else {
                                                        v89 = _ent = null;
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity36 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity36 = null;
                                                    }
                                                    double d = livingEntity36.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity35 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity35 = null;
                                                    }
                                                    int n58 = (int)livingEntity35.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity34 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity34 = null;
                                                    }
                                                    double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n58, (int)livingEntity34.m_20189_());
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity33 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity33 = null;
                                                    }
                                                    _ent.m_6021_(d, d8, livingEntity33.m_20189_());
                                                    if (_ent instanceof ServerPlayer) {
                                                        LivingEntity livingEntity37;
                                                        LivingEntity livingEntity38;
                                                        LivingEntity livingEntity39;
                                                        LivingEntity livingEntity40;
                                                        _serverPlayer = (ServerPlayer)_ent;
                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                                        if (entity instanceof Mob) {
                                                            Mob mob = (Mob)entity;
                                                            livingEntity40 = mob.m_5448_();
                                                        } else {
                                                            livingEntity40 = null;
                                                        }
                                                        double d9 = livingEntity40.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt16 = (Mob)entity;
                                                            livingEntity39 = _mobEnt16.m_5448_();
                                                        } else {
                                                            livingEntity39 = null;
                                                        }
                                                        int n59 = (int)livingEntity39.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt17 = (Mob)entity;
                                                            livingEntity38 = _mobEnt17.m_5448_();
                                                        } else {
                                                            livingEntity38 = null;
                                                        }
                                                        double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n59, (int)livingEntity38.m_20189_());
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity37 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity37 = null;
                                                        }
                                                        serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity37.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                    }
                                                }
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity30 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity30 = null;
                                                }
                                                if (livingEntity30 != null) {
                                                    LivingEntity livingEntity41;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt18 = (Mob)entity;
                                                        livingEntity41 = _mobEnt18.m_5448_();
                                                    } else {
                                                        livingEntity41 = null;
                                                    }
                                                    f19 = entity.m_20270_(livingEntity41);
                                                } else {
                                                    f19 = -1.0f;
                                                }
                                                if ((double)f19 > 0.1) {
                                                    LivingEntity livingEntity42;
                                                    LivingEntity livingEntity43;
                                                    LivingEntity livingEntity44;
                                                    LivingEntity livingEntity45;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity45 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity45 = null;
                                                    }
                                                    double d = livingEntity45.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity44 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    double d11 = livingEntity44.m_20186_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity43 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity43 = null;
                                                    }
                                                    double d12 = d11 + (double)livingEntity43.m_20206_() / 1.5;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity42 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity42 = null;
                                                    }
                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d12, livingEntity42.m_20189_()));
                                                }
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                    n57 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n57 = 0;
                                                }
                                                if (n57 == 24) {
                                                    float f21;
                                                    LivingEntity livingEntity46;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt19 = (Mob)entity;
                                                        livingEntity46 = _mobEnt19.m_5448_();
                                                    } else {
                                                        livingEntity46 = null;
                                                    }
                                                    if (livingEntity46 != null) {
                                                        LivingEntity livingEntity47;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity47 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity47 = null;
                                                        }
                                                        f21 = entity.m_20270_(livingEntity47);
                                                    } else {
                                                        f21 = -1.0f;
                                                    }
                                                    if (f21 > 1.0f) {
                                                        LivingEntity livingEntity48;
                                                        LivingEntity livingEntity49;
                                                        LivingEntity livingEntity50;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt = (Mob)entity;
                                                            livingEntity50 = _mobEnt.m_5448_();
                                                        } else {
                                                            livingEntity50 = null;
                                                        }
                                                        double d = (livingEntity50.m_20185_() - entity.m_20185_()) * 2.0;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt = (Mob)entity;
                                                            livingEntity49 = _mobEnt.m_5448_();
                                                        } else {
                                                            livingEntity49 = null;
                                                        }
                                                        double d13 = (livingEntity49.m_20186_() - entity.m_20186_()) * 2.0;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt = (Mob)entity;
                                                            livingEntity48 = _mobEnt.m_5448_();
                                                        } else {
                                                            livingEntity48 = null;
                                                        }
                                                        entity.m_20256_(new Vec3(d, d13, (livingEntity48.m_20189_() - entity.m_20189_()) * 2.0));
                                                    }
                                                }
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                    n56 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n56 = 0;
                                                }
                                                if (n56 == 26) {
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
                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                    for (Entity entity7 : _entfound) {
                                                        float f22;
                                                        if (entity7 instanceof StarlightskeletonEntity) continue;
                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity7 instanceof LivingEntity) {
                                                            LivingEntity _livEnt = (LivingEntity)entity7;
                                                            f22 = _livEnt.m_21233_();
                                                        } else {
                                                            f22 = -1.0f;
                                                        }
                                                        entity7.m_6469_(damageSource, f22 / 4.0f + 10.0f);
                                                    }
                                                    if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                        ServerLevel _level5 = (ServerLevel)world;
                                                        _level5.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level5, 4, "", (Component)Component.m_237113_((String)""), _level5.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                    }
                                                    for (int index8 = 0; index8 < 200; ++index8) {
                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                                                    }
                                                }
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                    n55 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n55 = 0;
                                                }
                                                if (n55 == 45) {
                                                    if (entity instanceof StarlightskeletonEntity) {
                                                        int n60;
                                                        StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            _datEntI = (StarlightskeletonEntity)entity;
                                                            n60 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                                        } else {
                                                            n60 = 0;
                                                        }
                                                        synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n60 + 1));
                                                    }
                                                    if (entity instanceof StarlightskeletonEntity) {
                                                        int n61;
                                                        StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            _datEntI = (StarlightskeletonEntity)entity;
                                                            n61 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                                        } else {
                                                            n61 = 0;
                                                        }
                                                        synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n61 + 1));
                                                    }
                                                }
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                    n54 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n54 = 0;
                                                }
                                                if (n54 >= 45) {
                                                    if (entity instanceof StarlightskeletonEntity) {
                                                        StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                    }
                                                    if (entity instanceof StarlightskeletonEntity) {
                                                        StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                                    }
                                                }
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                n19 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                            } else {
                                                n19 = 0;
                                            }
                                            if (n19 != 2) break block652;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity4 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity4 = null;
                                            }
                                            if (livingEntity4 != null) {
                                                LivingEntity livingEntity51;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt20 = (Mob)entity;
                                                    livingEntity51 = _mobEnt20.m_5448_();
                                                } else {
                                                    livingEntity51 = null;
                                                }
                                                f4 = entity.m_20270_(livingEntity51);
                                            } else {
                                                f4 = -1.0f;
                                            }
                                            if (f4 > 1.0f) {
                                                LivingEntity livingEntity52;
                                                LivingEntity livingEntity53;
                                                LivingEntity livingEntity54;
                                                LivingEntity livingEntity55;
                                                LivingEntity livingEntity56;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    v137 = _mobEnt.m_5448_();
                                                } else {
                                                    v137 = _ent = null;
                                                }
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity56 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity56 = null;
                                                }
                                                double d = livingEntity56.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity55 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity55 = null;
                                                }
                                                int n62 = (int)livingEntity55.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity54 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity54 = null;
                                                }
                                                double d14 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n62, (int)livingEntity54.m_20189_());
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity53 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity53 = null;
                                                }
                                                _ent.m_6021_(d, d14, livingEntity53.m_20189_());
                                                if (_ent instanceof ServerPlayer) {
                                                    LivingEntity livingEntity57;
                                                    LivingEntity livingEntity58;
                                                    LivingEntity livingEntity59;
                                                    LivingEntity livingEntity60;
                                                    _serverPlayer = (ServerPlayer)_ent;
                                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                                    if (entity instanceof Mob) {
                                                        Mob mob = (Mob)entity;
                                                        livingEntity60 = mob.m_5448_();
                                                    } else {
                                                        livingEntity60 = null;
                                                    }
                                                    double d15 = livingEntity60.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt21 = (Mob)entity;
                                                        livingEntity59 = _mobEnt21.m_5448_();
                                                    } else {
                                                        livingEntity59 = null;
                                                    }
                                                    int n63 = (int)livingEntity59.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt22 = (Mob)entity;
                                                        livingEntity58 = _mobEnt22.m_5448_();
                                                    } else {
                                                        livingEntity58 = null;
                                                    }
                                                    double d16 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n63, (int)livingEntity58.m_20189_());
                                                    if (entity instanceof Mob) {
                                                        _mobEnt3 = (Mob)entity;
                                                        livingEntity57 = _mobEnt3.m_5448_();
                                                    } else {
                                                        livingEntity57 = null;
                                                    }
                                                    serverGamePacketListenerImpl.m_9774_(d15, d16, livingEntity57.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                }
                                                if (entity instanceof Mob) {
                                                    _mobEnt4 = (Mob)entity;
                                                    livingEntity52 = _mobEnt4.m_5448_();
                                                } else {
                                                    livingEntity52 = null;
                                                }
                                                livingEntity52.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity3 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity3 = null;
                                            }
                                            if (livingEntity3 != null) {
                                                LivingEntity livingEntity61;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt23 = (Mob)entity;
                                                    livingEntity61 = _mobEnt23.m_5448_();
                                                } else {
                                                    livingEntity61 = null;
                                                }
                                                f3 = entity.m_20270_(livingEntity61);
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (f3 > 1.0f) {
                                                LivingEntity livingEntity62;
                                                LivingEntity livingEntity63;
                                                LivingEntity livingEntity64;
                                                LivingEntity livingEntity65;
                                                if (entity instanceof Mob) {
                                                    _mobEnt4 = (Mob)entity;
                                                    livingEntity65 = _mobEnt4.m_5448_();
                                                } else {
                                                    livingEntity65 = null;
                                                }
                                                double d = livingEntity65.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity64 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity64 = null;
                                                }
                                                double d17 = livingEntity64.m_20186_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt4 = (Mob)entity;
                                                    livingEntity63 = _mobEnt4.m_5448_();
                                                } else {
                                                    livingEntity63 = null;
                                                }
                                                double d18 = d17 + (double)livingEntity63.m_20206_() / 1.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt4 = (Mob)entity;
                                                    livingEntity62 = _mobEnt4.m_5448_();
                                                } else {
                                                    livingEntity62 = null;
                                                }
                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity62.m_20189_()));
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                n18 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                            } else {
                                                n18 = 0;
                                            }
                                            if (n18 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                ServerLevel _level6 = (ServerLevel)world;
                                                _level6.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level6, 4, "", (Component)Component.m_237113_((String)""), _level6.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                n17 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                            } else {
                                                n17 = 0;
                                            }
                                            if (n17 == 15) break block653;
                                            if (entity instanceof StarlightskeletonEntity) {
                                                StarlightskeletonEntity _datEntI7 = (StarlightskeletonEntity)entity;
                                                n16 = (Integer)_datEntI7.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                            } else {
                                                n16 = 0;
                                            }
                                            if (n16 != 62) break block654;
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
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI2 = (StarlightskeletonEntity)entity;
                                        n15 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n15 = 0;
                                    }
                                    if (n15 == 17) break block655;
                                    if (entity instanceof StarlightskeletonEntity) {
                                        StarlightskeletonEntity _datEntI8 = (StarlightskeletonEntity)entity;
                                        n14 = (Integer)_datEntI8.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n14 = 0;
                                    }
                                    if (n14 != 64) break block656;
                                }
                                _center = new Vec3(x, y, z);
                                _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                for (Entity entityiterator : _entfound2) {
                                    float f23;
                                    if (entityiterator instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt = (LivingEntity)entityiterator;
                                        f23 = _livEnt.m_21233_();
                                    } else {
                                        f23 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource, f23 / 4.0f + 1000.0f);
                                    if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                    if (world instanceof Level) {
                                        Level _level7 = (Level)world;
                                        if (!_level7.m_5776_()) {
                                            _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                        } else {
                                            _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                        }
                                    }
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n13 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n13 = 0;
                            }
                            if (n13 == 37) {
                                LivingEntity _entity;
                                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                }
                                if (world instanceof Level) {
                                    Level _level8 = (Level)world;
                                    if (!_level8.m_5776_()) {
                                        _level8.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level8.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                if (world instanceof Level) {
                                    Level _level9 = (Level)world;
                                    if (!_level9.m_5776_()) {
                                        _level9.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level9.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
                                for (int index9 = 0; index9 < 16; ++index9) {
                                    if (!(world instanceof ServerLevel)) continue;
                                    _level = (ServerLevel)world;
                                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                    if (entityToSpawn == null) continue;
                                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                }
                                Vec3 _center4 = new Vec3(x, y, z);
                                _entfound = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                                for (Entity entity8 : _entfound) {
                                    float f24;
                                    if (entity8 instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entity8 instanceof LivingEntity) {
                                        LivingEntity _livEnt = (LivingEntity)entity8;
                                        f24 = _livEnt.m_21233_();
                                    } else {
                                        f24 = -1.0f;
                                    }
                                    entity8.m_6469_(damageSource, f24 / 4.0f + 1000.0f);
                                    double _setval = 6.0;
                                    entity8.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                        capability.camerashake = _setval;
                                        capability.syncPlayerVariables(entity8);
                                    });
                                    if (entity8 instanceof Player || entity8 instanceof LightningBolt || entity8 instanceof OriginallightningEntity) continue;
                                    entity8.m_142687_(Entity.RemovalReason.KILLED);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n12 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n12 = 0;
                            }
                            if (n12 == 82) {
                                if (entity instanceof StarlightskeletonEntity) {
                                    int n64;
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI = (StarlightskeletonEntity)entity;
                                        n64 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                    } else {
                                        n64 = 0;
                                    }
                                    synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n64 + 3));
                                }
                                if (entity instanceof StarlightskeletonEntity) {
                                    int n65;
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI = (StarlightskeletonEntity)entity;
                                        n65 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                    } else {
                                        n65 = 0;
                                    }
                                    synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n65 + 2));
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n11 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n11 = 0;
                            }
                            if (n11 >= 82) {
                                if (entity instanceof StarlightskeletonEntity) {
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof StarlightskeletonEntity) {
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                }
                            }
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI3 = (StarlightskeletonEntity)entity;
                            n10 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                        } else {
                            n10 = 0;
                        }
                        if (n10 == 3) {
                            int n66;
                            int n67;
                            int n68;
                            int n69;
                            int n70;
                            int n71;
                            float f25;
                            LivingEntity livingEntity66;
                            float f26;
                            LivingEntity livingEntity67;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity67 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity67 = null;
                            }
                            if (livingEntity67 != null) {
                                LivingEntity livingEntity68;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt24 = (Mob)entity;
                                    livingEntity68 = _mobEnt24.m_5448_();
                                } else {
                                    livingEntity68 = null;
                                }
                                f26 = entity.m_20270_(livingEntity68);
                            } else {
                                f26 = -1.0f;
                            }
                            if (f26 > 1.0f) {
                                LivingEntity livingEntity69;
                                LivingEntity livingEntity70;
                                LivingEntity livingEntity71;
                                LivingEntity livingEntity72;
                                LivingEntity livingEntity73;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    v184 = _mobEnt.m_5448_();
                                } else {
                                    v184 = _ent = null;
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity73 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity73 = null;
                                }
                                double d = livingEntity73.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity72 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity72 = null;
                                }
                                int n72 = (int)livingEntity72.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity71 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity71 = null;
                                }
                                double d19 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n72, (int)livingEntity71.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity70 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity70 = null;
                                }
                                _ent.m_6021_(d, d19, livingEntity70.m_20189_());
                                if (_ent instanceof ServerPlayer) {
                                    LivingEntity livingEntity74;
                                    LivingEntity livingEntity75;
                                    LivingEntity livingEntity76;
                                    LivingEntity livingEntity77;
                                    _serverPlayer = (ServerPlayer)_ent;
                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity77 = mob.m_5448_();
                                    } else {
                                        livingEntity77 = null;
                                    }
                                    double d20 = livingEntity77.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt25 = (Mob)entity;
                                        livingEntity76 = _mobEnt25.m_5448_();
                                    } else {
                                        livingEntity76 = null;
                                    }
                                    int n73 = (int)livingEntity76.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt26 = (Mob)entity;
                                        livingEntity75 = _mobEnt26.m_5448_();
                                    } else {
                                        livingEntity75 = null;
                                    }
                                    double d21 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n73, (int)livingEntity75.m_20189_());
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity74 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity74 = null;
                                    }
                                    serverGamePacketListenerImpl.m_9774_(d20, d21, livingEntity74.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity69 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity69 = null;
                                }
                                livingEntity69.m_20256_(new Vec3(0.0, 0.0, 0.0));
                            }
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity66 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity66 = null;
                            }
                            if (livingEntity66 != null) {
                                LivingEntity livingEntity78;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt27 = (Mob)entity;
                                    livingEntity78 = _mobEnt27.m_5448_();
                                } else {
                                    livingEntity78 = null;
                                }
                                f25 = entity.m_20270_(livingEntity78);
                            } else {
                                f25 = -1.0f;
                            }
                            if (f25 > 1.0f) {
                                LivingEntity livingEntity79;
                                LivingEntity livingEntity80;
                                LivingEntity livingEntity81;
                                LivingEntity livingEntity82;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity82 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity82 = null;
                                }
                                double d = livingEntity82.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity81 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity81 = null;
                                }
                                double d22 = livingEntity81.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity80 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity80 = null;
                                }
                                double d23 = d22 + (double)livingEntity80.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity79 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity79 = null;
                                }
                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d23, livingEntity79.m_20189_()));
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n71 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n71 = 0;
                            }
                            if (n71 == 17 && world instanceof Level) {
                                Level _level10 = (Level)world;
                                if (!_level10.m_5776_()) {
                                    _level10.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level10.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n70 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n70 = 0;
                            }
                            if (n70 == 22) {
                                if (world instanceof Level) {
                                    Level _level11 = (Level)world;
                                    if (!_level11.m_5776_()) {
                                        _level11.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level11.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                Vec3 _center5 = new Vec3(x, y, z);
                                _entfound = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                                for (Entity entity9 : _entfound) {
                                    float f27;
                                    if (entity9 instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entity9 instanceof LivingEntity) {
                                        LivingEntity _livEnt = (LivingEntity)entity9;
                                        f27 = _livEnt.m_21233_();
                                    } else {
                                        f27 = -1.0f;
                                    }
                                    entity9.m_6469_(damageSource, f27 / 4.0f + 0.0f);
                                    if (entity9 instanceof Player) continue;
                                    entity9.f_19802_ = 0;
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n69 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n69 = 0;
                            }
                            if (n69 == 47 && world instanceof Level) {
                                Level _level12 = (Level)world;
                                if (!_level12.m_5776_()) {
                                    _level12.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level12.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n68 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n68 = 0;
                            }
                            if (n68 >= 52) {
                                int n74;
                                if (entity instanceof StarlightskeletonEntity) {
                                    StarlightskeletonEntity _datEntI9 = (StarlightskeletonEntity)entity;
                                    n74 = (Integer)_datEntI9.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                } else {
                                    n74 = 0;
                                }
                                if (n74 <= 66) {
                                    _center = new Vec3(x, y, z);
                                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    for (Entity entityiterator : _entfound2) {
                                        float f28;
                                        if (entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof GalaxyEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            LivingEntity _livEnt = (LivingEntity)entityiterator;
                                            f28 = _livEnt.m_21233_();
                                        } else {
                                            f28 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f28 / 4.0f + 1000.0f);
                                        if (entityiterator instanceof Player) continue;
                                        CompoundTag nbt = entityiterator.m_20240_(new CompoundTag());
                                        nbt.m_128350_("Health", 0.0f);
                                        nbt.m_128405_("Health", 0);
                                    }
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n67 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n67 = 0;
                            }
                            if (n67 == 67) {
                                if (entity instanceof StarlightskeletonEntity) {
                                    int n75;
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI = (StarlightskeletonEntity)entity;
                                        n75 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                    } else {
                                        n75 = 0;
                                    }
                                    synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n75 + 2));
                                }
                                if (entity instanceof StarlightskeletonEntity) {
                                    int n76;
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI = (StarlightskeletonEntity)entity;
                                        n76 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                    } else {
                                        n76 = 0;
                                    }
                                    synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n76 + 1));
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n66 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n66 = 0;
                            }
                            if (n66 >= 67) {
                                if (entity instanceof StarlightskeletonEntity) {
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof StarlightskeletonEntity) {
                                    StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                }
                            }
                        }
                        if (!(entity instanceof StarlightskeletonEntity)) return;
                        _datEntI3 = (StarlightskeletonEntity)entity;
                        int n77 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                        if (n77 != 4) return;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity2 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity2 = null;
                        }
                        if (livingEntity2 != null) {
                            LivingEntity livingEntity83;
                            if (entity instanceof Mob) {
                                Mob _mobEnt28 = (Mob)entity;
                                livingEntity83 = _mobEnt28.m_5448_();
                            } else {
                                livingEntity83 = null;
                            }
                            f2 = entity.m_20270_(livingEntity83);
                        } else {
                            f2 = -1.0f;
                        }
                        if (f2 > 1.0f) {
                            LivingEntity livingEntity84;
                            LivingEntity livingEntity85;
                            LivingEntity livingEntity86;
                            LivingEntity livingEntity87;
                            LivingEntity livingEntity88;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v230 = _mobEnt.m_5448_();
                            } else {
                                v230 = _ent = null;
                            }
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity88 = _mobEnt.m_5448_();
                            } else {
                                livingEntity88 = null;
                            }
                            double d = livingEntity88.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity87 = _mobEnt.m_5448_();
                            } else {
                                livingEntity87 = null;
                            }
                            int n78 = (int)livingEntity87.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity86 = _mobEnt.m_5448_();
                            } else {
                                livingEntity86 = null;
                            }
                            double d24 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n78, (int)livingEntity86.m_20189_());
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity85 = _mobEnt.m_5448_();
                            } else {
                                livingEntity85 = null;
                            }
                            _ent.m_6021_(d, d24, livingEntity85.m_20189_());
                            if (_ent instanceof ServerPlayer) {
                                LivingEntity livingEntity89;
                                LivingEntity livingEntity90;
                                LivingEntity livingEntity91;
                                LivingEntity livingEntity92;
                                _serverPlayer = (ServerPlayer)_ent;
                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity92 = mob.m_5448_();
                                } else {
                                    livingEntity92 = null;
                                }
                                double d25 = livingEntity92.m_20185_();
                                if (entity instanceof Mob) {
                                    Mob _mobEnt29 = (Mob)entity;
                                    livingEntity91 = _mobEnt29.m_5448_();
                                } else {
                                    livingEntity91 = null;
                                }
                                int n79 = (int)livingEntity91.m_20185_();
                                if (entity instanceof Mob) {
                                    Mob _mobEnt30 = (Mob)entity;
                                    livingEntity90 = _mobEnt30.m_5448_();
                                } else {
                                    livingEntity90 = null;
                                }
                                double d26 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n79, (int)livingEntity90.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity89 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity89 = null;
                                }
                                serverGamePacketListenerImpl.m_9774_(d25, d26, livingEntity89.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                            }
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity84 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity84 = null;
                            }
                            livingEntity84.m_20256_(new Vec3(0.0, 0.0, 0.0));
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity = _mobEnt2.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity93;
                            if (entity instanceof Mob) {
                                Mob _mobEnt31 = (Mob)entity;
                                livingEntity93 = _mobEnt31.m_5448_();
                            } else {
                                livingEntity93 = null;
                            }
                            f = entity.m_20270_(livingEntity93);
                        } else {
                            f = -1.0f;
                        }
                        if (f > 1.0f) {
                            LivingEntity livingEntity94;
                            LivingEntity livingEntity95;
                            LivingEntity livingEntity96;
                            LivingEntity livingEntity97;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity97 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity97 = null;
                            }
                            double d = livingEntity97.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity96 = _mobEnt.m_5448_();
                            } else {
                                livingEntity96 = null;
                            }
                            double d27 = livingEntity96.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity95 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity95 = null;
                            }
                            double d28 = d27 + (double)livingEntity95.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity94 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity94 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity94.m_20189_()));
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI2 = (StarlightskeletonEntity)entity;
                            n9 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n9 = 0;
                        }
                        if (n9 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                            ServerLevel _level13 = (ServerLevel)world;
                            _level13.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level13, 4, "", (Component)Component.m_237113_((String)""), _level13.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI2 = (StarlightskeletonEntity)entity;
                            n8 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n8 = 0;
                        }
                        if (n8 == 18) {
                            if (world instanceof Level) {
                                Level _level14 = (Level)world;
                                if (!_level14.m_5776_()) {
                                    _level14.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level14.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                            Vec3 _center6 = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                            for (Entity entity10 : _entfound) {
                                float f29;
                                if (entity10 instanceof StarlightskeletonEntity) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity10 instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entity10;
                                    f29 = _livEnt.m_21233_();
                                } else {
                                    f29 = -1.0f;
                                }
                                entity10.m_6469_(damageSource, f29 / 4.0f + 1.0f);
                            }
                            for (int index10 = 0; index10 < 200; ++index10) {
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.5, (double)1.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                            }
                            for (int index11 = 0; index11 < 400; ++index11) {
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                            }
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI2 = (StarlightskeletonEntity)entity;
                            n7 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n7 = 0;
                        }
                        if (n7 == 40) {
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ZHAN.get()), x, y + 8.0, z, 0.0, 0.0, 0.0);
                            if (world instanceof Level) {
                                Level _level15 = (Level)world;
                                if (!_level15.m_5776_()) {
                                    _level15.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level15.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.BLADERUSH.get()), x + entity.m_20154_().f_82479_ * 2.0, y + 3.0, z + entity.m_20154_().f_82481_ * 2.0, 0.0, 0.0, 0.0);
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI2 = (StarlightskeletonEntity)entity;
                            n6 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n6 = 0;
                        }
                        if (n6 == 61) break block657;
                        if (entity instanceof StarlightskeletonEntity) {
                            StarlightskeletonEntity _datEntI10 = (StarlightskeletonEntity)entity;
                            n5 = (Integer)_datEntI10.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n5 = 0;
                        }
                        if (n5 != 67) break block658;
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
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI2 = (StarlightskeletonEntity)entity;
                    n4 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n4 = 0;
                }
                if (n4 == 63) break block659;
                if (entity instanceof StarlightskeletonEntity) {
                    StarlightskeletonEntity _datEntI11 = (StarlightskeletonEntity)entity;
                    n3 = (Integer)_datEntI11.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n3 = 0;
                }
                if (n3 != 69) break block660;
            }
            if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            _center = new Vec3(x, y, z);
            _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound2) {
                float f;
                if (entityiterator instanceof StarlightskeletonEntity) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f / 4.0f + 1000.0f);
                double _setval = 3.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (entityiterator instanceof Player || entityiterator instanceof OriginallightningEntity || !(entityiterator instanceof LivingEntity)) continue;
                if (world instanceof Level) {
                    Level _level16 = (Level)world;
                    if (!_level16.m_5776_()) {
                        _level16.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                    } else {
                        _level16.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n2 = 0;
        }
        if (n2 == 90) {
            int n80;
            LivingEntity _entity;
            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
            }
            if (world instanceof Level) {
                Level _level17 = (Level)world;
                if (!_level17.m_5776_()) {
                    _level17.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level17.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (world instanceof Level) {
                Level _level18 = (Level)world;
                if (!_level18.m_5776_()) {
                    _level18.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level18.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
            for (int index12 = 0; index12 < 16; ++index12) {
                if (!(world instanceof ServerLevel)) continue;
                _level = (ServerLevel)world;
                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn == null) continue;
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
            if (entity instanceof StarlightskeletonEntity) {
                StarlightskeletonEntity _datEntI12 = (StarlightskeletonEntity)entity;
                n80 = (Integer)_datEntI12.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
            } else {
                n80 = 0;
            }
            if (n80 >= 6 && entity instanceof Mob) {
                Mob _entity4 = (Mob)entity;
                _entity4.m_6710_(null);
            }
            Vec3 _center = new Vec3(x, y, z);
            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entity11 : _entfound) {
                int n81;
                float f;
                if (entity11 instanceof StarlightskeletonEntity) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                if (entity11 instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity11;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                entity11.m_6469_(damageSource, f / 4.0f + 1000.0f);
                double _setval = 6.0;
                entity11.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entity11);
                });
                if (entity11 instanceof Player || entity11 instanceof LightningBolt || entity11 instanceof OriginallightningEntity) continue;
                entity11.m_142687_(Entity.RemovalReason.KILLED);
                if (entity11 instanceof Titangodentity) continue;
                if (entity instanceof StarlightskeletonEntity) {
                    StarlightskeletonEntity _datEntI13 = (StarlightskeletonEntity)entity;
                    n81 = (Integer)_datEntI13.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                } else {
                    n81 = 0;
                }
                if (n81 < 8) continue;
                Deathlist.normalattack(entity11);
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n = 0;
        }
        if (n == 107) {
            if (entity instanceof StarlightskeletonEntity) {
                int n82;
                StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI = (StarlightskeletonEntity)entity;
                    n82 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                } else {
                    n82 = 0;
                }
                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n82 + 3));
            }
            if (entity instanceof StarlightskeletonEntity) {
                int n83;
                StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI = (StarlightskeletonEntity)entity;
                    n83 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                } else {
                    n83 = 0;
                }
                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n83 + 2));
            }
        }
        if (!(entity instanceof StarlightskeletonEntity)) return;
        _datEntI2 = (StarlightskeletonEntity)entity;
        int n84 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        if (n84 < 107) return;
        if (entity instanceof StarlightskeletonEntity) {
            StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
        }
        if (!(entity instanceof StarlightskeletonEntity)) return;
        StarlightskeletonEntity _datEntSetI = (StarlightskeletonEntity)entity;
        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
    }
}

