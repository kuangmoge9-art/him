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
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.util.RandomSource
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
 *  net.minecraft.world.entity.ai.control.FlyingMoveControl
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.RandomStrollGoal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal
 *  net.minecraft.world.entity.ai.navigation.FlyingPathNavigation
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
 *  net.minecraft.world.entity.monster.Slime
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.procedures.TitanspiritATKProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;
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
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class TitanspiritEntity
extends PathfinderMob {
    public static final EntityDataAccessor<Integer> DATA_killCount = SynchedEntityData.m_135353_(TitanspiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_spawnTick = SynchedEntityData.m_135353_(TitanspiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);

    public TitanspiritEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<TitanspiritEntity>)((EntityType)UltimateskeletonsModEntities.TITANSPIRIT.get()), world);
    }

    public TitanspiritEntity(EntityType<TitanspiritEntity> type, Level world) {
        super(type, world);
        this.m_274367_(0.6f);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
        this.f_21342_ = new FlyingMoveControl((Mob)this, 10, true);
    }

    public void m_6074_() {
        super.m_5634_(10000.0f);
    }

    public void m_142687_(Entity.RemovalReason p_276115_) {
        if (!(this.m_21223_() > 0.0f) && this.f_20919_ >= 19) {
            super.m_142687_(p_276115_);
            this.f_20890_ = true;
        }
    }

    public void m_21153_(float heal) {
        float healthafter = this.m_21223_() - 4.0f;
        float healthremain = this.m_21223_();
        if (heal > healthremain) {
            healthremain = heal;
        } else if (this.m_9236_().m_46467_() % 10L == 0L) {
            healthremain = heal >= healthafter ? heal : healthafter;
        }
        if (!Float.isNaN(healthremain)) {
            super.m_21153_(healthremain);
        }
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    protected void m_8097_() {
        super.m_8097_();
        this.f_19804_.m_135372_(DATA_killCount, (Object)0);
        this.f_19804_.m_135372_(DATA_spawnTick, (Object)0);
    }

    protected PathNavigation m_6037_(Level world) {
        return new FlyingPathNavigation((Mob)this, world);
    }

    protected void m_8099_() {
        super.m_8099_();
        this.f_21345_.m_25352_(1, (Goal)new RandomStrollGoal(this, 0.8, 20){

            protected Vec3 m_7037_() {
                RandomSource random = TitanspiritEntity.this.m_217043_();
                double dir_x = TitanspiritEntity.this.m_20185_() + (double)((random.m_188501_() * 2.0f - 1.0f) * 16.0f);
                double dir_y = TitanspiritEntity.this.m_20186_() + (double)((random.m_188501_() * 2.0f - 1.0f) * 16.0f);
                double dir_z = TitanspiritEntity.this.m_20189_() + (double)((random.m_188501_() * 2.0f - 1.0f) * 16.0f);
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.f_21346_.m_25352_(2, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]).m_26044_(new Class[0]));
        this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Slime.class, false, true));
        this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, false, true));
    }

    public MobType m_6336_() {
        return MobType.f_21640_;
    }

    public boolean m_6785_(double distanceToClosestPlayer) {
        return false;
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
        compound.m_128405_("DatakillCount", ((Integer)this.f_19804_.m_135370_(DATA_killCount)).intValue());
        compound.m_128405_("DataspawnTick", ((Integer)this.f_19804_.m_135370_(DATA_spawnTick)).intValue());
    }

    public void m_7378_(CompoundTag compound) {
        super.m_7378_(compound);
        if (compound.m_128441_("DatakillCount")) {
            this.f_19804_.m_135381_(DATA_killCount, (Object)compound.m_128451_("DatakillCount"));
        }
        if (compound.m_128441_("DataspawnTick")) {
            this.f_19804_.m_135381_(DATA_spawnTick, (Object)compound.m_128451_("DataspawnTick"));
        }
    }

    public void m_6075_() {
        super.m_6075_();
        TitanspiritATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
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
        builder = builder.m_22268_(Attributes.f_22279_, 0.6);
        builder = builder.m_22268_(Attributes.f_22276_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22284_, 100.0);
        builder = builder.m_22268_(Attributes.f_22281_, 100.0);
        builder = builder.m_22268_(Attributes.f_22277_, 2048.0);
        builder = builder.m_22268_(Attributes.f_22280_, 0.6);
        return builder;
    }
}

