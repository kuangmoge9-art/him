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
 *  net.minecraft.world.level.levelgen.Heightmap$Types
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
import net.mcreator.ultimateskeletons.entity.EnergyskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
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
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class EnergyskeletontitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        Level _level;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        LivingEntity _livEnt2;
        Object _mobEnt;
        Mob _mobEnt2;
        Object _mobEnt3;
        Mob _mobEnt4;
        Vec3 _center;
        Titangodentity _datEntI;
        EnergyskeletontitanEntity _datEntI2;
        block877: {
            int n3;
            int n4;
            Object entityToSpawn;
            Level _level2;
            block881: {
                List<Entity> _entfound2;
                Vec3 _center2;
                block880: {
                    int n5;
                    int n6;
                    block879: {
                        block878: {
                            int n7;
                            int n8;
                            float f;
                            LivingEntity livingEntity;
                            int n9;
                            block872: {
                                int n10;
                                block876: {
                                    block875: {
                                        int n11;
                                        int n12;
                                        block874: {
                                            block873: {
                                                int n13;
                                                int n14;
                                                int n15;
                                                float f2;
                                                LivingEntity livingEntity2;
                                                int n16;
                                                int n17;
                                                int n18;
                                                int n19;
                                                int n20;
                                                int n21;
                                                EnergyskeletontitanEntity _datEntI3;
                                                block869: {
                                                    int n22;
                                                    block871: {
                                                        block870: {
                                                            int n23;
                                                            int n24;
                                                            float f3;
                                                            LivingEntity livingEntity3;
                                                            int n25;
                                                            block866: {
                                                                LivingEntity livingEntity4;
                                                                LivingEntity _mobEnt42;
                                                                block867: {
                                                                    block868: {
                                                                        LivingEntity livingEntity5;
                                                                        float f4;
                                                                        LivingEntity livingEntity6;
                                                                        LivingEntity livingEntity7;
                                                                        int n26;
                                                                        int n27;
                                                                        int n28;
                                                                        float f5;
                                                                        float f6;
                                                                        LivingEntity _entity;
                                                                        block864: {
                                                                            block865: {
                                                                                int n29;
                                                                                int n30;
                                                                                int n31;
                                                                                int n32;
                                                                                int n33;
                                                                                Level _level3;
                                                                                int n34;
                                                                                int n35;
                                                                                int n36;
                                                                                int n37;
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
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    int n38;
                                                                                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                                                        EnergyskeletontitanEntity _datEntI22 = (EnergyskeletontitanEntity)entity;
                                                                                        n38 = (Integer)_datEntI22.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                    } else {
                                                                                        n38 = 0;
                                                                                    }
                                                                                    synchedEntityData.m_135381_(EnergyskeletontitanEntity.DATA_spawnTick, (Object)(n38 + 1));
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                                                    n37 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n37 = 0;
                                                                                }
                                                                                if (n37 >= 115) break block864;
                                                                                if (entity instanceof LivingEntity) {
                                                                                    ((LivingEntity)entity).f_20919_ = 0;
                                                                                }
                                                                                if (entity instanceof LivingEntity) {
                                                                                    _entity = (LivingEntity)entity;
                                                                                    _entity.m_21153_(400000.0f);
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
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    _datEntI = (EnergyskeletontitanEntity)entity;
                                                                                    n36 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n36 = 0;
                                                                                }
                                                                                if (n36 == 1 && world instanceof Level) {
                                                                                    Level _level32 = (Level)world;
                                                                                    if (!_level32.m_5776_()) {
                                                                                        _level32.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                    } else {
                                                                                        _level32.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                    }
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    _datEntI = (EnergyskeletontitanEntity)entity;
                                                                                    n35 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n35 = 0;
                                                                                }
                                                                                if (n35 <= 10 && entity instanceof EnergyskeletontitanEntity) {
                                                                                    ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.born");
                                                                                }
                                                                                if (entity instanceof WitherskeletontitanEntity) {
                                                                                    _datEntI = (WitherskeletontitanEntity)entity;
                                                                                    n34 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n34 = 0;
                                                                                }
                                                                                if (n34 == 11) {
                                                                                    if (world instanceof Level) {
                                                                                        _level3 = (Level)world;
                                                                                        if (!_level3.m_5776_()) {
                                                                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                                                                        } else {
                                                                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                                                                        }
                                                                                    }
                                                                                    if (world instanceof Level) {
                                                                                        _level3 = (Level)world;
                                                                                        if (!_level3.m_5776_()) {
                                                                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                        } else {
                                                                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                        }
                                                                                    }
                                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    _datEntI = (EnergyskeletontitanEntity)entity;
                                                                                    n33 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n33 = 0;
                                                                                }
                                                                                if (n33 == 76 && world instanceof Level) {
                                                                                    _level3 = (Level)world;
                                                                                    if (!_level3.m_5776_()) {
                                                                                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                    } else {
                                                                                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                    }
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    _datEntI = (EnergyskeletontitanEntity)entity;
                                                                                    n32 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n32 = 0;
                                                                                }
                                                                                if (n32 == 87 && world instanceof Level) {
                                                                                    _level3 = (Level)world;
                                                                                    if (!_level3.m_5776_()) {
                                                                                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                    } else {
                                                                                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                    }
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    _datEntI = (EnergyskeletontitanEntity)entity;
                                                                                    n31 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n31 = 0;
                                                                                }
                                                                                if (n31 == 11) break block865;
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    EnergyskeletontitanEntity _datEntI4 = (EnergyskeletontitanEntity)entity;
                                                                                    n30 = (Integer)_datEntI4.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n30 = 0;
                                                                                }
                                                                                if (n30 == 76) break block865;
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    _datEntI3 = (EnergyskeletontitanEntity)entity;
                                                                                    n29 = (Integer)_datEntI3.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                                } else {
                                                                                    n29 = 0;
                                                                                }
                                                                                if (n29 != 89) break block864;
                                                                            }
                                                                            _center = new Vec3(x, y, z);
                                                                            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                            for (Entity entityiterator : list) {
                                                                                if (entityiterator instanceof EnergyskeletontitanEntity) continue;
                                                                                entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                                                                                double _setval = 5.0;
                                                                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                    capability.camerashake = _setval;
                                                                                    capability.syncPlayerVariables(entityiterator);
                                                                                });
                                                                            }
                                                                        }
                                                                        if (!world.m_5776_()) {
                                                                            int n39;
                                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                                _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                                                n39 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                                            } else {
                                                                                n39 = 0;
                                                                            }
                                                                            if (n39 != 0) {
                                                                                float f7;
                                                                                if (entity instanceof LivingEntity) {
                                                                                    LivingEntity _livEnt5 = (LivingEntity)entity;
                                                                                    f7 = _livEnt5.m_21223_();
                                                                                } else {
                                                                                    f7 = -1.0f;
                                                                                }
                                                                                if (f7 <= 0.0f) {
                                                                                    for (int index0 = 0; index0 < 16; ++index0) {
                                                                                        if (!(entity instanceof EnergyskeletontitanEntity)) continue;
                                                                                        ((EnergyskeletontitanEntity)entity).setAnimation("empty");
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
                                                                        if (f6 > 0.0f && entity instanceof EnergyskeletontitanEntity) {
                                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_deathTick, (Object)0);
                                                                        }
                                                                        if (entity instanceof LivingEntity) {
                                                                            LivingEntity _livEnt3 = (LivingEntity)entity;
                                                                            f5 = _livEnt3.m_21223_();
                                                                        } else {
                                                                            f5 = -1.0f;
                                                                        }
                                                                        if (f5 <= 0.0f) {
                                                                            int n40;
                                                                            if (entity instanceof Mob) {
                                                                                _entity = (Mob)entity;
                                                                                _entity.m_6710_(null);
                                                                            }
                                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                                _datEntI = (EnergyskeletontitanEntity)entity;
                                                                                n40 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                                            } else {
                                                                                n40 = 0;
                                                                            }
                                                                            if (n40 == 0) {
                                                                                int n41;
                                                                                int n42;
                                                                                int n43;
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    int n44;
                                                                                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                                                        EnergyskeletontitanEntity _datEntI32 = (EnergyskeletontitanEntity)entity;
                                                                                        n44 = (Integer)_datEntI32.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_deathTick);
                                                                                    } else {
                                                                                        n44 = 0;
                                                                                    }
                                                                                    synchedEntityData.m_135381_(EnergyskeletontitanEntity.DATA_deathTick, (Object)(n44 + 1));
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    EnergyskeletontitanEntity _datEntI5 = (EnergyskeletontitanEntity)entity;
                                                                                    n43 = (Integer)_datEntI5.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_deathTick);
                                                                                } else {
                                                                                    n43 = 0;
                                                                                }
                                                                                if (n43 == 1 && world instanceof Level) {
                                                                                    Level _level22 = (Level)world;
                                                                                    if (!_level22.m_5776_()) {
                                                                                        _level22.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                    } else {
                                                                                        _level22.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletontitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                    }
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    EnergyskeletontitanEntity _datEntI6 = (EnergyskeletontitanEntity)entity;
                                                                                    n42 = (Integer)_datEntI6.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_deathTick);
                                                                                } else {
                                                                                    n42 = 0;
                                                                                }
                                                                                if (n42 < 3) {
                                                                                    for (int index1 = 0; index1 < 12; ++index1) {
                                                                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                                                                    }
                                                                                }
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    EnergyskeletontitanEntity _datEntI7 = (EnergyskeletontitanEntity)entity;
                                                                                    n41 = (Integer)_datEntI7.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_deathTick);
                                                                                } else {
                                                                                    n41 = 0;
                                                                                }
                                                                                if (n41 >= 200 && !entity.m_9236_().m_5776_()) {
                                                                                    entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                                            _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                                            n28 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_spawnTick);
                                                                        } else {
                                                                            n28 = 0;
                                                                        }
                                                                        if (n28 < 115) break block866;
                                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                                            _datEntI = (EnergyskeletontitanEntity)entity;
                                                                            n27 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                                        } else {
                                                                            n27 = 0;
                                                                        }
                                                                        if (n27 == 0) {
                                                                            int n45;
                                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                                EnergyskeletontitanEntity _datEntI8 = (EnergyskeletontitanEntity)entity;
                                                                                n45 = (Integer)_datEntI8.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_flyID);
                                                                            } else {
                                                                                n45 = 0;
                                                                            }
                                                                            if (n45 != 0) {
                                                                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                                                            }
                                                                        }
                                                                        if (world.m_5776_()) break block866;
                                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                                            _datEntI = (EnergyskeletontitanEntity)entity;
                                                                            n26 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                                        } else {
                                                                            n26 = 0;
                                                                        }
                                                                        if (n26 != 0 && entity instanceof EnergyskeletontitanEntity) {
                                                                            int n46;
                                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                                _datEntI3 = (EnergyskeletontitanEntity)entity;
                                                                                n46 = (Integer)_datEntI3.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                                            } else {
                                                                                n46 = 0;
                                                                            }
                                                                            synchedEntityData.m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)(n46 + 1));
                                                                        }
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt5 = (Mob)entity;
                                                                            livingEntity7 = _mobEnt5.m_5448_();
                                                                        } else {
                                                                            livingEntity7 = null;
                                                                        }
                                                                        if (livingEntity7 == null) break block867;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt6 = (Mob)entity;
                                                                            v28 = _mobEnt6.m_5448_();
                                                                        } else {
                                                                            v28 = livingEntity6 = null;
                                                                        }
                                                                        if (livingEntity6 instanceof LivingEntity) {
                                                                            LivingEntity _livEnt3 = livingEntity6;
                                                                            f4 = _livEnt3.m_21223_();
                                                                        } else {
                                                                            f4 = -1.0f;
                                                                        }
                                                                        if (f4 <= 0.0f) break block868;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt42 = (Mob)entity;
                                                                            livingEntity5 = _mobEnt42.m_5448_();
                                                                        } else {
                                                                            livingEntity5 = null;
                                                                        }
                                                                        if (livingEntity5.m_6084_()) break block867;
                                                                    }
                                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                                        EnergyskeletontitanEntity energyskeletontitanEntity = (EnergyskeletontitanEntity)entity;
                                                                        energyskeletontitanEntity.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_flyID, (Object)0);
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        mob.m_6710_(null);
                                                                    }
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity4 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity4 = null;
                                                                }
                                                                if (livingEntity4 != null) {
                                                                    float f8;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt7 = (Mob)entity;
                                                                        v32 = _mobEnt7.m_5448_();
                                                                    } else {
                                                                        v32 = _mobEnt42 = null;
                                                                    }
                                                                    if (_mobEnt42 instanceof LivingEntity) {
                                                                        LivingEntity _livEnt4 = _mobEnt42;
                                                                        f8 = _livEnt4.m_21223_();
                                                                    } else {
                                                                        f8 = -1.0f;
                                                                    }
                                                                    if (f8 > 0.0f) {
                                                                        int n47;
                                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                                            EnergyskeletontitanEntity _datEntI9 = (EnergyskeletontitanEntity)entity;
                                                                            n47 = (Integer)_datEntI9.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                                        } else {
                                                                            n47 = 0;
                                                                        }
                                                                        if (n47 == 0) {
                                                                            float f9;
                                                                            LivingEntity livingEntity8;
                                                                            Mob _mobEnt5;
                                                                            Mob _mobEnt6;
                                                                            Mob _mobEnt7;
                                                                            Mob _mobEnt8;
                                                                            float f10;
                                                                            LivingEntity livingEntity9;
                                                                            Mob _mobEnt9;
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
                                                                                    Mob _mobEnt22 = (Mob)entity;
                                                                                    livingEntity12 = _mobEnt22.m_5448_();
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
                                                                                    _mobEnt3 = (Mob)entity;
                                                                                    livingEntity13 = _mobEnt3.m_5448_();
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
                                                                                    Mob _mobEnt12 = (Mob)entity;
                                                                                    livingEntity17 = _mobEnt12.m_5448_();
                                                                                } else {
                                                                                    livingEntity17 = null;
                                                                                }
                                                                                double d = livingEntity17.m_20185_();
                                                                                if (entity instanceof Mob) {
                                                                                    Mob _mobEnt13 = (Mob)entity;
                                                                                    livingEntity16 = _mobEnt13.m_5448_();
                                                                                } else {
                                                                                    livingEntity16 = null;
                                                                                }
                                                                                double d2 = livingEntity16.m_20186_();
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt9 = (Mob)entity;
                                                                                    livingEntity15 = _mobEnt9.m_5448_();
                                                                                } else {
                                                                                    livingEntity15 = null;
                                                                                }
                                                                                double d3 = d2 + (double)livingEntity15.m_20206_() / 1.5;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt9 = (Mob)entity;
                                                                                    livingEntity14 = _mobEnt9.m_5448_();
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
                                                                                    _mobEnt3 = (Mob)entity;
                                                                                    livingEntity18 = _mobEnt3.m_5448_();
                                                                                } else {
                                                                                    livingEntity18 = null;
                                                                                }
                                                                                f10 = entity.m_20270_(livingEntity18);
                                                                            } else {
                                                                                f10 = -1.0f;
                                                                            }
                                                                            if (f10 > 64.0f) {
                                                                                int n48;
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
                                                                                    Mob _mobEnt11 = (Mob)entity;
                                                                                    livingEntity24 = _mobEnt11.m_5448_();
                                                                                } else {
                                                                                    livingEntity24 = null;
                                                                                }
                                                                                double d = livingEntity24.m_20185_() - entity.m_20185_();
                                                                                if (entity instanceof Mob) {
                                                                                    Mob _mobEnt14 = (Mob)entity;
                                                                                    livingEntity23 = _mobEnt14.m_5448_();
                                                                                } else {
                                                                                    livingEntity23 = null;
                                                                                }
                                                                                if (livingEntity23 != null) {
                                                                                    LivingEntity livingEntity25;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt9 = (Mob)entity;
                                                                                        livingEntity25 = _mobEnt9.m_5448_();
                                                                                    } else {
                                                                                        livingEntity25 = null;
                                                                                    }
                                                                                    f15 = entity.m_20270_(livingEntity25);
                                                                                } else {
                                                                                    f15 = -1.0f;
                                                                                }
                                                                                double d4 = d / (double)f15 * 2.0;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt8 = (Mob)entity;
                                                                                    livingEntity22 = _mobEnt8.m_5448_();
                                                                                } else {
                                                                                    livingEntity22 = null;
                                                                                }
                                                                                double d5 = livingEntity22.m_20186_() - entity.m_20186_();
                                                                                if (entity instanceof Mob) {
                                                                                    Mob _mobEnt15 = (Mob)entity;
                                                                                    livingEntity21 = _mobEnt15.m_5448_();
                                                                                } else {
                                                                                    livingEntity21 = null;
                                                                                }
                                                                                if (livingEntity21 != null) {
                                                                                    LivingEntity livingEntity26;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt9 = (Mob)entity;
                                                                                        livingEntity26 = _mobEnt9.m_5448_();
                                                                                    } else {
                                                                                        livingEntity26 = null;
                                                                                    }
                                                                                    f14 = entity.m_20270_(livingEntity26);
                                                                                } else {
                                                                                    f14 = -1.0f;
                                                                                }
                                                                                double d6 = d5 / (double)f14 * 2.0;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt8 = (Mob)entity;
                                                                                    livingEntity20 = _mobEnt8.m_5448_();
                                                                                } else {
                                                                                    livingEntity20 = null;
                                                                                }
                                                                                double d7 = livingEntity20.m_20189_() - entity.m_20189_();
                                                                                if (entity instanceof Mob) {
                                                                                    Mob _mobEnt16 = (Mob)entity;
                                                                                    livingEntity19 = _mobEnt16.m_5448_();
                                                                                } else {
                                                                                    livingEntity19 = null;
                                                                                }
                                                                                if (livingEntity19 != null) {
                                                                                    LivingEntity livingEntity27;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt9 = (Mob)entity;
                                                                                        livingEntity27 = _mobEnt9.m_5448_();
                                                                                    } else {
                                                                                        livingEntity27 = null;
                                                                                    }
                                                                                    f13 = entity.m_20270_(livingEntity27);
                                                                                } else {
                                                                                    f13 = -1.0f;
                                                                                }
                                                                                entity.m_20256_(new Vec3(d4, d6, d7 / (double)f13 * 2.0));
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    EnergyskeletontitanEntity _datEntI4 = (EnergyskeletontitanEntity)entity;
                                                                                    n48 = (Integer)_datEntI4.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                                                } else {
                                                                                    n48 = 0;
                                                                                }
                                                                                if (n48 == 0 && entity instanceof EnergyskeletontitanEntity) {
                                                                                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_flyID, (Object)1);
                                                                                }
                                                                            } else {
                                                                                LivingEntity livingEntity28;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt9 = (Mob)entity;
                                                                                    livingEntity28 = _mobEnt9.m_5448_();
                                                                                } else {
                                                                                    livingEntity28 = null;
                                                                                }
                                                                                if (livingEntity28.m_20206_() > 8.0f) {
                                                                                    float f16;
                                                                                    LivingEntity livingEntity29;
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt17 = (Mob)entity;
                                                                                        livingEntity29 = _mobEnt17.m_5448_();
                                                                                    } else {
                                                                                        livingEntity29 = null;
                                                                                    }
                                                                                    if (livingEntity29 != null) {
                                                                                        LivingEntity livingEntity30;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt8 = (Mob)entity;
                                                                                            livingEntity30 = _mobEnt8.m_5448_();
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
                                                                                            Mob _mobEnt10 = (Mob)entity;
                                                                                            livingEntity34 = _mobEnt10.m_5448_();
                                                                                        } else {
                                                                                            livingEntity34 = null;
                                                                                        }
                                                                                        double d = livingEntity34.m_20185_() - entity.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt92 = (Mob)entity;
                                                                                            livingEntity33 = _mobEnt92.m_5448_();
                                                                                        } else {
                                                                                            livingEntity33 = null;
                                                                                        }
                                                                                        if (livingEntity33 != null) {
                                                                                            LivingEntity livingEntity35;
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob _mobEnt82 = (Mob)entity;
                                                                                                livingEntity35 = _mobEnt82.m_5448_();
                                                                                            } else {
                                                                                                livingEntity35 = null;
                                                                                            }
                                                                                            f18 = entity.m_20270_(livingEntity35);
                                                                                        } else {
                                                                                            f18 = -1.0f;
                                                                                        }
                                                                                        double d8 = d / (double)f18;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt7 = (Mob)entity;
                                                                                            livingEntity32 = _mobEnt7.m_5448_();
                                                                                        } else {
                                                                                            livingEntity32 = null;
                                                                                        }
                                                                                        double d9 = livingEntity32.m_20189_() - entity.m_20189_();
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt6 = (Mob)entity;
                                                                                            livingEntity31 = _mobEnt6.m_5448_();
                                                                                        } else {
                                                                                            livingEntity31 = null;
                                                                                        }
                                                                                        if (livingEntity31 != null) {
                                                                                            LivingEntity livingEntity36;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                livingEntity36 = _mobEnt5.m_5448_();
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
                                                                                        Mob _mobEnt18 = (Mob)entity;
                                                                                        livingEntity37 = _mobEnt18.m_5448_();
                                                                                    } else {
                                                                                        livingEntity37 = null;
                                                                                    }
                                                                                    if (livingEntity37 != null) {
                                                                                        LivingEntity livingEntity38;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt8 = (Mob)entity;
                                                                                            livingEntity38 = _mobEnt8.m_5448_();
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
                                                                                            _mobEnt7 = (Mob)entity;
                                                                                            livingEntity42 = _mobEnt7.m_5448_();
                                                                                        } else {
                                                                                            livingEntity42 = null;
                                                                                        }
                                                                                        double d = livingEntity42.m_20185_() - entity.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt6 = (Mob)entity;
                                                                                            livingEntity41 = _mobEnt6.m_5448_();
                                                                                        } else {
                                                                                            livingEntity41 = null;
                                                                                        }
                                                                                        if (livingEntity41 != null) {
                                                                                            LivingEntity livingEntity43;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                livingEntity43 = _mobEnt5.m_5448_();
                                                                                            } else {
                                                                                                livingEntity43 = null;
                                                                                            }
                                                                                            f21 = entity.m_20270_(livingEntity43);
                                                                                        } else {
                                                                                            f21 = -1.0f;
                                                                                        }
                                                                                        double d10 = d / (double)f21;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt7 = (Mob)entity;
                                                                                            livingEntity40 = _mobEnt7.m_5448_();
                                                                                        } else {
                                                                                            livingEntity40 = null;
                                                                                        }
                                                                                        double d11 = livingEntity40.m_20189_() - entity.m_20189_();
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt6 = (Mob)entity;
                                                                                            livingEntity39 = _mobEnt6.m_5448_();
                                                                                        } else {
                                                                                            livingEntity39 = null;
                                                                                        }
                                                                                        if (livingEntity39 != null) {
                                                                                            LivingEntity livingEntity44;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                livingEntity44 = _mobEnt5.m_5448_();
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
                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_flyID, (Object)0);
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
                                                                                    _mobEnt3 = (Mob)entity;
                                                                                    livingEntity45 = _mobEnt3.m_5448_();
                                                                                } else {
                                                                                    livingEntity45 = null;
                                                                                }
                                                                                f9 = entity.m_20270_(livingEntity45);
                                                                            } else {
                                                                                f9 = -1.0f;
                                                                            }
                                                                            if (f9 < 160.0f) {
                                                                                float f22;
                                                                                LivingEntity livingEntity46;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt9 = (Mob)entity;
                                                                                    livingEntity46 = _mobEnt9.m_5448_();
                                                                                } else {
                                                                                    livingEntity46 = null;
                                                                                }
                                                                                if (livingEntity46 != null) {
                                                                                    LivingEntity livingEntity47;
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt19 = (Mob)entity;
                                                                                        livingEntity47 = _mobEnt19.m_5448_();
                                                                                    } else {
                                                                                        livingEntity47 = null;
                                                                                    }
                                                                                    f22 = entity.m_20270_(livingEntity47);
                                                                                } else {
                                                                                    f22 = -1.0f;
                                                                                }
                                                                                if (f22 <= 40.0f) {
                                                                                    LivingEntity livingEntity48;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt8 = (Mob)entity;
                                                                                        livingEntity48 = _mobEnt8.m_5448_();
                                                                                    } else {
                                                                                        livingEntity48 = null;
                                                                                    }
                                                                                    if (livingEntity48.m_20206_() > 6.0f) {
                                                                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)20) == 5) {
                                                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                                                _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                                _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)8);
                                                                                            }
                                                                                        } else if (entity instanceof EnergyskeletontitanEntity) {
                                                                                            _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)7));
                                                                                        }
                                                                                    } else if (entity instanceof EnergyskeletontitanEntity) {
                                                                                        _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                        _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                                                    }
                                                                                }
                                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                                                    int n49;
                                                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                                                        EnergyskeletontitanEntity _datEntI10 = (EnergyskeletontitanEntity)entity;
                                                                                        n49 = (Integer)_datEntI10.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                                                    } else {
                                                                                        n49 = 0;
                                                                                    }
                                                                                    if (n49 == 0) {
                                                                                        float f23;
                                                                                        LivingEntity livingEntity49;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt20 = (Mob)entity;
                                                                                            livingEntity49 = _mobEnt20.m_5448_();
                                                                                        } else {
                                                                                            livingEntity49 = null;
                                                                                        }
                                                                                        if (livingEntity49 != null) {
                                                                                            LivingEntity livingEntity50;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt8 = (Mob)entity;
                                                                                                livingEntity50 = _mobEnt8.m_5448_();
                                                                                            } else {
                                                                                                livingEntity50 = null;
                                                                                            }
                                                                                            f23 = entity.m_20270_(livingEntity50);
                                                                                        } else {
                                                                                            f23 = -1.0f;
                                                                                        }
                                                                                        if (f23 > 60.0f) {
                                                                                            LivingEntity livingEntity51;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                livingEntity51 = _mobEnt5.m_5448_();
                                                                                            } else {
                                                                                                livingEntity51 = null;
                                                                                            }
                                                                                            if (livingEntity51.m_20206_() > 6.0f) {
                                                                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                                                                    _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)10));
                                                                                                }
                                                                                            } else if (entity instanceof EnergyskeletontitanEntity) {
                                                                                                _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                                _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)10));
                                                                                            }
                                                                                        } else {
                                                                                            float f24;
                                                                                            LivingEntity livingEntity52;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                livingEntity52 = _mobEnt5.m_5448_();
                                                                                            } else {
                                                                                                livingEntity52 = null;
                                                                                            }
                                                                                            if (livingEntity52 != null) {
                                                                                                LivingEntity livingEntity53;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt6 = (Mob)entity;
                                                                                                    livingEntity53 = _mobEnt6.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity53 = null;
                                                                                                }
                                                                                                f24 = entity.m_20270_(livingEntity53);
                                                                                            } else {
                                                                                                f24 = -1.0f;
                                                                                            }
                                                                                            if (f24 > 40.0f) {
                                                                                                LivingEntity livingEntity54;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt7 = (Mob)entity;
                                                                                                    livingEntity54 = _mobEnt7.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity54 = null;
                                                                                                }
                                                                                                if (livingEntity54.m_20206_() > 6.0f) {
                                                                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                                                                        _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                                        _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)4, (int)9));
                                                                                                    }
                                                                                                } else if (entity instanceof EnergyskeletontitanEntity) {
                                                                                                    _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                                                                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
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
                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                                n25 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                            } else {
                                                                n25 = 0;
                                                            }
                                                            if (n25 != true) break block869;
                                                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.zt");
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity3 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity3 = null;
                                                            }
                                                            if (livingEntity3 != null) {
                                                                LivingEntity livingEntity55;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt21 = (Mob)entity;
                                                                    livingEntity55 = _mobEnt21.m_5448_();
                                                                } else {
                                                                    livingEntity55 = null;
                                                                }
                                                                f3 = entity.m_20270_(livingEntity55);
                                                            } else {
                                                                f3 = -1.0f;
                                                            }
                                                            if (f3 > 1.0f) {
                                                                LivingEntity livingEntity56;
                                                                LivingEntity livingEntity57;
                                                                LivingEntity livingEntity58;
                                                                LivingEntity livingEntity59;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity59 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity59 = null;
                                                                }
                                                                double d = livingEntity59.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity58 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity58 = null;
                                                                }
                                                                double d12 = livingEntity58.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity57 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity57 = null;
                                                                }
                                                                double d13 = d12 + (double)livingEntity57.m_20206_() / 1.5;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity56 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity56 = null;
                                                                }
                                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d13, livingEntity56.m_20189_()));
                                                            }
                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                _datEntI = (EnergyskeletontitanEntity)entity;
                                                                n24 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                            } else {
                                                                n24 = 0;
                                                            }
                                                            if (n24 == 70) break block870;
                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                EnergyskeletontitanEntity _datEntI11 = (EnergyskeletontitanEntity)entity;
                                                                n23 = (Integer)_datEntI11.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                            } else {
                                                                n23 = 0;
                                                            }
                                                            if (n23 != 114) break block871;
                                                        }
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        Vec3 _center22 = new Vec3(x, y, z);
                                                        List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center22, _center22).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                                                        for (Entity entityiterator2 : _entfound3) {
                                                            float f25;
                                                            float f26;
                                                            float f27;
                                                            float f28;
                                                            float f29;
                                                            float f30;
                                                            float f31;
                                                            if (entityiterator2 instanceof EnergyskeletontitanEntity || entityiterator2 instanceof LightningBolt || !(entityiterator2 instanceof LivingEntity)) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator2 instanceof LivingEntity) {
                                                                LivingEntity _livEnt22 = (LivingEntity)entityiterator2;
                                                                f31 = _livEnt22.m_21233_();
                                                            } else {
                                                                f31 = -1.0f;
                                                            }
                                                            entityiterator2.m_6469_(damageSource, f31 / 20.0f + 15000.0f);
                                                            if (entityiterator2 instanceof Titangodentity) continue;
                                                            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                                                                entityiterator2.f_19802_ = 0;
                                                                Deathlist.normalattack(entityiterator2);
                                                            }
                                                            DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                            if (entityiterator2 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator2;
                                                                f30 = _livEnt2.m_21233_();
                                                            } else {
                                                                f30 = -1.0f;
                                                            }
                                                            entityiterator2.m_6469_(damageSource2, f30 / 20.0f + 15000.0f);
                                                            DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                            if (entityiterator2 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator2;
                                                                f29 = _livEnt2.m_21233_();
                                                            } else {
                                                                f29 = -1.0f;
                                                            }
                                                            entityiterator2.m_6469_(damageSource3, f29 / 20.0f + 15000.0f);
                                                            entityiterator2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                            if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                                                            DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator2 instanceof LivingEntity) {
                                                                LivingEntity _livEnt6 = (LivingEntity)entityiterator2;
                                                                f28 = _livEnt6.m_21233_();
                                                            } else {
                                                                f28 = -1.0f;
                                                            }
                                                            if (entityiterator2 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator2;
                                                                f27 = _livEnt2.m_21223_();
                                                            } else {
                                                                f27 = -1.0f;
                                                            }
                                                            entityiterator2.m_6469_(damageSource4, (f28 + f27) / 5.0f + 150000.0f);
                                                            DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                            if (entityiterator2 instanceof LivingEntity) {
                                                                LivingEntity _livEnt5 = (LivingEntity)entityiterator2;
                                                                f26 = _livEnt5.m_21233_();
                                                            } else {
                                                                f26 = -1.0f;
                                                            }
                                                            if (entityiterator2 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator2;
                                                                f25 = _livEnt2.m_21223_();
                                                            } else {
                                                                f25 = -1.0f;
                                                            }
                                                            entityiterator2.m_6469_(damageSource5, (f26 + f25) / 5.0f + 150000.0f);
                                                        }
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n22 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n22 = 0;
                                                    }
                                                    if (n22 >= 160) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                    n21 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                } else {
                                                    n21 = 0;
                                                }
                                                if (n21 == 2) {
                                                    int n50;
                                                    int n51;
                                                    float f32;
                                                    LivingEntity livingEntity60;
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.zp1");
                                                        }
                                                    } else if (entity instanceof EnergyskeletontitanEntity) {
                                                        ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.zp2");
                                                    }
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity60 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity60 = null;
                                                    }
                                                    if (livingEntity60 != null) {
                                                        LivingEntity livingEntity61;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt22 = (Mob)entity;
                                                            livingEntity61 = _mobEnt22.m_5448_();
                                                        } else {
                                                            livingEntity61 = null;
                                                        }
                                                        f32 = entity.m_20270_(livingEntity61);
                                                    } else {
                                                        f32 = -1.0f;
                                                    }
                                                    if (f32 > 1.0f) {
                                                        LivingEntity livingEntity62;
                                                        LivingEntity livingEntity63;
                                                        LivingEntity livingEntity64;
                                                        LivingEntity livingEntity65;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity65 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity65 = null;
                                                        }
                                                        double d = livingEntity65.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt = (Mob)entity;
                                                            livingEntity64 = _mobEnt.m_5448_();
                                                        } else {
                                                            livingEntity64 = null;
                                                        }
                                                        double d14 = livingEntity64.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity63 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity63 = null;
                                                        }
                                                        double d15 = d14 + (double)livingEntity63.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity62 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity62 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d15, livingEntity62.m_20189_()));
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n51 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n51 = 0;
                                                    }
                                                    if (n51 == 26) {
                                                        if (world instanceof Level) {
                                                            Level _level4 = (Level)world;
                                                            if (!_level4.m_5776_()) {
                                                                _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        Vec3 _center3 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                        for (Entity entity2 : _entfound) {
                                                            float f33;
                                                            float f34;
                                                            float f35;
                                                            float f36;
                                                            float f37;
                                                            float f38;
                                                            float f39;
                                                            if (entity2 instanceof EnergyskeletontitanEntity || entity2 instanceof LightningBolt || !(entity2 instanceof LivingEntity)) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity2 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity2;
                                                                f39 = _livEnt.m_21233_();
                                                            } else {
                                                                f39 = -1.0f;
                                                            }
                                                            entity2.m_6469_(damageSource, f39 / 20.0f + 15000.0f);
                                                            if (entity2 instanceof Titangodentity) continue;
                                                            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity2 instanceof Player)) {
                                                                entity2.f_19802_ = 0;
                                                                Deathlist.normalattack(entity2);
                                                            }
                                                            DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                            if (entity2 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity2;
                                                                f38 = _livEnt.m_21233_();
                                                            } else {
                                                                f38 = -1.0f;
                                                            }
                                                            entity2.m_6469_(damageSource6, f38 / 20.0f + 15000.0f);
                                                            DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                            if (entity2 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity2;
                                                                f37 = _livEnt.m_21233_();
                                                            } else {
                                                                f37 = -1.0f;
                                                            }
                                                            entity2.m_6469_(damageSource7, f37 / 20.0f + 15000.0f);
                                                            entity2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                            if (!(entity2.m_20206_() > 6.0f)) continue;
                                                            DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity2 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity2;
                                                                f36 = _livEnt2.m_21233_();
                                                            } else {
                                                                f36 = -1.0f;
                                                            }
                                                            if (entity2 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity2;
                                                                f35 = _livEnt.m_21223_();
                                                            } else {
                                                                f35 = -1.0f;
                                                            }
                                                            entity2.m_6469_(damageSource8, (f36 + f35) / 5.0f + 150000.0f);
                                                            DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                            if (entity2 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity2;
                                                                f34 = _livEnt2.m_21233_();
                                                            } else {
                                                                f34 = -1.0f;
                                                            }
                                                            if (entity2 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity2;
                                                                f33 = _livEnt.m_21223_();
                                                            } else {
                                                                f33 = -1.0f;
                                                            }
                                                            entity2.m_6469_(damageSource9, (f34 + f33) / 5.0f + 150000.0f);
                                                        }
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n50 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n50 = 0;
                                                    }
                                                    if (n50 >= 44) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                    n20 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                } else {
                                                    n20 = 0;
                                                }
                                                if (n20 == 3) {
                                                    int n52;
                                                    int n53;
                                                    float f40;
                                                    LivingEntity livingEntity66;
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.qj");
                                                    }
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity66 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity66 = null;
                                                    }
                                                    if (livingEntity66 != null) {
                                                        LivingEntity livingEntity67;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt23 = (Mob)entity;
                                                            livingEntity67 = _mobEnt23.m_5448_();
                                                        } else {
                                                            livingEntity67 = null;
                                                        }
                                                        f40 = entity.m_20270_(livingEntity67);
                                                    } else {
                                                        f40 = -1.0f;
                                                    }
                                                    if (f40 > 1.0f) {
                                                        LivingEntity livingEntity68;
                                                        LivingEntity livingEntity69;
                                                        LivingEntity livingEntity70;
                                                        LivingEntity livingEntity71;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity71 = _mobEnt2.m_5448_();
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
                                                        double d16 = livingEntity70.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity69 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity69 = null;
                                                        }
                                                        double d17 = d16 + (double)livingEntity69.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity68 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity68 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity68.m_20189_()));
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n53 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n53 = 0;
                                                    }
                                                    if (n53 == 44) {
                                                        if (world instanceof Level) {
                                                            Level _level5 = (Level)world;
                                                            if (!_level5.m_5776_()) {
                                                                _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        Vec3 _center4 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                                                        for (Entity entity3 : _entfound) {
                                                            float f41;
                                                            float f42;
                                                            float f43;
                                                            float f44;
                                                            float f45;
                                                            float f46;
                                                            float f47;
                                                            if (entity3 instanceof EnergyskeletontitanEntity || entity3 instanceof LightningBolt || !(entity3 instanceof LivingEntity)) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity3 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity3;
                                                                f47 = _livEnt.m_21233_();
                                                            } else {
                                                                f47 = -1.0f;
                                                            }
                                                            entity3.m_6469_(damageSource, f47 / 20.0f + 18000.0f);
                                                            if (entity3 instanceof Titangodentity) continue;
                                                            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity3 instanceof Player)) {
                                                                entity3.f_19802_ = 0;
                                                                Deathlist.normalattack(entity3);
                                                            }
                                                            DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                            if (entity3 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity3;
                                                                f46 = _livEnt.m_21233_();
                                                            } else {
                                                                f46 = -1.0f;
                                                            }
                                                            entity3.m_6469_(damageSource10, f46 / 20.0f + 18000.0f);
                                                            DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                            if (entity3 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity3;
                                                                f45 = _livEnt.m_21233_();
                                                            } else {
                                                                f45 = -1.0f;
                                                            }
                                                            entity3.m_6469_(damageSource11, f45 / 20.0f + 18000.0f);
                                                            entity3.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                            if (!(entity3.m_20206_() > 6.0f)) continue;
                                                            DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity3 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity3;
                                                                f44 = _livEnt2.m_21233_();
                                                            } else {
                                                                f44 = -1.0f;
                                                            }
                                                            if (entity3 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity3;
                                                                f43 = _livEnt.m_21223_();
                                                            } else {
                                                                f43 = -1.0f;
                                                            }
                                                            entity3.m_6469_(damageSource12, (f44 + f43) / 5.0f + 180000.0f);
                                                            DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                            if (entity3 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity3;
                                                                f42 = _livEnt2.m_21233_();
                                                            } else {
                                                                f42 = -1.0f;
                                                            }
                                                            if (entity3 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity3;
                                                                f41 = _livEnt.m_21223_();
                                                            } else {
                                                                f41 = -1.0f;
                                                            }
                                                            entity3.m_6469_(damageSource13, (f42 + f41) / 5.0f + 180000.0f);
                                                        }
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n52 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n52 = 0;
                                                    }
                                                    if (n52 >= 70) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                    n19 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                } else {
                                                    n19 = 0;
                                                }
                                                if (n19 == 4) {
                                                    int n54;
                                                    int n55;
                                                    float f48;
                                                    LivingEntity livingEntity72;
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.attack");
                                                        }
                                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.attack1");
                                                        }
                                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.attack3");
                                                        }
                                                    } else if (entity instanceof EnergyskeletontitanEntity) {
                                                        ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.attack4");
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity72 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity72 = null;
                                                    }
                                                    if (livingEntity72 != null) {
                                                        LivingEntity livingEntity73;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt24 = (Mob)entity;
                                                            livingEntity73 = _mobEnt24.m_5448_();
                                                        } else {
                                                            livingEntity73 = null;
                                                        }
                                                        f48 = entity.m_20270_(livingEntity73);
                                                    } else {
                                                        f48 = -1.0f;
                                                    }
                                                    if (f48 > 1.0f) {
                                                        LivingEntity livingEntity74;
                                                        LivingEntity livingEntity75;
                                                        LivingEntity livingEntity76;
                                                        LivingEntity livingEntity77;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity77 = _mobEnt2.m_5448_();
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
                                                        double d18 = livingEntity76.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity75 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity75 = null;
                                                        }
                                                        double d19 = d18 + (double)livingEntity75.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity74 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity74 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d19, livingEntity74.m_20189_()));
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n55 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n55 = 0;
                                                    }
                                                    if (n55 == 16) {
                                                        if (world instanceof Level) {
                                                            Level _level6 = (Level)world;
                                                            if (!_level6.m_5776_()) {
                                                                _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        Vec3 _center5 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                                                        for (Entity entity4 : _entfound) {
                                                            float f49;
                                                            float f50;
                                                            float f51;
                                                            float f52;
                                                            float f53;
                                                            float f54;
                                                            float f55;
                                                            if (entity4 instanceof EnergyskeletontitanEntity || entity4 instanceof LightningBolt || !(entity4 instanceof LivingEntity)) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity4 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity4;
                                                                f55 = _livEnt.m_21233_();
                                                            } else {
                                                                f55 = -1.0f;
                                                            }
                                                            entity4.m_6469_(damageSource, f55 / 20.0f + 84000.0f);
                                                            if (entity4 instanceof Titangodentity) continue;
                                                            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity4 instanceof Player)) {
                                                                entity4.f_19802_ = 0;
                                                                Deathlist.normalattack(entity4);
                                                            }
                                                            DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                            if (entity4 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity4;
                                                                f54 = _livEnt.m_21233_();
                                                            } else {
                                                                f54 = -1.0f;
                                                            }
                                                            entity4.m_6469_(damageSource14, f54 / 20.0f + 84000.0f);
                                                            DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                            if (entity4 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity4;
                                                                f53 = _livEnt.m_21233_();
                                                            } else {
                                                                f53 = -1.0f;
                                                            }
                                                            entity4.m_6469_(damageSource15, f53 / 20.0f + 84000.0f);
                                                            if (!(entity4.m_20206_() > 6.0f)) continue;
                                                            DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity4 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity4;
                                                                f52 = _livEnt2.m_21233_();
                                                            } else {
                                                                f52 = -1.0f;
                                                            }
                                                            if (entity4 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity4;
                                                                f51 = _livEnt.m_21223_();
                                                            } else {
                                                                f51 = -1.0f;
                                                            }
                                                            entity4.m_6469_(damageSource16, (f52 + f51) / 5.0f + 840000.0f);
                                                            DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                            if (entity4 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity4;
                                                                f50 = _livEnt2.m_21233_();
                                                            } else {
                                                                f50 = -1.0f;
                                                            }
                                                            if (entity4 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity4;
                                                                f49 = _livEnt.m_21223_();
                                                            } else {
                                                                f49 = -1.0f;
                                                            }
                                                            entity4.m_6469_(damageSource17, (f50 + f49) / 5.0f + 840000.0f);
                                                        }
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n54 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n54 = 0;
                                                    }
                                                    if (n54 >= 30) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                    n18 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                } else {
                                                    n18 = 0;
                                                }
                                                if (n18 == 5) {
                                                    int n56;
                                                    int n57;
                                                    int n58;
                                                    float f56;
                                                    LivingEntity livingEntity78;
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.sd2");
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity78 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity78 = null;
                                                    }
                                                    if (livingEntity78 != null) {
                                                        LivingEntity livingEntity79;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt25 = (Mob)entity;
                                                            livingEntity79 = _mobEnt25.m_5448_();
                                                        } else {
                                                            livingEntity79 = null;
                                                        }
                                                        f56 = entity.m_20270_(livingEntity79);
                                                    } else {
                                                        f56 = -1.0f;
                                                    }
                                                    if (f56 > 1.0f) {
                                                        LivingEntity livingEntity80;
                                                        LivingEntity livingEntity81;
                                                        LivingEntity livingEntity82;
                                                        LivingEntity livingEntity83;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity83 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity83 = null;
                                                        }
                                                        double d = livingEntity83.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt = (Mob)entity;
                                                            livingEntity82 = _mobEnt.m_5448_();
                                                        } else {
                                                            livingEntity82 = null;
                                                        }
                                                        double d20 = livingEntity82.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity81 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity81 = null;
                                                        }
                                                        double d21 = d20 + (double)livingEntity81.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity80 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity80 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d21, livingEntity80.m_20189_()));
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n58 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n58 = 0;
                                                    }
                                                    if (n58 >= 32) {
                                                        int n59;
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntI12 = (EnergyskeletontitanEntity)entity;
                                                            n59 = (Integer)_datEntI12.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                        } else {
                                                            n59 = 0;
                                                        }
                                                        if (n59 <= 56 && world instanceof ServerLevel) {
                                                            int n60;
                                                            int n61;
                                                            _level2 = (ServerLevel)world;
                                                            EntityType entityType = (EntityType)UltimateskeletonsModEntities.PURPLELIGHTNING.get();
                                                            double d = entity.m_20154_().f_82479_;
                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                EnergyskeletontitanEntity energyskeletontitanEntity = (EnergyskeletontitanEntity)entity;
                                                                n61 = (Integer)energyskeletontitanEntity.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                            } else {
                                                                n61 = 0;
                                                            }
                                                            double d22 = x + d * (double)(n61 - 14);
                                                            double d23 = entity.m_20154_().f_82481_;
                                                            if (entity instanceof EnergyskeletontitanEntity) {
                                                                EnergyskeletontitanEntity energyskeletontitanEntity = (EnergyskeletontitanEntity)entity;
                                                                n60 = (Integer)energyskeletontitanEntity.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                            } else {
                                                                n60 = 0;
                                                            }
                                                            Entity entityToSpawn2 = entityType.m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)d22, (double)(y + 40.0), (double)(z + d23 * (double)(n60 - 14))), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn2 != null) {
                                                                entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n57 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n57 = 0;
                                                    }
                                                    if (n57 == 64) {
                                                        float f57;
                                                        LivingEntity livingEntity84;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt26 = (Mob)entity;
                                                            livingEntity84 = _mobEnt26.m_5448_();
                                                        } else {
                                                            livingEntity84 = null;
                                                        }
                                                        if (livingEntity84 != null) {
                                                            LivingEntity livingEntity85;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt2 = (Mob)entity;
                                                                livingEntity85 = _mobEnt2.m_5448_();
                                                            } else {
                                                                livingEntity85 = null;
                                                            }
                                                            f57 = entity.m_20270_(livingEntity85);
                                                        } else {
                                                            f57 = -1.0f;
                                                        }
                                                        if (f57 > 1.0f && world instanceof ServerLevel) {
                                                            LivingEntity livingEntity86;
                                                            LivingEntity livingEntity87;
                                                            LivingEntity livingEntity88;
                                                            _level = (ServerLevel)world;
                                                            EntityType entityType = (EntityType)UltimateskeletonsModEntities.PURPLELIGHTNING.get();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity88 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity88 = null;
                                                            }
                                                            double d = livingEntity88.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity87 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity87 = null;
                                                            }
                                                            double d24 = livingEntity87.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity86 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity86 = null;
                                                            }
                                                            Entity entity5 = entityType.m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)d, (double)d24, (double)livingEntity86.m_20189_()), MobSpawnType.MOB_SUMMONED);
                                                            if (entity5 != null) {
                                                                entity5.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                            }
                                                        }
                                                        if (world instanceof Level) {
                                                            Level _level7 = (Level)world;
                                                            if (!_level7.m_5776_()) {
                                                                _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        for (int index2 = 0; index2 < 32; ++index2) {
                                                            if (!(world instanceof ServerLevel)) continue;
                                                            _level2 = (ServerLevel)world;
                                                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.PURPLELIGHTNING.get()).m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn == null) continue;
                                                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                        }
                                                        Vec3 _center6 = new Vec3(x, y, z);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(240.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                                                        for (Entity entity6 : _entfound) {
                                                            float f58;
                                                            float f59;
                                                            float f60;
                                                            float f61;
                                                            float f62;
                                                            float f63;
                                                            float f64;
                                                            if (entity6 instanceof EnergyskeletontitanEntity || entity6 instanceof LightningBolt || !(entity6 instanceof LivingEntity)) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                            if (entity6 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity6;
                                                                f64 = _livEnt.m_21233_();
                                                            } else {
                                                                f64 = -1.0f;
                                                            }
                                                            entity6.m_6469_(damageSource, f64 / 20.0f + 30000.0f);
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
                                                            entity6.m_6469_(damageSource18, f63 / 20.0f + 30000.0f);
                                                            DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                            if (entity6 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity6;
                                                                f62 = _livEnt.m_21233_();
                                                            } else {
                                                                f62 = -1.0f;
                                                            }
                                                            entity6.m_6469_(damageSource19, f62 / 20.0f + 30000.0f);
                                                            entity6.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                            if (!(entity6.m_20206_() > 6.0f)) continue;
                                                            DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity6 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity6;
                                                                f61 = _livEnt2.m_21233_();
                                                            } else {
                                                                f61 = -1.0f;
                                                            }
                                                            if (entity6 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity6;
                                                                f60 = _livEnt.m_21223_();
                                                            } else {
                                                                f60 = -1.0f;
                                                            }
                                                            entity6.m_6469_(damageSource20, (f61 + f60) / 5.0f + 300000.0f);
                                                            DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                            if (entity6 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity6;
                                                                f59 = _livEnt2.m_21233_();
                                                            } else {
                                                                f59 = -1.0f;
                                                            }
                                                            if (entity6 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity6;
                                                                f58 = _livEnt.m_21223_();
                                                            } else {
                                                                f58 = -1.0f;
                                                            }
                                                            entity6.m_6469_(damageSource21, (f59 + f58) / 5.0f + 300000.0f);
                                                        }
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n56 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n56 = 0;
                                                    }
                                                    if (n56 >= 90) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                    n17 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                } else {
                                                    n17 = 0;
                                                }
                                                if (n17 == 6) {
                                                    int n62;
                                                    int n63;
                                                    float f65;
                                                    LivingEntity livingEntity89;
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.a1");
                                                    }
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity89 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity89 = null;
                                                    }
                                                    if (livingEntity89 != null) {
                                                        LivingEntity livingEntity90;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt27 = (Mob)entity;
                                                            livingEntity90 = _mobEnt27.m_5448_();
                                                        } else {
                                                            livingEntity90 = null;
                                                        }
                                                        f65 = entity.m_20270_(livingEntity90);
                                                    } else {
                                                        f65 = -1.0f;
                                                    }
                                                    if (f65 > 1.0f) {
                                                        LivingEntity livingEntity91;
                                                        LivingEntity livingEntity92;
                                                        LivingEntity livingEntity93;
                                                        LivingEntity livingEntity94;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity94 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity94 = null;
                                                        }
                                                        double d = livingEntity94.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt = (Mob)entity;
                                                            livingEntity93 = _mobEnt.m_5448_();
                                                        } else {
                                                            livingEntity93 = null;
                                                        }
                                                        double d25 = livingEntity93.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity92 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity92 = null;
                                                        }
                                                        double d26 = d25 + (double)livingEntity92.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt2 = (Mob)entity;
                                                            livingEntity91 = _mobEnt2.m_5448_();
                                                        } else {
                                                            livingEntity91 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity91.m_20189_()));
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n63 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n63 = 0;
                                                    }
                                                    if (n63 == 16) {
                                                        if (world instanceof Level) {
                                                            Level _level8 = (Level)world;
                                                            if (!_level8.m_5776_()) {
                                                                _level8.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level8.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        Vec3 _center7 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82479_ * 40.0);
                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center7, _center7).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center7))).toList();
                                                        for (Entity entity7 : _entfound) {
                                                            float f66;
                                                            float f67;
                                                            float f68;
                                                            float f69;
                                                            float f70;
                                                            float f71;
                                                            float f72;
                                                            if (entity7 instanceof EnergyskeletontitanEntity || entity7 instanceof LightningBolt || !(entity7 instanceof LivingEntity)) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity7 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity7;
                                                                f72 = _livEnt.m_21233_();
                                                            } else {
                                                                f72 = -1.0f;
                                                            }
                                                            entity7.m_6469_(damageSource, f72 / 20.0f + 100000.0f);
                                                            if (entity7 instanceof Titangodentity) continue;
                                                            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity7 instanceof Player)) {
                                                                entity7.f_19802_ = 0;
                                                                Deathlist.normalattack(entity7);
                                                            }
                                                            DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                                            if (entity7 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity7;
                                                                f71 = _livEnt.m_21233_();
                                                            } else {
                                                                f71 = -1.0f;
                                                            }
                                                            entity7.m_6469_(damageSource22, f71 / 20.0f + 100000.0f);
                                                            DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                                            if (entity7 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity7;
                                                                f70 = _livEnt.m_21233_();
                                                            } else {
                                                                f70 = -1.0f;
                                                            }
                                                            entity7.m_6469_(damageSource23, f70 / 20.0f + 100000.0f);
                                                            if (!(entity7.m_20206_() > 6.0f)) continue;
                                                            DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entity7 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity7;
                                                                f69 = _livEnt2.m_21233_();
                                                            } else {
                                                                f69 = -1.0f;
                                                            }
                                                            if (entity7 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity7;
                                                                f68 = _livEnt.m_21223_();
                                                            } else {
                                                                f68 = -1.0f;
                                                            }
                                                            entity7.m_6469_(damageSource24, (f69 + f68) / 5.0f + 1000000.0f);
                                                            DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                            if (entity7 instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entity7;
                                                                f67 = _livEnt2.m_21233_();
                                                            } else {
                                                                f67 = -1.0f;
                                                            }
                                                            if (entity7 instanceof LivingEntity) {
                                                                _livEnt = (LivingEntity)entity7;
                                                                f66 = _livEnt.m_21223_();
                                                            } else {
                                                                f66 = -1.0f;
                                                            }
                                                            entity7.m_6469_(damageSource25, (f67 + f66) / 5.0f + 1000000.0f);
                                                        }
                                                    }
                                                    if (entity instanceof EnergyskeletontitanEntity) {
                                                        _datEntI = (EnergyskeletontitanEntity)entity;
                                                        n62 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                    } else {
                                                        n62 = 0;
                                                    }
                                                    if (n62 >= 30) {
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof EnergyskeletontitanEntity) {
                                                            ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI2 = (EnergyskeletontitanEntity)entity;
                                                    n16 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                                                } else {
                                                    n16 = 0;
                                                }
                                                if (n16 != 7) break block872;
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.harvest");
                                                }
                                                if (entity instanceof Mob) {
                                                    _mobEnt4 = (Mob)entity;
                                                    livingEntity2 = _mobEnt4.m_5448_();
                                                } else {
                                                    livingEntity2 = null;
                                                }
                                                if (livingEntity2 != null) {
                                                    LivingEntity livingEntity95;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt28 = (Mob)entity;
                                                        livingEntity95 = _mobEnt28.m_5448_();
                                                    } else {
                                                        livingEntity95 = null;
                                                    }
                                                    f2 = entity.m_20270_(livingEntity95);
                                                } else {
                                                    f2 = -1.0f;
                                                }
                                                if (f2 > 1.0f) {
                                                    LivingEntity livingEntity96;
                                                    LivingEntity livingEntity97;
                                                    LivingEntity livingEntity98;
                                                    LivingEntity livingEntity99;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity99 = _mobEnt2.m_5448_();
                                                    } else {
                                                        livingEntity99 = null;
                                                    }
                                                    double d = livingEntity99.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity98 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity98 = null;
                                                    }
                                                    double d27 = livingEntity98.m_20186_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity97 = _mobEnt2.m_5448_();
                                                    } else {
                                                        livingEntity97 = null;
                                                    }
                                                    double d28 = d27 + (double)livingEntity97.m_20206_() / 1.5;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt2 = (Mob)entity;
                                                        livingEntity96 = _mobEnt2.m_5448_();
                                                    } else {
                                                        livingEntity96 = null;
                                                    }
                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity96.m_20189_()));
                                                }
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI = (EnergyskeletontitanEntity)entity;
                                                    n15 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                } else {
                                                    n15 = 0;
                                                }
                                                if (n15 == 5) break block873;
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    EnergyskeletontitanEntity _datEntI14 = (EnergyskeletontitanEntity)entity;
                                                    n14 = (Integer)_datEntI14.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                } else {
                                                    n14 = 0;
                                                }
                                                if (n14 == 21) break block873;
                                                if (entity instanceof EnergyskeletontitanEntity) {
                                                    _datEntI3 = (EnergyskeletontitanEntity)entity;
                                                    n13 = (Integer)_datEntI3.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                                } else {
                                                    n13 = 0;
                                                }
                                                if (n13 != 25) break block874;
                                            }
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                }
                                            }
                                        }
                                        if (entity instanceof EnergyskeletontitanEntity) {
                                            _datEntI = (EnergyskeletontitanEntity)entity;
                                            n12 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                        } else {
                                            n12 = 0;
                                        }
                                        if (n12 == 23) break block875;
                                        if (entity instanceof EnergyskeletontitanEntity) {
                                            EnergyskeletontitanEntity _datEntI15 = (EnergyskeletontitanEntity)entity;
                                            n11 = (Integer)_datEntI15.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                        } else {
                                            n11 = 0;
                                        }
                                        if (n11 != 27) break block876;
                                    }
                                    if (world instanceof Level) {
                                        _level2 = (Level)world;
                                        if (!_level2.m_5776_()) {
                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                        } else {
                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                        }
                                    }
                                    _center2 = new Vec3(x, y, z);
                                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                                    for (Entity entityiterator : _entfound2) {
                                        float f73;
                                        if (entityiterator instanceof EnergyskeletontitanEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            _livEnt2 = (LivingEntity)entityiterator;
                                            f73 = _livEnt2.m_21233_();
                                        } else {
                                            f73 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f73 / 8.0f + 160000.0f);
                                        if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                        entityiterator.f_19802_ = 0;
                                        if (entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue()) continue;
                                        Deathlist.normalattack(entityiterator);
                                    }
                                }
                                if (entity instanceof EnergyskeletontitanEntity) {
                                    _datEntI = (EnergyskeletontitanEntity)entity;
                                    n10 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                                } else {
                                    n10 = 0;
                                }
                                if (n10 >= 47) {
                                    if (entity instanceof EnergyskeletontitanEntity) {
                                        EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof EnergyskeletontitanEntity) {
                                        EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof EnergyskeletontitanEntity) {
                                        ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                                    }
                                }
                            }
                            if (entity instanceof EnergyskeletontitanEntity) {
                                _datEntI2 = (EnergyskeletontitanEntity)entity;
                                n9 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
                            } else {
                                n9 = 0;
                            }
                            if (n9 != 8) break block877;
                            if (entity instanceof EnergyskeletontitanEntity) {
                                ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.swipe");
                            }
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity = _mobEnt4.m_5448_();
                            } else {
                                livingEntity = null;
                            }
                            if (livingEntity != null) {
                                LivingEntity livingEntity100;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt29 = (Mob)entity;
                                    livingEntity100 = _mobEnt29.m_5448_();
                                } else {
                                    livingEntity100 = null;
                                }
                                f = entity.m_20270_(livingEntity100);
                            } else {
                                f = -1.0f;
                            }
                            if (f > 1.0f) {
                                LivingEntity livingEntity101;
                                LivingEntity livingEntity102;
                                LivingEntity livingEntity103;
                                LivingEntity livingEntity104;
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity104 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity104 = null;
                                }
                                double d = livingEntity104.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity103 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity103 = null;
                                }
                                double d29 = livingEntity103.m_20186_();
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity102 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity102 = null;
                                }
                                double d30 = d29 + (double)livingEntity102.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    _mobEnt2 = (Mob)entity;
                                    livingEntity101 = _mobEnt2.m_5448_();
                                } else {
                                    livingEntity101 = null;
                                }
                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d30, livingEntity101.m_20189_()));
                            }
                            if (entity instanceof EnergyskeletontitanEntity) {
                                _datEntI = (EnergyskeletontitanEntity)entity;
                                n8 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                            } else {
                                n8 = 0;
                            }
                            if (n8 == 11) break block878;
                            if (entity instanceof EnergyskeletontitanEntity) {
                                EnergyskeletontitanEntity _datEntI16 = (EnergyskeletontitanEntity)entity;
                                n7 = (Integer)_datEntI16.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                            } else {
                                n7 = 0;
                            }
                            if (n7 != 30) break block879;
                        }
                        if (world instanceof Level) {
                            _level2 = (Level)world;
                            if (!_level2.m_5776_()) {
                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                            } else {
                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                            }
                        }
                    }
                    if (entity instanceof EnergyskeletontitanEntity) {
                        _datEntI = (EnergyskeletontitanEntity)entity;
                        n6 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                    } else {
                        n6 = 0;
                    }
                    if (n6 == 13) break block880;
                    if (entity instanceof EnergyskeletontitanEntity) {
                        EnergyskeletontitanEntity _datEntI17 = (EnergyskeletontitanEntity)entity;
                        n5 = (Integer)_datEntI17.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
                    } else {
                        n5 = 0;
                    }
                    if (n5 != 33) break block881;
                }
                _center2 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator : _entfound2) {
                    float f;
                    if (entityiterator instanceof EnergyskeletontitanEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f / 6.0f + 150000.0f);
                    if (entityiterator instanceof Player) continue;
                    entityiterator.f_19802_ = 0;
                    if (entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue()) continue;
                    Deathlist.normalattack(entityiterator);
                }
            }
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n4 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n4 = 0;
            }
            if (n4 == 33) {
                LivingEntity _entity;
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    Level _level9 = (Level)world;
                    if (!_level9.m_5776_()) {
                        _level9.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                    } else {
                        _level9.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level10 = (Level)world;
                    if (!_level10.m_5776_()) {
                        _level10.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level10.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level11 = (Level)world;
                    if (!_level11.m_5776_()) {
                        _level11.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level11.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.2, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                for (int index3 = 0; index3 < 32; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    _level2 = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.PURPLELIGHTNING.get()).m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center8 = new Vec3(x + entity.m_20154_().f_82479_ * 80.0, y, z + entity.m_20154_().f_82481_ * 80.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center8, _center8).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center8))).toList();
                for (Entity entity8 : _entfound) {
                    float f;
                    if (entity8 instanceof EnergyskeletontitanEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity8 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity8;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entity8.m_6469_(damageSource, f / 4.0f + 150000.0f);
                    double _setval = 6.0;
                    entity8.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entity8);
                    });
                    if (entity8 instanceof Player || !(entity8 instanceof LivingEntity)) continue;
                    entity8.m_142687_(Entity.RemovalReason.KILLED);
                    if (entity8 instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue()) continue;
                    Deathlist.normalattack(entity8);
                }
            }
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n3 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n3 = 0;
            }
            if (n3 >= 52) {
                if (entity instanceof EnergyskeletontitanEntity) {
                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof EnergyskeletontitanEntity) {
                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EnergyskeletontitanEntity) {
                    ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EnergyskeletontitanEntity) {
            _datEntI2 = (EnergyskeletontitanEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 9) {
            int n64;
            int n65;
            float f;
            LivingEntity livingEntity;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof EnergyskeletontitanEntity) {
                ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.sd");
            }
            if (entity instanceof Mob) {
                _mobEnt4 = (Mob)entity;
                livingEntity = _mobEnt4.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity105;
                if (entity instanceof Mob) {
                    Mob _mobEnt30 = (Mob)entity;
                    livingEntity105 = _mobEnt30.m_5448_();
                } else {
                    livingEntity105 = null;
                }
                f = entity.m_20270_(livingEntity105);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity106;
                LivingEntity livingEntity107;
                LivingEntity livingEntity108;
                LivingEntity livingEntity109;
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity109 = _mobEnt2.m_5448_();
                } else {
                    livingEntity109 = null;
                }
                double d = livingEntity109.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity108 = _mobEnt.m_5448_();
                } else {
                    livingEntity108 = null;
                }
                double d31 = livingEntity108.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity107 = _mobEnt2.m_5448_();
                } else {
                    livingEntity107 = null;
                }
                double d32 = d31 + (double)livingEntity107.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt2 = (Mob)entity;
                    livingEntity106 = _mobEnt2.m_5448_();
                } else {
                    livingEntity106 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d32, livingEntity106.m_20189_()));
            }
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n65 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n65 = 0;
            }
            if (n65 == 42) {
                float f74;
                LivingEntity livingEntity110;
                if (world instanceof Level) {
                    Level _level12 = (Level)world;
                    if (!_level12.m_5776_()) {
                        _level12.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level12.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt31 = (Mob)entity;
                    livingEntity110 = _mobEnt31.m_5448_();
                } else {
                    livingEntity110 = null;
                }
                if (livingEntity110 != null) {
                    LivingEntity livingEntity111;
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity111 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity111 = null;
                    }
                    f74 = entity.m_20270_(livingEntity111);
                } else {
                    f74 = -1.0f;
                }
                if (f74 > 1.0f) {
                    LivingEntity livingEntity112;
                    LivingEntity livingEntity113;
                    LivingEntity livingEntity114;
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity115;
                        LivingEntity livingEntity116;
                        LivingEntity livingEntity117;
                        _level = (ServerLevel)world;
                        EntityType entityType = (EntityType)UltimateskeletonsModEntities.PURPLELIGHTNING.get();
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity117 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity117 = null;
                        }
                        double d = livingEntity117.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity116 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity116 = null;
                        }
                        double d33 = livingEntity116.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity115 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity115 = null;
                        }
                        Entity entity9 = entityType.m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)d, (double)d33, (double)livingEntity115.m_20189_()), MobSpawnType.MOB_SUMMONED);
                        if (entity9 != null) {
                            entity9.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity114 = mob.m_5448_();
                    } else {
                        livingEntity114 = null;
                    }
                    double d = livingEntity114.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity113 = mob.m_5448_();
                    } else {
                        livingEntity113 = null;
                    }
                    double d34 = livingEntity113.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity112 = mob.m_5448_();
                    } else {
                        livingEntity112 = null;
                    }
                    _center = new Vec3(d, d34, livingEntity112.m_20189_());
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : list) {
                        float f75;
                        float f76;
                        float f77;
                        float f78;
                        float f79;
                        float f80;
                        LivingEntity _livEnt6;
                        float f81;
                        if (entityiterator instanceof EnergyskeletontitanEntity || entityiterator instanceof LightningBolt || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt8 = (LivingEntity)entityiterator;
                            f81 = _livEnt8.m_21233_();
                        } else {
                            f81 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f81 / 20.0f + 24000.0f);
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt6 = (LivingEntity)entityiterator;
                            f80 = _livEnt6.m_21233_();
                        } else {
                            f80 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource26, f80 / 20.0f + 24000.0f);
                        DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt6 = (LivingEntity)entityiterator;
                            f79 = _livEnt6.m_21233_();
                        } else {
                            f79 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource27, f79 / 20.0f + 24000.0f);
                        entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt7 = (LivingEntity)entityiterator;
                            f78 = _livEnt7.m_21233_();
                        } else {
                            f78 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt6 = (LivingEntity)entityiterator;
                            f77 = _livEnt6.m_21223_();
                        } else {
                            f77 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource28, (f78 + f77) / 5.0f + 240000.0f);
                        DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt7 = (LivingEntity)entityiterator;
                            f76 = _livEnt7.m_21233_();
                        } else {
                            f76 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt6 = (LivingEntity)entityiterator;
                            f75 = _livEnt6.m_21223_();
                        } else {
                            f75 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource29, (f76 + f75) / 5.0f + 240000.0f);
                    }
                }
            }
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n64 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n64 = 0;
            }
            if (n64 >= 60) {
                if (entity instanceof EnergyskeletontitanEntity) {
                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof EnergyskeletontitanEntity) {
                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EnergyskeletontitanEntity) {
                    ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof EnergyskeletontitanEntity) {
            _datEntI2 = (EnergyskeletontitanEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 10) {
            int n66;
            int n67;
            int n68;
            int n69;
            if (entity instanceof EnergyskeletontitanEntity) {
                ((EnergyskeletontitanEntity)entity).setAnimation("animation.skeleton_power.zz");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n69 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n69 = 0;
            }
            if (n69 < 96) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt32 = (Mob)entity;
                    livingEntity = _mobEnt32.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity118;
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity118 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity118 = null;
                    }
                    f = entity.m_20270_(livingEntity118);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity119;
                    LivingEntity livingEntity120;
                    LivingEntity livingEntity121;
                    LivingEntity livingEntity122;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity122 = _mobEnt.m_5448_();
                    } else {
                        livingEntity122 = null;
                    }
                    double d = livingEntity122.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity121 = mob.m_5448_();
                    } else {
                        livingEntity121 = null;
                    }
                    double d35 = livingEntity121.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity120 = _mobEnt.m_5448_();
                    } else {
                        livingEntity120 = null;
                    }
                    double d36 = d35 + (double)livingEntity120.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity119 = _mobEnt.m_5448_();
                    } else {
                        livingEntity119 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d36, livingEntity119.m_20189_()));
                }
            }
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n68 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n68 = 0;
            }
            if (n68 == 96) {
                if (world instanceof Level) {
                    Level _level13 = (Level)world;
                    if (!_level13.m_5776_()) {
                        _level13.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level13.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center9 = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center9, _center9).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center9))).toList();
                for (Entity entity10 : _entfound) {
                    float f;
                    float f82;
                    float f83;
                    float f84;
                    float f85;
                    float f86;
                    float f87;
                    if (entity10 instanceof EnergyskeletontitanEntity || entity10 instanceof LightningBolt || !(entity10 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f87 = _livEnt.m_21233_();
                    } else {
                        f87 = -1.0f;
                    }
                    entity10.m_6469_(damageSource, f87 / 10.0f + 400000.0f);
                    if (entity10 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity10 instanceof Player)) {
                        Deathlist.normalattack(entity10);
                    }
                    DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f86 = _livEnt.m_21233_();
                    } else {
                        f86 = -1.0f;
                    }
                    entity10.m_6469_(damageSource30, f86 / 10.0f + 400000.0f);
                    DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f85 = _livEnt.m_21233_();
                    } else {
                        f85 = -1.0f;
                    }
                    entity10.m_6469_(damageSource31, f85 / 10.0f + 400000.0f);
                    entity10.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entity10.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity10;
                        f84 = _livEnt2.m_21233_();
                    } else {
                        f84 = -1.0f;
                    }
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f83 = _livEnt.m_21223_();
                    } else {
                        f83 = -1.0f;
                    }
                    entity10.m_6469_(damageSource32, (f84 + f83) / 5.0f + 4000000.0f);
                    DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entity10 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entity10;
                        f82 = _livEnt2.m_21233_();
                    } else {
                        f82 = -1.0f;
                    }
                    if (entity10 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity10;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entity10.m_6469_(damageSource33, (f82 + f) / 5.0f + 4000000.0f);
                }
            }
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n67 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 == 162 && world instanceof Level) {
                Level _level14 = (Level)world;
                if (!_level14.m_5776_()) {
                    _level14.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:sworddrag")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level14.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:sworddrag")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof EnergyskeletontitanEntity) {
                _datEntI = (EnergyskeletontitanEntity)entity;
                n66 = (Integer)_datEntI.m_20088_().m_135370_(EnergyskeletontitanEntity.DATA_animationTick);
            } else {
                n66 = 0;
            }
            if (n66 >= 260) {
                if (entity instanceof EnergyskeletontitanEntity) {
                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof EnergyskeletontitanEntity) {
                    EnergyskeletontitanEntity _datEntSetI = (EnergyskeletontitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(EnergyskeletontitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof EnergyskeletontitanEntity) {
                    ((EnergyskeletontitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

