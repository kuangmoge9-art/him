package com.himdev.him.client.render.layer;

import com.himdev.him.HimMod;
import com.himdev.him.client.model.HimModel;
import com.himdev.him.entity.HimEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

public final class HimEyesLayer extends EyesLayer<HimEntity, HimModel> {
    private static final RenderType EYES =
            RenderType.eyes(ResourceLocation.fromNamespaceAndPath(HimMod.MOD_ID, "textures/entity/him_eyes.png"));

    public HimEyesLayer(RenderLayerParent<HimEntity, HimModel> renderer) {
        super(renderer);
    }

    @Override
    public RenderType renderType() {
        return EYES;
    }
}
