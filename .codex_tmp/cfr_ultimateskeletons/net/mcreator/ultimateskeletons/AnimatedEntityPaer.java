/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientGamePacketListener
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityDimensions
 *  net.minecraft.world.entity.Pose
 *  net.minecraft.world.item.ItemStack
 *  net.minecraftforge.entity.PartEntity
 */
package net.mcreator.ultimateskeletons;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.AnimatedEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.entity.PartEntity;

public class AnimatedEntityPaer
extends PartEntity<AnimatedEntity> {
    public final AnimatedEntity parentMob;
    public final String name;
    private final EntityDimensions size;

    public AnimatedEntityPaer(AnimatedEntity parent, String partName, float width, float height) {
        super((Entity)parent);
        this.size = EntityDimensions.m_20395_((float)width, (float)height);
        this.m_6210_();
        this.parentMob = parent;
        this.name = partName;
    }

    protected void m_19915_(float yaw, float pitch) {
        this.m_146922_(this.parentMob.m_146908_() % 360.0f);
        this.m_146926_(this.parentMob.m_146909_() % 360.0f);
    }

    protected void m_8097_() {
    }

    protected void m_7378_(CompoundTag p_31025_) {
    }

    protected void m_7380_(CompoundTag p_31028_) {
    }

    public boolean m_6087_() {
        return true;
    }

    @Nullable
    public ItemStack m_142340_() {
        return this.parentMob.m_142340_();
    }

    public boolean m_6469_(DamageSource p_31020_, float p_31021_) {
        return this.m_6673_(p_31020_) ? false : this.parentMob.m_6469_(p_31020_, p_31021_);
    }

    public boolean m_7306_(Entity p_31031_) {
        return this == p_31031_ || this.parentMob == p_31031_;
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        throw new UnsupportedOperationException();
    }

    public EntityDimensions m_6972_(Pose p_31023_) {
        return this.size.m_20388_(1.0f);
    }

    public boolean m_142391_() {
        return false;
    }
}

