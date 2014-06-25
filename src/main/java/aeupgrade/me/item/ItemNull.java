package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.common.base.AppEngSubItem;
import appeng.api.AEApi;

public class ItemNull extends AppEngSubItem
{
    public ItemNull(AppEngMultiItem id)
    {
        super(id);
        unlocalizedName = "Null Item";
    }

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return null;
	}
}
