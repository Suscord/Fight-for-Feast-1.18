package com.gyuka08.fightforfeast.client.model;

import com.gyuka08.fightforfeast.FightforFeastMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class FFORFModelLayers {

    private static ModelLayerLocation register(String p_171294_) {
        return register(p_171294_, "main");
    }

    private static ModelLayerLocation register(String p_171301_, String p_171302_) {
        return new ModelLayerLocation(new ResourceLocation(FightforFeastMod.MOD_ID, p_171301_), p_171302_);
    }
}
