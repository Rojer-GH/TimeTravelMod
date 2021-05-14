package de.rojer.timetravelmod.common.items.blockitems;

import de.rojer.timetravelmod.core.init.BlockInit;
import de.rojer.timetravelmod.core.init.TabInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class HadeanObsidianBlockItem extends BlockItem {

	public HadeanObsidianBlockItem() {
		super(BlockInit.HADEAN_OBSIDIAN_BLOCK.get(), new Item.Properties().tab(TabInit.CORE_TAB));
	}

}
