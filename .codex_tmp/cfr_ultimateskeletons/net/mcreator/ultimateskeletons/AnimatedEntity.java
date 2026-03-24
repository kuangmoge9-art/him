/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.syncher.EntityDataAccessor
 *  net.minecraft.network.syncher.EntityDataSerializer
 *  net.minecraft.network.syncher.EntityDataSerializers
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons;

import java.util.Comparator;
import java.util.List;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class AnimatedEntity
extends PathfinderMob {
    public static final EntityDataAccessor<Integer> DATA_animationTick = SynchedEntityData.m_135353_(AnimatedEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_idleAnimationTick = SynchedEntityData.m_135353_(AnimatedEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_animationID = SynchedEntityData.m_135353_(AnimatedEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Boolean> DATA_spawn = SynchedEntityData.m_135353_(AnimatedEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);
    public static final EntityDataAccessor<Integer> DATA_TrackingRange = SynchedEntityData.m_135353_(AnimatedEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_RunRange = SynchedEntityData.m_135353_(AnimatedEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);

    protected AnimatedEntity(EntityType<? extends PathfinderMob> type, Level world) {
        super(type, world);
    }

    public int getAnimatedTick() {
        return (Integer)this.f_19804_.m_135370_(DATA_animationTick);
    }

    public void setAnimatedTick(int value) {
        this.f_19804_.m_135381_(DATA_animationTick, (Object)value);
    }

    public int getIdleAnimatedTick() {
        return (Integer)this.f_19804_.m_135370_(DATA_idleAnimationTick);
    }

    public void setIdleAnimatedTick(int value) {
        this.f_19804_.m_135381_(DATA_idleAnimationTick, (Object)value);
    }

    public int getAnimatedID() {
        return (Integer)this.f_19804_.m_135370_(DATA_animationID);
    }

    public void setAnimatedID(int value) {
        this.f_19804_.m_135381_(DATA_animationID, (Object)value);
    }

    public Boolean getSpawn() {
        return (Boolean)this.f_19804_.m_135370_(DATA_spawn);
    }

    public void setSpawn(boolean value) {
        this.f_19804_.m_135381_(DATA_spawn, (Object)value);
    }

    public void setTrackingRange(int value) {
        this.f_19804_.m_135381_(DATA_TrackingRange, (Object)value);
    }

    public int getTrackingRange() {
        return (Integer)this.f_19804_.m_135370_(DATA_TrackingRange);
    }

    public void setRunRange(int value) {
        this.f_19804_.m_135381_(DATA_RunRange, (Object)value);
    }

    public int getRunRange() {
        return (Integer)this.f_19804_.m_135370_(DATA_RunRange);
    }

    public int BarInterval() {
        return 35;
    }

    public int getBarFrameX() {
        return 132;
    }

    public int getBarFrameY() {
        return 127;
    }

    public int getBarX() {
        return 108;
    }

    public int getBarY() {
        return 154;
    }

    public int getNameY() {
        return 110;
    }

    public int getBarFrameStartingPointX() {
        return 1;
    }

    public int getBarFrameStartingPointY() {
        return 7;
    }

    public int getBarWidth() {
        return 254;
    }

    public int getBarFrameEndY() {
        return 45;
    }

    public int getBartartingPointX() {
        return 25;
    }

    public int getBarStartingPointY() {
        return 46;
    }

    public int getBarWidth2() {
        return 210;
    }

    public int getBarEndY() {
        return 96;
    }

    public String getBarTexture() {
        return "girl:textures/entities/bossbar/raiden_shogun_bar.png";
    }

    public boolean isBar() {
        return false;
    }

    public boolean ColourName() {
        return false;
    }

    public void lookAttackTarget() {
        AnimatedEntity entity = this;
        Level world = entity.m_9236_();
        boolean loop = false;
        double x = entity.m_20185_();
        double y = entity.m_20186_();
        double z = entity.m_20189_();
        AnimatedEntity datEntI = entity;
        AnimatedEntity datEntSetI = entity;
        Vec3 center = new Vec3(x, y, z);
        List<Entity> entfound = world.m_6443_(Entity.class, new AABB(center, center).m_82400_(40.0), e -> true).stream().sorted(Comparator.comparingDouble(entcnd -> entcnd.m_20238_(center))).toList();
        for (Entity entityiterator : entfound) {
            if (entityiterator != entity.m_5448_()) continue;
            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(entity.m_5448_().m_20185_(), entity.m_5448_().m_20186_(), entity.m_5448_().m_20189_()));
        }
    }

    public void m_20334_(double p_20335_, double p_20336_, double p_20337_) {
        if (this.getAnimatedID() == 0) {
            super.m_20334_(p_20335_, p_20336_, p_20337_);
        } else {
            super.m_20334_(0.0, 0.0, 0.0);
        }
    }

    protected void m_8099_() {
        super.m_8099_();
        this.f_21346_.m_25352_(1, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
    }

    protected void m_8097_() {
        super.m_8097_();
        this.f_19804_.m_135372_(DATA_animationTick, (Object)0);
        this.f_19804_.m_135372_(DATA_idleAnimationTick, (Object)0);
        this.f_19804_.m_135372_(DATA_animationID, (Object)0);
        this.f_19804_.m_135372_(DATA_TrackingRange, (Object)3);
        this.f_19804_.m_135372_(DATA_RunRange, (Object)10);
        this.f_19804_.m_135372_(DATA_spawn, (Object)false);
    }

    public void m_7380_(CompoundTag compound) {
        super.m_7380_(compound);
        compound.m_128405_("DataanimationTick", ((Integer)this.f_19804_.m_135370_(DATA_animationTick)).intValue());
        compound.m_128405_("DataidleAnimationTick", ((Integer)this.f_19804_.m_135370_(DATA_idleAnimationTick)).intValue());
        compound.m_128405_("DataanimationID", ((Integer)this.f_19804_.m_135370_(DATA_animationID)).intValue());
        compound.m_128405_("DATATrackingRange", ((Integer)this.f_19804_.m_135370_(DATA_TrackingRange)).intValue());
        compound.m_128405_("DATARunRange", ((Integer)this.f_19804_.m_135370_(DATA_RunRange)).intValue());
        compound.m_128379_("Dataspawn", ((Boolean)this.f_19804_.m_135370_(DATA_spawn)).booleanValue());
    }

    public void m_7378_(CompoundTag compound) {
        super.m_7378_(compound);
        if (compound.m_128441_("DataanimationTick")) {
            this.f_19804_.m_135381_(DATA_animationTick, (Object)compound.m_128451_("DataanimationTick"));
        }
        if (compound.m_128441_("DataidleAnimationTick")) {
            this.f_19804_.m_135381_(DATA_idleAnimationTick, (Object)compound.m_128451_("DataidleAnimationTick"));
        }
        if (compound.m_128441_("DataanimationID")) {
            this.f_19804_.m_135381_(DATA_animationID, (Object)compound.m_128451_("DataanimationID"));
        }
        if (compound.m_128441_("DATATrackingRange")) {
            this.f_19804_.m_135381_(DATA_TrackingRange, (Object)compound.m_128451_("DATATrackingRange"));
        }
        if (compound.m_128441_("DATARunRange")) {
            this.f_19804_.m_135381_(DATA_RunRange, (Object)compound.m_128451_("DATARunRange"));
        }
        if (compound.m_128441_("Dataspawn")) {
            this.f_19804_.m_135381_(DATA_spawn, (Object)compound.m_128471_("Dataspawn"));
        }
    }

    public boolean m_6469_(DamageSource source, float amount) {
        AnimatedEntity entity = this;
        Level world = entity.m_9236_();
        boolean loop = false;
        double x = entity.m_20185_();
        double y = entity.m_20186_();
        double z = entity.m_20189_();
        return super.m_6469_(source, amount);
    }
}

