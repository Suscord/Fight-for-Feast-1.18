package com.suscord.fightforfeast.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.suscord.fightforfeast.FightforFeastMod;
import com.suscord.fightforfeast.client.model.entity.FruitjellyslimeModel;
import com.suscord.fightforfeast.entity.passive.Fruitjellyslime;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FruitjellyslimeRenderer extends GeoEntityRenderer<Fruitjellyslime> {

    public FruitjellyslimeRenderer(EntityRendererProvider.Context renderManager, Fruitjellyslime pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super(renderManager, new FruitjellyslimeModel());
        this.shadowRadius = 0.25F * (float)pEntity.getSize();
    }

    @Override
    public ResourceLocation getTextureLocation(Fruitjellyslime instance) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/fruitjellyslime/fruitjellyslime.png");
    }

    //@Override
    public RenderType getRenderType(Fruitjellyslime animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation, Fruitjellyslime pLivingEntity,
                                    PoseStack pMatrixStack, float pPartialTickTime) {
        stack.scale(1.0F * (float)pLivingEntity.getSize(), 1.0F, 1.0F);
        float f = 0.999F;
        pMatrixStack.scale(0.999F, 0.999F, 0.999F);
        pMatrixStack.translate(0.0D, (double)0.001F, 0.0D);
        float f1 = (float)pLivingEntity.getSize();
        float f2 = Mth.lerp(pPartialTickTime, pLivingEntity.oSquish, pLivingEntity.squish) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        pMatrixStack.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    /*
    protected void scale(Fruitjellyslime pLivingEntity, PoseStack pMatrixStack, float pPartialTickTime) {
        float f = 0.999F;
        pMatrixStack.scale(0.999F, 0.999F, 0.999F);
        pMatrixStack.translate(0.0D, (double)0.001F, 0.0D);
        float f1 = (float)pLivingEntity.getSize();
        float f2 = Mth.lerp(pPartialTickTime, pLivingEntity.oSquish, pLivingEntity.squish) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        pMatrixStack.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
        */

    }

