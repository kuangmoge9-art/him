/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
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
 *  net.minecraft.server.level.ServerLevel
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
 *  net.minecraft.world.level.block.state.BlockState
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
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.UUIDServerBossEvent;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.procedures.GiantskeletonATKProcedure;
import net.minecraft.core.BlockPos;
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
import net.minecraft.server.level.ServerLevel;
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
import net.minecraft.world.level.block.state.BlockState;
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

public class GiantskeletonEntity
extends Titangodentity
implements GeoEntity {
    public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);
    public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135030_);
    public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135030_);
    public static final EntityDataAccessor<Integer> DATA_growTick = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_growLevel = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_deathTick = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_killCount = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_animationID = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_animationTick = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Boolean> DATA_glow = SynchedEntityData.m_135353_(GiantskeletonEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache((GeoAnimatable)this);
    private boolean swinging;
    private boolean lastloop;
    private long lastSwing;
    public float intermediateHealth = 0.0f;
    public String animationprocedure = "empty";
    protected UUIDServerBossEvent bossInfo = (UUIDServerBossEvent)new UUIDServerBossEvent(this.m_5446_(), BossEvent.BossBarColor.PURPLE, BossEvent.BossBarOverlay.PROGRESS, this.m_20148_()).m_7003_(true);

    public GiantskeletonEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<GiantskeletonEntity>)((EntityType)UltimateskeletonsModEntities.GIANTSKELETON.get()), world);
    }

    public GiantskeletonEntity(EntityType<GiantskeletonEntity> type, Level world) {
        super((EntityType<? extends AnimatedEntity>)type, world);
        this.f_21364_ = 10000;
        this.m_21557_(false);
        this.m_274367_(1.2f);
        this.setMax_Health(6000.0);
        this.setHEALTS(6000.0);
        this.m_21530_();
    }

    @Override
    protected void m_8097_() {
        super.m_8097_();
        this.f_19804_.m_135372_(SHOOT, (Object)false);
        this.f_19804_.m_135372_(ANIMATION, (Object)"undefined");
        this.f_19804_.m_135372_(TEXTURE, (Object)"giantskeleton");
        this.f_19804_.m_135372_(DATA_growTick, (Object)-600);
        this.f_19804_.m_135372_(DATA_growLevel, (Object)0);
        this.f_19804_.m_135372_(DATA_deathTick, (Object)0);
        this.f_19804_.m_135372_(DATA_killCount, (Object)0);
        this.f_19804_.m_135372_(DATA_animationID, (Object)0);
        this.f_19804_.m_135372_(DATA_animationTick, (Object)0);
        this.f_19804_.m_135372_(DATA_glow, (Object)false);
    }

    public void setTexture(String texture) {
        this.f_19804_.m_135381_(TEXTURE, (Object)texture);
    }

    public String getTexture() {
        return (String)this.f_19804_.m_135370_(TEXTURE);
    }

    protected float m_6431_(Pose poseIn, EntityDimensions sizeIn) {
        return (12.0f + (float)this.getgrowtick() * 0.02f) * 0.875f;
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

    public SoundEvent m_7515_() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanidle"));
    }

    public void m_7355_(BlockPos pos, BlockState blockIn) {
        this.m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanstep")), 20.0f, 1.0f);
    }

    public void m_8032_() {
        this.m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanidle")), 15.0f, 1.0f);
    }

    public void m_6677_(DamageSource p_21160_) {
        this.m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanhurt")), 15.0f, 1.0f);
    }

    public SoundEvent m_7975_(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitanhurt"));
    }

    public SoundEvent m_5592_() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:skeletontitandeath"));
    }

    @Override
    public boolean m_6469_(DamageSource source, float amount) {
        if (source.m_276093_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage")))) {
            this.set_health(this.get_health() - (double)amount * 0.16);
        }
        if (this.damageInvTime <= 0) {
            if (source.m_7640_() instanceof Titangodentity || source.m_7640_() instanceof Player) {
                this.set_health(this.get_health() - (double)amount * 0.16);
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
        compound.m_128405_("DatagrowTick", ((Integer)this.f_19804_.m_135370_(DATA_growTick)).intValue());
        compound.m_128405_("DatagrowLevel", ((Integer)this.f_19804_.m_135370_(DATA_growLevel)).intValue());
        compound.m_128405_("DatadeathTick", ((Integer)this.f_19804_.m_135370_(DATA_deathTick)).intValue());
        compound.m_128405_("DatakillCount", ((Integer)this.f_19804_.m_135370_(DATA_killCount)).intValue());
        compound.m_128405_("DataanimationID", ((Integer)this.f_19804_.m_135370_(DATA_animationID)).intValue());
        compound.m_128405_("DataanimationTick", ((Integer)this.f_19804_.m_135370_(DATA_animationTick)).intValue());
        compound.m_128379_("Dataglow", ((Boolean)this.f_19804_.m_135370_(DATA_glow)).booleanValue());
    }

    @Override
    public void m_7378_(CompoundTag compound) {
        super.m_7378_(compound);
        if (compound.m_128441_("Texture")) {
            this.setTexture(compound.m_128461_("Texture"));
        }
        if (compound.m_128441_("DatagrowTick")) {
            this.f_19804_.m_135381_(DATA_growTick, (Object)compound.m_128451_("DatagrowTick"));
        }
        if (compound.m_128441_("DatagrowLevel")) {
            this.f_19804_.m_135381_(DATA_growLevel, (Object)compound.m_128451_("DatagrowLevel"));
        }
        if (compound.m_128441_("DatadeathTick")) {
            this.f_19804_.m_135381_(DATA_deathTick, (Object)compound.m_128451_("DatadeathTick"));
        }
        if (compound.m_128441_("DatakillCount")) {
            this.f_19804_.m_135381_(DATA_killCount, (Object)compound.m_128451_("DatakillCount"));
        }
        if (compound.m_128441_("DataanimationID")) {
            this.f_19804_.m_135381_(DATA_animationID, (Object)compound.m_128451_("DataanimationID"));
        }
        if (compound.m_128441_("DataanimationTick")) {
            this.f_19804_.m_135381_(DATA_animationTick, (Object)compound.m_128451_("DataanimationTick"));
        }
        if (compound.m_128441_("Dataglow")) {
            this.f_19804_.m_135381_(DATA_glow, (Object)compound.m_128471_("Dataglow"));
        }
    }

    public int getgrowlevel() {
        return (Integer)this.f_19804_.m_135370_(DATA_growLevel);
    }

    public int getgrowtick() {
        return (Integer)this.f_19804_.m_135370_(DATA_growTick);
    }

    public Boolean glower() {
        return (Boolean)this.f_19804_.m_135370_(DATA_glow);
    }

    public int getdeathtick() {
        return (Integer)this.f_19804_.m_135370_(DATA_deathTick);
    }

    @Override
    public void m_6075_() {
        ServerLevel serverLevel;
        Object object;
        super.m_6075_();
        if (this.getgrowlevel() == 4 && this.getgrowtick() <= -600 && (object = this.m_9236_()) instanceof ServerLevel) {
            serverLevel = (ServerLevel)object;
            for (ServerPlayer serverPlayer : serverLevel.m_8795_(Player2 -> true)) {
                this.bossInfo.m_6539_(serverPlayer);
            }
        }
        if (this.glower().booleanValue()) {
            if (this.getgrowlevel() < 4 && this.getgrowlevel() > 0) {
                this.setMax_Health(6000.0 + (double)(this.getgrowtick() * 10));
                this.setHEALTS(6000.0 + (double)(this.getgrowtick() * 10));
            }
        } else if (this.getgrowlevel() > 0) {
            this.setMax_Health(6000.0 + (double)(this.getgrowtick() * 10));
        }
        if (this.get_health() < this.getMax_Health()) {
            if (this.get_health() >= 1.0) {
                this.setHEALTS(this.get_health() + 5.0);
            } else {
                this.setHEALTS(0.0);
            }
        }
        if (this.m_21223_() < 1.0f) {
            this.setHEALTS(0.0);
            if (this.getdeathtick() >= 160) {
                object = this.m_9236_();
                if (object instanceof ServerLevel) {
                    serverLevel = (ServerLevel)object;
                    for (ServerPlayer serverPlayer : serverLevel.m_8795_(Player2 -> true)) {
                        this.bossInfo.m_6539_(serverPlayer);
                    }
                }
                this.m_142467_(Entity.RemovalReason.KILLED);
                this.invalidateCaps();
                this.m_21226_();
                this.setHEALTS(0.0);
            }
        }
        GiantskeletonATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        this.m_6210_();
    }

    public void m_8119_() {
        super.m_8119_();
        if (this.getdeathtick() >= 160) {
            Level level = this.m_9236_();
            if (level instanceof ServerLevel) {
                ServerLevel serverLevel = (ServerLevel)level;
                for (ServerPlayer serverPlayer : serverLevel.m_8795_(Player2 -> true)) {
                    this.bossInfo.m_6539_(serverPlayer);
                }
            }
            Deathlist.normalattack((Entity)this);
            this.m_142467_(Entity.RemovalReason.KILLED);
            this.invalidateCaps();
            this.m_21226_();
            this.setHEALTS(0.0);
        }
    }

    @Override
    public void set_health(double h) {
        double health = this.m_21223_();
        double actuallydamage = health - h;
        double a = 2000.0;
        double damage = Math.min(actuallydamage, a);
        super.setHEALTS(health -= damage);
    }

    public EntityDimensions m_6972_(Pose p_33597_) {
        return super.m_6972_(p_33597_).m_20388_(6.0f + (float)this.getgrowtick() * 0.01f);
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
        builder = builder.m_22268_(Attributes.f_22284_, 21.0);
        builder = builder.m_22268_(Attributes.f_22281_, 100.0);
        builder = builder.m_22268_(Attributes.f_22277_, 2048.0);
        builder = builder.m_22268_(Attributes.f_22278_, 100.0);
        return builder;
    }

    private PlayState movementPredicate(AnimationState event) {
        if (this.animationprocedure.equals("empty")) {
            if (event.isMoving() || !(event.getLimbSwingAmount() > -0.15f) || !(event.getLimbSwingAmount() < 0.15f)) {
                return event.setAndContinue(RawAnimation.begin().thenLoop("animation.giantskeleton.move"));
            }
            return event.setAndContinue(RawAnimation.begin().thenLoop("animation.giantskeleton.general"));
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
        if (this.f_20919_ == 200) {
            Deathlist.normalattack((Entity)this);
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
}

