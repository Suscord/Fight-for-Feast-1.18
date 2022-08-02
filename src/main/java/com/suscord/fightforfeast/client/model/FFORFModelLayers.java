package com.suscord.fightforfeast.client.model;

import com.suscord.fightforfeast.FightforFeast;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class FFORFModelLayers {

    public static final ModelLayerLocation MAZE_SLIME = register("maze_slime");
    public static final ModelLayerLocation MAZE_SLIME_OUTER = register("maze_slime", "outer");


    private static ModelLayerLocation register(String p_171294_) {
        return register(p_171294_, "main");
    }

    private static ModelLayerLocation register(String p_171301_, String p_171302_) {
        return new ModelLayerLocation(new ResourceLocation(FightforFeast.MOD_ID, p_171301_), p_171302_);
    }
}
