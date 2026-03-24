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
import net.mcreator.ultimateskeletons.entity.GiantwebEntity;
import net.mcreator.ultimateskeletons.entity.PosionEntity;
import net.mcreator.ultimateskeletons.entity.SpidertitanEntity;
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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class SpidertitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        SpidertitanEntity _datEntI;
        int n7;
        Mob _mobEnt;
        Mob _mobEnt2;
        SpidertitanEntity _datEntI2;
        Object _mobEnt3;
        Mob _mobEnt4;
        SpidertitanEntity _datEntI3;
        SpidertitanEntity _datEntI4;
        block699: {
            LivingEntity livingEntity;
            block700: {
                block701: {
                    LivingEntity livingEntity2;
                    float f;
                    LivingEntity livingEntity3;
                    int n8;
                    int n9;
                    int n10;
                    float f2;
                    Object object;
                    LivingEntity _livEnt;
                    block697: {
                        block698: {
                            int n11;
                            int n12;
                            int n13;
                            int n14;
                            int n15;
                            int n16;
                            ServerLevel _level;
                            SpidertitanEntity _datEntI5;
                            block696: {
                                int n17;
                                int n18;
                                int n19;
                                int n20;
                                Mob _entity;
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
                                if (entity instanceof SpidertitanEntity) {
                                    int n21;
                                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof SpidertitanEntity) {
                                        _datEntI4 = (SpidertitanEntity)entity;
                                        n21 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                                    } else {
                                        n21 = 0;
                                    }
                                    synchedEntityData.m_135381_(SpidertitanEntity.DATA_spawnTick, (Object)(n21 + 1));
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    f3 = _livEnt.m_21223_();
                                } else {
                                    f3 = -1.0f;
                                }
                                if (f3 <= 0.0f) {
                                    int n22;
                                    if (entity instanceof Mob) {
                                        _entity = (Mob)entity;
                                        _entity.m_6710_(null);
                                    }
                                    if (entity instanceof SpidertitanEntity) {
                                        _datEntI4 = (SpidertitanEntity)entity;
                                        n22 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
                                    } else {
                                        n22 = 0;
                                    }
                                    if (n22 == 0) {
                                        int n23;
                                        int n24;
                                        int n25;
                                        int n26;
                                        int n27;
                                        if (entity instanceof SpidertitanEntity) {
                                            int n28;
                                            SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                            if (entity instanceof SpidertitanEntity) {
                                                SpidertitanEntity _datEntI6 = (SpidertitanEntity)entity;
                                                n28 = (Integer)_datEntI6.m_20088_().m_135370_(SpidertitanEntity.DATA_deathTick);
                                            } else {
                                                n28 = 0;
                                            }
                                            synchedEntityData.m_135381_(SpidertitanEntity.DATA_deathTick, (Object)(n28 + 1));
                                        }
                                        if (entity instanceof SpidertitanEntity) {
                                            _datEntI5 = (SpidertitanEntity)entity;
                                            n27 = (Integer)_datEntI5.m_20088_().m_135370_(SpidertitanEntity.DATA_deathTick);
                                        } else {
                                            n27 = 0;
                                        }
                                        if (n27 == 1 && world instanceof Level) {
                                            Level _level2 = (Level)world;
                                            if (!_level2.m_5776_()) {
                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spidertitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spidertitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof SpidertitanEntity) {
                                            _datEntI5 = (SpidertitanEntity)entity;
                                            n26 = (Integer)_datEntI5.m_20088_().m_135370_(SpidertitanEntity.DATA_deathTick);
                                        } else {
                                            n26 = 0;
                                        }
                                        if (n26 < 3) {
                                            for (int index0 = 0; index0 < 12; ++index0) {
                                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                            }
                                        }
                                        if (entity instanceof SpidertitanEntity) {
                                            _datEntI5 = (SpidertitanEntity)entity;
                                            n25 = (Integer)_datEntI5.m_20088_().m_135370_(SpidertitanEntity.DATA_deathTick);
                                        } else {
                                            n25 = 0;
                                        }
                                        if (n25 < 10 && entity instanceof SpidertitanEntity) {
                                            ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.death");
                                        }
                                        if (entity instanceof SpidertitanEntity) {
                                            _datEntI5 = (SpidertitanEntity)entity;
                                            n24 = (Integer)_datEntI5.m_20088_().m_135370_(SpidertitanEntity.DATA_deathTick);
                                        } else {
                                            n24 = 0;
                                        }
                                        if (n24 == 700) {
                                            if (world instanceof ServerLevel) {
                                                ServerLevel _level3 = (ServerLevel)world;
                                                _level3.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level3, 4, "", (Component)Component.m_237113_((String)""), _level3.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"spidertitan\"'}");
                                            }
                                            for (int index1 = 0; index1 < 320; ++index1) {
                                                world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                            }
                                        }
                                        if (entity instanceof SpidertitanEntity) {
                                            _datEntI5 = (SpidertitanEntity)entity;
                                            n23 = (Integer)_datEntI5.m_20088_().m_135370_(SpidertitanEntity.DATA_deathTick);
                                        } else {
                                            n23 = 0;
                                        }
                                        if (n23 >= 700 && !entity.m_9236_().m_5776_()) {
                                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                        }
                                    }
                                }
                                if (!entity.m_5446_().getString().equals("growing")) break block696;
                                if (entity instanceof SpidertitanEntity) {
                                    _datEntI3 = (SpidertitanEntity)entity;
                                    n20 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                                } else {
                                    n20 = 0;
                                }
                                if (n20 >= 720) break block697;
                                entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                entity.f_19802_ = 20;
                                if (entity instanceof LivingEntity) {
                                    ((LivingEntity)entity).f_20919_ = 0;
                                }
                                ((SpidertitanEntity)entity).setHEALTS(16000.0);
                                if (entity instanceof Mob) {
                                    _entity = (Mob)entity;
                                    _entity.m_6710_(null);
                                }
                                if (entity instanceof SpidertitanEntity) {
                                    _datEntI4 = (SpidertitanEntity)entity;
                                    n19 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                                } else {
                                    n19 = 0;
                                }
                                if (n19 == 450 && world instanceof ServerLevel) {
                                    _level = (ServerLevel)world;
                                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                    if (entityToSpawn != null) {
                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                    }
                                }
                                if (entity instanceof SpidertitanEntity) {
                                    _datEntI4 = (SpidertitanEntity)entity;
                                    n18 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                                } else {
                                    n18 = 0;
                                }
                                if (n18 <= 10 && entity instanceof SpidertitanEntity) {
                                    ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.titanizion");
                                }
                                if (entity instanceof SpidertitanEntity) {
                                    _datEntI4 = (SpidertitanEntity)entity;
                                    n17 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                                } else {
                                    n17 = 0;
                                }
                                if (n17 == 719) {
                                    if (world instanceof Level) {
                                        _level = (Level)world;
                                        if (!_level.m_5776_()) {
                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                        } else {
                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                        }
                                    }
                                    if (!world.m_5776_() && world.m_7654_() != null) {
                                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Spidertitan has been created!!!"), false);
                                    }
                                }
                                if (entity.m_20096_()) break block697;
                                if (entity.m_20186_() < -63.0) {
                                    entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                } else {
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                }
                                break block697;
                            }
                            if (entity instanceof SpidertitanEntity) {
                                _datEntI3 = (SpidertitanEntity)entity;
                                n16 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                            } else {
                                n16 = 0;
                            }
                            if (n16 >= 220) break block697;
                            entity.m_6593_((Component)Component.m_237113_((String)"Spidertitan"));
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity)entity).f_20919_ = 0;
                            }
                            ((SpidertitanEntity)entity).setHEALTS(16000.0);
                            entity.f_19802_ = 20;
                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                            if (!entity.m_20096_()) {
                                if (entity.m_20186_() > -63.0) {
                                    entity.m_20256_(new Vec3(0.0, -2.0, 0.0));
                                } else {
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                }
                            }
                            if (entity instanceof SpidertitanEntity) {
                                _datEntI4 = (SpidertitanEntity)entity;
                                n15 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                            } else {
                                n15 = 0;
                            }
                            if (n15 == 1) {
                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.m_5776_()) {
                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spidertitanidle")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                    } else {
                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spidertitanidle")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                    }
                                }
                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel)world;
                                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                    if (entityToSpawn != null) {
                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                    }
                                }
                            }
                            if (entity instanceof SpidertitanEntity) {
                                _datEntI4 = (SpidertitanEntity)entity;
                                n14 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                            } else {
                                n14 = 0;
                            }
                            if (n14 <= 10 && entity instanceof SpidertitanEntity) {
                                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.spawn");
                            }
                            if (entity instanceof SpidertitanEntity) {
                                _datEntI4 = (SpidertitanEntity)entity;
                                n13 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                            } else {
                                n13 = 0;
                            }
                            if (n13 == 219 && !world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Spidertitan awake!!!"), false);
                            }
                            if (entity instanceof SpidertitanEntity) {
                                _datEntI4 = (SpidertitanEntity)entity;
                                n12 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                            } else {
                                n12 = 0;
                            }
                            if (n12 == 140) break block698;
                            if (entity instanceof SpidertitanEntity) {
                                _datEntI5 = (SpidertitanEntity)entity;
                                n11 = (Integer)_datEntI5.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                            } else {
                                n11 = 0;
                            }
                            if (n11 != 161) break block697;
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
                        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                        object = _entfound.iterator();
                        while (object.hasNext()) {
                            Entity entityiterator = (Entity)object.next();
                            if (entityiterator instanceof SpidertitanEntity) continue;
                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                            double _setval = 5.0;
                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                capability.camerashake = _setval;
                                capability.syncPlayerVariables(entityiterator);
                            });
                        }
                    }
                    if (!world.m_5776_()) {
                        int n29;
                        if (entity instanceof SpidertitanEntity) {
                            _datEntI3 = (SpidertitanEntity)entity;
                            n29 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
                        } else {
                            n29 = 0;
                        }
                        if (n29 != 0) {
                            float f4;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt2 = (LivingEntity)entity;
                                f4 = _livEnt2.m_21223_();
                            } else {
                                f4 = -1.0f;
                            }
                            if (f4 <= 0.0f) {
                                for (int index2 = 0; index2 < 16; ++index2) {
                                    if (!(entity instanceof SpidertitanEntity)) continue;
                                    ((SpidertitanEntity)entity).setAnimation("empty");
                                }
                            }
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        f2 = _livEnt.m_21223_();
                    } else {
                        f2 = -1.0f;
                    }
                    if (f2 > 0.0f && entity instanceof SpidertitanEntity) {
                        SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_deathTick, (Object)0);
                    }
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI3 = (SpidertitanEntity)entity;
                        n10 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_spawnTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 < 220) break block699;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI4 = (SpidertitanEntity)entity;
                        n9 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 0) {
                        int n30;
                        if (entity instanceof SpidertitanEntity) {
                            SpidertitanEntity _datEntI7 = (SpidertitanEntity)entity;
                            n30 = (Integer)_datEntI7.m_20088_().m_135370_(SpidertitanEntity.DATA_flyID);
                        } else {
                            n30 = 0;
                        }
                        if (n30 != 0) {
                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                        }
                    }
                    if (world.m_5776_()) break block699;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI4 = (SpidertitanEntity)entity;
                        n8 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
                    } else {
                        n8 = 0;
                    }
                    if (n8 != 0 && entity instanceof SpidertitanEntity) {
                        int n31;
                        SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (entity instanceof SpidertitanEntity) {
                            SpidertitanEntity _datEntI8 = (SpidertitanEntity)entity;
                            n31 = (Integer)_datEntI8.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
                        } else {
                            n31 = 0;
                        }
                        synchedEntityData.m_135381_(SpidertitanEntity.DATA_animationTick, (Object)(n31 + 1));
                    }
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity3 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity3 = null;
                    }
                    if (livingEntity3 == null) break block700;
                    if (entity instanceof Mob) {
                        Mob _mobEnt5 = (Mob)entity;
                        v31 = _mobEnt5.m_5448_();
                    } else {
                        v31 = object = null;
                    }
                    if (object instanceof LivingEntity) {
                        LivingEntity _livEnt3 = object;
                        f = _livEnt3.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= 0.0f) break block701;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity2 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (livingEntity2.m_6084_()) break block700;
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_flyID, (Object)0);
                }
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
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
                    Mob _mobEnt6 = (Mob)entity;
                    livingEntity7 = _mobEnt6.m_5448_();
                } else {
                    livingEntity7 = null;
                }
                double d = livingEntity7.m_20185_();
                if (entity instanceof Mob) {
                    Mob _mobEnt7 = (Mob)entity;
                    livingEntity6 = _mobEnt7.m_5448_();
                } else {
                    livingEntity6 = null;
                }
                double d2 = livingEntity6.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt8 = (Mob)entity;
                    livingEntity5 = _mobEnt8.m_5448_();
                } else {
                    livingEntity5 = null;
                }
                double d3 = d2 + (double)livingEntity5.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt9 = (Mob)entity;
                    livingEntity4 = _mobEnt9.m_5448_();
                } else {
                    livingEntity4 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity4.m_20189_()));
                if (entity instanceof Mob) {
                    Mob _mobEnt10 = (Mob)entity;
                    v42 = _mobEnt10.m_5448_();
                } else {
                    v42 = _mobEnt3 = null;
                }
                if (_mobEnt3 instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)_mobEnt3;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    int n32;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI2 = (SpidertitanEntity)entity;
                        n32 = (Integer)_datEntI2.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
                    } else {
                        n32 = 0;
                    }
                    if (n32 == 0) {
                        float f5;
                        LivingEntity livingEntity8;
                        Mob _mobEnt11;
                        Mob _mobEnt12;
                        Mob _mobEnt13;
                        Mob _mobEnt14;
                        float f6;
                        LivingEntity livingEntity9;
                        float f7;
                        LivingEntity livingEntity10;
                        Mob _mobEnt15;
                        if (entity instanceof Mob) {
                            _mobEnt15 = (Mob)entity;
                            livingEntity10 = _mobEnt15.m_5448_();
                        } else {
                            livingEntity10 = null;
                        }
                        if (livingEntity10 != null) {
                            LivingEntity livingEntity11;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity11 = _mobEnt2.m_5448_();
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
                            _mobEnt15 = (Mob)entity;
                            livingEntity9 = _mobEnt15.m_5448_();
                        } else {
                            livingEntity9 = null;
                        }
                        if (livingEntity9 != null) {
                            LivingEntity livingEntity12;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity12 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity12 = null;
                            }
                            f6 = entity.m_20270_(livingEntity12);
                        } else {
                            f6 = -1.0f;
                        }
                        if (f6 > 60.0f) {
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
                                _mobEnt14 = (Mob)entity;
                                livingEntity18 = _mobEnt14.m_5448_();
                            } else {
                                livingEntity18 = null;
                            }
                            double d4 = livingEntity18.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity17 = _mobEnt.m_5448_();
                            } else {
                                livingEntity17 = null;
                            }
                            if (livingEntity17 != null) {
                                LivingEntity livingEntity19;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt16 = (Mob)entity;
                                    livingEntity19 = _mobEnt16.m_5448_();
                                } else {
                                    livingEntity19 = null;
                                }
                                f10 = entity.m_20270_(livingEntity19);
                            } else {
                                f10 = -1.0f;
                            }
                            double d5 = d4 / (double)f10 * 2.0;
                            if (entity instanceof Mob) {
                                _mobEnt14 = (Mob)entity;
                                livingEntity16 = _mobEnt14.m_5448_();
                            } else {
                                livingEntity16 = null;
                            }
                            double d6 = livingEntity16.m_20186_() - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity15 = _mobEnt.m_5448_();
                            } else {
                                livingEntity15 = null;
                            }
                            if (livingEntity15 != null) {
                                LivingEntity livingEntity20;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt17 = (Mob)entity;
                                    livingEntity20 = _mobEnt17.m_5448_();
                                } else {
                                    livingEntity20 = null;
                                }
                                f9 = entity.m_20270_(livingEntity20);
                            } else {
                                f9 = -1.0f;
                            }
                            double d7 = d6 / (double)f9 * 2.0;
                            if (entity instanceof Mob) {
                                _mobEnt14 = (Mob)entity;
                                livingEntity14 = _mobEnt14.m_5448_();
                            } else {
                                livingEntity14 = null;
                            }
                            double d8 = livingEntity14.m_20189_() - entity.m_20189_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity13 = _mobEnt.m_5448_();
                            } else {
                                livingEntity13 = null;
                            }
                            if (livingEntity13 != null) {
                                LivingEntity livingEntity21;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt18 = (Mob)entity;
                                    livingEntity21 = _mobEnt18.m_5448_();
                                } else {
                                    livingEntity21 = null;
                                }
                                f8 = entity.m_20270_(livingEntity21);
                            } else {
                                f8 = -1.0f;
                            }
                            entity.m_20256_(new Vec3(d5, d7, d8 / (double)f8 * 2.0));
                            if (entity instanceof SpidertitanEntity) {
                                SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_flyID, (Object)1);
                            }
                        } else {
                            LivingEntity livingEntity22;
                            if (entity instanceof Mob) {
                                Mob _mobEnt19 = (Mob)entity;
                                livingEntity22 = _mobEnt19.m_5448_();
                            } else {
                                livingEntity22 = null;
                            }
                            if (livingEntity22.m_20206_() > 8.0f) {
                                float f11;
                                LivingEntity livingEntity23;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity23 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity23 = null;
                                }
                                if (livingEntity23 != null) {
                                    LivingEntity livingEntity24;
                                    if (entity instanceof Mob) {
                                        _mobEnt14 = (Mob)entity;
                                        livingEntity24 = _mobEnt14.m_5448_();
                                    } else {
                                        livingEntity24 = null;
                                    }
                                    f11 = entity.m_20270_(livingEntity24);
                                } else {
                                    f11 = -1.0f;
                                }
                                if (f11 > 30.0f) {
                                    float f12;
                                    LivingEntity livingEntity25;
                                    LivingEntity livingEntity26;
                                    float f13;
                                    LivingEntity livingEntity27;
                                    LivingEntity livingEntity28;
                                    if (entity instanceof Mob) {
                                        _mobEnt13 = (Mob)entity;
                                        livingEntity28 = _mobEnt13.m_5448_();
                                    } else {
                                        livingEntity28 = null;
                                    }
                                    double d9 = livingEntity28.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt12 = (Mob)entity;
                                        livingEntity27 = _mobEnt12.m_5448_();
                                    } else {
                                        livingEntity27 = null;
                                    }
                                    if (livingEntity27 != null) {
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
                                    double d10 = d9 / (double)f13;
                                    if (entity instanceof Mob) {
                                        _mobEnt13 = (Mob)entity;
                                        livingEntity26 = _mobEnt13.m_5448_();
                                    } else {
                                        livingEntity26 = null;
                                    }
                                    double d11 = livingEntity26.m_20189_() - entity.m_20189_();
                                    if (entity instanceof Mob) {
                                        _mobEnt12 = (Mob)entity;
                                        livingEntity25 = _mobEnt12.m_5448_();
                                    } else {
                                        livingEntity25 = null;
                                    }
                                    if (livingEntity25 != null) {
                                        LivingEntity livingEntity30;
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity30 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity30 = null;
                                        }
                                        f12 = entity.m_20270_(livingEntity30);
                                    } else {
                                        f12 = -1.0f;
                                    }
                                    entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f12));
                                }
                            } else {
                                float f14;
                                LivingEntity livingEntity31;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity31 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity31 = null;
                                }
                                if (livingEntity31 != null) {
                                    LivingEntity livingEntity32;
                                    if (entity instanceof Mob) {
                                        _mobEnt14 = (Mob)entity;
                                        livingEntity32 = _mobEnt14.m_5448_();
                                    } else {
                                        livingEntity32 = null;
                                    }
                                    f14 = entity.m_20270_(livingEntity32);
                                } else {
                                    f14 = -1.0f;
                                }
                                if (f14 > 8.0f) {
                                    float f15;
                                    LivingEntity livingEntity33;
                                    LivingEntity livingEntity34;
                                    float f16;
                                    LivingEntity livingEntity35;
                                    LivingEntity livingEntity36;
                                    if (entity instanceof Mob) {
                                        _mobEnt13 = (Mob)entity;
                                        livingEntity36 = _mobEnt13.m_5448_();
                                    } else {
                                        livingEntity36 = null;
                                    }
                                    double d12 = livingEntity36.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt12 = (Mob)entity;
                                        livingEntity35 = _mobEnt12.m_5448_();
                                    } else {
                                        livingEntity35 = null;
                                    }
                                    if (livingEntity35 != null) {
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
                                    double d13 = d12 / (double)f16;
                                    if (entity instanceof Mob) {
                                        _mobEnt13 = (Mob)entity;
                                        livingEntity34 = _mobEnt13.m_5448_();
                                    } else {
                                        livingEntity34 = null;
                                    }
                                    double d14 = livingEntity34.m_20189_() - entity.m_20189_();
                                    if (entity instanceof Mob) {
                                        _mobEnt12 = (Mob)entity;
                                        livingEntity33 = _mobEnt12.m_5448_();
                                    } else {
                                        livingEntity33 = null;
                                    }
                                    if (livingEntity33 != null) {
                                        LivingEntity livingEntity38;
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity38 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity38 = null;
                                        }
                                        f15 = entity.m_20270_(livingEntity38);
                                    } else {
                                        f15 = -1.0f;
                                    }
                                    entity.m_20256_(new Vec3(d13, 0.0, d14 / (double)f15));
                                }
                            }
                            if (entity instanceof SpidertitanEntity) {
                                SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_flyID, (Object)0);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt15 = (Mob)entity;
                            livingEntity8 = _mobEnt15.m_5448_();
                        } else {
                            livingEntity8 = null;
                        }
                        if (livingEntity8 != null) {
                            LivingEntity livingEntity39;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity39 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity39 = null;
                            }
                            f5 = entity.m_20270_(livingEntity39);
                        } else {
                            f5 = -1.0f;
                        }
                        if (f5 < 512.0f) {
                            float f17;
                            LivingEntity livingEntity40;
                            if (entity instanceof Mob) {
                                Mob _mobEnt20 = (Mob)entity;
                                livingEntity40 = _mobEnt20.m_5448_();
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
                                f17 = entity.m_20270_(livingEntity41);
                            } else {
                                f17 = -1.0f;
                            }
                            if (f17 <= 40.0f) {
                                if (((Boolean)SkeletonsConfiguration.ALLOW.get()).booleanValue()) {
                                    LivingEntity livingEntity42;
                                    if (entity instanceof Mob) {
                                        _mobEnt14 = (Mob)entity;
                                        livingEntity42 = _mobEnt14.m_5448_();
                                    } else {
                                        livingEntity42 = null;
                                    }
                                    if (livingEntity42.m_20206_() > 6.0f) {
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)8) == 8) {
                                            if (entity instanceof SpidertitanEntity) {
                                                _datEntSetI = (SpidertitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                            }
                                        } else if (entity instanceof SpidertitanEntity) {
                                            _datEntSetI = (SpidertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)5);
                                        }
                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                        if (entity instanceof SpidertitanEntity) {
                                            _datEntSetI = (SpidertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                        }
                                    } else if (entity instanceof SpidertitanEntity) {
                                        _datEntSetI = (SpidertitanEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                    }
                                } else {
                                    LivingEntity livingEntity43;
                                    if (entity instanceof Mob) {
                                        _mobEnt14 = (Mob)entity;
                                        livingEntity43 = _mobEnt14.m_5448_();
                                    } else {
                                        livingEntity43 = null;
                                    }
                                    if (livingEntity43.m_20206_() > 6.0f) {
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)8) == 8) {
                                            if (entity instanceof SpidertitanEntity) {
                                                _datEntSetI = (SpidertitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)4);
                                            }
                                        } else if (entity instanceof SpidertitanEntity) {
                                            _datEntSetI = (SpidertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)5);
                                        }
                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                        if (entity instanceof SpidertitanEntity) {
                                            _datEntSetI = (SpidertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                        }
                                    } else if (entity instanceof SpidertitanEntity) {
                                        _datEntSetI = (SpidertitanEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2));
                                    }
                                }
                            }
                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                int n33;
                                if (entity instanceof SpidertitanEntity) {
                                    SpidertitanEntity _datEntI9 = (SpidertitanEntity)entity;
                                    n33 = (Integer)_datEntI9.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
                                } else {
                                    n33 = 0;
                                }
                                if (n33 == 0) {
                                    float f18;
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
                                            _mobEnt14 = (Mob)entity;
                                            livingEntity45 = _mobEnt14.m_5448_();
                                        } else {
                                            livingEntity45 = null;
                                        }
                                        f18 = entity.m_20270_(livingEntity45);
                                    } else {
                                        f18 = -1.0f;
                                    }
                                    if (f18 > 60.0f) {
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            LivingEntity livingEntity46;
                                            if (entity instanceof Mob) {
                                                _mobEnt11 = (Mob)entity;
                                                livingEntity46 = _mobEnt11.m_5448_();
                                            } else {
                                                livingEntity46 = null;
                                            }
                                            if (livingEntity46.m_20206_() > 6.0f) {
                                                if (entity instanceof SpidertitanEntity) {
                                                    _datEntSetI = (SpidertitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                                }
                                            } else if (entity instanceof SpidertitanEntity) {
                                                _datEntSetI = (SpidertitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                            }
                                        }
                                    } else {
                                        float f19;
                                        LivingEntity livingEntity47;
                                        if (entity instanceof Mob) {
                                            _mobEnt11 = (Mob)entity;
                                            livingEntity47 = _mobEnt11.m_5448_();
                                        } else {
                                            livingEntity47 = null;
                                        }
                                        if (livingEntity47 != null) {
                                            LivingEntity livingEntity48;
                                            if (entity instanceof Mob) {
                                                _mobEnt12 = (Mob)entity;
                                                livingEntity48 = _mobEnt12.m_5448_();
                                            } else {
                                                livingEntity48 = null;
                                            }
                                            f19 = entity.m_20270_(livingEntity48);
                                        } else {
                                            f19 = -1.0f;
                                        }
                                        if (f19 > 40.0f) {
                                            LivingEntity livingEntity49;
                                            if (entity instanceof Mob) {
                                                _mobEnt13 = (Mob)entity;
                                                livingEntity49 = _mobEnt13.m_5448_();
                                            } else {
                                                livingEntity49 = null;
                                            }
                                            if (livingEntity49.m_20206_() > 6.0f) {
                                                if (entity instanceof SpidertitanEntity) {
                                                    _datEntSetI = (SpidertitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)5));
                                                }
                                            } else if (entity instanceof SpidertitanEntity) {
                                                _datEntSetI = (SpidertitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
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
        if (entity instanceof SpidertitanEntity) {
            _datEntI3 = (SpidertitanEntity)entity;
            n7 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
        } else {
            n7 = 0;
        }
        if (n7 == 1) {
            int n34;
            int n35;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SpidertitanEntity) {
                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.strike");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity50;
                if (entity instanceof Mob) {
                    Mob _mobEnt21 = (Mob)entity;
                    livingEntity50 = _mobEnt21.m_5448_();
                } else {
                    livingEntity50 = null;
                }
                f = entity.m_20270_(livingEntity50);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity51;
                LivingEntity livingEntity52;
                LivingEntity livingEntity53;
                LivingEntity livingEntity54;
                if (entity instanceof Mob) {
                    Mob _mobEnt22 = (Mob)entity;
                    livingEntity54 = _mobEnt22.m_5448_();
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
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity52 = _mobEnt23.m_5448_();
                } else {
                    livingEntity52 = null;
                }
                double d16 = d15 + (double)livingEntity52.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt24 = (Mob)entity;
                    livingEntity51 = _mobEnt24.m_5448_();
                } else {
                    livingEntity51 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity51.m_20189_()));
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n35 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 == 45) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n36;
                    float f20;
                    int n37;
                    float f21;
                    int n38;
                    float f22;
                    int n39;
                    float f23;
                    int n40;
                    float f24;
                    LivingEntity _livEnt;
                    if (entityiterator instanceof SpidertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f24 = _livEnt.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f25 = f24 / 20.0f + 1800.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n40 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n40 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f25 + (float)(n40 * 5));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f23 = _livEnt.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    float f26 = f23 / 20.0f + 1800.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n39 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n39 = 0;
                    }
                    entityiterator.m_6469_(damageSource2, f26 + (float)(n39 * 5));
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f22 = _livEnt.m_21233_();
                    } else {
                        f22 = -1.0f;
                    }
                    float f27 = f22 / 20.0f + 1800.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n38 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n38 = 0;
                    }
                    entityiterator.m_6469_(damageSource3, f27 + (float)(n38 * 5));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f21 = _livEnt.m_21233_();
                    } else {
                        f21 = -1.0f;
                    }
                    float f28 = f21 / 5.0f + 18000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n37 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n37 = 0;
                    }
                    entityiterator.m_6469_(damageSource4, f28 + (float)(n37 * 50));
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f20 = _livEnt.m_21233_();
                    } else {
                        f20 = -1.0f;
                    }
                    float f29 = f20 / 5.0f + 18000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n36 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n36 = 0;
                    }
                    entityiterator.m_6469_(damageSource5, f29 + (float)(n36 * 50));
                }
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n34 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 >= 65) {
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SpidertitanEntity) {
            _datEntI3 = (SpidertitanEntity)entity;
            n6 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 2) {
            int n41;
            int n42;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SpidertitanEntity) {
                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.swing");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity55;
                if (entity instanceof Mob) {
                    Mob _mobEnt25 = (Mob)entity;
                    livingEntity55 = _mobEnt25.m_5448_();
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
                    Mob _mobEnt26 = (Mob)entity;
                    livingEntity59 = _mobEnt26.m_5448_();
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
                    Mob _mobEnt27 = (Mob)entity;
                    livingEntity57 = _mobEnt27.m_5448_();
                } else {
                    livingEntity57 = null;
                }
                double d18 = d17 + (double)livingEntity57.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt28 = (Mob)entity;
                    livingEntity56 = _mobEnt28.m_5448_();
                } else {
                    livingEntity56 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity56.m_20189_()));
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n42 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n42 = 0;
            }
            if (n42 == 25) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n43;
                    float f30;
                    int n44;
                    float f31;
                    int n45;
                    float f32;
                    int n46;
                    float f33;
                    int n47;
                    float f34;
                    LivingEntity _livEnt;
                    if (entityiterator instanceof SpidertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f34 = _livEnt.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f35 = f34 / 20.0f + 900.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n47 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n47 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f35 + (float)(n47 * 5));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f33 = _livEnt.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    float f36 = f33 / 20.0f + 900.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n46 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n46 = 0;
                    }
                    entityiterator.m_6469_(damageSource6, f36 + (float)(n46 * 5));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f32 = _livEnt.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    float f37 = f32 / 20.0f + 900.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n45 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n45 = 0;
                    }
                    entityiterator.m_6469_(damageSource7, f37 + (float)(n45 * 5));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f31 = _livEnt.m_21233_();
                    } else {
                        f31 = -1.0f;
                    }
                    float f38 = f31 / 5.0f + 9000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n44 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n44 = 0;
                    }
                    entityiterator.m_6469_(damageSource8, f38 + (float)(n44 * 50));
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f30 = _livEnt.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    float f39 = f30 / 5.0f + 9000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n43 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n43 = 0;
                    }
                    entityiterator.m_6469_(damageSource9, f39 + (float)(n43 * 50));
                }
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n41 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 >= 50) {
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SpidertitanEntity) {
            _datEntI3 = (SpidertitanEntity)entity;
            n5 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 3) {
            int n48;
            int n49;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SpidertitanEntity) {
                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.spraying poison");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity60;
                if (entity instanceof Mob) {
                    Mob _mobEnt29 = (Mob)entity;
                    livingEntity60 = _mobEnt29.m_5448_();
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
                    Mob _mobEnt30 = (Mob)entity;
                    livingEntity64 = _mobEnt30.m_5448_();
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
                    Mob _mobEnt31 = (Mob)entity;
                    livingEntity62 = _mobEnt31.m_5448_();
                } else {
                    livingEntity62 = null;
                }
                double d20 = d19 + (double)livingEntity62.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt32 = (Mob)entity;
                    livingEntity61 = _mobEnt32.m_5448_();
                } else {
                    livingEntity61 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity61.m_20189_()));
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n49 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n49 = 0;
            }
            if (n49 >= 65) {
                int n50;
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntI10 = (SpidertitanEntity)entity;
                    n50 = (Integer)_datEntI10.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
                } else {
                    n50 = 0;
                }
                if (n50 <= 105) {
                    float f40;
                    LivingEntity livingEntity65;
                    if (entity instanceof Mob) {
                        Mob _mobEnt33 = (Mob)entity;
                        livingEntity65 = _mobEnt33.m_5448_();
                    } else {
                        livingEntity65 = null;
                    }
                    if (livingEntity65 != null) {
                        LivingEntity livingEntity66;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity66 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity66 = null;
                        }
                        f40 = entity.m_20270_(livingEntity66);
                    } else {
                        f40 = -1.0f;
                    }
                    if (f40 > 1.0f) {
                        for (int index3 = 0; index3 < 12; ++index3) {
                            LivingEntity livingEntity67;
                            LivingEntity livingEntity68;
                            LivingEntity livingEntity69;
                            if (!(world instanceof ServerLevel)) continue;
                            projectileLevel = (ServerLevel)world;
                            Projectile _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    PosionEntity entityToSpawn = new PosionEntity((EntityType<? extends PosionEntity>)((EntityType)UltimateskeletonsModEntities.POSION.get()), level);
                                    entityToSpawn.m_5602_(shooter);
                                    entityToSpawn.m_36781_(damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    entityToSpawn.m_36762_(true);
                                    return entityToSpawn;
                                }
                            }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                            _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 8.0, y + 12.0, z + entity.m_20154_().f_82481_ * 8.0);
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity69 = _mobEnt.m_5448_();
                            } else {
                                livingEntity69 = null;
                            }
                            double d = livingEntity69.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity68 = _mobEnt.m_5448_();
                            } else {
                                livingEntity68 = null;
                            }
                            double d21 = livingEntity68.m_20186_() - 12.0 - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity67 = _mobEnt.m_5448_();
                            } else {
                                livingEntity67 = null;
                            }
                            _entityToSpawn.m_6686_(d, d21, livingEntity67.m_20189_() - entity.m_20189_(), 4.0f, 32.0f);
                            projectileLevel.m_7967_((Entity)_entityToSpawn);
                        }
                    } else {
                        for (int index4 = 0; index4 < 12; ++index4) {
                            if (!(world instanceof ServerLevel)) continue;
                            projectileLevel = (ServerLevel)world;
                            Projectile _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    PosionEntity entityToSpawn = new PosionEntity((EntityType<? extends PosionEntity>)((EntityType)UltimateskeletonsModEntities.POSION.get()), level);
                                    entityToSpawn.m_5602_(shooter);
                                    entityToSpawn.m_36781_(damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    entityToSpawn.m_36762_(true);
                                    return entityToSpawn;
                                }
                            }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                            _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 8.0, y + 12.0, z + entity.m_20154_().f_82481_ * 8.0);
                            _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 4.0f, 32.0f);
                            projectileLevel.m_7967_((Entity)_entityToSpawn);
                        }
                    }
                }
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n48 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 >= 130) {
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SpidertitanEntity) {
            _datEntI3 = (SpidertitanEntity)entity;
            n4 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 4) {
            int n51;
            int n52;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SpidertitanEntity) {
                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.press");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity70;
                if (entity instanceof Mob) {
                    Mob _mobEnt34 = (Mob)entity;
                    livingEntity70 = _mobEnt34.m_5448_();
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
                    Mob _mobEnt35 = (Mob)entity;
                    livingEntity74 = _mobEnt35.m_5448_();
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
                double d22 = livingEntity73.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt36 = (Mob)entity;
                    livingEntity72 = _mobEnt36.m_5448_();
                } else {
                    livingEntity72 = null;
                }
                double d23 = d22 + (double)livingEntity72.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt37 = (Mob)entity;
                    livingEntity71 = _mobEnt37.m_5448_();
                } else {
                    livingEntity71 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d23, livingEntity71.m_20189_()));
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n52 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n52 = 0;
            }
            if (n52 == 70) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 32.0, y, z + entity.m_20154_().f_82481_ * 32.0);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n53;
                    float f41;
                    int n54;
                    float f42;
                    int n55;
                    float f43;
                    int n56;
                    float f44;
                    int n57;
                    float f45;
                    LivingEntity _livEnt;
                    if (entityiterator instanceof SpidertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f45 = _livEnt.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    float f46 = f45 / 20.0f + 4500.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n57 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n57 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f46 + (float)(n57 * 5));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f44 = _livEnt.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    float f47 = f44 / 20.0f + 4500.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n56 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n56 = 0;
                    }
                    entityiterator.m_6469_(damageSource10, f47 + (float)(n56 * 5));
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f43 = _livEnt.m_21233_();
                    } else {
                        f43 = -1.0f;
                    }
                    float f48 = f43 / 20.0f + 4500.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n55 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n55 = 0;
                    }
                    entityiterator.m_6469_(damageSource11, f48 + (float)(n55 * 5));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f42 = _livEnt.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    float f49 = f42 / 5.0f + 45000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n54 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n54 = 0;
                    }
                    entityiterator.m_6469_(damageSource12, f49 + (float)(n54 * 50));
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f41 = _livEnt.m_21233_();
                    } else {
                        f41 = -1.0f;
                    }
                    float f50 = f41 / 5.0f + 45000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n53 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n53 = 0;
                    }
                    entityiterator.m_6469_(damageSource13, f50 + (float)(n53 * 50));
                }
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n51 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n51 = 0;
            }
            if (n51 >= 90) {
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SpidertitanEntity) {
            _datEntI3 = (SpidertitanEntity)entity;
            n3 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 5) {
            int n58;
            int n59;
            float f;
            LivingEntity livingEntity;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.attack1");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.attack2");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.attack3");
                }
            } else if (entity instanceof SpidertitanEntity) {
                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.attack4");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity75;
                if (entity instanceof Mob) {
                    Mob _mobEnt38 = (Mob)entity;
                    livingEntity75 = _mobEnt38.m_5448_();
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
                LivingEntity livingEntity78;
                LivingEntity livingEntity79;
                if (entity instanceof Mob) {
                    Mob _mobEnt39 = (Mob)entity;
                    livingEntity79 = _mobEnt39.m_5448_();
                } else {
                    livingEntity79 = null;
                }
                double d = livingEntity79.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity78 = _mobEnt3.m_5448_();
                } else {
                    livingEntity78 = null;
                }
                double d24 = livingEntity78.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt40 = (Mob)entity;
                    livingEntity77 = _mobEnt40.m_5448_();
                } else {
                    livingEntity77 = null;
                }
                double d25 = d24 + (double)livingEntity77.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt41 = (Mob)entity;
                    livingEntity76 = _mobEnt41.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d25, livingEntity76.m_20189_()));
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n59 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n59 = 0;
            }
            if (n59 == 16) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 28.0, y, z + entity.m_20154_().f_82479_ * 28.0);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n60;
                    float f51;
                    int n61;
                    float f52;
                    int n62;
                    float f53;
                    int n63;
                    float f54;
                    int n64;
                    float f55;
                    LivingEntity _livEnt;
                    if (entityiterator instanceof SpidertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f55 = _livEnt.m_21233_();
                    } else {
                        f55 = -1.0f;
                    }
                    float f56 = f55 / 20.0f + 3600.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n64 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n64 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f56 + (float)(n64 * 5));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f54 = _livEnt.m_21233_();
                    } else {
                        f54 = -1.0f;
                    }
                    float f57 = f54 / 20.0f + 3600.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n63 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n63 = 0;
                    }
                    entityiterator.m_6469_(damageSource14, f57 + (float)(n63 * 5));
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f53 = _livEnt.m_21233_();
                    } else {
                        f53 = -1.0f;
                    }
                    float f58 = f53 / 20.0f + 3600.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n62 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n62 = 0;
                    }
                    entityiterator.m_6469_(damageSource15, f58 + (float)(n62 * 5));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f52 = _livEnt.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    float f59 = f52 / 5.0f + 36000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n61 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n61 = 0;
                    }
                    entityiterator.m_6469_(damageSource16, f59 + (float)(n61 * 50));
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f51 = _livEnt.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    float f60 = f51 / 5.0f + 36000.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n60 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n60 = 0;
                    }
                    entityiterator.m_6469_(damageSource17, f60 + (float)(n60 * 50));
                }
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n58 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n58 = 0;
            }
            if (n58 >= 30) {
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SpidertitanEntity) {
            _datEntI3 = (SpidertitanEntity)entity;
            n2 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 6) {
            int n65;
            int n66;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SpidertitanEntity) {
                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.lightningthunder");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity80;
                if (entity instanceof Mob) {
                    Mob _mobEnt42 = (Mob)entity;
                    livingEntity80 = _mobEnt42.m_5448_();
                } else {
                    livingEntity80 = null;
                }
                f = entity.m_20270_(livingEntity80);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity81;
                LivingEntity livingEntity82;
                LivingEntity livingEntity83;
                LivingEntity livingEntity84;
                if (entity instanceof Mob) {
                    Mob _mobEnt43 = (Mob)entity;
                    livingEntity84 = _mobEnt43.m_5448_();
                } else {
                    livingEntity84 = null;
                }
                double d = livingEntity84.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity83 = _mobEnt3.m_5448_();
                } else {
                    livingEntity83 = null;
                }
                double d26 = livingEntity83.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt44 = (Mob)entity;
                    livingEntity82 = _mobEnt44.m_5448_();
                } else {
                    livingEntity82 = null;
                }
                double d27 = d26 + (double)livingEntity82.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt45 = (Mob)entity;
                    livingEntity81 = _mobEnt45.m_5448_();
                } else {
                    livingEntity81 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d27, livingEntity81.m_20189_()));
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n66 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n66 = 0;
            }
            if (n66 == 45) {
                float f61;
                LivingEntity livingEntity85;
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                for (int index5 = 0; index5 < 16; ++index5) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt46 = (Mob)entity;
                    livingEntity85 = _mobEnt46.m_5448_();
                } else {
                    livingEntity85 = null;
                }
                if (livingEntity85 != null) {
                    LivingEntity livingEntity86;
                    if (entity instanceof Mob) {
                        Mob _mobEnt47 = (Mob)entity;
                        livingEntity86 = _mobEnt47.m_5448_();
                    } else {
                        livingEntity86 = null;
                    }
                    f61 = entity.m_20270_(livingEntity86);
                } else {
                    f61 = -1.0f;
                }
                if (f61 > 1.0f && world instanceof ServerLevel) {
                    LivingEntity livingEntity87;
                    LivingEntity livingEntity88;
                    LivingEntity livingEntity89;
                    ServerLevel _level = (ServerLevel)world;
                    EntityType entityType = (EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity89 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity89 = null;
                    }
                    double d = livingEntity89.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity88 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity88 = null;
                    }
                    double d28 = livingEntity88.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity87 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity87 = null;
                    }
                    Entity entityToSpawn = entityType.m_262496_(_level, BlockPos.m_274561_((double)d, (double)d28, (double)livingEntity87.m_20189_()), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n67;
                    float f62;
                    int n68;
                    float f63;
                    int n69;
                    float f64;
                    int n70;
                    float f65;
                    int n71;
                    float f66;
                    LivingEntity _livEnt;
                    if (entityiterator instanceof SpidertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f66 = _livEnt.m_21233_();
                    } else {
                        f66 = -1.0f;
                    }
                    float f67 = f66 / 20.0f + 490.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n71 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n71 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f67 + (float)(n71 * 5));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f65 = _livEnt.m_21233_();
                    } else {
                        f65 = -1.0f;
                    }
                    float f68 = f65 / 20.0f + 490.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n70 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n70 = 0;
                    }
                    entityiterator.m_6469_(damageSource18, f68 + (float)(n70 * 5));
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f64 = _livEnt.m_21233_();
                    } else {
                        f64 = -1.0f;
                    }
                    float f69 = f64 / 20.0f + 490.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n69 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n69 = 0;
                    }
                    entityiterator.m_6469_(damageSource19, f69 + (float)(n69 * 5));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f63 = _livEnt.m_21233_();
                    } else {
                        f63 = -1.0f;
                    }
                    float f70 = f63 / 5.0f + 4900.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n68 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n68 = 0;
                    }
                    entityiterator.m_6469_(damageSource20, f70 + (float)(n68 * 50));
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f62 = _livEnt.m_21233_();
                    } else {
                        f62 = -1.0f;
                    }
                    float f71 = f62 / 5.0f + 4900.0f;
                    if (entity instanceof SpidertitanEntity) {
                        _datEntI = (SpidertitanEntity)entity;
                        n67 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n67 = 0;
                    }
                    entityiterator.m_6469_(damageSource21, f71 + (float)(n67 * 50));
                }
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n65 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n65 = 0;
            }
            if (n65 >= 80) {
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SpidertitanEntity) {
            _datEntI3 = (SpidertitanEntity)entity;
            n = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 7) {
            int n72;
            int n73;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SpidertitanEntity) {
                ((SpidertitanEntity)entity).setAnimation("animation.spider.titan.spider web");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity90;
                if (entity instanceof Mob) {
                    Mob _mobEnt48 = (Mob)entity;
                    livingEntity90 = _mobEnt48.m_5448_();
                } else {
                    livingEntity90 = null;
                }
                f = entity.m_20270_(livingEntity90);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity91;
                LivingEntity livingEntity92;
                LivingEntity livingEntity93;
                LivingEntity livingEntity94;
                if (entity instanceof Mob) {
                    Mob _mobEnt49 = (Mob)entity;
                    livingEntity94 = _mobEnt49.m_5448_();
                } else {
                    livingEntity94 = null;
                }
                double d = livingEntity94.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity93 = _mobEnt3.m_5448_();
                } else {
                    livingEntity93 = null;
                }
                double d29 = livingEntity93.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt50 = (Mob)entity;
                    livingEntity92 = _mobEnt50.m_5448_();
                } else {
                    livingEntity92 = null;
                }
                double d30 = d29 + (double)livingEntity92.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt51 = (Mob)entity;
                    livingEntity91 = _mobEnt51.m_5448_();
                } else {
                    livingEntity91 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d30, livingEntity91.m_20189_()));
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n73 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n73 = 0;
            }
            if (n73 >= 45) {
                int n74;
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntI11 = (SpidertitanEntity)entity;
                    n74 = (Integer)_datEntI11.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
                } else {
                    n74 = 0;
                }
                if (n74 <= 185) {
                    int n75;
                    int n76;
                    if (entity instanceof SpidertitanEntity) {
                        int n77;
                        SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (entity instanceof SpidertitanEntity) {
                            _datEntI2 = (SpidertitanEntity)entity;
                            n77 = (Integer)_datEntI2.m_20088_().m_135370_(SpidertitanEntity.DATA_webTick);
                        } else {
                            n77 = 0;
                        }
                        synchedEntityData.m_135381_(SpidertitanEntity.DATA_webTick, (Object)(n77 + 1));
                    }
                    if (entity instanceof SpidertitanEntity) {
                        SpidertitanEntity _datEntI12 = (SpidertitanEntity)entity;
                        n76 = (Integer)_datEntI12.m_20088_().m_135370_(SpidertitanEntity.DATA_webTick);
                    } else {
                        n76 = 0;
                    }
                    if (n76 == 5 && world instanceof ServerLevel) {
                        ServerLevel projectileLevel = (ServerLevel)world;
                        Projectile _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                GiantwebEntity entityToSpawn = new GiantwebEntity((EntityType<? extends GiantwebEntity>)((EntityType)UltimateskeletonsModEntities.GIANTWEB.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                        _entityToSpawn.m_6034_(x, y + 6.0, z);
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 4.0f, 4.0f);
                        projectileLevel.m_7967_((Entity)_entityToSpawn);
                    }
                    if (entity instanceof SpidertitanEntity) {
                        SpidertitanEntity _datEntI13 = (SpidertitanEntity)entity;
                        n75 = (Integer)_datEntI13.m_20088_().m_135370_(SpidertitanEntity.DATA_webTick);
                    } else {
                        n75 = 0;
                    }
                    if (n75 >= 10 && entity instanceof SpidertitanEntity) {
                        SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_webTick, (Object)0);
                    }
                }
            }
            if (entity instanceof SpidertitanEntity) {
                _datEntI4 = (SpidertitanEntity)entity;
                n72 = (Integer)_datEntI4.m_20088_().m_135370_(SpidertitanEntity.DATA_animationTick);
            } else {
                n72 = 0;
            }
            if (n72 >= 215) {
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    SpidertitanEntity _datEntSetI = (SpidertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SpidertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SpidertitanEntity) {
                    ((SpidertitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

