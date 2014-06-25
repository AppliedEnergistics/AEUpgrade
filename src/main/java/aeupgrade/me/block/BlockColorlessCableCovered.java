package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockColorlessCableCovered extends BlockCableBase
{
    public BlockColorlessCableCovered(AppEngMultiBlock mb )
    {
        super(mb,true);
        unlocalizedName = "CoveredCable";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partCableCovered.stack(AEColor.Transparent, 1);
	}
}
