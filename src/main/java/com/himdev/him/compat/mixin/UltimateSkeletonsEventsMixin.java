package com.himdev.him.compat.mixin;

import com.himdev.him.entity.HimEntity;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "net.mcreator.ultimateskeletons.Events", remap = false)
abstract class UltimateSkeletonsEventsMixin {
    @Inject(method = "onEntityJoinLevel(Lnet/minecraftforge/event/entity/EntityJoinLevelEvent;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreDisableSpawnJoinHook(EntityJoinLevelEvent event, CallbackInfo callbackInfo) {
        if (event.getEntity() instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "onLivingEntityTick(Lnet/minecraftforge/event/entity/living/LivingEvent$LivingTickEvent;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreDisableSpawnLivingTickHook(LivingEvent.LivingTickEvent event, CallbackInfo callbackInfo) {
        if (event.getEntity() instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }
}
