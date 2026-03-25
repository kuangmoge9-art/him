package com.himdev.him.compat.mixin;

import com.himdev.him.compat.MobBottleCompat;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets = "firis.mobbottle.common.item.MobBottleBlockItem", remap = false)
abstract class MobBottleBlockItemUseOnMixin {
    @Inject(
            method = {
                    "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;",
                    "m_6225_(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;"
            },
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    private void him$purifyFilledMobBottleBeforeUseOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> cir) {
        ItemStack stack = context.getItemInHand();
        if (!MobBottleCompat.isFilledWithHim(stack)) {
            return;
        }
        MobBottleCompat.purifyFilledBottle(context.getPlayer(), context.getHand(), stack);
        cir.setReturnValue(InteractionResult.SUCCESS);
    }
}
