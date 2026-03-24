/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientGamePacketListener
 *  net.minecraft.network.syncher.EntityDataAccessor
 *  net.minecraft.network.syncher.EntityDataSerializer
 *  net.minecraft.network.syncher.EntityDataSerializers
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.BossEvent$BossBarColor
 *  net.minecraft.world.BossEvent$BossBarOverlay
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityDimensions
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.Pose
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
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

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.AnimatedEntity;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.UUIDServerBossEvent;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.procedures.StarSpiritATKProcedure;
import net.mcreator.ultimateskeletons.procedures.StarSpiritUltimateATKProcedure;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
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

public class StarSpiritEntity
extends Titangodentity
implements GeoEntity {
    public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);
    public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135030_);
    public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135030_);
    public static final EntityDataAccessor<Integer> DATA_animationID = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_animationTick = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Boolean> DATA_God = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);
    public static final EntityDataAccessor<Integer> DATA_GodTick = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_SkillCount = SynchedEntityData.m_135353_(StarSpiritEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache((GeoAnimatable)this);
    private boolean swinging;
    private boolean lastloop;
    private long lastSwing;
    public String animationprocedure = "empty";
    protected UUIDServerBossEvent bossInfo = (UUIDServerBossEvent)new UUIDServerBossEvent(this.m_5446_(), BossEvent.BossBarColor.PURPLE, BossEvent.BossBarOverlay.PROGRESS, this.m_20148_()).m_7003_(true);
    public boolean god = false;
    private Vec3[][] trailPositions = new Vec3[64][2];
    private int trailPointer = -1;
    private Vec3[][] trailPositions2 = new Vec3[64][2];
    private int trailPointer2 = -1;
    public boolean hasTrail = false;
    public boolean hasTrail2 = false;

    public StarSpiritEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<StarSpiritEntity>)((EntityType)UltimateskeletonsModEntities.STAR_SPIRIT.get()), world);
    }

    public StarSpiritEntity(EntityType<StarSpiritEntity> type, Level world) {
        super((EntityType<? extends AnimatedEntity>)type, world);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_274367_(1.2f);
        this.setMax_Health(3000000.0);
        this.setHEALTS(3000000.0);
        this.m_21530_();
    }

    @Override
    protected void m_8097_() {
        super.m_8097_();
        this.f_19804_.m_135372_(SHOOT, (Object)false);
        this.f_19804_.m_135372_(ANIMATION, (Object)"undefined");
        this.f_19804_.m_135372_(TEXTURE, (Object)"star.skeleton");
        this.f_19804_.m_135372_(DATA_animationID, (Object)0);
        this.f_19804_.m_135372_(DATA_animationTick, (Object)0);
        this.f_19804_.m_135372_(DATA_God, (Object)false);
        this.f_19804_.m_135372_(DATA_GodTick, (Object)0);
        this.f_19804_.m_135372_(DATA_SkillCount, (Object)0);
    }

    public void setTexture(String texture) {
        this.f_19804_.m_135381_(TEXTURE, (Object)texture);
    }

    public String getTexture() {
        return (String)this.f_19804_.m_135370_(TEXTURE);
    }

    protected float m_6431_(Pose poseIn, EntityDimensions sizeIn) {
        return 56.0f;
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
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

    @Override
    public boolean m_6469_(DamageSource source, float amount) {
        if (source.m_276093_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage")))) {
            this.set_health(this.get_health() - (double)amount * 0.04);
        }
        if (this.damageInvTime <= 0) {
            if (source.m_7640_() instanceof Titangodentity || source.m_7640_() instanceof Player) {
                this.set_health(this.get_health() - (double)amount * 0.04);
            }
            if (!(source.m_7640_() instanceof Titangodentity || source.m_7640_() instanceof Player || source.m_276093_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))))) {
                return false;
            }
            this.damageInvTime = 10;
        }
        return super.m_6469_(source, amount);
    }

    @Override
    public void m_7380_(CompoundTag compound) {
        super.m_7380_(compound);
        compound.m_128359_("Texture", this.getTexture());
        compound.m_128405_("DataanimationID", ((Integer)this.f_19804_.m_135370_(DATA_animationID)).intValue());
        compound.m_128405_("DataanimationTick", ((Integer)this.f_19804_.m_135370_(DATA_animationTick)).intValue());
        compound.m_128379_("DataGod", ((Boolean)this.f_19804_.m_135370_(DATA_God)).booleanValue());
        compound.m_128405_("DataGodTick", ((Integer)this.f_19804_.m_135370_(DATA_GodTick)).intValue());
        compound.m_128405_("DataSkillCount", ((Integer)this.f_19804_.m_135370_(DATA_SkillCount)).intValue());
    }

    @Override
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
        if (compound.m_128441_("DataGod")) {
            this.f_19804_.m_135381_(DATA_God, (Object)compound.m_128471_("DataGod"));
        }
        if (compound.m_128441_("DataGodTick")) {
            this.f_19804_.m_135381_(DATA_GodTick, (Object)compound.m_128451_("DataGodTick"));
        }
        if (compound.m_128441_("DataSkillCount")) {
            this.f_19804_.m_135381_(DATA_SkillCount, (Object)compound.m_128451_("DataSkillCount"));
        }
    }

    public int getID() {
        return (Integer)this.f_19804_.m_135370_(DATA_GodTick);
    }

    public int getTime() {
        return (Integer)this.f_19804_.m_135370_(DATA_animationID);
    }

    @Override
    public void m_6075_() {
        this.hasTrail = this.getTime() > 0;
        super.m_6075_();
        if (this.get_health() < this.getMax_Health() && this.get_health() >= 1.0) {
            this.setHEALTS(this.get_health() + 300.0);
        }
        this.god = this.getID() >= 113;
        if (this.god) {
            this.hasTrail2 = true;
            StarSpiritUltimateATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        } else {
            if (this.m_21223_() <= 300000.0f) {
                this.setHEALTS(this.getMax_Health());
                this.f_19802_ = 20;
            }
            this.hasTrail2 = false;
            StarSpiritATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        }
        this.m_6210_();
    }

    @Override
    public void set_health(double h) {
        double health = this.m_21223_();
        double actuallydamage = health - h;
        double a = 150000.0;
        double damage = Math.min(actuallydamage, a);
        super.setHEALTS(health -= damage);
    }

    protected void m_6138_() {
    }

    public boolean m_7337_(Entity entity) {
        return true;
    }

    public boolean m_5829_() {
        return true;
    }

    public EntityDimensions m_6972_(Pose p_33597_) {
        return super.m_6972_(p_33597_).m_20388_(32.0f);
    }

    public boolean m_6072_() {
        return false;
    }

    public void m_6593_(@Nullable Component p_31476_) {
        super.m_6593_(p_31476_);
        this.bossInfo.m_6456_(this.m_5446_());
    }

    public void m_6457_(ServerPlayer player) {
        super.m_6457_(player);
        this.bossInfo.setBossId(this.m_20148_());
        this.bossInfo.m_6543_(player);
    }

    public void m_6452_(ServerPlayer player) {
        super.m_6452_(player);
        this.bossInfo.setBossId(this.m_20148_());
        this.bossInfo.m_6539_(player);
    }

    public void m_8024_() {
        super.m_8024_();
        this.bossInfo.m_142711_((float)(this.get_health() / this.getMax_Health()));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.6);
        builder = builder.m_22268_(Attributes.f_22276_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22284_, 64.0);
        builder = builder.m_22268_(Attributes.f_22281_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22277_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22278_, 64.0);
        return builder;
    }

    private PlayState movementPredicate(AnimationState event) {
        if (this.animationprocedure.equals("empty")) {
            if (event.isMoving() || !(event.getLimbSwingAmount() > -0.15f) || !(event.getLimbSwingAmount() < 0.15f)) {
                if (this.god) {
                    return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starskeleton.fly2"));
                }
                return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starskeleton.fly"));
            }
            if (this.god) {
                return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starskeleton.general2"));
            }
            return event.setAndContinue(RawAnimation.begin().thenLoop("animation.starskeleton.general"));
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

    @Override
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

    public Vec3[] getTrailPosition2(int pointer, float partialTick) {
        if (this.m_213877_()) {
            partialTick = 1.0f;
        }
        int i = this.trailPointer2 - pointer & 0x3F;
        int j = this.trailPointer2 - pointer - 1 & 0x3F;
        Vec3[] d0 = this.trailPositions2[j];
        Vec3 t0 = this.trailPositions2[i][0].m_82546_(d0[0]);
        Vec3 t1 = this.trailPositions2[i][1].m_82546_(d0[1]);
        Vec3[] d1 = new Vec3[]{t0, t1};
        Vec3 tt0 = d0[0].m_82549_(d1[0].m_82490_((double)partialTick));
        Vec3 tt1 = d0[1].m_82549_(d1[1].m_82490_((double)partialTick));
        Vec3[] d2 = new Vec3[]{tt1, tt0};
        return d2;
    }

    public void updateTrail2(Vec3 trailAt1, Vec3 trailAt2) {
        if (this.trailPointer2 == -1) {
            Vec3 backAt1 = trailAt1;
            Vec3 backAt2 = trailAt2;
            for (int i = 0; i < this.trailPositions2.length; ++i) {
                this.trailPositions2[i] = new Vec3[]{backAt1, backAt2};
            }
        }
        if (++this.trailPointer2 == this.trailPositions2.length) {
            this.trailPointer2 = 0;
        }
        this.trailPositions2[this.trailPointer2] = new Vec3[]{trailAt1, trailAt2};
    }

    public boolean hasTrail() {
        return this.trailPointer != -1 && this.hasTrail;
    }

    public boolean hasTrail2() {
        return this.trailPointer2 != -1 && this.hasTrail2;
    }
}

