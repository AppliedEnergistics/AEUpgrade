package aeupgrade.me.tile;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.common.AppEngInternalInventory;
import aeupgrade.common.base.AppEngTile;

public class TileCondenser extends AppEngTile
{

	public AppEngInternalInventory output;
	public AppEngInternalInventory cell;
	public AppEngInternalInventory Installed;

	public TileCondenser() {
		output = new AppEngInternalInventory( this, 1 );
		cell = new AppEngInternalInventory( this, 1 );
		Installed = new AppEngInternalInventory( this, 1 );
		addDrops( output );
		addDrops( Installed );
		addDrops( cell );
	}

	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT( tagCompound );
		NBTTagCompound invnbt = new NBTTagCompound();
		output.writeToNBT( invnbt );
		NBTTagCompound cellnbt = new NBTTagCompound();
		cell.writeToNBT( cellnbt );
		NBTTagCompound cellInstalledTag = new NBTTagCompound();
		if ( Installed.getStackInSlot( 0 ) != null )
			Installed.getStackInSlot( 0 ).writeToNBT( cellInstalledTag );
		tagCompound.setTag( "output", invnbt );
		tagCompound.setTag( "cell", cellnbt );
		tagCompound.setTag( "installed", cellInstalledTag );
	}

	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT( tagCompound );
		output.readFromNBT( tagCompound.getCompoundTag( "output" ) );
		cell.readFromNBT( tagCompound.getCompoundTag( "cell" ) );
		Installed.setInventorySlotContents( 0, ItemStack.loadItemStackFromNBT( tagCompound.getCompoundTag( "installed" ) ) );
	}

}
