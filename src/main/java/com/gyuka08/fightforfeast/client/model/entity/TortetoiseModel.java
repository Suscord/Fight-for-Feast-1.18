package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.neutral.Tortetoise;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TortetoiseModel extends AnimatedGeoModel<Tortetoise> {
    @Override
    public ResourceLocation getModelResource(Tortetoise object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/tortetoise.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Tortetoise object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/tortetoise/tortetoise.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Tortetoise animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/tortetoise.animation.json");
    }
}
