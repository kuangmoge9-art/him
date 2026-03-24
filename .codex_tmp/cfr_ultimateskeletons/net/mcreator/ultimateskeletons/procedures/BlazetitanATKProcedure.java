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
import net.mcreator.ultimateskeletons.entity.BlazetitanEntity;
import net.mcreator.ultimateskeletons.entity.GiantblazeEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
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

public class BlazetitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        LivingEntity _livEnt;
        LivingEntity _livEnt2;
        int n2;
        BlazetitanEntity _datEntSetI;
        float f;
        Mob _mobEnt;
        Mob _mobEnt2;
        Object _mobEnt3;
        BlazetitanEntity _datEntI;
        BlazetitanEntity _datEntI2;
        BlazetitanEntity _datEntSetI2;
        float f2;
        LivingEntity _livEnt3;
        LivingEntity entityToSpawn;
        Mob _entity;
        BlazetitanEntity _datEntI3;
        BlazetitanEntity _datEntI4;
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
        if (entity instanceof BlazetitanEntity) {
            int n3;
            BlazetitanEntity _datEntSetI3 = (BlazetitanEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n3 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_spawnTick);
            } else {
                n3 = 0;
            }
            synchedEntityData.m_135381_(BlazetitanEntity.DATA_spawnTick, (Object)(n3 + 1));
        }
        if (entity.m_5446_().getString().equals("growing")) {
            int n4;
            if (entity instanceof BlazetitanEntity) {
                _datEntI3 = (BlazetitanEntity)entity;
                n4 = (Integer)_datEntI3.m_20088_().m_135370_(BlazetitanEntity.DATA_spawnTick);
            } else {
                n4 = 0;
            }
            if (n4 < 720) {
                int n5;
                int n6;
                ServerLevel _level;
                int n7;
                entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                entity.f_19802_ = 20;
                ((BlazetitanEntity)entity).setHEALTS(40000.0);
                if (entity instanceof LivingEntity) {
                    ((LivingEntity)entity).f_20919_ = 0;
                }
                if (entity instanceof Mob) {
                    _entity = (Mob)entity;
                    _entity.m_6710_(null);
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI4 = (BlazetitanEntity)entity;
                    n7 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_spawnTick);
                } else {
                    n7 = 0;
                }
                if (n7 == 450 && world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI4 = (BlazetitanEntity)entity;
                    n6 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_spawnTick);
                } else {
                    n6 = 0;
                }
                if (n6 <= 10 && entity instanceof BlazetitanEntity) {
                    ((BlazetitanEntity)entity).setAnimation("animation.blazetitan.spawn2");
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI4 = (BlazetitanEntity)entity;
                    n5 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_spawnTick);
                } else {
                    n5 = 0;
                }
                if (n5 == 719) {
                    if (world instanceof Level) {
                        _level = (Level)world;
                        if (!_level.m_5776_()) {
                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                        } else {
                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                        }
                    }
                    if (!world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Blazetitan has been created!!!"), false);
                    }
                }
                if (entity.m_20186_() < -63.0) {
                    entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                } else {
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                }
            }
        }
        if (entity instanceof LivingEntity) {
            _livEnt3 = (LivingEntity)entity;
            f2 = _livEnt3.m_21223_();
        } else {
            f2 = -1.0f;
        }
        if (f2 > 0.0f && entity instanceof BlazetitanEntity) {
            _datEntSetI2 = (BlazetitanEntity)entity;
            _datEntSetI2.m_20088_().m_135381_(BlazetitanEntity.DATA_deathTick, (Object)0);
        }
        if (!world.m_5776_()) {
            LivingEntity livingEntity;
            int n8;
            if (entity instanceof BlazetitanEntity) {
                _datEntI3 = (BlazetitanEntity)entity;
                n8 = (Integer)_datEntI3.m_20088_().m_135370_(BlazetitanEntity.DATA_animationID);
            } else {
                n8 = 0;
            }
            if (n8 != 0 && entity instanceof BlazetitanEntity) {
                int n9;
                _datEntSetI2 = (BlazetitanEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                if (entity instanceof BlazetitanEntity) {
                    _datEntI2 = (BlazetitanEntity)entity;
                    n9 = (Integer)_datEntI2.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
                } else {
                    n9 = 0;
                }
                synchedEntityData.m_135381_(BlazetitanEntity.DATA_animationTick, (Object)(n9 + 1));
            }
            if (entity instanceof Mob) {
                Mob _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                float f3;
                if (entity instanceof Mob) {
                    Mob _mobEnt5 = (Mob)entity;
                    v11 = _mobEnt5.m_5448_();
                } else {
                    v11 = entityToSpawn = null;
                }
                if (entityToSpawn instanceof LivingEntity) {
                    LivingEntity _livEnt4 = entityToSpawn;
                    f3 = _livEnt4.m_21223_();
                } else {
                    f3 = -1.0f;
                }
                if (f3 > 0.0f) {
                    int n10;
                    if (entity instanceof BlazetitanEntity) {
                        _datEntI = (BlazetitanEntity)entity;
                        n10 = (Integer)_datEntI.m_20088_().m_135370_(BlazetitanEntity.DATA_animationID);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 0) {
                        float f4;
                        LivingEntity livingEntity2;
                        float f5;
                        LivingEntity livingEntity3;
                        Mob _mobEnt6;
                        Mob _mobEnt7;
                        float f6;
                        LivingEntity livingEntity4;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity4 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity4 = null;
                        }
                        if (livingEntity4 != null) {
                            LivingEntity livingEntity5;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity5 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity5 = null;
                            }
                            f6 = entity.m_20270_(livingEntity5);
                        } else {
                            f6 = -1.0f;
                        }
                        if (f6 > 1.0f) {
                            LivingEntity livingEntity6;
                            LivingEntity livingEntity7;
                            LivingEntity livingEntity8;
                            LivingEntity livingEntity9;
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity9 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity9 = null;
                            }
                            double d = livingEntity9.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity8 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity8 = null;
                            }
                            double d2 = livingEntity8.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity7 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity7 = null;
                            }
                            double d3 = d2 + (double)livingEntity7.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity6 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity6 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity6.m_20189_()));
                        }
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity3 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity3 = null;
                        }
                        if (livingEntity3 != null) {
                            LivingEntity livingEntity10;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity10 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity10 = null;
                            }
                            f5 = entity.m_20270_(livingEntity10);
                        } else {
                            f5 = -1.0f;
                        }
                        if (f5 > 60.0f) {
                            float f7;
                            LivingEntity livingEntity11;
                            LivingEntity livingEntity12;
                            float f8;
                            LivingEntity livingEntity13;
                            LivingEntity livingEntity14;
                            float f9;
                            LivingEntity livingEntity15;
                            LivingEntity livingEntity16;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity16 = _mobEnt.m_5448_();
                            } else {
                                livingEntity16 = null;
                            }
                            double d = livingEntity16.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity15 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity15 = null;
                            }
                            if (livingEntity15 != null) {
                                LivingEntity livingEntity17;
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity17 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity17 = null;
                                }
                                f9 = entity.m_20270_(livingEntity17);
                            } else {
                                f9 = -1.0f;
                            }
                            double d4 = d / (double)f9 * 1.0;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity14 = _mobEnt.m_5448_();
                            } else {
                                livingEntity14 = null;
                            }
                            double d5 = livingEntity14.m_20186_() - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity13 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity13 = null;
                            }
                            if (livingEntity13 != null) {
                                LivingEntity livingEntity18;
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity18 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity18 = null;
                                }
                                f8 = entity.m_20270_(livingEntity18);
                            } else {
                                f8 = -1.0f;
                            }
                            double d6 = d5 / (double)f8 * 1.0;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity12 = _mobEnt.m_5448_();
                            } else {
                                livingEntity12 = null;
                            }
                            double d7 = livingEntity12.m_20189_() - entity.m_20189_();
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity11 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity11 = null;
                            }
                            if (livingEntity11 != null) {
                                LivingEntity livingEntity19;
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity19 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity19 = null;
                                }
                                f7 = entity.m_20270_(livingEntity19);
                            } else {
                                f7 = -1.0f;
                            }
                            entity.m_20256_(new Vec3(d4, d6, d7 / (double)f7 * 1.0));
                        } else {
                            LivingEntity livingEntity20;
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity20 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity20 = null;
                            }
                            if (livingEntity20.m_20206_() > 8.0f) {
                                float f10;
                                LivingEntity livingEntity21;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity21 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity21 = null;
                                }
                                if (livingEntity21 != null) {
                                    LivingEntity livingEntity22;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity22 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity22 = null;
                                    }
                                    f10 = entity.m_20270_(livingEntity22);
                                } else {
                                    f10 = -1.0f;
                                }
                                if (f10 > 36.0f) {
                                    float f11;
                                    LivingEntity livingEntity23;
                                    LivingEntity livingEntity24;
                                    float f12;
                                    LivingEntity livingEntity25;
                                    LivingEntity livingEntity26;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity26 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity26 = null;
                                    }
                                    double d = livingEntity26.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity25 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity25 = null;
                                    }
                                    if (livingEntity25 != null) {
                                        LivingEntity livingEntity27;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity27 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity27 = null;
                                        }
                                        f12 = entity.m_20270_(livingEntity27);
                                    } else {
                                        f12 = -1.0f;
                                    }
                                    double d8 = d / (double)f12;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity24 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity24 = null;
                                    }
                                    double d9 = livingEntity24.m_20189_() - entity.m_20189_();
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity23 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity23 = null;
                                    }
                                    if (livingEntity23 != null) {
                                        LivingEntity livingEntity28;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity28 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity28 = null;
                                        }
                                        f11 = entity.m_20270_(livingEntity28);
                                    } else {
                                        f11 = -1.0f;
                                    }
                                    entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f11));
                                }
                            } else {
                                float f13;
                                LivingEntity livingEntity29;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity29 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity29 = null;
                                }
                                if (livingEntity29 != null) {
                                    LivingEntity livingEntity30;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity30 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity30 = null;
                                    }
                                    f13 = entity.m_20270_(livingEntity30);
                                } else {
                                    f13 = -1.0f;
                                }
                                if (f13 > 8.0f) {
                                    float f14;
                                    LivingEntity livingEntity31;
                                    LivingEntity livingEntity32;
                                    float f15;
                                    LivingEntity livingEntity33;
                                    LivingEntity livingEntity34;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity34 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity34 = null;
                                    }
                                    double d = livingEntity34.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity33 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity33 = null;
                                    }
                                    if (livingEntity33 != null) {
                                        LivingEntity livingEntity35;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity35 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity35 = null;
                                        }
                                        f15 = entity.m_20270_(livingEntity35);
                                    } else {
                                        f15 = -1.0f;
                                    }
                                    double d10 = d / (double)f15;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity32 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity32 = null;
                                    }
                                    double d11 = livingEntity32.m_20189_() - entity.m_20189_();
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity31 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity31 = null;
                                    }
                                    if (livingEntity31 != null) {
                                        LivingEntity livingEntity36;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity36 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity36 = null;
                                        }
                                        f14 = entity.m_20270_(livingEntity36);
                                    } else {
                                        f14 = -1.0f;
                                    }
                                    entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f14));
                                }
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity2 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity2 = null;
                        }
                        if (livingEntity2 != null) {
                            LivingEntity livingEntity37;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity37 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity37 = null;
                            }
                            f4 = entity.m_20270_(livingEntity37);
                        } else {
                            f4 = -1.0f;
                        }
                        if (f4 < 2048.0f) {
                            float f16;
                            LivingEntity livingEntity38;
                            BlazetitanEntity _datEntSetI4;
                            float f17;
                            LivingEntity livingEntity39;
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity39 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity39 = null;
                            }
                            if (livingEntity39 != null) {
                                LivingEntity livingEntity40;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity40 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity40 = null;
                                }
                                f17 = entity.m_20270_(livingEntity40);
                            } else {
                                f17 = -1.0f;
                            }
                            if (f17 >= 50.0f) {
                                LivingEntity livingEntity41;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity41 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity41 = null;
                                }
                                if (livingEntity41.m_20206_() > 6.0f) {
                                    if (entity instanceof BlazetitanEntity) {
                                        _datEntSetI4 = (BlazetitanEntity)entity;
                                        _datEntSetI4.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)2);
                                    }
                                } else if (entity instanceof BlazetitanEntity) {
                                    _datEntSetI4 = (BlazetitanEntity)entity;
                                    _datEntSetI4.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)2);
                                }
                            }
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity38 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity38 = null;
                            }
                            if (livingEntity38 != null) {
                                LivingEntity livingEntity42;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity42 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity42 = null;
                                }
                                f16 = entity.m_20270_(livingEntity42);
                            } else {
                                f16 = -1.0f;
                            }
                            if (f16 < 50.0f) {
                                if (((Boolean)SkeletonsConfiguration.ALLOW.get()).booleanValue()) {
                                    LivingEntity livingEntity43;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity43 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity43 = null;
                                    }
                                    if (livingEntity43.m_20206_() > 6.0f) {
                                        if (entity instanceof BlazetitanEntity) {
                                            _datEntSetI4 = (BlazetitanEntity)entity;
                                            _datEntSetI4.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                        }
                                    } else if (entity instanceof BlazetitanEntity) {
                                        _datEntSetI4 = (BlazetitanEntity)entity;
                                        _datEntSetI4.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                    }
                                } else {
                                    LivingEntity livingEntity44;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity44 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity44 = null;
                                    }
                                    if (livingEntity44.m_20206_() > 6.0f) {
                                        if (entity instanceof BlazetitanEntity) {
                                            _datEntSetI4 = (BlazetitanEntity)entity;
                                            _datEntSetI4.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)1);
                                        }
                                    } else if (entity instanceof BlazetitanEntity) {
                                        _datEntSetI4 = (BlazetitanEntity)entity;
                                        _datEntSetI4.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)1);
                                    }
                                }
                            }
                        }
                    }
                } else if (entity.m_20186_() < -63.0) {
                    entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                }
            } else if (entity.m_20186_() < -63.0) {
                entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
            }
        }
        if (entity instanceof LivingEntity) {
            _livEnt3 = (LivingEntity)entity;
            f = _livEnt3.m_21223_();
        } else {
            f = -1.0f;
        }
        if (f <= 0.0f) {
            int n11;
            if (entity instanceof Mob) {
                _entity = (Mob)entity;
                _entity.m_6710_(null);
            }
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n11 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationID);
            } else {
                n11 = 0;
            }
            if (n11 == 0) {
                int n12;
                int n13;
                int n14;
                int n15;
                int n16;
                if (entity instanceof BlazetitanEntity) {
                    int n17;
                    _datEntSetI = (BlazetitanEntity)entity;
                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                    if (entity instanceof BlazetitanEntity) {
                        _datEntI = (BlazetitanEntity)entity;
                        n17 = (Integer)_datEntI.m_20088_().m_135370_(BlazetitanEntity.DATA_deathTick);
                    } else {
                        n17 = 0;
                    }
                    synchedEntityData.m_135381_(BlazetitanEntity.DATA_deathTick, (Object)(n17 + 1));
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI2 = (BlazetitanEntity)entity;
                    n16 = (Integer)_datEntI2.m_20088_().m_135370_(BlazetitanEntity.DATA_deathTick);
                } else {
                    n16 = 0;
                }
                if (n16 == 1 && world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:blazetitandeath")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:blazetitandeath")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                    }
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI2 = (BlazetitanEntity)entity;
                    n15 = (Integer)_datEntI2.m_20088_().m_135370_(BlazetitanEntity.DATA_deathTick);
                } else {
                    n15 = 0;
                }
                if (n15 < 3) {
                    for (int index0 = 0; index0 < 12; ++index0) {
                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                    }
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI2 = (BlazetitanEntity)entity;
                    n14 = (Integer)_datEntI2.m_20088_().m_135370_(BlazetitanEntity.DATA_deathTick);
                } else {
                    n14 = 0;
                }
                if (n14 < 10 && entity instanceof BlazetitanEntity) {
                    ((BlazetitanEntity)entity).setAnimation("animation.blazetitan.death");
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI2 = (BlazetitanEntity)entity;
                    n13 = (Integer)_datEntI2.m_20088_().m_135370_(BlazetitanEntity.DATA_deathTick);
                } else {
                    n13 = 0;
                }
                if (n13 == 300) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"blazetitan\"'}");
                    }
                    for (int index1 = 0; index1 < 320; ++index1) {
                        world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                    }
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntI2 = (BlazetitanEntity)entity;
                    n12 = (Integer)_datEntI2.m_20088_().m_135370_(BlazetitanEntity.DATA_deathTick);
                } else {
                    n12 = 0;
                }
                if (n12 >= 300 && !entity.m_9236_().m_5776_()) {
                    entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                }
            }
        }
        if (entity instanceof BlazetitanEntity) {
            _datEntI3 = (BlazetitanEntity)entity;
            n2 = (Integer)_datEntI3.m_20088_().m_135370_(BlazetitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 2) {
            int n18;
            int n19;
            int n20;
            int n21;
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n21 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
            } else {
                n21 = 0;
            }
            if (n21 == 40) {
                entity.m_20254_(3);
            }
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n20 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
            } else {
                n20 = 0;
            }
            if (n20 >= 55) {
                int n22;
                if (entity instanceof BlazetitanEntity) {
                    _datEntI2 = (BlazetitanEntity)entity;
                    n22 = (Integer)_datEntI2.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
                } else {
                    n22 = 0;
                }
                if (n22 <= 60) {
                    for (int index2 = 0; index2 < 6; ++index2) {
                        Projectile _entityToSpawn;
                        ServerLevel projectileLevel;
                        float f18;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity = _mobEnt3.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity45;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity45 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity45 = null;
                            }
                            f18 = entity.m_20270_(livingEntity45);
                        } else {
                            f18 = -1.0f;
                        }
                        if (f18 > 1.0f) {
                            LivingEntity livingEntity46;
                            LivingEntity livingEntity47;
                            LivingEntity livingEntity48;
                            if (!(world instanceof ServerLevel)) continue;
                            projectileLevel = (ServerLevel)world;
                            _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    GiantblazeEntity entityToSpawn = new GiantblazeEntity((EntityType<? extends GiantblazeEntity>)((EntityType)UltimateskeletonsModEntities.GIANTBLAZE.get()), level);
                                    entityToSpawn.m_5602_(shooter);
                                    entityToSpawn.m_36781_(damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    entityToSpawn.m_20254_(100);
                                    return entityToSpawn;
                                }
                            }.getArrow((Level)projectileLevel, entity, 600.0f, 1);
                            _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 8.0, y + 24.0, z + entity.m_20154_().f_82481_ * 8.0);
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity48 = _mobEnt.m_5448_();
                            } else {
                                livingEntity48 = null;
                            }
                            double d = livingEntity48.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity47 = _mobEnt.m_5448_();
                            } else {
                                livingEntity47 = null;
                            }
                            double d12 = livingEntity47.m_20186_() - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity46 = _mobEnt.m_5448_();
                            } else {
                                livingEntity46 = null;
                            }
                            _entityToSpawn.m_6686_(d, d12, livingEntity46.m_20189_() - entity.m_20189_(), 6.0f, 16.0f);
                            projectileLevel.m_7967_((Entity)_entityToSpawn);
                            continue;
                        }
                        if (!(world instanceof ServerLevel)) continue;
                        projectileLevel = (ServerLevel)world;
                        _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                GiantblazeEntity entityToSpawn = new GiantblazeEntity((EntityType<? extends GiantblazeEntity>)((EntityType)UltimateskeletonsModEntities.GIANTBLAZE.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_20254_(100);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)projectileLevel, entity, 600.0f, 1);
                        _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 8.0, y + 24.0, z + entity.m_20154_().f_82481_ * 8.0);
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 6.0f, 16.0f);
                        projectileLevel.m_7967_((Entity)_entityToSpawn);
                    }
                }
            }
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n19 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
            } else {
                n19 = 0;
            }
            if (n19 == 40) {
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f19;
                    float f20;
                    float f21;
                    float f22;
                    float f23;
                    float f24;
                    float f25;
                    if (entityiterator instanceof BlazetitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f25 = _livEnt2.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f25 / 20.0f + 600.0f);
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
                    entityiterator.m_6469_(damageSource2, f24 / 20.0f + 6000.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f23 = _livEnt2.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource3, f23 / 20.0f + 6000.0f);
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f22 = _livEnt.m_21233_();
                    } else {
                        f22 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f21 = _livEnt2.m_21223_();
                    } else {
                        f21 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource4, (f22 + f21) / 5.0f + 60000.0f);
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f20 = _livEnt.m_21233_();
                    } else {
                        f20 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f19 = _livEnt2.m_21223_();
                    } else {
                        f19 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource5, (f20 + f19) / 5.0f + 60000.0f);
                }
            }
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n18 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
            } else {
                n18 = 0;
            }
            if (n18 >= 100) {
                if (entity instanceof BlazetitanEntity) {
                    _datEntSetI = (BlazetitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(BlazetitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof BlazetitanEntity) {
                    _datEntSetI = (BlazetitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof BlazetitanEntity) {
                    ((BlazetitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof BlazetitanEntity) {
            _datEntI3 = (BlazetitanEntity)entity;
            n = (Integer)_datEntI3.m_20088_().m_135370_(BlazetitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 1) {
            int n23;
            int n24;
            int n25;
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n25 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
            } else {
                n25 = 0;
            }
            if (n25 == 10) {
                entity.m_20254_(3);
                for (int index3 = 0; index3 < 24; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    LightningBolt entityToSpawn2 = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                    entityToSpawn2.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)))));
                    entityToSpawn2.m_20874_(true);
                    _level.m_7967_((Entity)entityToSpawn2);
                }
            }
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n24 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
            } else {
                n24 = 0;
            }
            if (n24 == 10) {
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f26;
                    float f27;
                    float f28;
                    float f29;
                    float f30;
                    float f31;
                    float f32;
                    if (entityiterator instanceof BlazetitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f32 = _livEnt2.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f32 / 20.0f + 6000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f31 = _livEnt2.m_21233_();
                    } else {
                        f31 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource6, f31 / 20.0f + 60000.0f);
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f30 = _livEnt2.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource7, f30 / 20.0f + 60000.0f);
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f29 = _livEnt.m_21233_();
                    } else {
                        f29 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f28 = _livEnt2.m_21223_();
                    } else {
                        f28 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource8, (f29 + f28) / 5.0f + 600000.0f);
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f27 = _livEnt.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f26 = _livEnt2.m_21223_();
                    } else {
                        f26 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource9, (f27 + f26) / 5.0f + 600000.0f);
                }
            }
            if (entity instanceof BlazetitanEntity) {
                _datEntI4 = (BlazetitanEntity)entity;
                n23 = (Integer)_datEntI4.m_20088_().m_135370_(BlazetitanEntity.DATA_animationTick);
            } else {
                n23 = 0;
            }
            if (n23 >= 20) {
                if (entity instanceof BlazetitanEntity) {
                    BlazetitanEntity _datEntSetI5 = (BlazetitanEntity)entity;
                    _datEntSetI5.m_20088_().m_135381_(BlazetitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof BlazetitanEntity) {
                    BlazetitanEntity _datEntSetI6 = (BlazetitanEntity)entity;
                    _datEntSetI6.m_20088_().m_135381_(BlazetitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof BlazetitanEntity) {
                    ((BlazetitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

