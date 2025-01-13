package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.neutral.PanhornEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PanhornModel extends AnimatedGeoModel<PanhornEntity> {
    @Override
    public ResourceLocation getModelResource(PanhornEntity object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/panhorn.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PanhornEntity object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/panhorn/panhorn.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PanhornEntity animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/panhorn.animation.json");
    }
}
