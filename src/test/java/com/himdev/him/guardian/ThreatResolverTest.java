package com.himdev.him.guardian;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreatResolverTest {
    @Test
    void returnsEntityThreatForDirectAttacker() {
        UUID attackerId = UUID.randomUUID();

        ThreatResolution resolution = ThreatResolver.directEntity(attackerId);

        assertTrue(resolution.shouldPunish());
        assertEquals(attackerId, resolution.targetEntityId());
        assertEquals("direct_entity", resolution.reason());
    }

    @Test
    void returnsNoPunishmentForEnvironmentalDamage() {
        ThreatResolution resolution = ThreatResolver.environmental("lava");

        assertFalse(resolution.shouldPunish());
        assertEquals("lava", resolution.reason());
    }
}
