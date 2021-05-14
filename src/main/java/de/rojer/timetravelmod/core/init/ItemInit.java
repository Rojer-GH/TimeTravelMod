package de.rojer.timetravelmod.core.init;

import de.rojer.timetravelmod.TimeTravelMod;
import de.rojer.timetravelmod.common.blocks.HadeanGlowstoneBlock;
import de.rojer.timetravelmod.common.blocks.HadeanObsidianBlock;
import de.rojer.timetravelmod.common.blocks.HadeanPortalBlock;
import de.rojer.timetravelmod.common.items.HadeanTimeGemItem;
import de.rojer.timetravelmod.common.items.IronRodItem;
import de.rojer.timetravelmod.common.items.TimeGemItem;
import de.rojer.timetravelmod.common.items.TimeManipulatorItem;
import de.rojer.timetravelmod.common.items.TimeWandItem;
import de.rojer.timetravelmod.common.items.blockitems.HadeanGlowstoneBlockItem;
import de.rojer.timetravelmod.common.items.blockitems.HadeanObsidianBlockItem;
import de.rojer.timetravelmod.common.items.blockitems.HadeanPortalBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> REGISTRY;
	
	public static final RegistryObject<Item> IRON_ROD_ITEM;
	
	public static final RegistryObject<Item> TIME_GEM_ITEM;
	public static final RegistryObject<Item> TIME_MANIPULATOR_ITEM;
	public static final RegistryObject<Item> TIME_WAND_ITEM;
	
	public static final RegistryObject<Item> HADEAN_TIME_GEM_ITEM;
	
	public static final RegistryObject<BlockItem> HADEAN_GLOWSTONE_BLOCK_ITEM;
	public static final RegistryObject<BlockItem> HADEAN_OBSIDIAN_BLOCK_ITEM;
	public static final RegistryObject<BlockItem> HADEAN_PORTAL_BLOCK_ITEM;
	
	static {
		REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TimeTravelMod.MODID);
		
		IRON_ROD_ITEM = REGISTRY.register(IronRodItem.NAME, () -> new IronRodItem());
		
		TIME_GEM_ITEM = REGISTRY.register(TimeGemItem.NAME, () -> new TimeGemItem());
		TIME_MANIPULATOR_ITEM = REGISTRY.register(TimeManipulatorItem.NAME, () -> new TimeManipulatorItem());
		TIME_WAND_ITEM = REGISTRY.register(TimeWandItem.NAME, () -> new TimeWandItem());
		
		HADEAN_TIME_GEM_ITEM = REGISTRY.register(HadeanTimeGemItem.NAME, () -> new HadeanTimeGemItem());
		
		HADEAN_GLOWSTONE_BLOCK_ITEM = REGISTRY.register(HadeanGlowstoneBlock.NAME, () -> new HadeanGlowstoneBlockItem());
		HADEAN_OBSIDIAN_BLOCK_ITEM = REGISTRY.register(HadeanObsidianBlock.NAME, () -> new HadeanObsidianBlockItem());
		HADEAN_PORTAL_BLOCK_ITEM = REGISTRY.register(HadeanPortalBlock.NAME, () -> new HadeanPortalBlockItem());
	}

}
