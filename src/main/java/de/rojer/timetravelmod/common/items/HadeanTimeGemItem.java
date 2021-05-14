package de.rojer.timetravelmod.common.items;

import de.rojer.timetravelmod.core.init.TabInit;
import net.minecraft.item.Item;

public class HadeanTimeGemItem extends Item{
	
	public static final String NAME = "hadean_time_gem";

	public HadeanTimeGemItem() {
		super(new Properties().tab(TabInit.CORE_TAB));
	}

}
