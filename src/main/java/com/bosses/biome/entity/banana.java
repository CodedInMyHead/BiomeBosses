// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bone;

	public custom_model(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftShoe = bone.addOrReplaceChild("leftShoe", CubeListBuilder.create(), PartPose.offset(1.6739F, -4.6022F, 0.5F));

		PartDefinition cube_r1 = leftShoe.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 7).addBox(0.0073F, 3.6246F, 0.5F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(14, 7).addBox(-0.4927F, 4.1246F, 0.5F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leftLeg = bone.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offset(1.6739F, -4.6022F, 0.5F));

		PartDefinition leftLowerLeg_r1 = leftLeg.addOrReplaceChild("leftLowerLeg_r1", CubeListBuilder.create().texOffs(15, 3).addBox(0.2573F, 2.6246F, 0.75F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(15, 3).addBox(0.2573F, 0.8746F, 0.75F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition rightLeg = bone.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offset(1.6739F, -4.6022F, 0.5F));

		PartDefinition rightLowerLeg_r1 = rightLeg.addOrReplaceChild("rightLowerLeg_r1", CubeListBuilder.create().texOffs(15, 3).addBox(0.2573F, 2.6246F, -1.0F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(15, 3).addBox(0.2573F, 1.6246F, -1.0F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition rightShoe = bone.addOrReplaceChild("rightShoe", CubeListBuilder.create(), PartPose.offset(1.6739F, -4.6022F, 0.5F));

		PartDefinition cube_r2 = rightShoe.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 7).addBox(0.0073F, 3.6246F, -1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(14, 7).addBox(-0.4927F, 4.1246F, -1.25F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Banana = bone.addOrReplaceChild("Banana", CubeListBuilder.create(), PartPose.offset(1.6739F, -4.6022F, 0.5F));

		PartDefinition cube_r3 = Banana.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 14).addBox(1.1034F, -4.4996F, -0.75F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(0.8534F, -4.2496F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bananaBase_r1 = Banana.addOrReplaceChild("bananaBase_r1", CubeListBuilder.create().texOffs(4, 5).addBox(-0.2212F, -3.1285F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition bananaPeel = bone.addOrReplaceChild("bananaPeel", CubeListBuilder.create(), PartPose.offset(1.6739F, -4.6022F, 0.5F));

		PartDefinition back = bananaPeel.addOrReplaceChild("back", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 13).addBox(-2.1739F, 0.3522F, -0.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 13).addBox(-2.6739F, 0.6022F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition rightBananaPeel = bananaPeel.addOrReplaceChild("rightBananaPeel", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = rightBananaPeel.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 14).addBox(-0.2212F, 0.1215F, 1.25F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(3, 14).addBox(-0.2212F, 0.6215F, 1.25F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 14).addBox(-0.4712F, -1.1285F, 1.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition frontBananaPeel = bananaPeel.addOrReplaceChild("frontBananaPeel", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = frontBananaPeel.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 11).addBox(2.0489F, -0.3539F, -1.0F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(2, 13).addBox(2.0489F, 0.6461F, -0.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 12).addBox(2.0489F, 1.1461F, -0.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 12).addBox(2.0489F, 0.1461F, -1.0F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition backBananaPeel = bananaPeel.addOrReplaceChild("backBananaPeel", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = backBananaPeel.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 13).addBox(-0.9063F, -0.7679F, -0.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition cube_r8 = backBananaPeel.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(3, 12).addBox(-0.8936F, -0.3244F, -1.0F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 12).addBox(-0.8936F, -0.8244F, -1.0F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r9 = backBananaPeel.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 14).addBox(-1.5176F, -0.3693F, -0.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leftBananaPeel = bananaPeel.addOrReplaceChild("leftBananaPeel", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftBananaPeel.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(3, 13).addBox(-0.2212F, 0.6215F, -1.5F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(3, 14).addBox(-0.4712F, -1.1285F, -1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(4, 14).addBox(-0.2212F, 0.1215F, -1.5F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition mainBananaPeel = bananaPeel.addOrReplaceChild("mainBananaPeel", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = mainBananaPeel.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 12).addBox(-1.2191F, -0.4659F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition cube_r12 = mainBananaPeel.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 12).addBox(-0.6756F, -0.5936F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition cube_r13 = mainBananaPeel.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 13).addBox(-0.4712F, -1.1285F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition cube_r14 = mainBananaPeel.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1, 12).addBox(-1.6739F, -0.1478F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}