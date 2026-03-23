package com.himdev.him.world;

import com.himdev.him.util.HimLog;
import net.minecraft.server.level.ServerLevel;

import java.util.UUID;

public final class HimLocator {
    private static final String DATA_NAME = "him_unique_entity";
    private final HimSavedData savedData;

    public HimLocator(HimSavedData savedData) {
        this.savedData = savedData;
    }

    public boolean tryRegister(UUID himId) {
        return savedData.tryRegister(himId);
    }

    public void clear(UUID himId) {
        savedData.clear(himId);
    }

    public UUID currentHimId() {
        return savedData.currentHimId();
    }

    public static boolean tryRegister(ServerLevel level, UUID himId) {
        HimSavedData data = getData(level);
        UUID currentHimId = data.currentHimId();
        if (currentHimId != null && !currentHimId.equals(himId) && level.getEntity(currentHimId) == null) {
            HimLog.info("him stale_registration_cleared stale={} replacement={}", currentHimId, himId);
            data.clear(currentHimId);
        }
        return data.tryRegister(himId);
    }

    public static void clear(ServerLevel level, UUID himId) {
        HimLog.info("him registration_cleared uuid={}", himId);
        getData(level).clear(himId);
    }

    public static UUID currentHimId(ServerLevel level) {
        return getData(level).currentHimId();
    }

    private static HimSavedData getData(ServerLevel level) {
        ServerLevel dataLevel = level.getServer().overworld();
        return dataLevel.getDataStorage().computeIfAbsent(HimSavedData::load, HimSavedData::new, DATA_NAME);
    }
}
