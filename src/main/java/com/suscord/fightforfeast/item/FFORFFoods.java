package com.suscord.fightforfeast.item;

import net.minecraft.world.food.FoodProperties;

public class FFORFFoods {
    public static final FoodProperties BUTTERED_TOAST = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties MILK_CHOCOLATE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.4F).fast().build();
    public static final FoodProperties PEPPERMINT_CANE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties ROLLCAKE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();
    public static final FoodProperties CHOCO_TORTE_SLICE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).fast().build();

}
