package aeupgrade.tools;

import net.minecraft.item.ItemStack;
import aeupgrade.common.AppEngItem;
import aeupgrade.common.base.IAEItemOrBlock;
import appeng.api.AEApi;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolQuartzAxe extends AppEngItem implements IAEItemOrBlock
{

	String name;

	public toolQuartzAxe() {
		GameRegistry.registerItem( this, name = "AppEng.Tools.QuartzAxe" );
		setUnlocalizedName( name );
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemCertusQuartzAxe.stack(src.stackSize);
	}
}
