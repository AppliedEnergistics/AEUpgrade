package aeupgrade.me.block;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TileAssembler;
import appeng.api.AEApi;

public class BlockAssembler extends AppEngSubBlock
{
    public BlockAssembler(AppEngMultiBlock mb, boolean enableMAC)
    {
        super(mb,enableMAC);
        unlocalizedName = "PatternProvider";
    }
    
    @Override
    public TileEntity createNewTileEntity(World w)
    {
        return new TileAssembler();
    }
    
    @Override
    public boolean hasTileEntity()
    {
        return true;
    }

	@Override
	public ItemStack getNewVersion() {
		return null;
	}
    
}
