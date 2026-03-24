package com.himdev.him.world;

import com.himdev.him.guardian.ExternalThreatRetaliator;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.registry.HimEntityTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public final class HimExistenceSeal {
    private static final String DATA_NAME = "him_return_saved_data";
    private static final int AUTHORIZED_RETURN_WINDOW_TICKS = 1;
    private static final Map<MinecraftServer, Integer> AUTHORIZED_RETURN_DEADLINES = new WeakHashMap<>();
    private static final ExternalThreatRetaliator EXTERNAL_THREAT_RETALIATOR = new ExternalThreatRetaliator();

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
        clearAuthorizedReturn(server);
    }

    public static HimReturnSavedData current(MinecraftServer server) {
        Objects.requireNonNull(server, "server");
        HimReturnSavedData data = getData(server);
        return data.isValid() ? data : null;
    }

    public static void ensurePresent(MinecraftServer server) {
        Objects.requireNonNull(server, "server");
        restoreIfMissing(server);
    }

    public static void prepareAuthorizedRemoval(ServerLevel sourceLevel, HimEntity him) {
        Objects.requireNonNull(sourceLevel, "sourceLevel");
        Objects.requireNonNull(him, "him");
        MinecraftServer server = sourceLevel.getServer();
        update(server, sourceLevel.dimension(), him.getX(), him.getY(), him.getZ(), him.getYRot(), him.getXRot());
        markAuthorizedReturn(server);
        server.tell(new TickTask(server.getTickCount() + 1, () -> restoreIfMissing(server)));
    }

    private static void restoreIfMissing(MinecraftServer server) {
        HimReturnSavedData data = current(server);
        if (data == null) {
            return;
        }

        ServerLevel targetLevel = server.getLevel(data.dimension());
        if (targetLevel == null) {
            return;
        }
        if (HimLocator.hasActiveHim(targetLevel)) {
            clearAuthorizedReturn(server);
            return;
        }

        boolean authorizedReturn = consumeAuthorizedReturn(server);
        Vec3 incidentCenter = new Vec3(data.x(), data.y(), data.z());

        HimEntity him = HimEntityTypes.HIM.get().create(targetLevel);
        if (him == null) {
            return;
        }

        applyReturnState(him, data);
        targetLevel.addFreshEntity(him);
        applyReturnState(him, data);
        him.stabilizeAfterReturn();
        if (!authorizedReturn) {
            EXTERNAL_THREAT_RETALIATOR.retaliate(targetLevel, incidentCenter);
        }
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

    private static void markAuthorizedReturn(MinecraftServer server) {
        synchronized (AUTHORIZED_RETURN_DEADLINES) {
            AUTHORIZED_RETURN_DEADLINES.put(server, server.getTickCount() + AUTHORIZED_RETURN_WINDOW_TICKS);
        }
    }

    private static boolean consumeAuthorizedReturn(MinecraftServer server) {
        synchronized (AUTHORIZED_RETURN_DEADLINES) {
            Integer deadline = AUTHORIZED_RETURN_DEADLINES.get(server);
            if (deadline == null) {
                return false;
            }
            if (server.getTickCount() > deadline) {
                AUTHORIZED_RETURN_DEADLINES.remove(server);
                return false;
            }
            AUTHORIZED_RETURN_DEADLINES.remove(server);
            return true;
        }
    }

    private static void clearAuthorizedReturn(MinecraftServer server) {
        synchronized (AUTHORIZED_RETURN_DEADLINES) {
            AUTHORIZED_RETURN_DEADLINES.remove(server);
        }
    }
}
