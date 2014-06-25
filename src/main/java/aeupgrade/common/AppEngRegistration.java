package aeupgrade.common;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import aeupgrade.api.IColoredMETile;
import aeupgrade.api.Items;
import aeupgrade.common.base.AppEngMaterials;
import aeupgrade.common.base.AppEngMultiBlock;
import aeupgrade.common.base.AppEngMultiChargeable;
import aeupgrade.common.base.AppEngMultiItem;
import aeupgrade.me.block.BlockAssembler;
import aeupgrade.me.block.BlockAssemblerFieldWall;
import aeupgrade.me.block.BlockCable;
import aeupgrade.me.block.BlockChest;
import aeupgrade.me.block.BlockColorlessCable;
import aeupgrade.me.block.BlockColorlessCableCovered;
import aeupgrade.me.block.BlockCondenser;
import aeupgrade.me.block.BlockController;
import aeupgrade.me.block.BlockCraftingAccelerator;
import aeupgrade.me.block.BlockCraftingMonitor;
import aeupgrade.me.block.BlockCraftingTerminal;
import aeupgrade.me.block.BlockDarkCable;
import aeupgrade.me.block.BlockDrive;
import aeupgrade.me.block.BlockEnergyCell;
import aeupgrade.me.block.BlockHeatVent;
import aeupgrade.me.block.BlockIOPort;
import aeupgrade.me.block.BlockInputCableBasic;
import aeupgrade.me.block.BlockInputCableFuzzy;
import aeupgrade.me.block.BlockInputCablePrecision;
import aeupgrade.me.block.BlockInterface;
import aeupgrade.me.block.BlockLevelEmitter;
import aeupgrade.me.block.BlockOutputCableBasic;
import aeupgrade.me.block.BlockOutputCableFuzzy;
import aeupgrade.me.block.BlockOutputCablePrecision;
import aeupgrade.me.block.BlockP2PTunnel;
import aeupgrade.me.block.BlockPatternEncoder;
import aeupgrade.me.block.BlockPowerRelay;
import aeupgrade.me.block.BlockPreformatter;
import aeupgrade.me.block.BlockQuantumLinkChamber;
import aeupgrade.me.block.BlockQuantumRing;
import aeupgrade.me.block.BlockSpatialIOPort;
import aeupgrade.me.block.BlockSpatialPylon;
import aeupgrade.me.block.BlockStorageBus;
import aeupgrade.me.block.BlockStorageBusFuzzy;
import aeupgrade.me.block.BlockStorageMonitor;
import aeupgrade.me.block.BlockTerminal;
import aeupgrade.me.block.BlockTransitionPlane;
import aeupgrade.me.block.BlockWireless;
import aeupgrade.me.item.ItemCell0k;
import aeupgrade.me.item.ItemCell16k;
import aeupgrade.me.item.ItemCell1k;
import aeupgrade.me.item.ItemCell4k;
import aeupgrade.me.item.ItemCell64k;
import aeupgrade.me.item.ItemMemoryCard;
import aeupgrade.me.item.ItemNull;
import aeupgrade.me.item.ItemSpatialCell128;
import aeupgrade.me.item.ItemSpatialCell16;
import aeupgrade.me.item.ItemSpatialCell2;
import aeupgrade.me.item.ItemWirelessTerminal;
import aeupgrade.me.tile.TileAssembler;
import aeupgrade.me.tile.TileChest;
import aeupgrade.me.tile.TileCondenser;
import aeupgrade.me.tile.TileDrive;
import aeupgrade.me.tile.TileIOPort;
import aeupgrade.me.tile.TileInterfaceBase;
import aeupgrade.me.tile.TilePowerRelay;
import aeupgrade.me.tile.TileSpatialIOPort;
import aeupgrade.me.tile.TileStorageMonitor;
import aeupgrade.me.tile.TileWireless;
import aeupgrade.tech1.block.BlockGrinder;
import aeupgrade.tech1.block.BlockMatrixFrame;
import aeupgrade.tech1.block.BlockPhantom;
import aeupgrade.tech1.block.BlockQuartz;
import aeupgrade.tech1.block.BlockQuartzChiseled;
import aeupgrade.tech1.block.BlockQuartzGlass;
import aeupgrade.tech1.block.BlockQuartzLamp;
import aeupgrade.tech1.block.BlockQuartzPillar;
import aeupgrade.tech1.block.OreQuartz;
import aeupgrade.tech1.tile.TileGrinder;
import aeupgrade.tools.toolEntropyAccelerator;
import aeupgrade.tools.toolMassCannon;
import aeupgrade.tools.toolQuartzAxe;
import aeupgrade.tools.toolQuartzCuttingKnife;
import aeupgrade.tools.toolQuartzHoe;
import aeupgrade.tools.toolQuartzPick;
import aeupgrade.tools.toolQuartzShovel;
import aeupgrade.tools.toolQuartzSword;
import aeupgrade.tools.toolQuartzWrench;
import aeupgrade.tools.toolVibrationCatalyst;
import aeupgrade.tools.toolWirelessTerminal;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;

