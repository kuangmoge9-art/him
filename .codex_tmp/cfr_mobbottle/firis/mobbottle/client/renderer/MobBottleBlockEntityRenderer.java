/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.blockentity.BlockEntityRenderer
 *  net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider$Context
 *  net.minecraft.core.Direction
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraftforge.client.model.data.ModelData
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
package firis.mobbottle.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import firis.mobbottle.common.blockentity.MobBottleBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.data.ModelData;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

public class MobBottleBlockEntityRenderer
implements BlockEntityRenderer<MobBottleBlockEntity> {
    protected BlockEntityRendererProvider.Context context;

    public MobBottleBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.context = context;
    }

    public void render(MobBottleBlockEntity blockEntity, float p_112308_, PoseStack poseStack, MultiBufferSource p_112310_, int p_112311_, int p_112312_) {
        Entity entity = blockEntity.getRenderEntity();
        Direction direction = blockEntity.getRenderDirection();
        if (entity != null) {
            poseStack.m_85836_();
            float sclae = blockEntity.getRenderScale();
            float positionY = blockEntity.getRenderPositionY();
            poseStack.m_85837_(0.5, (double)positionY, 0.5);
            poseStack.m_85841_(sclae, sclae, sclae);
            Quaternionf quaternion = direction.m_253075_();
            quaternion.mul((Quaternionfc)new Quaternionf().fromAxisAngleDeg(1.0f, 0.0f, 0.0f, -90.0f));
            quaternion.mul((Quaternionfc)new Quaternionf().fromAxisAngleDeg(0.0f, 1.0f, 0.0f, 180.0f));
            poseStack.m_252781_(quaternion);
            Minecraft.m_91087_().m_91290_().m_114384_(entity, 0.0, 0.0, 0.0, 0.0f, 0.0f, poseStack, p_112310_, p_112311_);
            poseStack.m_85849_();
        }
        poseStack.m_85836_();
        BlockState state = blockEntity.getRenderBlockState();
        Minecraft.m_91087_().m_91289_().renderSingleBlock(state, poseStack, p_112310_, p_112311_, p_112312_, ModelData.EMPTY, null);
        poseStack.m_85849_();
    }
}

