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
import net.mcreator.ultimateskeletons.entity.CreeperfireballEntity;
import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
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

public class CreepertitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        LivingEntity _livEnt;
        int n6;
        Mob _mobEnt;
        Object _mobEnt2;
        Object _mobEnt3;
        CreepertitanEntity _datEntI;
        Object _datEntI2;
        Object entityToSpawn;
        CreepertitanEntity _datEntI3;
        block858: {
            int n7;
            block860: {
                CreepertitanEntity _datEntI4;
                LivingEntity _livEnt2;
                List<Entity> _entfound;
                block859: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    block855: {
                        LivingEntity livingEntity;
                        Mob _mobEnt4;
                        block856: {
                            block857: {
                                LivingEntity livingEntity2;
                                float f;
                                LivingEntity livingEntity3;
                                int n12;
                                int n13;
                                int n14;
                                int n15;
                                float f2;
                                Object _entfound2;
                                LivingEntity _livEnt3;
                                block853: {
                                    block854: {
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
                                        ServerLevel _level;
                                        CreepertitanEntity _datEntI5;
                                        block852: {
                                            int n26;
                                            int n27;
                                            int n28;
                                            int n29;
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
                                            if (entity instanceof CreepertitanEntity) {
                                                int n30;
                                                CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                if (entity instanceof CreepertitanEntity) {
                                                    _datEntI3 = (CreepertitanEntity)entity;
                                                    n30 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                                } else {
                                                    n30 = 0;
                                                }
                                                synchedEntityData.m_135381_(CreepertitanEntity.DATA_spawnTick, (Object)(n30 + 1));
                                            }
                                            if (entity instanceof LivingEntity) {
                                                _livEnt3 = (LivingEntity)entity;
                                                f3 = _livEnt3.m_21223_();
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (f3 <= 0.0f) {
                                                int n31;
                                                if (entity instanceof Mob) {
                                                    _entity = (Mob)entity;
                                                    _entity.m_6710_(null);
                                                }
                                                if (entity instanceof CreepertitanEntity) {
                                                    _datEntI3 = (CreepertitanEntity)entity;
                                                    n31 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
                                                } else {
                                                    n31 = 0;
                                                }
                                                if (n31 == 0) {
                                                    int n32;
                                                    int n33;
                                                    int n34;
                                                    int n35;
                                                    int n36;
                                                    int n37;
                                                    int n38;
                                                    int n39;
                                                    int n40;
                                                    if (entity instanceof CreepertitanEntity) {
                                                        int n41;
                                                        CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                        if (entity instanceof CreepertitanEntity) {
                                                            CreepertitanEntity _datEntI6 = (CreepertitanEntity)entity;
                                                            n41 = (Integer)_datEntI6.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                        } else {
                                                            n41 = 0;
                                                        }
                                                        synchedEntityData.m_135381_(CreepertitanEntity.DATA_deathTick, (Object)(n41 + 1));
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n40 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n40 = 0;
                                                    }
                                                    if (n40 == 1 && world instanceof Level) {
                                                        Level _level2 = (Level)world;
                                                        if (!_level2.m_5776_()) {
                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitandeath")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n39 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n39 = 0;
                                                    }
                                                    if (n39 < 3) {
                                                        for (int index0 = 0; index0 < 12; ++index0) {
                                                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), 0.0, 0.0, 0.0);
                                                        }
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n38 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n38 = 0;
                                                    }
                                                    if (n38 < 10 && entity instanceof CreepertitanEntity) {
                                                        ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.death");
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n37 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n37 = 0;
                                                    }
                                                    if (n37 == 180 && world instanceof Level) {
                                                        Level _level3 = (Level)world;
                                                        if (!_level3.m_5776_()) {
                                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitanwarning")), SoundSource.NEUTRAL, 20000.0f, 1.0f);
                                                        } else {
                                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitanwarning")), SoundSource.NEUTRAL, 20000.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n36 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n36 = 0;
                                                    }
                                                    if (n36 == 330 && world instanceof Level) {
                                                        Level _level4 = (Level)world;
                                                        if (!_level4.m_5776_()) {
                                                            _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:crushland")), SoundSource.NEUTRAL, 20000.0f, 1.0f);
                                                        } else {
                                                            _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:crushland")), SoundSource.NEUTRAL, 20000.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n35 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n35 = 0;
                                                    }
                                                    if (n35 == 360) {
                                                        int n42;
                                                        Vec3 _center = new Vec3(x, y, z);
                                                        AABB aABB = new AABB(_center, _center);
                                                        if (entity instanceof CreepertitanEntity) {
                                                            CreepertitanEntity _datEntI7 = (CreepertitanEntity)entity;
                                                            n42 = (Integer)_datEntI7.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                                                        } else {
                                                            n42 = 0;
                                                        }
                                                        _entfound = world.m_6443_(Entity.class, aABB.m_82400_((double)(400 * n42) / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                        for (Entity entityiterator : _entfound) {
                                                            if (!(entityiterator instanceof CreepertitanEntity)) {
                                                                int n43;
                                                                int n44;
                                                                float f4;
                                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                if (entityiterator instanceof LivingEntity) {
                                                                    _livEnt2 = (LivingEntity)entityiterator;
                                                                    f4 = _livEnt2.m_21233_();
                                                                } else {
                                                                    f4 = -1.0f;
                                                                }
                                                                float f5 = f4 / 2.0f;
                                                                if (entity instanceof CreepertitanEntity) {
                                                                    _datEntI4 = (CreepertitanEntity)entity;
                                                                    n44 = (Integer)_datEntI4.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                                                                } else {
                                                                    n44 = 0;
                                                                }
                                                                if (entity instanceof CreepertitanEntity) {
                                                                    CreepertitanEntity _datEntI8 = (CreepertitanEntity)entity;
                                                                    n43 = (Integer)_datEntI8.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                                                                } else {
                                                                    n43 = 0;
                                                                }
                                                                entityiterator.m_6469_(damageSource, f5 + (float)(n44 * (100000 + n43 * 10)));
                                                                continue;
                                                            }
                                                            if (entityiterator == entity || !(entityiterator instanceof CreepertitanEntity)) continue;
                                                            CreepertitanEntity _datEntSetI = (CreepertitanEntity)entityiterator;
                                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_chargeCount, (Object)3);
                                                        }
                                                        if (world instanceof ServerLevel) {
                                                            ServerLevel _level5 = (ServerLevel)world;
                                                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.EXPLOSIONTITAN.get()).m_262496_(_level5, BlockPos.m_274561_((double)x, (double)(y + 12.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn != null) {
                                                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n34 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n34 = 0;
                                                    }
                                                    if (n34 > 360) {
                                                        int n45;
                                                        if (entity instanceof CreepertitanEntity) {
                                                            CreepertitanEntity _datEntI9 = (CreepertitanEntity)entity;
                                                            n45 = (Integer)_datEntI9.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                                                        } else {
                                                            n45 = 0;
                                                        }
                                                        if (n45 >= 3) {
                                                            int n46;
                                                            Vec3 _center = new Vec3(x, y, z);
                                                            AABB aABB = new AABB(_center, _center);
                                                            if (entity instanceof CreepertitanEntity) {
                                                                _datEntI2 = (CreepertitanEntity)entity;
                                                                n46 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                                                            } else {
                                                                n46 = 0;
                                                            }
                                                            _entfound2 = world.m_6443_(Entity.class, aABB.m_82400_((double)(400 * n46) / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                            _datEntI2 = _entfound2.iterator();
                                                            while (_datEntI2.hasNext()) {
                                                                int n47;
                                                                int n48;
                                                                float f6;
                                                                Entity entityiterator = (Entity)_datEntI2.next();
                                                                if (entityiterator instanceof CreepertitanEntity) continue;
                                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                if (entityiterator instanceof LivingEntity) {
                                                                    LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                                                                    f6 = _livEnt4.m_21233_();
                                                                } else {
                                                                    f6 = -1.0f;
                                                                }
                                                                float f7 = f6 / 2.0f;
                                                                if (entity instanceof CreepertitanEntity) {
                                                                    CreepertitanEntity _datEntI10 = (CreepertitanEntity)entity;
                                                                    n48 = (Integer)_datEntI10.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                                                                } else {
                                                                    n48 = 0;
                                                                }
                                                                if (entity instanceof CreepertitanEntity) {
                                                                    _datEntI4 = (CreepertitanEntity)entity;
                                                                    n47 = (Integer)_datEntI4.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                                                                } else {
                                                                    n47 = 0;
                                                                }
                                                                entityiterator.m_6469_(damageSource, f7 + (float)(n48 * (100000 + n47 * 10)));
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n33 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n33 = 0;
                                                    }
                                                    if (n33 == 380) {
                                                        if (world instanceof ServerLevel) {
                                                            ServerLevel _level6 = (ServerLevel)world;
                                                            _level6.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y + 1.0, z), Vec2.f_82462_, _level6, 4, "", (Component)Component.m_237113_((String)""), _level6.m_7654_(), null).m_81324_(), "summon ultimateskeletons:titanspirit ~ ~1 ~ {CustomName:'\"creepertitan\"'}");
                                                        }
                                                        for (int index1 = 0; index1 < 320; ++index1) {
                                                            world.m_7106_((ParticleOptions)ParticleTypes.f_123815_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), y + 1.0, z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-40.0, (double)40.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0));
                                                        }
                                                    }
                                                    if (entity instanceof CreepertitanEntity) {
                                                        _datEntI5 = (CreepertitanEntity)entity;
                                                        n32 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_deathTick);
                                                    } else {
                                                        n32 = 0;
                                                    }
                                                    if (n32 >= 380 && !entity.m_9236_().m_5776_()) {
                                                        entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                                    }
                                                }
                                            }
                                            if (!entity.m_5446_().getString().equals("growing")) break block852;
                                            if (entity instanceof CreepertitanEntity) {
                                                _datEntI = (CreepertitanEntity)entity;
                                                n29 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                            } else {
                                                n29 = 0;
                                            }
                                            if (n29 >= 720) break block853;
                                            entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                            entity.f_19802_ = 20;
                                            if (entity instanceof LivingEntity) {
                                                ((LivingEntity)entity).f_20919_ = 0;
                                            }
                                            ((CreepertitanEntity)entity).setHEALTS(25000.0);
                                            if (entity instanceof Mob) {
                                                _entity = (Mob)entity;
                                                _entity.m_6710_(null);
                                            }
                                            if (entity instanceof CreepertitanEntity) {
                                                _datEntI3 = (CreepertitanEntity)entity;
                                                n28 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                            } else {
                                                n28 = 0;
                                            }
                                            if (n28 == 450 && world instanceof ServerLevel) {
                                                _level = (ServerLevel)world;
                                                Entity entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                                if (entityToSpawn2 != null) {
                                                    entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                }
                                            }
                                            if (entity instanceof CreepertitanEntity) {
                                                _datEntI3 = (CreepertitanEntity)entity;
                                                n27 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                            } else {
                                                n27 = 0;
                                            }
                                            if (n27 <= 10 && entity instanceof CreepertitanEntity) {
                                                ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.spawn");
                                            }
                                            if (entity instanceof CreepertitanEntity) {
                                                _datEntI3 = (CreepertitanEntity)entity;
                                                n26 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
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
                                                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Creepertitan has been created!!!"), false);
                                                }
                                            }
                                            if (entity.m_20096_()) break block853;
                                            if (entity.m_20186_() < -63.0) {
                                                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                            } else {
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                            break block853;
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI = (CreepertitanEntity)entity;
                                            n25 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n25 = 0;
                                        }
                                        if (n25 >= 312) break block853;
                                        entity.m_6593_((Component)Component.m_237113_((String)"Creepertitan"));
                                        if (entity instanceof LivingEntity) {
                                            ((LivingEntity)entity).f_20919_ = 0;
                                        }
                                        ((CreepertitanEntity)entity).setHEALTS(25000.0);
                                        entity.f_19802_ = 20;
                                        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                        if (!entity.m_20096_()) {
                                            if (entity.m_20186_() > -63.0) {
                                                entity.m_20256_(new Vec3(0.0, -2.0, 0.0));
                                            } else {
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                            }
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n24 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n24 = 0;
                                        }
                                        if (n24 == 1 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitanawaken")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n23 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n23 = 0;
                                        }
                                        if (n23 == 40 && world instanceof ServerLevel) {
                                            _level = (ServerLevel)world;
                                            Entity entityToSpawn3 = ((EntityType)UltimateskeletonsModEntities.DANGER.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                                            if (entityToSpawn3 != null) {
                                                entityToSpawn3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                            }
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n22 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n22 = 0;
                                        }
                                        if (n22 <= 10 && entity instanceof CreepertitanEntity) {
                                            ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.spawn2");
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n21 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n21 = 0;
                                        }
                                        if (n21 == 186 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitangetup")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n20 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n20 = 0;
                                        }
                                        if (n20 == 164) {
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
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n19 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n19 = 0;
                                        }
                                        if (n19 == 30 && world instanceof Level) {
                                            _level = (Level)world;
                                            if (!_level.m_5776_()) {
                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanquake")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n18 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n18 = 0;
                                        }
                                        if (n18 == 310 && !world.m_5776_() && world.m_7654_() != null) {
                                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Creepertitan awake!!!"), false);
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI3 = (CreepertitanEntity)entity;
                                            n17 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n17 = 0;
                                        }
                                        if (n17 == 164) break block854;
                                        if (entity instanceof CreepertitanEntity) {
                                            _datEntI5 = (CreepertitanEntity)entity;
                                            n16 = (Integer)_datEntI5.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                        } else {
                                            n16 = 0;
                                        }
                                        if (n16 != 240) break block853;
                                    }
                                    Vec3 _center = new Vec3(x, y, z);
                                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    _entfound2 = _entfound.iterator();
                                    while (_entfound2.hasNext()) {
                                        Entity entityiterator;
                                        entityiterator = (Entity)_entfound2.next();
                                        if (entityiterator instanceof CreepertitanEntity) continue;
                                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 0.1f);
                                        double _setval = 5.0;
                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                            capability.camerashake = _setval;
                                            capability.syncPlayerVariables(entityiterator);
                                        });
                                    }
                                }
                                if (!world.m_5776_()) {
                                    int n49;
                                    if (entity instanceof CreepertitanEntity) {
                                        _datEntI = (CreepertitanEntity)entity;
                                        n49 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
                                    } else {
                                        n49 = 0;
                                    }
                                    if (n49 != 0) {
                                        float f8;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)entity;
                                            f8 = _livEnt5.m_21223_();
                                        } else {
                                            f8 = -1.0f;
                                        }
                                        if (f8 <= 0.0f) {
                                            for (int index2 = 0; index2 < 16; ++index2) {
                                                if (!(entity instanceof CreepertitanEntity)) continue;
                                                ((CreepertitanEntity)entity).setAnimation("empty");
                                            }
                                        }
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entity;
                                    f2 = _livEnt3.m_21223_();
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 > 0.0f && entity instanceof CreepertitanEntity) {
                                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_deathTick, (Object)0);
                                }
                                if (entity instanceof CreepertitanEntity) {
                                    _datEntI = (CreepertitanEntity)entity;
                                    n15 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                                } else {
                                    n15 = 0;
                                }
                                if (n15 >= 3 && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5 && world instanceof ServerLevel) {
                                    ServerLevel _level = (ServerLevel)world;
                                    Entity entityToSpawn4 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0))), MobSpawnType.MOB_SUMMONED);
                                    if (entityToSpawn4 != null) {
                                        entityToSpawn4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                    }
                                }
                                if (entity instanceof CreepertitanEntity) {
                                    _datEntI = (CreepertitanEntity)entity;
                                    n14 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_spawnTick);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 < 312) break block855;
                                if (entity instanceof CreepertitanEntity) {
                                    _datEntI3 = (CreepertitanEntity)entity;
                                    n13 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 == 0) {
                                    int n50;
                                    if (entity instanceof CreepertitanEntity) {
                                        CreepertitanEntity _datEntI11 = (CreepertitanEntity)entity;
                                        n50 = (Integer)_datEntI11.m_20088_().m_135370_(CreepertitanEntity.DATA_flyID);
                                    } else {
                                        n50 = 0;
                                    }
                                    if (n50 != 0) {
                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 4.0, z, 0.0, 0.0, 0.0);
                                    }
                                }
                                if (world.m_5776_()) break block855;
                                if (entity instanceof CreepertitanEntity) {
                                    _datEntI3 = (CreepertitanEntity)entity;
                                    n12 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
                                } else {
                                    n12 = 0;
                                }
                                if (n12 != 0 && entity instanceof CreepertitanEntity) {
                                    int n51;
                                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                    if (entity instanceof CreepertitanEntity) {
                                        CreepertitanEntity _datEntI12 = (CreepertitanEntity)entity;
                                        n51 = (Integer)_datEntI12.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
                                    } else {
                                        n51 = 0;
                                    }
                                    synchedEntityData.m_135381_(CreepertitanEntity.DATA_animationTick, (Object)(n51 + 1));
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity3 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity3 = null;
                                }
                                if (livingEntity3 == null) break block856;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt5 = (Mob)entity;
                                    v55 = _mobEnt5.m_5448_();
                                } else {
                                    v55 = _entfound2 = null;
                                }
                                if (_entfound2 instanceof LivingEntity) {
                                    LivingEntity _livEnt6 = _entfound2;
                                    f = _livEnt6.m_21223_();
                                } else {
                                    f = -1.0f;
                                }
                                if (f <= 0.0f) break block857;
                                if (entity instanceof Mob) {
                                    _mobEnt3 = (Mob)entity;
                                    livingEntity2 = _mobEnt3.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2.m_6084_()) break block856;
                            }
                            if (entity instanceof CreepertitanEntity) {
                                CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_flyID, (Object)0);
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
                                v66 = _mobEnt10.m_5448_();
                            } else {
                                v66 = _mobEnt3 = null;
                            }
                            if (_mobEnt3 instanceof LivingEntity) {
                                LivingEntity _livEnt7 = (LivingEntity)_mobEnt3;
                                f = _livEnt7.m_21223_();
                            } else {
                                f = -1.0f;
                            }
                            if (f > 0.0f) {
                                int n52;
                                if (entity instanceof CreepertitanEntity) {
                                    CreepertitanEntity _datEntI13 = (CreepertitanEntity)entity;
                                    n52 = (Integer)_datEntI13.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
                                } else {
                                    n52 = 0;
                                }
                                if (n52 == 0) {
                                    float f9;
                                    LivingEntity livingEntity8;
                                    Mob _mobEnt11;
                                    Mob _mobEnt12;
                                    Mob _mobEnt13;
                                    Mob _mobEnt14;
                                    float f10;
                                    LivingEntity livingEntity9;
                                    float f11;
                                    Mob _mobEnt15;
                                    LivingEntity livingEntity10;
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity10 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity10 = null;
                                    }
                                    if (livingEntity10 != null) {
                                        LivingEntity livingEntity11;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity11 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity11 = null;
                                        }
                                        f11 = entity.m_20270_(livingEntity11);
                                    } else {
                                        f11 = -1.0f;
                                    }
                                    if (f11 >= 160.0f) {
                                        entity.m_6858_(true);
                                    } else {
                                        entity.m_6858_(false);
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity9 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity9 = null;
                                    }
                                    if (livingEntity9 != null) {
                                        LivingEntity livingEntity12;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity12 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity12 = null;
                                        }
                                        f10 = entity.m_20270_(livingEntity12);
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (f10 > 60.0f) {
                                        float f12;
                                        LivingEntity livingEntity13;
                                        LivingEntity livingEntity14;
                                        float f13;
                                        LivingEntity livingEntity15;
                                        LivingEntity livingEntity16;
                                        float f14;
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
                                            f14 = entity.m_20270_(livingEntity19);
                                        } else {
                                            f14 = -1.0f;
                                        }
                                        double d5 = d4 / (double)f14 * 2.0;
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
                                            f13 = entity.m_20270_(livingEntity20);
                                        } else {
                                            f13 = -1.0f;
                                        }
                                        double d7 = d6 / (double)f13 * 2.0;
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
                                            f12 = entity.m_20270_(livingEntity21);
                                        } else {
                                            f12 = -1.0f;
                                        }
                                        entity.m_20256_(new Vec3(d5, d7, d8 / (double)f12 * 2.0));
                                        if (entity instanceof CreepertitanEntity) {
                                            CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_flyID, (Object)1);
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
                                            float f15;
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
                                                f15 = entity.m_20270_(livingEntity24);
                                            } else {
                                                f15 = -1.0f;
                                            }
                                            if (f15 > 30.0f) {
                                                float f16;
                                                LivingEntity livingEntity25;
                                                LivingEntity livingEntity26;
                                                float f17;
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
                                                    f17 = entity.m_20270_(livingEntity29);
                                                } else {
                                                    f17 = -1.0f;
                                                }
                                                double d10 = d9 / (double)f17;
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
                                                    f16 = entity.m_20270_(livingEntity30);
                                                } else {
                                                    f16 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d10, 0.0, d11 / (double)f16));
                                            }
                                        } else {
                                            float f18;
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
                                                f18 = entity.m_20270_(livingEntity32);
                                            } else {
                                                f18 = -1.0f;
                                            }
                                            if (f18 > 8.0f) {
                                                float f19;
                                                LivingEntity livingEntity33;
                                                LivingEntity livingEntity34;
                                                float f20;
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
                                                    f20 = entity.m_20270_(livingEntity37);
                                                } else {
                                                    f20 = -1.0f;
                                                }
                                                double d13 = d12 / (double)f20;
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
                                                    f19 = entity.m_20270_(livingEntity38);
                                                } else {
                                                    f19 = -1.0f;
                                                }
                                                entity.m_20256_(new Vec3(d13, 0.0, d14 / (double)f19));
                                            }
                                        }
                                        if (entity instanceof CreepertitanEntity) {
                                            CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_flyID, (Object)0);
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt2 = (Mob)entity;
                                        livingEntity8 = _mobEnt2.m_5448_();
                                    } else {
                                        livingEntity8 = null;
                                    }
                                    if (livingEntity8 != null) {
                                        LivingEntity livingEntity39;
                                        if (entity instanceof Mob) {
                                            _mobEnt15 = (Mob)entity;
                                            livingEntity39 = _mobEnt15.m_5448_();
                                        } else {
                                            livingEntity39 = null;
                                        }
                                        f9 = entity.m_20270_(livingEntity39);
                                    } else {
                                        f9 = -1.0f;
                                    }
                                    if (f9 < 512.0f) {
                                        float f21;
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
                                            f21 = entity.m_20270_(livingEntity41);
                                        } else {
                                            f21 = -1.0f;
                                        }
                                        if (f21 <= 32.0f) {
                                            if (((Boolean)SkeletonsConfiguration.ALLOW.get()).booleanValue()) {
                                                LivingEntity livingEntity42;
                                                if (entity instanceof Mob) {
                                                    _mobEnt14 = (Mob)entity;
                                                    livingEntity42 = _mobEnt14.m_5448_();
                                                } else {
                                                    livingEntity42 = null;
                                                }
                                                if (livingEntity42.m_20206_() > 6.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                                        if (entity instanceof CreepertitanEntity) {
                                                            _datEntSetI = (CreepertitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                                        }
                                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 4) {
                                                        if (entity instanceof CreepertitanEntity) {
                                                            _datEntSetI = (CreepertitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                                        }
                                                    } else if (entity instanceof CreepertitanEntity) {
                                                        _datEntSetI = (CreepertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)5);
                                                    }
                                                } else if (entity instanceof CreepertitanEntity) {
                                                    _datEntSetI = (CreepertitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
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
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                                                        if (entity instanceof CreepertitanEntity) {
                                                            _datEntSetI = (CreepertitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)4));
                                                        }
                                                    } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 4) {
                                                        if (entity instanceof CreepertitanEntity) {
                                                            _datEntSetI = (CreepertitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)6);
                                                        }
                                                    } else if (entity instanceof CreepertitanEntity) {
                                                        _datEntSetI = (CreepertitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)5);
                                                    }
                                                } else if (entity instanceof CreepertitanEntity) {
                                                    _datEntSetI = (CreepertitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                }
                                            }
                                        }
                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                            int n53;
                                            if (entity instanceof CreepertitanEntity) {
                                                CreepertitanEntity _datEntI14 = (CreepertitanEntity)entity;
                                                n53 = (Integer)_datEntI14.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
                                            } else {
                                                n53 = 0;
                                            }
                                            if (n53 == 0) {
                                                float f22;
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
                                                    f22 = entity.m_20270_(livingEntity45);
                                                } else {
                                                    f22 = -1.0f;
                                                }
                                                if (f22 > 60.0f) {
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                        LivingEntity livingEntity46;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt11 = (Mob)entity;
                                                            livingEntity46 = _mobEnt11.m_5448_();
                                                        } else {
                                                            livingEntity46 = null;
                                                        }
                                                        if (livingEntity46.m_20206_() > 6.0f) {
                                                            if (entity instanceof CreepertitanEntity) {
                                                                _datEntSetI = (CreepertitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                                            }
                                                        } else if (entity instanceof CreepertitanEntity) {
                                                            _datEntSetI = (CreepertitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)6, (int)7));
                                                        }
                                                    }
                                                } else {
                                                    float f23;
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
                                                        f23 = entity.m_20270_(livingEntity48);
                                                    } else {
                                                        f23 = -1.0f;
                                                    }
                                                    if (f23 > 32.0f) {
                                                        LivingEntity livingEntity49;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt13 = (Mob)entity;
                                                            livingEntity49 = _mobEnt13.m_5448_();
                                                        } else {
                                                            livingEntity49 = null;
                                                        }
                                                        if (livingEntity49.m_20206_() > 6.0f) {
                                                            if (entity instanceof CreepertitanEntity) {
                                                                _datEntSetI = (CreepertitanEntity)entity;
                                                                _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)3, (int)5));
                                                            }
                                                        } else if (entity instanceof CreepertitanEntity) {
                                                            _datEntSetI = (CreepertitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
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
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI = (CreepertitanEntity)entity;
                        n11 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
                    } else {
                        n11 = 0;
                    }
                    if (n11 != true) break block858;
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof CreepertitanEntity) {
                        ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.zt");
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI3 = (CreepertitanEntity)entity;
                        n10 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 1) {
                        float f;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            Mob _mobEnt21 = (Mob)entity;
                            livingEntity = _mobEnt21.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity50;
                            if (entity instanceof Mob) {
                                Mob _mobEnt22 = (Mob)entity;
                                livingEntity50 = _mobEnt22.m_5448_();
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
                                _mobEnt3 = (Mob)entity;
                                livingEntity54 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity54 = null;
                            }
                            double d = livingEntity54.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity53 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity53 = null;
                            }
                            double d15 = livingEntity53.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity52 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity52 = null;
                            }
                            double d16 = d15 + (double)livingEntity52.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity51 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity51 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity51.m_20189_()));
                        }
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI3 = (CreepertitanEntity)entity;
                        n9 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 60) break block859;
                    if (entity instanceof CreepertitanEntity) {
                        CreepertitanEntity _datEntI15 = (CreepertitanEntity)entity;
                        n8 = (Integer)_datEntI15.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 != 100) break block860;
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
                    int n54;
                    int n55;
                    float f;
                    int n56;
                    int n57;
                    float f24;
                    int n58;
                    int n59;
                    float f25;
                    int n60;
                    int n61;
                    float f26;
                    int n62;
                    CreepertitanEntity _datEntI16;
                    int n63;
                    float f27;
                    if (entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f27 = _livEnt2.m_21233_();
                    } else {
                        f27 = -1.0f;
                    }
                    float f28 = f27 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI4 = (CreepertitanEntity)entity;
                        n63 = (Integer)_datEntI4.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n63 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI16 = (CreepertitanEntity)entity;
                        n62 = (Integer)_datEntI16.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n62 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f28 + (float)(n63 * (3200 + n62 * 10)));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f26 = _livEnt2.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    float f29 = f26 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI4 = (CreepertitanEntity)entity;
                        n61 = (Integer)_datEntI4.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n61 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI16 = (CreepertitanEntity)entity;
                        n60 = (Integer)_datEntI16.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n60 = 0;
                    }
                    entityiterator.m_6469_(damageSource2, f29 + (float)(n61 * (3200 + n60 * 10)));
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f25 = _livEnt2.m_21233_();
                    } else {
                        f25 = -1.0f;
                    }
                    float f30 = f25 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI4 = (CreepertitanEntity)entity;
                        n59 = (Integer)_datEntI4.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n59 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI16 = (CreepertitanEntity)entity;
                        n58 = (Integer)_datEntI16.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n58 = 0;
                    }
                    entityiterator.m_6469_(damageSource3, f30 + (float)(n59 * (3200 + n58 * 10)));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f24 = _livEnt2.m_21233_();
                    } else {
                        f24 = -1.0f;
                    }
                    float f31 = f24 / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI4 = (CreepertitanEntity)entity;
                        n57 = (Integer)_datEntI4.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n57 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI16 = (CreepertitanEntity)entity;
                        n56 = (Integer)_datEntI16.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n56 = 0;
                    }
                    entityiterator.m_6469_(damageSource4, f31 + (float)(n57 * (32000 + n56 * 100)));
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f32 = f / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI4 = (CreepertitanEntity)entity;
                        n55 = (Integer)_datEntI4.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n55 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI16 = (CreepertitanEntity)entity;
                        n54 = (Integer)_datEntI16.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n54 = 0;
                    }
                    entityiterator.m_6469_(damageSource5, f32 + (float)(n55 * (32000 + n54 * 100)));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n7 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n7 = 0;
            }
            if (n7 >= 140) {
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof CreepertitanEntity) {
            _datEntI = (CreepertitanEntity)entity;
            n6 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 2) {
            int n64;
            int n65;
            int n66;
            if (entity instanceof CreepertitanEntity) {
                ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.tt");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n66 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n66 = 0;
            }
            if (n66 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt23 = (Mob)entity;
                    livingEntity = _mobEnt23.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity55;
                    if (entity instanceof Mob) {
                        Mob _mobEnt24 = (Mob)entity;
                        livingEntity55 = _mobEnt24.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity59 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity59 = null;
                    }
                    double d = livingEntity59.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity58 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity58 = null;
                    }
                    double d17 = livingEntity58.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity57 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity57 = null;
                    }
                    double d18 = d17 + (double)livingEntity57.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity56 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity56 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity56.m_20189_()));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n65 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n65 = 0;
            }
            if (n65 == 24) {
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
                    int n67;
                    int n68;
                    float f;
                    int n69;
                    int n70;
                    float f33;
                    int n71;
                    int n72;
                    float f34;
                    int n73;
                    int n74;
                    float f35;
                    int n75;
                    int n76;
                    CreepertitanEntity _datEntI17;
                    float f36;
                    if (entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f36 = _livEnt.m_21233_();
                    } else {
                        f36 = -1.0f;
                    }
                    float f37 = f36 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI17 = (CreepertitanEntity)entity;
                        n76 = (Integer)_datEntI17.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n76 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n75 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n75 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f37 + (float)(n76 * (1800 + n75 * 10)));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f35 = _livEnt.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    float f38 = f35 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI17 = (CreepertitanEntity)entity;
                        n74 = (Integer)_datEntI17.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n74 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n73 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n73 = 0;
                    }
                    entityiterator.m_6469_(damageSource6, f38 + (float)(n74 * (1800 + n73 * 10)));
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f34 = _livEnt.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    float f39 = f34 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI17 = (CreepertitanEntity)entity;
                        n72 = (Integer)_datEntI17.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n72 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n71 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n71 = 0;
                    }
                    entityiterator.m_6469_(damageSource7, f39 + (float)(n72 * (1800 + n71 * 10)));
                    entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f33 = _livEnt.m_21233_();
                    } else {
                        f33 = -1.0f;
                    }
                    float f40 = f33 / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI17 = (CreepertitanEntity)entity;
                        n70 = (Integer)_datEntI17.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n70 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n69 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n69 = 0;
                    }
                    entityiterator.m_6469_(damageSource8, f40 + (float)(n70 * (18000 + n69 * 100)));
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f41 = f / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI17 = (CreepertitanEntity)entity;
                        n68 = (Integer)_datEntI17.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n68 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n67 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n67 = 0;
                    }
                    entityiterator.m_6469_(damageSource9, f41 + (float)(n68 * (18000 + n67 * 100)));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n64 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n64 = 0;
            }
            if (n64 >= 48) {
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof CreepertitanEntity) {
            _datEntI = (CreepertitanEntity)entity;
            n5 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 3) {
            int n77;
            int n78;
            int n79;
            if (entity instanceof CreepertitanEntity) {
                ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.jt");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n79 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n79 = 0;
            }
            if (n79 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt25 = (Mob)entity;
                    livingEntity = _mobEnt25.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity60;
                    if (entity instanceof Mob) {
                        Mob _mobEnt26 = (Mob)entity;
                        livingEntity60 = _mobEnt26.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity64 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity64 = null;
                    }
                    double d = livingEntity64.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity63 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity63 = null;
                    }
                    double d19 = livingEntity63.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity62 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity62 = null;
                    }
                    double d20 = d19 + (double)livingEntity62.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity61 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity61 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity61.m_20189_()));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n78 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n78 = 0;
            }
            if (n78 == 58) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n80;
                    int n81;
                    float f;
                    int n82;
                    int n83;
                    float f42;
                    int n84;
                    int n85;
                    float f43;
                    int n86;
                    int n87;
                    float f44;
                    int n88;
                    int n89;
                    CreepertitanEntity _datEntI18;
                    float f45;
                    if (entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f45 = _livEnt.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    float f46 = f45 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI18 = (CreepertitanEntity)entity;
                        n89 = (Integer)_datEntI18.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n89 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n88 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n88 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f46 + (float)(n89 * (7200 + n88 * 10)));
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
                    float f47 = f44 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI18 = (CreepertitanEntity)entity;
                        n87 = (Integer)_datEntI18.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n87 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n86 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n86 = 0;
                    }
                    entityiterator.m_6469_(damageSource10, f47 + (float)(n87 * (7200 + n86 * 10)));
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f43 = _livEnt.m_21233_();
                    } else {
                        f43 = -1.0f;
                    }
                    float f48 = f43 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI18 = (CreepertitanEntity)entity;
                        n85 = (Integer)_datEntI18.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n85 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n84 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n84 = 0;
                    }
                    entityiterator.m_6469_(damageSource11, f48 + (float)(n85 * (7200 + n84 * 10)));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f42 = _livEnt.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    float f49 = f42 / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI18 = (CreepertitanEntity)entity;
                        n83 = (Integer)_datEntI18.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n83 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n82 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n82 = 0;
                    }
                    entityiterator.m_6469_(damageSource12, f49 + (float)(n83 * (72000 + n82 * 100)));
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f50 = f / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI18 = (CreepertitanEntity)entity;
                        n81 = (Integer)_datEntI18.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n81 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n80 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n80 = 0;
                    }
                    entityiterator.m_6469_(damageSource13, f50 + (float)(n81 * (72000 + n80 * 100)));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n77 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n77 = 0;
            }
            if (n77 >= 94) {
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof CreepertitanEntity) {
            _datEntI = (CreepertitanEntity)entity;
            n4 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 4) {
            int n90;
            int n91;
            int n92;
            if (entity instanceof CreepertitanEntity) {
                ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.tc");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n92 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n92 = 0;
            }
            if (n92 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt27 = (Mob)entity;
                    livingEntity = _mobEnt27.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity65;
                    if (entity instanceof Mob) {
                        Mob _mobEnt28 = (Mob)entity;
                        livingEntity65 = _mobEnt28.m_5448_();
                    } else {
                        livingEntity65 = null;
                    }
                    f = entity.m_20270_(livingEntity65);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity66;
                    LivingEntity livingEntity67;
                    LivingEntity livingEntity68;
                    LivingEntity livingEntity69;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity69 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity69 = null;
                    }
                    double d = livingEntity69.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity68 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity68 = null;
                    }
                    double d21 = livingEntity68.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity67 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity67 = null;
                    }
                    double d22 = d21 + (double)livingEntity67.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity66 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity66.m_20189_()));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n91 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n91 = 0;
            }
            if (n91 == 30) {
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
                    int n93;
                    int n94;
                    float f;
                    int n95;
                    int n96;
                    float f51;
                    int n97;
                    int n98;
                    float f52;
                    int n99;
                    int n100;
                    float f53;
                    int n101;
                    int n102;
                    CreepertitanEntity _datEntI19;
                    float f54;
                    if (entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f54 = _livEnt.m_21233_();
                    } else {
                        f54 = -1.0f;
                    }
                    float f55 = f54 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI19 = (CreepertitanEntity)entity;
                        n102 = (Integer)_datEntI19.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n102 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n101 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n101 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f55 + (float)(n102 * (3600 + n101 * 10)));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f53 = _livEnt.m_21233_();
                    } else {
                        f53 = -1.0f;
                    }
                    float f56 = f53 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI19 = (CreepertitanEntity)entity;
                        n100 = (Integer)_datEntI19.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n100 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n99 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n99 = 0;
                    }
                    entityiterator.m_6469_(damageSource14, f56 + (float)(n100 * (3600 + n99 * 10)));
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f52 = _livEnt.m_21233_();
                    } else {
                        f52 = -1.0f;
                    }
                    float f57 = f52 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI19 = (CreepertitanEntity)entity;
                        n98 = (Integer)_datEntI19.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n98 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n97 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n97 = 0;
                    }
                    entityiterator.m_6469_(damageSource15, f57 + (float)(n98 * (3600 + n97 * 10)));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f51 = _livEnt.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    float f58 = f51 / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI19 = (CreepertitanEntity)entity;
                        n96 = (Integer)_datEntI19.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n96 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n95 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n95 = 0;
                    }
                    entityiterator.m_6469_(damageSource16, f58 + (float)(n96 * (36000 + n95 * 100)));
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f59 = f / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI19 = (CreepertitanEntity)entity;
                        n94 = (Integer)_datEntI19.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n94 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n93 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n93 = 0;
                    }
                    entityiterator.m_6469_(damageSource17, f59 + (float)(n94 * (36000 + n93 * 100)));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n90 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n90 = 0;
            }
            if (n90 >= 60) {
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof CreepertitanEntity) {
            _datEntI = (CreepertitanEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 5) {
            int n103;
            int n104;
            int n105;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 1) {
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.attack1");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 2) {
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.attack2");
                }
            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 3) {
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.attack3");
                }
            } else if (entity instanceof CreepertitanEntity) {
                ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.attack4");
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n105 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n105 = 0;
            }
            if (n105 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt29 = (Mob)entity;
                    livingEntity = _mobEnt29.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity70;
                    if (entity instanceof Mob) {
                        Mob _mobEnt30 = (Mob)entity;
                        livingEntity70 = _mobEnt30.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity74 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity74 = null;
                    }
                    double d = livingEntity74.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity73 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity73 = null;
                    }
                    double d23 = livingEntity73.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity72 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity72 = null;
                    }
                    double d24 = d23 + (double)livingEntity72.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity71 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity71 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity71.m_20189_()));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n104 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n104 = 0;
            }
            if (n104 == 16) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 20.0, y, z + entity.m_20154_().f_82479_ * 20.0);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n106;
                    int n107;
                    float f;
                    int n108;
                    int n109;
                    float f60;
                    int n110;
                    int n111;
                    float f61;
                    int n112;
                    int n113;
                    float f62;
                    int n114;
                    int n115;
                    CreepertitanEntity _datEntI20;
                    float f63;
                    if (entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f63 = _livEnt.m_21233_();
                    } else {
                        f63 = -1.0f;
                    }
                    float f64 = f63 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI20 = (CreepertitanEntity)entity;
                        n115 = (Integer)_datEntI20.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n115 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n114 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n114 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f64 + (float)(n115 * (7200 + n114 * 10)));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f62 = _livEnt.m_21233_();
                    } else {
                        f62 = -1.0f;
                    }
                    float f65 = f62 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI20 = (CreepertitanEntity)entity;
                        n113 = (Integer)_datEntI20.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n113 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n112 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n112 = 0;
                    }
                    entityiterator.m_6469_(damageSource18, f65 + (float)(n113 * (7200 + n112 * 10)));
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f61 = _livEnt.m_21233_();
                    } else {
                        f61 = -1.0f;
                    }
                    float f66 = f61 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI20 = (CreepertitanEntity)entity;
                        n111 = (Integer)_datEntI20.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n111 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n110 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n110 = 0;
                    }
                    entityiterator.m_6469_(damageSource19, f66 + (float)(n111 * (7200 + n110 * 10)));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f60 = _livEnt.m_21233_();
                    } else {
                        f60 = -1.0f;
                    }
                    float f67 = f60 / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI20 = (CreepertitanEntity)entity;
                        n109 = (Integer)_datEntI20.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n109 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n108 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n108 = 0;
                    }
                    entityiterator.m_6469_(damageSource20, f67 + (float)(n109 * (72000 + n108 * 100)));
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f68 = f / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI20 = (CreepertitanEntity)entity;
                        n107 = (Integer)_datEntI20.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n107 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n106 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n106 = 0;
                    }
                    entityiterator.m_6469_(damageSource21, f68 + (float)(n107 * (72000 + n106 * 100)));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n103 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n103 = 0;
            }
            if (n103 >= 30) {
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof CreepertitanEntity) {
            _datEntI = (CreepertitanEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 6) {
            int n116;
            int n117;
            int n118;
            int n119;
            if (entity instanceof CreepertitanEntity) {
                ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.sd");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n119 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n119 = 0;
            }
            if (n119 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt31 = (Mob)entity;
                    livingEntity = _mobEnt31.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity75;
                    if (entity instanceof Mob) {
                        Mob _mobEnt32 = (Mob)entity;
                        livingEntity75 = _mobEnt32.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity79 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity79 = null;
                    }
                    double d = livingEntity79.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity78 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity78 = null;
                    }
                    double d25 = livingEntity78.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity77 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity77 = null;
                    }
                    double d26 = d25 + (double)livingEntity77.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity76 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity76 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity76.m_20189_()));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n118 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n118 = 0;
            }
            if (n118 == 110) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n120;
                    int n121;
                    float f;
                    if (entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f69 = f / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        CreepertitanEntity _datEntI21 = (CreepertitanEntity)entity;
                        n121 = (Integer)_datEntI21.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n121 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n120 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n120 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f69 + (float)(n121 * (3600 + n120 * 10)));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n117 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n117 = 0;
            }
            if (n117 == 76) {
                for (int index3 = 0; index3 < 32; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level = (ServerLevel)world;
                    entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                    entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0)))));
                    entityToSpawn.m_20874_(true);
                    _level.m_7967_((Entity)entityToSpawn);
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n122;
                    int n123;
                    float f;
                    int n124;
                    int n125;
                    float f70;
                    int n126;
                    int n127;
                    float f71;
                    int n128;
                    int n129;
                    float f72;
                    int n130;
                    int n131;
                    CreepertitanEntity _datEntI22;
                    float f73;
                    if (entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f73 = _livEnt.m_21233_();
                    } else {
                        f73 = -1.0f;
                    }
                    float f74 = f73 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI22 = (CreepertitanEntity)entity;
                        n131 = (Integer)_datEntI22.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n131 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n130 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n130 = 0;
                    }
                    entityiterator.m_6469_(damageSource, f74 + (float)(n131 * (10800 + n130 * 10)));
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f72 = _livEnt.m_21233_();
                    } else {
                        f72 = -1.0f;
                    }
                    float f75 = f72 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI22 = (CreepertitanEntity)entity;
                        n129 = (Integer)_datEntI22.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n129 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n128 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n128 = 0;
                    }
                    entityiterator.m_6469_(damageSource22, f75 + (float)(n129 * (10800 + n128 * 10)));
                    DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f71 = _livEnt.m_21233_();
                    } else {
                        f71 = -1.0f;
                    }
                    float f76 = f71 / 20.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI22 = (CreepertitanEntity)entity;
                        n127 = (Integer)_datEntI22.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n127 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n126 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n126 = 0;
                    }
                    entityiterator.m_6469_(damageSource23, f76 + (float)(n127 * (10800 + n126 * 10)));
                    entityiterator.m_20256_(new Vec3(0.0, 2.0, 0.0));
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f70 = _livEnt.m_21233_();
                    } else {
                        f70 = -1.0f;
                    }
                    float f77 = f70 / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI22 = (CreepertitanEntity)entity;
                        n125 = (Integer)_datEntI22.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n125 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n124 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n124 = 0;
                    }
                    entityiterator.m_6469_(damageSource24, f77 + (float)(n125 * (108000 + n124 * 100)));
                    DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    float f78 = f / 5.0f;
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI22 = (CreepertitanEntity)entity;
                        n123 = (Integer)_datEntI22.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
                    } else {
                        n123 = 0;
                    }
                    if (entity instanceof CreepertitanEntity) {
                        _datEntI2 = (CreepertitanEntity)entity;
                        n122 = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n122 = 0;
                    }
                    entityiterator.m_6469_(damageSource25, f78 + (float)(n123 * (108000 + n122 * 100)));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n116 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n116 = 0;
            }
            if (n116 >= 132) {
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof CreepertitanEntity) {
            _datEntI = (CreepertitanEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 7) {
            int n132;
            int n133;
            int n134;
            if (entity instanceof CreepertitanEntity) {
                ((CreepertitanEntity)entity).setAnimation("animation.creepertitan.pt");
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n134 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n134 = 0;
            }
            if (n134 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt33 = (Mob)entity;
                    livingEntity = _mobEnt33.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity80;
                    if (entity instanceof Mob) {
                        Mob _mobEnt34 = (Mob)entity;
                        livingEntity80 = _mobEnt34.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity84 = _mobEnt3.m_5448_();
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
                        _mobEnt3 = (Mob)entity;
                        livingEntity82 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity82 = null;
                    }
                    double d28 = d27 + (double)livingEntity82.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity81 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity81 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity81.m_20189_()));
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n133 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n133 = 0;
            }
            if (n133 >= 22) {
                int n135;
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntI23 = (CreepertitanEntity)entity;
                    n135 = (Integer)_datEntI23.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
                } else {
                    n135 = 0;
                }
                if (n135 <= 62) {
                    float f;
                    LivingEntity livingEntity;
                    if (entity instanceof Mob) {
                        Mob _mobEnt35 = (Mob)entity;
                        livingEntity = _mobEnt35.m_5448_();
                    } else {
                        livingEntity = null;
                    }
                    if (livingEntity != null) {
                        LivingEntity livingEntity85;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity85 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity85 = null;
                        }
                        f = entity.m_20270_(livingEntity85);
                    } else {
                        f = -1.0f;
                    }
                    if (f > 1.0f) {
                        for (int index4 = 0; index4 < 8; ++index4) {
                            LivingEntity livingEntity86;
                            LivingEntity livingEntity87;
                            LivingEntity livingEntity88;
                            if (!(world instanceof ServerLevel)) continue;
                            projectileLevel = (ServerLevel)world;
                            Projectile _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    CreeperfireballEntity entityToSpawn = new CreeperfireballEntity((EntityType<? extends CreeperfireballEntity>)((EntityType)UltimateskeletonsModEntities.CREEPERFIREBALL.get()), level);
                                    entityToSpawn.m_5602_(shooter);
                                    entityToSpawn.m_36781_(damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    entityToSpawn.m_36762_(true);
                                    return entityToSpawn;
                                }
                            }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                            _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 6.0, y + 20.0, z + entity.m_20154_().f_82481_ * 6.0);
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity88 = _mobEnt.m_5448_();
                            } else {
                                livingEntity88 = null;
                            }
                            double d = livingEntity88.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity87 = _mobEnt.m_5448_();
                            } else {
                                livingEntity87 = null;
                            }
                            double d29 = livingEntity87.m_20186_() - 20.0 - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity86 = _mobEnt.m_5448_();
                            } else {
                                livingEntity86 = null;
                            }
                            _entityToSpawn.m_6686_(d, d29, livingEntity86.m_20189_() - entity.m_20189_(), 4.0f, 32.0f);
                            projectileLevel.m_7967_((Entity)_entityToSpawn);
                        }
                    } else {
                        for (int index5 = 0; index5 < 8; ++index5) {
                            if (!(world instanceof ServerLevel)) continue;
                            projectileLevel = (ServerLevel)world;
                            Projectile _entityToSpawn = new Object(){

                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    CreeperfireballEntity entityToSpawn = new CreeperfireballEntity((EntityType<? extends CreeperfireballEntity>)((EntityType)UltimateskeletonsModEntities.CREEPERFIREBALL.get()), level);
                                    entityToSpawn.m_5602_(shooter);
                                    entityToSpawn.m_36781_(damage);
                                    entityToSpawn.m_36735_(knockback);
                                    entityToSpawn.m_20225_(true);
                                    entityToSpawn.m_36762_(true);
                                    return entityToSpawn;
                                }
                            }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                            _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 6.0, y + 20.0, z + entity.m_20154_().f_82481_ * 6.0);
                            _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 4.0f, 32.0f);
                            projectileLevel.m_7967_((Entity)_entityToSpawn);
                        }
                    }
                }
            }
            if (entity instanceof CreepertitanEntity) {
                _datEntI3 = (CreepertitanEntity)entity;
                n132 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_animationTick);
            } else {
                n132 = 0;
            }
            if (n132 >= 78) {
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(CreepertitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof CreepertitanEntity) {
                    ((CreepertitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

