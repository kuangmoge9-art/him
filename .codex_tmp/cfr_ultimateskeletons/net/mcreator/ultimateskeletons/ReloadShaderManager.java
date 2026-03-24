/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  net.minecraft.client.renderer.ShaderInstance
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.packs.resources.IoSupplier
 *  net.minecraft.server.packs.resources.Resource
 *  net.minecraft.server.packs.resources.ResourceProvider
 *  net.minecraft.util.GsonHelper
 *  org.jetbrains.annotations.NotNull
 */
package net.mcreator.ultimateskeletons;

import com.google.gson.JsonObject;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.IoSupplier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceProvider;
import net.minecraft.util.GsonHelper;
import org.jetbrains.annotations.NotNull;

public class ReloadShaderManager {
    private static Map<ResourceLocation, Resource> reloadResources = new HashMap<ResourceLocation, Resource>();
    private static boolean foreReloadAll = false;
    private static final ResourceProvider reloadShaderResource = res -> Optional.of(reloadResources.get(res));

    private static void recordResource(ResourceLocation resourceLocation, Resource resource) {
        reloadResources.put(resourceLocation, resource);
    }

    private static void recordCopyResource(ResourceLocation resourceLocation, Resource resource) {
        try (InputStream res = resource.m_215507_();){
            byte[] data = res.readAllBytes();
            IoSupplier ioSupplier = () -> new ByteArrayInputStream(data);
            Resource copyResource = new Resource(resource.m_247173_(), ioSupplier);
            ReloadShaderManager.recordResource(resourceLocation, copyResource);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public static ShaderInstance backupNewShaderInstance(ResourceProvider resourceProvider, String shaderName, VertexFormat vertexFormat) throws IOException {
        if (foreReloadAll) {
            return new ShaderInstance(reloadShaderResource, shaderName, vertexFormat);
        }
        ShaderInstance shaderInstance = new ShaderInstance(resourceProvider, shaderName, vertexFormat);
        ResourceLocation shaderResourceLocation = new ResourceLocation(shaderName);
        ReloadShaderManager.recordProgramResource(resourceProvider, shaderResourceLocation.m_135827_(), shaderResourceLocation.m_135815_());
        return shaderInstance;
    }

    public static ShaderInstance backupNewShaderInstance(ResourceProvider resourceProvider, ResourceLocation shaderLocation, VertexFormat vertexFormat) throws IOException {
        return ReloadShaderManager.backupNewShaderInstance(resourceProvider, shaderLocation.toString(), vertexFormat);
    }

    private static void recordProgramResource(ResourceProvider resourceProvider, String nameSpace, String shaderName) throws IOException {
        ResourceLocation programResourceLocation = new ResourceLocation(nameSpace, "shaders/core/" + shaderName + ".json");
        Resource programResource = (Resource)resourceProvider.m_213713_(programResourceLocation).orElseThrow();
        ReloadShaderManager.recordCopyResource(programResourceLocation, programResource);
        JsonObject jsonObject = GsonHelper.m_13859_((Reader)new InputStreamReader(((Resource)resourceProvider.m_213713_(programResourceLocation).orElseThrow()).m_215507_(), StandardCharsets.UTF_8));
        ResourceLocation vertex = new ResourceLocation(GsonHelper.m_13906_((JsonObject)jsonObject, (String)"vertex"));
        ResourceLocation vertexResourceLocation = new ResourceLocation(vertex.m_135827_(), "shaders/core/" + vertex.m_135815_() + ".vsh");
        ReloadShaderManager.recordCopyResource(vertexResourceLocation, (Resource)resourceProvider.m_213713_(vertexResourceLocation).orElseThrow());
        ResourceLocation fragment = new ResourceLocation(GsonHelper.m_13906_((JsonObject)jsonObject, (String)"fragment"));
        ResourceLocation fragmentResourceLocation = new ResourceLocation(fragment.m_135827_(), "shaders/core/" + fragment.m_135815_() + ".fsh");
        ReloadShaderManager.recordCopyResource(fragmentResourceLocation, (Resource)resourceProvider.m_213713_(fragmentResourceLocation).orElseThrow());
    }
}

