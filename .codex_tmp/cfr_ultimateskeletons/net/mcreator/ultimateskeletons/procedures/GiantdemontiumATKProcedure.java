/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Holder
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.Level$ExplosionInteraction
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.entity.DemontiumgolemtitanEntity;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class GiantdemontiumATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        Level _level;
        if (world instanceof Level && !(_level = (Level)world).m_5776_()) {
            _level.m_254849_(null, x, y, z, 12.0f, Level.ExplosionInteraction.BLOCK);
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(36.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            float f;
            if (entityiterator instanceof DemontiumgolemtitanEntity) continue;
            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))));
            if (entityiterator instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entityiterator;
                f = _livEnt.m_21233_();
            } else {
                f = -1.0f;
            }
            entityiterator.m_6469_(damageSource, f / 10.0f + 50000.0f);
        }
    }
}

