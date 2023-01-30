package com.codedinmyhead.biome.client.models;// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.codedinmyhead.biome.entity.FoxEntity;
import com.codedinmyhead.biome.util.Util;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class Fox extends EntityModel<FoxEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Util.MODID, "fox"), "main");
	private final ModelPart body;

	public Fox(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-12.0F, 6.0F, -1.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16).addBox(-13.0F, -17.0F, -6.0F, 10.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(43, 14).addBox(-13.0F, -13.0F, -6.25F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 0).addBox(-13.0F, -17.0F, -6.25F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(6, 0).addBox(-4.0F, -15.0F, -6.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(33, 45).addBox(-9.0F, -15.0F, -6.25F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(6, 2).addBox(-13.0F, -15.0F, -6.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(-12.25F, -15.75F, 1.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(15, 53).addBox(-12.25F, -17.25F, -5.5F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 44).addBox(-11.25F, -17.5F, -2.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition mainBody = body.addOrReplaceChild("mainBody", CubeListBuilder.create().texOffs(33, 30).addBox(-11.0F, -1.15F, 7.1F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition cube_r1 = mainBody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 42).addBox(-13.25F, -11.0F, -5.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = mainBody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 25).addBox(-12.0F, -10.0F, -2.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = mainBody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 37).addBox(-11.0F, 0.0F, 7.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition nose = body.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(53, 13).addBox(-9.0F, -13.5F, -8.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(39, 0).addBox(-10.0F, -13.0F, -9.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(58, 55).addBox(-9.5F, -12.0F, -10.25F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(50, 17).addBox(-9.5F, -13.25F, -9.0F, 3.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(47, 61).addBox(-9.5F, -13.0F, -10.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 58).addBox(-7.0F, -12.5F, -10.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(57, 58).addBox(-8.5F, -12.5F, -10.25F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(62, 55).addBox(-9.5F, -12.5F, -10.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(58, 57).addBox(-9.5F, -13.0F, -10.25F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(14, 31).addBox(-9.0F, -1.0F, 7.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition backTail_r1 = tail.addOrReplaceChild("backTail_r1", CubeListBuilder.create().texOffs(0, 20).addBox(-0.25F, -1.0F, 1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 12.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightEar = body.addOrReplaceChild("rightEar", CubeListBuilder.create().texOffs(56, 0).addBox(-5.0F, -21.75F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(13, 40).addBox(-3.0F, -22.0F, -1.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 54).addBox(-5.0F, -23.0F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 45).addBox(-6.0F, -22.0F, -1.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition leftBackLeg = body.addOrReplaceChild("leftBackLeg", CubeListBuilder.create().texOffs(34, 60).addBox(-10.75F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(33, 0).addBox(-10.75F, -2.0F, 3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition rightBackLeg = body.addOrReplaceChild("rightBackLeg", CubeListBuilder.create().texOffs(33, 0).addBox(-7.0F, -2.0F, 3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(34, 60).addBox(-7.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition leftEar = body.addOrReplaceChild("leftEar", CubeListBuilder.create(), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition cube_r4 = leftEar.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 2).addBox(-1.0F, -4.0F, 1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 41).addBox(-2.0F, -4.0F, -0.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 54).addBox(-1.0F, -5.0F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 2).addBox(1.0F, -4.0F, -0.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.8F, -3.75F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, -18.0F, -1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition leftFrontLeg = body.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create(), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition lowerLeg_r1 = leftFrontLeg.addOrReplaceChild("lowerLeg_r1", CubeListBuilder.create().texOffs(0, 35).addBox(-11.0F, -1.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(10, 6).addBox(-11.0F, -3.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightFrontLeg = body.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create(), PartPose.offset(12.0F, 18.0F, 1.0F));

		PartDefinition upperLeg_r1 = rightFrontLeg.addOrReplaceChild("upperLeg_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-7.0F, -3.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(-7.0F, -1.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(FoxEntity p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}