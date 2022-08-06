package com.suscord.fightforfeast.client.model.entity;

import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.entity.passive.Butteredghost;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ButteredghostModel extends AnimatedGeoModel<Butteredghost> {
    @Override
    public ResourceLocation getModelResource(Butteredghost object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "geo/butteredghost.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Butteredghost object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "textures/entity/butteredghost/butteredghost.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Butteredghost animatable) {
        return new ResourceLocation(FightforFeast.MOD_ID, "animations/butteredghost.animation.json");
    }
}
