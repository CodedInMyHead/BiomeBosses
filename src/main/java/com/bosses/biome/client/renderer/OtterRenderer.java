package com.bosses.biome.client.renderer;

import com.bosses.biome.client.models.OtterModel;
import com.bosses.biome.entity.OtterEntity;
import com.bosses.biome.util.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class OtterRenderer extends MobRenderer<OtterEntity, OtterModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Util.MODID, "textures/entities/otter.png");

    public OtterRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new OtterModel(ctx.bakeLayer(OtterModel.LAYER_LOCATION)), .5F);
    }

    @Override
    public ResourceLocation getTextureLocation(OtterEntity p_114482_) {
        return TEXTURE;
    }
}
