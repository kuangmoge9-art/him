/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvents
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  org.jetbrains.annotations.NotNull
 */
package net.mcreator.ultimateskeletons.entity;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;

public class GreenlightningEntity
extends LightningBolt {
    private int life;
    public long seed;
    public int flashes;
    private boolean visualOnly;
    @Nullable
    private ServerPlayer cause;
    private final Set<Entity> hitEntities = Sets.newHashSet();

    public GreenlightningEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<GreenlightningEntity>)((EntityType)UltimateskeletonsModEntities.GREENLIGHTNING.get()), world);
    }

    public void m_8119_() {
        if (this.life == 4 && this.m_9236_().m_5776_()) {
            this.m_9236_().m_7785_(this.m_20185_(), this.m_20186_(), this.m_20189_(), SoundEvents.f_12090_, SoundSource.WEATHER, 10000.0f, 0.8f + this.f_19796_.m_188501_() * 0.2f, false);
            this.m_9236_().m_7785_(this.m_20185_(), this.m_20186_(), this.m_20189_(), SoundEvents.f_12089_, SoundSource.WEATHER, 2.0f, 0.5f + this.f_19796_.m_188501_() * 0.2f, false);
        }
        --this.life;
        if (this.life < 0) {
            if (this.flashes == 0) {
                this.m_146870_();
            } else {
                --this.flashes;
                this.seed = this.f_19796_.m_188505_();
            }
        }
        if (this.life >= 0) {
            if (!(this.m_9236_() instanceof ServerLevel)) {
                this.m_9236_().m_6580_(8);
            } else if (!this.visualOnly) {
                List list1 = this.m_9236_().m_6249_((Entity)this, new AABB(this.m_20185_() - 3.0, this.m_20186_() - 3.0, this.m_20189_() - 3.0, this.m_20185_() + 3.0, this.m_20186_() + 6.0 + 3.0, this.m_20189_() + 3.0), Entity::m_6084_);
                Iterator iterator = list1.iterator();
            }
        }
    }

    @NotNull
    public SoundSource m_5720_() {
        return SoundSource.WEATHER;
    }

    public GreenlightningEntity(EntityType<GreenlightningEntity> type, Level world) {
        super(type, world);
        this.f_19811_ = true;
        this.life = 4;
        this.flashes = 30;
        this.seed = this.f_19796_.m_188505_();
    }
}

