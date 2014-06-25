package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import appeng.api.AEApi;

public class BlockPhantom extends AppEngSubBlock
{

	public BlockPhantom(AppEngMultiBlock mb) {
		super(mb,true);
		unlocalizedName = "PhantomBlock";
	}
	
	
	@Override
	public boolean hasTileEntity() {
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World w) {
		return null;
	}
	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockCrankHandle.stack(1);
	}
	
};
