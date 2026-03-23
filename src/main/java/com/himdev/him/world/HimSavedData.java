package com.himdev.him.world;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.Objects;
import java.util.UUID;

public final class HimSavedData extends SavedData {
    private static final String CURRENT_HIM_ID_KEY = "currentHimId";
    private UUID currentHimId;

    public static HimSavedData load(CompoundTag tag) {
        HimSavedData data = new HimSavedData();
        if (tag.hasUUID(CURRENT_HIM_ID_KEY)) {
            data.currentHimId = tag.getUUID(CURRENT_HIM_ID_KEY);
        }
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

    @Override
    public CompoundTag save(CompoundTag tag) {
        if (currentHimId != null) {
            tag.putUUID(CURRENT_HIM_ID_KEY, currentHimId);
        }
        return tag;
    }
}
