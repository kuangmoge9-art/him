package com.himdev.him.compat.mixin;

import com.himdev.him.compat.MobBottleCompat;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets = "firis.mobbottle.common.item.MobBottleBlockItem", remap = false)
abstract class MobBottleBlockItemCaptureMixin {
    @Inject(
            method = "catchMobBottle(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/InteractionHand;)Z",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    private void him$blockMobBottleCaptureAgainstHim(Player player, Entity entity, InteractionHand hand, CallbackInfoReturnable<Boolean> cir) {
        if (MobBottleCompat.isHimEntity(entity)) {
            cir.setReturnValue(false);
        }
    }
}