@SuppressWarnings("deprecation")
public class AppEngRegistration
{

	// Tools
	public toolQuartzAxe itemToolCrystalAxe;
	public toolQuartzHoe itemToolCrystalHoe;
	public toolQuartzSword itemToolCrystalSword;
	public toolQuartzShovel itemToolCrystalShovel;
	public toolQuartzPick itemToolCrystalPick;
	public toolQuartzWrench itemToolCrystalWrench;

	public toolQuartzCuttingKnife itemCrystalKnife;

	public toolEntropyAccelerator itemEntropyAccelerator;
	public toolVibrationCatalyst itemVibrationCatalyst;
	public toolMassCannon itemMassCannon;

	public AppEngMaterials itemMaterials;
	public AppEngMultiItem itemMulti;
	public AppEngMultiChargeable itemMultiCharage;

	public AppEngMultiBlock blockWorld;
	public AppEngMultiBlock blockMultiA;
	public AppEngMultiBlock blockMultiB;
	public AppEngMultiBlock blockMultiC;

	// Mutli Item
	public ItemCell0k cell0k;
	public ItemCell1k cell1k;
	public ItemCell4k cell4k;
	public ItemCell16k cell16k;
	public ItemCell64k cell64k;
	public ItemMemoryCard itemMemoryCard;
	public ItemNull nullItemA;
	public ItemNull nullItemB;

	public ItemSpatialCell2 itemSpatial2;
	public ItemSpatialCell16 itemSpatial16;
	public ItemSpatialCell128 itemSpatial128;

	@Deprecated
	public ItemWirelessTerminal oldWirelessTerminal;

	// Chargeable Item
	public toolWirelessTerminal toolWirelessTerminal;

	// World Block

	public OreQuartz blkQuartz;
	public BlockGrinder blkGrinder;
	public BlockQuartz blkQuartzBlock;
	public BlockQuartzGlass blkQuartzGlass;
	public BlockQuartzLamp blkQuartzLamp;
	public BlockMatrixFrame blkMatrixFrame;
	public BlockQuartzPillar blkQuartzBlockPillarUD;
	public BlockQuartzPillar blkQuartzBlockPillarNS;
	public BlockQuartzPillar blkQuartzBlockPillarEW;
	public BlockQuartzChiseled blkQuartzBlockChiseled;

	// MultiBlock 1
	public BlockCable[] blkCable_Colored = new BlockCable[7];

	public BlockAssembler blkAssembler;
	public BlockController blkController;
	public BlockDrive blkDrive;
	public BlockPatternEncoder blkPatternEncoder;
	public BlockWireless blkWireless;
	public BlockTerminal blkTerminal;
	public BlockChest blkChest;
	public BlockInterface blkInterface;
	public BlockPreformatter blkPreformatter;

	// MultiBlock 2

