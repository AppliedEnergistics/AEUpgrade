package aeupgrade.me.block;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileStorageMonitor;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockStorageMonitor extends AppEngSubBlock
{
    public BlockStorageMonitor(AppEngMultiBlock mb,boolean en)
    {
        super(mb,en);
        unlocalizedName = "StorageMonitor";
    }
    
    @Override
    public TileEntity createNewTileEntity(World w)
    {
        return new TileStorageMonitor();
    }
    
    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().parts().partStorageMonitor.stack(1);
	}
	
	public void getDrops(ArrayList<ItemStack> drops) {
		drops.add(AEApi.instance().parts().partCableGlass.stack(AEColor.Transparent, 1 ) );
	}
}
