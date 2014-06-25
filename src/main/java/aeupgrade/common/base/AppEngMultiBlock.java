package aeupgrade.common.base;

import java.util.ArrayList;
import java.util.List;

import aeupgrade.common.AE1Texture;
import appeng.tile.AEBaseTile;
import appeng.util.Platform;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class AppEngMultiBlock extends BlockContainer implements IAEItemOrBlock
{

	private int subBlocks;
	private AppEngSubBlock[] SubBlocks;
	public static List<AppEngMultiBlock> multiBLocks = new ArrayList();

	public AppEngMultiBlock() {
		super( Material.iron );
		subBlocks = 0;
		SubBlocks = new AppEngSubBlock[16];
		setHardness( 1.9F );
		setResistance( 5.0F );

		multiBLocks.add( this );
	}
	
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_) {
	
	}
	
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return AE1Texture.QuestionBlock.getIcon();
	}
	
	@Override
	public Item getItem(World w, int x, int y, int z) {
		ItemStack myItem = new ItemStack( this, 1, w.getBlockMetadata(x, y, z) );
		ItemStack newVersion = getNewVersion( myItem );
		if ( newVersion == null ) return super.getItem(w, x, y, z);
		return newVersion.getItem();
	}
	
	@Override
	public int getDamageValue(World w, int x, int y, int z) {
		ItemStack myItem = new ItemStack( this, 1, w.getBlockMetadata(x, y, z) );
		ItemStack newVersion = getNewVersion( myItem );
		if ( newVersion == null ) return super.getDamageValue(w,x,y,z);
		return newVersion.getItemDamage();
	}

    public ArrayList<ItemStack> getDrops(World w, int x, int y, int z, int metadata, int fortune)
    {
    	ItemStack myItem = new ItemStack( this, 1, metadata );
		ItemStack newVersion = getNewVersion( myItem );
		
		if ( newVersion == null )
			return super.getDrops(w, x, y, z,metadata,fortune);
		
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(newVersion);
		return ret;
    }
    
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world,
			int x, int y, int z) {
		return super.getPickBlock(target, world, x, y, z);
	}
	
	int addSubBlock(AppEngSubBlock sb)
	{
		int metadata = subBlocks;
		SubBlocks[metadata] = sb;
		subBlocks++;
		return metadata;
	}

	public void registerBlock(String blockName)
	{
		GameRegistry.registerBlock( this, AppEngMultiItemBlock.class, blockName );
	}

	public boolean notValidBlock(int meta)
	{
		return meta < 0 || meta >= subBlocks;
	}

	public TileEntity createNewTileEntity(World world, int metadata)
	{
		return createTileEntity( world, metadata );
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		if ( notValidBlock( metadata ) )
		{
			return null;
		}

		if ( !SubBlocks[metadata].isEnabled() )
			return null;

		return SubBlocks[metadata].createNewTileEntity( world );
	}

	@Override
	public boolean hasTileEntity(int metadata)
	{
		if ( notValidBlock( metadata ) )
		{
			return false;
		}

		if ( !SubBlocks[metadata].isEnabled() )
			return false;

		return SubBlocks[metadata].hasTileEntity();
	}

	public AppEngTile getTile(IBlockAccess w, int x, int y, int z)
	{
			TileEntity te = w.getTileEntity( x, y, z );
			if ( te instanceof AppEngTile )
				return (AppEngTile) te;
		return null;
	}

	public AppEngSubBlock getSubBlock(int metadata)
	{
		if ( notValidBlock( metadata ) )
			return null;

		return SubBlocks[metadata];
	}

	public String getName(int itemDamage)
	{
		if ( notValidBlock( itemDamage ) )
			return "INVALID ITEM";
		return SubBlocks[itemDamage].unlocalizedName;
	}

	@Override
	public void breakBlock(World w, int x, int y, int z, Block a, int b)
	{
		AppEngTile te = getTile( w, x, y, z );
		if ( te != null )
		{
			ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
			te.getDrops( drops );
			if ( drops.size() > 0 )
				Platform.spawnDrops( w, x, y, z, drops );
		}

		dropExtraItem(w,x,y,z,b);
		super.breakBlock( w, x, y, z, a, b );
		
		if ( te != null )
			w.setTileEntity( x, y, z, null );
	}

	protected void dropExtraItem(World w, int x, int y, int z,int b) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		SubBlocks[b].getDrops( drops );
		if ( drops.size() > 0 )
			Platform.spawnDrops( w, x, y, z, drops );
	}

	public ItemStack getNewVersion(ItemStack entityItem) {
		ItemStack is = SubBlocks[entityItem.getItemDamage()].getNewVersion();
		if ( is != null )
			is.stackSize = entityItem.stackSize;
		return is;
	}

}