	public BlockOutputCablePrecision blkOutputCablePrecision;
	public BlockInputCablePrecision blkInputCablePrecision;
	public BlockPhantom blkPhantom;
	public BlockCraftingTerminal blkCraftingTerminal;
	public BlockLevelEmitter blkLevelEmitter;
	public BlockCraftingAccelerator blkCraftingAccelerator;
	public BlockHeatVent blkHeatVent;
	public BlockAssemblerFieldWall blkAssemblerFieldWall;
	public BlockDarkCable blkDarkCable;
	public BlockIOPort blkIOPort;
	public BlockCraftingMonitor blkCraftingMonitor;
	public BlockStorageMonitor blkStorageMonitor;
	public BlockColorlessCable blkColorlessCable;
	public BlockOutputCableFuzzy blkOutputCableFuzzy;
	public BlockInputCableFuzzy blkInputCableFuzzy;

	// Multi Block 3
	public BlockOutputCableBasic blkOutputCableBasic;
	public BlockInputCableBasic blkInputCableBasic;
	public BlockStorageBusFuzzy blkStorageBusFuzzy;
	public BlockColorlessCableCovered blkColorlessCableCovered;
	public BlockTransitionPlane blkTransitionPlane;
	public BlockStorageBus blkStorageBus;
	public BlockEnergyCell blkEnergyCell;
	public BlockPowerRelay blkPowerRelay;
	public BlockCondenser blkCondenser;
	public BlockQuantumRing blkQuantumRing;
	public BlockQuantumLinkChamber blkQuantumLink;
	public BlockSpatialPylon blkSpatialPylon;
	public BlockP2PTunnel blkP2PTunnel;
	public BlockSpatialIOPort blkSpatialIOPort;

