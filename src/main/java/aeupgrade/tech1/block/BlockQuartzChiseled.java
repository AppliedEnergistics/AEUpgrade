package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockQuartzChiseled extends AppEngSubBlock
{
    public BlockQuartzChiseled(AppEngMultiBlock mb )
    {
        super(mb,true);
        unlocalizedName = "QuartzChiseled";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuartzChiseled.stack(1);
	}
}
