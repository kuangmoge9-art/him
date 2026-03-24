/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.level.Level
 */
package net.mcreator.ultimateskeletons;

import net.mcreator.ultimateskeletons.AnimatedEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class Deathgodentity
extends AnimatedEntity {
    protected double HEALTS;
    protected double MAXHEALH;
    protected int damageInvTime = 0;

    protected Deathgodentity(EntityType<? extends AnimatedEntity> type, Level world) {
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
        this.HEALTS = value;
    }

    public void m_21153_(float h) {
        if (this.damageInvTime <= 0) {
            if (!Float.isNaN(h)) {
                this.HEALTS = Math.min((double)h, this.MAXHEALH);
            }
            this.damageInvTime = 20;
        }
    }

    public float m_21223_() {
        return (float)this.HEALTS;
    }

    public void m_6074_() {
    }

    public void m_142687_(Entity.RemovalReason p_276115_) {
    }

    public void m_6075_() {
        if (this.damageInvTime > 0) {
            --this.damageInvTime;
        }
        Deathgodentity entity = this;
        Level world = entity.m_9236_();
        boolean loop = false;
        double x = entity.m_20185_();
        double y = entity.m_20186_();
        double z = entity.m_20189_();
        if (this.get_health() < this.getMax_Health() && this.get_health() >= 1.0) {
            this.set_health(this.get_health() + 2000.0);
        }
        super.m_6075_();
        this.m_6210_();
    }
}

