package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;

public class BlockCraftingTerminal extends BlockTerminal {

	public BlockCraftingTerminal(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "CraftingTerminal";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partCraftingTerminal.stack(1);
	}
}
