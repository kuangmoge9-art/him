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
 *  net.minecraft.world.entity.monster.Zombie
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
import net.mcreator.ultimateskeletons.entity.MasterballEntity;
import net.mcreator.ultimateskeletons.entity.ZombietitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
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
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class ZombietitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        ZombietitanEntity _datEntI;
        LivingEntity _livEnt;
        int n9;
        LivingEntity _livEnt2;
        ZombietitanEntity _datEntI2;
        List<Entity> _entfound;
        Object _mobEnt;
        Mob _mobEnt2;
        Mob _mobEnt3;
        ZombietitanEntity _datEntI3;
        ZombietitanEntity _datEntI4;
        block910: {
            int n10;
            block912: {
                block911: {
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    float f;
                    ZombietitanEntity _datEntI5;
                    LivingEntity _entity;
                    block907: {
                        LivingEntity livingEntity;
                        LivingEntity _mobEnt32;
                        block908: {
                            block909: {
                                LivingEntity livingEntity2;
                                float f2;
                                LivingEntity livingEntity3;
                                LivingEntity livingEntity4;
                                int n15;
                                int n16;
                                int n17;
                                float f3;
                                block905: {
                                    block906: {
                                        int n18;
                                        int n19;
                                        int n20;
                                        int n21;
                                        int n22;
                                        int n23;
                                        int n24;
                                        int n25;
                                        Entity entityToSpawn;
                                        ServerLevel _level;
                                        block904: {
                                            int n26;
                                            int n27;
                                            int n28;
                                            int n29;
                                            LivingEntity _entity2;
                                            LivingEntity _entity22;
                                            if (entity == null) {
                                                return;
                                            }
                                            double theta = 0.0;
                                            ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                            if (entity instanceof LivingEntity && !(_entity22 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                _entity22.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                            }
                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                                            }
                                            if (entity instanceof ZombietitanEntity) {
                                                int n30;
                                                ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                if (entity instanceof ZombietitanEntity) {
                                                    ZombietitanEntity _datEntI42 = (ZombietitanEntity)entity;
                                                    n30 = (Integer)_datEntI42.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                                } else {
                                                    n30 = 0;
                                                }
                                                synchedEntityData.m_135381_(ZombietitanEntity.DATA_spawnTick, (Object)(n30 + 1));
                                            }
                                            if (!entity.m_5446_().getString().equals("growing")) break block904;
                                            if (entity instanceof ZombietitanEntity) {
                                                ZombietitanEntity _datEntI32 = (ZombietitanEntity)entity;
                                                n29 = (Integer)_datEntI32.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                            } else {
                                                n29 = 0;
                                            }
                                            if (n29 >= 720) break block905;
                                            entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                            entity.f_19802_ = 20;
                                            ((ZombietitanEntity)entity).setHEALTS(20000.0);
                                            if (entity instanceof LivingEntity) {
                                                ((LivingEntity)entity).f_20919_ = 0;
                                            }
                                            if (entity instanceof Mob) {
                                                _entity = (Mob)entity;
                                                _entity.m_6710_(null);
                                            }
                                            if (entity instanceof ZombietitanEntity) {
                                                _datEntI4 = (ZombietitanEntity)entity;
                                                n28 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                            } else {
                                                n28 = 0;
                                            }
                                            if (n28 == 450 && world instanceof ServerLevel) {
                                                _level = (ServerLevel)world;
                                                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                                if (entityToSpawn != null) {
                                                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                }
                                            }
                                            if (entity instanceof ZombietitanEntity) {
                                                _datEntI4 = (ZombietitanEntity)entity;
                                                n27 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                            } else {
                                                n27 = 0;
                                            }
                                            if (n27 <= 10 && entity instanceof ZombietitanEntity) {
                                                ((ZombietitanEntity)entity).setAnimation("spawn3");
                                            }
                                            if (entity instanceof ZombietitanEntity) {
                                                _datEntI4 = (ZombietitanEntity)entity;
                                                n26 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                            } else {
                                                n26 = 0;
                                            }
                                            if (n26 == 719) {
                                                if (world instanceof Level) {
                                                    _level = (Level)world;
                                                    if (!_level.m_5776_()) {
                                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                    } else {
                                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                    }
                                                }
                                                if (!world.m_5776_() && world.m_7654_() != null) {
                                                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Zombietitan has been created!!!"), false);
                                                }
                                            }
                                            if (entity.m_20096_()) break block905;
                                            if (entity.m_20186_() < -63.0) {
                                                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                            } else {
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                            break block905;
                                        }
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntI3 = (ZombietitanEntity)entity;
                                            n25 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n25 = 0;
                                        }
                                        if (n25 >= 510) break block905;
                                        entity.m_6593_((Component)Component.m_237113_((String)"Zombietitan"));
                                        if (entity instanceof LivingEntity) {
                                            ((LivingEntity)entity).f_20919_ = 0;
                                        }
                                        if (entity instanceof LivingEntity) {
                                            _entity = (LivingEntity)entity;
                                            _entity.m_21153_(200000.0f);
                                        }
                                        entity.f_19802_ = 20;
                                        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                        if (!entity.m_20096_()) {
                                            if (entity.m_20186_() < -63.0) {
                                                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                            } else {
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                        }
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntI4 = (ZombietitanEntity)entity;
                                            n24 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n24 = 0;
                                        }
                                        if (n24 == 1 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:zombietitanspawn")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:zombietitanspawn")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntI4 = (ZombietitanEntity)entity;
                                            n23 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n23 = 0;
                                        }
                                        if (n23 == 240 && world instanceof ServerLevel) {
                                            _level = (ServerLevel)world;
                                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                            if (entityToSpawn != null) {
                                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                            }
                                        }
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntI4 = (ZombietitanEntity)entity;
                                            n22 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n22 = 0;
                                        }
                                        if (n22 <= 10 && entity instanceof ZombietitanEntity) {
                                            ((ZombietitanEntity)entity).setAnimation("spawn");
                                        }
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntI4 = (ZombietitanEntity)entity;
                                            n21 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n21 = 0;
                                        }
                                        if (n21 == 509 && !world.m_5776_() && world.m_7654_() != null) {
                                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Zombietitan awake!!!"), false);
                                        }
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntI4 = (ZombietitanEntity)entity;
                                            n20 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n20 = 0;
                                        }
                                        if (n20 == 85) break block906;
                                        if (entity instanceof ZombietitanEntity) {
                                            ZombietitanEntity _datEntI6 = (ZombietitanEntity)entity;
                                            n19 = (Integer)_datEntI6.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 == 150) break block906;
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntI5 = (ZombietitanEntity)entity;
                                            n18 = (Integer)_datEntI5.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 != 355) break block905;
                                    }
                                    if (world instanceof Level) {
                                        Level _level = (Level)world;
                                        if (!_level.m_5776_()) {
                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                        } else {
                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                        }
                                    }
                                    Vec3 _center = new Vec3(x, y, z);
                                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    for (Entity entityiterator : list) {
                                        if (entityiterator instanceof ZombietitanEntity || entityiterator instanceof Zombie) continue;
                                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                                        double _setval = 5.0;
                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                            capability.camerashake = _setval;
                                            capability.syncPlayerVariables(entityiterator);
                                        });
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n31;
                                    if (entity instanceof ZombietitanEntity) {
                                        _datEntI3 = (ZombietitanEntity)entity;
                                        n31 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
                                    } else {
                                        n31 = 0;
                                    }
                                    if (n31 != 0) {
                                        float f4;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)entity;
                                            f4 = _livEnt5.m_21223_();
                                        } else {
                                            f4 = -1.0f;
                                        }
                                        if (f4 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof ZombietitanEntity)) continue;
                                                ((ZombietitanEntity)entity).setAnimation("empty");
                                            }
                                        }
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt3 = (LivingEntity)entity;
                                    f3 = _livEnt3.m_21223_();
                                } else {
                                    f3 = -1.0f;
                                }
                                if (f3 > 0.0f && entity instanceof ZombietitanEntity) {
                                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof ZombietitanEntity) {
                                    _datEntI3 = (ZombietitanEntity)entity;
                                    n17 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_spawnTick);
                                } else {
                                    n17 = 0;
                                }
                                if (n17 < 510) break block907;
                                if (entity instanceof ZombietitanEntity) {
                                    _datEntI4 = (ZombietitanEntity)entity;
                                    n16 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
                                } else {
                                    n16 = 0;
                                }
                                if (n16 == 0) {
                                    int n32;
                                    if (entity instanceof ZombietitanEntity) {
                                        ZombietitanEntity _datEntI7 = (ZombietitanEntity)entity;
                                        n32 = (Integer)_datEntI7.m_20088_().m_135370_(ZombietitanEntity.DATA_flyID);
                                    } else {
                                        n32 = 0;
                                    }
                                    if (n32 != 0) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                    }
                                }
                                if (world.m_5776_()) break block907;
                                if (entity instanceof ZombietitanEntity) {
                                    _datEntI4 = (ZombietitanEntity)entity;
                                    n15 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
                                } else {
                                    n15 = 0;
                                }
                                if (n15 != 0 && entity instanceof ZombietitanEntity) {
                                    int n33;
                                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof ZombietitanEntity) {
                                        ZombietitanEntity _datEntI52 = (ZombietitanEntity)entity;
                                        n33 = (Integer)_datEntI52.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
                                    } else {
                                        n33 = 0;
                                    }
                                    synchedEntityData.m_135381_(ZombietitanEntity.DATA_animationTick, (Object)(n33 + 1));
                                }
                                if (entity instanceof Mob) {
                                    Mob _mobEnt4 = (Mob)entity;
                                    livingEntity4 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity4 = null;
                                }
                                if (livingEntity4 == null) break block908;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt5 = (Mob)entity;
                                    v24 = _mobEnt5.m_5448_();
                                } else {
                                    v24 = livingEntity3 = null;
                                }
                                if (livingEntity3 instanceof LivingEntity) {
                                    LivingEntity _livEnt4 = livingEntity3;
                                    f2 = _livEnt4.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) break block909;
                                if (entity instanceof Mob) {
                                    _mobEnt32 = (Mob)entity;
                                    livingEntity2 = _mobEnt32.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block908;
                            }
                            if (entity instanceof ZombietitanEntity) {
                                ZombietitanEntity zombietitanEntity = (ZombietitanEntity)entity;
                                zombietitanEntity.m_20088_().m_135381_(ZombietitanEntity.DATA_flyID, (Object)0);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity = _mobEnt3.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            float f5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt6 = (Mob)entity;
                                v28 = _mobEnt6.m_5448_();
                            } else {
                                v28 = _mobEnt32 = null;
                            }
                            if (_mobEnt32 instanceof LivingEntity) {
                                LivingEntity _livEnt3 = _mobEnt32;
                                f5 = _livEnt3.m_21223_();
                            } else {
                                f5 = -1.0f;
                            }
                            if (f5 > 0.0f) {
                                int n34;
                                if (entity instanceof ZombietitanEntity) {
                                    ZombietitanEntity _datEntI8 = (ZombietitanEntity)entity;
                                    n34 = (Integer)_datEntI8.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
                                } else {
                                    n34 = 0;
                                }
                                if (n34 == 0) {
                                    ZombietitanEntity zombietitanEntity;
                                    Mob _mobEnt4;
                                    Mob _mobEnt5;
                                    Mob _mobEnt6;
                                    Mob _mobEnt7;
                                    float f6;
                                    LivingEntity livingEntity5;
                                    float f7;
                                    Mob _mobEnt8;
                                    LivingEntity livingEntity6;
                                    float f8;
                                    LivingEntity livingEntity7;
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity7 = mob.m_5448_();
                                    } else {
                                        livingEntity7 = null;
                                    }
                                    if (livingEntity7 != null) {
                                        LivingEntity livingEntity8;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt11 = (Mob)entity;
                                            livingEntity8 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity8 = null;
                                        }
                                        f8 = entity.m_20270_(livingEntity8);
                                    } else {
                                        f8 = -1.0f;
                                    }
                                    if (f8 >= 160.0f) {
                                        entity.m_6858_(true);
                                    } else {
                                        entity.m_6858_(false);
                                    }
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity6 = mob.m_5448_();
                                    } else {
                                        livingEntity6 = null;
                                    }
                                    if (livingEntity6 != null) {
                                        LivingEntity livingEntity9;
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity9 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity9 = null;
                                        }
                                        f7 = entity.m_20270_(livingEntity9);
                                    } else {
                                        f7 = -1.0f;
                                    }
                                    if (f7 > 4.0f) {
                                        LivingEntity livingEntity10;
                                        LivingEntity livingEntity11;
                                        LivingEntity livingEntity12;
                                        LivingEntity livingEntity13;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity13 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity13 = null;
                                        }
                                        double d = livingEntity13.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt12 = (Mob)entity;
                                            livingEntity12 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity12 = null;
                                        }
                                        double d2 = livingEntity12.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity11 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity11 = null;
                                        }
                                        double d3 = d2 + (double)livingEntity11.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity10 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity10 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity10.m_20189_()));
                                    }
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity5 = mob.m_5448_();
                                    } else {
                                        livingEntity5 = null;
                                    }
                                    if (livingEntity5 != null) {
                                        LivingEntity livingEntity14;
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity14 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity14 = null;
                                        }
                                        f6 = entity.m_20270_(livingEntity14);
                                    } else {
                                        f6 = -1.0f;
                                    }
                                    if (f6 > 60.0f) {
                                        float f9;
                                        LivingEntity livingEntity15;
                                        LivingEntity livingEntity16;
                                        float f10;
                                        LivingEntity livingEntity17;
                                        LivingEntity livingEntity18;
                                        float f11;
                                        LivingEntity livingEntity19;
                                        LivingEntity livingEntity20;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt10 = (Mob)entity;
                                            livingEntity20 = _mobEnt10.m_5448_();
                                        } else {
                                            livingEntity20 = null;
                                        }
                                        double d = livingEntity20.m_20185_() - entity.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt13 = (Mob)entity;
                                            livingEntity19 = _mobEnt13.m_5448_();
                                        } else {
                                            livingEntity19 = null;
                                        }
                                        if (livingEntity19 != null) {
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
                                        double d4 = d / (double)f11 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt7 = (Mob)entity;
                                            livingEntity18 = _mobEnt7.m_5448_();
                                        } else {
                                            livingEntity18 = null;
                                        }
                                        double d5 = livingEntity18.m_20186_() - entity.m_20186_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt14 = (Mob)entity;
                                            livingEntity17 = _mobEnt14.m_5448_();
                                        } else {
                                            livingEntity17 = null;
                                        }
                                        if (livingEntity17 != null) {
                                            LivingEntity livingEntity22;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity22 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity22 = null;
                                            }
                                            f10 = entity.m_20270_(livingEntity22);
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        double d6 = d5 / (double)f10 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt7 = (Mob)entity;
                                            livingEntity16 = _mobEnt7.m_5448_();
                                        } else {
                                            livingEntity16 = null;
                                        }
                                        double d7 = livingEntity16.m_20189_() - entity.m_20189_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt15 = (Mob)entity;
                                            livingEntity15 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity15 = null;
                                        }
                                        if (livingEntity15 != null) {
                                            LivingEntity livingEntity23;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity23 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity23 = null;
                                            }
                                            f9 = entity.m_20270_(livingEntity23);
                                        } else {
                                            f9 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d4, d6, d7 / (double)f9 * 2.0));
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntSetI = (ZombietitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_flyID, (Object)1);
                                        }
                                    } else {
                                        LivingEntity livingEntity24;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity24 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity24 = null;
                                        }
                                        if (livingEntity24.m_20206_() > 8.0f) {
                                            float f12;
                                            LivingEntity livingEntity25;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt16 = (Mob)entity;
                                                livingEntity25 = _mobEnt16.m_5448_();
                                            } else {
                                                livingEntity25 = null;
                                            }
                                            if (livingEntity25 != null) {
                                                LivingEntity livingEntity26;
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity26 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity26 = null;
                                                }
                                                f12 = entity.m_20270_(livingEntity26);
                                            } else {
                                                f12 = -1.0f;
                                            }
                                            if (f12 > 28.0f) {
                                                float f13;
                                                LivingEntity livingEntity27;
                                                LivingEntity livingEntity28;
                                                float f14;
                                                LivingEntity livingEntity29;
                                                LivingEntity livingEntity30;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt9 = (Mob)entity;
                                                    livingEntity30 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity30 = null;
                                                }
                                                double d = livingEntity30.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt82 = (Mob)entity;
                                                    livingEntity29 = _mobEnt82.m_5448_();
                                                } else {
                                                    livingEntity29 = null;
                                                }
                                                if (livingEntity29 != null) {
                                                    LivingEntity livingEntity31;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt72 = (Mob)entity;
                                                        livingEntity31 = _mobEnt72.m_5448_();
                                                    } else {
                                                        livingEntity31 = null;
                                                    }
                                                    f14 = entity.m_20270_(livingEntity31);
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                double d8 = d / (double)f14 * 0.6;
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity28 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity28 = null;
                                                }
                                                double d9 = livingEntity28.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity27 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity27 = null;
                                                }
                                                if (livingEntity27 != null) {
                                                    LivingEntity livingEntity32;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity32 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity32 = null;
                                                    }
                                                    f13 = entity.m_20270_(livingEntity32);
                                                } else {
                                                    f13 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f13 * 0.6));
                                            }
                                        } else {
                                            float f15;
                                            LivingEntity livingEntity33;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt17 = (Mob)entity;
                                                livingEntity33 = _mobEnt17.m_5448_();
                                            } else {
                                                livingEntity33 = null;
                                            }
                                            if (livingEntity33 != null) {
                                                LivingEntity livingEntity34;
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity34 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity34 = null;
                                                }
                                                f15 = entity.m_20270_(livingEntity34);
                                            } else {
                                                f15 = -1.0f;
                                            }
                                            if (f15 > 8.0f) {
                                                float f16;
                                                LivingEntity livingEntity35;
                                                LivingEntity livingEntity36;
                                                float f17;
                                                LivingEntity livingEntity37;
                                                LivingEntity livingEntity38;
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity38 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity38 = null;
                                                }
                                                double d = livingEntity38.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity37 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity37 = null;
                                                }
                                                if (livingEntity37 != null) {
                                                    LivingEntity livingEntity39;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity39 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity39 = null;
                                                    }
                                                    f17 = entity.m_20270_(livingEntity39);
                                                } else {
                                                    f17 = -1.0f;
                                                }
                                                double d10 = d / (double)f17 * 0.6;
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity36 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity36 = null;
                                                }
                                                double d11 = livingEntity36.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity35 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity35 = null;
                                                }
                                                if (livingEntity35 != null) {
                                                    LivingEntity livingEntity40;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity40 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity40 = null;
                                                    }
                                                    f16 = entity.m_20270_(livingEntity40);
                                                } else {
                                                    f16 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f16 * 0.6));
                                            }
                                        }
                                        if (entity instanceof ZombietitanEntity) {
                                            _datEntSetI = (ZombietitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_flyID, (Object)0);
                                        }
                                    }
                                    if (!(entity instanceof ZombietitanEntity && (Boolean)(zombietitanEntity = (ZombietitanEntity)entity).m_20088_().m_135370_(ZombietitanEntity.DATA_sword) != false)) {
                                        if (entity instanceof ZombietitanEntity) {
                                            ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)10);
                                        }
                                    } else {
                                        float f18;
                                        LivingEntity livingEntity41;
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity41 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity41 = null;
                                        }
                                        if (livingEntity41 != null) {
                                            LivingEntity livingEntity42;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity42 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity42 = null;
                                            }
                                            f18 = entity.m_20270_(livingEntity42);
                                        } else {
                                            f18 = -1.0f;
                                        }
                                        if (f18 < 512.0f) {
                                            float f19;
                                            LivingEntity livingEntity43;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt18 = (Mob)entity;
                                                livingEntity43 = _mobEnt18.m_5448_();
                                            } else {
                                                livingEntity43 = null;
                                            }
                                            if (livingEntity43 != null) {
                                                LivingEntity livingEntity44;
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity44 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity44 = null;
                                                }
                                                f19 = entity.m_20270_(livingEntity44);
                                            } else {
                                                f19 = -1.0f;
                                            }
                                            if (f19 <= 35.0f) {
                                                LivingEntity livingEntity45;
                                                if (entity instanceof Mob) {
                                                    _mobEnt4 = (Mob)entity;
                                                    livingEntity45 = _mobEnt4.m_5448_();
                                                } else {
                                                    livingEntity45 = null;
                                                }
                                                if (livingEntity45.m_20206_() > 6.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)8) == 8) {
                                                        if (entity instanceof ZombietitanEntity) {
                                                            _datEntSetI = (ZombietitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
                                                        }
                                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)8) == 7) {
                                                        if (entity instanceof ZombietitanEntity) {
                                                            _datEntSetI = (ZombietitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)3);
                                                        }
                                                    } else if (entity instanceof ZombietitanEntity) {
                                                        _datEntSetI = (ZombietitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)4);
                                                    }
                                                } else if (entity instanceof ZombietitanEntity) {
                                                    _datEntSetI = (ZombietitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                }
                                            }
                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)20) == 5) {
                                                int n35;
                                                if (entity instanceof ZombietitanEntity) {
                                                    ZombietitanEntity _datEntI9 = (ZombietitanEntity)entity;
                                                    n35 = (Integer)_datEntI9.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
                                                } else {
                                                    n35 = 0;
                                                }
                                                if (n35 == 0) {
                                                    float f20;
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
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity47 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity47 = null;
                                                        }
                                                        f20 = entity.m_20270_(livingEntity47);
                                                    } else {
                                                        f20 = -1.0f;
                                                    }
                                                    if (f20 > 50.0f) {
                                                        LivingEntity livingEntity48;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt5 = (Mob)entity;
                                                            livingEntity48 = _mobEnt5.m_5448_();
                                                        } else {
                                                            livingEntity48 = null;
                                                        }
                                                        if (livingEntity48.m_20206_() > 6.0f) {
                                                            if (entity instanceof ZombietitanEntity) {
                                                                _datEntSetI = (ZombietitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                                            }
                                                        } else if (entity instanceof ZombietitanEntity) {
                                                            _datEntSetI = (ZombietitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                                        }
                                                    } else {
                                                        float f21;
                                                        LivingEntity livingEntity49;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt5 = (Mob)entity;
                                                            livingEntity49 = _mobEnt5.m_5448_();
                                                        } else {
                                                            livingEntity49 = null;
                                                        }
                                                        if (livingEntity49 != null) {
                                                            LivingEntity livingEntity50;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt6 = (Mob)entity;
                                                                livingEntity50 = _mobEnt6.m_5448_();
                                                            } else {
                                                                livingEntity50 = null;
                                                            }
                                                            f21 = entity.m_20270_(livingEntity50);
                                                        } else {
                                                            f21 = -1.0f;
                                                        }
                                                        if (f21 > 32.0f) {
                                                            LivingEntity livingEntity51;
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt19 = (Mob)entity;
                                                                livingEntity51 = _mobEnt19.m_5448_();
                                                            } else {
                                                                livingEntity51 = null;
                                                            }
                                                            if (livingEntity51.m_20206_() > 6.0f) {
                                                                if (entity instanceof ZombietitanEntity) {
                                                                    _datEntSetI = (ZombietitanEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)9));
                                                                }
                                                            } else if (entity instanceof ZombietitanEntity) {
                                                                _datEntSetI = (ZombietitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)9));
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
                        LivingEntity _livEnt4 = (LivingEntity)entity;
                        f = _livEnt4.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= 0.0f) {
                        int n36;
                        if (entity instanceof Mob) {
                            _entity = (Mob)entity;
                            _entity.m_6710_(null);
                        }
                        if (entity instanceof ZombietitanEntity) {
                            _datEntI4 = (ZombietitanEntity)entity;
                            n36 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
                        } else {
                            n36 = 0;
                        }
                        if (n36 == 0) {
                            int n37;
                            int n38;
                            int n39;
                            int n40;
                            int n41;
                            if (entity instanceof ZombietitanEntity) {
                                int n42;
                                ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                if (entity instanceof ZombietitanEntity) {
                                    _datEntI5 = (ZombietitanEntity)entity;
                                    n42 = (Integer)_datEntI5.m_20088_().m_135370_(ZombietitanEntity.DATA_deathTick);
                                } else {
                                    n42 = 0;
                                }
                                synchedEntityData.m_135381_(ZombietitanEntity.DATA_deathTick, (Object)(n42 + 1));
                            }
                            if (entity instanceof ZombietitanEntity) {
                                ZombietitanEntity _datEntI10 = (ZombietitanEntity)entity;
                                n41 = (Integer)_datEntI10.m_20088_().m_135370_(ZombietitanEntity.DATA_deathTick);
                            } else {
                                n41 = 0;
                            }
                            if (n41 == 1 && world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:zombietitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:zombietitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof ZombietitanEntity) {
                                ZombietitanEntity _datEntI11 = (ZombietitanEntity)entity;
                                n40 = (Integer)_datEntI11.m_20088_().m_135370_(ZombietitanEntity.DATA_deathTick);
                            } else {
                                n40 = 0;
                            }
                            if (n40 < 3) {
                                for (int index1 = 0; index1 < 12; ++index1) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof ZombietitanEntity) {
                                ZombietitanEntity _datEntI12 = (ZombietitanEntity)entity;
                                n39 = (Integer)_datEntI12.m_20088_().m_135370_(ZombietitanEntity.DATA_deathTick);
                            } else {
                                n39 = 0;
                            }
                            if (n39 < 10 && entity instanceof ZombietitanEntity) {
                                ((ZombietitanEntity)entity).setAnimation("death");
                            }
                            if (entity instanceof ZombietitanEntity) {
                                ZombietitanEntity _datEntI13 = (ZombietitanEntity)entity;
                                n38 = (Integer)_datEntI13.m_20088_().m_135370_(ZombietitanEntity.DATA_deathTick);
                            } else {
                                n38 = 0;
                            }
                            if (n38 == 760) {
                                if (world instanceof ServerLevel) {
                                    ServerLevel _level = (ServerLevel)world;
                                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"zombietitan\"'}");
                                }
                                for (int index2 = 0; index2 < 320; ++index2) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                }
                            }
                            if (entity instanceof ZombietitanEntity) {
                                ZombietitanEntity _datEntI14 = (ZombietitanEntity)entity;
                                n37 = (Integer)_datEntI14.m_20088_().m_135370_(ZombietitanEntity.DATA_deathTick);
                            } else {
                                n37 = 0;
                            }
                            if (n37 >= 760 && !entity.m_9236_().m_5776_()) {
                                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                            }
                        }
                    }
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI3 = (ZombietitanEntity)entity;
                        n14 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
                    } else {
                        n14 = 0;
                    }
                    if (n14 != true) break block910;
                    if (entity instanceof ZombietitanEntity) {
                        ((ZombietitanEntity)entity).setAnimation("treadling");
                    }
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI4 = (ZombietitanEntity)entity;
                        n13 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
                    } else {
                        n13 = 0;
                    }
                    if (n13 == 1) {
                        float f22;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            Mob _mobEnt20 = (Mob)entity;
                            livingEntity = _mobEnt20.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity52;
                            if (entity instanceof Mob) {
                                Mob _mobEnt21 = (Mob)entity;
                                livingEntity52 = _mobEnt21.m_5448_();
                            } else {
                                livingEntity52 = null;
                            }
                            f22 = entity.m_20270_(livingEntity52);
                        } else {
                            f22 = -1.0f;
                        }
                        if (f22 > 1.0f) {
                            LivingEntity livingEntity53;
                            LivingEntity livingEntity54;
                            LivingEntity livingEntity55;
                            LivingEntity livingEntity56;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity56 = _mobEnt.m_5448_();
                            } else {
                                livingEntity56 = null;
                            }
                            double d = livingEntity56.m_20185_();
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity55 = mob.m_5448_();
                            } else {
                                livingEntity55 = null;
                            }
                            double d12 = livingEntity55.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity54 = _mobEnt.m_5448_();
                            } else {
                                livingEntity54 = null;
                            }
                            double d13 = d12 + (double)livingEntity54.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity53 = _mobEnt.m_5448_();
                            } else {
                                livingEntity53 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d13, livingEntity53.m_20189_()));
                        }
                    }
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI4 = (ZombietitanEntity)entity;
                        n12 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
                    } else {
                        n12 = 0;
                    }
                    if (n12 == 95) break block911;
                    if (entity instanceof ZombietitanEntity) {
                        ZombietitanEntity _datEntI15 = (ZombietitanEntity)entity;
                        n11 = (Integer)_datEntI15.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
                    } else {
                        n11 = 0;
                    }
                    if (n11 != 165) break block912;
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
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n43;
                    float f;
                    float f23;
                    int n44;
                    float f24;
                    float f25;
                    int n45;
                    float f26;
                    int n46;
                    float f27;
                    LivingEntity _livEnt5;
                    int n47;
                    float f28;
                    if (entityiterator instanceof ZombietitanEntity || entityiterator instanceof Zombie || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt6 = (LivingEntity)entityiterator;
                        f28 = _livEnt6.m_21233_();
                    } else {
                        f28 = -1.0f;
                    }
                    float f29 = f28 / 20.0f + 1200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        ZombietitanEntity _datEntI22 = (ZombietitanEntity)entity;
                        n47 = (Integer)_datEntI22.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n47 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f29 + (float)(n47 * 10));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator;
                        f27 = _livEnt5.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    float f30 = f27 / 20.0f + 1200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI2 = (ZombietitanEntity)entity;
                        n46 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n46 = 0;
                    }
                    entityiterator.m_6469_(damageSource2, f30 + (float)(n46 * 10));
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator;
                        f26 = _livEnt5.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    float f31 = f26 / 20.0f + 1200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI2 = (ZombietitanEntity)entity;
                        n45 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n45 = 0;
                    }
                    entityiterator.m_6469_(damageSource3, f31 + (float)(n45 * 10));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt22 = (LivingEntity)entityiterator;
                        f25 = _livEnt22.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator;
                        f24 = _livEnt5.m_21223_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f32 = (f25 + f24) / 5.0f + 12000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI2 = (ZombietitanEntity)entity;
                        n44 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n44 = 0;
                    }
                    entityiterator.m_6469_(damageSource4, f32 + (float)(n44 * 100));
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f23 = _livEnt2.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator;
                        f = _livEnt5.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f33 = (f23 + f) / 5.0f + 12000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI2 = (ZombietitanEntity)entity;
                        n43 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n43 = 0;
                    }
                    entityiterator.m_6469_(damageSource5, f33 + (float)(n43 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n10 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n10 = 0;
            }
            if (n10 >= 200) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n9 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n9 = 0;
        }
        if (n9 == 2) {
            int n48;
            int n49;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("kick");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity57;
                if (entity instanceof Mob) {
                    Mob _mobEnt22 = (Mob)entity;
                    livingEntity57 = _mobEnt22.m_5448_();
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
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity61 = _mobEnt23.m_5448_();
                } else {
                    livingEntity61 = null;
                }
                double d = livingEntity61.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity60 = _mobEnt.m_5448_();
                } else {
                    livingEntity60 = null;
                }
                double d14 = livingEntity60.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt24 = (Mob)entity;
                    livingEntity59 = _mobEnt24.m_5448_();
                } else {
                    livingEntity59 = null;
                }
                double d15 = d14 + (double)livingEntity59.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt25 = (Mob)entity;
                    livingEntity58 = _mobEnt25.m_5448_();
                } else {
                    livingEntity58 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d15, livingEntity58.m_20189_()));
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n49 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n49 = 0;
            }
            if (n49 == 42) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity2 : _entfound3) {
                    int n50;
                    float f34;
                    float f35;
                    int n51;
                    float f36;
                    float f37;
                    int n52;
                    float f38;
                    int n53;
                    float f39;
                    int n54;
                    float f40;
                    if (entity2 instanceof ZombietitanEntity || entity2 instanceof Zombie || !(entity2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f40 = _livEnt.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    float f41 = f40 / 20.0f + 2400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n54 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n54 = 0;
                    }
                    entity2.m_6469_(damageSource, f41 + (float)(n54 * 10));
                    if (entity2 instanceof Titangodentity) continue;
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f39 = _livEnt.m_21233_();
                    } else {
                        f39 = -1.0f;
                    }
                    float f42 = f39 / 20.0f + 2400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n53 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n53 = 0;
                    }
                    entity2.m_6469_(damageSource6, f42 + (float)(n53 * 10));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f38 = _livEnt.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    float f43 = f38 / 20.0f + 2400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n52 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n52 = 0;
                    }
                    entity2.m_6469_(damageSource7, f43 + (float)(n52 * 10));
                    entity2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entity2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entity2;
                        f37 = _livEnt7.m_21233_();
                    } else {
                        f37 = -1.0f;
                    }
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f36 = _livEnt.m_21223_();
                    } else {
                        f36 = -1.0f;
                    }
                    float f44 = (f37 + f36) / 5.0f + 24000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n51 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n51 = 0;
                    }
                    entity2.m_6469_(damageSource8, f44 + (float)(n51 * 100));
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        LivingEntity _livEnt6 = (LivingEntity)entity2;
                        f35 = _livEnt6.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f34 = _livEnt.m_21223_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f45 = (f35 + f34) / 5.0f + 24000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n50 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n50 = 0;
                    }
                    entity2.m_6469_(damageSource9, f45 + (float)(n50 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n48 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 >= 62) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n8 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n8 = 0;
        }
        if (n8 == 3) {
            int n55;
            int n56;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("swept");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity62;
                if (entity instanceof Mob) {
                    Mob _mobEnt26 = (Mob)entity;
                    livingEntity62 = _mobEnt26.m_5448_();
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
                    Mob _mobEnt27 = (Mob)entity;
                    livingEntity66 = _mobEnt27.m_5448_();
                } else {
                    livingEntity66 = null;
                }
                double d = livingEntity66.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity65 = _mobEnt.m_5448_();
                } else {
                    livingEntity65 = null;
                }
                double d16 = livingEntity65.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt28 = (Mob)entity;
                    livingEntity64 = _mobEnt28.m_5448_();
                } else {
                    livingEntity64 = null;
                }
                double d17 = d16 + (double)livingEntity64.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt29 = (Mob)entity;
                    livingEntity63 = _mobEnt29.m_5448_();
                } else {
                    livingEntity63 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity63.m_20189_()));
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n56 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 >= 132) {
                int n57;
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntI16 = (ZombietitanEntity)entity;
                    n57 = (Integer)_datEntI16.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
                } else {
                    n57 = 0;
                }
                if (n57 <= 142) {
                    if (world instanceof Level) {
                        Level _level = (Level)world;
                        if (!_level.m_5776_()) {
                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                        } else {
                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                        }
                    }
                    Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82481_ * 16.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        int n58;
                        float f46;
                        float f47;
                        int n59;
                        float f48;
                        float f49;
                        int n60;
                        float f50;
                        int n61;
                        float f51;
                        LivingEntity _livEnt7;
                        int n62;
                        float f52;
                        if (entityiterator instanceof ZombietitanEntity || entityiterator instanceof Zombie || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt8 = (LivingEntity)entityiterator;
                            f52 = _livEnt8.m_21233_();
                        } else {
                            f52 = -1.0f;
                        }
                        float f53 = f52 / 20.0f + 4800.0f;
                        if (entity instanceof ZombietitanEntity) {
                            _datEntI2 = (ZombietitanEntity)entity;
                            n62 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                        } else {
                            n62 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f53 + (float)(n62 * 10));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            Deathlist.normalattack(entityiterator);
                        }
                        if (!(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                        }
                        DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f51 = _livEnt7.m_21233_();
                        } else {
                            f51 = -1.0f;
                        }
                        float f54 = f51 / 20.0f + 4800.0f;
                        if (entity instanceof ZombietitanEntity) {
                            _datEntI2 = (ZombietitanEntity)entity;
                            n61 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                        } else {
                            n61 = 0;
                        }
                        entityiterator.m_6469_(damageSource10, f54 + (float)(n61 * 10));
                        DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f50 = _livEnt7.m_21233_();
                        } else {
                            f50 = -1.0f;
                        }
                        float f55 = f50 / 20.0f + 4800.0f;
                        if (entity instanceof ZombietitanEntity) {
                            _datEntI2 = (ZombietitanEntity)entity;
                            n60 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                        } else {
                            n60 = 0;
                        }
                        entityiterator.m_6469_(damageSource11, f55 + (float)(n60 * 10));
                        entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f49 = _livEnt2.m_21233_();
                        } else {
                            f49 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f48 = _livEnt7.m_21223_();
                        } else {
                            f48 = -1.0f;
                        }
                        float f56 = (f49 + f48) / 5.0f + 48000.0f;
                        if (entity instanceof ZombietitanEntity) {
                            _datEntI2 = (ZombietitanEntity)entity;
                            n59 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                        } else {
                            n59 = 0;
                        }
                        entityiterator.m_6469_(damageSource12, f56 + (float)(n59 * 100));
                        DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f47 = _livEnt2.m_21233_();
                        } else {
                            f47 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt7 = (LivingEntity)entityiterator;
                            f46 = _livEnt7.m_21223_();
                        } else {
                            f46 = -1.0f;
                        }
                        float f57 = (f47 + f46) / 5.0f + 48000.0f;
                        if (entity instanceof ZombietitanEntity) {
                            _datEntI2 = (ZombietitanEntity)entity;
                            n58 = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                        } else {
                            n58 = 0;
                        }
                        entityiterator.m_6469_(damageSource13, f57 + (float)(n58 * 100));
                    }
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n55 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 >= 190) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n7 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n7 = 0;
        }
        if (n7 == 4) {
            int n63;
            int n64;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity67;
                if (entity instanceof Mob) {
                    Mob _mobEnt30 = (Mob)entity;
                    livingEntity67 = _mobEnt30.m_5448_();
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
                    Mob _mobEnt31 = (Mob)entity;
                    livingEntity71 = _mobEnt31.m_5448_();
                } else {
                    livingEntity71 = null;
                }
                double d = livingEntity71.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity70 = _mobEnt.m_5448_();
                } else {
                    livingEntity70 = null;
                }
                double d18 = livingEntity70.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt32 = (Mob)entity;
                    livingEntity69 = _mobEnt32.m_5448_();
                } else {
                    livingEntity69 = null;
                }
                double d19 = d18 + (double)livingEntity69.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt33 = (Mob)entity;
                    livingEntity68 = _mobEnt33.m_5448_();
                } else {
                    livingEntity68 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d19, livingEntity68.m_20189_()));
            }
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("attack");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("attack2");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("attack3");
                }
            } else if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("attack4");
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n64 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n64 = 0;
            }
            if (n64 == 20) {
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
                for (Entity entity3 : _entfound4) {
                    int n65;
                    float f58;
                    float f59;
                    int n66;
                    float f60;
                    float f61;
                    int n67;
                    float f62;
                    int n68;
                    float f63;
                    int n69;
                    float f64;
                    if (entity3 instanceof ZombietitanEntity || entity3 instanceof Zombie || !(entity3 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f64 = _livEnt.m_21233_();
                    } else {
                        f64 = -1.0f;
                    }
                    float f65 = f64 / 20.0f + 4800.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n69 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n69 = 0;
                    }
                    entity3.m_6469_(damageSource, f65 + (float)(n69 * 10));
                    if (entity3 instanceof Titangodentity) continue;
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f63 = _livEnt.m_21233_();
                    } else {
                        f63 = -1.0f;
                    }
                    float f66 = f63 / 20.0f + 4800.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n68 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n68 = 0;
                    }
                    entity3.m_6469_(damageSource14, f66 + (float)(n68 * 10));
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f62 = _livEnt.m_21233_();
                    } else {
                        f62 = -1.0f;
                    }
                    float f67 = f62 / 20.0f + 4800.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n67 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n67 = 0;
                    }
                    entity3.m_6469_(damageSource15, f67 + (float)(n67 * 10));
                    if (!(entity3.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entity3;
                        f61 = _livEnt9.m_21233_();
                    } else {
                        f61 = -1.0f;
                    }
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f60 = _livEnt.m_21223_();
                    } else {
                        f60 = -1.0f;
                    }
                    float f68 = (f61 + f60) / 5.0f + 48000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n66 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n66 = 0;
                    }
                    entity3.m_6469_(damageSource16, f68 + (float)(n66 * 100));
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entity3;
                        f59 = _livEnt8.m_21233_();
                    } else {
                        f59 = -1.0f;
                    }
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f58 = _livEnt.m_21223_();
                    } else {
                        f58 = -1.0f;
                    }
                    float f69 = (f59 + f58) / 5.0f + 48000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n65 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n65 = 0;
                    }
                    entity3.m_6469_(damageSource17, f69 + (float)(n65 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n63 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n63 = 0;
            }
            if (n63 >= 30) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n6 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 5) {
            int n70;
            int n71;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("smashwithallmight");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity72;
                if (entity instanceof Mob) {
                    Mob _mobEnt34 = (Mob)entity;
                    livingEntity72 = _mobEnt34.m_5448_();
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
                    Mob _mobEnt35 = (Mob)entity;
                    livingEntity76 = _mobEnt35.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                double d = livingEntity76.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity75 = _mobEnt.m_5448_();
                } else {
                    livingEntity75 = null;
                }
                double d20 = livingEntity75.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt36 = (Mob)entity;
                    livingEntity74 = _mobEnt36.m_5448_();
                } else {
                    livingEntity74 = null;
                }
                double d21 = d20 + (double)livingEntity74.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt37 = (Mob)entity;
                    livingEntity73 = _mobEnt37.m_5448_();
                } else {
                    livingEntity73 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d21, livingEntity73.m_20189_()));
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n71 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n71 = 0;
            }
            if (n71 == 40) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity4 : _entfound5) {
                    int n72;
                    float f70;
                    float f71;
                    int n73;
                    float f72;
                    float f73;
                    int n74;
                    float f74;
                    int n75;
                    float f75;
                    int n76;
                    float f76;
                    if (entity4 instanceof ZombietitanEntity || entity4 instanceof Zombie || !(entity4 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f76 = _livEnt.m_21233_();
                    } else {
                        f76 = -1.0f;
                    }
                    float f77 = f76 / 20.0f + 7200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n76 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n76 = 0;
                    }
                    entity4.m_6469_(damageSource, f77 + (float)(n76 * 10));
                    if (entity4 instanceof Titangodentity) continue;
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f75 = _livEnt.m_21233_();
                    } else {
                        f75 = -1.0f;
                    }
                    float f78 = f75 / 20.0f + 7200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n75 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n75 = 0;
                    }
                    entity4.m_6469_(damageSource18, f78 + (float)(n75 * 10));
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f74 = _livEnt.m_21233_();
                    } else {
                        f74 = -1.0f;
                    }
                    float f79 = f74 / 20.0f + 7200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n74 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n74 = 0;
                    }
                    entity4.m_6469_(damageSource19, f79 + (float)(n74 * 10));
                    if (!(entity4.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        LivingEntity _livEnt10 = (LivingEntity)entity4;
                        f73 = _livEnt10.m_21233_();
                    } else {
                        f73 = -1.0f;
                    }
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f72 = _livEnt.m_21223_();
                    } else {
                        f72 = -1.0f;
                    }
                    float f80 = (f73 + f72) / 5.0f + 72000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n73 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n73 = 0;
                    }
                    entity4.m_6469_(damageSource20, f80 + (float)(n73 * 100));
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entity4;
                        f71 = _livEnt9.m_21233_();
                    } else {
                        f71 = -1.0f;
                    }
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f70 = _livEnt.m_21223_();
                    } else {
                        f70 = -1.0f;
                    }
                    float f81 = (f71 + f70) / 5.0f + 72000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n72 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n72 = 0;
                    }
                    entity4.m_6469_(damageSource21, f81 + (float)(n72 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n70 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n70 = 0;
            }
            if (n70 >= 65) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n5 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 6) {
            int n77;
            int n78;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("lightningbolt");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity77;
                if (entity instanceof Mob) {
                    Mob _mobEnt38 = (Mob)entity;
                    livingEntity77 = _mobEnt38.m_5448_();
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
                    Mob _mobEnt39 = (Mob)entity;
                    livingEntity81 = _mobEnt39.m_5448_();
                } else {
                    livingEntity81 = null;
                }
                double d = livingEntity81.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity80 = _mobEnt.m_5448_();
                } else {
                    livingEntity80 = null;
                }
                double d22 = livingEntity80.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt40 = (Mob)entity;
                    livingEntity79 = _mobEnt40.m_5448_();
                } else {
                    livingEntity79 = null;
                }
                double d23 = d22 + (double)livingEntity79.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt41 = (Mob)entity;
                    livingEntity78 = _mobEnt41.m_5448_();
                } else {
                    livingEntity78 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d23, livingEntity78.m_20189_()));
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n78 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n78 = 0;
            }
            if (n78 == 100) {
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
                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.GREENLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound6 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity5 : _entfound6) {
                    int n79;
                    float f82;
                    float f83;
                    int n80;
                    float f84;
                    float f85;
                    int n81;
                    float f86;
                    int n82;
                    float f87;
                    int n83;
                    float f88;
                    if (entity5 instanceof ZombietitanEntity || entity5 instanceof Zombie || !(entity5 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f88 = _livEnt.m_21233_();
                    } else {
                        f88 = -1.0f;
                    }
                    float f89 = f88 / 20.0f + 7200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n83 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n83 = 0;
                    }
                    entity5.m_6469_(damageSource, f89 + (float)(n83 * 10));
                    if (entity5 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity5 instanceof Player)) {
                        entity5.f_19802_ = 0;
                        Deathlist.normalattack(entity5);
                    }
                    DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f87 = _livEnt.m_21233_();
                    } else {
                        f87 = -1.0f;
                    }
                    float f90 = f87 / 20.0f + 7200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n82 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n82 = 0;
                    }
                    entity5.m_6469_(damageSource22, f90 + (float)(n82 * 10));
                    DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f86 = _livEnt.m_21233_();
                    } else {
                        f86 = -1.0f;
                    }
                    float f91 = f86 / 20.0f + 7200.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n81 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n81 = 0;
                    }
                    entity5.m_6469_(damageSource23, f91 + (float)(n81 * 10));
                    entity5.m_20256_(new Vec3(0.0, 3.0, 0.0));
                    if (!(entity5.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entity5;
                        f85 = _livEnt11.m_21233_();
                    } else {
                        f85 = -1.0f;
                    }
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f84 = _livEnt.m_21223_();
                    } else {
                        f84 = -1.0f;
                    }
                    float f92 = (f85 + f84) / 5.0f + 72000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n80 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n80 = 0;
                    }
                    entity5.m_6469_(damageSource24, f92 + (float)(n80 * 100));
                    DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        LivingEntity _livEnt10 = (LivingEntity)entity5;
                        f83 = _livEnt10.m_21233_();
                    } else {
                        f83 = -1.0f;
                    }
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f82 = _livEnt.m_21223_();
                    } else {
                        f82 = -1.0f;
                    }
                    float f93 = (f83 + f82) / 5.0f + 72000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n79 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n79 = 0;
                    }
                    entity5.m_6469_(damageSource25, f93 + (float)(n79 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n77 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n77 = 0;
            }
            if (n77 >= 120) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n4 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 8) {
            int n84;
            int n85;
            int n86;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("slash");
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n86 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n86 = 0;
            }
            if (n86 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt42 = (Mob)entity;
                    livingEntity = _mobEnt42.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity82;
                    if (entity instanceof Mob) {
                        Mob _mobEnt43 = (Mob)entity;
                        livingEntity82 = _mobEnt43.m_5448_();
                    } else {
                        livingEntity82 = null;
                    }
                    f = entity.m_20270_(livingEntity82);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity83;
                    LivingEntity livingEntity84;
                    LivingEntity livingEntity85;
                    LivingEntity livingEntity86;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity86 = _mobEnt.m_5448_();
                    } else {
                        livingEntity86 = null;
                    }
                    double d = livingEntity86.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity85 = mob.m_5448_();
                    } else {
                        livingEntity85 = null;
                    }
                    double d24 = livingEntity85.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity84 = _mobEnt.m_5448_();
                    } else {
                        livingEntity84 = null;
                    }
                    double d25 = d24 + (double)livingEntity84.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity83 = _mobEnt.m_5448_();
                    } else {
                        livingEntity83 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d25, livingEntity83.m_20189_()));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n85 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n85 = 0;
            }
            if (n85 == 160) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                List<Entity> _entfound7 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity6 : _entfound7) {
                    int n87;
                    float f;
                    float f94;
                    int n88;
                    float f95;
                    float f96;
                    int n89;
                    float f97;
                    int n90;
                    float f98;
                    int n91;
                    float f99;
                    if (entity6 instanceof ZombietitanEntity || entity6 instanceof Zombie || !(entity6 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f99 = _livEnt.m_21233_();
                    } else {
                        f99 = -1.0f;
                    }
                    float f100 = f99 / 10.0f + 12000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n91 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n91 = 0;
                    }
                    entity6.m_6469_(damageSource, f100 + (float)(n91 * 10));
                    if (entity6 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity6 instanceof Player)) {
                        entity6.f_19802_ = 0;
                        Deathlist.normalattack(entity6);
                    }
                    DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f98 = _livEnt.m_21233_();
                    } else {
                        f98 = -1.0f;
                    }
                    float f101 = f98 / 10.0f + 12000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n90 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n90 = 0;
                    }
                    entity6.m_6469_(damageSource26, f101 + (float)(n90 * 10));
                    DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f97 = _livEnt.m_21233_();
                    } else {
                        f97 = -1.0f;
                    }
                    float f102 = f97 / 10.0f + 12000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n89 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n89 = 0;
                    }
                    entity6.m_6469_(damageSource27, f102 + (float)(n89 * 10));
                    entity6.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity6.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        LivingEntity _livEnt12 = (LivingEntity)entity6;
                        f96 = _livEnt12.m_21233_();
                    } else {
                        f96 = -1.0f;
                    }
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f95 = _livEnt.m_21223_();
                    } else {
                        f95 = -1.0f;
                    }
                    float f103 = (f96 + f95) / 5.0f + 120000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n88 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n88 = 0;
                    }
                    entity6.m_6469_(damageSource28, f103 + (float)(n88 * 100));
                    DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entity6;
                        f94 = _livEnt11.m_21233_();
                    } else {
                        f94 = -1.0f;
                    }
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f104 = (f94 + f) / 5.0f + 120000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n87 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n87 = 0;
                    }
                    entity6.m_6469_(damageSource29, f104 + (float)(n87 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n84 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n84 = 0;
            }
            if (n84 >= 270) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n3 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 7) {
            int n92;
            int n93;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("masterball");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity87;
                if (entity instanceof Mob) {
                    Mob _mobEnt44 = (Mob)entity;
                    livingEntity87 = _mobEnt44.m_5448_();
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
                    Mob _mobEnt45 = (Mob)entity;
                    livingEntity91 = _mobEnt45.m_5448_();
                } else {
                    livingEntity91 = null;
                }
                double d = livingEntity91.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity90 = _mobEnt.m_5448_();
                } else {
                    livingEntity90 = null;
                }
                double d26 = livingEntity90.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt46 = (Mob)entity;
                    livingEntity89 = _mobEnt46.m_5448_();
                } else {
                    livingEntity89 = null;
                }
                double d27 = d26 + (double)livingEntity89.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt47 = (Mob)entity;
                    livingEntity88 = _mobEnt47.m_5448_();
                } else {
                    livingEntity88 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d27, livingEntity88.m_20189_()));
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n93 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n93 = 0;
            }
            if (n93 == 85) {
                float f105;
                LivingEntity livingEntity92;
                if (entity instanceof Mob) {
                    Mob _mobEnt48 = (Mob)entity;
                    livingEntity92 = _mobEnt48.m_5448_();
                } else {
                    livingEntity92 = null;
                }
                if (livingEntity92 != null) {
                    LivingEntity livingEntity93;
                    if (entity instanceof Mob) {
                        Mob _mobEnt49 = (Mob)entity;
                        livingEntity93 = _mobEnt49.m_5448_();
                    } else {
                        livingEntity93 = null;
                    }
                    f105 = entity.m_20270_(livingEntity93);
                } else {
                    f105 = -1.0f;
                }
                if (f105 > 1.0f) {
                    for (int index4 = 0; index4 < 4; ++index4) {
                        LivingEntity livingEntity94;
                        LivingEntity livingEntity95;
                        LivingEntity livingEntity96;
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel serverLevel = (ServerLevel)world;
                        _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                MasterballEntity entityToSpawn = new MasterballEntity((EntityType<? extends MasterballEntity>)((EntityType)UltimateskeletonsModEntities.MASTERBALL.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)serverLevel, entity, 100.0f, 1);
                        _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 22.0, z + entity.m_20154_().f_82481_ * 24.0);
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity96 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity96 = null;
                        }
                        double d = livingEntity96.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity95 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity95 = null;
                        }
                        double d28 = livingEntity95.m_20186_() - 22.0 - entity.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity94 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity94 = null;
                        }
                        _entityToSpawn.m_6686_(d, d28, livingEntity94.m_20189_() - entity.m_20189_(), 3.0f, 24.0f);
                        serverLevel.m_7967_((Entity)_entityToSpawn);
                    }
                } else {
                    for (int index5 = 0; index5 < 4; ++index5) {
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel serverLevel = (ServerLevel)world;
                        _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                MasterballEntity entityToSpawn = new MasterballEntity((EntityType<? extends MasterballEntity>)((EntityType)UltimateskeletonsModEntities.MASTERBALL.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)serverLevel, entity, 100.0f, 1);
                        _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 22.0, z + entity.m_20154_().f_82481_ * 24.0);
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 3.0f, 24.0f);
                        serverLevel.m_7967_((Entity)_entityToSpawn);
                    }
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n92 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n92 = 0;
            }
            if (n92 >= 125) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n2 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 9) {
            int n94;
            int n95;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("zombieapocalypse");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity97;
                if (entity instanceof Mob) {
                    Mob _mobEnt50 = (Mob)entity;
                    livingEntity97 = _mobEnt50.m_5448_();
                } else {
                    livingEntity97 = null;
                }
                f = entity.m_20270_(livingEntity97);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity98;
                LivingEntity livingEntity99;
                LivingEntity livingEntity100;
                LivingEntity livingEntity101;
                if (entity instanceof Mob) {
                    Mob _mobEnt51 = (Mob)entity;
                    livingEntity101 = _mobEnt51.m_5448_();
                } else {
                    livingEntity101 = null;
                }
                double d = livingEntity101.m_20185_();
                if (entity instanceof Mob) {
                    Mob _mobEnt52 = (Mob)entity;
                    livingEntity100 = _mobEnt52.m_5448_();
                } else {
                    livingEntity100 = null;
                }
                double d29 = livingEntity100.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt53 = (Mob)entity;
                    livingEntity99 = _mobEnt53.m_5448_();
                } else {
                    livingEntity99 = null;
                }
                double d30 = d29 + (double)livingEntity99.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt54 = (Mob)entity;
                    livingEntity98 = _mobEnt54.m_5448_();
                } else {
                    livingEntity98 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d30, livingEntity98.m_20189_()));
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n95 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n95 = 0;
            }
            if (n95 == 20) {
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound8 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity7 : _entfound8) {
                    int n96;
                    float f106;
                    float f107;
                    int n97;
                    float f108;
                    float f109;
                    int n98;
                    float f110;
                    int n99;
                    float f111;
                    int n100;
                    float f112;
                    if (entity7 instanceof ZombietitanEntity || entity7 instanceof Zombie || !(entity7 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f112 = _livEnt.m_21233_();
                    } else {
                        f112 = -1.0f;
                    }
                    float f113 = f112 / 10.0f + 400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n100 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n100 = 0;
                    }
                    entity7.m_6469_(damageSource, f113 + (float)(n100 * 10));
                    if (entity7 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity7 instanceof Player)) {
                        entity7.f_19802_ = 0;
                        Deathlist.normalattack(entity7);
                    }
                    DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f111 = _livEnt.m_21233_();
                    } else {
                        f111 = -1.0f;
                    }
                    float f114 = f111 / 10.0f + 400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n99 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n99 = 0;
                    }
                    entity7.m_6469_(damageSource30, f114 + (float)(n99 * 10));
                    DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f110 = _livEnt.m_21233_();
                    } else {
                        f110 = -1.0f;
                    }
                    float f115 = f110 / 10.0f + 400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n98 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n98 = 0;
                    }
                    entity7.m_6469_(damageSource31, f115 + (float)(n98 * 10));
                    entity7.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity7.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        LivingEntity _livEnt13 = (LivingEntity)entity7;
                        f109 = _livEnt13.m_21233_();
                    } else {
                        f109 = -1.0f;
                    }
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f108 = _livEnt.m_21223_();
                    } else {
                        f108 = -1.0f;
                    }
                    float f116 = (f109 + f108) / 5.0f + 4000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n97 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n97 = 0;
                    }
                    entity7.m_6469_(damageSource32, f116 + (float)(n97 * 100));
                    DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        LivingEntity _livEnt12 = (LivingEntity)entity7;
                        f107 = _livEnt12.m_21233_();
                    } else {
                        f107 = -1.0f;
                    }
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f106 = _livEnt.m_21223_();
                    } else {
                        f106 = -1.0f;
                    }
                    float f117 = (f107 + f106) / 5.0f + 4000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n96 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n96 = 0;
                    }
                    entity7.m_6469_(damageSource33, f117 + (float)(n96 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n94 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n94 = 0;
            }
            if (n94 >= 161) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof ZombietitanEntity) {
            _datEntI3 = (ZombietitanEntity)entity;
            n = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 10) {
            int n101;
            int n102;
            int n103;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof ZombietitanEntity) {
                ((ZombietitanEntity)entity).setAnimation("spawn2");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity102;
                if (entity instanceof Mob) {
                    Mob _mobEnt55 = (Mob)entity;
                    livingEntity102 = _mobEnt55.m_5448_();
                } else {
                    livingEntity102 = null;
                }
                f = entity.m_20270_(livingEntity102);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity103;
                LivingEntity livingEntity104;
                LivingEntity livingEntity105;
                LivingEntity livingEntity106;
                if (entity instanceof Mob) {
                    Mob _mobEnt56 = (Mob)entity;
                    livingEntity106 = _mobEnt56.m_5448_();
                } else {
                    livingEntity106 = null;
                }
                double d = livingEntity106.m_20185_();
                if (entity instanceof Mob) {
                    Mob _mobEnt57 = (Mob)entity;
                    livingEntity105 = _mobEnt57.m_5448_();
                } else {
                    livingEntity105 = null;
                }
                double d31 = livingEntity105.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt58 = (Mob)entity;
                    livingEntity104 = _mobEnt58.m_5448_();
                } else {
                    livingEntity104 = null;
                }
                double d32 = d31 + (double)livingEntity104.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt59 = (Mob)entity;
                    livingEntity103 = _mobEnt59.m_5448_();
                } else {
                    livingEntity103 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d32, livingEntity103.m_20189_()));
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n103 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n103 = 0;
            }
            if (n103 == 186 && entity instanceof ZombietitanEntity) {
                ZombietitanEntity _datEntSetL = (ZombietitanEntity)entity;
                _datEntSetL.m_20088_().m_135381_(ZombietitanEntity.DATA_sword, (Object)true);
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n102 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n102 = 0;
            }
            if (n102 == 70) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound9 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity8 : _entfound9) {
                    int n104;
                    float f118;
                    float f119;
                    int n105;
                    float f120;
                    float f121;
                    int n106;
                    float f122;
                    int n107;
                    float f123;
                    int n108;
                    float f124;
                    if (entity8 instanceof ZombietitanEntity || entity8 instanceof Zombie || !(entity8 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity8;
                        f124 = _livEnt.m_21233_();
                    } else {
                        f124 = -1.0f;
                    }
                    float f125 = f124 / 10.0f + 2400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n108 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n108 = 0;
                    }
                    entity8.m_6469_(damageSource, f125 + (float)(n108 * 10));
                    if (entity8 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity8 instanceof Player)) {
                        entity8.f_19802_ = 0;
                        Deathlist.normalattack(entity8);
                    }
                    DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity8;
                        f123 = _livEnt.m_21233_();
                    } else {
                        f123 = -1.0f;
                    }
                    float f126 = f123 / 10.0f + 2400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n107 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n107 = 0;
                    }
                    entity8.m_6469_(damageSource34, f126 + (float)(n107 * 10));
                    DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity8;
                        f122 = _livEnt.m_21233_();
                    } else {
                        f122 = -1.0f;
                    }
                    float f127 = f122 / 10.0f + 2400.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n106 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n106 = 0;
                    }
                    entity8.m_6469_(damageSource35, f127 + (float)(n106 * 10));
                    entity8.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity8.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt14 = (LivingEntity)entity8;
                        f121 = _livEnt14.m_21233_();
                    } else {
                        f121 = -1.0f;
                    }
                    if (entity8 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity8;
                        f120 = _livEnt.m_21223_();
                    } else {
                        f120 = -1.0f;
                    }
                    float f128 = (f121 + f120) / 5.0f + 24000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n105 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n105 = 0;
                    }
                    entity8.m_6469_(damageSource36, f128 + (float)(n105 * 100));
                    DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt13 = (LivingEntity)entity8;
                        f119 = _livEnt13.m_21233_();
                    } else {
                        f119 = -1.0f;
                    }
                    if (entity8 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity8;
                        f118 = _livEnt.m_21223_();
                    } else {
                        f118 = -1.0f;
                    }
                    float f129 = (f119 + f118) / 5.0f + 24000.0f;
                    if (entity instanceof ZombietitanEntity) {
                        _datEntI = (ZombietitanEntity)entity;
                        n104 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n104 = 0;
                    }
                    entity8.m_6469_(damageSource37, f129 + (float)(n104 * 100));
                }
            }
            if (entity instanceof ZombietitanEntity) {
                _datEntI4 = (ZombietitanEntity)entity;
                n101 = (Integer)_datEntI4.m_20088_().m_135370_(ZombietitanEntity.DATA_animationTick);
            } else {
                n101 = 0;
            }
            if (n101 >= 235) {
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ZombietitanEntity _datEntSetI = (ZombietitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombietitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombietitanEntity) {
                    ((ZombietitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

