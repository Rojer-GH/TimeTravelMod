package de.rojer.timetravelmod.common.tabs;

import de.rojer.timetravelmod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CoreTab extends ItemGroup{

	public static final String NAME = "core";
	
	public CoreTab() {
		super(NAME);
	}

	@Override
	public ItemStack makeIcon() {
		return ItemInit.TIME_MANIPULATOR_ITEM.get().getDefaultInstance();
	}

}
