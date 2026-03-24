package com.himdev.him.compat;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UltimateSkeletonsCompatMixinConfigTest {
    @Test
    void deathlistInternalProtectionMixinIsRegistered() throws IOException, ClassNotFoundException {
        try (InputStream stream = UltimateSkeletonsCompatMixinConfigTest.class.getClassLoader()
                .getResourceAsStream("him.compat.mixins.json")) {
            assertNotNull(stream, "Expected him.compat.mixins.json on the test classpath");

            String config = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
            assertTrue(config.contains("\"UltimateSkeletonsDeathlistInternalMixin\""),
                    "Expected Deathlist internal protection mixin to be declared in him.compat.mixins.json");
            assertTrue(config.contains("\"ClientLevelHimRemovalMixin\""),
                    "Expected client-level Him removal protection mixin to be declared in him.compat.mixins.json");
        }

        assertNotNull(Class.forName("com.himdev.him.compat.mixin.UltimateSkeletonsDeathlistInternalMixin"),
                "Expected Deathlist internal protection mixin class to exist");
        assertNotNull(Class.forName("com.himdev.him.compat.mixin.ClientLevelHimRemovalMixin"),
                "Expected client-level Him removal protection mixin class to exist");
    }
}
