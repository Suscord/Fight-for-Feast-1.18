package com.suscord.fightforfeast.client.model.entity;

import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.entity.passive.Butteredghost;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ButteredGhostModel extends AnimatedGeoModel<Butteredghost> {
    @Override
    public ResourceLocation getModelLocation(Butteredghost object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "geo/butteredghost.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Butteredghost object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "textures/entity/butteredghost/butteredghost.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Butteredghost animatable) {
        return new ResourceLocation(FightforFeast.MOD_ID, "animations/butteredghost.animation.json");
    }
}
