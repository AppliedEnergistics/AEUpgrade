package aeupgrade.tools;

import net.minecraft.item.ItemStack;
import aeupgrade.common.AppEngItem;
import aeupgrade.common.base.IAEItemOrBlock;
import appeng.api.AEApi;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolQuartzHoe extends AppEngItem implements IAEItemOrBlock
{

	String name;

	public toolQuartzHoe() {
		GameRegistry.registerItem( this, name = "AppEng.Tools.QuartzHoe" );
		setUnlocalizedName( name );
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemCertusQuartzHoe.stack(src.stackSize);
	}
}