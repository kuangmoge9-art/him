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
import net.mcreator.ultimateskeletons.entity.GianttitanusEntity;
import net.mcreator.ultimateskeletons.entity.TitanusgolemtitanEntity;
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

public class TitanusgolemtitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        Vec3 _center;
        int n6;
        LivingEntity _livEnt2;
        Mob _mobEnt;
        Object _mobEnt2;
        Mob _mobEnt3;
        Mob _mobEnt4;
        TitanusgolemtitanEntity _datEntSetI;
        Level _level;
        TitanusgolemtitanEntity _datEntI;
        block580: {
            int n7;
            block582: {
                Level _level2;
                block581: {
                    int n8;
                    int n9;
                    float f;
                    LivingEntity livingEntity;
                    int n10;
                    TitanusgolemtitanEntity _datEntI2;
                    block577: {
                        LivingEntity livingEntity2;
                        LivingEntity _livEnt3;
                        Mob _mobEnt5;
                        TitanusgolemtitanEntity _datEntI3;
                        block578: {
                            block579: {
                                LivingEntity livingEntity3;
                                float f2;
                                LivingEntity livingEntity4;
                                LivingEntity livingEntity5;
                                int n11;
                                float f3;
                                float f4;
                                LivingEntity _livEnt4;
                                TitanusgolemtitanEntity _datEntI4;
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
                                if (entity instanceof TitanusgolemtitanEntity) {
                                    int n12;
                                    TitanusgolemtitanEntity _datEntSetI2 = (TitanusgolemtitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                    if (entity instanceof TitanusgolemtitanEntity) {
                                        _datEntI4 = (TitanusgolemtitanEntity)entity;
                                        n12 = (Integer)_datEntI4.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_spawnTick);
                                    } else {
                                        n12 = 0;
                                    }
                                    synchedEntityData.m_135381_(TitanusgolemtitanEntity.DATA_spawnTick, (Object)(n12 + 1));
                                }
                                if (entity.m_5446_().getString().equals("growing")) {
                                    int n13;
                                    if (entity instanceof TitanusgolemtitanEntity) {
                                        _datEntI = (TitanusgolemtitanEntity)entity;
                                        n13 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_spawnTick);
                                    } else {
                                        n13 = 0;
                                    }
                                    if (n13 <= 720) {
                                        int n14;
                                        int n15;
                                        entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                        entity.f_19802_ = 20;
                                        if (entity instanceof LivingEntity) {
                                            ((LivingEntity)entity).f_20919_ = 0;
                                        }
                                        if (entity instanceof Mob) {
                                            Mob _entity2 = (Mob)entity;
                                            _entity2.m_6710_(null);
                                        }
                                        if (entity instanceof TitanusgolemtitanEntity) {
                                            _datEntI4 = (TitanusgolemtitanEntity)entity;
                                            n15 = (Integer)_datEntI4.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_spawnTick);
                                        } else {
                                            n15 = 0;
                                        }
                                        if (n15 <= 10 && entity instanceof TitanusgolemtitanEntity) {
                                            ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.spawn");
                                        }
                                        if (entity instanceof TitanusgolemtitanEntity) {
                                            _datEntI4 = (TitanusgolemtitanEntity)entity;
                                            n14 = (Integer)_datEntI4.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_spawnTick);
                                        } else {
                                            n14 = 0;
                                        }
                                        if (n14 == 720) {
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                }
                                            }
                                            if (!world.m_5776_() && world.m_7654_() != null) {
                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Titanusgolemtitan has been created!!!"), false);
                                            }
                                        }
                                        if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n16;
                                    if (entity instanceof TitanusgolemtitanEntity) {
                                        _datEntI = (TitanusgolemtitanEntity)entity;
                                        n16 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
                                    } else {
                                        n16 = 0;
                                    }
                                    if (n16 != 0) {
                                        float f5;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)entity;
                                            f5 = _livEnt5.m_21223_();
                                        } else {
                                            f5 = -1.0f;
                                        }
                                        if (f5 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof TitanusgolemtitanEntity)) continue;
                                                ((TitanusgolemtitanEntity)entity).setAnimation("empty");
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
                                    if (entity instanceof TitanusgolemtitanEntity) {
                                        TitanusgolemtitanEntity _datEntSetI3 = (TitanusgolemtitanEntity)entity;
                                        _datEntSetI3.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_deathTick, (Object)0);
                                    }
                                    for (int index1 = 0; index1 < 16; ++index1) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123748_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0));
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity;
                                    f3 = _livEnt4.m_21223_();
                                } else {
                                    f3 = -1.0f;
                                }
                                if (f3 <= 0.0f) {
                                    int n17;
                                    if (entity instanceof Mob) {
                                        Mob _entity3 = (Mob)entity;
                                        _entity3.m_6710_(null);
                                    }
                                    if (entity instanceof TitanusgolemtitanEntity) {
                                        TitanusgolemtitanEntity _datEntI5 = (TitanusgolemtitanEntity)entity;
                                        n17 = (Integer)_datEntI5.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
                                    } else {
                                        n17 = 0;
                                    }
                                    if (n17 == 0) {
                                        int n18;
                                        int n19;
                                        if (entity instanceof TitanusgolemtitanEntity) {
                                            int n20;
                                            _datEntSetI = (TitanusgolemtitanEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                            if (entity instanceof TitanusgolemtitanEntity) {
                                                _datEntI3 = (TitanusgolemtitanEntity)entity;
                                                n20 = (Integer)_datEntI3.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_deathTick);
                                            } else {
                                                n20 = 0;
                                            }
                                            synchedEntityData.m_135381_(TitanusgolemtitanEntity.DATA_deathTick, (Object)(n20 + 1));
                                        }
                                        if (entity instanceof TitanusgolemtitanEntity) {
                                            _datEntI2 = (TitanusgolemtitanEntity)entity;
                                            n19 = (Integer)_datEntI2.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_deathTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 == 1 && world instanceof Level) {
                                            _level2 = (Level)world;
                                            if (!_level2.m_5776_()) {
                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f);
                                            } else {
                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f, false);
                                            }
                                        }
                                        if (entity instanceof TitanusgolemtitanEntity) {
                                            ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.death");
                                        }
                                        if (entity instanceof TitanusgolemtitanEntity) {
                                            _datEntI2 = (TitanusgolemtitanEntity)entity;
                                            n18 = (Integer)_datEntI2.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_deathTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 >= 600 && !entity.m_9236_().m_5776_()) {
                                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                        }
                                    }
                                }
                                if (world.m_5776_()) break block577;
                                if (entity instanceof TitanusgolemtitanEntity) {
                                    _datEntI = (TitanusgolemtitanEntity)entity;
                                    n11 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
                                } else {
                                    n11 = 0;
                                }
                                if (n11 != 0 && entity instanceof TitanusgolemtitanEntity) {
                                    int n21;
                                    TitanusgolemtitanEntity _datEntSetI4 = (TitanusgolemtitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
                                    if (entity instanceof TitanusgolemtitanEntity) {
                                        _datEntI2 = (TitanusgolemtitanEntity)entity;
                                        n21 = (Integer)_datEntI2.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
                                    } else {
                                        n21 = 0;
                                    }
                                    synchedEntityData.m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)(n21 + 1));
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity5 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity5 = null;
                                }
                                if (livingEntity5 == null) break block578;
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
                                if (f2 <= 0.0f) break block579;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity3 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity3 = null;
                                }
                                if (livingEntity3.m_6084_()) break block578;
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
                                int n22;
                                if (entity instanceof TitanusgolemtitanEntity) {
                                    _datEntI3 = (TitanusgolemtitanEntity)entity;
                                    n22 = (Integer)_datEntI3.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
                                } else {
                                    n22 = 0;
                                }
                                if (n22 == 0) {
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
                                        TitanusgolemtitanEntity _datEntSetI5;
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
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 4) {
                                                    if (entity instanceof TitanusgolemtitanEntity) {
                                                        _datEntSetI5 = (TitanusgolemtitanEntity)entity;
                                                        _datEntSetI5.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
                                                    }
                                                } else if (entity instanceof TitanusgolemtitanEntity) {
                                                    _datEntSetI5 = (TitanusgolemtitanEntity)entity;
                                                    _datEntSetI5.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)4);
                                                }
                                            } else if (entity instanceof TitanusgolemtitanEntity) {
                                                _datEntSetI5 = (TitanusgolemtitanEntity)entity;
                                                _datEntSetI5.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                            }
                                        }
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            int n23;
                                            if (entity instanceof TitanusgolemtitanEntity) {
                                                TitanusgolemtitanEntity _datEntI6 = (TitanusgolemtitanEntity)entity;
                                                n23 = (Integer)_datEntI6.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
                                            } else {
                                                n23 = 0;
                                            }
                                            if (n23 == 0) {
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
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)30) == 5 && entity instanceof TitanusgolemtitanEntity) {
                                                        _datEntSetI5 = (TitanusgolemtitanEntity)entity;
                                                        _datEntSetI5.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)6);
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
                                                    if (f20 > 60.0f && entity instanceof TitanusgolemtitanEntity) {
                                                        TitanusgolemtitanEntity _datEntSetI6 = (TitanusgolemtitanEntity)entity;
                                                        _datEntSetI6.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
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
                    if (entity instanceof TitanusgolemtitanEntity) {
                        _datEntI = (TitanusgolemtitanEntity)entity;
                        n10 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
                    } else {
                        n10 = 0;
                    }
                    if (n10 != true) break block580;
                    if (entity instanceof TitanusgolemtitanEntity) {
                        ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zt");
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
                    if (entity instanceof TitanusgolemtitanEntity) {
                        TitanusgolemtitanEntity _datEntI7 = (TitanusgolemtitanEntity)entity;
                        n9 = (Integer)_datEntI7.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 56) break block581;
                    if (entity instanceof TitanusgolemtitanEntity) {
                        _datEntI2 = (TitanusgolemtitanEntity)entity;
                        n8 = (Integer)_datEntI2.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 != 96) break block582;
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
                    if (entityiterator instanceof TitanusgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f26 = _livEnt2.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f26 / 20.0f + 300000.0f);
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
                    entityiterator.m_6469_(damageSource2, f25 / 20.0f + 300000.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f24 = _livEnt2.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource3, f24 / 20.0f + 300000.0f);
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
                    entityiterator.m_6469_(damageSource4, (f23 + f22) / 5.0f + 3000000.0f);
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
                    entityiterator.m_6469_(damageSource5, (f21 + f) / 5.0f + 3000000.0f);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI8 = (TitanusgolemtitanEntity)entity;
                n7 = (Integer)_datEntI8.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n7 = 0;
            }
            if (n7 >= 120) {
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    ((TitanusgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof TitanusgolemtitanEntity) {
            _datEntI = (TitanusgolemtitanEntity)entity;
            n6 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 2) {
            int n24;
            int n25;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof TitanusgolemtitanEntity) {
                ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zj");
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
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI9 = (TitanusgolemtitanEntity)entity;
                n25 = (Integer)_datEntI9.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n25 = 0;
            }
            if (n25 == 36) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f27;
                    float f28;
                    float f29;
                    float f30;
                    float f31;
                    float f32;
                    float f33;
                    if (entityiterator instanceof TitanusgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f33 = _livEnt.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f33 / 20.0f + 300000.0f);
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
                    entityiterator.m_6469_(damageSource6, f32 / 20.0f + 300000.0f);
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f31 = _livEnt.m_21233_();
                    } else {
                        f31 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource7, f31 / 20.0f + 300000.0f);
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
                    entityiterator.m_6469_(damageSource8, (f30 + f29) / 5.0f + 3000000.0f);
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
                    entityiterator.m_6469_(damageSource9, (f28 + f27) / 5.0f + 3000000.0f);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI10 = (TitanusgolemtitanEntity)entity;
                n24 = (Integer)_datEntI10.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n24 = 0;
            }
            if (n24 >= 60) {
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    ((TitanusgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof TitanusgolemtitanEntity) {
            _datEntI = (TitanusgolemtitanEntity)entity;
            n5 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 3) {
            int n26;
            int n27;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof TitanusgolemtitanEntity) {
                ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.gt");
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
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI11 = (TitanusgolemtitanEntity)entity;
                n27 = (Integer)_datEntI11.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 == 48) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f34;
                    float f35;
                    float f36;
                    float f37;
                    float f38;
                    float f39;
                    float f40;
                    if (entityiterator instanceof TitanusgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f40 = _livEnt.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f40 / 20.0f + 630000.0f);
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
                    entityiterator.m_6469_(damageSource10, f39 / 20.0f + 630000.0f);
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f38 = _livEnt.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource11, f38 / 20.0f + 630000.0f);
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
                    entityiterator.m_6469_(damageSource12, (f37 + f36) / 5.0f + 6300000.0f);
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
                    entityiterator.m_6469_(damageSource13, (f35 + f34) / 5.0f + 6300000.0f);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI12 = (TitanusgolemtitanEntity)entity;
                n26 = (Integer)_datEntI12.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n26 = 0;
            }
            if (n26 >= 80) {
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    ((TitanusgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof TitanusgolemtitanEntity) {
            _datEntI = (TitanusgolemtitanEntity)entity;
            n4 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 4) {
            int n28;
            int n29;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof TitanusgolemtitanEntity) {
                ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.attack");
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
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI13 = (TitanusgolemtitanEntity)entity;
                n29 = (Integer)_datEntI13.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 == 14) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 50.0, y, z + entity.m_20154_().f_82481_ * 50.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(145.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f41;
                    float f42;
                    float f43;
                    float f44;
                    float f45;
                    float f46;
                    float f47;
                    if (entityiterator instanceof TitanusgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f47 = _livEnt.m_21233_();
                    } else {
                        f47 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f47 / 20.0f + 1260000.0f);
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
                    entityiterator.m_6469_(damageSource14, f46 / 20.0f + 1260000.0f);
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f45 = _livEnt.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource15, f45 / 20.0f + 1260000.0f);
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
                    entityiterator.m_6469_(damageSource16, (f44 + f43) / 5.0f + 1.26E7f);
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
                    entityiterator.m_6469_(damageSource17, (f42 + f41) / 5.0f + 1.26E7f);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI14 = (TitanusgolemtitanEntity)entity;
                n28 = (Integer)_datEntI14.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 >= 30) {
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    ((TitanusgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof TitanusgolemtitanEntity) {
            _datEntI = (TitanusgolemtitanEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 5) {
            int n30;
            int n31;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof TitanusgolemtitanEntity) {
                ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.fs");
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
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI15 = (TitanusgolemtitanEntity)entity;
                n31 = (Integer)_datEntI15.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 == 40) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 60.0, y, z + entity.m_20154_().f_82481_ * 60.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(320.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f48;
                    float f49;
                    float f50;
                    float f51;
                    float f52;
                    float f53;
                    float f54;
                    if (entityiterator instanceof TitanusgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
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
                    entityiterator.m_6469_(damageSource, f54 / 20.0f + 2520000.0f);
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
                    entityiterator.m_6469_(damageSource18, f53 / 20.0f + 2520000.0f);
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entityiterator;
                        f52 = _livEnt9.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource19, f52 / 20.0f + 2520000.0f);
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
                    entityiterator.m_6469_(damageSource20, (f51 + f50) / 5.0f + 2.52E7f);
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
                    entityiterator.m_6469_(damageSource21, (f49 + f48) / 5.0f + 2.52E7f);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI16 = (TitanusgolemtitanEntity)entity;
                n30 = (Integer)_datEntI16.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 >= 60) {
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    ((TitanusgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof TitanusgolemtitanEntity) {
            _datEntI = (TitanusgolemtitanEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 6) {
            int n32;
            int n33;
            int n34;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof TitanusgolemtitanEntity) {
                ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.area");
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
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI17 = (TitanusgolemtitanEntity)entity;
                n34 = (Integer)_datEntI17.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 >= 35) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:void")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:void")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(160.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f55;
                    float f56;
                    float f57;
                    float f58;
                    float f59;
                    float f60;
                    float f61;
                    if (entityiterator instanceof TitanusgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 2.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt12 = (LivingEntity)entityiterator;
                        f61 = _livEnt12.m_21233_();
                    } else {
                        f61 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f61 / 20.0f + 800000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt13 = (LivingEntity)entityiterator;
                        f60 = _livEnt13.m_21233_();
                    } else {
                        f60 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource22, f60 / 20.0f + 800000.0f);
                    DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt14 = (LivingEntity)entityiterator;
                        f59 = _livEnt14.m_21233_();
                    } else {
                        f59 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource23, f59 / 20.0f + 800000.0f);
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f58 = _livEnt2.m_21233_();
                    } else {
                        f58 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt15 = (LivingEntity)entityiterator;
                        f57 = _livEnt15.m_21223_();
                    } else {
                        f57 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource24, (f58 + f57) / 5.0f + 8000000.0f);
                    DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f56 = _livEnt2.m_21233_();
                    } else {
                        f56 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt16 = (LivingEntity)entityiterator;
                        f55 = _livEnt16.m_21223_();
                    } else {
                        f55 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource25, (f56 + f55) / 5.0f + 8000000.0f);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI18 = (TitanusgolemtitanEntity)entity;
                n33 = (Integer)_datEntI18.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n33 = 0;
            }
            if (n33 == 22) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(320.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f62;
                    float f63;
                    float f64;
                    float f65;
                    float f66;
                    float f67;
                    float f68;
                    if (entityiterator instanceof TitanusgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 5.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt17 = (LivingEntity)entityiterator;
                        f68 = _livEnt17.m_21233_();
                    } else {
                        f68 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f68 / 20.0f + 1400000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt18 = (LivingEntity)entityiterator;
                        f67 = _livEnt18.m_21233_();
                    } else {
                        f67 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource26, f67 / 20.0f + 1400000.0f);
                    DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt19 = (LivingEntity)entityiterator;
                        f66 = _livEnt19.m_21233_();
                    } else {
                        f66 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource27, f66 / 20.0f + 1400000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f65 = _livEnt2.m_21233_();
                    } else {
                        f65 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt20 = (LivingEntity)entityiterator;
                        f64 = _livEnt20.m_21223_();
                    } else {
                        f64 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource28, (f65 + f64) / 5.0f + 1.4E7f);
                    DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f63 = _livEnt2.m_21233_();
                    } else {
                        f63 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt21 = (LivingEntity)entityiterator;
                        f62 = _livEnt21.m_21223_();
                    } else {
                        f62 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource29, (f63 + f62) / 5.0f + 1.4E7f);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI19 = (TitanusgolemtitanEntity)entity;
                n32 = (Integer)_datEntI19.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 >= 140) {
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    ((TitanusgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof TitanusgolemtitanEntity) {
            _datEntI = (TitanusgolemtitanEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 7) {
            int n35;
            int n36;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof TitanusgolemtitanEntity) {
                ((TitanusgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.td");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt22 = (Mob)entity;
                livingEntity = _mobEnt22.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity76;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity76 = _mobEnt3.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                f = entity.m_20270_(livingEntity76);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity77;
                LivingEntity livingEntity78;
                LivingEntity livingEntity79;
                LivingEntity livingEntity80;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity80 = _mobEnt4.m_5448_();
                } else {
                    livingEntity80 = null;
                }
                double d = livingEntity80.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity79 = _mobEnt2.m_5448_();
                } else {
                    livingEntity79 = null;
                }
                double d25 = livingEntity79.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity78 = _mobEnt4.m_5448_();
                } else {
                    livingEntity78 = null;
                }
                double d26 = d25 + (double)livingEntity78.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity77 = _mobEnt4.m_5448_();
                } else {
                    livingEntity77 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity77.m_20189_()));
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI20 = (TitanusgolemtitanEntity)entity;
                n36 = (Integer)_datEntI20.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n36 = 0;
            }
            if (n36 == 18) {
                float f69;
                LivingEntity livingEntity81;
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
                    livingEntity81 = _mobEnt3.m_5448_();
                } else {
                    livingEntity81 = null;
                }
                if (livingEntity81 != null) {
                    LivingEntity livingEntity82;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity82 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity82 = null;
                    }
                    f69 = entity.m_20270_(livingEntity82);
                } else {
                    f69 = -1.0f;
                }
                if (f69 > 1.0f && world instanceof ServerLevel) {
                    LivingEntity livingEntity83;
                    LivingEntity livingEntity84;
                    LivingEntity livingEntity85;
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile _entityToSpawn = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            GianttitanusEntity entityToSpawn = new GianttitanusEntity((EntityType<? extends GianttitanusEntity>)((EntityType)UltimateskeletonsModEntities.GIANTTITANUS.get()), level);
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
                        livingEntity85 = _mobEnt.m_5448_();
                    } else {
                        livingEntity85 = null;
                    }
                    double d = livingEntity85.m_20185_() - entity.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity84 = _mobEnt.m_5448_();
                    } else {
                        livingEntity84 = null;
                    }
                    double d27 = livingEntity84.m_20186_() - 40.0 - entity.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity83 = _mobEnt.m_5448_();
                    } else {
                        livingEntity83 = null;
                    }
                    _entityToSpawn.m_6686_(d, d27, livingEntity83.m_20189_() - entity.m_20189_(), 4.0f, 2.0f);
                    projectileLevel.m_7967_((Entity)_entityToSpawn);
                }
            }
            if (entity instanceof TitanusgolemtitanEntity) {
                TitanusgolemtitanEntity _datEntI21 = (TitanusgolemtitanEntity)entity;
                n35 = (Integer)_datEntI21.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 >= 50) {
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    _datEntSetI = (TitanusgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(TitanusgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof TitanusgolemtitanEntity) {
                    ((TitanusgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

