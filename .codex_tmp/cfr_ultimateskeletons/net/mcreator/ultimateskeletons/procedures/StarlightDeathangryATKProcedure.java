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
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.StarbladeEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
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

public class StarlightDeathangryATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block790: {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            LivingEntity _entity;
            StarlightDeathEntity _datEntSetI;
            StarlightDeathEntity _datEntI;
            List<Entity> _entfound;
            Vec3 _center;
            Level _level;
            StarlightDeathEntity _datEntI2;
            StarlightDeathEntity _datEntI3;
            block792: {
                block791: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    ServerLevel _level2;
                    Mob _mobEnt;
                    LivingEntity _ent;
                    Mob _mobEnt2;
                    Mob _mobEnt3;
                    StarlightDeathEntity animatable;
                    Mob _mobEnt4;
                    Object _mobEnt5;
                    Mob _mobEnt6;
                    StarlightDeathEntity _datEntI4;
                    block785: {
                        int n19;
                        int n20;
                        int n21;
                        block789: {
                            LivingEntity _livEnt;
                            Level _level3;
                            block788: {
                                int n22;
                                int n23;
                                int n24;
                                int n25;
                                block787: {
                                    block786: {
                                        int n26;
                                        int n27;
                                        int n28;
                                        int n29;
                                        int n30;
                                        int n31;
                                        float f;
                                        LivingEntity livingEntity;
                                        int n32;
                                        block780: {
                                            int n33;
                                            int n34;
                                            int n35;
                                            block784: {
                                                block783: {
                                                    int n36;
                                                    int n37;
                                                    int n38;
                                                    int n39;
                                                    block782: {
                                                        block781: {
                                                            int n40;
                                                            int n41;
                                                            int n42;
                                                            int n43;
                                                            int n44;
                                                            int n45;
                                                            float f2;
                                                            LivingEntity livingEntity2;
                                                            int n46;
                                                            block775: {
                                                                int n47;
                                                                int n48;
                                                                block779: {
                                                                    block778: {
                                                                        int n49;
                                                                        int n50;
                                                                        int n51;
                                                                        block777: {
                                                                            block776: {
                                                                                int n52;
                                                                                int n53;
                                                                                int n54;
                                                                                int n55;
                                                                                int n56;
                                                                                float f3;
                                                                                LivingEntity livingEntity3;
                                                                                int n57;
                                                                                int n58;
                                                                                int n59;
                                                                                int n60;
                                                                                StarlightDeathEntity _datEntSetI2;
                                                                                int n61;
                                                                                LivingEntity _entity2;
                                                                                LivingEntity _entity22;
                                                                                if (entity == null) {
                                                                                    return;
                                                                                }
                                                                                double theta = 0.0;
                                                                                if (entity instanceof LivingEntity) {
                                                                                    ((LivingEntity)entity).f_20919_ = 0;
                                                                                }
                                                                                entity.f_19802_ = 20;
                                                                                ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                                                if (entity instanceof LivingEntity && !(_entity22 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                    _entity22.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                                                                }
                                                                                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                    _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                                                                                }
                                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    StarlightDeathEntity _datEntI5 = (StarlightDeathEntity)entity;
                                                                                    n61 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                                } else {
                                                                                    n61 = 0;
                                                                                }
                                                                                if (n61 == 0) {
                                                                                    if (entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarlightDeathEntity) {
                                                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_SkillCount, (Object)0);
                                                                                    }
                                                                                    if (entity.m_5446_().getString().equals("\u672a\u77e5") && entity instanceof StarlightDeathEntity) {
                                                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)20);
                                                                                    }
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI4 = (StarlightDeathEntity)entity;
                                                                                    n60 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                                                } else {
                                                                                    n60 = 0;
                                                                                }
                                                                                if (n60 <= 0) {
                                                                                    int n62;
                                                                                    int n63;
                                                                                    int n64;
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        StarlightDeathEntity _datEntSetI22 = (StarlightDeathEntity)entity;
                                                                                        _datEntSetI22.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                                                    }
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                                                    }
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        int n65;
                                                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                                        if (entity instanceof StarlightDeathEntity) {
                                                                                            _datEntI3 = (StarlightDeathEntity)entity;
                                                                                            n65 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                                                        } else {
                                                                                            n65 = 0;
                                                                                        }
                                                                                        synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryTick, (Object)(n65 - 1));
                                                                                    }
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        StarlightDeathEntity _datEntI22 = (StarlightDeathEntity)entity;
                                                                                        n64 = (Integer)_datEntI22.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                                                    } else {
                                                                                        n64 = 0;
                                                                                    }
                                                                                    if (n64 < 107) {
                                                                                        int n66;
                                                                                        if (entity instanceof StarlightDeathEntity) {
                                                                                            _datEntI3 = (StarlightDeathEntity)entity;
                                                                                            n66 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                                                        } else {
                                                                                            n66 = 0;
                                                                                        }
                                                                                        if (n66 > 97 && entity instanceof StarlightDeathEntity) {
                                                                                            ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.angrychange");
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                                                        n63 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                                                    } else {
                                                                                        n63 = 0;
                                                                                    }
                                                                                    if (n63 == 93) {
                                                                                        if (world instanceof Level) {
                                                                                            _level = (Level)world;
                                                                                            if (!_level.m_5776_()) {
                                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                                            } else {
                                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                                            }
                                                                                        }
                                                                                        _center = new Vec3(x, y, z);
                                                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                                        for (Entity entityiterator : _entfound) {
                                                                                            if (entityiterator instanceof StarlightDeathEntity) continue;
                                                                                            double _setval = 6.0;
                                                                                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                                capability.camerashake = _setval;
                                                                                                capability.syncPlayerVariables(entityiterator);
                                                                                            });
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                                                        n62 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryTick);
                                                                                    } else {
                                                                                        n62 = 0;
                                                                                    }
                                                                                    if (n62 < 75 && entity instanceof StarlightDeathEntity) {
                                                                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                                                                    }
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI4 = (StarlightDeathEntity)entity;
                                                                                    n59 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                                } else {
                                                                                    n59 = 0;
                                                                                }
                                                                                if (n59 != 0) {
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        int n67;
                                                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                                        SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                                        if (entity instanceof StarlightDeathEntity) {
                                                                                            StarlightDeathEntity _datEntI32 = (StarlightDeathEntity)entity;
                                                                                            n67 = (Integer)_datEntI32.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n67 = 0;
                                                                                        }
                                                                                        synchedEntityData.m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)(n67 + 1));
                                                                                    }
                                                                                    Vec3 _center3 = new Vec3(x, y, z);
                                                                                    List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(1200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                                                    for (Entity entity2 : _entfound2) {
                                                                                        if (entity2 instanceof StarlightskeletonEntity || entity2 instanceof Player) continue;
                                                                                        entity2.f_19802_ = 0;
                                                                                    }
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI4 = (StarlightDeathEntity)entity;
                                                                                    n58 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                                                } else {
                                                                                    n58 = 0;
                                                                                }
                                                                                if (n58 > 0) {
                                                                                    LivingEntity livingEntity4;
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_Tick, (Object)0);
                                                                                    }
                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                        _datEntSetI2 = (StarlightDeathEntity)entity;
                                                                                        _datEntSetI2.m_20088_().m_135381_(StarlightDeathEntity.DATA_angryTick, (Object)125);
                                                                                    }
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt7 = (Mob)entity;
                                                                                        livingEntity4 = _mobEnt7.m_5448_();
                                                                                    } else {
                                                                                        livingEntity4 = null;
                                                                                    }
                                                                                    if (livingEntity4 != null) {
                                                                                        float f4;
                                                                                        LivingEntity livingEntity5;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt62 = (Mob)entity;
                                                                                            v13 = _mobEnt62.m_5448_();
                                                                                        } else {
                                                                                            v13 = livingEntity5 = null;
                                                                                        }
                                                                                        if (livingEntity5 instanceof LivingEntity) {
                                                                                            LivingEntity _livEnt2 = livingEntity5;
                                                                                            f4 = _livEnt2.m_21223_();
                                                                                        } else {
                                                                                            f4 = -1.0f;
                                                                                        }
                                                                                        if (f4 > 0.0f) {
                                                                                            float f5;
                                                                                            LivingEntity livingEntity6;
                                                                                            Mob _mobEnt7;
                                                                                            LivingEntity livingEntity7;
                                                                                            float f6;
                                                                                            LivingEntity livingEntity8;
                                                                                            float f7;
                                                                                            LivingEntity livingEntity9;
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity9 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity9 = null;
                                                                                            }
                                                                                            if (livingEntity9 != null) {
                                                                                                LivingEntity livingEntity10;
                                                                                                if (entity instanceof Mob) {
                                                                                                    Mob _mobEnt42 = (Mob)entity;
                                                                                                    livingEntity10 = _mobEnt42.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity10 = null;
                                                                                                }
                                                                                                f7 = entity.m_20270_(livingEntity10);
                                                                                            } else {
                                                                                                f7 = -1.0f;
                                                                                            }
                                                                                            if (f7 >= 160.0f) {
                                                                                                entity.m_6858_(true);
                                                                                            } else {
                                                                                                entity.m_6858_(false);
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity8 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity8 = null;
                                                                                            }
                                                                                            if (livingEntity8 != null) {
                                                                                                LivingEntity livingEntity11;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt6 = (Mob)entity;
                                                                                                    livingEntity11 = _mobEnt6.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity11 = null;
                                                                                                }
                                                                                                f6 = entity.m_20270_(livingEntity11);
                                                                                            } else {
                                                                                                f6 = -1.0f;
                                                                                            }
                                                                                            if (f6 > 4.0f) {
                                                                                                int n68;
                                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                                    StarlightDeathEntity _datEntI6 = (StarlightDeathEntity)entity;
                                                                                                    n68 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                                                } else {
                                                                                                    n68 = 0;
                                                                                                }
                                                                                                if (n68 == 0) {
                                                                                                    LivingEntity livingEntity12;
                                                                                                    LivingEntity livingEntity13;
                                                                                                    LivingEntity livingEntity14;
                                                                                                    LivingEntity livingEntity15;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt32 = (Mob)entity;
                                                                                                        livingEntity15 = _mobEnt32.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity15 = null;
                                                                                                    }
                                                                                                    double d = livingEntity15.m_20185_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt22 = (Mob)entity;
                                                                                                        livingEntity14 = _mobEnt22.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity14 = null;
                                                                                                    }
                                                                                                    double d2 = livingEntity14.m_20186_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt5 = (Mob)entity;
                                                                                                        livingEntity13 = _mobEnt5.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity13 = null;
                                                                                                    }
                                                                                                    double d3 = d2 + (double)livingEntity13.m_20206_() / 1.5;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt5 = (Mob)entity;
                                                                                                        livingEntity12 = _mobEnt5.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity12 = null;
                                                                                                    }
                                                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity12.m_20189_()));
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity7 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity7 = null;
                                                                                            }
                                                                                            if (livingEntity7.m_20206_() > 8.0f) {
                                                                                                float f8;
                                                                                                LivingEntity livingEntity16;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt6 = (Mob)entity;
                                                                                                    livingEntity16 = _mobEnt6.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity16 = null;
                                                                                                }
                                                                                                if (livingEntity16 != null) {
                                                                                                    LivingEntity livingEntity17;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt9 = (Mob)entity;
                                                                                                        livingEntity17 = _mobEnt9.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity17 = null;
                                                                                                    }
                                                                                                    f8 = entity.m_20270_(livingEntity17);
                                                                                                } else {
                                                                                                    f8 = -1.0f;
                                                                                                }
                                                                                                if (f8 > 50.0f) {
                                                                                                    float f9;
                                                                                                    LivingEntity livingEntity18;
                                                                                                    LivingEntity livingEntity19;
                                                                                                    float f10;
                                                                                                    LivingEntity livingEntity20;
                                                                                                    LivingEntity livingEntity21;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt8 = (Mob)entity;
                                                                                                        livingEntity21 = _mobEnt8.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity21 = null;
                                                                                                    }
                                                                                                    double d = livingEntity21.m_20185_() - entity.m_20185_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt4 = (Mob)entity;
                                                                                                        livingEntity20 = _mobEnt4.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity20 = null;
                                                                                                    }
                                                                                                    if (livingEntity20 != null) {
                                                                                                        LivingEntity livingEntity22;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt5 = (Mob)entity;
                                                                                                            livingEntity22 = _mobEnt5.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity22 = null;
                                                                                                        }
                                                                                                        f10 = entity.m_20270_(livingEntity22);
                                                                                                    } else {
                                                                                                        f10 = -1.0f;
                                                                                                    }
                                                                                                    double d4 = d / (double)f10;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt7 = (Mob)entity;
                                                                                                        livingEntity19 = _mobEnt7.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity19 = null;
                                                                                                    }
                                                                                                    double d5 = livingEntity19.m_20189_() - entity.m_20189_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt4 = (Mob)entity;
                                                                                                        livingEntity18 = _mobEnt4.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity18 = null;
                                                                                                    }
                                                                                                    if (livingEntity18 != null) {
                                                                                                        LivingEntity livingEntity23;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt5 = (Mob)entity;
                                                                                                            livingEntity23 = _mobEnt5.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity23 = null;
                                                                                                        }
                                                                                                        f9 = entity.m_20270_(livingEntity23);
                                                                                                    } else {
                                                                                                        f9 = -1.0f;
                                                                                                    }
                                                                                                    entity.m_20256_(new Vec3(d4, 0.0, d5 / (double)f9));
                                                                                                }
                                                                                            } else {
                                                                                                float f11;
                                                                                                LivingEntity livingEntity24;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt6 = (Mob)entity;
                                                                                                    livingEntity24 = _mobEnt6.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity24 = null;
                                                                                                }
                                                                                                if (livingEntity24 != null) {
                                                                                                    LivingEntity livingEntity25;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt10 = (Mob)entity;
                                                                                                        livingEntity25 = _mobEnt10.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity25 = null;
                                                                                                    }
                                                                                                    f11 = entity.m_20270_(livingEntity25);
                                                                                                } else {
                                                                                                    f11 = -1.0f;
                                                                                                }
                                                                                                if (f11 > 12.0f) {
                                                                                                    float f12;
                                                                                                    LivingEntity livingEntity26;
                                                                                                    LivingEntity livingEntity27;
                                                                                                    float f13;
                                                                                                    LivingEntity livingEntity28;
                                                                                                    LivingEntity livingEntity29;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt7 = (Mob)entity;
                                                                                                        livingEntity29 = _mobEnt7.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity29 = null;
                                                                                                    }
                                                                                                    double d = livingEntity29.m_20185_() - entity.m_20185_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt4 = (Mob)entity;
                                                                                                        livingEntity28 = _mobEnt4.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity28 = null;
                                                                                                    }
                                                                                                    if (livingEntity28 != null) {
                                                                                                        LivingEntity livingEntity30;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt5 = (Mob)entity;
                                                                                                            livingEntity30 = _mobEnt5.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity30 = null;
                                                                                                        }
                                                                                                        f13 = entity.m_20270_(livingEntity30);
                                                                                                    } else {
                                                                                                        f13 = -1.0f;
                                                                                                    }
                                                                                                    double d6 = d / (double)f13;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt7 = (Mob)entity;
                                                                                                        livingEntity27 = _mobEnt7.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity27 = null;
                                                                                                    }
                                                                                                    double d7 = livingEntity27.m_20189_() - entity.m_20189_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt4 = (Mob)entity;
                                                                                                        livingEntity26 = _mobEnt4.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity26 = null;
                                                                                                    }
                                                                                                    if (livingEntity26 != null) {
                                                                                                        LivingEntity livingEntity31;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt5 = (Mob)entity;
                                                                                                            livingEntity31 = _mobEnt5.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity31 = null;
                                                                                                        }
                                                                                                        f12 = entity.m_20270_(livingEntity31);
                                                                                                    } else {
                                                                                                        f12 = -1.0f;
                                                                                                    }
                                                                                                    entity.m_20256_(new Vec3(d6, 0.0, d7 / (double)f12));
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity6 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity6 = null;
                                                                                            }
                                                                                            if (livingEntity6 != null) {
                                                                                                LivingEntity livingEntity32;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt6 = (Mob)entity;
                                                                                                    livingEntity32 = _mobEnt6.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity32 = null;
                                                                                                }
                                                                                                f5 = entity.m_20270_(livingEntity32);
                                                                                            } else {
                                                                                                f5 = -1.0f;
                                                                                            }
                                                                                            if (f5 < 500.0f && !world.m_5776_()) {
                                                                                                float f14;
                                                                                                LivingEntity livingEntity33;
                                                                                                float f15;
                                                                                                LivingEntity livingEntity34;
                                                                                                if (entity instanceof Mob) {
                                                                                                    Mob _mobEnt11 = (Mob)entity;
                                                                                                    livingEntity34 = _mobEnt11.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity34 = null;
                                                                                                }
                                                                                                if (livingEntity34 != null) {
                                                                                                    LivingEntity livingEntity35;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt5 = (Mob)entity;
                                                                                                        livingEntity35 = _mobEnt5.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity35 = null;
                                                                                                    }
                                                                                                    f15 = entity.m_20270_(livingEntity35);
                                                                                                } else {
                                                                                                    f15 = -1.0f;
                                                                                                }
                                                                                                if (f15 < 70.0f) {
                                                                                                    int n69;
                                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                                        StarlightDeathEntity _datEntI7 = (StarlightDeathEntity)entity;
                                                                                                        n69 = (Integer)_datEntI7.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                                                    } else {
                                                                                                        n69 = 0;
                                                                                                    }
                                                                                                    if (n69 == 0) {
                                                                                                        LivingEntity livingEntity36;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt7 = (Mob)entity;
                                                                                                            livingEntity36 = _mobEnt7.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity36 = null;
                                                                                                        }
                                                                                                        if (livingEntity36.m_20206_() > 6.0f) {
                                                                                                            if (entity instanceof StarlightDeathEntity) {
                                                                                                                _datEntSetI = (StarlightDeathEntity)entity;
                                                                                                                _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5));
                                                                                                            }
                                                                                                        } else if (entity instanceof StarlightDeathEntity) {
                                                                                                            _datEntSetI = (StarlightDeathEntity)entity;
                                                                                                            _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof Mob) {
                                                                                                    Mob _mobEnt12 = (Mob)entity;
                                                                                                    livingEntity33 = _mobEnt12.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity33 = null;
                                                                                                }
                                                                                                if (livingEntity33 != null) {
                                                                                                    LivingEntity livingEntity37;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt5 = (Mob)entity;
                                                                                                        livingEntity37 = _mobEnt5.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity37 = null;
                                                                                                    }
                                                                                                    f14 = entity.m_20270_(livingEntity37);
                                                                                                } else {
                                                                                                    f14 = -1.0f;
                                                                                                }
                                                                                                if (f14 >= 70.0f && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                                                                    int n70;
                                                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                                                        StarlightDeathEntity _datEntI5 = (StarlightDeathEntity)entity;
                                                                                                        n70 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                                                    } else {
                                                                                                        n70 = 0;
                                                                                                    }
                                                                                                    if (n70 == 0 && entity instanceof StarlightDeathEntity) {
                                                                                                        StarlightDeathEntity _datEntSetI3 = (StarlightDeathEntity)entity;
                                                                                                        _datEntSetI3.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (!entity.m_20096_()) {
                                                                                            if (entity.m_20186_() > -63.0) {
                                                                                                entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
                                                                                            } else {
                                                                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                                            }
                                                                                        }
                                                                                    } else if (!entity.m_20096_()) {
                                                                                        if (entity.m_20186_() > -63.0) {
                                                                                            entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
                                                                                        } else {
                                                                                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI4 = (StarlightDeathEntity)entity;
                                                                                    n57 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                                                } else {
                                                                                    n57 = 0;
                                                                                }
                                                                                if (n57 != true) break block775;
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    animatable = (StarlightDeathEntity)entity;
                                                                                    animatable.setTexture("alhpa");
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.angryatk1");
                                                                                }
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt3 = (Mob)entity;
                                                                                    livingEntity3 = _mobEnt3.m_5448_();
                                                                                } else {
                                                                                    livingEntity3 = null;
                                                                                }
                                                                                if (livingEntity3 != null) {
                                                                                    LivingEntity livingEntity38;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt2 = (Mob)entity;
                                                                                        livingEntity38 = _mobEnt2.m_5448_();
                                                                                    } else {
                                                                                        livingEntity38 = null;
                                                                                    }
                                                                                    f3 = entity.m_20270_(livingEntity38);
                                                                                } else {
                                                                                    f3 = -1.0f;
                                                                                }
                                                                                if (f3 > 1.0f) {
                                                                                    LivingEntity livingEntity39;
                                                                                    LivingEntity livingEntity40;
                                                                                    LivingEntity livingEntity41;
                                                                                    LivingEntity livingEntity42;
                                                                                    LivingEntity livingEntity43;
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        v74 = mob.m_5448_();
                                                                                    } else {
                                                                                        v74 = _ent = null;
                                                                                    }
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity43 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity43 = null;
                                                                                    }
                                                                                    double d = livingEntity43.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity42 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity42 = null;
                                                                                    }
                                                                                    int n71 = (int)livingEntity42.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity41 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity41 = null;
                                                                                    }
                                                                                    double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n71, (int)livingEntity41.m_20189_());
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity40 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity40 = null;
                                                                                    }
                                                                                    _ent.m_6021_(d, d8, livingEntity40.m_20189_());
                                                                                    if (_ent instanceof ServerPlayer) {
                                                                                        LivingEntity livingEntity44;
                                                                                        LivingEntity livingEntity45;
                                                                                        LivingEntity livingEntity46;
                                                                                        LivingEntity livingEntity47;
                                                                                        ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt6 = (Mob)entity;
                                                                                            livingEntity47 = _mobEnt6.m_5448_();
                                                                                        } else {
                                                                                            livingEntity47 = null;
                                                                                        }
                                                                                        double d9 = livingEntity47.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt13 = (Mob)entity;
                                                                                            livingEntity46 = _mobEnt13.m_5448_();
                                                                                        } else {
                                                                                            livingEntity46 = null;
                                                                                        }
                                                                                        int n72 = (int)livingEntity46.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt5 = (Mob)entity;
                                                                                            livingEntity45 = _mobEnt5.m_5448_();
                                                                                        } else {
                                                                                            livingEntity45 = null;
                                                                                        }
                                                                                        double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n72, (int)livingEntity45.m_20189_());
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt4 = (Mob)entity;
                                                                                            livingEntity44 = _mobEnt4.m_5448_();
                                                                                        } else {
                                                                                            livingEntity44 = null;
                                                                                        }
                                                                                        serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity44.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                                    }
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt = (Mob)entity;
                                                                                        livingEntity39 = _mobEnt.m_5448_();
                                                                                    } else {
                                                                                        livingEntity39 = null;
                                                                                    }
                                                                                    livingEntity39.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                                                    n56 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n56 = 0;
                                                                                }
                                                                                if (n56 == 1) {
                                                                                    float f16;
                                                                                    LivingEntity livingEntity48;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt2 = (Mob)entity;
                                                                                        livingEntity48 = _mobEnt2.m_5448_();
                                                                                    } else {
                                                                                        livingEntity48 = null;
                                                                                    }
                                                                                    if (livingEntity48 != null) {
                                                                                        LivingEntity livingEntity49;
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt = (Mob)entity;
                                                                                            livingEntity49 = _mobEnt.m_5448_();
                                                                                        } else {
                                                                                            livingEntity49 = null;
                                                                                        }
                                                                                        f16 = entity.m_20270_(livingEntity49);
                                                                                    } else {
                                                                                        f16 = -1.0f;
                                                                                    }
                                                                                    if (f16 > 1.0f) {
                                                                                        LivingEntity livingEntity50;
                                                                                        LivingEntity livingEntity51;
                                                                                        LivingEntity livingEntity52;
                                                                                        LivingEntity livingEntity53;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            livingEntity53 = mob.m_5448_();
                                                                                        } else {
                                                                                            livingEntity53 = null;
                                                                                        }
                                                                                        double d = livingEntity53.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt6 = (Mob)entity;
                                                                                            livingEntity52 = _mobEnt6.m_5448_();
                                                                                        } else {
                                                                                            livingEntity52 = null;
                                                                                        }
                                                                                        double d11 = livingEntity52.m_20186_();
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            livingEntity51 = mob.m_5448_();
                                                                                        } else {
                                                                                            livingEntity51 = null;
                                                                                        }
                                                                                        double d12 = d11 + (double)livingEntity51.m_20206_() / 1.5;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            livingEntity50 = mob.m_5448_();
                                                                                        } else {
                                                                                            livingEntity50 = null;
                                                                                        }
                                                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d12, livingEntity50.m_20189_()));
                                                                                    }
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                                                    n55 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n55 = 0;
                                                                                }
                                                                                if (n55 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                                    _level = (ServerLevel)world;
                                                                                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                                }
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                                                    n54 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n54 = 0;
                                                                                }
                                                                                if (n54 == 8) break block776;
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI3 = (StarlightDeathEntity)entity;
                                                                                    n53 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n53 = 0;
                                                                                }
                                                                                if (n53 == 20) break block776;
                                                                                if (entity instanceof StarlightDeathEntity) {
                                                                                    _datEntI = (StarlightDeathEntity)entity;
                                                                                    n52 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n52 = 0;
                                                                                }
                                                                                if (n52 != 31) break block777;
                                                                            }
                                                                            if (world instanceof Level) {
                                                                                Level level = (Level)world;
                                                                                if (!level.m_5776_()) {
                                                                                    level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                                                } else {
                                                                                    level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (entity instanceof StarlightDeathEntity) {
                                                                            _datEntI2 = (StarlightDeathEntity)entity;
                                                                            n51 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                        } else {
                                                                            n51 = 0;
                                                                        }
                                                                        if (n51 == 10) break block778;
                                                                        if (entity instanceof StarlightDeathEntity) {
                                                                            _datEntI3 = (StarlightDeathEntity)entity;
                                                                            n50 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                        } else {
                                                                            n50 = 0;
                                                                        }
                                                                        if (n50 == 22) break block778;
                                                                        if (entity instanceof StarlightDeathEntity) {
                                                                            _datEntI = (StarlightDeathEntity)entity;
                                                                            n49 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                        } else {
                                                                            n49 = 0;
                                                                        }
                                                                        if (n49 != 32) break block779;
                                                                    }
                                                                    if (world instanceof Level) {
                                                                        Level level = (Level)world;
                                                                        if (!level.m_5776_()) {
                                                                            level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                        } else {
                                                                            level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    Vec3 vec3 = new Vec3(x, y, z);
                                                                    List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(vec3, vec3).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                                                                    for (Entity entityiterator : _entfound3) {
                                                                        float f17;
                                                                        if (entityiterator instanceof StarlightDeathEntity) continue;
                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                        if (entityiterator instanceof LivingEntity) {
                                                                            LivingEntity _livEnt3 = (LivingEntity)entityiterator;
                                                                            f17 = _livEnt3.m_21233_();
                                                                        } else {
                                                                            f17 = -1.0f;
                                                                        }
                                                                        entityiterator.m_6469_(damageSource, f17 / 4.0f + 4000000.0f);
                                                                        if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                                            entityiterator.f_19802_ = 0;
                                                                            Deathlist.normalattack(entityiterator);
                                                                        }
                                                                        if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                                                        for (int index0 = 0; index0 < 2; ++index0) {
                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                                        }
                                                                    }
                                                                }
                                                                if (entity instanceof StarlightDeathEntity) {
                                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                                    n48 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                } else {
                                                                    n48 = 0;
                                                                }
                                                                if (n48 == 45 && entity instanceof StarlightDeathEntity) {
                                                                    int n73;
                                                                    _datEntSetI = (StarlightDeathEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                        _datEntI = (StarlightDeathEntity)entity;
                                                                        n73 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                                    } else {
                                                                        n73 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n73 - 1));
                                                                }
                                                                if (entity instanceof StarlightDeathEntity) {
                                                                    _datEntI2 = (StarlightDeathEntity)entity;
                                                                    n47 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                                } else {
                                                                    n47 = 0;
                                                                }
                                                                if (n47 >= 45) {
                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                        _datEntSetI = (StarlightDeathEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                        _datEntSetI = (StarlightDeathEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarlightDeathEntity) {
                                                                        ((StarlightDeathEntity)entity).setAnimation("empty");
                                                                    }
                                                                }
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI4 = (StarlightDeathEntity)entity;
                                                                n46 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                                            } else {
                                                                n46 = 0;
                                                            }
                                                            if (n46 != 2) break block780;
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.angryatk2");
                                                            }
                                                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity2 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity2 = null;
                                                            }
                                                            if (livingEntity2 != null) {
                                                                LivingEntity livingEntity54;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity54 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity54 = null;
                                                                }
                                                                f2 = entity.m_20270_(livingEntity54);
                                                            } else {
                                                                f2 = -1.0f;
                                                            }
                                                            if (f2 > 1.0f) {
                                                                LivingEntity livingEntity55;
                                                                LivingEntity livingEntity56;
                                                                LivingEntity livingEntity57;
                                                                LivingEntity livingEntity58;
                                                                LivingEntity livingEntity59;
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    v119 = mob.m_5448_();
                                                                } else {
                                                                    v119 = _ent = null;
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity59 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity59 = null;
                                                                }
                                                                double d = livingEntity59.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity58 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity58 = null;
                                                                }
                                                                int n74 = (int)livingEntity58.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity57 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity57 = null;
                                                                }
                                                                double d13 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n74, (int)livingEntity57.m_20189_());
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity56 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity56 = null;
                                                                }
                                                                _ent.m_6021_(d, d13, livingEntity56.m_20189_());
                                                                if (_ent instanceof ServerPlayer) {
                                                                    LivingEntity livingEntity60;
                                                                    LivingEntity livingEntity61;
                                                                    LivingEntity livingEntity62;
                                                                    LivingEntity livingEntity63;
                                                                    ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt6 = (Mob)entity;
                                                                        livingEntity63 = _mobEnt6.m_5448_();
                                                                    } else {
                                                                        livingEntity63 = null;
                                                                    }
                                                                    double d14 = livingEntity63.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt14 = (Mob)entity;
                                                                        livingEntity62 = _mobEnt14.m_5448_();
                                                                    } else {
                                                                        livingEntity62 = null;
                                                                    }
                                                                    int n75 = (int)livingEntity62.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt5 = (Mob)entity;
                                                                        livingEntity61 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        livingEntity61 = null;
                                                                    }
                                                                    double d15 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n75, (int)livingEntity61.m_20189_());
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt4 = (Mob)entity;
                                                                        livingEntity60 = _mobEnt4.m_5448_();
                                                                    } else {
                                                                        livingEntity60 = null;
                                                                    }
                                                                    serverGamePacketListenerImpl.m_9774_(d14, d15, livingEntity60.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity55 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity55 = null;
                                                                }
                                                                livingEntity55.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                                n45 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                            } else {
                                                                n45 = 0;
                                                            }
                                                            if (n45 == 1) {
                                                                float f18;
                                                                LivingEntity livingEntity64;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity64 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity64 = null;
                                                                }
                                                                if (livingEntity64 != null) {
                                                                    LivingEntity livingEntity65;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt = (Mob)entity;
                                                                        livingEntity65 = _mobEnt.m_5448_();
                                                                    } else {
                                                                        livingEntity65 = null;
                                                                    }
                                                                    f18 = entity.m_20270_(livingEntity65);
                                                                } else {
                                                                    f18 = -1.0f;
                                                                }
                                                                if (f18 > 1.0f) {
                                                                    LivingEntity livingEntity66;
                                                                    LivingEntity livingEntity67;
                                                                    LivingEntity livingEntity68;
                                                                    LivingEntity livingEntity69;
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity69 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity69 = null;
                                                                    }
                                                                    double d = livingEntity69.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt6 = (Mob)entity;
                                                                        livingEntity68 = _mobEnt6.m_5448_();
                                                                    } else {
                                                                        livingEntity68 = null;
                                                                    }
                                                                    double d16 = livingEntity68.m_20186_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity67 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity67 = null;
                                                                    }
                                                                    double d17 = d16 + (double)livingEntity67.m_20206_() / 1.5;
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity66 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity66 = null;
                                                                    }
                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity66.m_20189_()));
                                                                }
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                                n44 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                            } else {
                                                                n44 = 0;
                                                            }
                                                            if (n44 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                _level = (ServerLevel)world;
                                                                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                            }
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                                n43 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                            } else {
                                                                n43 = 0;
                                                            }
                                                            if (n43 == 6) break block781;
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI3 = (StarlightDeathEntity)entity;
                                                                n42 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                            } else {
                                                                n42 = 0;
                                                            }
                                                            if (n42 == 12) break block781;
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                _datEntI = (StarlightDeathEntity)entity;
                                                                n41 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                            } else {
                                                                n41 = 0;
                                                            }
                                                            if (n41 == 21) break block781;
                                                            if (entity instanceof StarlightDeathEntity) {
                                                                StarlightDeathEntity starlightDeathEntity = (StarlightDeathEntity)entity;
                                                                n40 = (Integer)starlightDeathEntity.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                            } else {
                                                                n40 = 0;
                                                            }
                                                            if (n40 != 38) break block782;
                                                        }
                                                        if (world instanceof Level) {
                                                            Level _level32 = (Level)world;
                                                            if (!_level32.m_5776_()) {
                                                                _level32.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                            } else {
                                                                _level32.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI2 = (StarlightDeathEntity)entity;
                                                        n39 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n39 = 0;
                                                    }
                                                    if (n39 == 8) break block783;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI3 = (StarlightDeathEntity)entity;
                                                        n38 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n38 = 0;
                                                    }
                                                    if (n38 == 14) break block783;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        _datEntI = (StarlightDeathEntity)entity;
                                                        n37 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n37 = 0;
                                                    }
                                                    if (n37 == 23) break block783;
                                                    if (entity instanceof StarlightDeathEntity) {
                                                        StarlightDeathEntity starlightDeathEntity = (StarlightDeathEntity)entity;
                                                        n36 = (Integer)starlightDeathEntity.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                                    } else {
                                                        n36 = 0;
                                                    }
                                                    if (n36 != 40) break block784;
                                                }
                                                if (world instanceof Level) {
                                                    _level3 = (Level)world;
                                                    if (!_level3.m_5776_()) {
                                                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                    } else {
                                                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                    }
                                                }
                                                Vec3 _center2 = new Vec3(x, y, z);
                                                List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                for (Entity entityiterator : _entfound4) {
                                                    float f19;
                                                    if (entityiterator instanceof StarlightDeathEntity) continue;
                                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                    if (entityiterator instanceof LivingEntity) {
                                                        _livEnt = (LivingEntity)entityiterator;
                                                        f19 = _livEnt.m_21233_();
                                                    } else {
                                                        f19 = -1.0f;
                                                    }
                                                    entityiterator.m_6469_(damageSource, f19 / 4.0f + 1.0E7f);
                                                    if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                        entityiterator.f_19802_ = 0;
                                                        Deathlist.normalattack(entityiterator);
                                                    }
                                                    if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                                    for (int index1 = 0; index1 < 2; ++index1) {
                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                    }
                                                }
                                            }
                                            if (entity instanceof StarlightDeathEntity) {
                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                n35 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                            } else {
                                                n35 = 0;
                                            }
                                            if (n35 == 40) {
                                                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                                }
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
                                                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.1, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ZHANHUGE.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.1, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 1.0, 0.0);
                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.2, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                                                for (int index2 = 0; index2 < 64; ++index2) {
                                                    if (world instanceof ServerLevel) {
                                                        _level2 = (ServerLevel)world;
                                                        LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level2);
                                                        lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                                        lightningBolt.m_20874_(true);
                                                        _level2.m_7967_((Entity)lightningBolt);
                                                    }
                                                    if (!(world instanceof ServerLevel)) continue;
                                                    _level2 = (ServerLevel)world;
                                                    Entity entity3 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level2, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-160, (int)160)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-160, (int)160))), MobSpawnType.MOB_SUMMONED);
                                                    if (entity3 == null) continue;
                                                    entity3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                }
                                                _center = new Vec3(x, y, z);
                                                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                for (Entity entityiterator : _entfound) {
                                                    float f20;
                                                    if (entityiterator instanceof StarlightDeathEntity) continue;
                                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                    if (entityiterator instanceof LivingEntity) {
                                                        LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                                                        f20 = _livEnt4.m_21223_();
                                                    } else {
                                                        f20 = -1.0f;
                                                    }
                                                    entityiterator.m_6469_(damageSource, f20 * 4.0f + 4.0E7f);
                                                    double _setval = 16.0;
                                                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                        capability.camerashake = _setval;
                                                        capability.syncPlayerVariables(entityiterator);
                                                    });
                                                    if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity || entityiterator instanceof Titangodentity) continue;
                                                    Deathlist.normalattack(entityiterator);
                                                }
                                                if (entity instanceof Mob) {
                                                    _entity = (Mob)entity;
                                                    _entity.m_6710_(null);
                                                }
                                            }
                                            if (entity instanceof StarlightDeathEntity) {
                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                n34 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                            } else {
                                                n34 = 0;
                                            }
                                            if (n34 == 55 && entity instanceof StarlightDeathEntity) {
                                                int n76;
                                                _datEntSetI = (StarlightDeathEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntI = (StarlightDeathEntity)entity;
                                                    n76 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                                                } else {
                                                    n76 = 0;
                                                }
                                                synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n76 - 1));
                                            }
                                            if (entity instanceof StarlightDeathEntity) {
                                                _datEntI2 = (StarlightDeathEntity)entity;
                                                n33 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                            } else {
                                                n33 = 0;
                                            }
                                            if (n33 >= 55) {
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntSetI = (StarlightDeathEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    _datEntSetI = (StarlightDeathEntity)entity;
                                                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                                                }
                                                if (entity instanceof StarlightDeathEntity) {
                                                    ((StarlightDeathEntity)entity).setAnimation("empty");
                                                }
                                            }
                                        }
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI4 = (StarlightDeathEntity)entity;
                                            n32 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                                        } else {
                                            n32 = 0;
                                        }
                                        if (n32 != 3) break block785;
                                        if (entity instanceof StarlightDeathEntity) {
                                            ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.angryatk3");
                                        }
                                        if (entity instanceof StarlightDeathEntity) {
                                            animatable = (StarlightDeathEntity)entity;
                                            animatable.setTexture("xing_hui_ku_lou_");
                                        }
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity = null;
                                        }
                                        if (livingEntity != null) {
                                            LivingEntity livingEntity70;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity70 = _mobEnt2.m_5448_();
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
                                            LivingEntity livingEntity75;
                                            if (entity instanceof Mob) {
                                                Mob mob = (Mob)entity;
                                                v169 = mob.m_5448_();
                                            } else {
                                                v169 = _ent = null;
                                            }
                                            if (entity instanceof Mob) {
                                                Mob mob = (Mob)entity;
                                                livingEntity75 = mob.m_5448_();
                                            } else {
                                                livingEntity75 = null;
                                            }
                                            double d = livingEntity75.m_20185_();
                                            if (entity instanceof Mob) {
                                                Mob mob = (Mob)entity;
                                                livingEntity74 = mob.m_5448_();
                                            } else {
                                                livingEntity74 = null;
                                            }
                                            int n77 = (int)livingEntity74.m_20185_();
                                            if (entity instanceof Mob) {
                                                Mob mob = (Mob)entity;
                                                livingEntity73 = mob.m_5448_();
                                            } else {
                                                livingEntity73 = null;
                                            }
                                            double d18 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n77, (int)livingEntity73.m_20189_());
                                            if (entity instanceof Mob) {
                                                Mob mob = (Mob)entity;
                                                livingEntity72 = mob.m_5448_();
                                            } else {
                                                livingEntity72 = null;
                                            }
                                            _ent.m_6021_(d, d18, livingEntity72.m_20189_());
                                            if (_ent instanceof ServerPlayer) {
                                                LivingEntity livingEntity76;
                                                LivingEntity livingEntity77;
                                                LivingEntity livingEntity78;
                                                LivingEntity livingEntity79;
                                                ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity79 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity79 = null;
                                                }
                                                double d19 = livingEntity79.m_20185_();
                                                if (entity instanceof Mob) {
                                                    Mob _mobEnt15 = (Mob)entity;
                                                    livingEntity78 = _mobEnt15.m_5448_();
                                                } else {
                                                    livingEntity78 = null;
                                                }
                                                int n78 = (int)livingEntity78.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt5 = (Mob)entity;
                                                    livingEntity77 = _mobEnt5.m_5448_();
                                                } else {
                                                    livingEntity77 = null;
                                                }
                                                double d20 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n78, (int)livingEntity77.m_20189_());
                                                if (entity instanceof Mob) {
                                                    _mobEnt4 = (Mob)entity;
                                                    livingEntity76 = _mobEnt4.m_5448_();
                                                } else {
                                                    livingEntity76 = null;
                                                }
                                                serverGamePacketListenerImpl.m_9774_(d19, d20, livingEntity76.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                            }
                                            if (entity instanceof Mob) {
                                                _mobEnt = (Mob)entity;
                                                livingEntity71 = _mobEnt.m_5448_();
                                            } else {
                                                livingEntity71 = null;
                                            }
                                            livingEntity71.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                        }
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI2 = (StarlightDeathEntity)entity;
                                            n31 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n31 = 0;
                                        }
                                        if (n31 == 1) {
                                            float f21;
                                            LivingEntity livingEntity80;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity80 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity80 = null;
                                            }
                                            if (livingEntity80 != null) {
                                                LivingEntity livingEntity81;
                                                if (entity instanceof Mob) {
                                                    _mobEnt = (Mob)entity;
                                                    livingEntity81 = _mobEnt.m_5448_();
                                                } else {
                                                    livingEntity81 = null;
                                                }
                                                f21 = entity.m_20270_(livingEntity81);
                                            } else {
                                                f21 = -1.0f;
                                            }
                                            if (f21 > 1.0f) {
                                                LivingEntity livingEntity82;
                                                LivingEntity livingEntity83;
                                                LivingEntity livingEntity84;
                                                LivingEntity livingEntity85;
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity85 = mob.m_5448_();
                                                } else {
                                                    livingEntity85 = null;
                                                }
                                                double d = livingEntity85.m_20185_();
                                                if (entity instanceof Mob) {
                                                    _mobEnt6 = (Mob)entity;
                                                    livingEntity84 = _mobEnt6.m_5448_();
                                                } else {
                                                    livingEntity84 = null;
                                                }
                                                double d21 = livingEntity84.m_20186_();
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity83 = mob.m_5448_();
                                                } else {
                                                    livingEntity83 = null;
                                                }
                                                double d22 = d21 + (double)livingEntity83.m_20206_() / 1.5;
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity82 = mob.m_5448_();
                                                } else {
                                                    livingEntity82 = null;
                                                }
                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity82.m_20189_()));
                                            }
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angryroar")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angryroar")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                                                }
                                            }
                                            if (world instanceof Level) {
                                                _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                }
                                            }
                                            for (int index3 = 0; index3 < 400; ++index3) {
                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 30.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)1.0, (double)8.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0));
                                            }
                                            _center = new Vec3(x, y, z);
                                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                            for (Entity entityiterator : _entfound) {
                                                double _setval = 4.0;
                                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                    capability.camerashake = _setval;
                                                    capability.syncPlayerVariables(entityiterator);
                                                });
                                            }
                                        }
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI2 = (StarlightDeathEntity)entity;
                                            n30 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n30 = 0;
                                        }
                                        if (n30 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                            _level = (ServerLevel)world;
                                            _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                        }
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI2 = (StarlightDeathEntity)entity;
                                            n29 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n29 = 0;
                                        }
                                        if (n29 == 18) break block786;
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI3 = (StarlightDeathEntity)entity;
                                            n28 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n28 = 0;
                                        }
                                        if (n28 == 28) break block786;
                                        if (entity instanceof StarlightDeathEntity) {
                                            _datEntI = (StarlightDeathEntity)entity;
                                            n27 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n27 = 0;
                                        }
                                        if (n27 == 38) break block786;
                                        if (entity instanceof StarlightDeathEntity) {
                                            StarlightDeathEntity starlightDeathEntity = (StarlightDeathEntity)entity;
                                            n26 = (Integer)starlightDeathEntity.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                        } else {
                                            n26 = 0;
                                        }
                                        if (n26 != 48) break block787;
                                    }
                                    if (world instanceof Level) {
                                        _level3 = (Level)world;
                                        if (!_level3.m_5776_()) {
                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                        } else {
                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                        }
                                    }
                                }
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI2 = (StarlightDeathEntity)entity;
                                    n25 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n25 = 0;
                                }
                                if (n25 == 20) break block788;
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI3 = (StarlightDeathEntity)entity;
                                    n24 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n24 = 0;
                                }
                                if (n24 == 30) break block788;
                                if (entity instanceof StarlightDeathEntity) {
                                    _datEntI = (StarlightDeathEntity)entity;
                                    n23 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n23 = 0;
                                }
                                if (n23 == 40) break block788;
                                if (entity instanceof StarlightDeathEntity) {
                                    StarlightDeathEntity starlightDeathEntity = (StarlightDeathEntity)entity;
                                    n22 = (Integer)starlightDeathEntity.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                                } else {
                                    n22 = 0;
                                }
                                if (n22 != 50) break block789;
                            }
                            if (world instanceof Level) {
                                _level3 = (Level)world;
                                if (!_level3.m_5776_()) {
                                    _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                } else {
                                    _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                }
                            }
                            Vec3 _center2 = new Vec3(x, y, z);
                            List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                            for (Entity entityiterator : _entfound5) {
                                float f;
                                if (entityiterator instanceof StarlightDeathEntity) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator;
                                    f = _livEnt.m_21233_();
                                } else {
                                    f = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource, f / 4.0f + 1.0E7f);
                                if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                    entityiterator.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator);
                                }
                                if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                for (int index4 = 0; index4 < 2; ++index4) {
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                }
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n21 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n21 = 0;
                        }
                        if (n21 == 60) {
                            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                            }
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
                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.1, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ZHANHUGE.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.1, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 1.0, 0.0);
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.2, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                            for (int index5 = 0; index5 < 32; ++index5) {
                                if (world instanceof ServerLevel) {
                                    _level2 = (ServerLevel)world;
                                    LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level2);
                                    lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                    lightningBolt.m_20874_(true);
                                    _level2.m_7967_((Entity)lightningBolt);
                                }
                                if (!(world instanceof ServerLevel)) continue;
                                _level2 = (ServerLevel)world;
                                Entity entity4 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level2, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-160, (int)160)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-160, (int)160))), MobSpawnType.MOB_SUMMONED);
                                if (entity4 == null) continue;
                                entity4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                            _center = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entityiterator : _entfound) {
                                float f;
                                if (entityiterator instanceof StarlightDeathEntity) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                                    f = _livEnt.m_21223_();
                                } else {
                                    f = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource, f * 4.0f + 2.0E7f);
                                double _setval = 16.0;
                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entityiterator);
                                });
                                if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity) || entityiterator instanceof OriginallightningEntity || entityiterator instanceof Titangodentity) continue;
                                Deathlist.normalattack(entityiterator);
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n20 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n20 = 0;
                        }
                        if (n20 == 75 && entity instanceof StarlightDeathEntity) {
                            int n79;
                            _datEntSetI = (StarlightDeathEntity)entity;
                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI = (StarlightDeathEntity)entity;
                                n79 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                            } else {
                                n79 = 0;
                            }
                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n79 - 2));
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n19 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n19 = 0;
                        }
                        if (n19 >= 75) {
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntSetI = (StarlightDeathEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntSetI = (StarlightDeathEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                ((StarlightDeathEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI4 = (StarlightDeathEntity)entity;
                        n18 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                    } else {
                        n18 = 0;
                    }
                    if (n18 == 4) {
                        int n80;
                        int n81;
                        int n82;
                        int n83;
                        int n84;
                        int n85;
                        int n86;
                        int n87;
                        float f;
                        LivingEntity livingEntity;
                        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                        if (entity instanceof StarlightDeathEntity) {
                            ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.angryatk4");
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            animatable = (StarlightDeathEntity)entity;
                            animatable.setTexture("alhpa");
                        }
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity = _mobEnt3.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity86;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity86 = _mobEnt2.m_5448_();
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
                            LivingEntity livingEntity91;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                v219 = mob.m_5448_();
                            } else {
                                v219 = _ent = null;
                            }
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity91 = mob.m_5448_();
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
                            int n88 = (int)livingEntity90.m_20185_();
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity89 = mob.m_5448_();
                            } else {
                                livingEntity89 = null;
                            }
                            double d23 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n88, (int)livingEntity89.m_20189_());
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity88 = mob.m_5448_();
                            } else {
                                livingEntity88 = null;
                            }
                            _ent.m_6021_(d, d23, livingEntity88.m_20189_());
                            if (_ent instanceof ServerPlayer) {
                                LivingEntity livingEntity92;
                                LivingEntity livingEntity93;
                                LivingEntity livingEntity94;
                                LivingEntity livingEntity95;
                                ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity95 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity95 = null;
                                }
                                double d24 = livingEntity95.m_20185_();
                                if (entity instanceof Mob) {
                                    Mob _mobEnt16 = (Mob)entity;
                                    livingEntity94 = _mobEnt16.m_5448_();
                                } else {
                                    livingEntity94 = null;
                                }
                                int n89 = (int)livingEntity94.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt5 = (Mob)entity;
                                    livingEntity93 = _mobEnt5.m_5448_();
                                } else {
                                    livingEntity93 = null;
                                }
                                double d25 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n89, (int)livingEntity93.m_20189_());
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity92 = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity92 = null;
                                }
                                serverGamePacketListenerImpl.m_9774_(d24, d25, livingEntity92.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                            }
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity87 = _mobEnt.m_5448_();
                            } else {
                                livingEntity87 = null;
                            }
                            livingEntity87.m_20256_(new Vec3(0.0, 0.0, 0.0));
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n87 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n87 = 0;
                        }
                        if (n87 == 1) {
                            float f22;
                            LivingEntity livingEntity96;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity96 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity96 = null;
                            }
                            if (livingEntity96 != null) {
                                LivingEntity livingEntity97;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity97 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity97 = null;
                                }
                                f22 = entity.m_20270_(livingEntity97);
                            } else {
                                f22 = -1.0f;
                            }
                            if (f22 > 1.0f) {
                                LivingEntity livingEntity98;
                                LivingEntity livingEntity99;
                                LivingEntity livingEntity100;
                                LivingEntity livingEntity101;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity101 = mob.m_5448_();
                                } else {
                                    livingEntity101 = null;
                                }
                                double d = livingEntity101.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity100 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity100 = null;
                                }
                                double d26 = livingEntity100.m_20186_();
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity99 = mob.m_5448_();
                                } else {
                                    livingEntity99 = null;
                                }
                                double d27 = d26 + (double)livingEntity99.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity98 = mob.m_5448_();
                                } else {
                                    livingEntity98 = null;
                                }
                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d27, livingEntity98.m_20189_()));
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n86 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n86 = 0;
                        }
                        if (n86 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n85 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n85 = 0;
                        }
                        if (n85 == 4 && world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n84 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n84 = 0;
                        }
                        if (n84 == 6) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:chain")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:chain")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entityiterator : _entfound) {
                                float f23;
                                if (entityiterator instanceof StarlightskeletonEntity) continue;
                                if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                    entityiterator.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator);
                                }
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                                    f23 = _livEnt.m_21233_();
                                } else {
                                    f23 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource, (float)((double)(f23 / 4.0f) + 0.5));
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n83 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n83 = 0;
                        }
                        if (n83 >= 17) {
                            int n90;
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI3 = (StarlightDeathEntity)entity;
                                n90 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                            } else {
                                n90 = 0;
                            }
                            if (n90 <= 25 && world instanceof ServerLevel) {
                                ServerLevel _level22 = (ServerLevel)world;
                                Entity entity5 = ((EntityType)UltimateskeletonsModEntities.BALL.get()).m_262496_(_level22, BlockPos.m_274561_((double)x, (double)(y + 30.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                if (entity5 != null) {
                                    entity5.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                }
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n82 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n82 = 0;
                        }
                        if (n82 == 17) {
                            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                            }
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n81 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n81 = 0;
                        }
                        if (n81 == 37 && entity instanceof StarlightDeathEntity) {
                            int n91;
                            _datEntSetI = (StarlightDeathEntity)entity;
                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI = (StarlightDeathEntity)entity;
                                n91 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                            } else {
                                n91 = 0;
                            }
                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n91 - 2));
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n80 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n80 = 0;
                        }
                        if (n80 >= 37) {
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntSetI = (StarlightDeathEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntSetI = (StarlightDeathEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                ((StarlightDeathEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI4 = (StarlightDeathEntity)entity;
                        n17 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                    } else {
                        n17 = 0;
                    }
                    if (n17 == 5) {
                        int n92;
                        int n93;
                        int n94;
                        int n95;
                        int n96;
                        int n97;
                        int n98;
                        if (entity instanceof StarlightDeathEntity) {
                            ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.angryatk5");
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n98 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n98 = 0;
                        }
                        if (n98 == 1) {
                            float f;
                            LivingEntity livingEntity;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity = _mobEnt2.m_5448_();
                            } else {
                                livingEntity = null;
                            }
                            if (livingEntity != null) {
                                LivingEntity livingEntity102;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity102 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity102 = null;
                                }
                                f = entity.m_20270_(livingEntity102);
                            } else {
                                f = -1.0f;
                            }
                            if (f > 1.0f) {
                                LivingEntity livingEntity103;
                                LivingEntity livingEntity104;
                                LivingEntity livingEntity105;
                                LivingEntity livingEntity106;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity106 = mob.m_5448_();
                                } else {
                                    livingEntity106 = null;
                                }
                                double d = livingEntity106.m_20185_();
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity105 = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity105 = null;
                                }
                                double d28 = livingEntity105.m_20186_();
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity104 = mob.m_5448_();
                                } else {
                                    livingEntity104 = null;
                                }
                                double d29 = d28 + (double)livingEntity104.m_20206_() / 1.5;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity103 = mob.m_5448_();
                                } else {
                                    livingEntity103 = null;
                                }
                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d29, livingEntity103.m_20189_()));
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n97 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n97 = 0;
                        }
                        if (n97 == 8) {
                            float f;
                            LivingEntity livingEntity;
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity = _mobEnt2.m_5448_();
                            } else {
                                livingEntity = null;
                            }
                            if (livingEntity != null) {
                                LivingEntity livingEntity107;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity107 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity107 = null;
                                }
                                f = entity.m_20270_(livingEntity107);
                            } else {
                                f = -1.0f;
                            }
                            if (f > 1.0f) {
                                LivingEntity livingEntity108;
                                LivingEntity livingEntity109;
                                LivingEntity livingEntity110;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity110 = mob.m_5448_();
                                } else {
                                    livingEntity110 = null;
                                }
                                double d = (livingEntity110.m_20185_() - entity.m_20185_()) * 1.1;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity109 = mob.m_5448_();
                                } else {
                                    livingEntity109 = null;
                                }
                                double d30 = (livingEntity109.m_20186_() - entity.m_20186_()) * 1.1;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity108 = mob.m_5448_();
                                } else {
                                    livingEntity108 = null;
                                }
                                entity.m_20256_(new Vec3(d, d30, (livingEntity108.m_20189_() - entity.m_20189_()) * 1.1));
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n96 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n96 = 0;
                        }
                        if (n96 <= 14) {
                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n95 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n95 = 0;
                        }
                        if (n95 == 11) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entityiterator : _entfound) {
                                float f;
                                if (entityiterator instanceof StarlightDeathEntity) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                                    f = _livEnt.m_21233_();
                                } else {
                                    f = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource, (float)((double)(f / 4.0f) + 0.1));
                                if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                    entityiterator.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator);
                                }
                                if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                for (int index6 = 0; index6 < 2; ++index6) {
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                }
                                if (entityiterator instanceof Titangodentity) continue;
                                entityiterator.m_20242_(true);
                                entityiterator.m_20256_(new Vec3(0.0, 4.0, 0.0));
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n94 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n94 = 0;
                        }
                        if (n94 == 35) {
                            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                            }
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
                            world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                            for (int index7 = 0; index7 < 32; ++index7) {
                                if (world instanceof ServerLevel) {
                                    _level2 = (ServerLevel)world;
                                    LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level2);
                                    lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                    lightningBolt.m_20874_(true);
                                    _level2.m_7967_((Entity)lightningBolt);
                                }
                                if (!(world instanceof ServerLevel)) continue;
                                _level2 = (ServerLevel)world;
                                Entity entity6 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level2, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                if (entity6 == null) continue;
                                entity6.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                            _center = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entityiterator : _entfound) {
                                float f;
                                if (entityiterator instanceof StarlightDeathEntity) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                                    f = _livEnt.m_21233_();
                                } else {
                                    f = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource, f / 4.0f + 1.0E7f);
                                double _setval = 10.0;
                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entityiterator);
                                });
                                if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                    entityiterator.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator);
                                }
                                if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                                entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                            }
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n93 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n93 = 0;
                        }
                        if (n93 == 50 && entity instanceof StarlightDeathEntity) {
                            int n99;
                            _datEntSetI = (StarlightDeathEntity)entity;
                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntI = (StarlightDeathEntity)entity;
                                n99 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                            } else {
                                n99 = 0;
                            }
                            synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n99 - 1));
                        }
                        if (entity instanceof StarlightDeathEntity) {
                            _datEntI2 = (StarlightDeathEntity)entity;
                            n92 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                        } else {
                            n92 = 0;
                        }
                        if (n92 >= 50) {
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntSetI = (StarlightDeathEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                _datEntSetI = (StarlightDeathEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof StarlightDeathEntity) {
                                ((StarlightDeathEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI4 = (StarlightDeathEntity)entity;
                        n16 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationID);
                    } else {
                        n16 = 0;
                    }
                    if (n16 != 6) break block790;
                    if (entity instanceof StarlightDeathEntity) {
                        ((StarlightDeathEntity)entity).setAnimation("animation.starlightskeleton.angryatk6");
                    }
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI2 = (StarlightDeathEntity)entity;
                        n15 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n15 = 0;
                    }
                    if (n15 == 1) {
                        float f;
                        LivingEntity livingEntity;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity = _mobEnt2.m_5448_();
                        } else {
                            livingEntity = null;
                        }
                        if (livingEntity != null) {
                            LivingEntity livingEntity111;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity111 = _mobEnt.m_5448_();
                            } else {
                                livingEntity111 = null;
                            }
                            f = entity.m_20270_(livingEntity111);
                        } else {
                            f = -1.0f;
                        }
                        if (f > 1.0f) {
                            LivingEntity livingEntity112;
                            LivingEntity livingEntity113;
                            LivingEntity livingEntity114;
                            LivingEntity livingEntity115;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity115 = mob.m_5448_();
                            } else {
                                livingEntity115 = null;
                            }
                            double d = livingEntity115.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt6 = (Mob)entity;
                                livingEntity114 = _mobEnt6.m_5448_();
                            } else {
                                livingEntity114 = null;
                            }
                            double d31 = livingEntity114.m_20186_();
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity113 = mob.m_5448_();
                            } else {
                                livingEntity113 = null;
                            }
                            double d32 = d31 + (double)livingEntity113.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity112 = mob.m_5448_();
                            } else {
                                livingEntity112 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d32, livingEntity112.m_20189_()));
                        }
                    }
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI2 = (StarlightDeathEntity)entity;
                        n14 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n14 = 0;
                    }
                    if (n14 == 5) break block791;
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI3 = (StarlightDeathEntity)entity;
                        n13 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n13 = 0;
                    }
                    if (n13 == 12) break block791;
                    if (entity instanceof StarlightDeathEntity) {
                        _datEntI = (StarlightDeathEntity)entity;
                        n12 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n12 = 0;
                    }
                    if (n12 == 17) break block791;
                    if (entity instanceof StarlightDeathEntity) {
                        StarlightDeathEntity starlightDeathEntity = (StarlightDeathEntity)entity;
                        n11 = (Integer)starlightDeathEntity.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n11 = 0;
                    }
                    if (n11 == 20) break block791;
                    if (entity instanceof StarlightDeathEntity) {
                        StarlightDeathEntity _datEntI8 = (StarlightDeathEntity)entity;
                        n10 = (Integer)_datEntI8.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 23) break block791;
                    if (entity instanceof StarlightDeathEntity) {
                        StarlightDeathEntity _datEntI9 = (StarlightDeathEntity)entity;
                        n9 = (Integer)_datEntI9.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 25) break block791;
                    if (entity instanceof StarlightDeathEntity) {
                        StarlightDeathEntity _datEntI10 = (StarlightDeathEntity)entity;
                        n8 = (Integer)_datEntI10.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 != 27) break block792;
                }
                if (world instanceof Level) {
                    Level _level5 = (Level)world;
                    if (!_level5.m_5776_()) {
                        _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                    } else {
                        _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                    }
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n7 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n7 = 0;
            }
            if (n7 > 5) {
                int n100;
                if (entity instanceof StarlightDeathEntity) {
                    _datEntI3 = (StarlightDeathEntity)entity;
                    n100 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
                } else {
                    n100 = 0;
                }
                if (n100 < 30) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 1.0, z, 0.0, 8.0, 0.0);
                    Vec3 _center5 = new Vec3(x, y + 80.0, z);
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                    for (Entity entityiterator : list) {
                        float f;
                        if (entityiterator instanceof StarlightDeathEntity) continue;
                        if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                            entityiterator.f_19802_ = 0;
                            Deathlist.normalattack(entityiterator);
                        }
                        if (entityiterator instanceof Player) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268566_));
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)entityiterator;
                            f = _livEnt.m_21233_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f / 20.0f);
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 56.0f);
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 56.0f);
                    }
                    Vec3 _center3 = new Vec3(x, y, z);
                    List<Entity> list2 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                    for (Entity entityiterator : list2) {
                        if (!(entityiterator.m_20205_() * entityiterator.m_20206_() < 32.0f) || !(entityiterator instanceof LivingEntity)) continue;
                        double _setval = 2.0;
                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                            capability.camerashake = _setval;
                            capability.syncPlayerVariables(entityiterator);
                        });
                        if (entityiterator instanceof Player || entityiterator instanceof StarlightDeathEntity) continue;
                        entityiterator.m_20256_(new Vec3((entity.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8) - entityiterator.m_20185_()) / 4.0, (entity.m_20186_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)80, (int)160) - entityiterator.m_20186_()) / 4.0, (entity.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8) - entityiterator.m_20189_()) / 4.0));
                    }
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n6 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n6 = 0;
            }
            if (n6 == 31 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angryroar")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angryroar")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n5 = 0;
            }
            if (n5 == 38 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n4 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n4 = 0;
            }
            if (n4 == 54 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n3 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n3 = 0;
            }
            if (n3 == 55) {
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index8 = 0; index8 < 80; ++index8) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile projectile = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            StarbladeEntity entityToSpawn = new StarbladeEntity((EntityType<? extends StarbladeEntity>)((EntityType)UltimateskeletonsModEntities.STARBLADE.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36767_(piercing);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 1500.0f, 1, (byte)10);
                    projectile.m_6034_(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-120, (int)120), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)160, (int)200), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-120, (int)120));
                    projectile.m_6686_(0.0, -1.0, 0.0, 12.0f, 20.0f);
                    projectileLevel.m_7967_((Entity)projectile);
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    if (entityiterator instanceof StarlightDeathEntity) continue;
                    if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f / 4.0f + 1000.0f);
                    double _setval = 12.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                }
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 == 70 && entity instanceof StarlightDeathEntity) {
                int n101;
                _datEntSetI = (StarlightDeathEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarlightDeathEntity) {
                    _datEntI = (StarlightDeathEntity)entity;
                    n101 = (Integer)_datEntI.m_20088_().m_135370_(StarlightDeathEntity.DATA_angryCount);
                } else {
                    n101 = 0;
                }
                synchedEntityData.m_135381_(StarlightDeathEntity.DATA_angryCount, (Object)(n101 - 1));
            }
            if (entity instanceof StarlightDeathEntity) {
                _datEntI2 = (StarlightDeathEntity)entity;
                n = (Integer)_datEntI2.m_20088_().m_135370_(StarlightDeathEntity.DATA_animationTick);
            } else {
                n = 0;
            }
            if (n >= 70) {
                if (entity instanceof StarlightDeathEntity) {
                    _datEntSetI = (StarlightDeathEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarlightDeathEntity) {
                    _datEntSetI = (StarlightDeathEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarlightDeathEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarlightDeathEntity) {
                    ((StarlightDeathEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

