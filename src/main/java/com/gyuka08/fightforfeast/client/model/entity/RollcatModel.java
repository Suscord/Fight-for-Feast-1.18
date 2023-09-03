package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.passive.Rollcat;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RollcatModel extends AnimatedGeoModel<Rollcat> {
    @Override
    public ResourceLocation getModelResource(Rollcat object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/rollcat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Rollcat object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/rollcat/rollcat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Rollcat animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/rollcat.animation.json");
    }
}
