package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockQuartzGlass extends AppEngSubBlock
{
	
	public BlockQuartzGlass(AppEngMultiBlock mb) {
		super(mb, true );
		unlocalizedName = "QuartzGlass";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuartzGlass.stack(1);
	}
}
