package com.suscord.fightforfeast.entity.client;

import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.entity.custom.Butteredghost;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RollcatModel extends AnimatedGeoModel<Butteredghost> {
    @Override
    public ResourceLocation getModelLocation(Butteredghost object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "geo/rollcat.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Butteredghost object) {
        return new ResourceLocation(FightforFeast.MOD_ID, "textures/entity/rollcat/rollcat.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Butteredghost animatable) {
        return new ResourceLocation(FightforFeast.MOD_ID, "animations/rollcat.animation.json");
    }
}
