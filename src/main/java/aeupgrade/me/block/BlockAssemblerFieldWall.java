package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;

public class BlockAssemblerFieldWall extends AppEngSubBlock {

	public BlockAssemblerFieldWall(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "AssemblerContainmentWall";
	}

	@Override
	public ItemStack getNewVersion() {
		return null;
	}
}
