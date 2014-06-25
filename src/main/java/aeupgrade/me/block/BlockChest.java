package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileChest;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockChest extends AppEngSubBlock 
{
    public BlockChest(AppEngMultiBlock mb)
    {
        super(mb,true);
        unlocalizedName = "Chest";
    }

    @Override
    public boolean hasTileEntity()
    {
        return true;
    }
    
    @Override
    public TileEntity createNewTileEntity(World world)
    {
        return new TileChest();
    }
    
	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockChest.stack(1);
	}
}
