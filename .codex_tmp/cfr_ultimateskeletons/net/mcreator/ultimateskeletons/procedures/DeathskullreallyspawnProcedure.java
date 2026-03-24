/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.entity.DeathskullEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class DeathskullreallyspawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        LivingEntity _entity;
        ServerLevel _level;
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel) {
            _level = (ServerLevel)world;
            Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.ULTIMATEDEATHSKULL.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
            if (entityToSpawn != null) {
                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
            }
        }
        if (world instanceof ServerLevel) {
            _level = (ServerLevel)world;
            _level.m_8767_((ParticleOptions)ParticleTypes.f_123812_, x, y, z, 8, 4.0, 4.0, 4.0, 1.0);
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(20.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            float f;
            if (entityiterator instanceof DeathskullEntity || entityiterator instanceof UltimatedeathskullEntity) continue;
            if (entityiterator instanceof LivingEntity) {
                _entity = (LivingEntity)entityiterator;
                _entity.m_21195_(MobEffects.f_19606_);
            }
            if (entityiterator instanceof LivingEntity) {
                _entity = (LivingEntity)entityiterator;
                _entity.m_21195_(MobEffects.f_19601_);
            }
            if (entityiterator instanceof LivingEntity) {
                _entity = (LivingEntity)entityiterator;
                _entity.m_21195_(MobEffects.f_19605_);
            }
            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 30.0f);
            if (!(entityiterator instanceof LivingEntity)) continue;
            _entity = (LivingEntity)entityiterator;
            if (entityiterator instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entityiterator;
                f = _livEnt.m_21223_();
            } else {
                f = -1.0f;
            }
            _entity.m_21153_((float)((double)f / 1.5 - 1.0));
        }
        _center = new Vec3(x, y, z);
        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(300.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            LivingEntity livingEntity;
            LivingEntity livingEntity2;
            if (!(entityiterator instanceof UltimatedeathskullEntity) || !(entityiterator instanceof Mob)) continue;
            _entity = (Mob)entityiterator;
            if (entity instanceof Mob) {
                Mob _mobEnt = (Mob)entity;
                livingEntity2 = _mobEnt.m_5448_();
            } else {
                livingEntity2 = null;
            }
            if (!((livingEntity = livingEntity2) instanceof LivingEntity)) continue;
            LivingEntity _ent = livingEntity;
            _entity.m_6710_(_ent);
        }
    }
}

