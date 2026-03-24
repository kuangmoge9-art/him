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
 *  net.minecraft.server.level.ServerBossEvent
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.BossEvent$BossBarColor
 *  net.minecraft.world.BossEvent$BossBarOverlay
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.AreaEffectCloud
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityDimensions
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.Pose
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.goal.FloatGoal
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal
 *  net.minecraft.world.entity.monster.Creeper
 *  net.minecraft.world.entity.monster.Slime
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 *  software.bernie.geckolib.animatable.GeoEntity
 *  software.bernie.geckolib.core.animatable.GeoAnimatable
 *  software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache
 *  software.bernie.geckolib.core.animation.AnimatableManager$ControllerRegistrar
 *  software.bernie.geckolib.core.animation.AnimationController
 *  software.bernie.geckolib.core.animation.AnimationController$State
 *  software.bernie.geckolib.core.animation.AnimationState
 *  software.bernie.geckolib.core.animation.RawAnimation
 *  software.bernie.geckolib.core.object.PlayState
 *  software.bernie.geckolib.util.GeckoLibUtil
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.procedures.StarlightSkeletonUltimateATKProcedure;
import net.mcreator.ultimateskeletons.procedures.StarlightskeletonATKProcedure;
import net.mcreator.ultimateskeletons.procedures.StarlightskeletonangryATKProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class StarlightskeletonEntity
extends PathfinderMob
implements GeoEntity {
    public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);
    public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135030_);
    public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135030_);
    public static final EntityDataAccessor<Integer> DATA_animationID = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_animationTick = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_spawnTick = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_Tick = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_angryCount = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_SkillCount = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_angryTick = SynchedEntityData.m_135353_(StarlightskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache((GeoAnimatable)this);
    private boolean swinging;
    private boolean lastloop;
    private long lastSwing;
    public String animationprocedure = "empty";
    private final ServerBossEvent bossInfo = new ServerBossEvent(this.m_5446_(), BossEvent.BossBarColor.BLUE, BossEvent.BossBarOverlay.PROGRESS);
    public boolean weak = false;
    public boolean angry = false;
    public int scale;
    private Vec3[][] trailPositions = new Vec3[64][2];
    private int trailPointer = -1;
    public boolean hasTrail = false;

    public StarlightskeletonEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<StarlightskeletonEntity>)((EntityType)UltimateskeletonsModEntities.STARLIGHTSKELETON.get()), world);
    }

    public StarlightskeletonEntity(EntityType<StarlightskeletonEntity> type, Level world) {
        super(type, world);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_274367_(1.2f);
        this.m_21530_();
    }

    protected void m_8097_() {
        super.m_8097_();
        this.f_19804_.m_135372_(SHOOT, (Object)false);
        this.f_19804_.m_135372_(ANIMATION, (Object)"undefined");
        this.f_19804_.m_135372_(TEXTURE, (Object)"xing_hui_ku_lou_");
        this.f_19804_.m_135372_(DATA_animationID, (Object)0);
        this.f_19804_.m_135372_(DATA_animationTick, (Object)0);
        this.f_19804_.m_135372_(DATA_spawnTick, (Object)0);
        this.f_19804_.m_135372_(DATA_Tick, (Object)0);
        this.f_19804_.m_135372_(DATA_angryCount, (Object)0);
        this.f_19804_.m_135372_(DATA_SkillCount, (Object)0);
        this.f_19804_.m_135372_(DATA_angryTick, (Object)0);
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
        float healthafter = this.m_21223_() - 40.0f;
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

    public void setTexture(String texture) {
        this.f_19804_.m_135381_(TEXTURE, (Object)texture);
    }

    public String getTexture() {
        return (String)this.f_19804_.m_135370_(TEXTURE);
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    protected void m_8099_() {
        super.m_8099_();
        this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Slime.class, false, true));
        this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Creeper.class, false, true));
        this.f_21346_.m_25352_(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]).m_26044_(new Class[0]));
        this.f_21345_.m_25352_(4, (Goal)new FloatGoal((Mob)this));
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

    public boolean m_6469_(DamageSource source, float amount) {
        if (source.m_276093_(DamageTypes.f_268631_)) {
            return false;
        }
        if (source.m_7640_() instanceof AbstractArrow) {
            return false;
        }
        if (source.m_7640_() instanceof ThrownPotion || source.m_7640_() instanceof AreaEffectCloud) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268671_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268585_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268722_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268450_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268565_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268714_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268526_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268482_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268493_)) {
            return false;
        }
        if (source.m_276093_(DamageTypes.f_268641_)) {
            return false;
        }
        return super.m_6469_(source, amount);
    }

    public void m_7380_(CompoundTag compound) {
        super.m_7380_(compound);
        compound.m_128359_("Texture", this.getTexture());
        compound.m_128405_("DataanimationID", ((Integer)this.f_19804_.m_135370_(DATA_animationID)).intValue());
        compound.m_128405_("DataanimationTick", ((Integer)this.f_19804_.m_135370_(DATA_animationTick)).intValue());
        compound.m_128405_("DataspawnTick", ((Integer)this.f_19804_.m_135370_(DATA_spawnTick)).intValue());
        compound.m_128405_("DataTick", ((Integer)this.f_19804_.m_135370_(DATA_Tick)).intValue());
        compound.m_128405_("DataangryCount", ((Integer)this.f_19804_.m_135370_(DATA_angryCount)).intValue());
        compound.m_128405_("DataSkillCount", ((Integer)this.f_19804_.m_135370_(DATA_SkillCount)).intValue());
        compound.m_128405_("DataangryTick", ((Integer)this.f_19804_.m_135370_(DATA_angryTick)).intValue());
    }

    public void m_7378_(CompoundTag compound) {
        super.m_7378_(compound);
        if (compound.m_128441_("Texture")) {
            this.setTexture(compound.m_128461_("Texture"));
        }
        if (compound.m_128441_("DataanimationID")) {
            this.f_19804_.m_135381_(DATA_animationID, (Object)compound.m_128451_("DataanimationID"));
        }
        if (compound.m_128441_("DataanimationTick")) {
            this.f_19804_.m_135381_(DATA_animationTick, (Object)compound.m_128451_("DataanimationTick"));
        }
        if (compound.m_128441_("DataspawnTick")) {
            this.f_19804_.m_135381_(DATA_spawnTick, (Object)compound.m_128451_("DataspawnTick"));
        }
        if (compound.m_128441_("DataTick")) {
            this.f_19804_.m_135381_(DATA_Tick, (Object)compound.m_128451_("DataTick"));
        }
        if (compound.m_128441_("DataangryCount")) {
            this.f_19804_.m_135381_(DATA_angryCount, (Object)compound.m_128451_("DataangryCount"));
        }
        if (compound.m_128441_("DataSkillCount")) {
            this.f_19804_.m_135381_(DATA_SkillCount, (Object)compound.m_128451_("DataSkillCount"));
        }
        if (compound.m_128441_("DataangryTick")) {
            this.f_19804_.m_135381_(DATA_angryTick, (Object)compound.m_128451_("DataangryTick"));
        }
    }

    public int getID() {
        return (Integer)this.f_19804_.m_135370_(DATA_Tick);
    }

    public int getANGRY() {
        return (Integer)this.f_19804_.m_135370_(DATA_angryTick);
    }

    public int getTime() {
        return (Integer)this.f_19804_.m_135370_(DATA_animationID);
    }

    public int getAnimatedTick() {
        return (Integer)this.f_19804_.m_135370_(DATA_animationTick);
    }

    public void setAnimatedTick(int value) {
        this.f_19804_.m_135381_(DATA_animationTick, (Object)value);
    }

    public int getAnimatedID() {
        return (Integer)this.f_19804_.m_135370_(DATA_animationID);
    }

    public void setAnimatedID(int value) {
        this.f_19804_.m_135381_(DATA_animationID, (Object)value);
    }

    public void m_6075_() {
        if (this.scale <= 30) {
            ++this.scale;
        }
        super.m_6075_();
        this.hasTrail = this.getTime() > 0;
        super.m_6075_();
        this.angry = this.getANGRY() > 74;
        this.weak = this.getID() > 107;
        if (this.angry) {
            StarlightskeletonangryATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        } else if (this.weak) {
            StarlightskeletonATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        } else {
            StarlightSkeletonUltimateATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        }
        this.m_6210_();
    }

    public EntityDimensions m_6972_(Pose p_33597_) {
        return super.m_6972_(p_33597_).m_20388_(2.0f);
    }

    public boolean m_6072_() {
        return false;
    }

    public void m_6457_(ServerPlayer player) {
        super.m_6457_(player);
        this.bossInfo.m_6543_(player);
    }

    public void m_6452_(ServerPlayer player) {
        super.m_6452_(player);
        this.bossInfo.m_6539_(player);
    }

    public void m_8024_() {
        super.m_8024_();
        this.bossInfo.m_142711_(this.m_21223_() / this.m_21233_());
    }

    public void m_8107_() {
        super.m_8107_();
        this.m_21203_();
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.6);
        builder = builder.m_22268_(Attributes.f_22276_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22284_, 100.0);
        builder = builder.m_22268_(Attributes.f_22281_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22277_, 256.0);
        builder = builder.m_22268_(Attributes.f_22278_, 100.0);
        return builder;
    }

    private PlayState movementPredicate(AnimationState event) {
        if (this.animationprocedure.equals("empty")) {
            if (this.angry) {
                if (this.getAnimatedID() == 1) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.angryatk1"));
                }
                if (this.getAnimatedID() == 2) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.angryatk2"));
                }
                if (this.getAnimatedID() == 3) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.angryatk3"));
                }
                if (this.getAnimatedID() == 4) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.angryatk4"));
                }
                if (this.getAnimatedID() == 5) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.angryatk5"));
                }
                if (this.getAnimatedID() == 6) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.angryatk6"));
                }
            } else if (this.weak) {
                if (this.getAnimatedID() == 1) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.swipe"));
                }
                if (this.getAnimatedID() == 2) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.backflip"));
                }
                if (this.getAnimatedID() == 3) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.up"));
                }
                if (this.getAnimatedID() == 4) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.harvest"));
                }
            } else {
                if (this.getAnimatedID() == 1) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.backflip2"));
                }
                if (this.getAnimatedID() == 3) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.front"));
                }
                if (this.getAnimatedID() == 2) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.doubleslash"));
                }
                if (this.getAnimatedID() == 4) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.swordups"));
                }
            }
            if (this.getAnimatedID() == 0) {
                if (event.isMoving() || !(event.getLimbSwingAmount() > -0.15f) || !(event.getLimbSwingAmount() < 0.15f)) {
                    if (this.angry) {
                        return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.flyangry2"));
                    }
                    if (this.weak) {
                        return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.fly"));
                    }
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.fly2"));
                }
                if (this.angry) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.generalangry2"));
                }
                if (this.weak) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.general"));
                }
                return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starlightskeleton.general2"));
            }
        }
        return PlayState.STOP;
    }

    private PlayState procedurePredicate(AnimationState event) {
        if (!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED) {
            event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
            if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
                this.animationprocedure = "empty";
                event.getController().forceAnimationReset();
            }
        } else if (this.animationprocedure.equals("empty")) {
            return PlayState.STOP;
        }
        return PlayState.CONTINUE;
    }

    protected void m_6153_() {
        ++this.f_20919_;
        if (this.f_20919_ == 20) {
            this.m_142687_(Entity.RemovalReason.KILLED);
            this.m_21226_();
        }
    }

    public String getSyncedAnimation() {
        return (String)this.f_19804_.m_135370_(ANIMATION);
    }

    public void setAnimation(String animation) {
        this.f_19804_.m_135381_(ANIMATION, (Object)animation);
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar data) {
        data.add(new AnimationController[]{new AnimationController((GeoAnimatable)this, "movement", 4, this::movementPredicate)});
        data.add(new AnimationController[]{new AnimationController((GeoAnimatable)this, "procedure", 0, this::procedurePredicate)});
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    public Vec3[] getTrailPosition(int pointer, float partialTick) {
        if (this.m_213877_()) {
            partialTick = 1.0f;
        }
        int i = this.trailPointer - pointer & 0x3F;
        int j = this.trailPointer - pointer - 1 & 0x3F;
        Vec3[] d0 = this.trailPositions[j];
        Vec3 t0 = this.trailPositions[i][0].m_82546_(d0[0]);
        Vec3 t1 = this.trailPositions[i][1].m_82546_(d0[1]);
        Vec3[] d1 = new Vec3[]{t0, t1};
        Vec3 tt0 = d0[0].m_82549_(d1[0].m_82490_((double)partialTick));
        Vec3 tt1 = d0[1].m_82549_(d1[1].m_82490_((double)partialTick));
        Vec3[] d2 = new Vec3[]{tt1, tt0};
        return d2;
    }

    public void updateTrail(Vec3 trailAt1, Vec3 trailAt2) {
        if (this.trailPointer == -1) {
            Vec3 backAt1 = trailAt1;
            Vec3 backAt2 = trailAt2;
            for (int i = 0; i < this.trailPositions.length; ++i) {
                this.trailPositions[i] = new Vec3[]{backAt1, backAt2};
            }
        }
        if (++this.trailPointer == this.trailPositions.length) {
            this.trailPointer = 0;
        }
        this.trailPositions[this.trailPointer] = new Vec3[]{trailAt1, trailAt2};
    }

    public boolean hasTrail() {
        return this.trailPointer != -1 && this.hasTrail;
    }
}

