/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.StarskeletonpowertitanEntity;
import net.mcreator.ultimateskeletons.entity.TitanswordedgeEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
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
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class StarskeletonpowertitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        Object entityToSpawn;
        LivingEntity _livEnt;
        Object _level;
        Object _mobEnt;
        Mob _mobEnt2;
        Vec3 _center;
        StarskeletonpowertitanEntity _datEntI;
        StarskeletonpowertitanEntity _datEntI2;
        block904: {
            int n4;
            int n5;
            int n6;
            block906: {
                List<Entity> _entfound;
                block905: {
                    int n7;
                    int n8;
                    float f;
                    LivingEntity livingEntity;
                    int n9;
                    block901: {
                        int n10;
                        block903: {
                            block902: {
                                int n11;
                                int n12;
                                int n13;
                                float f2;
                                LivingEntity livingEntity2;
                                int n14;
                                block898: {
                                    int n15;
                                    block900: {
                                        block899: {
                                            int n16;
                                            int n17;
                                            float f3;
                                            LivingEntity livingEntity3;
                                            int n18;
                                            int n19;
                                            int n20;
                                            int n21;
                                            LivingEntity _livEnt2;
                                            block895: {
                                                int n22;
                                                block897: {
                                                    block896: {
                                                        int n23;
                                                        int n24;
                                                        int n25;
                                                        int n26;
                                                        float f4;
                                                        StarskeletonpowertitanEntity _datEntI3;
                                                        LivingEntity _entity;
                                                        block892: {
                                                            LivingEntity livingEntity4;
                                                            LivingEntity _mobEnt3;
                                                            block893: {
                                                                block894: {
                                                                    LivingEntity livingEntity5;
                                                                    float f5;
                                                                    LivingEntity livingEntity6;
                                                                    LivingEntity livingEntity7;
                                                                    int n27;
                                                                    int n28;
                                                                    int n29;
                                                                    float f6;
                                                                    block890: {
                                                                        block891: {
                                                                            int n30;
                                                                            int n31;
                                                                            int n32;
                                                                            int n33;
                                                                            int n34;
                                                                            int n35;
                                                                            int n36;
                                                                            int n37;
                                                                            ServerLevel _level2;
                                                                            int n38;
                                                                            int n39;
                                                                            int n40;
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
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                int n41;
                                                                                StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                    StarskeletonpowertitanEntity _datEntI22 = (StarskeletonpowertitanEntity)entity;
                                                                                    n41 = (Integer)_datEntI22.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n41 = 0;
                                                                                }
                                                                                synchedEntityData.m_135381_(StarskeletonpowertitanEntity.DATA_spawnTick, (Object)(n41 + 1));
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                                                n40 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n40 = 0;
                                                                            }
                                                                            if (n40 >= 470) break block890;
                                                                            if (entity instanceof LivingEntity) {
                                                                                ((LivingEntity)entity).f_20919_ = 0;
                                                                            }
                                                                            if (entity instanceof LivingEntity) {
                                                                                _entity = (LivingEntity)entity;
                                                                                _entity.m_21153_(600000.0f);
                                                                            }
                                                                            entity.f_19802_ = 20;
                                                                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                            if (entity.m_20186_() < -63.0) {
                                                                                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n39 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n39 = 0;
                                                                            }
                                                                            if (n39 == 1 && world instanceof Level) {
                                                                                Level _level22 = (Level)world;
                                                                                if (!_level22.m_5776_()) {
                                                                                    _level22.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                } else {
                                                                                    _level22.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                }
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n38 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n38 = 0;
                                                                            }
                                                                            if (n38 == 200 && world instanceof ServerLevel) {
                                                                                _level2 = (ServerLevel)world;
                                                                                Entity entityToSpawn3 = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level2, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                                                                if (entityToSpawn3 != null) {
                                                                                    entityToSpawn3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                                }
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n37 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n37 = 0;
                                                                            }
                                                                            if (n37 <= 10 && entity instanceof StarskeletonpowertitanEntity) {
                                                                                ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.spawn");
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n36 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n36 = 0;
                                                                            }
                                                                            if (n36 == 30) {
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
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n35 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n35 = 0;
                                                                            }
                                                                            if (n35 == 100) {
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
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n34 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n34 = 0;
                                                                            }
                                                                            if (n34 == 305 && world instanceof Level) {
                                                                                _level2 = (Level)world;
                                                                                if (!_level2.m_5776_()) {
                                                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                } else {
                                                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                }
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n33 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n33 = 0;
                                                                            }
                                                                            if (n33 == 469 && !world.m_5776_() && world.m_7654_() != null) {
                                                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Skeletonpowertitan awake!!!"), false);
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                                n32 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n32 = 0;
                                                                            }
                                                                            if (n32 == 100) break block891;
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                StarskeletonpowertitanEntity _datEntI4 = (StarskeletonpowertitanEntity)entity;
                                                                                n31 = (Integer)_datEntI4.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n31 = 0;
                                                                            }
                                                                            if (n31 == 340) break block891;
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntI3 = (StarskeletonpowertitanEntity)entity;
                                                                                n30 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                            } else {
                                                                                n30 = 0;
                                                                            }
                                                                            if (n30 != 375) break block890;
                                                                        }
                                                                        _center = new Vec3(x, y, z);
                                                                        List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(300.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                        for (Entity entityiterator2 : list) {
                                                                            if (entityiterator2 instanceof StarskeletonpowertitanEntity) continue;
                                                                            entityiterator2.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                                                                            double _setval = 5.0;
                                                                            entityiterator2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                capability.camerashake = _setval;
                                                                                capability.syncPlayerVariables(entityiterator2);
                                                                            });
                                                                        }
                                                                    }
                                                                    if (!world.m_5776_()) {
                                                                        int n42;
                                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                                            _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                                            n42 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                                                        } else {
                                                                            n42 = 0;
                                                                        }
                                                                        if (n42 != 0) {
                                                                            float f7;
                                                                            if (entity instanceof LivingEntity) {
                                                                                LivingEntity _livEnt6 = (LivingEntity)entity;
                                                                                f7 = _livEnt6.m_21223_();
                                                                            } else {
                                                                                f7 = -1.0f;
                                                                            }
                                                                            if (f7 <= 0.0f) {
                                                                                for (int index0 = 0; index0 < 16; ++index0) {
                                                                                    if (!(entity instanceof StarskeletonpowertitanEntity)) continue;
                                                                                    ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (entity instanceof LivingEntity) {
                                                                        LivingEntity _livEnt4 = (LivingEntity)entity;
                                                                        f6 = _livEnt4.m_21223_();
                                                                    } else {
                                                                        f6 = -1.0f;
                                                                    }
                                                                    if (f6 > 0.0f && entity instanceof StarskeletonpowertitanEntity) {
                                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_deathTick, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                                        _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                                        n29 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_spawnTick);
                                                                    } else {
                                                                        n29 = 0;
                                                                    }
                                                                    if (n29 < 470) break block892;
                                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                                        _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                        n28 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                                                    } else {
                                                                        n28 = 0;
                                                                    }
                                                                    if (n28 == 0) {
                                                                        int n43;
                                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                                            StarskeletonpowertitanEntity _datEntI5 = (StarskeletonpowertitanEntity)entity;
                                                                            n43 = (Integer)_datEntI5.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_flyID);
                                                                        } else {
                                                                            n43 = 0;
                                                                        }
                                                                        if (n43 != 0) {
                                                                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                                                        }
                                                                    }
                                                                    if (world.m_5776_()) break block892;
                                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                                        _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                        n27 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                                                    } else {
                                                                        n27 = 0;
                                                                    }
                                                                    if (n27 != 0 && entity instanceof StarskeletonpowertitanEntity) {
                                                                        int n44;
                                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                                            StarskeletonpowertitanEntity _datEntI32 = (StarskeletonpowertitanEntity)entity;
                                                                            n44 = (Integer)_datEntI32.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                                        } else {
                                                                            n44 = 0;
                                                                        }
                                                                        synchedEntityData.m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)(n44 + 1));
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt4 = (Mob)entity;
                                                                        livingEntity7 = _mobEnt4.m_5448_();
                                                                    } else {
                                                                        livingEntity7 = null;
                                                                    }
                                                                    if (livingEntity7 == null) break block893;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt5 = (Mob)entity;
                                                                        v23 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        v23 = livingEntity6 = null;
                                                                    }
                                                                    if (livingEntity6 instanceof LivingEntity) {
                                                                        LivingEntity _livEnt5 = livingEntity6;
                                                                        f5 = _livEnt5.m_21223_();
                                                                    } else {
                                                                        f5 = -1.0f;
                                                                    }
                                                                    if (f5 <= 0.0f) break block894;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity5 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity5 = null;
                                                                    }
                                                                    if (livingEntity5.m_6084_()) break block893;
                                                                }
                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                    StarskeletonpowertitanEntity starskeletonpowertitanEntity = (StarskeletonpowertitanEntity)entity;
                                                                    starskeletonpowertitanEntity.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_flyID, (Object)0);
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    mob.m_6710_(null);
                                                                }
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt2 = (Mob)entity;
                                                                livingEntity4 = _mobEnt2.m_5448_();
                                                            } else {
                                                                livingEntity4 = null;
                                                            }
                                                            if (livingEntity4 != null) {
                                                                float f8;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt6 = (Mob)entity;
                                                                    v27 = _mobEnt6.m_5448_();
                                                                } else {
                                                                    v27 = _mobEnt3 = null;
                                                                }
                                                                if (_mobEnt3 instanceof LivingEntity) {
                                                                    LivingEntity _livEnt3 = _mobEnt3;
                                                                    f8 = _livEnt3.m_21223_();
                                                                } else {
                                                                    f8 = -1.0f;
                                                                }
                                                                if (f8 > 0.0f) {
                                                                    int n45;
                                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                                        StarskeletonpowertitanEntity _datEntI6 = (StarskeletonpowertitanEntity)entity;
                                                                        n45 = (Integer)_datEntI6.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                                                    } else {
                                                                        n45 = 0;
                                                                    }
                                                                    if (n45 == 0) {
                                                                        float f9;
                                                                        LivingEntity livingEntity8;
                                                                        Mob _mobEnt4;
                                                                        Mob _mobEnt5;
                                                                        Mob _mobEnt6;
                                                                        Mob _mobEnt7;
                                                                        float f10;
                                                                        LivingEntity livingEntity9;
                                                                        Mob _mobEnt8;
                                                                        float f11;
                                                                        LivingEntity livingEntity10;
                                                                        float f12;
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
                                                                                Mob mob = (Mob)entity;
                                                                                livingEntity12 = mob.m_5448_();
                                                                            } else {
                                                                                livingEntity12 = null;
                                                                            }
                                                                            f12 = entity.m_20270_(livingEntity12);
                                                                        } else {
                                                                            f12 = -1.0f;
                                                                        }
                                                                        if (f12 >= 160.0f) {
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
                                                                                Mob mob = (Mob)entity;
                                                                                livingEntity13 = mob.m_5448_();
                                                                            } else {
                                                                                livingEntity13 = null;
                                                                            }
                                                                            f11 = entity.m_20270_(livingEntity13);
                                                                        } else {
                                                                            f11 = -1.0f;
                                                                        }
                                                                        if (f11 > 4.0f) {
                                                                            LivingEntity livingEntity14;
                                                                            LivingEntity livingEntity15;
                                                                            LivingEntity livingEntity16;
                                                                            LivingEntity livingEntity17;
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt11 = (Mob)entity;
                                                                                livingEntity17 = _mobEnt11.m_5448_();
                                                                            } else {
                                                                                livingEntity17 = null;
                                                                            }
                                                                            double d = livingEntity17.m_20185_();
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt12 = (Mob)entity;
                                                                                livingEntity16 = _mobEnt12.m_5448_();
                                                                            } else {
                                                                                livingEntity16 = null;
                                                                            }
                                                                            double d2 = livingEntity16.m_20186_();
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt8 = (Mob)entity;
                                                                                livingEntity15 = _mobEnt8.m_5448_();
                                                                            } else {
                                                                                livingEntity15 = null;
                                                                            }
                                                                            double d3 = d2 + (double)livingEntity15.m_20206_() / 1.5;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt8 = (Mob)entity;
                                                                                livingEntity14 = _mobEnt8.m_5448_();
                                                                            } else {
                                                                                livingEntity14 = null;
                                                                            }
                                                                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity14.m_20189_()));
                                                                        }
                                                                        if (entity instanceof Mob) {
                                                                            Mob mob = (Mob)entity;
                                                                            livingEntity9 = mob.m_5448_();
                                                                        } else {
                                                                            livingEntity9 = null;
                                                                        }
                                                                        if (livingEntity9 != null) {
                                                                            LivingEntity livingEntity18;
                                                                            if (entity instanceof Mob) {
                                                                                Mob mob = (Mob)entity;
                                                                                livingEntity18 = mob.m_5448_();
                                                                            } else {
                                                                                livingEntity18 = null;
                                                                            }
                                                                            f10 = entity.m_20270_(livingEntity18);
                                                                        } else {
                                                                            f10 = -1.0f;
                                                                        }
                                                                        if (f10 > 70.0f) {
                                                                            float f13;
                                                                            LivingEntity livingEntity19;
                                                                            LivingEntity livingEntity20;
                                                                            float f14;
                                                                            LivingEntity livingEntity21;
                                                                            LivingEntity livingEntity22;
                                                                            float f15;
                                                                            LivingEntity livingEntity23;
                                                                            LivingEntity livingEntity24;
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt10 = (Mob)entity;
                                                                                livingEntity24 = _mobEnt10.m_5448_();
                                                                            } else {
                                                                                livingEntity24 = null;
                                                                            }
                                                                            double d = livingEntity24.m_20185_() - entity.m_20185_();
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt13 = (Mob)entity;
                                                                                livingEntity23 = _mobEnt13.m_5448_();
                                                                            } else {
                                                                                livingEntity23 = null;
                                                                            }
                                                                            if (livingEntity23 != null) {
                                                                                LivingEntity livingEntity25;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt8 = (Mob)entity;
                                                                                    livingEntity25 = _mobEnt8.m_5448_();
                                                                                } else {
                                                                                    livingEntity25 = null;
                                                                                }
                                                                                f15 = entity.m_20270_(livingEntity25);
                                                                            } else {
                                                                                f15 = -1.0f;
                                                                            }
                                                                            double d4 = d / (double)f15 * 2.0;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt7 = (Mob)entity;
                                                                                livingEntity22 = _mobEnt7.m_5448_();
                                                                            } else {
                                                                                livingEntity22 = null;
                                                                            }
                                                                            double d5 = livingEntity22.m_20186_() - entity.m_20186_();
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt14 = (Mob)entity;
                                                                                livingEntity21 = _mobEnt14.m_5448_();
                                                                            } else {
                                                                                livingEntity21 = null;
                                                                            }
                                                                            if (livingEntity21 != null) {
                                                                                LivingEntity livingEntity26;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt8 = (Mob)entity;
                                                                                    livingEntity26 = _mobEnt8.m_5448_();
                                                                                } else {
                                                                                    livingEntity26 = null;
                                                                                }
                                                                                f14 = entity.m_20270_(livingEntity26);
                                                                            } else {
                                                                                f14 = -1.0f;
                                                                            }
                                                                            double d6 = d5 / (double)f14 * 2.0;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt7 = (Mob)entity;
                                                                                livingEntity20 = _mobEnt7.m_5448_();
                                                                            } else {
                                                                                livingEntity20 = null;
                                                                            }
                                                                            double d7 = livingEntity20.m_20189_() - entity.m_20189_();
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt15 = (Mob)entity;
                                                                                livingEntity19 = _mobEnt15.m_5448_();
                                                                            } else {
                                                                                livingEntity19 = null;
                                                                            }
                                                                            if (livingEntity19 != null) {
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
                                                                            entity.m_20256_(new Vec3(d4, d6, d7 / (double)f13 * 2.0));
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_flyID, (Object)1);
                                                                            }
                                                                        } else {
                                                                            LivingEntity livingEntity28;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt8 = (Mob)entity;
                                                                                livingEntity28 = _mobEnt8.m_5448_();
                                                                            } else {
                                                                                livingEntity28 = null;
                                                                            }
                                                                            if (livingEntity28.m_20206_() > 8.0f) {
                                                                                float f16;
                                                                                LivingEntity livingEntity29;
                                                                                if (entity instanceof Mob) {
                                                                                    Mob _mobEnt16 = (Mob)entity;
                                                                                    livingEntity29 = _mobEnt16.m_5448_();
                                                                                } else {
                                                                                    livingEntity29 = null;
                                                                                }
                                                                                if (livingEntity29 != null) {
                                                                                    LivingEntity livingEntity30;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt7 = (Mob)entity;
                                                                                        livingEntity30 = _mobEnt7.m_5448_();
                                                                                    } else {
                                                                                        livingEntity30 = null;
                                                                                    }
                                                                                    f16 = entity.m_20270_(livingEntity30);
                                                                                } else {
                                                                                    f16 = -1.0f;
                                                                                }
                                                                                if (f16 > 36.0f) {
                                                                                    float f17;
                                                                                    LivingEntity livingEntity31;
                                                                                    LivingEntity livingEntity32;
                                                                                    float f18;
                                                                                    LivingEntity livingEntity33;
                                                                                    LivingEntity livingEntity34;
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt9 = (Mob)entity;
                                                                                        livingEntity34 = _mobEnt9.m_5448_();
                                                                                    } else {
                                                                                        livingEntity34 = null;
                                                                                    }
                                                                                    double d = livingEntity34.m_20185_() - entity.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt82 = (Mob)entity;
                                                                                        livingEntity33 = _mobEnt82.m_5448_();
                                                                                    } else {
                                                                                        livingEntity33 = null;
                                                                                    }
                                                                                    if (livingEntity33 != null) {
                                                                                        LivingEntity livingEntity35;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt72 = (Mob)entity;
                                                                                            livingEntity35 = _mobEnt72.m_5448_();
                                                                                        } else {
                                                                                            livingEntity35 = null;
                                                                                        }
                                                                                        f18 = entity.m_20270_(livingEntity35);
                                                                                    } else {
                                                                                        f18 = -1.0f;
                                                                                    }
                                                                                    double d8 = d / (double)f18;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt6 = (Mob)entity;
                                                                                        livingEntity32 = _mobEnt6.m_5448_();
                                                                                    } else {
                                                                                        livingEntity32 = null;
                                                                                    }
                                                                                    double d9 = livingEntity32.m_20189_() - entity.m_20189_();
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt5 = (Mob)entity;
                                                                                        livingEntity31 = _mobEnt5.m_5448_();
                                                                                    } else {
                                                                                        livingEntity31 = null;
                                                                                    }
                                                                                    if (livingEntity31 != null) {
                                                                                        LivingEntity livingEntity36;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt4 = (Mob)entity;
                                                                                            livingEntity36 = _mobEnt4.m_5448_();
                                                                                        } else {
                                                                                            livingEntity36 = null;
                                                                                        }
                                                                                        f17 = entity.m_20270_(livingEntity36);
                                                                                    } else {
                                                                                        f17 = -1.0f;
                                                                                    }
                                                                                    entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f17));
                                                                                }
                                                                            } else {
                                                                                float f19;
                                                                                LivingEntity livingEntity37;
                                                                                if (entity instanceof Mob) {
                                                                                    Mob _mobEnt17 = (Mob)entity;
                                                                                    livingEntity37 = _mobEnt17.m_5448_();
                                                                                } else {
                                                                                    livingEntity37 = null;
                                                                                }
                                                                                if (livingEntity37 != null) {
                                                                                    LivingEntity livingEntity38;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt7 = (Mob)entity;
                                                                                        livingEntity38 = _mobEnt7.m_5448_();
                                                                                    } else {
                                                                                        livingEntity38 = null;
                                                                                    }
                                                                                    f19 = entity.m_20270_(livingEntity38);
                                                                                } else {
                                                                                    f19 = -1.0f;
                                                                                }
                                                                                if (f19 > 8.0f) {
                                                                                    float f20;
                                                                                    LivingEntity livingEntity39;
                                                                                    LivingEntity livingEntity40;
                                                                                    float f21;
                                                                                    LivingEntity livingEntity41;
                                                                                    LivingEntity livingEntity42;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt6 = (Mob)entity;
                                                                                        livingEntity42 = _mobEnt6.m_5448_();
                                                                                    } else {
                                                                                        livingEntity42 = null;
                                                                                    }
                                                                                    double d = livingEntity42.m_20185_() - entity.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt5 = (Mob)entity;
                                                                                        livingEntity41 = _mobEnt5.m_5448_();
                                                                                    } else {
                                                                                        livingEntity41 = null;
                                                                                    }
                                                                                    if (livingEntity41 != null) {
                                                                                        LivingEntity livingEntity43;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt4 = (Mob)entity;
                                                                                            livingEntity43 = _mobEnt4.m_5448_();
                                                                                        } else {
                                                                                            livingEntity43 = null;
                                                                                        }
                                                                                        f21 = entity.m_20270_(livingEntity43);
                                                                                    } else {
                                                                                        f21 = -1.0f;
                                                                                    }
                                                                                    double d10 = d / (double)f21;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt6 = (Mob)entity;
                                                                                        livingEntity40 = _mobEnt6.m_5448_();
                                                                                    } else {
                                                                                        livingEntity40 = null;
                                                                                    }
                                                                                    double d11 = livingEntity40.m_20189_() - entity.m_20189_();
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt5 = (Mob)entity;
                                                                                        livingEntity39 = _mobEnt5.m_5448_();
                                                                                    } else {
                                                                                        livingEntity39 = null;
                                                                                    }
                                                                                    if (livingEntity39 != null) {
                                                                                        LivingEntity livingEntity44;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt4 = (Mob)entity;
                                                                                            livingEntity44 = _mobEnt4.m_5448_();
                                                                                        } else {
                                                                                            livingEntity44 = null;
                                                                                        }
                                                                                        f20 = entity.m_20270_(livingEntity44);
                                                                                    } else {
                                                                                        f20 = -1.0f;
                                                                                    }
                                                                                    entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f20));
                                                                                }
                                                                            }
                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_flyID, (Object)0);
                                                                            }
                                                                        }
                                                                        if (entity instanceof Mob) {
                                                                            Mob mob = (Mob)entity;
                                                                            livingEntity8 = mob.m_5448_();
                                                                        } else {
                                                                            livingEntity8 = null;
                                                                        }
                                                                        if (livingEntity8 != null) {
                                                                            LivingEntity livingEntity45;
                                                                            if (entity instanceof Mob) {
                                                                                Mob mob = (Mob)entity;
                                                                                livingEntity45 = mob.m_5448_();
                                                                            } else {
                                                                                livingEntity45 = null;
                                                                            }
                                                                            f9 = entity.m_20270_(livingEntity45);
                                                                        } else {
                                                                            f9 = -1.0f;
                                                                        }
                                                                        if (f9 < 2048.0f) {
                                                                            float f22;
                                                                            LivingEntity livingEntity46;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt8 = (Mob)entity;
                                                                                livingEntity46 = _mobEnt8.m_5448_();
                                                                            } else {
                                                                                livingEntity46 = null;
                                                                            }
                                                                            if (livingEntity46 != null) {
                                                                                LivingEntity livingEntity47;
                                                                                if (entity instanceof Mob) {
                                                                                    Mob _mobEnt18 = (Mob)entity;
                                                                                    livingEntity47 = _mobEnt18.m_5448_();
                                                                                } else {
                                                                                    livingEntity47 = null;
                                                                                }
                                                                                f22 = entity.m_20270_(livingEntity47);
                                                                            } else {
                                                                                f22 = -1.0f;
                                                                            }
                                                                            if (f22 <= 44.0f) {
                                                                                LivingEntity livingEntity48;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt7 = (Mob)entity;
                                                                                    livingEntity48 = _mobEnt7.m_5448_();
                                                                                } else {
                                                                                    livingEntity48 = null;
                                                                                }
                                                                                if (livingEntity48.m_20206_() > 6.0f) {
                                                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)20) == 5) {
                                                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                            _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                            _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)8);
                                                                                        }
                                                                                    } else if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                        _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)7));
                                                                                    }
                                                                                } else if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                    _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                                                }
                                                                            }
                                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                                                int n46;
                                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                    StarskeletonpowertitanEntity _datEntI7 = (StarskeletonpowertitanEntity)entity;
                                                                                    n46 = (Integer)_datEntI7.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                                                                } else {
                                                                                    n46 = 0;
                                                                                }
                                                                                if (n46 == 0) {
                                                                                    float f23;
                                                                                    LivingEntity livingEntity49;
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt19 = (Mob)entity;
                                                                                        livingEntity49 = _mobEnt19.m_5448_();
                                                                                    } else {
                                                                                        livingEntity49 = null;
                                                                                    }
                                                                                    if (livingEntity49 != null) {
                                                                                        LivingEntity livingEntity50;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt7 = (Mob)entity;
                                                                                            livingEntity50 = _mobEnt7.m_5448_();
                                                                                        } else {
                                                                                            livingEntity50 = null;
                                                                                        }
                                                                                        f23 = entity.m_20270_(livingEntity50);
                                                                                    } else {
                                                                                        f23 = -1.0f;
                                                                                    }
                                                                                    if (f23 > 70.0f) {
                                                                                        LivingEntity livingEntity51;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt4 = (Mob)entity;
                                                                                            livingEntity51 = _mobEnt4.m_5448_();
                                                                                        } else {
                                                                                            livingEntity51 = null;
                                                                                        }
                                                                                        if (livingEntity51.m_20206_() > 6.0f) {
                                                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                                _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                                _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)8, (int)10));
                                                                                            }
                                                                                        } else if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                            _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                            _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)8, (int)10));
                                                                                        }
                                                                                    } else {
                                                                                        float f24;
                                                                                        LivingEntity livingEntity52;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt4 = (Mob)entity;
                                                                                            livingEntity52 = _mobEnt4.m_5448_();
                                                                                        } else {
                                                                                            livingEntity52 = null;
                                                                                        }
                                                                                        if (livingEntity52 != null) {
                                                                                            LivingEntity livingEntity53;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                livingEntity53 = _mobEnt5.m_5448_();
                                                                                            } else {
                                                                                                livingEntity53 = null;
                                                                                            }
                                                                                            f24 = entity.m_20270_(livingEntity53);
                                                                                        } else {
                                                                                            f24 = -1.0f;
                                                                                        }
                                                                                        if (f24 > 44.0f) {
                                                                                            LivingEntity livingEntity54;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt6 = (Mob)entity;
                                                                                                livingEntity54 = _mobEnt6.m_5448_();
                                                                                            } else {
                                                                                                livingEntity54 = null;
                                                                                            }
                                                                                            if (livingEntity54.m_20206_() > 6.0f) {
                                                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                                    _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)10));
                                                                                                }
                                                                                            } else if (entity instanceof StarskeletonpowertitanEntity) {
                                                                                                _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                                                _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)7, (int)10));
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
                                                            f4 = _livEnt4.m_21223_();
                                                        } else {
                                                            f4 = -1.0f;
                                                        }
                                                        if (f4 <= 0.0f) {
                                                            int n47;
                                                            if (entity instanceof Mob) {
                                                                _entity = (Mob)entity;
                                                                _entity.m_6710_(null);
                                                            }
                                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                                n47 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                                            } else {
                                                                n47 = 0;
                                                            }
                                                            if (n47 == 0) {
                                                                int n48;
                                                                int n49;
                                                                int n50;
                                                                int n51;
                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                    int n52;
                                                                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                                        _datEntI3 = (StarskeletonpowertitanEntity)entity;
                                                                        n52 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_deathTick);
                                                                    } else {
                                                                        n52 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(StarskeletonpowertitanEntity.DATA_deathTick, (Object)(n52 + 1));
                                                                }
                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                    StarskeletonpowertitanEntity _datEntI8 = (StarskeletonpowertitanEntity)entity;
                                                                    n51 = (Integer)_datEntI8.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_deathTick);
                                                                } else {
                                                                    n51 = 0;
                                                                }
                                                                if (n51 == 1 && world instanceof Level) {
                                                                    Level _level3 = (Level)world;
                                                                    if (!_level3.m_5776_()) {
                                                                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                    } else {
                                                                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                    StarskeletonpowertitanEntity _datEntI9 = (StarskeletonpowertitanEntity)entity;
                                                                    n50 = (Integer)_datEntI9.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_deathTick);
                                                                } else {
                                                                    n50 = 0;
                                                                }
                                                                if (n50 < 3) {
                                                                    for (int index1 = 0; index1 < 12; ++index1) {
                                                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                    StarskeletonpowertitanEntity _datEntI10 = (StarskeletonpowertitanEntity)entity;
                                                                    n49 = (Integer)_datEntI10.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_deathTick);
                                                                } else {
                                                                    n49 = 0;
                                                                }
                                                                if (n49 < 10 && entity instanceof StarskeletonpowertitanEntity) {
                                                                    ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.death");
                                                                }
                                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                                    StarskeletonpowertitanEntity _datEntI11 = (StarskeletonpowertitanEntity)entity;
                                                                    n48 = (Integer)_datEntI11.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_deathTick);
                                                                } else {
                                                                    n48 = 0;
                                                                }
                                                                if (n48 >= 280 && !entity.m_9236_().m_5776_()) {
                                                                    entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                                                }
                                                            }
                                                        }
                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                            _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                            n26 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                                        } else {
                                                            n26 = 0;
                                                        }
                                                        if (n26 != true) break block895;
                                                        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                            ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.treadling");
                                                        }
                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                            _datEntI = (StarskeletonpowertitanEntity)entity;
                                                            n25 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                        } else {
                                                            n25 = 0;
                                                        }
                                                        if (n25 == 1) {
                                                            float f25;
                                                            LivingEntity livingEntity55;
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt20 = (Mob)entity;
                                                                livingEntity55 = _mobEnt20.m_5448_();
                                                            } else {
                                                                livingEntity55 = null;
                                                            }
                                                            if (livingEntity55 != null) {
                                                                LivingEntity livingEntity56;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt21 = (Mob)entity;
                                                                    livingEntity56 = _mobEnt21.m_5448_();
                                                                } else {
                                                                    livingEntity56 = null;
                                                                }
                                                                f25 = entity.m_20270_(livingEntity56);
                                                            } else {
                                                                f25 = -1.0f;
                                                            }
                                                            if (f25 > 1.0f) {
                                                                LivingEntity livingEntity57;
                                                                LivingEntity livingEntity58;
                                                                LivingEntity livingEntity59;
                                                                LivingEntity livingEntity60;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity60 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity60 = null;
                                                                }
                                                                double d = livingEntity60.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity59 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity59 = null;
                                                                }
                                                                double d12 = livingEntity59.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity58 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity58 = null;
                                                                }
                                                                double d13 = d12 + (double)livingEntity58.m_20206_() / 1.5;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity57 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity57 = null;
                                                                }
                                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d13, livingEntity57.m_20189_()));
                                                            }
                                                        }
                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                            _datEntI = (StarskeletonpowertitanEntity)entity;
                                                            n24 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                        } else {
                                                            n24 = 0;
                                                        }
                                                        if (n24 == 70) break block896;
                                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                                            StarskeletonpowertitanEntity _datEntI12 = (StarskeletonpowertitanEntity)entity;
                                                            n23 = (Integer)_datEntI12.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                        } else {
                                                            n23 = 0;
                                                        }
                                                        if (n23 != 120) break block897;
                                                    }
                                                    if (world instanceof Level) {
                                                        Level _level4 = (Level)world;
                                                        if (!_level4.m_5776_()) {
                                                            _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    Vec3 _center2 = new Vec3(x, y, z);
                                                    List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                    for (Entity entity2 : _entfound2) {
                                                        float f26;
                                                        float f27;
                                                        float f28;
                                                        float f29;
                                                        float f30;
                                                        float f31;
                                                        float f32;
                                                        if (entity2 instanceof StarskeletonpowertitanEntity || !(entity2 instanceof LivingEntity)) continue;
                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity2 instanceof LivingEntity) {
                                                            LivingEntity _livEnt3 = (LivingEntity)entity2;
                                                            f32 = _livEnt3.m_21233_();
                                                        } else {
                                                            f32 = -1.0f;
                                                        }
                                                        entity2.m_6469_(damageSource, f32 / 20.0f + 40000.0f);
                                                        if (entity2 instanceof Titangodentity) continue;
                                                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity2 instanceof Player)) {
                                                            entity2.f_19802_ = 0;
                                                            Deathlist.normalattack(entity2);
                                                        }
                                                        DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                        if (entity2 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity2;
                                                            f31 = _livEnt2.m_21233_();
                                                        } else {
                                                            f31 = -1.0f;
                                                        }
                                                        entity2.m_6469_(damageSource2, f31 / 20.0f + 40000.0f);
                                                        DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                        if (entity2 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity2;
                                                            f30 = _livEnt2.m_21233_();
                                                        } else {
                                                            f30 = -1.0f;
                                                        }
                                                        entity2.m_6469_(damageSource3, f30 / 20.0f + 40000.0f);
                                                        entity2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                        if (!(entity2.m_20206_() > 6.0f)) continue;
                                                        DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity2 instanceof LivingEntity) {
                                                            LivingEntity _livEnt7 = (LivingEntity)entity2;
                                                            f29 = _livEnt7.m_21233_();
                                                        } else {
                                                            f29 = -1.0f;
                                                        }
                                                        if (entity2 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity2;
                                                            f28 = _livEnt2.m_21223_();
                                                        } else {
                                                            f28 = -1.0f;
                                                        }
                                                        entity2.m_6469_(damageSource4, (f29 + f28) / 5.0f + 400000.0f);
                                                        DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                        if (entity2 instanceof LivingEntity) {
                                                            LivingEntity _livEnt5 = (LivingEntity)entity2;
                                                            f27 = _livEnt5.m_21233_();
                                                        } else {
                                                            f27 = -1.0f;
                                                        }
                                                        if (entity2 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity2;
                                                            f26 = _livEnt2.m_21223_();
                                                        } else {
                                                            f26 = -1.0f;
                                                        }
                                                        entity2.m_6469_(damageSource5, (f27 + f26) / 5.0f + 400000.0f);
                                                    }
                                                }
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                                    n22 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                } else {
                                                    n22 = 0;
                                                }
                                                if (n22 >= 150) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                                                    }
                                                }
                                            }
                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                n21 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                            } else {
                                                n21 = 0;
                                            }
                                            if (n21 == 2) {
                                                int n53;
                                                int n54;
                                                float f33;
                                                LivingEntity livingEntity61;
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.swing");
                                                    }
                                                } else if (entity instanceof StarskeletonpowertitanEntity) {
                                                    ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.swing2");
                                                }
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity61 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity61 = null;
                                                }
                                                if (livingEntity61 != null) {
                                                    LivingEntity livingEntity62;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt22 = (Mob)entity;
                                                        livingEntity62 = _mobEnt22.m_5448_();
                                                    } else {
                                                        livingEntity62 = null;
                                                    }
                                                    f33 = entity.m_20270_(livingEntity62);
                                                } else {
                                                    f33 = -1.0f;
                                                }
                                                if (f33 > 1.0f) {
                                                    LivingEntity livingEntity63;
                                                    LivingEntity livingEntity64;
                                                    LivingEntity livingEntity65;
                                                    LivingEntity livingEntity66;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt23 = (Mob)entity;
                                                        livingEntity66 = _mobEnt23.m_5448_();
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
                                                    double d14 = livingEntity65.m_20186_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt24 = (Mob)entity;
                                                        livingEntity64 = _mobEnt24.m_5448_();
                                                    } else {
                                                        livingEntity64 = null;
                                                    }
                                                    double d15 = d14 + (double)livingEntity64.m_20206_() / 1.5;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt25 = (Mob)entity;
                                                        livingEntity63 = _mobEnt25.m_5448_();
                                                    } else {
                                                        livingEntity63 = null;
                                                    }
                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d15, livingEntity63.m_20189_()));
                                                }
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                                    n54 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                } else {
                                                    n54 = 0;
                                                }
                                                if (n54 == 40) {
                                                    if (world instanceof Level) {
                                                        Level _level5 = (Level)world;
                                                        if (!_level5.m_5776_()) {
                                                            _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    Vec3 _center3 = new Vec3(x, y, z);
                                                    List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                    for (Entity entity3 : _entfound3) {
                                                        float f34;
                                                        float f35;
                                                        float f36;
                                                        float f37;
                                                        float f38;
                                                        float f39;
                                                        float f40;
                                                        if (entity3 instanceof StarskeletonpowertitanEntity || !(entity3 instanceof LivingEntity)) continue;
                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity3 instanceof LivingEntity) {
                                                            LivingEntity livingEntity67 = (LivingEntity)entity3;
                                                            f40 = livingEntity67.m_21233_();
                                                        } else {
                                                            f40 = -1.0f;
                                                        }
                                                        entity3.m_6469_(damageSource, f40 / 20.0f + 80000.0f);
                                                        if (entity3 instanceof Titangodentity) continue;
                                                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity3 instanceof Player)) {
                                                            entity3.f_19802_ = 0;
                                                            Deathlist.normalattack(entity3);
                                                        }
                                                        DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                        if (entity3 instanceof LivingEntity) {
                                                            LivingEntity livingEntity68 = (LivingEntity)entity3;
                                                            f39 = livingEntity68.m_21233_();
                                                        } else {
                                                            f39 = -1.0f;
                                                        }
                                                        entity3.m_6469_(damageSource6, f39 / 20.0f + 80000.0f);
                                                        DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                        if (entity3 instanceof LivingEntity) {
                                                            LivingEntity livingEntity69 = (LivingEntity)entity3;
                                                            f38 = livingEntity69.m_21233_();
                                                        } else {
                                                            f38 = -1.0f;
                                                        }
                                                        entity3.m_6469_(damageSource7, f38 / 20.0f + 80000.0f);
                                                        entity3.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                        if (!(entity3.m_20206_() > 6.0f)) continue;
                                                        DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity3 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity3;
                                                            f37 = _livEnt2.m_21233_();
                                                        } else {
                                                            f37 = -1.0f;
                                                        }
                                                        if (entity3 instanceof LivingEntity) {
                                                            LivingEntity livingEntity70 = (LivingEntity)entity3;
                                                            f36 = livingEntity70.m_21223_();
                                                        } else {
                                                            f36 = -1.0f;
                                                        }
                                                        entity3.m_6469_(damageSource8, (f37 + f36) / 5.0f + 800000.0f);
                                                        DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                        if (entity3 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity3;
                                                            f35 = _livEnt2.m_21233_();
                                                        } else {
                                                            f35 = -1.0f;
                                                        }
                                                        if (entity3 instanceof LivingEntity) {
                                                            LivingEntity livingEntity71 = (LivingEntity)entity3;
                                                            f34 = livingEntity71.m_21223_();
                                                        } else {
                                                            f34 = -1.0f;
                                                        }
                                                        entity3.m_6469_(damageSource9, (f35 + f34) / 5.0f + 800000.0f);
                                                    }
                                                }
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                                    n53 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                } else {
                                                    n53 = 0;
                                                }
                                                if (n53 >= 65) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                                                    }
                                                }
                                            }
                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                n20 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                            } else {
                                                n20 = 0;
                                            }
                                            if (n20 == 3) {
                                                int n55;
                                                int n56;
                                                float f41;
                                                LivingEntity livingEntity72;
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.groundboxing");
                                                }
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity72 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity72 = null;
                                                }
                                                if (livingEntity72 != null) {
                                                    LivingEntity livingEntity73;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt26 = (Mob)entity;
                                                        livingEntity73 = _mobEnt26.m_5448_();
                                                    } else {
                                                        livingEntity73 = null;
                                                    }
                                                    f41 = entity.m_20270_(livingEntity73);
                                                } else {
                                                    f41 = -1.0f;
                                                }
                                                if (f41 > 1.0f) {
                                                    LivingEntity livingEntity74;
                                                    LivingEntity livingEntity75;
                                                    LivingEntity livingEntity76;
                                                    LivingEntity livingEntity77;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt27 = (Mob)entity;
                                                        livingEntity77 = _mobEnt27.m_5448_();
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
                                                    double d16 = livingEntity76.m_20186_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt28 = (Mob)entity;
                                                        livingEntity75 = _mobEnt28.m_5448_();
                                                    } else {
                                                        livingEntity75 = null;
                                                    }
                                                    double d17 = d16 + (double)livingEntity75.m_20206_() / 1.5;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt29 = (Mob)entity;
                                                        livingEntity74 = _mobEnt29.m_5448_();
                                                    } else {
                                                        livingEntity74 = null;
                                                    }
                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity74.m_20189_()));
                                                }
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                                    n56 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                } else {
                                                    n56 = 0;
                                                }
                                                if (n56 == 65) {
                                                    if (world instanceof Level) {
                                                        Level _level6 = (Level)world;
                                                        if (!_level6.m_5776_()) {
                                                            _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    Vec3 _center4 = new Vec3(x, y, z);
                                                    List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                                                    for (Entity entity4 : _entfound4) {
                                                        float f42;
                                                        float f43;
                                                        float f44;
                                                        float f45;
                                                        float f46;
                                                        float f47;
                                                        float f48;
                                                        if (entity4 instanceof StarskeletonpowertitanEntity || !(entity4 instanceof LivingEntity)) continue;
                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity4 instanceof LivingEntity) {
                                                            LivingEntity livingEntity78 = (LivingEntity)entity4;
                                                            f48 = livingEntity78.m_21233_();
                                                        } else {
                                                            f48 = -1.0f;
                                                        }
                                                        entity4.m_6469_(damageSource, f48 / 20.0f + 96000.0f);
                                                        if (entity4 instanceof Titangodentity) continue;
                                                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity4 instanceof Player)) {
                                                            entity4.f_19802_ = 0;
                                                            Deathlist.normalattack(entity4);
                                                        }
                                                        DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                        if (entity4 instanceof LivingEntity) {
                                                            LivingEntity livingEntity79 = (LivingEntity)entity4;
                                                            f47 = livingEntity79.m_21233_();
                                                        } else {
                                                            f47 = -1.0f;
                                                        }
                                                        entity4.m_6469_(damageSource10, f47 / 20.0f + 96000.0f);
                                                        DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                        if (entity4 instanceof LivingEntity) {
                                                            LivingEntity livingEntity80 = (LivingEntity)entity4;
                                                            f46 = livingEntity80.m_21233_();
                                                        } else {
                                                            f46 = -1.0f;
                                                        }
                                                        entity4.m_6469_(damageSource11, f46 / 20.0f + 96000.0f);
                                                        entity4.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                        if (!(entity4.m_20206_() > 6.0f)) continue;
                                                        DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity4 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity4;
                                                            f45 = _livEnt2.m_21233_();
                                                        } else {
                                                            f45 = -1.0f;
                                                        }
                                                        if (entity4 instanceof LivingEntity) {
                                                            LivingEntity livingEntity81 = (LivingEntity)entity4;
                                                            f44 = livingEntity81.m_21223_();
                                                        } else {
                                                            f44 = -1.0f;
                                                        }
                                                        entity4.m_6469_(damageSource12, (f45 + f44) / 5.0f + 96000.0f);
                                                        DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                        if (entity4 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity4;
                                                            f43 = _livEnt2.m_21233_();
                                                        } else {
                                                            f43 = -1.0f;
                                                        }
                                                        if (entity4 instanceof LivingEntity) {
                                                            LivingEntity livingEntity82 = (LivingEntity)entity4;
                                                            f42 = livingEntity82.m_21223_();
                                                        } else {
                                                            f42 = -1.0f;
                                                        }
                                                        entity4.m_6469_(damageSource13, (f43 + f42) / 5.0f + 96000.0f);
                                                    }
                                                }
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                                    n55 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                } else {
                                                    n55 = 0;
                                                }
                                                if (n55 >= 95) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                                                    }
                                                }
                                            }
                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                n19 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                            } else {
                                                n19 = 0;
                                            }
                                            if (n19 == 4) {
                                                int n57;
                                                int n58;
                                                float f49;
                                                LivingEntity livingEntity83;
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity83 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity83 = null;
                                                }
                                                if (livingEntity83 != null) {
                                                    LivingEntity livingEntity84;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt30 = (Mob)entity;
                                                        livingEntity84 = _mobEnt30.m_5448_();
                                                    } else {
                                                        livingEntity84 = null;
                                                    }
                                                    f49 = entity.m_20270_(livingEntity84);
                                                } else {
                                                    f49 = -1.0f;
                                                }
                                                if (f49 > 1.0f) {
                                                    LivingEntity livingEntity85;
                                                    LivingEntity livingEntity86;
                                                    LivingEntity livingEntity87;
                                                    LivingEntity livingEntity88;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt31 = (Mob)entity;
                                                        livingEntity88 = _mobEnt31.m_5448_();
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
                                                    double d18 = livingEntity87.m_20186_();
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt32 = (Mob)entity;
                                                        livingEntity86 = _mobEnt32.m_5448_();
                                                    } else {
                                                        livingEntity86 = null;
                                                    }
                                                    double d19 = d18 + (double)livingEntity86.m_20206_() / 1.5;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt33 = (Mob)entity;
                                                        livingEntity85 = _mobEnt33.m_5448_();
                                                    } else {
                                                        livingEntity85 = null;
                                                    }
                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d19, livingEntity85.m_20189_()));
                                                }
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.attack");
                                                    }
                                                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.attack2");
                                                    }
                                                } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.attack3");
                                                    }
                                                } else if (entity instanceof StarskeletonpowertitanEntity) {
                                                    ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.attack4");
                                                }
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                                    n58 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                } else {
                                                    n58 = 0;
                                                }
                                                if (n58 == 14) {
                                                    float f50;
                                                    LivingEntity livingEntity89;
                                                    if (world instanceof Level) {
                                                        Level _level7 = (Level)world;
                                                        if (!_level7.m_5776_()) {
                                                            _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt34 = (Mob)entity;
                                                        livingEntity89 = _mobEnt34.m_5448_();
                                                    } else {
                                                        livingEntity89 = null;
                                                    }
                                                    if (livingEntity89 != null) {
                                                        LivingEntity livingEntity90;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt35 = (Mob)entity;
                                                            livingEntity90 = _mobEnt35.m_5448_();
                                                        } else {
                                                            livingEntity90 = null;
                                                        }
                                                        f50 = entity.m_20270_(livingEntity90);
                                                    } else {
                                                        f50 = -1.0f;
                                                    }
                                                    if (f50 > 1.0f && world instanceof ServerLevel) {
                                                        LivingEntity livingEntity91;
                                                        LivingEntity livingEntity92;
                                                        LivingEntity livingEntity93;
                                                        _level = (ServerLevel)world;
                                                        EntityType entityType = (EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get();
                                                        if (entity instanceof Mob) {
                                                            Mob mob = (Mob)entity;
                                                            livingEntity93 = mob.m_5448_();
                                                        } else {
                                                            livingEntity93 = null;
                                                        }
                                                        double d = livingEntity93.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            Mob mob = (Mob)entity;
                                                            livingEntity92 = mob.m_5448_();
                                                        } else {
                                                            livingEntity92 = null;
                                                        }
                                                        double d20 = livingEntity92.m_20186_() + (double)(entity.m_20206_() / 2.0f);
                                                        if (entity instanceof Mob) {
                                                            Mob mob = (Mob)entity;
                                                            livingEntity91 = mob.m_5448_();
                                                        } else {
                                                            livingEntity91 = null;
                                                        }
                                                        Entity entity5 = entityType.m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)d, (double)d20, (double)livingEntity91.m_20189_()), MobSpawnType.MOB_SUMMONED);
                                                        if (entity5 != null) {
                                                            entity5.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                        }
                                                    }
                                                    Vec3 _center5 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                                                    List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                                                    for (Entity entity6 : _entfound5) {
                                                        float f51;
                                                        float f52;
                                                        float f53;
                                                        float f54;
                                                        float f55;
                                                        float f56;
                                                        float f57;
                                                        if (entity6 instanceof StarskeletonpowertitanEntity || !(entity6 instanceof LivingEntity)) continue;
                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity6 instanceof LivingEntity) {
                                                            LivingEntity livingEntity94 = (LivingEntity)entity6;
                                                            f57 = livingEntity94.m_21233_();
                                                        } else {
                                                            f57 = -1.0f;
                                                        }
                                                        entity6.m_6469_(damageSource, f57 / 20.0f + 160000.0f);
                                                        if (entity6 instanceof Titangodentity) continue;
                                                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity6 instanceof Player)) {
                                                            entity6.f_19802_ = 0;
                                                            Deathlist.normalattack(entity6);
                                                        }
                                                        DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                        if (entity6 instanceof LivingEntity) {
                                                            LivingEntity livingEntity95 = (LivingEntity)entity6;
                                                            f56 = livingEntity95.m_21233_();
                                                        } else {
                                                            f56 = -1.0f;
                                                        }
                                                        entity6.m_6469_(damageSource14, f56 / 20.0f + 160000.0f);
                                                        DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                        if (entity6 instanceof LivingEntity) {
                                                            LivingEntity livingEntity96 = (LivingEntity)entity6;
                                                            f55 = livingEntity96.m_21233_();
                                                        } else {
                                                            f55 = -1.0f;
                                                        }
                                                        entity6.m_6469_(damageSource15, f55 / 20.0f + 160000.0f);
                                                        if (!(entity6.m_20206_() > 6.0f)) continue;
                                                        DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                        if (entity6 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity6;
                                                            f54 = _livEnt2.m_21233_();
                                                        } else {
                                                            f54 = -1.0f;
                                                        }
                                                        if (entity6 instanceof LivingEntity) {
                                                            LivingEntity livingEntity97 = (LivingEntity)entity6;
                                                            f53 = livingEntity97.m_21223_();
                                                        } else {
                                                            f53 = -1.0f;
                                                        }
                                                        entity6.m_6469_(damageSource16, (f54 + f53) / 5.0f + 1600000.0f);
                                                        DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                        if (entity6 instanceof LivingEntity) {
                                                            _livEnt2 = (LivingEntity)entity6;
                                                            f52 = _livEnt2.m_21233_();
                                                        } else {
                                                            f52 = -1.0f;
                                                        }
                                                        if (entity6 instanceof LivingEntity) {
                                                            LivingEntity livingEntity98 = (LivingEntity)entity6;
                                                            f51 = livingEntity98.m_21223_();
                                                        } else {
                                                            f51 = -1.0f;
                                                        }
                                                        entity6.m_6469_(damageSource17, (f52 + f51) / 5.0f + 1600000.0f);
                                                    }
                                                }
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                                    n57 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                                } else {
                                                    n57 = 0;
                                                }
                                                if (n57 >= 30) {
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                                                    }
                                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                                        ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                                                    }
                                                }
                                            }
                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                                n18 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                            } else {
                                                n18 = 0;
                                            }
                                            if (n18 != 5) break block898;
                                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity3 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity3 = null;
                                            }
                                            if (livingEntity3 != null) {
                                                LivingEntity livingEntity99;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt36 = (Mob)entity;
                                                    livingEntity99 = _mobEnt36.m_5448_();
                                                } else {
                                                    livingEntity99 = null;
                                                }
                                                f3 = entity.m_20270_(livingEntity99);
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (f3 > 1.0f) {
                                                LivingEntity livingEntity100;
                                                LivingEntity livingEntity101;
                                                LivingEntity livingEntity102;
                                                LivingEntity livingEntity103;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt37 = (Mob)entity;
                                                    livingEntity103 = _mobEnt37.m_5448_();
                                                } else {
                                                    livingEntity103 = null;
                                                }
                                                double d = livingEntity103.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity102 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity102 = null;
                                                }
                                                double d21 = livingEntity102.m_20186_();
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt38 = (Mob)entity;
                                                    livingEntity101 = _mobEnt38.m_5448_();
                                                } else {
                                                    livingEntity101 = null;
                                                }
                                                double d22 = d21 + (double)livingEntity101.m_20206_() / 1.5;
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt39 = (Mob)entity;
                                                    livingEntity100 = _mobEnt39.m_5448_();
                                                } else {
                                                    livingEntity100 = null;
                                                }
                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity100.m_20189_()));
                                            }
                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 1) {
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.zhan1");
                                                }
                                            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 2) {
                                                if (entity instanceof StarskeletonpowertitanEntity) {
                                                    ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.zhan2");
                                                }
                                            } else if (entity instanceof StarskeletonpowertitanEntity) {
                                                ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.zhan3");
                                            }
                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                _datEntI = (StarskeletonpowertitanEntity)entity;
                                                n17 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                            } else {
                                                n17 = 0;
                                            }
                                            if (n17 == 7) break block899;
                                            if (entity instanceof StarskeletonpowertitanEntity) {
                                                StarskeletonpowertitanEntity _datEntI13 = (StarskeletonpowertitanEntity)entity;
                                                n16 = (Integer)_datEntI13.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                            } else {
                                                n16 = 0;
                                            }
                                            if (n16 != 24) break block900;
                                        }
                                        if (world instanceof Level) {
                                            Level _level8 = (Level)world;
                                            if (!_level8.m_5776_()) {
                                                _level8.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                            } else {
                                                _level8.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                            }
                                        }
                                        Vec3 _center6 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                                        _entfound = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                                        for (Entity entity7 : _entfound) {
                                            float f58;
                                            float f59;
                                            float f60;
                                            float f61;
                                            float f62;
                                            float f63;
                                            float f64;
                                            if (entity7 instanceof StarskeletonpowertitanEntity || !(entity7 instanceof LivingEntity)) continue;
                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                            if (entity7 instanceof LivingEntity) {
                                                LivingEntity _livEnt9 = (LivingEntity)entity7;
                                                f64 = _livEnt9.m_21233_();
                                            } else {
                                                f64 = -1.0f;
                                            }
                                            entity7.m_6469_(damageSource, f64 / 20.0f + 160000.0f);
                                            double _setval = 4.0;
                                            entity7.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                capability.camerashake = _setval;
                                                capability.syncPlayerVariables(entity7);
                                            });
                                            if (entity7 instanceof Titangodentity) continue;
                                            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity7 instanceof Player)) {
                                                entity7.f_19802_ = 0;
                                                Deathlist.normalattack(entity7);
                                            }
                                            DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                            if (entity7 instanceof LivingEntity) {
                                                LivingEntity _livEnt10 = (LivingEntity)entity7;
                                                f63 = _livEnt10.m_21233_();
                                            } else {
                                                f63 = -1.0f;
                                            }
                                            entity7.m_6469_(damageSource18, f63 / 20.0f + 160000.0f);
                                            DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                            if (entity7 instanceof LivingEntity) {
                                                LivingEntity _livEnt11 = (LivingEntity)entity7;
                                                f62 = _livEnt11.m_21233_();
                                            } else {
                                                f62 = -1.0f;
                                            }
                                            entity7.m_6469_(damageSource19, f62 / 20.0f + 160000.0f);
                                            if (!(entity7.m_20206_() > 6.0f)) continue;
                                            DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                            if (entity7 instanceof LivingEntity) {
                                                LivingEntity _livEnt8 = (LivingEntity)entity7;
                                                f61 = _livEnt8.m_21233_();
                                            } else {
                                                f61 = -1.0f;
                                            }
                                            if (entity7 instanceof LivingEntity) {
                                                LivingEntity _livEnt12 = (LivingEntity)entity7;
                                                f60 = _livEnt12.m_21223_();
                                            } else {
                                                f60 = -1.0f;
                                            }
                                            entity7.m_6469_(damageSource20, (f61 + f60) / 5.0f + 1600000.0f);
                                            DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                            if (entity7 instanceof LivingEntity) {
                                                LivingEntity _livEnt6 = (LivingEntity)entity7;
                                                f59 = _livEnt6.m_21233_();
                                            } else {
                                                f59 = -1.0f;
                                            }
                                            if (entity7 instanceof LivingEntity) {
                                                LivingEntity _livEnt13 = (LivingEntity)entity7;
                                                f58 = _livEnt13.m_21223_();
                                            } else {
                                                f58 = -1.0f;
                                            }
                                            entity7.m_6469_(damageSource21, (f59 + f58) / 5.0f + 1600000.0f);
                                        }
                                    }
                                    if (entity instanceof StarskeletonpowertitanEntity) {
                                        _datEntI = (StarskeletonpowertitanEntity)entity;
                                        n15 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                    } else {
                                        n15 = 0;
                                    }
                                    if (n15 >= 45) {
                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                            StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                                        }
                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                            StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                                        }
                                        if (entity instanceof StarskeletonpowertitanEntity) {
                                            ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                                        }
                                    }
                                }
                                if (entity instanceof StarskeletonpowertitanEntity) {
                                    _datEntI2 = (StarskeletonpowertitanEntity)entity;
                                    n14 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 != 6) break block901;
                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity2 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2 != null) {
                                    LivingEntity livingEntity104;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt40 = (Mob)entity;
                                        livingEntity104 = _mobEnt40.m_5448_();
                                    } else {
                                        livingEntity104 = null;
                                    }
                                    f2 = entity.m_20270_(livingEntity104);
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 > 1.0f) {
                                    LivingEntity livingEntity105;
                                    LivingEntity livingEntity106;
                                    LivingEntity livingEntity107;
                                    LivingEntity livingEntity108;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt41 = (Mob)entity;
                                        livingEntity108 = _mobEnt41.m_5448_();
                                    } else {
                                        livingEntity108 = null;
                                    }
                                    double d = livingEntity108.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity107 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity107 = null;
                                    }
                                    double d23 = livingEntity107.m_20186_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt42 = (Mob)entity;
                                        livingEntity106 = _mobEnt42.m_5448_();
                                    } else {
                                        livingEntity106 = null;
                                    }
                                    double d24 = d23 + (double)livingEntity106.m_20206_() / 1.5;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt43 = (Mob)entity;
                                        livingEntity105 = _mobEnt43.m_5448_();
                                    } else {
                                        livingEntity105 = null;
                                    }
                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity105.m_20189_()));
                                }
                                if (entity instanceof StarskeletonpowertitanEntity) {
                                    ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.angryatk1");
                                }
                                if (entity instanceof StarskeletonpowertitanEntity) {
                                    _datEntI = (StarskeletonpowertitanEntity)entity;
                                    n13 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 == 10) break block902;
                                if (entity instanceof StarskeletonpowertitanEntity) {
                                    StarskeletonpowertitanEntity _datEntI14 = (StarskeletonpowertitanEntity)entity;
                                    n12 = (Integer)_datEntI14.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                } else {
                                    n12 = 0;
                                }
                                if (n12 == 21) break block902;
                                if (entity instanceof StarskeletonpowertitanEntity) {
                                    StarskeletonpowertitanEntity _datEntI15 = (StarskeletonpowertitanEntity)entity;
                                    n11 = (Integer)_datEntI15.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                                } else {
                                    n11 = 0;
                                }
                                if (n11 != 32) break block903;
                            }
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entityiterator5 : list) {
                                float f65;
                                float f66;
                                float f67;
                                float f68;
                                float f69;
                                float f70;
                                LivingEntity _livEnt7;
                                float f71;
                                if (entityiterator5 instanceof StarskeletonpowertitanEntity || !(entityiterator5 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator5 instanceof LivingEntity) {
                                    LivingEntity _livEnt14 = (LivingEntity)entityiterator5;
                                    f71 = _livEnt14.m_21233_();
                                } else {
                                    f71 = -1.0f;
                                }
                                entityiterator5.m_6469_(damageSource, f71 / 20.0f + 240000.0f);
                                if (entityiterator5 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator5 instanceof Player)) {
                                    entityiterator5.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator5);
                                }
                                DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entityiterator5 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entityiterator5;
                                    f70 = _livEnt7.m_21233_();
                                } else {
                                    f70 = -1.0f;
                                }
                                entityiterator5.m_6469_(damageSource22, f70 / 20.0f + 240000.0f);
                                DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entityiterator5 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entityiterator5;
                                    f69 = _livEnt7.m_21233_();
                                } else {
                                    f69 = -1.0f;
                                }
                                entityiterator5.m_6469_(damageSource23, f69 / 20.0f + 240000.0f);
                                if (!(entityiterator5.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator5 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator5;
                                    f68 = _livEnt.m_21233_();
                                } else {
                                    f68 = -1.0f;
                                }
                                if (entityiterator5 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entityiterator5;
                                    f67 = _livEnt7.m_21223_();
                                } else {
                                    f67 = -1.0f;
                                }
                                entityiterator5.m_6469_(damageSource24, (f68 + f67) / 5.0f + 2400000.0f);
                                DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entityiterator5 instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator5;
                                    f66 = _livEnt.m_21233_();
                                } else {
                                    f66 = -1.0f;
                                }
                                if (entityiterator5 instanceof LivingEntity) {
                                    _livEnt7 = (LivingEntity)entityiterator5;
                                    f65 = _livEnt7.m_21223_();
                                } else {
                                    f65 = -1.0f;
                                }
                                entityiterator5.m_6469_(damageSource25, (f66 + f65) / 5.0f + 2400000.0f);
                            }
                        }
                        if (entity instanceof StarskeletonpowertitanEntity) {
                            _datEntI = (StarskeletonpowertitanEntity)entity;
                            n10 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                        } else {
                            n10 = 0;
                        }
                        if (n10 >= 45) {
                            if (entity instanceof StarskeletonpowertitanEntity) {
                                StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof StarskeletonpowertitanEntity) {
                                StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof StarskeletonpowertitanEntity) {
                                ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof StarskeletonpowertitanEntity) {
                        _datEntI2 = (StarskeletonpowertitanEntity)entity;
                        n9 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
                    } else {
                        n9 = 0;
                    }
                    if (n9 != 7) break block904;
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity = _mobEnt2.m_5448_();
                    } else {
                        livingEntity = null;
                    }
                    if (livingEntity != null) {
                        LivingEntity livingEntity109;
                        if (entity instanceof Mob) {
                            Mob _mobEnt44 = (Mob)entity;
                            livingEntity109 = _mobEnt44.m_5448_();
                        } else {
                            livingEntity109 = null;
                        }
                        f = entity.m_20270_(livingEntity109);
                    } else {
                        f = -1.0f;
                    }
                    if (f > 1.0f) {
                        LivingEntity livingEntity110;
                        LivingEntity livingEntity111;
                        LivingEntity livingEntity112;
                        LivingEntity livingEntity113;
                        if (entity instanceof Mob) {
                            Mob _mobEnt45 = (Mob)entity;
                            livingEntity113 = _mobEnt45.m_5448_();
                        } else {
                            livingEntity113 = null;
                        }
                        double d = livingEntity113.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity112 = _mobEnt.m_5448_();
                        } else {
                            livingEntity112 = null;
                        }
                        double d25 = livingEntity112.m_20186_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt46 = (Mob)entity;
                            livingEntity111 = _mobEnt46.m_5448_();
                        } else {
                            livingEntity111 = null;
                        }
                        double d26 = d25 + (double)livingEntity111.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            Mob _mobEnt47 = (Mob)entity;
                            livingEntity110 = _mobEnt47.m_5448_();
                        } else {
                            livingEntity110 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity110.m_20189_()));
                    }
                    if (entity instanceof StarskeletonpowertitanEntity) {
                        ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.angryatk");
                    }
                    if (entity instanceof StarskeletonpowertitanEntity) {
                        _datEntI = (StarskeletonpowertitanEntity)entity;
                        n8 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 == 11) break block905;
                    if (entity instanceof StarskeletonpowertitanEntity) {
                        StarskeletonpowertitanEntity _datEntI16 = (StarskeletonpowertitanEntity)entity;
                        n7 = (Integer)_datEntI16.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                    } else {
                        n7 = 0;
                    }
                    if (n7 != 35) break block906;
                }
                if (world instanceof Level) {
                    Level _level9 = (Level)world;
                    if (!_level9.m_5776_()) {
                        _level9.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level9.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center7 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center7, _center7).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center7))).toList();
                for (Entity entity8 : _entfound) {
                    float f;
                    float f72;
                    float f73;
                    float f74;
                    float f75;
                    float f76;
                    float f77;
                    if (entity8 instanceof StarskeletonpowertitanEntity || !(entity8 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt16 = (LivingEntity)entity8;
                        f77 = _livEnt16.m_21233_();
                    } else {
                        f77 = -1.0f;
                    }
                    entity8.m_6469_(damageSource, f77 / 20.0f + 120000.0f);
                    double _setval = 6.0;
                    entity8.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entity8);
                    });
                    if (entity8 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity8 instanceof Player)) {
                        entity8.f_19802_ = 0;
                        Deathlist.normalattack(entity8);
                    }
                    DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt17 = (LivingEntity)entity8;
                        f76 = _livEnt17.m_21233_();
                    } else {
                        f76 = -1.0f;
                    }
                    entity8.m_6469_(damageSource26, f76 / 20.0f + 120000.0f);
                    DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt18 = (LivingEntity)entity8;
                        f75 = _livEnt18.m_21233_();
                    } else {
                        f75 = -1.0f;
                    }
                    entity8.m_6469_(damageSource27, f75 / 20.0f + 120000.0f);
                    if (!(entity8.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt15 = (LivingEntity)entity8;
                        f74 = _livEnt15.m_21233_();
                    } else {
                        f74 = -1.0f;
                    }
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt19 = (LivingEntity)entity8;
                        f73 = _livEnt19.m_21223_();
                    } else {
                        f73 = -1.0f;
                    }
                    entity8.m_6469_(damageSource28, (f74 + f73) / 5.0f + 1200000.0f);
                    DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entity8;
                        f72 = _livEnt8.m_21233_();
                    } else {
                        f72 = -1.0f;
                    }
                    if (entity8 instanceof LivingEntity) {
                        LivingEntity _livEnt20 = (LivingEntity)entity8;
                        f = _livEnt20.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entity8.m_6469_(damageSource29, (f72 + f) / 5.0f + 1200000.0f);
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n6 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n6 = 0;
            }
            if (n6 == 34 && world instanceof ServerLevel) {
                ServerLevel projectileLevel = (ServerLevel)world;
                Projectile _entityToSpawn = new Object(){

                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        TitanswordedgeEntity entityToSpawn = new TitanswordedgeEntity((EntityType<? extends TitanswordedgeEntity>)((EntityType)UltimateskeletonsModEntities.TITANSWORDEDGE.get()), level);
                        entityToSpawn.m_5602_(shooter);
                        entityToSpawn.m_36781_(damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        return entityToSpawn;
                    }
                }.getArrow((Level)projectileLevel, entity, 10000.0f, 1);
                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 30.0, y + 36.0, z + entity.m_20154_().f_82481_ * 30.0);
                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 6.0f, 0.0f);
                projectileLevel.m_7967_((Entity)_entityToSpawn);
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n5 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n5 = 0;
            }
            if (n5 == 36) {
                for (int index2 = 0; index2 < 32; ++index2) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level10 = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level10, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 100.0, y + 0.1, z + entity.m_20154_().f_82481_ * 100.0, 0.0, 0.0, 0.0);
                if (world instanceof Level) {
                    Level _level11 = (Level)world;
                    if (!_level11.m_5776_()) {
                        _level11.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level11.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n4 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n4 = 0;
            }
            if (n4 >= 55) {
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarskeletonpowertitanEntity) {
            _datEntI2 = (StarskeletonpowertitanEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 8) {
            int n59;
            int n60;
            int n61;
            int n62;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof StarskeletonpowertitanEntity) {
                ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.bigarrow");
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n62 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n62 = 0;
            }
            if (n62 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt48 = (Mob)entity;
                    livingEntity = _mobEnt48.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity114;
                    if (entity instanceof Mob) {
                        Mob _mobEnt49 = (Mob)entity;
                        livingEntity114 = _mobEnt49.m_5448_();
                    } else {
                        livingEntity114 = null;
                    }
                    f = entity.m_20270_(livingEntity114);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity115;
                    LivingEntity livingEntity116;
                    LivingEntity livingEntity117;
                    LivingEntity livingEntity118;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity118 = _mobEnt.m_5448_();
                    } else {
                        livingEntity118 = null;
                    }
                    double d = livingEntity118.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity117 = mob.m_5448_();
                    } else {
                        livingEntity117 = null;
                    }
                    double d27 = livingEntity117.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity116 = _mobEnt.m_5448_();
                    } else {
                        livingEntity116 = null;
                    }
                    double d28 = d27 + (double)livingEntity116.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity115 = _mobEnt.m_5448_();
                    } else {
                        livingEntity115 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity115.m_20189_()));
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n61 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n61 = 0;
            }
            if (n61 >= 35) {
                int n63;
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntI17 = (StarskeletonpowertitanEntity)entity;
                    n63 = (Integer)_datEntI17.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                } else {
                    n63 = 0;
                }
                if (n63 <= 68 && world instanceof ServerLevel) {
                    int n64;
                    int n65;
                    ServerLevel _level12 = (ServerLevel)world;
                    EntityType entityType = (EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get();
                    double d = entity.m_20154_().f_82479_;
                    if (entity instanceof StarskeletonpowertitanEntity) {
                        StarskeletonpowertitanEntity starskeletonpowertitanEntity = (StarskeletonpowertitanEntity)entity;
                        n65 = (Integer)starskeletonpowertitanEntity.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                    } else {
                        n65 = 0;
                    }
                    double d29 = x + d * (double)(n65 - 17);
                    double d30 = entity.m_20154_().f_82481_;
                    if (entity instanceof StarskeletonpowertitanEntity) {
                        StarskeletonpowertitanEntity starskeletonpowertitanEntity = (StarskeletonpowertitanEntity)entity;
                        n64 = (Integer)starskeletonpowertitanEntity.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
                    } else {
                        n64 = 0;
                    }
                    entityToSpawn = entityType.m_262496_(_level12, BlockPos.m_274561_((double)d29, (double)(y + 38.0), (double)(z + d30 * (double)(n64 - 17))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n60 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n60 = 0;
            }
            if (n60 == 70) {
                if (world instanceof Level) {
                    Level _level13 = (Level)world;
                    if (!_level13.m_5776_()) {
                        _level13.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level13.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index3 = 0; index3 < 32; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level14 = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level14, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-160.0, (double)160.0))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center8 = new Vec3(x, y, z);
                List<Entity> _entfound6 = world.m_6443_(Entity.class, new AABB(_center8, _center8).m_82400_(240.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center8))).toList();
                for (Entity entity9 : _entfound6) {
                    float f;
                    float f78;
                    float f79;
                    float f80;
                    float f81;
                    float f82;
                    float f83;
                    if (entity9 instanceof StarskeletonpowertitanEntity || entity9 instanceof LightningBolt || !(entity9 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity9;
                        f83 = livingEntity.m_21233_();
                    } else {
                        f83 = -1.0f;
                    }
                    entity9.m_6469_(damageSource, f83 / 20.0f + 40000.0f);
                    if (entity9 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity9 instanceof Player)) {
                        entity9.f_19802_ = 0;
                        Deathlist.normalattack(entity9);
                    }
                    DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity9;
                        f82 = livingEntity.m_21233_();
                    } else {
                        f82 = -1.0f;
                    }
                    entity9.m_6469_(damageSource30, f82 / 20.0f + 40000.0f);
                    DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity9;
                        f81 = livingEntity.m_21233_();
                    } else {
                        f81 = -1.0f;
                    }
                    entity9.m_6469_(damageSource31, f81 / 20.0f + 40000.0f);
                    entity9.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity9.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity _livEnt21 = (LivingEntity)entity9;
                        f80 = _livEnt21.m_21233_();
                    } else {
                        f80 = -1.0f;
                    }
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity9;
                        f79 = livingEntity.m_21223_();
                    } else {
                        f79 = -1.0f;
                    }
                    entity9.m_6469_(damageSource32, (f80 + f79) / 5.0f + 400000.0f);
                    DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entity9;
                        f78 = _livEnt9.m_21233_();
                    } else {
                        f78 = -1.0f;
                    }
                    if (entity9 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity9;
                        f = livingEntity.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entity9.m_6469_(damageSource33, (f78 + f) / 5.0f + 400000.0f);
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n59 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n59 = 0;
            }
            if (n59 >= 105) {
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarskeletonpowertitanEntity) {
            _datEntI2 = (StarskeletonpowertitanEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 9) {
            int n66;
            int n67;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof StarskeletonpowertitanEntity) {
                ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.lightningbolt");
            }
            if (entity instanceof Mob) {
                _mobEnt2 = (Mob)entity;
                livingEntity = _mobEnt2.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity119;
                if (entity instanceof Mob) {
                    Mob _mobEnt50 = (Mob)entity;
                    livingEntity119 = _mobEnt50.m_5448_();
                } else {
                    livingEntity119 = null;
                }
                f = entity.m_20270_(livingEntity119);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity120;
                LivingEntity livingEntity121;
                LivingEntity livingEntity122;
                LivingEntity livingEntity123;
                if (entity instanceof Mob) {
                    Mob _mobEnt51 = (Mob)entity;
                    livingEntity123 = _mobEnt51.m_5448_();
                } else {
                    livingEntity123 = null;
                }
                double d = livingEntity123.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity122 = _mobEnt.m_5448_();
                } else {
                    livingEntity122 = null;
                }
                double d31 = livingEntity122.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt52 = (Mob)entity;
                    livingEntity121 = _mobEnt52.m_5448_();
                } else {
                    livingEntity121 = null;
                }
                double d32 = d31 + (double)livingEntity121.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt53 = (Mob)entity;
                    livingEntity120 = _mobEnt53.m_5448_();
                } else {
                    livingEntity120 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d32, livingEntity120.m_20189_()));
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n67 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 == 45) {
                float f84;
                LivingEntity livingEntity124;
                if (world instanceof Level) {
                    Level _level15 = (Level)world;
                    if (!_level15.m_5776_()) {
                        _level15.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level15.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level16 = (ServerLevel)world;
                    Entity entityToSpawn4 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level16, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 24.0), (double)(y + 44.0), (double)(z + entity.m_20154_().f_82481_ * 24.0)), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn4 != null) {
                        entityToSpawn4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt54 = (Mob)entity;
                    livingEntity124 = _mobEnt54.m_5448_();
                } else {
                    livingEntity124 = null;
                }
                if (livingEntity124 != null) {
                    LivingEntity livingEntity125;
                    if (entity instanceof Mob) {
                        Mob _mobEnt55 = (Mob)entity;
                        livingEntity125 = _mobEnt55.m_5448_();
                    } else {
                        livingEntity125 = null;
                    }
                    f84 = entity.m_20270_(livingEntity125);
                } else {
                    f84 = -1.0f;
                }
                if (f84 > 1.0f) {
                    LivingEntity livingEntity126;
                    LivingEntity livingEntity127;
                    LivingEntity livingEntity128;
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity129;
                        LivingEntity livingEntity130;
                        LivingEntity livingEntity131;
                        _level = (ServerLevel)world;
                        EntityType entityType = (EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get();
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity131 = mob.m_5448_();
                        } else {
                            livingEntity131 = null;
                        }
                        double d = livingEntity131.m_20185_();
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity130 = mob.m_5448_();
                        } else {
                            livingEntity130 = null;
                        }
                        double d33 = livingEntity130.m_20186_();
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity129 = mob.m_5448_();
                        } else {
                            livingEntity129 = null;
                        }
                        Entity entity10 = entityType.m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)d, (double)d33, (double)livingEntity129.m_20189_()), MobSpawnType.MOB_SUMMONED);
                        if (entity10 != null) {
                            entity10.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity128 = mob.m_5448_();
                    } else {
                        livingEntity128 = null;
                    }
                    double d = livingEntity128.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity127 = mob.m_5448_();
                    } else {
                        livingEntity127 = null;
                    }
                    double d34 = livingEntity127.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity126 = mob.m_5448_();
                    } else {
                        livingEntity126 = null;
                    }
                    _center = new Vec3(d, d34, livingEntity126.m_20189_());
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : list) {
                        float f85;
                        float f86;
                        float f87;
                        float f88;
                        float f89;
                        float f90;
                        LivingEntity _livEnt10;
                        float f91;
                        if (entityiterator instanceof StarskeletonpowertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt22 = (LivingEntity)entityiterator;
                            f91 = _livEnt22.m_21233_();
                        } else {
                            f91 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f91 / 20.0f + 64000.0f);
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f90 = _livEnt10.m_21233_();
                        } else {
                            f90 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource34, f90 / 20.0f + 64000.0f);
                        DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f89 = _livEnt10.m_21233_();
                        } else {
                            f89 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource35, f89 / 20.0f + 64000.0f);
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f88 = _livEnt.m_21233_();
                        } else {
                            f88 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f87 = _livEnt10.m_21223_();
                        } else {
                            f87 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource36, (f88 + f87) / 5.0f + 64000.0f);
                        DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f86 = _livEnt.m_21233_();
                        } else {
                            f86 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt10 = (LivingEntity)entityiterator;
                            f85 = _livEnt10.m_21223_();
                        } else {
                            f85 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource37, (f86 + f85) / 5.0f + 64000.0f);
                    }
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n66 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n66 = 0;
            }
            if (n66 >= 75) {
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof StarskeletonpowertitanEntity) {
            _datEntI2 = (StarskeletonpowertitanEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 10) {
            int n68;
            int n69;
            int n70;
            int n71;
            if (entity instanceof StarskeletonpowertitanEntity) {
                ((StarskeletonpowertitanEntity)entity).setAnimation("animation.starskeletonpower.slash");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n71 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n71 = 0;
            }
            if (n71 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt56 = (Mob)entity;
                    livingEntity = _mobEnt56.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity132;
                    if (entity instanceof Mob) {
                        Mob _mobEnt57 = (Mob)entity;
                        livingEntity132 = _mobEnt57.m_5448_();
                    } else {
                        livingEntity132 = null;
                    }
                    f = entity.m_20270_(livingEntity132);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity133;
                    LivingEntity livingEntity134;
                    LivingEntity livingEntity135;
                    LivingEntity livingEntity136;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity136 = _mobEnt.m_5448_();
                    } else {
                        livingEntity136 = null;
                    }
                    double d = livingEntity136.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity135 = mob.m_5448_();
                    } else {
                        livingEntity135 = null;
                    }
                    double d35 = livingEntity135.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity134 = _mobEnt.m_5448_();
                    } else {
                        livingEntity134 = null;
                    }
                    double d36 = d35 + (double)livingEntity134.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity133 = _mobEnt.m_5448_();
                    } else {
                        livingEntity133 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d36, livingEntity133.m_20189_()));
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n70 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n70 = 0;
            }
            if (n70 == 145) {
                if (world instanceof Level) {
                    Level _level17 = (Level)world;
                    if (!_level17.m_5776_()) {
                        _level17.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level17.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center9 = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                List<Entity> _entfound7 = world.m_6443_(Entity.class, new AABB(_center9, _center9).m_82400_(180.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center9))).toList();
                for (Entity entity11 : _entfound7) {
                    float f;
                    float f92;
                    float f93;
                    float f94;
                    float f95;
                    float f96;
                    float f97;
                    if (entity11 instanceof StarskeletonpowertitanEntity || !(entity11 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity11;
                        f97 = livingEntity.m_21233_();
                    } else {
                        f97 = -1.0f;
                    }
                    entity11.m_6469_(damageSource, f97 / 10.0f + 600000.0f);
                    if (entity11 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity11 instanceof Player)) {
                        entity11.f_19802_ = 0;
                        Deathlist.normalattack(entity11);
                    }
                    DamageSource damageSource38 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity11;
                        f96 = livingEntity.m_21233_();
                    } else {
                        f96 = -1.0f;
                    }
                    entity11.m_6469_(damageSource38, f96 / 10.0f + 600000.0f);
                    DamageSource damageSource39 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity11;
                        f95 = livingEntity.m_21233_();
                    } else {
                        f95 = -1.0f;
                    }
                    entity11.m_6469_(damageSource39, f95 / 10.0f + 600000.0f);
                    entity11.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity11.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource40 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity _livEnt23 = (LivingEntity)entity11;
                        f94 = _livEnt23.m_21233_();
                    } else {
                        f94 = -1.0f;
                    }
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity11;
                        f93 = livingEntity.m_21223_();
                    } else {
                        f93 = -1.0f;
                    }
                    entity11.m_6469_(damageSource40, (f94 + f93) / 5.0f + 6000000.0f);
                    DamageSource damageSource41 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entity11;
                        f92 = _livEnt11.m_21233_();
                    } else {
                        f92 = -1.0f;
                    }
                    if (entity11 instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity)entity11;
                        f = livingEntity.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entity11.m_6469_(damageSource41, (f92 + f) / 5.0f + 6000000.0f);
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n69 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n69 = 0;
            }
            if (n69 == 170 && world instanceof Level) {
                Level _level18 = (Level)world;
                if (!_level18.m_5776_()) {
                    _level18.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:sworddrag")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level18.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:sworddrag")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarskeletonpowertitanEntity) {
                _datEntI = (StarskeletonpowertitanEntity)entity;
                n68 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonpowertitanEntity.DATA_animationTick);
            } else {
                n68 = 0;
            }
            if (n68 >= 260) {
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity _datEntSetI = (StarskeletonpowertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarskeletonpowertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarskeletonpowertitanEntity) {
                    ((StarskeletonpowertitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

