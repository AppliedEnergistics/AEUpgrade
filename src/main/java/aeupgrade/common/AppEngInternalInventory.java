package aeupgrade.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class AppEngInternalInventory implements IInventory
{

	int size;
	int maxStack;

	protected ItemStack inv[];

	public boolean isEmpty()
	{
		for (int x = 0; x < getSizeInventory(); x++)
			if ( getStackInSlot( x ) != null )
				return false;
		return true;
	}

	public AppEngInternalInventory(Object something, int s) {
		size = s;
		maxStack = 64;
		inv = new ItemStack[s];
	}

	public void setMaxStackSize(int s)
	{
		maxStack = s;
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
			ItemStack split = getStackInSlot( var1 );
			ItemStack ns = null;

			if ( var2 >= split.stackSize )
			{
				ns = inv[var1];
				inv[var1] = null;
			}
			else
				ns = split.splitStack( var2 );

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

	}

	@Override
	public int getInventoryStackLimit()
	{
		return maxStack > 64 ? 64 : maxStack;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1)
	{
		return true;
	}

	public void writeToNBT(NBTTagCompound par1nbtTagCompound)
	{
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

	public void readFromNBT(NBTTagCompound par1nbtTagCompound)
	{
		for (int x = 0; x < size; x++)
		{
			try
			{
				NBTTagCompound c = par1nbtTagCompound.getCompoundTag( "#" + x );

				if ( c != null )
					inv[x] = ItemStack.loadItemStackFromNBT( c );

			}
			catch (Exception err)
			{
				err.printStackTrace();
			}
		}
	}

	@Override
	public int getSizeInventory()
	{
		return size;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack)
	{
		return true;
	}

	@Override
	public String getInventoryName()
	{
		return "inv";
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return false;
	}

	@Override
	public void markDirty()
	{

	}

	@Override
	public void openInventory()
	{

	}

	@Override
	public void closeInventory()
	{

	}
}
