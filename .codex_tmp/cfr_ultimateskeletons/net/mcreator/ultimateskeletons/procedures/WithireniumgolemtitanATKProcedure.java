/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.particles.SimpleParticleType
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
import net.mcreator.ultimateskeletons.entity.GiantwithireniumEntity;
import net.mcreator.ultimateskeletons.entity.WithireniumgolemtitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
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

public class WithireniumgolemtitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        Mob _mobEnt;
        Mob _mobEnt2;
        Object _mobEnt3;
        Mob _mobEnt4;
        WithireniumgolemtitanEntity _datEntSetI;
        Level _level;
        WithireniumgolemtitanEntity _datEntI;
        block640: {
            int n2;
            int n3;
            LivingEntity _livEnt;
            List<Entity> _entfound;
            Vec3 _center;
            LivingEntity _livEnt2;
            WithireniumgolemtitanEntity _datEntI2;
            double theta;
            block642: {
                LivingEntity _livEnt3;
                block641: {
                    int n4;
                    int n5;
                    float f;
                    LivingEntity livingEntity;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    block637: {
                        int n11;
                        block639: {
                            block638: {
                                int n12;
                                int n13;
                                float f2;
                                LivingEntity livingEntity2;
                                int n14;
                                block634: {
                                    LivingEntity livingEntity3;
                                    Mob _mobEnt42;
                                    block635: {
                                        block636: {
                                            LivingEntity livingEntity4;
                                            float f3;
                                            LivingEntity livingEntity5;
                                            LivingEntity livingEntity6;
                                            int n15;
                                            float f4;
                                            float f5;
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
                                            if (entity instanceof WithireniumgolemtitanEntity) {
                                                int n16;
                                                WithireniumgolemtitanEntity _datEntSetI2 = (WithireniumgolemtitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                if (entity instanceof WithireniumgolemtitanEntity) {
                                                    WithireniumgolemtitanEntity _datEntI4 = (WithireniumgolemtitanEntity)entity;
                                                    n16 = (Integer)_datEntI4.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_spawnTick);
                                                } else {
                                                    n16 = 0;
                                                }
                                                synchedEntityData.m_135381_(WithireniumgolemtitanEntity.DATA_spawnTick, (Object)(n16 + 1));
                                            }
                                            if (entity.m_5446_().getString().equals("growing")) {
                                                int n17;
                                                if (entity instanceof WithireniumgolemtitanEntity) {
                                                    _datEntI = (WithireniumgolemtitanEntity)entity;
                                                    n17 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_spawnTick);
                                                } else {
                                                    n17 = 0;
                                                }
                                                if (n17 <= 720) {
                                                    int n18;
                                                    int n19;
                                                    WithireniumgolemtitanEntity _datEntI3;
                                                    entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                                    entity.f_19802_ = 20;
                                                    if (entity instanceof LivingEntity) {
                                                        ((LivingEntity)entity).f_20919_ = 0;
                                                    }
                                                    if (entity instanceof Mob) {
                                                        Mob _entity2 = (Mob)entity;
                                                        _entity2.m_6710_(null);
                                                    }
                                                    if (entity instanceof WithireniumgolemtitanEntity) {
                                                        _datEntI3 = (WithireniumgolemtitanEntity)entity;
                                                        n19 = (Integer)_datEntI3.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n19 = 0;
                                                    }
                                                    if (n19 <= 10 && entity instanceof WithireniumgolemtitanEntity) {
                                                        ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.spawn");
                                                    }
                                                    if (entity instanceof WithireniumgolemtitanEntity) {
                                                        _datEntI3 = (WithireniumgolemtitanEntity)entity;
                                                        n18 = (Integer)_datEntI3.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n18 = 0;
                                                    }
                                                    if (n18 == 720) {
                                                        if (world instanceof Level) {
                                                            _level = (Level)world;
                                                            if (!_level.m_5776_()) {
                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                            } else {
                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                            }
                                                        }
                                                        if (!world.m_5776_() && world.m_7654_() != null) {
                                                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Withireniumgolemtitan has been created!!!"), false);
                                                        }
                                                    }
                                                    if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                                        entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                    }
                                                }
                                            }
                                            if (!world.m_5776_()) {
                                                int n20;
                                                if (entity instanceof WithireniumgolemtitanEntity) {
                                                    _datEntI = (WithireniumgolemtitanEntity)entity;
                                                    n20 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                                                } else {
                                                    n20 = 0;
                                                }
                                                if (n20 != 0) {
                                                    float f6;
                                                    if (entity instanceof LivingEntity) {
                                                        LivingEntity _livEnt6 = (LivingEntity)entity;
                                                        f6 = _livEnt6.m_21223_();
                                                    } else {
                                                        f6 = -1.0f;
                                                    }
                                                    if (f6 <= 0.0f) {
                                                        for (int index0 = 0; index0 < 16; ++index0) {
                                                            if (!(entity instanceof WithireniumgolemtitanEntity)) continue;
                                                            ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                            }
                                            if (entity instanceof LivingEntity) {
                                                LivingEntity _livEnt5 = (LivingEntity)entity;
                                                f5 = _livEnt5.m_21223_();
                                            } else {
                                                f5 = -1.0f;
                                            }
                                            if (f5 > 0.0f) {
                                                if (entity instanceof WithireniumgolemtitanEntity) {
                                                    WithireniumgolemtitanEntity _datEntSetI3 = (WithireniumgolemtitanEntity)entity;
                                                    _datEntSetI3.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_deathTick, (Object)0);
                                                }
                                                for (int index1 = 0; index1 < 16; ++index1) {
                                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123744_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0));
                                                }
                                            }
                                            if (entity instanceof LivingEntity) {
                                                LivingEntity _livEnt4 = (LivingEntity)entity;
                                                f4 = _livEnt4.m_21223_();
                                            } else {
                                                f4 = -1.0f;
                                            }
                                            if (f4 <= 0.0f) {
                                                int n21;
                                                if (entity instanceof Mob) {
                                                    Mob _entity3 = (Mob)entity;
                                                    _entity3.m_6710_(null);
                                                }
                                                if (entity instanceof WithireniumgolemtitanEntity) {
                                                    WithireniumgolemtitanEntity _datEntI5 = (WithireniumgolemtitanEntity)entity;
                                                    n21 = (Integer)_datEntI5.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                                                } else {
                                                    n21 = 0;
                                                }
                                                if (n21 == 0) {
                                                    int n22;
                                                    int n23;
                                                    if (entity instanceof WithireniumgolemtitanEntity) {
                                                        int n24;
                                                        _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                        if (entity instanceof WithireniumgolemtitanEntity) {
                                                            WithireniumgolemtitanEntity _datEntI3 = (WithireniumgolemtitanEntity)entity;
                                                            n24 = (Integer)_datEntI3.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_deathTick);
                                                        } else {
                                                            n24 = 0;
                                                        }
                                                        synchedEntityData.m_135381_(WithireniumgolemtitanEntity.DATA_deathTick, (Object)(n24 + 1));
                                                    }
                                                    if (entity instanceof WithireniumgolemtitanEntity) {
                                                        WithireniumgolemtitanEntity _datEntI22 = (WithireniumgolemtitanEntity)entity;
                                                        n23 = (Integer)_datEntI22.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_deathTick);
                                                    } else {
                                                        n23 = 0;
                                                    }
                                                    if (n23 == 1 && world instanceof Level) {
                                                        Level _level2 = (Level)world;
                                                        if (!_level2.m_5776_()) {
                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f);
                                                        } else {
                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f, false);
                                                        }
                                                    }
                                                    if (entity instanceof WithireniumgolemtitanEntity) {
                                                        ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.death");
                                                    }
                                                    if (entity instanceof WithireniumgolemtitanEntity) {
                                                        _datEntI2 = (WithireniumgolemtitanEntity)entity;
                                                        n22 = (Integer)_datEntI2.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_deathTick);
                                                    } else {
                                                        n22 = 0;
                                                    }
                                                    if (n22 >= 600 && !entity.m_9236_().m_5776_()) {
                                                        entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                                    }
                                                }
                                            }
                                            if (world.m_5776_()) break block634;
                                            if (entity instanceof WithireniumgolemtitanEntity) {
                                                _datEntI = (WithireniumgolemtitanEntity)entity;
                                                n15 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                                            } else {
                                                n15 = 0;
                                            }
                                            if (n15 != 0 && entity instanceof WithireniumgolemtitanEntity) {
                                                int n25;
                                                WithireniumgolemtitanEntity _datEntSetI4 = (WithireniumgolemtitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
                                                if (entity instanceof WithireniumgolemtitanEntity) {
                                                    _datEntI2 = (WithireniumgolemtitanEntity)entity;
                                                    n25 = (Integer)_datEntI2.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                                                } else {
                                                    n25 = 0;
                                                }
                                                synchedEntityData.m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)(n25 + 1));
                                            }
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt6 = (Mob)entity;
                                                livingEntity6 = _mobEnt6.m_5448_();
                                            } else {
                                                livingEntity6 = null;
                                            }
                                            if (livingEntity6 == null) break block635;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt7 = (Mob)entity;
                                                v18 = _mobEnt7.m_5448_();
                                            } else {
                                                v18 = livingEntity5 = null;
                                            }
                                            if (livingEntity5 instanceof LivingEntity) {
                                                LivingEntity _livEnt4 = livingEntity5;
                                                f3 = _livEnt4.m_21223_();
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (f3 <= 0.0f) break block636;
                                            if (entity instanceof Mob) {
                                                _mobEnt42 = (Mob)entity;
                                                livingEntity4 = _mobEnt42.m_5448_();
                                            } else {
                                                livingEntity4 = null;
                                            }
                                            if (livingEntity4.m_6084_()) break block635;
                                        }
                                        if (entity instanceof Mob) {
                                            Mob _entity = (Mob)entity;
                                            _entity.m_6710_(null);
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt5 = (Mob)entity;
                                        livingEntity3 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity3 = null;
                                    }
                                    if (livingEntity3 != null) {
                                        float f7;
                                        LivingEntity livingEntity7;
                                        LivingEntity livingEntity8;
                                        LivingEntity livingEntity9;
                                        LivingEntity livingEntity10;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt8 = (Mob)entity;
                                            livingEntity10 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity10 = null;
                                        }
                                        double d = livingEntity10.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity9 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity9 = null;
                                        }
                                        double d2 = livingEntity9.m_20186_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt9 = (Mob)entity;
                                            livingEntity8 = _mobEnt9.m_5448_();
                                        } else {
                                            livingEntity8 = null;
                                        }
                                        double d3 = d2 + (double)livingEntity8.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt10 = (Mob)entity;
                                            livingEntity7 = _mobEnt10.m_5448_();
                                        } else {
                                            livingEntity7 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity7.m_20189_()));
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt11 = (Mob)entity;
                                            v29 = _mobEnt11.m_5448_();
                                        } else {
                                            v29 = _mobEnt42 = null;
                                        }
                                        if (_mobEnt42 instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)_mobEnt42;
                                            f7 = _livEnt5.m_21223_();
                                        } else {
                                            f7 = -1.0f;
                                        }
                                        if (f7 > 0.0f) {
                                            int n26;
                                            if (entity instanceof WithireniumgolemtitanEntity) {
                                                WithireniumgolemtitanEntity _datEntI4 = (WithireniumgolemtitanEntity)entity;
                                                n26 = (Integer)_datEntI4.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                                            } else {
                                                n26 = 0;
                                            }
                                            if (n26 == 0) {
                                                float f8;
                                                LivingEntity livingEntity11;
                                                Mob _mobEnt6;
                                                Mob _mobEnt7;
                                                Mob _mobEnt8;
                                                Mob _mobEnt9;
                                                float f9;
                                                LivingEntity livingEntity12;
                                                float f10;
                                                LivingEntity livingEntity13;
                                                if (entity instanceof Mob) {
                                                    _mobEnt3 = (Mob)entity;
                                                    livingEntity13 = _mobEnt3.m_5448_();
                                                } else {
                                                    livingEntity13 = null;
                                                }
                                                if (livingEntity13 != null) {
                                                    LivingEntity livingEntity14;
                                                    if (entity instanceof Mob) {
                                                        Mob mob = (Mob)entity;
                                                        livingEntity14 = mob.m_5448_();
                                                    } else {
                                                        livingEntity14 = null;
                                                    }
                                                    f10 = entity.m_20270_(livingEntity14);
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (f10 >= 160.0f) {
                                                    entity.m_6858_(true);
                                                } else {
                                                    entity.m_6858_(false);
                                                }
                                                if (entity instanceof Mob) {
                                                    _mobEnt3 = (Mob)entity;
                                                    livingEntity12 = _mobEnt3.m_5448_();
                                                } else {
                                                    livingEntity12 = null;
                                                }
                                                if (livingEntity12 != null) {
                                                    LivingEntity livingEntity15;
                                                    if (entity instanceof Mob) {
                                                        Mob mob = (Mob)entity;
                                                        livingEntity15 = mob.m_5448_();
                                                    } else {
                                                        livingEntity15 = null;
                                                    }
                                                    f9 = entity.m_20270_(livingEntity15);
                                                } else {
                                                    f9 = -1.0f;
                                                }
                                                if (f9 > 75.0f) {
                                                    float f11;
                                                    LivingEntity livingEntity16;
                                                    LivingEntity livingEntity17;
                                                    float f12;
                                                    LivingEntity livingEntity18;
                                                    LivingEntity livingEntity19;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt15 = (Mob)entity;
                                                        livingEntity19 = _mobEnt15.m_5448_();
                                                    } else {
                                                        livingEntity19 = null;
                                                    }
                                                    double d4 = livingEntity19.m_20185_() - entity.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt9 = (Mob)entity;
                                                        livingEntity18 = _mobEnt9.m_5448_();
                                                    } else {
                                                        livingEntity18 = null;
                                                    }
                                                    if (livingEntity18 != null) {
                                                        LivingEntity livingEntity20;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity20 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity20 = null;
                                                        }
                                                        f12 = entity.m_20270_(livingEntity20);
                                                    } else {
                                                        f12 = -1.0f;
                                                    }
                                                    double d5 = d4 / (double)f12 * 0.7;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity17 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity17 = null;
                                                    }
                                                    double d6 = livingEntity17.m_20189_() - entity.m_20189_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt9 = (Mob)entity;
                                                        livingEntity16 = _mobEnt9.m_5448_();
                                                    } else {
                                                        livingEntity16 = null;
                                                    }
                                                    if (livingEntity16 != null) {
                                                        LivingEntity livingEntity21;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity21 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity21 = null;
                                                        }
                                                        f11 = entity.m_20270_(livingEntity21);
                                                    } else {
                                                        f11 = -1.0f;
                                                    }
                                                    entity.m_20256_(new Vec3(d5, 0.0, d6 / (double)f11 * 0.7));
                                                } else {
                                                    LivingEntity livingEntity22;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity22 = _mobEnt2.m_5448_();
                                                    } else {
                                                        livingEntity22 = null;
                                                    }
                                                    if (livingEntity22.m_20206_() > 8.0f) {
                                                        float f13;
                                                        LivingEntity livingEntity23;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt14 = (Mob)entity;
                                                            livingEntity23 = _mobEnt14.m_5448_();
                                                        } else {
                                                            livingEntity23 = null;
                                                        }
                                                        if (livingEntity23 != null) {
                                                            LivingEntity livingEntity24;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt8 = (Mob)entity;
                                                                livingEntity24 = _mobEnt8.m_5448_();
                                                            } else {
                                                                livingEntity24 = null;
                                                            }
                                                            f13 = entity.m_20270_(livingEntity24);
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (f13 > 40.0f) {
                                                            float f14;
                                                            LivingEntity livingEntity25;
                                                            LivingEntity livingEntity26;
                                                            float f15;
                                                            LivingEntity livingEntity27;
                                                            LivingEntity livingEntity28;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity28 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity28 = null;
                                                            }
                                                            double d7 = livingEntity28.m_20185_() - entity.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt13 = (Mob)entity;
                                                                livingEntity27 = _mobEnt13.m_5448_();
                                                            } else {
                                                                livingEntity27 = null;
                                                            }
                                                            if (livingEntity27 != null) {
                                                                LivingEntity livingEntity29;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt12 = (Mob)entity;
                                                                    livingEntity29 = _mobEnt12.m_5448_();
                                                                } else {
                                                                    livingEntity29 = null;
                                                                }
                                                                f15 = entity.m_20270_(livingEntity29);
                                                            } else {
                                                                f15 = -1.0f;
                                                            }
                                                            double d8 = d7 / (double)f15 * 0.5;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity26 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity26 = null;
                                                            }
                                                            double d9 = livingEntity26.m_20189_() - entity.m_20189_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt7 = (Mob)entity;
                                                                livingEntity25 = _mobEnt7.m_5448_();
                                                            } else {
                                                                livingEntity25 = null;
                                                            }
                                                            if (livingEntity25 != null) {
                                                                LivingEntity livingEntity30;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt6 = (Mob)entity;
                                                                    livingEntity30 = _mobEnt6.m_5448_();
                                                                } else {
                                                                    livingEntity30 = null;
                                                                }
                                                                f14 = entity.m_20270_(livingEntity30);
                                                            } else {
                                                                f14 = -1.0f;
                                                            }
                                                            entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f14 * 0.5));
                                                        }
                                                    } else {
                                                        float f16;
                                                        LivingEntity livingEntity31;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt9 = (Mob)entity;
                                                            livingEntity31 = _mobEnt9.m_5448_();
                                                        } else {
                                                            livingEntity31 = null;
                                                        }
                                                        if (livingEntity31 != null) {
                                                            LivingEntity livingEntity32;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt8 = (Mob)entity;
                                                                livingEntity32 = _mobEnt8.m_5448_();
                                                            } else {
                                                                livingEntity32 = null;
                                                            }
                                                            f16 = entity.m_20270_(livingEntity32);
                                                        } else {
                                                            f16 = -1.0f;
                                                        }
                                                        if (f16 > 12.0f) {
                                                            float f17;
                                                            LivingEntity livingEntity33;
                                                            LivingEntity livingEntity34;
                                                            float f18;
                                                            LivingEntity livingEntity35;
                                                            LivingEntity livingEntity36;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity36 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity36 = null;
                                                            }
                                                            double d10 = livingEntity36.m_20185_() - entity.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt7 = (Mob)entity;
                                                                livingEntity35 = _mobEnt7.m_5448_();
                                                            } else {
                                                                livingEntity35 = null;
                                                            }
                                                            if (livingEntity35 != null) {
                                                                LivingEntity livingEntity37;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt6 = (Mob)entity;
                                                                    livingEntity37 = _mobEnt6.m_5448_();
                                                                } else {
                                                                    livingEntity37 = null;
                                                                }
                                                                f18 = entity.m_20270_(livingEntity37);
                                                            } else {
                                                                f18 = -1.0f;
                                                            }
                                                            double d11 = d10 / (double)f18 * 0.5;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity34 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity34 = null;
                                                            }
                                                            double d12 = livingEntity34.m_20189_() - entity.m_20189_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt7 = (Mob)entity;
                                                                livingEntity33 = _mobEnt7.m_5448_();
                                                            } else {
                                                                livingEntity33 = null;
                                                            }
                                                            if (livingEntity33 != null) {
                                                                LivingEntity livingEntity38;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt6 = (Mob)entity;
                                                                    livingEntity38 = _mobEnt6.m_5448_();
                                                                } else {
                                                                    livingEntity38 = null;
                                                                }
                                                                f17 = entity.m_20270_(livingEntity38);
                                                            } else {
                                                                f17 = -1.0f;
                                                            }
                                                            entity.m_20256_(new Vec3(d11, 0.0, d12 / (double)f17 * 0.5));
                                                        }
                                                    }
                                                }
                                                if (entity instanceof Mob) {
                                                    _mobEnt3 = (Mob)entity;
                                                    livingEntity11 = _mobEnt3.m_5448_();
                                                } else {
                                                    livingEntity11 = null;
                                                }
                                                if (livingEntity11 != null) {
                                                    LivingEntity livingEntity39;
                                                    if (entity instanceof Mob) {
                                                        Mob mob = (Mob)entity;
                                                        livingEntity39 = mob.m_5448_();
                                                    } else {
                                                        livingEntity39 = null;
                                                    }
                                                    f8 = entity.m_20270_(livingEntity39);
                                                } else {
                                                    f8 = -1.0f;
                                                }
                                                if (f8 < 512.0f) {
                                                    WithireniumgolemtitanEntity _datEntSetI2;
                                                    float f19;
                                                    LivingEntity livingEntity40;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity40 = _mobEnt2.m_5448_();
                                                    } else {
                                                        livingEntity40 = null;
                                                    }
                                                    if (livingEntity40 != null) {
                                                        LivingEntity livingEntity41;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt9 = (Mob)entity;
                                                            livingEntity41 = _mobEnt9.m_5448_();
                                                        } else {
                                                            livingEntity41 = null;
                                                        }
                                                        f19 = entity.m_20270_(livingEntity41);
                                                    } else {
                                                        f19 = -1.0f;
                                                    }
                                                    if (f19 <= 60.0f) {
                                                        LivingEntity livingEntity42;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt8 = (Mob)entity;
                                                            livingEntity42 = _mobEnt8.m_5448_();
                                                        } else {
                                                            livingEntity42 = null;
                                                        }
                                                        if (livingEntity42.m_20206_() > 6.0f) {
                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 4) {
                                                                if (entity instanceof WithireniumgolemtitanEntity) {
                                                                    _datEntSetI2 = (WithireniumgolemtitanEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
                                                                }
                                                            } else if (entity instanceof WithireniumgolemtitanEntity) {
                                                                _datEntSetI2 = (WithireniumgolemtitanEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)4);
                                                            }
                                                        } else if (entity instanceof WithireniumgolemtitanEntity) {
                                                            WithireniumgolemtitanEntity _datEntSetI5 = (WithireniumgolemtitanEntity)entity;
                                                            _datEntSetI5.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                        }
                                                    }
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                        int n27;
                                                        if (entity instanceof WithireniumgolemtitanEntity) {
                                                            WithireniumgolemtitanEntity _datEntI6 = (WithireniumgolemtitanEntity)entity;
                                                            n27 = (Integer)_datEntI6.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                                                        } else {
                                                            n27 = 0;
                                                        }
                                                        if (n27 == 0) {
                                                            float f20;
                                                            LivingEntity livingEntity43;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt9 = (Mob)entity;
                                                                livingEntity43 = _mobEnt9.m_5448_();
                                                            } else {
                                                                livingEntity43 = null;
                                                            }
                                                            if (livingEntity43 != null) {
                                                                LivingEntity livingEntity44;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt8 = (Mob)entity;
                                                                    livingEntity44 = _mobEnt8.m_5448_();
                                                                } else {
                                                                    livingEntity44 = null;
                                                                }
                                                                f20 = entity.m_20270_(livingEntity44);
                                                            } else {
                                                                f20 = -1.0f;
                                                            }
                                                            if (f20 > 80.0f) {
                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)30) == 5 && entity instanceof WithireniumgolemtitanEntity) {
                                                                    _datEntSetI2 = (WithireniumgolemtitanEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)6);
                                                                }
                                                            } else {
                                                                float f21;
                                                                LivingEntity livingEntity45;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt6 = (Mob)entity;
                                                                    livingEntity45 = _mobEnt6.m_5448_();
                                                                } else {
                                                                    livingEntity45 = null;
                                                                }
                                                                if (livingEntity45 != null) {
                                                                    LivingEntity livingEntity46;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt7 = (Mob)entity;
                                                                        livingEntity46 = _mobEnt7.m_5448_();
                                                                    } else {
                                                                        livingEntity46 = null;
                                                                    }
                                                                    f21 = entity.m_20270_(livingEntity46);
                                                                } else {
                                                                    f21 = -1.0f;
                                                                }
                                                                if (f21 > 60.0f && entity instanceof WithireniumgolemtitanEntity) {
                                                                    WithireniumgolemtitanEntity _datEntSetI6 = (WithireniumgolemtitanEntity)entity;
                                                                    _datEntSetI6.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
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
                                if (entity instanceof WithireniumgolemtitanEntity) {
                                    _datEntI = (WithireniumgolemtitanEntity)entity;
                                    n14 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 != true) break block637;
                                if (entity instanceof WithireniumgolemtitanEntity) {
                                    ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zt");
                                }
                                if (entity instanceof Mob) {
                                    Mob _mobEnt16 = (Mob)entity;
                                    livingEntity2 = _mobEnt16.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2 != null) {
                                    LivingEntity livingEntity47;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt32 = (Mob)entity;
                                        livingEntity47 = _mobEnt32.m_5448_();
                                    } else {
                                        livingEntity47 = null;
                                    }
                                    f2 = entity.m_20270_(livingEntity47);
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 > 1.0f) {
                                    LivingEntity livingEntity48;
                                    LivingEntity livingEntity49;
                                    LivingEntity livingEntity50;
                                    LivingEntity livingEntity51;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity51 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity51 = null;
                                    }
                                    double d = livingEntity51.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt22 = (Mob)entity;
                                        livingEntity50 = _mobEnt22.m_5448_();
                                    } else {
                                        livingEntity50 = null;
                                    }
                                    double d13 = livingEntity50.m_20186_();
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity49 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity49 = null;
                                    }
                                    double d14 = d13 + (double)livingEntity49.m_20206_() / 1.5;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity48 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity48 = null;
                                    }
                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d14, livingEntity48.m_20189_()));
                                }
                                if (entity instanceof WithireniumgolemtitanEntity) {
                                    WithireniumgolemtitanEntity _datEntI7 = (WithireniumgolemtitanEntity)entity;
                                    n13 = (Integer)_datEntI7.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 == 56) break block638;
                                if (entity instanceof WithireniumgolemtitanEntity) {
                                    _datEntI2 = (WithireniumgolemtitanEntity)entity;
                                    n12 = (Integer)_datEntI2.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                                } else {
                                    n12 = 0;
                                }
                                if (n12 != 96) break block639;
                            }
                            if (world instanceof Level) {
                                Level _level2 = (Level)world;
                                if (!_level2.m_5776_()) {
                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            Vec3 _center2 = new Vec3(x, y, z);
                            List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                            for (Entity entityiterator : _entfound2) {
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                float f26;
                                float f27;
                                float f28;
                                if (entityiterator instanceof WithireniumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt22 = (LivingEntity)entityiterator;
                                    f28 = _livEnt22.m_21233_();
                                } else {
                                    f28 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource, f28 / 20.0f + 200000.0f);
                                if (entityiterator instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                    entityiterator.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator);
                                }
                                DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entityiterator;
                                    f27 = _livEnt2.m_21233_();
                                } else {
                                    f27 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource2, f27 / 20.0f + 200000.0f);
                                DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entityiterator;
                                    f26 = _livEnt2.m_21233_();
                                } else {
                                    f26 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource3, f26 / 20.0f + 200000.0f);
                                entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entityiterator.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt32 = (LivingEntity)entityiterator;
                                    f25 = _livEnt32.m_21233_();
                                } else {
                                    f25 = -1.0f;
                                }
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entityiterator;
                                    f24 = _livEnt2.m_21223_();
                                } else {
                                    f24 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource4, (f25 + f24) / 5.0f + 2000000.0f);
                                DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator;
                                    f23 = _livEnt3.m_21233_();
                                } else {
                                    f23 = -1.0f;
                                }
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entityiterator;
                                    f22 = _livEnt2.m_21223_();
                                } else {
                                    f22 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource5, (f23 + f22) / 5.0f + 2000000.0f);
                            }
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI8 = (WithireniumgolemtitanEntity)entity;
                            n11 = (Integer)_datEntI8.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n11 = 0;
                        }
                        if (n11 >= 120) {
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        _datEntI = (WithireniumgolemtitanEntity)entity;
                        n10 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 2) {
                        int n28;
                        int n29;
                        float f29;
                        LivingEntity livingEntity52;
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zj");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt17 = (Mob)entity;
                            livingEntity52 = _mobEnt17.m_5448_();
                        } else {
                            livingEntity52 = null;
                        }
                        if (livingEntity52 != null) {
                            LivingEntity livingEntity53;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity53 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity53 = null;
                            }
                            f29 = entity.m_20270_(livingEntity53);
                        } else {
                            f29 = -1.0f;
                        }
                        if (f29 > 1.0f) {
                            LivingEntity livingEntity54;
                            LivingEntity livingEntity55;
                            LivingEntity livingEntity56;
                            LivingEntity livingEntity57;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity57 = _mobEnt.m_5448_();
                            } else {
                                livingEntity57 = null;
                            }
                            double d = livingEntity57.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity56 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity56 = null;
                            }
                            double d15 = livingEntity56.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity55 = _mobEnt.m_5448_();
                            } else {
                                livingEntity55 = null;
                            }
                            double d16 = d15 + (double)livingEntity55.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity54 = _mobEnt.m_5448_();
                            } else {
                                livingEntity54 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity54.m_20189_()));
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI9 = (WithireniumgolemtitanEntity)entity;
                            n29 = (Integer)_datEntI9.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n29 = 0;
                        }
                        if (n29 == 36) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(70.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity2 : _entfound) {
                                float f30;
                                float f31;
                                float f32;
                                float f33;
                                float f34;
                                float f35;
                                float f36;
                                if (entity2 instanceof WithireniumgolemtitanEntity || !(entity2 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity2;
                                    f36 = _livEnt.m_21233_();
                                } else {
                                    f36 = -1.0f;
                                }
                                entity2.m_6469_(damageSource, f36 / 20.0f + 200000.0f);
                                if (entity2 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity2 instanceof Player)) {
                                    entity2.f_19802_ = 0;
                                    Deathlist.normalattack(entity2);
                                }
                                DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity2;
                                    f35 = _livEnt.m_21233_();
                                } else {
                                    f35 = -1.0f;
                                }
                                entity2.m_6469_(damageSource6, f35 / 20.0f + 200000.0f);
                                DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity2;
                                    f34 = _livEnt.m_21233_();
                                } else {
                                    f34 = -1.0f;
                                }
                                entity2.m_6469_(damageSource7, f34 / 20.0f + 200000.0f);
                                entity2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity2.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity2;
                                    f33 = _livEnt2.m_21233_();
                                } else {
                                    f33 = -1.0f;
                                }
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity2;
                                    f32 = _livEnt.m_21223_();
                                } else {
                                    f32 = -1.0f;
                                }
                                entity2.m_6469_(damageSource8, (f33 + f32) / 5.0f + 2000000.0f);
                                DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity2;
                                    f31 = _livEnt2.m_21233_();
                                } else {
                                    f31 = -1.0f;
                                }
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity2;
                                    f30 = _livEnt.m_21223_();
                                } else {
                                    f30 = -1.0f;
                                }
                                entity2.m_6469_(damageSource9, (f31 + f30) / 5.0f + 2000000.0f);
                            }
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI10 = (WithireniumgolemtitanEntity)entity;
                            n28 = (Integer)_datEntI10.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n28 = 0;
                        }
                        if (n28 >= 60) {
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        _datEntI = (WithireniumgolemtitanEntity)entity;
                        n9 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 3) {
                        int n30;
                        int n31;
                        float f37;
                        LivingEntity livingEntity58;
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.gt");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt18 = (Mob)entity;
                            livingEntity58 = _mobEnt18.m_5448_();
                        } else {
                            livingEntity58 = null;
                        }
                        if (livingEntity58 != null) {
                            LivingEntity livingEntity59;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity59 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity59 = null;
                            }
                            f37 = entity.m_20270_(livingEntity59);
                        } else {
                            f37 = -1.0f;
                        }
                        if (f37 > 1.0f) {
                            LivingEntity livingEntity60;
                            LivingEntity livingEntity61;
                            LivingEntity livingEntity62;
                            LivingEntity livingEntity63;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity63 = _mobEnt.m_5448_();
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
                            double d17 = livingEntity62.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity61 = _mobEnt.m_5448_();
                            } else {
                                livingEntity61 = null;
                            }
                            double d18 = d17 + (double)livingEntity61.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity60 = _mobEnt.m_5448_();
                            } else {
                                livingEntity60 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity60.m_20189_()));
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI11 = (WithireniumgolemtitanEntity)entity;
                            n31 = (Integer)_datEntI11.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n31 = 0;
                        }
                        if (n31 == 48) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(90.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity3 : _entfound) {
                                float f38;
                                float f39;
                                float f40;
                                float f41;
                                float f42;
                                float f43;
                                float f44;
                                if (entity3 instanceof WithireniumgolemtitanEntity || !(entity3 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity3;
                                    f44 = _livEnt.m_21233_();
                                } else {
                                    f44 = -1.0f;
                                }
                                entity3.m_6469_(damageSource, f44 / 20.0f + 420000.0f);
                                if (entity3 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity3 instanceof Player)) {
                                    entity3.f_19802_ = 0;
                                    Deathlist.normalattack(entity3);
                                }
                                DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity3;
                                    f43 = _livEnt.m_21233_();
                                } else {
                                    f43 = -1.0f;
                                }
                                entity3.m_6469_(damageSource10, f43 / 20.0f + 420000.0f);
                                DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity3;
                                    f42 = _livEnt.m_21233_();
                                } else {
                                    f42 = -1.0f;
                                }
                                entity3.m_6469_(damageSource11, f42 / 20.0f + 420000.0f);
                                entity3.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity3.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity3;
                                    f41 = _livEnt2.m_21233_();
                                } else {
                                    f41 = -1.0f;
                                }
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity3;
                                    f40 = _livEnt.m_21223_();
                                } else {
                                    f40 = -1.0f;
                                }
                                entity3.m_6469_(damageSource12, (f41 + f40) / 5.0f + 4200000.0f);
                                DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity3;
                                    f39 = _livEnt2.m_21233_();
                                } else {
                                    f39 = -1.0f;
                                }
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity3;
                                    f38 = _livEnt.m_21223_();
                                } else {
                                    f38 = -1.0f;
                                }
                                entity3.m_6469_(damageSource13, (f39 + f38) / 5.0f + 4200000.0f);
                            }
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI12 = (WithireniumgolemtitanEntity)entity;
                            n30 = (Integer)_datEntI12.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n30 = 0;
                        }
                        if (n30 >= 80) {
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        _datEntI = (WithireniumgolemtitanEntity)entity;
                        n8 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                    } else {
                        n8 = 0;
                    }
                    if (n8 == 4) {
                        int n32;
                        int n33;
                        float f45;
                        LivingEntity livingEntity64;
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.attack");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt19 = (Mob)entity;
                            livingEntity64 = _mobEnt19.m_5448_();
                        } else {
                            livingEntity64 = null;
                        }
                        if (livingEntity64 != null) {
                            LivingEntity livingEntity65;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity65 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity65 = null;
                            }
                            f45 = entity.m_20270_(livingEntity65);
                        } else {
                            f45 = -1.0f;
                        }
                        if (f45 > 1.0f) {
                            LivingEntity livingEntity66;
                            LivingEntity livingEntity67;
                            LivingEntity livingEntity68;
                            LivingEntity livingEntity69;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity69 = _mobEnt.m_5448_();
                            } else {
                                livingEntity69 = null;
                            }
                            double d = livingEntity69.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity68 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity68 = null;
                            }
                            double d19 = livingEntity68.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity67 = _mobEnt.m_5448_();
                            } else {
                                livingEntity67 = null;
                            }
                            double d20 = d19 + (double)livingEntity67.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity66 = _mobEnt.m_5448_();
                            } else {
                                livingEntity66 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity66.m_20189_()));
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI13 = (WithireniumgolemtitanEntity)entity;
                            n33 = (Integer)_datEntI13.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n33 = 0;
                        }
                        if (n33 == 14) {
                            float f46;
                            LivingEntity livingEntity70;
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity70 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity70 = null;
                            }
                            if (livingEntity70 != null) {
                                LivingEntity livingEntity71;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity71 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity71 = null;
                                }
                                f46 = entity.m_20270_(livingEntity71);
                            } else {
                                f46 = -1.0f;
                            }
                            if (f46 > 1.0f) {
                                LivingEntity livingEntity72;
                                LivingEntity livingEntity73;
                                LivingEntity livingEntity74;
                                LivingEntity livingEntity75;
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity75 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity75 = null;
                                }
                                double d = livingEntity75.m_20185_();
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity74 = mob.m_5448_();
                                } else {
                                    livingEntity74 = null;
                                }
                                double d21 = livingEntity74.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity73 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity73 = null;
                                }
                                double d22 = d21 + (double)livingEntity73.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity72 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity72 = null;
                                }
                                world.m_7106_((ParticleOptions)ParticleTypes.f_123744_, d, d22, livingEntity72.m_20189_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                            }
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(130.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity4 : _entfound) {
                                float f47;
                                float f48;
                                float f49;
                                float f50;
                                float f51;
                                float f52;
                                float f53;
                                float f54;
                                if (entity4 instanceof WithireniumgolemtitanEntity || !(entity4 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity4;
                                    f54 = _livEnt.m_21233_();
                                } else {
                                    f54 = -1.0f;
                                }
                                entity4.m_6469_(damageSource, f54 / 20.0f + 840000.0f);
                                DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity4;
                                    f53 = _livEnt.m_21233_();
                                } else {
                                    f53 = -1.0f;
                                }
                                entity4.m_6469_(damageSource14, f53 / 20.0f + 210000.0f);
                                if (entity4 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity4 instanceof Player)) {
                                    entity4.f_19802_ = 0;
                                    Deathlist.normalattack(entity4);
                                }
                                DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity4;
                                    f52 = _livEnt.m_21233_();
                                } else {
                                    f52 = -1.0f;
                                }
                                entity4.m_6469_(damageSource15, f52 / 20.0f + 840000.0f);
                                DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity4;
                                    f51 = _livEnt.m_21233_();
                                } else {
                                    f51 = -1.0f;
                                }
                                entity4.m_6469_(damageSource16, f51 / 20.0f + 840000.0f);
                                if (!(entity4.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity4;
                                    f50 = _livEnt2.m_21233_();
                                } else {
                                    f50 = -1.0f;
                                }
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity4;
                                    f49 = _livEnt.m_21223_();
                                } else {
                                    f49 = -1.0f;
                                }
                                entity4.m_6469_(damageSource17, (f50 + f49) / 5.0f + 8400000.0f);
                                DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity4;
                                    f48 = _livEnt2.m_21233_();
                                } else {
                                    f48 = -1.0f;
                                }
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity4;
                                    f47 = _livEnt.m_21223_();
                                } else {
                                    f47 = -1.0f;
                                }
                                entity4.m_6469_(damageSource18, (f48 + f47) / 5.0f + 8400000.0f);
                            }
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI14 = (WithireniumgolemtitanEntity)entity;
                            n32 = (Integer)_datEntI14.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n32 = 0;
                        }
                        if (n32 >= 30) {
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        _datEntI = (WithireniumgolemtitanEntity)entity;
                        n7 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                    } else {
                        n7 = 0;
                    }
                    if (n7 == 5) {
                        int n34;
                        int n35;
                        float f55;
                        LivingEntity livingEntity76;
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.fs");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt20 = (Mob)entity;
                            livingEntity76 = _mobEnt20.m_5448_();
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
                        if (f55 > 1.0f) {
                            LivingEntity livingEntity78;
                            LivingEntity livingEntity79;
                            LivingEntity livingEntity80;
                            LivingEntity livingEntity81;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity81 = _mobEnt.m_5448_();
                            } else {
                                livingEntity81 = null;
                            }
                            double d = livingEntity81.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity80 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity80 = null;
                            }
                            double d23 = livingEntity80.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity79 = _mobEnt.m_5448_();
                            } else {
                                livingEntity79 = null;
                            }
                            double d24 = d23 + (double)livingEntity79.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity78 = _mobEnt.m_5448_();
                            } else {
                                livingEntity78 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity78.m_20189_()));
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI15 = (WithireniumgolemtitanEntity)entity;
                            n35 = (Integer)_datEntI15.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n35 = 0;
                        }
                        if (n35 == 40) {
                            float f56;
                            LivingEntity livingEntity82;
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity82 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity82 = null;
                            }
                            if (livingEntity82 != null) {
                                LivingEntity livingEntity83;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity83 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity83 = null;
                                }
                                f56 = entity.m_20270_(livingEntity83);
                            } else {
                                f56 = -1.0f;
                            }
                            if (f56 > 1.0f) {
                                LivingEntity livingEntity84;
                                LivingEntity livingEntity85;
                                LivingEntity livingEntity86;
                                LivingEntity livingEntity87;
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity87 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity87 = null;
                                }
                                double d = livingEntity87.m_20185_();
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity86 = mob.m_5448_();
                                } else {
                                    livingEntity86 = null;
                                }
                                double d25 = livingEntity86.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity85 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity85 = null;
                                }
                                double d26 = d25 + (double)livingEntity85.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity84 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity84 = null;
                                }
                                world.m_7106_((ParticleOptions)ParticleTypes.f_123744_, d, d26, livingEntity84.m_20189_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                            }
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity5 : _entfound) {
                                float f57;
                                float f58;
                                float f59;
                                float f60;
                                float f61;
                                float f62;
                                float f63;
                                float f64;
                                if (entity5 instanceof WithireniumgolemtitanEntity || !(entity5 instanceof LivingEntity)) continue;
                                double _setval = 5.0;
                                entity5.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entity5);
                                });
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt7 = (LivingEntity)entity5;
                                    f64 = _livEnt7.m_21233_();
                                } else {
                                    f64 = -1.0f;
                                }
                                entity5.m_6469_(damageSource, f64 / 20.0f + 1680000.0f);
                                DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt8 = (LivingEntity)entity5;
                                    f63 = _livEnt8.m_21233_();
                                } else {
                                    f63 = -1.0f;
                                }
                                entity5.m_6469_(damageSource19, f63 / 20.0f + 420000.0f);
                                if (entity5 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity5 instanceof Player)) {
                                    entity5.f_19802_ = 0;
                                    Deathlist.normalattack(entity5);
                                }
                                DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt9 = (LivingEntity)entity5;
                                    f62 = _livEnt9.m_21233_();
                                } else {
                                    f62 = -1.0f;
                                }
                                entity5.m_6469_(damageSource20, f62 / 20.0f + 1680000.0f);
                                DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt10 = (LivingEntity)entity5;
                                    f61 = _livEnt10.m_21233_();
                                } else {
                                    f61 = -1.0f;
                                }
                                entity5.m_6469_(damageSource21, f61 / 20.0f + 1680000.0f);
                                entity5.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity5.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity5;
                                    f60 = _livEnt2.m_21233_();
                                } else {
                                    f60 = -1.0f;
                                }
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt11 = (LivingEntity)entity5;
                                    f59 = _livEnt11.m_21223_();
                                } else {
                                    f59 = -1.0f;
                                }
                                entity5.m_6469_(damageSource22, (f60 + f59) / 5.0f + 1.68E7f);
                                DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity5;
                                    f58 = _livEnt2.m_21233_();
                                } else {
                                    f58 = -1.0f;
                                }
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt12 = (LivingEntity)entity5;
                                    f57 = _livEnt12.m_21223_();
                                } else {
                                    f57 = -1.0f;
                                }
                                entity5.m_6469_(damageSource23, (f58 + f57) / 5.0f + 1.68E7f);
                            }
                        }
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI16 = (WithireniumgolemtitanEntity)entity;
                            n34 = (Integer)_datEntI16.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n34 = 0;
                        }
                        if (n34 >= 60) {
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                _datEntSetI = (WithireniumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof WithireniumgolemtitanEntity) {
                                ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        _datEntI = (WithireniumgolemtitanEntity)entity;
                        n6 = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
                    } else {
                        n6 = 0;
                    }
                    if (n6 != 6) break block640;
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.explosion");
                    }
                    if (entity instanceof Mob) {
                        Mob _mobEnt21 = (Mob)entity;
                        livingEntity = _mobEnt21.m_5448_();
                    } else {
                        livingEntity = null;
                    }
                    if (livingEntity != null) {
                        LivingEntity livingEntity88;
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity88 = _mobEnt4.m_5448_();
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
                            _mobEnt = (Mob)entity;
                            livingEntity92 = _mobEnt.m_5448_();
                        } else {
                            livingEntity92 = null;
                        }
                        double d = livingEntity92.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity91 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity91 = null;
                        }
                        double d27 = livingEntity91.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity90 = _mobEnt.m_5448_();
                        } else {
                            livingEntity90 = null;
                        }
                        double d28 = d27 + (double)livingEntity90.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity89 = _mobEnt.m_5448_();
                        } else {
                            livingEntity89 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity89.m_20189_()));
                    }
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        WithireniumgolemtitanEntity _datEntI17 = (WithireniumgolemtitanEntity)entity;
                        n5 = (Integer)_datEntI17.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n5 = 0;
                    }
                    if (n5 == 23) break block641;
                    if (entity instanceof WithireniumgolemtitanEntity) {
                        _datEntI2 = (WithireniumgolemtitanEntity)entity;
                        n4 = (Integer)_datEntI2.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n4 = 0;
                    }
                    if (n4 != 95) break block642;
                }
                for (int index2 = 0; index2 < 360; ++index2) {
                    world.m_7106_((ParticleOptions)ParticleTypes.f_123744_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0), y + 0.2, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)1.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                    world.m_7106_((ParticleOptions)ParticleTypes.f_175834_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0), y + 0.2, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)1.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                }
                if (world instanceof Level) {
                    Level _level3 = (Level)world;
                    if (!_level3.m_5776_()) {
                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center2 = new Vec3(x + entity.m_20154_().f_82479_ * 20.0, y, z + entity.m_20154_().f_82481_ * 20.0);
                List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entityiterator : _entfound2) {
                    float f;
                    float f65;
                    float f66;
                    float f67;
                    float f68;
                    float f69;
                    float f70;
                    float f71;
                    if (entityiterator instanceof WithireniumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 5.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt13 = (LivingEntity)entityiterator;
                        f71 = _livEnt13.m_21233_();
                    } else {
                        f71 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f71 / 20.0f + 840000.0f);
                    DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt14 = (LivingEntity)entityiterator;
                        f70 = _livEnt14.m_21233_();
                    } else {
                        f70 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource24, f70 / 20.0f + 210000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt15 = (LivingEntity)entityiterator;
                        f69 = _livEnt15.m_21233_();
                    } else {
                        f69 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource25, f69 / 20.0f + 840000.0f);
                    DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt16 = (LivingEntity)entityiterator;
                        f68 = _livEnt16.m_21233_();
                    } else {
                        f68 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource26, f68 / 20.0f + 840000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f67 = _livEnt3.m_21233_();
                    } else {
                        f67 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt17 = (LivingEntity)entityiterator;
                        f66 = _livEnt17.m_21223_();
                    } else {
                        f66 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource27, (f67 + f66) / 5.0f + 8400000.0f);
                    DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f65 = _livEnt3.m_21233_();
                    } else {
                        f65 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt18 = (LivingEntity)entityiterator;
                        f = _livEnt18.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource28, (f65 + f) / 5.0f + 8400000.0f);
                }
            }
            if (entity instanceof WithireniumgolemtitanEntity) {
                WithireniumgolemtitanEntity _datEntI18 = (WithireniumgolemtitanEntity)entity;
                n3 = (Integer)_datEntI18.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
            } else {
                n3 = 0;
            }
            if (n3 >= 95) {
                if (theta >= 360.0) {
                    theta = 0.0;
                }
                if (theta == 0.0) {
                    int index3 = 0;
                    while (true) {
                        int n36;
                        int n37;
                        int n38;
                        Object _datEntI5;
                        int n39;
                        int n40;
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            _datEntI2 = (WithireniumgolemtitanEntity)entity;
                            n40 = (Integer)_datEntI2.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n40 = 0;
                        }
                        if (index3 >= 120 + (n40 - 94) * 8) break;
                        SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.WITHIRENIUMENERGYFIRE.get();
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            WithireniumgolemtitanEntity _datEntI19 = (WithireniumgolemtitanEntity)entity;
                            n39 = (Integer)_datEntI19.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n39 = 0;
                        }
                        double d = x + (double)((n39 - 94) * 6) * Math.cos(theta);
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            _datEntI5 = (WithireniumgolemtitanEntity)entity;
                            n38 = (Integer)_datEntI5.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n38 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType, d, y - 12.0, z + (double)((n38 - 94) * 6) * Math.sin(theta), 0.0, 3.0, 0.0);
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            _datEntI5 = (WithireniumgolemtitanEntity)entity;
                            n37 = (Integer)_datEntI5.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n37 = 0;
                        }
                        double d29 = x + (double)((n37 - 94) * 6) * Math.cos(theta);
                        if (entity instanceof WithireniumgolemtitanEntity) {
                            _datEntI5 = (WithireniumgolemtitanEntity)entity;
                            n36 = (Integer)_datEntI5.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n36 = 0;
                        }
                        world.m_7106_((ParticleOptions)ParticleTypes.f_123744_, d29, y + 0.01, z + (double)((n36 - 94) * 6) * Math.sin(theta), 0.0, 2.0, 0.0);
                        theta += 1.0;
                        ++index3;
                    }
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ghasttitanfireball")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ghasttitanfireball")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity6 : _entfound) {
                    float f;
                    float f72;
                    float f73;
                    float f74;
                    float f75;
                    float f76;
                    float f77;
                    if (entity6 instanceof WithireniumgolemtitanEntity || !(entity6 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f77 = _livEnt.m_21233_();
                    } else {
                        f77 = -1.0f;
                    }
                    entity6.m_6469_(damageSource, f77 / 20.0f + 210000.0f);
                    if (!(entity6 instanceof Player)) {
                        entity6.m_20254_(5);
                    }
                    if (entity6 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity6 instanceof Player)) {
                        entity6.f_19802_ = 0;
                        Deathlist.normalattack(entity6);
                    }
                    DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f76 = _livEnt.m_21233_();
                    } else {
                        f76 = -1.0f;
                    }
                    entity6.m_6469_(damageSource29, f76 / 20.0f + 210000.0f);
                    DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f75 = _livEnt.m_21233_();
                    } else {
                        f75 = -1.0f;
                    }
                    entity6.m_6469_(damageSource30, f75 / 20.0f + 210000.0f);
                    if (!(entity6.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity6;
                        f74 = _livEnt2.m_21233_();
                    } else {
                        f74 = -1.0f;
                    }
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f73 = _livEnt.m_21223_();
                    } else {
                        f73 = -1.0f;
                    }
                    entity6.m_6469_(damageSource31, (f74 + f73) / 5.0f + 2100000.0f);
                    DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity6;
                        f72 = _livEnt2.m_21233_();
                    } else {
                        f72 = -1.0f;
                    }
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entity6.m_6469_(damageSource32, (f72 + f) / 5.0f + 2100000.0f);
                }
            }
            if (entity instanceof WithireniumgolemtitanEntity) {
                WithireniumgolemtitanEntity _datEntI20 = (WithireniumgolemtitanEntity)entity;
                n2 = (Integer)_datEntI20.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 >= 130) {
                if (entity instanceof WithireniumgolemtitanEntity) {
                    _datEntSetI = (WithireniumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WithireniumgolemtitanEntity) {
                    _datEntSetI = (WithireniumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WithireniumgolemtitanEntity) {
                    ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WithireniumgolemtitanEntity) {
            _datEntI = (WithireniumgolemtitanEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 7) {
            int n41;
            int n42;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof WithireniumgolemtitanEntity) {
                ((WithireniumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.td");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt22 = (Mob)entity;
                livingEntity = _mobEnt22.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity93;
                if (entity instanceof Mob) {
                    _mobEnt4 = (Mob)entity;
                    livingEntity93 = _mobEnt4.m_5448_();
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
                    _mobEnt = (Mob)entity;
                    livingEntity97 = _mobEnt.m_5448_();
                } else {
                    livingEntity97 = null;
                }
                double d = livingEntity97.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity96 = _mobEnt3.m_5448_();
                } else {
                    livingEntity96 = null;
                }
                double d30 = livingEntity96.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity95 = _mobEnt.m_5448_();
                } else {
                    livingEntity95 = null;
                }
                double d31 = d30 + (double)livingEntity95.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity94 = _mobEnt.m_5448_();
                } else {
                    livingEntity94 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d31, livingEntity94.m_20189_()));
            }
            if (entity instanceof WithireniumgolemtitanEntity) {
                WithireniumgolemtitanEntity _datEntI21 = (WithireniumgolemtitanEntity)entity;
                n42 = (Integer)_datEntI21.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
            } else {
                n42 = 0;
            }
            if (n42 == 18) {
                float f78;
                LivingEntity livingEntity98;
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
                    livingEntity98 = _mobEnt4.m_5448_();
                } else {
                    livingEntity98 = null;
                }
                if (livingEntity98 != null) {
                    LivingEntity livingEntity99;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity99 = _mobEnt.m_5448_();
                    } else {
                        livingEntity99 = null;
                    }
                    f78 = entity.m_20270_(livingEntity99);
                } else {
                    f78 = -1.0f;
                }
                if (f78 > 1.0f && world instanceof ServerLevel) {
                    LivingEntity livingEntity100;
                    LivingEntity livingEntity101;
                    LivingEntity livingEntity102;
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile projectile = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            GiantwithireniumEntity entityToSpawn = new GiantwithireniumEntity((EntityType<? extends GiantwithireniumEntity>)((EntityType)UltimateskeletonsModEntities.GIANTWITHIRENIUM.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                    projectile.m_6034_(x + entity.m_20154_().f_82479_ * 27.0, y + 45.0, z + entity.m_20154_().f_82481_ * 27.0);
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity102 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity102 = null;
                    }
                    double d = livingEntity102.m_20185_() - entity.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity101 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity101 = null;
                    }
                    double d32 = livingEntity101.m_20186_() - 40.0 - entity.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity100 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity100 = null;
                    }
                    projectile.m_6686_(d, d32, livingEntity100.m_20189_() - entity.m_20189_(), 4.0f, 2.0f);
                    projectileLevel.m_7967_((Entity)projectile);
                }
            }
            if (entity instanceof WithireniumgolemtitanEntity) {
                WithireniumgolemtitanEntity _datEntI22 = (WithireniumgolemtitanEntity)entity;
                n41 = (Integer)_datEntI22.m_20088_().m_135370_(WithireniumgolemtitanEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 >= 50) {
                if (entity instanceof WithireniumgolemtitanEntity) {
                    _datEntSetI = (WithireniumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WithireniumgolemtitanEntity) {
                    _datEntSetI = (WithireniumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WithireniumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WithireniumgolemtitanEntity) {
                    ((WithireniumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

