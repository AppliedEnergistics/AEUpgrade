package aeupgrade.tech1.tile;

import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.common.AppEngInternalInventory;
import aeupgrade.common.base.AppEngTile;

public class TileGrinder extends AppEngTile
{

	public AppEngInternalInventory storage;

	public TileGrinder() {
		storage = new AppEngInternalInventory( this, 7 );
		addDrops( storage );
	}

	@Override
	public void readFromNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.readFromNBT( par1nbtTagCompound );

		NBTTagCompound stor = par1nbtTagCompound.getCompoundTag( "it" );
		if ( stor != null )
			storage.readFromNBT( stor );
	}

	@Override
	public void writeToNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.writeToNBT( par1nbtTagCompound );

		NBTTagCompound it = new NBTTagCompound();
		if ( storage != null )
			storage.writeToNBT( it );
		par1nbtTagCompound.setTag( "it", it );
	}

}
