package aeupgrade.tools;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import aeupgrade.common.AppEngItem;
import appeng.api.AEApi;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolEntropyAccelerator extends AppEngItem
{

	String name;
	int operationPowerCost = 800;

	public toolEntropyAccelerator() {
		setMaxStackSize( 1 );
		GameRegistry.registerItem( this, name = "AppEng.Tools.EntropyAccelerator" );
		setUnlocalizedName( name );
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	@Override
	public boolean hitEntity(ItemStack item, EntityLivingBase hitter, EntityLivingBase target)
	{
		return false;
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemEntropyManipulator.stack(src.stackSize);
	}
}
