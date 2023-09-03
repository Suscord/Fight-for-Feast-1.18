package com.gyuka08.fightforfeast.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.client.model.entity.TortetoiseModel;
import com.gyuka08.fightforfeast.entity.neutral.Tortetoise;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TortetoiseRenderer extends GeoEntityRenderer<Tortetoise> {
    public TortetoiseRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TortetoiseModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(Tortetoise instance) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/tortetoise/tortetoise.png");
    }

    @Override
    public RenderType getRenderType(Tortetoise animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if (animatable.isBaby()) {
            stack.scale(0.3F, 0.3F, 0.3F);
        } else {
            stack.scale(1.0F, 1.0F, 1.0F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
