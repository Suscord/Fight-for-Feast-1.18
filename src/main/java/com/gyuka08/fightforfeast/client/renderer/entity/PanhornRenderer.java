package com.gyuka08.fightforfeast.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.client.model.entity.PanhornModel;
import com.gyuka08.fightforfeast.entity.neutral.Panhorn;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PanhornRenderer extends GeoEntityRenderer<Panhorn> {
    public PanhornRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PanhornModel());
        this.shadowRadius = 0.5f;
    }

    public PanhornRenderer(EntityRendererProvider.Context renderManager, AnimatedGeoModel<Panhorn> modelProvider) {
        super(renderManager, modelProvider);
    }

    @Override
    public ResourceLocation getTextureLocation(Panhorn instance) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/panhorn/panhorn.png");
    }

    @Override
    public RenderType getRenderType(Panhorn animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if (animatable.isBaby()) {
            stack.scale(0.7F, 0.7F, 0.7F);
        } else {
            stack.scale(1.5F, 1.5F, 1.5F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
