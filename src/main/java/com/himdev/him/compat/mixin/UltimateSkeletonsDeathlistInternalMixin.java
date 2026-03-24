package com.himdev.him.compat.mixin;

import com.himdev.him.entity.HimEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.entity.PersistentEntitySectionManager;
import net.minecraft.world.level.entity.TransientEntitySectionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "net.mcreator.ultimateskeletons.Deathlist", remap = false)
abstract class UltimateSkeletonsDeathlistInternalMixin {
    @Inject(method = "die(Lnet/minecraft/world/entity/LivingEntity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreInternalDeathAnimation(LivingEntity living, CallbackInfo callbackInfo) {
        if (living instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "completeRemove(Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreInternalRemoval(Entity entity, CallbackInfo callbackInfo) {
        if (entity instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "clientEntityManagerRemove(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/entity/TransientEntitySectionManager;)V",
            at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreClientEntityManagerRemoval(Entity entity, TransientEntitySectionManager<?> manager, CallbackInfo callbackInfo) {
        if (entity instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "serverEntityManagerRemove(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/entity/PersistentEntitySectionManager;)V",
            at = @At("HEAD"), cancellable = true, remap = false)
    private static void him$ignoreServerEntityManagerRemoval(Entity entity, PersistentEntitySectionManager<?> manager, CallbackInfo callbackInfo) {
        if (entity instanceof HimEntity) {
            callbackInfo.cancel();
        }
    }
}
