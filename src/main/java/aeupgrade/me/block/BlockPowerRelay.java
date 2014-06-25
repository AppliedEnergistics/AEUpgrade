package aeupgrade.me.block;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngSubBlock;
import aeupgrade.me.tile.TilePowerRelay;
import appeng.api.AEApi;
import appeng.api.util.AEColor;

public class BlockPowerRelay extends AppEngSubBlock 
{

	public BlockPowerRelay(AppEngMultiBlock mb) {
		super(mb,true);
		unlocalizedName="PowerRelay";
	}

	@Override
	public boolean hasTileEntity() {
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World w) {
		return new TilePowerRelay();
	}

	@Override
	public ItemStack getNewVersion() {
		return AEApi.instance().blocks().blockEnergyAcceptor.stack(1);
	}
	
	public void getDrops(ArrayList<ItemStack> drops) {
		drops.add(AEApi.instance().parts().partQuartzFiber.stack(1));
	}
}
