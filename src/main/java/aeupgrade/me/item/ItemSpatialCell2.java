package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.common.base.AppEngSubItem;
import appeng.api.AEApi;

public class ItemSpatialCell2 extends AppEngSubItem 
{
	public ItemSpatialCell2(AppEngMultiItem mi)
    {
        super(mi);
        unlocalizedName = "Spatial2Dim";
    }

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemSpatialCell2.stack(src.stackSize);
	}
}
