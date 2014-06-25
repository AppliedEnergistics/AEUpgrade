package aeupgrade.tech1.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.tech1.tile.TileGrinder;
import appeng.api.AEApi;

public class BlockGrinder extends AppEngSubBlock {
	
	public BlockGrinder(AppEngMultiBlock mb, boolean enableGrinder) {
		super(mb,enableGrinder);
		unlocalizedName = "GrindStone";
	}
	
    @Override
    public TileEntity createNewTileEntity(World w)
    {
        return new TileGrinder();
    }
    
    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockGrindStone.stack(1);
	}
}
