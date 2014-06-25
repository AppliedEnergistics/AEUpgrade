package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockColorlessCable extends BlockCableBase
{
    public BlockColorlessCable(AppEngMultiBlock mb )
    {
        super(mb,true);
        unlocalizedName = "Cable";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partCableGlass.stack(AEColor.Transparent, 1);
	}
}
