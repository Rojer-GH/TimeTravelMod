package de.rojer.timetravelmod.core.init;

import de.rojer.timetravelmod.TimeTravelMod;
import de.rojer.timetravelmod.common.blocks.HadeanGlowstoneBlock;
import de.rojer.timetravelmod.common.blocks.HadeanObsidianBlock;
import de.rojer.timetravelmod.common.blocks.HadeanPortalBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> REGISTRY;
	
	public static final RegistryObject<Block> HADEAN_GLOWSTONE_BLOCK;
	public static final RegistryObject<Block> HADEAN_OBSIDIAN_BLOCK;
	public static final RegistryObject<Block> HADEAN_PORTAL_BLOCK;
	
	static {
		REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TimeTravelMod.MODID);
		
		HADEAN_GLOWSTONE_BLOCK = REGISTRY.register(HadeanGlowstoneBlock.NAME, () -> new HadeanGlowstoneBlock());
		HADEAN_OBSIDIAN_BLOCK = REGISTRY.register(HadeanObsidianBlock.NAME, () -> new HadeanObsidianBlock());
		HADEAN_PORTAL_BLOCK = REGISTRY.register(HadeanPortalBlock.NAME, () -> new HadeanPortalBlock());
	}
	
}
