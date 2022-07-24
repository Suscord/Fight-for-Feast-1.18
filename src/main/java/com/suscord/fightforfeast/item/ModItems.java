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

    public static final RegistryObject<Item> ROLLCAT_SPAWN_EGG = ITEMS.register("rollcat_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ROLLCAT,0x5d2622, 0x5d2c28,
                    new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF)));

    public static final RegistryObject<Item> ROLLCAKE = ITEMS.register("rollcake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF).food(ModFoods.ROLLCAKE)));

    public static final RegistryObject<Item> MILK_CHOCOLATE = ITEMS.register("milk_chocolate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_FFORF).food(ModFoods.MILK_CHOCOLATE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}