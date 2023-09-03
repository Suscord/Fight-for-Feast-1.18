package com.gyuka08.fightforfeast;

import com.mojang.logging.LogUtils;
import com.gyuka08.fightforfeast.block.FFORFBlocks;
import com.gyuka08.fightforfeast.client.renderer.entity.CandyspiritRenderer;
import com.gyuka08.fightforfeast.client.renderer.entity.PanhornRenderer;
import com.gyuka08.fightforfeast.client.renderer.entity.TortetoiseRenderer;
import com.gyuka08.fightforfeast.entity.FFORFEntityTypes;
import com.gyuka08.fightforfeast.client.renderer.entity.RollcatRenderer;
import com.gyuka08.fightforfeast.item.FFORFItems;
import com.gyuka08.fightforfeast.sound.FFORFSounds;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FightforFeastMod.MOD_ID)
public class FightforFeastMod
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "fightforfeast";

    public FightforFeastMod()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::clientSetup);

        FFORFBlocks.BLOCKS.register(eventBus);
        FFORFEntityTypes.ENTITY_TYPES.register(eventBus);
        FFORFItems.ITEMS.register(eventBus);
        FFORFSounds.SOUND_EVENTS.register(eventBus);

        GeckoLib.initialize();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        EntityRenderers.register(FFORFEntityTypes.CANDYSPIRIT.get(), CandyspiritRenderer::new);
        //EntityRenderers.register(FFORFEntityTypes.FRUITJELLYSLIME.get(), FruitjellyslimeRenderer::new);
        EntityRenderers.register(FFORFEntityTypes.PANHORN.get(), PanhornRenderer::new);
        EntityRenderers.register(FFORFEntityTypes.ROLLCAT.get(), RollcatRenderer::new);
        EntityRenderers.register(FFORFEntityTypes.TORTETOISE.get(), TortetoiseRenderer::new);
    }

    /*
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
     */
}
