package com.himdev.him.compat.mixin;

import com.himdev.him.entity.HimEntity;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "net.mcreator.ultimateskeletons.Deathlist", remap = false)
abstract class UltimateSkeletonsDeathlistMixin {
    @Inject(method = "killEntity(Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreDeathlistKillsAgainstHim(Entity entity, CallbackInfo callbackInfo) {
        if (entity instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }
}
