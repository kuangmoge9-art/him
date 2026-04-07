package com.himdev.him.item;

import com.himdev.him.client.GuardianPhoneClient;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

import javax.annotation.Nullable;
import java.awt.Color;
import java.util.List;

public final class GuardianPhoneItem extends Item {
    public GuardianPhoneItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (level.isClientSide()) {
            DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> GuardianPhoneClient::openPhoneScreen);
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable(this.getDescriptionId(stack))
                .withStyle(style -> style.withBold(true).withColor(TextColor.fromRgb(animatedDisplayColor(0.0F))));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(
                Component.translatable("item.him.guardian_phone.tooltip.use")
                        .withStyle(style -> style.withColor(TextColor.fromRgb(animatedDisplayColor(0.10F))))
        );
        tooltip.add(
                Component.translatable("item.him.guardian_phone.tooltip.gui")
                        .withStyle(style -> style.withColor(TextColor.fromRgb(animatedDisplayColor(0.22F))))
        );
    }

    private static int animatedDisplayColor(float hueOffset) {
        float cycle = (Util.getMillis() % 3600L) / 3600.0F;
        return Color.HSBtoRGB(wrapHue(cycle + hueOffset), 0.72F, 1.00F) & 0x00FFFFFF;
    }

    private static float wrapHue(float hue) {
        float wrapped = hue % 1.0F;
        return wrapped < 0.0F ? wrapped + 1.0F : wrapped;
    }
}
