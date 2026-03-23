package com.himdev.him;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HimModBootstrapTest {
    @Test
    void modIdRemainsStable() {
        assertEquals("him", HimMod.MOD_ID);
    }
}
