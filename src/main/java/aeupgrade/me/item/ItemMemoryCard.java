package aeupgrade.me.item;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.common.base.AppEngSubItem;
import appeng.api.AEApi;

public class ItemMemoryCard extends AppEngSubItem 
{
	
    public ItemMemoryCard(AppEngMultiItem id)
    {
        super(id);
        unlocalizedName = "MemoryCard";
    }
	
	@Override
	public ItemStack getNewVersion( ItemStack src ) {
		return AEApi.instance().items().itemMemoryCard.stack(src.stackSize);
	}
    
}
