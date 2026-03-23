package com.himdev.him.guardian;

import java.util.UUID;

public record ThreatResolution(boolean shouldPunish, UUID targetEntityId, String reason) {
    public static ThreatResolution punish(UUID targetEntityId, String reason) {
        return new ThreatResolution(true, targetEntityId, reason);
    }

    public static ThreatResolution noPunishment(String reason) {
        return new ThreatResolution(false, null, reason);
    }
}
