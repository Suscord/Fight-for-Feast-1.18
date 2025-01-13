package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.passive.RollcatEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RollcatModel extends AnimatedGeoModel<RollcatEntity> {
    @Override
    public ResourceLocation getModelResource(RollcatEntity object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/rollcat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RollcatEntity object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/rollcat/rollcat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RollcatEntity animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/rollcat.animation.json");
    }
}
