package de.rojer.timetravelmod.common.items.blockitems;

import de.rojer.timetravelmod.core.init.BlockInit;
import de.rojer.timetravelmod.core.init.TabInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class HadeanPortalBlockItem extends BlockItem {

	public HadeanPortalBlockItem() {
		super(BlockInit.HADEAN_PORTAL_BLOCK.get(), new Item.Properties().tab(TabInit.CORE_TAB));
	}

}