package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockEnergyCell extends AppEngSubBlock
{

	public BlockEnergyCell(AppEngMultiBlock mb) {
		super(mb,true);
        unlocalizedName = "EnergyCell";
	}
	

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockEnergyCell.stack(1);
	}
}
