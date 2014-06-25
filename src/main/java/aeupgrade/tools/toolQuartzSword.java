package aeupgrade.tools;

import net.minecraft.item.ItemStack;
import aeupgrade.common.AppEngItem;
import aeupgrade.common.base.IAEItemOrBlock;
import appeng.api.AEApi;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolQuartzSword extends AppEngItem implements IAEItemOrBlock
{

	String name;

	public toolQuartzSword() {
		GameRegistry.registerItem( this, name = "AppEng.Tools.QuartzSword" );
		setUnlocalizedName( name );
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemCertusQuartzSword.stack(src.stackSize);
	}
}
