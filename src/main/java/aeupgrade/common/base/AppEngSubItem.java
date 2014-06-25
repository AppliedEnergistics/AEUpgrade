package aeupgrade.common.base;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class AppEngSubItem
{

	protected String unlocalizedName;
	Item itemId;
	int metaData;

	public AppEngSubItem(AppEngMultiItem mi) {
		itemId = mi;
		unlocalizedName = "Untitled Item";
	}

	public boolean isItemType(ItemStack is)
	{
		if ( is == null )
			return false;
		return is.getItem() == itemId && is.getItemDamage() == metaData;
	}

	public ItemStack getItemStack()
	{
		return new ItemStack( itemId, 1, metaData );
	}

	public boolean onItemUse(ItemStack i, EntityPlayer player, World w, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		return false;
	}

	public void addInformation(ItemStack i, EntityPlayer p, List l, boolean b)
	{
	}

	public boolean isBlockNormalCube(World w, int x, int y, int z)
	{
		return true;
	}

	public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p)
	{
		return i;
	}
	
	public abstract ItemStack getNewVersion( ItemStack is );
}
