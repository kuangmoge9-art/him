package com.himdev.him.world;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HimLocatorTest {
    @Test
    void rejectsSecondUniqueUuidWhenOneAlreadyRegistered() {
        HimSavedData data = new HimSavedData();
        UUID first = UUID.randomUUID();
        UUID second = UUID.randomUUID();

        assertTrue(data.tryRegister(first));
        assertFalse(data.tryRegister(second));
        assertEquals(first, data.currentHimId());
    }

    @Test
    void clearingCurrentUuidAllowsNewRegistration() {
        HimSavedData data = new HimSavedData();
        UUID first = UUID.randomUUID();
        UUID second = UUID.randomUUID();

        assertTrue(data.tryRegister(first));
        data.clear(first);
        assertNull(data.currentHimId());
        assertTrue(data.tryRegister(second));
        assertEquals(second, data.currentHimId());
    }
}
