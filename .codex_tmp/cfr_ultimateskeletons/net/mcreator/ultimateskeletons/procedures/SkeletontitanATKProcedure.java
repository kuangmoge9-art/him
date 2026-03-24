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
import net.mcreator.ultimateskeletons.entity.GiantharrowEntity;
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.entity.SkeletonharrawEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
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
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class SkeletontitanATKProcedure {
    /*
     * WARNING - void declaration
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        SkeletontitanEntity _datEntI;
        LivingEntity _livEnt;
        int n7;
        LivingEntity _livEnt2;
        List<Entity> _entfound;
        Object _mobEnt;
        SkeletontitanEntity _datEntI2;
        Mob _mobEnt2;
        Mob _mobEnt3;
        Object _mobEnt4;
        Mob _mobEnt5;
        Vec3 _center;
        SkeletontitanEntity _datEntI3;
        SkeletontitanEntity _datEntI4;
        block920: {
            int n8;
            block922: {
                block921: {
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    float f;
                    SkeletontitanEntity _datEntI5;
                    LivingEntity _entity;
                    block917: {
                        LivingEntity livingEntity;
                        LivingEntity _mobEnt52;
                        block918: {
                            block919: {
                                LivingEntity livingEntity2;
                                float f2;
                                LivingEntity livingEntity3;
                                LivingEntity livingEntity4;
                                int n13;
                                int n14;
                                int n15;
                                float f3;
                                block915: {
                                    block916: {
                                        int n16;
                                        int n17;
                                        int n18;
                                        int n19;
                                        int n20;
                                        int n21;
                                        int n22;
                                        int n23;
                                        int n24;
                                        int n25;
                                        int n26;
                                        Entity entityToSpawn;
                                        ServerLevel _level;
                                        block914: {
                                            int n27;
                                            int n28;
                                            int n29;
                                            int n30;
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
                                            if (entity instanceof SkeletontitanEntity) {
                                                int n31;
                                                SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                if (entity instanceof SkeletontitanEntity) {
                                                    SkeletontitanEntity _datEntI42 = (SkeletontitanEntity)entity;
                                                    n31 = (Integer)_datEntI42.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                                } else {
                                                    n31 = 0;
                                                }
                                                synchedEntityData.m_135381_(SkeletontitanEntity.DATA_spawnTick, (Object)(n31 + 1));
                                            }
                                            if (!entity.m_5446_().getString().equals("growing")) break block914;
                                            if (entity instanceof SkeletontitanEntity) {
                                                SkeletontitanEntity _datEntI32 = (SkeletontitanEntity)entity;
                                                n30 = (Integer)_datEntI32.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n30 = 0;
                                            }
                                            if (n30 >= 720) break block915;
                                            entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                            entity.f_19802_ = 20;
                                            if (entity instanceof LivingEntity) {
                                                ((LivingEntity)entity).f_20919_ = 0;
                                            }
                                            ((SkeletontitanEntity)entity).setHEALTS(20000.0);
                                            if (entity instanceof Mob) {
                                                _entity = (Mob)entity;
                                                _entity.m_6710_(null);
                                            }
                                            if (entity instanceof SkeletontitanEntity) {
                                                _datEntI4 = (SkeletontitanEntity)entity;
                                                n29 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n29 = 0;
                                            }
                                            if (n29 == 450 && world instanceof ServerLevel) {
                                                _level = (ServerLevel)world;
                                                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                                if (entityToSpawn != null) {
                                                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                }
                                            }
                                            if (entity instanceof SkeletontitanEntity) {
                                                _datEntI4 = (SkeletontitanEntity)entity;
                                                n28 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n28 = 0;
                                            }
                                            if (n28 <= 10 && entity instanceof SkeletontitanEntity) {
                                                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.spawn2");
                                            }
                                            if (entity instanceof SkeletontitanEntity) {
                                                _datEntI4 = (SkeletontitanEntity)entity;
                                                n27 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n27 = 0;
                                            }
                                            if (n27 == 719) {
                                                if (world instanceof Level) {
                                                    _level = (Level)world;
                                                    if (!_level.m_5776_()) {
                                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                    } else {
                                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                    }
                                                }
                                                if (!world.m_5776_() && world.m_7654_() != null) {
                                                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Skeletontitan has been created!!!"), false);
                                                }
                                            }
                                            if (entity.m_20096_()) break block915;
                                            if (entity.m_20186_() < -63.0) {
                                                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                            } else {
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                            break block915;
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI3 = (SkeletontitanEntity)entity;
                                            n26 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n26 = 0;
                                        }
                                        if (n26 >= 510) break block915;
                                        entity.m_6593_((Component)Component.m_237113_((String)"Skeletontitan"));
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
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n25 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n25 = 0;
                                        }
                                        if (n25 == 1 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n24 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n24 = 0;
                                        }
                                        if (n24 == 240 && world instanceof ServerLevel) {
                                            _level = (ServerLevel)world;
                                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                            if (entityToSpawn != null) {
                                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                            }
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n23 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n23 = 0;
                                        }
                                        if (n23 <= 10 && entity instanceof SkeletontitanEntity) {
                                            ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.spawn1");
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n22 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n22 = 0;
                                        }
                                        if (n22 == 42) {
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanbeginmove")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanbeginmove")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                }
                                            }
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                }
                                            }
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n21 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n21 = 0;
                                        }
                                        if (n21 == 120) {
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                                }
                                            }
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                }
                                            }
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n20 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n20 = 0;
                                        }
                                        if (n20 == 310 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n19 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 == 509 && !world.m_5776_() && world.m_7654_() != null) {
                                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Skeletontitan awake!!!"), false);
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI4 = (SkeletontitanEntity)entity;
                                            n18 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 == 120) break block916;
                                        if (entity instanceof SkeletontitanEntity) {
                                            SkeletontitanEntity _datEntI6 = (SkeletontitanEntity)entity;
                                            n17 = (Integer)_datEntI6.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n17 = 0;
                                        }
                                        if (n17 == 366) break block916;
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntI5 = (SkeletontitanEntity)entity;
                                            n16 = (Integer)_datEntI5.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n16 = 0;
                                        }
                                        if (n16 != 402) break block915;
                                    }
                                    _center = new Vec3(x, y, z);
                                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    for (Entity entityiterator : list) {
                                        if (entityiterator instanceof SkeletontitanEntity || entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity) continue;
                                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                                        double _setval = 5.0;
                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                            capability.camerashake = _setval;
                                            capability.syncPlayerVariables(entityiterator);
                                        });
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n32;
                                    if (entity instanceof SkeletontitanEntity) {
                                        _datEntI3 = (SkeletontitanEntity)entity;
                                        n32 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
                                    } else {
                                        n32 = 0;
                                    }
                                    if (n32 != 0) {
                                        float f4;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)entity;
                                            f4 = _livEnt5.m_21223_();
                                        } else {
                                            f4 = -1.0f;
                                        }
                                        if (f4 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof SkeletontitanEntity)) continue;
                                                ((SkeletontitanEntity)entity).setAnimation("empty");
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
                                if (f3 > 0.0f && entity instanceof SkeletontitanEntity) {
                                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof SkeletontitanEntity) {
                                    _datEntI3 = (SkeletontitanEntity)entity;
                                    n15 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_spawnTick);
                                } else {
                                    n15 = 0;
                                }
                                if (n15 < 510) break block917;
                                if (entity instanceof SkeletontitanEntity) {
                                    _datEntI4 = (SkeletontitanEntity)entity;
                                    n14 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 == 0) {
                                    int n33;
                                    if (entity instanceof SkeletontitanEntity) {
                                        SkeletontitanEntity _datEntI7 = (SkeletontitanEntity)entity;
                                        n33 = (Integer)_datEntI7.m_20088_().m_135370_(SkeletontitanEntity.DATA_flyID);
                                    } else {
                                        n33 = 0;
                                    }
                                    if (n33 != 0) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                    }
                                }
                                if (world.m_5776_()) break block917;
                                if (entity instanceof SkeletontitanEntity) {
                                    _datEntI4 = (SkeletontitanEntity)entity;
                                    n13 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 != 0 && entity instanceof SkeletontitanEntity) {
                                    int n34;
                                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof SkeletontitanEntity) {
                                        SkeletontitanEntity _datEntI52 = (SkeletontitanEntity)entity;
                                        n34 = (Integer)_datEntI52.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                                    } else {
                                        n34 = 0;
                                    }
                                    synchedEntityData.m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)(n34 + 1));
                                }
                                if (entity instanceof Mob) {
                                    Mob _mobEnt6 = (Mob)entity;
                                    livingEntity4 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity4 = null;
                                }
                                if (livingEntity4 == null) break block918;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt7 = (Mob)entity;
                                    v27 = _mobEnt7.m_5448_();
                                } else {
                                    v27 = livingEntity3 = null;
                                }
                                if (livingEntity3 instanceof LivingEntity) {
                                    LivingEntity _livEnt4 = livingEntity3;
                                    f2 = _livEnt4.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) break block919;
                                if (entity instanceof Mob) {
                                    _mobEnt52 = (Mob)entity;
                                    livingEntity2 = _mobEnt52.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block918;
                            }
                            if (entity instanceof SkeletontitanEntity) {
                                SkeletontitanEntity skeletontitanEntity = (SkeletontitanEntity)entity;
                                skeletontitanEntity.m_20088_().m_135381_(SkeletontitanEntity.DATA_flyID, (Object)0);
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
                            if (entity instanceof Mob) {
                                Mob _mobEnt8 = (Mob)entity;
                                v31 = _mobEnt8.m_5448_();
                            } else {
                                v31 = _mobEnt52 = null;
                            }
                            if (_mobEnt52 instanceof LivingEntity) {
                                LivingEntity _livEnt3 = _mobEnt52;
                                f5 = _livEnt3.m_21223_();
                            } else {
                                f5 = -1.0f;
                            }
                            if (f5 > 0.0f) {
                                int n35;
                                if (entity instanceof SkeletontitanEntity) {
                                    SkeletontitanEntity _datEntI8 = (SkeletontitanEntity)entity;
                                    n35 = (Integer)_datEntI8.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
                                } else {
                                    n35 = 0;
                                }
                                if (n35 == 0) {
                                    float f6;
                                    LivingEntity livingEntity5;
                                    Mob _mobEnt6;
                                    Mob _mobEnt7;
                                    Mob _mobEnt8;
                                    float f7;
                                    LivingEntity livingEntity6;
                                    float f8;
                                    LivingEntity livingEntity7;
                                    float f9;
                                    LivingEntity livingEntity8;
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity8 = mob.m_5448_();
                                    } else {
                                        livingEntity8 = null;
                                    }
                                    if (livingEntity8 != null) {
                                        LivingEntity livingEntity9;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt32 = (Mob)entity;
                                            livingEntity9 = _mobEnt32.m_5448_();
                                        } else {
                                            livingEntity9 = null;
                                        }
                                        f9 = entity.m_20270_(livingEntity9);
                                    } else {
                                        f9 = -1.0f;
                                    }
                                    if (f9 >= 160.0f) {
                                        entity.m_6858_(true);
                                    } else {
                                        entity.m_6858_(false);
                                    }
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity7 = mob.m_5448_();
                                    } else {
                                        livingEntity7 = null;
                                    }
                                    if (livingEntity7 != null) {
                                        LivingEntity livingEntity10;
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity10 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity10 = null;
                                        }
                                        f8 = entity.m_20270_(livingEntity10);
                                    } else {
                                        f8 = -1.0f;
                                    }
                                    if (f8 > 4.0f) {
                                        LivingEntity livingEntity11;
                                        LivingEntity livingEntity12;
                                        LivingEntity livingEntity13;
                                        LivingEntity livingEntity14;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt22 = (Mob)entity;
                                            livingEntity14 = _mobEnt22.m_5448_();
                                        } else {
                                            livingEntity14 = null;
                                        }
                                        double d = livingEntity14.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt12 = (Mob)entity;
                                            livingEntity13 = _mobEnt12.m_5448_();
                                        } else {
                                            livingEntity13 = null;
                                        }
                                        double d2 = livingEntity13.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity12 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity12 = null;
                                        }
                                        double d3 = d2 + (double)livingEntity12.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity11 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity11 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity11.m_20189_()));
                                    }
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity6 = mob.m_5448_();
                                    } else {
                                        livingEntity6 = null;
                                    }
                                    if (livingEntity6 != null) {
                                        LivingEntity livingEntity15;
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity15 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity15 = null;
                                        }
                                        f7 = entity.m_20270_(livingEntity15);
                                    } else {
                                        f7 = -1.0f;
                                    }
                                    if (f7 > 60.0f) {
                                        float f10;
                                        LivingEntity livingEntity16;
                                        LivingEntity livingEntity17;
                                        float f11;
                                        LivingEntity livingEntity18;
                                        LivingEntity livingEntity19;
                                        float f12;
                                        LivingEntity livingEntity20;
                                        LivingEntity livingEntity21;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity21 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity21 = null;
                                        }
                                        double d = livingEntity21.m_20185_() - entity.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt13 = (Mob)entity;
                                            livingEntity20 = _mobEnt13.m_5448_();
                                        } else {
                                            livingEntity20 = null;
                                        }
                                        if (livingEntity20 != null) {
                                            LivingEntity livingEntity22;
                                            if (entity instanceof Mob) {
                                                _mobEnt3 = (Mob)entity;
                                                livingEntity22 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity22 = null;
                                            }
                                            f12 = entity.m_20270_(livingEntity22);
                                        } else {
                                            f12 = -1.0f;
                                        }
                                        double d4 = d / (double)f12 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity19 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity19 = null;
                                        }
                                        double d5 = livingEntity19.m_20186_() - entity.m_20186_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt14 = (Mob)entity;
                                            livingEntity18 = _mobEnt14.m_5448_();
                                        } else {
                                            livingEntity18 = null;
                                        }
                                        if (livingEntity18 != null) {
                                            LivingEntity livingEntity23;
                                            if (entity instanceof Mob) {
                                                _mobEnt3 = (Mob)entity;
                                                livingEntity23 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity23 = null;
                                            }
                                            f11 = entity.m_20270_(livingEntity23);
                                        } else {
                                            f11 = -1.0f;
                                        }
                                        double d6 = d5 / (double)f11 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity17 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity17 = null;
                                        }
                                        double d7 = livingEntity17.m_20189_() - entity.m_20189_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt15 = (Mob)entity;
                                            livingEntity16 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity16 = null;
                                        }
                                        if (livingEntity16 != null) {
                                            LivingEntity livingEntity24;
                                            if (entity instanceof Mob) {
                                                _mobEnt3 = (Mob)entity;
                                                livingEntity24 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity24 = null;
                                            }
                                            f10 = entity.m_20270_(livingEntity24);
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d4, d6, d7 / (double)f10 * 2.0));
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntSetI = (SkeletontitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_flyID, (Object)1);
                                        }
                                    } else {
                                        LivingEntity livingEntity25;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity25 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity25 = null;
                                        }
                                        if (livingEntity25.m_20206_() > 8.0f) {
                                            float f13;
                                            LivingEntity livingEntity26;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt16 = (Mob)entity;
                                                livingEntity26 = _mobEnt16.m_5448_();
                                            } else {
                                                livingEntity26 = null;
                                            }
                                            if (livingEntity26 != null) {
                                                LivingEntity livingEntity27;
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity27 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity27 = null;
                                                }
                                                f13 = entity.m_20270_(livingEntity27);
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (f13 > 28.0f) {
                                                float f14;
                                                LivingEntity livingEntity28;
                                                LivingEntity livingEntity29;
                                                float f15;
                                                LivingEntity livingEntity30;
                                                LivingEntity livingEntity31;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt11 = (Mob)entity;
                                                    livingEntity31 = _mobEnt11.m_5448_();
                                                } else {
                                                    livingEntity31 = null;
                                                }
                                                double d = livingEntity31.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt10 = (Mob)entity;
                                                    livingEntity30 = _mobEnt10.m_5448_();
                                                } else {
                                                    livingEntity30 = null;
                                                }
                                                if (livingEntity30 != null) {
                                                    LivingEntity livingEntity32;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt9 = (Mob)entity;
                                                        livingEntity32 = _mobEnt9.m_5448_();
                                                    } else {
                                                        livingEntity32 = null;
                                                    }
                                                    f15 = entity.m_20270_(livingEntity32);
                                                } else {
                                                    f15 = -1.0f;
                                                }
                                                double d8 = d / (double)f15;
                                                if (entity instanceof Mob) {
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity29 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity29 = null;
                                                }
                                                double d9 = livingEntity29.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity28 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity28 = null;
                                                }
                                                if (livingEntity28 != null) {
                                                    LivingEntity livingEntity33;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity33 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity33 = null;
                                                    }
                                                    f14 = entity.m_20270_(livingEntity33);
                                                } else {
                                                    f14 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f14));
                                            }
                                        } else {
                                            float f16;
                                            LivingEntity livingEntity34;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt17 = (Mob)entity;
                                                livingEntity34 = _mobEnt17.m_5448_();
                                            } else {
                                                livingEntity34 = null;
                                            }
                                            if (livingEntity34 != null) {
                                                LivingEntity livingEntity35;
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity35 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity35 = null;
                                                }
                                                f16 = entity.m_20270_(livingEntity35);
                                            } else {
                                                f16 = -1.0f;
                                            }
                                            if (f16 > 8.0f) {
                                                float f17;
                                                LivingEntity livingEntity36;
                                                LivingEntity livingEntity37;
                                                float f18;
                                                LivingEntity livingEntity38;
                                                LivingEntity livingEntity39;
                                                if (entity instanceof Mob) {
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity39 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity39 = null;
                                                }
                                                double d = livingEntity39.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity38 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity38 = null;
                                                }
                                                if (livingEntity38 != null) {
                                                    LivingEntity livingEntity40;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity40 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity40 = null;
                                                    }
                                                    f18 = entity.m_20270_(livingEntity40);
                                                } else {
                                                    f18 = -1.0f;
                                                }
                                                double d10 = d / (double)f18;
                                                if (entity instanceof Mob) {
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity37 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity37 = null;
                                                }
                                                double d11 = livingEntity37.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity36 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity36 = null;
                                                }
                                                if (livingEntity36 != null) {
                                                    LivingEntity livingEntity41;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity41 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity41 = null;
                                                    }
                                                    f17 = entity.m_20270_(livingEntity41);
                                                } else {
                                                    f17 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f17));
                                            }
                                        }
                                        if (entity instanceof SkeletontitanEntity) {
                                            _datEntSetI = (SkeletontitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_flyID, (Object)0);
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity5 = mob.m_5448_();
                                    } else {
                                        livingEntity5 = null;
                                    }
                                    if (livingEntity5 != null) {
                                        LivingEntity livingEntity42;
                                        if (entity instanceof Mob) {
                                            _mobEnt4 = (Mob)entity;
                                            livingEntity42 = _mobEnt4.m_5448_();
                                        } else {
                                            livingEntity42 = null;
                                        }
                                        f6 = entity.m_20270_(livingEntity42);
                                    } else {
                                        f6 = -1.0f;
                                    }
                                    if (f6 < 512.0f) {
                                        float f19;
                                        LivingEntity livingEntity43;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity43 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity43 = null;
                                        }
                                        if (livingEntity43 != null) {
                                            LivingEntity livingEntity44;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt18 = (Mob)entity;
                                                livingEntity44 = _mobEnt18.m_5448_();
                                            } else {
                                                livingEntity44 = null;
                                            }
                                            f19 = entity.m_20270_(livingEntity44);
                                        } else {
                                            f19 = -1.0f;
                                        }
                                        if (f19 <= 35.0f) {
                                            if (((Boolean)SkeletonsConfiguration.ALLOW.get()).booleanValue()) {
                                                LivingEntity livingEntity45;
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity45 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity45 = null;
                                                }
                                                if (livingEntity45.m_20206_() > 6.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 10) {
                                                        if (entity instanceof SkeletontitanEntity) {
                                                            _datEntSetI = (SkeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)8);
                                                        }
                                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 9) {
                                                        if (entity instanceof SkeletontitanEntity) {
                                                            _datEntSetI = (SkeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)6);
                                                        }
                                                    } else if (entity instanceof SkeletontitanEntity) {
                                                        _datEntSetI = (SkeletontitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)4);
                                                    }
                                                } else if (entity instanceof SkeletontitanEntity) {
                                                    _datEntSetI = (SkeletontitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                }
                                            } else {
                                                LivingEntity livingEntity46;
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity46 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity46 = null;
                                                }
                                                if (livingEntity46.m_20206_() > 6.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 10) {
                                                        if (entity instanceof SkeletontitanEntity) {
                                                            _datEntSetI = (SkeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)6);
                                                        }
                                                    } else if (entity instanceof SkeletontitanEntity) {
                                                        _datEntSetI = (SkeletontitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)4);
                                                    }
                                                } else if (entity instanceof SkeletontitanEntity) {
                                                    _datEntSetI = (SkeletontitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                }
                                            }
                                        }
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            int n36;
                                            if (entity instanceof SkeletontitanEntity) {
                                                _datEntI2 = (SkeletontitanEntity)entity;
                                                n36 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
                                            } else {
                                                n36 = 0;
                                            }
                                            if (n36 == 0) {
                                                float f20;
                                                LivingEntity livingEntity47;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt19 = (Mob)entity;
                                                    livingEntity47 = _mobEnt19.m_5448_();
                                                } else {
                                                    livingEntity47 = null;
                                                }
                                                if (livingEntity47 != null) {
                                                    LivingEntity livingEntity48;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity48 = _mobEnt2.m_5448_();
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
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity49 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity49 = null;
                                                    }
                                                    if (livingEntity49.m_20206_() > 6.0f) {
                                                        if (entity instanceof SkeletontitanEntity) {
                                                            _datEntSetI = (SkeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)8));
                                                        }
                                                    } else if (entity instanceof SkeletontitanEntity) {
                                                        _datEntSetI = (SkeletontitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)8));
                                                    }
                                                } else {
                                                    float f21;
                                                    LivingEntity livingEntity50;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity50 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity50 = null;
                                                    }
                                                    if (livingEntity50 != null) {
                                                        LivingEntity livingEntity51;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt7 = (Mob)entity;
                                                            livingEntity51 = _mobEnt7.m_5448_();
                                                        } else {
                                                            livingEntity51 = null;
                                                        }
                                                        f21 = entity.m_20270_(livingEntity51);
                                                    } else {
                                                        f21 = -1.0f;
                                                    }
                                                    if (f21 > 32.0f) {
                                                        LivingEntity livingEntity52;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt8 = (Mob)entity;
                                                            livingEntity52 = _mobEnt8.m_5448_();
                                                        } else {
                                                            livingEntity52 = null;
                                                        }
                                                        if (livingEntity52.m_20206_() > 6.0f) {
                                                            if (entity instanceof SkeletontitanEntity) {
                                                                _datEntSetI = (SkeletontitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)6));
                                                            }
                                                        } else if (entity instanceof SkeletontitanEntity) {
                                                            _datEntSetI = (SkeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)8));
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
                        int n37;
                        if (entity instanceof Mob) {
                            _entity = (Mob)entity;
                            _entity.m_6710_(null);
                        }
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI4 = (SkeletontitanEntity)entity;
                            n37 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
                        } else {
                            n37 = 0;
                        }
                        if (n37 == 0) {
                            int n38;
                            int n39;
                            int n40;
                            int n41;
                            int n42;
                            if (entity instanceof SkeletontitanEntity) {
                                int n43;
                                SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                if (entity instanceof SkeletontitanEntity) {
                                    _datEntI5 = (SkeletontitanEntity)entity;
                                    n43 = (Integer)_datEntI5.m_20088_().m_135370_(SkeletontitanEntity.DATA_deathTick);
                                } else {
                                    n43 = 0;
                                }
                                synchedEntityData.m_135381_(SkeletontitanEntity.DATA_deathTick, (Object)(n43 + 1));
                            }
                            if (entity instanceof SkeletontitanEntity) {
                                SkeletontitanEntity _datEntI9 = (SkeletontitanEntity)entity;
                                n42 = (Integer)_datEntI9.m_20088_().m_135370_(SkeletontitanEntity.DATA_deathTick);
                            } else {
                                n42 = 0;
                            }
                            if (n42 == 1 && world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof SkeletontitanEntity) {
                                SkeletontitanEntity _datEntI10 = (SkeletontitanEntity)entity;
                                n41 = (Integer)_datEntI10.m_20088_().m_135370_(SkeletontitanEntity.DATA_deathTick);
                            } else {
                                n41 = 0;
                            }
                            if (n41 < 3) {
                                for (int index1 = 0; index1 < 12; ++index1) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof SkeletontitanEntity) {
                                SkeletontitanEntity _datEntI11 = (SkeletontitanEntity)entity;
                                n40 = (Integer)_datEntI11.m_20088_().m_135370_(SkeletontitanEntity.DATA_deathTick);
                            } else {
                                n40 = 0;
                            }
                            if (n40 < 10 && entity instanceof SkeletontitanEntity) {
                                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.death");
                            }
                            if (entity instanceof SkeletontitanEntity) {
                                SkeletontitanEntity _datEntI12 = (SkeletontitanEntity)entity;
                                n39 = (Integer)_datEntI12.m_20088_().m_135370_(SkeletontitanEntity.DATA_deathTick);
                            } else {
                                n39 = 0;
                            }
                            if (n39 == 430) {
                                if (world instanceof ServerLevel) {
                                    ServerLevel _level = (ServerLevel)world;
                                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"skeletontitan\"'}");
                                }
                                for (int index2 = 0; index2 < 320; ++index2) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                }
                            }
                            if (entity instanceof SkeletontitanEntity) {
                                SkeletontitanEntity _datEntI13 = (SkeletontitanEntity)entity;
                                n38 = (Integer)_datEntI13.m_20088_().m_135370_(SkeletontitanEntity.DATA_deathTick);
                            } else {
                                n38 = 0;
                            }
                            if (n38 >= 430 && !entity.m_9236_().m_5776_()) {
                                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                            }
                        }
                    }
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI3 = (SkeletontitanEntity)entity;
                        n12 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
                    } else {
                        n12 = 0;
                    }
                    if (n12 != true) break block920;
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.zt");
                    }
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI4 = (SkeletontitanEntity)entity;
                        n11 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                    } else {
                        n11 = 0;
                    }
                    if (n11 == 1) {
                        float f22;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            Mob _mobEnt20 = (Mob)entity;
                            livingEntity = _mobEnt20.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity53;
                            if (entity instanceof Mob) {
                                Mob _mobEnt21 = (Mob)entity;
                                livingEntity53 = _mobEnt21.m_5448_();
                            } else {
                                livingEntity53 = null;
                            }
                            f22 = entity.m_20270_(livingEntity53);
                        } else {
                            f22 = -1.0f;
                        }
                        if (f22 > 1.0f) {
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
                                Mob mob = (Mob)entity;
                                livingEntity56 = mob.m_5448_();
                            } else {
                                livingEntity56 = null;
                            }
                            double d12 = livingEntity56.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity55 = _mobEnt.m_5448_();
                            } else {
                                livingEntity55 = null;
                            }
                            double d13 = d12 + (double)livingEntity55.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity54 = _mobEnt.m_5448_();
                            } else {
                                livingEntity54 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d13, livingEntity54.m_20189_()));
                        }
                    }
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI4 = (SkeletontitanEntity)entity;
                        n10 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 70) break block921;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI14 = (SkeletontitanEntity)entity;
                        n9 = (Integer)_datEntI14.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 != 114) break block922;
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entityiterator2 : _entfound) {
                    int n44;
                    float f;
                    float f23;
                    int n45;
                    float f24;
                    float f25;
                    int n46;
                    float f26;
                    int n47;
                    float f27;
                    LivingEntity _livEnt5;
                    int n48;
                    float f28;
                    if (entityiterator2 instanceof WitherskeletontitanEntity || entityiterator2 instanceof GiantwitherskeletonEntity || entityiterator2 instanceof SkeletontitanEntity || entityiterator2 instanceof GiantskeletonEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt6 = (LivingEntity)entityiterator2;
                        f28 = _livEnt6.m_21233_();
                    } else {
                        f28 = -1.0f;
                    }
                    float f29 = f28 / 20.0f + 1200.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI22 = (SkeletontitanEntity)entity;
                        n48 = (Integer)_datEntI22.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n48 = 0;
                    }
                    entityiterator2.m_6469_(damageSource, f29 + (float)(n48 * 10));
                    if (entityiterator2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                        entityiterator2.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator2);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator2;
                        f27 = _livEnt5.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    float f30 = f27 / 20.0f + 1200.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI2 = (SkeletontitanEntity)entity;
                        n47 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n47 = 0;
                    }
                    entityiterator2.m_6469_(damageSource2, f30 + (float)(n47 * 10));
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator2;
                        f26 = _livEnt5.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    float f31 = f26 / 20.0f + 1200.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI2 = (SkeletontitanEntity)entity;
                        n46 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n46 = 0;
                    }
                    entityiterator2.m_6469_(damageSource3, f31 + (float)(n46 * 10));
                    entityiterator2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f25 = _livEnt2.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator2;
                        f24 = _livEnt5.m_21223_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f32 = (f25 + f24) / 5.0f + 12000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI2 = (SkeletontitanEntity)entity;
                        n45 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n45 = 0;
                    }
                    entityiterator2.m_6469_(damageSource4, f32 + (float)(n45 * 100));
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f23 = _livEnt2.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt5 = (LivingEntity)entityiterator2;
                        f = _livEnt5.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f33 = (f23 + f) / 5.0f + 12000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI2 = (SkeletontitanEntity)entity;
                        n44 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n44 = 0;
                    }
                    entityiterator2.m_6469_(damageSource5, f33 + (float)(n44 * 100));
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n8 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n8 = 0;
            }
            if (n8 >= 160) {
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SkeletontitanEntity) {
            _datEntI3 = (SkeletontitanEntity)entity;
            n7 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
        } else {
            n7 = 0;
        }
        if (n7 == 2) {
            int n49;
            int n50;
            float f;
            LivingEntity livingEntity;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.zp1");
                }
            } else if (entity instanceof SkeletontitanEntity) {
                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.zp2");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity58;
                if (entity instanceof Mob) {
                    Mob _mobEnt22 = (Mob)entity;
                    livingEntity58 = _mobEnt22.m_5448_();
                } else {
                    livingEntity58 = null;
                }
                f = entity.m_20270_(livingEntity58);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity59;
                LivingEntity livingEntity60;
                LivingEntity livingEntity61;
                LivingEntity livingEntity62;
                if (entity instanceof Mob) {
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity62 = _mobEnt23.m_5448_();
                } else {
                    livingEntity62 = null;
                }
                double d = livingEntity62.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity61 = _mobEnt.m_5448_();
                } else {
                    livingEntity61 = null;
                }
                double d14 = livingEntity61.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt24 = (Mob)entity;
                    livingEntity60 = _mobEnt24.m_5448_();
                } else {
                    livingEntity60 = null;
                }
                double d15 = d14 + (double)livingEntity60.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt25 = (Mob)entity;
                    livingEntity59 = _mobEnt25.m_5448_();
                } else {
                    livingEntity59 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d15, livingEntity59.m_20189_()));
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n50 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n50 = 0;
            }
            if (n50 == 26) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center3 = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                for (Entity entity2 : _entfound3) {
                    int n51;
                    float f34;
                    float f35;
                    int n52;
                    float f36;
                    float f37;
                    int n53;
                    float f38;
                    int n54;
                    float f39;
                    int n55;
                    float f40;
                    if (entity2 instanceof WitherskeletontitanEntity || entity2 instanceof GiantwitherskeletonEntity || entity2 instanceof SkeletontitanEntity || entity2 instanceof GiantskeletonEntity || !(entity2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f40 = _livEnt.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    float f41 = f40 / 20.0f + 2400.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n55 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n55 = 0;
                    }
                    entity2.m_6469_(damageSource, f41 + (float)(n55 * 10));
                    if (entity2 instanceof Titangodentity) continue;
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f39 = _livEnt.m_21233_();
                    } else {
                        f39 = -1.0f;
                    }
                    float f42 = f39 / 20.0f + 2400.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n54 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n54 = 0;
                    }
                    entity2.m_6469_(damageSource6, f42 + (float)(n54 * 10));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity2;
                        f38 = _livEnt.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    float f43 = f38 / 20.0f + 2400.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n53 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n53 = 0;
                    }
                    entity2.m_6469_(damageSource7, f43 + (float)(n53 * 10));
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
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n52 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n52 = 0;
                    }
                    entity2.m_6469_(damageSource8, f44 + (float)(n52 * 100));
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
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n51 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n51 = 0;
                    }
                    entity2.m_6469_(damageSource9, f45 + (float)(n51 * 100));
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n49 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n49 = 0;
            }
            if (n49 >= 44) {
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SkeletontitanEntity) {
            _datEntI3 = (SkeletontitanEntity)entity;
            n6 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 3) {
            int n56;
            int n57;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SkeletontitanEntity) {
                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.qj");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity63;
                if (entity instanceof Mob) {
                    Mob _mobEnt26 = (Mob)entity;
                    livingEntity63 = _mobEnt26.m_5448_();
                } else {
                    livingEntity63 = null;
                }
                f = entity.m_20270_(livingEntity63);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity64;
                LivingEntity livingEntity65;
                LivingEntity livingEntity66;
                LivingEntity livingEntity67;
                if (entity instanceof Mob) {
                    Mob _mobEnt27 = (Mob)entity;
                    livingEntity67 = _mobEnt27.m_5448_();
                } else {
                    livingEntity67 = null;
                }
                double d = livingEntity67.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity66 = _mobEnt.m_5448_();
                } else {
                    livingEntity66 = null;
                }
                double d16 = livingEntity66.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt28 = (Mob)entity;
                    livingEntity65 = _mobEnt28.m_5448_();
                } else {
                    livingEntity65 = null;
                }
                double d17 = d16 + (double)livingEntity65.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt29 = (Mob)entity;
                    livingEntity64 = _mobEnt29.m_5448_();
                } else {
                    livingEntity64 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity64.m_20189_()));
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n57 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n57 = 0;
            }
            if (n57 == 44) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center4 = new Vec3(x, y, z);
                List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                for (Entity entity3 : _entfound4) {
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
                    int n62;
                    float f52;
                    if (entity3 instanceof WitherskeletontitanEntity || entity3 instanceof GiantwitherskeletonEntity || entity3 instanceof SkeletontitanEntity || entity3 instanceof GiantskeletonEntity || !(entity3 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f52 = _livEnt.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    float f53 = f52 / 20.0f + 1600.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n62 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n62 = 0;
                    }
                    entity3.m_6469_(damageSource, f53 + (float)(n62 * 10));
                    if (entity3 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity3 instanceof Player)) {
                        entity3.f_19802_ = 0;
                        Deathlist.normalattack(entity3);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f51 = _livEnt.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    float f54 = f51 / 20.0f + 1600.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n61 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n61 = 0;
                    }
                    entity3.m_6469_(damageSource10, f54 + (float)(n61 * 10));
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f50 = _livEnt.m_21233_();
                    } else {
                        f50 = -1.0f;
                    }
                    float f55 = f50 / 20.0f + 1600.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n60 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n60 = 0;
                    }
                    entity3.m_6469_(damageSource11, f55 + (float)(n60 * 10));
                    entity3.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity3.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entity3;
                        f49 = _livEnt8.m_21233_();
                    } else {
                        f49 = -1.0f;
                    }
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f48 = _livEnt.m_21223_();
                    } else {
                        f48 = -1.0f;
                    }
                    float f56 = (f49 + f48) / 5.0f + 16000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n59 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n59 = 0;
                    }
                    entity3.m_6469_(damageSource12, f56 + (float)(n59 * 100));
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entity3;
                        f47 = _livEnt7.m_21233_();
                    } else {
                        f47 = -1.0f;
                    }
                    if (entity3 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity3;
                        f46 = _livEnt.m_21223_();
                    } else {
                        f46 = -1.0f;
                    }
                    float f57 = (f47 + f46) / 5.0f + 16000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        _datEntI = (SkeletontitanEntity)entity;
                        n58 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n58 = 0;
                    }
                    entity3.m_6469_(damageSource13, f57 + (float)(n58 * 100));
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n56 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 >= 70) {
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SkeletontitanEntity) {
            _datEntI3 = (SkeletontitanEntity)entity;
            n5 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 4) {
            int n63;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity68;
                if (entity instanceof Mob) {
                    Mob _mobEnt30 = (Mob)entity;
                    livingEntity68 = _mobEnt30.m_5448_();
                } else {
                    livingEntity68 = null;
                }
                f = entity.m_20270_(livingEntity68);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity69;
                LivingEntity livingEntity70;
                LivingEntity livingEntity71;
                LivingEntity livingEntity72;
                if (entity instanceof Mob) {
                    Mob _mobEnt31 = (Mob)entity;
                    livingEntity72 = _mobEnt31.m_5448_();
                } else {
                    livingEntity72 = null;
                }
                double d = livingEntity72.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity71 = _mobEnt.m_5448_();
                } else {
                    livingEntity71 = null;
                }
                double d18 = livingEntity71.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt32 = (Mob)entity;
                    livingEntity70 = _mobEnt32.m_5448_();
                } else {
                    livingEntity70 = null;
                }
                double d19 = d18 + (double)livingEntity70.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt33 = (Mob)entity;
                    livingEntity69 = _mobEnt33.m_5448_();
                } else {
                    livingEntity69 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d19, livingEntity69.m_20189_()));
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n63 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
            } else {
                n63 = 0;
            }
            if (n63 > 5000) {
                int n64;
                int n65;
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.godattack");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.godattack2");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.godattack3");
                    }
                } else if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.godattack4");
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntI15 = (SkeletontitanEntity)entity;
                    n65 = (Integer)_datEntI15.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                } else {
                    n65 = 0;
                }
                if (n65 == 10) {
                    if (world instanceof Level) {
                        Level _level = (Level)world;
                        if (!_level.m_5776_()) {
                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                        } else {
                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                        }
                    }
                    Vec3 _center5 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                    for (Entity entityiterator : _entfound) {
                        int n66;
                        float f58;
                        float f59;
                        int n67;
                        float f60;
                        float f61;
                        int n68;
                        float f62;
                        int n69;
                        float f63;
                        LivingEntity _livEnt8;
                        int n70;
                        float f64;
                        if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt9 = (LivingEntity)entityiterator;
                            f64 = _livEnt9.m_21233_();
                        } else {
                            f64 = -1.0f;
                        }
                        float f65 = f64 / 20.0f + 4800.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n70 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n70 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f65 + (float)(n70 * 10));
                        if (entityiterator instanceof Titangodentity) continue;
                        DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt8 = (LivingEntity)entityiterator;
                            f63 = _livEnt8.m_21233_();
                        } else {
                            f63 = -1.0f;
                        }
                        float f66 = f63 / 20.0f + 4800.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n69 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n69 = 0;
                        }
                        entityiterator.m_6469_(damageSource14, f66 + (float)(n69 * 10));
                        DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt8 = (LivingEntity)entityiterator;
                            f62 = _livEnt8.m_21233_();
                        } else {
                            f62 = -1.0f;
                        }
                        float f67 = f62 / 20.0f + 4800.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n68 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n68 = 0;
                        }
                        entityiterator.m_6469_(damageSource15, f67 + (float)(n68 * 10));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f61 = _livEnt2.m_21233_();
                        } else {
                            f61 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt8 = (LivingEntity)entityiterator;
                            f60 = _livEnt8.m_21223_();
                        } else {
                            f60 = -1.0f;
                        }
                        float f68 = (f61 + f60) / 5.0f + 48000.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n67 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n67 = 0;
                        }
                        entityiterator.m_6469_(damageSource16, f68 + (float)(n67 * 100));
                        DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f59 = _livEnt2.m_21233_();
                        } else {
                            f59 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt8 = (LivingEntity)entityiterator;
                            f58 = _livEnt8.m_21223_();
                        } else {
                            f58 = -1.0f;
                        }
                        float f69 = (f59 + f58) / 5.0f + 48000.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n66 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n66 = 0;
                        }
                        entityiterator.m_6469_(damageSource17, f69 + (float)(n66 * 100));
                    }
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntI16 = (SkeletontitanEntity)entity;
                    n64 = (Integer)_datEntI16.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                } else {
                    n64 = 0;
                }
                if (n64 >= 18) {
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                    }
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                    }
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("empty");
                    }
                }
            } else {
                int n71;
                int n72;
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.attack1");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.attack2");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.attack3");
                    }
                } else if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.attack4");
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntI17 = (SkeletontitanEntity)entity;
                    n72 = (Integer)_datEntI17.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                } else {
                    n72 = 0;
                }
                if (n72 == 16) {
                    if (world instanceof Level) {
                        Level _level = (Level)world;
                        if (!_level.m_5776_()) {
                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                        } else {
                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                        }
                    }
                    Vec3 _center6 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                    for (Entity entityiterator : _entfound) {
                        int n73;
                        float f70;
                        float f71;
                        int n74;
                        float f72;
                        float f73;
                        int n75;
                        float f74;
                        int n76;
                        float f75;
                        LivingEntity _livEnt9;
                        int n77;
                        float f76;
                        if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt10 = (LivingEntity)entityiterator;
                            f76 = _livEnt10.m_21233_();
                        } else {
                            f76 = -1.0f;
                        }
                        float f77 = f76 / 20.0f + 4800.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n77 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n77 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f77 + (float)(n77 * 10));
                        if (entityiterator instanceof Titangodentity) continue;
                        DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f75 = _livEnt9.m_21233_();
                        } else {
                            f75 = -1.0f;
                        }
                        float f78 = f75 / 20.0f + 4800.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n76 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n76 = 0;
                        }
                        entityiterator.m_6469_(damageSource18, f78 + (float)(n76 * 10));
                        DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f74 = _livEnt9.m_21233_();
                        } else {
                            f74 = -1.0f;
                        }
                        float f79 = f74 / 20.0f + 4800.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n75 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n75 = 0;
                        }
                        entityiterator.m_6469_(damageSource19, f79 + (float)(n75 * 10));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f73 = _livEnt2.m_21233_();
                        } else {
                            f73 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f72 = _livEnt9.m_21223_();
                        } else {
                            f72 = -1.0f;
                        }
                        float f80 = (f73 + f72) / 5.0f + 48000.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n74 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n74 = 0;
                        }
                        entityiterator.m_6469_(damageSource20, f80 + (float)(n74 * 100));
                        DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f71 = _livEnt2.m_21233_();
                        } else {
                            f71 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f70 = _livEnt9.m_21223_();
                        } else {
                            f70 = -1.0f;
                        }
                        float f81 = (f71 + f70) / 5.0f + 48000.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI2 = (SkeletontitanEntity)entity;
                            n73 = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n73 = 0;
                        }
                        entityiterator.m_6469_(damageSource21, f81 + (float)(n73 * 100));
                    }
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntI18 = (SkeletontitanEntity)entity;
                    n71 = (Integer)_datEntI18.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                } else {
                    n71 = 0;
                }
                if (n71 >= 30) {
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                    }
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                    }
                    if (entity instanceof SkeletontitanEntity) {
                        ((SkeletontitanEntity)entity).setAnimation("empty");
                    }
                }
            }
        }
        if (entity instanceof SkeletontitanEntity) {
            _datEntI3 = (SkeletontitanEntity)entity;
            n4 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 5) {
            int n78;
            int n79;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof SkeletontitanEntity) {
                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.sd");
            }
            if (entity instanceof Mob) {
                _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity73;
                if (entity instanceof Mob) {
                    Mob _mobEnt34 = (Mob)entity;
                    livingEntity73 = _mobEnt34.m_5448_();
                } else {
                    livingEntity73 = null;
                }
                f = entity.m_20270_(livingEntity73);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity74;
                LivingEntity livingEntity75;
                LivingEntity livingEntity76;
                LivingEntity livingEntity77;
                if (entity instanceof Mob) {
                    Mob _mobEnt35 = (Mob)entity;
                    livingEntity77 = _mobEnt35.m_5448_();
                } else {
                    livingEntity77 = null;
                }
                double d = livingEntity77.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity76 = _mobEnt.m_5448_();
                } else {
                    livingEntity76 = null;
                }
                double d20 = livingEntity76.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt36 = (Mob)entity;
                    livingEntity75 = _mobEnt36.m_5448_();
                } else {
                    livingEntity75 = null;
                }
                double d21 = d20 + (double)livingEntity75.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt37 = (Mob)entity;
                    livingEntity74 = _mobEnt37.m_5448_();
                } else {
                    livingEntity74 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d21, livingEntity74.m_20189_()));
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n79 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n79 = 0;
            }
            if (n79 == 42) {
                float f82;
                LivingEntity livingEntity78;
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt38 = (Mob)entity;
                    livingEntity78 = _mobEnt38.m_5448_();
                } else {
                    livingEntity78 = null;
                }
                if (livingEntity78 != null) {
                    LivingEntity livingEntity79;
                    if (entity instanceof Mob) {
                        Mob _mobEnt39 = (Mob)entity;
                        livingEntity79 = _mobEnt39.m_5448_();
                    } else {
                        livingEntity79 = null;
                    }
                    f82 = entity.m_20270_(livingEntity79);
                } else {
                    f82 = -1.0f;
                }
                if (f82 > 1.0f) {
                    LivingEntity livingEntity80;
                    LivingEntity livingEntity81;
                    LivingEntity livingEntity82;
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity83;
                        LivingEntity livingEntity84;
                        LivingEntity livingEntity85;
                        ServerLevel _level = (ServerLevel)world;
                        LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity85 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity85 = null;
                        }
                        double d = livingEntity85.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity84 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity84 = null;
                        }
                        double d22 = livingEntity84.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity83 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity83 = null;
                        }
                        lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)d22, (double)livingEntity83.m_20189_())));
                        lightningBolt.m_20874_(true);
                        _level.m_7967_((Entity)lightningBolt);
                    }
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity82 = mob.m_5448_();
                    } else {
                        livingEntity82 = null;
                    }
                    double d = livingEntity82.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity81 = mob.m_5448_();
                    } else {
                        livingEntity81 = null;
                    }
                    double d23 = livingEntity81.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity80 = mob.m_5448_();
                    } else {
                        livingEntity80 = null;
                    }
                    _center = new Vec3(d, d23, livingEntity80.m_20189_());
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : list) {
                        int n80;
                        float f83;
                        float f84;
                        int n81;
                        float f85;
                        float f86;
                        int n82;
                        float f87;
                        int n83;
                        SkeletontitanEntity _datEntI6;
                        float f88;
                        int n84;
                        float f89;
                        if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt22 = (LivingEntity)entityiterator;
                            f89 = _livEnt22.m_21233_();
                        } else {
                            f89 = -1.0f;
                        }
                        float f90 = f89 / 20.0f + 1200.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            SkeletontitanEntity _datEntI19 = (SkeletontitanEntity)entity;
                            n84 = (Integer)_datEntI19.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n84 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f90 + (float)(n84 * 10));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f88 = _livEnt2.m_21233_();
                        } else {
                            f88 = -1.0f;
                        }
                        float f91 = f88 / 20.0f + 1200.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI6 = (SkeletontitanEntity)entity;
                            n83 = (Integer)_datEntI6.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n83 = 0;
                        }
                        entityiterator.m_6469_(damageSource22, f91 + (float)(n83 * 10));
                        DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f87 = _livEnt2.m_21233_();
                        } else {
                            f87 = -1.0f;
                        }
                        float f92 = f87 / 20.0f + 1200.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI6 = (SkeletontitanEntity)entity;
                            n82 = (Integer)_datEntI6.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n82 = 0;
                        }
                        entityiterator.m_6469_(damageSource23, f92 + (float)(n82 * 10));
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt11 = (LivingEntity)entityiterator;
                            f86 = _livEnt11.m_21233_();
                        } else {
                            f86 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f85 = _livEnt2.m_21223_();
                        } else {
                            f85 = -1.0f;
                        }
                        float f93 = (f86 + f85) / 5.0f + 12000.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI6 = (SkeletontitanEntity)entity;
                            n81 = (Integer)_datEntI6.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n81 = 0;
                        }
                        entityiterator.m_6469_(damageSource24, f93 + (float)(n81 * 100));
                        DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt10 = (LivingEntity)entityiterator;
                            f84 = _livEnt10.m_21233_();
                        } else {
                            f84 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f83 = _livEnt2.m_21223_();
                        } else {
                            f83 = -1.0f;
                        }
                        float f94 = (f84 + f83) / 5.0f + 12000.0f;
                        if (entity instanceof SkeletontitanEntity) {
                            _datEntI6 = (SkeletontitanEntity)entity;
                            n80 = (Integer)_datEntI6.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n80 = 0;
                        }
                        entityiterator.m_6469_(damageSource25, f94 + (float)(n80 * 100));
                    }
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n78 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n78 = 0;
            }
            if (n78 >= 60) {
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SkeletontitanEntity) {
            _datEntI3 = (SkeletontitanEntity)entity;
            n3 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 8) {
            int n85;
            int n86;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SkeletontitanEntity) {
                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.jq");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity86;
                if (entity instanceof Mob) {
                    Mob _mobEnt40 = (Mob)entity;
                    livingEntity86 = _mobEnt40.m_5448_();
                } else {
                    livingEntity86 = null;
                }
                f = entity.m_20270_(livingEntity86);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity87;
                LivingEntity livingEntity88;
                LivingEntity livingEntity89;
                LivingEntity livingEntity90;
                if (entity instanceof Mob) {
                    Mob _mobEnt41 = (Mob)entity;
                    livingEntity90 = _mobEnt41.m_5448_();
                } else {
                    livingEntity90 = null;
                }
                double d = livingEntity90.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity89 = _mobEnt.m_5448_();
                } else {
                    livingEntity89 = null;
                }
                double d24 = livingEntity89.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt42 = (Mob)entity;
                    livingEntity88 = _mobEnt42.m_5448_();
                } else {
                    livingEntity88 = null;
                }
                double d25 = d24 + (double)livingEntity88.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt43 = (Mob)entity;
                    livingEntity87 = _mobEnt43.m_5448_();
                } else {
                    livingEntity87 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d25, livingEntity87.m_20189_()));
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n86 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n86 = 0;
            }
            if (n86 >= 66) {
                int n87;
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntI20 = (SkeletontitanEntity)entity;
                    n87 = (Integer)_datEntI20.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
                } else {
                    n87 = 0;
                }
                if (n87 <= 132) {
                    int n88;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI21 = (SkeletontitanEntity)entity;
                        n88 = (Integer)_datEntI21.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n88 = 0;
                    }
                    if (n88 > 5000) {
                        float f95;
                        LivingEntity livingEntity91;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity91 = _mobEnt.m_5448_();
                        } else {
                            livingEntity91 = null;
                        }
                        if (livingEntity91 != null) {
                            LivingEntity livingEntity92;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity92 = mob.m_5448_();
                            } else {
                                livingEntity92 = null;
                            }
                            f95 = entity.m_20270_(livingEntity92);
                        } else {
                            f95 = -1.0f;
                        }
                        if (f95 > 1.0f) {
                            for (int index3 = 0; index3 < 8; ++index3) {
                                LivingEntity livingEntity93;
                                LivingEntity livingEntity94;
                                LivingEntity livingEntity95;
                                if (!(world instanceof ServerLevel)) continue;
                                projectileLevel = (ServerLevel)world;
                                Projectile _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        GiantharrowEntity entityToSpawn = new GiantharrowEntity((EntityType<? extends GiantharrowEntity>)((EntityType)UltimateskeletonsModEntities.GIANTHARROW.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 14.0, y + 22.0, z + entity.m_20154_().f_82481_ * 14.0);
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity95 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity95 = null;
                                }
                                double d = livingEntity95.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity94 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity94 = null;
                                }
                                double d26 = livingEntity94.m_20186_() - 22.0 - entity.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity93 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity93 = null;
                                }
                                _entityToSpawn.m_6686_(d, d26, livingEntity93.m_20189_() - entity.m_20189_(), 4.0f, 32.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                        } else {
                            for (int index4 = 0; index4 < 8; ++index4) {
                                if (!(world instanceof ServerLevel)) continue;
                                projectileLevel = (ServerLevel)world;
                                Projectile _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        GiantharrowEntity entityToSpawn = new GiantharrowEntity((EntityType<? extends GiantharrowEntity>)((EntityType)UltimateskeletonsModEntities.GIANTHARROW.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 22.0, z + entity.m_20154_().f_82481_ * 24.0);
                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 4.0f, 32.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                        }
                    } else {
                        float f96;
                        LivingEntity livingEntity96;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity96 = _mobEnt.m_5448_();
                        } else {
                            livingEntity96 = null;
                        }
                        if (livingEntity96 != null) {
                            LivingEntity livingEntity97;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity97 = mob.m_5448_();
                            } else {
                                livingEntity97 = null;
                            }
                            f96 = entity.m_20270_(livingEntity97);
                        } else {
                            f96 = -1.0f;
                        }
                        if (f96 > 1.0f) {
                            for (int index5 = 0; index5 < 8; ++index5) {
                                LivingEntity livingEntity98;
                                LivingEntity livingEntity99;
                                LivingEntity livingEntity100;
                                if (!(world instanceof ServerLevel)) continue;
                                projectileLevel = (ServerLevel)world;
                                Projectile _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        SkeletonharrawEntity entityToSpawn = new SkeletonharrawEntity((EntityType<? extends SkeletonharrawEntity>)((EntityType)UltimateskeletonsModEntities.SKELETONHARRAW.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 14.0, y + 22.0, z + entity.m_20154_().f_82481_ * 14.0);
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity100 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity100 = null;
                                }
                                double d = livingEntity100.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity99 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity99 = null;
                                }
                                double d27 = livingEntity99.m_20186_() - 22.0 - entity.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity98 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity98 = null;
                                }
                                _entityToSpawn.m_6686_(d, d27, livingEntity98.m_20189_() - entity.m_20189_(), 4.0f, 32.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                        } else {
                            for (int index6 = 0; index6 < 8; ++index6) {
                                if (!(world instanceof ServerLevel)) continue;
                                projectileLevel = (ServerLevel)world;
                                Projectile _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        SkeletonharrawEntity entityToSpawn = new SkeletonharrawEntity((EntityType<? extends SkeletonharrawEntity>)((EntityType)UltimateskeletonsModEntities.SKELETONHARRAW.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 22.0, z + entity.m_20154_().f_82481_ * 24.0);
                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 4.0f, 32.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                        }
                    }
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n85 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n85 = 0;
            }
            if (n85 >= 152) {
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SkeletontitanEntity) {
            _datEntI3 = (SkeletontitanEntity)entity;
            n2 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 7) {
            int n89;
            int n90;
            int n91;
            if (entity instanceof SkeletontitanEntity) {
                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.zz");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n91 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n91 = 0;
            }
            if (n91 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt44 = (Mob)entity;
                    livingEntity = _mobEnt44.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity101;
                    if (entity instanceof Mob) {
                        Mob _mobEnt45 = (Mob)entity;
                        livingEntity101 = _mobEnt45.m_5448_();
                    } else {
                        livingEntity101 = null;
                    }
                    f = entity.m_20270_(livingEntity101);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity102;
                    LivingEntity livingEntity103;
                    LivingEntity livingEntity104;
                    LivingEntity livingEntity105;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity105 = _mobEnt.m_5448_();
                    } else {
                        livingEntity105 = null;
                    }
                    double d = livingEntity105.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity104 = mob.m_5448_();
                    } else {
                        livingEntity104 = null;
                    }
                    double d28 = livingEntity104.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity103 = _mobEnt.m_5448_();
                    } else {
                        livingEntity103 = null;
                    }
                    double d29 = d28 + (double)livingEntity103.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity102 = _mobEnt.m_5448_();
                    } else {
                        livingEntity102 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d29, livingEntity102.m_20189_()));
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n90 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n90 = 0;
            }
            if (n90 == 82) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center7 = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center7, _center7).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center7))).toList();
                for (Entity entity4 : _entfound5) {
                    int n92;
                    float f;
                    float f97;
                    int n93;
                    float f98;
                    float f99;
                    int n94;
                    float f100;
                    int n95;
                    float f101;
                    int n96;
                    float f102;
                    if (entity4 instanceof WitherskeletontitanEntity || entity4 instanceof GiantwitherskeletonEntity || entity4 instanceof SkeletontitanEntity || entity4 instanceof GiantskeletonEntity || !(entity4 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f102 = _livEnt.m_21233_();
                    } else {
                        f102 = -1.0f;
                    }
                    float f103 = f102 / 10.0f + 9000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI22 = (SkeletontitanEntity)entity;
                        n96 = (Integer)_datEntI22.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n96 = 0;
                    }
                    entity4.m_6469_(damageSource, f103 + (float)(n96 * 10));
                    if (entity4 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity4 instanceof Player)) {
                        entity4.f_19802_ = 0;
                        Deathlist.normalattack(entity4);
                    }
                    DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f101 = _livEnt.m_21233_();
                    } else {
                        f101 = -1.0f;
                    }
                    float f104 = f101 / 10.0f + 9000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI23 = (SkeletontitanEntity)entity;
                        n95 = (Integer)_datEntI23.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n95 = 0;
                    }
                    entity4.m_6469_(damageSource26, f104 + (float)(n95 * 10));
                    DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f100 = _livEnt.m_21233_();
                    } else {
                        f100 = -1.0f;
                    }
                    float f105 = f100 / 10.0f + 9000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI24 = (SkeletontitanEntity)entity;
                        n94 = (Integer)_datEntI24.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n94 = 0;
                    }
                    entity4.m_6469_(damageSource27, f105 + (float)(n94 * 10));
                    entity4.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity4.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        LivingEntity _livEnt12 = (LivingEntity)entity4;
                        f99 = _livEnt12.m_21233_();
                    } else {
                        f99 = -1.0f;
                    }
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f98 = _livEnt.m_21223_();
                    } else {
                        f98 = -1.0f;
                    }
                    float f106 = (f99 + f98) / 5.0f + 90000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI25 = (SkeletontitanEntity)entity;
                        n93 = (Integer)_datEntI25.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n93 = 0;
                    }
                    entity4.m_6469_(damageSource28, f106 + (float)(n93 * 100));
                    DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entity4;
                        f97 = _livEnt11.m_21233_();
                    } else {
                        f97 = -1.0f;
                    }
                    if (entity4 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity4;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f107 = (f97 + f) / 5.0f + 90000.0f;
                    if (entity instanceof SkeletontitanEntity) {
                        SkeletontitanEntity _datEntI26 = (SkeletontitanEntity)entity;
                        n92 = (Integer)_datEntI26.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n92 = 0;
                    }
                    entity4.m_6469_(damageSource29, f107 + (float)(n92 * 100));
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n89 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n89 = 0;
            }
            if (n89 >= 198) {
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof SkeletontitanEntity) {
            _datEntI3 = (SkeletontitanEntity)entity;
            n = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 6) {
            int n97;
            int n98;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof SkeletontitanEntity) {
                ((SkeletontitanEntity)entity).setAnimation("animation.skeletontitan.jj");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity106;
                if (entity instanceof Mob) {
                    Mob _mobEnt46 = (Mob)entity;
                    livingEntity106 = _mobEnt46.m_5448_();
                } else {
                    livingEntity106 = null;
                }
                f = entity.m_20270_(livingEntity106);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity107;
                LivingEntity livingEntity108;
                LivingEntity livingEntity109;
                LivingEntity livingEntity110;
                if (entity instanceof Mob) {
                    Mob _mobEnt47 = (Mob)entity;
                    livingEntity110 = _mobEnt47.m_5448_();
                } else {
                    livingEntity110 = null;
                }
                double d = livingEntity110.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity109 = _mobEnt.m_5448_();
                } else {
                    livingEntity109 = null;
                }
                double d30 = livingEntity109.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt48 = (Mob)entity;
                    livingEntity108 = _mobEnt48.m_5448_();
                } else {
                    livingEntity108 = null;
                }
                double d31 = d30 + (double)livingEntity108.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt49 = (Mob)entity;
                    livingEntity107 = _mobEnt49.m_5448_();
                } else {
                    livingEntity107 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d31, livingEntity107.m_20189_()));
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n98 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n98 = 0;
            }
            if (n98 == 61) {
                int n99;
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntI27 = (SkeletontitanEntity)entity;
                    n99 = (Integer)_datEntI27.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                } else {
                    n99 = 0;
                }
                if (n99 > 5000) {
                    float f108;
                    LivingEntity livingEntity111;
                    if (entity instanceof Mob) {
                        Mob _mobEnt50 = (Mob)entity;
                        livingEntity111 = _mobEnt50.m_5448_();
                    } else {
                        livingEntity111 = null;
                    }
                    if (livingEntity111 != null) {
                        LivingEntity livingEntity112;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity112 = _mobEnt.m_5448_();
                        } else {
                            livingEntity112 = null;
                        }
                        f108 = entity.m_20270_(livingEntity112);
                    } else {
                        f108 = -1.0f;
                    }
                    if (f108 > 1.0f) {
                        void var15_144;
                        boolean bl = false;
                        while (var15_144 < 40) {
                            if (world instanceof ServerLevel) {
                                LivingEntity livingEntity113;
                                LivingEntity livingEntity114;
                                Mob _mobEnt9;
                                LivingEntity livingEntity115;
                                ServerLevel projectileLevel = (ServerLevel)world;
                                _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        GiantharrowEntity entityToSpawn = new GiantharrowEntity((EntityType<? extends GiantharrowEntity>)((EntityType)UltimateskeletonsModEntities.GIANTHARROW.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 22.0, z + entity.m_20154_().f_82481_ * 24.0);
                                if (entity instanceof Mob) {
                                    Mob _mobEnt51 = (Mob)entity;
                                    livingEntity115 = _mobEnt51.m_5448_();
                                } else {
                                    livingEntity115 = null;
                                }
                                double d = livingEntity115.m_20185_() - entity.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt9 = (Mob)entity;
                                    livingEntity114 = _mobEnt9.m_5448_();
                                } else {
                                    livingEntity114 = null;
                                }
                                double d32 = livingEntity114.m_20186_() - 22.0 - entity.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt9 = (Mob)entity;
                                    livingEntity113 = _mobEnt9.m_5448_();
                                } else {
                                    livingEntity113 = null;
                                }
                                _entityToSpawn.m_6686_(d, d32, livingEntity113.m_20189_() - entity.m_20189_(), 4.0f, 24.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                            ++var15_144;
                        }
                    } else {
                        void var15_146;
                        boolean bl = false;
                        while (var15_146 < 40) {
                            if (world instanceof ServerLevel) {
                                ServerLevel projectileLevel = (ServerLevel)world;
                                _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        GiantharrowEntity entityToSpawn = new GiantharrowEntity((EntityType<? extends GiantharrowEntity>)((EntityType)UltimateskeletonsModEntities.GIANTHARROW.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 22.0, z + entity.m_20154_().f_82481_ * 24.0);
                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 4.0f, 24.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                            ++var15_146;
                        }
                    }
                } else {
                    float f109;
                    LivingEntity livingEntity116;
                    if (entity instanceof Mob) {
                        Mob _mobEnt52 = (Mob)entity;
                        livingEntity116 = _mobEnt52.m_5448_();
                    } else {
                        livingEntity116 = null;
                    }
                    if (livingEntity116 != null) {
                        LivingEntity livingEntity117;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity117 = _mobEnt.m_5448_();
                        } else {
                            livingEntity117 = null;
                        }
                        f109 = entity.m_20270_(livingEntity117);
                    } else {
                        f109 = -1.0f;
                    }
                    if (f109 > 1.0f) {
                        if (world instanceof ServerLevel) {
                            LivingEntity livingEntity118;
                            LivingEntity livingEntity119;
                            LivingEntity livingEntity120;
                            ServerLevel serverLevel = (ServerLevel)world;
                            Projectile _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    GiantharrowEntity entityToSpawn = new GiantharrowEntity((EntityType<? extends GiantharrowEntity>)((EntityType)UltimateskeletonsModEntities.GIANTHARROW.get()), level);
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
                                _mobEnt3 = (Mob)entity;
                                livingEntity120 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity120 = null;
                            }
                            double d = livingEntity120.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity119 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity119 = null;
                            }
                            double d33 = livingEntity119.m_20186_() - 22.0 - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity118 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity118 = null;
                            }
                            _entityToSpawn.m_6686_(d, d33, livingEntity118.m_20189_() - entity.m_20189_(), 4.0f, 4.0f);
                            serverLevel.m_7967_((Entity)_entityToSpawn);
                        }
                    } else if (world instanceof ServerLevel) {
                        ServerLevel serverLevel = (ServerLevel)world;
                        Projectile _entityToSpawn = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                GiantharrowEntity entityToSpawn = new GiantharrowEntity((EntityType<? extends GiantharrowEntity>)((EntityType)UltimateskeletonsModEntities.GIANTHARROW.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)serverLevel, entity, 100.0f, 1);
                        _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 24.0, y + 22.0, z + entity.m_20154_().f_82481_ * 24.0);
                        _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 4.0f, 4.0f);
                        serverLevel.m_7967_((Entity)_entityToSpawn);
                    }
                }
            }
            if (entity instanceof SkeletontitanEntity) {
                _datEntI4 = (SkeletontitanEntity)entity;
                n97 = (Integer)_datEntI4.m_20088_().m_135370_(SkeletontitanEntity.DATA_animationTick);
            } else {
                n97 = 0;
            }
            if (n97 >= 88) {
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    SkeletontitanEntity _datEntSetI = (SkeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(SkeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof SkeletontitanEntity) {
                    ((SkeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

