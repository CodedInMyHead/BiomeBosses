package com.bosses.biome.client.models;

import com.bosses.biome.entity.FoxEntity;
import com.bosses.biome.util.Util;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class FoxModel extends EntityModel<FoxEntity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Util.MODID, "fox"), "main");
    private final ModelPart LeftEar;
    private final ModelPart RightEar;
    private final ModelPart Head;
    private final ModelPart Body;
    private final ModelPart Legs;

    public FoxModel(ModelPart root) {
        this.LeftEar = root.getChild("LeftEar");
        this.RightEar = root.getChild("RightEar");
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Legs = root.getChild("Legs");
    }

    public static LayerDefinition createBodyLayer() {
        var mesh = new MeshDefinition();
        PartDefinition parts = mesh.getRoot();

        PartDefinition LeftEar = parts.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 1).addBox(-3.0F, -22.0F, -1.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-6.0F, -22.0F, -1.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        LeftEar.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 0).addBox(1.0F, -4.0F, -0.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.0F, -4.0F, -0.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 9).addBox(-1.0F, -5.0F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 0).mirror().addBox(-1.75F, -3.75F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, -18.0F, -1.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition RightEar = parts.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(1, 0).mirror().addBox(-6.0F, -21.75F, -1.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 1).addBox(-5.0F, -23.0F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Head = parts.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(7, 0).mirror().addBox(-13.0F, -17.0F, -6.0F, 10.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 0).addBox(-12.25F, -15.75F, 1.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 5).addBox(-12.25F, -17.25F, -5.5F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(3, 8).addBox(-11.25F, -17.5F, -2.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(-13.0F, -17.0F, -6.25F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-9.0F, -15.0F, -6.25F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(2, 4).addBox(-13.0F, -15.0F, -6.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(2, 8).addBox(-4.0F, -15.0F, -6.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(5, 0).addBox(-13.0F, -13.0F, -6.25F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-10.0F, -13.0F, -9.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(10, 10).addBox(-9.0F, -13.5F, -8.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(6, 0).addBox(-9.5F, -13.25F, -9.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(2, 0).mirror().addBox(-9.5F, -13.0F, -10.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(8, 4).addBox(-9.5F, -13.0F, -10.25F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(2, 0).mirror().addBox(-9.5F, -12.0F, -10.25F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 4).addBox(-9.5F, -12.5F, -10.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(2, 0).mirror().addBox(-7.0F, -12.5F, -10.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 4).addBox(-8.5F, -12.5F, -10.25F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Body = parts.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-9.0F, -1.0F, 7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 7).addBox(-0.25F, -1.0F, 1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 12.0F, 0.0F, -0.3927F, 0.0F));

        Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 6).addBox(-12.0F, -10.0F, -2.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

        Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-13.25F, -11.0F, -5.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition group = Body.addOrReplaceChild("group", CubeListBuilder.create().texOffs(0, 3).addBox(-11.0F, -1.15F, 7.1F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        group.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 9).addBox(-11.0F, 0.0F, 7.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Legs = parts.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(0, 8).addBox(-7.0F, -2.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-10.75F, -2.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        Legs.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 2).addBox(-7.0F, -7.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(-11.0F, -7.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

        return LayerDefinition.create(mesh, 32, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        LeftEar.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightEar.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(FoxEntity p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }
}