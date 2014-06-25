package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockQuartz extends AppEngSubBlock
{
    public BlockQuartz(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "Quartz";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuartz.stack(1);
	}
}
