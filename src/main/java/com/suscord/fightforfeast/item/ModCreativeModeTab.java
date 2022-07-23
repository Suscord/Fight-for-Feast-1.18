package com.suscord.fightforfeast.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_FFORF = new CreativeModeTab("fightforfeast") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ROLLCAKE.get());
        }
    };
}