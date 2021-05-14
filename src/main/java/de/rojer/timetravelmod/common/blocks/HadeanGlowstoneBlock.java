package de.rojer.timetravelmod.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class HadeanGlowstoneBlock extends Block {

	public static final String NAME = "hadean_glowstone";
	
	public HadeanGlowstoneBlock() {
		super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
				.strength(5.0F, 1200.0F)
				.harvestLevel(3).harvestTool(ToolType.PICKAXE)
				.requiresCorrectToolForDrops()
				.sound(SoundType.GLASS)
				.lightLevel((value -> { return 15; })));
	}

}
