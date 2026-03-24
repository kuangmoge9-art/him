/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.BlackholeEntity;
import net.mcreator.ultimateskeletons.entity.GiantvoidEntity;
import net.mcreator.ultimateskeletons.entity.VoidgolemtitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
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
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class VoidgolemtitanATKProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        Object _livEnt;
        List<Entity> _entfound;
        Vec3 _center;
        int n7;
        LivingEntity _livEnt2;
        Entity entityiterator;
        Object _entfound2;
        Vec3 _center2;
        Mob _mobEnt;
        Mob _mobEnt2;
        Mob _mobEnt3;
        Mob _mobEnt4;
        Object _mobEnt5;
        Object _mobEnt6;
        Mob _mobEnt7;
        Mob _mobEnt8;
        VoidgolemtitanEntity _datEntI;
        VoidgolemtitanEntity _datEntSetI;
        Level _level;
        VoidgolemtitanEntity _datEntI2;
        block644: {
            int n8;
            block649: {
                block648: {
                    block647: {
                        block646: {
                            Level _level2;
                            block645: {
                                int n9;
                                int n10;
                                int n11;
                                int n12;
                                block636: {
                                    block639: {
                                        block640: {
                                            LivingEntity livingEntity;
                                            float f;
                                            LivingEntity livingEntity2;
                                            Mob _mobEnt9;
                                            block643: {
                                                float f2;
                                                LivingEntity livingEntity3;
                                                int n13;
                                                Mob _mobEnt10;
                                                block641: {
                                                    VoidgolemtitanEntity _datEntSetI2;
                                                    block642: {
                                                        LivingEntity livingEntity4;
                                                        float f3;
                                                        LivingEntity livingEntity5;
                                                        float f4;
                                                        LivingEntity livingEntity6;
                                                        float f5;
                                                        LivingEntity livingEntity7;
                                                        float f6;
                                                        LivingEntity livingEntity8;
                                                        int n14;
                                                        float f7;
                                                        LivingEntity livingEntity9;
                                                        LivingEntity livingEntity10;
                                                        LivingEntity livingEntity11;
                                                        LivingEntity livingEntity12;
                                                        LivingEntity livingEntity13;
                                                        LivingEntity _livEnt3;
                                                        Mob _mobEnt11;
                                                        VoidgolemtitanEntity _datEntI3;
                                                        block637: {
                                                            block638: {
                                                                LivingEntity livingEntity14;
                                                                float f8;
                                                                LivingEntity livingEntity15;
                                                                LivingEntity livingEntity16;
                                                                int n15;
                                                                float f9;
                                                                float f10;
                                                                LivingEntity _livEnt4;
                                                                VoidgolemtitanEntity _datEntI4;
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
                                                                if (entity instanceof VoidgolemtitanEntity) {
                                                                    int n16;
                                                                    VoidgolemtitanEntity _datEntSetI3 = (VoidgolemtitanEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
                                                                    if (entity instanceof VoidgolemtitanEntity) {
                                                                        _datEntI4 = (VoidgolemtitanEntity)entity;
                                                                        n16 = (Integer)_datEntI4.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_spawnTick);
                                                                    } else {
                                                                        n16 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(VoidgolemtitanEntity.DATA_spawnTick, (Object)(n16 + 1));
                                                                }
                                                                if (entity.m_5446_().getString().equals("growing")) {
                                                                    int n17;
                                                                    if (entity instanceof VoidgolemtitanEntity) {
                                                                        _datEntI2 = (VoidgolemtitanEntity)entity;
                                                                        n17 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_spawnTick);
                                                                    } else {
                                                                        n17 = 0;
                                                                    }
                                                                    if (n17 <= 720) {
                                                                        int n18;
                                                                        int n19;
                                                                        Mob _entity2;
                                                                        entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                                                        entity.f_19802_ = 20;
                                                                        if (entity instanceof LivingEntity) {
                                                                            ((LivingEntity)entity).f_20919_ = 0;
                                                                        }
                                                                        if (entity instanceof Mob) {
                                                                            _entity2 = (Mob)entity;
                                                                            _entity2.m_6710_(null);
                                                                        }
                                                                        if (entity instanceof LivingEntity) {
                                                                            _entity2 = (LivingEntity)entity;
                                                                            _entity2.m_21153_(3000000.0f);
                                                                        }
                                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                                            _datEntI4 = (VoidgolemtitanEntity)entity;
                                                                            n19 = (Integer)_datEntI4.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_spawnTick);
                                                                        } else {
                                                                            n19 = 0;
                                                                        }
                                                                        if (n19 <= 10 && entity instanceof VoidgolemtitanEntity) {
                                                                            ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.spawn");
                                                                        }
                                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                                            _datEntI4 = (VoidgolemtitanEntity)entity;
                                                                            n18 = (Integer)_datEntI4.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_spawnTick);
                                                                        } else {
                                                                            n18 = 0;
                                                                        }
                                                                        if (n18 == 720) {
                                                                            if (world instanceof Level) {
                                                                                _level = (Level)world;
                                                                                if (!_level.m_5776_()) {
                                                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                                                } else {
                                                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                                                }
                                                                            }
                                                                            if (!world.m_5776_() && world.m_7654_() != null) {
                                                                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Voidgolemtitan has been created!!!"), false);
                                                                            }
                                                                        }
                                                                        if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                                        }
                                                                    }
                                                                }
                                                                if (!world.m_5776_()) {
                                                                    int n20;
                                                                    if (entity instanceof VoidgolemtitanEntity) {
                                                                        _datEntI2 = (VoidgolemtitanEntity)entity;
                                                                        n20 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
                                                                    } else {
                                                                        n20 = 0;
                                                                    }
                                                                    if (n20 != 0) {
                                                                        float f11;
                                                                        if (entity instanceof LivingEntity) {
                                                                            LivingEntity _livEnt5 = (LivingEntity)entity;
                                                                            f11 = _livEnt5.m_21223_();
                                                                        } else {
                                                                            f11 = -1.0f;
                                                                        }
                                                                        if (f11 <= 0.0f) {
                                                                            for (int index0 = 0; index0 < 16; ++index0) {
                                                                                if (!(entity instanceof VoidgolemtitanEntity)) continue;
                                                                                ((VoidgolemtitanEntity)entity).setAnimation("empty");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (entity instanceof LivingEntity) {
                                                                    _livEnt4 = (LivingEntity)entity;
                                                                    f10 = _livEnt4.m_21223_();
                                                                } else {
                                                                    f10 = -1.0f;
                                                                }
                                                                if (f10 > 0.0f) {
                                                                    if (entity instanceof VoidgolemtitanEntity) {
                                                                        VoidgolemtitanEntity _datEntSetI4 = (VoidgolemtitanEntity)entity;
                                                                        _datEntSetI4.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_deathTick, (Object)0);
                                                                    }
                                                                    for (int index1 = 0; index1 < 24; ++index1) {
                                                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123755_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0));
                                                                    }
                                                                }
                                                                if (entity instanceof LivingEntity) {
                                                                    _livEnt4 = (LivingEntity)entity;
                                                                    f9 = _livEnt4.m_21223_();
                                                                } else {
                                                                    f9 = -1.0f;
                                                                }
                                                                if (f9 <= 0.0f) {
                                                                    int n21;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _entity3 = (Mob)entity;
                                                                        _entity3.m_6710_(null);
                                                                    }
                                                                    if (entity instanceof VoidgolemtitanEntity) {
                                                                        VoidgolemtitanEntity _datEntI5 = (VoidgolemtitanEntity)entity;
                                                                        n21 = (Integer)_datEntI5.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
                                                                    } else {
                                                                        n21 = 0;
                                                                    }
                                                                    if (n21 == 0) {
                                                                        int n22;
                                                                        int n23;
                                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                                            int n24;
                                                                            _datEntSetI = (VoidgolemtitanEntity)entity;
                                                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                            if (entity instanceof VoidgolemtitanEntity) {
                                                                                _datEntI3 = (VoidgolemtitanEntity)entity;
                                                                                n24 = (Integer)_datEntI3.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_deathTick);
                                                                            } else {
                                                                                n24 = 0;
                                                                            }
                                                                            synchedEntityData.m_135381_(VoidgolemtitanEntity.DATA_deathTick, (Object)(n24 + 1));
                                                                        }
                                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                                            _datEntI = (VoidgolemtitanEntity)entity;
                                                                            n23 = (Integer)_datEntI.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_deathTick);
                                                                        } else {
                                                                            n23 = 0;
                                                                        }
                                                                        if (n23 == 1 && world instanceof Level) {
                                                                            _level2 = (Level)world;
                                                                            if (!_level2.m_5776_()) {
                                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f);
                                                                            } else {
                                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f, false);
                                                                            }
                                                                        }
                                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                                            ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.death");
                                                                        }
                                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                                            _datEntI = (VoidgolemtitanEntity)entity;
                                                                            n22 = (Integer)_datEntI.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_deathTick);
                                                                        } else {
                                                                            n22 = 0;
                                                                        }
                                                                        if (n22 >= 600 && !entity.m_9236_().m_5776_()) {
                                                                            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                                                        }
                                                                    }
                                                                }
                                                                if (world.m_5776_()) break block636;
                                                                if (entity instanceof VoidgolemtitanEntity) {
                                                                    _datEntI2 = (VoidgolemtitanEntity)entity;
                                                                    n15 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
                                                                } else {
                                                                    n15 = 0;
                                                                }
                                                                if (n15 != 0 && entity instanceof VoidgolemtitanEntity) {
                                                                    int n25;
                                                                    VoidgolemtitanEntity _datEntSetI5 = (VoidgolemtitanEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI5.m_20088_();
                                                                    if (entity instanceof VoidgolemtitanEntity) {
                                                                        _datEntI = (VoidgolemtitanEntity)entity;
                                                                        n25 = (Integer)_datEntI.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
                                                                    } else {
                                                                        n25 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)(n25 + 1));
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt11 = (Mob)entity;
                                                                    livingEntity16 = _mobEnt11.m_5448_();
                                                                } else {
                                                                    livingEntity16 = null;
                                                                }
                                                                if (livingEntity16 == null) break block637;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt12 = (Mob)entity;
                                                                    v18 = _mobEnt12.m_5448_();
                                                                } else {
                                                                    v18 = livingEntity15 = null;
                                                                }
                                                                if (livingEntity15 instanceof LivingEntity) {
                                                                    _livEnt3 = livingEntity15;
                                                                    f8 = _livEnt3.m_21223_();
                                                                } else {
                                                                    f8 = -1.0f;
                                                                }
                                                                if (f8 <= 0.0f) break block638;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt8 = (Mob)entity;
                                                                    livingEntity14 = _mobEnt8.m_5448_();
                                                                } else {
                                                                    livingEntity14 = null;
                                                                }
                                                                if (livingEntity14.m_6084_()) break block637;
                                                            }
                                                            if (entity instanceof Mob) {
                                                                Mob _entity = (Mob)entity;
                                                                _entity.m_6710_(null);
                                                            }
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt11 = (Mob)entity;
                                                            livingEntity13 = _mobEnt11.m_5448_();
                                                        } else {
                                                            livingEntity13 = null;
                                                        }
                                                        if (livingEntity13 == null) break block639;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt13 = (Mob)entity;
                                                            livingEntity12 = _mobEnt13.m_5448_();
                                                        } else {
                                                            livingEntity12 = null;
                                                        }
                                                        double d = livingEntity12.m_20185_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt7 = (Mob)entity;
                                                            livingEntity11 = _mobEnt7.m_5448_();
                                                        } else {
                                                            livingEntity11 = null;
                                                        }
                                                        double d2 = livingEntity11.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt14 = (Mob)entity;
                                                            livingEntity10 = _mobEnt14.m_5448_();
                                                        } else {
                                                            livingEntity10 = null;
                                                        }
                                                        double d3 = d2 + (double)livingEntity10.m_20206_() / 1.5;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt15 = (Mob)entity;
                                                            livingEntity9 = _mobEnt15.m_5448_();
                                                        } else {
                                                            livingEntity9 = null;
                                                        }
                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity9.m_20189_()));
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt16 = (Mob)entity;
                                                            v29 = _mobEnt16.m_5448_();
                                                        } else {
                                                            v29 = _mobEnt8 = null;
                                                        }
                                                        if (_mobEnt8 instanceof LivingEntity) {
                                                            _livEnt3 = (LivingEntity)_mobEnt8;
                                                            f7 = _livEnt3.m_21223_();
                                                        } else {
                                                            f7 = -1.0f;
                                                        }
                                                        if (!(f7 > 0.0f)) break block640;
                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                            _datEntI3 = (VoidgolemtitanEntity)entity;
                                                            n14 = (Integer)_datEntI3.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
                                                        } else {
                                                            n14 = 0;
                                                        }
                                                        if (n14 != 0) break block636;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity8 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity8 = null;
                                                        }
                                                        if (livingEntity8 != null) {
                                                            LivingEntity livingEntity17;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity17 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity17 = null;
                                                            }
                                                            f6 = entity.m_20270_(livingEntity17);
                                                        } else {
                                                            f6 = -1.0f;
                                                        }
                                                        if (f6 >= 160.0f) {
                                                            entity.m_6858_(true);
                                                        } else {
                                                            entity.m_6858_(false);
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity7 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity7 = null;
                                                        }
                                                        if (livingEntity7 != null) {
                                                            LivingEntity livingEntity18;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity18 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity18 = null;
                                                            }
                                                            f5 = entity.m_20270_(livingEntity18);
                                                        } else {
                                                            f5 = -1.0f;
                                                        }
                                                        if (f5 > 75.0f) {
                                                            float f12;
                                                            LivingEntity livingEntity19;
                                                            LivingEntity livingEntity20;
                                                            float f13;
                                                            LivingEntity livingEntity21;
                                                            LivingEntity livingEntity22;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity22 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity22 = null;
                                                            }
                                                            double d4 = livingEntity22.m_20185_() - entity.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt10 = (Mob)entity;
                                                                livingEntity21 = _mobEnt10.m_5448_();
                                                            } else {
                                                                livingEntity21 = null;
                                                            }
                                                            if (livingEntity21 != null) {
                                                                LivingEntity livingEntity23;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity23 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity23 = null;
                                                                }
                                                                f13 = entity.m_20270_(livingEntity23);
                                                            } else {
                                                                f13 = -1.0f;
                                                            }
                                                            double d5 = d4 / (double)f13 * 0.7;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity20 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity20 = null;
                                                            }
                                                            double d6 = livingEntity20.m_20189_() - entity.m_20189_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt10 = (Mob)entity;
                                                                livingEntity19 = _mobEnt10.m_5448_();
                                                            } else {
                                                                livingEntity19 = null;
                                                            }
                                                            if (livingEntity19 != null) {
                                                                LivingEntity livingEntity24;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity24 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity24 = null;
                                                                }
                                                                f12 = entity.m_20270_(livingEntity24);
                                                            } else {
                                                                f12 = -1.0f;
                                                            }
                                                            entity.m_20256_(new Vec3(d5, 0.0, d6 / (double)f12 * 0.7));
                                                        } else {
                                                            LivingEntity livingEntity25;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity25 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity25 = null;
                                                            }
                                                            if (livingEntity25.m_20206_() > 8.0f) {
                                                                float f14;
                                                                LivingEntity livingEntity26;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt10 = (Mob)entity;
                                                                    livingEntity26 = _mobEnt10.m_5448_();
                                                                } else {
                                                                    livingEntity26 = null;
                                                                }
                                                                if (livingEntity26 != null) {
                                                                    LivingEntity livingEntity27;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt4 = (Mob)entity;
                                                                        livingEntity27 = _mobEnt4.m_5448_();
                                                                    } else {
                                                                        livingEntity27 = null;
                                                                    }
                                                                    f14 = entity.m_20270_(livingEntity27);
                                                                } else {
                                                                    f14 = -1.0f;
                                                                }
                                                                if (f14 > 40.0f) {
                                                                    float f15;
                                                                    LivingEntity livingEntity28;
                                                                    LivingEntity livingEntity29;
                                                                    float f16;
                                                                    LivingEntity livingEntity30;
                                                                    LivingEntity livingEntity31;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt9 = (Mob)entity;
                                                                        livingEntity31 = _mobEnt9.m_5448_();
                                                                    } else {
                                                                        livingEntity31 = null;
                                                                    }
                                                                    double d7 = livingEntity31.m_20185_() - entity.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity30 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity30 = null;
                                                                    }
                                                                    if (livingEntity30 != null) {
                                                                        LivingEntity livingEntity32;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity32 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity32 = null;
                                                                        }
                                                                        f16 = entity.m_20270_(livingEntity32);
                                                                    } else {
                                                                        f16 = -1.0f;
                                                                    }
                                                                    double d8 = d7 / (double)f16 * 0.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt9 = (Mob)entity;
                                                                        livingEntity29 = _mobEnt9.m_5448_();
                                                                    } else {
                                                                        livingEntity29 = null;
                                                                    }
                                                                    double d9 = livingEntity29.m_20189_() - entity.m_20189_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity28 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity28 = null;
                                                                    }
                                                                    if (livingEntity28 != null) {
                                                                        LivingEntity livingEntity33;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity33 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity33 = null;
                                                                        }
                                                                        f15 = entity.m_20270_(livingEntity33);
                                                                    } else {
                                                                        f15 = -1.0f;
                                                                    }
                                                                    entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f15 * 0.5));
                                                                }
                                                            } else {
                                                                float f17;
                                                                LivingEntity livingEntity34;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt10 = (Mob)entity;
                                                                    livingEntity34 = _mobEnt10.m_5448_();
                                                                } else {
                                                                    livingEntity34 = null;
                                                                }
                                                                if (livingEntity34 != null) {
                                                                    LivingEntity livingEntity35;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt4 = (Mob)entity;
                                                                        livingEntity35 = _mobEnt4.m_5448_();
                                                                    } else {
                                                                        livingEntity35 = null;
                                                                    }
                                                                    f17 = entity.m_20270_(livingEntity35);
                                                                } else {
                                                                    f17 = -1.0f;
                                                                }
                                                                if (f17 > 12.0f) {
                                                                    float f18;
                                                                    LivingEntity livingEntity36;
                                                                    LivingEntity livingEntity37;
                                                                    float f19;
                                                                    LivingEntity livingEntity38;
                                                                    LivingEntity livingEntity39;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt9 = (Mob)entity;
                                                                        livingEntity39 = _mobEnt9.m_5448_();
                                                                    } else {
                                                                        livingEntity39 = null;
                                                                    }
                                                                    double d10 = livingEntity39.m_20185_() - entity.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity38 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity38 = null;
                                                                    }
                                                                    if (livingEntity38 != null) {
                                                                        LivingEntity livingEntity40;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity40 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity40 = null;
                                                                        }
                                                                        f19 = entity.m_20270_(livingEntity40);
                                                                    } else {
                                                                        f19 = -1.0f;
                                                                    }
                                                                    double d11 = d10 / (double)f19 * 0.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt9 = (Mob)entity;
                                                                        livingEntity37 = _mobEnt9.m_5448_();
                                                                    } else {
                                                                        livingEntity37 = null;
                                                                    }
                                                                    double d12 = livingEntity37.m_20189_() - entity.m_20189_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity36 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity36 = null;
                                                                    }
                                                                    if (livingEntity36 != null) {
                                                                        LivingEntity livingEntity41;
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity41 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity41 = null;
                                                                        }
                                                                        f18 = entity.m_20270_(livingEntity41);
                                                                    } else {
                                                                        f18 = -1.0f;
                                                                    }
                                                                    entity.m_20256_(new Vec3(d11, 0.0, d12 / (double)f18 * 0.5));
                                                                }
                                                            }
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity6 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity6 = null;
                                                        }
                                                        if (livingEntity6 != null) {
                                                            LivingEntity livingEntity42;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity42 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity42 = null;
                                                            }
                                                            f4 = entity.m_20270_(livingEntity42);
                                                        } else {
                                                            f4 = -1.0f;
                                                        }
                                                        if (!(f4 < 512.0f)) break block636;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt3 = (Mob)entity;
                                                            livingEntity5 = _mobEnt3.m_5448_();
                                                        } else {
                                                            livingEntity5 = null;
                                                        }
                                                        if (livingEntity5 != null) {
                                                            LivingEntity livingEntity43;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt10 = (Mob)entity;
                                                                livingEntity43 = _mobEnt10.m_5448_();
                                                            } else {
                                                                livingEntity43 = null;
                                                            }
                                                            f3 = entity.m_20270_(livingEntity43);
                                                        } else {
                                                            f3 = -1.0f;
                                                        }
                                                        if (!(f3 <= 60.0f)) break block641;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity4 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity4 = null;
                                                        }
                                                        if (!(livingEntity4.m_20206_() > 6.0f)) break block642;
                                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 4) {
                                                            if (entity instanceof VoidgolemtitanEntity) {
                                                                _datEntSetI2 = (VoidgolemtitanEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)6));
                                                            }
                                                            break block641;
                                                        } else if (entity instanceof VoidgolemtitanEntity) {
                                                            _datEntSetI2 = (VoidgolemtitanEntity)entity;
                                                            _datEntSetI2.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)4);
                                                        }
                                                        break block641;
                                                    }
                                                    if (entity instanceof VoidgolemtitanEntity) {
                                                        _datEntSetI2 = (VoidgolemtitanEntity)entity;
                                                        _datEntSetI2.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                    }
                                                }
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) != 5) break block636;
                                                if (entity instanceof VoidgolemtitanEntity) {
                                                    VoidgolemtitanEntity _datEntI6 = (VoidgolemtitanEntity)entity;
                                                    n13 = (Integer)_datEntI6.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
                                                } else {
                                                    n13 = 0;
                                                }
                                                if (n13 != 0) break block636;
                                                if (entity instanceof Mob) {
                                                    _mobEnt10 = (Mob)entity;
                                                    livingEntity3 = _mobEnt10.m_5448_();
                                                } else {
                                                    livingEntity3 = null;
                                                }
                                                if (livingEntity3 != null) {
                                                    LivingEntity livingEntity44;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt4 = (Mob)entity;
                                                        livingEntity44 = _mobEnt4.m_5448_();
                                                    } else {
                                                        livingEntity44 = null;
                                                    }
                                                    f2 = entity.m_20270_(livingEntity44);
                                                } else {
                                                    f2 = -1.0f;
                                                }
                                                if (!(f2 > 80.0f)) break block643;
                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)30) == 5) {
                                                    LivingEntity livingEntity45;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt = (Mob)entity;
                                                        livingEntity45 = _mobEnt.m_5448_();
                                                    } else {
                                                        livingEntity45 = null;
                                                    }
                                                    if (livingEntity45.m_20206_() > 6.0f) {
                                                        if (entity instanceof VoidgolemtitanEntity) {
                                                            _datEntSetI = (VoidgolemtitanEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)7);
                                                        }
                                                        break block636;
                                                    } else if (entity instanceof VoidgolemtitanEntity) {
                                                        _datEntSetI = (VoidgolemtitanEntity)entity;
                                                        _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)7);
                                                    }
                                                }
                                                break block636;
                                            }
                                            if (entity instanceof Mob) {
                                                _mobEnt = (Mob)entity;
                                                livingEntity2 = _mobEnt.m_5448_();
                                            } else {
                                                livingEntity2 = null;
                                            }
                                            if (livingEntity2 != null) {
                                                LivingEntity livingEntity46;
                                                if (entity instanceof Mob) {
                                                    _mobEnt2 = (Mob)entity;
                                                    livingEntity46 = _mobEnt2.m_5448_();
                                                } else {
                                                    livingEntity46 = null;
                                                }
                                                f = entity.m_20270_(livingEntity46);
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (!(f > 60.0f)) break block636;
                                            if (entity instanceof Mob) {
                                                _mobEnt9 = (Mob)entity;
                                                livingEntity = _mobEnt9.m_5448_();
                                            } else {
                                                livingEntity = null;
                                            }
                                            if (livingEntity.m_20206_() > 6.0f) {
                                                if (entity instanceof VoidgolemtitanEntity) {
                                                    _datEntSetI = (VoidgolemtitanEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
                                                }
                                                break block636;
                                            } else if (entity instanceof VoidgolemtitanEntity) {
                                                _datEntSetI = (VoidgolemtitanEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)7));
                                            }
                                            break block636;
                                        }
                                        if (entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                        break block636;
                                    }
                                    if (entity.m_20186_() < -63.0) {
                                        entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                    }
                                }
                                if (entity instanceof VoidgolemtitanEntity) {
                                    _datEntI2 = (VoidgolemtitanEntity)entity;
                                    n12 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
                                } else {
                                    n12 = 0;
                                }
                                if (n12 != true) break block644;
                                if (entity instanceof VoidgolemtitanEntity) {
                                    ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zt");
                                }
                                if (entity instanceof VoidgolemtitanEntity) {
                                    VoidgolemtitanEntity _datEntI7 = (VoidgolemtitanEntity)entity;
                                    n11 = (Integer)_datEntI7.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
                                } else {
                                    n11 = 0;
                                }
                                if (n11 == 1) {
                                    float f;
                                    LivingEntity livingEntity;
                                    if (entity instanceof Mob) {
                                        _mobEnt7 = (Mob)entity;
                                        livingEntity = _mobEnt7.m_5448_();
                                    } else {
                                        livingEntity = null;
                                    }
                                    if (livingEntity != null) {
                                        LivingEntity livingEntity47;
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity47 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity47 = null;
                                        }
                                        f = entity.m_20270_(livingEntity47);
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (f > 1.0f) {
                                        LivingEntity livingEntity48;
                                        LivingEntity livingEntity49;
                                        LivingEntity livingEntity50;
                                        LivingEntity livingEntity51;
                                        if (entity instanceof Mob) {
                                            _mobEnt6 = (Mob)entity;
                                            livingEntity51 = _mobEnt6.m_5448_();
                                        } else {
                                            livingEntity51 = null;
                                        }
                                        double d = livingEntity51.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity50 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity50 = null;
                                        }
                                        double d13 = livingEntity50.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt6 = (Mob)entity;
                                            livingEntity49 = _mobEnt6.m_5448_();
                                        } else {
                                            livingEntity49 = null;
                                        }
                                        double d14 = d13 + (double)livingEntity49.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt6 = (Mob)entity;
                                            livingEntity48 = _mobEnt6.m_5448_();
                                        } else {
                                            livingEntity48 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d14, livingEntity48.m_20189_()));
                                    }
                                }
                                if (entity instanceof VoidgolemtitanEntity) {
                                    VoidgolemtitanEntity _datEntI8 = (VoidgolemtitanEntity)entity;
                                    n10 = (Integer)_datEntI8.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
                                } else {
                                    n10 = 0;
                                }
                                if (n10 == 56) break block645;
                                if (entity instanceof VoidgolemtitanEntity) {
                                    _datEntI = (VoidgolemtitanEntity)entity;
                                    n9 = (Integer)_datEntI.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
                                } else {
                                    n9 = 0;
                                }
                                if (n9 != 96) break block646;
                            }
                            if (world instanceof Level) {
                                _level2 = (Level)world;
                                if (!_level2.m_5776_()) {
                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center2 = new Vec3(x, y, z);
                            _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                            _mobEnt5 = _entfound2.iterator();
                            break block647;
                        }
                        _center2 = new Vec3(x, y, z);
                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                        _mobEnt5 = _entfound2.iterator();
                        break block648;
                    }
                    while (_mobEnt5.hasNext()) {
                        float f;
                        float f20;
                        float f21;
                        float f22;
                        LivingEntity _livEnt6;
                        float f23;
                        float f24;
                        float f25;
                        entityiterator = (Entity)_mobEnt5.next();
                        if (entityiterator instanceof VoidgolemtitanEntity || entityiterator instanceof BlackholeEntity || !(entityiterator instanceof LivingEntity)) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f25 = _livEnt2.m_21233_();
                        } else {
                            f25 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f25 / 20.0f + 500000.0f);
                        if (entityiterator instanceof Titangodentity) continue;
                        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f24 = _livEnt2.m_21233_();
                        } else {
                            f24 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource2, f24 / 20.0f + 500000.0f);
                        DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f23 = _livEnt2.m_21233_();
                        } else {
                            f23 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource3, f23 / 20.0f + 500000.0f);
                        entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                        if (!(entityiterator.m_20206_() > 6.0f)) continue;
                        DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt6 = (LivingEntity)entityiterator;
                            f22 = _livEnt6.m_21233_();
                        } else {
                            f22 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f21 = _livEnt2.m_21223_();
                        } else {
                            f21 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource4, (f22 + f21) / 5.0f + 5000000.0f);
                        DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt6 = (LivingEntity)entityiterator;
                            f20 = _livEnt6.m_21233_();
                        } else {
                            f20 = -1.0f;
                        }
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt2 = (LivingEntity)entityiterator;
                            f = _livEnt2.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource5, (f20 + f) / 5.0f + 5000000.0f);
                    }
                    break block649;
                }
                while (_mobEnt5.hasNext()) {
                    float f;
                    entityiterator = (Entity)_mobEnt5.next();
                    if (entityiterator instanceof VoidgolemtitanEntity || entityiterator instanceof BlackholeEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f / 20.0f + 20000.0f);
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI9 = (VoidgolemtitanEntity)entity;
                n8 = (Integer)_datEntI9.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n8 = 0;
            }
            if (n8 >= 120) {
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    ((VoidgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof VoidgolemtitanEntity) {
            _datEntI2 = (VoidgolemtitanEntity)entity;
            n7 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
        } else {
            n7 = 0;
        }
        if (n7 == 2) {
            int n26;
            int n27;
            int n28;
            if (entity instanceof VoidgolemtitanEntity) {
                ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zj");
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI10 = (VoidgolemtitanEntity)entity;
                n28 = (Integer)_datEntI10.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity = _mobEnt7.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity52;
                    if (entity instanceof Mob) {
                        _mobEnt8 = (Mob)entity;
                        livingEntity52 = _mobEnt8.m_5448_();
                    } else {
                        livingEntity52 = null;
                    }
                    f = entity.m_20270_(livingEntity52);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity53;
                    LivingEntity livingEntity54;
                    LivingEntity livingEntity55;
                    LivingEntity livingEntity56;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity56 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity56 = null;
                    }
                    double d = livingEntity56.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity55 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity55 = null;
                    }
                    double d15 = livingEntity55.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity54 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity54 = null;
                    }
                    double d16 = d15 + (double)livingEntity54.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity53 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity53 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity53.m_20189_()));
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI11 = (VoidgolemtitanEntity)entity;
                n27 = (Integer)_datEntI11.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 == 36) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    float f26;
                    float f27;
                    float f28;
                    float f29;
                    float f30;
                    float f31;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f31 = _livEnt.m_21233_();
                    } else {
                        f31 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f31 / 20.0f + 500000.0f);
                    if (entityiterator2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                        entityiterator2.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator2);
                    }
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f30 = _livEnt.m_21233_();
                    } else {
                        f30 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource6, f30 / 20.0f + 500000.0f);
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f29 = _livEnt.m_21233_();
                    } else {
                        f29 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource7, f29 / 20.0f + 500000.0f);
                    entityiterator2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f28 = _livEnt2.m_21233_();
                    } else {
                        f28 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f27 = _livEnt.m_21223_();
                    } else {
                        f27 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource8, (f28 + f27) / 5.0f + 5000000.0f);
                    DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f26 = _livEnt2.m_21233_();
                    } else {
                        f26 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource9, (f26 + f) / 5.0f + 5000000.0f);
                }
            } else {
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f / 20.0f + 20000.0f);
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI12 = (VoidgolemtitanEntity)entity;
                n26 = (Integer)_datEntI12.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n26 = 0;
            }
            if (n26 >= 60) {
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    ((VoidgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof VoidgolemtitanEntity) {
            _datEntI2 = (VoidgolemtitanEntity)entity;
            n6 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
        } else {
            n6 = 0;
        }
        if (n6 == 3) {
            int n29;
            int n30;
            int n31;
            if (entity instanceof VoidgolemtitanEntity) {
                ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.gt");
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI13 = (VoidgolemtitanEntity)entity;
                n31 = (Integer)_datEntI13.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity = _mobEnt7.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity57;
                    if (entity instanceof Mob) {
                        _mobEnt8 = (Mob)entity;
                        livingEntity57 = _mobEnt8.m_5448_();
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
                        _mobEnt6 = (Mob)entity;
                        livingEntity61 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity61 = null;
                    }
                    double d = livingEntity61.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity60 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity60 = null;
                    }
                    double d17 = livingEntity60.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity59 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity59 = null;
                    }
                    double d18 = d17 + (double)livingEntity59.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity58 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity58 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity58.m_20189_()));
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI14 = (VoidgolemtitanEntity)entity;
                n30 = (Integer)_datEntI14.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 == 48) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    float f32;
                    float f33;
                    float f34;
                    float f35;
                    float f36;
                    float f37;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f37 = _livEnt.m_21233_();
                    } else {
                        f37 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f37 / 20.0f + 1050000.0f);
                    if (entityiterator2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                        entityiterator2.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator2);
                    }
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f36 = _livEnt.m_21233_();
                    } else {
                        f36 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource10, f36 / 20.0f + 1050000.0f);
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f35 = _livEnt.m_21233_();
                    } else {
                        f35 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource11, f35 / 20.0f + 1050000.0f);
                    entityiterator2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f34 = _livEnt2.m_21233_();
                    } else {
                        f34 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f33 = _livEnt.m_21223_();
                    } else {
                        f33 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource12, (f34 + f33) / 5.0f + 1.05E7f);
                    DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f32 = _livEnt2.m_21233_();
                    } else {
                        f32 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource13, (f32 + f) / 5.0f + 1.05E7f);
                }
            } else {
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f / 20.0f + 10000.0f);
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI15 = (VoidgolemtitanEntity)entity;
                n29 = (Integer)_datEntI15.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 >= 80) {
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    ((VoidgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof VoidgolemtitanEntity) {
            _datEntI2 = (VoidgolemtitanEntity)entity;
            n5 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 4) {
            int n32;
            int n33;
            int n34;
            if (entity instanceof VoidgolemtitanEntity) {
                ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.attack");
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI16 = (VoidgolemtitanEntity)entity;
                n34 = (Integer)_datEntI16.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n34 = 0;
            }
            if (n34 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity = _mobEnt7.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity62;
                    if (entity instanceof Mob) {
                        _mobEnt8 = (Mob)entity;
                        livingEntity62 = _mobEnt8.m_5448_();
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
                        _mobEnt6 = (Mob)entity;
                        livingEntity66 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity66 = null;
                    }
                    double d = livingEntity66.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity65 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity65 = null;
                    }
                    double d19 = livingEntity65.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity64 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity64 = null;
                    }
                    double d20 = d19 + (double)livingEntity64.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity63 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity63 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity63.m_20189_()));
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI17 = (VoidgolemtitanEntity)entity;
                n33 = (Integer)_datEntI17.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n33 = 0;
            }
            if (n33 == 14) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.strong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    float f38;
                    float f39;
                    float f40;
                    float f41;
                    float f42;
                    float f43;
                    float f44;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f44 = _livEnt.m_21233_();
                    } else {
                        f44 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f44 / 20.0f + 21.0f);
                    DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f43 = _livEnt.m_21233_();
                    } else {
                        f43 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource14, f43 / 20.0f + 2100000.0f);
                    if (entityiterator2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                        entityiterator2.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator2);
                    }
                    DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f42 = _livEnt.m_21233_();
                    } else {
                        f42 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource15, f42 / 20.0f + 2100000.0f);
                    DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f41 = _livEnt.m_21233_();
                    } else {
                        f41 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource16, f41 / 20.0f + 2100000.0f);
                    if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f40 = _livEnt2.m_21233_();
                    } else {
                        f40 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f39 = _livEnt.m_21223_();
                    } else {
                        f39 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource17, (f40 + f39) / 5.0f + 2.1E7f);
                    DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f38 = _livEnt2.m_21233_();
                    } else {
                        f38 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource18, (f38 + f) / 5.0f + 2.1E7f);
                }
            } else {
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f / 20.0f + 50000.0f);
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI18 = (VoidgolemtitanEntity)entity;
                n32 = (Integer)_datEntI18.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 >= 30) {
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    ((VoidgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof VoidgolemtitanEntity) {
            _datEntI2 = (VoidgolemtitanEntity)entity;
            n4 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 5) {
            int n35;
            int n36;
            int n37;
            if (entity instanceof VoidgolemtitanEntity) {
                ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.fs");
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI19 = (VoidgolemtitanEntity)entity;
                n37 = (Integer)_datEntI19.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n37 = 0;
            }
            if (n37 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity = _mobEnt7.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity67;
                    if (entity instanceof Mob) {
                        _mobEnt8 = (Mob)entity;
                        livingEntity67 = _mobEnt8.m_5448_();
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
                        _mobEnt6 = (Mob)entity;
                        livingEntity71 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity71 = null;
                    }
                    double d = livingEntity71.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity70 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity70 = null;
                    }
                    double d21 = livingEntity70.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity69 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity69 = null;
                    }
                    double d22 = d21 + (double)livingEntity69.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity68 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity68 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity68.m_20189_()));
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI20 = (VoidgolemtitanEntity)entity;
                n36 = (Integer)_datEntI20.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n36 = 0;
            }
            if (n36 == 40) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    float f45;
                    float f46;
                    float f47;
                    float f48;
                    float f49;
                    float f50;
                    float f51;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    double _setval = 5.0;
                    entityiterator2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator2);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt7 = (LivingEntity)entityiterator2;
                        f51 = _livEnt7.m_21233_();
                    } else {
                        f51 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f51 / 20.0f + 42.0f);
                    DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt8 = (LivingEntity)entityiterator2;
                        f50 = _livEnt8.m_21233_();
                    } else {
                        f50 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource19, f50 / 20.0f + 4200000.0f);
                    if (entityiterator2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                        entityiterator2.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator2);
                    }
                    DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt9 = (LivingEntity)entityiterator2;
                        f49 = _livEnt9.m_21233_();
                    } else {
                        f49 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource20, f49 / 20.0f + 4200000.0f);
                    DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt10 = (LivingEntity)entityiterator2;
                        f48 = _livEnt10.m_21233_();
                    } else {
                        f48 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource21, f48 / 20.0f + 4200000.0f);
                    entityiterator2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f47 = _livEnt2.m_21233_();
                    } else {
                        f47 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt11 = (LivingEntity)entityiterator2;
                        f46 = _livEnt11.m_21223_();
                    } else {
                        f46 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource22, (f47 + f46) / 5.0f + 4.2E7f);
                    DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f45 = _livEnt2.m_21233_();
                    } else {
                        f45 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt12 = (LivingEntity)entityiterator2;
                        f = _livEnt12.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource23, (f45 + f) / 5.0f + 4.2E7f);
                }
            } else {
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator2;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f / 20.0f + 50000.0f);
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI21 = (VoidgolemtitanEntity)entity;
                n35 = (Integer)_datEntI21.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n35 = 0;
            }
            if (n35 >= 60) {
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    ((VoidgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof VoidgolemtitanEntity) {
            _datEntI2 = (VoidgolemtitanEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 6) {
            int n38;
            int n39;
            int n40;
            Object _entfound3;
            int n41;
            int n42;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof VoidgolemtitanEntity) {
                ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.energy");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt17 = (Mob)entity;
                livingEntity = _mobEnt17.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity72;
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity72 = _mobEnt7.m_5448_();
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
                    _mobEnt8 = (Mob)entity;
                    livingEntity76 = _mobEnt8.m_5448_();
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
                double d23 = livingEntity75.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt8 = (Mob)entity;
                    livingEntity74 = _mobEnt8.m_5448_();
                } else {
                    livingEntity74 = null;
                }
                double d24 = d23 + (double)livingEntity74.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt8 = (Mob)entity;
                    livingEntity73 = _mobEnt8.m_5448_();
                } else {
                    livingEntity73 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity73.m_20189_()));
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI22 = (VoidgolemtitanEntity)entity;
                n42 = (Integer)_datEntI22.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n42 = 0;
            }
            if (n42 == 45 && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.BLACKHOLE.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)x, (double)(y + 90.0), (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI23 = (VoidgolemtitanEntity)entity;
                n41 = (Integer)_datEntI23.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 == 46) {
                float f52;
                LivingEntity livingEntity77;
                if (entity instanceof Mob) {
                    _mobEnt7 = (Mob)entity;
                    livingEntity77 = _mobEnt7.m_5448_();
                } else {
                    livingEntity77 = null;
                }
                if (livingEntity77 != null) {
                    LivingEntity livingEntity78;
                    if (entity instanceof Mob) {
                        _mobEnt8 = (Mob)entity;
                        livingEntity78 = _mobEnt8.m_5448_();
                    } else {
                        livingEntity78 = null;
                    }
                    f52 = entity.m_20270_(livingEntity78);
                } else {
                    f52 = -1.0f;
                }
                if (f52 > 1.0f) {
                    _center = new Vec3(x, y + 80.0, z);
                    _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    _livEnt = _entfound3.iterator();
                    while (_livEnt.hasNext()) {
                        float f53;
                        LivingEntity livingEntity79;
                        LivingEntity livingEntity80;
                        float f54;
                        LivingEntity livingEntity81;
                        LivingEntity livingEntity82;
                        float f55;
                        LivingEntity livingEntity83;
                        LivingEntity livingEntity84;
                        entityiterator = (Entity)_livEnt.next();
                        if (!(entityiterator instanceof BlackholeEntity)) continue;
                        if (entityiterator instanceof Mob) {
                            _entity = (Mob)entityiterator;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                v255 = _mobEnt.m_5448_();
                            } else {
                                v255 = var21_63 = null;
                            }
                            if (var21_63 instanceof LivingEntity) {
                                _ent = var21_63;
                                _entity.m_6710_(_ent);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity84 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity84 = null;
                        }
                        double d = livingEntity84.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity83 = _mobEnt.m_5448_();
                        } else {
                            livingEntity83 = null;
                        }
                        if (livingEntity83 != null) {
                            LivingEntity livingEntity85;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity85 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity85 = null;
                            }
                            f55 = entity.m_20270_(livingEntity85);
                        } else {
                            f55 = -1.0f;
                        }
                        double d25 = d / (double)f55 * 6.0;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity82 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity82 = null;
                        }
                        double d26 = livingEntity82.m_20189_() - (entity.m_20186_() - 88.0);
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity81 = _mobEnt.m_5448_();
                        } else {
                            livingEntity81 = null;
                        }
                        if (livingEntity81 != null) {
                            LivingEntity livingEntity86;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity86 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity86 = null;
                            }
                            f54 = entity.m_20270_(livingEntity86);
                        } else {
                            f54 = -1.0f;
                        }
                        double d27 = d26 / (double)f54 * 6.0;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity80 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity80 = null;
                        }
                        double d28 = livingEntity80.m_20189_() - entity.m_20189_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity79 = _mobEnt.m_5448_();
                        } else {
                            livingEntity79 = null;
                        }
                        if (livingEntity79 != null) {
                            LivingEntity livingEntity87;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity87 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity87 = null;
                            }
                            f53 = entity.m_20270_(livingEntity87);
                        } else {
                            f53 = -1.0f;
                        }
                        entity.m_20256_(new Vec3(d25, d27, d28 / (double)f53 * 6.0));
                    }
                } else {
                    _center = new Vec3(x, y + 80.0, z);
                    _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    _livEnt = _entfound3.iterator();
                    while (_livEnt.hasNext()) {
                        LivingEntity livingEntity88;
                        entityiterator = (Entity)_livEnt.next();
                        if (!(entityiterator instanceof BlackholeEntity)) continue;
                        entityiterator.m_20256_(new Vec3(entity.m_20154_().f_82479_ * 6.0, -1.0, z + entity.m_20154_().f_82481_ * 6.0));
                        if (!(entityiterator instanceof Mob)) continue;
                        _entity = (Mob)entityiterator;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity88 = _mobEnt.m_5448_();
                        } else {
                            livingEntity88 = null;
                        }
                        if (!((var21_63 = livingEntity88) instanceof LivingEntity)) continue;
                        _ent = var21_63;
                        _entity.m_6710_(_ent);
                    }
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI24 = (VoidgolemtitanEntity)entity;
                n40 = (Integer)_datEntI24.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 >= 41) {
                int n43;
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntI = (VoidgolemtitanEntity)entity;
                    n43 = (Integer)_datEntI.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
                } else {
                    n43 = 0;
                }
                if (n43 <= 125) {
                    _center2 = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                    _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(512.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                    _entfound3 = _entfound2.iterator();
                    while (_entfound3.hasNext()) {
                        entityiterator = (Entity)_entfound3.next();
                        double _setval = 2.0;
                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                            capability.camerashake = _setval;
                            capability.syncPlayerVariables(entityiterator);
                        });
                    }
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI25 = (VoidgolemtitanEntity)entity;
                n39 = (Integer)_datEntI25.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 == 25) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 40.0, y, z + entity.m_20154_().f_82481_ * 40.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator2 : _entfound) {
                    float f56;
                    float f57;
                    float f58;
                    float f59;
                    float f60;
                    float f61;
                    float f62;
                    if (entityiterator2 instanceof VoidgolemtitanEntity || entityiterator2 instanceof BlackholeEntity || !(entityiterator2 instanceof LivingEntity)) continue;
                    double _setval = 6.0;
                    entityiterator2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator2);
                    });
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt13 = (LivingEntity)entityiterator2;
                        f62 = _livEnt13.m_21233_();
                    } else {
                        f62 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource, f62 / 20.0f + 2100000.0f);
                    if (entityiterator2 instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator2 instanceof Player)) {
                        entityiterator2.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator2);
                    }
                    DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt14 = (LivingEntity)entityiterator2;
                        f61 = _livEnt14.m_21233_();
                    } else {
                        f61 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource24, f61 / 20.0f + 2100000.0f);
                    DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt15 = (LivingEntity)entityiterator2;
                        f60 = _livEnt15.m_21233_();
                    } else {
                        f60 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource25, f60 / 20.0f + 2100000.0f);
                    entityiterator2.m_20256_(new Vec3(0.0, 1.0, 0.0));
                    if (!(entityiterator2.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f59 = _livEnt2.m_21233_();
                    } else {
                        f59 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt16 = (LivingEntity)entityiterator2;
                        f58 = _livEnt16.m_21223_();
                    } else {
                        f58 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource26, (f59 + f58) / 5.0f + 2.1E7f);
                    DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator2 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator2;
                        f57 = _livEnt2.m_21233_();
                    } else {
                        f57 = -1.0f;
                    }
                    if (entityiterator2 instanceof LivingEntity) {
                        LivingEntity _livEnt17 = (LivingEntity)entityiterator2;
                        f56 = _livEnt17.m_21223_();
                    } else {
                        f56 = -1.0f;
                    }
                    entityiterator2.m_6469_(damageSource27, (f57 + f56) / 5.0f + 2.1E7f);
                }
            }
            if (entity instanceof VoidgolemtitanEntity) {
                VoidgolemtitanEntity _datEntI26 = (VoidgolemtitanEntity)entity;
                n38 = (Integer)_datEntI26.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
            } else {
                n38 = 0;
            }
            if (n38 >= 180) {
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    _datEntSetI = (VoidgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof VoidgolemtitanEntity) {
                    ((VoidgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (!(entity instanceof VoidgolemtitanEntity)) return;
        _datEntI2 = (VoidgolemtitanEntity)entity;
        int n44 = (Integer)_datEntI2.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationID);
        if (n44 != 7) return;
        if (entity instanceof VoidgolemtitanEntity) {
            ((VoidgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.td");
        }
        if (entity instanceof VoidgolemtitanEntity) {
            VoidgolemtitanEntity _datEntI27 = (VoidgolemtitanEntity)entity;
            n2 = (Integer)_datEntI27.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
        } else {
            n2 = 0;
        }
        if (n2 == 1) {
            float f;
            LivingEntity livingEntity;
            if (entity instanceof Mob) {
                _mobEnt7 = (Mob)entity;
                livingEntity = _mobEnt7.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity89;
                if (entity instanceof Mob) {
                    _mobEnt8 = (Mob)entity;
                    livingEntity89 = _mobEnt8.m_5448_();
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
                    _mobEnt6 = (Mob)entity;
                    livingEntity93 = _mobEnt6.m_5448_();
                } else {
                    livingEntity93 = null;
                }
                double d = livingEntity93.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt5 = (Mob)entity;
                    livingEntity92 = _mobEnt5.m_5448_();
                } else {
                    livingEntity92 = null;
                }
                double d29 = livingEntity92.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity91 = _mobEnt6.m_5448_();
                } else {
                    livingEntity91 = null;
                }
                double d30 = d29 + (double)livingEntity91.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity90 = _mobEnt6.m_5448_();
                } else {
                    livingEntity90 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d30, livingEntity90.m_20189_()));
            }
        }
        if (entity instanceof VoidgolemtitanEntity) {
            VoidgolemtitanEntity _datEntI28 = (VoidgolemtitanEntity)entity;
            n = (Integer)_datEntI28.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
        } else {
            n = 0;
        }
        if (n == 18) {
            float f;
            LivingEntity livingEntity;
            if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof Mob) {
                _mobEnt7 = (Mob)entity;
                livingEntity = _mobEnt7.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity94;
                if (entity instanceof Mob) {
                    _mobEnt8 = (Mob)entity;
                    livingEntity94 = _mobEnt8.m_5448_();
                } else {
                    livingEntity94 = null;
                }
                f = entity.m_20270_(livingEntity94);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f && world instanceof ServerLevel) {
                LivingEntity livingEntity95;
                LivingEntity livingEntity96;
                LivingEntity livingEntity97;
                ServerLevel projectileLevel = (ServerLevel)world;
                Projectile _entityToSpawn = new Object(){

                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        GiantvoidEntity entityToSpawn = new GiantvoidEntity((EntityType<? extends GiantvoidEntity>)((EntityType)UltimateskeletonsModEntities.GIANTVOID.get()), level);
                        entityToSpawn.m_5602_(shooter);
                        entityToSpawn.m_36781_(damage);
                        entityToSpawn.m_36735_(knockback);
                        entityToSpawn.m_20225_(true);
                        entityToSpawn.m_36762_(true);
                        return entityToSpawn;
                    }
                }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 27.0, y + 45.0, z + entity.m_20154_().f_82481_ * 27.0);
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity97 = _mobEnt3.m_5448_();
                } else {
                    livingEntity97 = null;
                }
                double d = livingEntity97.m_20185_() - entity.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity96 = _mobEnt3.m_5448_();
                } else {
                    livingEntity96 = null;
                }
                double d31 = livingEntity96.m_20186_() - 40.0 - entity.m_20186_();
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity95 = _mobEnt3.m_5448_();
                } else {
                    livingEntity95 = null;
                }
                _entityToSpawn.m_6686_(d, d31, livingEntity95.m_20189_() - entity.m_20189_(), 4.0f, 2.0f);
                projectileLevel.m_7967_((Entity)_entityToSpawn);
            }
        }
        if (!(entity instanceof VoidgolemtitanEntity)) return;
        VoidgolemtitanEntity _datEntI29 = (VoidgolemtitanEntity)entity;
        int n45 = (Integer)_datEntI29.m_20088_().m_135370_(VoidgolemtitanEntity.DATA_animationTick);
        if (n45 < 50) return;
        if (entity instanceof VoidgolemtitanEntity) {
            _datEntSetI = (VoidgolemtitanEntity)entity;
            _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationTick, (Object)0);
        }
        if (entity instanceof VoidgolemtitanEntity) {
            _datEntSetI = (VoidgolemtitanEntity)entity;
            _datEntSetI.m_20088_().m_135381_(VoidgolemtitanEntity.DATA_animationID, (Object)0);
        }
        if (!(entity instanceof VoidgolemtitanEntity)) return;
        ((VoidgolemtitanEntity)entity).setAnimation("empty");
    }
}

