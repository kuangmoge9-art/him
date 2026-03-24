/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.targeting.TargetingConditions
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.phys.AABB
 */
package net.mcreator.ultimateskeletons;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;

public class NearestTargetTitanGoal
extends Goal {
    protected final PathfinderMob mob;
    protected final Class<?> targetClass;
    protected final TargetingConditions targetConditions;
    protected final Comparator<Entity> distanceComparator;
    protected LivingEntity target;

    public NearestTargetTitanGoal(PathfinderMob mob, Class<?> targetClass, int interval, boolean checkSight, boolean onlyNearby) {
        this.mob = mob;
        this.targetClass = targetClass;
        this.distanceComparator = Comparator.comparingDouble(e -> mob.m_20280_(e));
        this.targetConditions = TargetingConditions.m_148352_().m_26883_(this.getFollowDistance()).m_26888_(this::isSuitableTargetInternal);
    }

    public boolean m_8036_() {
        AABB searchArea = this.mob.m_20191_().m_82400_(this.getFollowDistance());
        List candidates = this.mob.m_9236_().m_6443_(LivingEntity.class, searchArea, e -> true);
        candidates.sort((e1, e2) -> Double.compare(this.mob.m_20280_((Entity)e1), this.mob.m_20280_((Entity)e2)));
        for (LivingEntity entity : candidates) {
            if (!this.isSuitableTarget(entity)) continue;
            this.target = entity;
            return true;
        }
        return false;
    }

    public void m_8056_() {
        if (this.target != null && this.mob instanceof Mob) {
            this.mob.m_6710_(this.target);
        }
        super.m_8056_();
    }

    private boolean isSuitableTargetInternal(Entity entity) {
        if (!(entity instanceof LivingEntity)) {
            return false;
        }
        LivingEntity livingEntity = (LivingEntity)entity;
        return this.isSuitableTarget(livingEntity);
    }

    private boolean isSuitableTarget(LivingEntity target) {
        if (target instanceof Player) {
            Player player = (Player)target;
            return false;
        }
        if (target == this.mob || !target.m_6084_()) {
            return false;
        }
        return this.mob.m_5448_() == null || this.mob instanceof Titangodentity;
    }

    protected double getFollowDistance() {
        return 1024.0;
    }
}

