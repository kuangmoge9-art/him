/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.ai.goal.Goal$Flag
 *  net.minecraft.world.entity.ai.goal.target.TargetGoal
 *  net.minecraft.world.entity.ai.targeting.TargetingConditions
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.phys.AABB
 */
package net.mcreator.ultimateskeletons;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;

public class TitanNearestAttackableTargetGoal<T extends LivingEntity>
extends TargetGoal {
    private static final int DEFAULT_RANDOM_INTERVAL = 10;
    protected Class<T> targetType;
    protected int randomInterval;
    @Nullable
    protected LivingEntity target;
    protected TargetingConditions targetConditions;

    public TitanNearestAttackableTargetGoal(Mob p_26053_, Class<T> p_26054_, int p_26055_, boolean p_26056_, boolean p_26057_, @Nullable Predicate<LivingEntity> p_26058_) {
        super(p_26053_, p_26056_, p_26057_);
        this.targetType = p_26054_;
        this.randomInterval = TitanNearestAttackableTargetGoal.m_186073_((int)p_26055_);
        this.m_7021_(EnumSet.of(Goal.Flag.TARGET));
        this.targetConditions = TargetingConditions.m_148352_().m_26883_(2048.0).m_26888_(p_26058_);
    }

    public boolean m_8036_() {
        if (this.randomInterval > 0 && this.f_26135_.m_217043_().m_188503_(this.randomInterval) != 0) {
            return false;
        }
        this.findTarget();
        return this.target != null;
    }

    protected AABB getTargetSearchArea(double p_26069_) {
        return this.f_26135_.m_20191_().m_82377_(p_26069_, 4.0, p_26069_);
    }

    public void findTarget() {
        List candidates = this.f_26135_.m_9236_().m_6443_(this.targetType, this.getTargetSearchArea(2048.0), e -> true);
        this.target = candidates.stream().filter(e -> this.targetConditions.m_26885_((LivingEntity)this.f_26135_, e) && this.isTargetValid((LivingEntity)e)).min(Comparator.comparingDouble(e -> this.f_26135_.m_20280_((Entity)e))).orElse(null);
        if (this.target == null && Player.class.isAssignableFrom(this.targetType)) {
            this.target = this.f_26135_.m_9236_().m_45949_(this.targetConditions, (LivingEntity)this.f_26135_, this.f_26135_.m_20185_(), this.f_26135_.m_20188_(), this.f_26135_.m_20189_());
        }
    }

    private boolean isTargetValid(LivingEntity target) {
        if (target == null) {
            return false;
        }
        if (target.m_21223_() < 1.0f || !target.m_6084_() || target == this.f_26135_) {
            return false;
        }
        double distanceSq = this.f_26135_.m_20280_((Entity)target);
        return distanceSq <= 1048576.0;
    }

    public boolean m_8045_() {
        if (this.target != null) {
            return this.target.m_6084_() && this.isTargetValid(this.target) && super.m_8045_();
        }
        return false;
    }

    public void m_8056_() {
        this.f_26135_.m_6710_(this.target);
        super.m_8056_();
    }

    public void setTarget(@Nullable LivingEntity p_26071_) {
        this.target = p_26071_;
    }
}

