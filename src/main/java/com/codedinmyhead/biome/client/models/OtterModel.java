package com.codedinmyhead.biome.client.models;// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.codedinmyhead.biome.entity.OtterEntity;
import com.codedinmyhead.biome.util.Util;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class OtterModel extends EntityModel<OtterEntity> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Util.MODID, "textures/entities/otter.png"), "main");
	private final ModelPart body;

	public OtterModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		body.addOrReplaceChild("rightEar_r1", CubeListBuilder.create().texOffs(22, 14).addBox(-8.625F, -0.804F, -4.2203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 22).addBox(-8.625F, -4.2759F, -0.7811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.875F, -3.5471F, 1.494F, 0.0F, -1.5708F, -0.7854F));

		body.addOrReplaceChild("mainBody_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.125F, -2.4529F, -2.494F, 13.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.875F, -3.5471F, 1.494F, 0.0F, -1.5708F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(9.5F, -2.5F, 1.5F));

		tail.addOrReplaceChild("lowerTail_r1", CubeListBuilder.create().texOffs(0, 20).addBox(8.6845F, 3.4378F, -0.494F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.375F, -1.0471F, -0.006F, 1.5708F, -1.1781F, -1.5708F));

		tail.addOrReplaceChild("upperTail_r1", CubeListBuilder.create().texOffs(10, 20).addBox(6.6208F, 4.9017F, -0.494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 21).addBox(6.6208F, 5.9017F, -0.494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.375F, -1.0471F, -0.006F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition allHead = body.addOrReplaceChild("allHead", CubeListBuilder.create(), PartPose.offset(-8.0F, -1.0F, -5.0F));

		allHead.addOrReplaceChild("upNose_r1", CubeListBuilder.create().texOffs(18, 9).addBox(-9.625F, -3.4529F, -0.494F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 8).addBox(-10.875F, -2.4529F, -0.494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 9).addBox(-10.375F, -2.9529F, -0.494F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, -1).addBox(-10.625F, -2.4529F, 0.256F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, -1).addBox(-10.625F, -2.4529F, -2.494F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 15).addBox(-10.125F, -2.4529F, -2.494F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-9.125F, -4.4529F, -2.494F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.125F, -2.5471F, 6.494F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leftBackAll = body.addOrReplaceChild("leftBackAll", CubeListBuilder.create(), PartPose.offset(5.8045F, -0.9693F, 5.5F));

		leftBackAll.addOrReplaceChild("leftBackLeg_r1", CubeListBuilder.create().texOffs(19, 10).addBox(6.1795F, 2.0055F, 0.3848F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6795F, -2.5779F, -4.006F, 0.0F, -1.5708F, 0.7854F));

		leftBackAll.addOrReplaceChild("leftBackFoot_r1", CubeListBuilder.create().texOffs(59, 12).addBox(2.913F, 2.5779F, 5.4071F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6795F, -2.5779F, -4.006F, 0.0F, -1.1781F, 0.0F));

		PartDefinition leftFrontAll = body.addOrReplaceChild("leftFrontAll", CubeListBuilder.create(), PartPose.offset(5.8045F, -0.9693F, 5.5F));

		leftFrontAll.addOrReplaceChild("leftFrontFeet_r1", CubeListBuilder.create().texOffs(55, 12).addBox(-5.387F, 2.5779F, 1.9821F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6795F, -2.5779F, -4.006F, 0.0F, -1.1781F, 0.0F));

		leftFrontAll.addOrReplaceChild("leftFrontLeg_r1", CubeListBuilder.create().texOffs(15, 10).addBox(-2.8205F, 2.0055F, 0.3848F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6795F, -2.5779F, -4.006F, 0.0F, -1.5708F, 0.7854F));

		PartDefinition rightFrontAll = body.addOrReplaceChild("rightFrontAll", CubeListBuilder.create(), PartPose.offset(0.7795F, -0.5943F, -6.025F));

		rightFrontAll.addOrReplaceChild("rightFrontFoot_r1", CubeListBuilder.create().texOffs(41, 12).addBox(-5.3989F, 2.5779F, -3.4548F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6545F, -2.9529F, 7.519F, -3.1416F, -1.1781F, 3.1416F));

		rightFrontAll.addOrReplaceChild("rightFrontLeg_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.8205F, 1.9902F, -1.3445F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6545F, -2.9529F, 7.519F, 0.0F, -1.5708F, -0.7854F));

		PartDefinition rightBackAll = body.addOrReplaceChild("rightBackAll", CubeListBuilder.create(), PartPose.offset(0.7795F, -0.5943F, -6.025F));

		rightBackAll.addOrReplaceChild("rightBackFoot_r1", CubeListBuilder.create().texOffs(41, 2).addBox(2.8761F, 2.5779F, -6.9048F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6545F, -2.9529F, 7.519F, -3.1416F, -1.1781F, 3.1416F));

		rightBackAll.addOrReplaceChild("rightBackLeg_r1", CubeListBuilder.create().texOffs(0, 10).addBox(6.1795F, 1.9902F, -1.3445F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6545F, -2.9529F, 7.519F, 0.0F, -1.5708F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(OtterEntity p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}