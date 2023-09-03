package com.gyuka08.fightforfeast.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.monster.Jawbreakerspider;
import com.gyuka08.fightforfeast.entity.neutral.Panhorn;
import com.gyuka08.fightforfeast.entity.neutral.Tortetoise;
import com.gyuka08.fightforfeast.entity.passive.Candyspirit;
import com.gyuka08.fightforfeast.entity.passive.Rollcat;
import com.gyuka08.fightforfeast.entity.passive.Fruitjellyslime;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFORFEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FightforFeastMod.MOD_ID);

    public static final RegistryObject<EntityType<Candyspirit>> CANDYSPIRIT =
            ENTITY_TYPES.register("candyspirit",
                    () -> EntityType.Builder.of(Candyspirit::new, MobCategory.CREATURE)
                            .sized(0.7f, 0.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "candyspirit").toString()));

    public static final RegistryObject<EntityType<Jawbreakerspider>> JAWBREAKERSPIDER =
            ENTITY_TYPES.register("jawbreakerspider",
                    () -> EntityType.Builder.of(Jawbreakerspider::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "jawbreakerspider").toString()));

    public static final RegistryObject<EntityType<Fruitjellyslime>> FRUITJELLYSLIME =
            ENTITY_TYPES.register("fruitjellyslime",
                    () -> EntityType.Builder.of(Fruitjellyslime::new, MobCategory.CREATURE)
                            .sized(0.7f, 0.7f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "fruitjellyslime").toString()));

    public static final RegistryObject<EntityType<Panhorn>> PANHORN =
            ENTITY_TYPES.register("panhorn",
                    () -> EntityType.Builder.of(Panhorn::new, MobCategory.CREATURE)
                            .sized(1.2f, 1.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "panhorn").toString()));

    public static final RegistryObject<EntityType<Rollcat>> ROLLCAT =
            ENTITY_TYPES.register("rollcat",
                    () -> EntityType.Builder.of(Rollcat::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "rollcat").toString()));

    public static final RegistryObject<EntityType<Tortetoise>> TORTETOISE =
            ENTITY_TYPES.register("tortetoise",
                    () -> EntityType.Builder.of(Tortetoise::new, MobCategory.CREATURE)
                            .sized(1.0f, 1.0f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "tortetoise").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}