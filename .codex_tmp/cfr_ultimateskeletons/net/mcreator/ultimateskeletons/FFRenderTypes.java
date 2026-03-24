/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.DefaultVertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$Mode
 *  net.minecraft.client.renderer.RenderStateShard$EmptyTextureStateShard
 *  net.minecraft.client.renderer.RenderStateShard$MultiTextureStateShard
 *  net.minecraft.client.renderer.RenderStateShard$ShaderStateShard
 *  net.minecraft.client.renderer.RenderStateShard$TextureStateShard
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.RenderType$CompositeState
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.mcreator.ultimateskeletons.ShaderHandle;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class FFRenderTypes
extends RenderType {
    public static ResourceLocation DEMON_1 = new ResourceLocation("ultimateskeletons", "textures/effects/demon.png");
    public static ResourceLocation DEMON_BACK = new ResourceLocation("ultimateskeletons", "textures/effects/demon_back.png");
    public static final RenderType DEMON = FFRenderTypes.m_173215_((String)"demon", (VertexFormat)DefaultVertexFormat.f_85814_, (VertexFormat.Mode)VertexFormat.Mode.QUADS, (int)256, (boolean)false, (boolean)false, (RenderType.CompositeState)RenderType.CompositeState.m_110628_().m_173292_(new RenderStateShard.ShaderStateShard(ShaderHandle::getRenderTypeDemon)).m_173290_((RenderStateShard.EmptyTextureStateShard)RenderStateShard.MultiTextureStateShard.m_173127_().m_173132_(DEMON_BACK, false, false).m_173132_(DEMON_1, false, false).m_173131_()).m_110691_(false));

    public FFRenderTypes(String pName, VertexFormat pFormat, VertexFormat.Mode pMode, int pBufferSize, boolean pAffectsCrumbling, boolean pSortOnUpload, Runnable pSetupState, Runnable pClearState) {
        super(pName, pFormat, pMode, pBufferSize, pAffectsCrumbling, pSortOnUpload, pSetupState, pClearState);
    }

    public static RenderType getIce(ResourceLocation locationIn) {
        RenderStateShard.TextureStateShard lvt_1_1_ = new RenderStateShard.TextureStateShard(locationIn, false, false);
        return FFRenderTypes.m_173215_((String)"ice_texture", (VertexFormat)DefaultVertexFormat.f_85812_, (VertexFormat.Mode)VertexFormat.Mode.QUADS, (int)256, (boolean)false, (boolean)true, (RenderType.CompositeState)RenderType.CompositeState.m_110628_().m_173292_(RenderType.f_173068_).m_173290_((RenderStateShard.EmptyTextureStateShard)lvt_1_1_).m_110685_(f_110139_).m_110661_(f_110158_).m_110671_(f_110152_).m_110677_(f_110154_).m_110691_(true));
    }

    public static RenderType getGlowingEffect(ResourceLocation location) {
        RenderStateShard.TextureStateShard shard = new RenderStateShard.TextureStateShard(location, false, false);
        RenderType.CompositeState rendertype$state = RenderType.CompositeState.m_110628_().m_173290_((RenderStateShard.EmptyTextureStateShard)shard).m_173292_(f_173068_).m_110685_(f_110139_).m_110661_(f_110110_).m_110677_(f_110154_).m_110687_(f_110115_).m_110691_(false);
        return FFRenderTypes.m_173215_((String)"glow_effect", (VertexFormat)DefaultVertexFormat.f_85812_, (VertexFormat.Mode)VertexFormat.Mode.QUADS, (int)256, (boolean)true, (boolean)true, (RenderType.CompositeState)rendertype$state);
    }
}

