package aeupgrade.common.base;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class AppEngSubBlock
{

	private boolean isBlockEnabled = true;
	protected String unlocalizedName;
	protected int metaData;
	protected AppEngMultiBlock imb;

	public boolean isEnabled()
	{
		return isBlockEnabled;
	}

	public Block getBlockID()
	{
		return imb;
	}

	public int getMetaData()
	{
		return metaData;
	}

	public AppEngSubBlock(AppEngMultiBlock mb, boolean isEnabled) {
		unlocalizedName = "Untitled Block";
		imb = mb;
		metaData = mb.addSubBlock( this );
		isBlockEnabled = isEnabled;
	}

	public ItemStack getItemStack(int x)
	{
		return new ItemStack( imb, x, metaData );
	}

	public ItemStack getItemStack()
	{
		return new ItemStack( imb, 1, metaData );
	}

	public TileEntity createNewTileEntity(World w)
	{
		return null;
	}

	public boolean hasTileEntity()
	{
		return false;
	}
	
	public abstract ItemStack getNewVersion();

	public void getDrops(ArrayList<ItemStack> drops) {
		
	}

}
