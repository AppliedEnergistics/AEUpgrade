package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import appeng.api.AEApi;

public class ItemCell64k extends ItemCell1k
{
    public ItemCell64k(AppEngMultiItem id)
    {
        super(id);
        unlocalizedName = "64k";
    }
	
	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		ItemStack out = AEApi.instance().items().itemCell64k.stack(src.stackSize);
		out.setTagCompound(src.getTagCompound() );
		return out;
	}
	
}
