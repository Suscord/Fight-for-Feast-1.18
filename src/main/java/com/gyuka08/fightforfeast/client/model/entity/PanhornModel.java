package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.neutral.Panhorn;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PanhornModel extends AnimatedGeoModel<Panhorn> {
    @Override
    public ResourceLocation getModelResource(Panhorn object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/panhorn.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Panhorn object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/panhorn/panhorn.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Panhorn animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/panhorn.animation.json");
    }
}
