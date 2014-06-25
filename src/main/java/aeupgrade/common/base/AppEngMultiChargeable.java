package aeupgrade.common.base;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AppEngMultiChargeable extends AppEngMultiItem
{

	public AppEngMultiChargeable(String r) {
		super( r );
	}

	@Override
	public boolean isDamageable()
	{
		return true;
	}

	@Override
	public boolean isDamaged(ItemStack stack)
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public EnumRarity getRarity(ItemStack var1)
	{
		return EnumRarity.uncommon;
	}

	@Override
	public void setDamage(ItemStack stack, int damage)
	{
		// Screw you MC, you can't touch this.
	}

}
