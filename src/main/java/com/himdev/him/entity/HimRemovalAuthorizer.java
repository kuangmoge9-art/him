package com.himdev.him.entity;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class HimRemovalAuthorizer {
    private static final Set<UUID> AUTHORIZED = ConcurrentHashMap.newKeySet();

    private HimRemovalAuthorizer() {
    }

    public static void authorize(UUID himId) {
        AUTHORIZED.add(himId);
    }

    public static boolean consume(UUID himId) {
        return AUTHORIZED.remove(himId);
    }
}
