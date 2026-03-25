package com.himdev.him.world;

import net.minecraft.nbt.CompoundTag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstJoinHimSpawnStateTest {
    @Test
    void marksFirstJoinSpawnAsTriggeredOnlyOnce() {
        HimSavedData data = new HimSavedData();

        assertTrue(data.tryMarkFirstJoinSpawnTriggered());
        assertFalse(data.tryMarkFirstJoinSpawnTriggered());
    }

    @Test
    void persistsFirstJoinSpawnTriggeredFlag() {
        HimSavedData original = new HimSavedData();
        original.tryMarkFirstJoinSpawnTriggered();

        CompoundTag saved = original.save(new CompoundTag());
        HimSavedData loaded = HimSavedData.load(saved);

        assertTrue(loaded.isFirstJoinSpawnTriggered());
    }
}
