package aeupgrade.me.block;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockOutputCableBasic extends BlockCableBase {
	
	public BlockOutputCableBasic(AppEngMultiBlock mb, boolean enabled) {
		super(mb,enabled);
        unlocalizedName = "ExportBus";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partExportBus.stack(1);
	}
	
	public void getDrops(ArrayList<ItemStack> drops) {
		drops.add(AEApi.instance().parts().partCableGlass.stack(AEColor.Transparent, 1 ) );
	}
}
