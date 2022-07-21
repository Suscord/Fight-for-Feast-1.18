package com.suscord.fightforfeast.entity;

import com.suscord.fightforfeast.FightforFeast;
import com.suscord.fightforfeast.entity.custom.Rollcat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, FightforFeast.MOD_ID);

    public static final RegistryObject<EntityType<Rollcat>> ROLLCAT =
            ENTITY_TYPES.register("rollcat",
                    () -> EntityType.Builder.of(Rollcat::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(FightforFeast.MOD_ID, "rollcat").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}