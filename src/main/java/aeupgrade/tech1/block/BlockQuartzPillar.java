package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockQuartzPillar extends AppEngSubBlock
{

	public BlockQuartzPillar(AppEngMultiBlock mb) {
		super( mb, true );
		unlocalizedName = "QuartzPillar";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuartzPiller.stack(1);
	}
}
