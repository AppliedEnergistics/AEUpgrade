package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileInterfaceBase;
import appeng.api.AEApi;

public class BlockInterface extends AppEngSubBlock
{
    public BlockInterface(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "Interface";
    }
    
    @Override
    public TileEntity createNewTileEntity(World w)
    {
    	return new TileInterfaceBase();
    }

    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockInterface.stack(1);
	}
}
