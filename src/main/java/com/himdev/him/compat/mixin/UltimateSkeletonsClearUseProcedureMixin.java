package com.himdev.him.compat.mixin;

import com.himdev.him.compat.UltimateSkeletonsClearCompat;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "net.mcreator.ultimateskeletons.procedures.ClearclearProcedure", remap = false)
abstract class UltimateSkeletonsClearUseProcedureMixin {
    @Inject(method = "execute(Lnet/minecraft/world/level/LevelAccessor;DDD)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$rewriteClearUseProcedure(LevelAccessor level, double x, double y, double z, CallbackInfo callbackInfo) {
        if (!UltimateSkeletonsClearCompat.hasHimInRange(level, x, y, z, 250.0D)) {
            return;
        }
        UltimateSkeletonsClearCompat.executeClearUseExcludingHim(level, x, y, z);
        callbackInfo.cancel();
    }
}
