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
        assertTrue(HimRemovalProtection.shouldBlockSetRemoved(false));
        assertFalse(HimRemovalProtection.shouldBlockSetRemoved(true));
        assertTrue(HimRemovalProtection.shouldBlockOnRemovedFromWorld(false));
        assertFalse(HimRemovalProtection.shouldBlockOnRemovedFromWorld(true));
    }

    @Test
    void clientLevelRemovalIsBlockedForDestroyReasonsUnlessAuthorized() {
        assertTrue(HimRemovalProtection.shouldBlockClientLevelRemoval(Entity.RemovalReason.DISCARDED, false));
        assertTrue(HimRemovalProtection.shouldBlockClientLevelRemoval(Entity.RemovalReason.KILLED, false));
        assertFalse(HimRemovalProtection.shouldBlockClientLevelRemoval(Entity.RemovalReason.DISCARDED, true));
    }
}
