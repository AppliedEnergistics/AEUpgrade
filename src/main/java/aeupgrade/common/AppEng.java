package aeupgrade.common;

import net.minecraftforge.common.MinecraftForge;
import appeng.util.Platform;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "AppliedEnergistics", name = "AE Upgrade", dependencies = AppEng.dependencies)
public class AppEng
{

	public final static String dependencies = "required-after:appliedenergistics2;" + "required-after:Forge@["
			+ net.minecraftforge.common.ForgeVersion.majorVersion + "." + net.minecraftforge.common.ForgeVersion.minorVersion + "."
			+ net.minecraftforge.common.ForgeVersion.revisionVersion + "." + net.minecraftforge.common.ForgeVersion.buildVersion + ",)";

	private static AppEng myInstance = null;

	public static AppEng getInstance()
	{
		return myInstance;
	}

	public AppEngRegistration registration;

	public AppEng() {
		myInstance = this;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		registration = new AppEngRegistration();
		registration.registerBlocks();
		registration.registerItems();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if ( Platform.isClient() )
			 MinecraftForge.EVENT_BUS.register( new TextureReg() );
		
		registration.initTiles();
	}

}
