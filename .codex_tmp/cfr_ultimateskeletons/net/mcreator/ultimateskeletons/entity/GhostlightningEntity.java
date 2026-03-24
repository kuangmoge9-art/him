/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.network.syncher.EntityDataAccessor
 *  net.minecraft.network.syncher.EntityDataSerializer
 *  net.minecraft.network.syncher.EntityDataSerializers
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.level.Level
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Vector3f
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.MathUtils;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

public class GhostlightningEntity
extends Entity {
    public static final EntityDataAccessor<Vector3f> colour = SynchedEntityData.m_135353_(GhostlightningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_268676_);
    public long seed;
    public int lifeTime;
    public static final EntityDataAccessor<Vector3f> rotation = SynchedEntityData.m_135353_(GhostlightningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_268676_);
    public static final EntityDataAccessor<Float> size = SynchedEntityData.m_135353_(GhostlightningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135029_);
    public static final EntityDataAccessor<Boolean> isFromSky = SynchedEntityData.m_135353_(GhostlightningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);

    public GhostlightningEntity(EntityType<? extends Entity> entityType, Level level) {
        super(entityType, level);
        this.setColour(0.0f, 150.0f, 255.0f);
        this.seed = this.f_19796_.m_188505_();
        this.lifeTime = MathUtils.randInt(5, 15);
        this.f_19811_ = true;
    }

    public GhostlightningEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<? extends Entity>)((EntityType)UltimateskeletonsModEntities.GHOSTLIGHTNING.get()), world);
    }

    public void setColour(float red, float green, float blue) {
        this.f_19804_.m_135381_(colour, (Object)new Vector3f(red / 255.0f, green / 255.0f, blue / 255.0f));
    }

    public Vector3f getColour() {
        return (Vector3f)this.f_19804_.m_135370_(colour);
    }

    protected void m_8097_() {
        this.f_19804_.m_135372_(colour, (Object)new Vector3f(1.0f, 1.0f, 1.0f));
        this.f_19804_.m_135372_(rotation, (Object)new Vector3f(0.0f, 0.0f, 0.0f));
        this.f_19804_.m_135372_(size, (Object)Float.valueOf(1.0f));
        this.f_19804_.m_135372_(isFromSky, (Object)true);
    }

    protected void m_7378_(@NotNull CompoundTag compoundTag) {
    }

    protected void m_7380_(@NotNull CompoundTag compoundTag) {
    }

    public void m_8119_() {
        super.m_8119_();
        if (this.f_19797_ >= this.lifeTime + 1) {
            this.m_146870_();
        }
    }

    public boolean m_6000_(double p_20296_, double p_20297_, double p_20298_) {
        return true;
    }
}

