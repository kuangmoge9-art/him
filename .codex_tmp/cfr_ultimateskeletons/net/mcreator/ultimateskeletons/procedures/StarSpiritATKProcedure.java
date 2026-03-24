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
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.server.network.ServerGamePacketListenerImpl
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
 *  net.minecraft.world.level.levelgen.Heightmap$Types
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
import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarswordedgecutEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
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
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class StarSpiritATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        Vec3 _center;
        int n4;
        Mob _mobEnt;
        ServerPlayer _serverPlayer;
        LivingEntity _ent;
        Mob _mobEnt2;
        Mob _mobEnt3;
        int n5;
        Mob _mobEnt4;
        Mob _mobEnt5;
        Object _mobEnt6;
        StarSpiritEntity _datEntI;
        int n6;
        StarSpiritEntity _datEntI2;
        StarSpiritEntity _datEntSetI;
        List<Entity> _entfound2;
        Vec3 _center2;
        Object entityToSpawn;
        Level _level;
        StarSpiritEntity _datEntI3;
        StarSpiritEntity _datEntSetI2;
        int n7;
        block612: {
            block611: {
                float f;
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
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                if (entity.m_5446_().getString().equals("\u65ed\u8861")) break block611;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt2 = (LivingEntity)entity;
                    f = _livEnt2.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (!(f <= 400000.0f)) break block612;
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity)entity).f_20919_ = 0;
            }
            if (entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("empty");
            }
            if (entity instanceof StarSpiritEntity) {
                StarSpiritEntity _datEntSetI22 = (StarSpiritEntity)entity;
                _datEntSetI22.m_20088_().m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)31);
            }
        }
        if (entity instanceof StarSpiritEntity) {
            StarSpiritEntity _datEntI32 = (StarSpiritEntity)entity;
            n7 = (Integer)_datEntI32.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
        } else {
            n7 = 0;
        }
        if (n7 >= 20) {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            if (entity instanceof LivingEntity) {
                ((LivingEntity)entity).f_20919_ = 0;
            }
            ((StarSpiritEntity)entity).setHEALTS(3000000.0);
            if (entity instanceof StarSpiritEntity) {
                _datEntSetI2 = (StarSpiritEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntSetI2 = (StarSpiritEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
            }
            if (entity instanceof StarSpiritEntity) {
                int n13;
                _datEntSetI2 = (StarSpiritEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntI4 = (StarSpiritEntity)entity;
                    n13 = (Integer)_datEntI4.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
                } else {
                    n13 = 0;
                }
                synchedEntityData.m_135381_(StarSpiritEntity.DATA_GodTick, (Object)(n13 + 1));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n12 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
            } else {
                n12 = 0;
            }
            if (n12 < 20 && entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("empty");
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n11 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
            } else {
                n11 = 0;
            }
            if (n11 >= 20 && entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.swords");
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n10 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
            } else {
                n10 = 0;
            }
            if (n10 == 64) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center22 = new Vec3(x, y, z);
                List<Entity> _entfound22 = world.m_6443_(Entity.class, new AABB(_center22, _center22).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entity2 : _entfound22) {
                    float f;
                    if (entity2 instanceof StarSpiritEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        LivingEntity _livEnt3 = (LivingEntity)entity2;
                        f = _livEnt3.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entity2.m_6469_(damageSource, f / 4.0f + 0.0f);
                    double _setval = 5.0;
                    entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entity2);
                    });
                }
                for (int index0 = 0; index0 < 200; ++index0) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.5, (double)1.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                }
                for (int index1 = 0; index1 < 400; ++index1) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level2 = (ServerLevel)world;
                    LightningBolt entityToSpawn2 = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level2);
                    entityToSpawn2.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                    entityToSpawn2.m_20874_(true);
                    _level2.m_7967_((Entity)entityToSpawn2);
                }
                for (int index2 = 0; index2 < 32; ++index2) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level3 = (ServerLevel)world;
                        entityToSpawn = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_(_level3, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)(y + 0.1), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SUN.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64), y + 0.1, z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64), 0.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)12), 0.0);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n9 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
            } else {
                n9 = 0;
            }
            if (n9 == 87) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SHA.get()), x, y + 70.0, z, 0.0, 0.4, 0.0);
                _center2 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                entityToSpawn = _entfound2.iterator();
                while (entityToSpawn.hasNext()) {
                    float f;
                    Entity entity3 = (Entity)entityToSpawn.next();
                    if (entity3 instanceof StarSpiritEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt4 = (LivingEntity)entity3;
                        f = _livEnt4.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entity3.m_6469_(damageSource, f / 4.0f + 1000000.0f);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n8 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
            } else {
                n8 = 0;
            }
            if (n8 >= 113) {
                if (entity instanceof StarSpiritEntity) {
                    _datEntSetI = (StarSpiritEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_GodTick, (Object)236);
                }
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetL = (StarSpiritEntity)entity;
                    _datEntSetL.m_20088_().m_135381_(StarSpiritEntity.DATA_God, (Object)true);
                }
            }
        }
        if (entity instanceof StarSpiritEntity) {
            _datEntI2 = (StarSpiritEntity)entity;
            n6 = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
        } else {
            n6 = 0;
        }
        if (n6 < 20) {
            LivingEntity livingEntity;
            int n14;
            if (entity instanceof StarSpiritEntity) {
                _datEntSetI2 = (StarSpiritEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(StarSpiritEntity.DATA_GodTick, (Object)0);
            }
            if (entity instanceof StarSpiritEntity) {
                StarSpiritEntity _datEntI22 = (StarSpiritEntity)entity;
                n14 = (Integer)_datEntI22.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
            } else {
                n14 = 0;
            }
            if (n14 != 0 && entity instanceof StarSpiritEntity) {
                int n15;
                _datEntSetI = (StarSpiritEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarSpiritEntity) {
                    _datEntI = (StarSpiritEntity)entity;
                    n15 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                } else {
                    n15 = 0;
                }
                synchedEntityData.m_135381_(StarSpiritEntity.DATA_animationTick, (Object)(n15 + 1));
            }
            if (entity instanceof Mob) {
                Mob _mobEnt7 = (Mob)entity;
                livingEntity = _mobEnt7.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                float f;
                if (entity instanceof Mob) {
                    Mob _mobEnt62 = (Mob)entity;
                    v18 = _mobEnt62.m_5448_();
                } else {
                    v18 = entityToSpawn = null;
                }
                if (entityToSpawn instanceof LivingEntity) {
                    LivingEntity _livEnt5 = entityToSpawn;
                    f = _livEnt5.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    float f2;
                    LivingEntity livingEntity2;
                    int n16;
                    float f3;
                    LivingEntity livingEntity3;
                    float f4;
                    LivingEntity livingEntity4;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity4 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity4 = null;
                    }
                    if (livingEntity4 != null) {
                        LivingEntity livingEntity5;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity5 = mob.m_5448_();
                        } else {
                            livingEntity5 = null;
                        }
                        f4 = entity.m_20270_(livingEntity5);
                    } else {
                        f4 = -1.0f;
                    }
                    if (f4 >= 160.0f) {
                        entity.m_6858_(true);
                    } else {
                        entity.m_6858_(false);
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity3 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity3 = null;
                    }
                    if (livingEntity3 != null) {
                        LivingEntity livingEntity6;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity6 = mob.m_5448_();
                        } else {
                            livingEntity6 = null;
                        }
                        f3 = entity.m_20270_(livingEntity6);
                    } else {
                        f3 = -1.0f;
                    }
                    if (f3 > 4.0f) {
                        int n17;
                        if (entity instanceof StarSpiritEntity) {
                            StarSpiritEntity _datEntI5 = (StarSpiritEntity)entity;
                            n17 = (Integer)_datEntI5.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                        } else {
                            n17 = 0;
                        }
                        if (n17 == 0) {
                            LivingEntity livingEntity7;
                            LivingEntity livingEntity8;
                            LivingEntity livingEntity9;
                            LivingEntity livingEntity10;
                            if (entity instanceof Mob) {
                                Mob _mobEnt32 = (Mob)entity;
                                livingEntity10 = _mobEnt32.m_5448_();
                            } else {
                                livingEntity10 = null;
                            }
                            double d = livingEntity10.m_20185_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt22 = (Mob)entity;
                                livingEntity9 = _mobEnt22.m_5448_();
                            } else {
                                livingEntity9 = null;
                            }
                            double d2 = livingEntity9.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity8 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity8 = null;
                            }
                            double d3 = d2 + (double)livingEntity8.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity7 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity7 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity7.m_20189_()));
                        }
                    }
                    if (entity instanceof StarSpiritEntity) {
                        StarSpiritEntity _datEntI6 = (StarSpiritEntity)entity;
                        n16 = (Integer)_datEntI6.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                    } else {
                        n16 = 0;
                    }
                    if (n16 == 0) {
                        LivingEntity livingEntity11;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity11 = mob.m_5448_();
                        } else {
                            livingEntity11 = null;
                        }
                        if (livingEntity11.m_20206_() > 8.0f) {
                            float f5;
                            LivingEntity livingEntity12;
                            if (entity instanceof Mob) {
                                Mob _mobEnt9 = (Mob)entity;
                                livingEntity12 = _mobEnt9.m_5448_();
                            } else {
                                livingEntity12 = null;
                            }
                            if (livingEntity12 != null) {
                                LivingEntity livingEntity13;
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity13 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity13 = null;
                                }
                                f5 = entity.m_20270_(livingEntity13);
                            } else {
                                f5 = -1.0f;
                            }
                            if (f5 > 48.0f) {
                                float f6;
                                LivingEntity livingEntity14;
                                LivingEntity livingEntity15;
                                float f7;
                                LivingEntity livingEntity16;
                                LivingEntity livingEntity17;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity17 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity17 = null;
                                }
                                double d = livingEntity17.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity16 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity16 = null;
                                }
                                if (livingEntity16 != null) {
                                    LivingEntity livingEntity18;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity18 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity18 = null;
                                    }
                                    f7 = entity.m_20270_(livingEntity18);
                                } else {
                                    f7 = -1.0f;
                                }
                                double d4 = d / (double)f7;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity15 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity15 = null;
                                }
                                double d5 = livingEntity15.m_20189_() - entity.m_20189_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity14 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity14 = null;
                                }
                                if (livingEntity14 != null) {
                                    LivingEntity livingEntity19;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity19 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity19 = null;
                                    }
                                    f6 = entity.m_20270_(livingEntity19);
                                } else {
                                    f6 = -1.0f;
                                }
                                entity.m_20256_(new Vec3(d4, 0.0, d5 / (double)f6));
                            }
                        } else {
                            float f8;
                            LivingEntity livingEntity20;
                            if (entity instanceof Mob) {
                                Mob _mobEnt10 = (Mob)entity;
                                livingEntity20 = _mobEnt10.m_5448_();
                            } else {
                                livingEntity20 = null;
                            }
                            if (livingEntity20 != null) {
                                LivingEntity livingEntity21;
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity21 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity21 = null;
                                }
                                f8 = entity.m_20270_(livingEntity21);
                            } else {
                                f8 = -1.0f;
                            }
                            if (f8 > 12.0f) {
                                float f9;
                                LivingEntity livingEntity22;
                                LivingEntity livingEntity23;
                                float f10;
                                LivingEntity livingEntity24;
                                LivingEntity livingEntity25;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity25 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity25 = null;
                                }
                                double d = livingEntity25.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity24 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity24 = null;
                                }
                                if (livingEntity24 != null) {
                                    LivingEntity livingEntity26;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity26 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity26 = null;
                                    }
                                    f10 = entity.m_20270_(livingEntity26);
                                } else {
                                    f10 = -1.0f;
                                }
                                double d6 = d / (double)f10;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity23 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity23 = null;
                                }
                                double d7 = livingEntity23.m_20189_() - entity.m_20189_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity22 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity22 = null;
                                }
                                if (livingEntity22 != null) {
                                    LivingEntity livingEntity27;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity27 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity27 = null;
                                    }
                                    f9 = entity.m_20270_(livingEntity27);
                                } else {
                                    f9 = -1.0f;
                                }
                                entity.m_20256_(new Vec3(d6, 0.0, d7 / (double)f9));
                            }
                        }
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity2 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (livingEntity2 != null) {
                        LivingEntity livingEntity28;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity28 = mob.m_5448_();
                        } else {
                            livingEntity28 = null;
                        }
                        f2 = entity.m_20270_(livingEntity28);
                    } else {
                        f2 = -1.0f;
                    }
                    if (f2 < 500.0f && !world.m_5776_()) {
                        float f11;
                        LivingEntity livingEntity29;
                        if (entity instanceof Mob) {
                            Mob _mobEnt11 = (Mob)entity;
                            livingEntity29 = _mobEnt11.m_5448_();
                        } else {
                            livingEntity29 = null;
                        }
                        if (livingEntity29 != null) {
                            LivingEntity livingEntity30;
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity30 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity30 = null;
                            }
                            f11 = entity.m_20270_(livingEntity30);
                        } else {
                            f11 = -1.0f;
                        }
                        if (f11 < 70.0f) {
                            int n18;
                            if (entity instanceof StarSpiritEntity) {
                                StarSpiritEntity _datEntI7 = (StarSpiritEntity)entity;
                                n18 = (Integer)_datEntI7.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                            } else {
                                n18 = 0;
                            }
                            if (n18 == 0) {
                                LivingEntity livingEntity31;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt8 = (Mob)entity;
                                    livingEntity31 = _mobEnt8.m_5448_();
                                } else {
                                    livingEntity31 = null;
                                }
                                if (livingEntity31.m_20206_() > 6.0f) {
                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                        if (entity instanceof StarSpiritEntity) {
                                            _datEntSetI = (StarSpiritEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                        }
                                    } else if (entity instanceof StarSpiritEntity) {
                                        _datEntSetI = (StarSpiritEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)5);
                                    }
                                } else if (entity instanceof StarSpiritEntity) {
                                    _datEntSetI = (StarSpiritEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                                }
                            }
                        }
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                            float f12;
                            LivingEntity livingEntity32;
                            if (entity instanceof Mob) {
                                Mob _mobEnt12 = (Mob)entity;
                                livingEntity32 = _mobEnt12.m_5448_();
                            } else {
                                livingEntity32 = null;
                            }
                            if (livingEntity32 != null) {
                                LivingEntity livingEntity33;
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity33 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity33 = null;
                                }
                                f12 = entity.m_20270_(livingEntity33);
                            } else {
                                f12 = -1.0f;
                            }
                            if (f12 >= 70.0f) {
                                int n19;
                                if (entity instanceof StarSpiritEntity) {
                                    StarSpiritEntity _datEntI4 = (StarSpiritEntity)entity;
                                    n19 = (Integer)_datEntI4.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                } else {
                                    n19 = 0;
                                }
                                if (n19 == 0 && entity instanceof StarSpiritEntity) {
                                    StarSpiritEntity _datEntSetI3 = (StarSpiritEntity)entity;
                                    _datEntSetI3.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
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
        if (entity instanceof StarSpiritEntity) {
            _datEntI2 = (StarSpiritEntity)entity;
            n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 1) {
            int n20;
            int n21;
            int n22;
            int n23;
            int n24;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.backflip");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity34;
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity34 = _mobEnt2.m_5448_();
                } else {
                    livingEntity34 = null;
                }
                f = entity.m_20270_(livingEntity34);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity35;
                LivingEntity livingEntity36;
                LivingEntity livingEntity37;
                LivingEntity livingEntity38;
                LivingEntity livingEntity39;
                if (entity instanceof Mob) {
                    Mob _mobEnt52 = (Mob)entity;
                    v80 = _mobEnt52.m_5448_();
                } else {
                    v80 = _ent = null;
                }
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity39 = _mobEnt6.m_5448_();
                } else {
                    livingEntity39 = null;
                }
                double d = livingEntity39.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity38 = _mobEnt6.m_5448_();
                } else {
                    livingEntity38 = null;
                }
                int n25 = (int)livingEntity38.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity37 = _mobEnt6.m_5448_();
                } else {
                    livingEntity37 = null;
                }
                double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n25, (int)livingEntity37.m_20189_());
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity36 = _mobEnt6.m_5448_();
                } else {
                    livingEntity36 = null;
                }
                _ent.m_6021_(d, d8, livingEntity36.m_20189_());
                if (_ent instanceof ServerPlayer) {
                    LivingEntity livingEntity40;
                    LivingEntity livingEntity41;
                    LivingEntity livingEntity42;
                    LivingEntity livingEntity43;
                    _serverPlayer = (ServerPlayer)_ent;
                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity43 = mob.m_5448_();
                    } else {
                        livingEntity43 = null;
                    }
                    double d9 = livingEntity43.m_20185_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt13 = (Mob)entity;
                        livingEntity42 = _mobEnt13.m_5448_();
                    } else {
                        livingEntity42 = null;
                    }
                    int n26 = (int)livingEntity42.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity41 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity41 = null;
                    }
                    double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n26, (int)livingEntity41.m_20189_());
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity40 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity40 = null;
                    }
                    serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity40.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                }
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity35 = _mobEnt.m_5448_();
                } else {
                    livingEntity35 = null;
                }
                livingEntity35.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n24 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n24 = 0;
            }
            if (n24 == 1) {
                float f13;
                LivingEntity livingEntity44;
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity44 = _mobEnt2.m_5448_();
                } else {
                    livingEntity44 = null;
                }
                if (livingEntity44 != null) {
                    LivingEntity livingEntity45;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity45 = _mobEnt.m_5448_();
                    } else {
                        livingEntity45 = null;
                    }
                    f13 = entity.m_20270_(livingEntity45);
                } else {
                    f13 = -1.0f;
                }
                if (f13 > 1.0f) {
                    LivingEntity livingEntity46;
                    LivingEntity livingEntity47;
                    LivingEntity livingEntity48;
                    LivingEntity livingEntity49;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity49 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity49 = null;
                    }
                    double d = livingEntity49.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity48 = mob.m_5448_();
                    } else {
                        livingEntity48 = null;
                    }
                    double d11 = livingEntity48.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity47 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity47 = null;
                    }
                    double d12 = d11 + (double)livingEntity47.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity46 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity46 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d12, livingEntity46.m_20189_()));
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n23 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n23 = 0;
            }
            if (n23 == 19) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center2 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(160.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entity4 : _entfound2) {
                    if (!(entity4 instanceof StarSpiritEntity)) {
                        float f14;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entity4 instanceof LivingEntity) {
                            LivingEntity _livEnt6 = (LivingEntity)entity4;
                            f14 = _livEnt6.m_21233_();
                        } else {
                            f14 = -1.0f;
                        }
                        entity4.m_6469_(damageSource, f14 / 4.0f + 1000000.0f);
                    }
                    if (!(entity4 instanceof LivingEntity) || entity4 instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entity4 instanceof Player) continue;
                    entity4.f_19802_ = 0;
                    Deathlist.normalattack(entity4);
                }
                if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
                for (int index3 = 0; index3 < 200; ++index3) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 40.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                }
                Entity _shootFrom = entity;
                Level projectileLevel = _shootFrom.m_9236_();
                if (!projectileLevel.m_5776_()) {
                    Projectile _entityToSpawn = new Object(){

                        public Projectile getArrow(Level level, float damage, int knockback) {
                            StarswordedgecutEntity entityToSpawn = new StarswordedgecutEntity((EntityType<? extends StarswordedgecutEntity>)((EntityType)UltimateskeletonsModEntities.STARSWORDEDGECUT.get()), level);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, 5.0f, 1);
                    _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1, _shootFrom.m_20189_());
                    _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 4.0f, 0.0f);
                    projectileLevel.m_7967_((Entity)_entityToSpawn);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n22 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n22 = 0;
            }
            if (n22 == 36) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 0.1, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                _center2 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(320.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entity5 : _entfound2) {
                    float f15;
                    if (entity5 instanceof StarSpiritEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entity5;
                        f15 = _livEnt7.m_21233_();
                    } else {
                        f15 = -1.0f;
                    }
                    entity5.m_6469_(damageSource, f15 / 4.0f + 100000.0f);
                    if (!(entity5 instanceof LivingEntity)) continue;
                    if (!(entity5 instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity5 instanceof Player)) {
                        entity5.f_19802_ = 0;
                        Deathlist.normalattack(entity5);
                    }
                    if (entity5 instanceof Player || !(entity5 instanceof LivingEntity)) continue;
                    LivingEntity _entity = (LivingEntity)entity5;
                    _entity.m_21153_(0.0f);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n21 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n21 = 0;
            }
            if (n21 == 52 && entity instanceof StarSpiritEntity) {
                int n27;
                _datEntSetI = (StarSpiritEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarSpiritEntity) {
                    _datEntI = (StarSpiritEntity)entity;
                    n27 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                } else {
                    n27 = 0;
                }
                synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n27 + 1));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n20 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n20 = 0;
            }
            if (n20 >= 52) {
                if (entity instanceof StarSpiritEntity) {
                    _datEntSetI = (StarSpiritEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    _datEntSetI = (StarSpiritEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarSpiritEntity) {
            _datEntI2 = (StarSpiritEntity)entity;
            n4 = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 3) {
            int n28;
            int n29;
            int n30;
            int n31;
            int n32;
            if (entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.laser");
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n32 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity = _mobEnt2.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity50;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity50 = _mobEnt.m_5448_();
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
                        _mobEnt6 = (Mob)entity;
                        livingEntity54 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity54 = null;
                    }
                    double d = livingEntity54.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity53 = mob.m_5448_();
                    } else {
                        livingEntity53 = null;
                    }
                    double d13 = livingEntity53.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity52 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity52 = null;
                    }
                    double d14 = d13 + (double)livingEntity52.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity51 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity51 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d14, livingEntity51.m_20189_()));
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n31 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 == 26) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
                for (int index4 = 0; index4 < 400; ++index4) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 40.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n30 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 >= 26) {
                int n33;
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntI8 = (StarSpiritEntity)entity;
                    n33 = (Integer)_datEntI8.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                } else {
                    n33 = 0;
                }
                if (n33 <= 42) {
                    _center = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        if (!(entityiterator instanceof StarSpiritEntity)) {
                            float f;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entityiterator;
                                f = _livEnt.m_21233_();
                            } else {
                                f = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, f / 4.0f + 1000000.0f);
                        }
                        if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n29 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 == 57 && entity instanceof StarSpiritEntity) {
                int n34;
                StarSpiritEntity _datEntSetI4 = (StarSpiritEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
                if (entity instanceof StarSpiritEntity) {
                    _datEntI = (StarSpiritEntity)entity;
                    n34 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                } else {
                    n34 = 0;
                }
                synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n34 + 2));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n28 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 >= 57) {
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI5 = (StarSpiritEntity)entity;
                    _datEntSetI5.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI6 = (StarSpiritEntity)entity;
                    _datEntSetI6.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarSpiritEntity) {
            _datEntI2 = (StarSpiritEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 4) {
            int n35;
            int n36;
            int n37;
            int n38;
            int n39;
            int n40;
            int n41;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.front");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity55;
                if (entity instanceof Mob) {
                    Mob _mobEnt14 = (Mob)entity;
                    livingEntity55 = _mobEnt14.m_5448_();
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
                LivingEntity livingEntity60;
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    v143 = _mobEnt6.m_5448_();
                } else {
                    v143 = _ent = null;
                }
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity60 = _mobEnt6.m_5448_();
                } else {
                    livingEntity60 = null;
                }
                double d = livingEntity60.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity59 = _mobEnt6.m_5448_();
                } else {
                    livingEntity59 = null;
                }
                int n42 = (int)livingEntity59.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity58 = _mobEnt6.m_5448_();
                } else {
                    livingEntity58 = null;
                }
                double d15 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n42, (int)livingEntity58.m_20189_());
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity57 = _mobEnt6.m_5448_();
                } else {
                    livingEntity57 = null;
                }
                _ent.m_6021_(d, d15, livingEntity57.m_20189_());
                if (_ent instanceof ServerPlayer) {
                    LivingEntity livingEntity61;
                    LivingEntity livingEntity62;
                    LivingEntity livingEntity63;
                    LivingEntity livingEntity64;
                    _serverPlayer = (ServerPlayer)_ent;
                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity64 = mob.m_5448_();
                    } else {
                        livingEntity64 = null;
                    }
                    double d16 = livingEntity64.m_20185_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt15 = (Mob)entity;
                        livingEntity63 = _mobEnt15.m_5448_();
                    } else {
                        livingEntity63 = null;
                    }
                    int n43 = (int)livingEntity63.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity62 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity62 = null;
                    }
                    double d17 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n43, (int)livingEntity62.m_20189_());
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity61 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity61 = null;
                    }
                    serverGamePacketListenerImpl.m_9774_(d16, d17, livingEntity61.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                }
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity56 = _mobEnt.m_5448_();
                } else {
                    livingEntity56 = null;
                }
                livingEntity56.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n41 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 == 1) {
                float f16;
                LivingEntity livingEntity65;
                if (entity instanceof Mob) {
                    Mob _mobEnt16 = (Mob)entity;
                    livingEntity65 = _mobEnt16.m_5448_();
                } else {
                    livingEntity65 = null;
                }
                if (livingEntity65 != null) {
                    LivingEntity livingEntity66;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity66 = _mobEnt.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    f16 = entity.m_20270_(livingEntity66);
                } else {
                    f16 = -1.0f;
                }
                if (f16 > 1.0f) {
                    LivingEntity livingEntity67;
                    LivingEntity livingEntity68;
                    LivingEntity livingEntity69;
                    LivingEntity livingEntity70;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity70 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity70 = null;
                    }
                    double d = livingEntity70.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity69 = mob.m_5448_();
                    } else {
                        livingEntity69 = null;
                    }
                    double d18 = livingEntity69.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity68 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity68 = null;
                    }
                    double d19 = d18 + (double)livingEntity68.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity67 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity67 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d19, livingEntity67.m_20189_()));
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n40 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 == 17 && world instanceof Level) {
                Level _level4 = (Level)world;
                if (!_level4.m_5776_()) {
                    _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n39 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 == 22) {
                if (world instanceof Level) {
                    Level _level5 = (Level)world;
                    if (!_level5.m_5776_()) {
                        _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center3 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                for (Entity entity6 : _entfound2) {
                    if (!(entity6 instanceof StarSpiritEntity)) {
                        float f17;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entity6 instanceof LivingEntity) {
                            LivingEntity _livEnt8 = (LivingEntity)entity6;
                            f17 = _livEnt8.m_21233_();
                        } else {
                            f17 = -1.0f;
                        }
                        entity6.m_6469_(damageSource, f17 / 4.0f + 1000000.0f);
                    }
                    if (!(entity6 instanceof LivingEntity)) continue;
                    if (!(entity6 instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity6 instanceof Player)) {
                        entity6.f_19802_ = 0;
                        Deathlist.normalattack(entity6);
                    }
                    if (entity6 instanceof Player) continue;
                    entity6.f_19802_ = 0;
                }
                for (int index5 = 0; index5 < 400; ++index5) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-10.0, (double)10.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)10.0, (double)40.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-10.0, (double)10.0), x + entity.m_20154_().f_82479_ * Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), z + entity.m_20154_().f_82481_ * Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0));
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n38 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n38 = 0;
            }
            if (n38 == 47 && world instanceof Level) {
                Level _level6 = (Level)world;
                if (!_level6.m_5776_()) {
                    _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n37 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n37 = 0;
            }
            if (n37 >= 52) {
                int n44;
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntI9 = (StarSpiritEntity)entity;
                    n44 = (Integer)_datEntI9.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                } else {
                    n44 = 0;
                }
                if (n44 <= 66) {
                    _center = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f18;
                        if (!(entityiterator instanceof Titangodentity) && entityiterator instanceof LivingEntity && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        if (entityiterator instanceof StarSpiritEntity || entityiterator instanceof GalaxyEntity || entityiterator instanceof Player) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f18 = _livEnt.m_21233_();
                        } else {
                            f18 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f18 / 4.0f + 1000000.0f);
                        CompoundTag nbt = entityiterator.m_20240_(new CompoundTag());
                        nbt.m_128350_("Health", 0.0f);
                        nbt.m_128405_("Health", 0);
                    }
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n36 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n36 = 0;
            }
            if (n36 == 67 && entity instanceof StarSpiritEntity) {
                int n45;
                StarSpiritEntity _datEntSetI7 = (StarSpiritEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI7.m_20088_();
                if (entity instanceof StarSpiritEntity) {
                    _datEntI = (StarSpiritEntity)entity;
                    n45 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                } else {
                    n45 = 0;
                }
                synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n45 + 3));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n35 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 >= 67) {
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI8 = (StarSpiritEntity)entity;
                    _datEntSetI8.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI9 = (StarSpiritEntity)entity;
                    _datEntSetI9.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarSpiritEntity) {
            _datEntI2 = (StarSpiritEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 2) {
            int n46;
            int n47;
            int n48;
            int n49;
            int n50;
            int n51;
            int n52;
            int n53;
            int n54;
            int n55;
            int n56;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.lightningsmash");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity71;
                if (entity instanceof Mob) {
                    Mob _mobEnt17 = (Mob)entity;
                    livingEntity71 = _mobEnt17.m_5448_();
                } else {
                    livingEntity71 = null;
                }
                f = entity.m_20270_(livingEntity71);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity72;
                LivingEntity livingEntity73;
                LivingEntity livingEntity74;
                LivingEntity livingEntity75;
                LivingEntity livingEntity76;
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    v188 = _mobEnt6.m_5448_();
                } else {
                    v188 = _ent = null;
                }
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity76 = _mobEnt6.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                double d = livingEntity76.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity75 = _mobEnt6.m_5448_();
                } else {
                    livingEntity75 = null;
                }
                int n57 = (int)livingEntity75.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity74 = _mobEnt6.m_5448_();
                } else {
                    livingEntity74 = null;
                }
                double d20 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n57, (int)livingEntity74.m_20189_());
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity73 = _mobEnt6.m_5448_();
                } else {
                    livingEntity73 = null;
                }
                _ent.m_6021_(d, d20, livingEntity73.m_20189_());
                if (_ent instanceof ServerPlayer) {
                    LivingEntity livingEntity77;
                    LivingEntity livingEntity78;
                    LivingEntity livingEntity79;
                    LivingEntity livingEntity80;
                    _serverPlayer = (ServerPlayer)_ent;
                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity80 = mob.m_5448_();
                    } else {
                        livingEntity80 = null;
                    }
                    double d21 = livingEntity80.m_20185_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt18 = (Mob)entity;
                        livingEntity79 = _mobEnt18.m_5448_();
                    } else {
                        livingEntity79 = null;
                    }
                    int n58 = (int)livingEntity79.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity78 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity78 = null;
                    }
                    double d22 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n58, (int)livingEntity78.m_20189_());
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity77 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity77 = null;
                    }
                    serverGamePacketListenerImpl.m_9774_(d21, d22, livingEntity77.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                }
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity72 = _mobEnt.m_5448_();
                } else {
                    livingEntity72 = null;
                }
                livingEntity72.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n56 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 == 1) {
                float f19;
                LivingEntity livingEntity81;
                if (entity instanceof Mob) {
                    Mob _mobEnt19 = (Mob)entity;
                    livingEntity81 = _mobEnt19.m_5448_();
                } else {
                    livingEntity81 = null;
                }
                if (livingEntity81 != null) {
                    LivingEntity livingEntity82;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity82 = _mobEnt.m_5448_();
                    } else {
                        livingEntity82 = null;
                    }
                    f19 = entity.m_20270_(livingEntity82);
                } else {
                    f19 = -1.0f;
                }
                if (f19 > 1.0f) {
                    LivingEntity livingEntity83;
                    LivingEntity livingEntity84;
                    LivingEntity livingEntity85;
                    LivingEntity livingEntity86;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity86 = _mobEnt6.m_5448_();
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
                    double d23 = livingEntity85.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity84 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity84 = null;
                    }
                    double d24 = d23 + (double)livingEntity84.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity83 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity83 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity83.m_20189_()));
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n55 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 == 40) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                if (world instanceof Level) {
                    Level _level7 = (Level)world;
                    if (!_level7.m_5776_()) {
                        _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                    ServerLevel _level8 = (ServerLevel)world;
                    _level8.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level8, 4, "", (Component)Component.m_237113_((String)""), _level8.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n54 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 >= 42) {
                int n59;
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntI10 = (StarSpiritEntity)entity;
                    n59 = (Integer)_datEntI10.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                } else {
                    n59 = 0;
                }
                if (n59 <= 60) {
                    for (int index6 = 0; index6 < 2; ++index6) {
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel _level9 = (ServerLevel)world;
                        Entity entity7 = ((EntityType)UltimateskeletonsModEntities.GALAXY.get()).m_262496_(_level9, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)(y + 0.1), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                        if (entity7 == null) continue;
                        entity7.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n53 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n53 = 0;
            }
            if (n53 >= 75) {
                int n60;
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntI11 = (StarSpiritEntity)entity;
                    n60 = (Integer)_datEntI11.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                } else {
                    n60 = 0;
                }
                if (n60 <= 85) {
                    for (int index7 = 0; index7 < 32; ++index7) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SUN.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64), y + 0.1, z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64), 0.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3), 0.0);
                    }
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n52 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n52 = 0;
            }
            if (n52 == 118) {
                if (world instanceof Level) {
                    Level _level10 = (Level)world;
                    if (!_level10.m_5776_()) {
                        _level10.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level10.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center4 = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                for (Entity entity8 : _entfound3) {
                    if (!(entity8 instanceof StarSpiritEntity)) {
                        float f20;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entity8 instanceof LivingEntity) {
                            LivingEntity _livEnt9 = (LivingEntity)entity8;
                            f20 = _livEnt9.m_21233_();
                        } else {
                            f20 = -1.0f;
                        }
                        entity8.m_6469_(damageSource, f20 / 4.0f + 0.0f);
                    }
                    if (!(entity8 instanceof LivingEntity) || entity8 instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entity8 instanceof Player) continue;
                    entity8.f_19802_ = 0;
                    Deathlist.normalattack(entity8);
                }
                for (int index8 = 0; index8 < 200; ++index8) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 30.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)5.0, (double)15.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                }
                for (int index9 = 0; index9 < 400; ++index9) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 40.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-50, (int)50), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-50, (int)50), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-50, (int)50));
                }
                for (int index10 = 0; index10 < 32; ++index10) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level11 = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level11);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                        entityToSpawn.m_20874_(true);
                        _level11.m_7967_((Entity)entityToSpawn);
                    }
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level2 = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_(_level2, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)(y + 0.1), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n51 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n51 = 0;
            }
            if (n51 <= 149) {
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n50 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n50 = 0;
            }
            if (n50 == 182 && world instanceof Level) {
                Level _level12 = (Level)world;
                if (!_level12.m_5776_()) {
                    _level12.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level12.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n49 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n49 = 0;
            }
            if (n49 >= 189) {
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n48 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 == 190) {
                LivingEntity _entity;
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    Level _level13 = (Level)world;
                    if (!_level13.m_5776_()) {
                        _level13.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level13.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level14 = (Level)world;
                    if (!_level14.m_5776_()) {
                        _level14.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level14.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 60.0, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z + entity.m_20154_().f_82481_ * 60.0, 0.0, 0.0, 0.0);
                for (int index11 = 0; index11 < 32; ++index11) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level15 = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level15);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                        entityToSpawn.m_20874_(true);
                        _level15.m_7967_((Entity)entityToSpawn);
                    }
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level16 = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_(_level16, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center5 = new Vec3(x, y, z);
                List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                for (Entity entity9 : _entfound4) {
                    float f21;
                    if (entity9 instanceof StarSpiritEntity) continue;
                    double _setval = 10.0;
                    entity9.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entity9);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity _livEnt10 = (LivingEntity)entity9;
                        f21 = _livEnt10.m_21223_();
                    } else {
                        f21 = -1.0f;
                    }
                    entity9.m_6469_(damageSource, f21 * 4.0f + 1000000.0f);
                    if (!(entity9 instanceof LivingEntity)) continue;
                    if (!(entity9 instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity9 instanceof Player)) {
                        entity9.f_19802_ = 0;
                        Deathlist.normalattack(entity9);
                    }
                    if (entity9 instanceof Player || entity9 instanceof LightningBolt || entity9 instanceof OriginallightningEntity) continue;
                    entity9.m_142687_(Entity.RemovalReason.KILLED);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n47 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 == 205 && entity instanceof StarSpiritEntity) {
                int n61;
                StarSpiritEntity _datEntSetI10 = (StarSpiritEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI10.m_20088_();
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntI12 = (StarSpiritEntity)entity;
                    n61 = (Integer)_datEntI12.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                } else {
                    n61 = 0;
                }
                synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n61 + 5));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n46 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n46 = 0;
            }
            if (n46 >= 205) {
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI11 = (StarSpiritEntity)entity;
                    _datEntSetI11.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI12 = (StarSpiritEntity)entity;
                    _datEntSetI12.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarSpiritEntity) {
            _datEntI2 = (StarSpiritEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 5) {
            int n62;
            int n63;
            int n64;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.attack");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.attack2");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.attack3");
                }
            } else if (entity instanceof StarSpiritEntity) {
                ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.attac4");
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n64 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n64 = 0;
            }
            if (n64 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt20 = (Mob)entity;
                    livingEntity = _mobEnt20.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity87;
                    if (entity instanceof Mob) {
                        Mob _mobEnt21 = (Mob)entity;
                        livingEntity87 = _mobEnt21.m_5448_();
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
                        _mobEnt6 = (Mob)entity;
                        livingEntity91 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity91 = null;
                    }
                    double d = livingEntity91.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity90 = mob.m_5448_();
                    } else {
                        livingEntity90 = null;
                    }
                    double d25 = livingEntity90.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity89 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity89 = null;
                    }
                    double d26 = d25 + (double)livingEntity89.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity88 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity88 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity88.m_20189_()));
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n63 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n63 = 0;
            }
            if (n63 == 16) {
                if (world instanceof Level) {
                    Level _level17 = (Level)world;
                    if (!_level17.m_5776_()) {
                        _level17.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level17.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center6 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                for (Entity entity10 : _entfound5) {
                    float f;
                    float f22;
                    float f23;
                    float f24;
                    float f25;
                    float f26;
                    LivingEntity _livEnt2;
                    float f27;
                    if (entity10 instanceof StarSpiritEntity || entity10 instanceof StarskeletonEntity || !(entity10 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entity10;
                        f27 = _livEnt11.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    entity10.m_6469_(damageSource, f27 / 20.0f + 1680000.0f);
                    if (entity10 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity10 instanceof Player)) {
                        entity10.f_19802_ = 0;
                        Deathlist.normalattack(entity10);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity10;
                        f26 = _livEnt2.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    entity10.m_6469_(damageSource2, f26 / 20.0f + 1680000.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity10;
                        f25 = _livEnt2.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    entity10.m_6469_(damageSource3, f25 / 20.0f + 1680000.0f);
                    if (!(entity10.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f24 = _livEnt.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    if (entity10 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity10;
                        f23 = _livEnt2.m_21223_();
                    } else {
                        f23 = -1.0f;
                    }
                    entity10.m_6469_(damageSource4, (f24 + f23) / 5.0f + 1.68E7f);
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f22 = _livEnt.m_21233_();
                    } else {
                        f22 = -1.0f;
                    }
                    if (entity10 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity10;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entity10.m_6469_(damageSource5, (f22 + f) / 5.0f + 1.68E7f);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI3 = (StarSpiritEntity)entity;
                n62 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n62 = 0;
            }
            if (n62 >= 30) {
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI13 = (StarSpiritEntity)entity;
                    _datEntSetI13.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI14 = (StarSpiritEntity)entity;
                    _datEntSetI14.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

