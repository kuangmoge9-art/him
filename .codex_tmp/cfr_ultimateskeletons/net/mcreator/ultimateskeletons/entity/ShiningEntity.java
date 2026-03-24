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
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Vector3f
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

public class ShiningEntity
extends Entity {
    public static final EntityDataAccessor<Float> DATA_SIZE = SynchedEntityData.m_135353_(ShiningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135029_);
    public static final EntityDataAccessor<Integer> DATA_TIME = SynchedEntityData.m_135353_(ShiningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Integer> DATA_TIMER = SynchedEntityData.m_135353_(ShiningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135028_);
    public static final EntityDataAccessor<Vector3f> DATA_COLOUR = SynchedEntityData.m_135353_(ShiningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_268676_);
    public static final EntityDataAccessor<Boolean> DATA_IS_BILLBOARD = SynchedEntityData.m_135353_(ShiningEntity.class, (EntityDataSerializer)EntityDataSerializers.f_135035_);
    public boolean isMeta = false;

    public ShiningEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
        this.f_19811_ = true;
    }

    public ShiningEntity(PlayMessages.SpawnEntity spawnEntity, Level level) {
        this((EntityType)UltimateskeletonsModEntities.SHINING.get(), level);
    }

    protected void m_8097_() {
        this.f_19804_.m_135372_(DATA_SIZE, (Object)Float.valueOf(100.0f));
        this.f_19804_.m_135372_(DATA_TIME, (Object)100);
        this.f_19804_.m_135372_(DATA_TIMER, (Object)((Integer)this.f_19804_.m_135370_(DATA_TIME)));
        this.f_19804_.m_135372_(DATA_COLOUR, (Object)new Vector3f(-1.0f, -1.0f, -1.0f));
        this.f_19804_.m_135372_(DATA_IS_BILLBOARD, (Object)false);
    }

    protected void m_7378_(@NotNull CompoundTag compoundTag) {
    }

    protected void m_7380_(@NotNull CompoundTag compoundTag) {
    }

    public void m_8119_() {
        super.m_8119_();
        if ((Integer)this.f_19804_.m_135370_(DATA_TIMER) <= 0) {
            this.m_146870_();
        } else {
            this.f_19804_.m_135381_(DATA_TIMER, (Object)((Integer)this.f_19804_.m_135370_(DATA_TIMER) - 1));
        }
        if (this.isMeta && this.f_19797_ % 2 == 0) {
            if (((Vector3f)this.f_19804_.m_135370_(DATA_COLOUR)).equals((Object)new Vector3f(0.0f, 152.0f, 255.0f))) {
                this.f_19804_.m_135381_(DATA_COLOUR, (Object)new Vector3f(243.0f, 1.0f, 255.0f));
            } else {
                this.f_19804_.m_135381_(DATA_COLOUR, (Object)new Vector3f(0.0f, 152.0f, 255.0f));
            }
        }
    }

    public void m_20256_(@NotNull Vec3 deltaMovement) {
    }

    public void m_20334_(double x, double y, double z) {
    }

    public void m_6021_(double x, double y, double z) {
    }

    public boolean m_6000_(double x, double y, double z) {
        return true;
    }
}

