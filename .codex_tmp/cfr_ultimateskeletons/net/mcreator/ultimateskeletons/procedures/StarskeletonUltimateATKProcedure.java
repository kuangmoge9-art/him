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
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class StarskeletonUltimateATKProcedure {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        LivingEntity _livEnt;
        StarskeletonEntity _datEntI;
        block741: {
            LivingEntity _entity;
            LivingEntity _livEnt2;
            block740: {
                int n3;
                int n4;
                block739: {
                    block738: {
                        int n5;
                        int n6;
                        int n7;
                        int n8;
                        int n9;
                        int n10;
                        StarskeletonEntity _datEntI2;
                        block737: {
                            Level _level;
                            block736: {
                                int n11;
                                int n12;
                                int n13;
                                int n14;
                                int n15;
                                int n16;
                                int n17;
                                float f;
                                LivingEntity livingEntity;
                                Mob _mobEnt;
                                Object _mobEnt2;
                                Mob _mobEnt3;
                                Mob _mobEnt4;
                                StarskeletonEntity _datEntI3;
                                block729: {
                                    int n18;
                                    int n19;
                                    block735: {
                                        LivingEntity _entity2;
                                        block734: {
                                            int n20;
                                            int n21;
                                            block733: {
                                                block732: {
                                                    int n22;
                                                    int n23;
                                                    int n24;
                                                    int n25;
                                                    int n26;
                                                    block731: {
                                                        block730: {
                                                            int n27;
                                                            int n28;
                                                            int n29;
                                                            int n30;
                                                            int n31;
                                                            int n32;
                                                            float f2;
                                                            LivingEntity livingEntity2;
                                                            int n33;
                                                            int n34;
                                                            List<Entity> _entfound;
                                                            Mob _mobEnt5;
                                                            LivingEntity _ent;
                                                            block724: {
                                                                int n35;
                                                                int n36;
                                                                int n37;
                                                                Level _level2;
                                                                StarskeletonEntity _datEntI4;
                                                                block728: {
                                                                    Vec3 _center;
                                                                    block727: {
                                                                        int n38;
                                                                        int n39;
                                                                        block726: {
                                                                            block725: {
                                                                                int n40;
                                                                                int n41;
                                                                                int n42;
                                                                                float f3;
                                                                                LivingEntity livingEntity3;
                                                                                int n43;
                                                                                block721: {
                                                                                    int n44;
                                                                                    int n45;
                                                                                    int n46;
                                                                                    int n47;
                                                                                    int n48;
                                                                                    block723: {
                                                                                        void var14_135;
                                                                                        block722: {
                                                                                            int n49;
                                                                                            int n50;
                                                                                            int n51;
                                                                                            float f4;
                                                                                            LivingEntity livingEntity4;
                                                                                            int n52;
                                                                                            int n53;
                                                                                            Mob _mobEnt6;
                                                                                            block717: {
                                                                                                block718: {
                                                                                                    block719: {
                                                                                                        int n54;
                                                                                                        block720: {
                                                                                                            float f5;
                                                                                                            LivingEntity livingEntity5;
                                                                                                            float f6;
                                                                                                            LivingEntity livingEntity6;
                                                                                                            float f7;
                                                                                                            LivingEntity livingEntity7;
                                                                                                            float f8;
                                                                                                            LivingEntity livingEntity8;
                                                                                                            float f9;
                                                                                                            LivingEntity livingEntity9;
                                                                                                            float f10;
                                                                                                            LivingEntity livingEntity10;
                                                                                                            LivingEntity livingEntity11;
                                                                                                            int n55;
                                                                                                            int n56;
                                                                                                            int n57;
                                                                                                            int n58;
                                                                                                            int n59;
                                                                                                            StarskeletonEntity _datEntI5;
                                                                                                            StarskeletonEntity _datEntSetI;
                                                                                                            int n60;
                                                                                                            LivingEntity _entity3;
                                                                                                            if (entity == null) {
                                                                                                                return;
                                                                                                            }
                                                                                                            double theta = 0.0;
                                                                                                            ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                                                                            if (entity instanceof LivingEntity && !(_entity3 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                                _entity3.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 100, 3));
                                                                                                            }
                                                                                                            if (entity instanceof LivingEntity && !(_entity3 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                                _entity3.m_7292_(new MobEffectInstance(MobEffects.f_19603_, 100, 4));
                                                                                                            }
                                                                                                            if (entity instanceof LivingEntity && !(_entity3 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                                _entity3.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 100, 5));
                                                                                                            }
                                                                                                            if (entity instanceof LivingEntity && !(_entity3 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                                _entity3.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 100, 10));
                                                                                                            }
                                                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                                                                            if (entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarskeletonEntity) {
                                                                                                                StarskeletonEntity _datEntSetI2 = (StarskeletonEntity)entity;
                                                                                                                _datEntSetI2.m_20088_().m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)30);
                                                                                                            }
                                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                                n60 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                                                            } else {
                                                                                                                n60 = 0;
                                                                                                            }
                                                                                                            if (n60 <= 0 && !entity.m_5446_().getString().equals("\u65ed\u8861")) {
                                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                                    StarskeletonEntity _datEntSetL = (StarskeletonEntity)entity;
                                                                                                                    _datEntSetL.m_20088_().m_135381_(StarskeletonEntity.DATA_God, (Object)false);
                                                                                                                }
                                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                                    _datEntSetI = (StarskeletonEntity)entity;
                                                                                                                    _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                                                                                                                }
                                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                                    _datEntSetI = (StarskeletonEntity)entity;
                                                                                                                    _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                                                                                                                }
                                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                                    int n61;
                                                                                                                    _datEntSetI = (StarskeletonEntity)entity;
                                                                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                                                        _datEntI5 = (StarskeletonEntity)entity;
                                                                                                                        n61 = (Integer)_datEntI5.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
                                                                                                                    } else {
                                                                                                                        n61 = 0;
                                                                                                                    }
                                                                                                                    synchedEntityData.m_135381_(StarskeletonEntity.DATA_GodTiclk, (Object)(n61 - 1));
                                                                                                                }
                                                                                                            }
                                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                                n59 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
                                                                                                            } else {
                                                                                                                n59 = 0;
                                                                                                            }
                                                                                                            if (n59 < 113 && entity instanceof StarskeletonEntity) {
                                                                                                                _datEntSetI = (StarskeletonEntity)entity;
                                                                                                                _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_GodTiclk, (Object)0);
                                                                                                            }
                                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                                n58 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
                                                                                                            } else {
                                                                                                                n58 = 0;
                                                                                                            }
                                                                                                            if (n58 <= 214) {
                                                                                                                int n62;
                                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                                                                    n62 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
                                                                                                                } else {
                                                                                                                    n62 = 0;
                                                                                                                }
                                                                                                                if (n62 >= 200 && entity instanceof StarskeletonEntity) {
                                                                                                                    ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.sword");
                                                                                                                }
                                                                                                            }
                                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                                n57 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_GodTiclk);
                                                                                                            } else {
                                                                                                                n57 = 0;
                                                                                                            }
                                                                                                            if (n57 == 184) {
                                                                                                                if (world instanceof Level) {
                                                                                                                    Level _level3 = (Level)world;
                                                                                                                    if (!_level3.m_5776_()) {
                                                                                                                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                                                                    } else {
                                                                                                                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                                                                    }
                                                                                                                }
                                                                                                                Vec3 _center2 = new Vec3(x, y, z);
                                                                                                                List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                                                                for (Entity entity2 : _entfound2) {
                                                                                                                    if (entity2 instanceof StarskeletonEntity) continue;
                                                                                                                    double _setval = 6.0;
                                                                                                                    entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                                                        capability.camerashake = _setval;
                                                                                                                        capability.syncPlayerVariables(entity2);
                                                                                                                    });
                                                                                                                }
                                                                                                            }
                                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                                n56 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                                                                            } else {
                                                                                                                n56 = 0;
                                                                                                            }
                                                                                                            if (n56 != 0 && entity instanceof StarskeletonEntity) {
                                                                                                                int n63;
                                                                                                                _datEntSetI = (StarskeletonEntity)entity;
                                                                                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                                    _datEntI5 = (StarskeletonEntity)entity;
                                                                                                                    n63 = (Integer)_datEntI5.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                                                } else {
                                                                                                                    n63 = 0;
                                                                                                                }
                                                                                                                synchedEntityData.m_135381_(StarskeletonEntity.DATA_animationTick, (Object)(n63 + 1));
                                                                                                            }
                                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                                n55 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                                                            } else {
                                                                                                                n55 = 0;
                                                                                                            }
                                                                                                            if (n55 <= 0) break block717;
                                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                                _datEntSetI = (StarskeletonEntity)entity;
                                                                                                                _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_GodTiclk, (Object)234);
                                                                                                            }
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt4 = (Mob)entity;
                                                                                                                livingEntity11 = _mobEnt4.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity11 = null;
                                                                                                            }
                                                                                                            if (livingEntity11 == null) break block718;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt6 = (Mob)entity;
                                                                                                                v12 = _mobEnt6.m_5448_();
                                                                                                            } else {
                                                                                                                v12 = livingEntity10 = null;
                                                                                                            }
                                                                                                            if (livingEntity10 instanceof LivingEntity) {
                                                                                                                LivingEntity _livEnt3 = livingEntity10;
                                                                                                                f10 = _livEnt3.m_21223_();
                                                                                                            } else {
                                                                                                                f10 = -1.0f;
                                                                                                            }
                                                                                                            if (!(f10 > 0.0f)) break block719;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity9 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity9 = null;
                                                                                                            }
                                                                                                            if (livingEntity9 != null) {
                                                                                                                LivingEntity livingEntity12;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    Mob _mobEnt7 = (Mob)entity;
                                                                                                                    livingEntity12 = _mobEnt7.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity12 = null;
                                                                                                                }
                                                                                                                f9 = entity.m_20270_(livingEntity12);
                                                                                                            } else {
                                                                                                                f9 = -1.0f;
                                                                                                            }
                                                                                                            if (f9 >= 20.0f) {
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
                                                                                                                LivingEntity livingEntity13;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    Mob _mobEnt8 = (Mob)entity;
                                                                                                                    livingEntity13 = _mobEnt8.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity13 = null;
                                                                                                                }
                                                                                                                f8 = entity.m_20270_(livingEntity13);
                                                                                                            } else {
                                                                                                                f8 = -1.0f;
                                                                                                            }
                                                                                                            if (f8 > 1.0f) {
                                                                                                                int n64;
                                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                                    _datEntI2 = (StarskeletonEntity)entity;
                                                                                                                    n64 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                                                                                } else {
                                                                                                                    n64 = 0;
                                                                                                                }
                                                                                                                if (n64 == 0) {
                                                                                                                    LivingEntity livingEntity14;
                                                                                                                    LivingEntity livingEntity15;
                                                                                                                    LivingEntity livingEntity16;
                                                                                                                    LivingEntity livingEntity17;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                                        livingEntity17 = _mobEnt3.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity17 = null;
                                                                                                                    }
                                                                                                                    double d = livingEntity17.m_20185_();
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt2 = (Mob)entity;
                                                                                                                        livingEntity16 = _mobEnt2.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity16 = null;
                                                                                                                    }
                                                                                                                    double d2 = livingEntity16.m_20186_();
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                                        livingEntity15 = _mobEnt3.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity15 = null;
                                                                                                                    }
                                                                                                                    double d3 = d2 + (double)livingEntity15.m_20206_() / 1.5;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                                        livingEntity14 = _mobEnt3.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity14 = null;
                                                                                                                    }
                                                                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity14.m_20189_()));
                                                                                                                }
                                                                                                            }
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity7 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity7 = null;
                                                                                                            }
                                                                                                            if (livingEntity7 != null) {
                                                                                                                LivingEntity livingEntity18;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    Mob _mobEnt9 = (Mob)entity;
                                                                                                                    livingEntity18 = _mobEnt9.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity18 = null;
                                                                                                                }
                                                                                                                f7 = entity.m_20270_(livingEntity18);
                                                                                                            } else {
                                                                                                                f7 = -1.0f;
                                                                                                            }
                                                                                                            if (f7 > 8.0f) {
                                                                                                                float f11;
                                                                                                                LivingEntity livingEntity19;
                                                                                                                LivingEntity livingEntity20;
                                                                                                                float f12;
                                                                                                                LivingEntity livingEntity21;
                                                                                                                LivingEntity livingEntity22;
                                                                                                                float f13;
                                                                                                                LivingEntity livingEntity23;
                                                                                                                LivingEntity livingEntity24;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt2 = (Mob)entity;
                                                                                                                    livingEntity24 = _mobEnt2.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity24 = null;
                                                                                                                }
                                                                                                                double d = livingEntity24.m_20185_() - entity.m_20185_();
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                                    livingEntity23 = _mobEnt3.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity23 = null;
                                                                                                                }
                                                                                                                if (livingEntity23 != null) {
                                                                                                                    LivingEntity livingEntity25;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt = (Mob)entity;
                                                                                                                        livingEntity25 = _mobEnt.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity25 = null;
                                                                                                                    }
                                                                                                                    f13 = entity.m_20270_(livingEntity25);
                                                                                                                } else {
                                                                                                                    f13 = -1.0f;
                                                                                                                }
                                                                                                                double d4 = d / (double)f13 * 1.2;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt2 = (Mob)entity;
                                                                                                                    livingEntity22 = _mobEnt2.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity22 = null;
                                                                                                                }
                                                                                                                double d5 = livingEntity22.m_20186_() - entity.m_20186_();
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                                    livingEntity21 = _mobEnt3.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity21 = null;
                                                                                                                }
                                                                                                                if (livingEntity21 != null) {
                                                                                                                    LivingEntity livingEntity26;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt = (Mob)entity;
                                                                                                                        livingEntity26 = _mobEnt.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity26 = null;
                                                                                                                    }
                                                                                                                    f12 = entity.m_20270_(livingEntity26);
                                                                                                                } else {
                                                                                                                    f12 = -1.0f;
                                                                                                                }
                                                                                                                double d6 = d5 / (double)f12 * 1.2;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt2 = (Mob)entity;
                                                                                                                    livingEntity20 = _mobEnt2.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity20 = null;
                                                                                                                }
                                                                                                                double d7 = livingEntity20.m_20189_() - entity.m_20189_();
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                                    livingEntity19 = _mobEnt3.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity19 = null;
                                                                                                                }
                                                                                                                if (livingEntity19 != null) {
                                                                                                                    LivingEntity livingEntity27;
                                                                                                                    if (entity instanceof Mob) {
                                                                                                                        _mobEnt = (Mob)entity;
                                                                                                                        livingEntity27 = _mobEnt.m_5448_();
                                                                                                                    } else {
                                                                                                                        livingEntity27 = null;
                                                                                                                    }
                                                                                                                    f11 = entity.m_20270_(livingEntity27);
                                                                                                                } else {
                                                                                                                    f11 = -1.0f;
                                                                                                                }
                                                                                                                entity.m_20256_(new Vec3(d4, d6, d7 / (double)f11 * 1.2));
                                                                                                            }
                                                                                                            if (entity instanceof Mob) {
                                                                                                                Mob mob = (Mob)entity;
                                                                                                                livingEntity6 = mob.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity6 = null;
                                                                                                            }
                                                                                                            if (livingEntity6 != null) {
                                                                                                                LivingEntity livingEntity28;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    Mob _mobEnt10 = (Mob)entity;
                                                                                                                    livingEntity28 = _mobEnt10.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity28 = null;
                                                                                                                }
                                                                                                                f6 = entity.m_20270_(livingEntity28);
                                                                                                            } else {
                                                                                                                f6 = -1.0f;
                                                                                                            }
                                                                                                            if (!(f6 <= 12.0f)) break block717;
                                                                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) break block720;
                                                                                                            if (entity instanceof Mob) {
                                                                                                                _mobEnt = (Mob)entity;
                                                                                                                livingEntity5 = _mobEnt.m_5448_();
                                                                                                            } else {
                                                                                                                livingEntity5 = null;
                                                                                                            }
                                                                                                            if (livingEntity5 != null) {
                                                                                                                LivingEntity livingEntity29;
                                                                                                                if (entity instanceof Mob) {
                                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                                    livingEntity29 = _mobEnt3.m_5448_();
                                                                                                                } else {
                                                                                                                    livingEntity29 = null;
                                                                                                                }
                                                                                                                f5 = entity.m_20270_(livingEntity29);
                                                                                                            } else {
                                                                                                                f5 = -1.0f;
                                                                                                            }
                                                                                                            if (!(f5 <= 8.0f)) break block717;
                                                                                                        }
                                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                                            StarskeletonEntity _datEntI6 = (StarskeletonEntity)entity;
                                                                                                            n54 = (Integer)_datEntI6.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                                                                        } else {
                                                                                                            n54 = 0;
                                                                                                        }
                                                                                                        if (n54 == 0 && entity instanceof StarskeletonEntity) {
                                                                                                            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                                                            _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6));
                                                                                                        }
                                                                                                        break block717;
                                                                                                    }
                                                                                                    if (entity.m_20186_() < -63.0) {
                                                                                                        entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                                                                    }
                                                                                                    break block717;
                                                                                                }
                                                                                                if (entity.m_20186_() < -63.0) {
                                                                                                    entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                n53 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                                                            } else {
                                                                                                n53 = 0;
                                                                                            }
                                                                                            if (n53 == 1) {
                                                                                                int n65;
                                                                                                int n66;
                                                                                                int n67;
                                                                                                int n68;
                                                                                                float f14;
                                                                                                LivingEntity livingEntity30;
                                                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                                        ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.rush2");
                                                                                                    }
                                                                                                } else if (entity instanceof StarskeletonEntity) {
                                                                                                    ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.backflip2");
                                                                                                }
                                                                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt4 = (Mob)entity;
                                                                                                    livingEntity30 = _mobEnt4.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity30 = null;
                                                                                                }
                                                                                                if (livingEntity30 != null) {
                                                                                                    LivingEntity livingEntity31;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt6 = (Mob)entity;
                                                                                                        livingEntity31 = _mobEnt6.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity31 = null;
                                                                                                    }
                                                                                                    f14 = entity.m_20270_(livingEntity31);
                                                                                                } else {
                                                                                                    f14 = -1.0f;
                                                                                                }
                                                                                                if (f14 > 1.0f) {
                                                                                                    LivingEntity livingEntity32;
                                                                                                    LivingEntity livingEntity33;
                                                                                                    LivingEntity livingEntity34;
                                                                                                    LivingEntity livingEntity35;
                                                                                                    LivingEntity livingEntity36;
                                                                                                    LivingEntity livingEntity37;
                                                                                                    LivingEntity livingEntity38;
                                                                                                    LivingEntity livingEntity39;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob mob = (Mob)entity;
                                                                                                        v59 = mob.m_5448_();
                                                                                                    } else {
                                                                                                        v59 = _ent = null;
                                                                                                    }
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob mob = (Mob)entity;
                                                                                                        livingEntity39 = mob.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity39 = null;
                                                                                                    }
                                                                                                    double d = livingEntity39.m_20185_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob mob = (Mob)entity;
                                                                                                        livingEntity38 = mob.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity38 = null;
                                                                                                    }
                                                                                                    int n69 = (int)livingEntity38.m_20185_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob mob = (Mob)entity;
                                                                                                        livingEntity37 = mob.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity37 = null;
                                                                                                    }
                                                                                                    double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n69, (int)livingEntity37.m_20189_());
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob mob = (Mob)entity;
                                                                                                        livingEntity36 = mob.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity36 = null;
                                                                                                    }
                                                                                                    _ent.m_6021_(d, d8, livingEntity36.m_20189_());
                                                                                                    if (_ent instanceof ServerPlayer) {
                                                                                                        LivingEntity livingEntity40;
                                                                                                        LivingEntity livingEntity41;
                                                                                                        LivingEntity livingEntity42;
                                                                                                        LivingEntity livingEntity43;
                                                                                                        ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob _mobEnt11 = (Mob)entity;
                                                                                                            livingEntity43 = _mobEnt11.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity43 = null;
                                                                                                        }
                                                                                                        double d9 = livingEntity43.m_20185_();
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt = (Mob)entity;
                                                                                                            livingEntity42 = _mobEnt.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity42 = null;
                                                                                                        }
                                                                                                        int n70 = (int)livingEntity42.m_20185_();
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt3 = (Mob)entity;
                                                                                                            livingEntity41 = _mobEnt3.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity41 = null;
                                                                                                        }
                                                                                                        double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n70, (int)livingEntity41.m_20189_());
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt2 = (Mob)entity;
                                                                                                            livingEntity40 = _mobEnt2.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity40 = null;
                                                                                                        }
                                                                                                        serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity40.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                                                    }
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt5 = (Mob)entity;
                                                                                                        livingEntity35 = _mobEnt5.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity35 = null;
                                                                                                    }
                                                                                                    double d11 = livingEntity35.m_20185_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob mob = (Mob)entity;
                                                                                                        livingEntity34 = mob.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity34 = null;
                                                                                                    }
                                                                                                    double d12 = livingEntity34.m_20186_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt5 = (Mob)entity;
                                                                                                        livingEntity33 = _mobEnt5.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity33 = null;
                                                                                                    }
                                                                                                    double d13 = d12 + (double)livingEntity33.m_20206_() / 1.5;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt5 = (Mob)entity;
                                                                                                        livingEntity32 = _mobEnt5.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity32 = null;
                                                                                                    }
                                                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d11, d13, livingEntity32.m_20189_()));
                                                                                                }
                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                                                    n68 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n68 = 0;
                                                                                                }
                                                                                                if (n68 == 24) {
                                                                                                    float f15;
                                                                                                    LivingEntity livingEntity44;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt6 = (Mob)entity;
                                                                                                        livingEntity44 = _mobEnt6.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity44 = null;
                                                                                                    }
                                                                                                    if (livingEntity44 != null) {
                                                                                                        LivingEntity livingEntity45;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            _mobEnt5 = (Mob)entity;
                                                                                                            livingEntity45 = _mobEnt5.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity45 = null;
                                                                                                        }
                                                                                                        f15 = entity.m_20270_(livingEntity45);
                                                                                                    } else {
                                                                                                        f15 = -1.0f;
                                                                                                    }
                                                                                                    if (f15 > 1.0f) {
                                                                                                        LivingEntity livingEntity46;
                                                                                                        LivingEntity livingEntity47;
                                                                                                        LivingEntity livingEntity48;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity48 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity48 = null;
                                                                                                        }
                                                                                                        double d = (livingEntity48.m_20185_() - entity.m_20185_()) * 2.0;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity47 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity47 = null;
                                                                                                        }
                                                                                                        double d14 = (livingEntity47.m_20186_() - entity.m_20186_()) * 2.0;
                                                                                                        if (entity instanceof Mob) {
                                                                                                            Mob mob = (Mob)entity;
                                                                                                            livingEntity46 = mob.m_5448_();
                                                                                                        } else {
                                                                                                            livingEntity46 = null;
                                                                                                        }
                                                                                                        entity.m_20256_(new Vec3(d, d14, (livingEntity46.m_20189_() - entity.m_20189_()) * 2.0));
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                                                    n67 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n67 = 0;
                                                                                                }
                                                                                                if (n67 == 26) {
                                                                                                    Level _level4;
                                                                                                    if (world instanceof Level) {
                                                                                                        _level4 = (Level)world;
                                                                                                        if (!_level4.m_5776_()) {
                                                                                                            _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                                        } else {
                                                                                                            _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                                        }
                                                                                                    }
                                                                                                    if (world instanceof Level) {
                                                                                                        _level4 = (Level)world;
                                                                                                        if (!_level4.m_5776_()) {
                                                                                                            _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                                                        } else {
                                                                                                            _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                                                        }
                                                                                                    }
                                                                                                    Vec3 _center3 = new Vec3(x, y, z);
                                                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                                                                    for (Entity entityiterator : _entfound) {
                                                                                                        float f16;
                                                                                                        if (entityiterator instanceof StarskeletonEntity) continue;
                                                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                                                        if (entityiterator instanceof LivingEntity) {
                                                                                                            _livEnt = (LivingEntity)entityiterator;
                                                                                                            f16 = _livEnt.m_21233_();
                                                                                                        } else {
                                                                                                            f16 = -1.0f;
                                                                                                        }
                                                                                                        entityiterator.m_6469_(damageSource, f16 / 4.0f + 10.0f);
                                                                                                    }
                                                                                                    if (entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                                                        _level4 = (ServerLevel)world;
                                                                                                        _level4.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level4, 4, "", (Component)Component.m_237113_((String)""), _level4.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                                                    }
                                                                                                    for (int index0 = 0; index0 < 200; ++index0) {
                                                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                                                    n66 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n66 = 0;
                                                                                                }
                                                                                                if (n66 == 45 && entity instanceof StarskeletonEntity) {
                                                                                                    int n71;
                                                                                                    StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                                        _datEntI4 = (StarskeletonEntity)entity;
                                                                                                        n71 = (Integer)_datEntI4.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                                                    } else {
                                                                                                        n71 = 0;
                                                                                                    }
                                                                                                    synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n71 - 1));
                                                                                                }
                                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                                                    n65 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                                } else {
                                                                                                    n65 = 0;
                                                                                                }
                                                                                                if (n65 >= 45) {
                                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                                                                                                    }
                                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                                                                                                    }
                                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                                        ((StarskeletonEntity)entity).setAnimation("empty");
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                                                n52 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                                                            } else {
                                                                                                n52 = 0;
                                                                                            }
                                                                                            if (n52 != 3) break block721;
                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.doublelaser");
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt4 = (Mob)entity;
                                                                                                livingEntity4 = _mobEnt4.m_5448_();
                                                                                            } else {
                                                                                                livingEntity4 = null;
                                                                                            }
                                                                                            if (livingEntity4 != null) {
                                                                                                LivingEntity livingEntity49;
                                                                                                if (entity instanceof Mob) {
                                                                                                    Mob _mobEnt12 = (Mob)entity;
                                                                                                    livingEntity49 = _mobEnt12.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity49 = null;
                                                                                                }
                                                                                                f4 = entity.m_20270_(livingEntity49);
                                                                                            } else {
                                                                                                f4 = -1.0f;
                                                                                            }
                                                                                            if (f4 > 1.0f) {
                                                                                                LivingEntity livingEntity50;
                                                                                                LivingEntity livingEntity51;
                                                                                                LivingEntity livingEntity52;
                                                                                                LivingEntity livingEntity53;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt5 = (Mob)entity;
                                                                                                    livingEntity53 = _mobEnt5.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity53 = null;
                                                                                                }
                                                                                                double d = livingEntity53.m_20185_();
                                                                                                if (entity instanceof Mob) {
                                                                                                    Mob mob = (Mob)entity;
                                                                                                    livingEntity52 = mob.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity52 = null;
                                                                                                }
                                                                                                double d15 = livingEntity52.m_20186_();
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt5 = (Mob)entity;
                                                                                                    livingEntity51 = _mobEnt5.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity51 = null;
                                                                                                }
                                                                                                double d16 = d15 + (double)livingEntity51.m_20206_() / 1.5;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt5 = (Mob)entity;
                                                                                                    livingEntity50 = _mobEnt5.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity50 = null;
                                                                                                }
                                                                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity50.m_20189_()));
                                                                                            }
                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                _datEntI = (StarskeletonEntity)entity;
                                                                                                n51 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                            } else {
                                                                                                n51 = 0;
                                                                                            }
                                                                                            if (n51 == 10) break block722;
                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                StarskeletonEntity _datEntI7 = (StarskeletonEntity)entity;
                                                                                                n50 = (Integer)_datEntI7.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                            } else {
                                                                                                n50 = 0;
                                                                                            }
                                                                                            if (n50 == 27) break block722;
                                                                                            if (entity instanceof StarskeletonEntity) {
                                                                                                _datEntI4 = (StarskeletonEntity)entity;
                                                                                                n49 = (Integer)_datEntI4.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                            } else {
                                                                                                n49 = 0;
                                                                                            }
                                                                                            if (n49 != 47) break block723;
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
                                                                                        while (var14_135 < 400) {
                                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-4.0, (double)4.0));
                                                                                            ++var14_135;
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                        _datEntI = (StarskeletonEntity)entity;
                                                                                        n48 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n48 = 0;
                                                                                    }
                                                                                    if (n48 >= 10) {
                                                                                        int n72;
                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                            StarskeletonEntity _datEntI8 = (StarskeletonEntity)entity;
                                                                                            n72 = (Integer)_datEntI8.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n72 = 0;
                                                                                        }
                                                                                        if (n72 <= 21) {
                                                                                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 24.0, y, z + entity.m_20154_().f_82481_ * 24.0);
                                                                                            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                                            for (Entity entityiterator : list) {
                                                                                                float f17;
                                                                                                if (entityiterator instanceof StarskeletonEntity || entityiterator instanceof Player) continue;
                                                                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                                                if (entityiterator instanceof LivingEntity) {
                                                                                                    _livEnt2 = (LivingEntity)entityiterator;
                                                                                                    f17 = _livEnt2.m_21233_();
                                                                                                } else {
                                                                                                    f17 = -1.0f;
                                                                                                }
                                                                                                entityiterator.m_6469_(damageSource, f17 / 4.0f + 10.0f);
                                                                                                entityiterator.f_19802_ = 0;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                        _datEntI = (StarskeletonEntity)entity;
                                                                                        n47 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n47 = 0;
                                                                                    }
                                                                                    if (n47 >= 27) {
                                                                                        int n73;
                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                            StarskeletonEntity _datEntI9 = (StarskeletonEntity)entity;
                                                                                            n73 = (Integer)_datEntI9.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n73 = 0;
                                                                                        }
                                                                                        if (n73 <= 38) {
                                                                                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 24.0, y, z + entity.m_20154_().f_82481_ * 24.0);
                                                                                            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                                            for (Entity entityiterator : list) {
                                                                                                float f18;
                                                                                                if (entityiterator instanceof StarskeletonEntity || entityiterator instanceof Player) continue;
                                                                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                                                if (entityiterator instanceof LivingEntity) {
                                                                                                    _livEnt2 = (LivingEntity)entityiterator;
                                                                                                    f18 = _livEnt2.m_21233_();
                                                                                                } else {
                                                                                                    f18 = -1.0f;
                                                                                                }
                                                                                                entityiterator.m_6469_(damageSource, f18 / 4.0f + 10.0f);
                                                                                                entityiterator.f_19802_ = 0;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                        _datEntI = (StarskeletonEntity)entity;
                                                                                        n46 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n46 = 0;
                                                                                    }
                                                                                    if (n46 >= 47) {
                                                                                        int n74;
                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                            StarskeletonEntity _datEntI10 = (StarskeletonEntity)entity;
                                                                                            n74 = (Integer)_datEntI10.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                        } else {
                                                                                            n74 = 0;
                                                                                        }
                                                                                        if (n74 <= 61) {
                                                                                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 24.0, y, z + entity.m_20154_().f_82481_ * 24.0);
                                                                                            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                                            for (Entity entityiterator : list) {
                                                                                                float f19;
                                                                                                if (entityiterator instanceof StarskeletonEntity || entityiterator instanceof Player) continue;
                                                                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                                                if (entityiterator instanceof LivingEntity) {
                                                                                                    _livEnt2 = (LivingEntity)entityiterator;
                                                                                                    f19 = _livEnt2.m_21233_();
                                                                                                } else {
                                                                                                    f19 = -1.0f;
                                                                                                }
                                                                                                entityiterator.m_6469_(damageSource, f19 / 4.0f + 10.0f);
                                                                                                entityiterator.f_19802_ = 0;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                        _datEntI = (StarskeletonEntity)entity;
                                                                                        n45 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n45 = 0;
                                                                                    }
                                                                                    if (n45 == 75 && entity instanceof StarskeletonEntity) {
                                                                                        int n75;
                                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                            _datEntI4 = (StarskeletonEntity)entity;
                                                                                            n75 = (Integer)_datEntI4.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                                        } else {
                                                                                            n75 = 0;
                                                                                        }
                                                                                        synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n75 - 2));
                                                                                    }
                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                        _datEntI = (StarskeletonEntity)entity;
                                                                                        n44 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                    } else {
                                                                                        n44 = 0;
                                                                                    }
                                                                                    if (n44 >= 75) {
                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                                            _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                                                                                        }
                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                                            _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                                                                                        }
                                                                                        if (entity instanceof StarskeletonEntity) {
                                                                                            ((StarskeletonEntity)entity).setAnimation("empty");
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                    _datEntI3 = (StarskeletonEntity)entity;
                                                                                    n43 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                                                } else {
                                                                                    n43 = 0;
                                                                                }
                                                                                if (n43 != 2) break block724;
                                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                                                    if (entity instanceof StarskeletonEntity) {
                                                                                        ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.doubleslash");
                                                                                    }
                                                                                } else if (entity instanceof StarskeletonEntity) {
                                                                                    ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.doubleslash2");
                                                                                }
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt4 = (Mob)entity;
                                                                                    livingEntity3 = _mobEnt4.m_5448_();
                                                                                } else {
                                                                                    livingEntity3 = null;
                                                                                }
                                                                                if (livingEntity3 != null) {
                                                                                    LivingEntity livingEntity54;
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt13 = (Mob)entity;
                                                                                        livingEntity54 = _mobEnt13.m_5448_();
                                                                                    } else {
                                                                                        livingEntity54 = null;
                                                                                    }
                                                                                    f3 = entity.m_20270_(livingEntity54);
                                                                                } else {
                                                                                    f3 = -1.0f;
                                                                                }
                                                                                if (f3 > 1.0f) {
                                                                                    LivingEntity livingEntity55;
                                                                                    LivingEntity livingEntity56;
                                                                                    LivingEntity livingEntity57;
                                                                                    LivingEntity livingEntity58;
                                                                                    LivingEntity livingEntity59;
                                                                                    LivingEntity livingEntity60;
                                                                                    LivingEntity livingEntity61;
                                                                                    LivingEntity livingEntity62;
                                                                                    LivingEntity livingEntity63;
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        v132 = mob.m_5448_();
                                                                                    } else {
                                                                                        v132 = _ent = null;
                                                                                    }
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity63 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity63 = null;
                                                                                    }
                                                                                    double d = livingEntity63.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity62 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity62 = null;
                                                                                    }
                                                                                    int n76 = (int)livingEntity62.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity61 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity61 = null;
                                                                                    }
                                                                                    double d17 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n76, (int)livingEntity61.m_20189_());
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity60 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity60 = null;
                                                                                    }
                                                                                    _ent.m_6021_(d, d17, livingEntity60.m_20189_());
                                                                                    if (_ent instanceof ServerPlayer) {
                                                                                        LivingEntity livingEntity64;
                                                                                        LivingEntity livingEntity65;
                                                                                        LivingEntity livingEntity66;
                                                                                        LivingEntity livingEntity67;
                                                                                        ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                                        if (entity instanceof Mob) {
                                                                                            Mob _mobEnt14 = (Mob)entity;
                                                                                            livingEntity67 = _mobEnt14.m_5448_();
                                                                                        } else {
                                                                                            livingEntity67 = null;
                                                                                        }
                                                                                        double d18 = livingEntity67.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt = (Mob)entity;
                                                                                            livingEntity66 = _mobEnt.m_5448_();
                                                                                        } else {
                                                                                            livingEntity66 = null;
                                                                                        }
                                                                                        int n77 = (int)livingEntity66.m_20185_();
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt3 = (Mob)entity;
                                                                                            livingEntity65 = _mobEnt3.m_5448_();
                                                                                        } else {
                                                                                            livingEntity65 = null;
                                                                                        }
                                                                                        double d19 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n77, (int)livingEntity65.m_20189_());
                                                                                        if (entity instanceof Mob) {
                                                                                            _mobEnt2 = (Mob)entity;
                                                                                            livingEntity64 = _mobEnt2.m_5448_();
                                                                                        } else {
                                                                                            livingEntity64 = null;
                                                                                        }
                                                                                        serverGamePacketListenerImpl.m_9774_(d18, d19, livingEntity64.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                                    }
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt5 = (Mob)entity;
                                                                                        livingEntity59 = _mobEnt5.m_5448_();
                                                                                    } else {
                                                                                        livingEntity59 = null;
                                                                                    }
                                                                                    livingEntity59.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt5 = (Mob)entity;
                                                                                        livingEntity58 = _mobEnt5.m_5448_();
                                                                                    } else {
                                                                                        livingEntity58 = null;
                                                                                    }
                                                                                    double d20 = livingEntity58.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob mob = (Mob)entity;
                                                                                        livingEntity57 = mob.m_5448_();
                                                                                    } else {
                                                                                        livingEntity57 = null;
                                                                                    }
                                                                                    double d21 = livingEntity57.m_20186_();
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt5 = (Mob)entity;
                                                                                        livingEntity56 = _mobEnt5.m_5448_();
                                                                                    } else {
                                                                                        livingEntity56 = null;
                                                                                    }
                                                                                    double d22 = d21 + (double)livingEntity56.m_20206_() / 1.5;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt5 = (Mob)entity;
                                                                                        livingEntity55 = _mobEnt5.m_5448_();
                                                                                    } else {
                                                                                        livingEntity55 = null;
                                                                                    }
                                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d20, d22, livingEntity55.m_20189_()));
                                                                                }
                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                                    n42 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n42 = 0;
                                                                                }
                                                                                if (n42 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                                    ServerLevel _level5 = (ServerLevel)world;
                                                                                    _level5.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level5, 4, "", (Component)Component.m_237113_((String)""), _level5.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                                }
                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                                    n41 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n41 = 0;
                                                                                }
                                                                                if (n41 == 15) break block725;
                                                                                if (entity instanceof StarskeletonEntity) {
                                                                                    StarskeletonEntity _datEntI11 = (StarskeletonEntity)entity;
                                                                                    n40 = (Integer)_datEntI11.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                                } else {
                                                                                    n40 = 0;
                                                                                }
                                                                                if (n40 != 62) break block726;
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
                                                                        if (entity instanceof StarskeletonEntity) {
                                                                            _datEntI = (StarskeletonEntity)entity;
                                                                            n39 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                        } else {
                                                                            n39 = 0;
                                                                        }
                                                                        if (n39 == 17) break block727;
                                                                        if (entity instanceof StarskeletonEntity) {
                                                                            StarskeletonEntity _datEntI12 = (StarskeletonEntity)entity;
                                                                            n38 = (Integer)_datEntI12.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                        } else {
                                                                            n38 = 0;
                                                                        }
                                                                        if (n38 != 64) break block728;
                                                                    }
                                                                    _center = new Vec3(x, y, z);
                                                                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                    for (Entity entityiterator : list) {
                                                                        float f20;
                                                                        if (entityiterator instanceof StarskeletonEntity) continue;
                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                        if (entityiterator instanceof LivingEntity) {
                                                                            _livEnt2 = (LivingEntity)entityiterator;
                                                                            f20 = _livEnt2.m_21233_();
                                                                        } else {
                                                                            f20 = -1.0f;
                                                                        }
                                                                        entityiterator.m_6469_(damageSource, f20 / 4.0f + 1000.0f);
                                                                        if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                                                        if (world instanceof Level) {
                                                                            _level = (Level)world;
                                                                            if (!_level.m_5776_()) {
                                                                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                                                            } else {
                                                                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n37 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n37 = 0;
                                                                }
                                                                if (n37 == 37) {
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
                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
                                                                    for (int index2 = 0; index2 < 32; ++index2) {
                                                                        if (world instanceof ServerLevel) {
                                                                            _level2 = (ServerLevel)world;
                                                                            LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_(_level2);
                                                                            lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                                                            lightningBolt.m_20874_(true);
                                                                            _level2.m_7967_((Entity)lightningBolt);
                                                                        }
                                                                        if (!(world instanceof ServerLevel)) continue;
                                                                        _level2 = (ServerLevel)world;
                                                                        Entity entity3 = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                                                        if (entity3 == null) continue;
                                                                        entity3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                    }
                                                                    Vec3 _center = new Vec3(x, y, z);
                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                    for (Entity entityiterator : _entfound) {
                                                                        float f21;
                                                                        if (entityiterator instanceof StarskeletonEntity) continue;
                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                        if (entityiterator instanceof LivingEntity) {
                                                                            _livEnt = (LivingEntity)entityiterator;
                                                                            f21 = _livEnt.m_21233_();
                                                                        } else {
                                                                            f21 = -1.0f;
                                                                        }
                                                                        entityiterator.m_6469_(damageSource, f21 / 4.0f + 1000.0f);
                                                                        double _setval = 6.0;
                                                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entityiterator);
                                                                        });
                                                                        if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                                                                        entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n36 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n36 = 0;
                                                                }
                                                                if (n36 == 82 && entity instanceof StarskeletonEntity) {
                                                                    int n78;
                                                                    StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        _datEntI4 = (StarskeletonEntity)entity;
                                                                        n78 = (Integer)_datEntI4.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                    } else {
                                                                        n78 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n78 - 2));
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n35 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n35 = 0;
                                                                }
                                                                if (n35 >= 82) {
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        ((StarskeletonEntity)entity).setAnimation("empty");
                                                                    }
                                                                }
                                                            }
                                                            if (entity instanceof StarskeletonEntity) {
                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                n34 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                            } else {
                                                                n34 = 0;
                                                            }
                                                            if (n34 == 4) {
                                                                int n79;
                                                                int n80;
                                                                int n81;
                                                                int n82;
                                                                int n83;
                                                                int n84;
                                                                int n85;
                                                                int n86;
                                                                int n87;
                                                                float f22;
                                                                LivingEntity livingEntity68;
                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.swordups");
                                                                    }
                                                                } else if (entity instanceof StarskeletonEntity) {
                                                                    ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.swordups2");
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity68 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity68 = null;
                                                                }
                                                                if (livingEntity68 != null) {
                                                                    LivingEntity livingEntity69;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt15 = (Mob)entity;
                                                                        livingEntity69 = _mobEnt15.m_5448_();
                                                                    } else {
                                                                        livingEntity69 = null;
                                                                    }
                                                                    f22 = entity.m_20270_(livingEntity69);
                                                                } else {
                                                                    f22 = -1.0f;
                                                                }
                                                                if (f22 > 1.0f) {
                                                                    LivingEntity livingEntity70;
                                                                    LivingEntity livingEntity71;
                                                                    LivingEntity livingEntity72;
                                                                    LivingEntity livingEntity73;
                                                                    LivingEntity livingEntity74;
                                                                    LivingEntity livingEntity75;
                                                                    LivingEntity livingEntity76;
                                                                    LivingEntity livingEntity77;
                                                                    LivingEntity livingEntity78;
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        v174 = mob.m_5448_();
                                                                    } else {
                                                                        v174 = _ent = null;
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity78 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity78 = null;
                                                                    }
                                                                    double d = livingEntity78.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity77 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity77 = null;
                                                                    }
                                                                    int n88 = (int)livingEntity77.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity76 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity76 = null;
                                                                    }
                                                                    double d23 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n88, (int)livingEntity76.m_20189_());
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity75 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity75 = null;
                                                                    }
                                                                    _ent.m_6021_(d, d23, livingEntity75.m_20189_());
                                                                    if (_ent instanceof ServerPlayer) {
                                                                        LivingEntity livingEntity79;
                                                                        LivingEntity livingEntity80;
                                                                        LivingEntity livingEntity81;
                                                                        LivingEntity livingEntity82;
                                                                        ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt16 = (Mob)entity;
                                                                            livingEntity82 = _mobEnt16.m_5448_();
                                                                        } else {
                                                                            livingEntity82 = null;
                                                                        }
                                                                        double d24 = livingEntity82.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt = (Mob)entity;
                                                                            livingEntity81 = _mobEnt.m_5448_();
                                                                        } else {
                                                                            livingEntity81 = null;
                                                                        }
                                                                        int n89 = (int)livingEntity81.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt3 = (Mob)entity;
                                                                            livingEntity80 = _mobEnt3.m_5448_();
                                                                        } else {
                                                                            livingEntity80 = null;
                                                                        }
                                                                        double d25 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n89, (int)livingEntity80.m_20189_());
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt2 = (Mob)entity;
                                                                            livingEntity79 = _mobEnt2.m_5448_();
                                                                        } else {
                                                                            livingEntity79 = null;
                                                                        }
                                                                        serverGamePacketListenerImpl.m_9774_(d24, d25, livingEntity79.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                    }
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt5 = (Mob)entity;
                                                                        livingEntity74 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        livingEntity74 = null;
                                                                    }
                                                                    livingEntity74.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt5 = (Mob)entity;
                                                                        livingEntity73 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        livingEntity73 = null;
                                                                    }
                                                                    double d26 = livingEntity73.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        Mob mob = (Mob)entity;
                                                                        livingEntity72 = mob.m_5448_();
                                                                    } else {
                                                                        livingEntity72 = null;
                                                                    }
                                                                    double d27 = livingEntity72.m_20186_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt5 = (Mob)entity;
                                                                        livingEntity71 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        livingEntity71 = null;
                                                                    }
                                                                    double d28 = d27 + (double)livingEntity71.m_20206_() / 1.5;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt5 = (Mob)entity;
                                                                        livingEntity70 = _mobEnt5.m_5448_();
                                                                    } else {
                                                                        livingEntity70 = null;
                                                                    }
                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d26, d28, livingEntity70.m_20189_()));
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n87 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n87 = 0;
                                                                }
                                                                if (n87 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                    ServerLevel _level8 = (ServerLevel)world;
                                                                    _level8.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level8, 4, "", (Component)Component.m_237113_((String)""), _level8.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n86 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n86 = 0;
                                                                }
                                                                if (n86 == 18) {
                                                                    if (world instanceof Level) {
                                                                        Level _level9 = (Level)world;
                                                                        if (!_level9.m_5776_()) {
                                                                            _level9.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                        } else {
                                                                            _level9.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 0.0, 0.0);
                                                                    Vec3 _center = new Vec3(x, y, z);
                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                    for (Entity entityiterator : _entfound) {
                                                                        float f23;
                                                                        if (entityiterator instanceof StarskeletonEntity) continue;
                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                        if (entityiterator instanceof LivingEntity) {
                                                                            _livEnt = (LivingEntity)entityiterator;
                                                                            f23 = _livEnt.m_21233_();
                                                                        } else {
                                                                            f23 = -1.0f;
                                                                        }
                                                                        entityiterator.m_6469_(damageSource, f23 / 4.0f + 1.0f);
                                                                    }
                                                                    for (int index3 = 0; index3 < 200; ++index3) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.5, (double)1.5), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                                    }
                                                                    for (int index4 = 0; index4 < 400; ++index4) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 4.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n85 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n85 = 0;
                                                                }
                                                                if (n85 == 40) {
                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ZHAN.get()), x, y + 8.0, z, 0.0, 0.0, 0.0);
                                                                    if (world instanceof Level) {
                                                                        Level _level10 = (Level)world;
                                                                        if (!_level10.m_5776_()) {
                                                                            _level10.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                        } else {
                                                                            _level10.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.BLADERUSH.get()), x + entity.m_20154_().f_82479_ * 2.0, y + 3.0, z + entity.m_20154_().f_82481_ * 2.0, 0.0, 0.0, 0.0);
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n84 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n84 = 0;
                                                                }
                                                                if (n84 >= 40) {
                                                                    int n90;
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        StarskeletonEntity _datEntI13 = (StarskeletonEntity)entity;
                                                                        n90 = (Integer)_datEntI13.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                    } else {
                                                                        n90 = 0;
                                                                    }
                                                                    if (n90 <= 50) {
                                                                        for (int index5 = 0; index5 < 2; ++index5) {
                                                                            if (!(world instanceof ServerLevel)) continue;
                                                                            ServerLevel serverLevel = (ServerLevel)world;
                                                                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.SWORDSOFSTAR.get()).m_262496_(serverLevel, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)(y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)80, (int)120)), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                                                            if (entityToSpawn == null) continue;
                                                                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                        }
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n83 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n83 = 0;
                                                                }
                                                                if (n83 == 67 && world instanceof Level) {
                                                                    Level _level11 = (Level)world;
                                                                    if (!_level11.m_5776_()) {
                                                                        _level11.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                    } else {
                                                                        _level11.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n82 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n82 = 0;
                                                                }
                                                                if (n82 == 69) {
                                                                    if (world instanceof Level) {
                                                                        Level _level12 = (Level)world;
                                                                        if (!_level12.m_5776_()) {
                                                                            _level12.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                        } else {
                                                                            _level12.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    Vec3 _center = new Vec3(x, y, z);
                                                                    List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                    for (Entity entityiterator : _entfound3) {
                                                                        float f24;
                                                                        if (entityiterator instanceof StarskeletonEntity) continue;
                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                        if (entityiterator instanceof LivingEntity) {
                                                                            _livEnt = (LivingEntity)entityiterator;
                                                                            f24 = _livEnt.m_21233_();
                                                                        } else {
                                                                            f24 = -1.0f;
                                                                        }
                                                                        entityiterator.m_6469_(damageSource, f24 / 4.0f + 1000.0f);
                                                                        double _setval = 3.0;
                                                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entityiterator);
                                                                        });
                                                                        if (entityiterator instanceof Player || entityiterator instanceof OriginallightningEntity || !(entityiterator instanceof LivingEntity)) continue;
                                                                        if (world instanceof Level) {
                                                                            Level _level13 = (Level)world;
                                                                            if (!_level13.m_5776_()) {
                                                                                _level13.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                                                            } else {
                                                                                _level13.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                                                            }
                                                                        }
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n81 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n81 = 0;
                                                                }
                                                                if (n81 == 90) {
                                                                    int n91;
                                                                    LivingEntity _entity5;
                                                                    if (entity instanceof LivingEntity && !(_entity5 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                        _entity5.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                                                    }
                                                                    if (world instanceof Level) {
                                                                        Level _level14 = (Level)world;
                                                                        if (!_level14.m_5776_()) {
                                                                            _level14.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                        } else {
                                                                            _level14.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    if (world instanceof Level) {
                                                                        Level _level15 = (Level)world;
                                                                        if (!_level15.m_5776_()) {
                                                                            _level15.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                        } else {
                                                                            _level15.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
                                                                    for (int index6 = 0; index6 < 32; ++index6) {
                                                                        if (world instanceof ServerLevel) {
                                                                            ServerLevel _level16 = (ServerLevel)world;
                                                                            LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level16);
                                                                            lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                                                                            lightningBolt.m_20874_(true);
                                                                            _level16.m_7967_((Entity)lightningBolt);
                                                                        }
                                                                        if (!(world instanceof ServerLevel)) continue;
                                                                        ServerLevel _level17 = (ServerLevel)world;
                                                                        Entity entity4 = ((EntityType)UltimateskeletonsModEntities.ORIGINALLIGHTNING.get()).m_262496_(_level17, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                                                        if (entity4 == null) continue;
                                                                        entity4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                    }
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        StarskeletonEntity _datEntI14 = (StarskeletonEntity)entity;
                                                                        n91 = (Integer)_datEntI14.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                    } else {
                                                                        n91 = 0;
                                                                    }
                                                                    if (n91 <= 5 && entity instanceof Mob) {
                                                                        Mob _entity6 = (Mob)entity;
                                                                        _entity6.m_6710_(null);
                                                                    }
                                                                    Vec3 _center = new Vec3(x, y, z);
                                                                    List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                                    for (Entity entityiterator : _entfound4) {
                                                                        int n92;
                                                                        float f25;
                                                                        if (entityiterator instanceof StarskeletonEntity) continue;
                                                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                        if (entityiterator instanceof LivingEntity) {
                                                                            _livEnt = (LivingEntity)entityiterator;
                                                                            f25 = _livEnt.m_21233_();
                                                                        } else {
                                                                            f25 = -1.0f;
                                                                        }
                                                                        entityiterator.m_6469_(damageSource, f25 / 4.0f + 1000.0f);
                                                                        double _setval = 6.0;
                                                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                            capability.camerashake = _setval;
                                                                            capability.syncPlayerVariables(entityiterator);
                                                                        });
                                                                        if (entityiterator instanceof Player || entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                                                                        entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                                                        if (entityiterator instanceof Titangodentity) continue;
                                                                        if (entity instanceof StarskeletonEntity) {
                                                                            StarskeletonEntity _datEntI15 = (StarskeletonEntity)entity;
                                                                            n92 = (Integer)_datEntI15.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                        } else {
                                                                            n92 = 0;
                                                                        }
                                                                        if (n92 > 5) continue;
                                                                        Deathlist.normalattack(entityiterator);
                                                                    }
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n80 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n80 = 0;
                                                                }
                                                                if (n80 == 107 && entity instanceof StarskeletonEntity) {
                                                                    int n93;
                                                                    StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        StarskeletonEntity _datEntI16 = (StarskeletonEntity)entity;
                                                                        n93 = (Integer)_datEntI16.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                                                    } else {
                                                                        n93 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n93 - 3));
                                                                }
                                                                if (entity instanceof StarskeletonEntity) {
                                                                    _datEntI = (StarskeletonEntity)entity;
                                                                    n79 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                                } else {
                                                                    n79 = 0;
                                                                }
                                                                if (n79 >= 107) {
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                                                        _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                                                                    }
                                                                    if (entity instanceof StarskeletonEntity) {
                                                                        ((StarskeletonEntity)entity).setAnimation("empty");
                                                                    }
                                                                }
                                                            }
                                                            if (entity instanceof StarskeletonEntity) {
                                                                _datEntI3 = (StarskeletonEntity)entity;
                                                                n33 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                                            } else {
                                                                n33 = 0;
                                                            }
                                                            if (n33 != 5) break block729;
                                                            if (entity instanceof StarskeletonEntity) {
                                                                ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.luankan");
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity2 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity2 = null;
                                                            }
                                                            if (livingEntity2 != null) {
                                                                LivingEntity livingEntity83;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt17 = (Mob)entity;
                                                                    livingEntity83 = _mobEnt17.m_5448_();
                                                                } else {
                                                                    livingEntity83 = null;
                                                                }
                                                                f2 = entity.m_20270_(livingEntity83);
                                                            } else {
                                                                f2 = -1.0f;
                                                            }
                                                            if (f2 > 1.0f) {
                                                                LivingEntity livingEntity84;
                                                                LivingEntity livingEntity85;
                                                                LivingEntity livingEntity86;
                                                                LivingEntity livingEntity87;
                                                                LivingEntity livingEntity88;
                                                                Mob _mobEnt18;
                                                                LivingEntity livingEntity89;
                                                                LivingEntity livingEntity90;
                                                                LivingEntity livingEntity91;
                                                                LivingEntity livingEntity92;
                                                                LivingEntity _ent2;
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    v222 = mob.m_5448_();
                                                                } else {
                                                                    v222 = _ent2 = null;
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity92 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity92 = null;
                                                                }
                                                                double d = livingEntity92.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity91 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity91 = null;
                                                                }
                                                                int n94 = (int)livingEntity91.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity90 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity90 = null;
                                                                }
                                                                double d29 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n94, (int)livingEntity90.m_20189_());
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity89 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity89 = null;
                                                                }
                                                                _ent2.m_6021_(d, d29, livingEntity89.m_20189_());
                                                                if (_ent2 instanceof ServerPlayer) {
                                                                    LivingEntity livingEntity93;
                                                                    LivingEntity livingEntity94;
                                                                    LivingEntity livingEntity95;
                                                                    LivingEntity livingEntity96;
                                                                    ServerPlayer serverPlayer = (ServerPlayer)_ent2;
                                                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                    if (entity instanceof Mob) {
                                                                        Mob _mobEnt19 = (Mob)entity;
                                                                        livingEntity96 = _mobEnt19.m_5448_();
                                                                    } else {
                                                                        livingEntity96 = null;
                                                                    }
                                                                    double d30 = livingEntity96.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt = (Mob)entity;
                                                                        livingEntity95 = _mobEnt.m_5448_();
                                                                    } else {
                                                                        livingEntity95 = null;
                                                                    }
                                                                    int n95 = (int)livingEntity95.m_20185_();
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity94 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity94 = null;
                                                                    }
                                                                    double d31 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n95, (int)livingEntity94.m_20189_());
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity93 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity93 = null;
                                                                    }
                                                                    serverGamePacketListenerImpl.m_9774_(d30, d31, livingEntity93.m_20189_(), _ent2.m_146908_(), _ent2.m_146909_());
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt18 = (Mob)entity;
                                                                    livingEntity88 = _mobEnt18.m_5448_();
                                                                } else {
                                                                    livingEntity88 = null;
                                                                }
                                                                livingEntity88.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt18 = (Mob)entity;
                                                                    livingEntity87 = _mobEnt18.m_5448_();
                                                                } else {
                                                                    livingEntity87 = null;
                                                                }
                                                                double d32 = livingEntity87.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob mob = (Mob)entity;
                                                                    livingEntity86 = mob.m_5448_();
                                                                } else {
                                                                    livingEntity86 = null;
                                                                }
                                                                double d33 = livingEntity86.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt18 = (Mob)entity;
                                                                    livingEntity85 = _mobEnt18.m_5448_();
                                                                } else {
                                                                    livingEntity85 = null;
                                                                }
                                                                double d34 = d33 + (double)livingEntity85.m_20206_() / 1.5;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt18 = (Mob)entity;
                                                                    livingEntity84 = _mobEnt18.m_5448_();
                                                                } else {
                                                                    livingEntity84 = null;
                                                                }
                                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d32, d34, livingEntity84.m_20189_()));
                                                            }
                                                            if (entity instanceof StarskeletonEntity) {
                                                                _datEntI = (StarskeletonEntity)entity;
                                                                n32 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n32 = 0;
                                                            }
                                                            if (n32 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                ServerLevel _level18 = (ServerLevel)world;
                                                                _level18.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level18, 4, "", (Component)Component.m_237113_((String)""), _level18.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                            }
                                                            if (entity instanceof StarskeletonEntity) {
                                                                _datEntI = (StarskeletonEntity)entity;
                                                                n31 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n31 = 0;
                                                            }
                                                            if (n31 == 20) break block730;
                                                            if (entity instanceof StarskeletonEntity) {
                                                                StarskeletonEntity _datEntI17 = (StarskeletonEntity)entity;
                                                                n30 = (Integer)_datEntI17.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n30 = 0;
                                                            }
                                                            if (n30 == 27) break block730;
                                                            if (entity instanceof StarskeletonEntity) {
                                                                StarskeletonEntity _datEntI18 = (StarskeletonEntity)entity;
                                                                n29 = (Integer)_datEntI18.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n29 = 0;
                                                            }
                                                            if (n29 == 47) break block730;
                                                            if (entity instanceof StarskeletonEntity) {
                                                                StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                                                                n28 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n28 = 0;
                                                            }
                                                            if (n28 == 55) break block730;
                                                            if (entity instanceof StarskeletonEntity) {
                                                                StarskeletonEntity _datEntI19 = (StarskeletonEntity)entity;
                                                                n27 = (Integer)_datEntI19.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n27 = 0;
                                                            }
                                                            if (n27 != 75) break block731;
                                                        }
                                                        if (world instanceof Level) {
                                                            Level _level19 = (Level)world;
                                                            if (!_level19.m_5776_()) {
                                                                _level19.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                            } else {
                                                                _level19.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof StarskeletonEntity) {
                                                        _datEntI = (StarskeletonEntity)entity;
                                                        n26 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                    } else {
                                                        n26 = 0;
                                                    }
                                                    if (n26 == 22) break block732;
                                                    if (entity instanceof StarskeletonEntity) {
                                                        StarskeletonEntity _datEntI20 = (StarskeletonEntity)entity;
                                                        n25 = (Integer)_datEntI20.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                    } else {
                                                        n25 = 0;
                                                    }
                                                    if (n25 == 29) break block732;
                                                    if (entity instanceof StarskeletonEntity) {
                                                        StarskeletonEntity _datEntI21 = (StarskeletonEntity)entity;
                                                        n24 = (Integer)_datEntI21.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                    } else {
                                                        n24 = 0;
                                                    }
                                                    if (n24 == 49) break block732;
                                                    if (entity instanceof StarskeletonEntity) {
                                                        StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                                                        n23 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                    } else {
                                                        n23 = 0;
                                                    }
                                                    if (n23 == 57) break block732;
                                                    if (entity instanceof StarskeletonEntity) {
                                                        StarskeletonEntity _datEntI22 = (StarskeletonEntity)entity;
                                                        n22 = (Integer)_datEntI22.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                                    } else {
                                                        n22 = 0;
                                                    }
                                                    if (n22 != 77) break block733;
                                                }
                                                Vec3 _center = new Vec3(x, y, z);
                                                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                                for (Entity entityiterator : _entfound) {
                                                    float f26;
                                                    if (entityiterator instanceof StarskeletonEntity) continue;
                                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                    if (entityiterator instanceof LivingEntity) {
                                                        LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                                                        f26 = _livEnt4.m_21233_();
                                                    } else {
                                                        f26 = -1.0f;
                                                    }
                                                    entityiterator.m_6469_(damageSource, f26 / 4.0f + 1000.0f);
                                                    if (entityiterator instanceof Player) continue;
                                                    entityiterator.f_19802_ = 0;
                                                    if (!(entityiterator instanceof LivingEntity)) continue;
                                                    if (world instanceof Level) {
                                                        Level _level20 = (Level)world;
                                                        if (!_level20.m_5776_()) {
                                                            _level20.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                                        } else {
                                                            _level20.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                                        }
                                                    }
                                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                }
                                            }
                                            if (entity instanceof StarskeletonEntity) {
                                                _datEntI = (StarskeletonEntity)entity;
                                                n21 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                            } else {
                                                n21 = 0;
                                            }
                                            if (n21 == 40) break block734;
                                            if (entity instanceof StarskeletonEntity) {
                                                StarskeletonEntity _datEntI23 = (StarskeletonEntity)entity;
                                                n20 = (Integer)_datEntI23.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                            } else {
                                                n20 = 0;
                                            }
                                            if (n20 != 68) break block735;
                                        }
                                        if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                            _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                                        }
                                        for (int index7 = 0; index7 < 400; ++index7) {
                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 6.0, y + 3.0, z + entity.m_20154_().f_82481_ * 6.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0));
                                        }
                                        if (world instanceof Level) {
                                            Level _level21 = (Level)world;
                                            if (!_level21.m_5776_()) {
                                                _level21.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                            } else {
                                                _level21.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                            }
                                        }
                                        Vec3 _center = new Vec3(x, y, z);
                                        List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(20.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                        for (Entity entityiterator : list) {
                                            float f27;
                                            if (entityiterator instanceof StarskeletonEntity) continue;
                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                            if (entityiterator instanceof LivingEntity) {
                                                _livEnt2 = (LivingEntity)entityiterator;
                                                f27 = _livEnt2.m_21233_();
                                            } else {
                                                f27 = -1.0f;
                                            }
                                            entityiterator.m_6469_(damageSource, f27 / 4.0f + 1000.0f);
                                            double _setval = 6.0;
                                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                capability.camerashake = _setval;
                                                capability.syncPlayerVariables(entityiterator);
                                            });
                                            if (entityiterator instanceof Player) continue;
                                            entityiterator.f_19802_ = 0;
                                            if (entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                                            entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                                        }
                                    }
                                    if (entity instanceof StarskeletonEntity) {
                                        _datEntI = (StarskeletonEntity)entity;
                                        n19 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                    } else {
                                        n19 = 0;
                                    }
                                    if (n19 == 92 && entity instanceof StarskeletonEntity) {
                                        int n96;
                                        StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                        if (entity instanceof StarskeletonEntity) {
                                            StarskeletonEntity _datEntI24 = (StarskeletonEntity)entity;
                                            n96 = (Integer)_datEntI24.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                                        } else {
                                            n96 = 0;
                                        }
                                        synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n96 - 2));
                                    }
                                    if (entity instanceof StarskeletonEntity) {
                                        _datEntI = (StarskeletonEntity)entity;
                                        n18 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                    } else {
                                        n18 = 0;
                                    }
                                    if (n18 >= 92) {
                                        if (entity instanceof StarskeletonEntity) {
                                            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
                                        }
                                        if (entity instanceof StarskeletonEntity) {
                                            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
                                            _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
                                        }
                                        if (entity instanceof StarskeletonEntity) {
                                            ((StarskeletonEntity)entity).setAnimation("empty");
                                        }
                                    }
                                }
                                if (!(entity instanceof StarskeletonEntity)) return;
                                _datEntI3 = (StarskeletonEntity)entity;
                                int n97 = (Integer)_datEntI3.m_20088_().m_135370_(StarskeletonEntity.DATA_animationID);
                                if (n97 != 6) return;
                                if (entity instanceof StarskeletonEntity) {
                                    ((StarskeletonEntity)entity).setAnimation("animation.starskeleton.starburst");
                                }
                                if (entity instanceof Mob) {
                                    _mobEnt4 = (Mob)entity;
                                    livingEntity = _mobEnt4.m_5448_();
                                } else {
                                    livingEntity = null;
                                }
                                if (livingEntity != null) {
                                    LivingEntity livingEntity97;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt20 = (Mob)entity;
                                        livingEntity97 = _mobEnt20.m_5448_();
                                    } else {
                                        livingEntity97 = null;
                                    }
                                    f = entity.m_20270_(livingEntity97);
                                } else {
                                    f = -1.0f;
                                }
                                if (f > 1.0f) {
                                    LivingEntity livingEntity98;
                                    LivingEntity livingEntity99;
                                    LivingEntity livingEntity100;
                                    LivingEntity livingEntity101;
                                    LivingEntity livingEntity102;
                                    Mob _mobEnt21;
                                    LivingEntity livingEntity103;
                                    LivingEntity livingEntity104;
                                    LivingEntity livingEntity105;
                                    LivingEntity livingEntity106;
                                    LivingEntity _ent;
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        v271 = mob.m_5448_();
                                    } else {
                                        v271 = _ent = null;
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
                                    int n98 = (int)livingEntity105.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity104 = mob.m_5448_();
                                    } else {
                                        livingEntity104 = null;
                                    }
                                    double d35 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n98, (int)livingEntity104.m_20189_());
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity103 = mob.m_5448_();
                                    } else {
                                        livingEntity103 = null;
                                    }
                                    _ent.m_6021_(d, d35, livingEntity103.m_20189_());
                                    if (_ent instanceof ServerPlayer) {
                                        LivingEntity livingEntity107;
                                        LivingEntity livingEntity108;
                                        LivingEntity livingEntity109;
                                        LivingEntity livingEntity110;
                                        ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt22 = (Mob)entity;
                                            livingEntity110 = _mobEnt22.m_5448_();
                                        } else {
                                            livingEntity110 = null;
                                        }
                                        double d36 = livingEntity110.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity109 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity109 = null;
                                        }
                                        int n99 = (int)livingEntity109.m_20185_();
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity108 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity108 = null;
                                        }
                                        double d37 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n99, (int)livingEntity108.m_20189_());
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity107 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity107 = null;
                                        }
                                        serverGamePacketListenerImpl.m_9774_(d36, d37, livingEntity107.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt21 = (Mob)entity;
                                        livingEntity102 = _mobEnt21.m_5448_();
                                    } else {
                                        livingEntity102 = null;
                                    }
                                    livingEntity102.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    if (entity instanceof Mob) {
                                        _mobEnt21 = (Mob)entity;
                                        livingEntity101 = _mobEnt21.m_5448_();
                                    } else {
                                        livingEntity101 = null;
                                    }
                                    double d38 = livingEntity101.m_20185_();
                                    if (entity instanceof Mob) {
                                        Mob mob = (Mob)entity;
                                        livingEntity100 = mob.m_5448_();
                                    } else {
                                        livingEntity100 = null;
                                    }
                                    double d39 = livingEntity100.m_20186_();
                                    if (entity instanceof Mob) {
                                        _mobEnt21 = (Mob)entity;
                                        livingEntity99 = _mobEnt21.m_5448_();
                                    } else {
                                        livingEntity99 = null;
                                    }
                                    double d40 = d39 + (double)livingEntity99.m_20206_() / 1.5;
                                    if (entity instanceof Mob) {
                                        _mobEnt21 = (Mob)entity;
                                        livingEntity98 = _mobEnt21.m_5448_();
                                    } else {
                                        livingEntity98 = null;
                                    }
                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d38, d40, livingEntity98.m_20189_()));
                                }
                                if (entity instanceof StarskeletonEntity) {
                                    _datEntI = (StarskeletonEntity)entity;
                                    n17 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                } else {
                                    n17 = 0;
                                }
                                if (n17 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                    ServerLevel _level22 = (ServerLevel)world;
                                    _level22.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level22, 4, "", (Component)Component.m_237113_((String)""), _level22.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                }
                                if (entity instanceof StarskeletonEntity) {
                                    _datEntI = (StarskeletonEntity)entity;
                                    n16 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                } else {
                                    n16 = 0;
                                }
                                if (n16 == 7) break block736;
                                if (entity instanceof StarskeletonEntity) {
                                    StarskeletonEntity _datEntI25 = (StarskeletonEntity)entity;
                                    n15 = (Integer)_datEntI25.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                } else {
                                    n15 = 0;
                                }
                                if (n15 == 29) break block736;
                                if (entity instanceof StarskeletonEntity) {
                                    StarskeletonEntity _datEntI26 = (StarskeletonEntity)entity;
                                    n14 = (Integer)_datEntI26.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                } else {
                                    n14 = 0;
                                }
                                if (n14 == 42) break block736;
                                if (entity instanceof StarskeletonEntity) {
                                    StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                                    n13 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                } else {
                                    n13 = 0;
                                }
                                if (n13 == 68) break block736;
                                if (entity instanceof StarskeletonEntity) {
                                    StarskeletonEntity _datEntI27 = (StarskeletonEntity)entity;
                                    n12 = (Integer)_datEntI27.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                } else {
                                    n12 = 0;
                                }
                                if (n12 == 74) break block736;
                                if (entity instanceof StarskeletonEntity) {
                                    _datEntI2 = (StarskeletonEntity)entity;
                                    n11 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                                } else {
                                    n11 = 0;
                                }
                                if (n11 != 104) break block737;
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
                        if (entity instanceof StarskeletonEntity) {
                            _datEntI = (StarskeletonEntity)entity;
                            n10 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n10 = 0;
                        }
                        if (n10 == 9) break block738;
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity _datEntI28 = (StarskeletonEntity)entity;
                            n9 = (Integer)_datEntI28.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n9 = 0;
                        }
                        if (n9 == 31) break block738;
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity _datEntI29 = (StarskeletonEntity)entity;
                            n8 = (Integer)_datEntI29.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n8 = 0;
                        }
                        if (n8 == 44) break block738;
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity starskeletonEntity = (StarskeletonEntity)entity;
                            n7 = (Integer)starskeletonEntity.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n7 = 0;
                        }
                        if (n7 == 72) break block738;
                        if (entity instanceof StarskeletonEntity) {
                            StarskeletonEntity _datEntI30 = (StarskeletonEntity)entity;
                            n6 = (Integer)_datEntI30.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n6 = 0;
                        }
                        if (n6 == 76) break block738;
                        if (entity instanceof StarskeletonEntity) {
                            _datEntI2 = (StarskeletonEntity)entity;
                            n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                        } else {
                            n5 = 0;
                        }
                        if (n5 != 107) break block739;
                    }
                    Vec3 _center = new Vec3(x, y, z);
                    List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f;
                        if (entityiterator instanceof StarskeletonEntity) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt5 = (LivingEntity)entityiterator;
                            f = _livEnt5.m_21233_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f / 4.0f + 1000.0f);
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
                if (entity instanceof StarskeletonEntity) {
                    _datEntI = (StarskeletonEntity)entity;
                    n4 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n4 = 0;
                }
                if (n4 == 18) break block740;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI31 = (StarskeletonEntity)entity;
                    n3 = (Integer)_datEntI31.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
                } else {
                    n3 = 0;
                }
                if (n3 != 93) break block741;
            }
            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
            }
            for (int index8 = 0; index8 < 400; ++index8) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + entity.m_20154_().f_82479_ * 6.0, y + 2.0, z + entity.m_20154_().f_82481_ * 6.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0));
            }
            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            Vec3 _center = new Vec3(x, y, z);
            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(20.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : list) {
                float f;
                if (entityiterator instanceof StarskeletonEntity) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                if (entityiterator instanceof LivingEntity) {
                    _livEnt2 = (LivingEntity)entityiterator;
                    f = _livEnt2.m_21233_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f / 4.0f + 1000.0f);
                double _setval = 6.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (entityiterator instanceof Player) continue;
                entityiterator.f_19802_ = 0;
                if (entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                entityiterator.m_142687_(Entity.RemovalReason.KILLED);
            }
        }
        if (entity instanceof StarskeletonEntity) {
            _datEntI = (StarskeletonEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
        } else {
            n2 = 0;
        }
        if (n2 == 107) {
            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
            Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                int n100;
                float f;
                if (entityiterator instanceof StarskeletonEntity) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                if (entityiterator instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f / 4.0f + 1000.0f);
                double _setval = 6.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (entityiterator instanceof Player || entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                if (entityiterator instanceof Titangodentity) continue;
                if (entity instanceof StarskeletonEntity) {
                    StarskeletonEntity _datEntI32 = (StarskeletonEntity)entity;
                    n100 = (Integer)_datEntI32.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
                } else {
                    n100 = 0;
                }
                if (n100 > 7) continue;
                Deathlist.normalattack(entityiterator);
            }
        }
        if (entity instanceof StarskeletonEntity) {
            _datEntI = (StarskeletonEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
        } else {
            n = 0;
        }
        if (n == 122 && entity instanceof StarskeletonEntity) {
            int n101;
            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof StarskeletonEntity) {
                StarskeletonEntity _datEntI33 = (StarskeletonEntity)entity;
                n101 = (Integer)_datEntI33.m_20088_().m_135370_(StarskeletonEntity.DATA_SkillCount);
            } else {
                n101 = 0;
            }
            synchedEntityData.m_135381_(StarskeletonEntity.DATA_SkillCount, (Object)(n101 - 2));
        }
        if (!(entity instanceof StarskeletonEntity)) return;
        _datEntI = (StarskeletonEntity)entity;
        int n102 = (Integer)_datEntI.m_20088_().m_135370_(StarskeletonEntity.DATA_animationTick);
        if (n102 < 122) return;
        if (entity instanceof StarskeletonEntity) {
            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
            _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationTick, (Object)0);
        }
        if (entity instanceof StarskeletonEntity) {
            StarskeletonEntity _datEntSetI = (StarskeletonEntity)entity;
            _datEntSetI.m_20088_().m_135381_(StarskeletonEntity.DATA_animationID, (Object)0);
        }
        if (!(entity instanceof StarskeletonEntity)) return;
        ((StarskeletonEntity)entity).setAnimation("empty");
    }
}

