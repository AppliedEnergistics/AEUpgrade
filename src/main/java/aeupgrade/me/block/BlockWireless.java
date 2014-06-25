package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileWireless;
import appeng.api.AEApi;

public class BlockWireless extends AppEngSubBlock 
{
    public BlockWireless(AppEngMultiBlock mb,boolean en)
    {
        super(mb,en);
        unlocalizedName = "WirelessAccessPoint";
    }
    
    @Override
    public TileEntity createNewTileEntity(World w)
    {
        return new TileWireless();
    }

    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockWireless.stack(1);
	}
}
