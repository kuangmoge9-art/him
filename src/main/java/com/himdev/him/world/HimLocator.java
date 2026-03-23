package com.himdev.him.world;

import com.himdev.him.util.HimLog;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;

import java.util.UUID;

public final class HimLocator {
    private static final String DATA_NAME = "him_unique_entity";
    private final HimSavedData savedData;

    public HimLocator(HimSavedData savedData) {
        this.savedData = savedData;
    }

    public void clear(UUID himId) {
        savedData.clear(himId);
    }

    public UUID currentHimId() {
        return savedData.currentHimId();
    }

    public boolean tryRegister(UUID himId) {
        return tryRegisterInternal(null, savedData, himId);
    }

    public static boolean tryRegister(ServerLevel level, UUID himId) {
        return tryRegisterInternal(level.getServer(), getData(level), himId);
    }

    public static void clear(ServerLevel level, UUID himId) {
        HimLog.info("him registration_cleared uuid={}", himId);
        getData(level).clear(himId);
    }

    public static UUID currentHimId(ServerLevel level) {
        return getData(level).currentHimId();
    }

    public static boolean hasActiveHim(ServerLevel level) {
        return hasActiveHim(level.getServer(), currentHimId(level));
    }

    private static boolean tryRegisterInternal(MinecraftServer server, HimSavedData data, UUID himId) {
        UUID currentHimId = data.currentHimId();
        if (currentHimId != null && !currentHimId.equals(himId) && server != null && !hasActiveHim(server, currentHimId)) {
            HimLog.info("him stale_registration_cleared stale={} replacement={}", currentHimId, himId);
            data.clear(currentHimId);
        }
        return data.tryRegister(himId);
    }

    private static boolean hasActiveHim(MinecraftServer server, UUID himId) {
        if (server == null || himId == null) {
            return false;
        }

        for (ServerLevel serverLevel : server.getAllLevels()) {
            Entity entity = serverLevel.getEntity(himId);
            if (entity != null && entity.isAlive()) {
                return true;
            }
        }

        return false;
    }

    private static HimSavedData getData(ServerLevel level) {
        ServerLevel dataLevel = level.getServer().overworld();
        return dataLevel.getDataStorage().computeIfAbsent(HimSavedData::load, HimSavedData::new, DATA_NAME);
    }
}
