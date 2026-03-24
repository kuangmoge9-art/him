/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.DefaultVertexFormat
 *  net.minecraft.client.renderer.ShaderInstance
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.packs.resources.ResourceProvider
 *  net.minecraftforge.client.event.RegisterShadersEvent
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import java.io.IOException;
import net.mcreator.ultimateskeletons.ReloadShaderManager;
import net.mcreator.ultimateskeletons.RenderUtils;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceProvider;
import net.minecraftforge.client.event.RegisterShadersEvent;

public class ShaderHandle {
    private static ShaderInstance renderTypeDemon;

    public static void setRenderTypeDemon(ShaderInstance renderTypeDemon) {
        ShaderHandle.renderTypeDemon = renderTypeDemon;
    }

    public static ShaderInstance getRenderTypeDemon() {
        return renderTypeDemon;
    }

    public static void registerShaders(RegisterShadersEvent e) {
        try {
            e.registerShader(new ShaderInstance(e.getResourceProvider(), new ResourceLocation("ultimateskeletons", "rendertype_demon"), DefaultVertexFormat.f_85814_), ShaderHandle::setRenderTypeDemon);
            ResourceProvider resourceProvider = e.getResourceProvider();
            e.registerShader(ReloadShaderManager.backupNewShaderInstance(resourceProvider, new ResourceLocation("ultimateskeletons", "fast_blit"), DefaultVertexFormat.f_85814_), shaderInstance -> {
                RenderUtils.blitShader = shaderInstance;
            });
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

