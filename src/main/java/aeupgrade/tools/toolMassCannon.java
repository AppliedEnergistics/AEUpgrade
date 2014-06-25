package aeupgrade.tools;

import appeng.api.AEApi;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolMassCannon extends ElectricTool
{

	private String name;

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	public toolMassCannon() {
		setMaxStackSize( 1 );
		GameRegistry.registerItem( this, name = "AppEng.Tools.MassCannon" );
		setUnlocalizedName( name );
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		ItemStack out = AEApi.instance().items().itemMassCannon.stack(src.stackSize);
		out.setTagCompound(src.getTagCompound() );
		return out;
	}
}
