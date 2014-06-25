package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockMatrixFrame extends AppEngSubBlock
{

	public BlockMatrixFrame(AppEngMultiBlock mb) {
		super(mb,true);
		unlocalizedName = "MatrixFrame";
	}

	@Override
	public ItemStack getNewVersion() {
		return null;
	}
};
