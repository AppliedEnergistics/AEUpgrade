package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;

public class BlockQuartzLamp extends BlockQuartzGlass
{
	
	public BlockQuartzLamp(AppEngMultiBlock mb) {
		super(mb);
		unlocalizedName = "QuartzLamp";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuartzVibrantGlass.stack(1);
	}
}
