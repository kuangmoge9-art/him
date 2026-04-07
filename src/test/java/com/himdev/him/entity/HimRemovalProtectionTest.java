package com.himdev.him.entity;

import net.minecraft.world.entity.Entity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HimRemovalProtectionTest {
    @Test
    void destroyRemovalIsBlockedOnServerWhenUnauthorized() {
        assertTrue(HimRemovalProtection.shouldBlockDestroyRemoval(false, false));
    }

    @Test
    void destroyRemovalIsBlockedOnClientWhenUnauthorized() {
        assertTrue(HimRemovalProtection.shouldBlockDestroyRemoval(true, false));
    }

    @Test
    void destroyRemovalIsAllowedWhenAuthorized() {
        assertFalse(HimRemovalProtection.shouldBlockDestroyRemoval(false, true));
        assertFalse(HimRemovalProtection.shouldBlockDestroyRemoval(true, true));
    }

    @Test
    void setRemovedAndWorldRemovalAreBlockedUnlessAuthorized() {
        assertTrue(HimRemovalProtection.shouldBlockSetRemoved(Entity.RemovalReason.DISCARDED, false));
        assertFalse(HimRemovalProtection.shouldBlockSetRemoved(Entity.RemovalReason.DISCARDED, true));
        assertFalse(HimRemovalProtection.shouldBlockSetRemoved(Entity.RemovalReason.UNLOADED_TO_CHUNK, false));
        assertTrue(HimRemovalProtection.shouldBlockOnRemovedFromWorld(Entity.RemovalReason.DISCARDED, false));
        assertFalse(HimRemovalProtection.shouldBlockOnRemovedFromWorld(Entity.RemovalReason.DISCARDED, true));
        assertFalse(HimRemovalProtection.shouldBlockOnRemovedFromWorld(Entity.RemovalReason.UNLOADED_TO_CHUNK, false));
    }

    @Test
    void clientLevelRemovalIsBlockedForDestroyReasonsUnlessAuthorized() {
        assertTrue(HimRemovalProtection.shouldBlockClientLevelRemoval(Entity.RemovalReason.DISCARDED, false));
        assertTrue(HimRemovalProtection.shouldBlockClientLevelRemoval(Entity.RemovalReason.KILLED, false));
        assertFalse(HimRemovalProtection.shouldBlockClientLevelRemoval(Entity.RemovalReason.DISCARDED, true));
    }
}
