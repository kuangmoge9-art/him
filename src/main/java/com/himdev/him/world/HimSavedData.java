package com.himdev.him.world;

import java.util.Objects;
import java.util.UUID;

public final class HimSavedData {
    private UUID currentHimId;

    public boolean tryRegister(UUID himId) {
        Objects.requireNonNull(himId, "himId");
        if (currentHimId == null || currentHimId.equals(himId)) {
            currentHimId = himId;
            return true;
        }
        return false;
    }

    public void clear(UUID himId) {
        if (currentHimId != null && currentHimId.equals(himId)) {
            currentHimId = null;
        }
    }

    public UUID currentHimId() {
        return currentHimId;
    }
}
