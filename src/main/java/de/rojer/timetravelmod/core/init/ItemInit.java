package de.rojer.timetravelmod.core.init;

import de.rojer.timetravelmod.TimeTravelMod;
import de.rojer.timetravelmod.common.items.IronRodItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> REGISTRY;
	
	public static final RegistryObject<Item> IRON_ROD_ITEM;
	
	static {
		REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TimeTravelMod.MODID);
		
		IRON_ROD_ITEM = REGISTRY.register(IronRodItem.NAME, () -> new IronRodItem());
	}

}
