package aeupgrade.me.tile;

import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.common.AppEngInternalInventory;
import aeupgrade.me.basetiles.TilePoweredBase;

public class TilePowerRelay extends TilePoweredBase
{

	AppEngInternalInventory inv;

	public TilePowerRelay() {
		inv = new AppEngInternalInventory( this, 2 );
		addDrops( inv );
	}

	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT( tagCompound );
		NBTTagCompound invnbt = new NBTTagCompound();
		inv.writeToNBT( invnbt );
		tagCompound.setTag( "inv", invnbt );
	}

	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT( tagCompound );
		inv.readFromNBT( tagCompound.getCompoundTag( "inv" ) );
	}

}
