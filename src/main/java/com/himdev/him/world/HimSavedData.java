package com.himdev.him.world;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.Objects;
import java.util.UUID;

public final class HimSavedData extends SavedData {
    private static final String CURRENT_HIM_ID_KEY = "currentHimId";
    private static final String FIRST_JOIN_SPAWN_TRIGGERED_KEY = "firstJoinSpawnTriggered";
    private UUID currentHimId;
    private boolean firstJoinSpawnTriggered;

    public static HimSavedData load(CompoundTag tag) {
        HimSavedData data = new HimSavedData();
        if (tag.hasUUID(CURRENT_HIM_ID_KEY)) {
            data.currentHimId = tag.getUUID(CURRENT_HIM_ID_KEY);
        }
        data.firstJoinSpawnTriggered = tag.getBoolean(FIRST_JOIN_SPAWN_TRIGGERED_KEY);
        return data;
    }

    public boolean tryRegister(UUID himId) {
        Objects.requireNonNull(himId, "himId");
        if (currentHimId == null || currentHimId.equals(himId)) {
            currentHimId = himId;
            setDirty();
            return true;
        }
        return false;
    }

    public void clear(UUID himId) {
        if (currentHimId != null && currentHimId.equals(himId)) {
            currentHimId = null;
            setDirty();
        }
    }

    public UUID currentHimId() {
        return currentHimId;
    }

    public boolean tryMarkFirstJoinSpawnTriggered() {
        if (firstJoinSpawnTriggered) {
            return false;
        }
        firstJoinSpawnTriggered = true;
        setDirty();
        return true;
    }

    public boolean isFirstJoinSpawnTriggered() {
        return firstJoinSpawnTriggered;
    }

    public void clearFirstJoinSpawnTriggered() {
        if (!firstJoinSpawnTriggered) {
            return;
        }
        firstJoinSpawnTriggered = false;
        setDirty();
    }

    @Override
    public CompoundTag save(CompoundTag tag) {
        if (currentHimId != null) {
            tag.putUUID(CURRENT_HIM_ID_KEY, currentHimId);
        }
        tag.putBoolean(FIRST_JOIN_SPAWN_TRIGGERED_KEY, firstJoinSpawnTriggered);
        return tag;
    }
}
