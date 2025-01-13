package com.gyuka08.fightforfeast.event;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.FFFEntityTypes;
import com.gyuka08.fightforfeast.entity.neutral.PanhornEntity;
import com.gyuka08.fightforfeast.entity.neutral.TortetoiseEntity;
import com.gyuka08.fightforfeast.entity.passive.CandyspiritEntity;
import com.gyuka08.fightforfeast.entity.passive.RollcatEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FightforFeastMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFFEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(FFFEntityTypes.ROLLCAT.get(), RollcatEntity.setAttributes());
        //event.put(FFFEntityTypes.FRUITJELLYSLIME.get(), FruitjellyslimeEntity.setAttributes());
        event.put(FFFEntityTypes.PANHORN.get(), PanhornEntity.setAttributes());
        event.put(FFFEntityTypes.CANDYSPIRIT.get(), CandyspiritEntity.setAttributes());
        //event.put(FFFEntityTypes.JAWBREAKERSPIDER.get(), JawbreakerspiderEntity.createAttributes().build());
        event.put(FFFEntityTypes.TORTETOISE.get(), TortetoiseEntity.setAttributes());
    }
}