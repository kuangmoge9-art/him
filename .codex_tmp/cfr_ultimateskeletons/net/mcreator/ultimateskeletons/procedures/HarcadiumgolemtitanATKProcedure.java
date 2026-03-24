/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
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
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.Projectile
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.GiantharcadiumEntity;
import net.mcreator.ultimateskeletons.entity.HarcadiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class HarcadiumgolemtitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        Vec3 _center;
        int n5;
        LivingEntity _livEnt2;
        Mob _mobEnt;
        Object _mobEnt2;
        Mob _mobEnt3;
        Mob _mobEnt4;
        HarcadiumgolemtitanEntity _datEntSetI;
        Level _level;
        HarcadiumgolemtitanEntity _datEntI;
        block512: {
            int n6;
            block514: {
                Level _level2;
                block513: {
                    int n7;
                    int n8;
                    float f;
                    LivingEntity livingEntity;
                    int n9;
                    HarcadiumgolemtitanEntity _datEntI2;
                    block509: {
                        LivingEntity livingEntity2;
                        LivingEntity _livEnt3;
                        Mob _mobEnt5;
                        HarcadiumgolemtitanEntity _datEntI3;
                        block510: {
                            block511: {
                                LivingEntity livingEntity3;
                                float f2;
                                LivingEntity livingEntity4;
                                LivingEntity livingEntity5;
                                int n10;
                                float f3;
                                float f4;
                                LivingEntity _livEnt4;
                                HarcadiumgolemtitanEntity _datEntI4;
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
                                if (entity instanceof HarcadiumgolemtitanEntity) {
                                    int n11;
                                    HarcadiumgolemtitanEntity _datEntSetI2 = (HarcadiumgolemtitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                    if (entity instanceof HarcadiumgolemtitanEntity) {
                                        _datEntI4 = (HarcadiumgolemtitanEntity)entity;
                                        n11 = (Integer)_datEntI4.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_spawnTick);
                                    } else {
                                        n11 = 0;
                                    }
                                    synchedEntityData.m_135381_(HarcadiumgolemtitanEntity.DATA_spawnTick, (Object)(n11 + 1));
                                }
                                if (entity.m_5446_().getString().equals("growing")) {
                                    int n12;
                                    if (entity instanceof HarcadiumgolemtitanEntity) {
                                        _datEntI = (HarcadiumgolemtitanEntity)entity;
                                        n12 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_spawnTick);
                                    } else {
                                        n12 = 0;
                                    }
                                    if (n12 <= 720) {
                                        int n13;
                                        int n14;
                                        Mob _entity2;
                                        entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                        entity.f_19802_ = 20;
                                        if (entity instanceof LivingEntity) {
                                            ((LivingEntity)entity).f_20919_ = 0;
                                        }
                                        if (entity instanceof Mob) {
                                            _entity2 = (Mob)entity;
                                            _entity2.m_6710_(null);
                                        }
                                        if (entity instanceof LivingEntity) {
                                            _entity2 = (LivingEntity)entity;
                                            _entity2.m_21153_(3000000.0f);
                                        }
                                        if (entity instanceof HarcadiumgolemtitanEntity) {
                                            _datEntI4 = (HarcadiumgolemtitanEntity)entity;
                                            n14 = (Integer)_datEntI4.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_spawnTick);
                                        } else {
                                            n14 = 0;
                                        }
                                        if (n14 <= 10 && entity instanceof HarcadiumgolemtitanEntity) {
                                            ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.spawn");
                                        }
                                        if (entity instanceof HarcadiumgolemtitanEntity) {
                                            _datEntI4 = (HarcadiumgolemtitanEntity)entity;
                                            n13 = (Integer)_datEntI4.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_spawnTick);
                                        } else {
                                            n13 = 0;
                                        }
                                        if (n13 == 720) {
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                }
                                            }
                                            if (!world.m_5776_() && world.m_7654_() != null) {
                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Harcadiumgolemtitan has been created!!!"), false);
                                            }
                                        }
                                        if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n15;
                                    if (entity instanceof HarcadiumgolemtitanEntity) {
                                        _datEntI = (HarcadiumgolemtitanEntity)entity;
                                        n15 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
                                    } else {
                                        n15 = 0;
                                    }
                                    if (n15 != 0) {
                                        float f5;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)entity;
                                            f5 = _livEnt5.m_21223_();
                                        } else {
                                            f5 = -1.0f;
                                        }
                                        if (f5 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof HarcadiumgolemtitanEntity)) continue;
                                                ((HarcadiumgolemtitanEntity)entity).setAnimation("empty");
                                            }
                                        }
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity;
                                    f4 = _livEnt4.m_21223_();
                                } else {
                                    f4 = -1.0f;
                                }
                                if (f4 > 0.0f) {
                                    if (entity instanceof HarcadiumgolemtitanEntity) {
                                        HarcadiumgolemtitanEntity _datEntSetI3 = (HarcadiumgolemtitanEntity)entity;
                                        _datEntSetI3.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_deathTick, (Object)0);
                                    }
                                    for (int index1 = 0; index1 < 24; ++index1) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123771_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123789_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity;
                                    f3 = _livEnt4.m_21223_();
                                } else {
                                    f3 = -1.0f;
                                }
                                if (f3 <= 0.0f) {
                                    int n16;
                                    if (entity instanceof Mob) {
                                        Mob _entity3 = (Mob)entity;
                                        _entity3.m_6710_(null);
                                    }
                                    if (entity instanceof HarcadiumgolemtitanEntity) {
                                        HarcadiumgolemtitanEntity _datEntI5 = (HarcadiumgolemtitanEntity)entity;
                                        n16 = (Integer)_datEntI5.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
                                    } else {
                                        n16 = 0;
                                    }
                                    if (n16 == 0) {
                                        int n17;
                                        int n18;
                                        if (entity instanceof HarcadiumgolemtitanEntity) {
                                            int n19;
                                            _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                            if (entity instanceof HarcadiumgolemtitanEntity) {
                                                _datEntI3 = (HarcadiumgolemtitanEntity)entity;
                                                n19 = (Integer)_datEntI3.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_deathTick);
                                            } else {
                                                n19 = 0;
                                            }
                                            synchedEntityData.m_135381_(HarcadiumgolemtitanEntity.DATA_deathTick, (Object)(n19 + 1));
                                        }
                                        if (entity instanceof HarcadiumgolemtitanEntity) {
                                            _datEntI2 = (HarcadiumgolemtitanEntity)entity;
                                            n18 = (Integer)_datEntI2.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_deathTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 == 1 && world instanceof Level) {
                                            _level2 = (Level)world;
                                            if (!_level2.m_5776_()) {
                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f);
                                            } else {
                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f, false);
                                            }
                                        }
                                        if (entity instanceof HarcadiumgolemtitanEntity) {
                                            ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.death");
                                        }
                                        if (entity instanceof HarcadiumgolemtitanEntity) {
                                            _datEntI2 = (HarcadiumgolemtitanEntity)entity;
                                            n17 = (Integer)_datEntI2.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_deathTick);
                                        } else {
                                            n17 = 0;
                                        }
                                        if (n17 >= 600 && !entity.m_9236_().m_5776_()) {
                                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                        }
                                    }
                                }
                                if (world.m_5776_()) break block509;
                                if (entity instanceof HarcadiumgolemtitanEntity) {
                                    _datEntI = (HarcadiumgolemtitanEntity)entity;
                                    n10 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
                                } else {
                                    n10 = 0;
                                }
                                if (n10 != 0 && entity instanceof HarcadiumgolemtitanEntity) {
                                    int n20;
                                    HarcadiumgolemtitanEntity _datEntSetI4 = (HarcadiumgolemtitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
                                    if (entity instanceof HarcadiumgolemtitanEntity) {
                                        _datEntI2 = (HarcadiumgolemtitanEntity)entity;
                                        n20 = (Integer)_datEntI2.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
                                    } else {
                                        n20 = 0;
                                    }
                                    synchedEntityData.m_135381_(HarcadiumgolemtitanEntity.DATA_animationTick, (Object)(n20 + 1));
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity5 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity5 = null;
                                }
                                if (livingEntity5 == null) break block510;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt6 = (Mob)entity;
                                    v18 = _mobEnt6.m_5448_();
                                } else {
                                    v18 = livingEntity4 = null;
                                }
                                if (livingEntity4 instanceof LivingEntity) {
                                    _livEnt3 = livingEntity4;
                                    f2 = _livEnt3.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) break block511;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity3 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity3 = null;
                                }
                                if (livingEntity3.m_6084_()) break block510;
                            }
                            if (entity instanceof Mob) {
                                Mob _entity = (Mob)entity;
                                _entity.m_6710_(null);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity2 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity2 = null;
                        }
                        if (livingEntity2 != null) {
                            float f6;
                            LivingEntity livingEntity6;
                            LivingEntity livingEntity7;
                            LivingEntity livingEntity8;
                            LivingEntity livingEntity9;
                            if (entity instanceof Mob) {
                                Mob _mobEnt7 = (Mob)entity;
                                livingEntity9 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity9 = null;
                            }
                            double d = livingEntity9.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity8 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity8 = null;
                            }
                            double d2 = livingEntity8.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt8 = (Mob)entity;
                                livingEntity7 = _mobEnt8.m_5448_();
                            } else {
                                livingEntity7 = null;
                            }
                            double d3 = d2 + (double)livingEntity7.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt9 = (Mob)entity;
                                livingEntity6 = _mobEnt9.m_5448_();
                            } else {
                                livingEntity6 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity6.m_20189_()));
                            if (entity instanceof Mob) {
                                Mob _mobEnt10 = (Mob)entity;
                                v29 = _mobEnt10.m_5448_();
                            } else {
                                v29 = _mobEnt4 = null;
                            }
                            if (_mobEnt4 instanceof LivingEntity) {
                                _livEnt3 = (LivingEntity)_mobEnt4;
                                f6 = _livEnt3.m_21223_();
                            } else {
                                f6 = -1.0f;
                            }
                            if (f6 > 0.0f) {
                                int n21;
                                if (entity instanceof HarcadiumgolemtitanEntity) {
                                    _datEntI3 = (HarcadiumgolemtitanEntity)entity;
                                    n21 = (Integer)_datEntI3.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
                                } else {
                                    n21 = 0;
                                }
                                if (n21 == 0) {
                                    float f7;
                                    LivingEntity livingEntity10;
                                    Mob _mobEnt11;
                                    Mob _mobEnt12;
                                    Mob _mobEnt13;
                                    Mob _mobEnt14;
                                    float f8;
                                    LivingEntity livingEntity11;
                                    float f9;
                                    Mob _mobEnt15;
                                    LivingEntity livingEntity12;
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity12 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity12 = null;
                                    }
                                    if (livingEntity12 != null) {
                                        LivingEntity livingEntity13;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity13 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity13 = null;
                                        }
                                        f9 = entity.m_20270_(livingEntity13);
                                    } else {
                                        f9 = -1.0f;
                                    }
                                    if (f9 >= 160.0f) {
                                        entity.m_6858_(true);
                                    } else {
                                        entity.m_6858_(false);
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity11 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity11 = null;
                                    }
                                    if (livingEntity11 != null) {
                                        LivingEntity livingEntity14;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity14 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity14 = null;
                                        }
                                        f8 = entity.m_20270_(livingEntity14);
                                    } else {
                                        f8 = -1.0f;
                                    }
                                    if (f8 > 75.0f) {
                                        float f10;
                                        LivingEntity livingEntity15;
                                        LivingEntity livingEntity16;
                                        float f11;
                                        LivingEntity livingEntity17;
                                        LivingEntity livingEntity18;
                                        if (entity instanceof Mob) {
                                            _mobEnt14 = (Mob)entity;
                                            livingEntity18 = _mobEnt14.m_5448_();
                                        } else {
                                            livingEntity18 = null;
                                        }
                                        double d4 = livingEntity18.m_20185_() - entity.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt13 = (Mob)entity;
                                            livingEntity17 = _mobEnt13.m_5448_();
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
                                            f11 = entity.m_20270_(livingEntity19);
                                        } else {
                                            f11 = -1.0f;
                                        }
                                        double d5 = d4 / (double)f11 * 0.7;
                                        if (entity instanceof Mob) {
                                            _mobEnt14 = (Mob)entity;
                                            livingEntity16 = _mobEnt14.m_5448_();
                                        } else {
                                            livingEntity16 = null;
                                        }
                                        double d6 = livingEntity16.m_20189_() - entity.m_20189_();
                                        if (entity instanceof Mob) {
                                            _mobEnt13 = (Mob)entity;
                                            livingEntity15 = _mobEnt13.m_5448_();
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
                                            f10 = entity.m_20270_(livingEntity20);
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d5, 0.0, d6 / (double)f10 * 0.7));
                                    } else {
                                        LivingEntity livingEntity21;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity21 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity21 = null;
                                        }
                                        if (livingEntity21.m_20206_() > 8.0f) {
                                            float f12;
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
                                                f12 = entity.m_20270_(livingEntity23);
                                            } else {
                                                f12 = -1.0f;
                                            }
                                            if (f12 > 40.0f) {
                                                float f13;
                                                LivingEntity livingEntity24;
                                                LivingEntity livingEntity25;
                                                float f14;
                                                LivingEntity livingEntity26;
                                                LivingEntity livingEntity27;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity27 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity27 = null;
                                                }
                                                double d7 = livingEntity27.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity26 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity26 = null;
                                                }
                                                if (livingEntity26 != null) {
                                                    LivingEntity livingEntity28;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt11 = (Mob)entity;
                                                        livingEntity28 = _mobEnt11.m_5448_();
                                                    } else {
                                                        livingEntity28 = null;
                                                    }
                                                    f14 = entity.m_20270_(livingEntity28);
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                double d8 = d7 / (double)f14 * 0.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity25 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity25 = null;
                                                }
                                                double d9 = livingEntity25.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity24 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity24 = null;
                                                }
                                                if (livingEntity24 != null) {
                                                    LivingEntity livingEntity29;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt11 = (Mob)entity;
                                                        livingEntity29 = _mobEnt11.m_5448_();
                                                    } else {
                                                        livingEntity29 = null;
                                                    }
                                                    f13 = entity.m_20270_(livingEntity29);
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f13 * 0.5));
                                            }
                                        } else {
                                            float f15;
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
                                                f15 = entity.m_20270_(livingEntity31);
                                            } else {
                                                f15 = -1.0f;
                                            }
                                            if (f15 > 12.0f) {
                                                float f16;
                                                LivingEntity livingEntity32;
                                                LivingEntity livingEntity33;
                                                float f17;
                                                LivingEntity livingEntity34;
                                                LivingEntity livingEntity35;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity35 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity35 = null;
                                                }
                                                double d10 = livingEntity35.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity34 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity34 = null;
                                                }
                                                if (livingEntity34 != null) {
                                                    LivingEntity livingEntity36;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt11 = (Mob)entity;
                                                        livingEntity36 = _mobEnt11.m_5448_();
                                                    } else {
                                                        livingEntity36 = null;
                                                    }
                                                    f17 = entity.m_20270_(livingEntity36);
                                                } else {
                                                    f17 = -1.0f;
                                                }
                                                double d11 = d10 / (double)f17 * 0.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity33 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity33 = null;
                                                }
                                                double d12 = livingEntity33.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity32 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity32 = null;
                                                }
                                                if (livingEntity32 != null) {
                                                    LivingEntity livingEntity37;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt11 = (Mob)entity;
                                                        livingEntity37 = _mobEnt11.m_5448_();
                                                    } else {
                                                        livingEntity37 = null;
                                                    }
                                                    f16 = entity.m_20270_(livingEntity37);
                                                } else {
                                                    f16 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d11, 0.0, d12 / (double)f16 * 0.5));
                                            }
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity10 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity10 = null;
                                    }
                                    if (livingEntity10 != null) {
                                        LivingEntity livingEntity38;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity38 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity38 = null;
                                        }
                                        f7 = entity.m_20270_(livingEntity38);
                                    } else {
                                        f7 = -1.0f;
                                    }
                                    if (f7 < 512.0f) {
                                        HarcadiumgolemtitanEntity _datEntSetI5;
                                        float f18;
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
                                                _mobEnt13 = (Mob)entity;
                                                livingEntity40 = _mobEnt13.m_5448_();
                                            } else {
                                                livingEntity40 = null;
                                            }
                                            f18 = entity.m_20270_(livingEntity40);
                                        } else {
                                            f18 = -1.0f;
                                        }
                                        if (f18 <= 60.0f) {
                                            LivingEntity livingEntity41;
                                            if (entity instanceof Mob) {
                                                _mobEnt14 = (Mob)entity;
                                                livingEntity41 = _mobEnt14.m_5448_();
                                            } else {
                                                livingEntity41 = null;
                                            }
                                            if (livingEntity41.m_20206_() > 6.0f) {
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                                    if (entity instanceof HarcadiumgolemtitanEntity) {
                                                        _datEntSetI5 = (HarcadiumgolemtitanEntity)entity;
                                                        _datEntSetI5.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)5);
                                                    }
                                                } else if (entity instanceof HarcadiumgolemtitanEntity) {
                                                    _datEntSetI5 = (HarcadiumgolemtitanEntity)entity;
                                                    _datEntSetI5.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)4);
                                                }
                                            } else if (entity instanceof HarcadiumgolemtitanEntity) {
                                                _datEntSetI5 = (HarcadiumgolemtitanEntity)entity;
                                                _datEntSetI5.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                            }
                                        }
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            int n22;
                                            if (entity instanceof HarcadiumgolemtitanEntity) {
                                                HarcadiumgolemtitanEntity _datEntI6 = (HarcadiumgolemtitanEntity)entity;
                                                n22 = (Integer)_datEntI6.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
                                            } else {
                                                n22 = 0;
                                            }
                                            if (n22 == 0) {
                                                float f19;
                                                LivingEntity livingEntity42;
                                                if (entity instanceof Mob) {
                                                    _mobEnt13 = (Mob)entity;
                                                    livingEntity42 = _mobEnt13.m_5448_();
                                                } else {
                                                    livingEntity42 = null;
                                                }
                                                if (livingEntity42 != null) {
                                                    LivingEntity livingEntity43;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt14 = (Mob)entity;
                                                        livingEntity43 = _mobEnt14.m_5448_();
                                                    } else {
                                                        livingEntity43 = null;
                                                    }
                                                    f19 = entity.m_20270_(livingEntity43);
                                                } else {
                                                    f19 = -1.0f;
                                                }
                                                if (f19 > 80.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)30) == 5 && entity instanceof HarcadiumgolemtitanEntity) {
                                                        _datEntSetI5 = (HarcadiumgolemtitanEntity)entity;
                                                        _datEntSetI5.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)6);
                                                    }
                                                } else {
                                                    float f20;
                                                    LivingEntity livingEntity44;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt11 = (Mob)entity;
                                                        livingEntity44 = _mobEnt11.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    if (livingEntity44 != null) {
                                                        LivingEntity livingEntity45;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt12 = (Mob)entity;
                                                            livingEntity45 = _mobEnt12.m_5448_();
                                                        } else {
                                                            livingEntity45 = null;
                                                        }
                                                        f20 = entity.m_20270_(livingEntity45);
                                                    } else {
                                                        f20 = -1.0f;
                                                    }
                                                    if (f20 > 60.0f && entity instanceof HarcadiumgolemtitanEntity) {
                                                        HarcadiumgolemtitanEntity _datEntSetI6 = (HarcadiumgolemtitanEntity)entity;
                                                        _datEntSetI6.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
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
                    if (entity instanceof HarcadiumgolemtitanEntity) {
                        _datEntI = (HarcadiumgolemtitanEntity)entity;
                        n9 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n9 = 0;
                    }
                    if (n9 != true) break block512;
                    if (entity instanceof HarcadiumgolemtitanEntity) {
                        ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zt");
                    }
                    if (entity instanceof Mob) {
                        Mob _mobEnt16 = (Mob)entity;
                        livingEntity = _mobEnt16.m_5448_();
                    } else {
                        livingEntity = null;
                    }
                    if (livingEntity != null) {
                        LivingEntity livingEntity46;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity46 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity46 = null;
                        }
                        f = entity.m_20270_(livingEntity46);
                    } else {
                        f = -1.0f;
                    }
                    if (f > 1.0f) {
                        LivingEntity livingEntity47;
                        LivingEntity livingEntity48;
                        LivingEntity livingEntity49;
                        LivingEntity livingEntity50;
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity50 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity50 = null;
                        }
                        double d = livingEntity50.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity49 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity49 = null;
                        }
                        double d13 = livingEntity49.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity48 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity48 = null;
                        }
                        double d14 = d13 + (double)livingEntity48.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity47 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity47 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d14, livingEntity47.m_20189_()));
                    }
                    if (entity instanceof HarcadiumgolemtitanEntity) {
                        HarcadiumgolemtitanEntity _datEntI7 = (HarcadiumgolemtitanEntity)entity;
                        n8 = (Integer)_datEntI7.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 == 56) break block513;
                    if (entity instanceof HarcadiumgolemtitanEntity) {
                        _datEntI2 = (HarcadiumgolemtitanEntity)entity;
                        n7 = (Integer)_datEntI2.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n7 = 0;
                    }
                    if (n7 != 96) break block514;
                }
                if (world instanceof Level) {
                    _level2 = (Level)world;
                    if (!_level2.m_5776_()) {
                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center2 = new Vec3(x, y, z);
                List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entityiterator : _entfound2) {
                    float f;
                    float f21;
                    float f22;
                    float f23;
                    LivingEntity _livEnt6;
                    float f24;
                    float f25;
                    float f26;
                    if (entityiterator instanceof HarcadiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f26 = _livEnt2.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f26 / 20.0f + 100000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f25 = _livEnt2.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource2, f25 / 20.0f + 100000.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f24 = _livEnt2.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource3, f24 / 20.0f + 100000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator;
                        f23 = _livEnt6.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f22 = _livEnt2.m_21223_();
                    } else {
                        f22 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource4, (f23 + f22) / 5.0f + 1000000.0f);
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator;
                        f21 = _livEnt6.m_21233_();
                    } else {
                        f21 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource5, (f21 + f) / 5.0f + 1000000.0f);
                }
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI8 = (HarcadiumgolemtitanEntity)entity;
                n6 = (Integer)_datEntI8.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n6 = 0;
            }
            if (n6 >= 120) {
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    ((HarcadiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof HarcadiumgolemtitanEntity) {
            _datEntI = (HarcadiumgolemtitanEntity)entity;
            n5 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 2) {
            int n23;
            int n24;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof HarcadiumgolemtitanEntity) {
                ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zj");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt17 = (Mob)entity;
                livingEntity = _mobEnt17.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity51;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity51 = _mobEnt3.m_5448_();
                } else {
                    livingEntity51 = null;
                }
                f = entity.m_20270_(livingEntity51);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity52;
                LivingEntity livingEntity53;
                LivingEntity livingEntity54;
                LivingEntity livingEntity55;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity55 = _mobEnt4.m_5448_();
                } else {
                    livingEntity55 = null;
                }
                double d = livingEntity55.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity54 = _mobEnt2.m_5448_();
                } else {
                    livingEntity54 = null;
                }
                double d15 = livingEntity54.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity53 = _mobEnt4.m_5448_();
                } else {
                    livingEntity53 = null;
                }
                double d16 = d15 + (double)livingEntity53.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity52 = _mobEnt4.m_5448_();
                } else {
                    livingEntity52 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity52.m_20189_()));
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI9 = (HarcadiumgolemtitanEntity)entity;
                n24 = (Integer)_datEntI9.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n24 = 0;
            }
            if (n24 == 36) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f27;
                    float f28;
                    float f29;
                    float f30;
                    float f31;
                    float f32;
                    float f33;
                    if (entityiterator instanceof HarcadiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f33 = _livEnt.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f33 / 20.0f + 100000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f32 = _livEnt.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource6, f32 / 20.0f + 100000.0f);
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f31 = _livEnt.m_21233_();
                    } else {
                        f31 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource7, f31 / 20.0f + 100000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f30 = _livEnt2.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f29 = _livEnt.m_21223_();
                    } else {
                        f29 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource8, (f30 + f29) / 5.0f + 1000000.0f);
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f28 = _livEnt2.m_21233_();
                    } else {
                        f28 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f27 = _livEnt.m_21223_();
                    } else {
                        f27 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource9, (f28 + f27) / 5.0f + 1000000.0f);
                }
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI10 = (HarcadiumgolemtitanEntity)entity;
                n23 = (Integer)_datEntI10.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n23 = 0;
            }
            if (n23 >= 60) {
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    ((HarcadiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof HarcadiumgolemtitanEntity) {
            _datEntI = (HarcadiumgolemtitanEntity)entity;
            n4 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 3) {
            int n25;
            int n26;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof HarcadiumgolemtitanEntity) {
                ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.gt");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt18 = (Mob)entity;
                livingEntity = _mobEnt18.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity56;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity56 = _mobEnt3.m_5448_();
                } else {
                    livingEntity56 = null;
                }
                f = entity.m_20270_(livingEntity56);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity57;
                LivingEntity livingEntity58;
                LivingEntity livingEntity59;
                LivingEntity livingEntity60;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity60 = _mobEnt4.m_5448_();
                } else {
                    livingEntity60 = null;
                }
                double d = livingEntity60.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity59 = _mobEnt2.m_5448_();
                } else {
                    livingEntity59 = null;
                }
                double d17 = livingEntity59.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity58 = _mobEnt4.m_5448_();
                } else {
                    livingEntity58 = null;
                }
                double d18 = d17 + (double)livingEntity58.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity57 = _mobEnt4.m_5448_();
                } else {
                    livingEntity57 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity57.m_20189_()));
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI11 = (HarcadiumgolemtitanEntity)entity;
                n26 = (Integer)_datEntI11.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n26 = 0;
            }
            if (n26 == 48) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f34;
                    float f35;
                    float f36;
                    float f37;
                    float f38;
                    float f39;
                    float f40;
                    if (entityiterator instanceof HarcadiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f40 = _livEnt.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f40 / 20.0f + 210000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f39 = _livEnt.m_21233_();
                    } else {
                        f39 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource10, f39 / 20.0f + 210000.0f);
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f38 = _livEnt.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource11, f38 / 20.0f + 210000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f37 = _livEnt2.m_21233_();
                    } else {
                        f37 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f36 = _livEnt.m_21223_();
                    } else {
                        f36 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource12, (f37 + f36) / 5.0f + 2100000.0f);
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f35 = _livEnt2.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f34 = _livEnt.m_21223_();
                    } else {
                        f34 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource13, (f35 + f34) / 5.0f + 2100000.0f);
                }
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI12 = (HarcadiumgolemtitanEntity)entity;
                n25 = (Integer)_datEntI12.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n25 = 0;
            }
            if (n25 >= 80) {
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    ((HarcadiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof HarcadiumgolemtitanEntity) {
            _datEntI = (HarcadiumgolemtitanEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 4) {
            int n27;
            int n28;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof HarcadiumgolemtitanEntity) {
                ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.attack");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt19 = (Mob)entity;
                livingEntity = _mobEnt19.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity61;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity61 = _mobEnt3.m_5448_();
                } else {
                    livingEntity61 = null;
                }
                f = entity.m_20270_(livingEntity61);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
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
                    _mobEnt2 = (Mob)entity;
                    livingEntity64 = _mobEnt2.m_5448_();
                } else {
                    livingEntity64 = null;
                }
                double d19 = livingEntity64.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity63 = _mobEnt4.m_5448_();
                } else {
                    livingEntity63 = null;
                }
                double d20 = d19 + (double)livingEntity63.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity62 = _mobEnt4.m_5448_();
                } else {
                    livingEntity62 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity62.m_20189_()));
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI13 = (HarcadiumgolemtitanEntity)entity;
                n28 = (Integer)_datEntI13.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 == 14) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f41;
                    float f42;
                    float f43;
                    float f44;
                    float f45;
                    float f46;
                    float f47;
                    if (entityiterator instanceof HarcadiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f47 = _livEnt.m_21233_();
                    } else {
                        f47 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f47 / 20.0f + 420000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f46 = _livEnt.m_21233_();
                    } else {
                        f46 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource14, f46 / 20.0f + 420000.0f);
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f45 = _livEnt.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource15, f45 / 20.0f + 420000.0f);
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f44 = _livEnt2.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f43 = _livEnt.m_21223_();
                    } else {
                        f43 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource16, (f44 + f43) / 5.0f + 4200000.0f);
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f42 = _livEnt2.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f41 = _livEnt.m_21223_();
                    } else {
                        f41 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource17, (f42 + f41) / 5.0f + 4200000.0f);
                }
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI14 = (HarcadiumgolemtitanEntity)entity;
                n27 = (Integer)_datEntI14.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 >= 30) {
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    ((HarcadiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof HarcadiumgolemtitanEntity) {
            _datEntI = (HarcadiumgolemtitanEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 5) {
            int n29;
            int n30;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof HarcadiumgolemtitanEntity) {
                ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.fs");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt20 = (Mob)entity;
                livingEntity = _mobEnt20.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity66;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity66 = _mobEnt3.m_5448_();
                } else {
                    livingEntity66 = null;
                }
                f = entity.m_20270_(livingEntity66);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity67;
                LivingEntity livingEntity68;
                LivingEntity livingEntity69;
                LivingEntity livingEntity70;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity70 = _mobEnt4.m_5448_();
                } else {
                    livingEntity70 = null;
                }
                double d = livingEntity70.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity69 = _mobEnt2.m_5448_();
                } else {
                    livingEntity69 = null;
                }
                double d21 = livingEntity69.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity68 = _mobEnt4.m_5448_();
                } else {
                    livingEntity68 = null;
                }
                double d22 = d21 + (double)livingEntity68.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity67 = _mobEnt4.m_5448_();
                } else {
                    livingEntity67 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity67.m_20189_()));
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI15 = (HarcadiumgolemtitanEntity)entity;
                n30 = (Integer)_datEntI15.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 == 40) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f48;
                    float f49;
                    float f50;
                    float f51;
                    float f52;
                    float f53;
                    float f54;
                    if (entityiterator instanceof HarcadiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 5.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entityiterator;
                        f54 = _livEnt7.m_21233_();
                    } else {
                        f54 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f54 / 20.0f + 840000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entityiterator;
                        f53 = _livEnt8.m_21233_();
                    } else {
                        f53 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource18, f53 / 20.0f + 840000.0f);
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entityiterator;
                        f52 = _livEnt9.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource19, f52 / 20.0f + 840000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f51 = _livEnt2.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt10 = (LivingEntity)entityiterator;
                        f50 = _livEnt10.m_21223_();
                    } else {
                        f50 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource20, (f51 + f50) / 5.0f + 8400000.0f);
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f49 = _livEnt2.m_21233_();
                    } else {
                        f49 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entityiterator;
                        f48 = _livEnt11.m_21223_();
                    } else {
                        f48 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource21, (f49 + f48) / 5.0f + 8400000.0f);
                }
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI16 = (HarcadiumgolemtitanEntity)entity;
                n29 = (Integer)_datEntI16.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 >= 60) {
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    ((HarcadiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof HarcadiumgolemtitanEntity) {
            _datEntI = (HarcadiumgolemtitanEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 6) {
            int n31;
            int n32;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof HarcadiumgolemtitanEntity) {
                ((HarcadiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.td");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt21 = (Mob)entity;
                livingEntity = _mobEnt21.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity71;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity71 = _mobEnt3.m_5448_();
                } else {
                    livingEntity71 = null;
                }
                f = entity.m_20270_(livingEntity71);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity72;
                LivingEntity livingEntity73;
                LivingEntity livingEntity74;
                LivingEntity livingEntity75;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity75 = _mobEnt4.m_5448_();
                } else {
                    livingEntity75 = null;
                }
                double d = livingEntity75.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity74 = _mobEnt2.m_5448_();
                } else {
                    livingEntity74 = null;
                }
                double d23 = livingEntity74.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity73 = _mobEnt4.m_5448_();
                } else {
                    livingEntity73 = null;
                }
                double d24 = d23 + (double)livingEntity73.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity72 = _mobEnt4.m_5448_();
                } else {
                    livingEntity72 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity72.m_20189_()));
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI17 = (HarcadiumgolemtitanEntity)entity;
                n32 = (Integer)_datEntI17.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 == 18) {
                float f55;
                LivingEntity livingEntity76;
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity76 = _mobEnt3.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                if (livingEntity76 != null) {
                    LivingEntity livingEntity77;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity77 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity77 = null;
                    }
                    f55 = entity.m_20270_(livingEntity77);
                } else {
                    f55 = -1.0f;
                }
                if (f55 > 1.0f && world instanceof ServerLevel) {
                    LivingEntity livingEntity78;
                    LivingEntity livingEntity79;
                    LivingEntity livingEntity80;
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile _entityToSpawn = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            GiantharcadiumEntity entityToSpawn = new GiantharcadiumEntity((EntityType<? extends GiantharcadiumEntity>)((EntityType)UltimateskeletonsModEntities.GIANTHARCADIUM.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                    _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 27.0, y + 45.0, z + entity.m_20154_().f_82481_ * 27.0);
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity80 = _mobEnt.m_5448_();
                    } else {
                        livingEntity80 = null;
                    }
                    double d = livingEntity80.m_20185_() - entity.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity79 = _mobEnt.m_5448_();
                    } else {
                        livingEntity79 = null;
                    }
                    double d25 = livingEntity79.m_20186_() - 40.0 - entity.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity78 = _mobEnt.m_5448_();
                    } else {
                        livingEntity78 = null;
                    }
                    _entityToSpawn.m_6686_(d, d25, livingEntity78.m_20189_() - entity.m_20189_(), 4.0f, 2.0f);
                    projectileLevel.m_7967_((Entity)_entityToSpawn);
                }
            }
            if (entity instanceof HarcadiumgolemtitanEntity) {
                HarcadiumgolemtitanEntity _datEntI18 = (HarcadiumgolemtitanEntity)entity;
                n31 = (Integer)_datEntI18.m_20088_().m_135370_(HarcadiumgolemtitanEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 >= 50) {
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    _datEntSetI = (HarcadiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(HarcadiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof HarcadiumgolemtitanEntity) {
                    ((HarcadiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

