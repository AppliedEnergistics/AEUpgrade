package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockQuantumLinkChamber extends AppEngSubBlock 
{
    public BlockQuantumLinkChamber(AppEngMultiBlock mb,boolean en )
    {
        super(mb,en);
        unlocalizedName = "QuantumLink";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuantumLink.stack(1);
	}
}
