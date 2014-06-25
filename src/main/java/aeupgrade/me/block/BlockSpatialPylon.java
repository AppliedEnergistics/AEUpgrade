package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockSpatialPylon extends AppEngSubBlock {

	public BlockSpatialPylon(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "SpatialPylon";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockSpatialPylon.stack(1);
	}
}
