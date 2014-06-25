package aeupgrade.me.tile;

import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.common.AppEngInternalInventory;
import aeupgrade.me.basetiles.TileME;

public class TileSpatialIOPort extends TileME
{

	public AppEngInternalInventory item;

	public TileSpatialIOPort() {
		item = new AppEngInternalInventory( this, 2 );
		addDrops( item );
	}

	@Override
	public void writeToNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.writeToNBT( par1nbtTagCompound );
		NBTTagCompound c = new NBTTagCompound();
		item.writeToNBT( c );
		par1nbtTagCompound.setTag( "inv", c );
	}

	@Override
	public void readFromNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.readFromNBT( par1nbtTagCompound );
		NBTTagCompound c = par1nbtTagCompound.getCompoundTag( "inv" );
		item.readFromNBT( c );
	}

}
