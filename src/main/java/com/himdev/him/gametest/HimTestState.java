package com.himdev.him.gametest;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.entity.HimRemovalAuthorizer;
import com.himdev.him.world.HimExistenceSeal;
import com.himdev.him.world.HimLocator;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

public final class HimTestState {
    private HimTestState() {
    }

    public static void resetUniqueHim(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        List<HimEntity> existingHim = StreamSupport.stream(level.getAllEntities().spliterator(), false)
                .filter(HimEntity.class::isInstance)
                .map(HimEntity.class::cast)
                .toList();

        existingHim.forEach(entity -> {
            HimRemovalAuthorizer.authorize(entity.getUUID());
            entity.remove(Entity.RemovalReason.DISCARDED);
        });

        UUID currentHimId = HimLocator.currentHimId(level);
        if (currentHimId != null) {
            HimLocator.clear(level, currentHimId);
        }

        clearExistenceSeal(helper);
    }

    public static void removeHimForTest(GameTestHelper helper, HimEntity him) {
        HimRemovalAuthorizer.authorize(him.getUUID());
        him.remove(Entity.RemovalReason.DISCARDED);
        UUID currentHimId = HimLocator.currentHimId(helper.getLevel());
        if (currentHimId != null) {
            HimLocator.clear(helper.getLevel(), currentHimId);
        }

        clearExistenceSeal(helper);
    }

    private static void clearExistenceSeal(GameTestHelper helper) {
        MinecraftServer server = helper.getLevel().getServer();
        if (server == null) {
            return;
        }
        HimExistenceSeal.clear(server);
    }
}
