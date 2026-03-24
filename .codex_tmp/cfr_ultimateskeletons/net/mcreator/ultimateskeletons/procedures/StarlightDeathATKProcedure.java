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
 *  net.minecraft.world.level.Level$ExplosionInteraction
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
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
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

public class StarlightDeathATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block558: {
            int n;
            int n2;
            StarlightDeathEntity _datEntI;
            StarlightDeathEntity _datEntSetI;
            StarlightDeathEntity _datEntI2;
            block562: {
                LivingEntity _livEnt;
                List<Entity> _entfound;
                Vec3 _center;
                Level _level;
                block561: {
                    int n3;
                    int n4;
                    StarlightDeathEntity _datEntI3;
                    block560: {
                        block559: {
                            int n5;
                            int n6;
                            int n7;
                            int n8;
                            int n9;
                            float f;
                            LivingEntity livingEntity;
                            int n10;
                            int n11;
                            int n12;
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
                            StarlightDeathEntity _datEntI4;
                            block553: {
                                int n13;
                                int n14;
                                int n15;
                                block557: {
                                    block556: {
                                        int n16;
                                        int n17;
                                        block555: {
                                            block554: {
                                                int n18;
                                                int n19;
                                                int n20;
                                                int n21;
                                                float f2;
                                                LivingEntity livingEntity2;
                                                int n22;
                                                int n23;
                                                Object object;
                                                StarlightDeathEntity _datEntSetI2;
                                                block550: {
                                                    int n24;
                                                    block552: {
                                                        block551: {
                                                            int n25;
                                                            int n26;
                                                            int n27;
                                                            double _setval;
                                                            Entity entityiterator;
                                                            int n28;
                                                            int n29;
                                                            int n30;
                                                            int n31;
                                                            int n32;
                                                            LivingEntity _entity;
                                                            if (entity == null) {
                                                                return;
                                                            }
                                                            double theta = 0.0;
                                                            ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                                            }
                                                            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                                                            }
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI4 = (StarlightDeathEntity)entity;
                                                                n32 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                            } else {
                                                                n32 = 0;
                                                            }
                                                            if (n32 == 0) {
                                                                if (entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarlightDeathEntity) {
                                                                    _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)0);
                                                                }
                                                                if (entity.m_5446_().getString().equals("\u6da1\u6d41") && entity instanceof StarlightDeathEntity) {
                                                                    _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)30);
                                                                }
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI4 = (StarlightDeathEntity)entity;
                                                                n31 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                            } else {
                                                                n31 = 0;
                                                            }
                                                            if (n31 != 0 && entity instanceof StarlightDeathEntity) {
                                                                int n33;
                                                                _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                if (entity instanceof StarlightDeathEntity) {
                                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                                    n33 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                } else {
                                                                    n33 = 0;
                                                                }
                                                                synchedEntityData.m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)(n33 + 1));
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI4 = (StarlightDeathEntity)entity;
                                                                n30 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                                            } else {
                                                                n30 = 0;
                                                            }
                                                            if (n30 > 0) break block550;
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                int n34;
                                                                _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                if (entity instanceof StarlightDeathEntity) {
                                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                                    n34 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                                } else {
                                                                    n34 = 0;
                                                                }
                                                                synchedEntityData.m_135381_(StarlightDeathEntity.DATA_Tick, (Object)(n34 - 1));
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                                n29 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                            } else {
                                                                n29 = 0;
                                                            }
                                                            if (n29 >= 210) {
                                                                int n35;
                                                                if (entity instanceof StarlightDeathEntity) {
                                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                                    n35 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                                } else {
                                                                    n35 = 0;
                                                                }
                                                                if (n35 <= 225 && entity instanceof StarlightDeathEntity) {
                                                                    ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.changeto2");
                                                                }
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                                n28 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                            } else {
                                                                n28 = 0;
                                                            }
                                                            if (n28 == 185) {
                                                                if (world instanceof Level) {
                                                                    _level2 = (Level)world;
                                                                    if (!_level2.m_5776_()) {
                                                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                                    } else {
                                                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                                    }
                                                                }
                                                                for (int index0 = 0; index0 < 300; ++index0) {
                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 50.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0));
                                                                }
                                                                _center2 = new Vec3(x, y, z);
                                                                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
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
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                                n27 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                            } else {
                                                                n27 = 0;
                                                            }
                                                            if (n27 == 165) {
                                                                if (world instanceof Level) {
                                                                    _level2 = (Level)world;
                                                                    if (!_level2.m_5776_()) {
                                                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                                    } else {
                                                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                                    }
                                                                }
                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                                                _center2 = new Vec3(x, y, z);
                                                                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
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
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                                n26 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                            } else {
                                                                n26 = 0;
                                                            }
                                                            if (n26 == 140) break block551;
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI3 = (StarlightDeathEntity)entity;
                                                                n25 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                            } else {
                                                                n25 = 0;
                                                            }
                                                            if (n25 != 150) break block552;
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
                                                        n24 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_Tick);
                                                    } else {
                                                        n24 = 0;
                                                    }
                                                    if (n24 < 108 && entity instanceof StarlightDeathEntity) {
                                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI4 = (StarlightDeathEntity)entity;
                                                    n23 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                                } else {
                                                    n23 = 0;
                                                }
                                                if (n23 > 0) {
                                                    LivingEntity livingEntity3;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_Tick, (Object)240);
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity3 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity3 = null;
                                                    }
                                                    if (livingEntity3 != null) {
                                                        float f3;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            v16 = _mobEnt6.m_5448_();
                                                        } else {
                                                            v16 = object = null;
                                                        }
                                                        if (object instanceof LivingEntity) {
                                                            LivingEntity _livEnt2 = object;
                                                            f3 = _livEnt2.m_21223_();
                                                        } else {
                                                            f3 = -1.0f;
                                                        }
                                                        if (f3 > 0.0f) {
                                                            float f4;
                                                            LivingEntity livingEntity4;
                                                            LivingEntity livingEntity5;
                                                            float f5;
                                                            LivingEntity livingEntity6;
                                                            float f6;
                                                            LivingEntity livingEntity7;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity7 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity7 = null;
                                                            }
                                                            if (livingEntity7 != null) {
                                                                LivingEntity livingEntity8;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity8 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity8 = null;
                                                                }
                                                                f6 = entity.m_20270_(livingEntity8);
                                                            } else {
                                                                f6 = -1.0f;
                                                            }
                                                            if (f6 >= 160.0f) {
                                                                entity.m_6858_(true);
                                                            } else {
                                                                entity.m_6858_(false);
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity6 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity6 = null;
                                                            }
                                                            if (livingEntity6 != null) {
                                                                LivingEntity livingEntity9;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity9 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity9 = null;
                                                                }
                                                                f5 = entity.m_20270_(livingEntity9);
                                                            } else {
                                                                f5 = -1.0f;
                                                            }
                                                            if (f5 > 4.0f) {
                                                                int n36;
                                                                if (entity instanceof StarlightDeathEntity) {
                                                                    StarlightDeathEntity _datEntI5 = (StarlightDeathEntity)entity;
                                                                    n36 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                } else {
                                                                    n36 = 0;
                                                                }
                                                                if (n36 == 0) {
                                                                    LivingEntity livingEntity10;
                                                                    LivingEntity livingEntity11;
                                                                    LivingEntity livingEntity12;
                                                                    LivingEntity livingEntity13;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity13 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity13 = null;
                                                                    }
                                                                    double d = livingEntity13.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity12 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity12 = null;
                                                                    }
                                                                    double d2 = livingEntity12.m_20186_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity11 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity11 = null;
                                                                    }
                                                                    double d3 = d2 + (double)livingEntity11.m_20206_() / 1.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity10 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity10 = null;
                                                                    }
                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity10.m_20189_()));
                                                                }
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity5 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity5 = null;
                                                            }
                                                            if (livingEntity5.m_20206_() > 8.0f) {
                                                                float f7;
                                                                LivingEntity livingEntity14;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity14 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity14 = null;
                                                                }
                                                                if (livingEntity14 != null) {
                                                                    LivingEntity livingEntity15;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt8 = (Mob)entity;
                                                                        livingEntity15 = _mobEnt8.m_5448_();
                                                                    } else {
                                                                        livingEntity15 = null;
                                                                    }
                                                                    f7 = entity.m_20270_(livingEntity15);
                                                                } else {
                                                                    f7 = -1.0f;
                                                                }
                                                                if (f7 > 56.0f) {
                                                                    float f8;
                                                                    LivingEntity livingEntity16;
                                                                    LivingEntity livingEntity17;
                                                                    float f9;
                                                                    LivingEntity livingEntity18;
                                                                    LivingEntity livingEntity19;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt = (Mob)entity;
                                                                        livingEntity19 = _mobEnt.m_5448_();
                                                                    } else {
                                                                        livingEntity19 = null;
                                                                    }
                                                                    double d = livingEntity19.m_20185_() - entity.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity18 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity18 = null;
                                                                    }
                                                                    if (livingEntity18 != null) {
                                                                        LivingEntity livingEntity20;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt3 = (Mob)entity;
                                                                            livingEntity20 = _mobEnt3.m_5448_();
                                                                        } else {
                                                                            livingEntity20 = null;
                                                                        }
                                                                        f9 = entity.m_20270_(livingEntity20);
                                                                    } else {
                                                                        f9 = -1.0f;
                                                                    }
                                                                    double d4 = d / (double)f9;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt = (Mob)entity;
                                                                        livingEntity17 = _mobEnt.m_5448_();
                                                                    } else {
                                                                        livingEntity17 = null;
                                                                    }
                                                                    double d5 = livingEntity17.m_20189_() - entity.m_20189_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity16 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity16 = null;
                                                                    }
                                                                    if (livingEntity16 != null) {
                                                                        LivingEntity livingEntity21;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt3 = (Mob)entity;
                                                                            livingEntity21 = _mobEnt3.m_5448_();
                                                                        } else {
                                                                            livingEntity21 = null;
                                                                        }
                                                                        f8 = entity.m_20270_(livingEntity21);
                                                                    } else {
                                                                        f8 = -1.0f;
                                                                    }
                                                                    entity.m_20256_(new Vec3(d4, 0.0, d5 / (double)f8));
                                                                }
                                                            } else {
                                                                float f10;
                                                                LivingEntity livingEntity22;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity22 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity22 = null;
                                                                }
                                                                if (livingEntity22 != null) {
                                                                    LivingEntity livingEntity23;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt9 = (Mob)entity;
                                                                        livingEntity23 = _mobEnt9.m_5448_();
                                                                    } else {
                                                                        livingEntity23 = null;
                                                                    }
                                                                    f10 = entity.m_20270_(livingEntity23);
                                                                } else {
                                                                    f10 = -1.0f;
                                                                }
                                                                if (f10 > 12.0f) {
                                                                    float f11;
                                                                    LivingEntity livingEntity24;
                                                                    LivingEntity livingEntity25;
                                                                    float f12;
                                                                    LivingEntity livingEntity26;
                                                                    LivingEntity livingEntity27;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt = (Mob)entity;
                                                                        livingEntity27 = _mobEnt.m_5448_();
                                                                    } else {
                                                                        livingEntity27 = null;
                                                                    }
                                                                    double d = livingEntity27.m_20185_() - entity.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity26 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity26 = null;
                                                                    }
                                                                    if (livingEntity26 != null) {
                                                                        LivingEntity livingEntity28;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt3 = (Mob)entity;
                                                                            livingEntity28 = _mobEnt3.m_5448_();
                                                                        } else {
                                                                            livingEntity28 = null;
                                                                        }
                                                                        f12 = entity.m_20270_(livingEntity28);
                                                                    } else {
                                                                        f12 = -1.0f;
                                                                    }
                                                                    double d6 = d / (double)f12;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt = (Mob)entity;
                                                                        livingEntity25 = _mobEnt.m_5448_();
                                                                    } else {
                                                                        livingEntity25 = null;
                                                                    }
                                                                    double d7 = livingEntity25.m_20189_() - entity.m_20189_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity24 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity24 = null;
                                                                    }
                                                                    if (livingEntity24 != null) {
                                                                        LivingEntity livingEntity29;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt3 = (Mob)entity;
                                                                            livingEntity29 = _mobEnt3.m_5448_();
                                                                        } else {
                                                                            livingEntity29 = null;
                                                                        }
                                                                        f11 = entity.m_20270_(livingEntity29);
                                                                    } else {
                                                                        f11 = -1.0f;
                                                                    }
                                                                    entity.m_20256_(new Vec3(d6, 0.0, d7 / (double)f11));
                                                                }
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity4 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity4 = null;
                                                            }
                                                            if (livingEntity4 != null) {
                                                                LivingEntity livingEntity30;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity30 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity30 = null;
                                                                }
                                                                f4 = entity.m_20270_(livingEntity30);
                                                            } else {
                                                                f4 = -1.0f;
                                                            }
                                                            if (f4 < 500.0f && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5 && !world.m_5776_()) {
                                                                int n37;
                                                                if (entity instanceof StarlightDeathEntity) {
                                                                    StarlightDeathEntity _datEntI6 = (StarlightDeathEntity)entity;
                                                                    n37 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                } else {
                                                                    n37 = 0;
                                                                }
                                                                if (n37 == 0) {
                                                                    LivingEntity livingEntity31;
                                                                    LivingEntity livingEntity32;
                                                                    LivingEntity livingEntity33;
                                                                    LivingEntity livingEntity34;
                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                        StarlightDeathEntity _datEntSetI3 = (StarlightDeathEntity)entity;
                                                                        _datEntSetI3.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity34 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity34 = null;
                                                                    }
                                                                    double d = livingEntity34.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity33 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity33 = null;
                                                                    }
                                                                    double d8 = livingEntity33.m_20186_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity32 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity32 = null;
                                                                    }
                                                                    double d9 = d8 + (double)livingEntity32.m_20206_() / 1.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity31 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity31 = null;
                                                                    }
                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d9, livingEntity31.m_20189_()));
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
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI4 = (StarlightDeathEntity)entity;
                                                    n22 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                } else {
                                                    n22 = 0;
                                                }
                                                if (n22 != true) break block553;
                                                if (entity instanceof StarlightDeathEntity) {
                                                    ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.swipe");
                                                }
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity2 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity2 = null;
                                                }
                                                if (livingEntity2 != null) {
                                                    LivingEntity livingEntity35;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity35 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity35 = null;
                                                    }
                                                    f2 = entity.m_20270_(livingEntity35);
                                                } else {
                                                    f2 = -1.0f;
                                                }
                                                if (f2 > 1.0f) {
                                                    LivingEntity livingEntity36;
                                                    LivingEntity livingEntity37;
                                                    LivingEntity livingEntity38;
                                                    LivingEntity livingEntity39;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        v76 = _mobEnt5.m_5448_();
                                                    } else {
                                                        v76 = _ent = null;
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity39 = _mobEnt5.m_5448_();
                                                    } else {
                                                        livingEntity39 = null;
                                                    }
                                                    double d = livingEntity39.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity38 = _mobEnt5.m_5448_();
                                                    } else {
                                                        livingEntity38 = null;
                                                    }
                                                    int n38 = (int)livingEntity38.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity37 = _mobEnt5.m_5448_();
                                                    } else {
                                                        livingEntity37 = null;
                                                    }
                                                    double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n38, (int)livingEntity37.m_20189_());
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity36 = _mobEnt5.m_5448_();
                                                    } else {
                                                        livingEntity36 = null;
                                                    }
                                                    _ent.m_6021_(d, d10, livingEntity36.m_20189_());
                                                    if (_ent instanceof ServerPlayer) {
                                                        LivingEntity livingEntity40;
                                                        LivingEntity livingEntity41;
                                                        LivingEntity livingEntity42;
                                                        LivingEntity livingEntity43;
                                                        _serverPlayer = (ServerPlayer)_ent;
                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity43 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity43 = null;
                                                        }
                                                        double d11 = livingEntity43.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt10 = (Mob)entity;
                                                            livingEntity42 = _mobEnt10.m_5448_();
                                                        } else {
                                                            livingEntity42 = null;
                                                        }
                                                        int n39 = (int)livingEntity42.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity41 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity41 = null;
                                                        }
                                                        double d12 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n39, (int)livingEntity41.m_20189_());
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity40 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity40 = null;
                                                        }
                                                        serverGamePacketListenerImpl.m_9774_(d11, d12, livingEntity40.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                    n21 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n21 = 0;
                                                }
                                                if (n21 == 1) {
                                                    float f13;
                                                    LivingEntity livingEntity44;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity44 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    if (livingEntity44 != null) {
                                                        LivingEntity livingEntity45;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt = (Mob)entity;
                                                            livingEntity45 = _mobEnt.m_5448_();
                                                        } else {
                                                            livingEntity45 = null;
                                                        }
                                                        f13 = entity.m_20270_(livingEntity45);
                                                    } else {
                                                        f13 = -1.0f;
                                                    }
                                                    if (f13 > 1.0f) {
                                                        LivingEntity livingEntity46;
                                                        LivingEntity livingEntity47;
                                                        LivingEntity livingEntity48;
                                                        LivingEntity livingEntity49;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt5 = (Mob)entity;
                                                            livingEntity49 = _mobEnt5.m_5448_();
                                                        } else {
                                                            livingEntity49 = null;
                                                        }
                                                        double d = livingEntity49.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity48 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity48 = null;
                                                        }
                                                        double d13 = livingEntity48.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt5 = (Mob)entity;
                                                            livingEntity47 = _mobEnt5.m_5448_();
                                                        } else {
                                                            livingEntity47 = null;
                                                        }
                                                        double d14 = d13 + (double)livingEntity47.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt5 = (Mob)entity;
                                                            livingEntity46 = _mobEnt5.m_5448_();
                                                        } else {
                                                            livingEntity46 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d14, livingEntity46.m_20189_()));
                                                    }
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                    n20 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n20 = 0;
                                                }
                                                if (n20 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                    _level2 = (ServerLevel)world;
                                                    _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                    n19 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n19 = 0;
                                                }
                                                if (n19 == 11) break block554;
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                    n18 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                } else {
                                                    n18 = 0;
                                                }
                                                if (n18 != 30) break block555;
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
                                        if (n17 == 13) break block556;
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI3 = (StarlightDeathEntity)entity;
                                            n16 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n16 = 0;
                                        }
                                        if (n16 != 33) break block557;
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
                                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    for (Entity entityiterator : _entfound) {
                                        float f14;
                                        if (entityiterator instanceof StarlightDeathEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entityiterator;
                                            f14 = _livEnt.m_21233_();
                                        } else {
                                            f14 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f14 / 4.0f + 1.0E7f);
                                        if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                        if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                            entityiterator.f_19802_ = 0;
                                            Deathlist.normalattack(entityiterator);
                                        }
                                        for (int index1 = 0; index1 < 2; ++index1) {
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
                                if (n15 == 33) {
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
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.1, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.2, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                                    for (int index2 = 0; index2 < 32; ++index2) {
                                        Object entityToSpawn;
                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel)world;
                                            entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                            entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                            entityToSpawn.m_20874_(true);
                                            _level.m_7967_((Entity)entityToSpawn);
                                        }
                                        if (!(world instanceof ServerLevel)) continue;
                                        _level = (ServerLevel)world;
                                        entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                        if (entityToSpawn == null) continue;
                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                    }
                                    _center2 = new Vec3(x, y, z);
                                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                    for (Entity entityiterator : _entfound2) {
                                        float f15;
                                        if (entityiterator instanceof StarlightDeathEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            LivingEntity _livEnt3 = (LivingEntity)entityiterator;
                                            f15 = _livEnt3.m_21233_();
                                        } else {
                                            f15 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f15 / 4.0f + 1.0E7f);
                                        double _setval = 6.0;
                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                            capability.camerashake = _setval;
                                            capability.syncPlayerVariables(entityiterator);
                                        });
                                        if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                                        entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                        if (entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                        entityiterator.f_19802_ = 0;
                                        Deathlist.normalattack(entityiterator);
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n14 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 == 52 && entity instanceof StarlightDeathEntity) {
                                    int n40;
                                    _datEntSetI = (StarlightDeathEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntI = (StarlightDeathEntity)entity;
                                        n40 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                    } else {
                                        n40 = 0;
                                    }
                                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n40 - 2));
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n13 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 >= 52) {
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                    }
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI4 = (StarlightDeathEntity)entity;
                                n12 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                            } else {
                                n12 = 0;
                            }
                            if (n12 == 2) {
                                int n41;
                                int n42;
                                int n43;
                                int n44;
                                int n45;
                                int n46;
                                int n47;
                                float f16;
                                LivingEntity livingEntity50;
                                if (entity instanceof StarlightDeathEntity) {
                                    ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.backflip");
                                }
                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity50 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity50 = null;
                                }
                                if (livingEntity50 != null) {
                                    LivingEntity livingEntity51;
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity51 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity51 = null;
                                    }
                                    f16 = entity.m_20270_(livingEntity51);
                                } else {
                                    f16 = -1.0f;
                                }
                                if (f16 > 1.0f) {
                                    LivingEntity livingEntity52;
                                    LivingEntity livingEntity53;
                                    LivingEntity livingEntity54;
                                    LivingEntity livingEntity55;
                                    LivingEntity livingEntity56;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        v121 = _mobEnt5.m_5448_();
                                    } else {
                                        v121 = _ent = null;
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity56 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity56 = null;
                                    }
                                    double d = livingEntity56.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity55 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity55 = null;
                                    }
                                    int n48 = (int)livingEntity55.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity54 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity54 = null;
                                    }
                                    double d15 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n48, (int)livingEntity54.m_20189_());
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity53 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity53 = null;
                                    }
                                    _ent.m_6021_(d, d15, livingEntity53.m_20189_());
                                    if (_ent instanceof ServerPlayer) {
                                        LivingEntity livingEntity57;
                                        LivingEntity livingEntity58;
                                        LivingEntity livingEntity59;
                                        LivingEntity livingEntity60;
                                        _serverPlayer = (ServerPlayer)_ent;
                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity60 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity60 = null;
                                        }
                                        double d16 = livingEntity60.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt11 = (Mob)entity;
                                            livingEntity59 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity59 = null;
                                        }
                                        int n49 = (int)livingEntity59.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity58 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity58 = null;
                                        }
                                        double d17 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n49, (int)livingEntity58.m_20189_());
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity57 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity57 = null;
                                        }
                                        serverGamePacketListenerImpl.m_9774_(d16, d17, livingEntity57.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity52 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity52 = null;
                                    }
                                    livingEntity52.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n47 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n47 = 0;
                                }
                                if (n47 == 1) {
                                    float f17;
                                    LivingEntity livingEntity61;
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity61 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity61 = null;
                                    }
                                    if (livingEntity61 != null) {
                                        LivingEntity livingEntity62;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity62 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity62 = null;
                                        }
                                        f17 = entity.m_20270_(livingEntity62);
                                    } else {
                                        f17 = -1.0f;
                                    }
                                    if (f17 > 1.0f) {
                                        LivingEntity livingEntity63;
                                        LivingEntity livingEntity64;
                                        LivingEntity livingEntity65;
                                        LivingEntity livingEntity66;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity66 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity66 = null;
                                        }
                                        double d = livingEntity66.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity65 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity65 = null;
                                        }
                                        double d18 = livingEntity65.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity64 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity64 = null;
                                        }
                                        double d19 = d18 + (double)livingEntity64.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity63 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity63 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d19, livingEntity63.m_20189_()));
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n46 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n46 = 0;
                                }
                                if (n46 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                    _level2 = (ServerLevel)world;
                                    _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n45 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n45 = 0;
                                }
                                if (n45 == 15 && world instanceof Level) {
                                    _level2 = (Level)world;
                                    if (!_level2.m_5776_()) {
                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                    } else {
                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n44 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n44 = 0;
                                }
                                if (n44 == 17) {
                                    _center2 = new Vec3(x, y, z);
                                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                    for (Entity entityiterator : _entfound2) {
                                        float f18;
                                        if (entityiterator instanceof StarlightDeathEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                                            f18 = _livEnt4.m_21233_();
                                        } else {
                                            f18 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f18 / 4.0f + 1000.0f);
                                        if (entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                        entityiterator.f_19802_ = 0;
                                        Deathlist.normalattack(entityiterator);
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n43 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n43 = 0;
                                }
                                if (n43 == 35) {
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
                                    if (world instanceof Level && !(_level2 = (Level)world).m_5776_()) {
                                        _level2.m_254849_(null, x, y, z, 16.0f, Level.ExplosionInteraction.NONE);
                                    }
                                    _center2 = new Vec3(x, y, z);
                                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                    for (Entity entityiterator : _entfound2) {
                                        float f19;
                                        if (entityiterator instanceof StarlightDeathEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)entityiterator;
                                            f19 = _livEnt5.m_21233_();
                                        } else {
                                            f19 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f19 / 4.0f + 1.0E7f);
                                        double _setval = 3.0;
                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                            capability.camerashake = _setval;
                                            capability.syncPlayerVariables(entityiterator);
                                        });
                                        if (entityiterator instanceof Player || entityiterator instanceof OriginallightningEntity || !(entityiterator instanceof LivingEntity)) continue;
                                        if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                            entityiterator.f_19802_ = 0;
                                            Deathlist.normalattack(entityiterator);
                                        }
                                        for (int index3 = 0; index3 < 2; ++index3) {
                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                        }
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n42 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n42 = 0;
                                }
                                if (n42 == 51 && entity instanceof StarlightDeathEntity) {
                                    int n50;
                                    _datEntSetI = (StarlightDeathEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntI = (StarlightDeathEntity)entity;
                                        n50 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                    } else {
                                        n50 = 0;
                                    }
                                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n50 - 1));
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n41 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n41 = 0;
                                }
                                if (n41 >= 51) {
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                    }
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI4 = (StarlightDeathEntity)entity;
                                n11 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                            } else {
                                n11 = 0;
                            }
                            if (n11 == 3) {
                                int n51;
                                int n52;
                                int n53;
                                int n54;
                                int n55;
                                int n56;
                                float f20;
                                LivingEntity livingEntity67;
                                if (entity instanceof StarlightDeathEntity) {
                                    ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.up");
                                }
                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity67 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity67 = null;
                                }
                                if (livingEntity67 != null) {
                                    LivingEntity livingEntity68;
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity68 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity68 = null;
                                    }
                                    f20 = entity.m_20270_(livingEntity68);
                                } else {
                                    f20 = -1.0f;
                                }
                                if (f20 > 1.0f) {
                                    LivingEntity livingEntity69;
                                    LivingEntity livingEntity70;
                                    LivingEntity livingEntity71;
                                    LivingEntity livingEntity72;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        v165 = _mobEnt5.m_5448_();
                                    } else {
                                        v165 = _ent = null;
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity72 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity72 = null;
                                    }
                                    double d = livingEntity72.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity71 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity71 = null;
                                    }
                                    int n57 = (int)livingEntity71.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity70 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity70 = null;
                                    }
                                    double d20 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n57, (int)livingEntity70.m_20189_());
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity69 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity69 = null;
                                    }
                                    _ent.m_6021_(d, d20, livingEntity69.m_20189_());
                                    if (_ent instanceof ServerPlayer) {
                                        LivingEntity livingEntity73;
                                        LivingEntity livingEntity74;
                                        LivingEntity livingEntity75;
                                        LivingEntity livingEntity76;
                                        _serverPlayer = (ServerPlayer)_ent;
                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity76 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity76 = null;
                                        }
                                        double d21 = livingEntity76.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt12 = (Mob)entity;
                                            livingEntity75 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity75 = null;
                                        }
                                        int n58 = (int)livingEntity75.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity74 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity74 = null;
                                        }
                                        double d22 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n58, (int)livingEntity74.m_20189_());
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity73 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity73 = null;
                                        }
                                        serverGamePacketListenerImpl.m_9774_(d21, d22, livingEntity73.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n56 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n56 = 0;
                                }
                                if (n56 == 1) {
                                    float f21;
                                    LivingEntity livingEntity77;
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity77 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity77 = null;
                                    }
                                    if (livingEntity77 != null) {
                                        LivingEntity livingEntity78;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity78 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity78 = null;
                                        }
                                        f21 = entity.m_20270_(livingEntity78);
                                    } else {
                                        f21 = -1.0f;
                                    }
                                    if (f21 > 1.0f) {
                                        LivingEntity livingEntity79;
                                        LivingEntity livingEntity80;
                                        LivingEntity livingEntity81;
                                        LivingEntity livingEntity82;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity82 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity82 = null;
                                        }
                                        double d = livingEntity82.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity81 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity81 = null;
                                        }
                                        double d23 = livingEntity81.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity80 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity80 = null;
                                        }
                                        double d24 = d23 + (double)livingEntity80.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity79 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity79 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity79.m_20189_()));
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n55 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n55 = 0;
                                }
                                if (n55 == 13) {
                                    float f22;
                                    LivingEntity livingEntity83;
                                    if (world instanceof Level) {
                                        _level2 = (Level)world;
                                        if (!_level2.m_5776_()) {
                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                        } else {
                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity83 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity83 = null;
                                    }
                                    if (livingEntity83 != null) {
                                        LivingEntity livingEntity84;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity84 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity84 = null;
                                        }
                                        f22 = entity.m_20270_(livingEntity84);
                                    } else {
                                        f22 = -1.0f;
                                    }
                                    if (f22 > 40.0f) {
                                        LivingEntity livingEntity85;
                                        LivingEntity livingEntity86;
                                        LivingEntity livingEntity87;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity87 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity87 = null;
                                        }
                                        double d = (livingEntity87.m_20185_() - entity.m_20185_()) * 1.1;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity86 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity86 = null;
                                        }
                                        double d25 = (livingEntity86.m_20186_() - entity.m_20186_()) * 1.1;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity85 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity85 = null;
                                        }
                                        entity.m_20256_(new Vec3(d, d25, (livingEntity85.m_20189_() - entity.m_20189_()) * 1.1));
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n54 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n54 = 0;
                                }
                                if (n54 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                    _level2 = (ServerLevel)world;
                                    _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n53 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n53 = 0;
                                }
                                if (n53 == 16) {
                                    if (world instanceof Level) {
                                        _level2 = (Level)world;
                                        if (!_level2.m_5776_()) {
                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                        } else {
                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                        }
                                    }
                                    _center2 = new Vec3(x, y, z);
                                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                    for (Entity entityiterator : _entfound2) {
                                        float f23;
                                        if (entityiterator instanceof StarlightDeathEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            LivingEntity _livEnt6 = (LivingEntity)entityiterator;
                                            f23 = _livEnt6.m_21233_();
                                        } else {
                                            f23 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f23 / 4.0f + 2000000.0f);
                                        if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                        if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                            entityiterator.f_19802_ = 0;
                                            Deathlist.normalattack(entityiterator);
                                        }
                                        for (int index4 = 0; index4 < 2; ++index4) {
                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                        }
                                        if (entityiterator instanceof Titangodentity) continue;
                                        entityiterator.m_20256_(new Vec3(0.0, 4.0, 0.0));
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n52 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n52 = 0;
                                }
                                if (n52 == 32 && entity instanceof StarlightDeathEntity) {
                                    int n59;
                                    _datEntSetI = (StarlightDeathEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntI = (StarlightDeathEntity)entity;
                                        n59 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                                    } else {
                                        n59 = 0;
                                    }
                                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n59 - 1));
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n51 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n51 = 0;
                                }
                                if (n51 >= 32) {
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        _datEntSetI = (StarlightDeathEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof StarlightDeathEntity) {
                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                    }
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI4 = (StarlightDeathEntity)entity;
                                n10 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                            } else {
                                n10 = 0;
                            }
                            if (n10 != 4) break block558;
                            if (entity instanceof StarlightDeathEntity) {
                                ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.harvest");
                            }
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity = _mobEnt7.m_5448_();
                            } else {
                                livingEntity = null;
                            }
                            if (livingEntity != null) {
                                LivingEntity livingEntity88;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity88 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity88 = null;
                                }
                                f = entity.m_20270_(livingEntity88);
                            } else {
                                f = -1.0f;
                            }
                            if (f > 1.0f) {
                                LivingEntity livingEntity89;
                                LivingEntity livingEntity90;
                                LivingEntity livingEntity91;
                                LivingEntity livingEntity92;
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    v213 = _mobEnt5.m_5448_();
                                } else {
                                    v213 = _ent = null;
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity92 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity92 = null;
                                }
                                double d = livingEntity92.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity91 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity91 = null;
                                }
                                int n60 = (int)livingEntity91.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity90 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity90 = null;
                                }
                                double d26 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n60, (int)livingEntity90.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity89 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity89 = null;
                                }
                                _ent.m_6021_(d, d26, livingEntity89.m_20189_());
                                if (_ent instanceof ServerPlayer) {
                                    LivingEntity livingEntity93;
                                    LivingEntity livingEntity94;
                                    LivingEntity livingEntity95;
                                    LivingEntity livingEntity96;
                                    _serverPlayer = (ServerPlayer)_ent;
                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity96 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity96 = null;
                                    }
                                    double d27 = livingEntity96.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt13 = (Mob)entity;
                                        livingEntity95 = _mobEnt13.m_5448_();
                                    } else {
                                        livingEntity95 = null;
                                    }
                                    int n61 = (int)livingEntity95.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity94 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity94 = null;
                                    }
                                    double d28 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n61, (int)livingEntity94.m_20189_());
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity93 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity93 = null;
                                    }
                                    serverGamePacketListenerImpl.m_9774_(d27, d28, livingEntity93.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n9 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n9 = 0;
                            }
                            if (n9 == 1) {
                                float f24;
                                LivingEntity livingEntity97;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity97 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity97 = null;
                                }
                                if (livingEntity97 != null) {
                                    LivingEntity livingEntity98;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity98 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity98 = null;
                                    }
                                    f24 = entity.m_20270_(livingEntity98);
                                } else {
                                    f24 = -1.0f;
                                }
                                if (f24 > 1.0f) {
                                    LivingEntity livingEntity99;
                                    LivingEntity livingEntity100;
                                    LivingEntity livingEntity101;
                                    LivingEntity livingEntity102;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity102 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity102 = null;
                                    }
                                    double d = livingEntity102.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity101 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity101 = null;
                                    }
                                    double d29 = livingEntity101.m_20186_();
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity100 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity100 = null;
                                    }
                                    double d30 = d29 + (double)livingEntity100.m_20206_() / 1.5;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity99 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity99 = null;
                                    }
                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d30, livingEntity99.m_20189_()));
                                }
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n8 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n8 = 0;
                            }
                            if (n8 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                _level2 = (ServerLevel)world;
                                _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI2 = (StarlightDeathEntity)entity;
                                n7 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n7 = 0;
                            }
                            if (n7 == 5) break block559;
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI3 = (StarlightDeathEntity)entity;
                                n6 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n6 = 0;
                            }
                            if (n6 == 21) break block559;
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI = (StarlightDeathEntity)entity;
                                n5 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n5 = 0;
                            }
                            if (n5 != 25) break block560;
                        }
                        if (world instanceof Level) {
                            Level _level3 = (Level)world;
                            if (!_level3.m_5776_()) {
                                _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                            } else {
                                _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                            }
                        }
                    }
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI2 = (StarlightDeathEntity)entity;
                        n4 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n4 = 0;
                    }
                    if (n4 == 23) break block561;
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI3 = (StarlightDeathEntity)entity;
                        n3 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n3 = 0;
                    }
                    if (n3 != 27) break block562;
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    if (entityiterator instanceof StarlightDeathEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f / 4.0f + 2000000.0f);
                    if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                    if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    for (int index5 = 0; index5 < 2; ++index5) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                    }
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 == 47 && entity instanceof StarlightDeathEntity) {
                int n62;
                _datEntSetI = (StarlightDeathEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarlightDeathEntity) {
                    _datEntI = (StarlightDeathEntity)entity;
                    n62 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_SkillCount);
                } else {
                    n62 = 0;
                }
                synchedEntityData.m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)(n62 - 2));
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n = 0;
            }
            if (n >= 47) {
                if (entity instanceof StarlightDeathEntity) {
                    _datEntSetI = (StarlightDeathEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarlightDeathEntity) {
                    _datEntSetI = (StarlightDeathEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarlightDeathEntity) {
                    ((StarlightDeathEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

