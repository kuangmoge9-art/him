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
import net.mcreator.ultimateskeletons.entity.ChaoscolossusEntity;
import net.mcreator.ultimateskeletons.entity.ChaoslightningballEntity;
import net.mcreator.ultimateskeletons.entity.ChaosrainEntity;
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

public class ChaoscolossusATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        Object entityToSpawn;
        int n7;
        LivingEntity _livEnt;
        int n8;
        LivingEntity _livEnt2;
        LivingEntity _livEnt3;
        List<Entity> _entfound;
        Mob _mobEnt;
        Object _mobEnt2;
        Object _mobEnt3;
        ChaoscolossusEntity _datEntI;
        Object _mobEnt4;
        ChaoscolossusEntity _datEntI2;
        ChaoscolossusEntity _datEntI3;
        block813: {
            int n9;
            block815: {
                block814: {
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    float f;
                    ChaoscolossusEntity _datEntI4;
                    ChaoscolossusEntity _datEntSetI;
                    LivingEntity _livEnt4;
                    block810: {
                        LivingEntity livingEntity;
                        ChaoscolossusEntity _datEntSetI2;
                        LivingEntity _livEnt5;
                        Mob _mobEnt5;
                        block811: {
                            block812: {
                                LivingEntity livingEntity2;
                                float f2;
                                Object object;
                                LivingEntity livingEntity3;
                                int n14;
                                int n15;
                                float f3;
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
                                    int n16;
                                    if (entity instanceof ChaoscolossusEntity) {
                                        _datEntI3 = (ChaoscolossusEntity)entity;
                                        n16 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
                                    } else {
                                        n16 = 0;
                                    }
                                    if (n16 != 0) {
                                        float f4;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt6 = (LivingEntity)entity;
                                            f4 = _livEnt6.m_21223_();
                                        } else {
                                            f4 = -1.0f;
                                        }
                                        if (f4 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof ChaoscolossusEntity)) continue;
                                                ((ChaoscolossusEntity)entity).setAnimation("empty");
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
                                if (!(f3 > 0.0f)) break block810;
                                if (entity instanceof ChaoscolossusEntity) {
                                    _datEntSetI = (ChaoscolossusEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof ChaoscolossusEntity) {
                                    _datEntI2 = (ChaoscolossusEntity)entity;
                                    n15 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
                                } else {
                                    n15 = 0;
                                }
                                if (n15 == 0) {
                                    int n17;
                                    if (entity instanceof ChaoscolossusEntity) {
                                        ChaoscolossusEntity _datEntI5 = (ChaoscolossusEntity)entity;
                                        n17 = (Integer)_datEntI5.m_20088_().m_135370_(ChaoscolossusEntity.DATA_flyID);
                                    } else {
                                        n17 = 0;
                                    }
                                    if (n17 != 0) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                    }
                                }
                                if (world.m_5776_()) break block810;
                                if (entity instanceof ChaoscolossusEntity) {
                                    _datEntI2 = (ChaoscolossusEntity)entity;
                                    n14 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 != 0 && entity instanceof ChaoscolossusEntity) {
                                    int n18;
                                    ChaoscolossusEntity _datEntSetI3 = (ChaoscolossusEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                                    if (entity instanceof ChaoscolossusEntity) {
                                        _datEntI4 = (ChaoscolossusEntity)entity;
                                        n18 = (Integer)_datEntI4.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                                    } else {
                                        n18 = 0;
                                    }
                                    synchedEntityData.m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)(n18 + 1));
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity3 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity3 = null;
                                }
                                if (livingEntity3 == null) break block811;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt6 = (Mob)entity;
                                    v9 = _mobEnt6.m_5448_();
                                } else {
                                    v9 = object = null;
                                }
                                if (object instanceof LivingEntity) {
                                    _livEnt5 = object;
                                    f2 = _livEnt5.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) break block812;
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity2 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block811;
                            }
                            if (entity instanceof ChaoscolossusEntity) {
                                _datEntSetI2 = (ChaoscolossusEntity)entity;
                                _datEntSetI2.m_20088_().m_135381_(ChaoscolossusEntity.DATA_flyID, (Object)0);
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
                                v20 = _mobEnt11.m_5448_();
                            } else {
                                v20 = _mobEnt4 = null;
                            }
                            if (_mobEnt4 instanceof LivingEntity) {
                                _livEnt5 = (LivingEntity)_mobEnt4;
                                f5 = _livEnt5.m_21223_();
                            } else {
                                f5 = -1.0f;
                            }
                            if (f5 > 0.0f) {
                                int n19;
                                if (entity instanceof ChaoscolossusEntity) {
                                    _datEntI = (ChaoscolossusEntity)entity;
                                    n19 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
                                } else {
                                    n19 = 0;
                                }
                                if (n19 == 0) {
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
                                        if (entity instanceof ChaoscolossusEntity) {
                                            _datEntSetI = (ChaoscolossusEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_flyID, (Object)1);
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
                                        if (entity instanceof ChaoscolossusEntity) {
                                            _datEntSetI = (ChaoscolossusEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_flyID, (Object)0);
                                        }
                                    }
                                    if (world.m_6106_().m_6533_()) {
                                        if (entity instanceof ChaoscolossusEntity) {
                                            _datEntSetI2 = (ChaoscolossusEntity)entity;
                                            _datEntSetI2.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)9);
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
                                        if (f17 < 2048.0f) {
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
                                            if (f18 <= 60.0f) {
                                                LivingEntity livingEntity42;
                                                if (entity instanceof Mob) {
                                                    _mobEnt16 = (Mob)entity;
                                                    livingEntity42 = _mobEnt16.m_5448_();
                                                } else {
                                                    livingEntity42 = null;
                                                }
                                                if (livingEntity42.m_20206_() > 6.0f) {
                                                    if (entity instanceof ChaoscolossusEntity) {
                                                        _datEntSetI = (ChaoscolossusEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)8));
                                                    }
                                                } else if (entity instanceof ChaoscolossusEntity) {
                                                    _datEntSetI = (ChaoscolossusEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                }
                                            }
                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                int n20;
                                                if (entity instanceof ChaoscolossusEntity) {
                                                    ChaoscolossusEntity _datEntI6 = (ChaoscolossusEntity)entity;
                                                    n20 = (Integer)_datEntI6.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
                                                } else {
                                                    n20 = 0;
                                                }
                                                if (n20 == 0) {
                                                    float f19;
                                                    LivingEntity livingEntity43;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity43 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity43 = null;
                                                    }
                                                    if (livingEntity43 != null) {
                                                        LivingEntity livingEntity44;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt16 = (Mob)entity;
                                                            livingEntity44 = _mobEnt16.m_5448_();
                                                        } else {
                                                            livingEntity44 = null;
                                                        }
                                                        f19 = entity.m_20270_(livingEntity44);
                                                    } else {
                                                        f19 = -1.0f;
                                                    }
                                                    if (f19 > 80.0f) {
                                                        LivingEntity livingEntity45;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt12 = (Mob)entity;
                                                            livingEntity45 = _mobEnt12.m_5448_();
                                                        } else {
                                                            livingEntity45 = null;
                                                        }
                                                        if (livingEntity45.m_20206_() > 6.0f) {
                                                            if (entity instanceof ChaoscolossusEntity) {
                                                                _datEntSetI = (ChaoscolossusEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
                                                            }
                                                        } else if (entity instanceof ChaoscolossusEntity) {
                                                            _datEntSetI = (ChaoscolossusEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
                                                        }
                                                    } else {
                                                        float f20;
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
                                                            f20 = entity.m_20270_(livingEntity47);
                                                        } else {
                                                            f20 = -1.0f;
                                                        }
                                                        if (f20 > 60.0f) {
                                                            LivingEntity livingEntity48;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt14 = (Mob)entity;
                                                                livingEntity48 = _mobEnt14.m_5448_();
                                                            } else {
                                                                livingEntity48 = null;
                                                            }
                                                            if (livingEntity48.m_20206_() > 6.0f) {
                                                                if (entity instanceof ChaoscolossusEntity) {
                                                                    _datEntSetI = (ChaoscolossusEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)6));
                                                                }
                                                            } else if (entity instanceof ChaoscolossusEntity) {
                                                                _datEntSetI = (ChaoscolossusEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
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
                        int n21;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntSetI = (ChaoscolossusEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                        }
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntSetI = (ChaoscolossusEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                        }
                        if (entity instanceof Mob) {
                            Mob _entity = (Mob)entity;
                            _entity.m_6710_(null);
                        }
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI2 = (ChaoscolossusEntity)entity;
                            n21 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
                        } else {
                            n21 = 0;
                        }
                        if (n21 == 0) {
                            int n22;
                            int n23;
                            int n24;
                            int n25;
                            if (entity instanceof ChaoscolossusEntity) {
                                int n26;
                                ChaoscolossusEntity _datEntSetI4 = (ChaoscolossusEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
                                if (entity instanceof ChaoscolossusEntity) {
                                    _datEntI4 = (ChaoscolossusEntity)entity;
                                    n26 = (Integer)_datEntI4.m_20088_().m_135370_(ChaoscolossusEntity.DATA_deathTick);
                                } else {
                                    n26 = 0;
                                }
                                synchedEntityData.m_135381_(ChaoscolossusEntity.DATA_deathTick, (Object)(n26 + 1));
                            }
                            if (entity instanceof ChaoscolossusEntity) {
                                ChaoscolossusEntity _datEntI7 = (ChaoscolossusEntity)entity;
                                n25 = (Integer)_datEntI7.m_20088_().m_135370_(ChaoscolossusEntity.DATA_deathTick);
                            } else {
                                n25 = 0;
                            }
                            if (n25 == 1 && world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitandeath")), SoundSource.NEUTRAL, 20.0f, 0.8f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitandeath")), SoundSource.NEUTRAL, 20.0f, 0.8f, false);
                                }
                            }
                            if (entity instanceof ChaoscolossusEntity) {
                                ChaoscolossusEntity _datEntI8 = (ChaoscolossusEntity)entity;
                                n24 = (Integer)_datEntI8.m_20088_().m_135370_(ChaoscolossusEntity.DATA_deathTick);
                            } else {
                                n24 = 0;
                            }
                            if (n24 < 3) {
                                for (int index1 = 0; index1 < 12; ++index1) {
                                    if (entity instanceof ChaoscolossusEntity) {
                                        ((ChaoscolossusEntity)entity).setAnimation("empty");
                                    }
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof ChaoscolossusEntity) {
                                ChaoscolossusEntity _datEntI9 = (ChaoscolossusEntity)entity;
                                n23 = (Integer)_datEntI9.m_20088_().m_135370_(ChaoscolossusEntity.DATA_deathTick);
                            } else {
                                n23 = 0;
                            }
                            if (n23 < 100 && entity instanceof ChaoscolossusEntity) {
                                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.death");
                            }
                            if (entity instanceof ChaoscolossusEntity) {
                                ChaoscolossusEntity _datEntI10 = (ChaoscolossusEntity)entity;
                                n22 = (Integer)_datEntI10.m_20088_().m_135370_(ChaoscolossusEntity.DATA_deathTick);
                            } else {
                                n22 = 0;
                            }
                            if (n22 >= 610) {
                                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                            }
                        }
                    }
                    if (entity instanceof ChaoscolossusEntity) {
                        _datEntI3 = (ChaoscolossusEntity)entity;
                        n13 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
                    } else {
                        n13 = 0;
                    }
                    if (n13 != true) break block813;
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof ChaoscolossusEntity) {
                        ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.zt");
                    }
                    if (entity instanceof ChaoscolossusEntity) {
                        _datEntI2 = (ChaoscolossusEntity)entity;
                        n12 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
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
                            LivingEntity livingEntity49;
                            if (entity instanceof Mob) {
                                Mob _mobEnt18 = (Mob)entity;
                                livingEntity49 = _mobEnt18.m_5448_();
                            } else {
                                livingEntity49 = null;
                            }
                            f21 = entity.m_20270_(livingEntity49);
                        } else {
                            f21 = -1.0f;
                        }
                        if (f21 > 1.0f) {
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
                                _mobEnt3 = (Mob)entity;
                                livingEntity52 = _mobEnt3.m_5448_();
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
                    if (entity instanceof ChaoscolossusEntity) {
                        _datEntI2 = (ChaoscolossusEntity)entity;
                        n11 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n11 = 0;
                    }
                    if (n11 == 60) break block814;
                    if (entity instanceof ChaoscolossusEntity) {
                        ChaoscolossusEntity _datEntI11 = (ChaoscolossusEntity)entity;
                        n10 = (Integer)_datEntI11.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 != 110) break block815;
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
                    float f;
                    float f22;
                    float f23;
                    float f24;
                    float f25;
                    float f26;
                    float f27;
                    if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f27 = _livEnt3.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f27 / 20.0f + 200000.0f);
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
                    entityiterator.m_6469_(damageSource2, f26 / 20.0f + 200000.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f25 = _livEnt3.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource3, f25 / 20.0f + 200000.0f);
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
                    entityiterator.m_6469_(damageSource4, (f24 + f23) / 5.0f + 2000000.0f);
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
                    entityiterator.m_6469_(damageSource5, (f22 + f) / 5.0f + 2000000.0f);
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n9 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n9 = 0;
            }
            if (n9 >= 150) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n8 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n8 = 0;
        }
        if (n8 == 2) {
            int n27;
            int n28;
            int n29;
            if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.zp");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n29 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt19 = (Mob)entity;
                    livingEntity = _mobEnt19.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity54;
                    if (entity instanceof Mob) {
                        Mob _mobEnt20 = (Mob)entity;
                        livingEntity54 = _mobEnt20.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity57 = _mobEnt3.m_5448_();
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
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n28 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 == 32) {
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
                    float f;
                    float f28;
                    float f29;
                    float f30;
                    float f31;
                    float f32;
                    float f33;
                    if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
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
                        _livEnt3 = (LivingEntity)entityiterator;
                        f30 = _livEnt3.m_21233_();
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
                        _livEnt3 = (LivingEntity)entityiterator;
                        f28 = _livEnt3.m_21233_();
                    } else {
                        f28 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource9, (f28 + f) / 5.0f + 1000000.0f);
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n27 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 >= 56) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n7 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n7 = 0;
        }
        if (n7 == 3) {
            int n30;
            int n31;
            int n32;
            if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.qj");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n32 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt21 = (Mob)entity;
                    livingEntity = _mobEnt21.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity59;
                    if (entity instanceof Mob) {
                        Mob _mobEnt22 = (Mob)entity;
                        livingEntity59 = _mobEnt22.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity62 = _mobEnt3.m_5448_();
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
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n31 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 == 44) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index2 = 0; index2 < 32; ++index2) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound3) {
                    float f;
                    float f34;
                    float f35;
                    float f36;
                    float f37;
                    float f38;
                    float f39;
                    if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f39 = _livEnt.m_21233_();
                    } else {
                        f39 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f39 / 20.0f + 2400000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f38 = _livEnt.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource10, f38 / 20.0f + 2400000.0f);
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f37 = _livEnt.m_21233_();
                    } else {
                        f37 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource11, f37 / 20.0f + 2400000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator instanceof Player)) {
                        Deathlist.normalattack(entityiterator);
                    }
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f36 = _livEnt3.m_21233_();
                    } else {
                        f36 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f35 = _livEnt.m_21223_();
                    } else {
                        f35 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource12, (f36 + f35) / 5.0f + 2.4E7f);
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f34 = _livEnt3.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource13, (f34 + f) / 5.0f + 2.4E7f);
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n30 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 >= 60) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n6 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 4) {
            int n33;
            int n34;
            int n35;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.attack1");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.attack2");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.attack3");
                }
            } else if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.attack4");
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n35 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity = _mobEnt23.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity64;
                    if (entity instanceof Mob) {
                        Mob _mobEnt24 = (Mob)entity;
                        livingEntity64 = _mobEnt24.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity67 = _mobEnt3.m_5448_();
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
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n34 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 == 14) {
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
                    float f;
                    float f40;
                    float f41;
                    float f42;
                    float f43;
                    float f44;
                    float f45;
                    if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f45 = _livEnt.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f45 / 20.0f + 1200000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f44 = _livEnt.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource14, f44 / 20.0f + 1200000.0f);
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f43 = _livEnt.m_21233_();
                    } else {
                        f43 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource15, f43 / 20.0f + 1200000.0f);
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f42 = _livEnt3.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f41 = _livEnt.m_21223_();
                    } else {
                        f41 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource16, (f42 + f41) / 5.0f + 1.2E7f);
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f40 = _livEnt3.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource17, (f40 + f) / 5.0f + 1.2E7f);
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n33 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n33 = 0;
            }
            if (n33 >= 30) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n5 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 5) {
            int n36;
            int n37;
            int n38;
            int n39;
            if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.thunderball");
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n39 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt25 = (Mob)entity;
                    livingEntity = _mobEnt25.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity69;
                    if (entity instanceof Mob) {
                        Mob _mobEnt26 = (Mob)entity;
                        livingEntity69 = _mobEnt26.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity72 = _mobEnt3.m_5448_();
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
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n38 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n38 = 0;
            }
            if (n38 == 55) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index3 = 0; index3 < 40; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(240.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound5) {
                    float f;
                    float f46;
                    float f47;
                    float f48;
                    float f49;
                    float f50;
                    float f51;
                    if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f51 = _livEnt.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f51 / 20.0f + 400000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f50 = _livEnt.m_21233_();
                    } else {
                        f50 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource18, f50 / 20.0f + 400000.0f);
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f49 = _livEnt.m_21233_();
                    } else {
                        f49 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource19, f49 / 20.0f + 400000.0f);
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f48 = _livEnt3.m_21233_();
                    } else {
                        f48 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f47 = _livEnt.m_21223_();
                    } else {
                        f47 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource20, (f48 + f47) / 5.0f + 4000000.0f);
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator;
                        f46 = _livEnt3.m_21233_();
                    } else {
                        f46 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource21, (f46 + f) / 5.0f + 4000000.0f);
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n37 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n37 = 0;
            }
            if (n37 >= 60) {
                int n40;
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntI12 = (ChaoscolossusEntity)entity;
                    n40 = (Integer)_datEntI12.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                } else {
                    n40 = 0;
                }
                if (n40 <= 90) {
                    for (int index4 = 0; index4 < 24; ++index4) {
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
                            LivingEntity livingEntity74;
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity74 = _mobEnt3.m_5448_();
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
                            if (!(world instanceof ServerLevel)) continue;
                            projectileLevel = (ServerLevel)world;
                            _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    ChaosrainEntity entityToSpawn = new ChaosrainEntity((EntityType<? extends ChaosrainEntity>)((EntityType)UltimateskeletonsModEntities.CHAOSRAIN.get()), level);
                                    entityToSpawn.m_5602_(shooter);
                                    entityToSpawn.m_36781_(damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    entityToSpawn.m_20254_(100);
                                    entityToSpawn.m_36762_(true);
                                    return entityToSpawn;
                                }
                            }.getArrow((Level)projectileLevel, entity, 30000.0f, 1);
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity76 = _mobEnt.m_5448_();
                            } else {
                                livingEntity76 = null;
                            }
                            double d = livingEntity76.m_20185_() + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-80.0, (double)80.0);
                            double d25 = y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)160.0, (double)240.0);
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity75 = _mobEnt.m_5448_();
                            } else {
                                livingEntity75 = null;
                            }
                            _entityToSpawn.m_6034_(d, d25, livingEntity75.m_20189_() + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-80.0, (double)80.0));
                            _entityToSpawn.m_6686_((double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), -1.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), 6.0f, 32.0f);
                            projectileLevel.m_7967_((Entity)_entityToSpawn);
                            continue;
                        }
                        if (!(world instanceof ServerLevel)) continue;
                        projectileLevel = (ServerLevel)world;
                        _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                ChaosrainEntity entityToSpawn = new ChaosrainEntity((EntityType<? extends ChaosrainEntity>)((EntityType)UltimateskeletonsModEntities.CHAOSRAIN.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_20254_(100);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)projectileLevel, entity, 30000.0f, 1);
                        _entityToSpawn.m_6034_(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)160.0, (double)240.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0));
                        _entityToSpawn.m_6686_((double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), -1.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-1, (int)1), 6.0f, 32.0f);
                        projectileLevel.m_7967_((Entity)_entityToSpawn);
                    }
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n36 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n36 = 0;
            }
            if (n36 >= 100) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n4 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 6) {
            int n41;
            int n42;
            int n43;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.sd");
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n43 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n43 = 0;
            }
            if (n43 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt27 = (Mob)entity;
                    livingEntity = _mobEnt27.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity77;
                    if (entity instanceof Mob) {
                        Mob _mobEnt28 = (Mob)entity;
                        livingEntity77 = _mobEnt28.m_5448_();
                    } else {
                        livingEntity77 = null;
                    }
                    f = entity.m_20270_(livingEntity77);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity78;
                    LivingEntity livingEntity79;
                    LivingEntity livingEntity80;
                    LivingEntity livingEntity81;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity81 = _mobEnt4.m_5448_();
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
                    double d26 = livingEntity80.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity79 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity79 = null;
                    }
                    double d27 = d26 + (double)livingEntity79.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity78 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity78 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d27, livingEntity78.m_20189_()));
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n42 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n42 = 0;
            }
            if (n42 == 36) {
                float f;
                LivingEntity livingEntity;
                float f52;
                LivingEntity livingEntity82;
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
                    livingEntity82 = _mobEnt29.m_5448_();
                } else {
                    livingEntity82 = null;
                }
                if (livingEntity82 != null) {
                    LivingEntity livingEntity83;
                    if (entity instanceof Mob) {
                        Mob _mobEnt30 = (Mob)entity;
                        livingEntity83 = _mobEnt30.m_5448_();
                    } else {
                        livingEntity83 = null;
                    }
                    f52 = entity.m_20270_(livingEntity83);
                } else {
                    f52 = -1.0f;
                }
                if (f52 > 1.0f) {
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity84;
                        LivingEntity livingEntity85;
                        LivingEntity livingEntity86;
                        projectileLevel = (ServerLevel)world;
                        _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                ChaoslightningballEntity entityToSpawn = new ChaoslightningballEntity((EntityType<? extends ChaoslightningballEntity>)((EntityType)UltimateskeletonsModEntities.CHAOSLIGHTNINGBALL.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)projectileLevel, entity, 40000.0f, 1);
                        _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 20.0, y + 50.0, z + entity.m_20154_().f_82481_ * 20.0);
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity86 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity86 = null;
                        }
                        double d = livingEntity86.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity85 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity85 = null;
                        }
                        double d28 = livingEntity85.m_20186_() - 50.0 - entity.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity84 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity84 = null;
                        }
                        _entityToSpawn.m_6686_(d, d28, livingEntity84.m_20189_() - entity.m_20189_(), 1.0f, 4.0f);
                        projectileLevel.m_7967_((Entity)_entityToSpawn);
                    }
                } else if (world instanceof ServerLevel) {
                    projectileLevel = (ServerLevel)world;
                    _entityToSpawn = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            ChaoslightningballEntity entityToSpawn = new ChaoslightningballEntity((EntityType<? extends ChaoslightningballEntity>)((EntityType)UltimateskeletonsModEntities.CHAOSLIGHTNINGBALL.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 40000.0f, 1);
                    _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 20.0, y + 50.0, z + entity.m_20154_().f_82481_ * 20.0);
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
                    LivingEntity livingEntity87;
                    if (entity instanceof Mob) {
                        Mob _mobEnt32 = (Mob)entity;
                        livingEntity87 = _mobEnt32.m_5448_();
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
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity91;
                        LivingEntity livingEntity92;
                        LivingEntity livingEntity93;
                        ServerLevel _level = (ServerLevel)world;
                        EntityType entityType = (EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity93 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity93 = null;
                        }
                        double d = livingEntity93.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity92 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity92 = null;
                        }
                        double d29 = livingEntity92.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity91 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity91 = null;
                        }
                        Entity entityToSpawn2 = entityType.m_262496_(_level, BlockPos.m_274561_((double)d, (double)d29, (double)livingEntity91.m_20189_()), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn2 != null) {
                            entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity90 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity90 = null;
                    }
                    double d = livingEntity90.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity89 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity89 = null;
                    }
                    double d30 = livingEntity89.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity88 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity88 = null;
                    }
                    Vec3 _center = new Vec3(d, d30, livingEntity88.m_20189_());
                    List<Entity> _entfound6 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound6) {
                        float f53;
                        float f54;
                        float f55;
                        float f56;
                        LivingEntity _livEnt7;
                        float f57;
                        float f58;
                        float f59;
                        if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f59 = _livEnt2.m_21233_();
                        } else {
                            f59 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f59 / 20.0f + 320000.0f);
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f58 = _livEnt2.m_21233_();
                        } else {
                            f58 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource22, f58 / 20.0f + 320000.0f);
                        DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f57 = _livEnt2.m_21233_();
                        } else {
                            f57 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource23, f57 / 20.0f + 320000.0f);
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f56 = _livEnt7.m_21233_();
                        } else {
                            f56 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f55 = _livEnt2.m_21223_();
                        } else {
                            f55 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource24, (f56 + f55) / 5.0f + 3200000.0f);
                        DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f54 = _livEnt7.m_21233_();
                        } else {
                            f54 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f53 = _livEnt2.m_21223_();
                        } else {
                            f53 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource25, (f54 + f53) / 5.0f + 3200000.0f);
                    }
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n41 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 >= 60) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n3 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 7) {
            int n44;
            int n45;
            int n46;
            int n47;
            int n48;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.shouter");
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n48 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt33 = (Mob)entity;
                    livingEntity = _mobEnt33.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity94;
                    if (entity instanceof Mob) {
                        Mob _mobEnt34 = (Mob)entity;
                        livingEntity94 = _mobEnt34.m_5448_();
                    } else {
                        livingEntity94 = null;
                    }
                    f = entity.m_20270_(livingEntity94);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity95;
                    LivingEntity livingEntity96;
                    LivingEntity livingEntity97;
                    LivingEntity livingEntity98;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity98 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity98 = null;
                    }
                    double d = livingEntity98.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity97 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity97 = null;
                    }
                    double d31 = livingEntity97.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity96 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity96 = null;
                    }
                    double d32 = d31 + (double)livingEntity96.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity95 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity95 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d32, livingEntity95.m_20189_()));
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n47 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 == 48) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanroar")), SoundSource.NEUTRAL, 20.0f, 0.8f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanroar")), SoundSource.NEUTRAL, 20.0f, 0.8f, false);
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
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n46 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n46 = 0;
            }
            if (n46 >= 44) {
                int n49;
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntI13 = (ChaoscolossusEntity)entity;
                    n49 = (Integer)_datEntI13.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                } else {
                    n49 = 0;
                }
                if (n49 <= 62) {
                    int n50;
                    int n51;
                    int n52;
                    int n53;
                    SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEEXPLOSION.get();
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof ChaoscolossusEntity) {
                        ChaoscolossusEntity _datEntI14 = (ChaoscolossusEntity)entity;
                        n53 = (Integer)_datEntI14.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n53 = 0;
                    }
                    double d33 = x + d * (double)(n53 - 40) * 8.0;
                    double d34 = entity.m_20154_().f_82481_;
                    if (entity instanceof ChaoscolossusEntity) {
                        ChaoscolossusEntity _datEntI15 = (ChaoscolossusEntity)entity;
                        n52 = (Integer)_datEntI15.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n52 = 0;
                    }
                    world.m_7106_((ParticleOptions)simpleParticleType, d33, y + 50.0, z + d34 * (double)(n52 - 40) * 8.0, 0.0, 0.0, 0.0);
                    SimpleParticleType simpleParticleType2 = (SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get();
                    double d35 = entity.m_20154_().f_82479_;
                    if (entity instanceof ChaoscolossusEntity) {
                        ChaoscolossusEntity _datEntI16 = (ChaoscolossusEntity)entity;
                        n51 = (Integer)_datEntI16.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n51 = 0;
                    }
                    double d36 = x + d35 * (double)(n51 - 40) * 8.0;
                    double d37 = entity.m_20154_().f_82481_;
                    if (entity instanceof ChaoscolossusEntity) {
                        ChaoscolossusEntity _datEntI17 = (ChaoscolossusEntity)entity;
                        n50 = (Integer)_datEntI17.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n50 = 0;
                    }
                    world.m_7106_((ParticleOptions)simpleParticleType2, d36, y + 0.1, z + d37 * (double)(n50 - 40) * 8.0, 0.0, 0.0, 0.0);
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n45 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n45 = 0;
            }
            if (n45 >= 48) {
                int n54;
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntI18 = (ChaoscolossusEntity)entity;
                    n54 = (Integer)_datEntI18.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                } else {
                    n54 = 0;
                }
                if (n54 <= 66) {
                    Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 80.0, y, z + entity.m_20154_().f_82481_ * 80.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(180.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f;
                        float f60;
                        float f61;
                        float f62;
                        float f63;
                        float f64;
                        float f65;
                        if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f65 = _livEnt3.m_21233_();
                        } else {
                            f65 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f65 / 20.0f + 1000000.0f);
                        if (entityiterator instanceof Titangodentity) continue;
                        DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f64 = _livEnt3.m_21233_();
                        } else {
                            f64 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource26, f64 / 20.0f + 1000000.0f);
                        DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f63 = _livEnt3.m_21233_();
                        } else {
                            f63 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource27, f63 / 20.0f + 1000000.0f);
                        entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f62 = _livEnt2.m_21233_();
                        } else {
                            f62 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f61 = _livEnt3.m_21223_();
                        } else {
                            f61 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource28, (f62 + f61) / 5.0f + 1.0E7f);
                        DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f60 = _livEnt2.m_21233_();
                        } else {
                            f60 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f = _livEnt3.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource29, (f60 + f) / 5.0f + 1.0E7f);
                    }
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n44 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n44 = 0;
            }
            if (n44 >= 78) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n2 = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 8) {
            int n55;
            int n56;
            int n57;
            int n58;
            int n59;
            if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.laser");
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n59 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n59 = 0;
            }
            if (n59 == 25) {
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
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n58 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n58 = 0;
            }
            if (n58 >= 30) {
                int n60;
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntI19 = (ChaoscolossusEntity)entity;
                    n60 = (Integer)_datEntI19.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                } else {
                    n60 = 0;
                }
                if (n60 <= 46) {
                    for (int index5 = 0; index5 < 4; ++index5) {
                        int n61;
                        int n62;
                        SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get();
                        double d = entity.m_20154_().f_82479_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n62 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n62 = 0;
                        }
                        double d38 = x + d * Math.pow(n62 - 30, 3.0) + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0);
                        double d39 = entity.m_20154_().f_82481_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n61 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n61 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType, d38, y + 0.2, z + d39 * Math.pow(n61 - 30, 3.0) + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0), 0.0, 0.0, 0.0);
                    }
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n57 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n57 = 0;
            }
            if (n57 >= 28) {
                int n63;
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntI20 = (ChaoscolossusEntity)entity;
                    n63 = (Integer)_datEntI20.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                } else {
                    n63 = 0;
                }
                if (n63 <= 44) {
                    int n64;
                    int n65;
                    SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get();
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof ChaoscolossusEntity) {
                        ChaoscolossusEntity _datEntI21 = (ChaoscolossusEntity)entity;
                        n65 = (Integer)_datEntI21.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n65 = 0;
                    }
                    double d40 = x + d * Math.pow(n65 - 28, 2.0);
                    double d41 = entity.m_20154_().f_82481_;
                    if (entity instanceof ChaoscolossusEntity) {
                        ChaoscolossusEntity _datEntI22 = (ChaoscolossusEntity)entity;
                        n64 = (Integer)_datEntI22.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n64 = 0;
                    }
                    world.m_7106_((ParticleOptions)simpleParticleType, d40, y + 0.2, z + d41 * Math.pow(n64 - 28, 2.0), 0.0, 0.0, 0.0);
                    for (int index6 = 0; index6 < 4; ++index6) {
                        int n66;
                        int n67;
                        int n68;
                        int n69;
                        SimpleParticleType simpleParticleType3 = (SimpleParticleType)UltimateskeletonsModParticleTypes.MUTIVERSE.get();
                        double d42 = entity.m_20154_().f_82479_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n69 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n69 = 0;
                        }
                        double d43 = x + d42 * Math.pow(n69 - 28, 3.0) + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0);
                        double d44 = entity.m_20154_().f_82481_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n68 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n68 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType3, d43, y + 0.2, z + d44 * Math.pow(n68 - 28, 3.0) + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                        SimpleParticleType simpleParticleType4 = (SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_1.get();
                        double d45 = entity.m_20154_().f_82479_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n67 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n67 = 0;
                        }
                        double d46 = x + d45 * Math.pow(n67 - 28, 3.0) + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0);
                        double d47 = entity.m_20154_().f_82481_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n66 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n66 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType4, d46, y + 0.2, z + d47 * Math.pow(n66 - 28, 3.0) + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-24.0, (double)24.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                    }
                    for (int index7 = 0; index7 < 64; ++index7) {
                        int n70;
                        int n71;
                        int n72;
                        int n73;
                        SimpleParticleType simpleParticleType5 = (SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_2.get();
                        double d48 = entity.m_20154_().f_82479_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n73 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n73 = 0;
                        }
                        double d49 = x + d48 * Math.pow(n73 - 28, 2.0);
                        double d50 = entity.m_20154_().f_82481_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n72 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n72 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType5, d49, y, z + d50 * Math.pow(n72 - 28, 2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                        SimpleParticleType simpleParticleType6 = (SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_3.get();
                        double d51 = entity.m_20154_().f_82479_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n71 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n71 = 0;
                        }
                        double d52 = x + d51 * Math.pow(n71 - 28, 2.0);
                        double d53 = entity.m_20154_().f_82481_;
                        if (entity instanceof ChaoscolossusEntity) {
                            _datEntI = (ChaoscolossusEntity)entity;
                            n70 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                        } else {
                            n70 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType6, d52, y, z + d53 * Math.pow(n70 - 28, 2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                    }
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n56 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 >= 28) {
                int n74;
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntI23 = (ChaoscolossusEntity)entity;
                    n74 = (Integer)_datEntI23.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                } else {
                    n74 = 0;
                }
                if (n74 <= 48) {
                    int n75;
                    int n76;
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof ChaoscolossusEntity) {
                        _datEntI = (ChaoscolossusEntity)entity;
                        n76 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n76 = 0;
                    }
                    double d54 = x + d * Math.pow(n76 - 28, 2.0);
                    double d55 = entity.m_20154_().f_82481_;
                    if (entity instanceof ChaoscolossusEntity) {
                        _datEntI = (ChaoscolossusEntity)entity;
                        n75 = (Integer)_datEntI.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                    } else {
                        n75 = 0;
                    }
                    Vec3 _center = new Vec3(d54, y, z + d55 * Math.pow(n75 - 28, 2.0));
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f;
                        float f66;
                        float f67;
                        float f68;
                        float f69;
                        float f70;
                        float f71;
                        if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f71 = _livEnt3.m_21233_();
                        } else {
                            f71 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f71 / 20.0f + 800000.0f);
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f70 = _livEnt3.m_21233_();
                        } else {
                            f70 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource30, f70 / 20.0f + 800000.0f);
                        DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f69 = _livEnt3.m_21233_();
                        } else {
                            f69 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource31, f69 / 20.0f + 800000.0f);
                        if (!(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                        }
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f68 = _livEnt2.m_21233_();
                        } else {
                            f68 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f67 = _livEnt3.m_21223_();
                        } else {
                            f67 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource32, (f68 + f67) / 5.0f + 8000000.0f);
                        DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f66 = _livEnt2.m_21233_();
                        } else {
                            f66 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f = _livEnt3.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource33, (f66 + f) / 5.0f + 8000000.0f);
                    }
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n55 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 >= 64) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ChaoscolossusEntity) {
            _datEntI3 = (ChaoscolossusEntity)entity;
            n = (Integer)_datEntI3.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 9) {
            int n77;
            int n78;
            int n79;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof ChaoscolossusEntity) {
                ((ChaoscolossusEntity)entity).setAnimation("animation.endermantitan.yt");
            }
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "weather clear");
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n79 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n79 = 0;
            }
            if (n79 == 44 && world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanscream")), SoundSource.NEUTRAL, 20.0f, 0.8f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:endermantitanscream")), SoundSource.NEUTRAL, 20.0f, 0.8f, false);
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n78 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n78 = 0;
            }
            if (n78 >= 44) {
                int n80;
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntI24 = (ChaoscolossusEntity)entity;
                    n80 = (Integer)_datEntI24.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
                } else {
                    n80 = 0;
                }
                if (n80 <= 144) {
                    Vec3 _center = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f;
                        float f72;
                        float f73;
                        float f74;
                        float f75;
                        float f76;
                        float f77;
                        if (entityiterator instanceof ChaoscolossusEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f77 = _livEnt3.m_21233_();
                        } else {
                            f77 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f77 / 20.0f + 2000000.0f);
                        if (entityiterator instanceof Titangodentity) continue;
                        DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f76 = _livEnt3.m_21233_();
                        } else {
                            f76 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource34, f76 * 20.0f + 2.0E7f);
                        DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f75 = _livEnt3.m_21233_();
                        } else {
                            f75 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource35, f75 * 20.0f + 2.0E7f);
                        if (!(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f74 = _livEnt2.m_21233_();
                        } else {
                            f74 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f73 = _livEnt3.m_21223_();
                        } else {
                            f73 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource36, (float)(Math.pow(f74 + f73, 2.0) + 2.0E8));
                        DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f72 = _livEnt2.m_21233_();
                        } else {
                            f72 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f = _livEnt3.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource37, (float)(Math.pow(f72 + f, 2.0) + 2.0E8));
                    }
                }
            }
            if (entity instanceof ChaoscolossusEntity) {
                _datEntI2 = (ChaoscolossusEntity)entity;
                n77 = (Integer)_datEntI2.m_20088_().m_135370_(ChaoscolossusEntity.DATA_animationTick);
            } else {
                n77 = 0;
            }
            if (n77 >= 150) {
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity _datEntSetI = (ChaoscolossusEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ChaoscolossusEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ChaoscolossusEntity) {
                    ((ChaoscolossusEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

