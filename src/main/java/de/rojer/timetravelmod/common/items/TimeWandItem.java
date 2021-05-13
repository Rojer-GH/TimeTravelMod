package de.rojer.timetravelmod.common.items;

import de.rojer.timetravelmod.core.init.TabInit;
import net.minecraft.item.Item;

public class TimeWandItem extends Item {

	public static final String NAME = "time_wand";

	public TimeWandItem() {
		super(new Properties().tab(TabInit.CORE_TAB));
	}
	
}