	void registerItems()
	{
		Items.toolEntropyAccelerator = new ItemStack( itemEntropyAccelerator = new toolEntropyAccelerator() );
		Items.toolVibrationCatalyst = new ItemStack( itemVibrationCatalyst = new toolVibrationCatalyst() );
		Items.toolMassCannon = new ItemStack( itemMassCannon = new toolMassCannon() );

		Items.toolQuartzAxe = new ItemStack( itemToolCrystalAxe = new toolQuartzAxe() );
		Items.toolQuartzHoe = new ItemStack( itemToolCrystalHoe = new toolQuartzHoe() );
		Items.toolQuartzShovel = new ItemStack( itemToolCrystalShovel = new toolQuartzShovel() );
		Items.toolQuartzPick = new ItemStack( itemToolCrystalPick = new toolQuartzPick() );
		Items.toolQuartzSword = new ItemStack( itemToolCrystalSword = new toolQuartzSword() );

		Items.toolQuartzWrench = new ItemStack( itemToolCrystalWrench = new toolQuartzWrench() );
		Items.toolQuartzKnife = new ItemStack( itemCrystalKnife = new toolQuartzCuttingKnife() );

		// World Block
		aeupgrade.api.Blocks.blkQuartzOre = blkQuartz.getItemStack();
		aeupgrade.api.Blocks.blkPhantom = blkPhantom.getItemStack();
		aeupgrade.api.Blocks.blkQuartz = blkQuartzBlock.getItemStack();
		aeupgrade.api.Blocks.blkQuartzGlass = blkQuartzGlass.getItemStack();
		aeupgrade.api.Blocks.blkQuartzLamp = blkQuartzLamp.getItemStack();
		aeupgrade.api.Blocks.blkQuartzPiller = blkQuartzBlockPillarUD.getItemStack();
		aeupgrade.api.Blocks.blkQuartzChiseled = blkQuartzBlockChiseled.getItemStack();

		// Multi Block A
		aeupgrade.api.Blocks.blkAssembler = blkAssembler.getItemStack();
		aeupgrade.api.Blocks.blkController = blkController.getItemStack();
		aeupgrade.api.Blocks.blkDrive = blkDrive.getItemStack();
		aeupgrade.api.Blocks.blkPatternEncoder = blkPatternEncoder.getItemStack();
		aeupgrade.api.Blocks.blkWireless = blkWireless.getItemStack();
		aeupgrade.api.Blocks.blkTerminal = blkTerminal.getItemStack();
		aeupgrade.api.Blocks.blkChest = blkChest.getItemStack();
		aeupgrade.api.Blocks.blkInterface = blkInterface.getItemStack();
		aeupgrade.api.Blocks.blkPartitioner = blkPreformatter.getItemStack();
		aeupgrade.api.Blocks.blkGrinder = blkGrinder.getItemStack();
		aeupgrade.api.Blocks.blkStorageBus = blkStorageBus.getItemStack();
		aeupgrade.api.Blocks.blkIOPort = blkIOPort.getItemStack();

		aeupgrade.api.Blocks.blkCable_Colored = new ItemStack[blkCable_Colored.length];
		for (int x = 0; x < blkCable_Colored.length; x++)
		{
			aeupgrade.api.Blocks.blkCable_Colored[x] = blkCable_Colored[x].getItemStack();
		}

		// MultiBlock B
		aeupgrade.api.Blocks.blkInputCablePrecision = blkInputCablePrecision.getItemStack();
		aeupgrade.api.Blocks.blkOutputCablePrecision = blkOutputCablePrecision.getItemStack();
		aeupgrade.api.Blocks.blkCraftingTerminal = blkCraftingTerminal.getItemStack();
		aeupgrade.api.Blocks.blkLevelEmitter = blkLevelEmitter.getItemStack();
		aeupgrade.api.Blocks.blkCraftingAccelerator = blkCraftingAccelerator.getItemStack();
		aeupgrade.api.Blocks.blkHeatVent = blkHeatVent.getItemStack();
		aeupgrade.api.Blocks.blkAssemblerFieldWall = blkAssemblerFieldWall.getItemStack();
		aeupgrade.api.Blocks.blkDarkCable = blkDarkCable.getItemStack();
		aeupgrade.api.Blocks.blkIOPort = blkIOPort.getItemStack();
		aeupgrade.api.Blocks.blkCraftingMonitor = blkCraftingMonitor.getItemStack();
		aeupgrade.api.Blocks.blkStorageMonitor = blkStorageMonitor.getItemStack();
		aeupgrade.api.Blocks.blkColorlessCableCovered = blkColorlessCableCovered.getItemStack();
		aeupgrade.api.Blocks.blkInputCableFuzzy = blkInputCableFuzzy.getItemStack();
		aeupgrade.api.Blocks.blkOutputCableFuzzy = blkOutputCableFuzzy.getItemStack();

		// MultiBlock C
		aeupgrade.api.Blocks.blkInputCableBasic = blkInputCableBasic.getItemStack();
		aeupgrade.api.Blocks.blkOutputCableBasic = blkOutputCableBasic.getItemStack();
		aeupgrade.api.Blocks.blkStorageBusFuzzy = blkStorageBusFuzzy.getItemStack();
		aeupgrade.api.Blocks.blkColorlessCable = blkColorlessCable.getItemStack();
		aeupgrade.api.Blocks.blkTransitionPlane = blkTransitionPlane.getItemStack();
		aeupgrade.api.Blocks.blkCondenser = blkCondenser.getItemStack();
		aeupgrade.api.Blocks.blkEnergyCell = blkEnergyCell.getItemStack();
		aeupgrade.api.Blocks.blkPowerRelay = blkPowerRelay.getItemStack();
		aeupgrade.api.Blocks.blkQuantumRing = blkQuantumRing.getItemStack();
		aeupgrade.api.Blocks.blkQuantumLink = blkQuantumLink.getItemStack();
		aeupgrade.api.Blocks.blkSpatialPylon = blkSpatialPylon.getItemStack();
		aeupgrade.api.Blocks.blkP2PTunnel = blkP2PTunnel.getItemStack();
		aeupgrade.api.Blocks.blkSpatialIOPort = blkSpatialIOPort.getItemStack();

		// Multi Items...
		aeupgrade.api.Items.itemCell1k = cell1k.getItemStack();
		aeupgrade.api.Items.itemCell4k = cell4k.getItemStack();
		aeupgrade.api.Items.itemCell16k = cell16k.getItemStack();
		aeupgrade.api.Items.itemCell64k = cell64k.getItemStack();
		aeupgrade.api.Items.itemWirelessTerminal = oldWirelessTerminal.getItemStack();
		aeupgrade.api.Items.itemMemoryCard = itemMemoryCard.getItemStack();
		aeupgrade.api.Items.itemSpatialCell2 = itemSpatial2.getItemStack();
		aeupgrade.api.Items.itemSpatialCell16 = itemSpatial16.getItemStack();
		aeupgrade.api.Items.itemSpatialCell128 = itemSpatial128.getItemStack();

		// Multi Charge...
		aeupgrade.api.Items.toolWirelessTerminal = toolWirelessTerminal.getItemStack();
	}

