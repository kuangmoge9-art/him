/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
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
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.StarbladeEntity;
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

public class StarlightskeletonangryATKProcedure {
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
        Vec3 _center;
        LivingEntity _entity;
        StarlightskeletonEntity _datEntSetI;
        StarlightskeletonEntity _datEntI;
        List<Entity> _entfound;
        Vec3 _center2;
        Level _level;
        StarlightskeletonEntity _datEntI2;
        StarlightskeletonEntity _datEntI3;
        block752: {
            Level _level2;
            block751: {
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                float f;
                LivingEntity livingEntity;
                StarlightskeletonEntity _datEntI4;
                Object _datEntI5;
                int n14;
                int n15;
                ServerLevel _level3;
                Mob _mobEnt;
                LivingEntity _ent;
                StarlightskeletonEntity animatable;
                Mob _mobEnt2;
                Object _mobEnt3;
                Mob _mobEnt4;
                Mob _mobEnt5;
                Mob _mobEnt6;
                StarlightskeletonEntity _datEntI6;
                block746: {
                    int n16;
                    int n17;
                    int n18;
                    block750: {
                        Level _level4;
                        LivingEntity _livEnt;
                        Vec3 _center3;
                        block749: {
                            int n19;
                            int n20;
                            int n21;
                            int n22;
                            block748: {
                                Level _level5;
                                block747: {
                                    int n23;
                                    int n24;
                                    int n25;
                                    int n26;
                                    int n27;
                                    int n28;
                                    float f2;
                                    LivingEntity livingEntity2;
                                    float f3;
                                    LivingEntity livingEntity3;
                                    int n29;
                                    block741: {
                                        int n30;
                                        int n31;
                                        int n32;
                                        block745: {
                                            block744: {
                                                int n33;
                                                int n34;
                                                int n35;
                                                int n36;
                                                block743: {
                                                    block742: {
                                                        int n37;
                                                        int n38;
                                                        int n39;
                                                        int n40;
                                                        int n41;
                                                        float f4;
                                                        LivingEntity livingEntity4;
                                                        float f5;
                                                        LivingEntity livingEntity5;
                                                        int n42;
                                                        block736: {
                                                            int n43;
                                                            int n44;
                                                            block740: {
                                                                block739: {
                                                                    int n45;
                                                                    int n46;
                                                                    int n47;
                                                                    block738: {
                                                                        block737: {
                                                                            int n48;
                                                                            int n49;
                                                                            int n50;
                                                                            int n51;
                                                                            float f6;
                                                                            LivingEntity livingEntity6;
                                                                            float f7;
                                                                            LivingEntity livingEntity7;
                                                                            int n52;
                                                                            block732: {
                                                                                block733: {
                                                                                    block734: {
                                                                                        int n53;
                                                                                        block735: {
                                                                                            float f8;
                                                                                            LivingEntity livingEntity8;
                                                                                            float f9;
                                                                                            LivingEntity livingEntity9;
                                                                                            float f10;
                                                                                            LivingEntity livingEntity10;
                                                                                            float f11;
                                                                                            LivingEntity livingEntity11;
                                                                                            float f12;
                                                                                            LivingEntity livingEntity12;
                                                                                            float f13;
                                                                                            LivingEntity livingEntity13;
                                                                                            LivingEntity livingEntity14;
                                                                                            int n54;
                                                                                            int n55;
                                                                                            int n56;
                                                                                            StarlightskeletonEntity _datEntSetI2;
                                                                                            int n57;
                                                                                            LivingEntity _entity2;
                                                                                            if (entity == null) {
                                                                                                return;
                                                                                            }
                                                                                            double theta = 0.0;
                                                                                            if (entity instanceof LivingEntity) {
                                                                                                ((LivingEntity)entity).f_20919_ = 0;
                                                                                            }
                                                                                            if (entity instanceof LivingEntity) {
                                                                                                _entity2 = (LivingEntity)entity;
                                                                                                _entity2.m_21153_(1024.0f);
                                                                                            }
                                                                                            entity.f_19802_ = 20;
                                                                                            ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 100, 3));
                                                                                            }
                                                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 100, 5));
                                                                                            }
                                                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19603_, 100, 4));
                                                                                            }
                                                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 100, 10));
                                                                                            }
                                                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntI6 = (StarlightskeletonEntity)entity;
                                                                                                n57 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                                            } else {
                                                                                                n57 = 0;
                                                                                            }
                                                                                            if (n57 == 0) {
                                                                                                if (entity.m_5446_().getString().equals("\u65ed\u8861") && entity instanceof StarlightskeletonEntity) {
                                                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_SkillCount, (Object)0);
                                                                                                }
                                                                                                if (entity.m_5446_().getString().equals("\u672a\u77e5") && entity instanceof StarlightskeletonEntity) {
                                                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)20);
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntI6 = (StarlightskeletonEntity)entity;
                                                                                                n56 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                                                                            } else {
                                                                                                n56 = 0;
                                                                                            }
                                                                                            if (n56 <= 0) {
                                                                                                int n58;
                                                                                                int n59;
                                                                                                int n60;
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                                                                                }
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                    _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                                                                }
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    int n61;
                                                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                                                        _datEntI3 = (StarlightskeletonEntity)entity;
                                                                                                        n61 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                                                    } else {
                                                                                                        n61 = 0;
                                                                                                    }
                                                                                                    synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryTick, (Object)(n61 - 1));
                                                                                                }
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                                                    n60 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                                                } else {
                                                                                                    n60 = 0;
                                                                                                }
                                                                                                if (n60 < 107) {
                                                                                                    int n62;
                                                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                                                        _datEntI3 = (StarlightskeletonEntity)entity;
                                                                                                        n62 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                                                    } else {
                                                                                                        n62 = 0;
                                                                                                    }
                                                                                                    if (n62 > 97 && entity instanceof StarlightskeletonEntity) {
                                                                                                        ((StarlightskeletonEntity)entity).setAnimation("animation.starlightskeleton.angrychange");
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                                                    n59 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                                                } else {
                                                                                                    n59 = 0;
                                                                                                }
                                                                                                if (n59 == 93) {
                                                                                                    if (world instanceof Level) {
                                                                                                        _level = (Level)world;
                                                                                                        if (!_level.m_5776_()) {
                                                                                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                                                                        } else {
                                                                                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                                                                        }
                                                                                                    }
                                                                                                    _center2 = new Vec3(x, y, z);
                                                                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                                                                    for (Entity entityiterator : _entfound) {
                                                                                                        if (entityiterator instanceof StarlightskeletonEntity) continue;
                                                                                                        double _setval = 6.0;
                                                                                                        entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                                                            capability.camerashake = _setval;
                                                                                                            capability.syncPlayerVariables(entityiterator);
                                                                                                        });
                                                                                                    }
                                                                                                }
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                                                                    n58 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryTick);
                                                                                                } else {
                                                                                                    n58 = 0;
                                                                                                }
                                                                                                if (n58 < 75 && entity instanceof StarlightskeletonEntity) {
                                                                                                    ((StarlightskeletonEntity)entity).setAnimation("empty");
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntI6 = (StarlightskeletonEntity)entity;
                                                                                                n55 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                                            } else {
                                                                                                n55 = 0;
                                                                                            }
                                                                                            if (n55 != 0) {
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    int n63;
                                                                                                    _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                                                        _datEntI3 = (StarlightskeletonEntity)entity;
                                                                                                        n63 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                                                    } else {
                                                                                                        n63 = 0;
                                                                                                    }
                                                                                                    synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)(n63 + 1));
                                                                                                }
                                                                                                Vec3 _center4 = new Vec3(x, y, z);
                                                                                                List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                                                                                                for (Entity entity2 : _entfound2) {
                                                                                                    if (entity2 instanceof StarlightskeletonEntity || entity2 instanceof Player) continue;
                                                                                                    entity2.f_19802_ = 0;
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntI6 = (StarlightskeletonEntity)entity;
                                                                                                n54 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                                                                            } else {
                                                                                                n54 = 0;
                                                                                            }
                                                                                            if (n54 <= 0) break block732;
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_Tick, (Object)0);
                                                                                            }
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntSetI2 = (StarlightskeletonEntity)entity;
                                                                                                _datEntSetI2.m_20088_().m_135381_(StarlightskeletonEntity.DATA_angryTick, (Object)125);
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt6 = (Mob)entity;
                                                                                                livingEntity14 = _mobEnt6.m_5448_();
                                                                                            } else {
                                                                                                livingEntity14 = null;
                                                                                            }
                                                                                            if (livingEntity14 == null) break block733;
                                                                                            if (entity instanceof Mob) {
                                                                                                _mobEnt5 = (Mob)entity;
                                                                                                v13 = _mobEnt5.m_5448_();
                                                                                            } else {
                                                                                                v13 = livingEntity13 = null;
                                                                                            }
                                                                                            if (livingEntity13 instanceof LivingEntity) {
                                                                                                LivingEntity _livEnt2 = livingEntity13;
                                                                                                f13 = _livEnt2.m_21223_();
                                                                                            } else {
                                                                                                f13 = -1.0f;
                                                                                            }
                                                                                            if (!(f13 > 0.0f)) break block734;
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity12 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity12 = null;
                                                                                            }
                                                                                            if (livingEntity12 != null) {
                                                                                                LivingEntity livingEntity15;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt4 = (Mob)entity;
                                                                                                    livingEntity15 = _mobEnt4.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity15 = null;
                                                                                                }
                                                                                                f12 = entity.m_20270_(livingEntity15);
                                                                                            } else {
                                                                                                f12 = -1.0f;
                                                                                            }
                                                                                            if (f12 >= 20.0f) {
                                                                                                entity.m_6858_(true);
                                                                                            } else {
                                                                                                entity.m_6858_(false);
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity11 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity11 = null;
                                                                                            }
                                                                                            if (livingEntity11 != null) {
                                                                                                LivingEntity livingEntity16;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt4 = (Mob)entity;
                                                                                                    livingEntity16 = _mobEnt4.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity16 = null;
                                                                                                }
                                                                                                f11 = entity.m_20270_(livingEntity16);
                                                                                            } else {
                                                                                                f11 = -1.0f;
                                                                                            }
                                                                                            if (f11 > 1.0f) {
                                                                                                int n64;
                                                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                                                    StarlightskeletonEntity _datEntI7 = (StarlightskeletonEntity)entity;
                                                                                                    n64 = (Integer)_datEntI7.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                                                } else {
                                                                                                    n64 = 0;
                                                                                                }
                                                                                                if (n64 == 0) {
                                                                                                    LivingEntity livingEntity17;
                                                                                                    LivingEntity livingEntity18;
                                                                                                    LivingEntity livingEntity19;
                                                                                                    LivingEntity livingEntity20;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                        livingEntity20 = _mobEnt3.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity20 = null;
                                                                                                    }
                                                                                                    double d = livingEntity20.m_20185_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt2 = (Mob)entity;
                                                                                                        livingEntity19 = _mobEnt2.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity19 = null;
                                                                                                    }
                                                                                                    double d2 = livingEntity19.m_20186_();
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                        livingEntity18 = _mobEnt3.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity18 = null;
                                                                                                    }
                                                                                                    double d3 = d2 + (double)livingEntity18.m_20206_() / 1.5;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        _mobEnt3 = (Mob)entity;
                                                                                                        livingEntity17 = _mobEnt3.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity17 = null;
                                                                                                    }
                                                                                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity17.m_20189_()));
                                                                                                }
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity10 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity10 = null;
                                                                                            }
                                                                                            if (livingEntity10 != null) {
                                                                                                LivingEntity livingEntity21;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt4 = (Mob)entity;
                                                                                                    livingEntity21 = _mobEnt4.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity21 = null;
                                                                                                }
                                                                                                f10 = entity.m_20270_(livingEntity21);
                                                                                            } else {
                                                                                                f10 = -1.0f;
                                                                                            }
                                                                                            if (f10 > 8.0f) {
                                                                                                float f14;
                                                                                                LivingEntity livingEntity22;
                                                                                                LivingEntity livingEntity23;
                                                                                                float f15;
                                                                                                LivingEntity livingEntity24;
                                                                                                LivingEntity livingEntity25;
                                                                                                float f16;
                                                                                                LivingEntity livingEntity26;
                                                                                                LivingEntity livingEntity27;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt2 = (Mob)entity;
                                                                                                    livingEntity27 = _mobEnt2.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity27 = null;
                                                                                                }
                                                                                                double d = livingEntity27.m_20185_() - entity.m_20185_();
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                    livingEntity26 = _mobEnt3.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity26 = null;
                                                                                                }
                                                                                                if (livingEntity26 != null) {
                                                                                                    LivingEntity livingEntity28;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt7 = (Mob)entity;
                                                                                                        livingEntity28 = _mobEnt7.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity28 = null;
                                                                                                    }
                                                                                                    f16 = entity.m_20270_(livingEntity28);
                                                                                                } else {
                                                                                                    f16 = -1.0f;
                                                                                                }
                                                                                                double d4 = d / (double)f16 * 1.2;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt2 = (Mob)entity;
                                                                                                    livingEntity25 = _mobEnt2.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity25 = null;
                                                                                                }
                                                                                                double d5 = livingEntity25.m_20186_() - entity.m_20186_();
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                    livingEntity24 = _mobEnt3.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity24 = null;
                                                                                                }
                                                                                                if (livingEntity24 != null) {
                                                                                                    LivingEntity livingEntity29;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt8 = (Mob)entity;
                                                                                                        livingEntity29 = _mobEnt8.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity29 = null;
                                                                                                    }
                                                                                                    f15 = entity.m_20270_(livingEntity29);
                                                                                                } else {
                                                                                                    f15 = -1.0f;
                                                                                                }
                                                                                                double d6 = d5 / (double)f15 * 1.2;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt2 = (Mob)entity;
                                                                                                    livingEntity23 = _mobEnt2.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity23 = null;
                                                                                                }
                                                                                                double d7 = livingEntity23.m_20189_() - entity.m_20189_();
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                    livingEntity22 = _mobEnt3.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity22 = null;
                                                                                                }
                                                                                                if (livingEntity22 != null) {
                                                                                                    LivingEntity livingEntity30;
                                                                                                    if (entity instanceof Mob) {
                                                                                                        Mob _mobEnt9 = (Mob)entity;
                                                                                                        livingEntity30 = _mobEnt9.m_5448_();
                                                                                                    } else {
                                                                                                        livingEntity30 = null;
                                                                                                    }
                                                                                                    f14 = entity.m_20270_(livingEntity30);
                                                                                                } else {
                                                                                                    f14 = -1.0f;
                                                                                                }
                                                                                                entity.m_20256_(new Vec3(d4, d6, d7 / (double)f14 * 1.2));
                                                                                            }
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob mob = (Mob)entity;
                                                                                                livingEntity9 = mob.m_5448_();
                                                                                            } else {
                                                                                                livingEntity9 = null;
                                                                                            }
                                                                                            if (livingEntity9 != null) {
                                                                                                LivingEntity livingEntity31;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt4 = (Mob)entity;
                                                                                                    livingEntity31 = _mobEnt4.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity31 = null;
                                                                                                }
                                                                                                f9 = entity.m_20270_(livingEntity31);
                                                                                            } else {
                                                                                                f9 = -1.0f;
                                                                                            }
                                                                                            if (!(f9 < 12.0f)) break block732;
                                                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) break block735;
                                                                                            if (entity instanceof Mob) {
                                                                                                Mob _mobEnt10 = (Mob)entity;
                                                                                                livingEntity8 = _mobEnt10.m_5448_();
                                                                                            } else {
                                                                                                livingEntity8 = null;
                                                                                            }
                                                                                            if (livingEntity8 != null) {
                                                                                                LivingEntity livingEntity32;
                                                                                                if (entity instanceof Mob) {
                                                                                                    _mobEnt3 = (Mob)entity;
                                                                                                    livingEntity32 = _mobEnt3.m_5448_();
                                                                                                } else {
                                                                                                    livingEntity32 = null;
                                                                                                }
                                                                                                f8 = entity.m_20270_(livingEntity32);
                                                                                            } else {
                                                                                                f8 = -1.0f;
                                                                                            }
                                                                                            if (!(f8 <= 8.0f)) break block732;
                                                                                        }
                                                                                        if (entity instanceof StarlightskeletonEntity) {
                                                                                            StarlightskeletonEntity _datEntI8 = (StarlightskeletonEntity)entity;
                                                                                            n53 = (Integer)_datEntI8.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                                        } else {
                                                                                            n53 = 0;
                                                                                        }
                                                                                        if (n53 == 0) {
                                                                                            StarlightskeletonEntity _datEntSetI3;
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntSetI3 = (StarlightskeletonEntity)entity;
                                                                                                _datEntSetI3.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                                                            }
                                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                                _datEntSetI3 = (StarlightskeletonEntity)entity;
                                                                                                _datEntSetI3.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6));
                                                                                            }
                                                                                        }
                                                                                        break block732;
                                                                                    }
                                                                                    if (entity.m_20186_() < -63.0) {
                                                                                        entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                                                    }
                                                                                    break block732;
                                                                                }
                                                                                if (entity.m_20186_() < -63.0) {
                                                                                    entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                                                                }
                                                                            }
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                _datEntI6 = (StarlightskeletonEntity)entity;
                                                                                n52 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                                            } else {
                                                                                n52 = 0;
                                                                            }
                                                                            if (n52 != true) break block736;
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                animatable = (StarlightskeletonEntity)entity;
                                                                                animatable.setTexture("alhpa");
                                                                            }
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt6 = (Mob)entity;
                                                                                livingEntity7 = _mobEnt6.m_5448_();
                                                                            } else {
                                                                                livingEntity7 = null;
                                                                            }
                                                                            if (livingEntity7 != null) {
                                                                                LivingEntity livingEntity33;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt5 = (Mob)entity;
                                                                                    livingEntity33 = _mobEnt5.m_5448_();
                                                                                } else {
                                                                                    livingEntity33 = null;
                                                                                }
                                                                                f7 = entity.m_20270_(livingEntity33);
                                                                            } else {
                                                                                f7 = -1.0f;
                                                                            }
                                                                            if (f7 > 1.0f) {
                                                                                LivingEntity livingEntity34;
                                                                                LivingEntity livingEntity35;
                                                                                LivingEntity livingEntity36;
                                                                                LivingEntity livingEntity37;
                                                                                LivingEntity livingEntity38;
                                                                                if (entity instanceof Mob) {
                                                                                    Mob mob = (Mob)entity;
                                                                                    v60 = mob.m_5448_();
                                                                                } else {
                                                                                    v60 = _ent = null;
                                                                                }
                                                                                if (entity instanceof Mob) {
                                                                                    Mob mob = (Mob)entity;
                                                                                    livingEntity38 = mob.m_5448_();
                                                                                } else {
                                                                                    livingEntity38 = null;
                                                                                }
                                                                                double d = livingEntity38.m_20185_();
                                                                                if (entity instanceof Mob) {
                                                                                    Mob mob = (Mob)entity;
                                                                                    livingEntity37 = mob.m_5448_();
                                                                                } else {
                                                                                    livingEntity37 = null;
                                                                                }
                                                                                int n65 = (int)livingEntity37.m_20185_();
                                                                                if (entity instanceof Mob) {
                                                                                    Mob mob = (Mob)entity;
                                                                                    livingEntity36 = mob.m_5448_();
                                                                                } else {
                                                                                    livingEntity36 = null;
                                                                                }
                                                                                double d8 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n65, (int)livingEntity36.m_20189_());
                                                                                if (entity instanceof Mob) {
                                                                                    Mob mob = (Mob)entity;
                                                                                    livingEntity35 = mob.m_5448_();
                                                                                } else {
                                                                                    livingEntity35 = null;
                                                                                }
                                                                                _ent.m_6021_(d, d8, livingEntity35.m_20189_());
                                                                                if (_ent instanceof ServerPlayer) {
                                                                                    LivingEntity livingEntity39;
                                                                                    LivingEntity livingEntity40;
                                                                                    LivingEntity livingEntity41;
                                                                                    LivingEntity livingEntity42;
                                                                                    ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt4 = (Mob)entity;
                                                                                        livingEntity42 = _mobEnt4.m_5448_();
                                                                                    } else {
                                                                                        livingEntity42 = null;
                                                                                    }
                                                                                    double d9 = livingEntity42.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        Mob _mobEnt11 = (Mob)entity;
                                                                                        livingEntity41 = _mobEnt11.m_5448_();
                                                                                    } else {
                                                                                        livingEntity41 = null;
                                                                                    }
                                                                                    int n66 = (int)livingEntity41.m_20185_();
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt3 = (Mob)entity;
                                                                                        livingEntity40 = _mobEnt3.m_5448_();
                                                                                    } else {
                                                                                        livingEntity40 = null;
                                                                                    }
                                                                                    double d10 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n66, (int)livingEntity40.m_20189_());
                                                                                    if (entity instanceof Mob) {
                                                                                        _mobEnt2 = (Mob)entity;
                                                                                        livingEntity39 = _mobEnt2.m_5448_();
                                                                                    } else {
                                                                                        livingEntity39 = null;
                                                                                    }
                                                                                    serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity39.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                                                }
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt = (Mob)entity;
                                                                                    livingEntity34 = _mobEnt.m_5448_();
                                                                                } else {
                                                                                    livingEntity34 = null;
                                                                                }
                                                                                livingEntity34.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                            }
                                                                            if (entity instanceof Mob) {
                                                                                _mobEnt6 = (Mob)entity;
                                                                                livingEntity6 = _mobEnt6.m_5448_();
                                                                            } else {
                                                                                livingEntity6 = null;
                                                                            }
                                                                            if (livingEntity6 != null) {
                                                                                LivingEntity livingEntity43;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt5 = (Mob)entity;
                                                                                    livingEntity43 = _mobEnt5.m_5448_();
                                                                                } else {
                                                                                    livingEntity43 = null;
                                                                                }
                                                                                f6 = entity.m_20270_(livingEntity43);
                                                                            } else {
                                                                                f6 = -1.0f;
                                                                            }
                                                                            if (f6 > 1.0f) {
                                                                                LivingEntity livingEntity44;
                                                                                LivingEntity livingEntity45;
                                                                                LivingEntity livingEntity46;
                                                                                LivingEntity livingEntity47;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt = (Mob)entity;
                                                                                    livingEntity47 = _mobEnt.m_5448_();
                                                                                } else {
                                                                                    livingEntity47 = null;
                                                                                }
                                                                                double d = livingEntity47.m_20185_();
                                                                                if (entity instanceof Mob) {
                                                                                    Mob mob = (Mob)entity;
                                                                                    livingEntity46 = mob.m_5448_();
                                                                                } else {
                                                                                    livingEntity46 = null;
                                                                                }
                                                                                double d11 = livingEntity46.m_20186_();
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt = (Mob)entity;
                                                                                    livingEntity45 = _mobEnt.m_5448_();
                                                                                } else {
                                                                                    livingEntity45 = null;
                                                                                }
                                                                                double d12 = d11 + (double)livingEntity45.m_20206_() / 1.5;
                                                                                if (entity instanceof Mob) {
                                                                                    _mobEnt = (Mob)entity;
                                                                                    livingEntity44 = _mobEnt.m_5448_();
                                                                                } else {
                                                                                    livingEntity44 = null;
                                                                                }
                                                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d12, livingEntity44.m_20189_()));
                                                                            }
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                                                n51 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                            } else {
                                                                                n51 = 0;
                                                                            }
                                                                            if (n51 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                                                _level = (ServerLevel)world;
                                                                                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                                            }
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                                                n50 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                            } else {
                                                                                n50 = 0;
                                                                            }
                                                                            if (n50 == 8) break block737;
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                _datEntI3 = (StarlightskeletonEntity)entity;
                                                                                n49 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                            } else {
                                                                                n49 = 0;
                                                                            }
                                                                            if (n49 == 20) break block737;
                                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                                _datEntI = (StarlightskeletonEntity)entity;
                                                                                n48 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                            } else {
                                                                                n48 = 0;
                                                                            }
                                                                            if (n48 != 31) break block738;
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
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntI2 = (StarlightskeletonEntity)entity;
                                                                        n47 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                    } else {
                                                                        n47 = 0;
                                                                    }
                                                                    if (n47 == 10) break block739;
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntI3 = (StarlightskeletonEntity)entity;
                                                                        n46 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                    } else {
                                                                        n46 = 0;
                                                                    }
                                                                    if (n46 == 22) break block739;
                                                                    if (entity instanceof StarlightskeletonEntity) {
                                                                        _datEntI = (StarlightskeletonEntity)entity;
                                                                        n45 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                                    } else {
                                                                        n45 = 0;
                                                                    }
                                                                    if (n45 != 32) break block740;
                                                                }
                                                                Vec3 vec3 = new Vec3(x, y, z);
                                                                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(vec3, vec3).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(vec3))).toList();
                                                                for (Entity entityiterator : _entfound3) {
                                                                    float f17;
                                                                    if (entityiterator instanceof StarlightskeletonEntity) continue;
                                                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                                    if (entityiterator instanceof LivingEntity) {
                                                                        LivingEntity _livEnt3 = (LivingEntity)entityiterator;
                                                                        f17 = _livEnt3.m_21233_();
                                                                    } else {
                                                                        f17 = -1.0f;
                                                                    }
                                                                    entityiterator.m_6469_(damageSource, f17 / 4.0f + 1000.0f);
                                                                    if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                                                    if (world instanceof Level) {
                                                                        _level2 = (Level)world;
                                                                        if (!_level2.m_5776_()) {
                                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                                                        } else {
                                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    for (int index0 = 0; index0 < 2; ++index0) {
                                                                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                                                    }
                                                                }
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                                n44 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n44 = 0;
                                                            }
                                                            if (n44 == 45 && entity instanceof StarlightskeletonEntity) {
                                                                int n67;
                                                                _datEntSetI = (StarlightskeletonEntity)entity;
                                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntI = (StarlightskeletonEntity)entity;
                                                                    n67 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                                                } else {
                                                                    n67 = 0;
                                                                }
                                                                synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n67 - 1));
                                                            }
                                                            if (entity instanceof StarlightskeletonEntity) {
                                                                _datEntI2 = (StarlightskeletonEntity)entity;
                                                                n43 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                            } else {
                                                                n43 = 0;
                                                            }
                                                            if (n43 >= 45) {
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                                                }
                                                                if (entity instanceof StarlightskeletonEntity) {
                                                                    _datEntSetI = (StarlightskeletonEntity)entity;
                                                                    _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                                                }
                                                            }
                                                        }
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            _datEntI6 = (StarlightskeletonEntity)entity;
                                                            n42 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                                        } else {
                                                            n42 = 0;
                                                        }
                                                        if (n42 != 2) break block741;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity5 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity5 = null;
                                                        }
                                                        if (livingEntity5 != null) {
                                                            LivingEntity livingEntity48;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity48 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity48 = null;
                                                            }
                                                            f5 = entity.m_20270_(livingEntity48);
                                                        } else {
                                                            f5 = -1.0f;
                                                        }
                                                        if (f5 > 1.0f) {
                                                            LivingEntity livingEntity49;
                                                            LivingEntity livingEntity50;
                                                            LivingEntity livingEntity51;
                                                            LivingEntity livingEntity52;
                                                            LivingEntity livingEntity53;
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                v104 = mob.m_5448_();
                                                            } else {
                                                                v104 = _ent = null;
                                                            }
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity53 = mob.m_5448_();
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
                                                            int n68 = (int)livingEntity52.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity51 = mob.m_5448_();
                                                            } else {
                                                                livingEntity51 = null;
                                                            }
                                                            double d13 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n68, (int)livingEntity51.m_20189_());
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity50 = mob.m_5448_();
                                                            } else {
                                                                livingEntity50 = null;
                                                            }
                                                            _ent.m_6021_(d, d13, livingEntity50.m_20189_());
                                                            if (_ent instanceof ServerPlayer) {
                                                                LivingEntity livingEntity54;
                                                                LivingEntity livingEntity55;
                                                                LivingEntity livingEntity56;
                                                                LivingEntity livingEntity57;
                                                                ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity57 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity57 = null;
                                                                }
                                                                double d14 = livingEntity57.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt12 = (Mob)entity;
                                                                    livingEntity56 = _mobEnt12.m_5448_();
                                                                } else {
                                                                    livingEntity56 = null;
                                                                }
                                                                int n69 = (int)livingEntity56.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity55 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity55 = null;
                                                                }
                                                                double d15 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n69, (int)livingEntity55.m_20189_());
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity54 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity54 = null;
                                                                }
                                                                serverGamePacketListenerImpl.m_9774_(d14, d15, livingEntity54.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                                            }
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity49 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity49 = null;
                                                            }
                                                            livingEntity49.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity4 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity4 = null;
                                                        }
                                                        if (livingEntity4 != null) {
                                                            LivingEntity livingEntity58;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity58 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity58 = null;
                                                            }
                                                            f4 = entity.m_20270_(livingEntity58);
                                                        } else {
                                                            f4 = -1.0f;
                                                        }
                                                        if (f4 > 1.0f) {
                                                            LivingEntity livingEntity59;
                                                            LivingEntity livingEntity60;
                                                            LivingEntity livingEntity61;
                                                            LivingEntity livingEntity62;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity62 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity62 = null;
                                                            }
                                                            double d = livingEntity62.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob mob = (Mob)entity;
                                                                livingEntity61 = mob.m_5448_();
                                                            } else {
                                                                livingEntity61 = null;
                                                            }
                                                            double d16 = livingEntity61.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity60 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity60 = null;
                                                            }
                                                            double d17 = d16 + (double)livingEntity60.m_20206_() / 1.5;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity59 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity59 = null;
                                                            }
                                                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d17, livingEntity59.m_20189_()));
                                                        }
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                                            n41 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                        } else {
                                                            n41 = 0;
                                                        }
                                                        if (n41 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                                            _level = (ServerLevel)world;
                                                            _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                                        }
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                                            n40 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                        } else {
                                                            n40 = 0;
                                                        }
                                                        if (n40 == 6) break block742;
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            _datEntI3 = (StarlightskeletonEntity)entity;
                                                            n39 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                        } else {
                                                            n39 = 0;
                                                        }
                                                        if (n39 == 12) break block742;
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            _datEntI = (StarlightskeletonEntity)entity;
                                                            n38 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                        } else {
                                                            n38 = 0;
                                                        }
                                                        if (n38 == 21) break block742;
                                                        if (entity instanceof StarlightskeletonEntity) {
                                                            StarlightskeletonEntity starlightskeletonEntity = (StarlightskeletonEntity)entity;
                                                            n37 = (Integer)starlightskeletonEntity.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                        } else {
                                                            n37 = 0;
                                                        }
                                                        if (n37 != 38) break block743;
                                                    }
                                                    if (world instanceof Level) {
                                                        _level5 = (Level)world;
                                                        if (!_level5.m_5776_()) {
                                                            _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                        } else {
                                                            _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                        }
                                                    }
                                                }
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    _datEntI2 = (StarlightskeletonEntity)entity;
                                                    n36 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n36 = 0;
                                                }
                                                if (n36 == 8) break block744;
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    _datEntI3 = (StarlightskeletonEntity)entity;
                                                    n35 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n35 = 0;
                                                }
                                                if (n35 == 14) break block744;
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    _datEntI = (StarlightskeletonEntity)entity;
                                                    n34 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n34 = 0;
                                                }
                                                if (n34 == 23) break block744;
                                                if (entity instanceof StarlightskeletonEntity) {
                                                    StarlightskeletonEntity starlightskeletonEntity = (StarlightskeletonEntity)entity;
                                                    n33 = (Integer)starlightskeletonEntity.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                                } else {
                                                    n33 = 0;
                                                }
                                                if (n33 != 40) break block745;
                                            }
                                            _center3 = new Vec3(x, y, z);
                                            List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(8.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                            for (Entity entityiterator : _entfound4) {
                                                float f18;
                                                if (entityiterator instanceof StarlightskeletonEntity) continue;
                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                if (entityiterator instanceof LivingEntity) {
                                                    _livEnt = (LivingEntity)entityiterator;
                                                    f18 = _livEnt.m_21233_();
                                                } else {
                                                    f18 = -1.0f;
                                                }
                                                entityiterator.m_6469_(damageSource, f18 / 4.0f + 1000.0f);
                                                if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                                if (world instanceof Level) {
                                                    _level4 = (Level)world;
                                                    if (!_level4.m_5776_()) {
                                                        _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                                    } else {
                                                        _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                                    }
                                                }
                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                                            }
                                        }
                                        if (entity instanceof StarlightskeletonEntity) {
                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                            n32 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                        } else {
                                            n32 = 0;
                                        }
                                        if (n32 == 40) {
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
                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
                                            for (int index1 = 0; index1 < 16; ++index1) {
                                                if (!(world instanceof ServerLevel)) continue;
                                                _level3 = (ServerLevel)world;
                                                Entity entity3 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level3, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                                                if (entity3 == null) continue;
                                                entity3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                            }
                                            _center2 = new Vec3(x, y, z);
                                            _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                            for (Entity entityiterator : _entfound) {
                                                float f19;
                                                if (entityiterator instanceof StarlightskeletonEntity) continue;
                                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                if (entityiterator instanceof LivingEntity) {
                                                    LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                                                    f19 = _livEnt4.m_21233_();
                                                } else {
                                                    f19 = -1.0f;
                                                }
                                                entityiterator.m_6469_(damageSource, f19 / 4.0f + 1000.0f);
                                                double _setval = 6.0;
                                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                    capability.camerashake = _setval;
                                                    capability.syncPlayerVariables(entityiterator);
                                                });
                                                if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity || entityiterator instanceof StarskeletonEntity || entityiterator instanceof Titangodentity) continue;
                                                Deathlist.normalattack(entityiterator);
                                            }
                                            if (entity instanceof Mob) {
                                                _entity = (Mob)entity;
                                                _entity.m_6710_(null);
                                            }
                                        }
                                        if (entity instanceof StarlightskeletonEntity) {
                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                            n31 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                        } else {
                                            n31 = 0;
                                        }
                                        if (n31 == 55 && entity instanceof StarlightskeletonEntity) {
                                            int n70;
                                            _datEntSetI = (StarlightskeletonEntity)entity;
                                            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntI = (StarlightskeletonEntity)entity;
                                                n70 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                                            } else {
                                                n70 = 0;
                                            }
                                            synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n70 - 1));
                                        }
                                        if (entity instanceof StarlightskeletonEntity) {
                                            _datEntI2 = (StarlightskeletonEntity)entity;
                                            n30 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                        } else {
                                            n30 = 0;
                                        }
                                        if (n30 >= 55) {
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntSetI = (StarlightskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                                            }
                                            if (entity instanceof StarlightskeletonEntity) {
                                                _datEntSetI = (StarlightskeletonEntity)entity;
                                                _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                                            }
                                        }
                                    }
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI6 = (StarlightskeletonEntity)entity;
                                        n29 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                                    } else {
                                        n29 = 0;
                                    }
                                    if (n29 != 3) break block746;
                                    if (entity instanceof StarlightskeletonEntity) {
                                        animatable = (StarlightskeletonEntity)entity;
                                        animatable.setTexture("xing_hui_ku_lou_");
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity3 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity3 = null;
                                    }
                                    if (livingEntity3 != null) {
                                        LivingEntity livingEntity63;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity63 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity63 = null;
                                        }
                                        f3 = entity.m_20270_(livingEntity63);
                                    } else {
                                        f3 = -1.0f;
                                    }
                                    if (f3 > 1.0f) {
                                        LivingEntity livingEntity64;
                                        LivingEntity livingEntity65;
                                        LivingEntity livingEntity66;
                                        LivingEntity livingEntity67;
                                        LivingEntity livingEntity68;
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            v153 = mob.m_5448_();
                                        } else {
                                            v153 = _ent = null;
                                        }
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity68 = mob.m_5448_();
                                        } else {
                                            livingEntity68 = null;
                                        }
                                        double d = livingEntity68.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity67 = mob.m_5448_();
                                        } else {
                                            livingEntity67 = null;
                                        }
                                        int n71 = (int)livingEntity67.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity66 = mob.m_5448_();
                                        } else {
                                            livingEntity66 = null;
                                        }
                                        double d18 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n71, (int)livingEntity66.m_20189_());
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity65 = mob.m_5448_();
                                        } else {
                                            livingEntity65 = null;
                                        }
                                        _ent.m_6021_(d, d18, livingEntity65.m_20189_());
                                        if (_ent instanceof ServerPlayer) {
                                            LivingEntity livingEntity69;
                                            LivingEntity livingEntity70;
                                            LivingEntity livingEntity71;
                                            LivingEntity livingEntity72;
                                            ServerPlayer serverPlayer = (ServerPlayer)_ent;
                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                                            if (entity instanceof Mob) {
                                                _mobEnt4 = (Mob)entity;
                                                livingEntity72 = _mobEnt4.m_5448_();
                                            } else {
                                                livingEntity72 = null;
                                            }
                                            double d19 = livingEntity72.m_20185_();
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt13 = (Mob)entity;
                                                livingEntity71 = _mobEnt13.m_5448_();
                                            } else {
                                                livingEntity71 = null;
                                            }
                                            int n72 = (int)livingEntity71.m_20185_();
                                            if (entity instanceof Mob) {
                                                _mobEnt3 = (Mob)entity;
                                                livingEntity70 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity70 = null;
                                            }
                                            double d20 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n72, (int)livingEntity70.m_20189_());
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                livingEntity69 = _mobEnt2.m_5448_();
                                            } else {
                                                livingEntity69 = null;
                                            }
                                            serverGamePacketListenerImpl.m_9774_(d19, d20, livingEntity69.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                                        }
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity64 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity64 = null;
                                        }
                                        livingEntity64.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                    }
                                    if (entity instanceof Mob) {
                                        _mobEnt6 = (Mob)entity;
                                        livingEntity2 = _mobEnt6.m_5448_();
                                    } else {
                                        livingEntity2 = null;
                                    }
                                    if (livingEntity2 != null) {
                                        LivingEntity livingEntity73;
                                        if (entity instanceof Mob) {
                                            _mobEnt5 = (Mob)entity;
                                            livingEntity73 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity73 = null;
                                        }
                                        f2 = entity.m_20270_(livingEntity73);
                                    } else {
                                        f2 = -1.0f;
                                    }
                                    if (f2 > 1.0f) {
                                        LivingEntity livingEntity74;
                                        LivingEntity livingEntity75;
                                        LivingEntity livingEntity76;
                                        LivingEntity livingEntity77;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity77 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity77 = null;
                                        }
                                        double d = livingEntity77.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            livingEntity76 = mob.m_5448_();
                                        } else {
                                            livingEntity76 = null;
                                        }
                                        double d21 = livingEntity76.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity75 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity75 = null;
                                        }
                                        double d22 = d21 + (double)livingEntity75.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity74 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity74 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity74.m_20189_()));
                                    }
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI2 = (StarlightskeletonEntity)entity;
                                        n28 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n28 = 0;
                                    }
                                    if (n28 == 1) {
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
                                        for (int index2 = 0; index2 < 400; ++index2) {
                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 3.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)1.0, (double)8.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-6.0, (double)6.0));
                                        }
                                        _center2 = new Vec3(x, y, z);
                                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                        for (Entity entityiterator : _entfound) {
                                            double _setval = 4.0;
                                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                capability.camerashake = _setval;
                                                capability.syncPlayerVariables(entityiterator);
                                            });
                                        }
                                    }
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI2 = (StarlightskeletonEntity)entity;
                                        n27 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n27 = 0;
                                    }
                                    if (n27 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                                        _level = (ServerLevel)world;
                                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                                    }
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI2 = (StarlightskeletonEntity)entity;
                                        n26 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n26 = 0;
                                    }
                                    if (n26 == 18) break block747;
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI3 = (StarlightskeletonEntity)entity;
                                        n25 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n25 = 0;
                                    }
                                    if (n25 == 28) break block747;
                                    if (entity instanceof StarlightskeletonEntity) {
                                        _datEntI = (StarlightskeletonEntity)entity;
                                        n24 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n24 = 0;
                                    }
                                    if (n24 == 38) break block747;
                                    if (entity instanceof StarlightskeletonEntity) {
                                        StarlightskeletonEntity starlightskeletonEntity = (StarlightskeletonEntity)entity;
                                        n23 = (Integer)starlightskeletonEntity.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                    } else {
                                        n23 = 0;
                                    }
                                    if (n23 != 48) break block748;
                                }
                                if (world instanceof Level) {
                                    _level5 = (Level)world;
                                    if (!_level5.m_5776_()) {
                                        _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                    } else {
                                        _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                    }
                                }
                            }
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI2 = (StarlightskeletonEntity)entity;
                                n22 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n22 = 0;
                            }
                            if (n22 == 20) break block749;
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI3 = (StarlightskeletonEntity)entity;
                                n21 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n21 = 0;
                            }
                            if (n21 == 30) break block749;
                            if (entity instanceof StarlightskeletonEntity) {
                                _datEntI = (StarlightskeletonEntity)entity;
                                n20 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n20 = 0;
                            }
                            if (n20 == 40) break block749;
                            if (entity instanceof StarlightskeletonEntity) {
                                StarlightskeletonEntity starlightskeletonEntity = (StarlightskeletonEntity)entity;
                                n19 = (Integer)starlightskeletonEntity.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                            } else {
                                n19 = 0;
                            }
                            if (n19 != 50) break block750;
                        }
                        _center3 = new Vec3(x, y, z);
                        List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                        for (Entity entityiterator : _entfound5) {
                            float f20;
                            if (entityiterator instanceof StarlightskeletonEntity) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entityiterator;
                                f20 = _livEnt.m_21233_();
                            } else {
                                f20 = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, f20 / 4.0f + 1000.0f);
                            if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                            if (world instanceof Level) {
                                _level4 = (Level)world;
                                if (!_level4.m_5776_()) {
                                    _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                } else {
                                    _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                }
                            }
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n18 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n18 = 0;
                    }
                    if (n18 == 60) {
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
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
                        for (int index3 = 0; index3 < 16; ++index3) {
                            if (!(world instanceof ServerLevel)) continue;
                            _level3 = (ServerLevel)world;
                            Entity entity4 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level3, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                            if (entity4 == null) continue;
                            entity4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                        _center2 = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                        for (Entity entityiterator : _entfound) {
                            float f21;
                            if (entityiterator instanceof StarlightskeletonEntity) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entityiterator;
                                f21 = _livEnt.m_21233_();
                            } else {
                                f21 = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, f21 / 4.0f + 1000.0f);
                            double _setval = 10.0;
                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                capability.camerashake = _setval;
                                capability.syncPlayerVariables(entityiterator);
                            });
                            if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity || entityiterator instanceof Titangodentity) continue;
                            entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n17 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n17 = 0;
                    }
                    if (n17 == 75 && entity instanceof StarlightskeletonEntity) {
                        int n73;
                        _datEntSetI = (StarlightskeletonEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI = (StarlightskeletonEntity)entity;
                            n73 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                        } else {
                            n73 = 0;
                        }
                        synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n73 - 2));
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n16 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n16 = 0;
                    }
                    if (n16 >= 75) {
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntSetI = (StarlightskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntSetI = (StarlightskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                        }
                    }
                }
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI6 = (StarlightskeletonEntity)entity;
                    n15 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                } else {
                    n15 = 0;
                }
                if (n15 == 4) {
                    int n74;
                    int n75;
                    int n76;
                    int n77;
                    int n78;
                    int n79;
                    float f22;
                    LivingEntity livingEntity78;
                    float f23;
                    LivingEntity livingEntity79;
                    if (entity instanceof StarlightskeletonEntity) {
                        animatable = (StarlightskeletonEntity)entity;
                        animatable.setTexture("alhpa");
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity79 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity79 = null;
                    }
                    if (livingEntity79 != null) {
                        LivingEntity livingEntity80;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity80 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity80 = null;
                        }
                        f23 = entity.m_20270_(livingEntity80);
                    } else {
                        f23 = -1.0f;
                    }
                    if (f23 > 1.0f) {
                        LivingEntity livingEntity81;
                        LivingEntity livingEntity82;
                        LivingEntity livingEntity83;
                        LivingEntity livingEntity84;
                        LivingEntity livingEntity85;
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            v203 = mob.m_5448_();
                        } else {
                            v203 = _ent = null;
                        }
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity85 = mob.m_5448_();
                        } else {
                            livingEntity85 = null;
                        }
                        double d = livingEntity85.m_20185_();
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity84 = mob.m_5448_();
                        } else {
                            livingEntity84 = null;
                        }
                        int n80 = (int)livingEntity84.m_20185_();
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity83 = mob.m_5448_();
                        } else {
                            livingEntity83 = null;
                        }
                        double d23 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n80, (int)livingEntity83.m_20189_());
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity82 = mob.m_5448_();
                        } else {
                            livingEntity82 = null;
                        }
                        _ent.m_6021_(d, d23, livingEntity82.m_20189_());
                        if (_ent instanceof ServerPlayer) {
                            LivingEntity livingEntity86;
                            LivingEntity livingEntity87;
                            LivingEntity livingEntity88;
                            LivingEntity livingEntity89;
                            ServerPlayer serverPlayer = (ServerPlayer)_ent;
                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity89 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity89 = null;
                            }
                            double d24 = livingEntity89.m_20185_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt14 = (Mob)entity;
                                livingEntity88 = _mobEnt14.m_5448_();
                            } else {
                                livingEntity88 = null;
                            }
                            int n81 = (int)livingEntity88.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity87 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity87 = null;
                            }
                            double d25 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, n81, (int)livingEntity87.m_20189_());
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity86 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity86 = null;
                            }
                            serverGamePacketListenerImpl.m_9774_(d24, d25, livingEntity86.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                        }
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity81 = _mobEnt.m_5448_();
                        } else {
                            livingEntity81 = null;
                        }
                        livingEntity81.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    }
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity78 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity78 = null;
                    }
                    if (livingEntity78 != null) {
                        LivingEntity livingEntity90;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity90 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity90 = null;
                        }
                        f22 = entity.m_20270_(livingEntity90);
                    } else {
                        f22 = -1.0f;
                    }
                    if (f22 > 1.0f) {
                        LivingEntity livingEntity91;
                        LivingEntity livingEntity92;
                        LivingEntity livingEntity93;
                        LivingEntity livingEntity94;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity94 = _mobEnt.m_5448_();
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
                        double d26 = livingEntity93.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity92 = _mobEnt.m_5448_();
                        } else {
                            livingEntity92 = null;
                        }
                        double d27 = d26 + (double)livingEntity92.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity91 = _mobEnt.m_5448_();
                        } else {
                            livingEntity91 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d27, livingEntity91.m_20189_()));
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n79 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n79 = 0;
                    }
                    if (n79 == 2 && entity.m_5446_().getString().equals("\u65ed\u8861") && world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "/title @a title [{\"text\":\"\u65ed\u8861\u65e0\u654c\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n78 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n78 = 0;
                    }
                    if (n78 == 4 && world instanceof Level) {
                        _level = (Level)world;
                        if (!_level.m_5776_()) {
                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                        } else {
                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n77 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n77 = 0;
                    }
                    if (n77 == 6) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:chain")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:chain")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                            }
                        }
                        _center2 = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                        for (Entity entityiterator : _entfound) {
                            float f24;
                            if (entityiterator instanceof StarlightskeletonEntity) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entityiterator;
                                f24 = _livEnt.m_21233_();
                            } else {
                                f24 = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, (float)((double)(f24 / 4.0f) + 0.5));
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n76 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n76 = 0;
                    }
                    if (n76 == 17) {
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
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.BALL.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)x, (double)(y + 3.0), (double)z), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n75 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n75 = 0;
                    }
                    if (n75 == 37 && entity instanceof StarlightskeletonEntity) {
                        int n82;
                        _datEntSetI = (StarlightskeletonEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI = (StarlightskeletonEntity)entity;
                            n82 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                        } else {
                            n82 = 0;
                        }
                        synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n82 - 2));
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n74 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n74 = 0;
                    }
                    if (n74 >= 37) {
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntSetI = (StarlightskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntSetI = (StarlightskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                        }
                    }
                }
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI6 = (StarlightskeletonEntity)entity;
                    n14 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                } else {
                    n14 = 0;
                }
                if (n14 == 5) {
                    int n83;
                    int n84;
                    int n85;
                    int n86;
                    int n87;
                    int n88;
                    int n89;
                    int n90;
                    float f25;
                    LivingEntity livingEntity95;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity95 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity95 = null;
                    }
                    if (livingEntity95 != null) {
                        LivingEntity livingEntity96;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity96 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity96 = null;
                        }
                        f25 = entity.m_20270_(livingEntity96);
                    } else {
                        f25 = -1.0f;
                    }
                    if (f25 > 1.0f) {
                        LivingEntity livingEntity97;
                        LivingEntity livingEntity98;
                        LivingEntity livingEntity99;
                        LivingEntity livingEntity100;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity100 = _mobEnt.m_5448_();
                        } else {
                            livingEntity100 = null;
                        }
                        double d = livingEntity100.m_20185_();
                        if (entity instanceof Mob) {
                            Mob mob = (Mob)entity;
                            livingEntity99 = mob.m_5448_();
                        } else {
                            livingEntity99 = null;
                        }
                        double d28 = livingEntity99.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity98 = _mobEnt.m_5448_();
                        } else {
                            livingEntity98 = null;
                        }
                        double d29 = d28 + (double)livingEntity98.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity97 = _mobEnt.m_5448_();
                        } else {
                            livingEntity97 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d29, livingEntity97.m_20189_()));
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n90 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n90 = 0;
                    }
                    if (n90 == 8) {
                        float f26;
                        LivingEntity livingEntity101;
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity101 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity101 = null;
                        }
                        if (livingEntity101 != null) {
                            LivingEntity livingEntity102;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity102 = _mobEnt.m_5448_();
                            } else {
                                livingEntity102 = null;
                            }
                            f26 = entity.m_20270_(livingEntity102);
                        } else {
                            f26 = -1.0f;
                        }
                        if (f26 > 1.0f) {
                            LivingEntity livingEntity103;
                            LivingEntity livingEntity104;
                            LivingEntity livingEntity105;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity105 = mob.m_5448_();
                            } else {
                                livingEntity105 = null;
                            }
                            double d = (livingEntity105.m_20185_() - entity.m_20185_()) * 1.1;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity104 = mob.m_5448_();
                            } else {
                                livingEntity104 = null;
                            }
                            double d30 = (livingEntity104.m_20186_() - entity.m_20186_()) * 1.1;
                            if (entity instanceof Mob) {
                                Mob mob = (Mob)entity;
                                livingEntity103 = mob.m_5448_();
                            } else {
                                livingEntity103 = null;
                            }
                            entity.m_20256_(new Vec3(d, d30, (livingEntity103.m_20189_() - entity.m_20189_()) * 1.1));
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n89 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n89 = 0;
                    }
                    if (n89 <= 14) {
                        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n88 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n88 = 0;
                    }
                    if (n88 > 15) {
                        int n91;
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI3 = (StarlightskeletonEntity)entity;
                            n91 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n91 = 0;
                        }
                        if (n91 < 30) {
                            float f27;
                            LivingEntity livingEntity106;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity106 = _mobEnt.m_5448_();
                            } else {
                                livingEntity106 = null;
                            }
                            if (livingEntity106 != null) {
                                LivingEntity livingEntity107;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity107 = mob.m_5448_();
                                } else {
                                    livingEntity107 = null;
                                }
                                f27 = entity.m_20270_(livingEntity107);
                            } else {
                                f27 = -1.0f;
                            }
                            if (f27 > 1.0f) {
                                int n92;
                                LivingEntity livingEntity108;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt15 = (Mob)entity;
                                    livingEntity108 = _mobEnt15.m_5448_();
                                } else {
                                    livingEntity108 = null;
                                }
                                double d = livingEntity108.m_20186_() - y;
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI5 = (StarlightskeletonEntity)entity;
                                    n92 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                } else {
                                    n92 = 0;
                                }
                                entity.m_20256_(new Vec3(0.0, d * ((30.5 - (double)n92) / 10.0), 0.0));
                            }
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n87 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n87 = 0;
                    }
                    if (n87 >= 30) {
                        int n93;
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI3 = (StarlightskeletonEntity)entity;
                            n93 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                        } else {
                            n93 = 0;
                        }
                        if (n93 <= 35) {
                            float f28;
                            LivingEntity livingEntity109;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity109 = _mobEnt.m_5448_();
                            } else {
                                livingEntity109 = null;
                            }
                            if (livingEntity109 != null) {
                                LivingEntity livingEntity110;
                                if (entity instanceof Mob) {
                                    Mob mob = (Mob)entity;
                                    livingEntity110 = mob.m_5448_();
                                } else {
                                    livingEntity110 = null;
                                }
                                f28 = entity.m_20270_(livingEntity110);
                            } else {
                                f28 = -1.0f;
                            }
                            if (f28 > 1.0f) {
                                int n94;
                                LivingEntity livingEntity111;
                                int n95;
                                int n96;
                                LivingEntity livingEntity112;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt16 = (Mob)entity;
                                    livingEntity112 = _mobEnt16.m_5448_();
                                } else {
                                    livingEntity112 = null;
                                }
                                double d = livingEntity112.m_20185_() - entity.m_20185_();
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI5 = (StarlightskeletonEntity)entity;
                                    n96 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                } else {
                                    n96 = 0;
                                }
                                double d31 = d / (35.5 - (double)n96);
                                double d32 = (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) - entity.m_20186_();
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI5 = (StarlightskeletonEntity)entity;
                                    n95 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                } else {
                                    n95 = 0;
                                }
                                double d33 = d32 / (35.5 - (double)n95) * 3.0;
                                if (entity instanceof Mob) {
                                    Mob _mobEnt17 = (Mob)entity;
                                    livingEntity111 = _mobEnt17.m_5448_();
                                } else {
                                    livingEntity111 = null;
                                }
                                double d34 = livingEntity111.m_20189_() - entity.m_20189_();
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI5 = (StarlightskeletonEntity)entity;
                                    n94 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                } else {
                                    n94 = 0;
                                }
                                entity.m_20256_(new Vec3(d31, d33, d34 / (35.5 - (double)n94)));
                            }
                            _center = new Vec3(x, y, z);
                            List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entityiterator : list) {
                                int n97;
                                if (entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                entityiterator.m_20242_(false);
                                double d = (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) - entity.m_20186_();
                                if (entity instanceof StarlightskeletonEntity) {
                                    _datEntI4 = (StarlightskeletonEntity)entity;
                                    n97 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                                } else {
                                    n97 = 0;
                                }
                                entityiterator.m_20256_(new Vec3(0.0, d / (35.5 - (double)n97) * 3.0, 0.0));
                            }
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n86 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n86 = 0;
                    }
                    if (n86 == 11) {
                        _center2 = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(8.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                        for (Entity entityiterator : _entfound) {
                            float f29;
                            if (entityiterator instanceof StarlightskeletonEntity) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entityiterator;
                                f29 = _livEnt.m_21233_();
                            } else {
                                f29 = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, (float)((double)(f29 / 4.0f) + 0.1));
                            if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                            entityiterator.m_20242_(true);
                            entityiterator.m_20256_(new Vec3(0.0, 3.0, 0.0));
                            if (world instanceof Level) {
                                Level _level6 = (Level)world;
                                if (!_level6.m_5776_()) {
                                    _level6.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                                } else {
                                    _level6.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                                }
                            }
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.CUT.get()), entityiterator.m_20185_(), entityiterator.m_20186_() + (double)entityiterator.m_20206_() / 1.5, entityiterator.m_20189_(), 0.0, 0.0, 0.0);
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n85 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n85 = 0;
                    }
                    if (n85 == 35) {
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
                        for (int index4 = 0; index4 < 16; ++index4) {
                            if (!(world instanceof ServerLevel)) continue;
                            _level3 = (ServerLevel)world;
                            Entity entity5 = ((EntityType)UltimateskeletonsModEntities.STARLIGHTNING.get()).m_262496_(_level3, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                            if (entity5 == null) continue;
                            entity5.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                        _center2 = new Vec3(x, y, z);
                        _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                        for (Entity entityiterator : _entfound) {
                            float f30;
                            if (entityiterator instanceof StarlightskeletonEntity) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                            if (entityiterator instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entityiterator;
                                f30 = _livEnt.m_21233_();
                            } else {
                                f30 = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, f30 / 4.0f + 1000.0f);
                            double _setval = 10.0;
                            entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                capability.camerashake = _setval;
                                capability.syncPlayerVariables(entityiterator);
                            });
                            if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                            entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                        }
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n84 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n84 = 0;
                    }
                    if (n84 == 50 && entity instanceof StarlightskeletonEntity) {
                        int n98;
                        _datEntSetI = (StarlightskeletonEntity)entity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntI = (StarlightskeletonEntity)entity;
                            n98 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
                        } else {
                            n98 = 0;
                        }
                        synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n98 - 1));
                    }
                    if (entity instanceof StarlightskeletonEntity) {
                        _datEntI2 = (StarlightskeletonEntity)entity;
                        n83 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                    } else {
                        n83 = 0;
                    }
                    if (n83 >= 50) {
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntSetI = (StarlightskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
                        }
                        if (entity instanceof StarlightskeletonEntity) {
                            _datEntSetI = (StarlightskeletonEntity)entity;
                            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
                        }
                    }
                }
                if (!(entity instanceof StarlightskeletonEntity)) return;
                _datEntI6 = (StarlightskeletonEntity)entity;
                int n99 = (Integer)_datEntI6.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationID);
                if (n99 != 6) return;
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                if (entity instanceof Mob) {
                    _mobEnt6 = (Mob)entity;
                    livingEntity = _mobEnt6.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity113;
                    if (entity instanceof Mob) {
                        _mobEnt5 = (Mob)entity;
                        livingEntity113 = _mobEnt5.m_5448_();
                    } else {
                        livingEntity113 = null;
                    }
                    f = entity.m_20270_(livingEntity113);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity114;
                    LivingEntity livingEntity115;
                    LivingEntity livingEntity116;
                    LivingEntity livingEntity117;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity117 = _mobEnt.m_5448_();
                    } else {
                        livingEntity117 = null;
                    }
                    double d = livingEntity117.m_20185_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity116 = mob.m_5448_();
                    } else {
                        livingEntity116 = null;
                    }
                    double d35 = livingEntity116.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity115 = _mobEnt.m_5448_();
                    } else {
                        livingEntity115 = null;
                    }
                    double d36 = d35 + (double)livingEntity115.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity114 = _mobEnt.m_5448_();
                    } else {
                        livingEntity114 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d36, livingEntity114.m_20189_()));
                }
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI2 = (StarlightskeletonEntity)entity;
                    n13 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n13 = 0;
                }
                if (n13 == 5) break block751;
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI3 = (StarlightskeletonEntity)entity;
                    n12 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n12 = 0;
                }
                if (n12 == 12) break block751;
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI = (StarlightskeletonEntity)entity;
                    n11 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n11 = 0;
                }
                if (n11 == 17) break block751;
                if (entity instanceof StarlightskeletonEntity) {
                    StarlightskeletonEntity starlightskeletonEntity = (StarlightskeletonEntity)entity;
                    n10 = (Integer)starlightskeletonEntity.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n10 = 0;
                }
                if (n10 == 20) break block751;
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI5 = (StarlightskeletonEntity)entity;
                    n9 = (Integer)_datEntI5.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n9 = 0;
                }
                if (n9 == 23) break block751;
                if (entity instanceof StarlightskeletonEntity) {
                    StarlightskeletonEntity _datEntI9 = (StarlightskeletonEntity)entity;
                    n8 = (Integer)_datEntI9.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n8 = 0;
                }
                if (n8 == 25) break block751;
                if (entity instanceof StarlightskeletonEntity) {
                    _datEntI4 = (StarlightskeletonEntity)entity;
                    n7 = (Integer)_datEntI4.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
                } else {
                    n7 = 0;
                }
                if (n7 != 27) break block752;
            }
            if (world instanceof Level) {
                _level2 = (Level)world;
                if (!_level2.m_5776_()) {
                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                } else {
                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                }
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n6 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n6 = 0;
        }
        if (n6 > 5) {
            int n100;
            if (entity instanceof StarlightskeletonEntity) {
                _datEntI3 = (StarlightskeletonEntity)entity;
                n100 = (Integer)_datEntI3.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
            } else {
                n100 = 0;
            }
            if (n100 < 30) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y + 0.1, z, 0.0, 3.0, 0.0);
                _center = new Vec3(x, y + 8.0, z);
                List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(8.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : list) {
                    float f;
                    if (entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof Player) continue;
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
                _center = new Vec3(x, y, z);
                List<Entity> list2 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(36.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : list2) {
                    if (!(entityiterator.m_20205_() * entityiterator.m_20206_() < 16.0f) || !(entityiterator instanceof LivingEntity)) continue;
                    double _setval = 2.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    if (entityiterator instanceof Player || entityiterator instanceof StarlightskeletonEntity) continue;
                    entityiterator.m_20256_(new Vec3((entity.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8) - entityiterator.m_20185_()) / 4.0, (entity.m_20186_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)8, (int)24) - entityiterator.m_20186_()) / 4.0, (entity.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8) - entityiterator.m_20189_()) / 4.0));
                }
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n5 = 0;
        }
        if (n5 == 31 && world instanceof Level) {
            _level = (Level)world;
            if (!_level.m_5776_()) {
                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angryroar")), SoundSource.NEUTRAL, 40.0f, 1.0f);
            } else {
                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:angryroar")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n4 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n4 = 0;
        }
        if (n4 == 38 && world instanceof Level) {
            _level = (Level)world;
            if (!_level.m_5776_()) {
                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 50.0f, 1.0f);
            } else {
                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n3 = 0;
        }
        if (n3 == 54 && world instanceof Level) {
            _level = (Level)world;
            if (!_level.m_5776_()) {
                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f);
            } else {
                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n2 = 0;
        }
        if (n2 == 55) {
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
            for (int index5 = 0; index5 < 16; ++index5) {
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
                projectile.m_6034_(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-32, (int)32), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)72, (int)100), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-32, (int)32));
                projectile.m_6686_(0.0, -1.0, 0.0, 8.0f, 20.0f);
                projectileLevel.m_7967_((Entity)projectile);
            }
            _center2 = new Vec3(x, y, z);
            _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                if (entityiterator instanceof StarlightskeletonEntity) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f / 4.0f + 1000.0f);
                double _setval = 10.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
            }
        }
        if (entity instanceof StarlightskeletonEntity) {
            _datEntI2 = (StarlightskeletonEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        } else {
            n = 0;
        }
        if (n == 70 && entity instanceof StarlightskeletonEntity) {
            int n101;
            _datEntSetI = (StarlightskeletonEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof StarlightskeletonEntity) {
                _datEntI = (StarlightskeletonEntity)entity;
                n101 = (Integer)_datEntI.m_20088_().m_135370_(StarlightskeletonEntity.DATA_angryCount);
            } else {
                n101 = 0;
            }
            synchedEntityData.m_135381_(StarlightskeletonEntity.DATA_angryCount, (Object)(n101 - 1));
        }
        if (!(entity instanceof StarlightskeletonEntity)) return;
        _datEntI2 = (StarlightskeletonEntity)entity;
        int n102 = (Integer)_datEntI2.m_20088_().m_135370_(StarlightskeletonEntity.DATA_animationTick);
        if (n102 < 70) return;
        if (entity instanceof StarlightskeletonEntity) {
            _datEntSetI = (StarlightskeletonEntity)entity;
            _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationTick, (Object)0);
        }
        if (!(entity instanceof StarlightskeletonEntity)) return;
        _datEntSetI = (StarlightskeletonEntity)entity;
        _datEntSetI.m_20088_().m_135381_(StarlightskeletonEntity.DATA_animationID, (Object)0);
    }
}

