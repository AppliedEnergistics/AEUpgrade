package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockQuantumRing extends AppEngSubBlock 
{
    public BlockQuantumRing(AppEngMultiBlock mb,boolean en )
    {
        super(mb,en);
        unlocalizedName = "QuantumRing";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockQuantumRing.stack(1);
	}
}
