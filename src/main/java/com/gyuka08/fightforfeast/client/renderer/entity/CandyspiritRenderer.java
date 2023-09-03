package com.gyuka08.fightforfeast.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.client.model.entity.CandyspiritModel;
import com.gyuka08.fightforfeast.entity.passive.Candyspirit;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CandyspiritRenderer extends GeoEntityRenderer<Candyspirit> {
    public CandyspiritRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CandyspiritModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(Candyspirit instance) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/candyspirit/candyspirit.png");
    }

    @Override
    public RenderType getRenderType(Candyspirit animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if (animatable.isBaby()) {
            stack.scale(0.75F, 0.75F, 0.75F);
        } else {
            stack.scale(1.5F, 1.5F, 1.5F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
