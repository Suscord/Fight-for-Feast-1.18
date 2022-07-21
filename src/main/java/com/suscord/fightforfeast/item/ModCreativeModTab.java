package com.suscord.fightforfeast.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab FFORF_TAB = new CreativeModeTab("fightforfeast") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ROLLCAT_SPAWN_EGG.get());
        }
    };
}