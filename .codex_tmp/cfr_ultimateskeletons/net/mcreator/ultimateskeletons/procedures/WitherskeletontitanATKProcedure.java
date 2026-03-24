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
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class WitherskeletontitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        LivingEntity _livEnt;
        ServerLevel _level;
        int n3;
        int n4;
        int n5;
        LivingEntity _livEnt2;
        WitherskeletontitanEntity _datEntI;
        int n6;
        LivingEntity _livEnt3;
        List<Entity> _entfound;
        Object _mobEnt;
        WitherskeletontitanEntity _datEntI2;
        Mob _mobEnt2;
        Object _mobEnt3;
        Mob _mobEnt4;
        Vec3 _center;
        WitherskeletontitanEntity _datEntI3;
        WitherskeletontitanEntity _datEntI4;
        block940: {
            int n7;
            block942: {
                block941: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    float f;
                    WitherskeletontitanEntity _datEntI5;
                    LivingEntity _entity;
                    block937: {
                        LivingEntity livingEntity;
                        LivingEntity _mobEnt42;
                        block938: {
                            block939: {
                                LivingEntity livingEntity2;
                                float f2;
                                LivingEntity livingEntity3;
                                LivingEntity livingEntity4;
                                int n12;
                                int n13;
                                int n14;
                                float f3;
                                block935: {
                                    block936: {
                                        int n15;
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
                                        Level _level2;
                                        block934: {
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
                                            if (entity instanceof WitherskeletontitanEntity) {
                                                int n30;
                                                WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                if (entity instanceof WitherskeletontitanEntity) {
                                                    WitherskeletontitanEntity _datEntI42 = (WitherskeletontitanEntity)entity;
                                                    n30 = (Integer)_datEntI42.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                                } else {
                                                    n30 = 0;
                                                }
                                                synchedEntityData.m_135381_(WitherskeletontitanEntity.DATA_spawnTick, (Object)(n30 + 1));
                                            }
                                            if (!entity.m_5446_().getString().equals("growing")) break block934;
                                            if (entity instanceof WitherskeletontitanEntity) {
                                                WitherskeletontitanEntity _datEntI32 = (WitherskeletontitanEntity)entity;
                                                n29 = (Integer)_datEntI32.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n29 = 0;
                                            }
                                            if (n29 >= 720) break block935;
                                            entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                            entity.f_19802_ = 20;
                                            if (entity instanceof LivingEntity) {
                                                ((LivingEntity)entity).f_20919_ = 0;
                                            }
                                            ((WitherskeletontitanEntity)entity).setHEALTS(200000.0);
                                            if (entity instanceof Mob) {
                                                _entity = (Mob)entity;
                                                _entity.m_6710_(null);
                                            }
                                            if (entity instanceof LivingEntity) {
                                                _entity = (LivingEntity)entity;
                                                _entity.m_21153_(2000000.0f);
                                            }
                                            if (entity instanceof WitherskeletontitanEntity) {
                                                _datEntI4 = (WitherskeletontitanEntity)entity;
                                                n28 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n28 = 0;
                                            }
                                            if (n28 == 450 && world instanceof ServerLevel) {
                                                ServerLevel _level22 = (ServerLevel)world;
                                                Entity entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level22, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                                if (entityToSpawn2 != null) {
                                                    entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                }
                                            }
                                            if (entity instanceof WitherskeletontitanEntity) {
                                                _datEntI4 = (WitherskeletontitanEntity)entity;
                                                n27 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n27 = 0;
                                            }
                                            if (n27 <= 10 && entity instanceof WitherskeletontitanEntity) {
                                                ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.spawn2");
                                            }
                                            if (entity instanceof WitherskeletontitanEntity) {
                                                _datEntI4 = (WitherskeletontitanEntity)entity;
                                                n26 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                            } else {
                                                n26 = 0;
                                            }
                                            if (n26 == 719) {
                                                if (world instanceof Level) {
                                                    _level2 = (Level)world;
                                                    if (!_level2.m_5776_()) {
                                                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                    } else {
                                                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                    }
                                                }
                                                if (!world.m_5776_() && world.m_7654_() != null) {
                                                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Witherskeletontitan has been created!!!"), false);
                                                }
                                            }
                                            if (entity.m_20096_()) break block935;
                                            if (entity.m_20186_() < -63.0) {
                                                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                            } else {
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                            break block935;
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI3 = (WitherskeletontitanEntity)entity;
                                            n25 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n25 = 0;
                                        }
                                        if (n25 >= 510) break block935;
                                        entity.m_6593_((Component)Component.m_237113_((String)"Witherskeletontitan"));
                                        if (entity instanceof LivingEntity) {
                                            ((LivingEntity)entity).f_20919_ = 0;
                                        }
                                        if (entity instanceof LivingEntity) {
                                            _entity = (LivingEntity)entity;
                                            _entity.m_21153_(2000000.0f);
                                        }
                                        entity.f_19802_ = 20;
                                        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                        if (!entity.m_20096_()) {
                                            if (entity.m_20186_() > -63.0) {
                                                entity.m_20256_(new Vec3(0.0, -2.0, 0.0));
                                            } else {
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n24 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n24 = 0;
                                        }
                                        if (n24 == 1 && world instanceof Level) {
                                            _level2 = (Level)world;
                                            if (!_level2.m_5776_()) {
                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n23 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n23 = 0;
                                        }
                                        if (n23 == 240 && world instanceof ServerLevel) {
                                            _level2 = (ServerLevel)world;
                                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                            if (entityToSpawn != null) {
                                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                            }
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n22 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n22 = 0;
                                        }
                                        if (n22 <= 10 && entity instanceof WitherskeletontitanEntity) {
                                            ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.spawn1");
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n21 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n21 = 0;
                                        }
                                        if (n21 == 42) {
                                            if (world instanceof Level) {
                                                _level2 = (Level)world;
                                                if (!_level2.m_5776_()) {
                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanbeginmove")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                } else {
                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanbeginmove")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                }
                                            }
                                            if (world instanceof Level) {
                                                _level2 = (Level)world;
                                                if (!_level2.m_5776_()) {
                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                } else {
                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                }
                                            }
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n20 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n20 = 0;
                                        }
                                        if (n20 == 120) {
                                            if (world instanceof Level) {
                                                _level2 = (Level)world;
                                                if (!_level2.m_5776_()) {
                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                                } else {
                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                                }
                                            }
                                            if (world instanceof Level) {
                                                _level2 = (Level)world;
                                                if (!_level2.m_5776_()) {
                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                } else {
                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                }
                                            }
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n19 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 == 310 && world instanceof Level) {
                                            _level2 = (Level)world;
                                            if (!_level2.m_5776_()) {
                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n18 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 == 509 && !world.m_5776_() && world.m_7654_() != null) {
                                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Witherskeletontitan awake!!!"), false);
                                        }
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI4 = (WitherskeletontitanEntity)entity;
                                            n17 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n17 = 0;
                                        }
                                        if (n17 == 120) break block936;
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            WitherskeletontitanEntity _datEntI6 = (WitherskeletontitanEntity)entity;
                                            n16 = (Integer)_datEntI6.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n16 = 0;
                                        }
                                        if (n16 == 366) break block936;
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntI5 = (WitherskeletontitanEntity)entity;
                                            n15 = (Integer)_datEntI5.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                        } else {
                                            n15 = 0;
                                        }
                                        if (n15 != 402) break block935;
                                    }
                                    _center = new Vec3(x, y, z);
                                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    for (Entity entityiterator : list) {
                                        if (entityiterator instanceof WitherskeletontitanEntity) continue;
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
                                    if (entity instanceof WitherskeletontitanEntity) {
                                        _datEntI3 = (WitherskeletontitanEntity)entity;
                                        n31 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
                                    } else {
                                        n31 = 0;
                                    }
                                    if (n31 != 0) {
                                        float f4;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt6 = (LivingEntity)entity;
                                            f4 = _livEnt6.m_21223_();
                                        } else {
                                            f4 = -1.0f;
                                        }
                                        if (f4 <= 0.0f) {
                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                if (!(entity instanceof WitherskeletontitanEntity)) continue;
                                                ((WitherskeletontitanEntity)entity).setAnimation("empty");
                                            }
                                        }
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt4 = (LivingEntity)entity;
                                    f3 = _livEnt4.m_21223_();
                                } else {
                                    f3 = -1.0f;
                                }
                                if (f3 > 0.0f && entity instanceof WitherskeletontitanEntity) {
                                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof WitherskeletontitanEntity) {
                                    _datEntI3 = (WitherskeletontitanEntity)entity;
                                    n14 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 < 510) break block937;
                                if (entity instanceof WitherskeletontitanEntity) {
                                    _datEntI4 = (WitherskeletontitanEntity)entity;
                                    n13 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 == 0) {
                                    int n32;
                                    if (entity instanceof WitherskeletontitanEntity) {
                                        WitherskeletontitanEntity _datEntI7 = (WitherskeletontitanEntity)entity;
                                        n32 = (Integer)_datEntI7.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_flyID);
                                    } else {
                                        n32 = 0;
                                    }
                                    if (n32 != 0) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                    }
                                }
                                if (world.m_5776_()) break block937;
                                if (entity instanceof WitherskeletontitanEntity) {
                                    _datEntI4 = (WitherskeletontitanEntity)entity;
                                    n12 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
                                } else {
                                    n12 = 0;
                                }
                                if (n12 != 0 && entity instanceof WitherskeletontitanEntity) {
                                    int n33;
                                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof WitherskeletontitanEntity) {
                                        WitherskeletontitanEntity _datEntI52 = (WitherskeletontitanEntity)entity;
                                        n33 = (Integer)_datEntI52.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                                    } else {
                                        n33 = 0;
                                    }
                                    synchedEntityData.m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)(n33 + 1));
                                }
                                if (entity instanceof Mob) {
                                    Mob _mobEnt5 = (Mob)entity;
                                    livingEntity4 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity4 = null;
                                }
                                if (livingEntity4 == null) break block938;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt6 = (Mob)entity;
                                    v27 = _mobEnt6.m_5448_();
                                } else {
                                    v27 = livingEntity3 = null;
                                }
                                if (livingEntity3 instanceof LivingEntity) {
                                    LivingEntity _livEnt5 = livingEntity3;
                                    f2 = _livEnt5.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 <= 0.0f) break block939;
                                if (entity instanceof Mob) {
                                    _mobEnt42 = (Mob)entity;
                                    livingEntity2 = _mobEnt42.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block938;
                            }
                            if (entity instanceof WitherskeletontitanEntity) {
                                WitherskeletontitanEntity witherskeletontitanEntity = (WitherskeletontitanEntity)entity;
                                witherskeletontitanEntity.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_flyID, (Object)0);
                            }
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                mob.m_6710_(null);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity = _mobEnt4.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            float f5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt7 = (Mob)entity;
                                v31 = _mobEnt7.m_5448_();
                            } else {
                                v31 = _mobEnt42 = null;
                            }
                            if (_mobEnt42 instanceof LivingEntity) {
                                LivingEntity _livEnt4 = _mobEnt42;
                                f5 = _livEnt4.m_21223_();
                            } else {
                                f5 = -1.0f;
                            }
                            if (f5 > 0.0f) {
                                int n34;
                                if (entity instanceof WitherskeletontitanEntity) {
                                    WitherskeletontitanEntity _datEntI8 = (WitherskeletontitanEntity)entity;
                                    n34 = (Integer)_datEntI8.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
                                } else {
                                    n34 = 0;
                                }
                                if (n34 == 0) {
                                    float f6;
                                    LivingEntity livingEntity5;
                                    Mob _mobEnt5;
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
                                            Mob _mobEnt22 = (Mob)entity;
                                            livingEntity9 = _mobEnt22.m_5448_();
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
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity10 = _mobEnt3.m_5448_();
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
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity14 = _mobEnt2.m_5448_();
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
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity12 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity12 = null;
                                        }
                                        double d3 = d2 + (double)livingEntity12.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity11 = _mobEnt2.m_5448_();
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
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity15 = _mobEnt3.m_5448_();
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
                                            Mob _mobEnt11 = (Mob)entity;
                                            livingEntity21 = _mobEnt11.m_5448_();
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
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity22 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity22 = null;
                                            }
                                            f12 = entity.m_20270_(livingEntity22);
                                        } else {
                                            f12 = -1.0f;
                                        }
                                        double d4 = d / (double)f12 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity19 = _mobEnt8.m_5448_();
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
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity23 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity23 = null;
                                            }
                                            f11 = entity.m_20270_(livingEntity23);
                                        } else {
                                            f11 = -1.0f;
                                        }
                                        double d6 = d5 / (double)f11 * 2.0;
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity17 = _mobEnt8.m_5448_();
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
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity24 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity24 = null;
                                            }
                                            f10 = entity.m_20270_(livingEntity24);
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d4, d6, d7 / (double)f10 * 2.0));
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntSetI = (WitherskeletontitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_flyID, (Object)1);
                                        }
                                    } else {
                                        LivingEntity livingEntity25;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity25 = _mobEnt2.m_5448_();
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
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity27 = _mobEnt8.m_5448_();
                                                } else {
                                                    livingEntity27 = null;
                                                }
                                                f13 = entity.m_20270_(livingEntity27);
                                            } else {
                                                f13 = -1.0f;
                                            }
                                            if (f13 > 32.0f) {
                                                float f14;
                                                LivingEntity livingEntity28;
                                                LivingEntity livingEntity29;
                                                float f15;
                                                LivingEntity livingEntity30;
                                                LivingEntity livingEntity31;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt10 = (Mob)entity;
                                                    livingEntity31 = _mobEnt10.m_5448_();
                                                } else {
                                                    livingEntity31 = null;
                                                }
                                                double d = livingEntity31.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt9 = (Mob)entity;
                                                    livingEntity30 = _mobEnt9.m_5448_();
                                                } else {
                                                    livingEntity30 = null;
                                                }
                                                if (livingEntity30 != null) {
                                                    LivingEntity livingEntity32;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt82 = (Mob)entity;
                                                        livingEntity32 = _mobEnt82.m_5448_();
                                                    } else {
                                                        livingEntity32 = null;
                                                    }
                                                    f15 = entity.m_20270_(livingEntity32);
                                                } else {
                                                    f15 = -1.0f;
                                                }
                                                double d8 = d / (double)f15;
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity29 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity29 = null;
                                                }
                                                double d9 = livingEntity29.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity28 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity28 = null;
                                                }
                                                if (livingEntity28 != null) {
                                                    LivingEntity livingEntity33;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity33 = _mobEnt5.m_5448_();
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
                                                    _mobEnt8 = (Mob)entity;
                                                    livingEntity35 = _mobEnt8.m_5448_();
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
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity39 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity39 = null;
                                                }
                                                double d = livingEntity39.m_20185_() - entity.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity38 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity38 = null;
                                                }
                                                if (livingEntity38 != null) {
                                                    LivingEntity livingEntity40;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity40 = _mobEnt5.m_5448_();
                                                    } else {
                                                        livingEntity40 = null;
                                                    }
                                                    f18 = entity.m_20270_(livingEntity40);
                                                } else {
                                                    f18 = -1.0f;
                                                }
                                                double d10 = d / (double)f18;
                                                if (entity instanceof Mob) {
                                                    _mobEnt7 = (Mob)entity;
                                                    livingEntity37 = _mobEnt7.m_5448_();
                                                } else {
                                                    livingEntity37 = null;
                                                }
                                                double d11 = livingEntity37.m_20189_() - entity.m_20189_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity36 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity36 = null;
                                                }
                                                if (livingEntity36 != null) {
                                                    LivingEntity livingEntity41;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity41 = _mobEnt5.m_5448_();
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
                                        if (entity instanceof WitherskeletontitanEntity) {
                                            _datEntSetI = (WitherskeletontitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_flyID, (Object)0);
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
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity42 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity42 = null;
                                        }
                                        f6 = entity.m_20270_(livingEntity42);
                                    } else {
                                        f6 = -1.0f;
                                    }
                                    if (f6 < 160.0f) {
                                        float f19;
                                        LivingEntity livingEntity43;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity43 = _mobEnt2.m_5448_();
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
                                        if (f19 <= 40.0f) {
                                            LivingEntity livingEntity45;
                                            if (entity instanceof Mob) {
                                                _mobEnt8 = (Mob)entity;
                                                livingEntity45 = _mobEnt8.m_5448_();
                                            } else {
                                                livingEntity45 = null;
                                            }
                                            if (livingEntity45.m_20206_() > 6.0f) {
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)20) == 10) {
                                                    if (entity instanceof WitherskeletontitanEntity) {
                                                        _datEntSetI = (WitherskeletontitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)5);
                                                    }
                                                } else if (entity instanceof WitherskeletontitanEntity) {
                                                    _datEntSetI = (WitherskeletontitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)4);
                                                }
                                            } else if (entity instanceof WitherskeletontitanEntity) {
                                                _datEntSetI = (WitherskeletontitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                            }
                                        }
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            int n35;
                                            if (entity instanceof WitherskeletontitanEntity) {
                                                _datEntI2 = (WitherskeletontitanEntity)entity;
                                                n35 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
                                            } else {
                                                n35 = 0;
                                            }
                                            if (n35 == 0) {
                                                float f20;
                                                LivingEntity livingEntity46;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt19 = (Mob)entity;
                                                    livingEntity46 = _mobEnt19.m_5448_();
                                                } else {
                                                    livingEntity46 = null;
                                                }
                                                if (livingEntity46 != null) {
                                                    LivingEntity livingEntity47;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt8 = (Mob)entity;
                                                        livingEntity47 = _mobEnt8.m_5448_();
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
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity48 = _mobEnt5.m_5448_();
                                                    } else {
                                                        livingEntity48 = null;
                                                    }
                                                    if (livingEntity48.m_20206_() > 6.0f) {
                                                        if (entity instanceof WitherskeletontitanEntity) {
                                                            _datEntSetI = (WitherskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
                                                        }
                                                    } else if (entity instanceof WitherskeletontitanEntity) {
                                                        _datEntSetI = (WitherskeletontitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
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
                                                    if (f21 > 40.0f) {
                                                        LivingEntity livingEntity51;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt7 = (Mob)entity;
                                                            livingEntity51 = _mobEnt7.m_5448_();
                                                        } else {
                                                            livingEntity51 = null;
                                                        }
                                                        if (livingEntity51.m_20206_() > 6.0f) {
                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 10) {
                                                                if (entity instanceof WitherskeletontitanEntity) {
                                                                    _datEntSetI = (WitherskeletontitanEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)5);
                                                                }
                                                            } else if (entity instanceof WitherskeletontitanEntity) {
                                                                _datEntSetI = (WitherskeletontitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)4);
                                                            }
                                                        } else if (entity instanceof WitherskeletontitanEntity) {
                                                            _datEntSetI = (WitherskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
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
                        LivingEntity _livEnt5 = (LivingEntity)entity;
                        f = _livEnt5.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= 0.0f) {
                        int n36;
                        if (entity instanceof Mob) {
                            _entity = (Mob)entity;
                            _entity.m_6710_(null);
                        }
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI4 = (WitherskeletontitanEntity)entity;
                            n36 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
                        } else {
                            n36 = 0;
                        }
                        if (n36 == 0) {
                            int n37;
                            int n38;
                            int n39;
                            int n40;
                            int n41;
                            if (entity instanceof WitherskeletontitanEntity) {
                                int n42;
                                WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                if (entity instanceof WitherskeletontitanEntity) {
                                    _datEntI5 = (WitherskeletontitanEntity)entity;
                                    n42 = (Integer)_datEntI5.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_deathTick);
                                } else {
                                    n42 = 0;
                                }
                                synchedEntityData.m_135381_(WitherskeletontitanEntity.DATA_deathTick, (Object)(n42 + 1));
                            }
                            if (entity instanceof WitherskeletontitanEntity) {
                                WitherskeletontitanEntity _datEntI9 = (WitherskeletontitanEntity)entity;
                                n41 = (Integer)_datEntI9.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_deathTick);
                            } else {
                                n41 = 0;
                            }
                            if (n41 == 1 && world instanceof Level) {
                                Level _level3 = (Level)world;
                                if (!_level3.m_5776_()) {
                                    _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof WitherskeletontitanEntity) {
                                WitherskeletontitanEntity _datEntI10 = (WitherskeletontitanEntity)entity;
                                n40 = (Integer)_datEntI10.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_deathTick);
                            } else {
                                n40 = 0;
                            }
                            if (n40 < 3) {
                                for (int index1 = 0; index1 < 12; ++index1) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                }
                            }
                            if (entity instanceof WitherskeletontitanEntity) {
                                WitherskeletontitanEntity _datEntI11 = (WitherskeletontitanEntity)entity;
                                n39 = (Integer)_datEntI11.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_deathTick);
                            } else {
                                n39 = 0;
                            }
                            if (n39 < 10 && entity instanceof WitherskeletontitanEntity) {
                                ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.death");
                            }
                            if (entity instanceof WitherskeletontitanEntity) {
                                WitherskeletontitanEntity _datEntI12 = (WitherskeletontitanEntity)entity;
                                n38 = (Integer)_datEntI12.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_deathTick);
                            } else {
                                n38 = 0;
                            }
                            if (n38 == 430) {
                                if (world instanceof ServerLevel) {
                                    ServerLevel _level4 = (ServerLevel)world;
                                    _level4.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level4, 4, "", (Component)Component.m_237113_((String)""), _level4.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"witherskeletontitan\"'}");
                                }
                                for (int index2 = 0; index2 < 320; ++index2) {
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                }
                            }
                            if (entity instanceof WitherskeletontitanEntity) {
                                WitherskeletontitanEntity _datEntI13 = (WitherskeletontitanEntity)entity;
                                n37 = (Integer)_datEntI13.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_deathTick);
                            } else {
                                n37 = 0;
                            }
                            if (n37 >= 430 && !entity.m_9236_().m_5776_()) {
                                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                            }
                        }
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI3 = (WitherskeletontitanEntity)entity;
                        n11 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
                    } else {
                        n11 = 0;
                    }
                    if (n11 != true) break block940;
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.zt");
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI4 = (WitherskeletontitanEntity)entity;
                        n10 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 1) {
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
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI4 = (WitherskeletontitanEntity)entity;
                        n9 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 70) break block941;
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntI14 = (WitherskeletontitanEntity)entity;
                        n8 = (Integer)_datEntI14.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 != 114) break block942;
                }
                if (world instanceof Level) {
                    Level _level5 = (Level)world;
                    if (!_level5.m_5776_()) {
                        _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entityiterator2 : _entfound) {
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
                    LivingEntity _livEnt6;
                    int n47;
                    float f28;
                    if (entityiterator2 instanceof WitherskeletontitanEntity || entityiterator2 instanceof GiantwitherskeletonEntity || entityiterator2 instanceof SkeletontitanEntity || entityiterator2 instanceof GiantskeletonEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entityiterator2;
                        f28 = _livEnt7.m_21233_();
                    } else {
                        f28 = -1.0f;
                    }
                    float f29 = f28 / 20.0f + 5000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntI22 = (WitherskeletontitanEntity)entity;
                        n47 = (Integer)_datEntI22.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n47 = 0;
                    }
                    entityiterator2.m_6469_(damageSource, f29 + (float)(n47 * 50));
                    if (entityiterator2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                        entityiterator2.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator2);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator2;
                        f27 = _livEnt6.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    float f30 = f27 / 20.0f + 5000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI2 = (WitherskeletontitanEntity)entity;
                        n46 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n46 = 0;
                    }
                    entityiterator2.m_6469_(damageSource2, f30 + (float)(n46 * 50));
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator2;
                        f26 = _livEnt6.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    float f31 = f26 / 20.0f + 5000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI2 = (WitherskeletontitanEntity)entity;
                        n45 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n45 = 0;
                    }
                    entityiterator2.m_6469_(damageSource3, f31 + (float)(n45 * 50));
                    entityiterator2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator2;
                        f25 = _livEnt3.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator2;
                        f24 = _livEnt6.m_21223_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f32 = (f25 + f24) / 5.0f + 50000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI2 = (WitherskeletontitanEntity)entity;
                        n44 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n44 = 0;
                    }
                    entityiterator2.m_6469_(damageSource4, f32 + (float)(n44 * 500));
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt3 = (LivingEntity)entityiterator2;
                        f23 = _livEnt3.m_21233_();
                    } else {
                        f23 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt6 = (LivingEntity)entityiterator2;
                        f = _livEnt6.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f33 = (f23 + f) / 5.0f + 50000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI2 = (WitherskeletontitanEntity)entity;
                        n43 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n43 = 0;
                    }
                    entityiterator2.m_6469_(damageSource5, f33 + (float)(n43 * 500));
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n7 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n7 = 0;
            }
            if (n7 >= 160) {
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WitherskeletontitanEntity) {
            _datEntI3 = (WitherskeletontitanEntity)entity;
            n6 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 2) {
            int n48;
            int n49;
            float f;
            LivingEntity livingEntity;
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.zp1");
                }
            } else if (entity instanceof WitherskeletontitanEntity) {
                ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.zp2");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
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
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n49 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n49 = 0;
            }
            if (n49 == 26) {
                if (world instanceof Level) {
                    Level _level6 = (Level)world;
                    if (!_level6.m_5776_()) {
                        _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center3 = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
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
                    if (entity2 instanceof WitherskeletontitanEntity || entity2 instanceof GiantwitherskeletonEntity || entity2 instanceof SkeletontitanEntity || entity2 instanceof GiantskeletonEntity || !(entity2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        LivingEntity _livEnt22 = (LivingEntity)entity2;
                        f40 = _livEnt22.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    float f41 = f40 / 20.0f + 10000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n54 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n54 = 0;
                    }
                    entity2.m_6469_(damageSource, f41 + (float)(n54 * 50));
                    if (entity2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity2 instanceof Player)) {
                        entity2.f_19802_ = 0;
                        Deathlist.normalattack(entity2);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity2;
                        f39 = _livEnt2.m_21233_();
                    } else {
                        f39 = -1.0f;
                    }
                    float f42 = f39 / 20.0f + 10000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n53 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n53 = 0;
                    }
                    entity2.m_6469_(damageSource6, f42 + (float)(n53 * 50));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity2;
                        f38 = _livEnt2.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    float f43 = f38 / 20.0f + 10000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n52 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n52 = 0;
                    }
                    entity2.m_6469_(damageSource7, f43 + (float)(n52 * 50));
                    entity2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entity2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entity2;
                        f37 = _livEnt8.m_21233_();
                    } else {
                        f37 = -1.0f;
                    }
                    if (entity2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity2;
                        f36 = _livEnt2.m_21223_();
                    } else {
                        f36 = -1.0f;
                    }
                    float f44 = (f37 + f36) / 5.0f + 100000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n51 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n51 = 0;
                    }
                    entity2.m_6469_(damageSource8, f44 + (float)(n51 * 500));
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity2 instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entity2;
                        f35 = _livEnt7.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    if (entity2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity2;
                        f34 = _livEnt2.m_21223_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f45 = (f35 + f34) / 5.0f + 100000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n50 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n50 = 0;
                    }
                    entity2.m_6469_(damageSource9, f45 + (float)(n50 * 500));
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n48 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 >= 44) {
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WitherskeletontitanEntity) {
            _datEntI3 = (WitherskeletontitanEntity)entity;
            n5 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 3) {
            int n55;
            int n56;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof WitherskeletontitanEntity) {
                ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.qj");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
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
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n56 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 == 44) {
                if (world instanceof Level) {
                    Level _level7 = (Level)world;
                    if (!_level7.m_5776_()) {
                        _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center4 = new Vec3(x, y, z);
                List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                for (Entity entity3 : _entfound4) {
                    int n57;
                    float f46;
                    float f47;
                    int n58;
                    float f48;
                    float f49;
                    int n59;
                    float f50;
                    int n60;
                    float f51;
                    int n61;
                    float f52;
                    if (entity3 instanceof WitherskeletontitanEntity || entity3 instanceof GiantwitherskeletonEntity || entity3 instanceof SkeletontitanEntity || entity3 instanceof GiantskeletonEntity || !(entity3 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity3;
                        f52 = _livEnt2.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    float f53 = f52 / 20.0f + 6000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n61 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n61 = 0;
                    }
                    entity3.m_6469_(damageSource, f53 + (float)(n61 * 50));
                    if (entity3 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity3 instanceof Player)) {
                        entity3.f_19802_ = 0;
                        Deathlist.normalattack(entity3);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity3;
                        f51 = _livEnt2.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    float f54 = f51 / 20.0f + 6000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n60 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n60 = 0;
                    }
                    entity3.m_6469_(damageSource10, f54 + (float)(n60 * 50));
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity3;
                        f50 = _livEnt2.m_21233_();
                    } else {
                        f50 = -1.0f;
                    }
                    float f55 = f50 / 20.0f + 6000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n59 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n59 = 0;
                    }
                    entity3.m_6469_(damageSource11, f55 + (float)(n59 * 50));
                    entity3.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity3.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entity3;
                        f49 = _livEnt9.m_21233_();
                    } else {
                        f49 = -1.0f;
                    }
                    if (entity3 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity3;
                        f48 = _livEnt2.m_21223_();
                    } else {
                        f48 = -1.0f;
                    }
                    float f56 = (f49 + f48) / 5.0f + 60000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n58 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n58 = 0;
                    }
                    entity3.m_6469_(damageSource12, f56 + (float)(n58 * 500));
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity3 instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entity3;
                        f47 = _livEnt8.m_21233_();
                    } else {
                        f47 = -1.0f;
                    }
                    if (entity3 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity3;
                        f46 = _livEnt2.m_21223_();
                    } else {
                        f46 = -1.0f;
                    }
                    float f57 = (f47 + f46) / 5.0f + 60000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n57 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n57 = 0;
                    }
                    entity3.m_6469_(damageSource13, f57 + (float)(n57 * 500));
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n55 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 >= 70) {
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WitherskeletontitanEntity) {
            _datEntI3 = (WitherskeletontitanEntity)entity;
            n4 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 4) {
            int n62;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
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
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n62 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
            } else {
                n62 = 0;
            }
            if (n62 > 10000) {
                int n63;
                int n64;
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.godattack1");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.godattack2");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.godattack3");
                    }
                } else if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.godattack4");
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI15 = (WitherskeletontitanEntity)entity;
                    n64 = (Integer)_datEntI15.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n64 = 0;
                }
                if (n64 == 10) {
                    if (world instanceof Level) {
                        Level _level8 = (Level)world;
                        if (!_level8.m_5776_()) {
                            _level8.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                        } else {
                            _level8.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                        }
                    }
                    Vec3 _center5 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                    for (Entity entityiterator : _entfound) {
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
                        LivingEntity _livEnt9;
                        int n69;
                        float f64;
                        if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt10 = (LivingEntity)entityiterator;
                            f64 = _livEnt10.m_21233_();
                        } else {
                            f64 = -1.0f;
                        }
                        float f65 = f64 / 20.0f + 28000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n69 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n69 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f65 + (float)(n69 * 50));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f63 = _livEnt9.m_21233_();
                        } else {
                            f63 = -1.0f;
                        }
                        float f66 = f63 / 20.0f + 28000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n68 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n68 = 0;
                        }
                        entityiterator.m_6469_(damageSource14, f66 + (float)(n68 * 50));
                        DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f62 = _livEnt9.m_21233_();
                        } else {
                            f62 = -1.0f;
                        }
                        float f67 = f62 / 20.0f + 28000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n67 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n67 = 0;
                        }
                        entityiterator.m_6469_(damageSource15, f67 + (float)(n67 * 50));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f61 = _livEnt3.m_21233_();
                        } else {
                            f61 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f60 = _livEnt9.m_21223_();
                        } else {
                            f60 = -1.0f;
                        }
                        float f68 = (f61 + f60) / 5.0f + 280000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n66 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n66 = 0;
                        }
                        entityiterator.m_6469_(damageSource16, f68 + (float)(n66 * 500));
                        DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f59 = _livEnt3.m_21233_();
                        } else {
                            f59 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt9 = (LivingEntity)entityiterator;
                            f58 = _livEnt9.m_21223_();
                        } else {
                            f58 = -1.0f;
                        }
                        float f69 = (f59 + f58) / 5.0f + 280000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n65 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n65 = 0;
                        }
                        entityiterator.m_6469_(damageSource17, f69 + (float)(n65 * 500));
                    }
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI16 = (WitherskeletontitanEntity)entity;
                    n63 = (Integer)_datEntI16.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n63 = 0;
                }
                if (n63 >= 18) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("empty");
                    }
                }
            } else {
                int n70;
                int n71;
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.attack");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.attack1");
                    }
                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.attack3");
                    }
                } else if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.attack4");
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI17 = (WitherskeletontitanEntity)entity;
                    n71 = (Integer)_datEntI17.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n71 = 0;
                }
                if (n71 == 16) {
                    if (world instanceof Level) {
                        Level _level9 = (Level)world;
                        if (!_level9.m_5776_()) {
                            _level9.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                        } else {
                            _level9.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                        }
                    }
                    Vec3 _center6 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                    for (Entity entityiterator : _entfound) {
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
                        LivingEntity _livEnt10;
                        int n76;
                        float f76;
                        if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt11 = (LivingEntity)entityiterator;
                            f76 = _livEnt11.m_21233_();
                        } else {
                            f76 = -1.0f;
                        }
                        float f77 = f76 / 20.0f + 28000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n76 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n76 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f77 + (float)(n76 * 50));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f75 = _livEnt10.m_21233_();
                        } else {
                            f75 = -1.0f;
                        }
                        float f78 = f75 / 20.0f + 28000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n75 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n75 = 0;
                        }
                        entityiterator.m_6469_(damageSource18, f78 + (float)(n75 * 50));
                        DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f74 = _livEnt10.m_21233_();
                        } else {
                            f74 = -1.0f;
                        }
                        float f79 = f74 / 20.0f + 28000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n74 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n74 = 0;
                        }
                        entityiterator.m_6469_(damageSource19, f79 + (float)(n74 * 50));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f73 = _livEnt3.m_21233_();
                        } else {
                            f73 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f72 = _livEnt10.m_21223_();
                        } else {
                            f72 = -1.0f;
                        }
                        float f80 = (f73 + f72) / 5.0f + 280000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n73 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n73 = 0;
                        }
                        entityiterator.m_6469_(damageSource20, f80 + (float)(n73 * 500));
                        DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f71 = _livEnt3.m_21233_();
                        } else {
                            f71 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f70 = _livEnt10.m_21223_();
                        } else {
                            f70 = -1.0f;
                        }
                        float f81 = (f71 + f70) / 5.0f + 280000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n72 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n72 = 0;
                        }
                        entityiterator.m_6469_(damageSource21, f81 + (float)(n72 * 500));
                    }
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI18 = (WitherskeletontitanEntity)entity;
                    n70 = (Integer)_datEntI18.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n70 = 0;
                }
                if (n70 >= 30) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("empty");
                    }
                }
            }
        }
        if (entity instanceof WitherskeletontitanEntity) {
            _datEntI3 = (WitherskeletontitanEntity)entity;
            n3 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 5) {
            int n77;
            int n78;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n78 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n78 = 0;
            }
            if (n78 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt34 = (Mob)entity;
                    livingEntity = _mobEnt34.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity72;
                    if (entity instanceof Mob) {
                        Mob _mobEnt35 = (Mob)entity;
                        livingEntity72 = _mobEnt35.m_5448_();
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
                        _mobEnt = (Mob)entity;
                        livingEntity76 = _mobEnt.m_5448_();
                    } else {
                        livingEntity76 = null;
                    }
                    double d = livingEntity76.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity75 = mob.m_5448_();
                    } else {
                        livingEntity75 = null;
                    }
                    double d20 = livingEntity75.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity74 = _mobEnt.m_5448_();
                    } else {
                        livingEntity74 = null;
                    }
                    double d21 = d20 + (double)livingEntity74.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity73 = _mobEnt.m_5448_();
                    } else {
                        livingEntity73 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d21, livingEntity73.m_20189_()));
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n77 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
            } else {
                n77 = 0;
            }
            if (n77 > 10000) {
                int n79;
                int n80;
                int n81;
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.godlightning");
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI19 = (WitherskeletontitanEntity)entity;
                    n81 = (Integer)_datEntI19.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n81 = 0;
                }
                if (n81 >= 18) {
                    int n82;
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntI20 = (WitherskeletontitanEntity)entity;
                        n82 = (Integer)_datEntI20.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                    } else {
                        n82 = 0;
                    }
                    if (n82 <= 32 && world instanceof ServerLevel) {
                        int n83;
                        int n84;
                        _level = (ServerLevel)world;
                        LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                        double d = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI = (WitherskeletontitanEntity)entity;
                            n84 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                        } else {
                            n84 = 0;
                        }
                        double d22 = x + d * (double)(n84 - 2);
                        double d23 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI = (WitherskeletontitanEntity)entity;
                            n83 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                        } else {
                            n83 = 0;
                        }
                        lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d22, (double)(y + 36.0), (double)(z + d23 * (double)(n83 - 2)))));
                        _level.m_7967_((Entity)lightningBolt);
                    }
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI21 = (WitherskeletontitanEntity)entity;
                    n80 = (Integer)_datEntI21.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n80 = 0;
                }
                if (n80 >= 32) {
                    int n85;
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntI22 = (WitherskeletontitanEntity)entity;
                        n85 = (Integer)_datEntI22.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                    } else {
                        n85 = 0;
                    }
                    if (n85 <= 36) {
                        float f;
                        LivingEntity livingEntity;
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity = _mobEnt.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity77;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity77 = mob.m_5448_();
                            } else {
                                livingEntity77 = null;
                            }
                            f = entity.m_20270_(livingEntity77);
                        } else {
                            f = -1.0f;
                        }
                        if (f > 1.0f && world instanceof ServerLevel) {
                            LivingEntity livingEntity78;
                            LivingEntity livingEntity79;
                            LivingEntity livingEntity80;
                            ServerLevel _level10 = (ServerLevel)world;
                            LightningBolt entityToSpawn3 = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level10);
                            if (entity instanceof Mob) {
                                Mob _mobEnt36 = (Mob)entity;
                                livingEntity80 = _mobEnt36.m_5448_();
                            } else {
                                livingEntity80 = null;
                            }
                            double d = livingEntity80.m_20185_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt37 = (Mob)entity;
                                livingEntity79 = _mobEnt37.m_5448_();
                            } else {
                                livingEntity79 = null;
                            }
                            double d24 = livingEntity79.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt38 = (Mob)entity;
                                livingEntity78 = _mobEnt38.m_5448_();
                            } else {
                                livingEntity78 = null;
                            }
                            entityToSpawn3.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)d24, (double)livingEntity78.m_20189_())));
                            entityToSpawn3.m_20874_(true);
                            _level10.m_7967_((Entity)entityToSpawn3);
                        }
                        for (int index3 = 0; index3 < 8; ++index3) {
                            if (!(world instanceof ServerLevel)) continue;
                            ServerLevel serverLevel = (ServerLevel)world;
                            entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)serverLevel);
                            entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)))));
                            entityToSpawn.m_20874_(true);
                            serverLevel.m_7967_((Entity)entityToSpawn);
                        }
                        _center = new Vec3(x, y, z);
                        List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(240.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                        for (Entity entityiterator : list) {
                            int n86;
                            float f82;
                            float f83;
                            int n87;
                            float f84;
                            float f85;
                            int n88;
                            float f86;
                            int n89;
                            WitherskeletontitanEntity _datEntI6;
                            float f87;
                            int n90;
                            float f88;
                            if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                LivingEntity _livEnt32 = (LivingEntity)entityiterator;
                                f88 = _livEnt32.m_21233_();
                            } else {
                                f88 = -1.0f;
                            }
                            float f89 = f88 / 20.0f + 10000.0f;
                            if (entity instanceof WitherskeletontitanEntity) {
                                WitherskeletontitanEntity _datEntI23 = (WitherskeletontitanEntity)entity;
                                n90 = (Integer)_datEntI23.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                            } else {
                                n90 = 0;
                            }
                            entityiterator.m_6469_(damageSource, f89 + (float)(n90 * 50));
                            if (entityiterator instanceof Titangodentity) continue;
                            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                entityiterator.f_19802_ = 0;
                                Deathlist.normalattack(entityiterator);
                            }
                            DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt3 = (LivingEntity)entityiterator;
                                f87 = _livEnt3.m_21233_();
                            } else {
                                f87 = -1.0f;
                            }
                            float f90 = f87 / 20.0f + 10000.0f;
                            if (entity instanceof WitherskeletontitanEntity) {
                                _datEntI6 = (WitherskeletontitanEntity)entity;
                                n89 = (Integer)_datEntI6.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                            } else {
                                n89 = 0;
                            }
                            entityiterator.m_6469_(damageSource22, f90 + (float)(n89 * 50));
                            DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt3 = (LivingEntity)entityiterator;
                                f86 = _livEnt3.m_21233_();
                            } else {
                                f86 = -1.0f;
                            }
                            float f91 = f86 / 20.0f + 10000.0f;
                            if (entity instanceof WitherskeletontitanEntity) {
                                _datEntI6 = (WitherskeletontitanEntity)entity;
                                n88 = (Integer)_datEntI6.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                            } else {
                                n88 = 0;
                            }
                            entityiterator.m_6469_(damageSource23, f91 + (float)(n88 * 50));
                            entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                            if (!(entityiterator.m_20206_() > 6.0f)) continue;
                            DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entityiterator;
                                f85 = _livEnt.m_21233_();
                            } else {
                                f85 = -1.0f;
                            }
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt3 = (LivingEntity)entityiterator;
                                f84 = _livEnt3.m_21223_();
                            } else {
                                f84 = -1.0f;
                            }
                            float f92 = (f85 + f84) / 5.0f + 100000.0f;
                            if (entity instanceof WitherskeletontitanEntity) {
                                _datEntI6 = (WitherskeletontitanEntity)entity;
                                n87 = (Integer)_datEntI6.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                            } else {
                                n87 = 0;
                            }
                            entityiterator.m_6469_(damageSource24, f92 + (float)(n87 * 500));
                            DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entityiterator;
                                f83 = _livEnt.m_21233_();
                            } else {
                                f83 = -1.0f;
                            }
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt3 = (LivingEntity)entityiterator;
                                f82 = _livEnt3.m_21223_();
                            } else {
                                f82 = -1.0f;
                            }
                            float f93 = (f83 + f82) / 5.0f + 100000.0f;
                            if (entity instanceof WitherskeletontitanEntity) {
                                _datEntI6 = (WitherskeletontitanEntity)entity;
                                n86 = (Integer)_datEntI6.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                            } else {
                                n86 = 0;
                            }
                            entityiterator.m_6469_(damageSource25, f93 + (float)(n86 * 500));
                        }
                    }
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI24 = (WitherskeletontitanEntity)entity;
                    n79 = (Integer)_datEntI24.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n79 = 0;
                }
                if (n79 >= 48) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("empty");
                    }
                }
            } else {
                int n91;
                int n92;
                int n93;
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.sd2");
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI25 = (WitherskeletontitanEntity)entity;
                    n93 = (Integer)_datEntI25.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n93 = 0;
                }
                if (n93 >= 32) {
                    int n94;
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntI26 = (WitherskeletontitanEntity)entity;
                        n94 = (Integer)_datEntI26.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                    } else {
                        n94 = 0;
                    }
                    if (n94 <= 56 && world instanceof ServerLevel) {
                        int n95;
                        int n96;
                        _level = (ServerLevel)world;
                        LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                        double d = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI = (WitherskeletontitanEntity)entity;
                            n96 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                        } else {
                            n96 = 0;
                        }
                        double d25 = x + d * (double)(n96 - 16);
                        double d26 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI = (WitherskeletontitanEntity)entity;
                            n95 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                        } else {
                            n95 = 0;
                        }
                        lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d25, (double)(y + 36.0), (double)(z + d26 * (double)(n95 - 16)))));
                        _level.m_7967_((Entity)lightningBolt);
                    }
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI27 = (WitherskeletontitanEntity)entity;
                    n92 = (Integer)_datEntI27.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n92 = 0;
                }
                if (n92 == 64) {
                    float f;
                    LivingEntity livingEntity;
                    if (world instanceof Level) {
                        Level _level11 = (Level)world;
                        if (!_level11.m_5776_()) {
                            _level11.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                        } else {
                            _level11.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                        }
                    }
                    if (entity instanceof Mob) {
                        Mob _mobEnt39 = (Mob)entity;
                        livingEntity = _mobEnt39.m_5448_();
                    } else {
                        livingEntity = null;
                    }
                    if (livingEntity != null) {
                        LivingEntity livingEntity81;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity81 = _mobEnt.m_5448_();
                        } else {
                            livingEntity81 = null;
                        }
                        f = entity.m_20270_(livingEntity81);
                    } else {
                        f = -1.0f;
                    }
                    if (f > 1.0f && world instanceof ServerLevel) {
                        LivingEntity livingEntity82;
                        LivingEntity livingEntity83;
                        LivingEntity livingEntity84;
                        ServerLevel serverLevel = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)serverLevel);
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity84 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity84 = null;
                        }
                        double d = livingEntity84.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity83 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity83 = null;
                        }
                        double d27 = livingEntity83.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity82 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity82 = null;
                        }
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)d27, (double)livingEntity82.m_20189_())));
                        entityToSpawn.m_20874_(true);
                        serverLevel.m_7967_((Entity)entityToSpawn);
                    }
                    for (int index4 = 0; index4 < 32; ++index4) {
                        if (!(world instanceof ServerLevel)) continue;
                        _level = (ServerLevel)world;
                        LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                        lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)))));
                        lightningBolt.m_20874_(true);
                        _level.m_7967_((Entity)lightningBolt);
                    }
                    Vec3 _center7 = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center7, _center7).m_82400_(240.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center7))).toList();
                    for (Entity entityiterator : _entfound) {
                        int n97;
                        float f94;
                        float f95;
                        int n98;
                        float f96;
                        float f97;
                        int n99;
                        float f98;
                        int n100;
                        float f99;
                        LivingEntity _livEnt11;
                        int n101;
                        float f100;
                        if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt12 = (LivingEntity)entityiterator;
                            f100 = _livEnt12.m_21233_();
                        } else {
                            f100 = -1.0f;
                        }
                        float f101 = f100 / 20.0f + 10000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n101 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n101 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f101 + (float)(n101 * 50));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt11 = (LivingEntity)entityiterator;
                            f99 = _livEnt11.m_21233_();
                        } else {
                            f99 = -1.0f;
                        }
                        float f102 = f99 / 20.0f + 10000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n100 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n100 = 0;
                        }
                        entityiterator.m_6469_(damageSource26, f102 + (float)(n100 * 50));
                        DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt11 = (LivingEntity)entityiterator;
                            f98 = _livEnt11.m_21233_();
                        } else {
                            f98 = -1.0f;
                        }
                        float f103 = f98 / 20.0f + 10000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n99 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n99 = 0;
                        }
                        entityiterator.m_6469_(damageSource27, f103 + (float)(n99 * 50));
                        entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f97 = _livEnt3.m_21233_();
                        } else {
                            f97 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt11 = (LivingEntity)entityiterator;
                            f96 = _livEnt11.m_21223_();
                        } else {
                            f96 = -1.0f;
                        }
                        float f104 = (f97 + f96) / 5.0f + 100000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n98 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n98 = 0;
                        }
                        entityiterator.m_6469_(damageSource28, f104 + (float)(n98 * 500));
                        DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f95 = _livEnt3.m_21233_();
                        } else {
                            f95 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt11 = (LivingEntity)entityiterator;
                            f94 = _livEnt11.m_21223_();
                        } else {
                            f94 = -1.0f;
                        }
                        float f105 = (f95 + f94) / 5.0f + 100000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI2 = (WitherskeletontitanEntity)entity;
                            n97 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n97 = 0;
                        }
                        entityiterator.m_6469_(damageSource29, f105 + (float)(n97 * 500));
                    }
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntI28 = (WitherskeletontitanEntity)entity;
                    n91 = (Integer)_datEntI28.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
                } else {
                    n91 = 0;
                }
                if (n91 >= 90) {
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                        _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                    }
                    if (entity instanceof WitherskeletontitanEntity) {
                        ((WitherskeletontitanEntity)entity).setAnimation("empty");
                    }
                }
            }
        }
        if (entity instanceof WitherskeletontitanEntity) {
            _datEntI3 = (WitherskeletontitanEntity)entity;
            n2 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 6) {
            int n102;
            int n103;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof WitherskeletontitanEntity) {
                ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.sd");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity85;
                if (entity instanceof Mob) {
                    Mob _mobEnt40 = (Mob)entity;
                    livingEntity85 = _mobEnt40.m_5448_();
                } else {
                    livingEntity85 = null;
                }
                f = entity.m_20270_(livingEntity85);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity86;
                LivingEntity livingEntity87;
                LivingEntity livingEntity88;
                LivingEntity livingEntity89;
                if (entity instanceof Mob) {
                    Mob _mobEnt41 = (Mob)entity;
                    livingEntity89 = _mobEnt41.m_5448_();
                } else {
                    livingEntity89 = null;
                }
                double d = livingEntity89.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity88 = _mobEnt.m_5448_();
                } else {
                    livingEntity88 = null;
                }
                double d28 = livingEntity88.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt42 = (Mob)entity;
                    livingEntity87 = _mobEnt42.m_5448_();
                } else {
                    livingEntity87 = null;
                }
                double d29 = d28 + (double)livingEntity87.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt43 = (Mob)entity;
                    livingEntity86 = _mobEnt43.m_5448_();
                } else {
                    livingEntity86 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d29, livingEntity86.m_20189_()));
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n103 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n103 = 0;
            }
            if (n103 == 42) {
                float f106;
                LivingEntity livingEntity90;
                if (world instanceof Level) {
                    Level _level12 = (Level)world;
                    if (!_level12.m_5776_()) {
                        _level12.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level12.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt44 = (Mob)entity;
                    livingEntity90 = _mobEnt44.m_5448_();
                } else {
                    livingEntity90 = null;
                }
                if (livingEntity90 != null) {
                    LivingEntity livingEntity91;
                    if (entity instanceof Mob) {
                        Mob _mobEnt45 = (Mob)entity;
                        livingEntity91 = _mobEnt45.m_5448_();
                    } else {
                        livingEntity91 = null;
                    }
                    f106 = entity.m_20270_(livingEntity91);
                } else {
                    f106 = -1.0f;
                }
                if (f106 > 1.0f) {
                    LivingEntity livingEntity92;
                    LivingEntity livingEntity93;
                    LivingEntity livingEntity94;
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity95;
                        LivingEntity livingEntity96;
                        LivingEntity livingEntity97;
                        _level = (ServerLevel)world;
                        LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity97 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity97 = null;
                        }
                        double d = livingEntity97.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity96 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity96 = null;
                        }
                        double d30 = livingEntity96.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity95 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity95 = null;
                        }
                        lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)d, (double)d30, (double)livingEntity95.m_20189_())));
                        lightningBolt.m_20874_(true);
                        _level.m_7967_((Entity)lightningBolt);
                    }
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity94 = mob.m_5448_();
                    } else {
                        livingEntity94 = null;
                    }
                    double d = livingEntity94.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity93 = mob.m_5448_();
                    } else {
                        livingEntity93 = null;
                    }
                    double d31 = livingEntity93.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity92 = mob.m_5448_();
                    } else {
                        livingEntity92 = null;
                    }
                    _center = new Vec3(d, d31, livingEntity92.m_20189_());
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : list) {
                        int n104;
                        float f107;
                        float f108;
                        int n105;
                        float f109;
                        float f110;
                        int n106;
                        float f111;
                        int n107;
                        WitherskeletontitanEntity _datEntI7;
                        float f112;
                        int n108;
                        float f113;
                        if (entityiterator instanceof WitherskeletontitanEntity || entityiterator instanceof GiantwitherskeletonEntity || entityiterator instanceof SkeletontitanEntity || entityiterator instanceof GiantskeletonEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f113 = _livEnt3.m_21233_();
                        } else {
                            f113 = -1.0f;
                        }
                        float f114 = f113 / 20.0f + 8000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            WitherskeletontitanEntity _datEntI29 = (WitherskeletontitanEntity)entity;
                            n108 = (Integer)_datEntI29.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n108 = 0;
                        }
                        entityiterator.m_6469_(damageSource, f114 + (float)(n108 * 50));
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f112 = _livEnt3.m_21233_();
                        } else {
                            f112 = -1.0f;
                        }
                        float f115 = f112 / 20.0f + 8000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI7 = (WitherskeletontitanEntity)entity;
                            n107 = (Integer)_datEntI7.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n107 = 0;
                        }
                        entityiterator.m_6469_(damageSource30, f115 + (float)(n107 * 50));
                        DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f111 = _livEnt3.m_21233_();
                        } else {
                            f111 = -1.0f;
                        }
                        float f116 = f111 / 20.0f + 8000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI7 = (WitherskeletontitanEntity)entity;
                            n106 = (Integer)_datEntI7.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n106 = 0;
                        }
                        entityiterator.m_6469_(damageSource31, f116 + (float)(n106 * 50));
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f110 = _livEnt.m_21233_();
                        } else {
                            f110 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f109 = _livEnt3.m_21223_();
                        } else {
                            f109 = -1.0f;
                        }
                        float f117 = (f110 + f109) / 5.0f + 80000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI7 = (WitherskeletontitanEntity)entity;
                            n105 = (Integer)_datEntI7.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n105 = 0;
                        }
                        entityiterator.m_6469_(damageSource32, f117 + (float)(n105 * 500));
                        DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f108 = _livEnt.m_21233_();
                        } else {
                            f108 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt3 = (LivingEntity)entityiterator;
                            f107 = _livEnt3.m_21223_();
                        } else {
                            f107 = -1.0f;
                        }
                        float f118 = (f108 + f107) / 5.0f + 80000.0f;
                        if (entity instanceof WitherskeletontitanEntity) {
                            _datEntI7 = (WitherskeletontitanEntity)entity;
                            n104 = (Integer)_datEntI7.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n104 = 0;
                        }
                        entityiterator.m_6469_(damageSource33, f118 + (float)(n104 * 500));
                    }
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n102 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n102 = 0;
            }
            if (n102 >= 60) {
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof WitherskeletontitanEntity) {
            _datEntI3 = (WitherskeletontitanEntity)entity;
            n = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 7) {
            int n109;
            int n110;
            int n111;
            int n112;
            if (entity instanceof WitherskeletontitanEntity) {
                ((WitherskeletontitanEntity)entity).setAnimation("animation.witherskeletontitan.zz");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n112 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n112 = 0;
            }
            if (n112 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt46 = (Mob)entity;
                    livingEntity = _mobEnt46.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity98;
                    if (entity instanceof Mob) {
                        Mob _mobEnt47 = (Mob)entity;
                        livingEntity98 = _mobEnt47.m_5448_();
                    } else {
                        livingEntity98 = null;
                    }
                    f = entity.m_20270_(livingEntity98);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity99;
                    LivingEntity livingEntity100;
                    LivingEntity livingEntity101;
                    LivingEntity livingEntity102;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity102 = _mobEnt.m_5448_();
                    } else {
                        livingEntity102 = null;
                    }
                    double d = livingEntity102.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity101 = mob.m_5448_();
                    } else {
                        livingEntity101 = null;
                    }
                    double d32 = livingEntity101.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity100 = _mobEnt.m_5448_();
                    } else {
                        livingEntity100 = null;
                    }
                    double d33 = d32 + (double)livingEntity100.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity99 = _mobEnt.m_5448_();
                    } else {
                        livingEntity99 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d33, livingEntity99.m_20189_()));
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n111 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n111 = 0;
            }
            if (n111 == 96) {
                if (world instanceof Level) {
                    Level _level13 = (Level)world;
                    if (!_level13.m_5776_()) {
                        _level13.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level13.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center8 = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center8, _center8).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center8))).toList();
                for (Entity entity4 : _entfound5) {
                    int n113;
                    float f;
                    float f119;
                    int n114;
                    float f120;
                    float f121;
                    int n115;
                    float f122;
                    int n116;
                    float f123;
                    int n117;
                    float f124;
                    if (entity4 instanceof WitherskeletontitanEntity || entity4 instanceof GiantwitherskeletonEntity || entity4 instanceof SkeletontitanEntity || entity4 instanceof GiantskeletonEntity || !(entity4 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity4;
                        f124 = _livEnt2.m_21233_();
                    } else {
                        f124 = -1.0f;
                    }
                    float f125 = f124 / 10.0f + 75000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n117 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n117 = 0;
                    }
                    entity4.m_6469_(damageSource, f125 + (float)(n117 * 50));
                    if (entity4 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity4 instanceof Player)) {
                        entity4.f_19802_ = 0;
                        Deathlist.normalattack(entity4);
                    }
                    DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity4;
                        f123 = _livEnt2.m_21233_();
                    } else {
                        f123 = -1.0f;
                    }
                    float f126 = f123 / 10.0f + 75000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n116 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n116 = 0;
                    }
                    entity4.m_6469_(damageSource34, f126 + (float)(n116 * 50));
                    DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity4;
                        f122 = _livEnt2.m_21233_();
                    } else {
                        f122 = -1.0f;
                    }
                    float f127 = f122 / 10.0f + 75000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n115 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n115 = 0;
                    }
                    entity4.m_6469_(damageSource35, f127 + (float)(n115 * 50));
                    entity4.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity4.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        LivingEntity _livEnt13 = (LivingEntity)entity4;
                        f121 = _livEnt13.m_21233_();
                    } else {
                        f121 = -1.0f;
                    }
                    if (entity4 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity4;
                        f120 = _livEnt2.m_21223_();
                    } else {
                        f120 = -1.0f;
                    }
                    float f128 = (f121 + f120) / 5.0f + 750000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n114 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n114 = 0;
                    }
                    entity4.m_6469_(damageSource36, f128 + (float)(n114 * 500));
                    DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity4 instanceof LivingEntity) {
                        LivingEntity _livEnt12 = (LivingEntity)entity4;
                        f119 = _livEnt12.m_21233_();
                    } else {
                        f119 = -1.0f;
                    }
                    if (entity4 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity4;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    float f129 = (f119 + f) / 5.0f + 750000.0f;
                    if (entity instanceof WitherskeletontitanEntity) {
                        _datEntI = (WitherskeletontitanEntity)entity;
                        n113 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n113 = 0;
                    }
                    entity4.m_6469_(damageSource37, f129 + (float)(n113 * 500));
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n110 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n110 = 0;
            }
            if (n110 == 162 && world instanceof Level) {
                Level _level14 = (Level)world;
                if (!_level14.m_5776_()) {
                    _level14.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:sworddrag")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level14.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:sworddrag")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof WitherskeletontitanEntity) {
                _datEntI4 = (WitherskeletontitanEntity)entity;
                n109 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_animationTick);
            } else {
                n109 = 0;
            }
            if (n109 >= 260) {
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity _datEntSetI = (WitherskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontitanEntity) {
                    ((WitherskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

