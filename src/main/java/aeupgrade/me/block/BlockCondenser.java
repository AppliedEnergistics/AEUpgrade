package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileCondenser;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockCondenser extends AppEngSubBlock
{

	public BlockCondenser(AppEngMultiBlock mb) {
		super(mb,true);
        unlocalizedName = "Condenser";
	}

	
	@Override
	public boolean hasTileEntity() {
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World w) {
		return new TileCondenser();
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockCondenser.stack(1);
	}
}
