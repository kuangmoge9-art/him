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
    void destroyRemovalIsAllowedOnClientWhenUnauthorized() {
        assertFalse(HimRemovalProtection.shouldBlockDestroyRemoval(true, false));
    }

    @Test
    void destroyRemovalIsAllowedWhenAuthorized() {
        assertFalse(HimRemovalProtection.shouldBlockDestroyRemoval(false, true));
        assertFalse(HimRemovalProtection.shouldBlockDestroyRemoval(true, true));
    }

    @Test
    void serverSetRemovedAndWorldRemovalAreBlockedUnlessAuthorized() {
        assertTrue(HimRemovalProtection.shouldBlockSetRemoved(false, Entity.RemovalReason.DISCARDED, false));
        assertFalse(HimRemovalProtection.shouldBlockSetRemoved(false, Entity.RemovalReason.DISCARDED, true));
        assertFalse(HimRemovalProtection.shouldBlockSetRemoved(false, Entity.RemovalReason.UNLOADED_TO_CHUNK, false));
        assertTrue(HimRemovalProtection.shouldBlockOnRemovedFromWorld(false, Entity.RemovalReason.DISCARDED, false));
        assertFalse(HimRemovalProtection.shouldBlockOnRemovedFromWorld(false, Entity.RemovalReason.DISCARDED, true));
        assertFalse(HimRemovalProtection.shouldBlockOnRemovedFromWorld(false, Entity.RemovalReason.UNLOADED_TO_CHUNK, false));
    }

    @Test
    void clientSetRemovedAndWorldRemovalStayAllowed() {
        assertFalse(HimRemovalProtection.shouldBlockSetRemoved(true, Entity.RemovalReason.DISCARDED, false));
        assertFalse(HimRemovalProtection.shouldBlockSetRemoved(true, Entity.RemovalReason.KILLED, false));
        assertFalse(HimRemovalProtection.shouldBlockOnRemovedFromWorld(true, Entity.RemovalReason.DISCARDED, false));
        assertFalse(HimRemovalProtection.shouldBlockOnRemovedFromWorld(true, Entity.RemovalReason.KILLED, false));
    }
}
