package com.himdev.him.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;

class HimRemovalAuthorizerTest {
    @Test
    void consumeIgnoresNullUuid() {
        boolean consumed = assertDoesNotThrow(() -> HimRemovalAuthorizer.consume(null));

        assertFalse(consumed);
    }

    @Test
    void authorizeIgnoresNullUuid() {
        assertDoesNotThrow(() -> HimRemovalAuthorizer.authorize(null));
    }
}
