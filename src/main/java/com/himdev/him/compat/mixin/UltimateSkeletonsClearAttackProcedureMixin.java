package com.himdev.him.compat.mixin;

import com.himdev.him.compat.UltimateSkeletonsClearCompat;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "net.mcreator.ultimateskeletons.procedures.ClearATKProcedure", remap = false)
abstract class UltimateSkeletonsClearAttackProcedureMixin {
    @Inject(method = "execute(Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$rewriteClearSwingProcedure(LevelAccessor level, double x, double y, double z, Entity source, CallbackInfo callbackInfo) {
        if (!UltimateSkeletonsClearCompat.hasHimInRange(level, x, y, z, 100000.0D)) {
            return;
        }
        UltimateSkeletonsClearCompat.executeClearSwingExcludingHim(level, x, y, z, source);
        callbackInfo.cancel();
    }
}
