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
 *  net.minecraft.world.entity.projectile.Projectile
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
import net.mcreator.ultimateskeletons.entity.SkeletonharrawEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
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
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class GiantskeletonATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        LivingEntity _livEnt;
        int n3;
        int n4;
        int n5;
        LivingEntity _livEnt2;
        GiantskeletonEntity _datEntI;
        LivingEntity _livEnt3;
        List<Entity> _entfound;
        int n6;
        Mob _mobEnt;
        Object _mobEnt2;
        Mob _mobEnt3;
        Mob _mobEnt4;
        Object _mobEnt5;
        Mob _mobEnt6;
        Level _level;
        Object _datEntI2;
        GiantskeletonEntity _datEntI3;
        GiantskeletonEntity _datEntI4;
        block699: {
            LivingEntity livingEntity;
            LivingEntity _livEnt4;
            GiantskeletonEntity _datEntI5;
            block700: {
                block701: {
                    LivingEntity livingEntity2;
                    float f;
                    LivingEntity livingEntity3;
                    int n7;
                    GiantskeletonEntity _datEntL134;
                    GiantskeletonEntity _datEntI6;
                    float f2;
                    GiantskeletonEntity _datEntSetI;
                    float f3;
                    LivingEntity _livEnt5;
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
                    if (!world.m_5776_()) {
                        int n8;
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI4 = (GiantskeletonEntity)entity;
                            n8 = (Integer)_datEntI4.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
                        } else {
                            n8 = 0;
                        }
                        if (n8 != 0) {
                            float f4;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt6 = (LivingEntity)entity;
                                f4 = _livEnt6.m_21223_();
                            } else {
                                f4 = -1.0f;
                            }
                            if (f4 <= 0.0f) {
                                for (int index0 = 0; index0 < 16; ++index0) {
                                    if (!(entity instanceof GiantskeletonEntity)) continue;
                                    ((GiantskeletonEntity)entity).setAnimation("empty");
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
                    if (f3 <= 1.0f) {
                        int n9;
                        int n10;
                        if (entity instanceof Mob) {
                            Mob _entity2 = (Mob)entity;
                            _entity2.m_6710_(null);
                        }
                        entity.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage")))), 1.0E8f);
                        if (!world.m_5776_() && entity instanceof GiantskeletonEntity) {
                            ((GiantskeletonEntity)entity).setHEALTS(0.0);
                        }
                        if (entity instanceof GiantskeletonEntity) {
                            int n11;
                            _datEntSetI = (GiantskeletonEntity)entity;
                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                            if (entity instanceof GiantskeletonEntity) {
                                GiantskeletonEntity _datEntI7 = (GiantskeletonEntity)entity;
                                n11 = (Integer)_datEntI7.m_20088_().m_135370_(GiantskeletonEntity.DATA_deathTick);
                            } else {
                                n11 = 0;
                            }
                            synchedEntityData.m_135381_(GiantskeletonEntity.DATA_deathTick, (Object)(n11 + 1));
                        }
                        if (entity instanceof GiantskeletonEntity) {
                            ((GiantskeletonEntity)entity).setAnimation("empty");
                        }
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntSetI = (GiantskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                        }
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntSetI = (GiantskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                        }
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI3 = (GiantskeletonEntity)entity;
                            n10 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_deathTick);
                        } else {
                            n10 = 0;
                        }
                        if (n10 <= 2 && world instanceof Level) {
                            Level _level2 = (Level)world;
                            if (!_level2.m_5776_()) {
                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                            } else {
                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                            }
                        }
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI3 = (GiantskeletonEntity)entity;
                            n9 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_deathTick);
                        } else {
                            n9 = 0;
                        }
                        if (n9 >= 160) {
                            if (!world.m_5776_() && entity instanceof GiantskeletonEntity) {
                                ((GiantskeletonEntity)entity).setHEALTS(0.0);
                            }
                            Deathlist.normalattack(entity);
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
                        int n12;
                        int n13;
                        int n14;
                        GiantskeletonEntity _datEntSetL;
                        GiantskeletonEntity _datEntSetI2;
                        int n15;
                        int n16;
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntSetI = (GiantskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_deathTick, (Object)0);
                        }
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI3 = (GiantskeletonEntity)entity;
                            n16 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n16 = 0;
                        }
                        if (n16 == 0) {
                            int n17;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entity3 = (LivingEntity)entity;
                                _entity3.m_21153_(6000.0f);
                            }
                            entity.m_6593_((Component)Component.m_237113_((String)"Skeletontitan(demi-titan)"));
                            if (entity instanceof GiantskeletonEntity) {
                                GiantskeletonEntity _datEntI8 = (GiantskeletonEntity)entity;
                                n17 = (Integer)_datEntI8.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                            } else {
                                n17 = 0;
                            }
                            if (n17 <= 0) {
                                if (world instanceof Level && !(_level = (Level)world).m_5776_()) {
                                    _level.m_254849_(null, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), 0.0f, Level.ExplosionInteraction.NONE);
                                }
                                entity.f_19802_ = 20;
                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                if (entity instanceof GiantskeletonEntity) {
                                    ((GiantskeletonEntity)entity).setAnimation("empty");
                                }
                                if (entity instanceof GiantskeletonEntity) {
                                    int n18;
                                    _datEntSetI = (GiantskeletonEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntI5 = (GiantskeletonEntity)entity;
                                        n18 = (Integer)_datEntI5.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                    } else {
                                        n18 = 0;
                                    }
                                    synchedEntityData.m_135381_(GiantskeletonEntity.DATA_growTick, (Object)(n18 + 4));
                                }
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntSetI = (GiantskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                                }
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntSetI = (GiantskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntSetL = (GiantskeletonEntity)entity;
                                    _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)true);
                                }
                            } else {
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntSetL = (GiantskeletonEntity)entity;
                                    _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)false);
                                }
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntSetI = (GiantskeletonEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_growLevel, (Object)1);
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
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI3 = (GiantskeletonEntity)entity;
                            n15 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n15 = 0;
                        }
                        if (n15 == 1) {
                            int n19;
                            entity.m_6593_((Component)Component.m_237113_((String)"Skeletontitan(demi-titan)"));
                            if (entity instanceof GiantskeletonEntity) {
                                GiantskeletonEntity _datEntI9 = (GiantskeletonEntity)entity;
                                n19 = (Integer)_datEntI9.m_20088_().m_135370_(GiantskeletonEntity.DATA_killCount);
                            } else {
                                n19 = 0;
                            }
                            if (n19 >= 20) {
                                int n20;
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntI6 = (GiantskeletonEntity)entity;
                                    n20 = (Integer)_datEntI6.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                } else {
                                    n20 = 0;
                                }
                                if (n20 <= 200) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    if (entity instanceof GiantskeletonEntity) {
                                        ((GiantskeletonEntity)entity).setAnimation("empty");
                                    }
                                    entity.f_19802_ = 20;
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    if (entity instanceof GiantskeletonEntity) {
                                        int n21;
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantskeletonEntity) {
                                            _datEntI2 = (GiantskeletonEntity)entity;
                                            n21 = (Integer)_datEntI2.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                        } else {
                                            n21 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantskeletonEntity.DATA_growTick, (Object)(n21 + 1));
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_killCount, (Object)20);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetL = (GiantskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetL = (GiantskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)false);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_growLevel, (Object)2);
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
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI3 = (GiantskeletonEntity)entity;
                            n14 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n14 = 0;
                        }
                        if (n14 == 2) {
                            int n22;
                            entity.m_6593_((Component)Component.m_237113_((String)"Skeletontitan(extremely suppressed)"));
                            if (entity instanceof GiantskeletonEntity) {
                                GiantskeletonEntity _datEntI10 = (GiantskeletonEntity)entity;
                                n22 = (Integer)_datEntI10.m_20088_().m_135370_(GiantskeletonEntity.DATA_killCount);
                            } else {
                                n22 = 0;
                            }
                            if (n22 >= 50) {
                                int n23;
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntI6 = (GiantskeletonEntity)entity;
                                    n23 = (Integer)_datEntI6.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                } else {
                                    n23 = 0;
                                }
                                if (n23 <= 400) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    if (entity instanceof GiantskeletonEntity) {
                                        ((GiantskeletonEntity)entity).setAnimation("empty");
                                    }
                                    entity.f_19802_ = 20;
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    if (entity instanceof GiantskeletonEntity) {
                                        int n24;
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantskeletonEntity) {
                                            _datEntI2 = (GiantskeletonEntity)entity;
                                            n24 = (Integer)_datEntI2.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                        } else {
                                            n24 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantskeletonEntity.DATA_growTick, (Object)(n24 + 1));
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_killCount, (Object)50);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetL = (GiantskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetL = (GiantskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)false);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_growLevel, (Object)3);
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
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI3 = (GiantskeletonEntity)entity;
                            n13 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n13 = 0;
                        }
                        if (n13 == 3) {
                            int n25;
                            entity.m_6593_((Component)Component.m_237113_((String)"Skeletontitan(heavily suppressed)"));
                            if (entity instanceof GiantskeletonEntity) {
                                GiantskeletonEntity _datEntI11 = (GiantskeletonEntity)entity;
                                n25 = (Integer)_datEntI11.m_20088_().m_135370_(GiantskeletonEntity.DATA_killCount);
                            } else {
                                n25 = 0;
                            }
                            if (n25 >= 100) {
                                int n26;
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntI6 = (GiantskeletonEntity)entity;
                                    n26 = (Integer)_datEntI6.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                } else {
                                    n26 = 0;
                                }
                                if (n26 <= 600) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    if (entity instanceof GiantskeletonEntity) {
                                        ((GiantskeletonEntity)entity).setAnimation("empty");
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        int n27;
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantskeletonEntity) {
                                            _datEntI2 = (GiantskeletonEntity)entity;
                                            n27 = (Integer)_datEntI2.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                        } else {
                                            n27 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantskeletonEntity.DATA_growTick, (Object)(n27 + 1));
                                    }
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    entity.f_19802_ = 20;
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_killCount, (Object)100);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetL = (GiantskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetL = (GiantskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)false);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_growLevel, (Object)4);
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
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI3 = (GiantskeletonEntity)entity;
                            n12 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n12 = 0;
                        }
                        if (n12 == 4) {
                            int n28;
                            entity.m_6593_((Component)Component.m_237113_((String)"Skeletontitan(suppressed)"));
                            if (entity instanceof GiantskeletonEntity) {
                                GiantskeletonEntity _datEntI12 = (GiantskeletonEntity)entity;
                                n28 = (Integer)_datEntI12.m_20088_().m_135370_(GiantskeletonEntity.DATA_killCount);
                            } else {
                                n28 = 0;
                            }
                            if (n28 >= 200) {
                                int n29;
                                if (entity instanceof GiantskeletonEntity) {
                                    _datEntI6 = (GiantskeletonEntity)entity;
                                    n29 = (Integer)_datEntI6.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                } else {
                                    n29 = 0;
                                }
                                if (n29 >= -600) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    entity.f_19802_ = 20;
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    if (entity instanceof GiantskeletonEntity) {
                                        ((GiantskeletonEntity)entity).setAnimation("empty");
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        int n30;
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                        if (entity instanceof GiantskeletonEntity) {
                                            _datEntI2 = (GiantskeletonEntity)entity;
                                            n30 = (Integer)_datEntI2.m_20088_().m_135370_(GiantskeletonEntity.DATA_growTick);
                                        } else {
                                            n30 = 0;
                                        }
                                        synchedEntityData.m_135381_(GiantskeletonEntity.DATA_growTick, (Object)(n30 - 4));
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI2 = (GiantskeletonEntity)entity;
                                        _datEntSetI2.m_20088_().m_135381_(GiantskeletonEntity.DATA_killCount, (Object)200);
                                    }
                                    if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetL = (GiantskeletonEntity)entity;
                                        _datEntSetL.m_20088_().m_135381_(GiantskeletonEntity.DATA_glow, (Object)true);
                                    }
                                } else {
                                    if (!world.m_5776_() && entity instanceof GiantskeletonEntity) {
                                        ((GiantskeletonEntity)entity).setHEALTS(0.0);
                                    }
                                    if (!entity.m_9236_().m_5776_()) {
                                        entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                    }
                                    if (world instanceof ServerLevel) {
                                        _level = (ServerLevel)world;
                                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:skeletontitan ~ ~1 ~ {CustomName:'\"growing\"'}");
                                    }
                                }
                            }
                        }
                    }
                    if (entity instanceof GiantskeletonEntity && (Boolean)(_datEntL134 = (GiantskeletonEntity)entity).m_20088_().m_135370_(GiantskeletonEntity.DATA_glow) != false || world.m_5776_()) break block699;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI3 = (GiantskeletonEntity)entity;
                        n7 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
                    } else {
                        n7 = 0;
                    }
                    if (n7 != 0 && entity instanceof GiantskeletonEntity) {
                        int n31;
                        GiantskeletonEntity _datEntSetI3 = (GiantskeletonEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                        if (entity instanceof GiantskeletonEntity) {
                            _datEntI6 = (GiantskeletonEntity)entity;
                            n31 = (Integer)_datEntI6.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
                        } else {
                            n31 = 0;
                        }
                        synchedEntityData.m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)(n31 + 1));
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity3 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity3 = null;
                    }
                    if (livingEntity3 == null) break block700;
                    if (entity instanceof Mob) {
                        Mob _mobEnt7 = (Mob)entity;
                        v36 = _mobEnt7.m_5448_();
                    } else {
                        v36 = _datEntI2 = null;
                    }
                    if (_datEntI2 instanceof LivingEntity) {
                        _livEnt4 = _datEntI2;
                        f = _livEnt4.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= 0.0f) break block701;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity2 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (livingEntity2.m_6084_()) break block700;
                }
                if (entity instanceof Mob) {
                    Mob _entity = (Mob)entity;
                    _entity.m_6710_(null);
                }
            }
            if (entity instanceof Mob) {
                _mobEnt6 = (Mob)entity;
                livingEntity = _mobEnt6.m_5448_();
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
                    Mob _mobEnt8 = (Mob)entity;
                    livingEntity7 = _mobEnt8.m_5448_();
                } else {
                    livingEntity7 = null;
                }
                double d = livingEntity7.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity6 = _mobEnt4.m_5448_();
                } else {
                    livingEntity6 = null;
                }
                double d2 = livingEntity6.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt9 = (Mob)entity;
                    livingEntity5 = _mobEnt9.m_5448_();
                } else {
                    livingEntity5 = null;
                }
                double d3 = d2 + (double)livingEntity5.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt10 = (Mob)entity;
                    livingEntity4 = _mobEnt10.m_5448_();
                } else {
                    livingEntity4 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity4.m_20189_()));
                if (entity instanceof Mob) {
                    Mob _mobEnt11 = (Mob)entity;
                    v47 = _mobEnt11.m_5448_();
                } else {
                    v47 = _mobEnt5 = null;
                }
                if (_mobEnt5 instanceof LivingEntity) {
                    _livEnt4 = (LivingEntity)_mobEnt5;
                    f = _livEnt4.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    int n32;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI5 = (GiantskeletonEntity)entity;
                        n32 = (Integer)_datEntI5.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
                    } else {
                        n32 = 0;
                    }
                    if (n32 == 0) {
                        float f5;
                        LivingEntity livingEntity8;
                        Mob _mobEnt12;
                        Mob _mobEnt13;
                        Mob _mobEnt14;
                        Mob _mobEnt15;
                        float f6;
                        LivingEntity livingEntity9;
                        float f7;
                        LivingEntity livingEntity10;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity10 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity10 = null;
                        }
                        if (livingEntity10 != null) {
                            LivingEntity livingEntity11;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity11 = _mobEnt2.m_5448_();
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
                            _mobEnt3 = (Mob)entity;
                            livingEntity9 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity9 = null;
                        }
                        if (livingEntity9 != null) {
                            LivingEntity livingEntity12;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity12 = _mobEnt2.m_5448_();
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
                                    _mobEnt = (Mob)entity;
                                    livingEntity19 = _mobEnt.m_5448_();
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
                                    _mobEnt = (Mob)entity;
                                    livingEntity20 = _mobEnt.m_5448_();
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
                                    _mobEnt = (Mob)entity;
                                    livingEntity21 = _mobEnt.m_5448_();
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
                                _mobEnt = (Mob)entity;
                                livingEntity22 = _mobEnt.m_5448_();
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
                                    _mobEnt13 = (Mob)entity;
                                    livingEntity27 = _mobEnt13.m_5448_();
                                } else {
                                    livingEntity27 = null;
                                }
                                double d9 = livingEntity27.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity26 = _mobEnt12.m_5448_();
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
                                    _mobEnt13 = (Mob)entity;
                                    livingEntity25 = _mobEnt13.m_5448_();
                                } else {
                                    livingEntity25 = null;
                                }
                                double d11 = livingEntity25.m_20189_() - entity.m_20189_();
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity24 = _mobEnt12.m_5448_();
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
                                _mobEnt = (Mob)entity;
                                livingEntity30 = _mobEnt.m_5448_();
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
                            if (f14 > 6.0f) {
                                float f15;
                                LivingEntity livingEntity32;
                                LivingEntity livingEntity33;
                                float f16;
                                LivingEntity livingEntity34;
                                LivingEntity livingEntity35;
                                if (entity instanceof Mob) {
                                    _mobEnt13 = (Mob)entity;
                                    livingEntity35 = _mobEnt13.m_5448_();
                                } else {
                                    livingEntity35 = null;
                                }
                                double d12 = livingEntity35.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity34 = _mobEnt12.m_5448_();
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
                                    _mobEnt13 = (Mob)entity;
                                    livingEntity33 = _mobEnt13.m_5448_();
                                } else {
                                    livingEntity33 = null;
                                }
                                double d14 = livingEntity33.m_20189_() - entity.m_20189_();
                                if (entity instanceof Mob) {
                                    _mobEnt12 = (Mob)entity;
                                    livingEntity32 = _mobEnt12.m_5448_();
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
                            _mobEnt3 = (Mob)entity;
                            livingEntity8 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity8 = null;
                        }
                        if (livingEntity8 != null) {
                            LivingEntity livingEntity38;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity38 = _mobEnt2.m_5448_();
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
                                _mobEnt = (Mob)entity;
                                livingEntity39 = _mobEnt.m_5448_();
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
                                            if (entity instanceof GiantskeletonEntity) {
                                                _datEntSetI = (GiantskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                            }
                                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 2) {
                                            if (entity instanceof GiantskeletonEntity) {
                                                _datEntSetI = (GiantskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)6);
                                            }
                                        } else if (entity instanceof GiantskeletonEntity) {
                                            _datEntSetI = (GiantskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                        }
                                    } else if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI = (GiantskeletonEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)5));
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
                                            if (entity instanceof GiantskeletonEntity) {
                                                _datEntSetI = (GiantskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)3);
                                            }
                                        } else if (entity instanceof GiantskeletonEntity) {
                                            _datEntSetI = (GiantskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                        }
                                    } else if (entity instanceof GiantskeletonEntity) {
                                        _datEntSetI = (GiantskeletonEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)5));
                                    }
                                }
                            }
                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                int n33;
                                if (entity instanceof GiantskeletonEntity) {
                                    GiantskeletonEntity _datEntI13 = (GiantskeletonEntity)entity;
                                    n33 = (Integer)_datEntI13.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
                                } else {
                                    n33 = 0;
                                }
                                if (n33 == 0) {
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
                                    if (f18 > 40.0f) {
                                        LivingEntity livingEntity45;
                                        if (entity instanceof Mob) {
                                            _mobEnt12 = (Mob)entity;
                                            livingEntity45 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity45 = null;
                                        }
                                        if (livingEntity45.m_20206_() > 6.0f) {
                                            if (entity instanceof GiantskeletonEntity) {
                                                _datEntSetI = (GiantskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)6));
                                            }
                                        } else if (entity instanceof GiantskeletonEntity) {
                                            _datEntSetI = (GiantskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)6));
                                        }
                                    } else {
                                        float f19;
                                        LivingEntity livingEntity46;
                                        if (entity instanceof Mob) {
                                            _mobEnt12 = (Mob)entity;
                                            livingEntity46 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity46 = null;
                                        }
                                        if (livingEntity46 != null) {
                                            LivingEntity livingEntity47;
                                            if (entity instanceof Mob) {
                                                _mobEnt13 = (Mob)entity;
                                                livingEntity47 = _mobEnt13.m_5448_();
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
                                                if (entity instanceof GiantskeletonEntity) {
                                                    _datEntSetI = (GiantskeletonEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                                }
                                            } else if (entity instanceof GiantskeletonEntity) {
                                                _datEntSetI = (GiantskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)6));
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
        if (entity instanceof GiantskeletonEntity) {
            _datEntI4 = (GiantskeletonEntity)entity;
            n6 = (Integer)_datEntI4.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 1) {
            int n34;
            int n35;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.slap");
                }
            } else if (entity instanceof GiantskeletonEntity) {
                ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.slap2");
            }
            if (entity instanceof Mob) {
                _mobEnt6 = (Mob)entity;
                livingEntity = _mobEnt6.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity49;
                if (entity instanceof Mob) {
                    Mob _mobEnt17 = (Mob)entity;
                    livingEntity49 = _mobEnt17.m_5448_();
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
                    _mobEnt5 = (Mob)entity;
                    livingEntity52 = _mobEnt5.m_5448_();
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
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n35 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 == 11) {
                if (world instanceof Level) {
                    Level _level3 = (Level)world;
                    if (!_level3.m_5776_()) {
                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 20.0, y, z + entity.m_20154_().f_82479_ * 20.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n36;
                    float f20;
                    float f21;
                    int n37;
                    float f22;
                    float f23;
                    int n38;
                    float f24;
                    int n39;
                    float f25;
                    if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f25 = _livEnt3.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    float f26 = f25 / 40.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n39 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n39 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f26 + (float)(960 * n39));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f24 = _livEnt3.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f27 = f24 / 40.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n38 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n38 = 0;
                    }
                    entityiterator.m_6469_(damageSource2, f27 + (float)(960 * n38));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f23 = _livEnt2.m_21223_();
                    } else {
                        f23 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f22 = _livEnt3.m_21233_();
                    } else {
                        f22 = -1.0f;
                    }
                    float f28 = (f23 + f22) / 20.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n37 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n37 = 0;
                    }
                    entityiterator.m_6469_(damageSource3, f28 + (float)(4800 * n37));
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f21 = _livEnt2.m_21223_();
                    } else {
                        f21 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f20 = _livEnt3.m_21233_();
                    } else {
                        f20 = -1.0f;
                    }
                    float f29 = (f21 + f20) / 20.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n36 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n36 = 0;
                    }
                    entityiterator.m_6469_(damageSource4, f29 + (float)(4800 * n36));
                }
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n34 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 >= 25) {
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantskeletonEntity) {
            _datEntI4 = (GiantskeletonEntity)entity;
            n5 = (Integer)_datEntI4.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 2) {
            int n40;
            int n41;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.atk");
                }
            } else if (entity instanceof GiantskeletonEntity) {
                ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.atk2");
            }
            if (entity instanceof Mob) {
                _mobEnt6 = (Mob)entity;
                livingEntity = _mobEnt6.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity54;
                if (entity instanceof Mob) {
                    Mob _mobEnt18 = (Mob)entity;
                    livingEntity54 = _mobEnt18.m_5448_();
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
                    _mobEnt5 = (Mob)entity;
                    livingEntity57 = _mobEnt5.m_5448_();
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
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n41 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
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
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 20.0, y, z + entity.m_20154_().f_82479_ * 20.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n42;
                    float f30;
                    float f31;
                    int n43;
                    float f32;
                    float f33;
                    int n44;
                    float f34;
                    int n45;
                    float f35;
                    if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f35 = _livEnt3.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    float f36 = f35 / 40.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n45 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n45 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f36 + (float)(960 * n45));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f34 = _livEnt3.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f37 = f34 / 40.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n44 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n44 = 0;
                    }
                    entityiterator.m_6469_(damageSource5, f37 + (float)(960 * n44));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f33 = _livEnt2.m_21223_();
                    } else {
                        f33 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f32 = _livEnt3.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    float f38 = (f33 + f32) / 20.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n43 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n43 = 0;
                    }
                    entityiterator.m_6469_(damageSource6, f38 + (float)(4800 * n43));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
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
                    float f39 = (f31 + f30) / 20.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n42 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n42 = 0;
                    }
                    entityiterator.m_6469_(damageSource7, f39 + (float)(4800 * n42));
                }
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n40 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 >= 25) {
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantskeletonEntity) {
            _datEntI4 = (GiantskeletonEntity)entity;
            n4 = (Integer)_datEntI4.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 3) {
            int n46;
            int n47;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof GiantskeletonEntity) {
                ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.chomp");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt6 = (Mob)entity;
                livingEntity = _mobEnt6.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity59;
                if (entity instanceof Mob) {
                    Mob _mobEnt19 = (Mob)entity;
                    livingEntity59 = _mobEnt19.m_5448_();
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
                    _mobEnt5 = (Mob)entity;
                    livingEntity62 = _mobEnt5.m_5448_();
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
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n47 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 == 20) {
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
                    int n48;
                    float f40;
                    float f41;
                    int n49;
                    float f42;
                    float f43;
                    int n50;
                    float f44;
                    int n51;
                    float f45;
                    if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f45 = _livEnt3.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    float f46 = f45 / 40.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n51 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n51 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f46 + (float)(480 * n51));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f44 = _livEnt3.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    float f47 = f44 / 40.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n50 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n50 = 0;
                    }
                    entityiterator.m_6469_(damageSource8, f47 + (float)(480 * n50));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f43 = _livEnt2.m_21223_();
                    } else {
                        f43 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f42 = _livEnt3.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    float f48 = (f43 + f42) / 20.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n49 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n49 = 0;
                    }
                    entityiterator.m_6469_(damageSource9, f48 + (float)(2400 * n49));
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f41 = _livEnt2.m_21223_();
                    } else {
                        f41 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f40 = _livEnt3.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    float f49 = (f41 + f40) / 20.0f;
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI = (GiantskeletonEntity)entity;
                        n48 = (Integer)_datEntI.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                    } else {
                        n48 = 0;
                    }
                    entityiterator.m_6469_(damageSource10, f49 + (float)(2400 * n48));
                }
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n46 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n46 = 0;
            }
            if (n46 >= 40) {
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantskeletonEntity) {
            _datEntI4 = (GiantskeletonEntity)entity;
            n3 = (Integer)_datEntI4.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 4) {
            int n52;
            int n53;
            int n54;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof GiantskeletonEntity) {
                ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.spread");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt6 = (Mob)entity;
                livingEntity = _mobEnt6.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity64;
                if (entity instanceof Mob) {
                    Mob _mobEnt20 = (Mob)entity;
                    livingEntity64 = _mobEnt20.m_5448_();
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
                    _mobEnt5 = (Mob)entity;
                    livingEntity67 = _mobEnt5.m_5448_();
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
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n54 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 >= 21) {
                int n55;
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntI14 = (GiantskeletonEntity)entity;
                    n55 = (Integer)_datEntI14.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
                } else {
                    n55 = 0;
                }
                if (n55 <= 30) {
                    int n56;
                    float f50;
                    LivingEntity livingEntity69;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity69 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity69 = null;
                    }
                    if (livingEntity69 != null) {
                        LivingEntity livingEntity70;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity70 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity70 = null;
                        }
                        f50 = entity.m_20270_(livingEntity70);
                    } else {
                        f50 = -1.0f;
                    }
                    if (f50 > 1.0f && world instanceof ServerLevel) {
                        LivingEntity livingEntity71;
                        LivingEntity livingEntity72;
                        LivingEntity livingEntity73;
                        ServerLevel _level6 = (ServerLevel)world;
                        LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level6);
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
                        double d23 = livingEntity72.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity71 = _mobEnt.m_5448_();
                        } else {
                            livingEntity71 = null;
                        }
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)d23, (double)livingEntity71.m_20189_())));
                        entityToSpawn.m_20874_(true);
                        _level6.m_7967_((Entity)entityToSpawn);
                    }
                    Vec3 _center = new Vec3(x, y, z);
                    AABB aABB = new AABB(_center, _center);
                    if (entity instanceof GiantskeletonEntity) {
                        _datEntI2 = (GiantskeletonEntity)entity;
                        n56 = (Integer)_datEntI2.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
                    } else {
                        n56 = 0;
                    }
                    List<Entity> _entfound2 = world.m_6443_(Entity.class, aABB.m_82400_((double)(16 * (n56 - 19)) / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound2) {
                        int n57;
                        float f51;
                        float f52;
                        int n58;
                        float f53;
                        float f54;
                        int n59;
                        float f55;
                        int n60;
                        float f56;
                        if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        double _setval = 2.0;
                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                            capability.camerashake = _setval;
                            capability.syncPlayerVariables(entityiterator);
                        });
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f56 = _livEnt2.m_21233_();
                        } else {
                            f56 = -1.0f;
                        }
                        float f57 = f56 / 40.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI15 = (GiantskeletonEntity)entity;
                            n60 = (Integer)_datEntI15.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n60 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f57 + (float)(200 * n60));
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
                            f55 = _livEnt2.m_21233_();
                        } else {
                            f55 = -1.0f;
                        }
                        float f58 = f55 / 40.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI16 = (GiantskeletonEntity)entity;
                            n59 = (Integer)_datEntI16.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n59 = 0;
                        }
                        entityiterator.m_6469_(damageSource11, f58 + (float)(200 * n59));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f54 = _livEnt.m_21223_();
                        } else {
                            f54 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f53 = _livEnt2.m_21233_();
                        } else {
                            f53 = -1.0f;
                        }
                        float f59 = (f54 + f53) / 20.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI17 = (GiantskeletonEntity)entity;
                            n58 = (Integer)_datEntI17.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n58 = 0;
                        }
                        entityiterator.m_6469_(damageSource12, f59 + (float)(1000 * n58));
                        DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f52 = _livEnt.m_21223_();
                        } else {
                            f52 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f51 = _livEnt2.m_21233_();
                        } else {
                            f51 = -1.0f;
                        }
                        float f60 = (f52 + f51) / 20.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI18 = (GiantskeletonEntity)entity;
                            n57 = (Integer)_datEntI18.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n57 = 0;
                        }
                        entityiterator.m_6469_(damageSource13, f60 + (float)(1000 * n57));
                    }
                }
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n53 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n53 = 0;
            }
            if (n53 == 21 && world instanceof Level) {
                Level _level7 = (Level)world;
                if (!_level7.m_5776_()) {
                    _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n52 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n52 = 0;
            }
            if (n52 >= 42) {
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantskeletonEntity) {
            _datEntI4 = (GiantskeletonEntity)entity;
            n2 = (Integer)_datEntI4.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 5) {
            int n61;
            int n62;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof GiantskeletonEntity) {
                ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.ultimatelightning");
            }
            if (entity instanceof Mob) {
                _mobEnt6 = (Mob)entity;
                livingEntity = _mobEnt6.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity74;
                if (entity instanceof Mob) {
                    Mob _mobEnt21 = (Mob)entity;
                    livingEntity74 = _mobEnt21.m_5448_();
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
                LivingEntity livingEntity78;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity78 = _mobEnt4.m_5448_();
                } else {
                    livingEntity78 = null;
                }
                double d = livingEntity78.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt5 = (Mob)entity;
                    livingEntity77 = _mobEnt5.m_5448_();
                } else {
                    livingEntity77 = null;
                }
                double d24 = livingEntity77.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity76 = _mobEnt4.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                double d25 = d24 + (double)livingEntity76.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity75 = _mobEnt4.m_5448_();
                } else {
                    livingEntity75 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d25, livingEntity75.m_20189_()));
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n62 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n62 = 0;
            }
            if (n62 == 22) {
                float f61;
                LivingEntity livingEntity79;
                if (world instanceof Level) {
                    Level _level8 = (Level)world;
                    if (!_level8.m_5776_()) {
                        _level8.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level8.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt22 = (Mob)entity;
                    livingEntity79 = _mobEnt22.m_5448_();
                } else {
                    livingEntity79 = null;
                }
                if (livingEntity79 != null) {
                    LivingEntity livingEntity80;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity80 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity80 = null;
                    }
                    f61 = entity.m_20270_(livingEntity80);
                } else {
                    f61 = -1.0f;
                }
                if (f61 > 1.0f) {
                    LivingEntity livingEntity81;
                    LivingEntity livingEntity82;
                    LivingEntity livingEntity83;
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity84;
                        LivingEntity livingEntity85;
                        LivingEntity livingEntity86;
                        _level = (ServerLevel)world;
                        LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity86 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity86 = null;
                        }
                        double d = livingEntity86.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity85 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity85 = null;
                        }
                        double d26 = livingEntity85.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity84 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity84 = null;
                        }
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)d26, (double)livingEntity84.m_20189_())));
                        entityToSpawn.m_20874_(true);
                        _level.m_7967_((Entity)entityToSpawn);
                    }
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity83 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity83 = null;
                    }
                    double d = livingEntity83.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity82 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity82 = null;
                    }
                    double d27 = livingEntity82.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity81 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity81 = null;
                    }
                    Vec3 _center = new Vec3(d, d27, livingEntity81.m_20189_());
                    List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound3) {
                        int n63;
                        float f62;
                        float f63;
                        int n64;
                        float f64;
                        float f65;
                        LivingEntity _livEnt7;
                        int n65;
                        float f66;
                        int n66;
                        float f67;
                        if (entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        double _setval = 4.0;
                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                            capability.camerashake = _setval;
                            capability.syncPlayerVariables(entityiterator);
                        });
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f67 = _livEnt.m_21233_();
                        } else {
                            f67 = -1.0f;
                        }
                        float f68 = f67 / 40.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI19 = (GiantskeletonEntity)entity;
                            n66 = (Integer)_datEntI19.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n66 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f68 + (float)(400 * n66));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f66 = _livEnt.m_21233_();
                        } else {
                            f66 = -1.0f;
                        }
                        float f69 = f66 / 40.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI20 = (GiantskeletonEntity)entity;
                            n65 = (Integer)_datEntI20.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n65 = 0;
                        }
                        entityiterator.m_6469_(damageSource14, f69 + (float)(400 * n65));
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f65 = _livEnt7.m_21223_();
                        } else {
                            f65 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f64 = _livEnt.m_21233_();
                        } else {
                            f64 = -1.0f;
                        }
                        float f70 = (f65 + f64) / 20.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI21 = (GiantskeletonEntity)entity;
                            n64 = (Integer)_datEntI21.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n64 = 0;
                        }
                        entityiterator.m_6469_(damageSource15, f70 + (float)(2000 * n64));
                        DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f63 = _livEnt7.m_21223_();
                        } else {
                            f63 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f62 = _livEnt.m_21233_();
                        } else {
                            f62 = -1.0f;
                        }
                        float f71 = (f63 + f62) / 20.0f;
                        if (entity instanceof GiantskeletonEntity) {
                            GiantskeletonEntity _datEntI22 = (GiantskeletonEntity)entity;
                            n63 = (Integer)_datEntI22.m_20088_().m_135370_(GiantskeletonEntity.DATA_growLevel);
                        } else {
                            n63 = 0;
                        }
                        entityiterator.m_6469_(damageSource16, f71 + (float)(2000 * n63));
                    }
                }
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n61 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n61 = 0;
            }
            if (n61 >= 40) {
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof GiantskeletonEntity) {
            _datEntI4 = (GiantskeletonEntity)entity;
            n = (Integer)_datEntI4.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 6) {
            int n67;
            int n68;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof GiantskeletonEntity) {
                ((GiantskeletonEntity)entity).setAnimation("animation.giantskeleton.bow");
            }
            if (entity instanceof Mob) {
                _mobEnt6 = (Mob)entity;
                livingEntity = _mobEnt6.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity87;
                if (entity instanceof Mob) {
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity87 = _mobEnt23.m_5448_();
                } else {
                    livingEntity87 = null;
                }
                f = entity.m_20270_(livingEntity87);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity88;
                LivingEntity livingEntity89;
                LivingEntity livingEntity90;
                LivingEntity livingEntity91;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity91 = _mobEnt4.m_5448_();
                } else {
                    livingEntity91 = null;
                }
                double d = livingEntity91.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt5 = (Mob)entity;
                    livingEntity90 = _mobEnt5.m_5448_();
                } else {
                    livingEntity90 = null;
                }
                double d28 = livingEntity90.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity89 = _mobEnt4.m_5448_();
                } else {
                    livingEntity89 = null;
                }
                double d29 = d28 + (double)livingEntity89.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity88 = _mobEnt4.m_5448_();
                } else {
                    livingEntity88 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d29, livingEntity88.m_20189_()));
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n68 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n68 = 0;
            }
            if (n68 == 25) {
                float f72;
                LivingEntity livingEntity92;
                if (entity instanceof Mob) {
                    Mob _mobEnt24 = (Mob)entity;
                    livingEntity92 = _mobEnt24.m_5448_();
                } else {
                    livingEntity92 = null;
                }
                if (livingEntity92 != null) {
                    LivingEntity livingEntity93;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity93 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity93 = null;
                    }
                    f72 = entity.m_20270_(livingEntity93);
                } else {
                    f72 = -1.0f;
                }
                if (f72 > 1.0f) {
                    for (int index1 = 0; index1 < 12; ++index1) {
                        LivingEntity livingEntity94;
                        LivingEntity livingEntity95;
                        LivingEntity livingEntity96;
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel projectileLevel = (ServerLevel)world;
                        Projectile _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                SkeletonharrawEntity entityToSpawn = new SkeletonharrawEntity((EntityType<? extends SkeletonharrawEntity>)((EntityType)UltimateskeletonsModEntities.SKELETONHARRAW.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                        _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * (double)entity.m_20205_() * 2.0, y + (double)entity.m_20206_() * 0.875, z + entity.m_20154_().f_82481_ * (double)entity.m_20205_() * 2.0);
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity96 = _mobEnt.m_5448_();
                        } else {
                            livingEntity96 = null;
                        }
                        double d = livingEntity96.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity95 = _mobEnt.m_5448_();
                        } else {
                            livingEntity95 = null;
                        }
                        double d30 = livingEntity95.m_20186_() - 22.0 - entity.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity94 = _mobEnt.m_5448_();
                        } else {
                            livingEntity94 = null;
                        }
                        _entityToSpawn.m_6686_(d, d30, livingEntity94.m_20189_() - entity.m_20189_(), 4.0f, 32.0f);
                        projectileLevel.m_7967_((Entity)_entityToSpawn);
                    }
                }
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntI3 = (GiantskeletonEntity)entity;
                n67 = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 >= 40) {
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    GiantskeletonEntity _datEntSetI = (GiantskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof GiantskeletonEntity) {
                    ((GiantskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

