package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import appeng.api.AEApi;

public class ItemSpatialCell16 extends ItemSpatialCell2
{
	public ItemSpatialCell16(AppEngMultiItem mi)
    {
        super(mi);
        unlocalizedName = "Spatial16Dim";
    }

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemSpatialCell16.stack(src.stackSize);
	}
}
