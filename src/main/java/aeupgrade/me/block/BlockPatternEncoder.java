package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockPatternEncoder extends AppEngSubBlock
{
    public BlockPatternEncoder(AppEngMultiBlock mb,boolean en)
    {
        super(mb,en);
        unlocalizedName = "PatternEncoder";
    }

	@Override
	public ItemStack getNewVersion() {
		return null;
	}
}
