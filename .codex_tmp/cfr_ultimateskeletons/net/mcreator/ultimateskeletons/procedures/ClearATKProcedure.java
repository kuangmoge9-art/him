/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class ClearATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            if (entityiterator instanceof Player) continue;
            entityiterator.m_142467_(Entity.RemovalReason.DISCARDED);
            entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_WITH_PLAYER);
            Deathlist.normalattack(entityiterator);
        }
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get()), x + entity.m_20154_().f_82479_ * 4.0, y + 0.5, z + entity.m_20154_().f_82481_ * 4.0, 1.0 * Math.cos(entity.m_146908_() + 90.0f), 0.0, 1.0 * Math.sin(entity.m_146908_() + 90.0f));
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get()), x + entity.m_20154_().f_82479_ * 4.0, y + 0.5, z + entity.m_20154_().f_82481_ * 4.0, 1.0 * Math.cos(entity.m_146908_() - 90.0f), 0.0, 1.0 * Math.sin(entity.m_146908_() - 90.0f));
    }
}

