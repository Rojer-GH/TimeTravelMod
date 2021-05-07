package de.rojer.timetravelmod.common.items;

import de.rojer.timetravelmod.core.init.TabInit;
import net.minecraft.item.Item;

public class IronRodItem extends Item{
	
	public static final String NAME = "iron_rod";

	public IronRodItem() {
		super(new Properties().tab(TabInit.CORE_TAB));
	}

}
