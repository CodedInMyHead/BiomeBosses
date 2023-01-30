package com.codedinmyhead.biome.client.renderer;

import com.codedinmyhead.biome.client.models.Fox;
import com.codedinmyhead.biome.client.models.OtterModel;
import com.codedinmyhead.biome.entity.FoxEntity;
import com.codedinmyhead.biome.entity.OtterEntity;
import com.codedinmyhead.biome.util.Util;
import net.minecraft.client.model.FoxModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FoxRenderer extends MobRenderer<FoxEntity, Fox> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Util.MODID, "textures/entities/fox.png");

    public FoxRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new Fox(ctx.bakeLayer(Fox.LAYER_LOCATION)), .5F);
    }

    @Override
    public ResourceLocation getTextureLocation(FoxEntity p_114482_) {
        return TEXTURE;
    }
}
