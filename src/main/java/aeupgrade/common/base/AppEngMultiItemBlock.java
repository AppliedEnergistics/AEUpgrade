package aeupgrade.common.base;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import aeupgrade.api.IColoredMETile;

public class AppEngMultiItemBlock extends ItemBlock implements IAEItemOrBlock
{

	public AppEngMultiItemBlock(Block arg0) {
		super( arg0 );
		setHasSubtypes( true );
		setMaxDamage( 0 );
		setHasSubtypes( true );
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack)
	{
		String Extra = "";

		// colored blocks...
		Block blk = Block.getBlockFromItem( itemstack.getItem() );
		if ( ((AppEngMultiBlock) (blk)).getSubBlock( itemstack.getItemDamage() ) instanceof IColoredMETile )
		{
			Extra = " - "
					+ ("" + StatCollector.translateToLocal( "AppEng.Colors."
							+ IColoredMETile.Colors[((IColoredMETile) ((AppEngMultiBlock) blk).getSubBlock( itemstack.getItemDamage() )).getColor()] ));
		}

		return super.getItemStackDisplayName( itemstack ) + Extra;
	}

	@Override
	public String getUnlocalizedName()
	{
		return "AppEng.Blocks.*";
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		Block blk = Block.getBlockFromItem( itemstack.getItem() );
		return "AppEng.Blocks." + ((AppEngMultiBlock) (blk)).getName( itemstack.getItemDamage() );
	}

	@Override
	public int getMetadata(int dv)
	{
		return dv;
	}
	
	@Override
	public boolean hasCustomEntity(ItemStack stack) {
		return stack.getItem() == this;
	}
	
	public net.minecraft.entity.Entity createEntity(net.minecraft.world.World world, net.minecraft.entity.Entity location, ItemStack itemstack)
	{
		
		if ( location instanceof EntityItem )		
		{
			AppEngMultiBlock mb = (AppEngMultiBlock) this.field_150939_a;
			
			ItemStack newItem = mb.getNewVersion( ((EntityItem) location).getEntityItem() );
			
			EntityItem newEntity = new EntityItem( location.worldObj, location.posX, location.posY, location.posZ, newItem );

			newEntity.prevPosX = location.prevPosX;
			newEntity.prevPosY = location.prevPosY;
			newEntity.prevPosZ = location.prevPosZ;

			newEntity.lastTickPosX = location.lastTickPosX;
			newEntity.lastTickPosY = location.lastTickPosY;
			newEntity.lastTickPosZ = location.lastTickPosZ;

			newEntity.motionX = location.motionX;
			newEntity.motionY = location.motionY;
			newEntity.motionZ = location.motionZ;
			
			return newEntity;
		}
		
		return location;
	}
}
