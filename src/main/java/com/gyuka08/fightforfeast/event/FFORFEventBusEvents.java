package com.gyuka08.fightforfeast.event;

import com.gyuka08.fightforfeast.FightforFeastMod;
import com.gyuka08.fightforfeast.entity.FFORFEntityTypes;
import com.gyuka08.fightforfeast.entity.neutral.Panhorn;
import com.gyuka08.fightforfeast.entity.neutral.Tortetoise;
import com.gyuka08.fightforfeast.entity.passive.Candyspirit;
import com.gyuka08.fightforfeast.entity.passive.Rollcat;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FightforFeastMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFORFEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(FFORFEntityTypes.ROLLCAT.get(), Rollcat.setAttributes());
        //event.put(FFORFEntityTypes.FRUITJELLYSLIME.get(), Fruitjellyslime.setAttributes());
        event.put(FFORFEntityTypes.PANHORN.get(), Panhorn.setAttributes());
        event.put(FFORFEntityTypes.CANDYSPIRIT.get(), Candyspirit.setAttributes());
        //event.put(FFORFEntityTypes.JAWBREAKERSPIDER.get(), Jawbreakerspider.createAttributes().build());
        event.put(FFORFEntityTypes.TORTETOISE.get(), Tortetoise.setAttributes());
    }
}