package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockCraftingAccelerator extends AppEngSubBlock  {
	
	public BlockCraftingAccelerator(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "CraftingCPU";
	}

	@Override
	public ItemStack getNewVersion() {
		return null;
	}
}
