package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockHeatVent extends AppEngSubBlock  {

	public BlockHeatVent(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "HeatVent";
	}

	@Override
	public ItemStack getNewVersion() {
		return null;
	}
}
