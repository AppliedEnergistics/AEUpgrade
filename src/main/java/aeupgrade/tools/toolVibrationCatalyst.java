package aeupgrade.tools;

import appeng.api.AEApi;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolVibrationCatalyst extends ElectricTool
{

	String name;

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	public toolVibrationCatalyst() {
		setMaxStackSize( 1 );
		GameRegistry.registerItem( this, name = "AppEng.Tools.VibrationCatalyst" );
		setUnlocalizedName( name );
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemEntropyManipulator.stack(src.stackSize);
	}
}
