package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileSpatialIOPort;
import appeng.api.AEApi;

public class BlockSpatialIOPort extends AppEngSubBlock
{
    public BlockSpatialIOPort(AppEngMultiBlock mb, boolean enableSpatial)
    {
        super(mb,enableSpatial);
        unlocalizedName = "SpatialIOPort";
    }

    @Override
    public TileEntity createNewTileEntity(World w)
    {
        return new TileSpatialIOPort();
    }
    
    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockSpatialIOPort.stack(1);
	}
}
