package aeupgrade.me.block;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockInputCableBasic extends BlockCableBase {
	public BlockInputCableBasic(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "ImportBus";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partImportBus.stack(1);
	}
	
	public void getDrops(ArrayList<ItemStack> drops) {
		drops.add(AEApi.instance().parts().partCableGlass.stack(AEColor.Transparent, 1 ) );
	}
}
