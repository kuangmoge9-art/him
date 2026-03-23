package com.himdev.him.world;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.registry.HimEntityTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.TickTask;
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

    public static void prepareAuthorizedRemoval(ServerLevel sourceLevel, HimEntity him) {
        Objects.requireNonNull(sourceLevel, "sourceLevel");
        Objects.requireNonNull(him, "him");
        MinecraftServer server = sourceLevel.getServer();
        update(server, sourceLevel.dimension(), him.getX(), him.getY(), him.getZ(), him.getYRot(), him.getXRot());
        server.tell(new TickTask(server.getTickCount() + 1, () -> restoreIfMissing(server)));
    }

    private static void restoreIfMissing(MinecraftServer server) {
        HimReturnSavedData data = current(server);
        if (data == null) {
            return;
        }

        ServerLevel targetLevel = server.getLevel(data.dimension());
        if (targetLevel == null || HimLocator.hasActiveHim(targetLevel)) {
            return;
        }

        HimEntity him = HimEntityTypes.HIM.get().create(targetLevel);
        if (him == null) {
            return;
        }

        applyReturnState(him, data);
        targetLevel.addFreshEntity(him);
        applyReturnState(him, data);
        him.stabilizeAfterReturn();
    }

    private static void applyReturnState(HimEntity him, HimReturnSavedData data) {
        him.moveTo(data.x(), data.y(), data.z(), data.yRot(), data.xRot());
        him.setYRot(data.yRot());
        him.yRotO = data.yRot();
        him.setYHeadRot(data.yRot());
        him.yHeadRotO = data.yRot();
        him.yBodyRot = data.yRot();
        him.yBodyRotO = data.yRot();
        him.setXRot(data.xRot());
        him.xRotO = data.xRot();
    }

    private static HimReturnSavedData getData(MinecraftServer server) {
        ServerLevel overworld = server.overworld();
        return overworld.getDataStorage().computeIfAbsent(HimReturnSavedData::load, HimReturnSavedData::new, DATA_NAME);
    }
}
