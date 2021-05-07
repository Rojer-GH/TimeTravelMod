package de.rojer.timetravelmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.rojer.timetravelmod.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = TimeTravelMod.MODID)
public class TimeTravelMod {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static final String MODID = "timetravelmod";
	
	public TimeTravelMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		ItemInit.REGISTRY.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}

}
