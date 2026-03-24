/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerBossEvent
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.tags.TagKey
 *  net.minecraft.world.BossEvent$BossBarColor
 *  net.minecraft.world.BossEvent$BossBarOverlay
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.AreaEffectCloud
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
 *  net.minecraft.world.entity.monster.Slime
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.material.Fluid
 *  net.minecraft.world.level.material.FluidState
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons;

import java.util.HashSet;
import java.util.function.Predicate;
import net.mcreator.ultimateskeletons.AnimatedEntity;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.TitanNearestAttackableTargetGoal;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.TTTTEEEESSSSTTTTTEntity;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.registries.ForgeRegistries;

public class Titangodentity
extends AnimatedEntity {
    private final ServerBossEvent bossInfo = new ServerBossEvent(this.m_5446_(), BossEvent.BossBarColor.BLUE, BossEvent.BossBarOverlay.PROGRESS);
    protected int bannertime = 200;
    protected double HEALTS;
    protected double MAXHEALH;
    protected int damageInvTime = 0;
    protected boolean rotate = true;
    public boolean energy = false;

    protected Titangodentity(EntityType<? extends AnimatedEntity> type, Level world) {
        super(type, world);
        this.f_21364_ = 100000;
        this.m_21557_(false);
        this.m_274367_(0.6f);
        this.m_21530_();
        this.setMax_Health(1024.0);
        this.set_health(this.getMax_Health());
    }

    @Override
    public int getBarWidth() {
        return 256;
    }

    @Override
    public String getBarTexture() {
        return "thetitans:textures/entities/bossbars/zombie_titan/zombie_titan_bar.png";
    }

    public double get_health() {
        return this.HEALTS;
    }

    public double getMax_Health() {
        return this.MAXHEALH;
    }

    public void setMax_Health(double value) {
        this.MAXHEALH = value;
    }

    public void set_health(double value) {
        if (this.damageInvTime <= 0) {
            if (!Double.isNaN(value)) {
                this.HEALTS = Math.min(value, this.MAXHEALH);
            }
            this.damageInvTime = 10;
        }
    }

    public void setHEALTS(double value) {
        this.HEALTS = value;
    }

    public boolean m_204031_(TagKey<Fluid> p_204032_, double p_204033_) {
        return false;
    }

    @Override
    protected void m_8099_() {
        super.m_8099_();
        this.f_21346_.m_25352_(1, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]).m_26044_(new Class[0]));
        this.f_21346_.m_25352_(2, new TitanNearestAttackableTargetGoal<TTTTEEEESSSSTTTTTEntity>((Mob)this, TTTTEEEESSSSTTTTTEntity.class, 5, false, false, Entity::m_6084_));
        this.f_21346_.m_25352_(3, new TitanNearestAttackableTargetGoal<Slime>((Mob)this, Slime.class, 5, false, false, Entity::m_6084_));
    }

    public void updateFluidHeightAndDoFluidPushing(Predicate<FluidState> shouldUpdate) {
    }

    @Override
    public boolean m_6469_(DamageSource source, float amount) {
        Entity entity = source.m_7640_();
        if (entity instanceof Titangodentity) {
            Titangodentity titangodentity = (Titangodentity)entity;
            if (titangodentity.energy) {
                this.m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), 40.0f, 1.0f);
            }
        }
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

    protected void m_6475_(DamageSource p_21240_, float p_21241_) {
        if (p_21240_.m_7640_() instanceof Titangodentity || p_21240_.m_7640_() instanceof Player || p_21240_.m_276093_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage")))) {
            super.m_6475_(p_21240_, p_21241_);
        }
    }

    public float m_21223_() {
        return (float)this.HEALTS;
    }

    public void m_6074_() {
    }

    public void m_142467_(Entity.RemovalReason p_146876_) {
        double x = this.m_20185_();
        double y = this.m_20186_();
        double z = this.m_20189_();
        if (this.get_health() < 1.0) {
            super.m_142467_(p_146876_);
        }
    }

    public void m_142687_(Entity.RemovalReason p_276115_) {
        if (this.get_health() < 1.0) {
            super.m_142687_(p_276115_);
        }
    }

    protected void m_6153_() {
        ++this.f_20919_;
        if (this.f_20919_ >= 20) {
            Level level = this.m_9236_();
            if (level instanceof ServerLevel) {
                ServerLevel serverLevel = (ServerLevel)level;
                for (ServerPlayer serverPlayer : serverLevel.m_8795_(Player2 -> true)) {
                    this.bossInfo.m_6539_(serverPlayer);
                }
            }
            this.m_142467_(Entity.RemovalReason.KILLED);
            this.invalidateCaps();
            this.m_21226_();
        }
    }

    public void m_6075_() {
        this.m_20095_();
        --this.bannertime;
        if (this.damageInvTime > 0) {
            --this.damageInvTime;
        }
        Titangodentity entity = this;
        Level world = entity.m_9236_();
        boolean loop = false;
        double x = entity.m_20185_();
        double y = entity.m_20186_();
        double z = entity.m_20189_();
        if (this.get_health() > 0.0) {
            if (this.rotate && this.m_5448_() != null) {
                this.lookAttackTarget();
            }
        } else {
            this.rotate = false;
        }
        if (this.get_health() >= this.getMax_Health()) {
            this.set_health(this.getMax_Health());
        }
        HashSet set = new HashSet();
        if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue()) {
            boolean bl = Deathlist.disableSpawn = this.bannertime >= 0;
            if (world.f_46443_) {
                if (world instanceof ClientLevel) {
                    ClientLevel clientLevel = (ClientLevel)world;
                    set.addAll(clientLevel.f_104566_);
                    set.addAll(clientLevel.f_171631_.f_157637_.f_156807_.values());
                    set.addAll(clientLevel.f_171631_.f_157637_.f_156808_.values());
                }
            } else if (world instanceof ServerLevel) {
                ServerLevel serverLevel = (ServerLevel)world;
                set.addAll(serverLevel.f_8546_);
                set.addAll(serverLevel.f_143244_.f_157494_.f_156807_.values());
                set.addAll(serverLevel.f_143244_.f_157494_.f_156808_.values());
            }
            for (Entity target : set) {
                if (target == entity || target instanceof Titangodentity || target instanceof Player || target instanceof Slime || target instanceof TTTTEEEESSSSTTTTTEntity || !(target instanceof LivingEntity)) continue;
                Deathlist.killEntity(target);
            }
        }
        super.m_6075_();
        this.m_6210_();
    }
}

