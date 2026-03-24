package com.himdev.him.compat.mixin;

import com.himdev.him.entity.HimEntity;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "net.mcreator.ultimateskeletons.procedures.LoadquitProcedure", remap = false)
abstract class UltimateSkeletonsLoadquitProcedureMixin {
    @Inject(method = "onEntityJoin(Lnet/minecraftforge/event/entity/EntityJoinLevelEvent;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreLoadquitJoinCancellation(EntityJoinLevelEvent event, CallbackInfo callbackInfo) {
        if (event.getEntity() instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }
}
