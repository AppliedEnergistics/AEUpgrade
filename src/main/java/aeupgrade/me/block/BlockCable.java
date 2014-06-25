package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import aeupgrade.common.base.AppEngMultiBlock;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockCable extends BlockCableBase 
{
	int colorOffset;
	
	private final static AEColor[] Colors = { AEColor.Blue, AEColor.Black, AEColor.White, AEColor.Brown, AEColor.Red, AEColor.Yellow, AEColor.Green };

    public BlockCable(AppEngMultiBlock mb, int colorOffset )
    {
        super(mb,true);
        this.colorOffset = colorOffset;
        unlocalizedName = "Cable";
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partCableGlass.stack( Colors[colorOffset], 1 );
	}
}
