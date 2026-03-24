/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientGamePacketListener
 *  net.minecraft.network.syncher.EntityDataAccessor
 *  net.minecraft.network.syncher.EntityDataSerializer
 *  net.minecraft.network.syncher.EntityDataSerializers
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.control.FlyingMoveControl
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.entity.ai.navigation.FlyingPathNavigation
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.AnimatedEntity;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.procedures.BallATKProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class AdamanshockEntity
extends Titangodentity {
    public static final EntityDataAccessor<Integer> DATA_Tick = SynchedEntityData.m_135353_(AdamanshockEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    private float currentRadius = 0.4f;
    private float maxRadius = 2000.0f;
    private float growthRate = 0.8f;
    private int lifespan = 20;
    public int age = 0;

    public void m_8119_() {
        if (this.age == 1 && this.m_9236_().m_5776_()) {
            this.m_9236_().m_7785_(this.m_20185_(), this.m_20186_(), this.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.WEATHER, 200.0f, 1.0f + this.f_19796_.m_188501_() * 0.2f, false);
        }
        if (this.age < this.lifespan) {
            if (!(this.m_9236_() instanceof ServerLevel)) {
                this.m_9236_().m_6580_(12);
            }
            this.growthRate += 1.2f;
            this.currentRadius += this.growthRate;
            BallATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
            ++this.age;
        }
        if (this.age >= this.lifespan) {
            this.setHEALTS(0.0);
            this.m_142467_(Entity.RemovalReason.DISCARDED);
        }
    }

    public float getCurrentRadius() {
        return Math.min(this.currentRadius, this.maxRadius);
    }

    public AdamanshockEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<AdamanshockEntity>)((EntityType)UltimateskeletonsModEntities.ADAMANSHOCK.get()), world);
    }

    public AdamanshockEntity(EntityType<AdamanshockEntity> type, Level world) {
        super((EntityType<? extends AnimatedEntity>)type, world);
        this.m_274367_(0.6f);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
        this.f_21342_ = new FlyingMoveControl((Mob)this, 10, true);
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    @Override
    protected void m_8097_() {
        super.m_8097_();
        this.f_19804_.m_135372_(DATA_Tick, (Object)0);
    }

    protected PathNavigation m_6037_(Level world) {
        return new FlyingPathNavigation((Mob)this, world);
    }

    @Override
    protected void m_8099_() {
        super.m_8099_();
        this.f_21346_.m_25352_(1, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]).m_26044_(new Class[0]));
    }

    @Override
    public void m_6074_() {
        super.m_5634_(10000.0f);
    }

    @Override
    public void m_142687_(Entity.RemovalReason p_276115_) {
        if (!(this.m_21223_() > 0.0f)) {
            super.m_142687_(p_276115_);
            this.f_20890_ = true;
        }
    }

    public MobType m_6336_() {
        return MobType.f_21640_;
    }

    public boolean m_6785_(double distanceToClosestPlayer) {
        return false;
    }

    public double m_6049_() {
        return -0.35;
    }

    public SoundEvent m_7975_(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
    }

    public SoundEvent m_5592_() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
    }

    public boolean m_142535_(float l, float d, DamageSource source) {
        return false;
    }

    @Override
    public void m_7380_(CompoundTag compound) {
        super.m_7380_(compound);
        compound.m_128405_("DataTick", ((Integer)this.f_19804_.m_135370_(DATA_Tick)).intValue());
    }

    @Override
    public void m_7378_(CompoundTag compound) {
        super.m_7378_(compound);
        if (compound.m_128441_("DataTick")) {
            this.f_19804_.m_135381_(DATA_Tick, (Object)compound.m_128451_("DataTick"));
        }
    }

    @Override
    public void m_6075_() {
        super.m_6075_();
        BallATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
    }

    public boolean m_6094_() {
        return false;
    }

    protected void m_7324_(Entity entityIn) {
    }

    protected void m_6138_() {
    }

    protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    public void m_20242_(boolean ignored) {
        super.m_20242_(true);
    }

    public void m_8107_() {
        super.m_8107_();
        this.m_20242_(true);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.3);
        builder = builder.m_22268_(Attributes.f_22276_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22284_, 0.0);
        builder = builder.m_22268_(Attributes.f_22281_, 3.0);
        builder = builder.m_22268_(Attributes.f_22277_, 16.0);
        builder = builder.m_22268_(Attributes.f_22280_, 0.3);
        return builder;
    }
}

