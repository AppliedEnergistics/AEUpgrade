package aeupgrade.me.block;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockTerminal extends AppEngSubBlock
{

    public BlockTerminal(AppEngMultiBlock mb,boolean en)
    {
        super(mb,en);
        unlocalizedName = "Terminal";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partTerminal.stack(1);
	}

	public void getDrops(ArrayList<ItemStack> drops) {
		drops.add(AEApi.instance().parts().partCableGlass.stack(AEColor.Transparent, 1 ) );
	}

}
