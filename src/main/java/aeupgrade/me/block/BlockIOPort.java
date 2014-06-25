package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileIOPort;
import appeng.api.AEApi;

public class BlockIOPort extends AppEngSubBlock 
{
    public BlockIOPort(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "IOPort";
    }

    @Override
    public TileEntity createNewTileEntity(World w)
    {
        return new TileIOPort();
    }
    
    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockIOPort.stack(1);
	}
}
