package de.rojer.timetravelmod.common.groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CoreItemGroup extends ItemGroup{

	public static final String ITEM_GROUP_NAME = "TTM:Core";
	
	public CoreItemGroup() {
		super(ITEM_GROUP_NAME);
	}

	@Override
	public ItemStack makeIcon() {
		return Items.ACACIA_BOAT.getDefaultInstance();
	}

}
