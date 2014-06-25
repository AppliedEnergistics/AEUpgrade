package aeupgrade.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public abstract class AppEngItem extends Item
{

	public abstract ItemStack getNewVersion( ItemStack src );

	@Override
	public IIcon getIconFromDamage(int par1) {
		return AE1Texture.QuestionItem.getIcon();
	}
	
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		
	}
	
	@Override
	public boolean hasCustomEntity(ItemStack stack) {
		return true;
	}
	
	public net.minecraft.entity.Entity createEntity(net.minecraft.world.World world, net.minecraft.entity.Entity location, ItemStack itemstack)
	{
		
		if ( location instanceof EntityItem )		
		{
			ItemStack newItem = getNewVersion( ((EntityItem) location).getEntityItem() );
			if ( newItem == null )
				return null;
			
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
			
			newEntity.age = ((EntityItem) location).age;
			newEntity.delayBeforeCanPickup = ((EntityItem) location).delayBeforeCanPickup;
			
			return newEntity;
		}
		
		return null;
	}
	
}
