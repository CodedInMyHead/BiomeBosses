// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bb_main;

	public custom_model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(15, 8).addBox(-7.75F, -7.0F, 7.25F, 0.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(15, 9).addBox(-7.75F, -15.5494F, 5.3188F, 0.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-1, 9).addBox(-8.5F, -0.5F, 6.75F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-8.0F, -16.2723F, 5.046F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, 12).addBox(-7.75F, -17.0457F, 7.7759F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(10, -1).addBox(-7.625F, -16.6207F, 8.1509F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 2).addBox(-7.625F, -16.3707F, 11.9009F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 1).addBox(-7.625F, -16.1207F, 12.1509F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 2).addBox(-7.625F, -15.8707F, 13.1509F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(13, 2).addBox(-7.625F, -15.6207F, 13.4009F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-8.25F, -0.75F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 12).addBox(-0.5F, -1.875F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 10).addBox(-0.25F, -2.625F, -0.25F, 0.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -9.2405F, 6.5439F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 0).addBox(-0.125F, 0.6526F, -2.1992F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, -1).addBox(-0.125F, -0.0974F, -1.6992F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -16.1483F, 7.1001F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-2, 13).addBox(-0.25F, -0.6344F, -1.7437F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -16.0733F, 7.1001F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 11).addBox(-0.25F, -0.45F, -0.675F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -17.1994F, 5.5938F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.5F, -7.5F, 7.25F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}