package aeupgrade.me.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import aeupgrade.me.basetiles.TileMEWInventory;

public class TileIOPort extends TileMEWInventory
{

	public TileIOPort() {
		super( 12 );
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

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1)
	{
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int var1, ItemStack var2)
	{
		return false;
	}

}
