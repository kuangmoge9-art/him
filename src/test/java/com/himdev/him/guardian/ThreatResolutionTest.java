package com.himdev.him.guardian;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreatResolutionTest {
    @Test
    void punishmentResolutionKeepsTargetAndReason() {
        UUID targetId = UUID.randomUUID();

        ThreatResolution resolution = ThreatResolution.punish(targetId, "projectile_owner");

        assertTrue(resolution.shouldPunish());
        assertEquals(targetId, resolution.targetEntityId());
        assertEquals("projectile_owner", resolution.reason());
    }

    @Test
    void noPunishmentResolutionKeepsReasonWithoutTarget() {
        ThreatResolution resolution = ThreatResolution.noPunishment("fall");

        assertFalse(resolution.shouldPunish());
        assertNull(resolution.targetEntityId());
        assertEquals("fall", resolution.reason());
    }
}
