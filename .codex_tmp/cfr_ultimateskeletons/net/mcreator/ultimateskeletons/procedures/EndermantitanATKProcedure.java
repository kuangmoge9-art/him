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
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.Projectile
 *  net.minecraft.world.level.Level
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
import net.mcreator.ultimateskeletons.entity.EndermantitanEntity;
import net.mcreator.ultimateskeletons.entity.EnderrainEntity;
import net.mcreator.ultimateskeletons.entity.LightningballEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
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
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class EndermantitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        EndermantitanEntity _datEntI;
        LivingEntity _livEnt;
        int n8;
        LivingEntity _livEnt2;
        LivingEntity _livEnt3;
        List<Entity> _entfound;
        EndermantitanEntity _datEntI2;
        Mob _mobEnt;
        Object _mobEnt2;
        Object _mobEnt3;
        EndermantitanEntity _datEntI3;
        Object _mobEnt4;
        EndermantitanEntity _datEntI4;
        EndermantitanEntity _datEntI5;
        block954: {
            int n9;
            block956: {
                block955: {
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    float f;
                    EndermantitanEntity _datEntI6;
                    EndermantitanEntity _datEntSetI;
                    LivingEntity _livEnt4;
                    Mob _entity;
                    block951: {
                        LivingEntity livingEntity;
                        EndermantitanEntity _datEntSetI2;
                        LivingEntity _livEnt5;
                        Mob _mobEnt5;
                        block952: {
                            block953: {
                                LivingEntity livingEntity2;
                                float f2;
                                Object object;
                                LivingEntity livingEntity3;
                                int n14;
                                int n15;
                                float f3;
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
                                if (entity instanceof EndermantitanEntity) {
                                    int n16;
                                    EndermantitanEntity _datEntSetI3 = (EndermantitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                                    if (entity instanceof EndermantitanEntity) {
                                        _datEntI5 = (EndermantitanEntity)entity;
                                        n16 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_spawnTick);
                                    } else {
                                        n16 = 0;
                                    }
                                    synchedEntityData.m_135381_(EndermantitanEntity.DATA_spawnTick, (Object)(n16 + 1));
                                }
                                if (entity.m_5446_().getString().equals("growing")) {
                                    int n17;
                                    if (entity instanceof EndermantitanEntity) {
                                        _datEntI4 = (EndermantitanEntity)entity;
                                        n17 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_spawnTick);
                                    } else {
                                        n17 = 0;
                                    }
                                    if (n17 < 720) {
                                        int n18;
                                        int n19;
                                        ServerLevel _level;
                                        int n20;
                                        entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                        entity.f_19802_ = 20;
                                        if (entity instanceof LivingEntity) {
                                            ((LivingEntity)entity).f_20919_ = 0;
                                        }
                                        ((EndermantitanEntity)entity).setHEALTS(300000.0);
                                        if (entity instanceof Mob) {
                                            _entity = (Mob)entity;
                                            _entity.m_6710_(null);
                                        }
                                        if (entity instanceof EndermantitanEntity) {
                                            _datEntI5 = (EndermantitanEntity)entity;
                                            n20 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_spawnTick);
                                        } else {
                                            n20 = 0;
                                        }
                                        if (n20 == 450 && world instanceof ServerLevel) {
                                            _level = (ServerLevel)world;
                                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                            if (entityToSpawn != null) {
                                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                            }
                                        }
                                        if (entity instanceof EndermantitanEntity) {
                                            _datEntI5 = (EndermantitanEntity)entity;
                                            n19 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_spawnTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 <= 10 && entity instanceof EndermantitanEntity) {
                                            ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.spawn");
                                        }
                                        if (entity instanceof EndermantitanEntity) {
                                            _datEntI5 = (EndermantitanEntity)entity;
                                            n18 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_spawnTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 == 719) {
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                }
                                            }
                                            if (!world.m_5776_() && world.m_7654_() != null) {
                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Endermantitan has been created!!!"), false);
                                            }
                                        }
                                        if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n21;
                                    if (entity instanceof EndermantitanEntity) {
                                        _datEntI4 = (EndermantitanEntity)entity;
                                        n21 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
                                    } else {
                                        n21 = 0;
                                    }
                                    if (n21 != 0) {
                                        float f4;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt6 = (LivingEntity)entity;
                                            f4 = _livEnt6.m_21223_();
                                        } else {
                                            f4 = -1.0f;
                                        }
                                        if (f4 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof EndermantitanEntity)) continue;
                                                ((EndermantitanEntity)entity).setAnimation("empty");
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
                                if (!(f3 > 0.0f)) break block951;
                                if (entity instanceof EndermantitanEntity) {
                                    _datEntSetI = (EndermantitanEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof EndermantitanEntity) {
                                    _datEntI5 = (EndermantitanEntity)entity;
                                    n15 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
                                } else {
                                    n15 = 0;
                                }
                                if (n15 == 0) {
                                    int n22;
                                    if (entity instanceof EndermantitanEntity) {
                                        EndermantitanEntity _datEntI7 = (EndermantitanEntity)entity;
                                        n22 = (Integer)_datEntI7.m_20088_().m_135370_(EndermantitanEntity.DATA_flyID);
                                    } else {
                                        n22 = 0;
                                    }
                                    if (n22 != 0) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                    }
                                }
                                if (world.m_5776_()) break block951;
                                if (entity instanceof EndermantitanEntity) {
                                    _datEntI5 = (EndermantitanEntity)entity;
                                    n14 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 != 0 && entity instanceof EndermantitanEntity) {
                                    int n23;
                                    EndermantitanEntity _datEntSetI4 = (EndermantitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
                                    if (entity instanceof EndermantitanEntity) {
                                        _datEntI6 = (EndermantitanEntity)entity;
                                        n23 = (Integer)_datEntI6.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                                    } else {
                                        n23 = 0;
                                    }
                                    synchedEntityData.m_135381_(EndermantitanEntity.DATA_animationTick, (Object)(n23 + 1));
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity3 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity3 = null;
                                }
                                if (livingEntity3 == null) break block952;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt6 = (Mob)entity;
                                    v15 = _mobEnt6.m_5448_();
                                } else {
                                    v15 = object = null;
                                }
                                if (object instanceof LivingEntity) {
                                    _livEnt5 = object;
                                    f2 = _livEnt5.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) break block953;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity2 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block952;
                            }
                            if (entity instanceof EndermantitanEntity) {
                                _datEntSetI2 = (EndermantitanEntity)entity;
                                _datEntSetI2.m_20088_().m_135381_(EndermantitanEntity.DATA_flyID, (Object)0);
                            }
                            if (entity instanceof Mob) {
                                Mob _entity3 = (Mob)entity;
                                _entity3.m_6710_(null);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity = _mobEnt5.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            float f5;
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
                                Mob _mobEnt8 = (Mob)entity;
                                livingEntity6 = _mobEnt8.m_5448_();
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
                                v26 = _mobEnt11.m_5448_();
                            } else {
                                v26 = _mobEnt4 = null;
                            }
                            if (_mobEnt4 instanceof LivingEntity) {
                                _livEnt5 = (LivingEntity)_mobEnt4;
                                f5 = _livEnt5.m_21223_();
                            } else {
                                f5 = -1.0f;
                            }
                            if (f5 > 0.0f) {
                                int n24;
                                if (entity instanceof EndermantitanEntity) {
                                    _datEntI3 = (EndermantitanEntity)entity;
                                    n24 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
                                } else {
                                    n24 = 0;
                                }
                                if (n24 == 0) {
                                    Mob _mobEnt12;
                                    Mob _mobEnt13;
                                    Mob _mobEnt14;
                                    Mob _mobEnt15;
                                    Mob _mobEnt16;
                                    float f6;
                                    LivingEntity livingEntity8;
                                    float f7;
                                    LivingEntity livingEntity9;
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity9 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity9 = null;
                                    }
                                    if (livingEntity9 != null) {
                                        LivingEntity livingEntity10;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity10 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity10 = null;
                                        }
                                        f7 = entity.m_20270_(livingEntity10);
                                    } else {
                                        f7 = -1.0f;
                                    }
                                    if (f7 >= 240.0f) {
                                        entity.m_6858_(true);
                                    } else {
                                        entity.m_6858_(false);
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity8 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity8 = null;
                                    }
                                    if (livingEntity8 != null) {
                                        LivingEntity livingEntity11;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity11 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity11 = null;
                                        }
                                        f6 = entity.m_20270_(livingEntity11);
                                    } else {
                                        f6 = -1.0f;
                                    }
                                    if (f6 > 80.0f) {
                                        float f8;
                                        LivingEntity livingEntity12;
                                        LivingEntity livingEntity13;
                                        float f9;
                                        LivingEntity livingEntity14;
                                        LivingEntity livingEntity15;
                                        float f10;
                                        LivingEntity livingEntity16;
                                        LivingEntity livingEntity17;
                                        if (entity instanceof Mob) {
                                            _mobEnt16 = (Mob)entity;
                                            livingEntity17 = _mobEnt16.m_5448_();
                                        } else {
                                            livingEntity17 = null;
                                        }
                                        double d4 = livingEntity17.m_20185_() - entity.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity16 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity16 = null;
                                        }
                                        if (livingEntity16 != null) {
                                            LivingEntity livingEntity18;
                                            if (entity instanceof Mob) {
                                                _mobEnt15 = (Mob)entity;
                                                livingEntity18 = _mobEnt15.m_5448_();
                                            } else {
                                                livingEntity18 = null;
                                            }
                                            f10 = entity.m_20270_(livingEntity18);
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        double d5 = d4 / (double)f10 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt16 = (Mob)entity;
                                            livingEntity15 = _mobEnt16.m_5448_();
                                        } else {
                                            livingEntity15 = null;
                                        }
                                        double d6 = livingEntity15.m_20186_() - entity.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity14 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity14 = null;
                                        }
                                        if (livingEntity14 != null) {
                                            LivingEntity livingEntity19;
                                            if (entity instanceof Mob) {
                                                _mobEnt15 = (Mob)entity;
                                                livingEntity19 = _mobEnt15.m_5448_();
                                            } else {
                                                livingEntity19 = null;
                                            }
                                            f9 = entity.m_20270_(livingEntity19);
                                        } else {
                                            f9 = -1.0f;
                                        }
                                        double d7 = d6 / (double)f9 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt16 = (Mob)entity;
                                            livingEntity13 = _mobEnt16.m_5448_();
                                        } else {
                                            livingEntity13 = null;
                                        }
                                        double d8 = livingEntity13.m_20189_() - entity.m_20189_();
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity12 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity12 = null;
                                        }
                                        if (livingEntity12 != null) {
                                            LivingEntity livingEntity20;
                                            if (entity instanceof Mob) {
                                                _mobEnt15 = (Mob)entity;
                                                livingEntity20 = _mobEnt15.m_5448_();
                                            } else {
                                                livingEntity20 = null;
                                            }
                                            f8 = entity.m_20270_(livingEntity20);
                                        } else {
                                            f8 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d5, d7, d8 / (double)f8 * 2.0));
                                        if (entity instanceof EndermantitanEntity) {
                                            _datEntSetI = (EndermantitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_flyID, (Object)1);
                                        }
                                    } else {
                                        LivingEntity livingEntity21;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity21 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity21 = null;
                                        }
                                        if (livingEntity21.m_20206_() > 8.0f) {
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
                                                    _mobEnt16 = (Mob)entity;
                                                    livingEntity23 = _mobEnt16.m_5448_();
                                                } else {
                                                    livingEntity23 = null;
                                                }
                                                f11 = entity.m_20270_(livingEntity23);
                                            } else {
                                                f11 = -1.0f;
                                            }
                                            if (f11 > 48.0f) {
                                                float f12;
                                                LivingEntity livingEntity24;
                                                LivingEntity livingEntity25;
                                                float f13;
                                                LivingEntity livingEntity26;
                                                LivingEntity livingEntity27;
                                                if (entity instanceof Mob) {
                                                    _mobEnt14 = (Mob)entity;
                                                    livingEntity27 = _mobEnt14.m_5448_();
                                                } else {
                                                    livingEntity27 = null;
                                                }
                                                double d9 = livingEntity27.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt13 = (Mob)entity;
                                                    livingEntity26 = _mobEnt13.m_5448_();
                                                } else {
                                                    livingEntity26 = null;
                                                }
                                                if (livingEntity26 != null) {
                                                    LivingEntity livingEntity28;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt12 = (Mob)entity;
                                                        livingEntity28 = _mobEnt12.m_5448_();
                                                    } else {
                                                        livingEntity28 = null;
                                                    }
                                                    f13 = entity.m_20270_(livingEntity28);
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                double d10 = d9 / (double)f13;
                                                if (entity instanceof Mob) {
                                                    _mobEnt14 = (Mob)entity;
                                                    livingEntity25 = _mobEnt14.m_5448_();
                                                } else {
                                                    livingEntity25 = null;
                                                }
                                                double d11 = livingEntity25.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt13 = (Mob)entity;
                                                    livingEntity24 = _mobEnt13.m_5448_();
                                                } else {
                                                    livingEntity24 = null;
                                                }
                                                if (livingEntity24 != null) {
                                                    LivingEntity livingEntity29;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt12 = (Mob)entity;
                                                        livingEntity29 = _mobEnt12.m_5448_();
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
                                                    _mobEnt16 = (Mob)entity;
                                                    livingEntity31 = _mobEnt16.m_5448_();
                                                } else {
                                                    livingEntity31 = null;
                                                }
                                                f14 = entity.m_20270_(livingEntity31);
                                            } else {
                                                f14 = -1.0f;
                                            }
                                            if (f14 > 12.0f) {
                                                float f15;
                                                LivingEntity livingEntity32;
                                                LivingEntity livingEntity33;
                                                float f16;
                                                LivingEntity livingEntity34;
                                                LivingEntity livingEntity35;
                                                if (entity instanceof Mob) {
                                                    _mobEnt14 = (Mob)entity;
                                                    livingEntity35 = _mobEnt14.m_5448_();
                                                } else {
                                                    livingEntity35 = null;
                                                }
                                                double d12 = livingEntity35.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt13 = (Mob)entity;
                                                    livingEntity34 = _mobEnt13.m_5448_();
                                                } else {
                                                    livingEntity34 = null;
                                                }
                                                if (livingEntity34 != null) {
                                                    LivingEntity livingEntity36;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt12 = (Mob)entity;
                                                        livingEntity36 = _mobEnt12.m_5448_();
                                                    } else {
                                                        livingEntity36 = null;
                                                    }
                                                    f16 = entity.m_20270_(livingEntity36);
                                                } else {
                                                    f16 = -1.0f;
                                                }
                                                double d13 = d12 / (double)f16;
                                                if (entity instanceof Mob) {
                                                    _mobEnt14 = (Mob)entity;
                                                    livingEntity33 = _mobEnt14.m_5448_();
                                                } else {
                                                    livingEntity33 = null;
                                                }
                                                double d14 = livingEntity33.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt13 = (Mob)entity;
                                                    livingEntity32 = _mobEnt13.m_5448_();
                                                } else {
                                                    livingEntity32 = null;
                                                }
                                                if (livingEntity32 != null) {
                                                    LivingEntity livingEntity37;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt12 = (Mob)entity;
                                                        livingEntity37 = _mobEnt12.m_5448_();
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
                                        if (entity instanceof EndermantitanEntity) {
                                            _datEntSetI = (EndermantitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_flyID, (Object)0);
                                        }
                                    }
                                    if (world.m_6106_().m_6533_()) {
                                        if (entity instanceof EndermantitanEntity) {
                                            _datEntSetI2 = (EndermantitanEntity)entity;
                                            _datEntSetI2.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)9);
                                        }
                                    } else {
                                        float f17;
                                        LivingEntity livingEntity38;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity38 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity38 = null;
                                        }
                                        if (livingEntity38 != null) {
                                            LivingEntity livingEntity39;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity39 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity39 = null;
                                            }
                                            f17 = entity.m_20270_(livingEntity39);
                                        } else {
                                            f17 = -1.0f;
                                        }
                                        if (f17 < 512.0f) {
                                            float f18;
                                            LivingEntity livingEntity40;
                                            if (entity instanceof Mob) {
                                                _mobEnt15 = (Mob)entity;
                                                livingEntity40 = _mobEnt15.m_5448_();
                                            } else {
                                                livingEntity40 = null;
                                            }
                                            if (livingEntity40 != null) {
                                                LivingEntity livingEntity41;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity41 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity41 = null;
                                                }
                                                f18 = entity.m_20270_(livingEntity41);
                                            } else {
                                                f18 = -1.0f;
                                            }
                                            if (f18 <= 50.0f) {
                                                if (((Boolean)SkeletonsConfiguration.ALLOW.get()).booleanValue()) {
                                                    LivingEntity livingEntity42;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt16 = (Mob)entity;
                                                        livingEntity42 = _mobEnt16.m_5448_();
                                                    } else {
                                                        livingEntity42 = null;
                                                    }
                                                    if (livingEntity42.m_20206_() > 6.0f) {
                                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 6) {
                                                            if (entity instanceof EndermantitanEntity) {
                                                                _datEntSetI = (EndermantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)3);
                                                            }
                                                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 5 || Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 4) {
                                                            if (entity instanceof EndermantitanEntity) {
                                                                _datEntSetI = (EndermantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)8));
                                                            }
                                                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 3) {
                                                            if (entity instanceof EndermantitanEntity) {
                                                                _datEntSetI = (EndermantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)5);
                                                            }
                                                        } else if (entity instanceof EndermantitanEntity) {
                                                            _datEntSetI = (EndermantitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)4);
                                                        }
                                                    } else if (entity instanceof EndermantitanEntity) {
                                                        _datEntSetI = (EndermantitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                    }
                                                } else {
                                                    LivingEntity livingEntity43;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt16 = (Mob)entity;
                                                        livingEntity43 = _mobEnt16.m_5448_();
                                                    } else {
                                                        livingEntity43 = null;
                                                    }
                                                    if (livingEntity43.m_20206_() > 6.0f) {
                                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 6) {
                                                            if (entity instanceof EndermantitanEntity) {
                                                                _datEntSetI = (EndermantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)3);
                                                            }
                                                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 5 || Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 4) {
                                                            if (entity instanceof EndermantitanEntity) {
                                                                _datEntSetI = (EndermantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)8));
                                                            }
                                                        } else if (entity instanceof EndermantitanEntity) {
                                                            _datEntSetI = (EndermantitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)4);
                                                        }
                                                    } else if (entity instanceof EndermantitanEntity) {
                                                        _datEntSetI = (EndermantitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                    }
                                                }
                                            }
                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                int n25;
                                                if (entity instanceof EndermantitanEntity) {
                                                    _datEntI2 = (EndermantitanEntity)entity;
                                                    n25 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
                                                } else {
                                                    n25 = 0;
                                                }
                                                if (n25 == 0) {
                                                    float f19;
                                                    LivingEntity livingEntity44;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity44 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    if (livingEntity44 != null) {
                                                        LivingEntity livingEntity45;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt16 = (Mob)entity;
                                                            livingEntity45 = _mobEnt16.m_5448_();
                                                        } else {
                                                            livingEntity45 = null;
                                                        }
                                                        f19 = entity.m_20270_(livingEntity45);
                                                    } else {
                                                        f19 = -1.0f;
                                                    }
                                                    if (f19 > 80.0f) {
                                                        LivingEntity livingEntity46;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt12 = (Mob)entity;
                                                            livingEntity46 = _mobEnt12.m_5448_();
                                                        } else {
                                                            livingEntity46 = null;
                                                        }
                                                        if (livingEntity46.m_20206_() > 6.0f) {
                                                            if (entity instanceof EndermantitanEntity) {
                                                                _datEntSetI = (EndermantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)8));
                                                            }
                                                        } else if (entity instanceof EndermantitanEntity) {
                                                            _datEntSetI = (EndermantitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)8));
                                                        }
                                                    } else {
                                                        float f20;
                                                        LivingEntity livingEntity47;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt12 = (Mob)entity;
                                                            livingEntity47 = _mobEnt12.m_5448_();
                                                        } else {
                                                            livingEntity47 = null;
                                                        }
                                                        if (livingEntity47 != null) {
                                                            LivingEntity livingEntity48;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt13 = (Mob)entity;
                                                                livingEntity48 = _mobEnt13.m_5448_();
                                                            } else {
                                                                livingEntity48 = null;
                                                            }
                                                            f20 = entity.m_20270_(livingEntity48);
                                                        } else {
                                                            f20 = -1.0f;
                                                        }
                                                        if (f20 > 50.0f) {
                                                            LivingEntity livingEntity49;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt14 = (Mob)entity;
                                                                livingEntity49 = _mobEnt14.m_5448_();
                                                            } else {
                                                                livingEntity49 = null;
                                                            }
                                                            if (livingEntity49.m_20206_() > 6.0f) {
                                                                if (entity instanceof EndermantitanEntity) {
                                                                    _datEntSetI = (EndermantitanEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)6));
                                                                }
                                                            } else if (entity instanceof EndermantitanEntity) {
                                                                _datEntSetI = (EndermantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)8));
                                                            }
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
                    if (entity instanceof LivingEntity) {
                        _livEnt4 = (LivingEntity)entity;
                        f = _livEnt4.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= 0.0f) {
                        int n26;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntSetI = (EndermantitanEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                        }
                        if (entity instanceof EndermantitanEntity) {
                            _datEntSetI = (EndermantitanEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                        }
                        if (entity instanceof Mob) {
                            _entity = (Mob)entity;
                            _entity.m_6710_(null);
                        }
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI5 = (EndermantitanEntity)entity;
                            n26 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
                        } else {
                            n26 = 0;
                        }
                        if (n26 == 0) {
                            int n27;
                            int n28;
                            int n29;
                            int n30;
                            int n31;
                            if (entity instanceof EndermantitanEntity) {
                                int n32;
                                EndermantitanEntity _datEntSetI5 = (EndermantitanEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI5.m_20088_();
                                if (entity instanceof EndermantitanEntity) {
                                    _datEntI6 = (EndermantitanEntity)entity;
                                    n32 = (Integer)_datEntI6.m_20088_().m_135370_(EndermantitanEntity.DATA_deathTick);
                                } else {
                                    n32 = 0;
                                }
                                synchedEntityData.m_135381_(EndermantitanEntity.DATA_deathTick, (Object)(n32 + 1));
                            }
                            if (entity instanceof EndermantitanEntity) {
                                EndermantitanEntity _datEntI8 = (EndermantitanEntity)entity;
                                n31 = (Integer)_datEntI8.m_20088_().m_135370_(EndermantitanEntity.DATA_deathTick);
                            } else {
                                n31 = 0;
                            }
                            if (n31 == 1 && world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof EndermantitanEntity) {
                                EndermantitanEntity _datEntI9 = (EndermantitanEntity)entity;
                                n30 = (Integer)_datEntI9.m_20088_().m_135370_(EndermantitanEntity.DATA_deathTick);
                            } else {
                                n30 = 0;
                            }
                            if (n30 < 3) {
                                for (int index1 = 0; index1 < 12; ++index1) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof EndermantitanEntity) {
                                EndermantitanEntity _datEntI10 = (EndermantitanEntity)entity;
                                n29 = (Integer)_datEntI10.m_20088_().m_135370_(EndermantitanEntity.DATA_deathTick);
                            } else {
                                n29 = 0;
                            }
                            if (n29 < 100 && entity instanceof EndermantitanEntity) {
                                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.death");
                            }
                            if (entity instanceof EndermantitanEntity) {
                                EndermantitanEntity _datEntI11 = (EndermantitanEntity)entity;
                                n28 = (Integer)_datEntI11.m_20088_().m_135370_(EndermantitanEntity.DATA_deathTick);
                            } else {
                                n28 = 0;
                            }
                            if (n28 == 608) {
                                if (world instanceof ServerLevel) {
                                    ServerLevel _level = (ServerLevel)world;
                                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"endermantitan\"'}");
                                }
                                for (int index2 = 0; index2 < 320; ++index2) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                }
                            }
                            if (entity instanceof EndermantitanEntity) {
                                EndermantitanEntity _datEntI12 = (EndermantitanEntity)entity;
                                n27 = (Integer)_datEntI12.m_20088_().m_135370_(EndermantitanEntity.DATA_deathTick);
                            } else {
                                n27 = 0;
                            }
                            if (n27 >= 608 && !entity.m_9236_().m_5776_()) {
                                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                            }
                        }
                    }
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI4 = (EndermantitanEntity)entity;
                        n13 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
                    } else {
                        n13 = 0;
                    }
                    if (n13 != true) break block954;
                    if (entity instanceof EndermantitanEntity) {
                        ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.zt");
                    }
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI5 = (EndermantitanEntity)entity;
                        n12 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n12 = 0;
                    }
                    if (n12 == 1) {
                        float f21;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            Mob _mobEnt17 = (Mob)entity;
                            livingEntity = _mobEnt17.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity50;
                            if (entity instanceof Mob) {
                                Mob _mobEnt18 = (Mob)entity;
                                livingEntity50 = _mobEnt18.m_5448_();
                            } else {
                                livingEntity50 = null;
                            }
                            f21 = entity.m_20270_(livingEntity50);
                        } else {
                            f21 = -1.0f;
                        }
                        if (f21 > 1.0f) {
                            LivingEntity livingEntity51;
                            LivingEntity livingEntity52;
                            LivingEntity livingEntity53;
                            LivingEntity livingEntity54;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity54 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity54 = null;
                            }
                            double d = livingEntity54.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity53 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity53 = null;
                            }
                            double d15 = livingEntity53.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity52 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity52 = null;
                            }
                            double d16 = d15 + (double)livingEntity52.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity51 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity51 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity51.m_20189_()));
                        }
                    }
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI5 = (EndermantitanEntity)entity;
                        n11 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n11 = 0;
                    }
                    if (n11 == 60) break block955;
                    if (entity instanceof EndermantitanEntity) {
                        EndermantitanEntity _datEntI13 = (EndermantitanEntity)entity;
                        n10 = (Integer)_datEntI13.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 != 110) break block956;
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n33;
                    float f;
                    float f22;
                    int n34;
                    float f23;
                    float f24;
                    int n35;
                    float f25;
                    int n36;
                    float f26;
                    int n37;
                    float f27;
                    if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f27 = _livEnt3.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    float f28 = f27 / 20.0f + 10000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI2 = (EndermantitanEntity)entity;
                        n37 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n37 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f28 + (float)(n37 * 100));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f26 = _livEnt3.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    float f29 = f26 / 20.0f + 10000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI2 = (EndermantitanEntity)entity;
                        n36 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n36 = 0;
                    }
                    entityiterator.m_6469_(damageSource2, f29 + (float)(n36 * 100));
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f25 = _livEnt3.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    float f30 = f25 / 20.0f + 10000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI2 = (EndermantitanEntity)entity;
                        n35 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n35 = 0;
                    }
                    entityiterator.m_6469_(damageSource3, f30 + (float)(n35 * 100));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f24 = _livEnt2.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f23 = _livEnt3.m_21223_();
                    } else {
                        f23 = -1.0f;
                    }
                    float f31 = (f24 + f23) / 5.0f + 100000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI2 = (EndermantitanEntity)entity;
                        n34 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n34 = 0;
                    }
                    entityiterator.m_6469_(damageSource4, f31 + (float)(n34 * 1000));
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f22 = _livEnt2.m_21233_();
                    } else {
                        f22 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f = _livEnt3.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f32 = (f22 + f) / 5.0f + 100000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI2 = (EndermantitanEntity)entity;
                        n33 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n33 = 0;
                    }
                    entityiterator.m_6469_(damageSource5, f32 + (float)(n33 * 1000));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n9 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n9 = 0;
            }
            if (n9 >= 150) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n8 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n8 = 0;
        }
        if (n8 == 2) {
            int n38;
            int n39;
            int n40;
            if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.zp");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n40 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt19 = (Mob)entity;
                    livingEntity = _mobEnt19.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity55;
                    if (entity instanceof Mob) {
                        Mob _mobEnt20 = (Mob)entity;
                        livingEntity55 = _mobEnt20.m_5448_();
                    } else {
                        livingEntity55 = null;
                    }
                    f = entity.m_20270_(livingEntity55);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity56;
                    LivingEntity livingEntity57;
                    LivingEntity livingEntity58;
                    LivingEntity livingEntity59;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity59 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity59 = null;
                    }
                    double d = livingEntity59.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity58 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity58 = null;
                    }
                    double d17 = livingEntity58.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity57 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity57 = null;
                    }
                    double d18 = d17 + (double)livingEntity57.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity56 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity56 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity56.m_20189_()));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n39 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 == 32) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound2) {
                    int n41;
                    float f;
                    float f33;
                    int n42;
                    float f34;
                    float f35;
                    int n43;
                    float f36;
                    int n44;
                    float f37;
                    int n45;
                    float f38;
                    if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f38 = _livEnt.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    float f39 = f38 / 20.0f + 5000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n45 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n45 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f39 + (float)(n45 * 100));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f37 = _livEnt.m_21233_();
                    } else {
                        f37 = -1.0f;
                    }
                    float f40 = f37 / 20.0f + 5000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n44 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n44 = 0;
                    }
                    entityiterator.m_6469_(damageSource6, f40 + (float)(n44 * 100));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f36 = _livEnt.m_21233_();
                    } else {
                        f36 = -1.0f;
                    }
                    float f41 = f36 / 20.0f + 5000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n43 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n43 = 0;
                    }
                    entityiterator.m_6469_(damageSource7, f41 + (float)(n43 * 100));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f35 = _livEnt3.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f34 = _livEnt.m_21223_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f42 = (f35 + f34) / 5.0f + 50000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n42 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n42 = 0;
                    }
                    entityiterator.m_6469_(damageSource8, f42 + (float)(n42 * 1000));
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f33 = _livEnt3.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f43 = (f33 + f) / 5.0f + 50000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n41 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n41 = 0;
                    }
                    entityiterator.m_6469_(damageSource9, f43 + (float)(n41 * 1000));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n38 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n38 = 0;
            }
            if (n38 >= 56) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n7 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n7 = 0;
        }
        if (n7 == 3) {
            int n46;
            int n47;
            int n48;
            if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.qj");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n48 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt21 = (Mob)entity;
                    livingEntity = _mobEnt21.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity60;
                    if (entity instanceof Mob) {
                        Mob _mobEnt22 = (Mob)entity;
                        livingEntity60 = _mobEnt22.m_5448_();
                    } else {
                        livingEntity60 = null;
                    }
                    f = entity.m_20270_(livingEntity60);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity61;
                    LivingEntity livingEntity62;
                    LivingEntity livingEntity63;
                    LivingEntity livingEntity64;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity64 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity64 = null;
                    }
                    double d = livingEntity64.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity63 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity63 = null;
                    }
                    double d19 = livingEntity63.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity62 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity62 = null;
                    }
                    double d20 = d19 + (double)livingEntity62.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity61 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity61 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity61.m_20189_()));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n47 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 == 44) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound3) {
                    int n49;
                    float f;
                    float f44;
                    int n50;
                    float f45;
                    float f46;
                    int n51;
                    float f47;
                    int n52;
                    float f48;
                    int n53;
                    float f49;
                    if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f49 = _livEnt.m_21233_();
                    } else {
                        f49 = -1.0f;
                    }
                    float f50 = f49 / 20.0f + 80000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n53 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n53 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f50 + (float)(n53 * 100));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f48 = _livEnt.m_21233_();
                    } else {
                        f48 = -1.0f;
                    }
                    float f51 = f48 / 20.0f + 80000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n52 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n52 = 0;
                    }
                    entityiterator.m_6469_(damageSource10, f51 + (float)(n52 * 100));
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f47 = _livEnt.m_21233_();
                    } else {
                        f47 = -1.0f;
                    }
                    float f52 = f47 / 20.0f + 80000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n51 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n51 = 0;
                    }
                    entityiterator.m_6469_(damageSource11, f52 + (float)(n51 * 100));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f46 = _livEnt3.m_21233_();
                    } else {
                        f46 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f45 = _livEnt.m_21223_();
                    } else {
                        f45 = -1.0f;
                    }
                    float f53 = (f46 + f45) / 5.0f + 800000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n50 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n50 = 0;
                    }
                    entityiterator.m_6469_(damageSource12, f53 + (float)(n50 * 1000));
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f44 = _livEnt3.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f54 = (f44 + f) / 5.0f + 800000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n49 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n49 = 0;
                    }
                    entityiterator.m_6469_(damageSource13, f54 + (float)(n49 * 1000));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n46 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n46 = 0;
            }
            if (n46 >= 60) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n6 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n6 = 0;
        }
        if (n6 == 4) {
            int n54;
            int n55;
            int n56;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.attack1");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.attack2");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.attack3");
                }
            } else if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.attack4");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n56 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity = _mobEnt23.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity65;
                    if (entity instanceof Mob) {
                        Mob _mobEnt24 = (Mob)entity;
                        livingEntity65 = _mobEnt24.m_5448_();
                    } else {
                        livingEntity65 = null;
                    }
                    f = entity.m_20270_(livingEntity65);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity66;
                    LivingEntity livingEntity67;
                    LivingEntity livingEntity68;
                    LivingEntity livingEntity69;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity69 = _mobEnt4.m_5448_();
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
                    double d21 = livingEntity68.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity67 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity67 = null;
                    }
                    double d22 = d21 + (double)livingEntity67.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity66 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity66.m_20189_()));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n55 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 == 14) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound4) {
                    int n57;
                    float f;
                    float f55;
                    int n58;
                    float f56;
                    float f57;
                    int n59;
                    float f58;
                    int n60;
                    float f59;
                    int n61;
                    float f60;
                    if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f60 = _livEnt.m_21233_();
                    } else {
                        f60 = -1.0f;
                    }
                    float f61 = f60 / 20.0f + 40000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n61 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n61 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f61 + (float)(n61 * 100));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f59 = _livEnt.m_21233_();
                    } else {
                        f59 = -1.0f;
                    }
                    float f62 = f59 / 20.0f + 40000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n60 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n60 = 0;
                    }
                    entityiterator.m_6469_(damageSource14, f62 + (float)(n60 * 100));
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f58 = _livEnt.m_21233_();
                    } else {
                        f58 = -1.0f;
                    }
                    float f63 = f58 / 20.0f + 40000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n59 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n59 = 0;
                    }
                    entityiterator.m_6469_(damageSource15, f63 + (float)(n59 * 100));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f57 = _livEnt3.m_21233_();
                    } else {
                        f57 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f56 = _livEnt.m_21223_();
                    } else {
                        f56 = -1.0f;
                    }
                    float f64 = (f57 + f56) / 5.0f + 400000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n58 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n58 = 0;
                    }
                    entityiterator.m_6469_(damageSource16, f64 + (float)(n58 * 1000));
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f55 = _livEnt3.m_21233_();
                    } else {
                        f55 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f65 = (f55 + f) / 5.0f + 400000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n57 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n57 = 0;
                    }
                    entityiterator.m_6469_(damageSource17, f65 + (float)(n57 * 1000));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n54 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 >= 30) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n5 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n5 = 0;
        }
        if (n5 == 5) {
            int n62;
            int n63;
            int n64;
            int n65;
            if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.thunderball");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n65 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n65 = 0;
            }
            if (n65 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt25 = (Mob)entity;
                    livingEntity = _mobEnt25.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity70;
                    if (entity instanceof Mob) {
                        Mob _mobEnt26 = (Mob)entity;
                        livingEntity70 = _mobEnt26.m_5448_();
                    } else {
                        livingEntity70 = null;
                    }
                    f = entity.m_20270_(livingEntity70);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity71;
                    LivingEntity livingEntity72;
                    LivingEntity livingEntity73;
                    LivingEntity livingEntity74;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity74 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity74 = null;
                    }
                    double d = livingEntity74.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity73 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity73 = null;
                    }
                    double d23 = livingEntity73.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity72 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity72 = null;
                    }
                    double d24 = d23 + (double)livingEntity72.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity71 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity71 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity71.m_20189_()));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n64 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n64 = 0;
            }
            if (n64 == 55) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index3 = 0; index3 < 32; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.PURPLELIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(180.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound5) {
                    int n66;
                    float f;
                    float f66;
                    int n67;
                    float f67;
                    float f68;
                    int n68;
                    float f69;
                    int n69;
                    float f70;
                    int n70;
                    float f71;
                    if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f71 = _livEnt.m_21233_();
                    } else {
                        f71 = -1.0f;
                    }
                    float f72 = f71 / 20.0f + 10000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n70 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n70 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f72 + (float)(n70 * 100));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f70 = _livEnt.m_21233_();
                    } else {
                        f70 = -1.0f;
                    }
                    float f73 = f70 / 20.0f + 10000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n69 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n69 = 0;
                    }
                    entityiterator.m_6469_(damageSource18, f73 + (float)(n69 * 100));
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f69 = _livEnt.m_21233_();
                    } else {
                        f69 = -1.0f;
                    }
                    float f74 = f69 / 20.0f + 10000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n68 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n68 = 0;
                    }
                    entityiterator.m_6469_(damageSource19, f74 + (float)(n68 * 100));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f68 = _livEnt3.m_21233_();
                    } else {
                        f68 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f67 = _livEnt.m_21223_();
                    } else {
                        f67 = -1.0f;
                    }
                    float f75 = (f68 + f67) / 5.0f + 100000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n67 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n67 = 0;
                    }
                    entityiterator.m_6469_(damageSource20, f75 + (float)(n67 * 1000));
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f66 = _livEnt3.m_21233_();
                    } else {
                        f66 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f76 = (f66 + f) / 5.0f + 100000.0f;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n66 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n66 = 0;
                    }
                    entityiterator.m_6469_(damageSource21, f76 + (float)(n66 * 1000));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n63 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n63 = 0;
            }
            if (n63 >= 60) {
                int n71;
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntI14 = (EndermantitanEntity)entity;
                    n71 = (Integer)_datEntI14.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                } else {
                    n71 = 0;
                }
                if (n71 <= 90) {
                    for (int index4 = 0; index4 < 16; ++index4) {
                        Projectile _entityToSpawn;
                        ServerLevel projectileLevel;
                        float f;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity = _mobEnt4.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity75;
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity75 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity75 = null;
                            }
                            f = entity.m_20270_(livingEntity75);
                        } else {
                            f = -1.0f;
                        }
                        if (f > 1.0f) {
                            LivingEntity livingEntity76;
                            LivingEntity livingEntity77;
                            if (!(world instanceof ServerLevel)) continue;
                            projectileLevel = (ServerLevel)world;
                            _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    EnderrainEntity entityToSpawn = new EnderrainEntity((EntityType<? extends EnderrainEntity>)((EntityType)UltimateskeletonsModEntities.ENDERRAIN.get()), level);
                                    entityToSpawn.m_5602_(shooter);
                                    entityToSpawn.m_36781_(damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    return entityToSpawn;
                                }
                            }.getArrow((Level)projectileLevel, entity, 2000.0f, 1);
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity77 = _mobEnt.m_5448_();
                            } else {
                                livingEntity77 = null;
                            }
                            double d = livingEntity77.m_20185_() + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0);
                            double d25 = y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)100.0, (double)140.0);
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity76 = _mobEnt.m_5448_();
                            } else {
                                livingEntity76 = null;
                            }
                            _entityToSpawn.m_6034_(d, d25, livingEntity76.m_20189_() + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0));
                            _entityToSpawn.m_6686_((double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), -1.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), 4.0f, 32.0f);
                            projectileLevel.m_7967_((Entity)_entityToSpawn);
                            continue;
                        }
                        if (!(world instanceof ServerLevel)) continue;
                        projectileLevel = (ServerLevel)world;
                        _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                EnderrainEntity entityToSpawn = new EnderrainEntity((EntityType<? extends EnderrainEntity>)((EntityType)UltimateskeletonsModEntities.ENDERRAIN.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)projectileLevel, entity, 2000.0f, 1);
                        _entityToSpawn.m_6034_(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-32.0, (double)32.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)100.0, (double)140.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-32.0, (double)32.0));
                        _entityToSpawn.m_6686_((double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), -1.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), 4.0f, 32.0f);
                        projectileLevel.m_7967_((Entity)_entityToSpawn);
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n62 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n62 = 0;
            }
            if (n62 >= 100) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n4 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n4 = 0;
        }
        if (n4 == 6) {
            int n72;
            int n73;
            int n74;
            if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.sd");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n74 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n74 = 0;
            }
            if (n74 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt27 = (Mob)entity;
                    livingEntity = _mobEnt27.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity78;
                    if (entity instanceof Mob) {
                        Mob _mobEnt28 = (Mob)entity;
                        livingEntity78 = _mobEnt28.m_5448_();
                    } else {
                        livingEntity78 = null;
                    }
                    f = entity.m_20270_(livingEntity78);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity81 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity81 = null;
                    }
                    double d26 = livingEntity81.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity80 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity80 = null;
                    }
                    double d27 = d26 + (double)livingEntity80.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity79 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity79 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d27, livingEntity79.m_20189_()));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n73 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n73 = 0;
            }
            if (n73 == 36) {
                float f;
                LivingEntity livingEntity;
                float f77;
                LivingEntity livingEntity83;
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt29 = (Mob)entity;
                    livingEntity83 = _mobEnt29.m_5448_();
                } else {
                    livingEntity83 = null;
                }
                if (livingEntity83 != null) {
                    LivingEntity livingEntity84;
                    if (entity instanceof Mob) {
                        Mob _mobEnt30 = (Mob)entity;
                        livingEntity84 = _mobEnt30.m_5448_();
                    } else {
                        livingEntity84 = null;
                    }
                    f77 = entity.m_20270_(livingEntity84);
                } else {
                    f77 = -1.0f;
                }
                if (f77 > 1.0f) {
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity85;
                        LivingEntity livingEntity86;
                        LivingEntity livingEntity87;
                        int n75;
                        projectileLevel = (ServerLevel)world;
                        var v313 = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                LightningballEntity entityToSpawn = new LightningballEntity((EntityType<? extends LightningballEntity>)((EntityType)UltimateskeletonsModEntities.LIGHTNINGBALL.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        };
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI = (EndermantitanEntity)entity;
                            n75 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n75 = 0;
                        }
                        _entityToSpawn = v313.getArrow((Level)projectileLevel, entity, 2000 + n75 * 10, 1);
                        _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 20.0, y + 44.0, z + entity.m_20154_().f_82481_ * 20.0);
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity87 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity87 = null;
                        }
                        double d = livingEntity87.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity86 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity86 = null;
                        }
                        double d28 = livingEntity86.m_20186_() - 44.0 - entity.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity85 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity85 = null;
                        }
                        _entityToSpawn.m_6686_(d, d28, livingEntity85.m_20189_() - entity.m_20189_(), 1.0f, 4.0f);
                        projectileLevel.m_7967_((Entity)_entityToSpawn);
                    }
                } else if (world instanceof ServerLevel) {
                    int n76;
                    projectileLevel = (ServerLevel)world;
                    var v320 = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            LightningballEntity entityToSpawn = new LightningballEntity((EntityType<? extends LightningballEntity>)((EntityType)UltimateskeletonsModEntities.LIGHTNINGBALL.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    };
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI = (EndermantitanEntity)entity;
                        n76 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n76 = 0;
                    }
                    _entityToSpawn = v320.getArrow((Level)projectileLevel, entity, 2000 + n76 * 10, 1);
                    _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 20.0, y + 44.0, z + entity.m_20154_().f_82481_ * 20.0);
                    _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 1.0f, 4.0f);
                    projectileLevel.m_7967_((Entity)_entityToSpawn);
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt31 = (Mob)entity;
                    livingEntity = _mobEnt31.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity88;
                    if (entity instanceof Mob) {
                        Mob _mobEnt32 = (Mob)entity;
                        livingEntity88 = _mobEnt32.m_5448_();
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
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity92;
                        LivingEntity livingEntity93;
                        LivingEntity livingEntity94;
                        ServerLevel _level = (ServerLevel)world;
                        EntityType entityType = (EntityType)UltimateskeletonsModEntities.PURPLELIGHTNING.get();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity94 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity94 = null;
                        }
                        double d = livingEntity94.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity93 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity93 = null;
                        }
                        double d29 = livingEntity93.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity92 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity92 = null;
                        }
                        Entity entityToSpawn = entityType.m_262496_(_level, BlockPos.m_274561_((double)d, (double)d29, (double)livingEntity92.m_20189_()), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity91 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity91 = null;
                    }
                    double d = livingEntity91.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity90 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity90 = null;
                    }
                    double d30 = livingEntity90.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity89 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity89 = null;
                    }
                    Vec3 _center = new Vec3(d, d30, livingEntity89.m_20189_());
                    List<Entity> _entfound6 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound6) {
                        int n77;
                        float f78;
                        float f79;
                        int n78;
                        float f80;
                        float f81;
                        LivingEntity _livEnt7;
                        int n79;
                        float f82;
                        int n80;
                        float f83;
                        int n81;
                        EndermantitanEntity _datEntI15;
                        float f84;
                        if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f84 = _livEnt2.m_21233_();
                        } else {
                            f84 = -1.0f;
                        }
                        float f85 = f84 / 20.0f + 8000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI15 = (EndermantitanEntity)entity;
                            n81 = (Integer)_datEntI15.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n81 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f85 + (float)(n81 * 100));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f83 = _livEnt2.m_21233_();
                        } else {
                            f83 = -1.0f;
                        }
                        float f86 = f83 / 20.0f + 8000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI15 = (EndermantitanEntity)entity;
                            n80 = (Integer)_datEntI15.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n80 = 0;
                        }
                        entityiterator.m_6469_(damageSource22, f86 + (float)(n80 * 100));
                        DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f82 = _livEnt2.m_21233_();
                        } else {
                            f82 = -1.0f;
                        }
                        float f87 = f82 / 20.0f + 8000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI15 = (EndermantitanEntity)entity;
                            n79 = (Integer)_datEntI15.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n79 = 0;
                        }
                        entityiterator.m_6469_(damageSource23, f87 + (float)(n79 * 100));
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f81 = _livEnt7.m_21233_();
                        } else {
                            f81 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f80 = _livEnt2.m_21223_();
                        } else {
                            f80 = -1.0f;
                        }
                        float f88 = (f81 + f80) / 5.0f + 80000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI15 = (EndermantitanEntity)entity;
                            n78 = (Integer)_datEntI15.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n78 = 0;
                        }
                        entityiterator.m_6469_(damageSource24, f88 + (float)(n78 * 1000));
                        DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f79 = _livEnt7.m_21233_();
                        } else {
                            f79 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f78 = _livEnt2.m_21223_();
                        } else {
                            f78 = -1.0f;
                        }
                        float f89 = (f79 + f78) / 5.0f + 80000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI15 = (EndermantitanEntity)entity;
                            n77 = (Integer)_datEntI15.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n77 = 0;
                        }
                        entityiterator.m_6469_(damageSource25, f89 + (float)(n77 * 1000));
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n72 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n72 = 0;
            }
            if (n72 >= 60) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n3 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n3 = 0;
        }
        if (n3 == 7) {
            int n82;
            int n83;
            int n84;
            int n85;
            int n86;
            if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.shouter");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n86 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n86 = 0;
            }
            if (n86 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt33 = (Mob)entity;
                    livingEntity = _mobEnt33.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity95;
                    if (entity instanceof Mob) {
                        Mob _mobEnt34 = (Mob)entity;
                        livingEntity95 = _mobEnt34.m_5448_();
                    } else {
                        livingEntity95 = null;
                    }
                    f = entity.m_20270_(livingEntity95);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity96;
                    LivingEntity livingEntity97;
                    LivingEntity livingEntity98;
                    LivingEntity livingEntity99;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity99 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity99 = null;
                    }
                    double d = livingEntity99.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity98 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity98 = null;
                    }
                    double d31 = livingEntity98.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity97 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity97 = null;
                    }
                    double d32 = d31 + (double)livingEntity97.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity96 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity96 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d32, livingEntity96.m_20189_()));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n85 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n85 = 0;
            }
            if (n85 == 48) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanroar")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanroar")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n84 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n84 = 0;
            }
            if (n84 >= 40) {
                int n87;
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntI16 = (EndermantitanEntity)entity;
                    n87 = (Integer)_datEntI16.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                } else {
                    n87 = 0;
                }
                if (n87 <= 58) {
                    int n88;
                    int n89;
                    SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEEXPLOSION.get();
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof EndermantitanEntity) {
                        EndermantitanEntity _datEntI17 = (EndermantitanEntity)entity;
                        n89 = (Integer)_datEntI17.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n89 = 0;
                    }
                    double d33 = x + d * (double)(n89 - 36) * 8.0;
                    double d34 = entity.m_20154_().f_82481_;
                    if (entity instanceof EndermantitanEntity) {
                        EndermantitanEntity _datEntI18 = (EndermantitanEntity)entity;
                        n88 = (Integer)_datEntI18.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n88 = 0;
                    }
                    world.m_7106_((ParticleOptions)simpleParticleType, d33, y + 50.0, z + d34 * (double)(n88 - 36) * 8.0, 0.0, 0.0, 0.0);
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n83 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n83 = 0;
            }
            if (n83 >= 48) {
                int n90;
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntI19 = (EndermantitanEntity)entity;
                    n90 = (Integer)_datEntI19.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                } else {
                    n90 = 0;
                }
                if (n90 <= 68) {
                    Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 32.0, y, z + entity.m_20154_().f_82481_ * 32.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        int n91;
                        float f;
                        float f90;
                        int n92;
                        float f91;
                        float f92;
                        int n93;
                        float f93;
                        int n94;
                        float f94;
                        int n95;
                        float f95;
                        if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f95 = _livEnt3.m_21233_();
                        } else {
                            f95 = -1.0f;
                        }
                        float f96 = f95 / 20.0f + 30000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n95 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n95 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f96 + (float)(n95 * 100));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f94 = _livEnt3.m_21233_();
                        } else {
                            f94 = -1.0f;
                        }
                        float f97 = f94 / 20.0f + 30000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n94 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n94 = 0;
                        }
                        entityiterator.m_6469_(damageSource26, f97 + (float)(n94 * 100));
                        DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f93 = _livEnt3.m_21233_();
                        } else {
                            f93 = -1.0f;
                        }
                        float f98 = f93 / 20.0f + 30000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n93 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n93 = 0;
                        }
                        entityiterator.m_6469_(damageSource27, f98 + (float)(n93 * 100));
                        entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                        if (!(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                        }
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f92 = _livEnt2.m_21233_();
                        } else {
                            f92 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f91 = _livEnt3.m_21223_();
                        } else {
                            f91 = -1.0f;
                        }
                        float f99 = (f92 + f91) / 5.0f + 300000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n92 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n92 = 0;
                        }
                        entityiterator.m_6469_(damageSource28, f99 + (float)(n92 * 1000));
                        DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f90 = _livEnt2.m_21233_();
                        } else {
                            f90 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f = _livEnt3.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        float f100 = (f90 + f) / 5.0f + 300000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n91 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n91 = 0;
                        }
                        entityiterator.m_6469_(damageSource29, f100 + (float)(n91 * 1000));
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n82 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n82 = 0;
            }
            if (n82 >= 78) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n2 = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n2 = 0;
        }
        if (n2 == 8) {
            int n96;
            int n97;
            int n98;
            int n99;
            int n100;
            if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.laser");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n100 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n100 = 0;
            }
            if (n100 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt35 = (Mob)entity;
                    livingEntity = _mobEnt35.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity100;
                    if (entity instanceof Mob) {
                        Mob _mobEnt36 = (Mob)entity;
                        livingEntity100 = _mobEnt36.m_5448_();
                    } else {
                        livingEntity100 = null;
                    }
                    f = entity.m_20270_(livingEntity100);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity101;
                    LivingEntity livingEntity102;
                    LivingEntity livingEntity103;
                    LivingEntity livingEntity104;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity104 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity104 = null;
                    }
                    double d = livingEntity104.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity103 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity103 = null;
                    }
                    double d35 = livingEntity103.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity102 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity102 = null;
                    }
                    double d36 = d35 + (double)livingEntity102.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity101 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity101 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d36, livingEntity101.m_20189_()));
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n99 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n99 = 0;
            }
            if (n99 == 25) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:laser")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:laser")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n98 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n98 = 0;
            }
            if (n98 >= 28) {
                int n101;
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntI20 = (EndermantitanEntity)entity;
                    n101 = (Integer)_datEntI20.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                } else {
                    n101 = 0;
                }
                if (n101 <= 40) {
                    int n102;
                    int n103;
                    SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get();
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof EndermantitanEntity) {
                        EndermantitanEntity _datEntI21 = (EndermantitanEntity)entity;
                        n103 = (Integer)_datEntI21.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n103 = 0;
                    }
                    double d37 = x + d * Math.pow(n103 - 28, 2.0);
                    double d38 = entity.m_20154_().f_82481_;
                    if (entity instanceof EndermantitanEntity) {
                        EndermantitanEntity _datEntI22 = (EndermantitanEntity)entity;
                        n102 = (Integer)_datEntI22.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n102 = 0;
                    }
                    world.m_7106_((ParticleOptions)simpleParticleType, d37, y + 0.2, z + d38 * Math.pow(n102 - 28, 2.0), 0.0, 0.0, 0.0);
                    for (int index5 = 0; index5 < 64; ++index5) {
                        int n104;
                        int n105;
                        int n106;
                        int n107;
                        SimpleParticleType simpleParticleType2 = (SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_2.get();
                        double d39 = entity.m_20154_().f_82479_;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI3 = (EndermantitanEntity)entity;
                            n107 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                        } else {
                            n107 = 0;
                        }
                        double d40 = x + d39 * Math.pow(n107 - 28, 2.0);
                        double d41 = entity.m_20154_().f_82481_;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI3 = (EndermantitanEntity)entity;
                            n106 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                        } else {
                            n106 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType2, d40, y, z + d41 * Math.pow(n106 - 28, 2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                        SimpleParticleType simpleParticleType3 = (SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_3.get();
                        double d42 = entity.m_20154_().f_82479_;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI3 = (EndermantitanEntity)entity;
                            n105 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                        } else {
                            n105 = 0;
                        }
                        double d43 = x + d42 * Math.pow(n105 - 28, 2.0);
                        double d44 = entity.m_20154_().f_82481_;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI3 = (EndermantitanEntity)entity;
                            n104 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                        } else {
                            n104 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType3, d43, y, z + d44 * Math.pow(n104 - 28, 2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n97 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n97 = 0;
            }
            if (n97 >= 28) {
                int n108;
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntI23 = (EndermantitanEntity)entity;
                    n108 = (Integer)_datEntI23.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                } else {
                    n108 = 0;
                }
                if (n108 <= 48) {
                    int n109;
                    int n110;
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI3 = (EndermantitanEntity)entity;
                        n110 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n110 = 0;
                    }
                    double d45 = x + d * Math.pow(n110 - 28, 2.0);
                    double d46 = entity.m_20154_().f_82481_;
                    if (entity instanceof EndermantitanEntity) {
                        _datEntI3 = (EndermantitanEntity)entity;
                        n109 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                    } else {
                        n109 = 0;
                    }
                    Vec3 _center = new Vec3(d45, y, z + d46 * Math.pow(n109 - 28, 2.0));
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        int n111;
                        float f;
                        float f101;
                        int n112;
                        float f102;
                        float f103;
                        int n113;
                        float f104;
                        int n114;
                        float f105;
                        int n115;
                        float f106;
                        if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f106 = _livEnt3.m_21233_();
                        } else {
                            f106 = -1.0f;
                        }
                        float f107 = f106 / 20.0f + 15000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n115 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n115 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f107 + (float)(n115 * 100));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f105 = _livEnt3.m_21233_();
                        } else {
                            f105 = -1.0f;
                        }
                        float f108 = f105 / 20.0f + 15000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n114 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n114 = 0;
                        }
                        entityiterator.m_6469_(damageSource30, f108 + (float)(n114 * 100));
                        DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f104 = _livEnt3.m_21233_();
                        } else {
                            f104 = -1.0f;
                        }
                        float f109 = f104 / 20.0f + 15000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n113 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n113 = 0;
                        }
                        entityiterator.m_6469_(damageSource31, f109 + (float)(n113 * 100));
                        if (!(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                        }
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f103 = _livEnt2.m_21233_();
                        } else {
                            f103 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f102 = _livEnt3.m_21223_();
                        } else {
                            f102 = -1.0f;
                        }
                        float f110 = (f103 + f102) / 5.0f + 150000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n112 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n112 = 0;
                        }
                        entityiterator.m_6469_(damageSource32, f110 + (float)(n112 * 1000));
                        DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f101 = _livEnt2.m_21233_();
                        } else {
                            f101 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f = _livEnt3.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        float f111 = (f101 + f) / 5.0f + 150000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n111 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n111 = 0;
                        }
                        entityiterator.m_6469_(damageSource33, f111 + (float)(n111 * 1000));
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n96 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n96 = 0;
            }
            if (n96 >= 64) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EndermantitanEntity) {
            _datEntI4 = (EndermantitanEntity)entity;
            n = (Integer)_datEntI4.m_20088_().m_135370_(EndermantitanEntity.DATA_animatonID);
        } else {
            n = 0;
        }
        if (n == 9) {
            int n116;
            int n117;
            int n118;
            int n119;
            if (entity instanceof EndermantitanEntity) {
                ((EndermantitanEntity)entity).setAnimation("animation.endermantitan.yt");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n119 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n119 = 0;
            }
            if (n119 == 44 && world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanscream")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanscream")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n118 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n118 = 0;
            }
            if (n118 >= 44 && world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "weather clear");
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n117 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n117 = 0;
            }
            if (n117 >= 44) {
                int n120;
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntI24 = (EndermantitanEntity)entity;
                    n120 = (Integer)_datEntI24.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
                } else {
                    n120 = 0;
                }
                if (n120 <= 144) {
                    Vec3 _center = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(500.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        int n121;
                        float f;
                        float f112;
                        int n122;
                        float f113;
                        float f114;
                        int n123;
                        float f115;
                        int n124;
                        float f116;
                        int n125;
                        float f117;
                        if (entityiterator instanceof EndermantitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f117 = _livEnt3.m_21233_();
                        } else {
                            f117 = -1.0f;
                        }
                        float f118 = f117 / 20.0f + 100000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n125 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n125 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f118 + (float)(n125 * 100));
                        if (entityiterator instanceof Titangodentity) continue;
                        DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f116 = _livEnt3.m_21233_();
                        } else {
                            f116 = -1.0f;
                        }
                        float f119 = f116 / 20.0f + 100000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n124 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n124 = 0;
                        }
                        entityiterator.m_6469_(damageSource34, f119 + (float)(n124 * 100));
                        DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f115 = _livEnt3.m_21233_();
                        } else {
                            f115 = -1.0f;
                        }
                        float f120 = f115 / 20.0f + 100000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n123 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n123 = 0;
                        }
                        entityiterator.m_6469_(damageSource35, f120 + (float)(n123 * 100));
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f114 = _livEnt2.m_21233_();
                        } else {
                            f114 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f113 = _livEnt3.m_21223_();
                        } else {
                            f113 = -1.0f;
                        }
                        float f121 = (f114 + f113) / 5.0f + 1000000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n122 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n122 = 0;
                        }
                        entityiterator.m_6469_(damageSource36, f121 + (float)(n122 * 1000));
                        DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f112 = _livEnt2.m_21233_();
                        } else {
                            f112 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f = _livEnt3.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        float f122 = (f112 + f) / 5.0f + 1000000.0f;
                        if (entity instanceof EndermantitanEntity) {
                            _datEntI2 = (EndermantitanEntity)entity;
                            n121 = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n121 = 0;
                        }
                        entityiterator.m_6469_(damageSource37, f122 + (float)(n121 * 1000));
                    }
                }
            }
            if (entity instanceof EndermantitanEntity) {
                _datEntI5 = (EndermantitanEntity)entity;
                n116 = (Integer)_datEntI5.m_20088_().m_135370_(EndermantitanEntity.DATA_animationTick);
            } else {
                n116 = 0;
            }
            if (n116 >= 150) {
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animatonID, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    EndermantitanEntity _datEntSetI = (EndermantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EndermantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EndermantitanEntity) {
                    ((EndermantitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

