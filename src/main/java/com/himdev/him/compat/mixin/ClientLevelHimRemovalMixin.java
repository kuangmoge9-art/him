package com.himdev.him.compat.mixin;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.entity.HimRemovalProtection;
import com.himdev.him.util.HimLog;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientLevel.class)
abstract class ClientLevelHimRemovalMixin {
    @Shadow
    public abstract Entity getEntity(int entityId);

    @Inject(method = "removeEntity(ILnet/minecraft/world/entity/Entity$RemovalReason;)V", at = @At("HEAD"), cancellable = true)
    private void him$blockClientLevelRemoval(int entityId, Entity.RemovalReason reason, CallbackInfo callbackInfo) {
        Entity entity = getEntity(entityId);
        if (!(entity instanceof HimEntity him) || !HimRemovalProtection.shouldBlockClientLevelRemoval(reason, him.isRemovalAuthorizedInProgress())) {
            return;
        }
        HimLog.info("him client_level_removal_blocked uuid={} entityId={} reason={}", him.getUUID(), entityId, reason);
        callbackInfo.cancel();
    }
}
