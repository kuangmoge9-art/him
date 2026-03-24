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
 *  net.minecraft.world.entity.monster.ZombifiedPiglin
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
import net.mcreator.ultimateskeletons.entity.FlashballEntity;
import net.mcreator.ultimateskeletons.entity.MasterballEntity;
import net.mcreator.ultimateskeletons.entity.ZombiepigmantitanEntity;
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
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class PigzombietitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block1005: {
            int n;
            int n2;
            LivingEntity _livEnt;
            ZombiepigmantitanEntity _datEntI;
            block1007: {
                LivingEntity _livEnt2;
                block1006: {
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    float f;
                    LivingEntity livingEntity;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    Projectile _entityToSpawn;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    ZombiepigmantitanEntity _datEntI2;
                    int n15;
                    Object _mobEnt;
                    Mob _mobEnt2;
                    List<Entity> _entfound;
                    ZombiepigmantitanEntity _datEntI3;
                    block1002: {
                        int n16;
                        block1004: {
                            block1003: {
                                int n17;
                                int n18;
                                int n19;
                                int n20;
                                float f2;
                                Level _level;
                                LivingEntity _entity;
                                block999: {
                                    LivingEntity livingEntity2;
                                    LivingEntity _mobEnt22;
                                    block1000: {
                                        block1001: {
                                            LivingEntity livingEntity3;
                                            float f3;
                                            LivingEntity livingEntity4;
                                            LivingEntity livingEntity5;
                                            int n21;
                                            int n22;
                                            int n23;
                                            float f4;
                                            block997: {
                                                block998: {
                                                    int n24;
                                                    int n25;
                                                    int n26;
                                                    int n27;
                                                    int n28;
                                                    int n29;
                                                    ServerLevel _level2;
                                                    Entity entityToSpawn;
                                                    block996: {
                                                        int n30;
                                                        int n31;
                                                        int n32;
                                                        int n33;
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
                                                        if (entity instanceof ZombiepigmantitanEntity) {
                                                            int n34;
                                                            ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                            if (entity instanceof ZombiepigmantitanEntity) {
                                                                _datEntI = (ZombiepigmantitanEntity)entity;
                                                                n34 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                            } else {
                                                                n34 = 0;
                                                            }
                                                            synchedEntityData.m_135381_(ZombiepigmantitanEntity.DATA_spawnTick, (Object)(n34 + 1));
                                                        }
                                                        if (!entity.m_5446_().getString().equals("growing")) break block996;
                                                        if (entity instanceof ZombiepigmantitanEntity) {
                                                            ZombiepigmantitanEntity _datEntI32 = (ZombiepigmantitanEntity)entity;
                                                            n33 = (Integer)_datEntI32.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n33 = 0;
                                                        }
                                                        if (n33 >= 720) break block997;
                                                        entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                                        entity.f_19802_ = 20;
                                                        ((ZombiepigmantitanEntity)entity).setHEALTS(20000.0);
                                                        if (entity instanceof LivingEntity) {
                                                            ((LivingEntity)entity).f_20919_ = 0;
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _entity = (Mob)entity;
                                                            _entity.m_6710_(null);
                                                        }
                                                        if (entity instanceof ZombiepigmantitanEntity) {
                                                            _datEntI = (ZombiepigmantitanEntity)entity;
                                                            n32 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n32 = 0;
                                                        }
                                                        if (n32 == 450 && world instanceof ServerLevel) {
                                                            ServerLevel _level22 = (ServerLevel)world;
                                                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level22, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn != null) {
                                                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                            }
                                                        }
                                                        if (entity instanceof ZombiepigmantitanEntity) {
                                                            _datEntI = (ZombiepigmantitanEntity)entity;
                                                            n31 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n31 = 0;
                                                        }
                                                        if (n31 <= 10 && entity instanceof ZombiepigmantitanEntity) {
                                                            ((ZombiepigmantitanEntity)entity).setAnimation("spawn2");
                                                        }
                                                        if (entity instanceof ZombiepigmantitanEntity) {
                                                            _datEntI = (ZombiepigmantitanEntity)entity;
                                                            n30 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n30 = 0;
                                                        }
                                                        if (n30 == 719) {
                                                            if (world instanceof Level) {
                                                                _level2 = (Level)world;
                                                                if (!_level2.m_5776_()) {
                                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                                } else {
                                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                                }
                                                            }
                                                            if (!world.m_5776_() && world.m_7654_() != null) {
                                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Zombiepigmantitan has been created!!!"), false);
                                                            }
                                                        }
                                                        if (entity.m_20096_()) break block997;
                                                        if (entity.m_20186_() < -63.0) {
                                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                        } else {
                                                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                        }
                                                        break block997;
                                                    }
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                                                        n29 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n29 = 0;
                                                    }
                                                    if (n29 >= 450) break block997;
                                                    entity.m_6593_((Component)Component.m_237113_((String)"Zombiepigmantitan"));
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
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        _datEntI = (ZombiepigmantitanEntity)entity;
                                                        n28 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n28 = 0;
                                                    }
                                                    if (n28 == 180 && world instanceof ServerLevel) {
                                                        _level2 = (ServerLevel)world;
                                                        entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level2, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                                        if (entityToSpawn != null) {
                                                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                        }
                                                    }
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        _datEntI = (ZombiepigmantitanEntity)entity;
                                                        n27 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n27 = 0;
                                                    }
                                                    if (n27 <= 10 && entity instanceof ZombiepigmantitanEntity) {
                                                        ((ZombiepigmantitanEntity)entity).setAnimation("spawn");
                                                    }
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        _datEntI = (ZombiepigmantitanEntity)entity;
                                                        n26 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n26 = 0;
                                                    }
                                                    if (n26 == 449 && !world.m_5776_() && world.m_7654_() != null) {
                                                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Zombiepigmantitan awake!!!"), false);
                                                    }
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        _datEntI = (ZombiepigmantitanEntity)entity;
                                                        n25 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n25 = 0;
                                                    }
                                                    if (n25 == 160) break block998;
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        ZombiepigmantitanEntity _datEntI5 = (ZombiepigmantitanEntity)entity;
                                                        n24 = (Integer)_datEntI5.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                                    } else {
                                                        n24 = 0;
                                                    }
                                                    if (n24 != 188) break block997;
                                                }
                                                if (world instanceof Level) {
                                                    _level = (Level)world;
                                                    if (!_level.m_5776_()) {
                                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                                    } else {
                                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                                    }
                                                }
                                                Vec3 _center = new Vec3(x, y, z);
                                                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                for (Entity entityiterator : _entfound) {
                                                    if (entityiterator instanceof ZombiepigmantitanEntity || entityiterator instanceof ZombifiedPiglin) continue;
                                                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                                                    double _setval = 5.0;
                                                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                        capability.camerashake = _setval;
                                                        capability.syncPlayerVariables(entityiterator);
                                                    });
                                                }
                                            }
                                            if (!world.m_5776_()) {
                                                int n35;
                                                if (entity instanceof ZombiepigmantitanEntity) {
                                                    _datEntI3 = (ZombiepigmantitanEntity)entity;
                                                    n35 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                                                } else {
                                                    n35 = 0;
                                                }
                                                if (n35 != 0) {
                                                    float f5;
                                                    if (entity instanceof LivingEntity) {
                                                        LivingEntity _livEnt5 = (LivingEntity)entity;
                                                        f5 = _livEnt5.m_21223_();
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (f5 <= 0.0f) {
                                                        for (int index0 = 0; index0 < 16; ++index0) {
                                                            if (!(entity instanceof ZombiepigmantitanEntity)) continue;
                                                            ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                            }
                                            if (entity instanceof LivingEntity) {
                                                LivingEntity _livEnt3 = (LivingEntity)entity;
                                                f4 = _livEnt3.m_21223_();
                                            } else {
                                                f4 = -1.0f;
                                            }
                                            if (f4 > 0.0f && entity instanceof ZombiepigmantitanEntity) {
                                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_deathTick, (Object)0);
                                            }
                                            if (entity instanceof ZombiepigmantitanEntity) {
                                                _datEntI3 = (ZombiepigmantitanEntity)entity;
                                                n23 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_spawnTick);
                                            } else {
                                                n23 = 0;
                                            }
                                            if (n23 < 450) break block999;
                                            if (entity instanceof ZombiepigmantitanEntity) {
                                                _datEntI = (ZombiepigmantitanEntity)entity;
                                                n22 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                                            } else {
                                                n22 = 0;
                                            }
                                            if (n22 == 0) {
                                                int n36;
                                                if (entity instanceof ZombiepigmantitanEntity) {
                                                    ZombiepigmantitanEntity _datEntI6 = (ZombiepigmantitanEntity)entity;
                                                    n36 = (Integer)_datEntI6.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_flyID);
                                                } else {
                                                    n36 = 0;
                                                }
                                                if (n36 != 0) {
                                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                                }
                                            }
                                            if (world.m_5776_()) break block999;
                                            if (entity instanceof ZombiepigmantitanEntity) {
                                                _datEntI = (ZombiepigmantitanEntity)entity;
                                                n21 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                                            } else {
                                                n21 = 0;
                                            }
                                            if (n21 != 0 && entity instanceof ZombiepigmantitanEntity) {
                                                int n37;
                                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                if (entity instanceof ZombiepigmantitanEntity) {
                                                    ZombiepigmantitanEntity _datEntI4 = (ZombiepigmantitanEntity)entity;
                                                    n37 = (Integer)_datEntI4.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                                                } else {
                                                    n37 = 0;
                                                }
                                                synchedEntityData.m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)(n37 + 1));
                                            }
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt3 = (Mob)entity;
                                                livingEntity5 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity5 = null;
                                            }
                                            if (livingEntity5 == null) break block1000;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt4 = (Mob)entity;
                                                v22 = _mobEnt4.m_5448_();
                                            } else {
                                                v22 = livingEntity4 = null;
                                            }
                                            if (livingEntity4 instanceof LivingEntity) {
                                                LivingEntity _livEnt4 = livingEntity4;
                                                f3 = _livEnt4.m_21223_();
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (f3 <= 0.0f) break block1001;
                                            if (entity instanceof Mob) {
                                                _mobEnt22 = (Mob)entity;
                                                livingEntity3 = _mobEnt22.m_5448_();
                                            } else {
                                                livingEntity3 = null;
                                            }
                                            if (livingEntity3.m_6084_()) break block1000;
                                        }
                                        if (entity instanceof ZombiepigmantitanEntity) {
                                            ZombiepigmantitanEntity zombiepigmantitanEntity = (ZombiepigmantitanEntity)entity;
                                            zombiepigmantitanEntity.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_flyID, (Object)0);
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity2 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity2 = null;
                                    }
                                    if (livingEntity2 != null) {
                                        float f6;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt5 = (Mob)entity;
                                            v26 = _mobEnt5.m_5448_();
                                        } else {
                                            v26 = _mobEnt22 = null;
                                        }
                                        if (_mobEnt22 instanceof LivingEntity) {
                                            LivingEntity _livEnt3 = _mobEnt22;
                                            f6 = _livEnt3.m_21223_();
                                        } else {
                                            f6 = -1.0f;
                                        }
                                        if (f6 > 0.0f) {
                                            int n38;
                                            if (entity instanceof ZombiepigmantitanEntity) {
                                                ZombiepigmantitanEntity _datEntI7 = (ZombiepigmantitanEntity)entity;
                                                n38 = (Integer)_datEntI7.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                                            } else {
                                                n38 = 0;
                                            }
                                            if (n38 == 0) {
                                                float f7;
                                                LivingEntity livingEntity6;
                                                Mob _mobEnt3;
                                                Mob _mobEnt4;
                                                Mob _mobEnt5;
                                                Mob _mobEnt6;
                                                Mob _mobEnt7;
                                                float f8;
                                                LivingEntity livingEntity7;
                                                float f9;
                                                Mob _mobEnt8;
                                                LivingEntity livingEntity8;
                                                float f10;
                                                LivingEntity livingEntity9;
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity9 = mob.m_5448_();
                                                } else {
                                                    livingEntity9 = null;
                                                }
                                                if (livingEntity9 != null) {
                                                    LivingEntity livingEntity10;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt11 = (Mob)entity;
                                                        livingEntity10 = _mobEnt11.m_5448_();
                                                    } else {
                                                        livingEntity10 = null;
                                                    }
                                                    f10 = entity.m_20270_(livingEntity10);
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (f10 >= 160.0f) {
                                                    entity.m_6858_(true);
                                                } else {
                                                    entity.m_6858_(false);
                                                }
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity8 = mob.m_5448_();
                                                } else {
                                                    livingEntity8 = null;
                                                }
                                                if (livingEntity8 != null) {
                                                    LivingEntity livingEntity11;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity11 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity11 = null;
                                                    }
                                                    f9 = entity.m_20270_(livingEntity11);
                                                } else {
                                                    f9 = -1.0f;
                                                }
                                                if (f9 > 4.0f) {
                                                    LivingEntity livingEntity12;
                                                    LivingEntity livingEntity13;
                                                    LivingEntity livingEntity14;
                                                    LivingEntity livingEntity15;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt12 = (Mob)entity;
                                                        livingEntity15 = _mobEnt12.m_5448_();
                                                    } else {
                                                        livingEntity15 = null;
                                                    }
                                                    double d = livingEntity15.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt10 = (Mob)entity;
                                                        livingEntity14 = _mobEnt10.m_5448_();
                                                    } else {
                                                        livingEntity14 = null;
                                                    }
                                                    double d2 = livingEntity14.m_20186_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt13 = (Mob)entity;
                                                        livingEntity13 = _mobEnt13.m_5448_();
                                                    } else {
                                                        livingEntity13 = null;
                                                    }
                                                    double d3 = d2 + (double)livingEntity13.m_20206_() / 1.5;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt14 = (Mob)entity;
                                                        livingEntity12 = _mobEnt14.m_5448_();
                                                    } else {
                                                        livingEntity12 = null;
                                                    }
                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity12.m_20189_()));
                                                }
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity7 = mob.m_5448_();
                                                } else {
                                                    livingEntity7 = null;
                                                }
                                                if (livingEntity7 != null) {
                                                    LivingEntity livingEntity16;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity16 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity16 = null;
                                                    }
                                                    f8 = entity.m_20270_(livingEntity16);
                                                } else {
                                                    f8 = -1.0f;
                                                }
                                                if (f8 > 60.0f) {
                                                    float f11;
                                                    LivingEntity livingEntity17;
                                                    LivingEntity livingEntity18;
                                                    float f12;
                                                    LivingEntity livingEntity19;
                                                    LivingEntity livingEntity20;
                                                    float f13;
                                                    LivingEntity livingEntity21;
                                                    LivingEntity livingEntity22;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt9 = (Mob)entity;
                                                        livingEntity22 = _mobEnt9.m_5448_();
                                                    } else {
                                                        livingEntity22 = null;
                                                    }
                                                    double d = livingEntity22.m_20185_() - entity.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity21 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity21 = null;
                                                    }
                                                    if (livingEntity21 != null) {
                                                        LivingEntity livingEntity23;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt15 = (Mob)entity;
                                                            livingEntity23 = _mobEnt15.m_5448_();
                                                        } else {
                                                            livingEntity23 = null;
                                                        }
                                                        f13 = entity.m_20270_(livingEntity23);
                                                    } else {
                                                        f13 = -1.0f;
                                                    }
                                                    double d4 = d / (double)f13 * 2.0;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity20 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity20 = null;
                                                    }
                                                    double d5 = livingEntity20.m_20186_() - entity.m_20186_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity19 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity19 = null;
                                                    }
                                                    if (livingEntity19 != null) {
                                                        LivingEntity livingEntity24;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt16 = (Mob)entity;
                                                            livingEntity24 = _mobEnt16.m_5448_();
                                                        } else {
                                                            livingEntity24 = null;
                                                        }
                                                        f12 = entity.m_20270_(livingEntity24);
                                                    } else {
                                                        f12 = -1.0f;
                                                    }
                                                    double d6 = d5 / (double)f12 * 2.0;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity18 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity18 = null;
                                                    }
                                                    double d7 = livingEntity18.m_20189_() - entity.m_20189_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt7 = (Mob)entity;
                                                        livingEntity17 = _mobEnt7.m_5448_();
                                                    } else {
                                                        livingEntity17 = null;
                                                    }
                                                    if (livingEntity17 != null) {
                                                        LivingEntity livingEntity25;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt17 = (Mob)entity;
                                                            livingEntity25 = _mobEnt17.m_5448_();
                                                        } else {
                                                            livingEntity25 = null;
                                                        }
                                                        f11 = entity.m_20270_(livingEntity25);
                                                    } else {
                                                        f11 = -1.0f;
                                                    }
                                                    entity.m_20256_(new Vec3(d4, d6, d7 / (double)f11 * 2.0));
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_flyID, (Object)1);
                                                    }
                                                } else {
                                                    LivingEntity livingEntity26;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt18 = (Mob)entity;
                                                        livingEntity26 = _mobEnt18.m_5448_();
                                                    } else {
                                                        livingEntity26 = null;
                                                    }
                                                    if (livingEntity26.m_20206_() > 8.0f) {
                                                        float f14;
                                                        LivingEntity livingEntity27;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt7 = (Mob)entity;
                                                            livingEntity27 = _mobEnt7.m_5448_();
                                                        } else {
                                                            livingEntity27 = null;
                                                        }
                                                        if (livingEntity27 != null) {
                                                            LivingEntity livingEntity28;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt6 = (Mob)entity;
                                                                livingEntity28 = _mobEnt6.m_5448_();
                                                            } else {
                                                                livingEntity28 = null;
                                                            }
                                                            f14 = entity.m_20270_(livingEntity28);
                                                        } else {
                                                            f14 = -1.0f;
                                                        }
                                                        if (f14 > 28.0f) {
                                                            float f15;
                                                            LivingEntity livingEntity29;
                                                            LivingEntity livingEntity30;
                                                            float f16;
                                                            LivingEntity livingEntity31;
                                                            LivingEntity livingEntity32;
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt82 = (Mob)entity;
                                                                livingEntity32 = _mobEnt82.m_5448_();
                                                            } else {
                                                                livingEntity32 = null;
                                                            }
                                                            double d = livingEntity32.m_20185_() - entity.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt72 = (Mob)entity;
                                                                livingEntity31 = _mobEnt72.m_5448_();
                                                            } else {
                                                                livingEntity31 = null;
                                                            }
                                                            if (livingEntity31 != null) {
                                                                LivingEntity livingEntity33;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt62 = (Mob)entity;
                                                                    livingEntity33 = _mobEnt62.m_5448_();
                                                                } else {
                                                                    livingEntity33 = null;
                                                                }
                                                                f16 = entity.m_20270_(livingEntity33);
                                                            } else {
                                                                f16 = -1.0f;
                                                            }
                                                            double d8 = d / (double)f16 * 0.6;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity30 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity30 = null;
                                                            }
                                                            double d9 = livingEntity30.m_20189_() - entity.m_20189_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity29 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity29 = null;
                                                            }
                                                            if (livingEntity29 != null) {
                                                                LivingEntity livingEntity34;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity34 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity34 = null;
                                                                }
                                                                f15 = entity.m_20270_(livingEntity34);
                                                            } else {
                                                                f15 = -1.0f;
                                                            }
                                                            entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f15 * 0.6));
                                                        }
                                                    } else {
                                                        float f17;
                                                        LivingEntity livingEntity35;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt7 = (Mob)entity;
                                                            livingEntity35 = _mobEnt7.m_5448_();
                                                        } else {
                                                            livingEntity35 = null;
                                                        }
                                                        if (livingEntity35 != null) {
                                                            LivingEntity livingEntity36;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt6 = (Mob)entity;
                                                                livingEntity36 = _mobEnt6.m_5448_();
                                                            } else {
                                                                livingEntity36 = null;
                                                            }
                                                            f17 = entity.m_20270_(livingEntity36);
                                                        } else {
                                                            f17 = -1.0f;
                                                        }
                                                        if (f17 > 8.0f) {
                                                            float f18;
                                                            LivingEntity livingEntity37;
                                                            LivingEntity livingEntity38;
                                                            float f19;
                                                            LivingEntity livingEntity39;
                                                            LivingEntity livingEntity40;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity40 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity40 = null;
                                                            }
                                                            double d = livingEntity40.m_20185_() - entity.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity39 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity39 = null;
                                                            }
                                                            if (livingEntity39 != null) {
                                                                LivingEntity livingEntity41;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity41 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity41 = null;
                                                                }
                                                                f19 = entity.m_20270_(livingEntity41);
                                                            } else {
                                                                f19 = -1.0f;
                                                            }
                                                            double d10 = d / (double)f19 * 0.6;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity38 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity38 = null;
                                                            }
                                                            double d11 = livingEntity38.m_20189_() - entity.m_20189_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity37 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity37 = null;
                                                            }
                                                            if (livingEntity37 != null) {
                                                                LivingEntity livingEntity42;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity42 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity42 = null;
                                                                }
                                                                f18 = entity.m_20270_(livingEntity42);
                                                            } else {
                                                                f18 = -1.0f;
                                                            }
                                                            entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f18 * 0.6));
                                                        }
                                                    }
                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                        ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_flyID, (Object)0);
                                                    }
                                                }
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity6 = mob.m_5448_();
                                                } else {
                                                    livingEntity6 = null;
                                                }
                                                if (livingEntity6 != null) {
                                                    LivingEntity livingEntity43;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity43 = _mobEnt8.m_5448_();
                                                    } else {
                                                        livingEntity43 = null;
                                                    }
                                                    f7 = entity.m_20270_(livingEntity43);
                                                } else {
                                                    f7 = -1.0f;
                                                }
                                                if (f7 < 512.0f) {
                                                    ZombiepigmantitanEntity _datEntSetI;
                                                    float f20;
                                                    LivingEntity livingEntity44;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt19 = (Mob)entity;
                                                        livingEntity44 = _mobEnt19.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    if (livingEntity44 != null) {
                                                        LivingEntity livingEntity45;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt7 = (Mob)entity;
                                                            livingEntity45 = _mobEnt7.m_5448_();
                                                        } else {
                                                            livingEntity45 = null;
                                                        }
                                                        f20 = entity.m_20270_(livingEntity45);
                                                    } else {
                                                        f20 = -1.0f;
                                                    }
                                                    if (f20 <= 35.0f) {
                                                        if (((Boolean)SkeletonsConfiguration.ALLOW.get()).booleanValue()) {
                                                            LivingEntity livingEntity46;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt6 = (Mob)entity;
                                                                livingEntity46 = _mobEnt6.m_5448_();
                                                            } else {
                                                                livingEntity46 = null;
                                                            }
                                                            if (livingEntity46.m_20206_() > 6.0f) {
                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 10) {
                                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
                                                                    }
                                                                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 9) {
                                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)10);
                                                                    }
                                                                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 8) {
                                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)3);
                                                                    }
                                                                } else if (entity instanceof ZombiepigmantitanEntity) {
                                                                    _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)4);
                                                                }
                                                            } else if (entity instanceof ZombiepigmantitanEntity) {
                                                                _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                            }
                                                        } else {
                                                            LivingEntity livingEntity47;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt6 = (Mob)entity;
                                                                livingEntity47 = _mobEnt6.m_5448_();
                                                            } else {
                                                                livingEntity47 = null;
                                                            }
                                                            if (livingEntity47.m_20206_() > 6.0f) {
                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 10) {
                                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)5);
                                                                    }
                                                                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 9) {
                                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)10);
                                                                    }
                                                                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 8) {
                                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)3);
                                                                    }
                                                                } else if (entity instanceof ZombiepigmantitanEntity) {
                                                                    _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)4);
                                                                }
                                                            } else if (entity instanceof ZombiepigmantitanEntity) {
                                                                _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                            }
                                                        }
                                                    }
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)20) == 5) {
                                                        int n39;
                                                        if (entity instanceof ZombiepigmantitanEntity) {
                                                            ZombiepigmantitanEntity _datEntI8 = (ZombiepigmantitanEntity)entity;
                                                            n39 = (Integer)_datEntI8.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                                                        } else {
                                                            n39 = 0;
                                                        }
                                                        if (n39 == 0) {
                                                            float f21;
                                                            LivingEntity livingEntity48;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt7 = (Mob)entity;
                                                                livingEntity48 = _mobEnt7.m_5448_();
                                                            } else {
                                                                livingEntity48 = null;
                                                            }
                                                            if (livingEntity48 != null) {
                                                                LivingEntity livingEntity49;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt6 = (Mob)entity;
                                                                    livingEntity49 = _mobEnt6.m_5448_();
                                                                } else {
                                                                    livingEntity49 = null;
                                                                }
                                                                f21 = entity.m_20270_(livingEntity49);
                                                            } else {
                                                                f21 = -1.0f;
                                                            }
                                                            if (f21 > 50.0f) {
                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                                    if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                                                    }
                                                                } else if (entity instanceof ZombiepigmantitanEntity) {
                                                                    _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)10);
                                                                }
                                                            } else {
                                                                float f22;
                                                                LivingEntity livingEntity50;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity50 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity50 = null;
                                                                }
                                                                if (livingEntity50 != null) {
                                                                    LivingEntity livingEntity51;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt4 = (Mob)entity;
                                                                        livingEntity51 = _mobEnt4.m_5448_();
                                                                    } else {
                                                                        livingEntity51 = null;
                                                                    }
                                                                    f22 = entity.m_20270_(livingEntity51);
                                                                } else {
                                                                    f22 = -1.0f;
                                                                }
                                                                if (f22 > 32.0f) {
                                                                    LivingEntity livingEntity52;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt5 = (Mob)entity;
                                                                        livingEntity52 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        livingEntity52 = null;
                                                                    }
                                                                    if (livingEntity52.m_20206_() > 6.0f) {
                                                                        if (entity instanceof ZombiepigmantitanEntity) {
                                                                            _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                            _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)10));
                                                                        }
                                                                    } else if (entity instanceof ZombiepigmantitanEntity) {
                                                                        _datEntSetI = (ZombiepigmantitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)10));
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
                                    f2 = _livEnt4.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) {
                                    int n40;
                                    if (entity instanceof Mob) {
                                        _entity = (Mob)entity;
                                        _entity.m_6710_(null);
                                    }
                                    if (entity instanceof ZombiepigmantitanEntity) {
                                        _datEntI = (ZombiepigmantitanEntity)entity;
                                        n40 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                                    } else {
                                        n40 = 0;
                                    }
                                    if (n40 == 0) {
                                        int n41;
                                        int n42;
                                        int n43;
                                        int n44;
                                        int n45;
                                        if (entity instanceof ZombiepigmantitanEntity) {
                                            int n46;
                                            ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                            if (entity instanceof ZombiepigmantitanEntity) {
                                                ZombiepigmantitanEntity _datEntI4 = (ZombiepigmantitanEntity)entity;
                                                n46 = (Integer)_datEntI4.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_deathTick);
                                            } else {
                                                n46 = 0;
                                            }
                                            synchedEntityData.m_135381_(ZombiepigmantitanEntity.DATA_deathTick, (Object)(n46 + 1));
                                        }
                                        if (entity instanceof ZombiepigmantitanEntity) {
                                            ZombiepigmantitanEntity _datEntI9 = (ZombiepigmantitanEntity)entity;
                                            n45 = (Integer)_datEntI9.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_deathTick);
                                        } else {
                                            n45 = 0;
                                        }
                                        if (n45 == 1 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pigzombietitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pigzombietitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof ZombiepigmantitanEntity) {
                                            ZombiepigmantitanEntity _datEntI10 = (ZombiepigmantitanEntity)entity;
                                            n44 = (Integer)_datEntI10.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_deathTick);
                                        } else {
                                            n44 = 0;
                                        }
                                        if (n44 < 3) {
                                            for (int index1 = 0; index1 < 12; ++index1) {
                                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                            }
                                        }
                                        if (entity instanceof ZombiepigmantitanEntity) {
                                            ZombiepigmantitanEntity _datEntI11 = (ZombiepigmantitanEntity)entity;
                                            n43 = (Integer)_datEntI11.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_deathTick);
                                        } else {
                                            n43 = 0;
                                        }
                                        if (n43 < 10 && entity instanceof ZombiepigmantitanEntity) {
                                            ((ZombiepigmantitanEntity)entity).setAnimation("death");
                                        }
                                        if (entity instanceof ZombiepigmantitanEntity) {
                                            ZombiepigmantitanEntity _datEntI12 = (ZombiepigmantitanEntity)entity;
                                            n42 = (Integer)_datEntI12.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_deathTick);
                                        } else {
                                            n42 = 0;
                                        }
                                        if (n42 == 760) {
                                            if (world instanceof ServerLevel) {
                                                ServerLevel _level3 = (ServerLevel)world;
                                                _level3.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level3, 4, "", (Component)Component.m_237113_((String)""), _level3.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"zombiepigmantitan\"'}");
                                            }
                                            for (int index2 = 0; index2 < 320; ++index2) {
                                                world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                            }
                                        }
                                        if (entity instanceof ZombiepigmantitanEntity) {
                                            ZombiepigmantitanEntity _datEntI13 = (ZombiepigmantitanEntity)entity;
                                            n41 = (Integer)_datEntI13.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_deathTick);
                                        } else {
                                            n41 = 0;
                                        }
                                        if (n41 >= 760 && !entity.m_9236_().m_5776_()) {
                                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                        }
                                    }
                                }
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI3 = (ZombiepigmantitanEntity)entity;
                                    n20 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                                } else {
                                    n20 = 0;
                                }
                                if (n20 != true) break block1002;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    ((ZombiepigmantitanEntity)entity).setAnimation("treadling");
                                }
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI = (ZombiepigmantitanEntity)entity;
                                    n19 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                                } else {
                                    n19 = 0;
                                }
                                if (n19 == 1) {
                                    float f23;
                                    LivingEntity livingEntity53;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt20 = (Mob)entity;
                                        livingEntity53 = _mobEnt20.m_5448_();
                                    } else {
                                        livingEntity53 = null;
                                    }
                                    if (livingEntity53 != null) {
                                        LivingEntity livingEntity54;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt21 = (Mob)entity;
                                            livingEntity54 = _mobEnt21.m_5448_();
                                        } else {
                                            livingEntity54 = null;
                                        }
                                        f23 = entity.m_20270_(livingEntity54);
                                    } else {
                                        f23 = -1.0f;
                                    }
                                    if (f23 > 1.0f) {
                                        LivingEntity livingEntity55;
                                        LivingEntity livingEntity56;
                                        LivingEntity livingEntity57;
                                        LivingEntity livingEntity58;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity58 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity58 = null;
                                        }
                                        double d = livingEntity58.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity57 = mob.m_5448_();
                                        } else {
                                            livingEntity57 = null;
                                        }
                                        double d12 = livingEntity57.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity56 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity56 = null;
                                        }
                                        double d13 = d12 + (double)livingEntity56.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity55 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity55 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d13, livingEntity55.m_20189_()));
                                    }
                                }
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI = (ZombiepigmantitanEntity)entity;
                                    n18 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                                } else {
                                    n18 = 0;
                                }
                                if (n18 == 95) break block1003;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    ZombiepigmantitanEntity _datEntI14 = (ZombiepigmantitanEntity)entity;
                                    n17 = (Integer)_datEntI14.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                                } else {
                                    n17 = 0;
                                }
                                if (n17 != 165) break block1004;
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
                                int n47;
                                float f24;
                                float f25;
                                int n48;
                                float f26;
                                float f27;
                                int n49;
                                float f28;
                                int n50;
                                ZombiepigmantitanEntity _datEntI5;
                                float f29;
                                int n51;
                                float f30;
                                if (entityiterator instanceof ZombiepigmantitanEntity || entityiterator instanceof ZombifiedPiglin || !(entityiterator instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt22 = (LivingEntity)entityiterator;
                                    f30 = _livEnt22.m_21233_();
                                } else {
                                    f30 = -1.0f;
                                }
                                float f31 = f30 / 20.0f + 6000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    ZombiepigmantitanEntity _datEntI15 = (ZombiepigmantitanEntity)entity;
                                    n51 = (Integer)_datEntI15.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n51 = 0;
                                }
                                entityiterator.m_6469_(damageSource, f31 + (float)(n51 * 20));
                                if (entityiterator instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                    entityiterator.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator);
                                }
                                DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entityiterator;
                                    f29 = _livEnt2.m_21233_();
                                } else {
                                    f29 = -1.0f;
                                }
                                float f32 = f29 / 20.0f + 6000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI5 = (ZombiepigmantitanEntity)entity;
                                    n50 = (Integer)_datEntI5.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n50 = 0;
                                }
                                entityiterator.m_6469_(damageSource2, f32 + (float)(n50 * 20));
                                DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entityiterator;
                                    f28 = _livEnt2.m_21233_();
                                } else {
                                    f28 = -1.0f;
                                }
                                float f33 = f28 / 20.0f + 6000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI5 = (ZombiepigmantitanEntity)entity;
                                    n49 = (Integer)_datEntI5.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n49 = 0;
                                }
                                entityiterator.m_6469_(damageSource3, f33 + (float)(n49 * 20));
                                entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entityiterator.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
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
                                float f34 = (f27 + f26) / 5.0f + 60000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI5 = (ZombiepigmantitanEntity)entity;
                                    n48 = (Integer)_datEntI5.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n48 = 0;
                                }
                                entityiterator.m_6469_(damageSource4, f34 + (float)(n48 * 200));
                                DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator;
                                    f25 = _livEnt.m_21233_();
                                } else {
                                    f25 = -1.0f;
                                }
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entityiterator;
                                    f24 = _livEnt2.m_21223_();
                                } else {
                                    f24 = -1.0f;
                                }
                                float f35 = (f25 + f24) / 5.0f + 60000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI5 = (ZombiepigmantitanEntity)entity;
                                    n47 = (Integer)_datEntI5.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n47 = 0;
                                }
                                entityiterator.m_6469_(damageSource5, f35 + (float)(n47 * 200));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n16 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n16 = 0;
                        }
                        if (n16 >= 200) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n15 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n15 = 0;
                    }
                    if (n15 == 2) {
                        int n52;
                        int n53;
                        float f36;
                        LivingEntity livingEntity59;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("qj");
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity59 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity59 = null;
                        }
                        if (livingEntity59 != null) {
                            LivingEntity livingEntity60;
                            if (entity instanceof Mob) {
                                Mob _mobEnt22 = (Mob)entity;
                                livingEntity60 = _mobEnt22.m_5448_();
                            } else {
                                livingEntity60 = null;
                            }
                            f36 = entity.m_20270_(livingEntity60);
                        } else {
                            f36 = -1.0f;
                        }
                        if (f36 > 1.0f) {
                            LivingEntity livingEntity61;
                            LivingEntity livingEntity62;
                            LivingEntity livingEntity63;
                            LivingEntity livingEntity64;
                            if (entity instanceof Mob) {
                                Mob _mobEnt23 = (Mob)entity;
                                livingEntity64 = _mobEnt23.m_5448_();
                            } else {
                                livingEntity64 = null;
                            }
                            double d = livingEntity64.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity63 = _mobEnt.m_5448_();
                            } else {
                                livingEntity63 = null;
                            }
                            double d14 = livingEntity63.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt24 = (Mob)entity;
                                livingEntity62 = _mobEnt24.m_5448_();
                            } else {
                                livingEntity62 = null;
                            }
                            double d15 = d14 + (double)livingEntity62.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt25 = (Mob)entity;
                                livingEntity61 = _mobEnt25.m_5448_();
                            } else {
                                livingEntity61 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d15, livingEntity61.m_20189_()));
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n53 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n53 = 0;
                        }
                        if (n53 == 44) {
                            if (world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            Vec3 _center = new Vec3(x, y, z);
                            List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity2 : _entfound2) {
                                int n54;
                                float f37;
                                float f38;
                                int n55;
                                float f39;
                                float f40;
                                int n56;
                                float f41;
                                int n57;
                                float f42;
                                LivingEntity _livEnt5;
                                int n58;
                                float f43;
                                if (entity2 instanceof ZombiepigmantitanEntity || entity2 instanceof ZombifiedPiglin || !(entity2 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    LivingEntity _livEnt6 = (LivingEntity)entity2;
                                    f43 = _livEnt6.m_21233_();
                                } else {
                                    f43 = -1.0f;
                                }
                                float f44 = f43 / 20.0f + 9000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    ZombiepigmantitanEntity _datEntI22 = (ZombiepigmantitanEntity)entity;
                                    n58 = (Integer)_datEntI22.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n58 = 0;
                                }
                                entity2.m_6469_(damageSource, f44 + (float)(n58 * 20));
                                if (entity2 instanceof Titangodentity) continue;
                                DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt5 = (LivingEntity)entity2;
                                    f42 = _livEnt5.m_21233_();
                                } else {
                                    f42 = -1.0f;
                                }
                                float f45 = f42 / 20.0f + 9000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n57 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n57 = 0;
                                }
                                entity2.m_6469_(damageSource6, f45 + (float)(n57 * 20));
                                DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt5 = (LivingEntity)entity2;
                                    f41 = _livEnt5.m_21233_();
                                } else {
                                    f41 = -1.0f;
                                }
                                float f46 = f41 / 20.0f + 9000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n56 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n56 = 0;
                                }
                                entity2.m_6469_(damageSource7, f46 + (float)(n56 * 20));
                                entity2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity2.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity2;
                                    f40 = _livEnt2.m_21233_();
                                } else {
                                    f40 = -1.0f;
                                }
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt5 = (LivingEntity)entity2;
                                    f39 = _livEnt5.m_21223_();
                                } else {
                                    f39 = -1.0f;
                                }
                                float f47 = (f40 + f39) / 5.0f + 90000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n55 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n55 = 0;
                                }
                                entity2.m_6469_(damageSource8, f47 + (float)(n55 * 200));
                                DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity2;
                                    f38 = _livEnt2.m_21233_();
                                } else {
                                    f38 = -1.0f;
                                }
                                if (entity2 instanceof LivingEntity) {
                                    _livEnt5 = (LivingEntity)entity2;
                                    f37 = _livEnt5.m_21223_();
                                } else {
                                    f37 = -1.0f;
                                }
                                float f48 = (f38 + f37) / 5.0f + 90000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n54 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n54 = 0;
                                }
                                entity2.m_6469_(damageSource9, f48 + (float)(n54 * 200));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n52 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n52 = 0;
                        }
                        if (n52 >= 72) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n14 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n14 = 0;
                    }
                    if (n14 == 3) {
                        int n59;
                        int n60;
                        float f49;
                        LivingEntity livingEntity65;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("swept");
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity65 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity65 = null;
                        }
                        if (livingEntity65 != null) {
                            LivingEntity livingEntity66;
                            if (entity instanceof Mob) {
                                Mob _mobEnt26 = (Mob)entity;
                                livingEntity66 = _mobEnt26.m_5448_();
                            } else {
                                livingEntity66 = null;
                            }
                            f49 = entity.m_20270_(livingEntity66);
                        } else {
                            f49 = -1.0f;
                        }
                        if (f49 > 1.0f) {
                            LivingEntity livingEntity67;
                            LivingEntity livingEntity68;
                            LivingEntity livingEntity69;
                            LivingEntity livingEntity70;
                            if (entity instanceof Mob) {
                                Mob _mobEnt27 = (Mob)entity;
                                livingEntity70 = _mobEnt27.m_5448_();
                            } else {
                                livingEntity70 = null;
                            }
                            double d = livingEntity70.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity69 = _mobEnt.m_5448_();
                            } else {
                                livingEntity69 = null;
                            }
                            double d16 = livingEntity69.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt28 = (Mob)entity;
                                livingEntity68 = _mobEnt28.m_5448_();
                            } else {
                                livingEntity68 = null;
                            }
                            double d17 = d16 + (double)livingEntity68.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt29 = (Mob)entity;
                                livingEntity67 = _mobEnt29.m_5448_();
                            } else {
                                livingEntity67 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity67.m_20189_()));
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n60 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n60 = 0;
                        }
                        if (n60 >= 132) {
                            int n61;
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntI16 = (ZombiepigmantitanEntity)entity;
                                n61 = (Integer)_datEntI16.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                            } else {
                                n61 = 0;
                            }
                            if (n61 <= 142) {
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
                                    int n62;
                                    float f50;
                                    float f51;
                                    int n63;
                                    float f52;
                                    float f53;
                                    int n64;
                                    float f54;
                                    int n65;
                                    ZombiepigmantitanEntity _datEntI6;
                                    float f55;
                                    int n66;
                                    float f56;
                                    if (entityiterator instanceof ZombiepigmantitanEntity || entityiterator instanceof ZombifiedPiglin || !(entityiterator instanceof LivingEntity)) continue;
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt2 = (LivingEntity)entityiterator;
                                        f56 = _livEnt2.m_21233_();
                                    } else {
                                        f56 = -1.0f;
                                    }
                                    float f57 = f56 / 20.0f + 6000.0f;
                                    if (entity instanceof ZombiepigmantitanEntity) {
                                        ZombiepigmantitanEntity _datEntI17 = (ZombiepigmantitanEntity)entity;
                                        n66 = (Integer)_datEntI17.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                    } else {
                                        n66 = 0;
                                    }
                                    entityiterator.m_6469_(damageSource, f57 + (float)(n66 * 20));
                                    if (entityiterator instanceof Titangodentity) continue;
                                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                        Deathlist.normalattack(entityiterator);
                                    }
                                    if (!(entityiterator instanceof Player)) {
                                        entityiterator.f_19802_ = 0;
                                    }
                                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt2 = (LivingEntity)entityiterator;
                                        f55 = _livEnt2.m_21233_();
                                    } else {
                                        f55 = -1.0f;
                                    }
                                    float f58 = f55 / 20.0f + 6000.0f;
                                    if (entity instanceof ZombiepigmantitanEntity) {
                                        _datEntI6 = (ZombiepigmantitanEntity)entity;
                                        n65 = (Integer)_datEntI6.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                    } else {
                                        n65 = 0;
                                    }
                                    entityiterator.m_6469_(damageSource10, f58 + (float)(n65 * 20));
                                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt2 = (LivingEntity)entityiterator;
                                        f54 = _livEnt2.m_21233_();
                                    } else {
                                        f54 = -1.0f;
                                    }
                                    float f59 = f54 / 20.0f + 6000.0f;
                                    if (entity instanceof ZombiepigmantitanEntity) {
                                        _datEntI6 = (ZombiepigmantitanEntity)entity;
                                        n64 = (Integer)_datEntI6.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                    } else {
                                        n64 = 0;
                                    }
                                    entityiterator.m_6469_(damageSource11, f59 + (float)(n64 * 20));
                                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entityiterator;
                                        f53 = _livEnt.m_21233_();
                                    } else {
                                        f53 = -1.0f;
                                    }
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt2 = (LivingEntity)entityiterator;
                                        f52 = _livEnt2.m_21223_();
                                    } else {
                                        f52 = -1.0f;
                                    }
                                    float f60 = (f53 + f52) / 5.0f + 60000.0f;
                                    if (entity instanceof ZombiepigmantitanEntity) {
                                        _datEntI6 = (ZombiepigmantitanEntity)entity;
                                        n63 = (Integer)_datEntI6.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                    } else {
                                        n63 = 0;
                                    }
                                    entityiterator.m_6469_(damageSource12, f60 + (float)(n63 * 200));
                                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entityiterator;
                                        f51 = _livEnt.m_21233_();
                                    } else {
                                        f51 = -1.0f;
                                    }
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt2 = (LivingEntity)entityiterator;
                                        f50 = _livEnt2.m_21223_();
                                    } else {
                                        f50 = -1.0f;
                                    }
                                    float f61 = (f51 + f50) / 5.0f + 60000.0f;
                                    if (entity instanceof ZombiepigmantitanEntity) {
                                        _datEntI6 = (ZombiepigmantitanEntity)entity;
                                        n62 = (Integer)_datEntI6.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                    } else {
                                        n62 = 0;
                                    }
                                    entityiterator.m_6469_(damageSource13, f61 + (float)(n62 * 200));
                                }
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n59 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n59 = 0;
                        }
                        if (n59 >= 190) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n13 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n13 = 0;
                    }
                    if (n13 == 4) {
                        int n67;
                        int n68;
                        float f62;
                        LivingEntity livingEntity71;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity71 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity71 = null;
                        }
                        if (livingEntity71 != null) {
                            LivingEntity livingEntity72;
                            if (entity instanceof Mob) {
                                Mob _mobEnt30 = (Mob)entity;
                                livingEntity72 = _mobEnt30.m_5448_();
                            } else {
                                livingEntity72 = null;
                            }
                            f62 = entity.m_20270_(livingEntity72);
                        } else {
                            f62 = -1.0f;
                        }
                        if (f62 > 1.0f) {
                            LivingEntity livingEntity73;
                            LivingEntity livingEntity74;
                            LivingEntity livingEntity75;
                            LivingEntity livingEntity76;
                            if (entity instanceof Mob) {
                                Mob _mobEnt31 = (Mob)entity;
                                livingEntity76 = _mobEnt31.m_5448_();
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
                            double d18 = livingEntity75.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt32 = (Mob)entity;
                                livingEntity74 = _mobEnt32.m_5448_();
                            } else {
                                livingEntity74 = null;
                            }
                            double d19 = d18 + (double)livingEntity74.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt33 = (Mob)entity;
                                livingEntity73 = _mobEnt33.m_5448_();
                            } else {
                                livingEntity73 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d19, livingEntity73.m_20189_()));
                        }
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("attack1");
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("attack2");
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("attack3");
                            }
                        } else if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("attack4");
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n68 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n68 = 0;
                        }
                        if (n68 == 16) {
                            if (world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                            List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity3 : _entfound3) {
                                int n69;
                                float f63;
                                float f64;
                                int n70;
                                float f65;
                                float f66;
                                int n71;
                                float f67;
                                int n72;
                                float f68;
                                LivingEntity _livEnt6;
                                int n73;
                                float f69;
                                if (entity3 instanceof ZombiepigmantitanEntity || entity3 instanceof ZombifiedPiglin || !(entity3 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    LivingEntity _livEnt7 = (LivingEntity)entity3;
                                    f69 = _livEnt7.m_21233_();
                                } else {
                                    f69 = -1.0f;
                                }
                                float f70 = f69 / 20.0f + 12000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n73 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n73 = 0;
                                }
                                entity3.m_6469_(damageSource, f70 + (float)(n73 * 20));
                                if (entity3 instanceof Titangodentity) continue;
                                DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity3;
                                    f68 = _livEnt6.m_21233_();
                                } else {
                                    f68 = -1.0f;
                                }
                                float f71 = f68 / 20.0f + 12000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n72 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n72 = 0;
                                }
                                entity3.m_6469_(damageSource14, f71 + (float)(n72 * 20));
                                DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity3;
                                    f67 = _livEnt6.m_21233_();
                                } else {
                                    f67 = -1.0f;
                                }
                                float f72 = f67 / 20.0f + 12000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n71 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n71 = 0;
                                }
                                entity3.m_6469_(damageSource15, f72 + (float)(n71 * 20));
                                if (!(entity3.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity3;
                                    f66 = _livEnt2.m_21233_();
                                } else {
                                    f66 = -1.0f;
                                }
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity3;
                                    f65 = _livEnt6.m_21223_();
                                } else {
                                    f65 = -1.0f;
                                }
                                float f73 = (f66 + f65) / 5.0f + 120000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n70 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n70 = 0;
                                }
                                entity3.m_6469_(damageSource16, f73 + (float)(n70 * 200));
                                DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity3;
                                    f64 = _livEnt2.m_21233_();
                                } else {
                                    f64 = -1.0f;
                                }
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity3;
                                    f63 = _livEnt6.m_21223_();
                                } else {
                                    f63 = -1.0f;
                                }
                                float f74 = (f64 + f63) / 5.0f + 120000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n69 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n69 = 0;
                                }
                                entity3.m_6469_(damageSource17, f74 + (float)(n69 * 200));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n67 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n67 = 0;
                        }
                        if (n67 >= 30) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n12 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n12 = 0;
                    }
                    if (n12 == 5) {
                        int n74;
                        int n75;
                        float f75;
                        LivingEntity livingEntity77;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("fs");
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity77 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity77 = null;
                        }
                        if (livingEntity77 != null) {
                            LivingEntity livingEntity78;
                            if (entity instanceof Mob) {
                                Mob _mobEnt34 = (Mob)entity;
                                livingEntity78 = _mobEnt34.m_5448_();
                            } else {
                                livingEntity78 = null;
                            }
                            f75 = entity.m_20270_(livingEntity78);
                        } else {
                            f75 = -1.0f;
                        }
                        if (f75 > 1.0f) {
                            LivingEntity livingEntity79;
                            LivingEntity livingEntity80;
                            LivingEntity livingEntity81;
                            LivingEntity livingEntity82;
                            if (entity instanceof Mob) {
                                Mob _mobEnt35 = (Mob)entity;
                                livingEntity82 = _mobEnt35.m_5448_();
                            } else {
                                livingEntity82 = null;
                            }
                            double d = livingEntity82.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity81 = _mobEnt.m_5448_();
                            } else {
                                livingEntity81 = null;
                            }
                            double d20 = livingEntity81.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt36 = (Mob)entity;
                                livingEntity80 = _mobEnt36.m_5448_();
                            } else {
                                livingEntity80 = null;
                            }
                            double d21 = d20 + (double)livingEntity80.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt37 = (Mob)entity;
                                livingEntity79 = _mobEnt37.m_5448_();
                            } else {
                                livingEntity79 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d21, livingEntity79.m_20189_()));
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n75 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n75 = 0;
                        }
                        if (n75 == 70) {
                            if (world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                            List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity4 : _entfound4) {
                                int n76;
                                float f76;
                                float f77;
                                int n77;
                                float f78;
                                float f79;
                                int n78;
                                float f80;
                                int n79;
                                float f81;
                                LivingEntity _livEnt7;
                                int n80;
                                float f82;
                                if (entity4 instanceof ZombiepigmantitanEntity || entity4 instanceof ZombifiedPiglin || !(entity4 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    LivingEntity _livEnt8 = (LivingEntity)entity4;
                                    f82 = _livEnt8.m_21233_();
                                } else {
                                    f82 = -1.0f;
                                }
                                float f83 = f82 / 20.0f + 18000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n80 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n80 = 0;
                                }
                                entity4.m_6469_(damageSource, f83 + (float)(n80 * 20));
                                if (entity4 instanceof Titangodentity) continue;
                                DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entity4;
                                    f81 = _livEnt7.m_21233_();
                                } else {
                                    f81 = -1.0f;
                                }
                                float f84 = f81 / 20.0f + 18000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n79 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n79 = 0;
                                }
                                entity4.m_6469_(damageSource18, f84 + (float)(n79 * 20));
                                DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entity4;
                                    f80 = _livEnt7.m_21233_();
                                } else {
                                    f80 = -1.0f;
                                }
                                float f85 = f80 / 20.0f + 18000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n78 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n78 = 0;
                                }
                                entity4.m_6469_(damageSource19, f85 + (float)(n78 * 20));
                                if (!(entity4.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity4;
                                    f79 = _livEnt2.m_21233_();
                                } else {
                                    f79 = -1.0f;
                                }
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entity4;
                                    f78 = _livEnt7.m_21223_();
                                } else {
                                    f78 = -1.0f;
                                }
                                float f86 = (f79 + f78) / 5.0f + 180000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n77 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n77 = 0;
                                }
                                entity4.m_6469_(damageSource20, f86 + (float)(n77 * 200));
                                DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity4;
                                    f77 = _livEnt2.m_21233_();
                                } else {
                                    f77 = -1.0f;
                                }
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entity4;
                                    f76 = _livEnt7.m_21223_();
                                } else {
                                    f76 = -1.0f;
                                }
                                float f87 = (f77 + f76) / 5.0f + 180000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n76 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n76 = 0;
                                }
                                entity4.m_6469_(damageSource21, f87 + (float)(n76 * 200));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n74 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n74 = 0;
                        }
                        if (n74 >= 150) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n11 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n11 = 0;
                    }
                    if (n11 == 6) {
                        int n81;
                        int n82;
                        float f88;
                        LivingEntity livingEntity83;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("lightningbolt");
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity83 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity83 = null;
                        }
                        if (livingEntity83 != null) {
                            LivingEntity livingEntity84;
                            if (entity instanceof Mob) {
                                Mob _mobEnt38 = (Mob)entity;
                                livingEntity84 = _mobEnt38.m_5448_();
                            } else {
                                livingEntity84 = null;
                            }
                            f88 = entity.m_20270_(livingEntity84);
                        } else {
                            f88 = -1.0f;
                        }
                        if (f88 > 1.0f) {
                            LivingEntity livingEntity85;
                            LivingEntity livingEntity86;
                            LivingEntity livingEntity87;
                            LivingEntity livingEntity88;
                            if (entity instanceof Mob) {
                                Mob _mobEnt39 = (Mob)entity;
                                livingEntity88 = _mobEnt39.m_5448_();
                            } else {
                                livingEntity88 = null;
                            }
                            double d = livingEntity88.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity87 = _mobEnt.m_5448_();
                            } else {
                                livingEntity87 = null;
                            }
                            double d22 = livingEntity87.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt40 = (Mob)entity;
                                livingEntity86 = _mobEnt40.m_5448_();
                            } else {
                                livingEntity86 = null;
                            }
                            double d23 = d22 + (double)livingEntity86.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt41 = (Mob)entity;
                                livingEntity85 = _mobEnt41.m_5448_();
                            } else {
                                livingEntity85 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d23, livingEntity85.m_20189_()));
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n82 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n82 = 0;
                        }
                        if (n82 == 100) {
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
                                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                                if (entityToSpawn == null) continue;
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                            for (int index4 = 0; index4 < 120; ++index4) {
                                float f89;
                                LivingEntity livingEntity89;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt42 = (Mob)entity;
                                    livingEntity89 = _mobEnt42.m_5448_();
                                } else {
                                    livingEntity89 = null;
                                }
                                if (livingEntity89 != null) {
                                    LivingEntity livingEntity90;
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity90 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity90 = null;
                                    }
                                    f89 = entity.m_20270_(livingEntity90);
                                } else {
                                    f89 = -1.0f;
                                }
                                if (f89 > 1.0f) {
                                    LivingEntity livingEntity91;
                                    LivingEntity livingEntity92;
                                    Mob _mobEnt9;
                                    LivingEntity livingEntity93;
                                    if (!(world instanceof ServerLevel)) continue;
                                    ServerLevel serverLevel = (ServerLevel)world;
                                    _entityToSpawn = new Object(){

                                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                            FlashballEntity entityToSpawn = new FlashballEntity((EntityType<? extends FlashballEntity>)((EntityType)UltimateskeletonsModEntities.FLASHBALL.get()), level);
                                            entityToSpawn.m_5602_(shooter);
                                            entityToSpawn.m_36781_(damage);
                                            entityToSpawn.m_36735_(knockback);
                                            entityToSpawn.m_20225_(true);
                                            entityToSpawn.m_36762_(true);
                                            return entityToSpawn;
                                        }
                                    }.getArrow((Level)serverLevel, entity, 300.0f, 1);
                                    _entityToSpawn.m_6034_(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-12, (int)12), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)36, (int)60), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-12, (int)12));
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt43 = (Mob)entity;
                                        livingEntity93 = _mobEnt43.m_5448_();
                                    } else {
                                        livingEntity93 = null;
                                    }
                                    double d = livingEntity93.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt9 = (Mob)entity;
                                        livingEntity92 = _mobEnt9.m_5448_();
                                    } else {
                                        livingEntity92 = null;
                                    }
                                    double d24 = livingEntity92.m_20186_() - Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)28.0, (double)32.0) - entity.m_20186_();
                                    if (entity instanceof Mob) {
                                        _mobEnt9 = (Mob)entity;
                                        livingEntity91 = _mobEnt9.m_5448_();
                                    } else {
                                        livingEntity91 = null;
                                    }
                                    _entityToSpawn.m_6686_(d, d24, livingEntity91.m_20189_() - entity.m_20189_(), 4.0f, 32.0f);
                                    serverLevel.m_7967_((Entity)_entityToSpawn);
                                    continue;
                                }
                                if (!(world instanceof ServerLevel)) continue;
                                ServerLevel serverLevel = (ServerLevel)world;
                                _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        FlashballEntity entityToSpawn = new FlashballEntity((EntityType<? extends FlashballEntity>)((EntityType)UltimateskeletonsModEntities.FLASHBALL.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)serverLevel, entity, 300.0f, 1);
                                _entityToSpawn.m_6034_(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-12, (int)12), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)36, (int)60), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-12, (int)12));
                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0f, 32.0f);
                                serverLevel.m_7967_((Entity)_entityToSpawn);
                            }
                            Vec3 _center = new Vec3(x, y, z);
                            List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity5 : _entfound5) {
                                int n83;
                                float f90;
                                float f91;
                                int n84;
                                float f92;
                                float f93;
                                int n85;
                                float f94;
                                int n86;
                                float f95;
                                LivingEntity _livEnt8;
                                int n87;
                                float f96;
                                if (entity5 instanceof ZombiepigmantitanEntity || entity5 instanceof ZombifiedPiglin || !(entity5 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt9 = (LivingEntity)entity5;
                                    f96 = _livEnt9.m_21233_();
                                } else {
                                    f96 = -1.0f;
                                }
                                float f97 = f96 / 20.0f + 12000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n87 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n87 = 0;
                                }
                                entity5.m_6469_(damageSource, f97 + (float)(n87 * 20));
                                if (entity5 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity5 instanceof Player)) {
                                    entity5.f_19802_ = 0;
                                    Deathlist.normalattack(entity5);
                                }
                                DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f95 = _livEnt8.m_21233_();
                                } else {
                                    f95 = -1.0f;
                                }
                                float f98 = f95 / 20.0f + 12000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n86 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n86 = 0;
                                }
                                entity5.m_6469_(damageSource22, f98 + (float)(n86 * 20));
                                DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f94 = _livEnt8.m_21233_();
                                } else {
                                    f94 = -1.0f;
                                }
                                float f99 = f94 / 20.0f + 12000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n85 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n85 = 0;
                                }
                                entity5.m_6469_(damageSource23, f99 + (float)(n85 * 20));
                                entity5.m_20256_(new Vec3(0.0, 3.0, 0.0));
                                if (!(entity5.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity5;
                                    f93 = _livEnt2.m_21233_();
                                } else {
                                    f93 = -1.0f;
                                }
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f92 = _livEnt8.m_21223_();
                                } else {
                                    f92 = -1.0f;
                                }
                                float f100 = (f93 + f92) / 5.0f + 120000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n84 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n84 = 0;
                                }
                                entity5.m_6469_(damageSource24, f100 + (float)(n84 * 200));
                                DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity5;
                                    f91 = _livEnt2.m_21233_();
                                } else {
                                    f91 = -1.0f;
                                }
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f90 = _livEnt8.m_21223_();
                                } else {
                                    f90 = -1.0f;
                                }
                                float f101 = (f91 + f90) / 5.0f + 120000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n83 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n83 = 0;
                                }
                                entity5.m_6469_(damageSource25, f101 + (float)(n83 * 200));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n81 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n81 = 0;
                        }
                        if (n81 >= 120) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n10 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 8) {
                        int n88;
                        int n89;
                        int n90;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("slash");
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n90 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n90 = 0;
                        }
                        if (n90 == 1) {
                            float f102;
                            LivingEntity livingEntity94;
                            if (entity instanceof Mob) {
                                Mob _mobEnt44 = (Mob)entity;
                                livingEntity94 = _mobEnt44.m_5448_();
                            } else {
                                livingEntity94 = null;
                            }
                            if (livingEntity94 != null) {
                                LivingEntity livingEntity95;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt45 = (Mob)entity;
                                    livingEntity95 = _mobEnt45.m_5448_();
                                } else {
                                    livingEntity95 = null;
                                }
                                f102 = entity.m_20270_(livingEntity95);
                            } else {
                                f102 = -1.0f;
                            }
                            if (f102 > 1.0f) {
                                LivingEntity livingEntity96;
                                LivingEntity livingEntity97;
                                LivingEntity livingEntity98;
                                LivingEntity livingEntity99;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity99 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity99 = null;
                                }
                                double d = livingEntity99.m_20185_();
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity98 = mob.m_5448_();
                                } else {
                                    livingEntity98 = null;
                                }
                                double d25 = livingEntity98.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity97 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity97 = null;
                                }
                                double d26 = d25 + (double)livingEntity97.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity96 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity96 = null;
                                }
                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity96.m_20189_()));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n89 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n89 = 0;
                        }
                        if (n89 == 160) {
                            if (world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                            List<Entity> _entfound6 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity6 : _entfound6) {
                                int n91;
                                float f103;
                                float f104;
                                int n92;
                                float f105;
                                float f106;
                                int n93;
                                float f107;
                                int n94;
                                float f108;
                                LivingEntity _livEnt9;
                                int n95;
                                float f109;
                                if (entity6 instanceof ZombiepigmantitanEntity || entity6 instanceof ZombifiedPiglin || !(entity6 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt10 = (LivingEntity)entity6;
                                    f109 = _livEnt10.m_21233_();
                                } else {
                                    f109 = -1.0f;
                                }
                                float f110 = f109 / 10.0f + 45000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n95 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n95 = 0;
                                }
                                entity6.m_6469_(damageSource, f110 + (float)(n95 * 20));
                                if (entity6 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity6 instanceof Player)) {
                                    entity6.f_19802_ = 0;
                                    Deathlist.normalattack(entity6);
                                }
                                DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    _livEnt9 = (LivingEntity)entity6;
                                    f108 = _livEnt9.m_21233_();
                                } else {
                                    f108 = -1.0f;
                                }
                                float f111 = f108 / 10.0f + 45000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n94 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n94 = 0;
                                }
                                entity6.m_6469_(damageSource26, f111 + (float)(n94 * 20));
                                DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    _livEnt9 = (LivingEntity)entity6;
                                    f107 = _livEnt9.m_21233_();
                                } else {
                                    f107 = -1.0f;
                                }
                                float f112 = f107 / 10.0f + 45000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n93 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n93 = 0;
                                }
                                entity6.m_6469_(damageSource27, f112 + (float)(n93 * 20));
                                entity6.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                if (!(entity6.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity6;
                                    f106 = _livEnt2.m_21233_();
                                } else {
                                    f106 = -1.0f;
                                }
                                if (entity6 instanceof LivingEntity) {
                                    _livEnt9 = (LivingEntity)entity6;
                                    f105 = _livEnt9.m_21223_();
                                } else {
                                    f105 = -1.0f;
                                }
                                float f113 = (f106 + f105) / 5.0f + 450000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n92 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n92 = 0;
                                }
                                entity6.m_6469_(damageSource28, f113 + (float)(n92 * 200));
                                DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity6;
                                    f104 = _livEnt2.m_21233_();
                                } else {
                                    f104 = -1.0f;
                                }
                                if (entity6 instanceof LivingEntity) {
                                    _livEnt9 = (LivingEntity)entity6;
                                    f103 = _livEnt9.m_21223_();
                                } else {
                                    f103 = -1.0f;
                                }
                                float f114 = (f104 + f103) / 5.0f + 450000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n91 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n91 = 0;
                                }
                                entity6.m_6469_(damageSource29, f114 + (float)(n91 * 200));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n88 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n88 = 0;
                        }
                        if (n88 >= 270) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n9 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 7) {
                        int n96;
                        int n97;
                        float f115;
                        LivingEntity livingEntity100;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("masterball");
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity100 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity100 = null;
                        }
                        if (livingEntity100 != null) {
                            LivingEntity livingEntity101;
                            if (entity instanceof Mob) {
                                Mob _mobEnt46 = (Mob)entity;
                                livingEntity101 = _mobEnt46.m_5448_();
                            } else {
                                livingEntity101 = null;
                            }
                            f115 = entity.m_20270_(livingEntity101);
                        } else {
                            f115 = -1.0f;
                        }
                        if (f115 > 1.0f) {
                            LivingEntity livingEntity102;
                            LivingEntity livingEntity103;
                            LivingEntity livingEntity104;
                            LivingEntity livingEntity105;
                            if (entity instanceof Mob) {
                                Mob _mobEnt47 = (Mob)entity;
                                livingEntity105 = _mobEnt47.m_5448_();
                            } else {
                                livingEntity105 = null;
                            }
                            double d = livingEntity105.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity104 = _mobEnt.m_5448_();
                            } else {
                                livingEntity104 = null;
                            }
                            double d27 = livingEntity104.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt48 = (Mob)entity;
                                livingEntity103 = _mobEnt48.m_5448_();
                            } else {
                                livingEntity103 = null;
                            }
                            double d28 = d27 + (double)livingEntity103.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt49 = (Mob)entity;
                                livingEntity102 = _mobEnt49.m_5448_();
                            } else {
                                livingEntity102 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity102.m_20189_()));
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n97 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n97 = 0;
                        }
                        if (n97 == 85) {
                            float f116;
                            LivingEntity livingEntity106;
                            if (entity instanceof Mob) {
                                Mob _mobEnt50 = (Mob)entity;
                                livingEntity106 = _mobEnt50.m_5448_();
                            } else {
                                livingEntity106 = null;
                            }
                            if (livingEntity106 != null) {
                                LivingEntity livingEntity107;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt51 = (Mob)entity;
                                    livingEntity107 = _mobEnt51.m_5448_();
                                } else {
                                    livingEntity107 = null;
                                }
                                f116 = entity.m_20270_(livingEntity107);
                            } else {
                                f116 = -1.0f;
                            }
                            if (f116 > 1.0f) {
                                for (int index5 = 0; index5 < 4; ++index5) {
                                    LivingEntity livingEntity108;
                                    LivingEntity livingEntity109;
                                    Mob _mobEnt10;
                                    LivingEntity livingEntity110;
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
                                        Mob _mobEnt52 = (Mob)entity;
                                        livingEntity110 = _mobEnt52.m_5448_();
                                    } else {
                                        livingEntity110 = null;
                                    }
                                    double d = livingEntity110.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt10 = (Mob)entity;
                                        livingEntity109 = _mobEnt10.m_5448_();
                                    } else {
                                        livingEntity109 = null;
                                    }
                                    double d29 = livingEntity109.m_20186_() - 22.0 - entity.m_20186_();
                                    if (entity instanceof Mob) {
                                        _mobEnt10 = (Mob)entity;
                                        livingEntity108 = _mobEnt10.m_5448_();
                                    } else {
                                        livingEntity108 = null;
                                    }
                                    _entityToSpawn.m_6686_(d, d29, livingEntity108.m_20189_() - entity.m_20189_(), 3.0f, 24.0f);
                                    serverLevel.m_7967_((Entity)_entityToSpawn);
                                }
                            } else {
                                for (int index6 = 0; index6 < 4; ++index6) {
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
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n96 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n96 = 0;
                        }
                        if (n96 >= 125) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n8 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n8 = 0;
                    }
                    if (n8 == 9) {
                        int n98;
                        int n99;
                        float f117;
                        LivingEntity livingEntity111;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ((ZombiepigmantitanEntity)entity).setAnimation("zombieapocalypse");
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity111 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity111 = null;
                        }
                        if (livingEntity111 != null) {
                            LivingEntity livingEntity112;
                            if (entity instanceof Mob) {
                                Mob _mobEnt53 = (Mob)entity;
                                livingEntity112 = _mobEnt53.m_5448_();
                            } else {
                                livingEntity112 = null;
                            }
                            f117 = entity.m_20270_(livingEntity112);
                        } else {
                            f117 = -1.0f;
                        }
                        if (f117 > 1.0f) {
                            LivingEntity livingEntity113;
                            LivingEntity livingEntity114;
                            LivingEntity livingEntity115;
                            LivingEntity livingEntity116;
                            if (entity instanceof Mob) {
                                Mob _mobEnt54 = (Mob)entity;
                                livingEntity116 = _mobEnt54.m_5448_();
                            } else {
                                livingEntity116 = null;
                            }
                            double d = livingEntity116.m_20185_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt55 = (Mob)entity;
                                livingEntity115 = _mobEnt55.m_5448_();
                            } else {
                                livingEntity115 = null;
                            }
                            double d30 = livingEntity115.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt56 = (Mob)entity;
                                livingEntity114 = _mobEnt56.m_5448_();
                            } else {
                                livingEntity114 = null;
                            }
                            double d31 = d30 + (double)livingEntity114.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt57 = (Mob)entity;
                                livingEntity113 = _mobEnt57.m_5448_();
                            } else {
                                livingEntity113 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d31, livingEntity113.m_20189_()));
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n99 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n99 = 0;
                        }
                        if (n99 == 20) {
                            Vec3 _center = new Vec3(x, y, z);
                            List<Entity> _entfound7 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity7 : _entfound7) {
                                int n100;
                                float f118;
                                float f119;
                                int n101;
                                float f120;
                                float f121;
                                int n102;
                                float f122;
                                int n103;
                                float f123;
                                LivingEntity _livEnt10;
                                int n104;
                                float f124;
                                if (entity7 instanceof ZombiepigmantitanEntity || entity7 instanceof ZombifiedPiglin || !(entity7 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt11 = (LivingEntity)entity7;
                                    f124 = _livEnt11.m_21233_();
                                } else {
                                    f124 = -1.0f;
                                }
                                float f125 = f124 / 10.0f + 400.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n104 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n104 = 0;
                                }
                                entity7.m_6469_(damageSource, f125 + (float)(n104 * 20));
                                if (entity7 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity7 instanceof Player)) {
                                    entity7.f_19802_ = 0;
                                    Deathlist.normalattack(entity7);
                                }
                                DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    _livEnt10 = (LivingEntity)entity7;
                                    f123 = _livEnt10.m_21233_();
                                } else {
                                    f123 = -1.0f;
                                }
                                float f126 = f123 / 10.0f + 400.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n103 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n103 = 0;
                                }
                                entity7.m_6469_(damageSource30, f126 + (float)(n103 * 20));
                                DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    _livEnt10 = (LivingEntity)entity7;
                                    f122 = _livEnt10.m_21233_();
                                } else {
                                    f122 = -1.0f;
                                }
                                float f127 = f122 / 10.0f + 400.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n102 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n102 = 0;
                                }
                                entity7.m_6469_(damageSource31, f127 + (float)(n102 * 20));
                                entity7.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                if (!(entity7.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity7;
                                    f121 = _livEnt2.m_21233_();
                                } else {
                                    f121 = -1.0f;
                                }
                                if (entity7 instanceof LivingEntity) {
                                    _livEnt10 = (LivingEntity)entity7;
                                    f120 = _livEnt10.m_21223_();
                                } else {
                                    f120 = -1.0f;
                                }
                                float f128 = (f121 + f120) / 5.0f + 4000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n101 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n101 = 0;
                                }
                                entity7.m_6469_(damageSource32, f128 + (float)(n101 * 200));
                                DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    _livEnt2 = (LivingEntity)entity7;
                                    f119 = _livEnt2.m_21233_();
                                } else {
                                    f119 = -1.0f;
                                }
                                if (entity7 instanceof LivingEntity) {
                                    _livEnt10 = (LivingEntity)entity7;
                                    f118 = _livEnt10.m_21223_();
                                } else {
                                    f118 = -1.0f;
                                }
                                float f129 = (f119 + f118) / 5.0f + 4000.0f;
                                if (entity instanceof ZombiepigmantitanEntity) {
                                    _datEntI2 = (ZombiepigmantitanEntity)entity;
                                    n100 = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                                } else {
                                    n100 = 0;
                                }
                                entity7.m_6469_(damageSource33, f129 + (float)(n100 * 200));
                            }
                        }
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)entity;
                            n98 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n98 = 0;
                        }
                        if (n98 >= 163) {
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof ZombiepigmantitanEntity) {
                                ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)entity;
                        n7 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationID);
                    } else {
                        n7 = 0;
                    }
                    if (n7 != 10) break block1005;
                    if (entity instanceof ZombiepigmantitanEntity) {
                        ((ZombiepigmantitanEntity)entity).setAnimation("lightningshot");
                    }
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity = _mobEnt2.m_5448_();
                    } else {
                        livingEntity = null;
                    }
                    if (livingEntity != null) {
                        LivingEntity livingEntity117;
                        if (entity instanceof Mob) {
                            Mob _mobEnt58 = (Mob)entity;
                            livingEntity117 = _mobEnt58.m_5448_();
                        } else {
                            livingEntity117 = null;
                        }
                        f = entity.m_20270_(livingEntity117);
                    } else {
                        f = -1.0f;
                    }
                    if (f > 1.0f) {
                        LivingEntity livingEntity118;
                        LivingEntity livingEntity119;
                        LivingEntity livingEntity120;
                        LivingEntity livingEntity121;
                        if (entity instanceof Mob) {
                            Mob _mobEnt59 = (Mob)entity;
                            livingEntity121 = _mobEnt59.m_5448_();
                        } else {
                            livingEntity121 = null;
                        }
                        double d = livingEntity121.m_20185_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt60 = (Mob)entity;
                            livingEntity120 = _mobEnt60.m_5448_();
                        } else {
                            livingEntity120 = null;
                        }
                        double d32 = livingEntity120.m_20186_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt61 = (Mob)entity;
                            livingEntity119 = _mobEnt61.m_5448_();
                        } else {
                            livingEntity119 = null;
                        }
                        double d33 = d32 + (double)livingEntity119.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            Mob _mobEnt62 = (Mob)entity;
                            livingEntity118 = _mobEnt62.m_5448_();
                        } else {
                            livingEntity118 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d33, livingEntity118.m_20189_()));
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI = (ZombiepigmantitanEntity)entity;
                        n6 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                    } else {
                        n6 = 0;
                    }
                    if (n6 == 1 && world instanceof Level) {
                        Level _level = (Level)world;
                        if (!_level.m_5776_()) {
                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningcharge")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                        } else {
                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningcharge")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI = (ZombiepigmantitanEntity)entity;
                        n5 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                    } else {
                        n5 = 0;
                    }
                    if (n5 >= 40) {
                        int n105;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ZombiepigmantitanEntity _datEntI18 = (ZombiepigmantitanEntity)entity;
                            n105 = (Integer)_datEntI18.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                        } else {
                            n105 = 0;
                        }
                        if (n105 <= 60 && world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-64.0, (double)64.0))), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                        }
                    }
                    if (entity instanceof ZombiepigmantitanEntity) {
                        _datEntI = (ZombiepigmantitanEntity)entity;
                        n4 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                    } else {
                        n4 = 0;
                    }
                    if (n4 == 36) break block1006;
                    if (entity instanceof ZombiepigmantitanEntity) {
                        ZombiepigmantitanEntity _datEntI19 = (ZombiepigmantitanEntity)entity;
                        n3 = (Integer)_datEntI19.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
                    } else {
                        n3 = 0;
                    }
                    if (n3 != 104) break block1007;
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                    }
                }
                for (int index7 = 0; index7 < 32; ++index7) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    Entity entity8 = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0))), MobSpawnType.MOB_SUMMONED);
                    if (entity8 == null) continue;
                    entity8.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n106;
                    float f;
                    float f130;
                    int n107;
                    float f131;
                    float f132;
                    int n108;
                    float f133;
                    int n109;
                    float f134;
                    int n110;
                    float f135;
                    if (entityiterator instanceof ZombiepigmantitanEntity || entityiterator instanceof ZombifiedPiglin || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 6.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f135 = _livEnt2.m_21233_();
                    } else {
                        f135 = -1.0f;
                    }
                    float f136 = f135 / 20.0f + 16000.0f;
                    if (entity instanceof ZombiepigmantitanEntity) {
                        ZombiepigmantitanEntity _datEntI20 = (ZombiepigmantitanEntity)entity;
                        n110 = (Integer)_datEntI20.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n110 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f136 + (float)(n110 * 20));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f134 = _livEnt2.m_21233_();
                    } else {
                        f134 = -1.0f;
                    }
                    float f137 = f134 / 20.0f + 16000.0f;
                    if (entity instanceof ZombiepigmantitanEntity) {
                        ZombiepigmantitanEntity _datEntI21 = (ZombiepigmantitanEntity)entity;
                        n109 = (Integer)_datEntI21.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n109 = 0;
                    }
                    entityiterator.m_6469_(damageSource34, f137 + (float)(n109 * 20));
                    DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f133 = _livEnt2.m_21233_();
                    } else {
                        f133 = -1.0f;
                    }
                    float f138 = f133 / 20.0f + 16000.0f;
                    if (entity instanceof ZombiepigmantitanEntity) {
                        ZombiepigmantitanEntity _datEntI22 = (ZombiepigmantitanEntity)entity;
                        n108 = (Integer)_datEntI22.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n108 = 0;
                    }
                    entityiterator.m_6469_(damageSource35, f138 + (float)(n108 * 20));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f132 = _livEnt.m_21233_();
                    } else {
                        f132 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f131 = _livEnt2.m_21223_();
                    } else {
                        f131 = -1.0f;
                    }
                    float f139 = (f132 + f131) / 5.0f + 160000.0f;
                    if (entity instanceof ZombiepigmantitanEntity) {
                        ZombiepigmantitanEntity _datEntI23 = (ZombiepigmantitanEntity)entity;
                        n107 = (Integer)_datEntI23.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n107 = 0;
                    }
                    entityiterator.m_6469_(damageSource36, f139 + (float)(n107 * 200));
                    DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f130 = _livEnt.m_21233_();
                    } else {
                        f130 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f140 = (f130 + f) / 5.0f + 160000.0f;
                    if (entity instanceof ZombiepigmantitanEntity) {
                        ZombiepigmantitanEntity _datEntI24 = (ZombiepigmantitanEntity)entity;
                        n106 = (Integer)_datEntI24.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n106 = 0;
                    }
                    entityiterator.m_6469_(damageSource37, f140 + (float)(n106 * 200));
                }
            }
            if (entity instanceof ZombiepigmantitanEntity) {
                _datEntI = (ZombiepigmantitanEntity)entity;
                n2 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 == 104) {
                float f;
                LivingEntity livingEntity;
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index8 = 0; index8 < 32; ++index8) {
                    Entity entityToSpawn;
                    float f141;
                    LivingEntity livingEntity122;
                    if (entity instanceof Mob) {
                        Mob _mobEnt63 = (Mob)entity;
                        livingEntity122 = _mobEnt63.m_5448_();
                    } else {
                        livingEntity122 = null;
                    }
                    if (livingEntity122 != null) {
                        LivingEntity livingEntity123;
                        if (entity instanceof Mob) {
                            Mob _mobEnt64 = (Mob)entity;
                            livingEntity123 = _mobEnt64.m_5448_();
                        } else {
                            livingEntity123 = null;
                        }
                        f141 = entity.m_20270_(livingEntity123);
                    } else {
                        f141 = -1.0f;
                    }
                    if (f141 > 1.0f) {
                        LivingEntity livingEntity124;
                        LivingEntity livingEntity125;
                        Mob _mobEnt;
                        LivingEntity livingEntity126;
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel serverLevel = (ServerLevel)world;
                        EntityType entityType = (EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get();
                        if (entity instanceof Mob) {
                            Mob _mobEnt65 = (Mob)entity;
                            livingEntity126 = _mobEnt65.m_5448_();
                        } else {
                            livingEntity126 = null;
                        }
                        double d = livingEntity126.m_20185_() + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-48.0, (double)48.0);
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity125 = _mobEnt.m_5448_();
                        } else {
                            livingEntity125 = null;
                        }
                        double d34 = livingEntity125.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity124 = _mobEnt.m_5448_();
                        } else {
                            livingEntity124 = null;
                        }
                        entityToSpawn = entityType.m_262496_(serverLevel, BlockPos.m_274561_((double)d, (double)d34, (double)(livingEntity124.m_20189_() + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-48.0, (double)48.0))), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn == null) continue;
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        continue;
                    }
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel serverLevel = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(serverLevel, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 60.0 + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-48.0, (double)48.0)), (double)y, (double)(z + entity.m_20154_().f_82481_ * 60.0 + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-48.0, (double)48.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt66 = (Mob)entity;
                    livingEntity = _mobEnt66.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity127;
                    if (entity instanceof Mob) {
                        Mob _mobEnt67 = (Mob)entity;
                        livingEntity127 = _mobEnt67.m_5448_();
                    } else {
                        livingEntity127 = null;
                    }
                    f = entity.m_20270_(livingEntity127);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity128;
                    LivingEntity livingEntity129;
                    LivingEntity livingEntity130;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity130 = mob.m_5448_();
                    } else {
                        livingEntity130 = null;
                    }
                    double d = livingEntity130.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity129 = mob.m_5448_();
                    } else {
                        livingEntity129 = null;
                    }
                    double d35 = livingEntity129.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity128 = mob.m_5448_();
                    } else {
                        livingEntity128 = null;
                    }
                    Vec3 _center = new Vec3(d, d35, livingEntity128.m_20189_());
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : list) {
                        int n111;
                        float f142;
                        float f143;
                        int n112;
                        float f144;
                        float f145;
                        int n113;
                        float f146;
                        int n114;
                        ZombiepigmantitanEntity _datEntI7;
                        float f147;
                        int n115;
                        float f148;
                        if (entityiterator instanceof ZombiepigmantitanEntity || entityiterator instanceof ZombifiedPiglin || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f148 = _livEnt.m_21233_();
                        } else {
                            f148 = -1.0f;
                        }
                        float f149 = f148 / 20.0f + 16000.0f;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            ZombiepigmantitanEntity _datEntI25 = (ZombiepigmantitanEntity)entity;
                            n115 = (Integer)_datEntI25.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                        } else {
                            n115 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f149 + (float)(n115 * 20));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource38 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f147 = _livEnt.m_21233_();
                        } else {
                            f147 = -1.0f;
                        }
                        float f150 = f147 / 20.0f + 16000.0f;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI7 = (ZombiepigmantitanEntity)entity;
                            n114 = (Integer)_datEntI7.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                        } else {
                            n114 = 0;
                        }
                        entityiterator.m_6469_(damageSource38, f150 + (float)(n114 * 20));
                        DamageSource damageSource39 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f146 = _livEnt.m_21233_();
                        } else {
                            f146 = -1.0f;
                        }
                        float f151 = f146 / 20.0f + 16000.0f;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI7 = (ZombiepigmantitanEntity)entity;
                            n113 = (Integer)_datEntI7.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                        } else {
                            n113 = 0;
                        }
                        entityiterator.m_6469_(damageSource39, f151 + (float)(n113 * 20));
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource40 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt12 = (LivingEntity)entityiterator;
                            f145 = _livEnt12.m_21233_();
                        } else {
                            f145 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f144 = _livEnt.m_21223_();
                        } else {
                            f144 = -1.0f;
                        }
                        float f152 = (f145 + f144) / 5.0f + 160000.0f;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI7 = (ZombiepigmantitanEntity)entity;
                            n112 = (Integer)_datEntI7.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                        } else {
                            n112 = 0;
                        }
                        entityiterator.m_6469_(damageSource40, f152 + (float)(n112 * 200));
                        DamageSource damageSource41 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt11 = (LivingEntity)entityiterator;
                            f143 = _livEnt11.m_21233_();
                        } else {
                            f143 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f142 = _livEnt.m_21223_();
                        } else {
                            f142 = -1.0f;
                        }
                        float f153 = (f143 + f142) / 5.0f + 160000.0f;
                        if (entity instanceof ZombiepigmantitanEntity) {
                            _datEntI7 = (ZombiepigmantitanEntity)entity;
                            n111 = (Integer)_datEntI7.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                        } else {
                            n111 = 0;
                        }
                        entityiterator.m_6469_(damageSource41, f153 + (float)(n111 * 200));
                    }
                }
            }
            if (entity instanceof ZombiepigmantitanEntity) {
                _datEntI = (ZombiepigmantitanEntity)entity;
                n = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_animationTick);
            } else {
                n = 0;
            }
            if (n >= 130) {
                if (entity instanceof ZombiepigmantitanEntity) {
                    ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof ZombiepigmantitanEntity) {
                    ZombiepigmantitanEntity _datEntSetI = (ZombiepigmantitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(ZombiepigmantitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof ZombiepigmantitanEntity) {
                    ((ZombiepigmantitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

