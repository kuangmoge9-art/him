/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
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
import net.mcreator.ultimateskeletons.entity.GiantironEntity;
import net.mcreator.ultimateskeletons.entity.IrongolemtitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
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

public class IrongolemtitanATKProcedure {
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
        IrongolemtitanEntity _datEntI;
        Mob _mobEnt;
        Object _mobEnt2;
        Object _mobEnt3;
        Mob _mobEnt4;
        Mob _mobEnt5;
        IrongolemtitanEntity _datEntSetI;
        Level _level;
        IrongolemtitanEntity _datEntI2;
        IrongolemtitanEntity _datEntI3;
        block590: {
            int n6;
            block592: {
                Level _level2;
                block591: {
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    IrongolemtitanEntity _datEntI4;
                    block587: {
                        LivingEntity livingEntity;
                        LivingEntity _livEnt3;
                        Mob _mobEnt6;
                        Mob _mobEnt7;
                        IrongolemtitanEntity _datEntI5;
                        block588: {
                            block589: {
                                LivingEntity livingEntity2;
                                float f;
                                LivingEntity livingEntity3;
                                LivingEntity livingEntity4;
                                int n11;
                                float f2;
                                IrongolemtitanEntity _datEntSetI2;
                                float f3;
                                LivingEntity _livEnt4;
                                Mob _entity;
                                LivingEntity _entity2;
                                if (entity == null) {
                                    return;
                                }
                                double theta = 0.0;
                                ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                    _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                }
                                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                    _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                                }
                                if (entity instanceof IrongolemtitanEntity) {
                                    int n12;
                                    IrongolemtitanEntity _datEntSetI3 = (IrongolemtitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                                    if (entity instanceof IrongolemtitanEntity) {
                                        _datEntI3 = (IrongolemtitanEntity)entity;
                                        n12 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_spawnTick);
                                    } else {
                                        n12 = 0;
                                    }
                                    synchedEntityData.m_135381_(IrongolemtitanEntity.DATA_spawnTick, (Object)(n12 + 1));
                                }
                                if (entity.m_5446_().getString().equals("growing")) {
                                    int n13;
                                    if (entity instanceof IrongolemtitanEntity) {
                                        _datEntI2 = (IrongolemtitanEntity)entity;
                                        n13 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_spawnTick);
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
                                            _entity = (Mob)entity;
                                            _entity.m_6710_(null);
                                        }
                                        if (entity instanceof LivingEntity) {
                                            _entity = (LivingEntity)entity;
                                            _entity.m_21153_(5000000.0f);
                                        }
                                        if (entity instanceof IrongolemtitanEntity) {
                                            _datEntI3 = (IrongolemtitanEntity)entity;
                                            n15 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_spawnTick);
                                        } else {
                                            n15 = 0;
                                        }
                                        if (n15 <= 10 && entity instanceof IrongolemtitanEntity) {
                                            ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.spawn");
                                        }
                                        if (entity instanceof IrongolemtitanEntity) {
                                            _datEntI3 = (IrongolemtitanEntity)entity;
                                            n14 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_spawnTick);
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
                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Irongolemtitan has been created!!!"), false);
                                            }
                                        }
                                        if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n16;
                                    if (entity instanceof IrongolemtitanEntity) {
                                        _datEntI2 = (IrongolemtitanEntity)entity;
                                        n16 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
                                    } else {
                                        n16 = 0;
                                    }
                                    if (n16 != 0) {
                                        float f4;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)entity;
                                            f4 = _livEnt5.m_21223_();
                                        } else {
                                            f4 = -1.0f;
                                        }
                                        if (f4 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof IrongolemtitanEntity)) continue;
                                                ((IrongolemtitanEntity)entity).setAnimation("empty");
                                            }
                                        }
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity;
                                    f3 = _livEnt4.m_21223_();
                                } else {
                                    f3 = -1.0f;
                                }
                                if (f3 > 0.0f && entity instanceof IrongolemtitanEntity) {
                                    _datEntSetI2 = (IrongolemtitanEntity)entity;
                                    _datEntSetI2.m_20088_().m_135381_(IrongolemtitanEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity;
                                    f2 = _livEnt4.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) {
                                    int n17;
                                    if (entity instanceof Mob) {
                                        _entity = (Mob)entity;
                                        _entity.m_6710_(null);
                                    }
                                    if (entity instanceof IrongolemtitanEntity) {
                                        _datEntI3 = (IrongolemtitanEntity)entity;
                                        n17 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
                                    } else {
                                        n17 = 0;
                                    }
                                    if (n17 == 0) {
                                        int n18;
                                        int n19;
                                        if (entity instanceof IrongolemtitanEntity) {
                                            int n20;
                                            _datEntSetI = (IrongolemtitanEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                            if (entity instanceof IrongolemtitanEntity) {
                                                _datEntI5 = (IrongolemtitanEntity)entity;
                                                n20 = (Integer)_datEntI5.m_20088_().m_135370_(IrongolemtitanEntity.DATA_deathTick);
                                            } else {
                                                n20 = 0;
                                            }
                                            synchedEntityData.m_135381_(IrongolemtitanEntity.DATA_deathTick, (Object)(n20 + 1));
                                        }
                                        if (entity instanceof IrongolemtitanEntity) {
                                            _datEntI4 = (IrongolemtitanEntity)entity;
                                            n19 = (Integer)_datEntI4.m_20088_().m_135370_(IrongolemtitanEntity.DATA_deathTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 == 1 && world instanceof Level) {
                                            _level2 = (Level)world;
                                            if (!_level2.m_5776_()) {
                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof IrongolemtitanEntity) {
                                            ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.death");
                                        }
                                        if (entity instanceof IrongolemtitanEntity) {
                                            _datEntI4 = (IrongolemtitanEntity)entity;
                                            n18 = (Integer)_datEntI4.m_20088_().m_135370_(IrongolemtitanEntity.DATA_deathTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 >= 600 && !entity.m_9236_().m_5776_()) {
                                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                        }
                                    }
                                }
                                if (world.m_5776_()) break block587;
                                if (entity instanceof IrongolemtitanEntity) {
                                    _datEntI2 = (IrongolemtitanEntity)entity;
                                    n11 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
                                } else {
                                    n11 = 0;
                                }
                                if (n11 != 0 && entity instanceof IrongolemtitanEntity) {
                                    int n21;
                                    _datEntSetI2 = (IrongolemtitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                    if (entity instanceof IrongolemtitanEntity) {
                                        _datEntI4 = (IrongolemtitanEntity)entity;
                                        n21 = (Integer)_datEntI4.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
                                    } else {
                                        n21 = 0;
                                    }
                                    synchedEntityData.m_135381_(IrongolemtitanEntity.DATA_animationTick, (Object)(n21 + 1));
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity4 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity4 = null;
                                }
                                if (livingEntity4 == null) break block588;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    v18 = _mobEnt6.m_5448_();
                                } else {
                                    v18 = livingEntity3 = null;
                                }
                                if (livingEntity3 instanceof LivingEntity) {
                                    _livEnt3 = livingEntity3;
                                    f = _livEnt3.m_21223_();
                                } else {
                                    f = -1.0f;
                                }
                                if (f <= 0.0f) break block589;
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity2 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block588;
                            }
                            if (entity instanceof Mob) {
                                Mob _entity = (Mob)entity;
                                _entity.m_6710_(null);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt7 = (Mob)entity;
                            livingEntity = _mobEnt7.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            float f;
                            LivingEntity livingEntity5;
                            LivingEntity livingEntity6;
                            LivingEntity livingEntity7;
                            LivingEntity livingEntity8;
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity8 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity8 = null;
                            }
                            double d = livingEntity8.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity7 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity7 = null;
                            }
                            double d2 = livingEntity7.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity6 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity6 = null;
                            }
                            double d3 = d2 + (double)livingEntity6.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity5 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity5 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity5.m_20189_()));
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                v29 = _mobEnt6.m_5448_();
                            } else {
                                v29 = _mobEnt5 = null;
                            }
                            if (_mobEnt5 instanceof LivingEntity) {
                                _livEnt3 = (LivingEntity)_mobEnt5;
                                f = _livEnt3.m_21223_();
                            } else {
                                f = -1.0f;
                            }
                            if (f > 0.0f) {
                                int n22;
                                if (entity instanceof IrongolemtitanEntity) {
                                    _datEntI5 = (IrongolemtitanEntity)entity;
                                    n22 = (Integer)_datEntI5.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
                                } else {
                                    n22 = 0;
                                }
                                if (n22 == 0) {
                                    float f5;
                                    LivingEntity livingEntity9;
                                    Mob _mobEnt8;
                                    Mob _mobEnt9;
                                    Mob _mobEnt10;
                                    Mob _mobEnt11;
                                    Mob _mobEnt12;
                                    float f6;
                                    LivingEntity livingEntity10;
                                    float f7;
                                    LivingEntity livingEntity11;
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity11 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity11 = null;
                                    }
                                    if (livingEntity11 != null) {
                                        LivingEntity livingEntity12;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity12 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity12 = null;
                                        }
                                        f7 = entity.m_20270_(livingEntity12);
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
                                        livingEntity10 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity10 = null;
                                    }
                                    if (livingEntity10 != null) {
                                        LivingEntity livingEntity13;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity13 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity13 = null;
                                        }
                                        f6 = entity.m_20270_(livingEntity13);
                                    } else {
                                        f6 = -1.0f;
                                    }
                                    if (f6 > 75.0f) {
                                        float f8;
                                        LivingEntity livingEntity14;
                                        LivingEntity livingEntity15;
                                        float f9;
                                        LivingEntity livingEntity16;
                                        LivingEntity livingEntity17;
                                        if (entity instanceof Mob) {
                                            _mobEnt12 = (Mob)entity;
                                            livingEntity17 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity17 = null;
                                        }
                                        double d4 = livingEntity17.m_20185_() - entity.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity16 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity16 = null;
                                        }
                                        if (livingEntity16 != null) {
                                            LivingEntity livingEntity18;
                                            if (entity instanceof Mob) {
                                                _mobEnt = (Mob)entity;
                                                livingEntity18 = _mobEnt.m_5448_();
                                            } else {
                                                livingEntity18 = null;
                                            }
                                            f9 = entity.m_20270_(livingEntity18);
                                        } else {
                                            f9 = -1.0f;
                                        }
                                        double d5 = d4 / (double)f9 * 0.7;
                                        if (entity instanceof Mob) {
                                            _mobEnt12 = (Mob)entity;
                                            livingEntity15 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity15 = null;
                                        }
                                        double d6 = livingEntity15.m_20189_() - entity.m_20189_();
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity14 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity14 = null;
                                        }
                                        if (livingEntity14 != null) {
                                            LivingEntity livingEntity19;
                                            if (entity instanceof Mob) {
                                                _mobEnt = (Mob)entity;
                                                livingEntity19 = _mobEnt.m_5448_();
                                            } else {
                                                livingEntity19 = null;
                                            }
                                            f8 = entity.m_20270_(livingEntity19);
                                        } else {
                                            f8 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d5, 0.0, d6 / (double)f8 * 0.7));
                                    } else {
                                        LivingEntity livingEntity20;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity20 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity20 = null;
                                        }
                                        if (livingEntity20.m_20206_() > 8.0f) {
                                            float f10;
                                            LivingEntity livingEntity21;
                                            if (entity instanceof Mob) {
                                                _mobEnt11 = (Mob)entity;
                                                livingEntity21 = _mobEnt11.m_5448_();
                                            } else {
                                                livingEntity21 = null;
                                            }
                                            if (livingEntity21 != null) {
                                                LivingEntity livingEntity22;
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity22 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity22 = null;
                                                }
                                                f10 = entity.m_20270_(livingEntity22);
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (f10 > 40.0f) {
                                                float f11;
                                                LivingEntity livingEntity23;
                                                LivingEntity livingEntity24;
                                                float f12;
                                                LivingEntity livingEntity25;
                                                LivingEntity livingEntity26;
                                                if (entity instanceof Mob) {
                                                    _mobEnt10 = (Mob)entity;
                                                    livingEntity26 = _mobEnt10.m_5448_();
                                                } else {
                                                    livingEntity26 = null;
                                                }
                                                double d7 = livingEntity26.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity25 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity25 = null;
                                                }
                                                if (livingEntity25 != null) {
                                                    LivingEntity livingEntity27;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity27 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity27 = null;
                                                    }
                                                    f12 = entity.m_20270_(livingEntity27);
                                                } else {
                                                    f12 = -1.0f;
                                                }
                                                double d8 = d7 / (double)f12 * 0.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt10 = (Mob)entity;
                                                    livingEntity24 = _mobEnt10.m_5448_();
                                                } else {
                                                    livingEntity24 = null;
                                                }
                                                double d9 = livingEntity24.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity23 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity23 = null;
                                                }
                                                if (livingEntity23 != null) {
                                                    LivingEntity livingEntity28;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity28 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity28 = null;
                                                    }
                                                    f11 = entity.m_20270_(livingEntity28);
                                                } else {
                                                    f11 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f11 * 0.5));
                                            }
                                        } else {
                                            float f13;
                                            LivingEntity livingEntity29;
                                            if (entity instanceof Mob) {
                                                _mobEnt11 = (Mob)entity;
                                                livingEntity29 = _mobEnt11.m_5448_();
                                            } else {
                                                livingEntity29 = null;
                                            }
                                            if (livingEntity29 != null) {
                                                LivingEntity livingEntity30;
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity30 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity30 = null;
                                                }
                                                f13 = entity.m_20270_(livingEntity30);
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (f13 > 12.0f) {
                                                float f14;
                                                LivingEntity livingEntity31;
                                                LivingEntity livingEntity32;
                                                float f15;
                                                LivingEntity livingEntity33;
                                                LivingEntity livingEntity34;
                                                if (entity instanceof Mob) {
                                                    _mobEnt10 = (Mob)entity;
                                                    livingEntity34 = _mobEnt10.m_5448_();
                                                } else {
                                                    livingEntity34 = null;
                                                }
                                                double d10 = livingEntity34.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity33 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity33 = null;
                                                }
                                                if (livingEntity33 != null) {
                                                    LivingEntity livingEntity35;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity35 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity35 = null;
                                                    }
                                                    f15 = entity.m_20270_(livingEntity35);
                                                } else {
                                                    f15 = -1.0f;
                                                }
                                                double d11 = d10 / (double)f15 * 0.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt10 = (Mob)entity;
                                                    livingEntity32 = _mobEnt10.m_5448_();
                                                } else {
                                                    livingEntity32 = null;
                                                }
                                                double d12 = livingEntity32.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity31 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity31 = null;
                                                }
                                                if (livingEntity31 != null) {
                                                    LivingEntity livingEntity36;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity36 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity36 = null;
                                                    }
                                                    f14 = entity.m_20270_(livingEntity36);
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d11, 0.0, d12 / (double)f14 * 0.5));
                                            }
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity9 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity9 = null;
                                    }
                                    if (livingEntity9 != null) {
                                        LivingEntity livingEntity37;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity37 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity37 = null;
                                        }
                                        f5 = entity.m_20270_(livingEntity37);
                                    } else {
                                        f5 = -1.0f;
                                    }
                                    if (f5 < 160.0f) {
                                        float f16;
                                        LivingEntity livingEntity38;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity38 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity38 = null;
                                        }
                                        if (livingEntity38 != null) {
                                            LivingEntity livingEntity39;
                                            if (entity instanceof Mob) {
                                                _mobEnt11 = (Mob)entity;
                                                livingEntity39 = _mobEnt11.m_5448_();
                                            } else {
                                                livingEntity39 = null;
                                            }
                                            f16 = entity.m_20270_(livingEntity39);
                                        } else {
                                            f16 = -1.0f;
                                        }
                                        if (f16 <= 60.0f) {
                                            LivingEntity livingEntity40;
                                            if (entity instanceof Mob) {
                                                _mobEnt12 = (Mob)entity;
                                                livingEntity40 = _mobEnt12.m_5448_();
                                            } else {
                                                livingEntity40 = null;
                                            }
                                            if (livingEntity40.m_20206_() > 6.0f) {
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                                    if (entity instanceof IrongolemtitanEntity) {
                                                        _datEntSetI = (IrongolemtitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)5);
                                                    }
                                                } else if (entity instanceof IrongolemtitanEntity) {
                                                    _datEntSetI = (IrongolemtitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)4);
                                                }
                                            } else if (entity instanceof IrongolemtitanEntity) {
                                                _datEntSetI = (IrongolemtitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                            }
                                        }
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            int n23;
                                            if (entity instanceof IrongolemtitanEntity) {
                                                _datEntI = (IrongolemtitanEntity)entity;
                                                n23 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
                                            } else {
                                                n23 = 0;
                                            }
                                            if (n23 == 0) {
                                                float f17;
                                                LivingEntity livingEntity41;
                                                if (entity instanceof Mob) {
                                                    _mobEnt11 = (Mob)entity;
                                                    livingEntity41 = _mobEnt11.m_5448_();
                                                } else {
                                                    livingEntity41 = null;
                                                }
                                                if (livingEntity41 != null) {
                                                    LivingEntity livingEntity42;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt12 = (Mob)entity;
                                                        livingEntity42 = _mobEnt12.m_5448_();
                                                    } else {
                                                        livingEntity42 = null;
                                                    }
                                                    f17 = entity.m_20270_(livingEntity42);
                                                } else {
                                                    f17 = -1.0f;
                                                }
                                                if (f17 > 80.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)20) == 5) {
                                                        LivingEntity livingEntity43;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt8 = (Mob)entity;
                                                            livingEntity43 = _mobEnt8.m_5448_();
                                                        } else {
                                                            livingEntity43 = null;
                                                        }
                                                        if (livingEntity43.m_20206_() > 6.0f) {
                                                            if (entity instanceof IrongolemtitanEntity) {
                                                                _datEntSetI = (IrongolemtitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)6);
                                                            }
                                                        } else if (entity instanceof IrongolemtitanEntity) {
                                                            _datEntSetI = (IrongolemtitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)6);
                                                        }
                                                    }
                                                } else {
                                                    float f18;
                                                    LivingEntity livingEntity44;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity44 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    if (livingEntity44 != null) {
                                                        LivingEntity livingEntity45;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt9 = (Mob)entity;
                                                            livingEntity45 = _mobEnt9.m_5448_();
                                                        } else {
                                                            livingEntity45 = null;
                                                        }
                                                        f18 = entity.m_20270_(livingEntity45);
                                                    } else {
                                                        f18 = -1.0f;
                                                    }
                                                    if (f18 > 60.0f) {
                                                        LivingEntity livingEntity46;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt10 = (Mob)entity;
                                                            livingEntity46 = _mobEnt10.m_5448_();
                                                        } else {
                                                            livingEntity46 = null;
                                                        }
                                                        if (livingEntity46.m_20206_() > 6.0f) {
                                                            if (entity instanceof IrongolemtitanEntity) {
                                                                _datEntSetI = (IrongolemtitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
                                                            }
                                                        } else if (entity instanceof IrongolemtitanEntity) {
                                                            _datEntSetI = (IrongolemtitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
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
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI2 = (IrongolemtitanEntity)entity;
                        n10 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
                    } else {
                        n10 = 0;
                    }
                    if (n10 != true) break block590;
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof IrongolemtitanEntity) {
                        ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zt");
                    }
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI3 = (IrongolemtitanEntity)entity;
                        n9 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 1) {
                        float f;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity = _mobEnt4.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity47;
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity47 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity47 = null;
                            }
                            f = entity.m_20270_(livingEntity47);
                        } else {
                            f = -1.0f;
                        }
                        if (f > 1.0f) {
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
                                _mobEnt2 = (Mob)entity;
                                livingEntity50 = _mobEnt2.m_5448_();
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
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI3 = (IrongolemtitanEntity)entity;
                        n8 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 == 56) break block591;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI4 = (IrongolemtitanEntity)entity;
                        n7 = (Integer)_datEntI4.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
                    } else {
                        n7 = 0;
                    }
                    if (n7 != 96) break block592;
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
                    int n24;
                    float f;
                    float f19;
                    int n25;
                    float f20;
                    float f21;
                    LivingEntity _livEnt6;
                    int n26;
                    float f22;
                    int n27;
                    float f23;
                    int n28;
                    IrongolemtitanEntity _datEntI6;
                    float f24;
                    if (entityiterator instanceof IrongolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f24 = _livEnt2.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f25 = f24 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI6 = (IrongolemtitanEntity)entity;
                        n28 = (Integer)_datEntI6.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n28 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f25 + (float)(n28 * 10000));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f23 = _livEnt2.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    float f26 = f23 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI6 = (IrongolemtitanEntity)entity;
                        n27 = (Integer)_datEntI6.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n27 = 0;
                    }
                    entityiterator.m_6469_(damageSource2, f26 + (float)(n27 * 10000));
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f22 = _livEnt2.m_21233_();
                    } else {
                        f22 = -1.0f;
                    }
                    float f27 = f22 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI6 = (IrongolemtitanEntity)entity;
                        n26 = (Integer)_datEntI6.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n26 = 0;
                    }
                    entityiterator.m_6469_(damageSource3, f27 + (float)(n26 * 10000));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator;
                        f21 = _livEnt6.m_21233_();
                    } else {
                        f21 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f20 = _livEnt2.m_21223_();
                    } else {
                        f20 = -1.0f;
                    }
                    float f28 = (f21 + f20) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI6 = (IrongolemtitanEntity)entity;
                        n25 = (Integer)_datEntI6.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n25 = 0;
                    }
                    entityiterator.m_6469_(damageSource4, f28 + (float)(n25 * 100000));
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator;
                        f19 = _livEnt6.m_21233_();
                    } else {
                        f19 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f29 = (f19 + f) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI6 = (IrongolemtitanEntity)entity;
                        n24 = (Integer)_datEntI6.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n24 = 0;
                    }
                    entityiterator.m_6469_(damageSource5, f29 + (float)(n24 * 100000));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n6 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n6 = 0;
            }
            if (n6 >= 120) {
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    ((IrongolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof IrongolemtitanEntity) {
            _datEntI2 = (IrongolemtitanEntity)entity;
            n5 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 2) {
            int n29;
            int n30;
            int n31;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof IrongolemtitanEntity) {
                ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zj");
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n31 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity = _mobEnt4.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity52;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity52 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity52 = null;
                    }
                    f = entity.m_20270_(livingEntity52);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity53;
                    LivingEntity livingEntity54;
                    LivingEntity livingEntity55;
                    LivingEntity livingEntity56;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity56 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity56 = null;
                    }
                    double d = livingEntity56.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity55 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity55 = null;
                    }
                    double d15 = livingEntity55.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity54 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity54 = null;
                    }
                    double d16 = d15 + (double)livingEntity54.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity53 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity53 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity53.m_20189_()));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n30 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 == 36) {
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
                    int n32;
                    float f;
                    float f30;
                    int n33;
                    float f31;
                    float f32;
                    int n34;
                    float f33;
                    int n35;
                    float f34;
                    int n36;
                    float f35;
                    if (entityiterator instanceof IrongolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f35 = _livEnt.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    float f36 = f35 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n36 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n36 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f36 + (float)(n36 * 10000));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f34 = _livEnt.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f37 = f34 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n35 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n35 = 0;
                    }
                    entityiterator.m_6469_(damageSource6, f37 + (float)(n35 * 10000));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f33 = _livEnt.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    float f38 = f33 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n34 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n34 = 0;
                    }
                    entityiterator.m_6469_(damageSource7, f38 + (float)(n34 * 10000));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f32 = _livEnt2.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f31 = _livEnt.m_21223_();
                    } else {
                        f31 = -1.0f;
                    }
                    float f39 = (f32 + f31) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n33 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n33 = 0;
                    }
                    entityiterator.m_6469_(damageSource8, f39 + (float)(n33 * 100000));
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f30 = _livEnt2.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f40 = (f30 + f) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n32 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n32 = 0;
                    }
                    entityiterator.m_6469_(damageSource9, f40 + (float)(n32 * 100000));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n29 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 >= 60) {
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    ((IrongolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof IrongolemtitanEntity) {
            _datEntI2 = (IrongolemtitanEntity)entity;
            n4 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 3) {
            int n37;
            int n38;
            int n39;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof IrongolemtitanEntity) {
                ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.gt");
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n39 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity = _mobEnt4.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity57;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity57 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity57 = null;
                    }
                    f = entity.m_20270_(livingEntity57);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity58;
                    LivingEntity livingEntity59;
                    LivingEntity livingEntity60;
                    LivingEntity livingEntity61;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity61 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity61 = null;
                    }
                    double d = livingEntity61.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity60 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity60 = null;
                    }
                    double d17 = livingEntity60.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity59 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity59 = null;
                    }
                    double d18 = d17 + (double)livingEntity59.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity58 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity58 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity58.m_20189_()));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n38 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n38 = 0;
            }
            if (n38 == 48) {
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
                    int n40;
                    float f;
                    float f41;
                    int n41;
                    float f42;
                    float f43;
                    int n42;
                    float f44;
                    int n43;
                    float f45;
                    int n44;
                    float f46;
                    if (entityiterator instanceof IrongolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f46 = _livEnt.m_21233_();
                    } else {
                        f46 = -1.0f;
                    }
                    float f47 = f46 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n44 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n44 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f47 + (float)(n44 * 21000));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f45 = _livEnt.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    float f48 = f45 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n43 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n43 = 0;
                    }
                    entityiterator.m_6469_(damageSource10, f48 + (float)(n43 * 21000));
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f44 = _livEnt.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    float f49 = f44 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n42 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n42 = 0;
                    }
                    entityiterator.m_6469_(damageSource11, f49 + (float)(n42 * 21000));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f43 = _livEnt2.m_21233_();
                    } else {
                        f43 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f42 = _livEnt.m_21223_();
                    } else {
                        f42 = -1.0f;
                    }
                    float f50 = (f43 + f42) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n41 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n41 = 0;
                    }
                    entityiterator.m_6469_(damageSource12, f50 + (float)(n41 * 210000));
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f41 = _livEnt2.m_21233_();
                    } else {
                        f41 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f51 = (f41 + f) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n40 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n40 = 0;
                    }
                    entityiterator.m_6469_(damageSource13, f51 + (float)(n40 * 210000));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n37 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n37 = 0;
            }
            if (n37 >= 80) {
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    ((IrongolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof IrongolemtitanEntity) {
            _datEntI2 = (IrongolemtitanEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 4) {
            int n45;
            int n46;
            int n47;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof IrongolemtitanEntity) {
                ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.attack");
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n47 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity = _mobEnt4.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity62;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity62 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity62 = null;
                    }
                    f = entity.m_20270_(livingEntity62);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity63;
                    LivingEntity livingEntity64;
                    LivingEntity livingEntity65;
                    LivingEntity livingEntity66;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity66 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    double d = livingEntity66.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity65 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity65 = null;
                    }
                    double d19 = livingEntity65.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity64 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity64 = null;
                    }
                    double d20 = d19 + (double)livingEntity64.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity63 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity63 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity63.m_20189_()));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n46 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n46 = 0;
            }
            if (n46 == 14) {
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
                    int n48;
                    float f;
                    float f52;
                    int n49;
                    float f53;
                    float f54;
                    int n50;
                    float f55;
                    int n51;
                    float f56;
                    int n52;
                    float f57;
                    if (entityiterator instanceof IrongolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f57 = _livEnt.m_21233_();
                    } else {
                        f57 = -1.0f;
                    }
                    float f58 = f57 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n52 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n52 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f58 + (float)(n52 * 42000));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f56 = _livEnt.m_21233_();
                    } else {
                        f56 = -1.0f;
                    }
                    float f59 = f56 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n51 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n51 = 0;
                    }
                    entityiterator.m_6469_(damageSource14, f59 + (float)(n51 * 42000));
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f55 = _livEnt.m_21233_();
                    } else {
                        f55 = -1.0f;
                    }
                    float f60 = f55 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n50 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n50 = 0;
                    }
                    entityiterator.m_6469_(damageSource15, f60 + (float)(n50 * 42000));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f54 = _livEnt2.m_21233_();
                    } else {
                        f54 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f53 = _livEnt.m_21223_();
                    } else {
                        f53 = -1.0f;
                    }
                    float f61 = (f54 + f53) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n49 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n49 = 0;
                    }
                    entityiterator.m_6469_(damageSource16, f61 + (float)(n49 * 420000));
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f52 = _livEnt2.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f62 = (f52 + f) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        _datEntI = (IrongolemtitanEntity)entity;
                        n48 = (Integer)_datEntI.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n48 = 0;
                    }
                    entityiterator.m_6469_(damageSource17, f62 + (float)(n48 * 420000));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n45 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n45 = 0;
            }
            if (n45 >= 30) {
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    ((IrongolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof IrongolemtitanEntity) {
            _datEntI2 = (IrongolemtitanEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 5) {
            int n53;
            int n54;
            int n55;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof IrongolemtitanEntity) {
                ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.fs");
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n55 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity = _mobEnt4.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity67;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity67 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity67 = null;
                    }
                    f = entity.m_20270_(livingEntity67);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity68;
                    LivingEntity livingEntity69;
                    LivingEntity livingEntity70;
                    LivingEntity livingEntity71;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity71 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity71 = null;
                    }
                    double d = livingEntity71.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity70 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity70 = null;
                    }
                    double d21 = livingEntity70.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity69 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity69 = null;
                    }
                    double d22 = d21 + (double)livingEntity69.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity68 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity68 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity68.m_20189_()));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n54 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 == 40) {
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
                    int n56;
                    float f;
                    float f63;
                    int n57;
                    float f64;
                    float f65;
                    int n58;
                    float f66;
                    int n59;
                    float f67;
                    int n60;
                    float f68;
                    if (entityiterator instanceof IrongolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 5.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f68 = _livEnt.m_21233_();
                    } else {
                        f68 = -1.0f;
                    }
                    float f69 = f68 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        IrongolemtitanEntity _datEntI7 = (IrongolemtitanEntity)entity;
                        n60 = (Integer)_datEntI7.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n60 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f69 + (float)(n60 * 84000));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f67 = _livEnt.m_21233_();
                    } else {
                        f67 = -1.0f;
                    }
                    float f70 = f67 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        IrongolemtitanEntity _datEntI8 = (IrongolemtitanEntity)entity;
                        n59 = (Integer)_datEntI8.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n59 = 0;
                    }
                    entityiterator.m_6469_(damageSource18, f70 + (float)(n59 * 84000));
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f66 = _livEnt.m_21233_();
                    } else {
                        f66 = -1.0f;
                    }
                    float f71 = f66 / 20.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        IrongolemtitanEntity _datEntI9 = (IrongolemtitanEntity)entity;
                        n58 = (Integer)_datEntI9.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n58 = 0;
                    }
                    entityiterator.m_6469_(damageSource19, f71 + (float)(n58 * 84000));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f65 = _livEnt2.m_21233_();
                    } else {
                        f65 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f64 = _livEnt.m_21223_();
                    } else {
                        f64 = -1.0f;
                    }
                    float f72 = (f65 + f64) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        IrongolemtitanEntity _datEntI10 = (IrongolemtitanEntity)entity;
                        n57 = (Integer)_datEntI10.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n57 = 0;
                    }
                    entityiterator.m_6469_(damageSource20, f72 + (float)(n57 * 840000));
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f63 = _livEnt2.m_21233_();
                    } else {
                        f63 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f73 = (f63 + f) / 5.0f;
                    if (entity instanceof IrongolemtitanEntity) {
                        IrongolemtitanEntity _datEntI11 = (IrongolemtitanEntity)entity;
                        n56 = (Integer)_datEntI11.m_20088_().m_135370_(IrongolemtitanEntity.DATA_Tick);
                    } else {
                        n56 = 0;
                    }
                    entityiterator.m_6469_(damageSource21, f73 + (float)(n56 * 840000));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n53 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n53 = 0;
            }
            if (n53 >= 60) {
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    ((IrongolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof IrongolemtitanEntity) {
            _datEntI2 = (IrongolemtitanEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 6) {
            int n61;
            int n62;
            int n63;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof IrongolemtitanEntity) {
                ((IrongolemtitanEntity)entity).setAnimation("animation.irongolemtitan.td");
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n63 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n63 = 0;
            }
            if (n63 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity = _mobEnt4.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity72;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity72 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity72 = null;
                    }
                    f = entity.m_20270_(livingEntity72);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity73;
                    LivingEntity livingEntity74;
                    LivingEntity livingEntity75;
                    LivingEntity livingEntity76;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity76 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity76 = null;
                    }
                    double d = livingEntity76.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity75 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity75 = null;
                    }
                    double d23 = livingEntity75.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity74 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity74 = null;
                    }
                    double d24 = d23 + (double)livingEntity74.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity73 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity73 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity73.m_20189_()));
                }
            }
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n62 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n62 = 0;
            }
            if (n62 == 18) {
                float f;
                LivingEntity livingEntity;
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity = _mobEnt4.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity77;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity77 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity77 = null;
                    }
                    f = entity.m_20270_(livingEntity77);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f && world instanceof ServerLevel) {
                    LivingEntity livingEntity78;
                    LivingEntity livingEntity79;
                    LivingEntity livingEntity80;
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile _entityToSpawn = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            GiantironEntity entityToSpawn = new GiantironEntity((EntityType<? extends GiantironEntity>)((EntityType)UltimateskeletonsModEntities.GIANTIRON.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                    _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 40.0, z + entity.m_20154_().f_82481_ * 24.0);
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
            if (entity instanceof IrongolemtitanEntity) {
                _datEntI3 = (IrongolemtitanEntity)entity;
                n61 = (Integer)_datEntI3.m_20088_().m_135370_(IrongolemtitanEntity.DATA_animationTick);
            } else {
                n61 = 0;
            }
            if (n61 >= 50) {
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    _datEntSetI = (IrongolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(IrongolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof IrongolemtitanEntity) {
                    ((IrongolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

