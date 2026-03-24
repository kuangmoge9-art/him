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
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
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
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.Level$ExplosionInteraction
 *  net.minecraft.world.level.LevelAccessor
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
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
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
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class GiantwitherskeletonATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        LightningBolt entityToSpawn;
        LivingEntity _livEnt;
        int n2;
        int n3;
        int n4;
        LivingEntity _livEnt2;
        GiantwitherskeletonEntity _datEntI;
        LivingEntity _livEnt3;
        List<Entity> _entfound;
        int n5;
        Mob _mobEnt;
        Mob _mobEnt2;
        Mob _mobEnt3;
        Object _mobEnt4;
        Level _level;
        Object _datEntI2;
        GiantwitherskeletonEntity _datEntI3;
        GiantwitherskeletonEntity _datEntI4;
        double theta;
        block663: {
            LivingEntity livingEntity;
            LivingEntity _livEnt4;
            Mob _mobEnt5;
            GiantwitherskeletonEntity _datEntI5;
            block664: {
                block665: {
                    LivingEntity livingEntity2;
                    float f;
                    LivingEntity livingEntity3;
                    int n6;
                    GiantwitherskeletonEntity _datEntL130;
                    GiantwitherskeletonEntity _datEntI6;
                    float f2;
                    GiantwitherskeletonEntity _datEntSetI;
                    float f3;
                    LivingEntity _livEnt5;
                    LivingEntity _entity;
                    if (entity == null) {
                        return;
                    }
                    theta = 0.0;
                    ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                    if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                        _entity.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                    }
                    if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                        _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                    }
                    if (!world.m_5776_()) {
                        int n7;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI4 = (GiantwitherskeletonEntity)entity;
                            n7 = (Integer)_datEntI4.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
                        } else {
                            n7 = 0;
                        }
                        if (n7 != 0) {
                            float f4;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt6 = (LivingEntity)entity;
                                f4 = _livEnt6.m_21223_();
                            } else {
                                f4 = -1.0f;
                            }
                            if (f4 <= 0.0f) {
                                for (int index0 = 0; index0 < 16; ++index0) {
                                    if (!(entity instanceof GiantwitherskeletonEntity)) continue;
                                    ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                                }
                            }
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entity;
                        f3 = _livEnt5.m_21223_();
                    } else {
                        f3 = -1.0f;
                    }
                    if (f3 <= 0.0f) {
                        int n8;
                        int n9;
                        if (entity instanceof Mob) {
                            Mob _entity2 = (Mob)entity;
                            _entity2.m_6710_(null);
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            int n10;
                            _datEntSetI = (GiantwitherskeletonEntity)entity;
                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                            if (entity instanceof GiantwitherskeletonEntity) {
                                GiantwitherskeletonEntity _datEntI7 = (GiantwitherskeletonEntity)entity;
                                n10 = (Integer)_datEntI7.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_deathTick);
                            } else {
                                n10 = 0;
                            }
                            synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_deathTick, (Object)(n10 + 1));
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntSetI = (GiantwitherskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntSetI = (GiantwitherskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI3 = (GiantwitherskeletonEntity)entity;
                            n9 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_deathTick);
                        } else {
                            n9 = 0;
                        }
                        if (n9 <= 2 && world instanceof Level) {
                            Level _level2 = (Level)world;
                            if (!_level2.m_5776_()) {
                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                            } else {
                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                            }
                        }
                        if (!world.m_5776_() && entity instanceof GiantwitherskeletonEntity) {
                            ((GiantwitherskeletonEntity)entity).setHEALTS(0.0);
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI3 = (GiantwitherskeletonEntity)entity;
                            n8 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_deathTick);
                        } else {
                            n8 = 0;
                        }
                        if (n8 >= 160 && !entity.m_9236_().m_5776_()) {
                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entity;
                        f2 = _livEnt5.m_21223_();
                    } else {
                        f2 = -1.0f;
                    }
                    if (f2 > 0.0f) {
                        int n11;
                        int n12;
                        int n13;
                        GiantwitherskeletonEntity _datEntSetL;
                        GiantwitherskeletonEntity _datEntSetI2;
                        int n14;
                        int n15;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntSetI = (GiantwitherskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_deathTick, (Object)0);
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI3 = (GiantwitherskeletonEntity)entity;
                            n15 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n15 = 0;
                        }
                        if (n15 == 0) {
                            int n16;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entity3 = (LivingEntity)entity;
                                _entity3.m_21153_(20000.0f);
                            }
                            entity.m_6593_((Component)Component.m_237113_((String)"Witherskeletontitan(demi-titan)"));
                            if (entity instanceof GiantwitherskeletonEntity) {
                                GiantwitherskeletonEntity _datEntI8 = (GiantwitherskeletonEntity)entity;
                                n16 = (Integer)_datEntI8.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                            } else {
                                n16 = 0;
                            }
                            if (n16 <= 0) {
                                if (world instanceof Level && !(_level = (Level)world).m_5776_()) {
                                    _level.m_254849_(null, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), 0.0f, Level.ExplosionInteraction.NONE);
                                }
                                entity.f_19802_ = 20;
                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                                }
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    int n17;
                                    _datEntSetI = (GiantwitherskeletonEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntI5 = (GiantwitherskeletonEntity)entity;
                                        n17 = (Integer)_datEntI5.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                    } else {
                                        n17 = 0;
                                    }
                                    synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_growTick, (Object)(n17 + 4));
                                }
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntSetI = (GiantwitherskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                                }
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntSetI = (GiantwitherskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntSetL = (GiantwitherskeletonEntity)entity;
                                    _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)true);
                                }
                            } else {
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntSetL = (GiantwitherskeletonEntity)entity;
                                    _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)false);
                                }
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntSetI = (GiantwitherskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_growLevel, (Object)1);
                                }
                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.m_5776_()) {
                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                    } else {
                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                    }
                                }
                            }
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI3 = (GiantwitherskeletonEntity)entity;
                            n14 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n14 = 0;
                        }
                        if (n14 == 1) {
                            int n18;
                            entity.m_6593_((Component)Component.m_237113_((String)"Witherskeletontitan(demi-titan)"));
                            if (entity instanceof GiantwitherskeletonEntity) {
                                GiantwitherskeletonEntity _datEntI9 = (GiantwitherskeletonEntity)entity;
                                n18 = (Integer)_datEntI9.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_killCount);
                            } else {
                                n18 = 0;
                            }
                            if (n18 >= 20) {
                                int n19;
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntI6 = (GiantwitherskeletonEntity)entity;
                                    n19 = (Integer)_datEntI6.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                } else {
                                    n19 = 0;
                                }
                                if (n19 <= 200) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                                    }
                                    entity.f_19802_ = 20;
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        int n20;
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantwitherskeletonEntity) {
                                            _datEntI2 = (GiantwitherskeletonEntity)entity;
                                            n20 = (Integer)_datEntI2.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                        } else {
                                            n20 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_growTick, (Object)(n20 + 1));
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_killCount, (Object)20);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetL = (GiantwitherskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetL = (GiantwitherskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)false);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_growLevel, (Object)2);
                                    }
                                    if (world instanceof Level) {
                                        _level = (Level)world;
                                        if (!_level.m_5776_()) {
                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                        } else {
                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                        }
                                    }
                                }
                            }
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI3 = (GiantwitherskeletonEntity)entity;
                            n13 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n13 = 0;
                        }
                        if (n13 == 2) {
                            int n21;
                            entity.m_6593_((Component)Component.m_237113_((String)"Witherskeletontitan(extremely suppressed)"));
                            if (entity instanceof GiantwitherskeletonEntity) {
                                GiantwitherskeletonEntity _datEntI10 = (GiantwitherskeletonEntity)entity;
                                n21 = (Integer)_datEntI10.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_killCount);
                            } else {
                                n21 = 0;
                            }
                            if (n21 >= 50) {
                                int n22;
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntI6 = (GiantwitherskeletonEntity)entity;
                                    n22 = (Integer)_datEntI6.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                } else {
                                    n22 = 0;
                                }
                                if (n22 <= 500) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                                    }
                                    entity.f_19802_ = 20;
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        int n23;
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantwitherskeletonEntity) {
                                            _datEntI2 = (GiantwitherskeletonEntity)entity;
                                            n23 = (Integer)_datEntI2.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                        } else {
                                            n23 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_growTick, (Object)(n23 + 1));
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_killCount, (Object)50);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetL = (GiantwitherskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetL = (GiantwitherskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)false);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_growLevel, (Object)3);
                                    }
                                    if (world instanceof Level) {
                                        _level = (Level)world;
                                        if (!_level.m_5776_()) {
                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                        } else {
                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                        }
                                    }
                                }
                            }
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI3 = (GiantwitherskeletonEntity)entity;
                            n12 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n12 = 0;
                        }
                        if (n12 == 3) {
                            int n24;
                            entity.m_6593_((Component)Component.m_237113_((String)"Witherskeletontitan(heavily suppressed)"));
                            if (entity instanceof GiantwitherskeletonEntity) {
                                GiantwitherskeletonEntity _datEntI11 = (GiantwitherskeletonEntity)entity;
                                n24 = (Integer)_datEntI11.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_killCount);
                            } else {
                                n24 = 0;
                            }
                            if (n24 >= 100) {
                                int n25;
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntI6 = (GiantwitherskeletonEntity)entity;
                                    n25 = (Integer)_datEntI6.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                } else {
                                    n25 = 0;
                                }
                                if (n25 <= 900) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        int n26;
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantwitherskeletonEntity) {
                                            _datEntI2 = (GiantwitherskeletonEntity)entity;
                                            n26 = (Integer)_datEntI2.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                        } else {
                                            n26 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_growTick, (Object)(n26 + 1));
                                    }
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    entity.f_19802_ = 20;
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_killCount, (Object)100);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetL = (GiantwitherskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetL = (GiantwitherskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)false);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_growLevel, (Object)4);
                                    }
                                    if (world instanceof Level) {
                                        _level = (Level)world;
                                        if (!_level.m_5776_()) {
                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                        } else {
                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                        }
                                    }
                                }
                            }
                        }
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI3 = (GiantwitherskeletonEntity)entity;
                            n11 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n11 = 0;
                        }
                        if (n11 == 4) {
                            int n27;
                            entity.m_6593_((Component)Component.m_237113_((String)"Witherskeletontitan(suppressed)"));
                            if (entity instanceof GiantwitherskeletonEntity) {
                                GiantwitherskeletonEntity _datEntI12 = (GiantwitherskeletonEntity)entity;
                                n27 = (Integer)_datEntI12.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_killCount);
                            } else {
                                n27 = 0;
                            }
                            if (n27 >= 200) {
                                int n28;
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntI6 = (GiantwitherskeletonEntity)entity;
                                    n28 = (Integer)_datEntI6.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                } else {
                                    n28 = 0;
                                }
                                if (n28 >= -1100) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    entity.f_19802_ = 20;
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        int n29;
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantwitherskeletonEntity) {
                                            _datEntI2 = (GiantwitherskeletonEntity)entity;
                                            n29 = (Integer)_datEntI2.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
                                        } else {
                                            n29 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_growTick, (Object)(n29 - 4));
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI2 = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_killCount, (Object)200);
                                    }
                                    if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetL = (GiantwitherskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (!entity.m_9236_().m_5776_()) {
                                        entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                    }
                                    if (world instanceof ServerLevel) {
                                        _level = (ServerLevel)world;
                                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:witherskeletontitan ~ ~1 ~ {CustomName:'\"growing\"'}");
                                    }
                                    if (!world.m_5776_() && entity instanceof GiantwitherskeletonEntity) {
                                        ((GiantwitherskeletonEntity)entity).setHEALTS(0.0);
                                    }
                                }
                            }
                        }
                    }
                    if (entity instanceof GiantwitherskeletonEntity && (Boolean)(_datEntL130 = (GiantwitherskeletonEntity)entity).m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_glow) != false || world.m_5776_()) break block663;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI3 = (GiantwitherskeletonEntity)entity;
                        n6 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
                    } else {
                        n6 = 0;
                    }
                    if (n6 != 0 && entity instanceof GiantwitherskeletonEntity) {
                        int n30;
                        GiantwitherskeletonEntity _datEntSetI3 = (GiantwitherskeletonEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                        if (entity instanceof GiantwitherskeletonEntity) {
                            _datEntI6 = (GiantwitherskeletonEntity)entity;
                            n30 = (Integer)_datEntI6.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
                        } else {
                            n30 = 0;
                        }
                        synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)(n30 + 1));
                    }
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity3 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity3 = null;
                    }
                    if (livingEntity3 == null) break block664;
                    if (entity instanceof Mob) {
                        Mob _mobEnt6 = (Mob)entity;
                        v36 = _mobEnt6.m_5448_();
                    } else {
                        v36 = _datEntI2 = null;
                    }
                    if (_datEntI2 instanceof LivingEntity) {
                        _livEnt4 = _datEntI2;
                        f = _livEnt4.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= 0.0f) break block665;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity2 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (livingEntity2.m_6084_()) break block664;
                }
                if (entity instanceof Mob) {
                    Mob _entity = (Mob)entity;
                    _entity.m_6710_(null);
                }
            }
            if (entity instanceof Mob) {
                _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                float f;
                LivingEntity livingEntity4;
                LivingEntity livingEntity5;
                LivingEntity livingEntity6;
                LivingEntity livingEntity7;
                if (entity instanceof Mob) {
                    Mob _mobEnt7 = (Mob)entity;
                    livingEntity7 = _mobEnt7.m_5448_();
                } else {
                    livingEntity7 = null;
                }
                double d = livingEntity7.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity6 = _mobEnt3.m_5448_();
                } else {
                    livingEntity6 = null;
                }
                double d2 = livingEntity6.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt8 = (Mob)entity;
                    livingEntity5 = _mobEnt8.m_5448_();
                } else {
                    livingEntity5 = null;
                }
                double d3 = d2 + (double)livingEntity5.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt9 = (Mob)entity;
                    livingEntity4 = _mobEnt9.m_5448_();
                } else {
                    livingEntity4 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity4.m_20189_()));
                if (entity instanceof Mob) {
                    Mob _mobEnt10 = (Mob)entity;
                    v47 = _mobEnt10.m_5448_();
                } else {
                    v47 = _mobEnt4 = null;
                }
                if (_mobEnt4 instanceof LivingEntity) {
                    _livEnt4 = (LivingEntity)_mobEnt4;
                    f = _livEnt4.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    int n31;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI5 = (GiantwitherskeletonEntity)entity;
                        n31 = (Integer)_datEntI5.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
                    } else {
                        n31 = 0;
                    }
                    if (n31 == 0) {
                        float f5;
                        LivingEntity livingEntity8;
                        Mob _mobEnt11;
                        Mob _mobEnt12;
                        Mob _mobEnt13;
                        Mob _mobEnt14;
                        Mob _mobEnt15;
                        float f6;
                        LivingEntity livingEntity9;
                        float f7;
                        LivingEntity livingEntity10;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity10 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity10 = null;
                        }
                        if (livingEntity10 != null) {
                            LivingEntity livingEntity11;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity11 = _mobEnt.m_5448_();
                            } else {
                                livingEntity11 = null;
                            }
                            f7 = entity.m_20270_(livingEntity11);
                        } else {
                            f7 = -1.0f;
                        }
                        if (f7 >= 160.0f) {
                            entity.m_6858_(true);
                        } else {
                            entity.m_6858_(false);
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity9 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity9 = null;
                        }
                        if (livingEntity9 != null) {
                            LivingEntity livingEntity12;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity12 = _mobEnt.m_5448_();
                            } else {
                                livingEntity12 = null;
                            }
                            f6 = entity.m_20270_(livingEntity12);
                        } else {
                            f6 = -1.0f;
                        }
                        if (f6 > 60.0f) {
                            float f8;
                            LivingEntity livingEntity13;
                            LivingEntity livingEntity14;
                            float f9;
                            LivingEntity livingEntity15;
                            LivingEntity livingEntity16;
                            float f10;
                            LivingEntity livingEntity17;
                            LivingEntity livingEntity18;
                            if (entity instanceof Mob) {
                                _mobEnt15 = (Mob)entity;
                                livingEntity18 = _mobEnt15.m_5448_();
                            } else {
                                livingEntity18 = null;
                            }
                            double d4 = livingEntity18.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt14 = (Mob)entity;
                                livingEntity17 = _mobEnt14.m_5448_();
                            } else {
                                livingEntity17 = null;
                            }
                            if (livingEntity17 != null) {
                                LivingEntity livingEntity19;
                                if (entity instanceof Mob) {
                                    _mobEnt13 = (Mob)entity;
                                    livingEntity19 = _mobEnt13.m_5448_();
                                } else {
                                    livingEntity19 = null;
                                }
                                f10 = entity.m_20270_(livingEntity19);
                            } else {
                                f10 = -1.0f;
                            }
                            double d5 = d4 / (double)f10 * 2.0;
                            if (entity instanceof Mob) {
                                _mobEnt15 = (Mob)entity;
                                livingEntity16 = _mobEnt15.m_5448_();
                            } else {
                                livingEntity16 = null;
                            }
                            double d6 = livingEntity16.m_20186_() - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt14 = (Mob)entity;
                                livingEntity15 = _mobEnt14.m_5448_();
                            } else {
                                livingEntity15 = null;
                            }
                            if (livingEntity15 != null) {
                                LivingEntity livingEntity20;
                                if (entity instanceof Mob) {
                                    _mobEnt13 = (Mob)entity;
                                    livingEntity20 = _mobEnt13.m_5448_();
                                } else {
                                    livingEntity20 = null;
                                }
                                f9 = entity.m_20270_(livingEntity20);
                            } else {
                                f9 = -1.0f;
                            }
                            double d7 = d6 / (double)f9 * 0.2;
                            if (entity instanceof Mob) {
                                _mobEnt15 = (Mob)entity;
                                livingEntity14 = _mobEnt15.m_5448_();
                            } else {
                                livingEntity14 = null;
                            }
                            double d8 = livingEntity14.m_20189_() - entity.m_20189_();
                            if (entity instanceof Mob) {
                                _mobEnt14 = (Mob)entity;
                                livingEntity13 = _mobEnt14.m_5448_();
                            } else {
                                livingEntity13 = null;
                            }
                            if (livingEntity13 != null) {
                                LivingEntity livingEntity21;
                                if (entity instanceof Mob) {
                                    _mobEnt13 = (Mob)entity;
                                    livingEntity21 = _mobEnt13.m_5448_();
                                } else {
                                    livingEntity21 = null;
                                }
                                f8 = entity.m_20270_(livingEntity21);
                            } else {
                                f8 = -1.0f;
                            }
                            entity.m_20256_(new Vec3(d5, d7, d8 / (double)f8 * 2.0));
                        } else if (entity.m_20206_() > 8.0f) {
                            float f11;
                            LivingEntity livingEntity22;
                            if (entity instanceof Mob) {
                                _mobEnt13 = (Mob)entity;
                                livingEntity22 = _mobEnt13.m_5448_();
                            } else {
                                livingEntity22 = null;
                            }
                            if (livingEntity22 != null) {
                                LivingEntity livingEntity23;
                                if (entity instanceof Mob) {
                                    _mobEnt14 = (Mob)entity;
                                    livingEntity23 = _mobEnt14.m_5448_();
                                } else {
                                    livingEntity23 = null;
                                }
                                f11 = entity.m_20270_(livingEntity23);
                            } else {
                                f11 = -1.0f;
                            }
                            if ((double)f11 > (double)entity.m_20206_() / 1.5) {
                                float f12;
                                LivingEntity livingEntity24;
                                LivingEntity livingEntity25;
                                float f13;
                                LivingEntity livingEntity26;
                                LivingEntity livingEntity27;
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity27 = _mobEnt12.m_5448_();
                                } else {
                                    livingEntity27 = null;
                                }
                                double d9 = livingEntity27.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt11 = (Mob)entity;
                                    livingEntity26 = _mobEnt11.m_5448_();
                                } else {
                                    livingEntity26 = null;
                                }
                                if (livingEntity26 != null) {
                                    LivingEntity livingEntity28;
                                    if (entity instanceof Mob) {
                                        _mobEnt15 = (Mob)entity;
                                        livingEntity28 = _mobEnt15.m_5448_();
                                    } else {
                                        livingEntity28 = null;
                                    }
                                    f13 = entity.m_20270_(livingEntity28);
                                } else {
                                    f13 = -1.0f;
                                }
                                double d10 = d9 / (double)f13;
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity25 = _mobEnt12.m_5448_();
                                } else {
                                    livingEntity25 = null;
                                }
                                double d11 = livingEntity25.m_20189_() - entity.m_20189_();
                                if (entity instanceof Mob) {
                                    _mobEnt11 = (Mob)entity;
                                    livingEntity24 = _mobEnt11.m_5448_();
                                } else {
                                    livingEntity24 = null;
                                }
                                if (livingEntity24 != null) {
                                    LivingEntity livingEntity29;
                                    if (entity instanceof Mob) {
                                        _mobEnt15 = (Mob)entity;
                                        livingEntity29 = _mobEnt15.m_5448_();
                                    } else {
                                        livingEntity29 = null;
                                    }
                                    f12 = entity.m_20270_(livingEntity29);
                                } else {
                                    f12 = -1.0f;
                                }
                                entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f12));
                            }
                        } else {
                            float f14;
                            LivingEntity livingEntity30;
                            if (entity instanceof Mob) {
                                _mobEnt13 = (Mob)entity;
                                livingEntity30 = _mobEnt13.m_5448_();
                            } else {
                                livingEntity30 = null;
                            }
                            if (livingEntity30 != null) {
                                LivingEntity livingEntity31;
                                if (entity instanceof Mob) {
                                    _mobEnt14 = (Mob)entity;
                                    livingEntity31 = _mobEnt14.m_5448_();
                                } else {
                                    livingEntity31 = null;
                                }
                                f14 = entity.m_20270_(livingEntity31);
                            } else {
                                f14 = -1.0f;
                            }
                            if (f14 > 8.0f) {
                                float f15;
                                LivingEntity livingEntity32;
                                LivingEntity livingEntity33;
                                float f16;
                                LivingEntity livingEntity34;
                                LivingEntity livingEntity35;
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity35 = _mobEnt12.m_5448_();
                                } else {
                                    livingEntity35 = null;
                                }
                                double d12 = livingEntity35.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt11 = (Mob)entity;
                                    livingEntity34 = _mobEnt11.m_5448_();
                                } else {
                                    livingEntity34 = null;
                                }
                                if (livingEntity34 != null) {
                                    LivingEntity livingEntity36;
                                    if (entity instanceof Mob) {
                                        _mobEnt15 = (Mob)entity;
                                        livingEntity36 = _mobEnt15.m_5448_();
                                    } else {
                                        livingEntity36 = null;
                                    }
                                    f16 = entity.m_20270_(livingEntity36);
                                } else {
                                    f16 = -1.0f;
                                }
                                double d13 = d12 / (double)f16;
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity33 = _mobEnt12.m_5448_();
                                } else {
                                    livingEntity33 = null;
                                }
                                double d14 = livingEntity33.m_20189_() - entity.m_20189_();
                                if (entity instanceof Mob) {
                                    _mobEnt11 = (Mob)entity;
                                    livingEntity32 = _mobEnt11.m_5448_();
                                } else {
                                    livingEntity32 = null;
                                }
                                if (livingEntity32 != null) {
                                    LivingEntity livingEntity37;
                                    if (entity instanceof Mob) {
                                        _mobEnt15 = (Mob)entity;
                                        livingEntity37 = _mobEnt15.m_5448_();
                                    } else {
                                        livingEntity37 = null;
                                    }
                                    f15 = entity.m_20270_(livingEntity37);
                                } else {
                                    f15 = -1.0f;
                                }
                                entity.m_20256_(new Vec3(d13, 0.0, d14 / (double)f15));
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity8 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity8 = null;
                        }
                        if (livingEntity8 != null) {
                            LivingEntity livingEntity38;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity38 = _mobEnt.m_5448_();
                            } else {
                                livingEntity38 = null;
                            }
                            f5 = entity.m_20270_(livingEntity38);
                        } else {
                            f5 = -1.0f;
                        }
                        if (f5 < 160.0f) {
                            float f17;
                            LivingEntity livingEntity39;
                            if (entity instanceof Mob) {
                                _mobEnt13 = (Mob)entity;
                                livingEntity39 = _mobEnt13.m_5448_();
                            } else {
                                livingEntity39 = null;
                            }
                            if (livingEntity39 != null) {
                                LivingEntity livingEntity40;
                                if (entity instanceof Mob) {
                                    _mobEnt14 = (Mob)entity;
                                    livingEntity40 = _mobEnt14.m_5448_();
                                } else {
                                    livingEntity40 = null;
                                }
                                f17 = entity.m_20270_(livingEntity40);
                            } else {
                                f17 = -1.0f;
                            }
                            if (f17 <= entity.m_20206_()) {
                                if (((Boolean)SkeletonsConfiguration.ALLOW.get()).booleanValue()) {
                                    LivingEntity livingEntity41;
                                    if (entity instanceof Mob) {
                                        _mobEnt15 = (Mob)entity;
                                        livingEntity41 = _mobEnt15.m_5448_();
                                    } else {
                                        livingEntity41 = null;
                                    }
                                    if (livingEntity41.m_20206_() > 6.0f) {
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 1) {
                                            if (entity instanceof GiantwitherskeletonEntity) {
                                                _datEntSetI = (GiantwitherskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                            }
                                        } else if (entity instanceof GiantwitherskeletonEntity) {
                                            _datEntSetI = (GiantwitherskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                        }
                                    } else if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)5));
                                    }
                                } else {
                                    LivingEntity livingEntity42;
                                    if (entity instanceof Mob) {
                                        _mobEnt15 = (Mob)entity;
                                        livingEntity42 = _mobEnt15.m_5448_();
                                    } else {
                                        livingEntity42 = null;
                                    }
                                    if (livingEntity42.m_20206_() > 6.0f) {
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 1) {
                                            if (entity instanceof GiantwitherskeletonEntity) {
                                                _datEntSetI = (GiantwitherskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)3);
                                            }
                                        } else if (entity instanceof GiantwitherskeletonEntity) {
                                            _datEntSetI = (GiantwitherskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                        }
                                    } else if (entity instanceof GiantwitherskeletonEntity) {
                                        _datEntSetI = (GiantwitherskeletonEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)5));
                                    }
                                }
                            }
                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                int n32;
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    GiantwitherskeletonEntity _datEntI13 = (GiantwitherskeletonEntity)entity;
                                    n32 = (Integer)_datEntI13.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
                                } else {
                                    n32 = 0;
                                }
                                if (n32 == 0) {
                                    float f18;
                                    LivingEntity livingEntity43;
                                    if (entity instanceof Mob) {
                                        _mobEnt14 = (Mob)entity;
                                        livingEntity43 = _mobEnt14.m_5448_();
                                    } else {
                                        livingEntity43 = null;
                                    }
                                    if (livingEntity43 != null) {
                                        LivingEntity livingEntity44;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity44 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity44 = null;
                                        }
                                        f18 = entity.m_20270_(livingEntity44);
                                    } else {
                                        f18 = -1.0f;
                                    }
                                    if (f18 > 50.0f) {
                                        LivingEntity livingEntity45;
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity45 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity45 = null;
                                        }
                                        if (livingEntity45.m_20206_() > 6.0f) {
                                            if (entity instanceof GiantwitherskeletonEntity) {
                                                _datEntSetI = (GiantwitherskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)5));
                                            }
                                        } else if (entity instanceof GiantwitherskeletonEntity) {
                                            _datEntSetI = (GiantwitherskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)5));
                                        }
                                    } else {
                                        float f19;
                                        LivingEntity livingEntity46;
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity46 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity46 = null;
                                        }
                                        if (livingEntity46 != null) {
                                            LivingEntity livingEntity47;
                                            if (entity instanceof Mob) {
                                                _mobEnt12 = (Mob)entity;
                                                livingEntity47 = _mobEnt12.m_5448_();
                                            } else {
                                                livingEntity47 = null;
                                            }
                                            f19 = entity.m_20270_(livingEntity47);
                                        } else {
                                            f19 = -1.0f;
                                        }
                                        if (f19 > entity.m_20206_()) {
                                            LivingEntity livingEntity48;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt16 = (Mob)entity;
                                                livingEntity48 = _mobEnt16.m_5448_();
                                            } else {
                                                livingEntity48 = null;
                                            }
                                            if (livingEntity48.m_20206_() > 6.0f) {
                                                if (entity instanceof GiantwitherskeletonEntity) {
                                                    _datEntSetI = (GiantwitherskeletonEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                                }
                                            } else if (entity instanceof GiantwitherskeletonEntity) {
                                                _datEntSetI = (GiantwitherskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (entity.m_20186_() < -63.0) {
                    entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                }
            } else if (entity.m_20186_() < -63.0) {
                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
            }
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            _datEntI4 = (GiantwitherskeletonEntity)entity;
            n5 = (Integer)_datEntI4.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 1) {
            int n33;
            int n34;
            int n35;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                if (entity instanceof GiantwitherskeletonEntity) {
                    ((GiantwitherskeletonEntity)entity).setAnimation("animation.giantwitherskeleton.slap");
                }
            } else if (entity instanceof GiantwitherskeletonEntity) {
                ((GiantwitherskeletonEntity)entity).setAnimation("animation.giantwitherskeleton.slap2");
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n35 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt17 = (Mob)entity;
                    livingEntity = _mobEnt17.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity49;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity49 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity49 = null;
                    }
                    f = entity.m_20270_(livingEntity49);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity50;
                    LivingEntity livingEntity51;
                    LivingEntity livingEntity52;
                    LivingEntity livingEntity53;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity53 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity53 = null;
                    }
                    double d = livingEntity53.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity52 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity52 = null;
                    }
                    double d15 = livingEntity52.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity51 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity51 = null;
                    }
                    double d16 = d15 + (double)livingEntity51.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity50 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity50 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity50.m_20189_()));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n34 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 == 11) {
                if (world instanceof Level) {
                    Level _level3 = (Level)world;
                    if (!_level3.m_5776_()) {
                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 30.0, y, z + entity.m_20154_().f_82479_ * 30.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n36;
                    float f;
                    float f20;
                    int n37;
                    float f21;
                    float f22;
                    int n38;
                    float f23;
                    int n39;
                    float f24;
                    if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f24 = _livEnt3.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f25 = f24 / 40.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n39 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n39 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f25 + (float)(2400 * n39));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f23 = _livEnt3.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    float f26 = f23 / 40.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n38 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n38 = 0;
                    }
                    entityiterator.m_6469_(damageSource2, f26 + (float)(2400 * n38));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f22 = _livEnt2.m_21223_();
                    } else {
                        f22 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f21 = _livEnt3.m_21233_();
                    } else {
                        f21 = -1.0f;
                    }
                    float f27 = (f22 + f21) / 20.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n37 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n37 = 0;
                    }
                    entityiterator.m_6469_(damageSource3, f27 + (float)(12000 * n37));
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f20 = _livEnt2.m_21223_();
                    } else {
                        f20 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f = _livEnt3.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f28 = (f20 + f) / 20.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n36 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n36 = 0;
                    }
                    entityiterator.m_6469_(damageSource4, f28 + (float)(12000 * n36));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n33 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n33 = 0;
            }
            if (n33 >= 25) {
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            _datEntI4 = (GiantwitherskeletonEntity)entity;
            n4 = (Integer)_datEntI4.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 2) {
            int n40;
            int n41;
            int n42;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                if (entity instanceof GiantwitherskeletonEntity) {
                    ((GiantwitherskeletonEntity)entity).setAnimation("animation.giantwitherskeleton.atk");
                }
            } else if (entity instanceof GiantwitherskeletonEntity) {
                ((GiantwitherskeletonEntity)entity).setAnimation("animation.giantwitherskeleton.atk2");
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n42 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n42 = 0;
            }
            if (n42 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt18 = (Mob)entity;
                    livingEntity = _mobEnt18.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity54;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity54 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity54 = null;
                    }
                    f = entity.m_20270_(livingEntity54);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity55;
                    LivingEntity livingEntity56;
                    LivingEntity livingEntity57;
                    LivingEntity livingEntity58;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity58 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity58 = null;
                    }
                    double d = livingEntity58.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity57 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity57 = null;
                    }
                    double d17 = livingEntity57.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity56 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity56 = null;
                    }
                    double d18 = d17 + (double)livingEntity56.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity55 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity55 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity55.m_20189_()));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n41 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 == 11) {
                if (world instanceof Level) {
                    Level _level4 = (Level)world;
                    if (!_level4.m_5776_()) {
                        _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 30.0, y, z + entity.m_20154_().f_82479_ * 30.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n43;
                    float f;
                    float f29;
                    int n44;
                    float f30;
                    float f31;
                    int n45;
                    float f32;
                    int n46;
                    float f33;
                    if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f33 = _livEnt3.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    float f34 = f33 / 40.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n46 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n46 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f34 + (float)(2400 * n46));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f32 = _livEnt3.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    float f35 = f32 / 40.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n45 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n45 = 0;
                    }
                    entityiterator.m_6469_(damageSource5, f35 + (float)(2400 * n45));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f31 = _livEnt2.m_21223_();
                    } else {
                        f31 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f30 = _livEnt3.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    float f36 = (f31 + f30) / 20.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n44 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n44 = 0;
                    }
                    entityiterator.m_6469_(damageSource6, f36 + (float)(12000 * n44));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f29 = _livEnt2.m_21223_();
                    } else {
                        f29 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f = _livEnt3.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f37 = (f29 + f) / 20.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n43 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n43 = 0;
                    }
                    entityiterator.m_6469_(damageSource7, f37 + (float)(12000 * n43));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n40 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 >= 25) {
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            _datEntI4 = (GiantwitherskeletonEntity)entity;
            n3 = (Integer)_datEntI4.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 3) {
            int n47;
            int n48;
            int n49;
            if (entity instanceof GiantwitherskeletonEntity) {
                ((GiantwitherskeletonEntity)entity).setAnimation("animation.giantwitherskeleton.chomp");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n49 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n49 = 0;
            }
            if (n49 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt19 = (Mob)entity;
                    livingEntity = _mobEnt19.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity59;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity59 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity59 = null;
                    }
                    f = entity.m_20270_(livingEntity59);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity60;
                    LivingEntity livingEntity61;
                    LivingEntity livingEntity62;
                    LivingEntity livingEntity63;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity63 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity63 = null;
                    }
                    double d = livingEntity63.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity62 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity62 = null;
                    }
                    double d19 = livingEntity62.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity61 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity61 = null;
                    }
                    double d20 = d19 + (double)livingEntity61.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity60 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity60 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity60.m_20189_()));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n48 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 == 20) {
                if (world instanceof Level) {
                    Level _level5 = (Level)world;
                    if (!_level5.m_5776_()) {
                        _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n50;
                    float f;
                    float f38;
                    int n51;
                    float f39;
                    float f40;
                    int n52;
                    float f41;
                    int n53;
                    float f42;
                    if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f42 = _livEnt3.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    float f43 = f42 / 40.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n53 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n53 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f43 + (float)(1200 * n53));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f41 = _livEnt3.m_21233_();
                    } else {
                        f41 = -1.0f;
                    }
                    float f44 = f41 / 40.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n52 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n52 = 0;
                    }
                    entityiterator.m_6469_(damageSource8, f44 + (float)(1200 * n52));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f40 = _livEnt2.m_21223_();
                    } else {
                        f40 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f39 = _livEnt3.m_21233_();
                    } else {
                        f39 = -1.0f;
                    }
                    float f45 = (f40 + f39) / 20.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n51 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n51 = 0;
                    }
                    entityiterator.m_6469_(damageSource9, f45 + (float)(6000 * n51));
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f38 = _livEnt2.m_21223_();
                    } else {
                        f38 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f = _livEnt3.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f46 = (f38 + f) / 20.0f;
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI = (GiantwitherskeletonEntity)entity;
                        n50 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                    } else {
                        n50 = 0;
                    }
                    entityiterator.m_6469_(damageSource10, f46 + (float)(6000 * n50));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n47 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 >= 40) {
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            _datEntI4 = (GiantwitherskeletonEntity)entity;
            n2 = (Integer)_datEntI4.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 4) {
            int n54;
            int n55;
            int n56;
            int n57;
            if (entity instanceof GiantwitherskeletonEntity) {
                ((GiantwitherskeletonEntity)entity).setAnimation("animation.giantwitherskeleton.spread");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n57 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n57 = 0;
            }
            if (n57 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt20 = (Mob)entity;
                    livingEntity = _mobEnt20.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity64;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity64 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity64 = null;
                    }
                    f = entity.m_20270_(livingEntity64);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity65;
                    LivingEntity livingEntity66;
                    LivingEntity livingEntity67;
                    LivingEntity livingEntity68;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity68 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity68 = null;
                    }
                    double d = livingEntity68.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity67 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity67 = null;
                    }
                    double d21 = livingEntity67.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity66 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    double d22 = d21 + (double)livingEntity66.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity65 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity65 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity65.m_20189_()));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n56 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 >= 21) {
                int n58;
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntI14 = (GiantwitherskeletonEntity)entity;
                    n58 = (Integer)_datEntI14.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
                } else {
                    n58 = 0;
                }
                if (n58 <= 30) {
                    int n59;
                    Vec3 _center = new Vec3(x, y, z);
                    AABB aABB = new AABB(_center, _center);
                    if (entity instanceof GiantwitherskeletonEntity) {
                        _datEntI2 = (GiantwitherskeletonEntity)entity;
                        n59 = (Integer)_datEntI2.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
                    } else {
                        n59 = 0;
                    }
                    List<Entity> _entfound2 = world.m_6443_(Entity.class, aABB.m_82400_((double)(16 * (n59 - 19)) / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound2) {
                        int n60;
                        float f;
                        float f47;
                        int n61;
                        float f48;
                        float f49;
                        int n62;
                        float f50;
                        int n63;
                        float f51;
                        if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        double _setval = 2.0;
                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                            capability.camerashake = _setval;
                            capability.syncPlayerVariables(entityiterator);
                        });
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f51 = _livEnt2.m_21233_();
                        } else {
                            f51 = -1.0f;
                        }
                        float f52 = f51 / 40.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI15 = (GiantwitherskeletonEntity)entity;
                            n63 = (Integer)_datEntI15.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n63 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f52 + (float)(800 * n63));
                        if (!(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                        }
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f50 = _livEnt2.m_21233_();
                        } else {
                            f50 = -1.0f;
                        }
                        float f53 = f50 / 40.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI16 = (GiantwitherskeletonEntity)entity;
                            n62 = (Integer)_datEntI16.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n62 = 0;
                        }
                        entityiterator.m_6469_(damageSource11, f53 + (float)(800 * n62));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f49 = _livEnt.m_21223_();
                        } else {
                            f49 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f48 = _livEnt2.m_21233_();
                        } else {
                            f48 = -1.0f;
                        }
                        float f54 = (f49 + f48) / 20.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI17 = (GiantwitherskeletonEntity)entity;
                            n61 = (Integer)_datEntI17.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n61 = 0;
                        }
                        entityiterator.m_6469_(damageSource12, f54 + (float)(4000 * n61));
                        DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f47 = _livEnt.m_21223_();
                        } else {
                            f47 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f = _livEnt2.m_21233_();
                        } else {
                            f = -1.0f;
                        }
                        float f55 = (f47 + f) / 20.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI18 = (GiantwitherskeletonEntity)entity;
                            n60 = (Integer)_datEntI18.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n60 = 0;
                        }
                        entityiterator.m_6469_(damageSource13, f55 + (float)(4000 * n60));
                    }
                    if (theta >= 360.0) {
                        theta = 0.0;
                    }
                    if (theta == 0.0) {
                        for (int index1 = 0; index1 < 12; ++index1) {
                            if (world instanceof ServerLevel) {
                                int n64;
                                int n65;
                                _level = (ServerLevel)world;
                                entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntI = (GiantwitherskeletonEntity)entity;
                                    n65 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
                                } else {
                                    n65 = 0;
                                }
                                double d = x + (double)(32 * (n65 - 20)) * Math.cos(theta);
                                if (entity instanceof GiantwitherskeletonEntity) {
                                    _datEntI = (GiantwitherskeletonEntity)entity;
                                    n64 = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
                                } else {
                                    n64 = 0;
                                }
                                entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)(y + 0.1), (double)(z + (double)(16 * (n64 - 20)) * Math.cos(theta) * Math.sin(theta)))));
                                entityToSpawn.m_20874_(true);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                            theta += 8.0;
                        }
                    }
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n55 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 == 21 && world instanceof Level) {
                Level _level6 = (Level)world;
                if (!_level6.m_5776_()) {
                    _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n54 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 >= 42) {
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            _datEntI4 = (GiantwitherskeletonEntity)entity;
            n = (Integer)_datEntI4.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 5) {
            int n66;
            int n67;
            int n68;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof GiantwitherskeletonEntity) {
                ((GiantwitherskeletonEntity)entity).setAnimation("animation.giantwitherskeleton.ultimatelightning");
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n68 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n68 = 0;
            }
            if (n68 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt21 = (Mob)entity;
                    livingEntity = _mobEnt21.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity69;
                    if (entity instanceof Mob) {
                        Mob _mobEnt22 = (Mob)entity;
                        livingEntity69 = _mobEnt22.m_5448_();
                    } else {
                        livingEntity69 = null;
                    }
                    f = entity.m_20270_(livingEntity69);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity70;
                    LivingEntity livingEntity71;
                    LivingEntity livingEntity72;
                    LivingEntity livingEntity73;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity73 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity73 = null;
                    }
                    double d = livingEntity73.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity72 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity72 = null;
                    }
                    double d23 = livingEntity72.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity71 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity71 = null;
                    }
                    double d24 = d23 + (double)livingEntity71.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity70 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity70 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity70.m_20189_()));
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n67 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 == 22) {
                float f;
                LivingEntity livingEntity;
                if (world instanceof Level) {
                    Level _level7 = (Level)world;
                    if (!_level7.m_5776_()) {
                        _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity = _mobEnt23.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity74;
                    if (entity instanceof Mob) {
                        Mob _mobEnt24 = (Mob)entity;
                        livingEntity74 = _mobEnt24.m_5448_();
                    } else {
                        livingEntity74 = null;
                    }
                    f = entity.m_20270_(livingEntity74);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity75;
                    LivingEntity livingEntity76;
                    LivingEntity livingEntity77;
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity78;
                        LivingEntity livingEntity79;
                        LivingEntity livingEntity80;
                        _level = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity80 = _mobEnt.m_5448_();
                        } else {
                            livingEntity80 = null;
                        }
                        double d = livingEntity80.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity79 = _mobEnt.m_5448_();
                        } else {
                            livingEntity79 = null;
                        }
                        double d25 = livingEntity79.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity78 = _mobEnt.m_5448_();
                        } else {
                            livingEntity78 = null;
                        }
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)d25, (double)livingEntity78.m_20189_())));
                        entityToSpawn.m_20874_(true);
                        _level.m_7967_((Entity)entityToSpawn);
                    }
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity77 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity77 = null;
                    }
                    double d = livingEntity77.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity76 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity76 = null;
                    }
                    double d26 = livingEntity76.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity75 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity75 = null;
                    }
                    Vec3 _center = new Vec3(d, d26, livingEntity75.m_20189_());
                    List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound3) {
                        int n69;
                        float f56;
                        float f57;
                        int n70;
                        float f58;
                        float f59;
                        LivingEntity _livEnt7;
                        int n71;
                        float f60;
                        int n72;
                        float f61;
                        if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        double _setval = 4.0;
                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                            capability.camerashake = _setval;
                            capability.syncPlayerVariables(entityiterator);
                        });
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f61 = _livEnt.m_21233_();
                        } else {
                            f61 = -1.0f;
                        }
                        float f62 = f61 / 40.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI19 = (GiantwitherskeletonEntity)entity;
                            n72 = (Integer)_datEntI19.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n72 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f62 + (float)(1600 * n72));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f60 = _livEnt.m_21233_();
                        } else {
                            f60 = -1.0f;
                        }
                        float f63 = f60 / 40.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI20 = (GiantwitherskeletonEntity)entity;
                            n71 = (Integer)_datEntI20.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n71 = 0;
                        }
                        entityiterator.m_6469_(damageSource14, f63 + (float)(1600 * n71));
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f59 = _livEnt7.m_21223_();
                        } else {
                            f59 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f58 = _livEnt.m_21233_();
                        } else {
                            f58 = -1.0f;
                        }
                        float f64 = (f59 + f58) / 20.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI21 = (GiantwitherskeletonEntity)entity;
                            n70 = (Integer)_datEntI21.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n70 = 0;
                        }
                        entityiterator.m_6469_(damageSource15, f64 + (float)(8000 * n70));
                        DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f57 = _livEnt7.m_21223_();
                        } else {
                            f57 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f56 = _livEnt.m_21233_();
                        } else {
                            f56 = -1.0f;
                        }
                        float f65 = (f57 + f56) / 20.0f;
                        if (entity instanceof GiantwitherskeletonEntity) {
                            GiantwitherskeletonEntity _datEntI22 = (GiantwitherskeletonEntity)entity;
                            n69 = (Integer)_datEntI22.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growLevel);
                        } else {
                            n69 = 0;
                        }
                        entityiterator.m_6469_(damageSource16, f65 + (float)(8000 * n69));
                    }
                }
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntI3 = (GiantwitherskeletonEntity)entity;
                n66 = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_animationTick);
            } else {
                n66 = 0;
            }
            if (n66 >= 40) {
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity _datEntSetI = (GiantwitherskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantwitherskeletonEntity) {
                    ((GiantwitherskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

