package aeupgrade.tools;

import net.minecraft.item.ItemStack;
import aeupgrade.common.AppEngItem;
import aeupgrade.common.base.IAEItemOrBlock;
import appeng.api.AEApi;
import cpw.mods.fml.common.registry.GameRegistry;

public class toolQuartzCuttingKnife extends AppEngItem implements IAEItemOrBlock
{

	String name;

	public toolQuartzCuttingKnife() {
		GameRegistry.registerItem( this, name = "AppEng.Tools.QuartzCuttingKnife" );
		setUnlocalizedName( name );
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return name;
	}

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemCertusQuartzKnife.stack(src.stackSize);
	}
}
