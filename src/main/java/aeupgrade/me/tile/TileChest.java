package aeupgrade.me.tile;

import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.common.AppEngInternalInventory;
import aeupgrade.me.basetiles.TilePoweredBase;

// ISpecialInventory, 
public class TileChest extends TilePoweredBase
{

	public AppEngInternalInventory cellinv;
	public AppEngInternalInventory buffer;

	public TileChest() {
		cellinv = new AppEngInternalInventory( this, 1 );
		buffer = new AppEngInternalInventory( this, 1 );
		addDrops( cellinv );
		addDrops( buffer );
	}

	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT( tagCompound );

		try
		{
			if ( tagCompound.hasKey( "cell" ) )
			{
				NBTTagCompound src = tagCompound.getCompoundTag( "cell" );
				NBTTagCompound o = new NBTTagCompound();
				o.setTag( "#0", src );
				cellinv.readFromNBT( o );
			}
			else
			{
				cellinv.readFromNBT( tagCompound.getCompoundTag( "storagecell" ) );
			}
		}
		catch (Exception err)
		{
			err.printStackTrace();
		}

		try
		{
			buffer.readFromNBT( tagCompound.getCompoundTag( "buffer" ) );
		}
		catch (Exception err)
		{
			err.printStackTrace();
		}

	}

	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT( tagCompound );

		try
		{
			NBTTagCompound cellinventory = new NBTTagCompound();
			cellinv.writeToNBT( cellinventory );
			tagCompound.setTag( "storagecell", cellinventory );
		}
		catch (Exception err)
		{
			err.printStackTrace();
		}

		try
		{
			NBTTagCompound blockBuffer = new NBTTagCompound();
			buffer.writeToNBT( blockBuffer );
			tagCompound.setTag( "buffer", blockBuffer );
		}
		catch (Exception err)
		{
			err.printStackTrace();
		}

	}

}
