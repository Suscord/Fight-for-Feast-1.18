package com.gyuka08.fightforfeast.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class FFFTiers {
    public static final ForgeTier PEPPERMINT = new ForgeTier(2, 77, 7f, 3f,
            27, BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(FFFItems.PEPPERMINT_SHARD.get()));

}
