package com.bosses.biome.client.renderer;

import com.bosses.biome.entity.FoxEntity;
import com.bosses.biome.client.models.FoxModel;
import com.bosses.biome.util.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FoxRenderer extends MobRenderer<FoxEntity, FoxModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Util.MODID, "textures/entities/fox.png");

    public FoxRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new FoxModel(ctx.bakeLayer(FoxModel.LAYER_LOCATION)), .5F);
    }

    @Override
    public ResourceLocation getTextureLocation(FoxEntity p_114482_) {
        return TEXTURE;
    }
}
