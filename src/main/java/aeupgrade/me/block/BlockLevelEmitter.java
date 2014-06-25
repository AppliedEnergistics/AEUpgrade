package aeupgrade.me.block;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockLevelEmitter extends BlockCableBase {
	public BlockLevelEmitter(AppEngMultiBlock mb,boolean en) {
		super(mb,en);
        unlocalizedName = "LevelEmitter";
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partLevelEmitter.stack(1);
	}
	
	public void getDrops(ArrayList<ItemStack> drops) {
		drops.add(AEApi.instance().parts().partCableGlass.stack(AEColor.Transparent, 1 ) );
	}
}