	void registerBlocks()
	{
		FMLLog.info( "[AppEng] Starting Applied Energistics" );

		itemMulti = new AppEngMultiItem( "AppEngMultiItem" );
		itemMaterials = new AppEngMaterials();
		itemMultiCharage = new AppEngMultiChargeable( "AppEngMultiChargeable" );

		blockMultiA = new AppEngMultiBlock();
		blockMultiB = new AppEngMultiBlock();
		blockMultiC = new AppEngMultiBlock();
		blockWorld = new AppEngMultiBlock();

		// Multi Item
		itemMulti.addSubItem( cell1k = new ItemCell1k( itemMulti ), 0 );
		itemMulti.addSubItem( cell4k = new ItemCell4k( itemMulti ), 7 );
		itemMulti.addSubItem( cell16k = new ItemCell16k( itemMulti ), 1 );
		itemMulti.addSubItem( cell64k = new ItemCell64k( itemMulti ), 2 );
		itemMulti.addSubItem( cell0k = new ItemCell0k( itemMulti ), 8 );

		itemMulti.addSubItem( oldWirelessTerminal = new ItemWirelessTerminal( itemMulti ), 5 );

		itemMulti.addSubItem( itemMemoryCard = new ItemMemoryCard( itemMulti ), 3 );
		itemMulti.addSubItem( new ItemNull( itemMulti ), 6 );

		itemMulti.addSubItem( itemSpatial2 = new ItemSpatialCell2( itemMulti ), 9 );
		itemMulti.addSubItem( itemSpatial16 = new ItemSpatialCell16( itemMulti ), 10 );
		itemMulti.addSubItem( itemSpatial128 = new ItemSpatialCell128( itemMulti ), 11 );

		// Multi Chargeable
		itemMultiCharage.addSubItem( new ItemNull( itemMultiCharage ), 0 );
		itemMultiCharage.addSubItem( toolWirelessTerminal = new toolWirelessTerminal( itemMultiCharage ), 1 );

		// Block A
		blkCable_Colored[0] = new BlockCable( blockMultiA, 0 );
		blkAssembler = new BlockAssembler( blockMultiA, true );
		blkController = new BlockController( blockMultiA );
		blkDrive = new BlockDrive( blockMultiA );
		blkPatternEncoder = new BlockPatternEncoder( blockMultiA, true );
		blkWireless = new BlockWireless( blockMultiA, true );
		blkTerminal = new BlockTerminal( blockMultiA, true );
		blkChest = new BlockChest( blockMultiA );
		blkInterface = new BlockInterface( blockMultiA );
		blkPreformatter = new BlockPreformatter( blockMultiA );

		for (int x = 1; x < IColoredMETile.Colors.length; x++)
			blkCable_Colored[x] = new BlockCable( blockMultiA, x );

		// Block 2
		blkOutputCablePrecision = new BlockOutputCablePrecision( blockMultiB, true );
		blkInputCablePrecision = new BlockInputCablePrecision( blockMultiB, true );
		blkPhantom = new BlockPhantom( blockMultiB );
		blkCraftingTerminal = new BlockCraftingTerminal( blockMultiB, true );
		blkLevelEmitter = new BlockLevelEmitter( blockMultiB, true );
		blkCraftingAccelerator = new BlockCraftingAccelerator( blockMultiB, true );
		blkHeatVent = new BlockHeatVent( blockMultiB, true );
		blkAssemblerFieldWall = new BlockAssemblerFieldWall( blockMultiB, true );
		blkDarkCable = new BlockDarkCable( blockMultiB );
		blkStorageBus = new BlockStorageBus( blockMultiB, true );
		blkIOPort = new BlockIOPort( blockMultiB );
		blkCraftingMonitor = new BlockCraftingMonitor( blockMultiB, true );
		blkStorageMonitor = new BlockStorageMonitor( blockMultiB, true );
		blkColorlessCableCovered = new BlockColorlessCableCovered( blockMultiB );
		blkColorlessCable = new BlockColorlessCable( blockMultiB );
		blkStorageBusFuzzy = new BlockStorageBusFuzzy( blockMultiB, true );

		// Block 3
		blkOutputCableFuzzy = new BlockOutputCableFuzzy( blockMultiC, true );
		blkInputCableFuzzy = new BlockInputCableFuzzy( blockMultiC, true );
		blkOutputCableBasic = new BlockOutputCableBasic( blockMultiC, true );
		blkInputCableBasic = new BlockInputCableBasic( blockMultiC, true );
		blkTransitionPlane = new BlockTransitionPlane( blockMultiC, true );
		blkEnergyCell = new BlockEnergyCell( blockMultiC );
		blkPowerRelay = new BlockPowerRelay( blockMultiC );
		blkCondenser = new BlockCondenser( blockMultiC );
		blkQuantumRing = new BlockQuantumRing( blockMultiC, true );
		blkQuantumLink = new BlockQuantumLinkChamber( blockMultiC, true );
		blkSpatialPylon = new BlockSpatialPylon( blockMultiC, true );
		blkP2PTunnel = new BlockP2PTunnel( blockMultiC, true );
		blkSpatialIOPort = new BlockSpatialIOPort( blockMultiC, true );

		// Block World
        blkQuartz = new OreQuartz(blockWorld);
        blkGrinder = new BlockGrinder(blockWorld,true);
        blkQuartzBlock = new BlockQuartz(blockWorld);
        blkQuartzGlass = new BlockQuartzGlass( blockWorld );
        blkQuartzLamp = new BlockQuartzLamp( blockWorld );
        blkMatrixFrame = new BlockMatrixFrame( blockWorld);
    	blkQuartzBlockPillarUD = new BlockQuartzPillar( blockWorld );
    	blkQuartzBlockPillarNS = new BlockQuartzPillar( blockWorld );
    	blkQuartzBlockPillarEW = new BlockQuartzPillar( blockWorld );
    	blkQuartzBlockChiseled = new BlockQuartzChiseled( blockWorld );
        
		blockMultiA.registerBlock( "AE1-blockMultiA" );
		blockMultiB.registerBlock( "AE1-blockMultiB" );
		blockMultiC.registerBlock( "AE1-blockMultiC" );
		blockWorld.registerBlock( "AE1-blockWorld" );
	}

