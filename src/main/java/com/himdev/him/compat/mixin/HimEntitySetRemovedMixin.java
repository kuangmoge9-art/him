package com.himdev.him.compat.mixin;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.entity.HimRemovalProtection;
import com.himdev.him.util.HimLog;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
abstract class HimEntitySetRemovedMixin {
    @Inject(method = "setRemoved(Lnet/minecraft/world/entity/Entity$RemovalReason;)V", at = @At("HEAD"), cancellable = true)
    private void him$blockUnauthorizedSetRemoved(Entity.RemovalReason reason, CallbackInfo callbackInfo) {
        Object self = this;
        if (!(self instanceof HimEntity him) || !HimRemovalProtection.shouldBlockSetRemoved(him.isRemovalAuthorizedInProgress())) {
            return;
        }
        HimLog.info("him set_removed_blocked uuid={} reason={} client={}", him.getUUID(), reason, him.level().isClientSide);
        callbackInfo.cancel();
    }
}
