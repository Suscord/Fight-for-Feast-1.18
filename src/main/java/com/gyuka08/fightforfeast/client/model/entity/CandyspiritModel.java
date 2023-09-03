package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.passive.Candyspirit;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CandyspiritModel extends AnimatedGeoModel<Candyspirit> {
    @Override
    public ResourceLocation getModelResource(Candyspirit object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/candyspirit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Candyspirit object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/candyspirit/candyspirit.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Candyspirit animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/candyspirit.animation.json");
    }
}
