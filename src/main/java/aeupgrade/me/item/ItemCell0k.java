package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.common.base.AppEngSubItem;
import appeng.api.AEApi;

public class ItemCell0k extends AppEngSubItem
{
	
	public ItemCell0k(AppEngMultiItem mi)
    {
        super(mi);
        unlocalizedName = "0k";
    }

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		ItemStack out = AEApi.instance().items().itemCellCreative.stack(src.stackSize);
		out.setTagCompound(src.getTagCompound() );
		return out;
	}
	
}
