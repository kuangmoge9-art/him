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
import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
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

public class StarskeletonATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        Vec3 _center;
        int n3;
        Mob _mobEnt;
        ServerPlayer _serverPlayer;
        LivingEntity _ent;
        Mob _mobEnt2;
        Mob _mobEnt3;
        int n4;
        Mob _mobEnt4;
        Mob _mobEnt5;
        Object _mobEnt6;
        StarskeletonEntity _datEntI;
        StarskeletonEntity _datEntSetI;
        int n5;
        StarskeletonEntity _datEntI2;
        List<Entity> _entfound2;
        Object entityToSpawn;
        Level _level;
        StarskeletonEntity _datEntI3;
        StarskeletonEntity _datEntSetI2;
        int n6;
        LivingEntity _entity;
        block585: {
            block584: {
                float f;
                LivingEntity _entity2;
                LivingEntity _entity22;
                if (entity == null) {
                    return;
                }
                double theta = 0.0;
                ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                if (entity instanceof LivingEntity && !(_entity22 = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity22.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 100, 3));
                }
                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 100, 10));
                }
                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19603_, 100, 4));
                }
                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 100, 5));
                }
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                if (entity.m_5446_().getString().equals("\u65ed\u8861")) break block584;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt3 = (LivingEntity)entity;
                    f = _livEnt3.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (!(f <= 0.0f)) break block585;
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity)entity).f_20919_ = 0;
            }
            if (entity instanceof StarskeletonEntity) {
                ((StarskeletonEntity)entity).setAnimation("empty");
            }
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt2 = (LivingEntity)entity;
                    f = _livEnt2.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (entity instanceof StarskeletonEntity) {
                StarskeletonEntity _datEntSetI22 = (StarskeletonEntity)entity;
                _datEntSetI22.m_20088_().m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)31);
            }
        }
        if (entity instanceof StarskeletonEntity) {
            StarskeletonEntity _datEntI32 = (StarskeletonEntity)entity;
            n6 = (Integer)_datEntI32.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
        } else {
            n6 = 0;
        }
        if (n6 >= 20) {
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            if (entity instanceof LivingEntity) {
                ((LivingEntity)entity).f_20919_ = 0;
            }
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt2 = (LivingEntity)entity;
                    f = _livEnt2.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntSetI2 = (StarskeletonEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntSetI2 = (StarskeletonEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
            }
            if (entity instanceof StarskeletonEntity) {
                int n12;
                _datEntSetI2 = (StarskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI4 = (StarskeletonEntity)entity;
                    n12 = (Integer)_datEntI4.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
                } else {
                    n12 = 0;
                }
                synchedEntityData.m_135381_(StarskeletonEntity.DATA_GodTiclk, (Object)(n12 + 1));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n11 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
            } else {
                n11 = 0;
            }
            if (n11 < 20 && entity instanceof StarskeletonEntity) {
                ((StarskeletonEntity)entity).setAnimation("empty");
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n10 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
            } else {
                n10 = 0;
            }
            if (n10 >= 20 && entity instanceof StarskeletonEntity) {
                ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.swords");
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n9 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
            } else {
                n9 = 0;
            }
            if (n9 == 64) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center2 = new Vec3(x, y, z);
                List<Entity> _entfound22 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entity2 : _entfound22) {
                    float f;
                    if (entity2 instanceof StarskeletonEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        LivingEntity _livEnt4 = (LivingEntity)entity2;
                        f = _livEnt4.m_21233_();
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
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n8 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
            } else {
                n8 = 0;
            }
            if (n8 == 87) {
                if (world instanceof Level) {
                    Level _level4 = (Level)world;
                    if (!_level4.m_5776_()) {
                        _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SHA.get()), x, y + 7.0, z, 0.0, 0.1, 0.0);
                Vec3 _center3 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                entityToSpawn = _entfound2.iterator();
                while (entityToSpawn.hasNext()) {
                    float f;
                    Entity entity3 = (Entity)entityToSpawn.next();
                    if (entity3 instanceof StarskeletonEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt5 = (LivingEntity)entity3;
                        f = _livEnt5.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entity3.m_6469_(damageSource, f / 4.0f + 1000.0f);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n7 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
            } else {
                n7 = 0;
            }
            if (n7 >= 113) {
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetI3 = (StarskeletonEntity)entity;
                    _datEntSetI3.m_20088_().m_135381_(StarskeletonEntity.DATA_GodTiclk, (Object)236);
                }
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetL = (StarskeletonEntity)entity;
                    _datEntSetL.m_20088_().m_135381_(StarskeletonEntity.DATA_God, (Object)true);
                }
            }
        }
        if (entity instanceof StarskeletonEntity) {
            _datEntI2 = (StarskeletonEntity)entity;
            n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
        } else {
            n5 = 0;
        }
        if (n5 < 20) {
            LivingEntity livingEntity;
            int n13;
            if (entity instanceof StarskeletonEntity) {
                _datEntSetI2 = (StarskeletonEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(StarskeletonEntity.DATA_GodTiclk, (Object)0);
            }
            if (entity instanceof StarskeletonEntity) {
                StarskeletonEntity _datEntI22 = (StarskeletonEntity)entity;
                n13 = (Integer)_datEntI22.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
            } else {
                n13 = 0;
            }
            if (n13 != 0 && entity instanceof StarskeletonEntity) {
                int n14;
                _datEntSetI = (StarskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarskeletonEntity) {
                    _datEntI = (StarskeletonEntity)entity;
                    n14 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n14 = 0;
                }
                synchedEntityData.m_135381_(StarskeletonEntity.DATA_animationTick, (Object)(n14 + 1));
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
                    v20 = _mobEnt62.m_5448_();
                } else {
                    v20 = entityToSpawn = null;
                }
                if (entityToSpawn instanceof LivingEntity) {
                    LivingEntity _livEnt6 = entityToSpawn;
                    f = _livEnt6.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    float f2;
                    LivingEntity livingEntity2;
                    float f3;
                    LivingEntity livingEntity3;
                    float f4;
                    LivingEntity livingEntity4;
                    float f5;
                    LivingEntity livingEntity5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity5 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity5 = null;
                    }
                    if (livingEntity5 != null) {
                        LivingEntity livingEntity6;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity6 = mob.m_5448_();
                        } else {
                            livingEntity6 = null;
                        }
                        f5 = entity.m_20270_(livingEntity6);
                    } else {
                        f5 = -1.0f;
                    }
                    if (f5 >= 20.0f) {
                        entity.m_6858_(true);
                    } else {
                        entity.m_6858_(false);
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity4 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity4 = null;
                    }
                    if (livingEntity4 != null) {
                        LivingEntity livingEntity7;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity7 = mob.m_5448_();
                        } else {
                            livingEntity7 = null;
                        }
                        f4 = entity.m_20270_(livingEntity7);
                    } else {
                        f4 = -1.0f;
                    }
                    if (f4 > 1.0f) {
                        int n15;
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity _datEntI5 = (StarskeletonEntity)entity;
                            n15 = (Integer)_datEntI5.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                        } else {
                            n15 = 0;
                        }
                        if (n15 == 0) {
                            LivingEntity livingEntity8;
                            LivingEntity livingEntity9;
                            LivingEntity livingEntity10;
                            LivingEntity livingEntity11;
                            if (entity instanceof Mob) {
                                Mob _mobEnt32 = (Mob)entity;
                                livingEntity11 = _mobEnt32.m_5448_();
                            } else {
                                livingEntity11 = null;
                            }
                            double d = livingEntity11.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity10 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity10 = null;
                            }
                            double d2 = livingEntity10.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity9 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity9 = null;
                            }
                            double d3 = d2 + (double)livingEntity9.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity8 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity8 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity8.m_20189_()));
                        }
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity3 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity3 = null;
                    }
                    if (livingEntity3 != null) {
                        LivingEntity livingEntity12;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity12 = mob.m_5448_();
                        } else {
                            livingEntity12 = null;
                        }
                        f3 = entity.m_20270_(livingEntity12);
                    } else {
                        f3 = -1.0f;
                    }
                    if (f3 > 12.0f) {
                        float f6;
                        LivingEntity livingEntity13;
                        LivingEntity livingEntity14;
                        float f7;
                        LivingEntity livingEntity15;
                        LivingEntity livingEntity16;
                        float f8;
                        LivingEntity livingEntity17;
                        LivingEntity livingEntity18;
                        if (entity instanceof Mob) {
                            Mob _mobEnt22 = (Mob)entity;
                            livingEntity18 = _mobEnt22.m_5448_();
                        } else {
                            livingEntity18 = null;
                        }
                        double d = livingEntity18.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity17 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity17 = null;
                        }
                        if (livingEntity17 != null) {
                            LivingEntity livingEntity19;
                            if (entity instanceof Mob) {
                                Mob _mobEnt8 = (Mob)entity;
                                livingEntity19 = _mobEnt8.m_5448_();
                            } else {
                                livingEntity19 = null;
                            }
                            f8 = entity.m_20270_(livingEntity19);
                        } else {
                            f8 = -1.0f;
                        }
                        double d4 = d / (double)f8 * 1.2;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity16 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity16 = null;
                        }
                        double d5 = livingEntity16.m_20186_() - entity.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity15 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity15 = null;
                        }
                        if (livingEntity15 != null) {
                            LivingEntity livingEntity20;
                            if (entity instanceof Mob) {
                                Mob _mobEnt9 = (Mob)entity;
                                livingEntity20 = _mobEnt9.m_5448_();
                            } else {
                                livingEntity20 = null;
                            }
                            f7 = entity.m_20270_(livingEntity20);
                        } else {
                            f7 = -1.0f;
                        }
                        double d6 = d5 / (double)f7 * 1.2;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity14 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity14 = null;
                        }
                        double d7 = livingEntity14.m_20189_() - entity.m_20189_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity13 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity13 = null;
                        }
                        if (livingEntity13 != null) {
                            LivingEntity livingEntity21;
                            if (entity instanceof Mob) {
                                Mob _mobEnt10 = (Mob)entity;
                                livingEntity21 = _mobEnt10.m_5448_();
                            } else {
                                livingEntity21 = null;
                            }
                            f6 = entity.m_20270_(livingEntity21);
                        } else {
                            f6 = -1.0f;
                        }
                        entity.m_20256_(new Vec3(d4, d6, d7 / (double)f6 * 1.2));
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity2 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (livingEntity2 != null) {
                        LivingEntity livingEntity22;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity22 = mob.m_5448_();
                        } else {
                            livingEntity22 = null;
                        }
                        f2 = entity.m_20270_(livingEntity22);
                    } else {
                        f2 = -1.0f;
                    }
                    if (f2 <= 12.0f && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                        int n16;
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity _datEntI6 = (StarskeletonEntity)entity;
                            n16 = (Integer)_datEntI6.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                        } else {
                            n16 = 0;
                        }
                        if (n16 == 0 && entity instanceof StarskeletonEntity) {
                            StarskeletonEntity _datEntSetI4 = (StarskeletonEntity)entity;
                            _datEntSetI4.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                        }
                    }
                } else if (entity.m_20186_() < -63.0) {
                    entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                }
            } else if (entity.m_20186_() < -63.0) {
                entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
            }
        }
        if (entity instanceof StarskeletonEntity) {
            _datEntI2 = (StarskeletonEntity)entity;
            n4 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 1) {
            int n17;
            int n18;
            int n19;
            Vec3 _center2;
            int n20;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof StarskeletonEntity) {
                ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.backflip");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity23;
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity23 = _mobEnt2.m_5448_();
                } else {
                    livingEntity23 = null;
                }
                f = entity.m_20270_(livingEntity23);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity24;
                LivingEntity livingEntity25;
                LivingEntity livingEntity26;
                LivingEntity livingEntity27;
                LivingEntity livingEntity28;
                LivingEntity livingEntity29;
                LivingEntity livingEntity30;
                LivingEntity livingEntity31;
                LivingEntity livingEntity32;
                if (entity instanceof Mob) {
                    Mob _mobEnt52 = (Mob)entity;
                    v64 = _mobEnt52.m_5448_();
                } else {
                    v64 = _ent = null;
                }
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity32 = _mobEnt6.m_5448_();
                } else {
                    livingEntity32 = null;
                }
                double d = livingEntity32.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity31 = _mobEnt6.m_5448_();
                } else {
                    livingEntity31 = null;
                }
                int n21 = (int)livingEntity31.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity30 = _mobEnt6.m_5448_();
                } else {
                    livingEntity30 = null;
                }
                double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n21, (int)livingEntity30.m_20189_());
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity29 = _mobEnt6.m_5448_();
                } else {
                    livingEntity29 = null;
                }
                _ent.m_6021_(d, d8, livingEntity29.m_20189_());
                if (_ent instanceof ServerPlayer) {
                    LivingEntity livingEntity33;
                    LivingEntity livingEntity34;
                    LivingEntity livingEntity35;
                    LivingEntity livingEntity36;
                    _serverPlayer = (ServerPlayer)_ent;
                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity36 = mob.m_5448_();
                    } else {
                        livingEntity36 = null;
                    }
                    double d9 = livingEntity36.m_20185_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt11 = (Mob)entity;
                        livingEntity35 = _mobEnt11.m_5448_();
                    } else {
                        livingEntity35 = null;
                    }
                    int n22 = (int)livingEntity35.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity34 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity34 = null;
                    }
                    double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n22, (int)livingEntity34.m_20189_());
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity33 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity33 = null;
                    }
                    serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity33.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                }
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity28 = _mobEnt.m_5448_();
                } else {
                    livingEntity28 = null;
                }
                livingEntity28.m_20256_(new Vec3(0.0, 0.0, 0.0));
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity27 = _mobEnt.m_5448_();
                } else {
                    livingEntity27 = null;
                }
                double d11 = livingEntity27.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity26 = _mobEnt6.m_5448_();
                } else {
                    livingEntity26 = null;
                }
                double d12 = livingEntity26.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity25 = _mobEnt.m_5448_();
                } else {
                    livingEntity25 = null;
                }
                double d13 = d12 + (double)livingEntity25.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity24 = _mobEnt.m_5448_();
                } else {
                    livingEntity24 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d11, d13, livingEntity24.m_20189_()));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n20 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n20 = 0;
            }
            if (n20 == 19) {
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
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entity4 : _entfound2) {
                    float f9;
                    if (entity4 instanceof StarskeletonEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entity4;
                        f9 = _livEnt7.m_21233_();
                    } else {
                        f9 = -1.0f;
                    }
                    entity4.m_6469_(damageSource, f9 / 4.0f + 10.0f);
                }
                if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
                for (int index3 = 0; index3 < 200; ++index3) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
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
                    _entityToSpawn.m_6686_(_shootFrom.m_20154_().f_82479_, _shootFrom.m_20154_().f_82480_, _shootFrom.m_20154_().f_82481_, 3.0f, 0.0f);
                    projectileLevel.m_7967_((Entity)_entityToSpawn);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n19 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n19 = 0;
            }
            if (n19 == 36) {
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
                _center2 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entity5 : _entfound2) {
                    float f10;
                    if (entity5 instanceof StarskeletonEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity5 instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entity5;
                        f10 = _livEnt8.m_21233_();
                    } else {
                        f10 = -1.0f;
                    }
                    entity5.m_6469_(damageSource, f10 / 4.0f + 10.0f);
                    if (entity5 instanceof Player || !(entity5 instanceof LivingEntity)) continue;
                    LivingEntity _entity3 = (LivingEntity)entity5;
                    _entity3.m_21153_(0.0f);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n18 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n18 = 0;
            }
            if (n18 == 52 && entity instanceof StarskeletonEntity) {
                int n23;
                _datEntSetI = (StarskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarskeletonEntity) {
                    _datEntI = (StarskeletonEntity)entity;
                    n23 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                } else {
                    n23 = 0;
                }
                synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n23 + 1));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n17 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n17 = 0;
            }
            if (n17 >= 52) {
                if (entity instanceof StarskeletonEntity) {
                    _datEntSetI = (StarskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    _datEntSetI = (StarskeletonEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    ((StarskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarskeletonEntity) {
            _datEntI2 = (StarskeletonEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 3) {
            int n24;
            int n25;
            int n26;
            int n27;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof StarskeletonEntity) {
                ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.laser");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity37;
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity37 = _mobEnt2.m_5448_();
                } else {
                    livingEntity37 = null;
                }
                f = entity.m_20270_(livingEntity37);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity38;
                LivingEntity livingEntity39;
                LivingEntity livingEntity40;
                LivingEntity livingEntity41;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity41 = _mobEnt.m_5448_();
                } else {
                    livingEntity41 = null;
                }
                double d = livingEntity41.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity40 = _mobEnt6.m_5448_();
                } else {
                    livingEntity40 = null;
                }
                double d14 = livingEntity40.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity39 = _mobEnt.m_5448_();
                } else {
                    livingEntity39 = null;
                }
                double d15 = d14 + (double)livingEntity39.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity38 = _mobEnt.m_5448_();
                } else {
                    livingEntity38 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d15, livingEntity38.m_20189_()));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n27 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 == 26) {
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
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n26 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n26 = 0;
            }
            if (n26 >= 26) {
                int n28;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI7 = (StarskeletonEntity)entity;
                    n28 = (Integer)_datEntI7.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n28 = 0;
                }
                if (n28 <= 42) {
                    _center = new Vec3(x + entity.m_20154_().f_82479_ * 24.0, y, z + entity.m_20154_().f_82481_ * 24.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f11;
                        if (entityiterator instanceof StarskeletonEntity) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f11 = _livEnt.m_21233_();
                        } else {
                            f11 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f11 / 4.0f + 10.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n25 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n25 = 0;
            }
            if (n25 == 57 && entity instanceof StarskeletonEntity) {
                int n29;
                StarskeletonEntity _datEntSetI5 = (StarskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI5.m_20088_();
                if (entity instanceof StarskeletonEntity) {
                    _datEntI = (StarskeletonEntity)entity;
                    n29 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                } else {
                    n29 = 0;
                }
                synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n29 + 2));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n24 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n24 = 0;
            }
            if (n24 >= 57) {
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetI6 = (StarskeletonEntity)entity;
                    _datEntSetI6.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetI7 = (StarskeletonEntity)entity;
                    _datEntSetI7.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    ((StarskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarskeletonEntity) {
            _datEntI2 = (StarskeletonEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 4) {
            int n30;
            int n31;
            int n32;
            int n33;
            int n34;
            int n35;
            int n36;
            int n37;
            int n38;
            int n39;
            int n40;
            int n41;
            int n42;
            int n43;
            int n44;
            int n45;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof StarskeletonEntity) {
                ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.front");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity42;
                if (entity instanceof Mob) {
                    Mob _mobEnt12 = (Mob)entity;
                    livingEntity42 = _mobEnt12.m_5448_();
                } else {
                    livingEntity42 = null;
                }
                f = entity.m_20270_(livingEntity42);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity43;
                LivingEntity livingEntity44;
                LivingEntity livingEntity45;
                LivingEntity livingEntity46;
                LivingEntity livingEntity47;
                LivingEntity livingEntity48;
                LivingEntity livingEntity49;
                LivingEntity livingEntity50;
                LivingEntity livingEntity51;
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    v122 = _mobEnt6.m_5448_();
                } else {
                    v122 = _ent = null;
                }
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity51 = _mobEnt6.m_5448_();
                } else {
                    livingEntity51 = null;
                }
                double d = livingEntity51.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity50 = _mobEnt6.m_5448_();
                } else {
                    livingEntity50 = null;
                }
                int n46 = (int)livingEntity50.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity49 = _mobEnt6.m_5448_();
                } else {
                    livingEntity49 = null;
                }
                double d16 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n46, (int)livingEntity49.m_20189_());
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity48 = _mobEnt6.m_5448_();
                } else {
                    livingEntity48 = null;
                }
                _ent.m_6021_(d, d16, livingEntity48.m_20189_());
                if (_ent instanceof ServerPlayer) {
                    LivingEntity livingEntity52;
                    LivingEntity livingEntity53;
                    LivingEntity livingEntity54;
                    LivingEntity livingEntity55;
                    _serverPlayer = (ServerPlayer)_ent;
                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity55 = mob.m_5448_();
                    } else {
                        livingEntity55 = null;
                    }
                    double d17 = livingEntity55.m_20185_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt13 = (Mob)entity;
                        livingEntity54 = _mobEnt13.m_5448_();
                    } else {
                        livingEntity54 = null;
                    }
                    int n47 = (int)livingEntity54.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity53 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity53 = null;
                    }
                    double d18 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n47, (int)livingEntity53.m_20189_());
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity52 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity52 = null;
                    }
                    serverGamePacketListenerImpl.m_9774_(d17, d18, livingEntity52.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                }
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity47 = _mobEnt.m_5448_();
                } else {
                    livingEntity47 = null;
                }
                livingEntity47.m_20256_(new Vec3(0.0, 0.0, 0.0));
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity46 = _mobEnt.m_5448_();
                } else {
                    livingEntity46 = null;
                }
                double d19 = livingEntity46.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity45 = _mobEnt6.m_5448_();
                } else {
                    livingEntity45 = null;
                }
                double d20 = livingEntity45.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity44 = _mobEnt.m_5448_();
                } else {
                    livingEntity44 = null;
                }
                double d21 = d20 + (double)livingEntity44.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity43 = _mobEnt.m_5448_();
                } else {
                    livingEntity43 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d19, d21, livingEntity43.m_20189_()));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n45 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n45 = 0;
            }
            if (n45 == 17 && world instanceof Level) {
                Level _level5 = (Level)world;
                if (!_level5.m_5776_()) {
                    _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n44 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n44 = 0;
            }
            if (n44 == 22) {
                if (world instanceof Level) {
                    Level _level6 = (Level)world;
                    if (!_level6.m_5776_()) {
                        _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center4 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                for (Entity entity6 : _entfound2) {
                    float f12;
                    if (entity6 instanceof StarskeletonEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity6 instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entity6;
                        f12 = _livEnt9.m_21233_();
                    } else {
                        f12 = -1.0f;
                    }
                    entity6.m_6469_(damageSource, f12 / 4.0f + 0.0f);
                    if (entity6 instanceof Player) continue;
                    entity6.f_19802_ = 0;
                }
                for (int index5 = 0; index5 < 400; ++index5) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)1.0, (double)4.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), x + entity.m_20154_().f_82479_ * Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), z + entity.m_20154_().f_82481_ * Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0));
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n43 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n43 = 0;
            }
            if (n43 == 47 && world instanceof Level) {
                Level _level7 = (Level)world;
                if (!_level7.m_5776_()) {
                    _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n42 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n42 = 0;
            }
            if (n42 >= 52) {
                int n48;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI8 = (StarskeletonEntity)entity;
                    n48 = (Integer)_datEntI8.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n48 = 0;
                }
                if (n48 <= 66) {
                    _center = new Vec3(x + entity.m_20154_().f_82479_ * 16.0, y, z + entity.m_20154_().f_82481_ * 16.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(25.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f13;
                        if (entityiterator instanceof StarskeletonEntity || entityiterator instanceof GalaxyEntity || entityiterator instanceof Player) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f13 = _livEnt.m_21233_();
                        } else {
                            f13 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f13 / 4.0f + 1000.0f);
                        CompoundTag nbt = entityiterator.m_20240_(new CompoundTag());
                        nbt.m_128350_("Health", 0.0f);
                        nbt.m_128405_("Health", 0);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n41 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 == 52) {
                if (world instanceof Level) {
                    Level _level8 = (Level)world;
                    if (!_level8.m_5776_()) {
                        _level8.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level8.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level9 = (ServerLevel)world;
                    Entity entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.GALAXY.get()).m_262496_(_level9, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 8.0), (double)(y + 0.2), (double)(z + entity.m_20154_().f_82481_ * 8.0)), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn2 != null) {
                        entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n40 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 >= 52) {
                int n49;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI9 = (StarskeletonEntity)entity;
                    n49 = (Integer)_datEntI9.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n49 = 0;
                }
                if (n49 <= 62) {
                    for (int index6 = 0; index6 < 200; ++index6) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 8.0, y + 0.2, z + entity.m_20154_().f_82481_ * 8.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)2.0, (double)5.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5));
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n39 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 == 53) {
                if (world instanceof Level) {
                    Level _level10 = (Level)world;
                    if (!_level10.m_5776_()) {
                        _level10.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level10.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level11 = (ServerLevel)world;
                    Entity entityToSpawn3 = ((EntityType)UltimateskeletonsModEntities.GALAXY.get()).m_262496_(_level11, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 16.0), (double)(y + 0.1), (double)(z + entity.m_20154_().f_82481_ * 16.0)), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn3 != null) {
                        entityToSpawn3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n38 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n38 = 0;
            }
            if (n38 >= 53) {
                int n50;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI10 = (StarskeletonEntity)entity;
                    n50 = (Integer)_datEntI10.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n50 = 0;
                }
                if (n50 <= 63) {
                    for (int index7 = 0; index7 < 200; ++index7) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 16.0, y + 0.1, z + entity.m_20154_().f_82481_ * 16.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)2.0, (double)5.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5));
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n37 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n37 = 0;
            }
            if (n37 == 54) {
                if (world instanceof Level) {
                    Level _level12 = (Level)world;
                    if (!_level12.m_5776_()) {
                        _level12.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level12.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level13 = (ServerLevel)world;
                    Entity entityToSpawn4 = ((EntityType)UltimateskeletonsModEntities.GALAXY.get()).m_262496_(_level13, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 24.0), (double)(y + 0.2), (double)(z + entity.m_20154_().f_82481_ * 24.0)), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn4 != null) {
                        entityToSpawn4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n36 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n36 = 0;
            }
            if (n36 >= 54) {
                int n51;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI11 = (StarskeletonEntity)entity;
                    n51 = (Integer)_datEntI11.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n51 = 0;
                }
                if (n51 <= 64) {
                    for (int index8 = 0; index8 < 200; ++index8) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 24.0, y + 0.2, z + entity.m_20154_().f_82481_ * 24.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)2.0, (double)5.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5));
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n35 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 == 55) {
                if (world instanceof Level) {
                    Level _level14 = (Level)world;
                    if (!_level14.m_5776_()) {
                        _level14.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level14.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level15 = (ServerLevel)world;
                    Entity entityToSpawn5 = ((EntityType)UltimateskeletonsModEntities.GALAXY.get()).m_262496_(_level15, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 32.0), (double)(y + 0.1), (double)(z + entity.m_20154_().f_82481_ * 32.0)), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn5 != null) {
                        entityToSpawn5.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n34 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 >= 55) {
                int n52;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI12 = (StarskeletonEntity)entity;
                    n52 = (Integer)_datEntI12.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n52 = 0;
                }
                if (n52 <= 65) {
                    for (int index9 = 0; index9 < 200; ++index9) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 32.0, y + 0.1, z + entity.m_20154_().f_82481_ * 32.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)2.0, (double)5.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5));
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n33 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n33 = 0;
            }
            if (n33 == 56) {
                if (world instanceof Level) {
                    Level _level16 = (Level)world;
                    if (!_level16.m_5776_()) {
                        _level16.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level16.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level17 = (ServerLevel)world;
                    Entity entityToSpawn6 = ((EntityType)UltimateskeletonsModEntities.GALAXY.get()).m_262496_(_level17, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 40.0), (double)(y + 0.2), (double)(z + entity.m_20154_().f_82481_ * 40.0)), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn6 != null) {
                        entityToSpawn6.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n32 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 >= 56) {
                int n53;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI13 = (StarskeletonEntity)entity;
                    n53 = (Integer)_datEntI13.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n53 = 0;
                }
                if (n53 <= 66) {
                    for (int index10 = 0; index10 < 200; ++index10) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 40.0, y + 0.2, z + entity.m_20154_().f_82481_ * 40.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)2.0, (double)5.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5));
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n31 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 == 67 && entity instanceof StarskeletonEntity) {
                int n54;
                StarskeletonEntity _datEntSetI8 = (StarskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI8.m_20088_();
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI14 = (StarskeletonEntity)entity;
                    n54 = (Integer)_datEntI14.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                } else {
                    n54 = 0;
                }
                synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n54 + 3));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n30 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 >= 67) {
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetI9 = (StarskeletonEntity)entity;
                    _datEntSetI9.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetI10 = (StarskeletonEntity)entity;
                    _datEntSetI10.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    ((StarskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarskeletonEntity) {
            _datEntI2 = (StarskeletonEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 2) {
            int n55;
            int n56;
            int n57;
            int n58;
            int n59;
            int n60;
            int n61;
            int n62;
            int n63;
            int n64;
            int n65;
            int n66;
            int n67;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof StarskeletonEntity) {
                ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.lightningsmash");
            }
            if (entity instanceof Mob) {
                _mobEnt3 = (Mob)entity;
                livingEntity = _mobEnt3.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity56;
                if (entity instanceof Mob) {
                    Mob _mobEnt14 = (Mob)entity;
                    livingEntity56 = _mobEnt14.m_5448_();
                } else {
                    livingEntity56 = null;
                }
                f = entity.m_20270_(livingEntity56);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity57;
                LivingEntity livingEntity58;
                LivingEntity livingEntity59;
                LivingEntity livingEntity60;
                Mob _mobEnt7;
                LivingEntity livingEntity61;
                LivingEntity livingEntity62;
                LivingEntity livingEntity63;
                LivingEntity livingEntity64;
                LivingEntity livingEntity65;
                LivingEntity _ent2;
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    v178 = _mobEnt6.m_5448_();
                } else {
                    v178 = _ent2 = null;
                }
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity65 = _mobEnt6.m_5448_();
                } else {
                    livingEntity65 = null;
                }
                double d = livingEntity65.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity64 = _mobEnt6.m_5448_();
                } else {
                    livingEntity64 = null;
                }
                int n68 = (int)livingEntity64.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity63 = _mobEnt6.m_5448_();
                } else {
                    livingEntity63 = null;
                }
                double d22 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n68, (int)livingEntity63.m_20189_());
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity62 = _mobEnt6.m_5448_();
                } else {
                    livingEntity62 = null;
                }
                _ent2.m_6021_(d, d22, livingEntity62.m_20189_());
                if (_ent2 instanceof ServerPlayer) {
                    LivingEntity livingEntity66;
                    LivingEntity livingEntity67;
                    LivingEntity livingEntity68;
                    LivingEntity livingEntity69;
                    _serverPlayer = (ServerPlayer)_ent2;
                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity69 = mob.m_5448_();
                    } else {
                        livingEntity69 = null;
                    }
                    double d23 = livingEntity69.m_20185_();
                    if (entity instanceof Mob) {
                        Mob _mobEnt16 = (Mob)entity;
                        livingEntity68 = _mobEnt16.m_5448_();
                    } else {
                        livingEntity68 = null;
                    }
                    int n69 = (int)livingEntity68.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt4 = (Mob)entity;
                        livingEntity67 = _mobEnt4.m_5448_();
                    } else {
                        livingEntity67 = null;
                    }
                    double d24 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n69, (int)livingEntity67.m_20189_());
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity66 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    serverGamePacketListenerImpl.m_9774_(d23, d24, livingEntity66.m_20189_(), _ent2.m_146908_(), _ent2.m_146909_());
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt15 = (Mob)entity;
                    livingEntity61 = _mobEnt15.m_5448_();
                } else {
                    livingEntity61 = null;
                }
                livingEntity61.m_20256_(new Vec3(0.0, 0.0, 0.0));
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity60 = _mobEnt7.m_5448_();
                } else {
                    livingEntity60 = null;
                }
                double d25 = livingEntity60.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity59 = _mobEnt6.m_5448_();
                } else {
                    livingEntity59 = null;
                }
                double d26 = livingEntity59.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity58 = _mobEnt7.m_5448_();
                } else {
                    livingEntity58 = null;
                }
                double d27 = d26 + (double)livingEntity58.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity57 = _mobEnt7.m_5448_();
                } else {
                    livingEntity57 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d25, d27, livingEntity57.m_20189_()));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n67 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 == 40) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                if (world instanceof Level) {
                    Level _level18 = (Level)world;
                    if (!_level18.m_5776_()) {
                        _level18.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level18.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                    ServerLevel _level19 = (ServerLevel)world;
                    _level19.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level19, 4, "", (Component)Component.m_237113_((String)""), _level19.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n66 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n66 = 0;
            }
            if (n66 >= 42) {
                int n70;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI15 = (StarskeletonEntity)entity;
                    n70 = (Integer)_datEntI15.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n70 = 0;
                }
                if (n70 <= 60) {
                    for (int index11 = 0; index11 < 2; ++index11) {
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel _level20 = (ServerLevel)world;
                        Entity entity7 = ((EntityType)UltimateskeletonsModEntities.GALAXY.get()).m_262496_(_level20, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)(y + 0.1), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                        if (entity7 == null) continue;
                        entity7.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n65 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n65 = 0;
            }
            if (n65 >= 75) {
                int n71;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI16 = (StarskeletonEntity)entity;
                    n71 = (Integer)_datEntI16.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n71 = 0;
                }
                if (n71 <= 85) {
                    for (int index12 = 0; index12 < 32; ++index12) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SUN.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64), y + 0.1, z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64), 0.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3), 0.0);
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n64 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n64 = 0;
            }
            if (n64 == 118) {
                if (world instanceof Level) {
                    Level _level21 = (Level)world;
                    if (!_level21.m_5776_()) {
                        _level21.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level21.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center5 = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                for (Entity entity8 : _entfound3) {
                    float f14;
                    if (entity8 instanceof StarskeletonEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt10 = (LivingEntity)entity8;
                        f14 = _livEnt10.m_21233_();
                    } else {
                        f14 = -1.0f;
                    }
                    entity8.m_6469_(damageSource, f14 / 4.0f + 0.0f);
                }
                for (int index13 = 0; index13 < 200; ++index13) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.5, (double)1.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                }
                for (int index14 = 0; index14 < 400; ++index14) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                }
                for (int index15 = 0; index15 < 32; ++index15) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level22 = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level22);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                        entityToSpawn.m_20874_(true);
                        _level22.m_7967_((Entity)entityToSpawn);
                    }
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level2 = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_(_level2, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)(y + 0.1), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n63 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n63 = 0;
            }
            if (n63 <= 149) {
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n62 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n62 = 0;
            }
            if (n62 >= 149) {
                int n72;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI17 = (StarskeletonEntity)entity;
                    n72 = (Integer)_datEntI17.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n72 = 0;
                }
                if (n72 <= 164) {
                    int n73;
                    if (entity instanceof StarskeletonEntity) {
                        StarskeletonEntity _datEntI18 = (StarskeletonEntity)entity;
                        n73 = (Integer)_datEntI18.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                    } else {
                        n73 = 0;
                    }
                    entity.m_20256_(new Vec3(0.0, (double)(2 + 6 / (-148 + n73)), 0.0));
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n61 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n61 = 0;
            }
            if (n61 >= 165) {
                int n74;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI19 = (StarskeletonEntity)entity;
                    n74 = (Integer)_datEntI19.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n74 = 0;
                }
                if (n74 <= 181) {
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n60 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n60 = 0;
            }
            if (n60 == 182 && world instanceof Level) {
                Level _level23 = (Level)world;
                if (!_level23.m_5776_()) {
                    _level23.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level23.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n59 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n59 = 0;
            }
            if (n59 >= 182) {
                int n75;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI20 = (StarskeletonEntity)entity;
                    n75 = (Integer)_datEntI20.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n75 = 0;
                }
                if (n75 <= 188) {
                    float f15;
                    LivingEntity livingEntity70;
                    if (entity instanceof Mob) {
                        Mob _mobEnt17 = (Mob)entity;
                        livingEntity70 = _mobEnt17.m_5448_();
                    } else {
                        livingEntity70 = null;
                    }
                    if (livingEntity70 != null) {
                        LivingEntity livingEntity71;
                        if (entity instanceof Mob) {
                            _mobEnt6 = (Mob)entity;
                            livingEntity71 = _mobEnt6.m_5448_();
                        } else {
                            livingEntity71 = null;
                        }
                        f15 = entity.m_20270_(livingEntity71);
                    } else {
                        f15 = -1.0f;
                    }
                    if (f15 > 1.0f) {
                        int n76;
                        LivingEntity livingEntity72;
                        int n77;
                        LivingEntity livingEntity73;
                        int n78;
                        LivingEntity livingEntity74;
                        if (entity instanceof Mob) {
                            Mob _mobEnt18 = (Mob)entity;
                            livingEntity74 = _mobEnt18.m_5448_();
                        } else {
                            livingEntity74 = null;
                        }
                        double d = livingEntity74.m_20185_() - entity.m_20185_();
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                            n78 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n78 = 0;
                        }
                        double d28 = d / (188.5 - (double)n78);
                        if (entity instanceof Mob) {
                            Mob _mobEnt19 = (Mob)entity;
                            livingEntity73 = _mobEnt19.m_5448_();
                        } else {
                            livingEntity73 = null;
                        }
                        double d29 = livingEntity73.m_20186_() - entity.m_20186_();
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                            n77 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n77 = 0;
                        }
                        double d30 = d29 / (188.5 - (double)n77);
                        if (entity instanceof Mob) {
                            Mob _mobEnt20 = (Mob)entity;
                            livingEntity72 = _mobEnt20.m_5448_();
                        } else {
                            livingEntity72 = null;
                        }
                        double d31 = livingEntity72.m_20189_() - entity.m_20189_();
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                            n76 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n76 = 0;
                        }
                        entity.m_20256_(new Vec3(d28, d30, d31 / (188.5 - (double)n76)));
                    } else {
                        int n79;
                        double d = entity.m_20154_().f_82479_;
                        double d32 = (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) - entity.m_20186_();
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                            n79 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n79 = 0;
                        }
                        entity.m_20256_(new Vec3(d, d32 / (188.5 - (double)n79), entity.m_20154_().f_82481_));
                    }
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n58 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n58 = 0;
            }
            if (n58 >= 189) {
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n57 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n57 = 0;
            }
            if (n57 == 190) {
                LivingEntity _entity4;
                if (entity instanceof LivingEntity && !(_entity4 = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity4.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    Level _level24 = (Level)world;
                    if (!_level24.m_5776_()) {
                        _level24.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level24.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level25 = (Level)world;
                    if (!_level25.m_5776_()) {
                        _level25.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level25.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 6.0, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z + entity.m_20154_().f_82481_ * 6.0, 0.0, 0.0, 0.0);
                for (int index16 = 0; index16 < 24; ++index16) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level26 = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.RAINBOWLIGHTNING.get()).m_262496_(_level26, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center6 = new Vec3(x, y, z);
                List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                for (Entity entity9 : _entfound4) {
                    float f16;
                    if (entity9 instanceof StarskeletonEntity) continue;
                    double _setval = 5.0;
                    entity9.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entity9);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entity9;
                        f16 = _livEnt11.m_21233_();
                    } else {
                        f16 = -1.0f;
                    }
                    entity9.m_6469_(damageSource, f16 / 4.0f + 1000.0f);
                    if (entity9 instanceof Player || entity9 instanceof LightningBolt || entity9 instanceof OriginallightningEntity) continue;
                    entity9.m_142687_(Entity.RemovalReason.KILLED);
                }
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n56 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 == 205 && entity instanceof StarskeletonEntity) {
                int n80;
                StarskeletonEntity _datEntSetI11 = (StarskeletonEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI11.m_20088_();
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI21 = (StarskeletonEntity)entity;
                    n80 = (Integer)_datEntI21.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                } else {
                    n80 = 0;
                }
                synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n80 + 5));
            }
            if (entity instanceof StarskeletonEntity) {
                _datEntI3 = (StarskeletonEntity)entity;
                n55 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 >= 205) {
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetI12 = (StarskeletonEntity)entity;
                    _datEntSetI12.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntSetI13 = (StarskeletonEntity)entity;
                    _datEntSetI13.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonEntity) {
                    ((StarskeletonEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

