package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockController extends AppEngSubBlock
{
    public BlockController(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "Controller";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockController.stack(1);
	}
}
