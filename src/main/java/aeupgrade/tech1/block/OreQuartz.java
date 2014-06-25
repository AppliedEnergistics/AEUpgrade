package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class OreQuartz extends AppEngSubBlock
{
    public OreQuartz(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "OreQuartz";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuartzOre.stack(1);
	}
}
