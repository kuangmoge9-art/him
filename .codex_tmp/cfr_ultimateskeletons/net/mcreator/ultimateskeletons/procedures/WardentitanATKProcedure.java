/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
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
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
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
import net.mcreator.ultimateskeletons.entity.IrongolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.WardentitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class WardentitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        int n3;
        LivingEntity _livEnt2;
        Object _mobEnt;
        Object _mobEnt2;
        Mob _mobEnt3;
        WardentitanEntity _datEntI;
        WardentitanEntity _datEntI2;
        WardentitanEntity _datEntI3;
        block486: {
            int n4;
            block488: {
                Level _level;
                block487: {
                    int n5;
                    int n6;
                    int n7;
                    int n8;
                    block483: {
                        LivingEntity livingEntity;
                        Mob _mobEnt4;
                        Mob _mobEnt5;
                        block484: {
                            block485: {
                                LivingEntity livingEntity2;
                                float f;
                                Object object;
                                LivingEntity livingEntity3;
                                int n9;
                                float f2;
                                WardentitanEntity _datEntSetI;
                                float f3;
                                LivingEntity _livEnt3;
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
                                if (entity instanceof WardentitanEntity) {
                                    int n10;
                                    WardentitanEntity _datEntSetI2 = (WardentitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                    if (entity instanceof WardentitanEntity) {
                                        _datEntI3 = (WardentitanEntity)entity;
                                        n10 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_spawnTick);
                                    } else {
                                        n10 = 0;
                                    }
                                    synchedEntityData.m_135381_(WardentitanEntity.DATA_spawnTick, (Object)(n10 + 1));
                                }
                                if (entity.m_5446_().getString().equals("growing")) {
                                    int n11;
                                    if (entity instanceof WardentitanEntity) {
                                        _datEntI2 = (WardentitanEntity)entity;
                                        n11 = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_spawnTick);
                                    } else {
                                        n11 = 0;
                                    }
                                    if (n11 <= 720) {
                                        int n12;
                                        int n13;
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
                                            _entity.m_21153_(1000000.0f);
                                        }
                                        if (entity instanceof WardentitanEntity) {
                                            _datEntI3 = (WardentitanEntity)entity;
                                            n13 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_spawnTick);
                                        } else {
                                            n13 = 0;
                                        }
                                        if (n13 <= 10 && entity instanceof WardentitanEntity) {
                                            ((WardentitanEntity)entity).setAnimation("animation.wardentitan.spawn");
                                        }
                                        if (entity instanceof WardentitanEntity) {
                                            _datEntI3 = (WardentitanEntity)entity;
                                            n12 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_spawnTick);
                                        } else {
                                            n12 = 0;
                                        }
                                        if (n12 == 720) {
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                }
                                            }
                                            if (!world.m_5776_() && world.m_7654_() != null) {
                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Wardentitan has been created!!!"), false);
                                            }
                                        }
                                        if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                    }
                                } else {
                                    int n14;
                                    if (entity instanceof WardentitanEntity) {
                                        _datEntI2 = (WardentitanEntity)entity;
                                        n14 = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_spawnTick);
                                    } else {
                                        n14 = 0;
                                    }
                                    if (n14 <= 135) {
                                        int n15;
                                        int n16;
                                        entity.m_6593_((Component)Component.m_237113_((String)"Wardentitan"));
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
                                            _entity.m_21153_(1000000.0f);
                                        }
                                        if (entity instanceof WardentitanEntity) {
                                            _datEntI3 = (WardentitanEntity)entity;
                                            n16 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_spawnTick);
                                        } else {
                                            n16 = 0;
                                        }
                                        if (n16 <= 10 && entity instanceof WardentitanEntity) {
                                            ((WardentitanEntity)entity).setAnimation("animation.wardentitan.spawn2");
                                        }
                                        if (entity instanceof WardentitanEntity) {
                                            _datEntI3 = (WardentitanEntity)entity;
                                            n15 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_spawnTick);
                                        } else {
                                            n15 = 0;
                                        }
                                        if (n15 == 135) {
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                }
                                            }
                                            if (!world.m_5776_() && world.m_7654_() != null) {
                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Wardentitan awake!!!"), false);
                                            }
                                        }
                                        if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n17;
                                    if (entity instanceof WardentitanEntity) {
                                        _datEntI2 = (WardentitanEntity)entity;
                                        n17 = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
                                    } else {
                                        n17 = 0;
                                    }
                                    if (n17 != 0) {
                                        float f4;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt4 = (LivingEntity)entity;
                                            f4 = _livEnt4.m_21223_();
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
                                    _livEnt3 = (LivingEntity)entity;
                                    f3 = _livEnt3.m_21223_();
                                } else {
                                    f3 = -1.0f;
                                }
                                if (f3 > 0.0f && entity instanceof WardentitanEntity) {
                                    _datEntSetI = (WardentitanEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entity;
                                    f2 = _livEnt3.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) {
                                    int n18;
                                    if (entity instanceof Mob) {
                                        _entity = (Mob)entity;
                                        _entity.m_6710_(null);
                                    }
                                    if (entity instanceof WardentitanEntity) {
                                        _datEntI3 = (WardentitanEntity)entity;
                                        n18 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
                                    } else {
                                        n18 = 0;
                                    }
                                    if (n18 == 0) {
                                        int n19;
                                        int n20;
                                        if (entity instanceof WardentitanEntity) {
                                            int n21;
                                            WardentitanEntity _datEntSetI3 = (WardentitanEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                                            if (entity instanceof WardentitanEntity) {
                                                _datEntI = (WardentitanEntity)entity;
                                                n21 = (Integer)_datEntI.m_20088_().m_135370_(WardentitanEntity.DATA_deathTick);
                                            } else {
                                                n21 = 0;
                                            }
                                            synchedEntityData.m_135381_(WardentitanEntity.DATA_deathTick, (Object)(n21 + 1));
                                        }
                                        if (entity instanceof WardentitanEntity) {
                                            WardentitanEntity _datEntI4 = (WardentitanEntity)entity;
                                            n20 = (Integer)_datEntI4.m_20088_().m_135370_(WardentitanEntity.DATA_deathTick);
                                        } else {
                                            n20 = 0;
                                        }
                                        if (n20 <= 2 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.death")), SoundSource.NEUTRAL, 200.0f, 0.7f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.death")), SoundSource.NEUTRAL, 200.0f, 0.7f, false);
                                            }
                                        }
                                        if (entity instanceof WardentitanEntity) {
                                            ((WardentitanEntity)entity).setAnimation("animation.wardentitan.death");
                                        }
                                        if (entity instanceof WardentitanEntity) {
                                            WardentitanEntity _datEntI5 = (WardentitanEntity)entity;
                                            n19 = (Integer)_datEntI5.m_20088_().m_135370_(WardentitanEntity.DATA_deathTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 >= 400 && !entity.m_9236_().m_5776_()) {
                                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                        }
                                    }
                                }
                                if (world.m_5776_()) break block483;
                                if (entity instanceof WardentitanEntity) {
                                    _datEntI2 = (WardentitanEntity)entity;
                                    n9 = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
                                } else {
                                    n9 = 0;
                                }
                                if (n9 != 0 && entity instanceof WardentitanEntity) {
                                    int n22;
                                    _datEntSetI = (WardentitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof WardentitanEntity) {
                                        WardentitanEntity _datEntI6 = (WardentitanEntity)entity;
                                        n22 = (Integer)_datEntI6.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
                                    } else {
                                        n22 = 0;
                                    }
                                    synchedEntityData.m_135381_(WardentitanEntity.DATA_animationTick, (Object)(n22 + 1));
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity3 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity3 = null;
                                }
                                if (livingEntity3 == null) break block484;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    v21 = _mobEnt4.m_5448_();
                                } else {
                                    v21 = object = null;
                                }
                                if (object instanceof LivingEntity) {
                                    LivingEntity _livEnt5 = object;
                                    f = _livEnt5.m_21223_();
                                } else {
                                    f = -1.0f;
                                }
                                if (f <= 0.0f) break block485;
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity2 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block484;
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
                                _mobEnt4 = (Mob)entity;
                                livingEntity7 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity7 = null;
                            }
                            double d = livingEntity7.m_20185_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt6 = (Mob)entity;
                                livingEntity6 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity6 = null;
                            }
                            double d2 = livingEntity6.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity5 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity5 = null;
                            }
                            double d3 = d2 + (double)livingEntity5.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity4 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity4 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity4.m_20189_()));
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                v32 = _mobEnt4.m_5448_();
                            } else {
                                v32 = _mobEnt3 = null;
                            }
                            if (_mobEnt3 instanceof LivingEntity) {
                                LivingEntity _livEnt6 = (LivingEntity)_mobEnt3;
                                f = _livEnt6.m_21223_();
                            } else {
                                f = -1.0f;
                            }
                            if (f > 0.0f) {
                                int n23;
                                if (entity instanceof WardentitanEntity) {
                                    _datEntI = (WardentitanEntity)entity;
                                    n23 = (Integer)_datEntI.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
                                } else {
                                    n23 = 0;
                                }
                                if (n23 == 0) {
                                    float f5;
                                    LivingEntity livingEntity8;
                                    Mob _mobEnt7;
                                    Mob _mobEnt8;
                                    Mob _mobEnt9;
                                    Mob _mobEnt10;
                                    Mob _mobEnt11;
                                    Mob _mobEnt12;
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
                                    if (f6 > 75.0f) {
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
                                            _mobEnt12 = (Mob)entity;
                                            livingEntity18 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity18 = null;
                                        }
                                        double d4 = livingEntity18.m_20185_() - entity.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity17 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity17 = null;
                                        }
                                        if (livingEntity17 != null) {
                                            LivingEntity livingEntity19;
                                            if (entity instanceof Mob) {
                                                _mobEnt10 = (Mob)entity;
                                                livingEntity19 = _mobEnt10.m_5448_();
                                            } else {
                                                livingEntity19 = null;
                                            }
                                            f10 = entity.m_20270_(livingEntity19);
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        double d5 = d4 / (double)f10 * 0.7;
                                        if (entity instanceof Mob) {
                                            _mobEnt12 = (Mob)entity;
                                            livingEntity16 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity16 = null;
                                        }
                                        double d6 = livingEntity16.m_20186_() - entity.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity15 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity15 = null;
                                        }
                                        if (livingEntity15 != null) {
                                            LivingEntity livingEntity20;
                                            if (entity instanceof Mob) {
                                                _mobEnt10 = (Mob)entity;
                                                livingEntity20 = _mobEnt10.m_5448_();
                                            } else {
                                                livingEntity20 = null;
                                            }
                                            f9 = entity.m_20270_(livingEntity20);
                                        } else {
                                            f9 = -1.0f;
                                        }
                                        double d7 = d6 / (double)f9 * 0.7;
                                        if (entity instanceof Mob) {
                                            _mobEnt12 = (Mob)entity;
                                            livingEntity14 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity14 = null;
                                        }
                                        double d8 = livingEntity14.m_20189_() - entity.m_20189_();
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity13 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity13 = null;
                                        }
                                        if (livingEntity13 != null) {
                                            LivingEntity livingEntity21;
                                            if (entity instanceof Mob) {
                                                _mobEnt10 = (Mob)entity;
                                                livingEntity21 = _mobEnt10.m_5448_();
                                            } else {
                                                livingEntity21 = null;
                                            }
                                            f8 = entity.m_20270_(livingEntity21);
                                        } else {
                                            f8 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d5, d7, d8 / (double)f8 * 0.7));
                                    } else {
                                        LivingEntity livingEntity22;
                                        if (entity instanceof Mob) {
                                            _mobEnt10 = (Mob)entity;
                                            livingEntity22 = _mobEnt10.m_5448_();
                                        } else {
                                            livingEntity22 = null;
                                        }
                                        if (livingEntity22.m_20206_() > 8.0f) {
                                            float f11;
                                            LivingEntity livingEntity23;
                                            if (entity instanceof Mob) {
                                                _mobEnt11 = (Mob)entity;
                                                livingEntity23 = _mobEnt11.m_5448_();
                                            } else {
                                                livingEntity23 = null;
                                            }
                                            if (livingEntity23 != null) {
                                                LivingEntity livingEntity24;
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity24 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity24 = null;
                                                }
                                                f11 = entity.m_20270_(livingEntity24);
                                            } else {
                                                f11 = -1.0f;
                                            }
                                            if (f11 > 40.0f) {
                                                float f12;
                                                LivingEntity livingEntity25;
                                                LivingEntity livingEntity26;
                                                float f13;
                                                LivingEntity livingEntity27;
                                                LivingEntity livingEntity28;
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity28 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity28 = null;
                                                }
                                                double d9 = livingEntity28.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity27 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity27 = null;
                                                }
                                                if (livingEntity27 != null) {
                                                    LivingEntity livingEntity29;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity29 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity29 = null;
                                                    }
                                                    f13 = entity.m_20270_(livingEntity29);
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                double d10 = d9 / (double)f13 * 0.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity26 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity26 = null;
                                                }
                                                double d11 = livingEntity26.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity25 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity25 = null;
                                                }
                                                if (livingEntity25 != null) {
                                                    LivingEntity livingEntity30;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity30 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity30 = null;
                                                    }
                                                    f12 = entity.m_20270_(livingEntity30);
                                                } else {
                                                    f12 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f12 * 0.5));
                                            }
                                        } else {
                                            float f14;
                                            LivingEntity livingEntity31;
                                            if (entity instanceof Mob) {
                                                _mobEnt11 = (Mob)entity;
                                                livingEntity31 = _mobEnt11.m_5448_();
                                            } else {
                                                livingEntity31 = null;
                                            }
                                            if (livingEntity31 != null) {
                                                LivingEntity livingEntity32;
                                                if (entity instanceof Mob) {
                                                    _mobEnt12 = (Mob)entity;
                                                    livingEntity32 = _mobEnt12.m_5448_();
                                                } else {
                                                    livingEntity32 = null;
                                                }
                                                f14 = entity.m_20270_(livingEntity32);
                                            } else {
                                                f14 = -1.0f;
                                            }
                                            if (f14 > 12.0f) {
                                                float f15;
                                                LivingEntity livingEntity33;
                                                LivingEntity livingEntity34;
                                                float f16;
                                                LivingEntity livingEntity35;
                                                LivingEntity livingEntity36;
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity36 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity36 = null;
                                                }
                                                double d12 = livingEntity36.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity35 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity35 = null;
                                                }
                                                if (livingEntity35 != null) {
                                                    LivingEntity livingEntity37;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity37 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity37 = null;
                                                    }
                                                    f16 = entity.m_20270_(livingEntity37);
                                                } else {
                                                    f16 = -1.0f;
                                                }
                                                double d13 = d12 / (double)f16 * 0.5;
                                                if (entity instanceof Mob) {
                                                    _mobEnt9 = (Mob)entity;
                                                    livingEntity34 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity34 = null;
                                                }
                                                double d14 = livingEntity34.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity33 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity33 = null;
                                                }
                                                if (livingEntity33 != null) {
                                                    LivingEntity livingEntity38;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity38 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity38 = null;
                                                    }
                                                    f15 = entity.m_20270_(livingEntity38);
                                                } else {
                                                    f15 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d13, 0.0, d14 / (double)f15 * 0.5));
                                            }
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity8 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity8 = null;
                                    }
                                    if (livingEntity8 != null) {
                                        LivingEntity livingEntity39;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity39 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity39 = null;
                                        }
                                        f5 = entity.m_20270_(livingEntity39);
                                    } else {
                                        f5 = -1.0f;
                                    }
                                    if (f5 < 160.0f) {
                                        float f17;
                                        LivingEntity livingEntity40;
                                        if (entity instanceof Mob) {
                                            _mobEnt10 = (Mob)entity;
                                            livingEntity40 = _mobEnt10.m_5448_();
                                        } else {
                                            livingEntity40 = null;
                                        }
                                        if (livingEntity40 != null) {
                                            LivingEntity livingEntity41;
                                            if (entity instanceof Mob) {
                                                _mobEnt11 = (Mob)entity;
                                                livingEntity41 = _mobEnt11.m_5448_();
                                            } else {
                                                livingEntity41 = null;
                                            }
                                            f17 = entity.m_20270_(livingEntity41);
                                        } else {
                                            f17 = -1.0f;
                                        }
                                        if (f17 <= 60.0f) {
                                            LivingEntity livingEntity42;
                                            if (entity instanceof Mob) {
                                                _mobEnt12 = (Mob)entity;
                                                livingEntity42 = _mobEnt12.m_5448_();
                                            } else {
                                                livingEntity42 = null;
                                            }
                                            if (livingEntity42.m_20206_() > 6.0f) {
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                                    if (entity instanceof WardentitanEntity) {
                                                        _datEntSetI = (WardentitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)2);
                                                    }
                                                } else if (entity instanceof WardentitanEntity) {
                                                    _datEntSetI = (WardentitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)3);
                                                }
                                            } else if (entity instanceof WardentitanEntity) {
                                                _datEntSetI = (WardentitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                            }
                                        }
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            int n24;
                                            if (entity instanceof WardentitanEntity) {
                                                WardentitanEntity _datEntI7 = (WardentitanEntity)entity;
                                                n24 = (Integer)_datEntI7.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
                                            } else {
                                                n24 = 0;
                                            }
                                            if (n24 == 0) {
                                                float f18;
                                                LivingEntity livingEntity43;
                                                if (entity instanceof Mob) {
                                                    _mobEnt11 = (Mob)entity;
                                                    livingEntity43 = _mobEnt11.m_5448_();
                                                } else {
                                                    livingEntity43 = null;
                                                }
                                                if (livingEntity43 != null) {
                                                    LivingEntity livingEntity44;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt12 = (Mob)entity;
                                                        livingEntity44 = _mobEnt12.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    f18 = entity.m_20270_(livingEntity44);
                                                } else {
                                                    f18 = -1.0f;
                                                }
                                                if (f18 > 80.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)30) == 5) {
                                                        LivingEntity livingEntity45;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt7 = (Mob)entity;
                                                            livingEntity45 = _mobEnt7.m_5448_();
                                                        } else {
                                                            livingEntity45 = null;
                                                        }
                                                        if (livingEntity45.m_20206_() > 6.0f) {
                                                            if (entity instanceof WardentitanEntity) {
                                                                _datEntSetI = (WardentitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)4);
                                                            }
                                                        } else if (entity instanceof WardentitanEntity) {
                                                            _datEntSetI = (WardentitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)4);
                                                        }
                                                    }
                                                } else {
                                                    float f19;
                                                    LivingEntity livingEntity46;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity46 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity46 = null;
                                                    }
                                                    if (livingEntity46 != null) {
                                                        LivingEntity livingEntity47;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt8 = (Mob)entity;
                                                            livingEntity47 = _mobEnt8.m_5448_();
                                                        } else {
                                                            livingEntity47 = null;
                                                        }
                                                        f19 = entity.m_20270_(livingEntity47);
                                                    } else {
                                                        f19 = -1.0f;
                                                    }
                                                    if (f19 > 60.0f) {
                                                        LivingEntity livingEntity48;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt9 = (Mob)entity;
                                                            livingEntity48 = _mobEnt9.m_5448_();
                                                        } else {
                                                            livingEntity48 = null;
                                                        }
                                                        if (livingEntity48.m_20206_() > 6.0f) {
                                                            if (entity instanceof WardentitanEntity) {
                                                                _datEntSetI = (WardentitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)2, (int)3));
                                                            }
                                                        } else if (entity instanceof WardentitanEntity) {
                                                            _datEntSetI = (WardentitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
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
                    if (entity instanceof WardentitanEntity) {
                        _datEntI2 = (WardentitanEntity)entity;
                        n8 = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
                    } else {
                        n8 = 0;
                    }
                    if (n8 != true) break block486;
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof WardentitanEntity) {
                        ((WardentitanEntity)entity).setAnimation("animation.wardentitan.zt");
                    }
                    if (entity instanceof WardentitanEntity) {
                        _datEntI3 = (WardentitanEntity)entity;
                        n7 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
                    } else {
                        n7 = 0;
                    }
                    if (n7 == 1) {
                        float f;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            Mob _mobEnt13 = (Mob)entity;
                            livingEntity = _mobEnt13.m_5448_();
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
                                _mobEnt2 = (Mob)entity;
                                livingEntity53 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity53 = null;
                            }
                            double d = livingEntity53.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity52 = _mobEnt.m_5448_();
                            } else {
                                livingEntity52 = null;
                            }
                            double d15 = livingEntity52.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity51 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity51 = null;
                            }
                            double d16 = d15 + (double)livingEntity51.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity50 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity50 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity50.m_20189_()));
                        }
                    }
                    if (entity instanceof WardentitanEntity) {
                        _datEntI3 = (WardentitanEntity)entity;
                        n6 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
                    } else {
                        n6 = 0;
                    }
                    if (n6 == 56) break block487;
                    if (entity instanceof WardentitanEntity) {
                        WardentitanEntity _datEntI8 = (WardentitanEntity)entity;
                        n5 = (Integer)_datEntI8.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
                    } else {
                        n5 = 0;
                    }
                    if (n5 != 96) break block488;
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound2) {
                    float f;
                    float f20;
                    float f21;
                    float f22;
                    LivingEntity _livEnt7;
                    float f23;
                    float f24;
                    float f25;
                    if (entityiterator instanceof WardentitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f25 = _livEnt2.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f25 / 20.0f + 20000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f24 = _livEnt2.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource2, f24 / 20.0f + 20000.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f23 = _livEnt2.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource3, f23 / 20.0f + 20000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt7 = (LivingEntity)entityiterator;
                        f22 = _livEnt7.m_21233_();
                    } else {
                        f22 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f21 = _livEnt2.m_21223_();
                    } else {
                        f21 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource4, (f22 + f21) / 5.0f + 200000.0f);
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt7 = (LivingEntity)entityiterator;
                        f20 = _livEnt7.m_21233_();
                    } else {
                        f20 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource5, (f20 + f) / 5.0f + 200000.0f);
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n4 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n4 = 0;
            }
            if (n4 >= 120) {
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    ((WardentitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WardentitanEntity) {
            _datEntI2 = (WardentitanEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 3) {
            int n25;
            int n26;
            int n27;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 1) {
                if (entity instanceof WardentitanEntity) {
                    ((WardentitanEntity)entity).setAnimation("animation.wardentitan.attack");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 2) {
                if (entity instanceof WardentitanEntity) {
                    ((WardentitanEntity)entity).setAnimation("animation.wardentitan.slam");
                }
            } else if (entity instanceof WardentitanEntity) {
                ((WardentitanEntity)entity).setAnimation("animation.wardentitan.ram");
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n27 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt14 = (Mob)entity;
                    livingEntity = _mobEnt14.m_5448_();
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
                        _mobEnt2 = (Mob)entity;
                        livingEntity58 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity58 = null;
                    }
                    double d = livingEntity58.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity57 = _mobEnt.m_5448_();
                    } else {
                        livingEntity57 = null;
                    }
                    double d17 = livingEntity57.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity56 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity56 = null;
                    }
                    double d18 = d17 + (double)livingEntity56.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity55 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity55 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity55.m_20189_()));
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n26 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n26 = 0;
            }
            if (n26 == 14) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.attack_impact")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.attack_impact")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f26;
                    float f27;
                    float f28;
                    float f29;
                    float f30;
                    float f31;
                    if (entityiterator instanceof WardentitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f31 = _livEnt.m_21233_();
                    } else {
                        f31 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f31 / 20.0f + 60000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f30 = _livEnt.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource6, f30 / 20.0f + 60000.0f);
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f29 = _livEnt.m_21233_();
                    } else {
                        f29 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource7, f29 / 20.0f + 60000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
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
                    entityiterator.m_6469_(damageSource8, (f28 + f27) / 5.0f + 600000.0f);
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f26 = _livEnt2.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource9, (f26 + f) / 5.0f + 600000.0f);
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n25 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n25 = 0;
            }
            if (n25 >= 30) {
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    ((WardentitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WardentitanEntity) {
            _datEntI2 = (WardentitanEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 2) {
            int n28;
            int n29;
            int n30;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof WardentitanEntity) {
                ((WardentitanEntity)entity).setAnimation("animation.wardentitan.smash");
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n30 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt15 = (Mob)entity;
                    livingEntity = _mobEnt15.m_5448_();
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
                        _mobEnt2 = (Mob)entity;
                        livingEntity63 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity63 = null;
                    }
                    double d = livingEntity63.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity62 = _mobEnt.m_5448_();
                    } else {
                        livingEntity62 = null;
                    }
                    double d19 = livingEntity62.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity61 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity61 = null;
                    }
                    double d20 = d19 + (double)livingEntity61.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity60 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity60 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity60.m_20189_()));
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n29 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 == 40) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f32;
                    float f33;
                    float f34;
                    float f35;
                    float f36;
                    float f37;
                    if (entityiterator instanceof WardentitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 5.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entityiterator;
                        f37 = _livEnt8.m_21233_();
                    } else {
                        f37 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f37 / 20.0f + 100000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entityiterator;
                        f36 = _livEnt9.m_21233_();
                    } else {
                        f36 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource10, f36 / 20.0f + 100000.0f);
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt10 = (LivingEntity)entityiterator;
                        f35 = _livEnt10.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource11, f35 / 20.0f + 100000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f34 = _livEnt2.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entityiterator;
                        f33 = _livEnt11.m_21223_();
                    } else {
                        f33 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource12, (f34 + f33) / 5.0f + 1000000.0f);
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f32 = _livEnt2.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt12 = (LivingEntity)entityiterator;
                        f = _livEnt12.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource13, (f32 + f) / 5.0f + 1000000.0f);
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n28 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 >= 60) {
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    ((WardentitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WardentitanEntity) {
            _datEntI2 = (WardentitanEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(WardentitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 4) {
            int n31;
            int n32;
            int n33;
            int n34;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof WardentitanEntity) {
                ((WardentitanEntity)entity).setAnimation("animation.wardentitan.sonic");
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n34 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt16 = (Mob)entity;
                    livingEntity = _mobEnt16.m_5448_();
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
                        _mobEnt2 = (Mob)entity;
                        livingEntity68 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity68 = null;
                    }
                    double d = livingEntity68.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity67 = _mobEnt.m_5448_();
                    } else {
                        livingEntity67 = null;
                    }
                    double d21 = livingEntity67.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity66 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    double d22 = d21 + (double)livingEntity66.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity65 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity65 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity65.m_20189_()));
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n33 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n33 = 0;
            }
            if (n33 >= 44) {
                int n35;
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntI9 = (WardentitanEntity)entity;
                    n35 = (Integer)_datEntI9.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
                } else {
                    n35 = 0;
                }
                if (n35 <= 64) {
                    int n36;
                    int n37;
                    SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEEXPLOSION.get();
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof WardentitanEntity) {
                        _datEntI = (WardentitanEntity)entity;
                        n37 = (Integer)_datEntI.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
                    } else {
                        n37 = 0;
                    }
                    double d23 = x + d * (double)(n37 - 40) * 8.0;
                    double d24 = entity.m_20154_().f_82481_;
                    if (entity instanceof WardentitanEntity) {
                        _datEntI = (WardentitanEntity)entity;
                        n36 = (Integer)_datEntI.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
                    } else {
                        n36 = 0;
                    }
                    world.m_7106_((ParticleOptions)simpleParticleType, d23, y + 50.0, z + d24 * (double)(n36 - 40) * 8.0, 0.0, 0.0, 0.0);
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n32 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 == 46) {
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 48.0, y, z + entity.m_20154_().f_82481_ * 48.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f38;
                    float f39;
                    float f40;
                    float f41;
                    float f42;
                    float f43;
                    if (entityiterator instanceof WardentitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f43 = _livEnt.m_21233_();
                    } else {
                        f43 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f43 / 20.0f + 50000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f42 = _livEnt.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource14, f42 / 20.0f + 50000.0f);
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f41 = _livEnt.m_21233_();
                    } else {
                        f41 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource15, f41 / 20.0f + 50000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                    }
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f40 = _livEnt2.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f39 = _livEnt.m_21223_();
                    } else {
                        f39 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource16, (f40 + f39) / 5.0f + 500000.0f);
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f38 = _livEnt2.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource17, (f38 + f) / 5.0f + 500000.0f);
                }
            }
            if (entity instanceof WardentitanEntity) {
                _datEntI3 = (WardentitanEntity)entity;
                n31 = (Integer)_datEntI3.m_20088_().m_135370_(WardentitanEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 >= 122) {
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    WardentitanEntity _datEntSetI = (WardentitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WardentitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WardentitanEntity) {
                    ((WardentitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

