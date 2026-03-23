package com.himdev.him.world;

import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;

import java.util.Objects;

public final class HimExistenceSeal {
    private static final String DATA_NAME = "him_return_saved_data";

    private HimExistenceSeal() {
    }

    public static void update(MinecraftServer server, ResourceKey<Level> dimension, double x, double y, double z, float yRot, float xRot) {
        Objects.requireNonNull(server, "server");
        Objects.requireNonNull(dimension, "dimension");
        getData(server).update(dimension, x, y, z, yRot, xRot);
    }

    public static void clear(MinecraftServer server) {
        Objects.requireNonNull(server, "server");
        getData(server).clear();
    }

    public static HimReturnSavedData current(MinecraftServer server) {
        Objects.requireNonNull(server, "server");
        HimReturnSavedData data = getData(server);
        return data.isValid() ? data : null;
    }

    private static HimReturnSavedData getData(MinecraftServer server) {
        ServerLevel overworld = server.overworld();
        return overworld.getDataStorage().computeIfAbsent(HimReturnSavedData::load, HimReturnSavedData::new, DATA_NAME);
    }
}
