package com.gyuka08.fightforfeast.item;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.FFORFEntityTypes;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFORFItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FightforFeastMod.MOD_ID);

    //Misc
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF)));

    public static final RegistryObject<Item> PEPPERMINT_SHARD = ITEMS.register("peppermint_shard",
            () -> new Item(new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF)));

    //Tool
    public static final RegistryObject<Item> PEPPERMINT_LANCE = ITEMS.register("peppermint_lance",
            () -> new SwordItem(FFORFTiers.PEPPERMINT, 2, 3,
                    new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF)));

    //Food
    public static final RegistryObject<Item> BUTTERED_TOAST = ITEMS.register("buttered_toast",
            () -> new Item(new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF).
                    food(FFORFFoods.BUTTERED_TOAST)));

    public static final RegistryObject<Item> MILK_CHOCOLATE = ITEMS.register("milk_chocolate",
            () -> new Item(new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF).
                    food(FFORFFoods.MILK_CHOCOLATE)));

    public static final RegistryObject<Item> PEPPERMINT_CANE = ITEMS.register("peppermint_cane",
            () -> new Item(new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF).
                    food(FFORFFoods.PEPPERMINT_CANE)));

    public static final RegistryObject<Item> ROLLCAKE = ITEMS.register("rollcake",
            () -> new Item(new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF).
                    food(FFORFFoods.ROLLCAKE)));

    public static final RegistryObject<Item> CHOCO_TORTE_SLICE = ITEMS.register("chocolate_torte_slice",
            () -> new Item(new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF).
                    food(FFORFFoods.CHOCO_TORTE_SLICE)));

    //Spawn Egg
    /*
    public static final RegistryObject<Item> BGHOST_SPAWN_EGG = ITEMS.
            register("buttered_ghost_spawn_egg",
            () -> new ForgeSpawnEggItem(FFORFEntityTypes.CANDYSPIRIT,0x894e3f,
                    0xfff594,
                    new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF)));
    */
    public static final RegistryObject<Item> CANDYSPIRIT_SPAWN_EGG = ITEMS.
            register("candyspirit_spawn_egg",
                    () -> new ForgeSpawnEggItem(FFORFEntityTypes.CANDYSPIRIT,0xebf0fa,
                            0xf5555d,
                            new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF)));

    public static final RegistryObject<Item> ROLLCAT_SPAWN_EGG = ITEMS.
            register("rollcat_spawn_egg",
            () -> new ForgeSpawnEggItem(FFORFEntityTypes.ROLLCAT,0x5d2622,
                    0x5d2c28,
                    new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF)));

    public static final RegistryObject<Item> TORTETOISE_SPAWN_EGG = ITEMS.
            register("tortetoise_spawn_egg",
                    () -> new ForgeSpawnEggItem(FFORFEntityTypes.TORTETOISE,0x5d2c28,
                            0x5d2622,
                            new Item.Properties().tab(FFORFCreativeModeTab.TAB_FFORF)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}