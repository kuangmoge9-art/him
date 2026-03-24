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
import net.mcreator.ultimateskeletons.entity.OmegafishEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class OmegafishATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        OmegafishEntity _datEntSetL;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        LivingEntity _livEnt;
        int n8;
        Object _mobEnt;
        Mob _mobEnt2;
        OmegafishEntity _datEntI;
        OmegafishEntity _datEntI2;
        block782: {
            LivingEntity livingEntity;
            block783: {
                block784: {
                    LivingEntity livingEntity2;
                    float f;
                    LivingEntity livingEntity3;
                    LivingEntity livingEntity4;
                    int n9;
                    int n10;
                    int n11;
                    float f2;
                    block781: {
                        int n12;
                        Level _level;
                        block780: {
                            int n13;
                            int n14;
                            int n15;
                            int n16;
                            Mob _entity;
                            float f3;
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
                            if (entity instanceof OmegafishEntity) {
                                int n17;
                                OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                if (entity instanceof OmegafishEntity) {
                                    OmegafishEntity _datEntI22 = (OmegafishEntity)entity;
                                    n17 = (Integer)_datEntI22.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                                } else {
                                    n17 = 0;
                                }
                                synchedEntityData.m_135381_(OmegafishEntity.DATA_spawnTick, (Object)(n17 + 1));
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt2 = (LivingEntity)entity;
                                f3 = _livEnt2.m_21223_();
                            } else {
                                f3 = -1.0f;
                            }
                            if (f3 <= 0.0f) {
                                int n18;
                                if (entity instanceof Mob) {
                                    _entity = (Mob)entity;
                                    _entity.m_6710_(null);
                                }
                                if (entity instanceof OmegafishEntity) {
                                    _datEntI2 = (OmegafishEntity)entity;
                                    n18 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
                                } else {
                                    n18 = 0;
                                }
                                if (n18 == 0) {
                                    int n19;
                                    int n20;
                                    int n21;
                                    int n22;
                                    OmegafishEntity _datEntI3;
                                    int n23;
                                    if (entity instanceof OmegafishEntity) {
                                        int n24;
                                        OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                        if (entity instanceof OmegafishEntity) {
                                            OmegafishEntity _datEntI4 = (OmegafishEntity)entity;
                                            n24 = (Integer)_datEntI4.m_20088_().m_135370_(OmegafishEntity.DATA_deathTick);
                                        } else {
                                            n24 = 0;
                                        }
                                        synchedEntityData.m_135381_(OmegafishEntity.DATA_deathTick, (Object)(n24 + 1));
                                    }
                                    if (entity instanceof OmegafishEntity) {
                                        OmegafishEntity _datEntI32 = (OmegafishEntity)entity;
                                        n23 = (Integer)_datEntI32.m_20088_().m_135370_(OmegafishEntity.DATA_deathTick);
                                    } else {
                                        n23 = 0;
                                    }
                                    if (n23 == 1 && world instanceof Level) {
                                        Level _level2 = (Level)world;
                                        if (!_level2.m_5776_()) {
                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:omegafishdeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                        } else {
                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:omegafishdeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                        }
                                    }
                                    if (entity instanceof OmegafishEntity) {
                                        _datEntI3 = (OmegafishEntity)entity;
                                        n22 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_deathTick);
                                    } else {
                                        n22 = 0;
                                    }
                                    if (n22 < 3) {
                                        for (int index0 = 0; index0 < 12; ++index0) {
                                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                        }
                                    }
                                    if (entity instanceof OmegafishEntity) {
                                        _datEntI3 = (OmegafishEntity)entity;
                                        n21 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_deathTick);
                                    } else {
                                        n21 = 0;
                                    }
                                    if (n21 < 10 && entity instanceof OmegafishEntity) {
                                        ((OmegafishEntity)entity).setAnimation("death");
                                    }
                                    if (entity instanceof OmegafishEntity) {
                                        _datEntI3 = (OmegafishEntity)entity;
                                        n20 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_deathTick);
                                    } else {
                                        n20 = 0;
                                    }
                                    if (n20 == 660) {
                                        if (world instanceof ServerLevel) {
                                            ServerLevel _level3 = (ServerLevel)world;
                                            _level3.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level3, 4, "", (Component)Component.m_237113_((String)""), _level3.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"omegafish\"'}");
                                        }
                                        for (int index1 = 0; index1 < 320; ++index1) {
                                            world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                        }
                                    }
                                    if (entity instanceof OmegafishEntity) {
                                        _datEntI3 = (OmegafishEntity)entity;
                                        n19 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_deathTick);
                                    } else {
                                        n19 = 0;
                                    }
                                    if (n19 >= 660 && !entity.m_9236_().m_5776_()) {
                                        entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                    }
                                }
                            }
                            if (!entity.m_5446_().getString().equals("growing")) break block780;
                            if (entity instanceof OmegafishEntity) {
                                _datEntI = (OmegafishEntity)entity;
                                n16 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n16 = 0;
                            }
                            if (n16 >= 720) break block781;
                            entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                            entity.f_19802_ = 20;
                            ((OmegafishEntity)entity).setHEALTS(8000.0);
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity)entity).f_20919_ = 0;
                            }
                            if (entity instanceof Mob) {
                                _entity = (Mob)entity;
                                _entity.m_6710_(null);
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntI2 = (OmegafishEntity)entity;
                                n15 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n15 = 0;
                            }
                            if (n15 == 450 && world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                if (entityToSpawn != null) {
                                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                }
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntI2 = (OmegafishEntity)entity;
                                n14 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n14 = 0;
                            }
                            if (n14 <= 10 && entity instanceof OmegafishEntity) {
                                ((OmegafishEntity)entity).setAnimation("spawn2");
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntI2 = (OmegafishEntity)entity;
                                n13 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n13 = 0;
                            }
                            if (n13 == 719) {
                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.m_5776_()) {
                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                    } else {
                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                    }
                                }
                                if (!world.m_5776_() && world.m_7654_() != null) {
                                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Omegafish has been created!!!"), false);
                                }
                            }
                            if (entity.m_20096_()) break block781;
                            if (entity.m_20186_() < -63.0) {
                                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                            } else {
                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                            }
                            break block781;
                        }
                        if (entity instanceof OmegafishEntity) {
                            _datEntI = (OmegafishEntity)entity;
                            n12 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                        } else {
                            n12 = 0;
                        }
                        if (n12 < 190) {
                            int n25;
                            int n26;
                            int n27;
                            int n28;
                            entity.m_6593_((Component)Component.m_237113_((String)"Omegafish"));
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity)entity).f_20919_ = 0;
                            }
                            entity.f_19802_ = 20;
                            if (!entity.m_20096_()) {
                                if (entity.m_20186_() > -63.0) {
                                    entity.m_20256_(new Vec3(0.0, -2.0, 0.0));
                                } else {
                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                }
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntI2 = (OmegafishEntity)entity;
                                n28 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n28 = 0;
                            }
                            if (n28 == 1) {
                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.m_5776_()) {
                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:omegafishidle")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                    } else {
                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:omegafishidle")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                    }
                                }
                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel)world;
                                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                    if (entityToSpawn != null) {
                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                    }
                                }
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntI2 = (OmegafishEntity)entity;
                                n27 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n27 = 0;
                            }
                            if (n27 <= 10 && entity instanceof OmegafishEntity) {
                                ((OmegafishEntity)entity).setAnimation("spawn");
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntI2 = (OmegafishEntity)entity;
                                n26 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n26 = 0;
                            }
                            if (n26 == 189 && !world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Omegafish awake!!!"), false);
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntI2 = (OmegafishEntity)entity;
                                n25 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                            } else {
                                n25 = 0;
                            }
                            if (n25 == 150) {
                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.m_5776_()) {
                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                    } else {
                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                    }
                                }
                                Vec3 _center = new Vec3(x, y, z);
                                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                for (Entity entity2 : _entfound) {
                                    if (entity2 instanceof OmegafishEntity) continue;
                                    entity2.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                                    double _setval = 5.0;
                                    entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                        capability.camerashake = _setval;
                                        capability.syncPlayerVariables(entity2);
                                    });
                                }
                            }
                        }
                    }
                    if (!world.m_5776_()) {
                        int n29;
                        if (entity instanceof OmegafishEntity) {
                            _datEntI = (OmegafishEntity)entity;
                            n29 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
                        } else {
                            n29 = 0;
                        }
                        if (n29 != 0) {
                            float f4;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt3 = (LivingEntity)entity;
                                f4 = _livEnt3.m_21223_();
                            } else {
                                f4 = -1.0f;
                            }
                            if (f4 <= 0.0f) {
                                for (int index2 = 0; index2 < 16; ++index2) {
                                    if (!(entity instanceof OmegafishEntity)) continue;
                                    ((OmegafishEntity)entity).setAnimation("empty");
                                }
                            }
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt2 = (LivingEntity)entity;
                        f2 = _livEnt2.m_21223_();
                    } else {
                        f2 = -1.0f;
                    }
                    if (f2 > 0.0f && entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_deathTick, (Object)0);
                    }
                    if (entity instanceof OmegafishEntity) {
                        _datEntI = (OmegafishEntity)entity;
                        n11 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_spawnTick);
                    } else {
                        n11 = 0;
                    }
                    if (n11 < 190) break block782;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI2 = (OmegafishEntity)entity;
                        n10 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 0) {
                        OmegafishEntity _datEntL74;
                        if (!(entity instanceof OmegafishEntity && (Boolean)(_datEntL74 = (OmegafishEntity)entity).m_20088_().m_135370_(OmegafishEntity.DATA_under) != false)) {
                            int n30;
                            if (entity instanceof OmegafishEntity) {
                                OmegafishEntity _datEntI5 = (OmegafishEntity)entity;
                                n30 = (Integer)_datEntI5.m_20088_().m_135370_(OmegafishEntity.DATA_flyID);
                            } else {
                                n30 = 0;
                            }
                            if (n30 != 0) {
                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 1.0, z, 0.0, 0.0, 0.0);
                            }
                        } else {
                            Vec3 _center = new Vec3(x, y, z);
                            List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(20.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entityiterator3 : _entfound) {
                                int n31;
                                float f5;
                                int n32;
                                float f6;
                                int n33;
                                float f7;
                                int n34;
                                OmegafishEntity _datEntI4;
                                float f8;
                                LivingEntity _livEnt3;
                                int n35;
                                float f9;
                                if (entityiterator3 instanceof OmegafishEntity || !(entityiterator3 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator3 instanceof LivingEntity) {
                                    LivingEntity _livEnt4 = (LivingEntity)entityiterator3;
                                    f9 = _livEnt4.m_21233_();
                                } else {
                                    f9 = -1.0f;
                                }
                                float f10 = f9 / 20.0f + 500.0f;
                                if (entity instanceof OmegafishEntity) {
                                    OmegafishEntity _datEntI6 = (OmegafishEntity)entity;
                                    n35 = (Integer)_datEntI6.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                                } else {
                                    n35 = 0;
                                }
                                entityiterator3.m_6469_(damageSource, f10 + (float)(n35 * 5));
                                if (entityiterator3 instanceof Titangodentity) continue;
                                if (!(entityiterator3 instanceof Player)) {
                                    entityiterator3.f_19802_ = 0;
                                }
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator3 instanceof Player)) {
                                    entityiterator3.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator3);
                                }
                                DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entityiterator3 instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator3;
                                    f8 = _livEnt3.m_21233_();
                                } else {
                                    f8 = -1.0f;
                                }
                                float f11 = f8 / 20.0f + 500.0f;
                                if (entity instanceof OmegafishEntity) {
                                    _datEntI4 = (OmegafishEntity)entity;
                                    n34 = (Integer)_datEntI4.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                                } else {
                                    n34 = 0;
                                }
                                entityiterator3.m_6469_(damageSource2, f11 + (float)(n34 * 5));
                                DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entityiterator3 instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator3;
                                    f7 = _livEnt3.m_21233_();
                                } else {
                                    f7 = -1.0f;
                                }
                                float f12 = f7 / 20.0f + 500.0f;
                                if (entity instanceof OmegafishEntity) {
                                    _datEntI4 = (OmegafishEntity)entity;
                                    n33 = (Integer)_datEntI4.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                                } else {
                                    n33 = 0;
                                }
                                entityiterator3.m_6469_(damageSource3, f12 + (float)(n33 * 5));
                                entityiterator3.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entityiterator3.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator3 instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator3;
                                    f6 = _livEnt3.m_21233_();
                                } else {
                                    f6 = -1.0f;
                                }
                                float f13 = f6 / 5.0f + 5000.0f;
                                if (entity instanceof OmegafishEntity) {
                                    _datEntI4 = (OmegafishEntity)entity;
                                    n32 = (Integer)_datEntI4.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                                } else {
                                    n32 = 0;
                                }
                                entityiterator3.m_6469_(damageSource4, f13 + (float)(n32 * 50));
                                DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entityiterator3 instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator3;
                                    f5 = _livEnt3.m_21233_();
                                } else {
                                    f5 = -1.0f;
                                }
                                float f14 = f5 / 5.0f + 5000.0f;
                                if (entity instanceof OmegafishEntity) {
                                    _datEntI4 = (OmegafishEntity)entity;
                                    n31 = (Integer)_datEntI4.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                                } else {
                                    n31 = 0;
                                }
                                entityiterator3.m_6469_(damageSource5, f14 + (float)(n31 * 50));
                            }
                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                        }
                    }
                    if (world.m_5776_()) break block782;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI2 = (OmegafishEntity)entity;
                        n9 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
                    } else {
                        n9 = 0;
                    }
                    if (n9 != 0 && entity instanceof OmegafishEntity) {
                        int n36;
                        OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (entity instanceof OmegafishEntity) {
                            OmegafishEntity _datEntI7 = (OmegafishEntity)entity;
                            n36 = (Integer)_datEntI7.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
                        } else {
                            n36 = 0;
                        }
                        synchedEntityData.m_135381_(OmegafishEntity.DATA_animationTick, (Object)(n36 + 1));
                    }
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity4 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity4 = null;
                    }
                    if (livingEntity4 == null) break block783;
                    if (entity instanceof Mob) {
                        Mob _mobEnt3 = (Mob)entity;
                        v50 = _mobEnt3.m_5448_();
                    } else {
                        v50 = livingEntity3 = null;
                    }
                    if (livingEntity3 instanceof LivingEntity) {
                        LivingEntity _livEnt5 = livingEntity3;
                        f = _livEnt5.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= 0.0f) break block784;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity2 = _mobEnt.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (livingEntity2.m_6084_()) break block783;
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity omegafishEntity = (OmegafishEntity)entity;
                    omegafishEntity.m_20088_().m_135381_(OmegafishEntity.DATA_flyID, (Object)0);
                }
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
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
                    Mob _mobEnt4 = (Mob)entity;
                    livingEntity8 = _mobEnt4.m_5448_();
                } else {
                    livingEntity8 = null;
                }
                double d = livingEntity8.m_20185_();
                if (entity instanceof Mob) {
                    Mob _mobEnt5 = (Mob)entity;
                    livingEntity7 = _mobEnt5.m_5448_();
                } else {
                    livingEntity7 = null;
                }
                double d2 = livingEntity7.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt6 = (Mob)entity;
                    livingEntity6 = _mobEnt6.m_5448_();
                } else {
                    livingEntity6 = null;
                }
                double d3 = d2 + (double)livingEntity6.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt7 = (Mob)entity;
                    livingEntity5 = _mobEnt7.m_5448_();
                } else {
                    livingEntity5 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity5.m_20189_()));
                if (entity instanceof Mob) {
                    Mob _mobEnt8 = (Mob)entity;
                    v61 = _mobEnt8.m_5448_();
                } else {
                    v61 = _mobEnt = null;
                }
                if (_mobEnt instanceof LivingEntity) {
                    LivingEntity _livEnt6 = (LivingEntity)_mobEnt;
                    f = _livEnt6.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    int n37;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI8 = (OmegafishEntity)entity;
                        n37 = (Integer)_datEntI8.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
                    } else {
                        n37 = 0;
                    }
                    if (n37 == 0) {
                        float f15;
                        LivingEntity livingEntity9;
                        Mob _mobEnt3;
                        Mob _mobEnt4;
                        Mob _mobEnt5;
                        Mob _mobEnt6;
                        Mob _mobEnt7;
                        float f16;
                        LivingEntity livingEntity10;
                        float f17;
                        LivingEntity livingEntity11;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity11 = mob.m_5448_();
                        } else {
                            livingEntity11 = null;
                        }
                        if (livingEntity11 != null) {
                            LivingEntity livingEntity12;
                            if (entity instanceof Mob) {
                                Mob _mobEnt15 = (Mob)entity;
                                livingEntity12 = _mobEnt15.m_5448_();
                            } else {
                                livingEntity12 = null;
                            }
                            f17 = entity.m_20270_(livingEntity12);
                        } else {
                            f17 = -1.0f;
                        }
                        if (f17 >= 160.0f) {
                            entity.m_6858_(true);
                        } else {
                            entity.m_6858_(false);
                        }
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity10 = mob.m_5448_();
                        } else {
                            livingEntity10 = null;
                        }
                        if (livingEntity10 != null) {
                            LivingEntity livingEntity13;
                            if (entity instanceof Mob) {
                                Mob _mobEnt16 = (Mob)entity;
                                livingEntity13 = _mobEnt16.m_5448_();
                            } else {
                                livingEntity13 = null;
                            }
                            f16 = entity.m_20270_(livingEntity13);
                        } else {
                            f16 = -1.0f;
                        }
                        if (f16 > 60.0f) {
                            float f18;
                            LivingEntity livingEntity14;
                            LivingEntity livingEntity15;
                            float f19;
                            LivingEntity livingEntity16;
                            LivingEntity livingEntity17;
                            float f20;
                            LivingEntity livingEntity18;
                            LivingEntity livingEntity19;
                            if (entity instanceof Mob) {
                                Mob _mobEnt13 = (Mob)entity;
                                livingEntity19 = _mobEnt13.m_5448_();
                            } else {
                                livingEntity19 = null;
                            }
                            double d4 = livingEntity19.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity18 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity18 = null;
                            }
                            if (livingEntity18 != null) {
                                LivingEntity livingEntity20;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity20 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity20 = null;
                                }
                                f20 = entity.m_20270_(livingEntity20);
                            } else {
                                f20 = -1.0f;
                            }
                            double d5 = d4 / (double)f20 * 2.0;
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity17 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity17 = null;
                            }
                            double d6 = livingEntity17.m_20186_() - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity16 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity16 = null;
                            }
                            if (livingEntity16 != null) {
                                LivingEntity livingEntity21;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity21 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity21 = null;
                                }
                                f19 = entity.m_20270_(livingEntity21);
                            } else {
                                f19 = -1.0f;
                            }
                            double d7 = d6 / (double)f19 * 2.0;
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity15 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity15 = null;
                            }
                            double d8 = livingEntity15.m_20189_() - entity.m_20189_();
                            if (entity instanceof Mob) {
                                _mobEnt7 = (Mob)entity;
                                livingEntity14 = _mobEnt7.m_5448_();
                            } else {
                                livingEntity14 = null;
                            }
                            if (livingEntity14 != null) {
                                LivingEntity livingEntity22;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity22 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity22 = null;
                                }
                                f18 = entity.m_20270_(livingEntity22);
                            } else {
                                f18 = -1.0f;
                            }
                            entity.m_20256_(new Vec3(d5, d7, d8 / (double)f18 * 2.0));
                            if (entity instanceof OmegafishEntity) {
                                _datEntSetI = (OmegafishEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_flyID, (Object)1);
                            }
                        } else {
                            LivingEntity livingEntity23;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity23 = _mobEnt.m_5448_();
                            } else {
                                livingEntity23 = null;
                            }
                            if (livingEntity23.m_20206_() > 8.0f) {
                                float f21;
                                LivingEntity livingEntity24;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt12 = (Mob)entity;
                                    livingEntity24 = _mobEnt12.m_5448_();
                                } else {
                                    livingEntity24 = null;
                                }
                                if (livingEntity24 != null) {
                                    LivingEntity livingEntity25;
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity25 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity25 = null;
                                    }
                                    f21 = entity.m_20270_(livingEntity25);
                                } else {
                                    f21 = -1.0f;
                                }
                                if (f21 > 20.0f) {
                                    float f22;
                                    LivingEntity livingEntity26;
                                    LivingEntity livingEntity27;
                                    float f23;
                                    LivingEntity livingEntity28;
                                    LivingEntity livingEntity29;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt11 = (Mob)entity;
                                        livingEntity29 = _mobEnt11.m_5448_();
                                    } else {
                                        livingEntity29 = null;
                                    }
                                    double d9 = livingEntity29.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt10 = (Mob)entity;
                                        livingEntity28 = _mobEnt10.m_5448_();
                                    } else {
                                        livingEntity28 = null;
                                    }
                                    if (livingEntity28 != null) {
                                        LivingEntity livingEntity30;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt9 = (Mob)entity;
                                            livingEntity30 = _mobEnt9.m_5448_();
                                        } else {
                                            livingEntity30 = null;
                                        }
                                        f23 = entity.m_20270_(livingEntity30);
                                    } else {
                                        f23 = -1.0f;
                                    }
                                    double d10 = d9 / (double)f23;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity27 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity27 = null;
                                    }
                                    double d11 = livingEntity27.m_20189_() - entity.m_20189_();
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity26 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity26 = null;
                                    }
                                    if (livingEntity26 != null) {
                                        LivingEntity livingEntity31;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity31 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity31 = null;
                                        }
                                        f22 = entity.m_20270_(livingEntity31);
                                    } else {
                                        f22 = -1.0f;
                                    }
                                    entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f22));
                                }
                            } else {
                                float f24;
                                LivingEntity livingEntity32;
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity32 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity32 = null;
                                }
                                if (livingEntity32 != null) {
                                    LivingEntity livingEntity33;
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity33 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity33 = null;
                                    }
                                    f24 = entity.m_20270_(livingEntity33);
                                } else {
                                    f24 = -1.0f;
                                }
                                if (f24 > 6.0f) {
                                    float f25;
                                    LivingEntity livingEntity34;
                                    LivingEntity livingEntity35;
                                    float f26;
                                    LivingEntity livingEntity36;
                                    LivingEntity livingEntity37;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity37 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity37 = null;
                                    }
                                    double d12 = livingEntity37.m_20185_() - entity.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity36 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity36 = null;
                                    }
                                    if (livingEntity36 != null) {
                                        LivingEntity livingEntity38;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity38 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity38 = null;
                                        }
                                        f26 = entity.m_20270_(livingEntity38);
                                    } else {
                                        f26 = -1.0f;
                                    }
                                    double d13 = d12 / (double)f26;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity35 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity35 = null;
                                    }
                                    double d14 = livingEntity35.m_20189_() - entity.m_20189_();
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity34 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity34 = null;
                                    }
                                    if (livingEntity34 != null) {
                                        LivingEntity livingEntity39;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity39 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity39 = null;
                                        }
                                        f25 = entity.m_20270_(livingEntity39);
                                    } else {
                                        f25 = -1.0f;
                                    }
                                    entity.m_20256_(new Vec3(d13, 0.0, d14 / (double)f25));
                                }
                            }
                            if (entity instanceof OmegafishEntity) {
                                _datEntSetI = (OmegafishEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_flyID, (Object)0);
                            }
                        }
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity9 = mob.m_5448_();
                        } else {
                            livingEntity9 = null;
                        }
                        if (livingEntity9 != null) {
                            LivingEntity livingEntity40;
                            if (entity instanceof Mob) {
                                Mob _mobEnt17 = (Mob)entity;
                                livingEntity40 = _mobEnt17.m_5448_();
                            } else {
                                livingEntity40 = null;
                            }
                            f15 = entity.m_20270_(livingEntity40);
                        } else {
                            f15 = -1.0f;
                        }
                        if (f15 < 512.0f) {
                            OmegafishEntity _datEntL192;
                            if (entity instanceof OmegafishEntity && (Boolean)(_datEntL192 = (OmegafishEntity)entity).m_20088_().m_135370_(OmegafishEntity.DATA_under) != false) {
                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) == 10) {
                                    if (entity instanceof OmegafishEntity) {
                                        _datEntSetI = (OmegafishEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)8);
                                    }
                                } else if (entity instanceof OmegafishEntity) {
                                    _datEntSetI = (OmegafishEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                                }
                            } else {
                                OmegafishEntity _datEntSetI;
                                float f27;
                                LivingEntity livingEntity41;
                                if (entity instanceof Mob) {
                                    _mobEnt7 = (Mob)entity;
                                    livingEntity41 = _mobEnt7.m_5448_();
                                } else {
                                    livingEntity41 = null;
                                }
                                if (livingEntity41 != null) {
                                    LivingEntity livingEntity42;
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity42 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity42 = null;
                                    }
                                    f27 = entity.m_20270_(livingEntity42);
                                } else {
                                    f27 = -1.0f;
                                }
                                if (f27 <= 24.0f) {
                                    LivingEntity livingEntity43;
                                    if (entity instanceof Mob) {
                                        _mobEnt3 = (Mob)entity;
                                        livingEntity43 = _mobEnt3.m_5448_();
                                    } else {
                                        livingEntity43 = null;
                                    }
                                    if (livingEntity43.m_20206_() > 6.0f) {
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)8) == 8) {
                                            if (entity instanceof OmegafishEntity) {
                                                _datEntSetI = (OmegafishEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                            }
                                        } else if (entity instanceof OmegafishEntity) {
                                            _datEntSetI = (OmegafishEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)5);
                                        }
                                    } else if (entity instanceof OmegafishEntity) {
                                        _datEntSetI = (OmegafishEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                    }
                                }
                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                    int n38;
                                    if (entity instanceof OmegafishEntity) {
                                        OmegafishEntity _datEntI9 = (OmegafishEntity)entity;
                                        n38 = (Integer)_datEntI9.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
                                    } else {
                                        n38 = 0;
                                    }
                                    if (n38 == 0) {
                                        float f28;
                                        LivingEntity livingEntity44;
                                        if (entity instanceof Mob) {
                                            _mobEnt6 = (Mob)entity;
                                            livingEntity44 = _mobEnt6.m_5448_();
                                        } else {
                                            livingEntity44 = null;
                                        }
                                        if (livingEntity44 != null) {
                                            LivingEntity livingEntity45;
                                            if (entity instanceof Mob) {
                                                _mobEnt3 = (Mob)entity;
                                                livingEntity45 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity45 = null;
                                            }
                                            f28 = entity.m_20270_(livingEntity45);
                                        } else {
                                            f28 = -1.0f;
                                        }
                                        if (f28 > 48.0f) {
                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                                    if (entity instanceof OmegafishEntity) {
                                                        _datEntSetI = (OmegafishEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)7);
                                                    }
                                                } else if (entity instanceof OmegafishEntity) {
                                                    _datEntSetI = (OmegafishEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)6);
                                                }
                                            }
                                        } else {
                                            float f29;
                                            LivingEntity livingEntity46;
                                            if (entity instanceof Mob) {
                                                _mobEnt4 = (Mob)entity;
                                                livingEntity46 = _mobEnt4.m_5448_();
                                            } else {
                                                livingEntity46 = null;
                                            }
                                            if (livingEntity46 != null) {
                                                LivingEntity livingEntity47;
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity47 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity47 = null;
                                                }
                                                f29 = entity.m_20270_(livingEntity47);
                                            } else {
                                                f29 = -1.0f;
                                            }
                                            if (f29 > 24.0f) {
                                                LivingEntity livingEntity48;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt18 = (Mob)entity;
                                                    livingEntity48 = _mobEnt18.m_5448_();
                                                } else {
                                                    livingEntity48 = null;
                                                }
                                                if (livingEntity48.m_20206_() > 6.0f) {
                                                    if (entity instanceof OmegafishEntity) {
                                                        _datEntSetI = (OmegafishEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)6));
                                                    }
                                                } else if (entity instanceof OmegafishEntity) {
                                                    _datEntSetI = (OmegafishEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)6));
                                                }
                                            }
                                        }
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
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n8 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n8 = 0;
        }
        if (n8 == 1) {
            int n39;
            int n40;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("slap");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt22 = (Mob)entity;
                livingEntity = _mobEnt22.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity49;
                if (entity instanceof Mob) {
                    Mob _mobEnt19 = (Mob)entity;
                    livingEntity49 = _mobEnt19.m_5448_();
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
                    Mob _mobEnt20 = (Mob)entity;
                    livingEntity53 = _mobEnt20.m_5448_();
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
                    Mob _mobEnt21 = (Mob)entity;
                    livingEntity51 = _mobEnt21.m_5448_();
                } else {
                    livingEntity51 = null;
                }
                double d16 = d15 + (double)livingEntity51.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt22 = (Mob)entity;
                    livingEntity50 = _mobEnt22.m_5448_();
                } else {
                    livingEntity50 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity50.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n40 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 == 42) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity3 : _entfound) {
                    int n41;
                    float f30;
                    int n42;
                    float f31;
                    int n43;
                    float f32;
                    int n44;
                    OmegafishEntity _datEntI5;
                    float f33;
                    int n45;
                    float f34;
                    if (entity3 instanceof OmegafishEntity || !(entity3 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f34 = _livEnt.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f35 = f34 / 20.0f + 1000.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI10 = (OmegafishEntity)entity;
                        n45 = (Integer)_datEntI10.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n45 = 0;
                    }
                    entity3.m_6469_(damageSource, f35 + (float)(n45 * 5));
                    if (entity3 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity3 instanceof Player)) {
                        entity3.f_19802_ = 0;
                        Deathlist.normalattack(entity3);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f33 = _livEnt.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    float f36 = f33 / 20.0f + 1000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI5 = (OmegafishEntity)entity;
                        n44 = (Integer)_datEntI5.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n44 = 0;
                    }
                    entity3.m_6469_(damageSource6, f36 + (float)(n44 * 5));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f32 = _livEnt.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    float f37 = f32 / 20.0f + 1000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI5 = (OmegafishEntity)entity;
                        n43 = (Integer)_datEntI5.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n43 = 0;
                    }
                    entity3.m_6469_(damageSource7, f37 + (float)(n43 * 5));
                    entity3.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entity3.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f31 = _livEnt.m_21233_();
                    } else {
                        f31 = -1.0f;
                    }
                    float f38 = f31 / 5.0f + 10000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI5 = (OmegafishEntity)entity;
                        n42 = (Integer)_datEntI5.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n42 = 0;
                    }
                    entity3.m_6469_(damageSource8, f38 + (float)(n42 * 50));
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f30 = _livEnt.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    float f39 = f30 / 5.0f + 10000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI5 = (OmegafishEntity)entity;
                        n41 = (Integer)_datEntI5.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n41 = 0;
                    }
                    entity3.m_6469_(damageSource9, f39 + (float)(n41 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n39 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 >= 65) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n7 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n7 = 0;
        }
        if (n7 == 2) {
            int n46;
            int n47;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("dash");
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity54;
                if (entity instanceof Mob) {
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity54 = _mobEnt23.m_5448_();
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
                    Mob _mobEnt24 = (Mob)entity;
                    livingEntity58 = _mobEnt24.m_5448_();
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
                    Mob _mobEnt25 = (Mob)entity;
                    livingEntity56 = _mobEnt25.m_5448_();
                } else {
                    livingEntity56 = null;
                }
                double d18 = d17 + (double)livingEntity56.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt26 = (Mob)entity;
                    livingEntity55 = _mobEnt26.m_5448_();
                } else {
                    livingEntity55 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity55.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n47 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 == 12) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 12.0, y, z + entity.m_20154_().f_82481_ * 12.0);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity4 : _entfound) {
                    int n48;
                    float f40;
                    int n49;
                    float f41;
                    int n50;
                    float f42;
                    int n51;
                    OmegafishEntity _datEntI6;
                    float f43;
                    int n52;
                    float f44;
                    if (entity4 instanceof OmegafishEntity || !(entity4 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f44 = _livEnt.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    float f45 = f44 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI11 = (OmegafishEntity)entity;
                        n52 = (Integer)_datEntI11.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n52 = 0;
                    }
                    entity4.m_6469_(damageSource, f45 + (float)(n52 * 5));
                    if (entity4 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity4 instanceof Player)) {
                        entity4.f_19802_ = 0;
                        Deathlist.normalattack(entity4);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f43 = _livEnt.m_21233_();
                    } else {
                        f43 = -1.0f;
                    }
                    float f46 = f43 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI6 = (OmegafishEntity)entity;
                        n51 = (Integer)_datEntI6.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n51 = 0;
                    }
                    entity4.m_6469_(damageSource10, f46 + (float)(n51 * 5));
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f42 = _livEnt.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    float f47 = f42 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI6 = (OmegafishEntity)entity;
                        n50 = (Integer)_datEntI6.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n50 = 0;
                    }
                    entity4.m_6469_(damageSource11, f47 + (float)(n50 * 5));
                    entity4.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entity4.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f41 = _livEnt.m_21233_();
                    } else {
                        f41 = -1.0f;
                    }
                    float f48 = f41 / 5.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI6 = (OmegafishEntity)entity;
                        n49 = (Integer)_datEntI6.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n49 = 0;
                    }
                    entity4.m_6469_(damageSource12, f48 + (float)(n49 * 50));
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f40 = _livEnt.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    float f49 = f40 / 5.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI6 = (OmegafishEntity)entity;
                        n48 = (Integer)_datEntI6.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n48 = 0;
                    }
                    entity4.m_6469_(damageSource13, f49 + (float)(n48 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n46 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n46 = 0;
            }
            if (n46 >= 20) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n6 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 3) {
            int n53;
            int n54;
            float f;
            LivingEntity livingEntity;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("swing");
                }
            } else if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("swing2");
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity59;
                if (entity instanceof Mob) {
                    Mob _mobEnt27 = (Mob)entity;
                    livingEntity59 = _mobEnt27.m_5448_();
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
                    Mob _mobEnt28 = (Mob)entity;
                    livingEntity63 = _mobEnt28.m_5448_();
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
                    Mob _mobEnt29 = (Mob)entity;
                    livingEntity61 = _mobEnt29.m_5448_();
                } else {
                    livingEntity61 = null;
                }
                double d20 = d19 + (double)livingEntity61.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt30 = (Mob)entity;
                    livingEntity60 = _mobEnt30.m_5448_();
                } else {
                    livingEntity60 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity60.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n54 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 == 30) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 12.0, y, z + entity.m_20154_().f_82481_ * 12.0);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity5 : _entfound) {
                    int n55;
                    float f50;
                    int n56;
                    float f51;
                    int n57;
                    float f52;
                    int n58;
                    OmegafishEntity _datEntI7;
                    float f53;
                    int n59;
                    float f54;
                    if (entity5 instanceof OmegafishEntity || !(entity5 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f54 = _livEnt.m_21233_();
                    } else {
                        f54 = -1.0f;
                    }
                    float f55 = f54 / 20.0f + 2000.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI12 = (OmegafishEntity)entity;
                        n59 = (Integer)_datEntI12.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n59 = 0;
                    }
                    entity5.m_6469_(damageSource, f55 + (float)(n59 * 5));
                    if (entity5 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity5 instanceof Player)) {
                        entity5.f_19802_ = 0;
                        Deathlist.normalattack(entity5);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f53 = _livEnt.m_21233_();
                    } else {
                        f53 = -1.0f;
                    }
                    float f56 = f53 / 20.0f + 2000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI7 = (OmegafishEntity)entity;
                        n58 = (Integer)_datEntI7.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n58 = 0;
                    }
                    entity5.m_6469_(damageSource14, f56 + (float)(n58 * 5));
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f52 = _livEnt.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    float f57 = f52 / 20.0f + 2000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI7 = (OmegafishEntity)entity;
                        n57 = (Integer)_datEntI7.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n57 = 0;
                    }
                    entity5.m_6469_(damageSource15, f57 + (float)(n57 * 5));
                    entity5.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entity5.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f51 = _livEnt.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    float f58 = f51 / 5.0f + 20000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI7 = (OmegafishEntity)entity;
                        n56 = (Integer)_datEntI7.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n56 = 0;
                    }
                    entity5.m_6469_(damageSource16, f58 + (float)(n56 * 50));
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity5;
                        f50 = _livEnt.m_21233_();
                    } else {
                        f50 = -1.0f;
                    }
                    float f59 = f50 / 5.0f + 20000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI7 = (OmegafishEntity)entity;
                        n55 = (Integer)_datEntI7.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n55 = 0;
                    }
                    entity5.m_6469_(damageSource17, f59 + (float)(n55 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n53 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n53 = 0;
            }
            if (n53 >= 50) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n5 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 4) {
            int n60;
            int n61;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("smash");
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity64;
                if (entity instanceof Mob) {
                    Mob _mobEnt31 = (Mob)entity;
                    livingEntity64 = _mobEnt31.m_5448_();
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
                    Mob _mobEnt32 = (Mob)entity;
                    livingEntity68 = _mobEnt32.m_5448_();
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
                    Mob _mobEnt33 = (Mob)entity;
                    livingEntity66 = _mobEnt33.m_5448_();
                } else {
                    livingEntity66 = null;
                }
                double d22 = d21 + (double)livingEntity66.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt34 = (Mob)entity;
                    livingEntity65 = _mobEnt34.m_5448_();
                } else {
                    livingEntity65 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity65.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n61 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n61 = 0;
            }
            if (n61 == 185) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity6 : _entfound) {
                    int n62;
                    float f60;
                    int n63;
                    float f61;
                    int n64;
                    float f62;
                    int n65;
                    OmegafishEntity _datEntI8;
                    float f63;
                    int n66;
                    float f64;
                    if (entity6 instanceof OmegafishEntity || !(entity6 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f64 = _livEnt.m_21233_();
                    } else {
                        f64 = -1.0f;
                    }
                    float f65 = f64 / 20.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI13 = (OmegafishEntity)entity;
                        n66 = (Integer)_datEntI13.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n66 = 0;
                    }
                    entity6.m_6469_(damageSource, f65 + (float)(n66 * 5));
                    if (entity6 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity6 instanceof Player)) {
                        entity6.f_19802_ = 0;
                        Deathlist.normalattack(entity6);
                    }
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f63 = _livEnt.m_21233_();
                    } else {
                        f63 = -1.0f;
                    }
                    float f66 = f63 / 20.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI8 = (OmegafishEntity)entity;
                        n65 = (Integer)_datEntI8.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n65 = 0;
                    }
                    entity6.m_6469_(damageSource18, f66 + (float)(n65 * 5));
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f62 = _livEnt.m_21233_();
                    } else {
                        f62 = -1.0f;
                    }
                    float f67 = f62 / 20.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI8 = (OmegafishEntity)entity;
                        n64 = (Integer)_datEntI8.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n64 = 0;
                    }
                    entity6.m_6469_(damageSource19, f67 + (float)(n64 * 5));
                    entity6.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity6.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f61 = _livEnt.m_21233_();
                    } else {
                        f61 = -1.0f;
                    }
                    float f68 = f61 / 5.0f + 50000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI8 = (OmegafishEntity)entity;
                        n63 = (Integer)_datEntI8.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n63 = 0;
                    }
                    entity6.m_6469_(damageSource20, f68 + (float)(n63 * 50));
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity6;
                        f60 = _livEnt.m_21233_();
                    } else {
                        f60 = -1.0f;
                    }
                    float f69 = f60 / 5.0f + 50000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI8 = (OmegafishEntity)entity;
                        n62 = (Integer)_datEntI8.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n62 = 0;
                    }
                    entity6.m_6469_(damageSource21, f69 + (float)(n62 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n60 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n60 = 0;
            }
            if (n60 >= 340) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n4 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 5) {
            int n67;
            int n68;
            float f;
            LivingEntity livingEntity;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("attack1");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("attack2");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("attack3");
                }
            } else if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("attack4");
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity69;
                if (entity instanceof Mob) {
                    Mob _mobEnt35 = (Mob)entity;
                    livingEntity69 = _mobEnt35.m_5448_();
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
                    Mob _mobEnt36 = (Mob)entity;
                    livingEntity73 = _mobEnt36.m_5448_();
                } else {
                    livingEntity73 = null;
                }
                double d = livingEntity73.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity72 = _mobEnt.m_5448_();
                } else {
                    livingEntity72 = null;
                }
                double d23 = livingEntity72.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt37 = (Mob)entity;
                    livingEntity71 = _mobEnt37.m_5448_();
                } else {
                    livingEntity71 = null;
                }
                double d24 = d23 + (double)livingEntity71.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt38 = (Mob)entity;
                    livingEntity70 = _mobEnt38.m_5448_();
                } else {
                    livingEntity70 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity70.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n68 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n68 = 0;
            }
            if (n68 == 15) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82479_ * 16.0);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(36.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity7 : _entfound) {
                    int n69;
                    float f70;
                    int n70;
                    float f71;
                    int n71;
                    float f72;
                    int n72;
                    OmegafishEntity _datEntI9;
                    float f73;
                    int n73;
                    float f74;
                    if (entity7 instanceof OmegafishEntity || !(entity7 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f74 = _livEnt.m_21233_();
                    } else {
                        f74 = -1.0f;
                    }
                    float f75 = f74 / 20.0f + 4000.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI14 = (OmegafishEntity)entity;
                        n73 = (Integer)_datEntI14.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n73 = 0;
                    }
                    entity7.m_6469_(damageSource, f75 + (float)(n73 * 5));
                    if (entity7 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity7 instanceof Player)) {
                        entity7.f_19802_ = 0;
                        Deathlist.normalattack(entity7);
                    }
                    DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f73 = _livEnt.m_21233_();
                    } else {
                        f73 = -1.0f;
                    }
                    float f76 = f73 / 20.0f + 4000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI9 = (OmegafishEntity)entity;
                        n72 = (Integer)_datEntI9.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n72 = 0;
                    }
                    entity7.m_6469_(damageSource22, f76 + (float)(n72 * 5));
                    DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f72 = _livEnt.m_21233_();
                    } else {
                        f72 = -1.0f;
                    }
                    float f77 = f72 / 20.0f + 4000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI9 = (OmegafishEntity)entity;
                        n71 = (Integer)_datEntI9.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n71 = 0;
                    }
                    entity7.m_6469_(damageSource23, f77 + (float)(n71 * 5));
                    if (!(entity7.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f71 = _livEnt.m_21233_();
                    } else {
                        f71 = -1.0f;
                    }
                    float f78 = f71 / 5.0f + 40000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI9 = (OmegafishEntity)entity;
                        n70 = (Integer)_datEntI9.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n70 = 0;
                    }
                    entity7.m_6469_(damageSource24, f78 + (float)(n70 * 50));
                    DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity7 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity7;
                        f70 = _livEnt.m_21233_();
                    } else {
                        f70 = -1.0f;
                    }
                    float f79 = f70 / 5.0f + 40000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI9 = (OmegafishEntity)entity;
                        n69 = (Integer)_datEntI9.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n69 = 0;
                    }
                    entity7.m_6469_(damageSource25, f79 + (float)(n69 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n67 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 >= 30) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 6) {
            int n74;
            int n75;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("thunder");
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity74;
                if (entity instanceof Mob) {
                    Mob _mobEnt39 = (Mob)entity;
                    livingEntity74 = _mobEnt39.m_5448_();
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
                LivingEntity livingEntity77;
                LivingEntity livingEntity78;
                if (entity instanceof Mob) {
                    Mob _mobEnt40 = (Mob)entity;
                    livingEntity78 = _mobEnt40.m_5448_();
                } else {
                    livingEntity78 = null;
                }
                double d = livingEntity78.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity77 = _mobEnt.m_5448_();
                } else {
                    livingEntity77 = null;
                }
                double d25 = livingEntity77.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt41 = (Mob)entity;
                    livingEntity76 = _mobEnt41.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                double d26 = d25 + (double)livingEntity76.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt42 = (Mob)entity;
                    livingEntity75 = _mobEnt42.m_5448_();
                } else {
                    livingEntity75 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity75.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n75 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n75 = 0;
            }
            if (n75 == 43) {
                float f80;
                LivingEntity livingEntity79;
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                    entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)(y + 10.0), (double)z)));
                    entityToSpawn.m_20874_(true);
                    _level.m_7967_((Entity)entityToSpawn);
                }
                for (int index3 = 0; index3 < 16; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.GAMALIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt43 = (Mob)entity;
                    livingEntity79 = _mobEnt43.m_5448_();
                } else {
                    livingEntity79 = null;
                }
                if (livingEntity79 != null) {
                    LivingEntity livingEntity80;
                    if (entity instanceof Mob) {
                        Mob _mobEnt44 = (Mob)entity;
                        livingEntity80 = _mobEnt44.m_5448_();
                    } else {
                        livingEntity80 = null;
                    }
                    f80 = entity.m_20270_(livingEntity80);
                } else {
                    f80 = -1.0f;
                }
                if (f80 > 1.0f && world instanceof ServerLevel) {
                    LivingEntity livingEntity81;
                    LivingEntity livingEntity82;
                    LivingEntity livingEntity83;
                    ServerLevel _level = (ServerLevel)world;
                    EntityType entityType = (EntityType)UltimateskeletonsModEntities.GAMALIGHTNING.get();
                    if (entity instanceof Mob) {
                        Mob _mobEnt45 = (Mob)entity;
                        livingEntity83 = _mobEnt45.m_5448_();
                    } else {
                        livingEntity83 = null;
                    }
                    double d = livingEntity83.m_20185_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt46 = (Mob)entity;
                        livingEntity82 = _mobEnt46.m_5448_();
                    } else {
                        livingEntity82 = null;
                    }
                    double d27 = livingEntity82.m_20186_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt47 = (Mob)entity;
                        livingEntity81 = _mobEnt47.m_5448_();
                    } else {
                        livingEntity81 = null;
                    }
                    Entity entity8 = entityType.m_262496_(_level, BlockPos.m_274561_((double)d, (double)d27, (double)livingEntity81.m_20189_()), MobSpawnType.MOB_SUMMONED);
                    if (entity8 != null) {
                        entity8.m_146922_(world.m_213780_().m_188501_() * 360.0f);
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
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity9 : _entfound) {
                    int n76;
                    float f81;
                    int n77;
                    float f82;
                    int n78;
                    float f83;
                    int n79;
                    OmegafishEntity _datEntI10;
                    float f84;
                    int n80;
                    float f85;
                    if (entity9 instanceof OmegafishEntity || !(entity9 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity9;
                        f85 = _livEnt.m_21233_();
                    } else {
                        f85 = -1.0f;
                    }
                    float f86 = f85 / 20.0f + 490.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI15 = (OmegafishEntity)entity;
                        n80 = (Integer)_datEntI15.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n80 = 0;
                    }
                    entity9.m_6469_(damageSource, f86 + (float)(n80 * 5));
                    if (entity9 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity9 instanceof Player)) {
                        entity9.f_19802_ = 0;
                        Deathlist.normalattack(entity9);
                    }
                    DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity9;
                        f84 = _livEnt.m_21233_();
                    } else {
                        f84 = -1.0f;
                    }
                    float f87 = f84 / 20.0f + 490.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI10 = (OmegafishEntity)entity;
                        n79 = (Integer)_datEntI10.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n79 = 0;
                    }
                    entity9.m_6469_(damageSource26, f87 + (float)(n79 * 5));
                    DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity9;
                        f83 = _livEnt.m_21233_();
                    } else {
                        f83 = -1.0f;
                    }
                    float f88 = f83 / 20.0f + 490.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI10 = (OmegafishEntity)entity;
                        n78 = (Integer)_datEntI10.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n78 = 0;
                    }
                    entity9.m_6469_(damageSource27, f88 + (float)(n78 * 5));
                    entity9.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity9.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity9;
                        f82 = _livEnt.m_21233_();
                    } else {
                        f82 = -1.0f;
                    }
                    float f89 = f82 / 5.0f + 4900.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI10 = (OmegafishEntity)entity;
                        n77 = (Integer)_datEntI10.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n77 = 0;
                    }
                    entity9.m_6469_(damageSource28, f89 + (float)(n77 * 50));
                    DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity9;
                        f81 = _livEnt.m_21233_();
                    } else {
                        f81 = -1.0f;
                    }
                    float f90 = f81 / 5.0f + 4900.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI10 = (OmegafishEntity)entity;
                        n76 = (Integer)_datEntI10.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n76 = 0;
                    }
                    entity9.m_6469_(damageSource29, f90 + (float)(n76 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n74 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n74 = 0;
            }
            if (n74 >= 70) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 7) {
            int n81;
            int n82;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("undergroundstart");
            }
            if (entity instanceof OmegafishEntity) {
                _datEntSetL = (OmegafishEntity)entity;
                _datEntSetL.m_20088_().m_135381_(OmegafishEntity.DATA_under, (Object)true);
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity84;
                if (entity instanceof Mob) {
                    Mob _mobEnt48 = (Mob)entity;
                    livingEntity84 = _mobEnt48.m_5448_();
                } else {
                    livingEntity84 = null;
                }
                f = entity.m_20270_(livingEntity84);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity85;
                LivingEntity livingEntity86;
                LivingEntity livingEntity87;
                LivingEntity livingEntity88;
                if (entity instanceof Mob) {
                    Mob _mobEnt49 = (Mob)entity;
                    livingEntity88 = _mobEnt49.m_5448_();
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
                double d28 = livingEntity87.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt50 = (Mob)entity;
                    livingEntity86 = _mobEnt50.m_5448_();
                } else {
                    livingEntity86 = null;
                }
                double d29 = d28 + (double)livingEntity86.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt51 = (Mob)entity;
                    livingEntity85 = _mobEnt51.m_5448_();
                } else {
                    livingEntity85 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d29, livingEntity85.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n82 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n82 = 0;
            }
            if (n82 == 65) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:groundsmash")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:groundsmash")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity10 : _entfound) {
                    int n83;
                    float f91;
                    int n84;
                    float f92;
                    int n85;
                    float f93;
                    int n86;
                    OmegafishEntity _datEntI11;
                    float f94;
                    int n87;
                    float f95;
                    if (entity10 instanceof OmegafishEntity || !(entity10 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f95 = _livEnt.m_21233_();
                    } else {
                        f95 = -1.0f;
                    }
                    float f96 = f95 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI16 = (OmegafishEntity)entity;
                        n87 = (Integer)_datEntI16.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n87 = 0;
                    }
                    entity10.m_6469_(damageSource, f96 + (float)(n87 * 5));
                    if (entity10 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity10 instanceof Player)) {
                        entity10.f_19802_ = 0;
                        Deathlist.normalattack(entity10);
                    }
                    DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f94 = _livEnt.m_21233_();
                    } else {
                        f94 = -1.0f;
                    }
                    float f97 = f94 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI11 = (OmegafishEntity)entity;
                        n86 = (Integer)_datEntI11.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n86 = 0;
                    }
                    entity10.m_6469_(damageSource30, f97 + (float)(n86 * 5));
                    DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f93 = _livEnt.m_21233_();
                    } else {
                        f93 = -1.0f;
                    }
                    float f98 = f93 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI11 = (OmegafishEntity)entity;
                        n85 = (Integer)_datEntI11.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n85 = 0;
                    }
                    entity10.m_6469_(damageSource31, f98 + (float)(n85 * 5));
                    entity10.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity10.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f92 = _livEnt.m_21233_();
                    } else {
                        f92 = -1.0f;
                    }
                    float f99 = f92 / 5.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI11 = (OmegafishEntity)entity;
                        n84 = (Integer)_datEntI11.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n84 = 0;
                    }
                    entity10.m_6469_(damageSource32, f99 + (float)(n84 * 50));
                    DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f91 = _livEnt.m_21233_();
                    } else {
                        f91 = -1.0f;
                    }
                    float f100 = f91 / 5.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI11 = (OmegafishEntity)entity;
                        n83 = (Integer)_datEntI11.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n83 = 0;
                    }
                    entity10.m_6469_(damageSource33, f100 + (float)(n83 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n81 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n81 = 0;
            }
            if (n81 >= 95) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetL2 = (OmegafishEntity)entity;
                    _datEntSetL2.m_20088_().m_135381_(OmegafishEntity.DATA_under, (Object)true);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof OmegafishEntity) {
            _datEntI = (OmegafishEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 8) {
            int n88;
            int n89;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof OmegafishEntity) {
                ((OmegafishEntity)entity).setAnimation("undergroundend");
            }
            if (entity instanceof OmegafishEntity) {
                _datEntSetL = (OmegafishEntity)entity;
                _datEntSetL.m_20088_().m_135381_(OmegafishEntity.DATA_under, (Object)false);
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity89;
                if (entity instanceof Mob) {
                    Mob _mobEnt52 = (Mob)entity;
                    livingEntity89 = _mobEnt52.m_5448_();
                } else {
                    livingEntity89 = null;
                }
                f = entity.m_20270_(livingEntity89);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity90;
                LivingEntity livingEntity91;
                LivingEntity livingEntity92;
                LivingEntity livingEntity93;
                if (entity instanceof Mob) {
                    Mob _mobEnt53 = (Mob)entity;
                    livingEntity93 = _mobEnt53.m_5448_();
                } else {
                    livingEntity93 = null;
                }
                double d = livingEntity93.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity92 = _mobEnt.m_5448_();
                } else {
                    livingEntity92 = null;
                }
                double d30 = livingEntity92.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt54 = (Mob)entity;
                    livingEntity91 = _mobEnt54.m_5448_();
                } else {
                    livingEntity91 = null;
                }
                double d31 = d30 + (double)livingEntity91.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt55 = (Mob)entity;
                    livingEntity90 = _mobEnt55.m_5448_();
                } else {
                    livingEntity90 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d31, livingEntity90.m_20189_()));
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n89 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n89 = 0;
            }
            if (n89 == 40) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entity11 : _entfound) {
                    int n90;
                    float f101;
                    int n91;
                    float f102;
                    int n92;
                    float f103;
                    int n93;
                    OmegafishEntity _datEntI12;
                    float f104;
                    int n94;
                    float f105;
                    if (entity11 instanceof OmegafishEntity || !(entity11 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity11;
                        f105 = _livEnt.m_21233_();
                    } else {
                        f105 = -1.0f;
                    }
                    float f106 = f105 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        OmegafishEntity _datEntI17 = (OmegafishEntity)entity;
                        n94 = (Integer)_datEntI17.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n94 = 0;
                    }
                    entity11.m_6469_(damageSource, f106 + (float)(n94 * 5));
                    if (entity11 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity11 instanceof Player)) {
                        entity11.f_19802_ = 0;
                        Deathlist.normalattack(entity11);
                    }
                    DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity11;
                        f104 = _livEnt.m_21233_();
                    } else {
                        f104 = -1.0f;
                    }
                    float f107 = f104 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI12 = (OmegafishEntity)entity;
                        n93 = (Integer)_datEntI12.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n93 = 0;
                    }
                    entity11.m_6469_(damageSource34, f107 + (float)(n93 * 5));
                    DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity11;
                        f103 = _livEnt.m_21233_();
                    } else {
                        f103 = -1.0f;
                    }
                    float f108 = f103 / 20.0f + 500.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI12 = (OmegafishEntity)entity;
                        n92 = (Integer)_datEntI12.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n92 = 0;
                    }
                    entity11.m_6469_(damageSource35, f108 + (float)(n92 * 5));
                    entity11.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity11.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity11;
                        f102 = _livEnt.m_21233_();
                    } else {
                        f102 = -1.0f;
                    }
                    float f109 = f102 / 5.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI12 = (OmegafishEntity)entity;
                        n91 = (Integer)_datEntI12.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n91 = 0;
                    }
                    entity11.m_6469_(damageSource36, f109 + (float)(n91 * 50));
                    DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity11;
                        f101 = _livEnt.m_21233_();
                    } else {
                        f101 = -1.0f;
                    }
                    float f110 = f101 / 5.0f + 5000.0f;
                    if (entity instanceof OmegafishEntity) {
                        _datEntI12 = (OmegafishEntity)entity;
                        n90 = (Integer)_datEntI12.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n90 = 0;
                    }
                    entity11.m_6469_(damageSource37, f110 + (float)(n90 * 50));
                }
            }
            if (entity instanceof OmegafishEntity) {
                _datEntI2 = (OmegafishEntity)entity;
                n88 = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_animationTick);
            } else {
                n88 = 0;
            }
            if (n88 >= 60) {
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetL3 = (OmegafishEntity)entity;
                    _datEntSetL3.m_20088_().m_135381_(OmegafishEntity.DATA_under, (Object)false);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    OmegafishEntity _datEntSetI = (OmegafishEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(OmegafishEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof OmegafishEntity) {
                    ((OmegafishEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

