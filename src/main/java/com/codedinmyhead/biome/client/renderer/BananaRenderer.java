package com.codedinmyhead.biome.client.renderer;

import com.codedinmyhead.biome.client.models.Banana;
import com.codedinmyhead.biome.client.models.OtterModel;
import com.codedinmyhead.biome.entity.BananaEntity;
import com.codedinmyhead.biome.entity.OtterEntity;
import com.codedinmyhead.biome.util.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BananaRenderer extends MobRenderer<BananaEntity, Banana> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Util.MODID, "textures/entities/banana.png");

    public BananaRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new Banana(ctx.bakeLayer(Banana.LAYER_LOCATION)), .5F);
    }

    @Override
    public ResourceLocation getTextureLocation(BananaEntity p_114482_) {
        return TEXTURE;
    }
}
