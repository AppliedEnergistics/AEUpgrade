package aeupgrade.tools;

import net.minecraft.item.ItemStack;
import aeupgrade.common.AppEngItem;
import aeupgrade.common.base.IAEItemOrBlock;
import appeng.api.AEApi;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolQuartzWrench extends AppEngItem implements IAEItemOrBlock
{

	String name;

	public toolQuartzWrench() {
		GameRegistry.registerItem( this, name = "AppEng.Tools.QuartzWrench" );
		setUnlocalizedName( name );
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	@Override
	public int getItemStackLimit()
	{
		return 1;
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemCertusQuartzWrench.stack(src.stackSize);
	}
}
