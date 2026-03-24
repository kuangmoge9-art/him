/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.AreaEffectCloud
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.procedures.BallATKProcedure;
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
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class ExplosionshockwaveEntity
extends PathfinderMob {
    public static final EntityDataAccessor<Integer> DATA_Tick = SynchedEntityData.m_135353_(ExplosionshockwaveEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    private float currentRadius = 0.4f;
    private float maxRadius = 1000.0f;
    private float growthRate = 0.2f;
    private int lifespan = 40;
    public int age = 0;

    public void m_8119_() {
        if (this.age == 1 && this.m_9236_().m_5776_()) {
            this.m_9236_().m_7785_(this.m_20185_(), this.m_20186_(), this.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:creepertitanexplosion")), SoundSource.WEATHER, 200.0f, 1.0f + this.f_19796_.m_188501_() * 0.2f, false);
        }
        if (this.age < this.lifespan) {
            if (!(this.m_9236_() instanceof ServerLevel)) {
                this.m_9236_().m_6580_(12);
            }
            this.growthRate += 0.2f;
            this.currentRadius += this.growthRate;
            BallATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
            ++this.age;
        }
        if (this.age >= this.lifespan) {
            this.m_142467_(Entity.RemovalReason.DISCARDED);
        }
    }

    public float getCurrentRadius() {
        return Math.min(this.currentRadius, this.maxRadius);
    }

    public boolean isExpired() {
        return this.age >= this.lifespan;
    }

    public ExplosionshockwaveEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<ExplosionshockwaveEntity>)((EntityType)UltimateskeletonsModEntities.EXPLOSIONSHOCKWAVE.get()), world);
    }

    public ExplosionshockwaveEntity(EntityType<ExplosionshockwaveEntity> type, Level world) {
        super(type, world);
        this.m_274367_(0.6f);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    protected void m_8097_() {
        super.m_8097_();
        this.f_19804_.m_135372_(DATA_Tick, (Object)0);
    }

    protected void m_8099_() {
        super.m_8099_();
        this.f_21346_.m_25352_(1, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]).m_26044_(new Class[0]));
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

    public boolean m_6469_(DamageSource damagesource, float amount) {
        if (damagesource.m_276093_(DamageTypes.f_268631_)) {
            return false;
        }
        if (damagesource.m_7640_() instanceof AbstractArrow) {
            return false;
        }
        if (damagesource.m_7640_() instanceof Player) {
            return false;
        }
        if (damagesource.m_7640_() instanceof ThrownPotion || damagesource.m_7640_() instanceof AreaEffectCloud) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268671_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268585_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268722_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268450_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268714_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268526_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268482_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_)) {
            return false;
        }
        return super.m_6469_(damagesource, amount);
    }

    public boolean m_6128_() {
        return true;
    }

    public boolean m_5825_() {
        return true;
    }

    public void m_7380_(CompoundTag compound) {
        super.m_7380_(compound);
        compound.m_128405_("DataTick", ((Integer)this.f_19804_.m_135370_(DATA_Tick)).intValue());
    }

    public void m_7378_(CompoundTag compound) {
        super.m_7378_(compound);
        if (compound.m_128441_("DataTick")) {
            this.f_19804_.m_135381_(DATA_Tick, (Object)compound.m_128451_("DataTick"));
        }
    }

    public void m_6075_() {
        super.m_6075_();
        BallATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
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
        return builder;
    }
}

