package com.suscord.fightforfeast;

import com.mojang.logging.LogUtils;
import com.suscord.fightforfeast.block.FFORFBlocks;
import com.suscord.fightforfeast.client.renderer.entity.ButteredghostRenderer;
import com.suscord.fightforfeast.entity.FFORFEntityTypes;
import com.suscord.fightforfeast.client.renderer.entity.RollcatRenderer;
import com.suscord.fightforfeast.item.FFORFItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FightforFeast.MOD_ID)
public class FightforFeast
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "fightforfeast";

    public FightforFeast()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::clientSetup);

        FFORFEntityTypes.register(eventBus);
        FFORFItems.register(eventBus);
        FFORFBlocks.register(eventBus);

        GeckoLib.initialize();


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        EntityRenderers.register(FFORFEntityTypes.BUTTEREDGHOST.get(), ButteredghostRenderer::new);
        //EntityRenderers.register(FFORFEntityTypes.FRUITJELLYSLIME.get(), FruitjellyslimeRenderer::new);
        EntityRenderers.register(FFORFEntityTypes.ROLLCAT.get(), RollcatRenderer::new);
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
