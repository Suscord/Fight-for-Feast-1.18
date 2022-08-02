package com.suscord.fightforfeast.client.model.entity;

import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.entity.passive.Fruitjellyslime;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FruitjellyslimeModel extends AnimatedGeoModel<Fruitjellyslime> {
    @Override
    public ResourceLocation getModelLocation(Fruitjellyslime object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "geo/fruitjellyslime.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Fruitjellyslime object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "textures/entity/fruitjellyslime/fruitjellyslime.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Fruitjellyslime animatable) {
        return new ResourceLocation(FightforFeast.MOD_ID, "animations/fruitjellyslime.animation.json");
    }
}
