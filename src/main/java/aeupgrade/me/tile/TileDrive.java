package aeupgrade.me.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import aeupgrade.me.basetiles.TileMEWInventory;

/*
 * put blinking lights onto a special render that can update using network packets, instead of block updates.
 */
public class TileDrive extends TileMEWInventory
{

	public TileDrive() {
		super( 10 );
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer)
	{
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack)
	{
		return false;
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
	public void openInventory()
	{

	}

	@Override
	public void closeInventory()
	{

	}

}
