package aeupgrade.common.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import aeupgrade.common.AE1Texture;
import aeupgrade.common.AppEngItem;
import appeng.api.AEApi;
import appeng.api.util.AEItemDefinition;
import appeng.block.AEDecorativeBlock;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;

public class AppEngMaterials extends AppEngItem implements IAEItemOrBlock
{

	private List<Integer> orderList = new ArrayList();
	private HashMap<Integer, MaterialDef> Defs = new HashMap();

	public enum MaterialType
	{
		ConversionMatrix("ConversionMatrix", 0), StorageCell("StorageCell", 1), StorageSegment("StorageSegment", 17), StorageBlock("StorageBlock", 2), StorageCluster(
				"StorageCluster", 3), Wireless("WirelessReceiver", 4), WirelessBooster("WirelessBooster", 5), Quartz("QuartzCrystal", 6), QuartzDustNether(
				"QuartzDustNether", 22), QuartzDust("QuartzDust", 7), IronDust("IronDust", 8), GoldDust("GoldDust", 9), WoodenGear("WoodenGear", 10), Crank(
				"WoodenCrank", 11), Flour("Flour", 12), Silicon("Silicon", 13), FluxDust("FluxQuartzDust", 14), FluxCrystal("FluxQuartz", 23), FluxPearl(
				"FluxPearl", 24), BlankPattern("MEBlankPattern", 16), ProcessorBasic("MEBasicProcessor", 18), ProcessorAdvanced("MEAdvancedProcessor", 19), ProcessorBasicUncooked(
				"BasicProcessorAssembly", 20), ProcessorAdvancedUncooked("AdvancedProcessorAssembly", 21), StorageCellHouseing("StorageCellHousing", 15), IronNugget(
				"IronNugget", 25), MatterBall("MatterBall", 26), Singularity("Singularity", 27), EnderPearlDust("EnderPearlDust", 28), QuantumEntangledSingularity(
				"QuantumEntangledSingularity", 29), SpatialStorageCell("SpatialStorageCell", 30), SpatialStorageBlock("SpatialStorageBlock", 31), SpatialStorageCluster(
				"SpatialStorageCluster", 32);

		private MaterialType(String s, int Meta) {
			uName = s;
			meta = Meta;
		}

		public String uName;
		public int meta;

	};

	static class MaterialDef
	{

		String unlocalizedName;
		int meta;
		AEItemDefinition newItem;

		public MaterialDef(String a, int b, AEItemDefinition item) {
			unlocalizedName = a;
			meta = b;
			newItem = item;
		}

		public ItemStack getNewItem( ItemStack src ) {
			if ( newItem == null ) return null;
			return newItem.stack(src.stackSize);
		}

	};

	private ItemStack addMaterial(MaterialType mt, AEItemDefinition item)
	{
		if ( Defs.containsKey( mt.meta ) )
			throw new RuntimeException( "Invalid Material Configuration, two materials are shareing the same id." );
		orderList.add( mt.meta );
		Defs.put( mt.meta, new MaterialDef( mt.uName, mt.meta, item ) );
		return new ItemStack( this, 1, mt.meta );
	}

