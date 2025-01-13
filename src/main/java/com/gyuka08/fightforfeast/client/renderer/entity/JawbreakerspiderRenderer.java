package com.gyuka08.fightforfeast.client.renderer.entity;

import com.gyuka08.fightforfeast.client.model.entity.JawbreakerspiderModel;
import com.gyuka08.fightforfeast.entity.monster.JawbreakerspiderEntity;
import net.minecraft.client.model.SpiderModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SpiderEyesLayer;
import net.minecraft.resources.ResourceLocation;

public class JawbreakerspiderRenderer<T extends JawbreakerspiderEntity> extends MobRenderer<T, JawbreakerspiderModel<T>> {
    private static final ResourceLocation ENTITY_LOCATION = new ResourceLocation("textures/entity/jawbreakerspider/jawbreakerspider.png");

    public JawbreakerspiderRenderer(EntityRendererProvider.Context p_174401_) {
        this(p_174401_, ModelLayers.SPIDER);
    }

    public JawbreakerspiderRenderer(EntityRendererProvider.Context pContext, ModelLayerLocation pLayer) {
        super(pContext, new JawbreakerspiderModel(pContext.bakeLayer(pLayer)), 0.8F);
        this.addLayer(new SpiderEyesLayer(this));
    }

    protected float getFlipDegrees(T pLivingEntity) {
        return 180.0F;
    }

    public ResourceLocation getTextureLocation(T pEntity) {
        return ENTITY_LOCATION;
    }
}

