package com.himdev.him.world;

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
        return getData(level).tryRegister(himId);
    }

    public static void clear(ServerLevel level, UUID himId) {
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
