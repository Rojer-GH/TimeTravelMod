package de.rojer.timetravelmod.common.items;

import de.rojer.timetravelmod.core.init.TabInit;
import net.minecraft.item.Item;

public class TimeManipulatorItem extends Item{

	public static final String NAME = "time_manipulator";

	public TimeManipulatorItem() {
		super(new Properties().tab(TabInit.CORE_TAB));
	}
	
}
