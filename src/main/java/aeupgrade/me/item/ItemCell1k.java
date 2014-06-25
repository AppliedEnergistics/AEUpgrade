package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.common.base.AppEngSubItem;
import appeng.api.AEApi;

public class ItemCell1k extends AppEngSubItem
{
    
	public ItemCell1k(AppEngMultiItem mi)
    {
        super(mi);
        unlocalizedName = "1k";
    }
	
	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		ItemStack out = AEApi.instance().items().itemCell1k.stack(src.stackSize);
		out.setTagCompound(src.getTagCompound() );
		return out;
	}
}
