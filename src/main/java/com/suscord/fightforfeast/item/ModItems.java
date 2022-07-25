package com.suscord.fightforfeast.item;

import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.entity.ModEntityTypes;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FightforFeast.MOD_ID);

    //Misc
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF)));

    //Spawn Egg
    public static final RegistryObject<Item> BGHOST_SPAWN_EGG = ITEMS.register("buttered_ghost_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BUTTEREDGHOST,0x894e3f, 0xfff594,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF)));

    public static final RegistryObject<Item> ROLLCAT_SPAWN_EGG = ITEMS.register("rollcat_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ROLLCAT,0x5d2622, 0x5d2c28,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF)));

    //Food
    public static final RegistryObject<Item> BUTTERED_TOAST = ITEMS.register("buttered_toast",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF).food(ModFoods.BUTTERED_TOAST)));

    public static final RegistryObject<Item> MILK_CHOCOLATE = ITEMS.register("milk_chocolate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF).food(ModFoods.MILK_CHOCOLATE)));

    public static final RegistryObject<Item> ROLLCAKE = ITEMS.register("rollcake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF).food(ModFoods.ROLLCAKE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}