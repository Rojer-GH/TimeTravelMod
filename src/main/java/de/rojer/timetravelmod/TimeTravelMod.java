package de.rojer.timetravelmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = TimeTravelMod.MODID)
public class TimeTravelMod {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static final String MODID = "timetravelmod";
	
	public TimeTravelMod() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}

}
