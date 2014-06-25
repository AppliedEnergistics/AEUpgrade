package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;

public class BlockStorageBus extends BlockCableBase {
	
	public BlockStorageBus(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "StorageBus";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partStorageBus.stack(1);
	}
}
