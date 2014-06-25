package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockPreformatter extends AppEngSubBlock
{
    public BlockPreformatter(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "Partitioner";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockCellWorkbench.stack(1);
	}
	
}
