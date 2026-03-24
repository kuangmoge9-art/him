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
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
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
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
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
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class StarSpiritUltimateATKProcedure {
    /*
     * WARNING - void declaration
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block853: {
            int n;
            int n2;
            int n3;
            LivingEntity _livEnt;
            StarSpiritEntity _datEntI;
            block859: {
                LivingEntity _entity;
                LivingEntity _livEnt2;
                block858: {
                    int n4;
                    int n5;
                    int n6;
                    block857: {
                        block856: {
                            int n7;
                            int n8;
                            int n9;
                            int n10;
                            int n11;
                            int n12;
                            StarSpiritEntity _datEntI2;
                            block855: {
                                block854: {
                                    int n13;
                                    int n14;
                                    int n15;
                                    int n16;
                                    int n17;
                                    int n18;
                                    int n19;
                                    float f;
                                    LivingEntity livingEntity;
                                    int n20;
                                    Mob _mobEnt;
                                    Object _mobEnt2;
                                    Mob _mobEnt3;
                                    Mob _mobEnt4;
                                    StarSpiritEntity _datEntI3;
                                    block846: {
                                        int n21;
                                        int n22;
                                        block852: {
                                            LivingEntity _entity2;
                                            block851: {
                                                int n23;
                                                int n24;
                                                block850: {
                                                    block849: {
                                                        int n25;
                                                        int n26;
                                                        int n27;
                                                        int n28;
                                                        int n29;
                                                        block848: {
                                                            block847: {
                                                                int n30;
                                                                int n31;
                                                                int n32;
                                                                int n33;
                                                                int n34;
                                                                int n35;
                                                                int n36;
                                                                float f2;
                                                                LivingEntity livingEntity2;
                                                                int n37;
                                                                int n38;
                                                                List<Entity> _entfound;
                                                                Mob _mobEnt5;
                                                                LivingEntity _ent;
                                                                block841: {
                                                                    int n39;
                                                                    int n40;
                                                                    int n41;
                                                                    Level _level;
                                                                    PathfinderMob _datEntI4;
                                                                    block845: {
                                                                        Vec3 _center;
                                                                        block844: {
                                                                            int n42;
                                                                            int n43;
                                                                            block843: {
                                                                                block842: {
                                                                                    int n44;
                                                                                    int n45;
                                                                                    int n46;
                                                                                    int n47;
                                                                                    float f3;
                                                                                    LivingEntity livingEntity3;
                                                                                    int n48;
                                                                                    block838: {
                                                                                        int n49;
                                                                                        int n50;
                                                                                        int n51;
                                                                                        int n52;
                                                                                        int n53;
                                                                                        block840: {
                                                                                            void var14_157;
                                                                                            block839: {
                                                                                                int n54;
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
                                                                                                StarSpiritEntity _datEntSetI;
                                                                                                int n65;
                                                                                                LivingEntity _entity3;
                                                                                                LivingEntity _entity32;
                                                                                                if (entity == null) {
                                                                                                    return;
                                                                                                }
                                                                                                double theta = 0.0;
                                                                                                ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                                                                if (entity instanceof LivingEntity && !(_entity32 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                    _entity32.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                                                                                }
                                                                                                if (entity instanceof LivingEntity && !(_entity3 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                    _entity3.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                                                                                                }
                                                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.5, (double)0.5) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                                                                if (entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarSpiritEntity) {
                                                                                                    StarSpiritEntity _datEntSetI2 = (StarSpiritEntity)entity;
                                                                                                    _datEntSetI2.m_20088_().m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)40);
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    StarSpiritEntity _datEntI32 = (StarSpiritEntity)entity;
                                                                                                    n65 = (Integer)_datEntI32.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                                                                                } else {
                                                                                                    n65 = 0;
                                                                                                }
                                                                                                if (n65 <= 0 && !entity.m_5446_().getString().equals("\u65ed\u8861")) {
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        StarSpiritEntity _datEntSetL = (StarSpiritEntity)entity;
                                                                                                        _datEntSetL.m_20088_().m_135381_(StarSpiritEntity.DATA_God, (Object)false);
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntSetI = (StarSpiritEntity)entity;
                                                                                                        _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntSetI = (StarSpiritEntity)entity;
                                                                                                        _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        int n66;
                                                                                                        _datEntSetI = (StarSpiritEntity)entity;
                                                                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                                            StarSpiritEntity _datEntI5 = (StarSpiritEntity)entity;
                                                                                                            n66 = (Integer)_datEntI5.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
                                                                                                        } else {
                                                                                                            n66 = 0;
                                                                                                        }
                                                                                                        synchedEntityData.m_135381_(StarSpiritEntity.DATA_GodTick, (Object)(n66 - 1));
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                                                    n64 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
                                                                                                } else {
                                                                                                    n64 = 0;
                                                                                                }
                                                                                                if (n64 < 113) {
                                                                                                    ((StarSpiritEntity)entity).setHEALTS(3000000.0);
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntSetI = (StarSpiritEntity)entity;
                                                                                                        _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_GodTick, (Object)0);
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                                                    n63 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
                                                                                                } else {
                                                                                                    n63 = 0;
                                                                                                }
                                                                                                if (n63 <= 214) {
                                                                                                    int n67;
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                                        n67 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
                                                                                                    } else {
                                                                                                        n67 = 0;
                                                                                                    }
                                                                                                    if (n67 >= 200 && entity instanceof StarSpiritEntity) {
                                                                                                        ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.sword");
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                                                    n62 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_GodTick);
                                                                                                } else {
                                                                                                    n62 = 0;
                                                                                                }
                                                                                                if (n62 == 184) {
                                                                                                    if (world instanceof Level) {
                                                                                                        Level _level3 = (Level)world;
                                                                                                        if (!_level3.m_5776_()) {
                                                                                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                                                        } else {
                                                                                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                                                        }
                                                                                                    }
                                                                                                    Vec3 _center2 = new Vec3(x, y, z);
                                                                                                    List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                                                    for (Entity entity2 : _entfound2) {
                                                                                                        if (entity2 instanceof StarSpiritEntity) continue;
                                                                                                        double _setval = 8.0;
                                                                                                        entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                                            capability.camerashake = _setval;
                                                                                                            capability.syncPlayerVariables(entity2);
                                                                                                        });
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                                                    n61 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                                } else {
                                                                                                    n61 = 0;
                                                                                                }
                                                                                                if (n61 != 0 && entity instanceof StarSpiritEntity) {
                                                                                                    int n68;
                                                                                                    _datEntSetI = (StarSpiritEntity)entity;
                                                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        StarSpiritEntity _datEntI5 = (StarSpiritEntity)entity;
                                                                                                        n68 = (Integer)_datEntI5.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                    } else {
                                                                                                        n68 = 0;
                                                                                                    }
                                                                                                    synchedEntityData.m_135381_(StarSpiritEntity.DATA_animationTick, (Object)(n68 + 1));
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                                                    n60 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                                                                                } else {
                                                                                                    n60 = 0;
                                                                                                }
                                                                                                if (n60 > 0) {
                                                                                                    LivingEntity livingEntity4;
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntSetI = (StarSpiritEntity)entity;
                                                                                                        _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_GodTick, (Object)234);
                                                                                                    }
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt42 = (Mob)entity;
                                                                                                        livingEntity4 = _mobEnt42.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity4 = null;
                                                                                                    }
                                                                                                    if (livingEntity4 != null) {
                                                                                                        float f4;
                                                                                                        LivingEntity livingEntity5;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob _mobEnt7 = (Mob)entity;
                                                                                                            v12 = _mobEnt7.m_5448_();
                                                                                                        } else {
                                                                                                            v12 = livingEntity5 = null;
                                                                                                        }
                                                                                                        if (livingEntity5 instanceof LivingEntity) {
                                                                                                            LivingEntity _livEnt3 = livingEntity5;
                                                                                                            f4 = _livEnt3.m_21223_();
                                                                                                        } else {
                                                                                                            f4 = -1.0f;
                                                                                                        }
                                                                                                        if (f4 > 0.0f) {
                                                                                                            float f5;
                                                                                                            LivingEntity livingEntity6;
                                                                                                            int n69;
                                                                                                            float f6;
                                                                                                            LivingEntity livingEntity7;
                                                                                                            float f7;
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
                                                                                                                    Mob _mobEnt8 = (Mob)entity;
                                                                                                                    livingEntity9 = _mobEnt8.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity9 = null;
                                                                                                                }
                                                                                                                f7 = entity.m_20270_(livingEntity9);
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
                                                                                                                livingEntity7 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity7 = null;
                                                                                                            }
                                                                                                            if (livingEntity7 != null) {
                                                                                                                LivingEntity livingEntity10;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    Mob _mobEnt9 = (Mob)entity;
                                                                                                                    livingEntity10 = _mobEnt9.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity10 = null;
                                                                                                                }
                                                                                                                f6 = entity.m_20270_(livingEntity10);
                                                                                                            } else {
                                                                                                                f6 = -1.0f;
                                                                                                            }
                                                                                                            if (f6 > 4.0f) {
                                                                                                                int n70;
                                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                                    StarSpiritEntity _datEntI22 = (StarSpiritEntity)entity;
                                                                                                                    n70 = (Integer)_datEntI22.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                                                } else {
                                                                                                                    n70 = 0;
                                                                                                                }
                                                                                                                if (n70 == 0) {
                                                                                                                    LivingEntity livingEntity11;
                                                                                                                    LivingEntity livingEntity12;
                                                                                                                    LivingEntity livingEntity13;
                                                                                                                    LivingEntity livingEntity14;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        Mob _mobEnt32 = (Mob)entity;
                                                                                                                        livingEntity14 = _mobEnt32.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity14 = null;
                                                                                                                    }
                                                                                                                    double d = livingEntity14.m_20185_();
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        Mob _mobEnt22 = (Mob)entity;
                                                                                                                        livingEntity13 = _mobEnt22.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity13 = null;
                                                                                                                    }
                                                                                                                    double d2 = livingEntity13.m_20186_();
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt4 = (Mob)entity;
                                                                                                                        livingEntity12 = _mobEnt4.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity12 = null;
                                                                                                                    }
                                                                                                                    double d3 = d2 + (double)livingEntity12.m_20206_() / 1.5;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt4 = (Mob)entity;
                                                                                                                        livingEntity11 = _mobEnt4.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity11 = null;
                                                                                                                    }
                                                                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity11.m_20189_()));
                                                                                                                }
                                                                                                            }
                                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                                StarSpiritEntity starSpiritEntity = (StarSpiritEntity)entity;
                                                                                                                n69 = (Integer)starSpiritEntity.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                                            } else {
                                                                                                                n69 = 0;
                                                                                                            }
                                                                                                            if (n69 == 0) {
                                                                                                                LivingEntity livingEntity15;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    Mob _mobEnt10 = (Mob)entity;
                                                                                                                    livingEntity15 = _mobEnt10.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity15 = null;
                                                                                                                }
                                                                                                                if (livingEntity15.m_20206_() > 8.0f) {
                                                                                                                    float f8;
                                                                                                                    LivingEntity livingEntity16;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                                        livingEntity16 = _mobEnt3.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity16 = null;
                                                                                                                    }
                                                                                                                    if (livingEntity16 != null) {
                                                                                                                        LivingEntity livingEntity17;
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt4 = (Mob)entity;
                                                                                                                            livingEntity17 = _mobEnt4.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity17 = null;
                                                                                                                        }
                                                                                                                        f8 = entity.m_20270_(livingEntity17);
                                                                                                                    } else {
                                                                                                                        f8 = -1.0f;
                                                                                                                    }
                                                                                                                    if (f8 > 48.0f) {
                                                                                                                        float f9;
                                                                                                                        LivingEntity livingEntity18;
                                                                                                                        LivingEntity livingEntity19;
                                                                                                                        float f10;
                                                                                                                        LivingEntity livingEntity20;
                                                                                                                        LivingEntity livingEntity21;
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity21 = _mobEnt.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity21 = null;
                                                                                                                        }
                                                                                                                        double d = livingEntity21.m_20185_() - entity.m_20185_();
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity20 = _mobEnt.m_5448_();
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
                                                                                                                            f10 = entity.m_20270_(livingEntity22);
                                                                                                                        } else {
                                                                                                                            f10 = -1.0f;
                                                                                                                        }
                                                                                                                        double d4 = d / (double)f10;
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity19 = _mobEnt.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity19 = null;
                                                                                                                        }
                                                                                                                        double d5 = livingEntity19.m_20189_() - entity.m_20189_();
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity18 = _mobEnt.m_5448_();
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
                                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                                        livingEntity24 = _mobEnt3.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity24 = null;
                                                                                                                    }
                                                                                                                    if (livingEntity24 != null) {
                                                                                                                        LivingEntity livingEntity25;
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt4 = (Mob)entity;
                                                                                                                            livingEntity25 = _mobEnt4.m_5448_();
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
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity29 = _mobEnt.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity29 = null;
                                                                                                                        }
                                                                                                                        double d = livingEntity29.m_20185_() - entity.m_20185_();
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity28 = _mobEnt.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity28 = null;
                                                                                                                        }
                                                                                                                        if (livingEntity28 != null) {
                                                                                                                            LivingEntity livingEntity30;
                                                                                                                            if (entity instanceof Mob) {
                                                                                                                                _mobEnt2 = (Mob)entity;
                                                                                                                                livingEntity30 = _mobEnt2.m_5448_();
                                                                                                                            } else {
                                                                                                                                livingEntity30 = null;
                                                                                                                            }
                                                                                                                            f13 = entity.m_20270_(livingEntity30);
                                                                                                                        } else {
                                                                                                                            f13 = -1.0f;
                                                                                                                        }
                                                                                                                        double d6 = d / (double)f13;
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity27 = _mobEnt.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity27 = null;
                                                                                                                        }
                                                                                                                        double d7 = livingEntity27.m_20189_() - entity.m_20189_();
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt = (Mob)entity;
                                                                                                                            livingEntity26 = _mobEnt.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity26 = null;
                                                                                                                        }
                                                                                                                        if (livingEntity26 != null) {
                                                                                                                            LivingEntity livingEntity31;
                                                                                                                            if (entity instanceof Mob) {
                                                                                                                                _mobEnt2 = (Mob)entity;
                                                                                                                                livingEntity31 = _mobEnt2.m_5448_();
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
                                                                                                                    Mob _mobEnt11 = (Mob)entity;
                                                                                                                    livingEntity32 = _mobEnt11.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity32 = null;
                                                                                                                }
                                                                                                                f5 = entity.m_20270_(livingEntity32);
                                                                                                            } else {
                                                                                                                f5 = -1.0f;
                                                                                                            }
                                                                                                            if (f5 < 500.0f) {
                                                                                                                float f14;
                                                                                                                LivingEntity livingEntity33;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                                    livingEntity33 = _mobEnt3.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity33 = null;
                                                                                                                }
                                                                                                                if (livingEntity33 != null) {
                                                                                                                    LivingEntity livingEntity34;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt4 = (Mob)entity;
                                                                                                                        livingEntity34 = _mobEnt4.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity34 = null;
                                                                                                                    }
                                                                                                                    f14 = entity.m_20270_(livingEntity34);
                                                                                                                } else {
                                                                                                                    f14 = -1.0f;
                                                                                                                }
                                                                                                                if (f14 < 70.0f) {
                                                                                                                    int n71;
                                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                                        StarSpiritEntity _datEntI7 = (StarSpiritEntity)entity;
                                                                                                                        n71 = (Integer)_datEntI7.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                                                    } else {
                                                                                                                        n71 = 0;
                                                                                                                    }
                                                                                                                    if (n71 == 0 && entity instanceof StarSpiritEntity) {
                                                                                                                        StarSpiritEntity _datEntSetI3 = (StarSpiritEntity)entity;
                                                                                                                        _datEntSetI3.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6));
                                                                                                                    }
                                                                                                                }
                                                                                                                if (!world.m_5776_() && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                                                                                    float f15;
                                                                                                                    LivingEntity livingEntity35;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                                        livingEntity35 = _mobEnt3.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity35 = null;
                                                                                                                    }
                                                                                                                    if (livingEntity35 != null) {
                                                                                                                        LivingEntity livingEntity36;
                                                                                                                        if (entity instanceof Mob) {
                                                                                                                            _mobEnt4 = (Mob)entity;
                                                                                                                            livingEntity36 = _mobEnt4.m_5448_();
                                                                                                                        } else {
                                                                                                                            livingEntity36 = null;
                                                                                                                        }
                                                                                                                        f15 = entity.m_20270_(livingEntity36);
                                                                                                                    } else {
                                                                                                                        f15 = -1.0f;
                                                                                                                    }
                                                                                                                    if (f15 >= 70.0f) {
                                                                                                                        int n72;
                                                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                                                            StarSpiritEntity _datEntI6 = (StarSpiritEntity)entity;
                                                                                                                            n72 = (Integer)_datEntI6.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                                                        } else {
                                                                                                                            n72 = 0;
                                                                                                                        }
                                                                                                                        if (n72 == 0 && entity instanceof StarSpiritEntity) {
                                                                                                                            StarSpiritEntity _datEntSetI2 = (StarSpiritEntity)entity;
                                                                                                                            _datEntSetI2.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
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
                                                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                                                    n59 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                                } else {
                                                                                                    n59 = 0;
                                                                                                }
                                                                                                if (n59 == 1) {
                                                                                                    int n73;
                                                                                                    int n74;
                                                                                                    int n75;
                                                                                                    int n76;
                                                                                                    int n77;
                                                                                                    float f16;
                                                                                                    Mob _mobEnt6;
                                                                                                    LivingEntity livingEntity37;
                                                                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                                            ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.rush2");
                                                                                                        }
                                                                                                    } else if (entity instanceof StarSpiritEntity) {
                                                                                                        ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.backflip2");
                                                                                                    }
                                                                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt = (Mob)entity;
                                                                                                        livingEntity37 = _mobEnt.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity37 = null;
                                                                                                    }
                                                                                                    if (livingEntity37 != null) {
                                                                                                        LivingEntity livingEntity38;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt6 = (Mob)entity;
                                                                                                            livingEntity38 = _mobEnt6.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity38 = null;
                                                                                                        }
                                                                                                        f16 = entity.m_20270_(livingEntity38);
                                                                                                    } else {
                                                                                                        f16 = -1.0f;
                                                                                                    }
                                                                                                    if (f16 > 1.0f) {
                                                                                                        LivingEntity livingEntity39;
                                                                                                        LivingEntity livingEntity40;
                                                                                                        LivingEntity livingEntity41;
                                                                                                        LivingEntity livingEntity42;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            v73 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            v73 = _ent = null;
                                                                                                        }
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity42 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity42 = null;
                                                                                                        }
                                                                                                        double d = livingEntity42.m_20185_();
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity41 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity41 = null;
                                                                                                        }
                                                                                                        int n78 = (int)livingEntity41.m_20185_();
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity40 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity40 = null;
                                                                                                        }
                                                                                                        double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n78, (int)livingEntity40.m_20189_());
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity39 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity39 = null;
                                                                                                        }
                                                                                                        _ent.m_6021_(d, d8, livingEntity39.m_20189_());
                                                                                                        if (_ent instanceof ServerPlayer) {
                                                                                                            LivingEntity livingEntity43;
                                                                                                            LivingEntity livingEntity44;
                                                                                                            LivingEntity livingEntity45;
                                                                                                            LivingEntity livingEntity46;
                                                                                                            ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob _mobEnt12 = (Mob)entity;
                                                                                                                livingEntity46 = _mobEnt12.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity46 = null;
                                                                                                            }
                                                                                                            double d9 = livingEntity46.m_20185_();
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt3 = (Mob)entity;
                                                                                                                livingEntity45 = _mobEnt3.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity45 = null;
                                                                                                            }
                                                                                                            int n79 = (int)livingEntity45.m_20185_();
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt4 = (Mob)entity;
                                                                                                                livingEntity44 = _mobEnt4.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity44 = null;
                                                                                                            }
                                                                                                            double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n79, (int)livingEntity44.m_20189_());
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt2 = (Mob)entity;
                                                                                                                livingEntity43 = _mobEnt2.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity43 = null;
                                                                                                            }
                                                                                                            serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity43.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                                                        }
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                                        n77 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                    } else {
                                                                                                        n77 = 0;
                                                                                                    }
                                                                                                    if (n77 == 1) {
                                                                                                        float f17;
                                                                                                        LivingEntity livingEntity47;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt6 = (Mob)entity;
                                                                                                            livingEntity47 = _mobEnt6.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity47 = null;
                                                                                                        }
                                                                                                        if (livingEntity47 != null) {
                                                                                                            LivingEntity livingEntity48;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                                livingEntity48 = _mobEnt5.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity48 = null;
                                                                                                            }
                                                                                                            f17 = entity.m_20270_(livingEntity48);
                                                                                                        } else {
                                                                                                            f17 = -1.0f;
                                                                                                        }
                                                                                                        if ((double)f17 > 0.1) {
                                                                                                            LivingEntity livingEntity49;
                                                                                                            LivingEntity livingEntity50;
                                                                                                            LivingEntity livingEntity51;
                                                                                                            LivingEntity livingEntity52;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity52 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity52 = null;
                                                                                                            }
                                                                                                            double d = livingEntity52.m_20185_();
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob _mobEnt13 = (Mob)entity;
                                                                                                                livingEntity51 = _mobEnt13.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity51 = null;
                                                                                                            }
                                                                                                            double d11 = livingEntity51.m_20186_();
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity50 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity50 = null;
                                                                                                            }
                                                                                                            double d12 = d11 + (double)livingEntity50.m_20206_() / 1.5;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity49 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity49 = null;
                                                                                                            }
                                                                                                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d12, livingEntity49.m_20189_()));
                                                                                                        }
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                                        n76 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                    } else {
                                                                                                        n76 = 0;
                                                                                                    }
                                                                                                    if (n76 == 24) {
                                                                                                        float f18;
                                                                                                        LivingEntity livingEntity53;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt6 = (Mob)entity;
                                                                                                            livingEntity53 = _mobEnt6.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity53 = null;
                                                                                                        }
                                                                                                        if (livingEntity53 != null) {
                                                                                                            LivingEntity livingEntity54;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                                livingEntity54 = _mobEnt5.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity54 = null;
                                                                                                            }
                                                                                                            f18 = entity.m_20270_(livingEntity54);
                                                                                                        } else {
                                                                                                            f18 = -1.0f;
                                                                                                        }
                                                                                                        if (f18 > 1.0f) {
                                                                                                            LivingEntity livingEntity55;
                                                                                                            LivingEntity livingEntity56;
                                                                                                            LivingEntity livingEntity57;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity57 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity57 = null;
                                                                                                            }
                                                                                                            double d = (livingEntity57.m_20185_() - entity.m_20185_()) * 2.0;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity56 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity56 = null;
                                                                                                            }
                                                                                                            double d13 = (livingEntity56.m_20186_() - entity.m_20186_()) * 2.0;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity55 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity55 = null;
                                                                                                            }
                                                                                                            entity.m_20256_(new Vec3(d, d13, (livingEntity55.m_20189_() - entity.m_20189_()) * 2.0));
                                                                                                        }
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                                        n75 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                    } else {
                                                                                                        n75 = 0;
                                                                                                    }
                                                                                                    if (n75 == 26) {
                                                                                                        Level _level2;
                                                                                                        if (world instanceof Level) {
                                                                                                            Level _level4 = (Level)world;
                                                                                                            if (!_level4.m_5776_()) {
                                                                                                                _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                                            } else {
                                                                                                                _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                                            }
                                                                                                        }
                                                                                                        if (world instanceof Level) {
                                                                                                            _level2 = (Level)world;
                                                                                                            if (!_level2.m_5776_()) {
                                                                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                                            } else {
                                                                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                                            }
                                                                                                        }
                                                                                                        Vec3 _center3 = new Vec3(x, y, z);
                                                                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                                                                        for (Entity entityiterator : _entfound) {
                                                                                                            if (!(entityiterator instanceof StarSpiritEntity)) {
                                                                                                                float f19;
                                                                                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                                                                if (entityiterator instanceof LivingEntity) {
                                                                                                                    _livEnt = (LivingEntity)entityiterator;
                                                                                                                    f19 = _livEnt.m_21233_();
                                                                                                                } else {
                                                                                                                    f19 = -1.0f;
                                                                                                                }
                                                                                                                entityiterator.m_6469_(damageSource, f19 / 4.0f + 1000000.0f);
                                                                                                            }
                                                                                                            if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                                                                                            entityiterator.f_19802_ = 0;
                                                                                                            Deathlist.normalattack(entityiterator);
                                                                                                        }
                                                                                                        if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                                                            _level2 = (ServerLevel)world;
                                                                                                            _level2.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level2, 4, "", (Component)Component.m_237113_((String)""), _level2.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                                                        }
                                                                                                        for (int index0 = 0; index0 < 200; ++index0) {
                                                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                                                                                                        }
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                                        n74 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                    } else {
                                                                                                        n74 = 0;
                                                                                                    }
                                                                                                    if (n74 == 45 && entity instanceof StarSpiritEntity) {
                                                                                                        int n80;
                                                                                                        StarSpiritEntity _datEntSetI4 = (StarSpiritEntity)entity;
                                                                                                        SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
                                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                                            _datEntI4 = (StarSpiritEntity)entity;
                                                                                                            n80 = (Integer)_datEntI4.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                                                                                        } else {
                                                                                                            n80 = 0;
                                                                                                        }
                                                                                                        synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n80 - 1));
                                                                                                    }
                                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                                        n73 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                    } else {
                                                                                                        n73 = 0;
                                                                                                    }
                                                                                                    if (n73 >= 45) {
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
                                                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                                                    n58 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                                } else {
                                                                                                    n58 = 0;
                                                                                                }
                                                                                                if (n58 != 3) break block838;
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.doublelaser");
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    _datEntI = (StarSpiritEntity)entity;
                                                                                                    n57 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n57 = 0;
                                                                                                }
                                                                                                if (n57 == 1) {
                                                                                                    float f20;
                                                                                                    LivingEntity livingEntity58;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt14 = (Mob)entity;
                                                                                                        livingEntity58 = _mobEnt14.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity58 = null;
                                                                                                    }
                                                                                                    if (livingEntity58 != null) {
                                                                                                        LivingEntity livingEntity59;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob _mobEnt52 = (Mob)entity;
                                                                                                            livingEntity59 = _mobEnt52.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity59 = null;
                                                                                                        }
                                                                                                        f20 = entity.m_20270_(livingEntity59);
                                                                                                    } else {
                                                                                                        f20 = -1.0f;
                                                                                                    }
                                                                                                    if (f20 > 1.0f) {
                                                                                                        LivingEntity livingEntity60;
                                                                                                        LivingEntity livingEntity61;
                                                                                                        LivingEntity livingEntity62;
                                                                                                        LivingEntity livingEntity63;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity63 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity63 = null;
                                                                                                        }
                                                                                                        double d = livingEntity63.m_20185_();
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob _mobEnt15 = (Mob)entity;
                                                                                                            livingEntity62 = _mobEnt15.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity62 = null;
                                                                                                        }
                                                                                                        double d14 = livingEntity62.m_20186_();
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity61 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity61 = null;
                                                                                                        }
                                                                                                        double d15 = d14 + (double)livingEntity61.m_20206_() / 1.5;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity60 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity60 = null;
                                                                                                        }
                                                                                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d15, livingEntity60.m_20189_()));
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    _datEntI = (StarSpiritEntity)entity;
                                                                                                    n56 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n56 = 0;
                                                                                                }
                                                                                                if (n56 == 10) break block839;
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    StarSpiritEntity _datEntI8 = (StarSpiritEntity)entity;
                                                                                                    n55 = (Integer)_datEntI8.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n55 = 0;
                                                                                                }
                                                                                                if (n55 == 27) break block839;
                                                                                                if (entity instanceof StarSpiritEntity) {
                                                                                                    StarSpiritEntity _datEntI42 = (StarSpiritEntity)entity;
                                                                                                    n54 = (Integer)_datEntI42.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n54 = 0;
                                                                                                }
                                                                                                if (n54 != 47) break block840;
                                                                                            }
                                                                                            if (world instanceof Level) {
                                                                                                Level level = (Level)world;
                                                                                                if (!level.m_5776_()) {
                                                                                                    level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                                } else {
                                                                                                    level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                                }
                                                                                            }
                                                                                            if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                                                ServerLevel serverLevel = (ServerLevel)world;
                                                                                                serverLevel.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, serverLevel, 4, "", (Component)Component.m_237113_((String)""), serverLevel.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                                            }
                                                                                            boolean bl = false;
                                                                                            while (var14_157 < 400) {
                                                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 30.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                                                                                                ++var14_157;
                                                                                            }
                                                                                        }
                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                            _datEntI = (StarSpiritEntity)entity;
                                                                                            n53 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n53 = 0;
                                                                                        }
                                                                                        if (n53 >= 10) {
                                                                                            int n81;
                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                StarSpiritEntity _datEntI9 = (StarSpiritEntity)entity;
                                                                                                n81 = (Integer)_datEntI9.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                            } else {
                                                                                                n81 = 0;
                                                                                            }
                                                                                            if (n81 <= 21) {
                                                                                                _center = new Vec3(x, y, z);
                                                                                                List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                                                for (Entity entityiterator : list) {
                                                                                                    if (entityiterator instanceof StarSpiritEntity) continue;
                                                                                                    if (!(entityiterator instanceof Player)) {
                                                                                                        float f21;
                                                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                                                                        if (entityiterator instanceof LivingEntity) {
                                                                                                            LivingEntity _livEnt22 = (LivingEntity)entityiterator;
                                                                                                            f21 = _livEnt22.m_21233_();
                                                                                                        } else {
                                                                                                            f21 = -1.0f;
                                                                                                        }
                                                                                                        entityiterator.m_6469_(damageSource, f21 / 4.0f + 600000.0f);
                                                                                                        entityiterator.f_19802_ = 0;
                                                                                                    }
                                                                                                    if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                                                                                    entityiterator.f_19802_ = 0;
                                                                                                    Deathlist.normalattack(entityiterator);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                            _datEntI = (StarSpiritEntity)entity;
                                                                                            n52 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n52 = 0;
                                                                                        }
                                                                                        if (n52 >= 27) {
                                                                                            int n82;
                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                StarSpiritEntity _datEntI10 = (StarSpiritEntity)entity;
                                                                                                n82 = (Integer)_datEntI10.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                            } else {
                                                                                                n82 = 0;
                                                                                            }
                                                                                            if (n82 <= 38) {
                                                                                                _center = new Vec3(x, y, z);
                                                                                                List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                                                for (Entity entityiterator : list) {
                                                                                                    if (entityiterator instanceof StarSpiritEntity) continue;
                                                                                                    if (!(entityiterator instanceof Player)) {
                                                                                                        float f22;
                                                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                                                                        if (entityiterator instanceof LivingEntity) {
                                                                                                            _livEnt2 = (LivingEntity)entityiterator;
                                                                                                            f22 = _livEnt2.m_21233_();
                                                                                                        } else {
                                                                                                            f22 = -1.0f;
                                                                                                        }
                                                                                                        entityiterator.m_6469_(damageSource, f22 / 4.0f + 600000.0f);
                                                                                                        entityiterator.f_19802_ = 0;
                                                                                                    }
                                                                                                    if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                                                                                    entityiterator.f_19802_ = 0;
                                                                                                    Deathlist.normalattack(entityiterator);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                            _datEntI = (StarSpiritEntity)entity;
                                                                                            n51 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n51 = 0;
                                                                                        }
                                                                                        if (n51 >= 47) {
                                                                                            int n83;
                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                StarSpiritEntity _datEntI11 = (StarSpiritEntity)entity;
                                                                                                n83 = (Integer)_datEntI11.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                            } else {
                                                                                                n83 = 0;
                                                                                            }
                                                                                            if (n83 <= 61) {
                                                                                                _center = new Vec3(x, y, z);
                                                                                                List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                                                for (Entity entityiterator : list) {
                                                                                                    if (entityiterator instanceof StarSpiritEntity) continue;
                                                                                                    if (!(entityiterator instanceof Player)) {
                                                                                                        float f23;
                                                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                                                                        if (entityiterator instanceof LivingEntity) {
                                                                                                            _livEnt2 = (LivingEntity)entityiterator;
                                                                                                            f23 = _livEnt2.m_21233_();
                                                                                                        } else {
                                                                                                            f23 = -1.0f;
                                                                                                        }
                                                                                                        entityiterator.m_6469_(damageSource, f23 / 4.0f + 800000.0f);
                                                                                                        entityiterator.f_19802_ = 0;
                                                                                                    }
                                                                                                    if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                                                                                    entityiterator.f_19802_ = 0;
                                                                                                    Deathlist.normalattack(entityiterator);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                            _datEntI = (StarSpiritEntity)entity;
                                                                                            n50 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n50 = 0;
                                                                                        }
                                                                                        if (n50 == 75 && entity instanceof StarSpiritEntity) {
                                                                                            int n84;
                                                                                            StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                _datEntI4 = (StarSpiritEntity)entity;
                                                                                                n84 = (Integer)_datEntI4.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                                                                            } else {
                                                                                                n84 = 0;
                                                                                            }
                                                                                            synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n84 - 2));
                                                                                        }
                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                            _datEntI = (StarSpiritEntity)entity;
                                                                                            n49 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n49 = 0;
                                                                                        }
                                                                                        if (n49 >= 75) {
                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                                                _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                                                                                            }
                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                                                _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                                                                                            }
                                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                                ((StarSpiritEntity)entity).setAnimation("empty");
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                        _datEntI3 = (StarSpiritEntity)entity;
                                                                                        n48 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                                    } else {
                                                                                        n48 = 0;
                                                                                    }
                                                                                    if (n48 != 2) break block841;
                                                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                                                        if (entity instanceof StarSpiritEntity) {
                                                                                            ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.doubleslash");
                                                                                        }
                                                                                    } else if (entity instanceof StarSpiritEntity) {
                                                                                        ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.doubleslash2");
                                                                                    }
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt = (Mob)entity;
                                                                                        livingEntity3 = _mobEnt.m_5448_();
                                                                                    } else {
                                                                                        livingEntity3 = null;
                                                                                    }
                                                                                    if (livingEntity3 != null) {
                                                                                        LivingEntity livingEntity64;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt16 = (Mob)entity;
                                                                                            livingEntity64 = _mobEnt16.m_5448_();
                                                                                        } else {
                                                                                            livingEntity64 = null;
                                                                                        }
                                                                                        f3 = entity.m_20270_(livingEntity64);
                                                                                    } else {
                                                                                        f3 = -1.0f;
                                                                                    }
                                                                                    if (f3 > 1.0f) {
                                                                                        LivingEntity livingEntity65;
                                                                                        LivingEntity livingEntity66;
                                                                                        LivingEntity livingEntity67;
                                                                                        LivingEntity livingEntity68;
                                                                                        LivingEntity livingEntity69;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            v151 = mob.m_5448_();
                                                                                        } else {
                                                                                            v151 = _ent = null;
                                                                                        }
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            livingEntity69 = mob.m_5448_();
                                                                                        } else {
                                                                                            livingEntity69 = null;
                                                                                        }
                                                                                        double d = livingEntity69.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            livingEntity68 = mob.m_5448_();
                                                                                        } else {
                                                                                            livingEntity68 = null;
                                                                                        }
                                                                                        int n85 = (int)livingEntity68.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            livingEntity67 = mob.m_5448_();
                                                                                        } else {
                                                                                            livingEntity67 = null;
                                                                                        }
                                                                                        double d16 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n85, (int)livingEntity67.m_20189_());
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob mob = (Mob)entity;
                                                                                            livingEntity66 = mob.m_5448_();
                                                                                        } else {
                                                                                            livingEntity66 = null;
                                                                                        }
                                                                                        _ent.m_6021_(d, d16, livingEntity66.m_20189_());
                                                                                        if (_ent instanceof ServerPlayer) {
                                                                                            LivingEntity livingEntity70;
                                                                                            LivingEntity livingEntity71;
                                                                                            LivingEntity livingEntity72;
                                                                                            LivingEntity livingEntity73;
                                                                                            ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob _mobEnt22 = (Mob)entity;
                                                                                                livingEntity73 = _mobEnt22.m_5448_();
                                                                                            } else {
                                                                                                livingEntity73 = null;
                                                                                            }
                                                                                            double d17 = livingEntity73.m_20185_();
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt3 = (Mob)entity;
                                                                                                livingEntity72 = _mobEnt3.m_5448_();
                                                                                            } else {
                                                                                                livingEntity72 = null;
                                                                                            }
                                                                                            int n86 = (int)livingEntity72.m_20185_();
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt4 = (Mob)entity;
                                                                                                livingEntity71 = _mobEnt4.m_5448_();
                                                                                            } else {
                                                                                                livingEntity71 = null;
                                                                                            }
                                                                                            double d18 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n86, (int)livingEntity71.m_20189_());
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt2 = (Mob)entity;
                                                                                                livingEntity70 = _mobEnt2.m_5448_();
                                                                                            } else {
                                                                                                livingEntity70 = null;
                                                                                            }
                                                                                            serverGamePacketListenerImpl.m_9774_(d17, d18, livingEntity70.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                                        }
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt5 = (Mob)entity;
                                                                                            livingEntity65 = _mobEnt5.m_5448_();
                                                                                        } else {
                                                                                            livingEntity65 = null;
                                                                                        }
                                                                                        livingEntity65.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                                    }
                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                        n47 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n47 = 0;
                                                                                    }
                                                                                    if (n47 == 1) {
                                                                                        float f24;
                                                                                        LivingEntity livingEntity74;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt23 = (Mob)entity;
                                                                                            livingEntity74 = _mobEnt23.m_5448_();
                                                                                        } else {
                                                                                            livingEntity74 = null;
                                                                                        }
                                                                                        if (livingEntity74 != null) {
                                                                                            LivingEntity livingEntity75;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                livingEntity75 = _mobEnt5.m_5448_();
                                                                                            } else {
                                                                                                livingEntity75 = null;
                                                                                            }
                                                                                            f24 = entity.m_20270_(livingEntity75);
                                                                                        } else {
                                                                                            f24 = -1.0f;
                                                                                        }
                                                                                        if (f24 > 1.0f) {
                                                                                            LivingEntity livingEntity76;
                                                                                            LivingEntity livingEntity77;
                                                                                            LivingEntity livingEntity78;
                                                                                            LivingEntity livingEntity79;
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity79 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity79 = null;
                                                                                            }
                                                                                            double d = livingEntity79.m_20185_();
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob _mobEnt25 = (Mob)entity;
                                                                                                livingEntity78 = _mobEnt25.m_5448_();
                                                                                            } else {
                                                                                                livingEntity78 = null;
                                                                                            }
                                                                                            double d19 = livingEntity78.m_20186_();
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity77 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity77 = null;
                                                                                            }
                                                                                            double d20 = d19 + (double)livingEntity77.m_20206_() / 1.5;
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity76 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity76 = null;
                                                                                            }
                                                                                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity76.m_20189_()));
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                        n46 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n46 = 0;
                                                                                    }
                                                                                    if (n46 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                                        ServerLevel _level5 = (ServerLevel)world;
                                                                                        _level5.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level5, 4, "", (Component)Component.m_237113_((String)""), _level5.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                                    }
                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                                        n45 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n45 = 0;
                                                                                    }
                                                                                    if (n45 == 15) break block842;
                                                                                    if (entity instanceof StarSpiritEntity) {
                                                                                        StarSpiritEntity _datEntI12 = (StarSpiritEntity)entity;
                                                                                        n44 = (Integer)_datEntI12.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n44 = 0;
                                                                                    }
                                                                                    if (n44 != 62) break block843;
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
                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                _datEntI = (StarSpiritEntity)entity;
                                                                                n43 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                            } else {
                                                                                n43 = 0;
                                                                            }
                                                                            if (n43 == 17) break block844;
                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                StarSpiritEntity _datEntI13 = (StarSpiritEntity)entity;
                                                                                n42 = (Integer)_datEntI13.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                            } else {
                                                                                n42 = 0;
                                                                            }
                                                                            if (n42 != 64) break block845;
                                                                        }
                                                                        if (world instanceof Level) {
                                                                            _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        _center = new Vec3(x, y, z);
                                                                        List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(800.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                        for (Entity entityiterator : list) {
                                                                            float f25;
                                                                            if (entityiterator instanceof StarSpiritEntity) continue;
                                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                            if (entityiterator instanceof LivingEntity) {
                                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                                f25 = _livEnt2.m_21233_();
                                                                            } else {
                                                                                f25 = -1.0f;
                                                                            }
                                                                            entityiterator.m_6469_(damageSource, f25 / 4.0f + 1000000.0f);
                                                                            if (!(entityiterator instanceof Player) && entityiterator instanceof LivingEntity) {
                                                                                for (int index2 = 0; index2 < 2; ++index2) {
                                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                                                }
                                                                            }
                                                                            if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                                                            entityiterator.f_19802_ = 0;
                                                                            Deathlist.normalattack(entityiterator);
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n41 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n41 = 0;
                                                                    }
                                                                    if (n41 == 37) {
                                                                        LivingEntity _entity4;
                                                                        if (entity instanceof LivingEntity && !(_entity4 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                            _entity4.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                                                        }
                                                                        if (world instanceof Level) {
                                                                            Level _level6 = (Level)world;
                                                                            if (!_level6.m_5776_()) {
                                                                                _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                            } else {
                                                                                _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        if (world instanceof Level) {
                                                                            Level _level7 = (Level)world;
                                                                            if (!_level7.m_5776_()) {
                                                                                _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                            } else {
                                                                                _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 50.0, y + 0.1, z + entity.m_20154_().f_82481_ * 50.0, 0.0, 0.0, 0.0);
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 50.0, y + 0.2, z + entity.m_20154_().f_82481_ * 50.0, 0.0, 0.0, 0.0);
                                                                        for (int index3 = 0; index3 < 32; ++index3) {
                                                                            if (world instanceof ServerLevel) {
                                                                                _level = (ServerLevel)world;
                                                                                LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                                                                                lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                                                                lightningBolt.m_20874_(true);
                                                                                _level.m_7967_((Entity)lightningBolt);
                                                                            }
                                                                            if (!(world instanceof ServerLevel)) continue;
                                                                            _level = (ServerLevel)world;
                                                                            Entity entity3 = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                                                            if (entity3 == null) continue;
                                                                            entity3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                        }
                                                                        Vec3 _center = new Vec3(x, y, z);
                                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(800.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                        for (Entity entityiterator : _entfound) {
                                                                            float f26;
                                                                            if (entityiterator instanceof StarSpiritEntity) continue;
                                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                            if (entityiterator instanceof LivingEntity) {
                                                                                _livEnt = (LivingEntity)entityiterator;
                                                                                f26 = _livEnt.m_21233_();
                                                                            } else {
                                                                                f26 = -1.0f;
                                                                            }
                                                                            entityiterator.m_6469_(damageSource, f26 / 4.0f + 1000000.0f);
                                                                            double _setval = 10.0;
                                                                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                capability.camerashake = _setval;
                                                                                capability.syncPlayerVariables(entityiterator);
                                                                            });
                                                                            if (!(entityiterator instanceof LivingEntity)) continue;
                                                                            if (!(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                                                entityiterator.f_19802_ = 0;
                                                                                Deathlist.normalattack(entityiterator);
                                                                            }
                                                                            if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                                                                            entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n40 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n40 = 0;
                                                                    }
                                                                    if (n40 == 82 && entity instanceof StarskeletonEntity) {
                                                                        int n87;
                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                        if (entity instanceof StarskeletonEntity) {
                                                                            _datEntI4 = (StarskeletonEntity)entity;
                                                                            n87 = (Integer)_datEntI4.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                        } else {
                                                                            n87 = 0;
                                                                        }
                                                                        synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n87 - 2));
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n39 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n39 = 0;
                                                                    }
                                                                    if (n39 >= 82) {
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                            _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                                                                        }
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                            _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                                                                        }
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            ((StarSpiritEntity)entity).setAnimation("empty");
                                                                        }
                                                                    }
                                                                }
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                    n38 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                } else {
                                                                    n38 = 0;
                                                                }
                                                                if (n38 == 4) {
                                                                    int n88;
                                                                    int n89;
                                                                    int n90;
                                                                    int n91;
                                                                    int n92;
                                                                    int n93;
                                                                    int n94;
                                                                    int n95;
                                                                    int n96;
                                                                    int n97;
                                                                    float f27;
                                                                    LivingEntity livingEntity80;
                                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.swordups");
                                                                        }
                                                                    } else if (entity instanceof StarSpiritEntity) {
                                                                        ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.swordups2");
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt = (Mob)entity;
                                                                        livingEntity80 = _mobEnt.m_5448_();
                                                                    } else {
                                                                        livingEntity80 = null;
                                                                    }
                                                                    if (livingEntity80 != null) {
                                                                        LivingEntity livingEntity81;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt28 = (Mob)entity;
                                                                            livingEntity81 = _mobEnt28.m_5448_();
                                                                        } else {
                                                                            livingEntity81 = null;
                                                                        }
                                                                        f27 = entity.m_20270_(livingEntity81);
                                                                    } else {
                                                                        f27 = -1.0f;
                                                                    }
                                                                    if (f27 > 1.0f) {
                                                                        LivingEntity livingEntity82;
                                                                        LivingEntity livingEntity83;
                                                                        LivingEntity livingEntity84;
                                                                        LivingEntity livingEntity85;
                                                                        LivingEntity livingEntity86;
                                                                        if (entity instanceof Mob) {
                                                                            Mob mob = (Mob)entity;
                                                                            v197 = mob.m_5448_();
                                                                        } else {
                                                                            v197 = _ent = null;
                                                                        }
                                                                        if (entity instanceof Mob) {
                                                                            Mob mob = (Mob)entity;
                                                                            livingEntity86 = mob.m_5448_();
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
                                                                        int n98 = (int)livingEntity85.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            Mob mob = (Mob)entity;
                                                                            livingEntity84 = mob.m_5448_();
                                                                        } else {
                                                                            livingEntity84 = null;
                                                                        }
                                                                        double d21 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n98, (int)livingEntity84.m_20189_());
                                                                        if (entity instanceof Mob) {
                                                                            Mob mob = (Mob)entity;
                                                                            livingEntity83 = mob.m_5448_();
                                                                        } else {
                                                                            livingEntity83 = null;
                                                                        }
                                                                        _ent.m_6021_(d, d21, livingEntity83.m_20189_());
                                                                        if (_ent instanceof ServerPlayer) {
                                                                            LivingEntity livingEntity87;
                                                                            LivingEntity livingEntity88;
                                                                            LivingEntity livingEntity89;
                                                                            LivingEntity livingEntity90;
                                                                            ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt34 = (Mob)entity;
                                                                                livingEntity90 = _mobEnt34.m_5448_();
                                                                            } else {
                                                                                livingEntity90 = null;
                                                                            }
                                                                            double d22 = livingEntity90.m_20185_();
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt3 = (Mob)entity;
                                                                                livingEntity89 = _mobEnt3.m_5448_();
                                                                            } else {
                                                                                livingEntity89 = null;
                                                                            }
                                                                            int n99 = (int)livingEntity89.m_20185_();
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt4 = (Mob)entity;
                                                                                livingEntity88 = _mobEnt4.m_5448_();
                                                                            } else {
                                                                                livingEntity88 = null;
                                                                            }
                                                                            double d23 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n99, (int)livingEntity88.m_20189_());
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt2 = (Mob)entity;
                                                                                livingEntity87 = _mobEnt2.m_5448_();
                                                                            } else {
                                                                                livingEntity87 = null;
                                                                            }
                                                                            serverGamePacketListenerImpl.m_9774_(d22, d23, livingEntity87.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                        }
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt5 = (Mob)entity;
                                                                            livingEntity82 = _mobEnt5.m_5448_();
                                                                        } else {
                                                                            livingEntity82 = null;
                                                                        }
                                                                        livingEntity82.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n97 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n97 = 0;
                                                                    }
                                                                    if (n97 == 1) {
                                                                        float f28;
                                                                        LivingEntity livingEntity91;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt35 = (Mob)entity;
                                                                            livingEntity91 = _mobEnt35.m_5448_();
                                                                        } else {
                                                                            livingEntity91 = null;
                                                                        }
                                                                        if (livingEntity91 != null) {
                                                                            LivingEntity livingEntity92;
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt5 = (Mob)entity;
                                                                                livingEntity92 = _mobEnt5.m_5448_();
                                                                            } else {
                                                                                livingEntity92 = null;
                                                                            }
                                                                            f28 = entity.m_20270_(livingEntity92);
                                                                        } else {
                                                                            f28 = -1.0f;
                                                                        }
                                                                        if (f28 > 1.0f) {
                                                                            LivingEntity livingEntity93;
                                                                            LivingEntity livingEntity94;
                                                                            LivingEntity livingEntity95;
                                                                            LivingEntity livingEntity96;
                                                                            if (entity instanceof Mob) {
                                                                                Mob mob = (Mob)entity;
                                                                                livingEntity96 = mob.m_5448_();
                                                                            } else {
                                                                                livingEntity96 = null;
                                                                            }
                                                                            double d = livingEntity96.m_20185_();
                                                                            if (entity instanceof Mob) {
                                                                                Mob _mobEnt37 = (Mob)entity;
                                                                                livingEntity95 = _mobEnt37.m_5448_();
                                                                            } else {
                                                                                livingEntity95 = null;
                                                                            }
                                                                            double d24 = livingEntity95.m_20186_();
                                                                            if (entity instanceof Mob) {
                                                                                Mob mob = (Mob)entity;
                                                                                livingEntity94 = mob.m_5448_();
                                                                            } else {
                                                                                livingEntity94 = null;
                                                                            }
                                                                            double d25 = d24 + (double)livingEntity94.m_20206_() / 1.5;
                                                                            if (entity instanceof Mob) {
                                                                                Mob mob = (Mob)entity;
                                                                                livingEntity93 = mob.m_5448_();
                                                                            } else {
                                                                                livingEntity93 = null;
                                                                            }
                                                                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d25, livingEntity93.m_20189_()));
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n96 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n96 = 0;
                                                                    }
                                                                    if (n96 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                        ServerLevel _level = (ServerLevel)world;
                                                                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n95 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n95 = 0;
                                                                    }
                                                                    if (n95 == 18) {
                                                                        if (world instanceof Level) {
                                                                            Level _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                                                        Vec3 _center = new Vec3(x, y, z);
                                                                        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(800.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                        for (Entity entityiterator : _entfound) {
                                                                            float f29;
                                                                            if (entityiterator instanceof StarSpiritEntity) continue;
                                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                            if (entityiterator instanceof LivingEntity) {
                                                                                _livEnt = (LivingEntity)entityiterator;
                                                                                f29 = _livEnt.m_21233_();
                                                                            } else {
                                                                                f29 = -1.0f;
                                                                            }
                                                                            entityiterator.m_6469_(damageSource, f29 / 4.0f + 1000000.0f);
                                                                            if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player) continue;
                                                                            entityiterator.f_19802_ = 0;
                                                                            Deathlist.normalattack(entityiterator);
                                                                        }
                                                                        for (int index4 = 0; index4 < 200; ++index4) {
                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.5, (double)1.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                                        }
                                                                        for (int index5 = 0; index5 < 400; ++index5) {
                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n94 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n94 = 0;
                                                                    }
                                                                    if (n94 == 40) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ZHAN.get()), x, y + 80.0, z, 0.0, 0.0, 0.0);
                                                                        if (world instanceof Level) {
                                                                            Level _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        for (int index6 = 0; index6 < 2; ++index6) {
                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.BLADERUSH.get()), x + entity.m_20154_().f_82479_ * 10.0, y + 30.0, z + entity.m_20154_().f_82481_ * 10.0, 0.0, 0.0, 0.0);
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n93 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n93 = 0;
                                                                    }
                                                                    if (n93 >= 40) {
                                                                        int n100;
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            StarSpiritEntity _datEntI14 = (StarSpiritEntity)entity;
                                                                            n100 = (Integer)_datEntI14.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                        } else {
                                                                            n100 = 0;
                                                                        }
                                                                        if (n100 <= 50) {
                                                                            for (int index7 = 0; index7 < 4; ++index7) {
                                                                                if (!(world instanceof ServerLevel)) continue;
                                                                                ServerLevel serverLevel = (ServerLevel)world;
                                                                                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.SWORDSOFSTAR.get()).m_262496_(serverLevel, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-200, (int)200)), (double)(y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)120, (int)160)), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-200, (int)200))), MobSpawnType.MOB_SUMMONED);
                                                                                if (entityToSpawn == null) continue;
                                                                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n92 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n92 = 0;
                                                                    }
                                                                    if (n92 == 67 && world instanceof Level) {
                                                                        Level _level = (Level)world;
                                                                        if (!_level.m_5776_()) {
                                                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                        } else {
                                                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n91 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n91 = 0;
                                                                    }
                                                                    if (n91 == 69) {
                                                                        if (world instanceof Level) {
                                                                            Level _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        if (world instanceof Level) {
                                                                            Level _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        Vec3 _center = new Vec3(x, y, z);
                                                                        List<Entity> _entfound7 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(800.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                        for (Entity entityiterator : _entfound7) {
                                                                            float f30;
                                                                            if (entityiterator instanceof StarSpiritEntity) continue;
                                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                            if (entityiterator instanceof LivingEntity) {
                                                                                _livEnt = (LivingEntity)entityiterator;
                                                                                f30 = _livEnt.m_21233_();
                                                                            } else {
                                                                                f30 = -1.0f;
                                                                            }
                                                                            entityiterator.m_6469_(damageSource, f30 / 4.0f + 2000000.0f);
                                                                            double _setval = 6.0;
                                                                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                capability.camerashake = _setval;
                                                                                capability.syncPlayerVariables(entityiterator);
                                                                            });
                                                                            if (entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                                                entityiterator.f_19802_ = 0;
                                                                                Deathlist.normalattack(entityiterator);
                                                                            }
                                                                            if (entityiterator instanceof Player || entityiterator instanceof OriginallightningEntity || !(entityiterator instanceof LivingEntity)) continue;
                                                                            for (int index8 = 0; index8 < 2; ++index8) {
                                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n90 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n90 = 0;
                                                                    }
                                                                    if (n90 == 90) {
                                                                        int n101;
                                                                        LivingEntity _entity5;
                                                                        if (entity instanceof LivingEntity && !(_entity5 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                            _entity5.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                                                        }
                                                                        if (world instanceof Level) {
                                                                            Level _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        if (world instanceof Level) {
                                                                            Level _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 50.0, y + 0.1, z + entity.m_20154_().f_82481_ * 50.0, 0.0, 0.0, 0.0);
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 50.0, y + 0.2, z + entity.m_20154_().f_82481_ * 50.0, 0.0, 0.0, 0.0);
                                                                        for (int index9 = 0; index9 < 32; ++index9) {
                                                                            if (world instanceof ServerLevel) {
                                                                                ServerLevel _level = (ServerLevel)world;
                                                                                LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
                                                                                lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                                                                lightningBolt.m_20874_(true);
                                                                                _level.m_7967_((Entity)lightningBolt);
                                                                            }
                                                                            if (!(world instanceof ServerLevel)) continue;
                                                                            ServerLevel _level = (ServerLevel)world;
                                                                            Entity entity4 = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                                                            if (entity4 == null) continue;
                                                                            entity4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                        }
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            StarSpiritEntity _datEntI15 = (StarSpiritEntity)entity;
                                                                            n101 = (Integer)_datEntI15.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                                                        } else {
                                                                            n101 = 0;
                                                                        }
                                                                        if (n101 <= 5 && entity instanceof Mob) {
                                                                            Mob _entity6 = (Mob)entity;
                                                                            _entity6.m_6710_(null);
                                                                        }
                                                                        Vec3 _center = new Vec3(x, y, z);
                                                                        List<Entity> _entfound8 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(800.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                        for (Entity entityiterator : _entfound8) {
                                                                            int n102;
                                                                            float f31;
                                                                            if (entityiterator instanceof StarSpiritEntity) continue;
                                                                            if (entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                                                entityiterator.f_19802_ = 0;
                                                                                Deathlist.normalattack(entityiterator);
                                                                            }
                                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                            if (entityiterator instanceof LivingEntity) {
                                                                                _livEnt = (LivingEntity)entityiterator;
                                                                                f31 = _livEnt.m_21223_();
                                                                            } else {
                                                                                f31 = -1.0f;
                                                                            }
                                                                            entityiterator.m_6469_(damageSource, f31 * 4.0f + 1000000.0f);
                                                                            double _setval = 12.0;
                                                                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                capability.camerashake = _setval;
                                                                                capability.syncPlayerVariables(entityiterator);
                                                                            });
                                                                            if (entityiterator instanceof Player || entityiterator instanceof Titangodentity || !(entityiterator instanceof LivingEntity) || entityiterator instanceof OriginallightningEntity) continue;
                                                                            entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                                                            if (entity instanceof StarSpiritEntity) {
                                                                                StarSpiritEntity _datEntI16 = (StarSpiritEntity)entity;
                                                                                n102 = (Integer)_datEntI16.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                                                            } else {
                                                                                n102 = 0;
                                                                            }
                                                                            if (n102 > 5) continue;
                                                                            Deathlist.normalattack(entityiterator);
                                                                        }
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n89 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n89 = 0;
                                                                    }
                                                                    if (n89 == 106 && entity instanceof StarSpiritEntity) {
                                                                        int n103;
                                                                        StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            StarSpiritEntity _datEntI17 = (StarSpiritEntity)entity;
                                                                            n103 = (Integer)_datEntI17.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                                                        } else {
                                                                            n103 = 0;
                                                                        }
                                                                        synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n103 - 3));
                                                                    }
                                                                    if (entity instanceof StarSpiritEntity) {
                                                                        _datEntI = (StarSpiritEntity)entity;
                                                                        n88 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                    } else {
                                                                        n88 = 0;
                                                                    }
                                                                    if (n88 >= 106) {
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                            _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                                                                        }
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                                            _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                                                                        }
                                                                        if (entity instanceof StarSpiritEntity) {
                                                                            ((StarSpiritEntity)entity).setAnimation("empty");
                                                                        }
                                                                    }
                                                                }
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    _datEntI3 = (StarSpiritEntity)entity;
                                                                    n37 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                                                } else {
                                                                    n37 = 0;
                                                                }
                                                                if (n37 != 5) break block846;
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.luankan");
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity2 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity2 = null;
                                                                }
                                                                if (livingEntity2 != null) {
                                                                    LivingEntity livingEntity97;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt40 = (Mob)entity;
                                                                        livingEntity97 = _mobEnt40.m_5448_();
                                                                    } else {
                                                                        livingEntity97 = null;
                                                                    }
                                                                    f2 = entity.m_20270_(livingEntity97);
                                                                } else {
                                                                    f2 = -1.0f;
                                                                }
                                                                if (f2 > 1.0f) {
                                                                    LivingEntity livingEntity98;
                                                                    LivingEntity livingEntity99;
                                                                    LivingEntity livingEntity100;
                                                                    LivingEntity livingEntity101;
                                                                    Mob _mobEnt7;
                                                                    LivingEntity livingEntity102;
                                                                    LivingEntity livingEntity103;
                                                                    LivingEntity livingEntity104;
                                                                    LivingEntity livingEntity105;
                                                                    LivingEntity livingEntity106;
                                                                    LivingEntity _ent2;
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        v249 = mob.m_5448_();
                                                                    } else {
                                                                        v249 = _ent2 = null;
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity106 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity106 = null;
                                                                    }
                                                                    double d = livingEntity106.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity105 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity105 = null;
                                                                    }
                                                                    int n104 = (int)livingEntity105.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity104 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity104 = null;
                                                                    }
                                                                    double d26 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n104, (int)livingEntity104.m_20189_());
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity103 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity103 = null;
                                                                    }
                                                                    _ent2.m_6021_(d, d26, livingEntity103.m_20189_());
                                                                    if (_ent2 instanceof ServerPlayer) {
                                                                        LivingEntity livingEntity107;
                                                                        LivingEntity livingEntity108;
                                                                        LivingEntity livingEntity109;
                                                                        LivingEntity livingEntity110;
                                                                        ServerPlayer serverPlayer = (ServerPlayer)_ent2;
                                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt47 = (Mob)entity;
                                                                            livingEntity110 = _mobEnt47.m_5448_();
                                                                        } else {
                                                                            livingEntity110 = null;
                                                                        }
                                                                        double d27 = livingEntity110.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt3 = (Mob)entity;
                                                                            livingEntity109 = _mobEnt3.m_5448_();
                                                                        } else {
                                                                            livingEntity109 = null;
                                                                        }
                                                                        int n105 = (int)livingEntity109.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt4 = (Mob)entity;
                                                                            livingEntity108 = _mobEnt4.m_5448_();
                                                                        } else {
                                                                            livingEntity108 = null;
                                                                        }
                                                                        double d28 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n105, (int)livingEntity108.m_20189_());
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt2 = (Mob)entity;
                                                                            livingEntity107 = _mobEnt2.m_5448_();
                                                                        } else {
                                                                            livingEntity107 = null;
                                                                        }
                                                                        serverGamePacketListenerImpl.m_9774_(d27, d28, livingEntity107.m_20189_(), _ent2.m_146908_(), _ent2.m_146909_());
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt41 = (Mob)entity;
                                                                        livingEntity102 = _mobEnt41.m_5448_();
                                                                    } else {
                                                                        livingEntity102 = null;
                                                                    }
                                                                    livingEntity102.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt7 = (Mob)entity;
                                                                        livingEntity101 = _mobEnt7.m_5448_();
                                                                    } else {
                                                                        livingEntity101 = null;
                                                                    }
                                                                    double d29 = livingEntity101.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity100 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity100 = null;
                                                                    }
                                                                    double d30 = livingEntity100.m_20186_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt7 = (Mob)entity;
                                                                        livingEntity99 = _mobEnt7.m_5448_();
                                                                    } else {
                                                                        livingEntity99 = null;
                                                                    }
                                                                    double d31 = d30 + (double)livingEntity99.m_20206_() / 1.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt7 = (Mob)entity;
                                                                        livingEntity98 = _mobEnt7.m_5448_();
                                                                    } else {
                                                                        livingEntity98 = null;
                                                                    }
                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d29, d31, livingEntity98.m_20189_()));
                                                                }
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    _datEntI = (StarSpiritEntity)entity;
                                                                    n36 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                } else {
                                                                    n36 = 0;
                                                                }
                                                                if (n36 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                    ServerLevel _level = (ServerLevel)world;
                                                                    _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                }
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    _datEntI = (StarSpiritEntity)entity;
                                                                    n35 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                } else {
                                                                    n35 = 0;
                                                                }
                                                                if (n35 == 6) {
                                                                    if (world instanceof Level) {
                                                                        Level _level = (Level)world;
                                                                        if (!_level.m_5776_()) {
                                                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                                                        } else {
                                                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    for (int index10 = 0; index10 < 360; ++index10) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYHOLE.get()), x, y + 40.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0));
                                                                    }
                                                                }
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    _datEntI = (StarSpiritEntity)entity;
                                                                    n34 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                } else {
                                                                    n34 = 0;
                                                                }
                                                                if (n34 == 20) break block847;
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    StarSpiritEntity _datEntI18 = (StarSpiritEntity)entity;
                                                                    n33 = (Integer)_datEntI18.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                } else {
                                                                    n33 = 0;
                                                                }
                                                                if (n33 == 27) break block847;
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    StarSpiritEntity _datEntI19 = (StarSpiritEntity)entity;
                                                                    n32 = (Integer)_datEntI19.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                } else {
                                                                    n32 = 0;
                                                                }
                                                                if (n32 == 47) break block847;
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    StarSpiritEntity starSpiritEntity = (StarSpiritEntity)entity;
                                                                    n31 = (Integer)starSpiritEntity.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                } else {
                                                                    n31 = 0;
                                                                }
                                                                if (n31 == 55) break block847;
                                                                if (entity instanceof StarSpiritEntity) {
                                                                    StarSpiritEntity _datEntI21 = (StarSpiritEntity)entity;
                                                                    n30 = (Integer)_datEntI21.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                                } else {
                                                                    n30 = 0;
                                                                }
                                                                if (n30 != 75) break block848;
                                                            }
                                                            if (world instanceof Level) {
                                                                Level _level = (Level)world;
                                                                if (!_level.m_5776_()) {
                                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 500.0f, 1.0f);
                                                                } else {
                                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 500.0f, 1.0f, false);
                                                                }
                                                            }
                                                        }
                                                        if (entity instanceof StarSpiritEntity) {
                                                            _datEntI = (StarSpiritEntity)entity;
                                                            n29 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                        } else {
                                                            n29 = 0;
                                                        }
                                                        if (n29 == 22) break block849;
                                                        if (entity instanceof StarSpiritEntity) {
                                                            StarSpiritEntity _datEntI22 = (StarSpiritEntity)entity;
                                                            n28 = (Integer)_datEntI22.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                        } else {
                                                            n28 = 0;
                                                        }
                                                        if (n28 == 29) break block849;
                                                        if (entity instanceof StarSpiritEntity) {
                                                            StarSpiritEntity _datEntI23 = (StarSpiritEntity)entity;
                                                            n27 = (Integer)_datEntI23.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                        } else {
                                                            n27 = 0;
                                                        }
                                                        if (n27 == 49) break block849;
                                                        if (entity instanceof StarSpiritEntity) {
                                                            StarSpiritEntity starSpiritEntity = (StarSpiritEntity)entity;
                                                            n26 = (Integer)starSpiritEntity.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                        } else {
                                                            n26 = 0;
                                                        }
                                                        if (n26 == 57) break block849;
                                                        if (entity instanceof StarSpiritEntity) {
                                                            StarSpiritEntity _datEntI25 = (StarSpiritEntity)entity;
                                                            n25 = (Integer)_datEntI25.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                        } else {
                                                            n25 = 0;
                                                        }
                                                        if (n25 != 77) break block850;
                                                    }
                                                    Vec3 _center = new Vec3(x, y, z);
                                                    List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                    for (Entity entityiterator : _entfound) {
                                                        float f32;
                                                        if (entityiterator instanceof StarSpiritEntity) continue;
                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                        if (entityiterator instanceof LivingEntity) {
                                                            LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                                                            f32 = _livEnt4.m_21233_();
                                                        } else {
                                                            f32 = -1.0f;
                                                        }
                                                        entityiterator.m_6469_(damageSource, f32 / 4.0f + 1000000.0f);
                                                        if (entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                            entityiterator.f_19802_ = 0;
                                                            Deathlist.normalattack(entityiterator);
                                                        }
                                                        if (entityiterator instanceof Player) continue;
                                                        entityiterator.f_19802_ = 0;
                                                        if (!(entityiterator instanceof LivingEntity)) continue;
                                                        if (world instanceof Level) {
                                                            Level _level = (Level)world;
                                                            if (!_level.m_5776_()) {
                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                                            } else {
                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                                            }
                                                        }
                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                    }
                                                }
                                                if (entity instanceof StarSpiritEntity) {
                                                    _datEntI = (StarSpiritEntity)entity;
                                                    n24 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                } else {
                                                    n24 = 0;
                                                }
                                                if (n24 == 39) break block851;
                                                if (entity instanceof StarSpiritEntity) {
                                                    StarSpiritEntity _datEntI26 = (StarSpiritEntity)entity;
                                                    n23 = (Integer)_datEntI26.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                                } else {
                                                    n23 = 0;
                                                }
                                                if (n23 != 67) break block852;
                                            }
                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                            }
                                            for (int index11 = 0; index11 < 400; ++index11) {
                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 96.0, y + 48.0, z + entity.m_20154_().f_82481_ * 96.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0));
                                            }
                                            if (world instanceof ServerLevel) {
                                                ServerLevel _level = (ServerLevel)world;
                                                Entity entity5 = ((EntityType)UltimateskeletonsModEntities.STARSHOCK.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 96.0), (double)(y + 48.0), (double)(z + entity.m_20154_().f_82481_ * 96.0)), MobSpawnType.MOB_SUMMONED);
                                                if (entity5 != null) {
                                                    entity5.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                }
                                            }
                                            if (world instanceof Level) {
                                                Level _level = (Level)world;
                                                if (!_level.m_5776_()) {
                                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                                } else {
                                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                                }
                                            }
                                            Vec3 _center = new Vec3(x, y, z);
                                            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(1000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                            for (Entity entityiterator : list) {
                                                float f33;
                                                if (entityiterator instanceof StarSpiritEntity) continue;
                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                                if (entityiterator instanceof LivingEntity) {
                                                    _livEnt2 = (LivingEntity)entityiterator;
                                                    f33 = _livEnt2.m_21233_();
                                                } else {
                                                    f33 = -1.0f;
                                                }
                                                entityiterator.m_6469_(damageSource, f33 / 4.0f + 2000000.0f);
                                                double _setval = 6.0;
                                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                    capability.camerashake = _setval;
                                                    capability.syncPlayerVariables(entityiterator);
                                                });
                                                if (entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                                    entityiterator.f_19802_ = 0;
                                                    Deathlist.normalattack(entityiterator);
                                                }
                                                if (entityiterator instanceof Player) continue;
                                                entityiterator.f_19802_ = 0;
                                                if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof OriginallightningEntity) continue;
                                                entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                            }
                                        }
                                        if (entity instanceof StarSpiritEntity) {
                                            _datEntI = (StarSpiritEntity)entity;
                                            n22 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                        } else {
                                            n22 = 0;
                                        }
                                        if (n22 == 92 && entity instanceof StarSpiritEntity) {
                                            int n106;
                                            StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                            if (entity instanceof StarSpiritEntity) {
                                                StarSpiritEntity _datEntI27 = (StarSpiritEntity)entity;
                                                n106 = (Integer)_datEntI27.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                                            } else {
                                                n106 = 0;
                                            }
                                            synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n106 - 2));
                                        }
                                        if (entity instanceof StarSpiritEntity) {
                                            _datEntI = (StarSpiritEntity)entity;
                                            n21 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                        } else {
                                            n21 = 0;
                                        }
                                        if (n21 >= 92) {
                                            if (entity instanceof StarSpiritEntity) {
                                                StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                                            }
                                            if (entity instanceof StarSpiritEntity) {
                                                StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                                            }
                                            if (entity instanceof StarSpiritEntity) {
                                                ((StarSpiritEntity)entity).setAnimation("empty");
                                            }
                                        }
                                    }
                                    if (entity instanceof StarSpiritEntity) {
                                        _datEntI3 = (StarSpiritEntity)entity;
                                        n20 = (Integer)_datEntI3.m_20088_().m_135370_(StarSpiritEntity.DATA_animationID);
                                    } else {
                                        n20 = 0;
                                    }
                                    if (n20 != 6) break block853;
                                    if (entity instanceof StarSpiritEntity) {
                                        ((StarSpiritEntity)entity).setAnimation("animation.starskeleton.starburst");
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity = null;
                                    }
                                    if (livingEntity != null) {
                                        LivingEntity livingEntity111;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt49 = (Mob)entity;
                                            livingEntity111 = _mobEnt49.m_5448_();
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
                                        Mob _mobEnt8;
                                        LivingEntity livingEntity116;
                                        LivingEntity livingEntity117;
                                        LivingEntity livingEntity118;
                                        LivingEntity livingEntity119;
                                        LivingEntity livingEntity120;
                                        LivingEntity _ent;
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            v299 = mob.m_5448_();
                                        } else {
                                            v299 = _ent = null;
                                        }
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity120 = mob.m_5448_();
                                        } else {
                                            livingEntity120 = null;
                                        }
                                        double d = livingEntity120.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity119 = mob.m_5448_();
                                        } else {
                                            livingEntity119 = null;
                                        }
                                        int n107 = (int)livingEntity119.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity118 = mob.m_5448_();
                                        } else {
                                            livingEntity118 = null;
                                        }
                                        double d32 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n107, (int)livingEntity118.m_20189_());
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity117 = mob.m_5448_();
                                        } else {
                                            livingEntity117 = null;
                                        }
                                        _ent.m_6021_(d, d32, livingEntity117.m_20189_());
                                        if (_ent instanceof ServerPlayer) {
                                            LivingEntity livingEntity121;
                                            LivingEntity livingEntity122;
                                            LivingEntity livingEntity123;
                                            LivingEntity livingEntity124;
                                            ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt56 = (Mob)entity;
                                                livingEntity124 = _mobEnt56.m_5448_();
                                            } else {
                                                livingEntity124 = null;
                                            }
                                            double d33 = livingEntity124.m_20185_();
                                            if (entity instanceof Mob) {
                                                _mobEnt3 = (Mob)entity;
                                                livingEntity123 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity123 = null;
                                            }
                                            int n108 = (int)livingEntity123.m_20185_();
                                            if (entity instanceof Mob) {
                                                _mobEnt4 = (Mob)entity;
                                                livingEntity122 = _mobEnt4.m_5448_();
                                            } else {
                                                livingEntity122 = null;
                                            }
                                            double d34 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n108, (int)livingEntity122.m_20189_());
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity121 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity121 = null;
                                            }
                                            serverGamePacketListenerImpl.m_9774_(d33, d34, livingEntity121.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                        }
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt50 = (Mob)entity;
                                            livingEntity116 = _mobEnt50.m_5448_();
                                        } else {
                                            livingEntity116 = null;
                                        }
                                        livingEntity116.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity115 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity115 = null;
                                        }
                                        double d35 = livingEntity115.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity114 = mob.m_5448_();
                                        } else {
                                            livingEntity114 = null;
                                        }
                                        double d36 = livingEntity114.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity113 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity113 = null;
                                        }
                                        double d37 = d36 + (double)livingEntity113.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt8 = (Mob)entity;
                                            livingEntity112 = _mobEnt8.m_5448_();
                                        } else {
                                            livingEntity112 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d35, d37, livingEntity112.m_20189_()));
                                    }
                                    if (entity instanceof StarSpiritEntity) {
                                        _datEntI = (StarSpiritEntity)entity;
                                        n19 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                    } else {
                                        n19 = 0;
                                    }
                                    if (n19 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                        ServerLevel _level = (ServerLevel)world;
                                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                    }
                                    if (entity instanceof StarSpiritEntity) {
                                        _datEntI = (StarSpiritEntity)entity;
                                        n18 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                    } else {
                                        n18 = 0;
                                    }
                                    if (n18 == 7) break block854;
                                    if (entity instanceof StarSpiritEntity) {
                                        StarSpiritEntity _datEntI28 = (StarSpiritEntity)entity;
                                        n17 = (Integer)_datEntI28.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                    } else {
                                        n17 = 0;
                                    }
                                    if (n17 == 29) break block854;
                                    if (entity instanceof StarSpiritEntity) {
                                        StarSpiritEntity _datEntI29 = (StarSpiritEntity)entity;
                                        n16 = (Integer)_datEntI29.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                    } else {
                                        n16 = 0;
                                    }
                                    if (n16 == 42) break block854;
                                    if (entity instanceof StarSpiritEntity) {
                                        StarSpiritEntity starSpiritEntity = (StarSpiritEntity)entity;
                                        n15 = (Integer)starSpiritEntity.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                    } else {
                                        n15 = 0;
                                    }
                                    if (n15 == 68) break block854;
                                    if (entity instanceof StarSpiritEntity) {
                                        StarSpiritEntity _datEntI31 = (StarSpiritEntity)entity;
                                        n14 = (Integer)_datEntI31.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                    } else {
                                        n14 = 0;
                                    }
                                    if (n14 == 74) break block854;
                                    if (entity instanceof StarSpiritEntity) {
                                        _datEntI2 = (StarSpiritEntity)entity;
                                        n13 = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                                    } else {
                                        n13 = 0;
                                    }
                                    if (n13 != 104) break block855;
                                }
                                if (world instanceof Level) {
                                    Level _level = (Level)world;
                                    if (!_level.m_5776_()) {
                                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 500.0f, 1.0f);
                                    } else {
                                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 500.0f, 1.0f, false);
                                    }
                                }
                            }
                            if (entity instanceof StarSpiritEntity) {
                                _datEntI = (StarSpiritEntity)entity;
                                n12 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                            } else {
                                n12 = 0;
                            }
                            if (n12 == 9) break block856;
                            if (entity instanceof StarSpiritEntity) {
                                StarSpiritEntity _datEntI32 = (StarSpiritEntity)entity;
                                n11 = (Integer)_datEntI32.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                            } else {
                                n11 = 0;
                            }
                            if (n11 == 31) break block856;
                            if (entity instanceof StarSpiritEntity) {
                                StarSpiritEntity _datEntI33 = (StarSpiritEntity)entity;
                                n10 = (Integer)_datEntI33.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                            } else {
                                n10 = 0;
                            }
                            if (n10 == 44) break block856;
                            if (entity instanceof StarSpiritEntity) {
                                StarSpiritEntity starSpiritEntity = (StarSpiritEntity)entity;
                                n9 = (Integer)starSpiritEntity.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                            } else {
                                n9 = 0;
                            }
                            if (n9 == 72) break block856;
                            if (entity instanceof StarSpiritEntity) {
                                StarSpiritEntity _datEntI35 = (StarSpiritEntity)entity;
                                n8 = (Integer)_datEntI35.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                            } else {
                                n8 = 0;
                            }
                            if (n8 == 76) break block856;
                            if (entity instanceof StarSpiritEntity) {
                                _datEntI2 = (StarSpiritEntity)entity;
                                n7 = (Integer)_datEntI2.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                            } else {
                                n7 = 0;
                            }
                            if (n7 != 107) break block857;
                        }
                        Vec3 _center = new Vec3(x, y, z);
                        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(600.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                        for (Entity entityiterator : _entfound) {
                            float f;
                            if (entityiterator instanceof StarSpiritEntity) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                LivingEntity _livEnt5 = (LivingEntity)entityiterator;
                                f = _livEnt5.m_21233_();
                            } else {
                                f = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, f / 4.0f + 1500000.0f);
                            if (entityiterator instanceof Player) continue;
                            entityiterator.f_19802_ = 0;
                            if (!(entityiterator instanceof LivingEntity)) continue;
                            if (world instanceof Level) {
                                Level _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                }
                            }
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                        }
                    }
                    if (entity instanceof StarSpiritEntity) {
                        _datEntI = (StarSpiritEntity)entity;
                        n6 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                    } else {
                        n6 = 0;
                    }
                    if (n6 == 92) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARSHOCK.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 120.0), (double)(y + 32.0), (double)(z + entity.m_20154_().f_82481_ * 120.0)), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARSHOCK.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 144.0), (double)(y + 32.0), (double)(z + entity.m_20154_().f_82481_ * 144.0)), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.STARSHOCK.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 168.0), (double)(y + 32.0), (double)(z + entity.m_20154_().f_82481_ * 168.0)), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                        }
                    }
                    if (entity instanceof StarSpiritEntity) {
                        _datEntI = (StarSpiritEntity)entity;
                        n5 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                    } else {
                        n5 = 0;
                    }
                    if (n5 == 17) break block858;
                    if (entity instanceof StarSpiritEntity) {
                        StarSpiritEntity _datEntI36 = (StarSpiritEntity)entity;
                        n4 = (Integer)_datEntI36.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
                    } else {
                        n4 = 0;
                    }
                    if (n4 != 92) break block859;
                }
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    Entity entity6 = ((EntityType)UltimateskeletonsModEntities.STARSHOCK.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 96.0), (double)(y + 32.0), (double)(z + entity.m_20154_().f_82481_ * 96.0)), MobSpawnType.MOB_SUMMONED);
                    if (entity6 != null) {
                        entity6.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                for (int index12 = 0; index12 < 400; ++index12) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 96.0, y + 32.0, z + entity.m_20154_().f_82481_ * 96.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0));
                }
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                    }
                }
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(1000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : list) {
                    float f;
                    if (entityiterator instanceof StarSpiritEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f / 4.0f + 1500000.0f);
                    double _setval = 6.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    if (entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    if (entityiterator instanceof Player) continue;
                    entityiterator.f_19802_ = 0;
                    if (!(entityiterator instanceof LivingEntity) || entityiterator instanceof OriginallightningEntity) continue;
                    entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI = (StarSpiritEntity)entity;
                n3 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n3 = 0;
            }
            if (n3 == 107) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.2, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get()), x + entity.m_20154_().f_82479_ * 80.0, y + 0.2, z + entity.m_20154_().f_82481_ * 80.0, 0.0, 0.0, 0.0);
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(800.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    int n109;
                    float f;
                    if (entityiterator instanceof StarSpiritEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f / 4.0f + 1200000.0f);
                    double _setval = 6.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    if (entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    if (entityiterator instanceof Player || entityiterator instanceof StarskeletonEntity || !(entityiterator instanceof LivingEntity) || entityiterator instanceof OriginallightningEntity) continue;
                    entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (entity instanceof StarSpiritEntity) {
                        StarSpiritEntity _datEntI37 = (StarSpiritEntity)entity;
                        n109 = (Integer)_datEntI37.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                    } else {
                        n109 = 0;
                    }
                    if (n109 > 7) continue;
                    Deathlist.normalattack(entityiterator);
                }
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI = (StarSpiritEntity)entity;
                n2 = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 == 122 && entity instanceof StarSpiritEntity) {
                int n110;
                StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntI38 = (StarSpiritEntity)entity;
                    n110 = (Integer)_datEntI38.m_20088_().m_135370_(StarSpiritEntity.DATA_SkillCount);
                } else {
                    n110 = 0;
                }
                synchedEntityData.m_135381_(StarSpiritEntity.DATA_SkillCount, (Object)(n110 - 2));
            }
            if (entity instanceof StarSpiritEntity) {
                _datEntI = (StarSpiritEntity)entity;
                n = (Integer)_datEntI.m_20088_().m_135370_(StarSpiritEntity.DATA_animationTick);
            } else {
                n = 0;
            }
            if (n >= 122) {
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    StarSpiritEntity _datEntSetI = (StarSpiritEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(StarSpiritEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof StarSpiritEntity) {
                    ((StarSpiritEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

