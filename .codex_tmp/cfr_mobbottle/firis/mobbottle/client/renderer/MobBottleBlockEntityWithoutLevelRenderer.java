/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  javax.annotation.Nonnull
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.item.ItemDisplayContext
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.entity.BlockEntity
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package firis.mobbottle.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import firis.mobbottle.MobBottle;
import firis.mobbottle.common.blockentity.MobBottleBlockEntity;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(value=Dist.CLIENT)
public class MobBottleBlockEntityWithoutLevelRenderer
extends BlockEntityWithoutLevelRenderer {
    protected MobBottleBlockEntity blockEntity = null;

    public MobBottleBlockEntityWithoutLevelRenderer() {
        super(Minecraft.m_91087_().m_167982_(), Minecraft.m_91087_().m_167973_());
    }

    public void m_108829_(@Nonnull ItemStack stack, ItemDisplayContext itemDisplayContext, @Nonnull PoseStack poseStack, @Nonnull MultiBufferSource buffer, int x, int y) {
        if (this.blockEntity == null) {
            this.blockEntity = new MobBottleBlockEntity(BlockPos.f_121853_, ((Block)MobBottle.FirisBlocks.MOB_BOTTLE.get()).m_49966_());
        }
        this.blockEntity.setMobBottleDataFromBEWLR(stack);
        Minecraft.m_91087_().m_167982_().m_112272_((BlockEntity)this.blockEntity, poseStack, buffer, x, y);
    }
}

