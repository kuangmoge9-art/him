/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.entity.HarrowEntity;
import net.mcreator.ultimateskeletons.entity.SwordedgecutEntity;
import net.mcreator.ultimateskeletons.entity.SwordedgeslashEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontemplarEntity;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class SwordedgeslashatkProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        entity.m_20242_(true);
        for (int index0 = 0; index0 < 16; ++index0) {
            world.m_7106_((ParticleOptions)ParticleTypes.f_123745_, x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-6, (int)6), y, z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-6, (int)6), 0.0, 0.0, 0.0);
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(16.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            float f;
            if (entityiterator instanceof HarrowEntity || entityiterator instanceof SwordedgecutEntity || entityiterator instanceof SwordedgeslashEntity || entityiterator instanceof WitherskeletontemplarEntity) continue;
            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 2000.0f);
            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                f = _livEnt.m_21233_();
            } else {
                f = -1.0f;
            }
            entityiterator.m_6469_(damageSource, f / 5.0f + 800.0f);
            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) != 3 || entityiterator instanceof Player) continue;
            if (!entityiterator.m_9236_().m_5776_()) {
                entityiterator.m_146870_();
            }
            if (entityiterator instanceof LivingEntity) {
                LivingEntity _entity = (LivingEntity)entityiterator;
                _entity.m_21153_(0.0f);
            }
            entityiterator.f_19802_ = 0;
        }
    }
}

