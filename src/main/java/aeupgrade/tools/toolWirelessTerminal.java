package aeupgrade.tools;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiChargeable;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.common.base.AppEngSubItem;
import appeng.api.AEApi;

public class toolWirelessTerminal extends AppEngSubItem
{
    String name;
    AppEngMultiChargeable mi;
    
    public toolWirelessTerminal(AppEngMultiItem mi)
    {
        super(mi);
        this.mi = (AppEngMultiChargeable)mi;
        unlocalizedName = "WirelessTerminal";
    }

	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemWirelessTerminal.stack(src.stackSize);
	}

}
