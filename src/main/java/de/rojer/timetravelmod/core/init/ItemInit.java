package de.rojer.timetravelmod.core.init;

import de.rojer.timetravelmod.TimeTravelMod;
import de.rojer.timetravelmod.common.items.IronRodItem;
import de.rojer.timetravelmod.common.items.TimeCoreItem;
import de.rojer.timetravelmod.common.items.TimeManipulatorItem;
import de.rojer.timetravelmod.common.items.TimeWandItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> REGISTRY;
	
	public static final RegistryObject<Item> IRON_ROD_ITEM;
	
	public static final RegistryObject<Item> TIME_CORE_ITEM;
	public static final RegistryObject<Item> TIME_MANIPULATOR_ITEM;
	public static final RegistryObject<Item> TIME_WAND_ITEM;
	
	static {
		REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TimeTravelMod.MODID);
		
		IRON_ROD_ITEM = REGISTRY.register(IronRodItem.NAME, () -> new IronRodItem());
		
		TIME_CORE_ITEM = REGISTRY.register(TimeCoreItem.NAME, () -> new TimeCoreItem());
		TIME_MANIPULATOR_ITEM = REGISTRY.register(TimeManipulatorItem.NAME, () -> new TimeManipulatorItem());
		TIME_WAND_ITEM = REGISTRY.register(TimeWandItem.NAME, () -> new TimeWandItem());
	}

}
