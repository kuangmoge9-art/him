package com.himdev.him.guardian;

import java.util.UUID;

public final class ThreatResolver {
    private ThreatResolver() {
    }

    public static ThreatResolution directEntity(UUID attackerId) {
        return ThreatResolution.punish(attackerId, "direct_entity");
    }

    public static ThreatResolution environmental(String sourceName) {
        return ThreatResolution.noPunishment(sourceName);
    }
}
