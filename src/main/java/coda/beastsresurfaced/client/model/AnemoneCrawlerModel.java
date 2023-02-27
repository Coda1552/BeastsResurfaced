package coda.beastsresurfaced.client.model;

import coda.beastsresurfaced.common.entities.AnemoneCrawler;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.AgeableListModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Collections;

public class AnemoneCrawlerModel<T extends AnemoneCrawler> extends AgeableListModel<T> {
	private final ModelPart base;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart rightFin;
	private final ModelPart leftFin;
	private final ModelPart tail;
	private final ModelPart tailFin;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;

	public AnemoneCrawlerModel(ModelPart root) {
		this.base = root.getChild("root");
		this.body = base.getChild("body");
		this.head = body.getChild("head");
		this.rightFin = head.getChild("rightFin");
		this.leftFin = head.getChild("leftFin");
		this.tail = body.getChild("tail");
		this.tailFin = tail.getChild("tailFin");
		this.rightLeg1 = body.getChild("rightLeg1");
		this.rightLeg2 = body.getChild("rightLeg2");
		this.leftLeg1 = body.getChild("leftLeg1");
		this.leftLeg2 = body.getChild("leftLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, -2.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.2932F, -3.876F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.7068F, 1.876F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 18).addBox(0.0F, -4.0F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2932F, -3.876F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(8, 13).addBox(-1.0F, -1.5F, -2.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 3.2068F, -3.376F));

		PartDefinition rightFin = head.addOrReplaceChild("rightFin", CubeListBuilder.create().texOffs(4, 30).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, -0.7854F, 0.0F));

		PartDefinition leftFin = head.addOrReplaceChild("leftFin", CubeListBuilder.create().texOffs(4, 28).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.5F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.7068F, 3.124F));

		PartDefinition tailFin = tail.addOrReplaceChild("tailFin", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -3.0F, -0.5F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.5F));

		PartDefinition rightLeg1 = body.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(0, 28).addBox(-0.25F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 4.7068F, -2.376F));

		PartDefinition leftLeg1 = body.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 28).addBox(-0.75F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.7068F, -2.376F));

		PartDefinition leftLeg2 = body.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.75F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.2068F, 2.124F));

		PartDefinition rightLeg2 = body.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.25F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 4.2068F, 2.124F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	protected Iterable<ModelPart> headParts() {
		return Collections.emptyList();
	}

	@Override
	protected Iterable<ModelPart> bodyParts() {
		return ImmutableList.of(base);
	}
}