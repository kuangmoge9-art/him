/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
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
import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.mcreator.ultimateskeletons.entity.DeathshockEntity;
import net.mcreator.ultimateskeletons.entity.MultiversespaceEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModMobEffects;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
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
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class UltimatedeathskullATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        UltimatedeathskullEntity _datEntSetI;
        LivingEntity _livEnt;
        Vec3 _center;
        Object entityToSpawn;
        Entity entityToSpawn2;
        Mob _mobEnt;
        Level _level;
        List<Entity> _entfound;
        Vec3 _center2;
        Mob _mobEnt2;
        ServerPlayer _serverPlayer;
        Mob _mobEnt3;
        int n5;
        Mob _mobEnt4;
        Mob _mobEnt5;
        Mob _mobEnt6;
        int n6;
        UltimatedeathskullEntity _datEntI;
        int n7;
        Mob _entity;
        LivingEntity _livEnt2;
        int n8;
        int n9;
        int n10;
        int n11;
        Level _level2;
        int n12;
        int n13;
        int n14;
        int n15;
        UltimatedeathskullEntity _datEntI2;
        int n16;
        UltimatedeathskullEntity _datEntI3;
        int n17;
        LivingEntity _entity2;
        LivingEntity _entity22;
        if (entity == null) {
            return;
        }
        double theta = 0.0;
        entity.getPersistentData().m_128379_("death", true);
        if (!world.m_6443_(ServerPlayer.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)40.0, (double)40.0, (double)40.0), e -> true).isEmpty()) {
            _setval = true;
            entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                capability.defence = _setval;
                capability.syncPlayerVariables(entity);
            });
            UltimatedeathskullEntity.def = true;
        } else {
            _setval = false;
            entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                capability.defence = _setval;
                capability.syncPlayerVariables(entity);
            });
            UltimatedeathskullEntity.def = false;
        }
        if (world instanceof ServerLevel) {
            ServerLevel _level5 = (ServerLevel)world;
            _level5.m_8615_(18000L);
        }
        Vec3 _center3 = new Vec3(x, y, z);
        List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(400.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
        for (Entity entityiterator2 : _entfound3) {
            LivingEntity livingEntity;
            if (!((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new UltimateskeletonsModVariables.PlayerVariables())).defence || !(entityiterator2 instanceof LivingEntity) || (livingEntity = (LivingEntity)entityiterator2).m_6336_() != MobType.f_21641_) continue;
            if (entityiterator2 instanceof Mob) {
                Mob _mob = (Mob)entityiterator2;
                _mob.m_21557_(true);
            }
            if (!(entityiterator2 instanceof Mob)) continue;
            Mob _entity3 = (Mob)entityiterator2;
            _entity3.m_6710_(null);
        }
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_1.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.3, 0.0);
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_2.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.3, 0.0);
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.SMOKE_3.get()), x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), y + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-3.0, (double)3.0), 0.0, 0.3, 0.0);
        if (entity instanceof LivingEntity && !(_entity22 = (LivingEntity)entity).m_9236_().m_5776_()) {
            _entity22.m_7292_(new MobEffectInstance((MobEffect)UltimateskeletonsModMobEffects.DEATHCURE.get(), 10000000, 3));
        }
        if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
            _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
        }
        if (entity instanceof UltimatedeathskullEntity) {
            int n18;
            UltimatedeathskullEntity _datEntSetI3 = (UltimatedeathskullEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
            if (entity instanceof UltimatedeathskullEntity) {
                UltimatedeathskullEntity _datEntI32 = (UltimatedeathskullEntity)entity;
                n18 = (Integer)_datEntI32.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_themeTick);
            } else {
                n18 = 0;
            }
            synchedEntityData.m_135381_(UltimatedeathskullEntity.DATA_themeTick, (Object)(n18 + 1));
        }
        if (entity instanceof UltimatedeathskullEntity) {
            UltimatedeathskullEntity _datEntI22 = (UltimatedeathskullEntity)entity;
            n17 = (Integer)_datEntI22.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_themeTick);
        } else {
            n17 = 0;
        }
        if (n17 == 1 && world instanceof Level) {
            Level _level4 = (Level)world;
            if (!_level4.m_5776_()) {
                _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:death")), SoundSource.MASTER, 500.0f, 1.0f);
            } else {
                _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:death")), SoundSource.MASTER, 500.0f, 1.0f, false);
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n16 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_themeTick);
        } else {
            n16 = 0;
        }
        if (n16 >= 2920 && entity instanceof UltimatedeathskullEntity) {
            UltimatedeathskullEntity _datEntSetI2 = (UltimatedeathskullEntity)entity;
            _datEntSetI2.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_themeTick, (Object)0);
        }
        if (entity instanceof UltimatedeathskullEntity) {
            int n19;
            UltimatedeathskullEntity _datEntSetI2 = (UltimatedeathskullEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n19 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
            } else {
                n19 = 0;
            }
            synchedEntityData.m_135381_(UltimatedeathskullEntity.DATA_spawnTick, (Object)(n19 + 1));
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n15 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n15 = 0;
        }
        if (n15 <= 80) {
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof LivingEntity) {
                ((LivingEntity)entity).f_20919_ = 0;
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n14 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
        } else {
            n14 = 0;
        }
        if (n14 == 5) {
            int n20;
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n20 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n20 = 0;
            }
            if (n20 == 2) {
                for (int index0 = 0; index0 < 12; ++index0) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level3 = (ServerLevel)world;
                    Entity entity2 = ((EntityType)UltimateskeletonsModEntities.SPACE.get()).m_262496_(_level3, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-60, (int)60)), (double)((double)world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z) + 0.2), (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-60, (int)60))), MobSpawnType.MOB_SUMMONED);
                    if (entity2 == null) continue;
                    entity2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level6 = (ServerLevel)world;
                    LightningBolt entityToSpawn22 = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level6);
                    entityToSpawn22.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)));
                    _level6.m_7967_((Entity)entityToSpawn22);
                }
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n13 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n13 = 0;
        }
        if (n13 <= 5 && entity instanceof UltimatedeathskullEntity) {
            ((UltimatedeathskullEntity)entity).setAnimation("animation.spawn");
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n12 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n12 = 0;
        }
        if (n12 == 8) {
            if (world instanceof Level) {
                _level2 = (Level)world;
                if (!_level2.m_5776_()) {
                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 4.0f, 1.0f);
                } else {
                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 4.0f, 1.0f, false);
                }
            }
            Vec3 _center4 = new Vec3(x, y, z);
            List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
            for (Entity entity3 : _entfound4) {
                if (entity3 == entity) continue;
                entity3.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1024.0f);
                entity3.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 1024.0f);
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n11 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n11 = 0;
        }
        if (n11 == 14 && world instanceof Level) {
            _level2 = (Level)world;
            if (!_level2.m_5776_()) {
                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:crushland")), SoundSource.NEUTRAL, 4.0f, 1.0f);
            } else {
                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:crushland")), SoundSource.NEUTRAL, 4.0f, 1.0f, false);
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n10 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n10 = 0;
        }
        if (n10 == 18 && world instanceof Level) {
            _level2 = (Level)world;
            if (!_level2.m_5776_()) {
                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimateroar")), SoundSource.NEUTRAL, 240.0f, 1.0f);
            } else {
                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimateroar")), SoundSource.NEUTRAL, 240.0f, 1.0f, false);
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n9 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n9 = 0;
        }
        if (n9 == 58 && world instanceof Level) {
            _level2 = (Level)world;
            if (!_level2.m_5776_()) {
                _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 4.0f, 1.0f);
            } else {
                _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 4.0f, 1.0f, false);
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n8 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n8 = 0;
        }
        if (n8 > 57) {
            int n21;
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n21 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
            } else {
                n21 = 0;
            }
            if (n21 <= 77) {
                Vec3 _center22 = new Vec3(x, y, z);
                List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center22, _center22).m_82400_(280.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator4 : _entfound2) {
                    float f;
                    float f2;
                    if (entityiterator4 == entity || entityiterator4 instanceof Player) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_));
                    if (entityiterator4 instanceof LivingEntity) {
                        LivingEntity _livEnt22 = (LivingEntity)entityiterator4;
                        f2 = _livEnt22.m_21223_();
                    } else {
                        f2 = -1.0f;
                    }
                    entityiterator4.m_6469_(damageSource, f2);
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
                    if (entityiterator4 instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator4;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator4.m_6469_(damageSource2, f);
                    entity.f_19802_ = 0;
                    if (!(entityiterator4 instanceof LivingEntity)) continue;
                    _entity = (LivingEntity)entityiterator4;
                    _entity.m_21153_(0.0f);
                }
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n7 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
        } else {
            n7 = 0;
        }
        if (n7 != 0 && entity instanceof UltimatedeathskullEntity) {
            int n22;
            UltimatedeathskullEntity _datEntSetI3 = (UltimatedeathskullEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI = (UltimatedeathskullEntity)entity;
                n22 = (Integer)_datEntI.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n22 = 0;
            }
            synchedEntityData.m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)(n22 + 1));
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n6 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_spawnTick);
        } else {
            n6 = 0;
        }
        if (n6 > 80) {
            LivingEntity livingEntity;
            if (entity instanceof Mob) {
                Mob _mobEnt7 = (Mob)entity;
                livingEntity = _mobEnt7.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                float f;
                LivingEntity livingEntity2;
                if (entity instanceof Mob) {
                    Mob _mobEnt62 = (Mob)entity;
                    v25 = _mobEnt62.m_5448_();
                } else {
                    v25 = livingEntity2 = null;
                }
                if (livingEntity2 instanceof LivingEntity) {
                    LivingEntity _livEnt3 = livingEntity2;
                    f = _livEnt3.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    float f3;
                    LivingEntity livingEntity3;
                    float f4;
                    LivingEntity livingEntity4;
                    float f5;
                    LivingEntity livingEntity5;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity5 = mob.m_5448_();
                    } else {
                        livingEntity5 = null;
                    }
                    if (livingEntity5 != null) {
                        LivingEntity livingEntity6;
                        if (entity instanceof Mob) {
                            Mob _mobEnt52 = (Mob)entity;
                            livingEntity6 = _mobEnt52.m_5448_();
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
                        Mob mob = (Mob)entity;
                        livingEntity4 = mob.m_5448_();
                    } else {
                        livingEntity4 = null;
                    }
                    if (livingEntity4 != null) {
                        LivingEntity livingEntity7;
                        if (entity instanceof Mob) {
                            _mobEnt6 = (Mob)entity;
                            livingEntity7 = _mobEnt6.m_5448_();
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
                                Mob _mobEnt42 = (Mob)entity;
                                livingEntity10 = _mobEnt42.m_5448_();
                            } else {
                                livingEntity10 = null;
                            }
                            double d = livingEntity10.m_20185_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt32 = (Mob)entity;
                                livingEntity9 = _mobEnt32.m_5448_();
                            } else {
                                livingEntity9 = null;
                            }
                            double d2 = livingEntity9.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt9 = (Mob)entity;
                                livingEntity8 = _mobEnt9.m_5448_();
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
                        Mob mob = (Mob)entity;
                        livingEntity3 = mob.m_5448_();
                    } else {
                        livingEntity3 = null;
                    }
                    if (livingEntity3 != null) {
                        LivingEntity livingEntity11;
                        if (entity instanceof Mob) {
                            _mobEnt6 = (Mob)entity;
                            livingEntity11 = _mobEnt6.m_5448_();
                        } else {
                            livingEntity11 = null;
                        }
                        f3 = entity.m_20270_(livingEntity11);
                    } else {
                        f3 = -1.0f;
                    }
                    if (f3 < 500.0f && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                        int n23;
                        if (entity instanceof UltimatedeathskullEntity) {
                            UltimatedeathskullEntity _datEntI4 = (UltimatedeathskullEntity)entity;
                            n23 = (Integer)_datEntI4.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
                        } else {
                            n23 = 0;
                        }
                        if (n23 == 0) {
                            LivingEntity livingEntity12;
                            LivingEntity livingEntity13;
                            LivingEntity livingEntity14;
                            LivingEntity livingEntity15;
                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 1) {
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)1);
                                }
                            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 2) {
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)2);
                                }
                            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 3) {
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)3);
                                }
                            } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 4) {
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)4);
                                }
                            } else {
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                                }
                                if (entity instanceof UltimatedeathskullEntity) {
                                    _datEntSetI = (UltimatedeathskullEntity)entity;
                                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)5);
                                }
                            }
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity15 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity15 = null;
                            }
                            double d = livingEntity15.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt4 = (Mob)entity;
                                livingEntity14 = _mobEnt4.m_5448_();
                            } else {
                                livingEntity14 = null;
                            }
                            double d3 = livingEntity14.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity13 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity13 = null;
                            }
                            double d4 = d3 + (double)livingEntity13.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                _mobEnt5 = (Mob)entity;
                                livingEntity12 = _mobEnt5.m_5448_();
                            } else {
                                livingEntity12 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d4, livingEntity12.m_20189_()));
                        }
                    }
                } else if (!entity.m_20096_()) {
                    entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
                }
            } else if (!entity.m_20096_()) {
                entity.m_20256_(new Vec3(0.0, -1.0, 0.0));
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n5 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 1) {
            int n24;
            int n25;
            int n26;
            int n27;
            int n28;
            int n29;
            int n30;
            int n31;
            int n32;
            int n33;
            if (entity instanceof UltimatedeathskullEntity) {
                ((UltimatedeathskullEntity)entity).setAnimation("animation.tear");
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n33 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n33 = 0;
            }
            if (n33 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity = _mobEnt3.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity16;
                    if (entity instanceof Mob) {
                        Mob _mobEnt22 = (Mob)entity;
                        livingEntity16 = _mobEnt22.m_5448_();
                    } else {
                        livingEntity16 = null;
                    }
                    f = entity.m_20270_(livingEntity16);
                } else {
                    f = -1.0f;
                }
                if (f > 5.0f) {
                    LivingEntity livingEntity17;
                    LivingEntity livingEntity18;
                    LivingEntity livingEntity19;
                    Entity entity4 = entity;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity19 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity19 = null;
                    }
                    double d = livingEntity19.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity18 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity18 = null;
                    }
                    double d5 = livingEntity18.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity17 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity17 = null;
                    }
                    entity4.m_6021_(d, d5, livingEntity17.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                    if (entity4 instanceof ServerPlayer) {
                        LivingEntity livingEntity20;
                        LivingEntity livingEntity21;
                        LivingEntity livingEntity22;
                        _serverPlayer = (ServerPlayer)entity4;
                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity22 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity22 = null;
                        }
                        double d6 = livingEntity22.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity21 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity21 = null;
                        }
                        double d7 = livingEntity21.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity20 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity20 = null;
                        }
                        serverGamePacketListenerImpl.m_9774_(d6, d7, livingEntity20.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), entity4.m_146908_(), entity4.m_146909_());
                    }
                    world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n32 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n32 = 0;
            }
            if (n32 == 9) {
                if (world instanceof Level) {
                    Level _level22 = (Level)world;
                    if (!_level22.m_5776_()) {
                        _level22.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level22.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f6;
                    if (entityiterator instanceof UltimatedeathskullEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f6 = _livEnt2.m_21233_();
                    } else {
                        f6 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f6 / 40.0f + 240.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource3, f / 40.0f + 240.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n31 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n31 = 0;
            }
            if (n31 == 17) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f7;
                    if (entityiterator instanceof UltimatedeathskullEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f7 = _livEnt2.m_21233_();
                    } else {
                        f7 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f7 / 40.0f + 240.0f);
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource4, f / 40.0f + 240.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                }
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n30 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n30 = 0;
            }
            if (n30 == 20) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity = _mobEnt3.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity23;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity23 = _mobEnt.m_5448_();
                    } else {
                        livingEntity23 = null;
                    }
                    f = entity.m_20270_(livingEntity23);
                } else {
                    f = -1.0f;
                }
                if (f > 5.0f) {
                    LivingEntity livingEntity24;
                    LivingEntity livingEntity25;
                    LivingEntity livingEntity26;
                    Entity entity5 = entity;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity26 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity26 = null;
                    }
                    double d = livingEntity26.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity25 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity25 = null;
                    }
                    double d8 = livingEntity25.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity24 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity24 = null;
                    }
                    entity5.m_6021_(d, d8, livingEntity24.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                    if (entity5 instanceof ServerPlayer) {
                        LivingEntity livingEntity27;
                        LivingEntity livingEntity28;
                        LivingEntity livingEntity29;
                        _serverPlayer = (ServerPlayer)entity5;
                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity29 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity29 = null;
                        }
                        double d9 = livingEntity29.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity28 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity28 = null;
                        }
                        double d10 = livingEntity28.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity27 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity27 = null;
                        }
                        serverGamePacketListenerImpl.m_9774_(d9, d10, livingEntity27.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), entity5.m_146908_(), entity5.m_146909_());
                    }
                    world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n29 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 >= 21) {
                int n34;
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntI = (UltimatedeathskullEntity)entity;
                    n34 = (Integer)_datEntI.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
                } else {
                    n34 = 0;
                }
                if (n34 <= 24) {
                    world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n28 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 == 32 && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 1) {
                if (!world.m_5776_() && world.m_7654_() != null) {
                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Just kill them all!"), false);
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimateroar")), SoundSource.NEUTRAL, 240.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimateroar")), SoundSource.NEUTRAL, 240.0f, 1.0f, false);
                    }
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n27 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 == 46 && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.DEATHSHOCK.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn2 != null) {
                    entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n26 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n26 = 0;
            }
            if (n26 > 53) {
                int n35;
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntI = (UltimatedeathskullEntity)entity;
                    n35 = (Integer)_datEntI.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
                } else {
                    n35 = 0;
                }
                if (n35 < 65) {
                    LivingEntity _entity4;
                    if (entity instanceof LivingEntity && !(_entity4 = (LivingEntity)entity).m_9236_().m_5776_()) {
                        _entity4.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 20, 2));
                    }
                    if (theta >= 360.0) {
                        theta = 0.0;
                    }
                    if (theta == 0.0) {
                        for (int index1 = 0; index1 < 1; ++index1) {
                            if (world instanceof ServerLevel) {
                                ServerLevel serverLevel = (ServerLevel)world;
                                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DEATHLASER.get()).m_262496_(serverLevel, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)12.0, (double)17.0) * Math.cos(theta)), (double)(y + 0.1), (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)12.0, (double)17.0) * Math.sin(theta))), MobSpawnType.MOB_SUMMONED);
                                if (entityToSpawn != null) {
                                    entityToSpawn.m_146922_((float)Math.tan(theta));
                                    entityToSpawn.m_5618_((float)Math.tan(theta));
                                    entityToSpawn.m_5616_((float)Math.tan(theta));
                                    entityToSpawn.m_20334_(0.0, 0.0, 0.0);
                                }
                            }
                            theta += Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)1.0, (double)10.0);
                        }
                    }
                    _center = new Vec3(x, y, z);
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : list) {
                        float f;
                        float f8;
                        if (entityiterator instanceof UltimatedeathskullEntity) continue;
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f8 = _livEnt.m_21233_();
                        } else {
                            f8 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f8 / 40.0f + 240.0f);
                        DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f = _livEnt.m_21233_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource5, f / 40.0f + 240.0f);
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                        if (entityiterator instanceof Player) continue;
                        entityiterator.f_19802_ = 0;
                        if (entityiterator instanceof DeathlaserEntity || entityiterator instanceof DeathshockEntity) continue;
                        entityiterator.m_142467_(Entity.RemovalReason.DISCARDED);
                        entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                        entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_WITH_PLAYER);
                    }
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n25 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n25 = 0;
            }
            if (n25 == 45) {
                UltimateskeletonsModVariables.MapVariables.get((LevelAccessor)world).spawnquit = true;
                UltimateskeletonsModVariables.MapVariables.get(world).syncData(world);
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n24 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n24 = 0;
            }
            if (n24 >= 75) {
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)0);
                }
                UltimateskeletonsModVariables.MapVariables.get((LevelAccessor)world).spawnquit = false;
                UltimateskeletonsModVariables.MapVariables.get(world).syncData(world);
                if (entity instanceof UltimatedeathskullEntity) {
                    ((UltimatedeathskullEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n4 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 2) {
            int n36;
            int n37;
            int n38;
            int n39;
            if (entity instanceof UltimatedeathskullEntity) {
                ((UltimatedeathskullEntity)entity).setAnimation("animation.down");
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n39 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n39 = 0;
            }
            if (n39 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity = _mobEnt3.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity30;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity30 = _mobEnt.m_5448_();
                    } else {
                        livingEntity30 = null;
                    }
                    f = entity.m_20270_(livingEntity30);
                } else {
                    f = -1.0f;
                }
                if (f > 5.0f) {
                    LivingEntity livingEntity31;
                    LivingEntity livingEntity32;
                    LivingEntity livingEntity33;
                    Entity entity6 = entity;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity33 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity33 = null;
                    }
                    double d = livingEntity33.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity32 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity32 = null;
                    }
                    double d11 = livingEntity32.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity31 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity31 = null;
                    }
                    entity6.m_6021_(d, d11, livingEntity31.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                    if (entity6 instanceof ServerPlayer) {
                        LivingEntity livingEntity34;
                        LivingEntity livingEntity35;
                        LivingEntity livingEntity36;
                        _serverPlayer = (ServerPlayer)entity6;
                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity36 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity36 = null;
                        }
                        double d12 = livingEntity36.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity35 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity35 = null;
                        }
                        double d13 = livingEntity35.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity34 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity34 = null;
                        }
                        serverGamePacketListenerImpl.m_9774_(d12, d13, livingEntity34.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), entity6.m_146908_(), entity6.m_146909_());
                    }
                    world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n38 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n38 = 0;
            }
            if (n38 == 23) {
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
                    _mobEnt3 = (Mob)entity;
                    livingEntity = _mobEnt3.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity37;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity37 = _mobEnt.m_5448_();
                    } else {
                        livingEntity37 = null;
                    }
                    f = entity.m_20270_(livingEntity37);
                } else {
                    f = -1.0f;
                }
                if (f > 5.0f && world instanceof ServerLevel) {
                    LivingEntity livingEntity38;
                    LivingEntity livingEntity39;
                    LivingEntity livingEntity40;
                    ServerLevel serverLevel = (ServerLevel)world;
                    EntityType entityType = (EntityType)UltimateskeletonsModEntities.PUSHHAND.get();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity40 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity40 = null;
                    }
                    double d = livingEntity40.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity39 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity39 = null;
                    }
                    double d14 = livingEntity39.m_20186_();
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity38 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity38 = null;
                    }
                    entityToSpawn = entityType.m_262496_(serverLevel, BlockPos.m_274561_((double)d, (double)d14, (double)livingEntity38.m_20189_()), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                for (int index2 = 0; index2 < 12; ++index2) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level3 = (ServerLevel)world;
                    Entity entity7 = ((EntityType)UltimateskeletonsModEntities.PUSHHAND.get()).m_262496_(_level3, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-56, (int)56)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-56, (int)56))), MobSpawnType.MOB_SUMMONED);
                    if (entity7 == null) continue;
                    entity7.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
                Vec3 _center5 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(24.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                for (Entity entityiterator : _entfound) {
                    float f9;
                    float f10;
                    if (entityiterator instanceof UltimatedeathskullEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f10 = _livEnt2.m_21233_();
                    } else {
                        f10 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f10 / 40.0f + 240.0f);
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f9 = _livEnt2.m_21233_();
                    } else {
                        f9 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource6, f9 / 40.0f + 240.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n37 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n37 = 0;
            }
            if (n37 == 46) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(24.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f11;
                    if (entityiterator instanceof UltimatedeathskullEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f11 = _livEnt2.m_21233_();
                    } else {
                        f11 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f11 / 40.0f + 240.0f);
                    DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource7, f / 40.0f + 240.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                }
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n36 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n36 = 0;
            }
            if (n36 >= 75) {
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    ((UltimatedeathskullEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n3 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 3) {
            int n40;
            int n41;
            int n42;
            int n43;
            int n44;
            int n45;
            if (entity instanceof UltimatedeathskullEntity) {
                ((UltimatedeathskullEntity)entity).setAnimation("animation.suolian");
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n45 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n45 = 0;
            }
            if (n45 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity = _mobEnt3.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity41;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity41 = _mobEnt.m_5448_();
                    } else {
                        livingEntity41 = null;
                    }
                    f = entity.m_20270_(livingEntity41);
                } else {
                    f = -1.0f;
                }
                if (f > 5.0f) {
                    LivingEntity livingEntity42;
                    LivingEntity livingEntity43;
                    LivingEntity livingEntity44;
                    Entity entity8 = entity;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity44 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity44 = null;
                    }
                    double d = livingEntity44.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity43 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity43 = null;
                    }
                    double d15 = livingEntity43.m_20186_() + 5.0;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity42 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity42 = null;
                    }
                    entity8.m_6021_(d, d15, livingEntity42.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
                    if (entity8 instanceof ServerPlayer) {
                        LivingEntity livingEntity45;
                        LivingEntity livingEntity46;
                        LivingEntity livingEntity47;
                        _serverPlayer = (ServerPlayer)entity8;
                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity47 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity47 = null;
                        }
                        double d16 = livingEntity47.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4);
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity46 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity46 = null;
                        }
                        double d17 = livingEntity46.m_20186_() + 5.0;
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity45 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity45 = null;
                        }
                        serverGamePacketListenerImpl.m_9774_(d16, d17, livingEntity45.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), entity8.m_146908_(), entity8.m_146909_());
                    }
                    world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                }
                entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n44 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n44 = 0;
            }
            if (n44 == 6 && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) == 1 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimateroar")), SoundSource.NEUTRAL, 240.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimateroar")), SoundSource.NEUTRAL, 240.0f, 1.0f, false);
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n43 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n43 = 0;
            }
            if (n43 >= 21) {
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n42 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n42 = 0;
            }
            if (n42 == 22) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.DEATHSHINING.get()), x, y + 3.0, z, 0.0, 0.0, 0.0);
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEEXPLOSION.get()), x, y + 3.0, z, 0.0, 0.0, 0.0);
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(64.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f12;
                    if (entityiterator instanceof UltimatedeathskullEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f12 = _livEnt2.m_21233_();
                    } else {
                        f12 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f12 / 40.0f + 240.0f);
                    DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource8, f / 40.0f + 240.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n41 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n41 = 0;
            }
            if (n41 > 24) {
                int n46;
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntI = (UltimatedeathskullEntity)entity;
                    n46 = (Integer)_datEntI.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
                } else {
                    n46 = 0;
                }
                if (n46 < 39) {
                    for (int index3 = 0; index3 < 2; ++index3) {
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel serverLevel = (ServerLevel)world;
                        entityToSpawn = ((EntityType)UltimateskeletonsModEntities.CHAIN.get()).m_262496_(serverLevel, BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-56, (int)56)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-56, (int)56))), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn == null) continue;
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                    _center = new Vec3(x, y, z);
                    List<Entity> list = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(64.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator5 : list) {
                        float f;
                        float f13;
                        if (entityiterator5 instanceof UltimatedeathskullEntity) continue;
                        entityiterator5.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                        if (entityiterator5 instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator5;
                            f13 = _livEnt.m_21233_();
                        } else {
                            f13 = -1.0f;
                        }
                        entityiterator5.m_6469_(damageSource, f13 / 40.0f + 240.0f);
                        DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                        if (entityiterator5 instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator5;
                            f = _livEnt.m_21233_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator5.m_6469_(damageSource9, f / 40.0f + 240.0f);
                        entityiterator5.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                    }
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n40 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n40 = 0;
            }
            if (n40 >= 71) {
                entity.m_20256_(new Vec3(0.0, -2.0, 0.0));
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    ((UltimatedeathskullEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n2 = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 4) {
            int n47;
            int n48;
            int n49;
            int n50;
            int n51;
            if (entity instanceof UltimatedeathskullEntity) {
                ((UltimatedeathskullEntity)entity).setAnimation("animation.slap");
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n51 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n51 = 0;
            }
            if (n51 == 1) {
                float f;
                LivingEntity livingEntity;
                if (!world.m_5776_() && world.m_7654_() != null) {
                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Multiverse slap!!!"), false);
                }
                if (entity instanceof Mob) {
                    _mobEnt3 = (Mob)entity;
                    livingEntity = _mobEnt3.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity48;
                    if (entity instanceof Mob) {
                        _mobEnt = (Mob)entity;
                        livingEntity48 = _mobEnt.m_5448_();
                    } else {
                        livingEntity48 = null;
                    }
                    f = entity.m_20270_(livingEntity48);
                } else {
                    f = -1.0f;
                }
                if (f > 4.0f) {
                    LivingEntity livingEntity49;
                    LivingEntity livingEntity50;
                    LivingEntity livingEntity51;
                    Entity entity9 = entity;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity51 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity51 = null;
                    }
                    double d = livingEntity51.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3);
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity50 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity50 = null;
                    }
                    double d18 = livingEntity50.m_20186_() + 16.0;
                    if (entity instanceof Mob) {
                        _mobEnt6 = (Mob)entity;
                        livingEntity49 = _mobEnt6.m_5448_();
                    } else {
                        livingEntity49 = null;
                    }
                    entity9.m_6021_(d, d18, livingEntity49.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                    if (entity9 instanceof ServerPlayer) {
                        LivingEntity livingEntity52;
                        LivingEntity livingEntity53;
                        LivingEntity livingEntity54;
                        _serverPlayer = (ServerPlayer)entity9;
                        ServerGamePacketListenerImpl serverGamePacketListenerImpl = _serverPlayer.f_8906_;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity54 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity54 = null;
                        }
                        double d19 = livingEntity54.m_20185_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3);
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity53 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity53 = null;
                        }
                        double d20 = livingEntity53.m_20186_() + 16.0;
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity52 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity52 = null;
                        }
                        serverGamePacketListenerImpl.m_9774_(d19, d20, livingEntity52.m_20189_() + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), entity9.m_146908_(), entity9.m_146909_());
                    }
                    if (world instanceof Level) {
                        Level level = (Level)world;
                        if (!level.m_5776_()) {
                            level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                        } else {
                            level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                        }
                    }
                    world.m_7106_((ParticleOptions)ParticleTypes.f_123760_, x, y + 1.5, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.4, (double)0.4));
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n50 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n50 = 0;
            }
            if (n50 == 16) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.m_8767_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get()), x, y + 3.0, z, 16, 8.0, 6.0, 8.0, 0.0);
                }
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.m_8767_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYHOLE.get()), x, y + 3.0, z, 16, 8.0, 6.0, 8.0, 0.0);
                }
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n49 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n49 = 0;
            }
            if (n49 == 30) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.MULTIVERSESPACE.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)x, (double)(y + 3.0), (double)z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn2 != null) {
                        entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f14;
                    if (entityiterator instanceof UltimatedeathskullEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f14 = _livEnt2.m_21233_();
                    } else {
                        f14 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f14 + 240.0f);
                    DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource10, f + 240.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                    if (entityiterator instanceof Player || entityiterator instanceof MultiversespaceEntity) continue;
                    entityiterator.f_19802_ = 0;
                    entityiterator.m_142467_(Entity.RemovalReason.DISCARDED);
                    entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                    entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_WITH_PLAYER);
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n48 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n48 = 0;
            }
            if (n48 == 13) {
                UltimateskeletonsModVariables.MapVariables.get((LevelAccessor)world).spawnquit = true;
                UltimateskeletonsModVariables.MapVariables.get(world).syncData(world);
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n47 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n47 = 0;
            }
            if (n47 >= 52) {
                if (entity instanceof Mob) {
                    Mob _entity5 = (Mob)entity;
                    _entity5.m_6710_(null);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)0);
                }
                UltimateskeletonsModVariables.MapVariables.get((LevelAccessor)world).spawnquit = false;
                UltimateskeletonsModVariables.MapVariables.get(world).syncData(world);
                if (entity instanceof UltimatedeathskullEntity) {
                    ((UltimatedeathskullEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof UltimatedeathskullEntity) {
            _datEntI3 = (UltimatedeathskullEntity)entity;
            n = (Integer)_datEntI3.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 5) {
            int n52;
            int n53;
            int n54;
            int n55;
            if (entity instanceof UltimatedeathskullEntity) {
                ((UltimatedeathskullEntity)entity).setAnimation("animation.laser");
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n55 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 == 5) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.m_8767_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get()), x, y + 2.0, z, 16, 8.0, 6.0, 8.0, 0.0);
                }
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.m_8767_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYHOLE.get()), x, y + 2.0, z, 16, 8.0, 6.0, 8.0, 0.0);
                }
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n54 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 == 12) {
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.DEATHLASER.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)(x + 4.0 * Math.cos(entity.m_146908_())), (double)y, (double)(z + 4.0 * Math.sin(entity.m_146908_()))), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn2 != null) {
                        entityToSpawn2.m_146922_(entity.m_146908_());
                        entityToSpawn2.m_5618_(entity.m_146908_());
                        entityToSpawn2.m_5616_(entity.m_146908_());
                        entityToSpawn2.m_146926_(entity.m_146909_());
                        entityToSpawn2.m_20334_(0.0, 0.0, 0.0);
                    }
                }
                _center2 = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center22))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f15;
                    if (entityiterator instanceof UltimatedeathskullEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 666.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f15 = _livEnt2.m_21233_();
                    } else {
                        f15 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f15 / 40.0f + 240.0f);
                    DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt2 = (LivingEntity)entityiterator;
                        f = _livEnt2.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource11, f / 40.0f + 240.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 120.0f);
                    if (entityiterator instanceof Player) continue;
                    entityiterator.f_19802_ = 0;
                }
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n53 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n53 = 0;
            }
            if (n53 == 13) {
                UltimateskeletonsModVariables.MapVariables.get((LevelAccessor)world).spawnquit = true;
                UltimateskeletonsModVariables.MapVariables.get(world).syncData(world);
            }
            if (entity instanceof UltimatedeathskullEntity) {
                _datEntI2 = (UltimatedeathskullEntity)entity;
                n52 = (Integer)_datEntI2.m_20088_().m_135370_(UltimatedeathskullEntity.DATA_animationTick);
            } else {
                n52 = 0;
            }
            if (n52 >= 40) {
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof UltimatedeathskullEntity) {
                    _datEntSetI = (UltimatedeathskullEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(UltimatedeathskullEntity.DATA_animationID, (Object)0);
                }
                UltimateskeletonsModVariables.MapVariables.get((LevelAccessor)world).spawnquit = false;
                UltimateskeletonsModVariables.MapVariables.get(world).syncData(world);
                if (entity instanceof UltimatedeathskullEntity) {
                    ((UltimatedeathskullEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

