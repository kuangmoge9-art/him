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

public class StarlightskeletonATKProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        StarlightskeletonEntity _datEntI;
        StarlightskeletonEntity _datEntSetI;
        StarlightskeletonEntity _datEntI2;
        block507: {
            LivingEntity _livEnt;
            List<Entity> _entfound;
            Vec3 _center;
            Level _level;
            block506: {
                int n2;
                int n3;
                StarlightskeletonEntity _datEntI3;
                block505: {
                    block504: {
                        int n4;
                        int n5;
                        int n6;
                        int n7;
                        float f;
                        LivingEntity livingEntity;
                        float f2;
                        LivingEntity livingEntity2;
                        int n8;
                        int n9;
                        Mob _mobEnt;
                        ServerPlayer _serverPlayer;
                        LivingEntity _ent;
                        Mob _mobEnt2;
                        Mob _mobEnt3;
                        Object _mobEnt4;
                        Object _mobEnt5;
                        Mob _mobEnt6;
                        Mob _mobEnt7;
                        List<Entity> _entfound2;
                        Vec3 _center2;
                        Level _level2;
                        StarlightskeletonEntity _datEntI4;
                        block499: {
                            int n10;
                            int n11;
                            int n12;
                            block503: {
                                block502: {
                                    int n13;
                                    int n14;
                                    block501: {
                                        block500: {
                                            int n15;
                                            int n16;
                                            int n17;
                                            float f3;
                                            LivingEntity livingEntity3;
                                            float f4;
                                            LivingEntity livingEntity4;
                                            int n18;
                                            block495: {
                                                block496: {
                                                    block497: {
                                                        int n19;
                                                        block498: {
                                                            float f5;
                                                            LivingEntity livingEntity5;
                                                            float f6;
                                                            LivingEntity livingEntity6;
                                                            float f7;
                                                            LivingEntity livingEntity7;
                                                            float f8;
                                                            LivingEntity livingEntity8;
                                                            float f9;
                                                            LivingEntity livingEntity9;
                                                            float f10;
                                                            LivingEntity livingEntity10;
                                                            int n20;
                                                            int n21;
                                                            Object object;
                                                            StarlightskeletonEntity _datEntSetI2;
                                                            block492: {
                                                                int n22;
                                                                block494: {
                                                                    block493: {
                                                                        int n23;
                                                                        int n24;
                                                                        int n25;
                                                                        double _setval;
                                                                        Entity entityiterator;
                                                                        int n26;
                                                                        int n27;
                                                                        int n28;
                                                                        int n29;
                                                                        LivingEntity _entity;
                                                                        if (entity == null) {
                                                                            return;
                                                                        }
                                                                        double theta = 0.0;
                                                                        ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                                        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 100, 3));
                                                                        }
                                                                        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19603_, 100, 4));
                                                                        }
                                                                        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 100, 5));
                                                                        }
                                                                        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 100, 10));
                                                                        }
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI4 = (StarlightskeletonEntity)entity;
                                                                            n29 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                        } else {
                                                                            n29 = 0;
                                                                        }
                                                                        if (n29 == 0) {
                                                                            if (entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarlightskeletonEntity) {
                                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)0);
                                                                            }
                                                                            if (entity.m_5446_().getString().equals("\u6da1\u6d41") && entity instanceof StarlightskeletonEntity) {
                                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)30);
                                                                            }
                                                                        }
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI4 = (StarlightskeletonEntity)entity;
                                                                            n28 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                                                        } else {
                                                                            n28 = 0;
                                                                        }
                                                                        if (n28 > 0) break block492;
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                            _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                                                        }
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                            _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                                        }
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            int n30;
                                                                            _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                            SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                                n30 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                            } else {
                                                                                n30 = 0;
                                                                            }
                                                                            synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_Tick, (Object)(n30 - 1));
                                                                        }
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                                                            n27 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                        } else {
                                                                            n27 = 0;
                                                                        }
                                                                        if (n27 >= 210) {
                                                                            int n31;
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                                n31 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                            } else {
                                                                                n31 = 0;
                                                                            }
                                                                            if (n31 <= 225 && entity instanceof StarlightskeletonEntity) {
                                                                                ((StarlightskeletonEntity)entity).setAnimation("animation.starlightskeleton.changeto2");
                                                                            }
                                                                        }
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                                                            n26 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                        } else {
                                                                            n26 = 0;
                                                                        }
                                                                        if (n26 == 185) {
                                                                            if (world instanceof Level) {
                                                                                _level2 = (Level)world;
                                                                                if (!_level2.m_5776_()) {
                                                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                                } else {
                                                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                                }
                                                                            }
                                                                            for (int index0 = 0; index0 < 300; ++index0) {
                                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 5.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0));
                                                                            }
                                                                            _center2 = new Vec3(x, y, z);
                                                                            _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                            object = _entfound2.iterator();
                                                                            while (object.hasNext()) {
                                                                                entityiterator = (Entity)object.next();
                                                                                if (entityiterator instanceof StarlightskeletonEntity) continue;
                                                                                _setval = 6.0;
                                                                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                    capability.camerashake = _setval;
                                                                                    capability.syncPlayerVariables(entityiterator);
                                                                                });
                                                                            }
                                                                        }
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                                                            n25 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                        } else {
                                                                            n25 = 0;
                                                                        }
                                                                        if (n25 == 165) {
                                                                            if (world instanceof Level) {
                                                                                _level2 = (Level)world;
                                                                                if (!_level2.m_5776_()) {
                                                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                                } else {
                                                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                                }
                                                                            }
                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                                                            _center2 = new Vec3(x, y, z);
                                                                            _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                            object = _entfound2.iterator();
                                                                            while (object.hasNext()) {
                                                                                entityiterator = (Entity)object.next();
                                                                                if (entityiterator instanceof StarlightskeletonEntity) continue;
                                                                                _setval = 6.0;
                                                                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                    capability.camerashake = _setval;
                                                                                    capability.syncPlayerVariables(entityiterator);
                                                                                });
                                                                            }
                                                                        }
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                                                            n24 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                        } else {
                                                                            n24 = 0;
                                                                        }
                                                                        if (n24 == 140) break block493;
                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                            _datEntI3 = (StarlightskeletonEntity)entity;
                                                                            n23 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                        } else {
                                                                            n23 = 0;
                                                                        }
                                                                        if (n23 != 150) break block494;
                                                                    }
                                                                    if (world instanceof Level) {
                                                                        _level = (Level)world;
                                                                        if (!_level.m_5776_()) {
                                                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                        } else {
                                                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                    n22 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_Tick);
                                                                } else {
                                                                    n22 = 0;
                                                                }
                                                                if (n22 < 108 && entity instanceof StarlightskeletonEntity) {
                                                                    ((StarlightskeletonEntity)entity).setAnimation("empty");
                                                                }
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI4 = (StarlightskeletonEntity)entity;
                                                                n21 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                            } else {
                                                                n21 = 0;
                                                            }
                                                            if (n21 != 0 && entity instanceof StarlightskeletonEntity) {
                                                                int n32;
                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI3 = (StarlightskeletonEntity)entity;
                                                                    n32 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n32 = 0;
                                                                }
                                                                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)(n32 + 1));
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI4 = (StarlightskeletonEntity)entity;
                                                                n20 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                                            } else {
                                                                n20 = 0;
                                                            }
                                                            if (n20 <= 0) break block495;
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_Tick, (Object)240);
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt7 = (Mob)entity;
                                                                livingEntity10 = _mobEnt7.m_5448_();
                                                            } else {
                                                                livingEntity10 = null;
                                                            }
                                                            if (livingEntity10 == null) break block496;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt6 = (Mob)entity;
                                                                v16 = _mobEnt6.m_5448_();
                                                            } else {
                                                                v16 = object = null;
                                                            }
                                                            if (object instanceof LivingEntity) {
                                                                LivingEntity _livEnt2 = object;
                                                                f10 = _livEnt2.m_21223_();
                                                            } else {
                                                                f10 = -1.0f;
                                                            }
                                                            if (!(f10 > 0.0f)) break block497;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity9 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity9 = null;
                                                            }
                                                            if (livingEntity9 != null) {
                                                                LivingEntity livingEntity11;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity11 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity11 = null;
                                                                }
                                                                f9 = entity.m_20270_(livingEntity11);
                                                            } else {
                                                                f9 = -1.0f;
                                                            }
                                                            if (f9 >= 20.0f) {
                                                                entity.m_6858_(true);
                                                            } else {
                                                                entity.m_6858_(false);
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity8 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity8 = null;
                                                            }
                                                            if (livingEntity8 != null) {
                                                                LivingEntity livingEntity12;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity12 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity12 = null;
                                                                }
                                                                f8 = entity.m_20270_(livingEntity12);
                                                            } else {
                                                                f8 = -1.0f;
                                                            }
                                                            if (f8 > 1.0f) {
                                                                int n33;
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    StarlightskeletonEntity _datEntI5 = (StarlightskeletonEntity)entity;
                                                                    n33 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                } else {
                                                                    n33 = 0;
                                                                }
                                                                if (n33 == 0) {
                                                                    LivingEntity livingEntity13;
                                                                    LivingEntity livingEntity14;
                                                                    LivingEntity livingEntity15;
                                                                    LivingEntity livingEntity16;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity16 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity16 = null;
                                                                    }
                                                                    double d = livingEntity16.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity15 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity15 = null;
                                                                    }
                                                                    double d2 = livingEntity15.m_20186_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity14 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity14 = null;
                                                                    }
                                                                    double d3 = d2 + (double)livingEntity14.m_20206_() / 1.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity13 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity13 = null;
                                                                    }
                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity13.m_20189_()));
                                                                }
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity7 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity7 = null;
                                                            }
                                                            if (livingEntity7 != null) {
                                                                LivingEntity livingEntity17;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity17 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity17 = null;
                                                                }
                                                                f7 = entity.m_20270_(livingEntity17);
                                                            } else {
                                                                f7 = -1.0f;
                                                            }
                                                            if (f7 > 8.0f) {
                                                                float f11;
                                                                LivingEntity livingEntity18;
                                                                LivingEntity livingEntity19;
                                                                float f12;
                                                                LivingEntity livingEntity20;
                                                                LivingEntity livingEntity21;
                                                                float f13;
                                                                LivingEntity livingEntity22;
                                                                LivingEntity livingEntity23;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity23 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity23 = null;
                                                                }
                                                                double d = livingEntity23.m_20185_() - entity.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity22 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity22 = null;
                                                                }
                                                                if (livingEntity22 != null) {
                                                                    LivingEntity livingEntity24;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt8 = (Mob)entity;
                                                                        livingEntity24 = _mobEnt8.m_5448_();
                                                                    } else {
                                                                        livingEntity24 = null;
                                                                    }
                                                                    f13 = entity.m_20270_(livingEntity24);
                                                                } else {
                                                                    f13 = -1.0f;
                                                                }
                                                                double d4 = d / (double)f13 * 0.8;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity21 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity21 = null;
                                                                }
                                                                double d5 = livingEntity21.m_20186_() - entity.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity20 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity20 = null;
                                                                }
                                                                if (livingEntity20 != null) {
                                                                    LivingEntity livingEntity25;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt9 = (Mob)entity;
                                                                        livingEntity25 = _mobEnt9.m_5448_();
                                                                    } else {
                                                                        livingEntity25 = null;
                                                                    }
                                                                    f12 = entity.m_20270_(livingEntity25);
                                                                } else {
                                                                    f12 = -1.0f;
                                                                }
                                                                double d6 = d5 / (double)f12 * 0.8;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity19 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity19 = null;
                                                                }
                                                                double d7 = livingEntity19.m_20189_() - entity.m_20189_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity18 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity18 = null;
                                                                }
                                                                if (livingEntity18 != null) {
                                                                    LivingEntity livingEntity26;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt10 = (Mob)entity;
                                                                        livingEntity26 = _mobEnt10.m_5448_();
                                                                    } else {
                                                                        livingEntity26 = null;
                                                                    }
                                                                    f11 = entity.m_20270_(livingEntity26);
                                                                } else {
                                                                    f11 = -1.0f;
                                                                }
                                                                entity.m_20256_(new Vec3(d4, d6, d7 / (double)f11 * 0.8));
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity6 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity6 = null;
                                                            }
                                                            if (livingEntity6 != null) {
                                                                LivingEntity livingEntity27;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity27 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity27 = null;
                                                                }
                                                                f6 = entity.m_20270_(livingEntity27);
                                                            } else {
                                                                f6 = -1.0f;
                                                            }
                                                            if (!(f6 < 12.0f)) break block495;
                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) break block498;
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt11 = (Mob)entity;
                                                                livingEntity5 = _mobEnt11.m_5448_();
                                                            } else {
                                                                livingEntity5 = null;
                                                            }
                                                            if (livingEntity5 != null) {
                                                                LivingEntity livingEntity28;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity28 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity28 = null;
                                                                }
                                                                f5 = entity.m_20270_(livingEntity28);
                                                            } else {
                                                                f5 = -1.0f;
                                                            }
                                                            if (!(f5 <= 8.0f)) break block495;
                                                        }
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            StarlightskeletonEntity _datEntI6 = (StarlightskeletonEntity)entity;
                                                            n19 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                        } else {
                                                            n19 = 0;
                                                        }
                                                        if (n19 == 0) {
                                                            StarlightskeletonEntity _datEntSetI3;
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntSetI3 = (StarlightskeletonEntity)entity;
                                                                _datEntSetI3.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntSetI3 = (StarlightskeletonEntity)entity;
                                                                _datEntSetI3.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                                            }
                                                        }
                                                        break block495;
                                                    }
                                                    if (entity.m_20186_() < -63.0) {
                                                        entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                    }
                                                    break block495;
                                                }
                                                if (entity.m_20186_() < -63.0) {
                                                    entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                }
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI4 = (StarlightskeletonEntity)entity;
                                                n18 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                            } else {
                                                n18 = 0;
                                            }
                                            if (n18 != true) break block499;
                                            if (entity instanceof Mob) {
                                                _mobEnt7 = (Mob)entity;
                                                livingEntity4 = _mobEnt7.m_5448_();
                                            } else {
                                                livingEntity4 = null;
                                            }
                                            if (livingEntity4 != null) {
                                                LivingEntity livingEntity29;
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity29 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity29 = null;
                                                }
                                                f4 = entity.m_20270_(livingEntity29);
                                            } else {
                                                f4 = -1.0f;
                                            }
                                            if (f4 > 1.0f) {
                                                LivingEntity livingEntity30;
                                                LivingEntity livingEntity31;
                                                LivingEntity livingEntity32;
                                                LivingEntity livingEntity33;
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    v63 = _mobEnt5.m_5448_();
                                                } else {
                                                    v63 = _ent = null;
                                                }
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity33 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity33 = null;
                                                }
                                                double d = livingEntity33.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity32 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity32 = null;
                                                }
                                                int n34 = (int)livingEntity32.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity31 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity31 = null;
                                                }
                                                double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n34, (int)livingEntity31.m_20189_());
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity30 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity30 = null;
                                                }
                                                _ent.m_6021_(d, d8, livingEntity30.m_20189_());
                                                if (_ent instanceof ServerPlayer) {
                                                    LivingEntity livingEntity34;
                                                    LivingEntity livingEntity35;
                                                    LivingEntity livingEntity36;
                                                    LivingEntity livingEntity37;
                                                    _serverPlayer = (ServerPlayer)_ent;
                                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity37 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity37 = null;
                                                    }
                                                    double d9 = livingEntity37.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt12 = (Mob)entity;
                                                        livingEntity36 = _mobEnt12.m_5448_();
                                                    } else {
                                                        livingEntity36 = null;
                                                    }
                                                    int n35 = (int)livingEntity36.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt3 = (Mob)entity;
                                                        livingEntity35 = _mobEnt3.m_5448_();
                                                    } else {
                                                        livingEntity35 = null;
                                                    }
                                                    double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n35, (int)livingEntity35.m_20189_());
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity34 = _mobEnt2.m_5448_();
                                                    } else {
                                                        livingEntity34 = null;
                                                    }
                                                    serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity34.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                }
                                            }
                                            if (entity instanceof Mob) {
                                                _mobEnt7 = (Mob)entity;
                                                livingEntity3 = _mobEnt7.m_5448_();
                                            } else {
                                                livingEntity3 = null;
                                            }
                                            if (livingEntity3 != null) {
                                                LivingEntity livingEntity38;
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity38 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity38 = null;
                                                }
                                                f3 = entity.m_20270_(livingEntity38);
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (f3 > 1.0f) {
                                                LivingEntity livingEntity39;
                                                LivingEntity livingEntity40;
                                                LivingEntity livingEntity41;
                                                LivingEntity livingEntity42;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity42 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity42 = null;
                                                }
                                                double d = livingEntity42.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity41 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity41 = null;
                                                }
                                                double d11 = livingEntity41.m_20186_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity40 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity40 = null;
                                                }
                                                double d12 = d11 + (double)livingEntity40.m_20206_() / 1.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity39 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity39 = null;
                                                }
                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d12, livingEntity39.m_20189_()));
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                n17 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                            } else {
                                                n17 = 0;
                                            }
                                            if (n17 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                _level2 = (ServerLevel)world;
                                                _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                n16 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                            } else {
                                                n16 = 0;
                                            }
                                            if (n16 == 11) break block500;
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                n15 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                            } else {
                                                n15 = 0;
                                            }
                                            if (n15 != 30) break block501;
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
                                        n14 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n14 = 0;
                                    }
                                    if (n14 == 13) break block502;
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI3 = (StarlightskeletonEntity)entity;
                                        n13 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n13 = 0;
                                    }
                                    if (n13 != 33) break block503;
                                }
                                _center = new Vec3(x, y, z);
                                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                for (Entity entityiterator : _entfound) {
                                    float f14;
                                    if (entityiterator instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entityiterator;
                                        f14 = _livEnt.m_21233_();
                                    } else {
                                        f14 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource, f14 / 4.0f + 1000.0f);
                                    if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                    if (world instanceof Level) {
                                        Level _level3 = (Level)world;
                                        if (!_level3.m_5776_()) {
                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                        } else {
                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                        }
                                    }
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n12 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n12 = 0;
                            }
                            if (n12 == 33) {
                                LivingEntity _entity;
                                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                }
                                if (world instanceof Level) {
                                    _level2 = (Level)world;
                                    if (!_level2.m_5776_()) {
                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                if (world instanceof Level) {
                                    _level2 = (Level)world;
                                    if (!_level2.m_5776_()) {
                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
                                for (int index1 = 0; index1 < 12; ++index1) {
                                    if (!(world instanceof ServerLevel)) continue;
                                    _level = (ServerLevel)world;
                                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                    if (entityToSpawn == null) continue;
                                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                }
                                _center2 = new Vec3(x, y, z);
                                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                for (Entity entityiterator : _entfound2) {
                                    float f15;
                                    if (entityiterator instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt3 = (LivingEntity)entityiterator;
                                        f15 = _livEnt3.m_21233_();
                                    } else {
                                        f15 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource, f15 / 4.0f + 1000.0f);
                                    double _setval = 6.0;
                                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                        capability.camerashake = _setval;
                                        capability.syncPlayerVariables(entityiterator);
                                    });
                                    if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                                    entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n11 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n11 = 0;
                            }
                            if (n11 == 52 && entity instanceof StarlightskeletonEntity) {
                                int n36;
                                _datEntSetI = (StarlightskeletonEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI = (StarlightskeletonEntity)entity;
                                    n36 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                } else {
                                    n36 = 0;
                                }
                                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n36 - 2));
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n10 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n10 = 0;
                            }
                            if (n10 >= 52) {
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                }
                            }
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI4 = (StarlightskeletonEntity)entity;
                            n9 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                        } else {
                            n9 = 0;
                        }
                        if (n9 == 2) {
                            int n37;
                            int n38;
                            int n39;
                            int n40;
                            int n41;
                            int n42;
                            float f16;
                            LivingEntity livingEntity43;
                            float f17;
                            LivingEntity livingEntity44;
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity44 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity44 = null;
                            }
                            if (livingEntity44 != null) {
                                LivingEntity livingEntity45;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity45 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity45 = null;
                                }
                                f17 = entity.m_20270_(livingEntity45);
                            } else {
                                f17 = -1.0f;
                            }
                            if (f17 > 1.0f) {
                                LivingEntity livingEntity46;
                                LivingEntity livingEntity47;
                                LivingEntity livingEntity48;
                                LivingEntity livingEntity49;
                                LivingEntity livingEntity50;
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    v107 = _mobEnt5.m_5448_();
                                } else {
                                    v107 = _ent = null;
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity50 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity50 = null;
                                }
                                double d = livingEntity50.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity49 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity49 = null;
                                }
                                int n43 = (int)livingEntity49.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity48 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity48 = null;
                                }
                                double d13 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n43, (int)livingEntity48.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity47 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity47 = null;
                                }
                                _ent.m_6021_(d, d13, livingEntity47.m_20189_());
                                if (_ent instanceof ServerPlayer) {
                                    LivingEntity livingEntity51;
                                    LivingEntity livingEntity52;
                                    LivingEntity livingEntity53;
                                    LivingEntity livingEntity54;
                                    _serverPlayer = (ServerPlayer)_ent;
                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity54 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity54 = null;
                                    }
                                    double d14 = livingEntity54.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt13 = (Mob)entity;
                                        livingEntity53 = _mobEnt13.m_5448_();
                                    } else {
                                        livingEntity53 = null;
                                    }
                                    int n44 = (int)livingEntity53.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity52 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity52 = null;
                                    }
                                    double d15 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n44, (int)livingEntity52.m_20189_());
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity51 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity51 = null;
                                    }
                                    serverGamePacketListenerImpl.m_9774_(d14, d15, livingEntity51.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity46 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity46 = null;
                                }
                                livingEntity46.m_20256_(new Vec3(0.0, 0.0, 0.0));
                            }
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity43 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity43 = null;
                            }
                            if (livingEntity43 != null) {
                                LivingEntity livingEntity55;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity55 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity55 = null;
                                }
                                f16 = entity.m_20270_(livingEntity55);
                            } else {
                                f16 = -1.0f;
                            }
                            if (f16 > 1.0f) {
                                LivingEntity livingEntity56;
                                LivingEntity livingEntity57;
                                LivingEntity livingEntity58;
                                LivingEntity livingEntity59;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity59 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity59 = null;
                                }
                                double d = livingEntity59.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity58 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity58 = null;
                                }
                                double d16 = livingEntity58.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity57 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity57 = null;
                                }
                                double d17 = d16 + (double)livingEntity57.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity56 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity56 = null;
                                }
                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity56.m_20189_()));
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n42 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n42 = 0;
                            }
                            if (n42 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                _level2 = (ServerLevel)world;
                                _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n41 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n41 = 0;
                            }
                            if (n41 == 15 && world instanceof Level) {
                                _level2 = (Level)world;
                                if (!_level2.m_5776_()) {
                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n40 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n40 = 0;
                            }
                            if (n40 == 17) {
                                _center2 = new Vec3(x, y, z);
                                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                for (Entity entityiterator : _entfound2) {
                                    float f18;
                                    if (entityiterator instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                                        f18 = _livEnt4.m_21233_();
                                    } else {
                                        f18 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource, f18 / 4.0f + 1000.0f);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n39 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n39 = 0;
                            }
                            if (n39 == 35) {
                                if (world instanceof Level) {
                                    _level2 = (Level)world;
                                    if (!_level2.m_5776_()) {
                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                if (world instanceof Level) {
                                    _level2 = (Level)world;
                                    if (!_level2.m_5776_()) {
                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                    } else {
                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                    }
                                }
                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y, z, 0.0, 0.0, 0.0);
                                _center2 = new Vec3(x, y, z);
                                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                for (Entity entityiterator : _entfound2) {
                                    float f19;
                                    if (entityiterator instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt5 = (LivingEntity)entityiterator;
                                        f19 = _livEnt5.m_21233_();
                                    } else {
                                        f19 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource, f19 / 4.0f + 1000.0f);
                                    double _setval = 3.0;
                                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                        capability.camerashake = _setval;
                                        capability.syncPlayerVariables(entityiterator);
                                    });
                                    if (entityiterator instanceof Player || entityiterator instanceof OriginallightningEntity || !(entityiterator instanceof LivingEntity)) continue;
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n38 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n38 = 0;
                            }
                            if (n38 == 51 && entity instanceof StarlightskeletonEntity) {
                                int n45;
                                _datEntSetI = (StarlightskeletonEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI = (StarlightskeletonEntity)entity;
                                    n45 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                } else {
                                    n45 = 0;
                                }
                                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n45 - 1));
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n37 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n37 = 0;
                            }
                            if (n37 >= 51) {
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                }
                            }
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI4 = (StarlightskeletonEntity)entity;
                            n8 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                        } else {
                            n8 = 0;
                        }
                        if (n8 == 3) {
                            int n46;
                            int n47;
                            int n48;
                            int n49;
                            int n50;
                            float f20;
                            LivingEntity livingEntity60;
                            float f21;
                            LivingEntity livingEntity61;
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity61 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity61 = null;
                            }
                            if (livingEntity61 != null) {
                                LivingEntity livingEntity62;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity62 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity62 = null;
                                }
                                f21 = entity.m_20270_(livingEntity62);
                            } else {
                                f21 = -1.0f;
                            }
                            if (f21 > 1.0f) {
                                LivingEntity livingEntity63;
                                LivingEntity livingEntity64;
                                LivingEntity livingEntity65;
                                LivingEntity livingEntity66;
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    v150 = _mobEnt5.m_5448_();
                                } else {
                                    v150 = _ent = null;
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity66 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity66 = null;
                                }
                                double d = livingEntity66.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity65 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity65 = null;
                                }
                                int n51 = (int)livingEntity65.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity64 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity64 = null;
                                }
                                double d18 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n51, (int)livingEntity64.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity63 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity63 = null;
                                }
                                _ent.m_6021_(d, d18, livingEntity63.m_20189_());
                                if (_ent instanceof ServerPlayer) {
                                    LivingEntity livingEntity67;
                                    LivingEntity livingEntity68;
                                    LivingEntity livingEntity69;
                                    LivingEntity livingEntity70;
                                    _serverPlayer = (ServerPlayer)_ent;
                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity70 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity70 = null;
                                    }
                                    double d19 = livingEntity70.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt14 = (Mob)entity;
                                        livingEntity69 = _mobEnt14.m_5448_();
                                    } else {
                                        livingEntity69 = null;
                                    }
                                    int n52 = (int)livingEntity69.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity68 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity68 = null;
                                    }
                                    double d20 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n52, (int)livingEntity68.m_20189_());
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity67 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity67 = null;
                                    }
                                    serverGamePacketListenerImpl.m_9774_(d19, d20, livingEntity67.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                }
                            }
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity60 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity60 = null;
                            }
                            if (livingEntity60 != null) {
                                LivingEntity livingEntity71;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity71 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity71 = null;
                                }
                                f20 = entity.m_20270_(livingEntity71);
                            } else {
                                f20 = -1.0f;
                            }
                            if (f20 > 1.0f) {
                                LivingEntity livingEntity72;
                                LivingEntity livingEntity73;
                                LivingEntity livingEntity74;
                                LivingEntity livingEntity75;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity75 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity75 = null;
                                }
                                double d = livingEntity75.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity74 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity74 = null;
                                }
                                double d21 = livingEntity74.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity73 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity73 = null;
                                }
                                double d22 = d21 + (double)livingEntity73.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity72 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity72 = null;
                                }
                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity72.m_20189_()));
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n50 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n50 = 0;
                            }
                            if (n50 == 13) {
                                float f22;
                                LivingEntity livingEntity76;
                                if (world instanceof Level) {
                                    _level2 = (Level)world;
                                    if (!_level2.m_5776_()) {
                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                    } else {
                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                    }
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity76 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity76 = null;
                                }
                                if (livingEntity76 != null) {
                                    LivingEntity livingEntity77;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity77 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity77 = null;
                                    }
                                    f22 = entity.m_20270_(livingEntity77);
                                } else {
                                    f22 = -1.0f;
                                }
                                if (f22 > 1.0f) {
                                    LivingEntity livingEntity78;
                                    LivingEntity livingEntity79;
                                    LivingEntity livingEntity80;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity80 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity80 = null;
                                    }
                                    double d = (livingEntity80.m_20185_() - entity.m_20185_()) * 1.1;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity79 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity79 = null;
                                    }
                                    double d23 = (livingEntity79.m_20186_() - entity.m_20186_()) * 1.1;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity78 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity78 = null;
                                    }
                                    entity.m_20256_(new Vec3(d, d23, (livingEntity78.m_20189_() - entity.m_20189_()) * 1.1));
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n49 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n49 = 0;
                            }
                            if (n49 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                _level2 = (ServerLevel)world;
                                _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n48 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n48 = 0;
                            }
                            if (n48 == 16) {
                                _center2 = new Vec3(x, y, z);
                                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                for (Entity entityiterator : _entfound2) {
                                    float f23;
                                    if (entityiterator instanceof StarlightskeletonEntity) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt6 = (LivingEntity)entityiterator;
                                        f23 = _livEnt6.m_21233_();
                                    } else {
                                        f23 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource, f23 / 4.0f + 1000.0f);
                                    if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                    if (world instanceof Level) {
                                        Level _level4 = (Level)world;
                                        if (!_level4.m_5776_()) {
                                            _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                        } else {
                                            _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                        }
                                    }
                                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n47 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n47 = 0;
                            }
                            if (n47 == 32 && entity instanceof StarlightskeletonEntity) {
                                int n53;
                                _datEntSetI = (StarlightskeletonEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI = (StarlightskeletonEntity)entity;
                                    n53 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
                                } else {
                                    n53 = 0;
                                }
                                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n53 - 1));
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n46 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n46 = 0;
                            }
                            if (n46 >= 32) {
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                }
                            }
                        }
                        if (!(entity instanceof StarlightskeletonEntity)) return;
                        _datEntI4 = (StarlightskeletonEntity)entity;
                        int n54 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                        if (n54 != 4) return;
                        if (entity instanceof Mob) {
                            _mobEnt7 = (Mob)entity;
                            livingEntity2 = _mobEnt7.m_5448_();
                        } else {
                            livingEntity2 = null;
                        }
                        if (livingEntity2 != null) {
                            LivingEntity livingEntity81;
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity81 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity81 = null;
                            }
                            f2 = entity.m_20270_(livingEntity81);
                        } else {
                            f2 = -1.0f;
                        }
                        if (f2 > 1.0f) {
                            LivingEntity livingEntity82;
                            LivingEntity livingEntity83;
                            LivingEntity livingEntity84;
                            LivingEntity livingEntity85;
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                v197 = _mobEnt5.m_5448_();
                            } else {
                                v197 = _ent = null;
                            }
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity85 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity85 = null;
                            }
                            double d = livingEntity85.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity84 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity84 = null;
                            }
                            int n55 = (int)livingEntity84.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity83 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity83 = null;
                            }
                            double d24 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n55, (int)livingEntity83.m_20189_());
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity82 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity82 = null;
                            }
                            _ent.m_6021_(d, d24, livingEntity82.m_20189_());
                            if (_ent instanceof ServerPlayer) {
                                LivingEntity livingEntity86;
                                LivingEntity livingEntity87;
                                LivingEntity livingEntity88;
                                LivingEntity livingEntity89;
                                _serverPlayer = (ServerPlayer)_ent;
                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity89 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity89 = null;
                                }
                                double d25 = livingEntity89.m_20185_();
                                if (entity instanceof Mob) {
                                    Mob _mobEnt15 = (Mob)entity;
                                    livingEntity88 = _mobEnt15.m_5448_();
                                } else {
                                    livingEntity88 = null;
                                }
                                int n56 = (int)livingEntity88.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity87 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity87 = null;
                                }
                                double d26 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n56, (int)livingEntity87.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity86 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity86 = null;
                                }
                                serverGamePacketListenerImpl.m_9774_(d25, d26, livingEntity86.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt7 = (Mob)entity;
                            livingEntity = _mobEnt7.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity90;
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity90 = _mobEnt6.m_5448_();
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
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity94 = _mobEnt.m_5448_();
                            } else {
                                livingEntity94 = null;
                            }
                            double d = livingEntity94.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity93 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity93 = null;
                            }
                            double d27 = livingEntity93.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity92 = _mobEnt.m_5448_();
                            } else {
                                livingEntity92 = null;
                            }
                            double d28 = d27 + (double)livingEntity92.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity91 = _mobEnt.m_5448_();
                            } else {
                                livingEntity91 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity91.m_20189_()));
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI2 = (StarlightskeletonEntity)entity;
                            n7 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n7 = 0;
                        }
                        if (n7 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                            _level2 = (ServerLevel)world;
                            _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI2 = (StarlightskeletonEntity)entity;
                            n6 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n6 = 0;
                        }
                        if (n6 == 5) break block504;
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI3 = (StarlightskeletonEntity)entity;
                            n5 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n5 = 0;
                        }
                        if (n5 == 21) break block504;
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI = (StarlightskeletonEntity)entity;
                            n4 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n4 = 0;
                        }
                        if (n4 != 25) break block505;
                    }
                    if (world instanceof Level) {
                        Level _level5 = (Level)world;
                        if (!_level5.m_5776_()) {
                            _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                        } else {
                            _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                        }
                    }
                }
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI2 = (StarlightskeletonEntity)entity;
                    n3 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n3 = 0;
                }
                if (n3 == 23) break block506;
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI3 = (StarlightskeletonEntity)entity;
                    n2 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n2 = 0;
                }
                if (n2 != 27) break block507;
            }
            if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                }
            }
            _center = new Vec3(x, y, z);
            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                if (entityiterator instanceof StarlightskeletonEntity) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                if (entityiterator instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f / 4.0f + 1000.0f);
                if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                for (int index2 = 0; index2 < 2; ++index2) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                }
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n = 0;
        }
        if (n == 47 && entity instanceof StarlightskeletonEntity) {
            int n57;
            _datEntSetI = (StarlightskeletonEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof StarlightskeletonEntity) {
                _datEntI = (StarlightskeletonEntity)entity;
                n57 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_SkillCount);
            } else {
                n57 = 0;
            }
            synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)(n57 - 2));
        }
        if (!(entity instanceof StarlightskeletonEntity)) return;
        _datEntI2 = (StarlightskeletonEntity)entity;
        int n58 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        if (n58 < 47) return;
        if (entity instanceof StarlightskeletonEntity) {
            _datEntSetI = (StarlightskeletonEntity)entity;
            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
        }
        if (!(entity instanceof StarlightskeletonEntity)) return;
        _datEntSetI = (StarlightskeletonEntity)entity;
        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
    }
}

