package com.himdev.him.entity;

import net.minecraft.world.entity.Entity;

public final class HimRemovalProtection {
    private HimRemovalProtection() {
    }

    public static boolean shouldBlockDestroyRemoval(boolean clientSide, boolean authorized) {
        return !authorized;
    }

    public static boolean shouldBlockSetRemoved(Entity.RemovalReason reason, boolean removalAuthorizedInProgress) {
        return reason != null && reason.shouldDestroy() && !removalAuthorizedInProgress;
    }

    public static boolean shouldBlockOnRemovedFromWorld(Entity.RemovalReason reason, boolean removalAuthorizedInProgress) {
        return reason != null && reason.shouldDestroy() && !removalAuthorizedInProgress;
    }

    public static boolean shouldBlockClientLevelRemoval(Entity.RemovalReason reason, boolean authorized) {
        return !authorized && reason.shouldDestroy();
    }
}
