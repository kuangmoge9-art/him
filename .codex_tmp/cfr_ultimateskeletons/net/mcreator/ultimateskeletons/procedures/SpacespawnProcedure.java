/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.Level$ExplosionInteraction
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.entity.SpaceEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class SpacespawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        SpaceEntity _datEntI;
        if (entity == null) {
            return;
        }
        double theta = 0.0;
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        if (entity instanceof SpaceEntity) {
            int n3;
            SpaceEntity _datEntSetI = (SpaceEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof SpaceEntity) {
                SpaceEntity _datEntI2 = (SpaceEntity)entity;
                n3 = (Integer)_datEntI2.m_20088_().m_135370_(SpaceEntity.DATA_spawnTick);
            } else {
                n3 = 0;
            }
            synchedEntityData.m_135381_(SpaceEntity.DATA_spawnTick, (Object)(n3 + 1));
        }
        if (entity instanceof SpaceEntity) {
            _datEntI = (SpaceEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(SpaceEntity.DATA_spawnTick);
        } else {
            n2 = 0;
        }
        if (n2 == 1) {
            Level _level;
            if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:thunderstorm")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:thunderstorm")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                }
            }
            if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (world instanceof Level && !(_level = (Level)world).m_5776_()) {
                _level.m_254849_(null, x, y, z, 8.0f, Level.ExplosionInteraction.NONE);
            }
            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get()), x, y, z, 0.0, 0.0, 0.0);
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.RAINBOWLIGHTNING.get()).m_262496_((ServerLevel)_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                float f2;
                LivingEntity _livEnt;
                if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof SpaceEntity) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
                if (entityiterator instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entityiterator;
                    f2 = _livEnt.m_21233_();
                } else {
                    f2 = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f2 / 64.0f + 1200.0f);
                DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_));
                if (entityiterator instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource2, f / 64.0f + 1200.0f);
                entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 12.0f);
                entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 12.0f);
                if (entityiterator instanceof Player) continue;
                entityiterator.m_20256_(new Vec3(entityiterator.m_20184_().m_7096_(), 1.0, entityiterator.m_20184_().m_7094_()));
                entityiterator.f_19802_ = 0;
            }
        }
        if (entity instanceof SpaceEntity) {
            _datEntI = (SpaceEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(SpaceEntity.DATA_spawnTick);
        } else {
            n = 0;
        }
        if (n >= 5) {
            if (entity instanceof SpaceEntity) {
                SpaceEntity _datEntSetI = (SpaceEntity)entity;
                _datEntSetI.m_20088_().m_135381_(SpaceEntity.DATA_spawnTick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            }
        }
    }
}

