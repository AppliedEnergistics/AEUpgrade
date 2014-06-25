package aeupgrade.me.basetiles;

import java.util.List;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract class TileMEWInventory extends TileME implements IInventory
{

	private int size;

	protected ItemStack inv[];

	@Override
	public void getDrops(List<ItemStack> out) {
		for ( ItemStack is : inv )
		{
			if ( is != null)
				out.add(is);
		}
	}

	// will not expand a inventory..
	protected void setInventorySize(int p)
	{
		if ( inv.length > p )
		{
			size = p;
		}
	}

	public TileMEWInventory(int s) {
		size = s;
		inv = new ItemStack[s];
	}

	@Override
	public ItemStack getStackInSlot(int var1)
	{
		return inv[var1];
	}

	@Override
	public ItemStack decrStackSize(int var1, int var2)
	{
		if ( inv[var1] != null )
		{
			ItemStack is = getStackInSlot( var1 );
			ItemStack ns = null;

			if ( is.stackSize <= var2 )
			{
				ns = is;
				inv[var1] = null;
			}
			else
			{
				ns = is.splitStack( var2 );
			}

			this.worldObj.markBlockForUpdate( xCoord, yCoord, zCoord );
			return ns;
		}

		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1)
	{
		return null;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2)
	{
		inv[var1] = var2;
		// this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public void writeToNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.writeToNBT( par1nbtTagCompound );

		for (int x = 0; x < size; x++)
		{
			try
			{
				NBTTagCompound c = new NBTTagCompound();

				if ( inv[x] != null )
				{
					inv[x].writeToNBT( c );
				}

				par1nbtTagCompound.setTag( "#" + x, c );
			}
			catch (Exception err)
			{
			}
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.readFromNBT( par1nbtTagCompound );

		for (int x = 0; x < size; x++)
		{
			try
			{
				NBTTagCompound c = par1nbtTagCompound.getCompoundTag( "#" + x );

				if ( c != null )
				{
					inv[x] = ItemStack.loadItemStackFromNBT( c );
				}
			}
			catch (Exception err)
			{
			}
		}
	}

	@Override
	public int getSizeInventory()
	{
		return size;
	}
}
