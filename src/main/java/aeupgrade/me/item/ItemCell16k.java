package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import appeng.api.AEApi;

public class ItemCell16k extends ItemCell1k
{
    public ItemCell16k(AppEngMultiItem id)
    {
        super(id);
        unlocalizedName = "16k";
    }
	
	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		ItemStack out = AEApi.instance().items().itemCell16k.stack(src.stackSize);
		out.setTagCompound(src.getTagCompound() );
		return out;
	}
}