	public AppEngMaterials() {

		setMaxDamage( 0 );
		setMaxStackSize( 64 );
		setHasSubtypes( true );
		GameRegistry.registerItem( this, "AppEngMaterials" );

		aeupgrade.api.Materials.matConversionMatrix = addMaterial( MaterialType.ConversionMatrix, AEApi.instance().materials().materialAnnihilationCore );
		aeupgrade.api.Materials.matStorageCell = addMaterial( MaterialType.StorageCell, AEApi.instance().materials().materialCell1kPart );
		aeupgrade.api.Materials.matStorageSegment = addMaterial( MaterialType.StorageSegment , AEApi.instance().materials().materialCell4kPart);
		aeupgrade.api.Materials.matStorageBlock = addMaterial( MaterialType.StorageBlock, AEApi.instance().materials().materialCell16kPart );
		aeupgrade.api.Materials.matStorageCluster = addMaterial( MaterialType.StorageCluster, AEApi.instance().materials().materialCell64kPart );
		aeupgrade.api.Materials.matWireless = addMaterial( MaterialType.Wireless, AEApi.instance().materials().materialWireless );
		aeupgrade.api.Materials.matWirelessBooster = addMaterial( MaterialType.WirelessBooster, AEApi.instance().materials().materialWirelessBooster );
		aeupgrade.api.Materials.matQuartz = addMaterial( MaterialType.Quartz, AEApi.instance().materials().materialCertusQuartzCrystal );
		aeupgrade.api.Materials.matQuartzDustNether = addMaterial( MaterialType.QuartzDustNether, AEApi.instance().materials().materialNetherQuartzDust );
		aeupgrade.api.Materials.matQuartzDust = addMaterial( MaterialType.QuartzDust, AEApi.instance().materials().materialCertusQuartzDust );
		aeupgrade.api.Materials.matIronDust = addMaterial( MaterialType.IronDust, AEApi.instance().materials().materialIronDust );
		aeupgrade.api.Materials.matGoldDust = addMaterial( MaterialType.GoldDust, AEApi.instance().materials().materialGoldDust );
		aeupgrade.api.Materials.matWoodenGear = addMaterial( MaterialType.WoodenGear, AEApi.instance().materials().materialWoodenGear );
		aeupgrade.api.Materials.matCrank = addMaterial( MaterialType.Crank, AEApi.instance().blocks().blockCrankHandle );
		aeupgrade.api.Materials.matFlour = addMaterial( MaterialType.Flour, AEApi.instance().materials().materialFlour );
		aeupgrade.api.Materials.matSilicon = addMaterial( MaterialType.Silicon, AEApi.instance().materials().materialSilicon );
		aeupgrade.api.Materials.matFluxDust = addMaterial( MaterialType.FluxDust, AEApi.instance().materials().materialFluixDust );
		aeupgrade.api.Materials.matFluxCrystal = addMaterial( MaterialType.FluxCrystal, AEApi.instance().materials().materialFluixCrystal );
		aeupgrade.api.Materials.matFluxPearl = addMaterial( MaterialType.FluxPearl, AEApi.instance().materials().materialFluixPearl );
		aeupgrade.api.Materials.matBlankPattern = addMaterial( MaterialType.BlankPattern, null );
		aeupgrade.api.Materials.matProcessorBasic = addMaterial( MaterialType.ProcessorBasic, AEApi.instance().materials().materialLogicProcessor );
		aeupgrade.api.Materials.matProcessorAdvanced = addMaterial( MaterialType.ProcessorAdvanced, AEApi.instance().materials().materialEngProcessor );
		aeupgrade.api.Materials.matProcessorBasicUncooked = addMaterial( MaterialType.ProcessorBasicUncooked, AEApi.instance().materials().materialLogicProcessor );
		aeupgrade.api.Materials.matProcessorAdvancedUncooked = addMaterial( MaterialType.ProcessorAdvancedUncooked,AEApi.instance().materials().materialEngProcessor );
		aeupgrade.api.Materials.matStorageCellHouseing = addMaterial( MaterialType.StorageCellHouseing, AEApi.instance().materials().materialEmptyStorageCell );
		aeupgrade.api.Materials.matIronNugget = addMaterial( MaterialType.IronNugget, AEApi.instance().materials().materialIronNugget );
		aeupgrade.api.Materials.matMatterBall = addMaterial( MaterialType.MatterBall, AEApi.instance().materials().materialMatterBall );
		aeupgrade.api.Materials.matSingularity = addMaterial( MaterialType.Singularity, AEApi.instance().materials().materialSingularity );
		aeupgrade.api.Materials.matEnderPearlDust = addMaterial( MaterialType.EnderPearlDust, AEApi.instance().materials().materialEnderDust );
		aeupgrade.api.Materials.matQuantumEntangledSingularity = addMaterial( MaterialType.QuantumEntangledSingularity, AEApi.instance().materials().materialSingularity );
		aeupgrade.api.Materials.matSpatialStorageCell = addMaterial( MaterialType.SpatialStorageCell, AEApi.instance().materials().materialCell2SpatialPart );
		aeupgrade.api.Materials.matSpatialStorageBlock = addMaterial( MaterialType.SpatialStorageBlock, AEApi.instance().materials().materialCell16SpatialPart );
		aeupgrade.api.Materials.matSpatialStorageCluster = addMaterial( MaterialType.SpatialStorageCluster, AEApi.instance().materials().materialCell128SpatialPart );
	}
	
	@Override
	public IIcon getIconFromDamage(int par1) {
		return AE1Texture.QuestionItem.getIcon();
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		if ( Defs.containsKey( par1ItemStack.getItemDamage() ) )
		{
			return "AppEng.Materials." + Defs.get( par1ItemStack.getItemDamage() ).unlocalizedName;
		}

		return "Materials.NULL";
	}
	
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		
	}
	
	public int getBytes(ItemStack is)
	{
		if ( aeupgrade.api.Materials.matStorageCell.getItemDamage() == is.getItemDamage() )
			return 1024;
		if ( aeupgrade.api.Materials.matStorageSegment.getItemDamage() == is.getItemDamage() )
			return 4 * 1024;
		if ( aeupgrade.api.Materials.matStorageBlock.getItemDamage() == is.getItemDamage() )
			return 16 * 1024;
		if ( aeupgrade.api.Materials.matStorageCluster.getItemDamage() == is.getItemDamage() )
			return 64 * 1024;
		return 0;
	}

	public boolean isStorageComponent(ItemStack is)
	{
		return aeupgrade.api.Materials.matStorageCell.getItemDamage() == is.getItemDamage()
				|| aeupgrade.api.Materials.matStorageSegment.getItemDamage() == is.getItemDamage()
				|| aeupgrade.api.Materials.matStorageBlock.getItemDamage() == is.getItemDamage()
				|| aeupgrade.api.Materials.matStorageCluster.getItemDamage() == is.getItemDamage();
	}
	
	@Override
	public ItemStack getNewVersion(ItemStack src) {
	
		if ( Defs.containsKey( src.getItemDamage() ) )
			return  Defs.get( src.getItemDamage() ).getNewItem(src);
	
		return null;
	}

}
