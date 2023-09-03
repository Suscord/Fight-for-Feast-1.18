package com.gyuka08.fightforfeast.client.model.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.passive.Fruitjellyslime;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FruitjellyslimeModel extends AnimatedGeoModel<Fruitjellyslime> {
    @Override
    public ResourceLocation getModelResource(Fruitjellyslime object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "geo/fruitjellyslime.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Fruitjellyslime object) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "textures/entity/fruitjellyslime/fruitjellyslime.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Fruitjellyslime animatable) {
        return new ResourceLocation(FightforFeastMod.MOD_ID, "animations/fruitjellyslime.animation.json");
    }
}
