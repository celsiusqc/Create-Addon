package net.celsiusqc.createaddon.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelencasedjet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("create_addon", "modelencasedjet"), "main");
	public final ModelPart body;
	public final ModelPart rightarm;
	public final ModelPart leftarm;

	public Modelencasedjet(ModelPart root) {
		this.body = root.getChild("body");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.775F)).texOffs(40, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.505F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 27.0F, 4.0F, 0.1309F, 0.0F, -0.1309F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(19, 22).addBox(0.0F, -1.0F, 2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(19, 11).addBox(0.0F, -1.0F, 2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, -23.75F, 1.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 18).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.35F)).texOffs(0, 16)
						.addBox(-3.0F, -3.5F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.35F)).texOffs(26, 0).addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(26, 0)
						.addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(3.75F, -24.5F, 5.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(26, 0).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(26, 0).addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(26, 0).addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 27.0F, 4.0F, 0.1309F, 0.0F, 0.1309F));
		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 22).mirror().addBox(-5.0F, -1.0F, 2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(19, 11).mirror()
				.addBox(-5.0F, -1.0F, 2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -23.75F, 1.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone4 = bone2.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-1.0F, -4.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 18).mirror()
						.addBox(-2.0F, -4.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(0, 16).mirror().addBox(-3.0F, -3.5F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(26, 0).mirror()
						.addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(26, 0).mirror().addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(-3.75F, -24.5F, 5.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(26, 0).mirror()
				.addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r7 = bone4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(26, 0).mirror()
				.addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r8 = bone4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-1.0F, -3.5F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(26, 0).mirror()
				.addBox(-1.0F, -3.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 58).addBox(-2.0F, 2.0F, -2.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 58)
						.addBox(-2.0F, 2.0F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 58).addBox(-4.3F, 2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 58).addBox(1.0F, 2.0F, -2.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 58)
						.addBox(1.0F, 2.0F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 58).addBox(3.3F, 2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
