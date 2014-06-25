package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import appeng.api.AEApi;

public class ItemCell4k extends ItemCell1k
{
    public ItemCell4k(AppEngMultiItem id)
    {
        super(id);
        unlocalizedName = "4k";
    }	
	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		ItemStack out = AEApi.instance().items().itemCell4k.stack(src.stackSize);
		out.setTagCompound(src.getTagCompound() );
		return out;
	}
    
}
