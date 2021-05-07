package de.rojer.timetravelmod.common.tabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CoreTab extends ItemGroup{

	public static final String NAME = "core";
	
	public CoreTab() {
		super(NAME);
	}

	@Override
	public ItemStack makeIcon() {
		return Items.ACACIA_BOAT.getDefaultInstance();
	}

}
