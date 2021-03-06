package de.rojer.timetravelmod.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class HadeanPortalBlock extends Block {

	public static final String NAME = "hadean_portal";
	
	public HadeanPortalBlock() {
		super(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
				.strength(10.0F, 1200.0F)
				.harvestLevel(3).harvestTool(ToolType.PICKAXE)
				.requiresCorrectToolForDrops()
				.lightLevel((value) -> { return 15; }));
	}
	
}
