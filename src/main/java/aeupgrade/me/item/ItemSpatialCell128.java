package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import appeng.api.AEApi;

public class ItemSpatialCell128 extends ItemSpatialCell2
{
	
	public ItemSpatialCell128(AppEngMultiItem mi)
    {
        super(mi);
        unlocalizedName = "Spatial128Dim";
    }

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemSpatialCell128.stack(src.stackSize);
	}

}
