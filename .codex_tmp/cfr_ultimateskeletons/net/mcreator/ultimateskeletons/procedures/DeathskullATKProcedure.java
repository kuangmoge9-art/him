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
 *  net.minecraft.world.effect.MobEffect
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
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
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
import net.mcreator.ultimateskeletons.entity.DeathskullEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModMobEffects;
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
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class DeathskullATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        Object entityToSpawn;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        Vec3 _center;
        Level _level;
        DeathskullEntity _datEntI;
        DeathskullEntity _datEntSetI;
        Level _level2;
        DeathskullEntity _datEntI2;
        Level _level3;
        DeathskullEntity _datEntI3;
        DeathskullEntity _datEntSetI2;
        block528: {
            int n;
            int n2;
            LivingEntity _entity;
            LivingEntity _livEnt2;
            List<Entity> _entfound2;
            Vec3 _center2;
            block532: {
                block531: {
                    int n3;
                    int n4;
                    block530: {
                        block529: {
                            int n5;
                            int n6;
                            int n7;
                            int n8;
                            Object _serverPlayer;
                            Object _ent;
                            Mob _mobEnt;
                            Mob _mobEnt2;
                            Mob _mobEnt3;
                            Mob _mobEnt4;
                            Mob _mobEnt5;
                            Mob _mobEnt6;
                            DeathskullEntity _datEntI4;
                            block523: {
                                int n9;
                                block527: {
                                    block526: {
                                        int n10;
                                        int n11;
                                        block525: {
                                            Level _level4;
                                            block524: {
                                                int n12;
                                                int n13;
                                                int n14;
                                                int n15;
                                                int n16;
                                                int n17;
                                                int n18;
                                                int n19;
                                                List<Entity> _entfound3;
                                                Vec3 _center3;
                                                block519: {
                                                    block520: {
                                                        block521: {
                                                            int n20;
                                                            Mob _mobEnt7;
                                                            block522: {
                                                                float f2;
                                                                LivingEntity livingEntity;
                                                                float f3;
                                                                LivingEntity livingEntity2;
                                                                float f4;
                                                                LivingEntity livingEntity3;
                                                                float f5;
                                                                LivingEntity livingEntity4;
                                                                float f6;
                                                                Object object;
                                                                LivingEntity livingEntity5;
                                                                int n21;
                                                                int n22;
                                                                int n23;
                                                                int n24;
                                                                int n25;
                                                                int n26;
                                                                int n27;
                                                                int n28;
                                                                int n29;
                                                                int n30;
                                                                int n31;
                                                                LivingEntity _entity2;
                                                                if (entity == null) {
                                                                    return;
                                                                }
                                                                double theta = 0.0;
                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_1.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.3, 0.0);
                                                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_2.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.3, 0.0);
                                                                ((LivingEntity)entity).m_21051_(Attributes.f_22284_).m_22100_(1024.0);
                                                                ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(1024.0);
                                                                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                    _entity2.m_7292_(new MobEffectInstance((MobEffect)UltimateskeletonsModMobEffects.DEATHCURE.get(), 10000000, 0));
                                                                }
                                                                if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                    _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n31 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_deathID);
                                                                } else {
                                                                    n31 = 0;
                                                                }
                                                                if (n31 < 4 && entity instanceof DeathskullEntity) {
                                                                    int n32;
                                                                    _datEntSetI2 = (DeathskullEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                    if (entity instanceof DeathskullEntity) {
                                                                        _datEntI3 = (DeathskullEntity)entity;
                                                                        n32 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_themeTick);
                                                                    } else {
                                                                        n32 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(DeathskullEntity.DATA_themeTick, (Object)(n32 + 1));
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n30 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_themeTick);
                                                                } else {
                                                                    n30 = 0;
                                                                }
                                                                if (n30 == 1 && world instanceof Level) {
                                                                    _level3 = (Level)world;
                                                                    if (!_level3.m_5776_()) {
                                                                        _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:death")), SoundSource.MASTER, 500.0f, 1.0f);
                                                                    } else {
                                                                        _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:death")), SoundSource.MASTER, 500.0f, 1.0f, false);
                                                                    }
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n29 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_themeTick);
                                                                } else {
                                                                    n29 = 0;
                                                                }
                                                                if (n29 >= 2920 && entity instanceof DeathskullEntity) {
                                                                    _datEntSetI2 = (DeathskullEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(DeathskullEntity.DATA_themeTick, (Object)0);
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n28 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_deathID);
                                                                } else {
                                                                    n28 = 0;
                                                                }
                                                                if (n28 < 5 && entity instanceof DeathskullEntity) {
                                                                    int n33;
                                                                    _datEntSetI2 = (DeathskullEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                    if (entity instanceof DeathskullEntity) {
                                                                        _datEntI3 = (DeathskullEntity)entity;
                                                                        n33 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_spawnTick);
                                                                    } else {
                                                                        n33 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(DeathskullEntity.DATA_spawnTick, (Object)(n33 + 1));
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n27 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_spawnTick);
                                                                } else {
                                                                    n27 = 0;
                                                                }
                                                                if (n27 <= 165) {
                                                                    if (entity instanceof LivingEntity) {
                                                                        float f7;
                                                                        LivingEntity _entity3 = (LivingEntity)entity;
                                                                        if (entity instanceof LivingEntity) {
                                                                            LivingEntity _livEnt3 = (LivingEntity)entity;
                                                                            f7 = _livEnt3.m_21233_();
                                                                        } else {
                                                                            f7 = -1.0f;
                                                                        }
                                                                        _entity3.m_21153_(f7);
                                                                    }
                                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                                    if (entity instanceof LivingEntity) {
                                                                        ((LivingEntity)entity).f_20919_ = 0;
                                                                    }
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n26 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_spawnTick);
                                                                } else {
                                                                    n26 = 0;
                                                                }
                                                                if (n26 <= 10 && entity instanceof DeathskullEntity) {
                                                                    ((DeathskullEntity)entity).setAnimation("animation.spawn");
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n25 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_spawnTick);
                                                                } else {
                                                                    n25 = 0;
                                                                }
                                                                if (n25 == 75) {
                                                                    if (world instanceof Level) {
                                                                        _level3 = (Level)world;
                                                                        if (!_level3.m_5776_()) {
                                                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:fall")), SoundSource.NEUTRAL, 4.0f, 1.0f);
                                                                        } else {
                                                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:fall")), SoundSource.NEUTRAL, 4.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    _center3 = new Vec3(x, y, z);
                                                                    _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                                    for (Entity entityiterator : _entfound3) {
                                                                        if (entityiterator == entity) continue;
                                                                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1.0f);
                                                                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 1.0f);
                                                                    }
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n24 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_spawnTick);
                                                                } else {
                                                                    n24 = 0;
                                                                }
                                                                if (n24 == 148) {
                                                                    if (world instanceof Level) {
                                                                        _level3 = (Level)world;
                                                                        if (!_level3.m_5776_()) {
                                                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 4.0f, 1.0f);
                                                                        } else {
                                                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 4.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    _center3 = new Vec3(x, y, z);
                                                                    _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                                    for (Entity entityiterator : _entfound3) {
                                                                        if (entityiterator == entity) continue;
                                                                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1.0f);
                                                                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 1.0f);
                                                                    }
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n23 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_animationID);
                                                                } else {
                                                                    n23 = 0;
                                                                }
                                                                if (n23 != 0 && entity instanceof DeathskullEntity) {
                                                                    int n34;
                                                                    _datEntSetI2 = (DeathskullEntity)entity;
                                                                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                    if (entity instanceof DeathskullEntity) {
                                                                        _datEntI3 = (DeathskullEntity)entity;
                                                                        n34 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                                    } else {
                                                                        n34 = 0;
                                                                    }
                                                                    synchedEntityData.m_135381_(DeathskullEntity.DATA_animationTick, (Object)(n34 + 1));
                                                                }
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI4 = (DeathskullEntity)entity;
                                                                    n22 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_deathID);
                                                                } else {
                                                                    n22 = 0;
                                                                }
                                                                if (n22 >= 4) break block519;
                                                                if (entity instanceof DeathskullEntity) {
                                                                    _datEntI2 = (DeathskullEntity)entity;
                                                                    n21 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_spawnTick);
                                                                } else {
                                                                    n21 = 0;
                                                                }
                                                                if (n21 <= 165) break block519;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt6 = (Mob)entity;
                                                                    livingEntity5 = _mobEnt6.m_5448_();
                                                                } else {
                                                                    livingEntity5 = null;
                                                                }
                                                                if (livingEntity5 == null) break block520;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt5 = (Mob)entity;
                                                                    v19 = _mobEnt5.m_5448_();
                                                                } else {
                                                                    v19 = object = null;
                                                                }
                                                                if (object instanceof LivingEntity) {
                                                                    LivingEntity _livEnt4 = object;
                                                                    f6 = _livEnt4.m_21223_();
                                                                } else {
                                                                    f6 = -1.0f;
                                                                }
                                                                if (!(f6 > 0.0f)) break block521;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity4 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity4 = null;
                                                                }
                                                                if (livingEntity4 != null) {
                                                                    LivingEntity livingEntity6;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity6 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity6 = null;
                                                                    }
                                                                    f5 = entity.m_20270_(livingEntity6);
                                                                } else {
                                                                    f5 = -1.0f;
                                                                }
                                                                if (f5 >= 20.0f) {
                                                                    entity.m_6858_(true);
                                                                } else {
                                                                    entity.m_6858_(false);
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity3 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity3 = null;
                                                                }
                                                                if (livingEntity3 != null) {
                                                                    LivingEntity livingEntity7;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity7 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity7 = null;
                                                                    }
                                                                    f4 = entity.m_20270_(livingEntity7);
                                                                } else {
                                                                    f4 = -1.0f;
                                                                }
                                                                if (f4 > 4.0f) {
                                                                    if (entity instanceof Mob) {
                                                                        LivingEntity livingEntity8;
                                                                        LivingEntity livingEntity9;
                                                                        LivingEntity livingEntity10;
                                                                        _entity = (Mob)entity;
                                                                        PathNavigation pathNavigation = _entity.m_21573_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt2 = (Mob)entity;
                                                                            livingEntity10 = _mobEnt2.m_5448_();
                                                                        } else {
                                                                            livingEntity10 = null;
                                                                        }
                                                                        double d = livingEntity10.m_20185_();
                                                                        if (entity instanceof Mob) {
                                                                            Mob _mobEnt8 = (Mob)entity;
                                                                            livingEntity9 = _mobEnt8.m_5448_();
                                                                        } else {
                                                                            livingEntity9 = null;
                                                                        }
                                                                        double d2 = livingEntity9.m_20186_();
                                                                        if (entity instanceof Mob) {
                                                                            _mobEnt7 = (Mob)entity;
                                                                            livingEntity8 = _mobEnt7.m_5448_();
                                                                        } else {
                                                                            livingEntity8 = null;
                                                                        }
                                                                        pathNavigation.m_26519_(d, d2, livingEntity8.m_20189_(), 1.6);
                                                                    }
                                                                } else if (entity instanceof Mob) {
                                                                    _entity = (Mob)entity;
                                                                    _entity.m_21573_().m_26573_();
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt4 = (Mob)entity;
                                                                    livingEntity2 = _mobEnt4.m_5448_();
                                                                } else {
                                                                    livingEntity2 = null;
                                                                }
                                                                if (livingEntity2 != null) {
                                                                    LivingEntity livingEntity11;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt3 = (Mob)entity;
                                                                        livingEntity11 = _mobEnt3.m_5448_();
                                                                    } else {
                                                                        livingEntity11 = null;
                                                                    }
                                                                    f3 = entity.m_20270_(livingEntity11);
                                                                } else {
                                                                    f3 = -1.0f;
                                                                }
                                                                if (!(f3 < 500.0f)) break block519;
                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) break block522;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity = null;
                                                                }
                                                                if (livingEntity != null) {
                                                                    LivingEntity livingEntity12;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt2 = (Mob)entity;
                                                                        livingEntity12 = _mobEnt2.m_5448_();
                                                                    } else {
                                                                        livingEntity12 = null;
                                                                    }
                                                                    f2 = entity.m_20270_(livingEntity12);
                                                                } else {
                                                                    f2 = -1.0f;
                                                                }
                                                                if (!(f2 < 12.0f)) break block519;
                                                            }
                                                            if (entity instanceof DeathskullEntity) {
                                                                DeathskullEntity _datEntI5 = (DeathskullEntity)entity;
                                                                n20 = (Integer)_datEntI5.m_20088_().m_135370_(DeathskullEntity.DATA_animationID);
                                                            } else {
                                                                n20 = 0;
                                                            }
                                                            if (n20 == 0) {
                                                                LivingEntity livingEntity;
                                                                LivingEntity livingEntity13;
                                                                LivingEntity livingEntity14;
                                                                LivingEntity livingEntity15;
                                                                if (entity instanceof DeathskullEntity) {
                                                                    DeathskullEntity _datEntSetI3 = (DeathskullEntity)entity;
                                                                    _datEntSetI3.m_20088_().m_135381_(DeathskullEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5));
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt7 = (Mob)entity;
                                                                    livingEntity15 = _mobEnt7.m_5448_();
                                                                } else {
                                                                    livingEntity15 = null;
                                                                }
                                                                double d = livingEntity15.m_20185_();
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt9 = (Mob)entity;
                                                                    livingEntity14 = _mobEnt9.m_5448_();
                                                                } else {
                                                                    livingEntity14 = null;
                                                                }
                                                                double d3 = livingEntity14.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt7 = (Mob)entity;
                                                                    livingEntity13 = _mobEnt7.m_5448_();
                                                                } else {
                                                                    livingEntity13 = null;
                                                                }
                                                                double d4 = d3 + (double)livingEntity13.m_20206_() / 1.5;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt7 = (Mob)entity;
                                                                    livingEntity = _mobEnt7.m_5448_();
                                                                } else {
                                                                    livingEntity = null;
                                                                }
                                                                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d4, livingEntity.m_20189_()));
                                                            }
                                                            break block519;
                                                        }
                                                        if (!entity.m_20096_()) {
                                                            entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
                                                        }
                                                        break block519;
                                                    }
                                                    if (!entity.m_20096_()) {
                                                        entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
                                                    }
                                                }
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI4 = (DeathskullEntity)entity;
                                                    n19 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_animationID);
                                                } else {
                                                    n19 = 0;
                                                }
                                                if (n19 == 1) {
                                                    int n35;
                                                    int n36;
                                                    int n37;
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                                                        if (entity instanceof DeathskullEntity) {
                                                            ((DeathskullEntity)entity).setAnimation("animation.attack1");
                                                        }
                                                    } else if (entity instanceof DeathskullEntity) {
                                                        ((DeathskullEntity)entity).setAnimation("animation.attack2");
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n37 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n37 = 0;
                                                    }
                                                    if (n37 == 1) {
                                                        float f8;
                                                        LivingEntity livingEntity;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity = null;
                                                        }
                                                        if (livingEntity != null) {
                                                            LivingEntity livingEntity16;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity16 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity16 = null;
                                                            }
                                                            f8 = entity.m_20270_(livingEntity16);
                                                        } else {
                                                            f8 = -1.0f;
                                                        }
                                                        if (f8 > 5.0f) {
                                                            LivingEntity livingEntity17;
                                                            LivingEntity livingEntity18;
                                                            LivingEntity livingEntity19;
                                                            _ent = entity;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity19 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity19 = null;
                                                            }
                                                            double d = livingEntity19.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity18 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity18 = null;
                                                            }
                                                            double d5 = livingEntity18.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity17 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity17 = null;
                                                            }
                                                            _ent.m_6021_(d, d5, livingEntity17.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                                                            if (_ent instanceof ServerPlayer) {
                                                                LivingEntity livingEntity20;
                                                                LivingEntity livingEntity21;
                                                                LivingEntity livingEntity22;
                                                                _serverPlayer = (ServerPlayer)_ent;
                                                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = ((ServerPlayer)_serverPlayer).f_8906_;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity22 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity22 = null;
                                                                }
                                                                double d6 = livingEntity22.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity21 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity21 = null;
                                                                }
                                                                double d7 = livingEntity21.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity20 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity20 = null;
                                                                }
                                                                serverGamePacketListenerImpl.m_9774_(d6, d7, livingEntity20.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), _ent.m_146908_(), _ent.m_146909_());
                                                            }
                                                            world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n36 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n36 = 0;
                                                    }
                                                    if (n36 == 16) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                        for (Entity entityiterator : _entfound2) {
                                                            float f9;
                                                            float f10;
                                                            if (entityiterator instanceof DeathskullEntity) continue;
                                                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f10 = _livEnt2.m_21233_();
                                                            } else {
                                                                f10 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource, f10 / 40.0f + 240.0f);
                                                            DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f9 = _livEnt2.m_21233_();
                                                            } else {
                                                                f9 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource2, f9 / 40.0f + 240.0f);
                                                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                                                        }
                                                    }
                                                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n35 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n35 = 0;
                                                    }
                                                    if (n35 >= 30) {
                                                        if (entity instanceof DeathskullEntity) {
                                                            _datEntSetI = (DeathskullEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof DeathskullEntity) {
                                                            _datEntSetI = (DeathskullEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof DeathskullEntity) {
                                                            ((DeathskullEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI4 = (DeathskullEntity)entity;
                                                    n18 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_animationID);
                                                } else {
                                                    n18 = 0;
                                                }
                                                if (n18 == 2) {
                                                    int n38;
                                                    int n39;
                                                    int n40;
                                                    int n41;
                                                    int n42;
                                                    if (entity instanceof DeathskullEntity) {
                                                        ((DeathskullEntity)entity).setAnimation("animation.lightningball");
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n42 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n42 = 0;
                                                    }
                                                    if (n42 <= 1) {
                                                        entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n41 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n41 = 0;
                                                    }
                                                    if (n41 == 5) {
                                                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 1) {
                                                            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 20, 1));
                                                            }
                                                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 2) {
                                                            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19598_, 200, 20));
                                                            }
                                                        } else if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19596_, 200, 2));
                                                        }
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n40 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n40 = 0;
                                                    }
                                                    if (n40 >= 20) {
                                                        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n39 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n39 = 0;
                                                    }
                                                    if (n39 == 16) {
                                                        if (world instanceof ServerLevel) {
                                                            _level2 = (ServerLevel)world;
                                                            Entity entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.ELECTRICBOMB.get()).m_262496_((ServerLevel)_level2, BlockPos.m_274561_((double)(x + 4.0 * Math.cos(entity.m_146908_())), (double)(y + 3.0), (double)(z + 4.0 * Math.sin(entity.m_146908_()))), MobSpawnType.MOB_SUMMONED);
                                                            if (entityToSpawn2 != null) {
                                                                entityToSpawn2.m_20334_(0.0, 0.0, 0.0);
                                                            }
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                        for (Entity entityiterator : _entfound2) {
                                                            float f11;
                                                            float f12;
                                                            if (entityiterator instanceof DeathskullEntity) continue;
                                                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f12 = _livEnt2.m_21233_();
                                                            } else {
                                                                f12 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource, f12 / 40.0f + 240.0f);
                                                            DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f11 = _livEnt2.m_21233_();
                                                            } else {
                                                                f11 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource3, f11 / 40.0f + 240.0f);
                                                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                                                            if (entityiterator instanceof Player) continue;
                                                            entityiterator.f_19802_ = 0;
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n38 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n38 = 0;
                                                    }
                                                    if (n38 >= 40) {
                                                        if (entity instanceof DeathskullEntity) {
                                                            _datEntSetI = (DeathskullEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof DeathskullEntity) {
                                                            _datEntSetI = (DeathskullEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof DeathskullEntity) {
                                                            ((DeathskullEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI4 = (DeathskullEntity)entity;
                                                    n17 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_animationID);
                                                } else {
                                                    n17 = 0;
                                                }
                                                if (n17 == 3) {
                                                    int n43;
                                                    int n44;
                                                    int n45;
                                                    int n46;
                                                    int n47;
                                                    int n48;
                                                    int n49;
                                                    int n50;
                                                    int n51;
                                                    if (entity instanceof DeathskullEntity) {
                                                        ((DeathskullEntity)entity).setAnimation("animation.ULTRA");
                                                    }
                                                    _center3 = new Vec3(x, y, z);
                                                    _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(128.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                    for (Entity entityiterator : _entfound3) {
                                                        if (entityiterator instanceof DeathskullEntity || entityiterator instanceof Player) continue;
                                                        entityiterator.f_19802_ = 0;
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n51 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n51 = 0;
                                                    }
                                                    if (n51 == 1) {
                                                        float f13;
                                                        LivingEntity livingEntity;
                                                        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 40, 4));
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity = null;
                                                        }
                                                        if (livingEntity != null) {
                                                            LivingEntity livingEntity23;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity23 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity23 = null;
                                                            }
                                                            f13 = entity.m_20270_(livingEntity23);
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (f13 > 5.0f) {
                                                            LivingEntity livingEntity24;
                                                            LivingEntity livingEntity25;
                                                            LivingEntity livingEntity26;
                                                            _ent = entity;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity26 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity26 = null;
                                                            }
                                                            double d = livingEntity26.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity25 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity25 = null;
                                                            }
                                                            double d8 = livingEntity25.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity24 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity24 = null;
                                                            }
                                                            _ent.m_6021_(d, d8, livingEntity24.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                                                            if (_ent instanceof ServerPlayer) {
                                                                LivingEntity livingEntity27;
                                                                LivingEntity livingEntity28;
                                                                LivingEntity livingEntity29;
                                                                _serverPlayer = (ServerPlayer)_ent;
                                                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = ((ServerPlayer)_serverPlayer).f_8906_;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity29 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity29 = null;
                                                                }
                                                                double d9 = livingEntity29.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity28 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity28 = null;
                                                                }
                                                                double d10 = livingEntity28.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity27 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity27 = null;
                                                                }
                                                                serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity27.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), _ent.m_146908_(), _ent.m_146909_());
                                                            }
                                                            world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n50 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n50 = 0;
                                                    }
                                                    if (n50 == 15) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                        for (Entity entityiterator : _entfound2) {
                                                            float f14;
                                                            float f15;
                                                            if (entityiterator instanceof DeathskullEntity) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f15 = _livEnt2.m_21233_();
                                                            } else {
                                                                f15 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource, f15 / 40.0f + 240.0f);
                                                            DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f14 = _livEnt2.m_21233_();
                                                            } else {
                                                                f14 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource4, f14 / 40.0f + 240.0f);
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n49 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n49 = 0;
                                                    }
                                                    if (n49 == 20) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                        for (Entity entityiterator : _entfound2) {
                                                            float f16;
                                                            float f17;
                                                            if (entityiterator instanceof DeathskullEntity) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f17 = _livEnt2.m_21233_();
                                                            } else {
                                                                f17 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource, f17 / 40.0f + 240.0f);
                                                            DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f16 = _livEnt2.m_21233_();
                                                            } else {
                                                                f16 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource5, f16 / 40.0f + 240.0f);
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n48 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n48 = 0;
                                                    }
                                                    if (n48 == 25) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                        for (Entity entityiterator : _entfound2) {
                                                            float f18;
                                                            float f19;
                                                            if (entityiterator instanceof DeathskullEntity) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f19 = _livEnt2.m_21233_();
                                                            } else {
                                                                f19 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource, f19 / 40.0f + 240.0f);
                                                            DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f18 = _livEnt2.m_21233_();
                                                            } else {
                                                                f18 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource6, f18 / 40.0f + 240.0f);
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n47 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n47 = 0;
                                                    }
                                                    if (n47 == 30) {
                                                        if (world instanceof Level) {
                                                            _level2 = (Level)world;
                                                            if (!_level2.m_5776_()) {
                                                                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                            } else {
                                                                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                            }
                                                        }
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                        for (Entity entityiterator : _entfound2) {
                                                            float f20;
                                                            float f21;
                                                            if (entityiterator instanceof DeathskullEntity) continue;
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f21 = _livEnt2.m_21233_();
                                                            } else {
                                                                f21 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource, f21 / 40.0f + 240.0f);
                                                            DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f20 = _livEnt2.m_21233_();
                                                            } else {
                                                                f20 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource7, f20 / 40.0f + 240.0f);
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n46 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n46 = 0;
                                                    }
                                                    if (n46 == 42) {
                                                        float f22;
                                                        LivingEntity livingEntity;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity = null;
                                                        }
                                                        if (livingEntity != null) {
                                                            LivingEntity livingEntity30;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity30 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity30 = null;
                                                            }
                                                            f22 = entity.m_20270_(livingEntity30);
                                                        } else {
                                                            f22 = -1.0f;
                                                        }
                                                        if (f22 > 5.0f) {
                                                            LivingEntity livingEntity31;
                                                            LivingEntity livingEntity32;
                                                            LivingEntity livingEntity33;
                                                            if (world instanceof Level) {
                                                                _level4 = (Level)world;
                                                                if (!_level4.m_5776_()) {
                                                                    _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                                } else {
                                                                    _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                                }
                                                            }
                                                            _ent = entity;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity33 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity33 = null;
                                                            }
                                                            double d = livingEntity33.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity32 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity32 = null;
                                                            }
                                                            double d11 = livingEntity32.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity31 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity31 = null;
                                                            }
                                                            _ent.m_6021_(d, d11, livingEntity31.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                                                            if (_ent instanceof ServerPlayer) {
                                                                LivingEntity livingEntity34;
                                                                LivingEntity livingEntity35;
                                                                LivingEntity livingEntity36;
                                                                _serverPlayer = (ServerPlayer)_ent;
                                                                ServerGamePacketListenerImpl serverGamePacketListenerImpl = ((ServerPlayer)_serverPlayer).f_8906_;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity36 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity36 = null;
                                                                }
                                                                double d12 = livingEntity36.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt = (Mob)entity;
                                                                    livingEntity35 = _mobEnt.m_5448_();
                                                                } else {
                                                                    livingEntity35 = null;
                                                                }
                                                                double d13 = livingEntity35.m_20186_();
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt2 = (Mob)entity;
                                                                    livingEntity34 = _mobEnt2.m_5448_();
                                                                } else {
                                                                    livingEntity34 = null;
                                                                }
                                                                serverGamePacketListenerImpl.m_9774_(d12, d13, livingEntity34.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), _ent.m_146908_(), _ent.m_146909_());
                                                            }
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n45 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n45 = 0;
                                                    }
                                                    if (n45 == 75 && world instanceof Level) {
                                                        _level2 = (Level)world;
                                                        if (!_level2.m_5776_()) {
                                                            _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                                        } else {
                                                            _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n44 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n44 = 0;
                                                    }
                                                    if (n44 >= 75) {
                                                        _center2 = new Vec3(x, y, z);
                                                        _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(128.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                        for (Entity entityiterator : _entfound2) {
                                                            float f23;
                                                            float f24;
                                                            if (entityiterator instanceof DeathskullEntity) continue;
                                                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                                                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f24 = _livEnt2.m_21233_();
                                                            } else {
                                                                f24 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource, f24 / 40.0f + 240.0f);
                                                            DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                                            if (entityiterator instanceof LivingEntity) {
                                                                _livEnt2 = (LivingEntity)entityiterator;
                                                                f23 = _livEnt2.m_21233_();
                                                            } else {
                                                                f23 = -1.0f;
                                                            }
                                                            entityiterator.m_6469_(damageSource8, f23 / 40.0f + 240.0f);
                                                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                                                            if (entityiterator instanceof Player || Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)1.0, (double)4.0) != 2.0) continue;
                                                            if (entityiterator instanceof LivingEntity) {
                                                                LivingEntity _entity4 = (LivingEntity)entityiterator;
                                                                _entity4.m_21153_(0.0f);
                                                            }
                                                            if (entityiterator.m_9236_().m_5776_()) continue;
                                                            entityiterator.m_146870_();
                                                        }
                                                    }
                                                    if (entity instanceof DeathskullEntity) {
                                                        _datEntI2 = (DeathskullEntity)entity;
                                                        n43 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                    } else {
                                                        n43 = 0;
                                                    }
                                                    if (n43 >= 94) {
                                                        if (entity instanceof DeathskullEntity) {
                                                            _datEntSetI = (DeathskullEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationTick, (Object)0);
                                                        }
                                                        if (entity instanceof DeathskullEntity) {
                                                            _datEntSetI = (DeathskullEntity)entity;
                                                            _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationID, (Object)0);
                                                        }
                                                        if (entity instanceof DeathskullEntity) {
                                                            ((DeathskullEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI4 = (DeathskullEntity)entity;
                                                    n16 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_animationID);
                                                } else {
                                                    n16 = 0;
                                                }
                                                if (n16 != 4) break block523;
                                                if (entity instanceof DeathskullEntity) {
                                                    ((DeathskullEntity)entity).setAnimation("animation.harvest");
                                                }
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI2 = (DeathskullEntity)entity;
                                                    n15 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                } else {
                                                    n15 = 0;
                                                }
                                                if (n15 == 1) {
                                                    float f25;
                                                    LivingEntity livingEntity;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity = null;
                                                    }
                                                    if (livingEntity != null) {
                                                        LivingEntity livingEntity37;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt5 = (Mob)entity;
                                                            livingEntity37 = _mobEnt5.m_5448_();
                                                        } else {
                                                            livingEntity37 = null;
                                                        }
                                                        f25 = entity.m_20270_(livingEntity37);
                                                    } else {
                                                        f25 = -1.0f;
                                                    }
                                                    if (f25 > 5.0f) {
                                                        LivingEntity livingEntity38;
                                                        LivingEntity livingEntity39;
                                                        LivingEntity livingEntity40;
                                                        _ent = entity;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity40 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity40 = null;
                                                        }
                                                        double d = livingEntity40.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity39 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity39 = null;
                                                        }
                                                        double d14 = livingEntity39.m_20186_();
                                                        if (entity instanceof Mob) {
                                                            _mobEnt4 = (Mob)entity;
                                                            livingEntity38 = _mobEnt4.m_5448_();
                                                        } else {
                                                            livingEntity38 = null;
                                                        }
                                                        _ent.m_6021_(d, d14, livingEntity38.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                                                        if (_ent instanceof ServerPlayer) {
                                                            LivingEntity livingEntity41;
                                                            LivingEntity livingEntity42;
                                                            LivingEntity livingEntity43;
                                                            _serverPlayer = (ServerPlayer)_ent;
                                                            ServerGamePacketListenerImpl serverGamePacketListenerImpl = ((ServerPlayer)_serverPlayer).f_8906_;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt3 = (Mob)entity;
                                                                livingEntity43 = _mobEnt3.m_5448_();
                                                            } else {
                                                                livingEntity43 = null;
                                                            }
                                                            double d15 = livingEntity43.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity42 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity42 = null;
                                                            }
                                                            double d16 = livingEntity42.m_20186_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt2 = (Mob)entity;
                                                                livingEntity41 = _mobEnt2.m_5448_();
                                                            } else {
                                                                livingEntity41 = null;
                                                            }
                                                            serverGamePacketListenerImpl.m_9774_(d15, d16, livingEntity41.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), _ent.m_146908_(), _ent.m_146909_());
                                                        }
                                                        world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                                                    }
                                                }
                                                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI2 = (DeathskullEntity)entity;
                                                    n14 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                } else {
                                                    n14 = 0;
                                                }
                                                if (n14 == 5) break block524;
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI3 = (DeathskullEntity)entity;
                                                    n13 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                } else {
                                                    n13 = 0;
                                                }
                                                if (n13 == 21) break block524;
                                                if (entity instanceof DeathskullEntity) {
                                                    _datEntI = (DeathskullEntity)entity;
                                                    n12 = (Integer)_datEntI.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                                } else {
                                                    n12 = 0;
                                                }
                                                if (n12 != 25) break block525;
                                            }
                                            if (world instanceof Level) {
                                                _level4 = (Level)world;
                                                if (!_level4.m_5776_()) {
                                                    _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f);
                                                } else {
                                                    _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 50.0f, 1.0f, false);
                                                }
                                            }
                                        }
                                        if (entity instanceof DeathskullEntity) {
                                            _datEntI2 = (DeathskullEntity)entity;
                                            n11 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                        } else {
                                            n11 = 0;
                                        }
                                        if (n11 == 23) break block526;
                                        if (entity instanceof DeathskullEntity) {
                                            _datEntI3 = (DeathskullEntity)entity;
                                            n10 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                        } else {
                                            n10 = 0;
                                        }
                                        if (n10 != 27) break block527;
                                    }
                                    if (world instanceof Level) {
                                        _level = (Level)world;
                                        if (!_level.m_5776_()) {
                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                        } else {
                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:tiaozhan")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                        }
                                    }
                                    _center = new Vec3(x, y, z);
                                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                                    for (Entity entityiterator : _entfound) {
                                        float f26;
                                        if (entityiterator instanceof DeathskullEntity) continue;
                                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                        if (entityiterator instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entityiterator;
                                            f26 = _livEnt.m_21233_();
                                        } else {
                                            f26 = -1.0f;
                                        }
                                        entityiterator.m_6469_(damageSource, f26 / 4.0f + 1000.0f);
                                        if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                                        entityiterator.f_19802_ = 0;
                                    }
                                }
                                if (entity instanceof DeathskullEntity) {
                                    _datEntI2 = (DeathskullEntity)entity;
                                    n9 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                                } else {
                                    n9 = 0;
                                }
                                if (n9 >= 47) {
                                    if (entity instanceof DeathskullEntity) {
                                        _datEntSetI = (DeathskullEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationTick, (Object)0);
                                    }
                                    if (entity instanceof DeathskullEntity) {
                                        _datEntSetI = (DeathskullEntity)entity;
                                        _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationID, (Object)0);
                                    }
                                    if (entity instanceof DeathskullEntity) {
                                        ((DeathskullEntity)entity).setAnimation("empty");
                                    }
                                }
                            }
                            if (entity instanceof DeathskullEntity) {
                                _datEntI4 = (DeathskullEntity)entity;
                                n8 = (Integer)_datEntI4.m_20088_().m_135370_(DeathskullEntity.DATA_animationID);
                            } else {
                                n8 = 0;
                            }
                            if (n8 != 5) break block528;
                            if (entity instanceof DeathskullEntity) {
                                ((DeathskullEntity)entity).setAnimation("animation.swipe");
                            }
                            if (entity instanceof DeathskullEntity) {
                                _datEntI2 = (DeathskullEntity)entity;
                                n7 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                            } else {
                                n7 = 0;
                            }
                            if (n7 == 1) {
                                float f27;
                                LivingEntity livingEntity;
                                if (entity instanceof Mob) {
                                    _mobEnt6 = (Mob)entity;
                                    livingEntity = _mobEnt6.m_5448_();
                                } else {
                                    livingEntity = null;
                                }
                                if (livingEntity != null) {
                                    LivingEntity livingEntity44;
                                    if (entity instanceof Mob) {
                                        _mobEnt5 = (Mob)entity;
                                        livingEntity44 = _mobEnt5.m_5448_();
                                    } else {
                                        livingEntity44 = null;
                                    }
                                    f27 = entity.m_20270_(livingEntity44);
                                } else {
                                    f27 = -1.0f;
                                }
                                if (f27 > 5.0f) {
                                    LivingEntity livingEntity45;
                                    LivingEntity livingEntity46;
                                    LivingEntity livingEntity47;
                                    _ent = entity;
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity47 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity47 = null;
                                    }
                                    double d = livingEntity47.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity46 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity46 = null;
                                    }
                                    double d17 = livingEntity46.m_20186_();
                                    if (entity instanceof Mob) {
                                        _mobEnt4 = (Mob)entity;
                                        livingEntity45 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity45 = null;
                                    }
                                    _ent.m_6021_(d, d17, livingEntity45.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                                    if (_ent instanceof ServerPlayer) {
                                        LivingEntity livingEntity48;
                                        LivingEntity livingEntity49;
                                        LivingEntity livingEntity50;
                                        _serverPlayer = (ServerPlayer)_ent;
                                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = ((ServerPlayer)_serverPlayer).f_8906_;
                                        if (entity instanceof Mob) {
                                            _mobEnt3 = (Mob)entity;
                                            livingEntity50 = _mobEnt3.m_5448_();
                                        } else {
                                            livingEntity50 = null;
                                        }
                                        double d18 = livingEntity50.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                                        if (entity instanceof Mob) {
                                            _mobEnt = (Mob)entity;
                                            livingEntity49 = _mobEnt.m_5448_();
                                        } else {
                                            livingEntity49 = null;
                                        }
                                        double d19 = livingEntity49.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity48 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity48 = null;
                                        }
                                        serverGamePacketListenerImpl.m_9774_(d18, d19, livingEntity48.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), _ent.m_146908_(), _ent.m_146909_());
                                    }
                                    world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                                }
                            }
                            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                            if (entity instanceof DeathskullEntity) {
                                _datEntI2 = (DeathskullEntity)entity;
                                n6 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                            } else {
                                n6 = 0;
                            }
                            if (n6 == 11) break block529;
                            if (entity instanceof DeathskullEntity) {
                                _datEntI3 = (DeathskullEntity)entity;
                                n5 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                            } else {
                                n5 = 0;
                            }
                            if (n5 != 30) break block530;
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
                    if (entity instanceof DeathskullEntity) {
                        _datEntI2 = (DeathskullEntity)entity;
                        n4 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                    } else {
                        n4 = 0;
                    }
                    if (n4 == 13) break block531;
                    if (entity instanceof DeathskullEntity) {
                        _datEntI3 = (DeathskullEntity)entity;
                        n3 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
                    } else {
                        n3 = 0;
                    }
                    if (n3 != 33) break block532;
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f28;
                    if (entityiterator instanceof DeathskullEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f28 = _livEnt.m_21233_();
                    } else {
                        f28 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f28 / 4.0f + 1000.0f);
                    if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                    if (world instanceof Level) {
                        Level _level5 = (Level)world;
                        if (!_level5.m_5776_()) {
                            _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f);
                        } else {
                            _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 0.2f, 1.0f, false);
                        }
                    }
                    entityiterator.f_19802_ = 0;
                }
            }
            if (entity instanceof DeathskullEntity) {
                _datEntI2 = (DeathskullEntity)entity;
                n2 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 == 33) {
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    _level2 = (Level)world;
                    if (!_level2.m_5776_()) {
                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    _level2 = (Level)world;
                    if (!_level2.m_5776_()) {
                        _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:kanji")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.1, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x + entity.m_20154_().f_82479_ * 5.0, y + 0.2, z + entity.m_20154_().f_82481_ * 5.0, 0.0, 0.0, 0.0);
                for (int index0 = 0; index0 < 12; ++index0) {
                    if (!(world instanceof ServerLevel)) continue;
                    _level = (ServerLevel)world;
                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.RAINBOWLIGHTNING.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) continue;
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                _center2 = new Vec3(x, y, z);
                _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(12.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                for (Entity entityiterator : _entfound2) {
                    float f29;
                    if (entityiterator instanceof DeathskullEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f29 = _livEnt2.m_21233_();
                    } else {
                        f29 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f29 / 4.0f + 1000.0f);
                    double _setval = 6.0;
                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.camerashake = _setval;
                        capability.syncPlayerVariables(entityiterator);
                    });
                    if (entityiterator instanceof Player || entityiterator instanceof LightningBolt || entityiterator instanceof OriginallightningEntity) continue;
                    entityiterator.m_142687_(Entity.RemovalReason.KILLED);
                }
            }
            if (entity instanceof DeathskullEntity) {
                _datEntI2 = (DeathskullEntity)entity;
                n = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_animationTick);
            } else {
                n = 0;
            }
            if (n >= 52) {
                if (entity instanceof DeathskullEntity) {
                    _datEntSetI = (DeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntSetI = (DeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof DeathskullEntity) {
                    ((DeathskullEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt5 = (LivingEntity)entity;
            f = _livEnt5.m_21223_();
        } else {
            f = -1.0f;
        }
        if (f <= 0.0f) {
            int n;
            int n52;
            if (entity instanceof DeathskullEntity) {
                ((DeathskullEntity)entity).setAnimation("empty");
            }
            if (world instanceof ServerLevel) {
                _level3 = (ServerLevel)world;
                _level3.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level3, 4, "", (Component)Component.m_237113_((String)""), _level3.m_7654_(), null).m_81324_(), "stopsound @a ultimateskeletons:death");
            }
            if (entity instanceof DeathskullEntity) {
                int n53;
                _datEntSetI2 = (DeathskullEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n53 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathID);
                } else {
                    n53 = 0;
                }
                synchedEntityData.m_135381_(DeathskullEntity.DATA_deathID, (Object)(n53 + 1));
            }
            if (entity instanceof DeathskullEntity) {
                _datEntI2 = (DeathskullEntity)entity;
                n52 = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_deathID);
            } else {
                n52 = 0;
            }
            if (n52 < 4) {
                if (entity instanceof DeathskullEntity) {
                    ((DeathskullEntity)entity).setAnimation("empty");
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntSetI = (DeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(DeathskullEntity.DATA_spawnTick, (Object)0);
                }
            }
            if (entity instanceof DeathskullEntity) {
                _datEntI2 = (DeathskullEntity)entity;
                n = (Integer)_datEntI2.m_20088_().m_135370_(DeathskullEntity.DATA_deathID);
            } else {
                n = 0;
            }
            if (n >= 5) {
                int n54;
                int n55;
                int n56;
                int n57;
                int n58;
                int n59;
                int n60;
                int n61;
                int n62;
                if (entity instanceof DeathskullEntity) {
                    ((DeathskullEntity)entity).setAnimation("animation.death");
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n62 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n62 = 0;
                }
                if (n62 < 1) {
                    if (entity instanceof DeathskullEntity) {
                        ((DeathskullEntity)entity).setAnimation("empty");
                    }
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "stopsound @a");
                    }
                }
                if (entity instanceof DeathskullEntity) {
                    int n63;
                    _datEntSetI = (DeathskullEntity)entity;
                    SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                    if (entity instanceof DeathskullEntity) {
                        _datEntI = (DeathskullEntity)entity;
                        n63 = (Integer)_datEntI.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                    } else {
                        n63 = 0;
                    }
                    synchedEntityData.m_135381_(DeathskullEntity.DATA_deathTick, (Object)(n63 + 1));
                }
                if (world.m_8044_() < 18000L && world instanceof ServerLevel) {
                    int n64;
                    _level2 = (ServerLevel)world;
                    double d = world.m_8044_();
                    if (entity instanceof DeathskullEntity) {
                        _datEntI = (DeathskullEntity)entity;
                        n64 = (Integer)_datEntI.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                    } else {
                        n64 = 0;
                    }
                    _level2.m_8615_((long)((int)(d + (double)n64 * 0.5)));
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n61 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n61 = 0;
                }
                if (n61 >= 120) {
                    int n65;
                    if (entity instanceof DeathskullEntity) {
                        _datEntI = (DeathskullEntity)entity;
                        n65 = (Integer)_datEntI.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                    } else {
                        n65 = 0;
                    }
                    if (n65 <= 177) {
                        entity.m_20256_(new Vec3(0.0, 0.5, 0.0));
                    }
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n60 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n60 = 0;
                }
                if (n60 >= 180) {
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n59 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n59 = 0;
                }
                if (n59 == 181) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHIMPLOSION.get()), x, y + 1.0, z, 0.0, 0.0, 0.0);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)y, (double)z)));
                        _level.m_7967_((Entity)entityToSpawn);
                    }
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n58 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n58 = 0;
                }
                if (n58 == 222) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHIMPLOSION.get()), x, y + 1.0, z, 0.0, 0.0, 0.0);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)y, (double)z)));
                        _level.m_7967_((Entity)entityToSpawn);
                    }
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n57 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n57 = 0;
                }
                if (n57 == 265) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHIMPLOSION.get()), x, y + 1.0, z, 0.0, 0.0, 0.0);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)y, (double)z)));
                        _level.m_7967_((Entity)entityToSpawn);
                    }
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n56 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n56 = 0;
                }
                if (n56 == 270) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHSHINING.get()), x, y + 1.0, z, 0.0, 0.0, 0.0);
                    _center = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(128.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f30;
                        float f31;
                        if (entityiterator instanceof DeathskullEntity) continue;
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f31 = _livEnt.m_21233_();
                        } else {
                            f31 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f31 / 40.0f + 240.0f);
                        DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f30 = _livEnt.m_21233_();
                        } else {
                            f30 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource9, f30 / 40.0f + 240.0f);
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                    }
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n55 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n55 = 0;
                }
                if (n55 == 310) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHIMPLOSION.get()), x, y + 1.0, z, 0.0, 0.0, 0.0);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                        entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)y, (double)z)));
                        _level.m_7967_((Entity)entityToSpawn);
                    }
                }
                if (entity instanceof DeathskullEntity) {
                    _datEntI3 = (DeathskullEntity)entity;
                    n54 = (Integer)_datEntI3.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                } else {
                    n54 = 0;
                }
                if (n54 >= 120) {
                    int n66;
                    if (entity instanceof DeathskullEntity) {
                        _datEntI = (DeathskullEntity)entity;
                        n66 = (Integer)_datEntI.m_20088_().m_135370_(DeathskullEntity.DATA_deathTick);
                    } else {
                        n66 = 0;
                    }
                    if (n66 <= 320) {
                        for (int index1 = 0; index1 < 24; ++index1) {
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHENERGYLIGHTNING.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0), (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0), 0.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), 0.0);
                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHSHINE.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0), (double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-100.0, (double)100.0), 0.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)4.0), 0.0);
                        }
                    }
                }
            }
        }
    }
}