	public void initTiles()
	{
		GameRegistry.registerTileEntity( TileChest.class, "appeng.me.TileChest" );
		GameRegistry.registerTileEntity( TileAssembler.class, "appeng.me.TileAssembler" );
		GameRegistry.registerTileEntity( TileWireless.class, "appeng.me.TileWireless" );
		GameRegistry.registerTileEntity( TileDrive.class, "appeng.me.TileDrive" );
		GameRegistry.registerTileEntity( TileIOPort.class, "appeng.me.TileIOPort" );
		GameRegistry.registerTileEntity( TileStorageMonitor.class, "appeng.me.TileStorageMonitor" );
		GameRegistry.registerTileEntity( TilePowerRelay.class, "appeng.me.TilePowerRelay" );
		GameRegistry.registerTileEntity( TileCondenser.class, "appeng.me.TileCondenser" );
		GameRegistry.registerTileEntity( TileSpatialIOPort.class, "appeng.me.TileSpatialIOPort" );
		GameRegistry.registerTileEntity( TileGrinder.class, "appeng.tech1.TileGrinder" );
	}

	Class interfaceClass;

	public TileEntity createInterfaceTile()
	{
		try
		{
			return (TileEntity) interfaceClass.newInstance();
		}
		catch (InstantiationException e)
		{
			return new TileInterfaceBase();
		}
		catch (IllegalAccessException e)
		{
			return new TileInterfaceBase();
		}
	}

}
