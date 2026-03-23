package com.himdev.him.guardian;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public final class ThreatResolver {
    private ThreatResolver() {
    }

    public static ThreatResolution resolve(DamageSource source) {
        Entity attacker = source.getEntity() != null ? source.getEntity() : source.getDirectEntity();
        if (attacker != null) {
            return directEntity(attacker.getUUID());
        }
        return environmental(source.getMsgId());
    }

    public static ThreatResolution directEntity(UUID attackerId) {
        return ThreatResolution.punish(attackerId, "direct_entity");
    }

    public static ThreatResolution environmental(String sourceName) {
        return ThreatResolution.noPunishment(sourceName);
    }
}
