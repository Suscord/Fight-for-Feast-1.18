package com.gyuka08.fightforfeast.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FFFCreativeModeTab {
    public static final CreativeModeTab TAB_FFORF = new CreativeModeTab("fightforfeast") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FFFItems.ROLLCAKE.get());
        }
    };
}