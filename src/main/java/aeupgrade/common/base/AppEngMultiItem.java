package aeupgrade.common.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import aeupgrade.common.AE1Texture;
import aeupgrade.common.AppEngItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class AppEngMultiItem extends AppEngItem implements IAEItemOrBlock
{

	public void addSubItem(AppEngSubItem si, int meta)
	{
		if ( SubItems.containsKey( meta ) )
			throw new RuntimeException( "Invalid Multi Item Configuration, two sub items are shareing the same id." );
		si.metaData = meta;
		Ordered.add( meta );
		SubItems.put( meta, si );
	}

	public HashMap<Integer, AppEngSubItem> SubItems;
	public List<Integer> Ordered;

	boolean notValidItem(int meta)
	{
		return meta < 0 || meta >= SubItems.size();
	}

	public AppEngSubItem getSubItem(ItemStack i)
	{
		if ( i.getItem() == this )
		{
			if ( notValidItem( i.getItemDamage() ) )
			{
				return null;
			}

			return SubItems.get( i.getItemDamage() );
		}

		return null;
	}

	@Override
	public String getUnlocalizedName()
	{
		return "AppEng.Items.*";
	}

	@Override
	public IIcon getIconFromDamage(int par1) {
		return AE1Texture.QuestionItem.getIcon();
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		if ( notValidItem( par1ItemStack.getItemDamage() ) )
			return "Unnamed";
		return "AppEng.Items." + SubItems.get( par1ItemStack.getItemDamage() ).unlocalizedName;
	}

	public AppEngMultiItem(String ItemName) {
		SubItems = new HashMap<Integer, AppEngSubItem>();
		Ordered = new ArrayList();

		setMaxStackSize( 1 );
		setMaxDamage( 0 );
		setHasSubtypes( true );
		GameRegistry.registerItem( this, ItemName );
	}

	@Override
	public ItemStack getNewVersion(ItemStack src) {
		
		if ( src.getItem() == this )
		{
			if ( notValidItem( src.getItemDamage() ) )
			{
				return null;
			}

			return SubItems.get( src.getItemDamage() ).getNewVersion(src);
		}

		return null;
	}

}
