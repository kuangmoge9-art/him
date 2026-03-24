/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.server.level.ServerBossEvent
 *  net.minecraft.world.BossEvent$BossBarColor
 *  net.minecraft.world.BossEvent$BossBarOverlay
 *  net.minecraft.world.entity.LivingEntity
 */
package net.mcreator.ultimateskeletons;

import java.util.UUID;
import net.mcreator.ultimateskeletons.mixins.BossEventAccessorMixin;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.LivingEntity;

public class UUIDServerBossEvent
extends ServerBossEvent {
    public LivingEntity boss;
    public UUID bossId;

    public UUIDServerBossEvent(Component p_8300_, BossEvent.BossBarColor p_8301_, BossEvent.BossBarOverlay p_8302_, UUID uuid) {
        super(p_8300_, p_8301_, p_8302_);
        this.setBossId(uuid);
    }

    public UUIDServerBossEvent setBoss(LivingEntity boss) {
        this.boss = boss;
        return this;
    }

    public UUIDServerBossEvent setBossId(UUID bossId) {
        this.bossId = bossId;
        ((BossEventAccessorMixin)((Object)this)).setUUID(bossId);
        return this;
    }
}

