package com.gyuka08.fightforfeast.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.client.model.entity.RollcatModel;
import com.gyuka08.fightforfeast.entity.passive.Rollcat;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RollcatRenderer extends GeoEntityRenderer<Rollcat> {
    public RollcatRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RollcatModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(Rollcat instance) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/rollcat/rollcat.png");
    }

    @Override
    public RenderType getRenderType(Rollcat animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if (animatable.isBaby()) {
            stack.scale(0.7F, 0.7F, 0.7F);
        } else {
            stack.scale(1.4F, 1.4F, 1.4F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
