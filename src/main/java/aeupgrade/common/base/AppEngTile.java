package aeupgrade.common.base;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public abstract class AppEngTile extends TileEntity
{
	List<IInventory> inv = new ArrayList();
	
	public void getDrops( List<ItemStack> out )
	{
		for ( IInventory i : inv )
		{
			for ( int x = 0; x < i.getSizeInventory(); x++ )
			{
				ItemStack is = i.getStackInSlot(x);
				if ( is != null )
					out.add(is);
			}
		}
	}
	
    protected void addDrops(IInventory st) {
    	inv.add(st);
	}

    @Override
    public void writeToNBT(NBTTagCompound par1nbtTagCompound) {
    	try
    	{
	    	super.writeToNBT(par1nbtTagCompound);
    	}
    	catch( Exception err ) {}
    }
    
    @Override
    public void readFromNBT(NBTTagCompound par1nbtTagCompound) {
    	try
    	{
	    	super.readFromNBT(par1nbtTagCompound);
    	}
    	catch( Exception err ) {}
    }

}
