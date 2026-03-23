package com.himdev.him.client.render;

import com.himdev.him.HimMod;
import com.himdev.him.client.model.HimModel;
import com.himdev.him.entity.HimEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public final class HimRenderer extends MobRenderer<HimEntity, HimModel> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(HimMod.MOD_ID, "textures/entity/him.png");

    public HimRenderer(EntityRendererProvider.Context context) {
        super(context, new HimModel(context.bakeLayer(HimModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(HimEntity entity) {
        return TEXTURE;
    }
}
