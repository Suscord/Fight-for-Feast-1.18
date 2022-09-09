package com.suscord.fightforfeast.client.renderer.entity;

import com.suscord.fightforfeast.entity.monster.Jawbreakerspider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SpiderRenderer;
import net.minecraft.resources.ResourceLocation;

public class JawbreakerspiderRenderer<T extends Jawbreakerspider> extends SpiderRenderer<T> {

    private static final ResourceLocation RCLoc = new ResourceLocation("textures/entity/jawbreakerspider/jawbreakerspider.png");

    public JawbreakerspiderRenderer(EntityRendererProvider.Context p_174401_) {
        super(p_174401_);
    }

    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return RCLoc;
    }
}
