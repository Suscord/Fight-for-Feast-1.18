package com.suscord.fightforfeast.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.client.model.entity.ButteredGhostModel;
import com.suscord.fightforfeast.entity.passive.Butteredghost;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ButteredghostRenderer extends GeoEntityRenderer<Butteredghost> {
    public ButteredghostRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ButteredGhostModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(Butteredghost instance) {
        return new ResourceLocation(FightforFeast.MOD_ID, "textures/entity/butteredghost/butteredghost.png");
    }

    @Override
    public RenderType getRenderType(Butteredghost animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if (animatable.isBaby()) {
            stack.scale(0.8F, 0.8F, 0.8F);
        } else {
            stack.scale(1.6F, 1.6F, 1.6F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
