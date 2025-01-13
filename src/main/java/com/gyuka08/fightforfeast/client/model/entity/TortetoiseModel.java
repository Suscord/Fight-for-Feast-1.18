package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.neutral.TortetoiseEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TortetoiseModel extends AnimatedGeoModel<TortetoiseEntity> {
    @Override
    public ResourceLocation getModelResource(TortetoiseEntity object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/tortetoise.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TortetoiseEntity object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/tortetoise/tortetoise.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TortetoiseEntity animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/tortetoise.animation.json");
    }
}
