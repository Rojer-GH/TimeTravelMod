package de.rojer.timetravelmod.common.items;

import de.rojer.timetravelmod.core.init.TabInit;
import net.minecraft.item.Item;

public class TimeGemItem extends Item{
	
	public static final String NAME = "time_gem";

	public TimeGemItem() {
		super(new Properties().tab(TabInit.CORE_TAB));
	}

}
