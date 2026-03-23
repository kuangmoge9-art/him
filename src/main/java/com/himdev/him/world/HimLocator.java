package com.himdev.him.world;

import java.util.UUID;

public final class HimLocator {
    private final HimSavedData savedData;

    public HimLocator(HimSavedData savedData) {
        this.savedData = savedData;
    }

    public boolean tryRegister(UUID himId) {
        return savedData.tryRegister(himId);
    }

    public void clear(UUID himId) {
        savedData.clear(himId);
    }

    public UUID currentHimId() {
        return savedData.currentHimId();
    }
}
