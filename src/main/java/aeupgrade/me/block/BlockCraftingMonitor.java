package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockCraftingMonitor extends AppEngSubBlock 
{
    public BlockCraftingMonitor(AppEngMultiBlock mb,boolean en)
    {
        super(mb,en);
        unlocalizedName = "CraftingMonitor";
    }

	@Override
	public ItemStack getNewVersion() {
		return null;
	}
}
