package com.gyuka08.fightforfeast.entity;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.monster.JawbreakerspiderEntity;
import com.gyuka08.fightforfeast.entity.neutral.PanhornEntity;
import com.gyuka08.fightforfeast.entity.neutral.TortetoiseEntity;
import com.gyuka08.fightforfeast.entity.passive.CandyspiritEntity;
import com.gyuka08.fightforfeast.entity.passive.FruitjellyslimeEntity;
import com.gyuka08.fightforfeast.entity.passive.RollcatEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFFEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FightforFeastMod.MOD_ID);

    public static final RegistryObject<EntityType<CandyspiritEntity>> CANDYSPIRIT =
            ENTITY_TYPES.register("candyspirit",
                    () -> EntityType.Builder.of(CandyspiritEntity::new, MobCategory.CREATURE)
                            .sized(0.7f, 0.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "candyspirit").toString()));

    public static final RegistryObject<EntityType<JawbreakerspiderEntity>> JAWBREAKERSPIDER =
            ENTITY_TYPES.register("jawbreakerspider",
                    () -> EntityType.Builder.of(JawbreakerspiderEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "jawbreakerspider").toString()));

    public static final RegistryObject<EntityType<FruitjellyslimeEntity>> FRUITJELLYSLIME =
            ENTITY_TYPES.register("fruitjellyslime",
                    () -> EntityType.Builder.of(FruitjellyslimeEntity::new, MobCategory.CREATURE)
                            .sized(0.7f, 0.7f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "fruitjellyslime").toString()));

    public static final RegistryObject<EntityType<PanhornEntity>> PANHORN =
            ENTITY_TYPES.register("panhorn",
                    () -> EntityType.Builder.of(PanhornEntity::new, MobCategory.CREATURE)
                            .sized(1.2f, 1.5f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "panhorn").toString()));

    public static final RegistryObject<EntityType<RollcatEntity>> ROLLCAT =
            ENTITY_TYPES.register("rollcat",
                    () -> EntityType.Builder.of(RollcatEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "rollcat").toString()));

    public static final RegistryObject<EntityType<TortetoiseEntity>> TORTETOISE =
            ENTITY_TYPES.register("tortetoise",
                    () -> EntityType.Builder.of(TortetoiseEntity::new, MobCategory.CREATURE)
                            .sized(1.0f, 1.0f)
                            .build(new ResourceLocation(FightforFeastMod.MOD_ID, "tortetoise").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}