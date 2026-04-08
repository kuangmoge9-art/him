package com.himdev.him.entity;

import net.minecraft.world.entity.Entity;

public final class HimRemovalProtection {
    private HimRemovalProtection() {
    }

    public static boolean shouldBlockDestroyRemoval(boolean clientSide, boolean authorized) {
        return !clientSide && !authorized;
    }

    public static boolean shouldBlockSetRemoved(boolean clientSide, Entity.RemovalReason reason, boolean removalAuthorizedInProgress) {
        return !clientSide && reason != null && reason.shouldDestroy() && !removalAuthorizedInProgress;
    }

    public static boolean shouldBlockOnRemovedFromWorld(boolean clientSide, Entity.RemovalReason reason, boolean removalAuthorizedInProgress) {
        return !clientSide && reason != null && reason.shouldDestroy() && !removalAuthorizedInProgress;
    }
}
