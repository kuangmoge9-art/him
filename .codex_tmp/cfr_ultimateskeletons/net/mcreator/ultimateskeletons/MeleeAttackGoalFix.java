/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntitySelector
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.Goal$Flag
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.pathfinder.Node
 *  net.minecraft.world.level.pathfinder.Path
 */
package net.mcreator.ultimateskeletons;

import java.util.EnumSet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;

public class MeleeAttackGoalFix
extends Goal {
    protected final PathfinderMob mob;
    private final double speedModifier;
    private final boolean followingTargetEvenIfNotSeen;
    private Path path;
    private double pathedTargetX;
    private double pathedTargetY;
    private double pathedTargetZ;
    private int ticksUntilNextPathRecalculation;
    private int ticksUntilNextAttack;
    private final int attackInterval = 20;
    private long lastCanUseCheck;
    private static final long COOLDOWN_BETWEEN_CAN_USE_CHECKS = 20L;
    private int failedPathFindingPenalty = 0;
    private boolean canPenalize = false;

    public MeleeAttackGoalFix(PathfinderMob p_25552_, double p_25553_, boolean p_25554_) {
        this.mob = p_25552_;
        this.speedModifier = p_25553_;
        this.followingTargetEvenIfNotSeen = p_25554_;
        this.m_7021_(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
    }

    public boolean m_8036_() {
        long i = this.mob.m_9236_().m_46467_();
        if (i - this.lastCanUseCheck < 20L) {
            return false;
        }
        this.lastCanUseCheck = i;
        LivingEntity livingentity = this.mob.m_5448_();
        if (livingentity == null) {
            return false;
        }
        if (!livingentity.m_6084_()) {
            return false;
        }
        if (this.canPenalize) {
            if (--this.ticksUntilNextPathRecalculation <= 0) {
                this.path = this.mob.m_21573_().m_6570_((Entity)livingentity, 0);
                this.ticksUntilNextPathRecalculation = 4 + this.mob.m_217043_().m_188503_(7);
                return this.path != null;
            }
            return true;
        }
        this.path = this.mob.m_21573_().m_6570_((Entity)livingentity, 0);
        if (this.path != null) {
            return true;
        }
        return this.getAttackReachSqr(livingentity) >= this.mob.m_20275_(livingentity.m_20185_(), livingentity.m_20186_(), livingentity.m_20189_());
    }

    public boolean m_8045_() {
        LivingEntity livingentity = this.mob.m_5448_();
        if (livingentity == null) {
            return false;
        }
        if (!livingentity.m_6084_()) {
            return false;
        }
        if (!this.followingTargetEvenIfNotSeen) {
            return !this.mob.m_21573_().m_26571_();
        }
        if (!this.mob.m_21444_(livingentity.m_20183_())) {
            return false;
        }
        return !(livingentity instanceof Player) || !livingentity.m_5833_() && !((Player)livingentity).m_7500_();
    }

    public void m_8056_() {
        this.mob.m_21573_().m_26536_(this.path, this.speedModifier);
        this.mob.m_21561_(true);
        this.ticksUntilNextPathRecalculation = 0;
        this.ticksUntilNextAttack = 0;
    }

    public void m_8041_() {
        LivingEntity livingentity = this.mob.m_5448_();
        if (!EntitySelector.f_20406_.test(livingentity)) {
            this.mob.m_6710_((LivingEntity)null);
        }
        this.mob.m_21561_(false);
        this.mob.m_21573_().m_26573_();
    }

    public boolean m_183429_() {
        return true;
    }

    public void m_8037_() {
        LivingEntity livingentity = this.mob.m_5448_();
        if (livingentity != null) {
            this.mob.m_21563_().m_24960_((Entity)livingentity, 30.0f, 30.0f);
            double d0 = this.mob.m_262793_(livingentity);
            this.ticksUntilNextPathRecalculation = Math.max(this.ticksUntilNextPathRecalculation - 1, 0);
            if ((this.followingTargetEvenIfNotSeen || this.mob.m_21574_().m_148306_((Entity)livingentity)) && this.ticksUntilNextPathRecalculation <= 0 && (this.pathedTargetX == 0.0 && this.pathedTargetY == 0.0 && this.pathedTargetZ == 0.0 || livingentity.m_20275_(this.pathedTargetX, this.pathedTargetY, this.pathedTargetZ) >= 1.0 || this.mob.m_217043_().m_188501_() < 0.05f)) {
                this.pathedTargetX = livingentity.m_20185_();
                this.pathedTargetY = livingentity.m_20186_();
                this.pathedTargetZ = livingentity.m_20189_();
                this.ticksUntilNextPathRecalculation = 4 + this.mob.m_217043_().m_188503_(7);
                if (this.canPenalize) {
                    Node finalPathPoint;
                    this.ticksUntilNextPathRecalculation += this.failedPathFindingPenalty;
                    this.failedPathFindingPenalty = this.mob.m_21573_().m_26570_() != null ? ((finalPathPoint = this.mob.m_21573_().m_26570_().m_77395_()) != null && livingentity.m_20275_((double)finalPathPoint.f_77271_, (double)finalPathPoint.f_77272_, (double)finalPathPoint.f_77273_) < 1.0 ? 0 : (this.failedPathFindingPenalty += 10)) : (this.failedPathFindingPenalty += 10);
                }
                if (d0 > 1024.0) {
                    this.ticksUntilNextPathRecalculation += 10;
                } else if (d0 > 256.0) {
                    this.ticksUntilNextPathRecalculation += 5;
                }
                if (!this.mob.m_21573_().m_5624_((Entity)livingentity, this.speedModifier)) {
                    this.ticksUntilNextPathRecalculation += 15;
                }
                this.ticksUntilNextPathRecalculation = this.m_183277_(this.ticksUntilNextPathRecalculation);
            }
            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
            this.checkAndPerformAttack(livingentity, d0);
        }
    }

    protected void checkAndPerformAttack(LivingEntity p_25557_, double p_25558_) {
        double d0 = this.getAttackReachSqr(p_25557_);
        if (p_25558_ <= d0 && this.ticksUntilNextAttack <= 0) {
            this.resetAttackCooldown();
        }
    }

    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = this.m_183277_(20);
    }

    protected boolean isTimeToAttack() {
        return this.ticksUntilNextAttack <= 0;
    }

    protected int getTicksUntilNextAttack() {
        return this.ticksUntilNextAttack;
    }

    protected int getAttackInterval() {
        return this.m_183277_(20);
    }

    protected double getAttackReachSqr(LivingEntity p_25556_) {
        return this.mob.m_20205_() * 2.0f * this.mob.m_20205_() * 2.0f + p_25556_.m_20205_();
    }
}

