package aeupgrade.me.tile;

import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.common.AppEngInternalInventory;
import aeupgrade.me.basetiles.TileME;

public class TileCraftingTerminal extends TileME
{

	public AppEngInternalInventory craftMatrix;

	public TileCraftingTerminal() {
		craftMatrix = new AppEngInternalInventory( this, 3 * 3 );
		addDrops( craftMatrix );
	}

	@Override
	public void writeToNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.writeToNBT( par1nbtTagCompound );

		NBTTagCompound cm = new NBTTagCompound();
		craftMatrix.writeToNBT( cm );
		par1nbtTagCompound.setTag( "cm", cm );
	}

	@Override
	public void readFromNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.readFromNBT( par1nbtTagCompound );
		craftMatrix.readFromNBT( par1nbtTagCompound.getCompoundTag( "cm" ) );
	}

}
