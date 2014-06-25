package aeupgrade.me.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.common.AppEngInternalInventory;
import aeupgrade.me.basetiles.TileMEWInventory;

public class TileInterfaceBase extends TileMEWInventory
{

	public AppEngInternalInventory Crafting;
	public AppEngInternalInventory Exports;

	@Override
	public ItemStack decrStackSize(int var1, int var2)
	{
		ItemStack o = super.decrStackSize( var1, var2 );
		return o;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2)
	{
		super.setInventorySlotContents( var1, var2 );
	}

	public TileInterfaceBase() {
		super( 8 );
		Crafting = new AppEngInternalInventory( this, 9 );
		Exports = new AppEngInternalInventory( this, 8 );
		addDrops( Crafting );
		addDrops( Exports );
	}

	@Override
	public void writeToNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.writeToNBT( par1nbtTagCompound );
		par1nbtTagCompound.setBoolean( "r1", true );
		NBTTagCompound c = new NBTTagCompound();
		NBTTagCompound e = new NBTTagCompound();
		Crafting.writeToNBT( c );
		Exports.writeToNBT( e );
		par1nbtTagCompound.setTag( "cr", c );
		par1nbtTagCompound.setTag( "ex", e );
	}

	@Override
	public void readFromNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.readFromNBT( par1nbtTagCompound );
		Crafting.readFromNBT( par1nbtTagCompound.getCompoundTag( "cr" ) );
		Exports.readFromNBT( par1nbtTagCompound.getCompoundTag( "ex" ) );
	}

	@Override
	public String getInventoryName()
	{
		return "";
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return false;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1)
	{
		return false;
	}

	@Override
	public void openInventory()
	{

	}

	@Override
	public void closeInventory()
	{

	}

	@Override
	public boolean isItemValidForSlot(int var1, ItemStack var2)
	{
		return false;
	}

}
