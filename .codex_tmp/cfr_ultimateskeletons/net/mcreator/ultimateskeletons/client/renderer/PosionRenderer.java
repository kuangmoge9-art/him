/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.math.Axis
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRenderer
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.projectile.DragonFireball
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.entity.PosionEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.DragonFireball;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class PosionRenderer
extends EntityRenderer<PosionEntity> {
    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("textures/item/potion.png");
    private static final RenderType RENDER_TYPE = RenderType.m_110458_((ResourceLocation)TEXTURE_LOCATION);

    public PosionRenderer(EntityRendererProvider.Context p_173962_) {
        super(p_173962_);
    }

    protected int getBlockLightLevel(DragonFireball p_114087_, BlockPos p_114088_) {
        return 15;
    }

    public void render(PosionEntity p_114080_, float p_114081_, float p_114082_, PoseStack p_114083_, MultiBufferSource p_114084_, int p_114085_) {
        p_114083_.m_85836_();
        p_114083_.m_85841_(1.0f, 1.0f, 1.0f);
        p_114083_.m_252781_(this.f_114476_.m_253208_());
        p_114083_.m_252781_(Axis.f_252436_.m_252977_(180.0f));
        PoseStack.Pose $$6 = p_114083_.m_85850_();
        Matrix4f $$7 = $$6.m_252922_();
        Matrix3f $$8 = $$6.m_252943_();
        VertexConsumer $$9 = p_114084_.m_6299_(RENDER_TYPE);
        PosionRenderer.vertex($$9, $$7, $$8, p_114085_, 0.0f, 0, 0, 1);
        PosionRenderer.vertex($$9, $$7, $$8, p_114085_, 1.0f, 0, 1, 1);
        PosionRenderer.vertex($$9, $$7, $$8, p_114085_, 1.0f, 1, 1, 0);
        PosionRenderer.vertex($$9, $$7, $$8, p_114085_, 0.0f, 1, 0, 0);
        p_114083_.m_85849_();
        super.m_7392_((Entity)p_114080_, p_114081_, p_114082_, p_114083_, p_114084_, p_114085_);
    }

    private static void vertex(VertexConsumer p_254095_, Matrix4f p_254477_, Matrix3f p_253948_, int p_253829_, float p_253995_, int p_254031_, int p_253641_, int p_254243_) {
        p_254095_.m_252986_(p_254477_, p_253995_ - 0.5f, (float)p_254031_ - 0.25f, 0.0f).m_6122_(255, 255, 255, 255).m_7421_((float)p_253641_, (float)p_254243_).m_86008_(OverlayTexture.f_118083_).m_85969_(p_253829_).m_252939_(p_253948_, 0.0f, 1.0f, 0.0f).m_5752_();
    }

    public ResourceLocation getTextureLocation(PosionEntity p_114078_) {
        return TEXTURE_LOCATION;
    }
}

