package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileDrive;
import appeng.api.AEApi;

public class BlockDrive extends AppEngSubBlock
{
    public BlockDrive(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "Drive";
    }

    @Override
    public TileEntity createNewTileEntity(World w)
    {
        return new TileDrive();
    }

    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockDrive.stack(1);
	}
}
