/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientGamePacketListener
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
 *  net.minecraft.world.entity.EntityDimensions
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.Pose
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.RandomLookAroundGoal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.level.Level
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
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
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class TTTTEEEESSSSTTTTTEntity
extends PathfinderMob {
    private final ServerBossEvent bossInfo = new ServerBossEvent(this.m_5446_(), BossEvent.BossBarColor.PINK, BossEvent.BossBarOverlay.PROGRESS);

    public TTTTEEEESSSSTTTTTEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<TTTTEEEESSSSTTTTTEntity>)((EntityType)UltimateskeletonsModEntities.TTTTEEEESSSSTTTTT.get()), world);
    }

    public TTTTEEEESSSSTTTTTEntity(EntityType<TTTTEEEESSSSTTTTTEntity> type, Level world) {
        super(type, world);
        this.m_274367_(1.2f);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
        this.m_6210_();
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    protected void m_8099_() {
        super.m_8099_();
        this.f_21346_.m_25352_(1, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
        this.f_21345_.m_25352_(2, (Goal)new RandomLookAroundGoal((Mob)this));
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

    public boolean m_5825_() {
        return true;
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

    public EntityDimensions m_6972_(Pose pose) {
        return super.m_6972_(pose).m_20388_(16.0f);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.6);
        builder = builder.m_22268_(Attributes.f_22276_, 1024.0);
        builder = builder.m_22268_(Attributes.f_22284_, 100.0);
        builder = builder.m_22268_(Attributes.f_22281_, 3.0);
        builder = builder.m_22268_(Attributes.f_22277_, 1024.0);
        return builder;
    }
}

