package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.common.base.AppEngSubItem;
import appeng.api.AEApi;

@Deprecated
public class ItemWirelessTerminal extends AppEngSubItem {

    public ItemWirelessTerminal(AppEngMultiItem mi)
    {
        super(mi);
        unlocalizedName = "WirelessTerminal";
    }

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemWirelessTerminal.stack(src.stackSize);
	}
}
