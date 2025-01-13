package com.gyuka08.fightforfeast.client.model.entity;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.SlimeModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class FruitjellyslimeModel<T extends Entity> extends SlimeModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "fruitjellyslime"), "main");
    public FruitjellyslimeModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createOuterBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        partdefinition.addOrReplaceChild("outer_cube", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    public static LayerDefinition createInnerBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        partdefinition.addOrReplaceChild("fruit", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.9286F, -1.1429F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.0F, -1.9286F, -1.1429F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 11).addBox(-2.0F, -1.9286F, 0.8571F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 5).addBox(2.0F, -1.9286F, -1.1429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 0).addBox(-3.0F, -1.9286F, -1.1429F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 5).addBox(-2.0F, 1.0714F, -1.1429F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 0).addBox(-1.0F, 2.0714F, -1.1429F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.9286F, 0.1429F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    public static LayerDefinition createEyesAndMouthLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        partdefinition.addOrReplaceChild("right_eye", CubeListBuilder.create().texOffs(10, 9).addBox(1.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_eye", CubeListBuilder.create().texOffs(10, 3).addBox(-3.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(11, 7).addBox(-1.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }
}