package aeupgrade.me.tile;

import net.minecraft.nbt.NBTTagCompound;
import aeupgrade.me.basetiles.TileME;

public class TileStorageMonitor extends TileME
{
    protected boolean upgraded;

    
    @Override
    public void writeToNBT(NBTTagCompound par1nbtTagCompound)
    {
        super.writeToNBT(par1nbtTagCompound);
        par1nbtTagCompound.setBoolean( "u", upgraded );
    }
    
    @Override
    public void readFromNBT(NBTTagCompound par1nbtTagCompound)
    {
        super.readFromNBT(par1nbtTagCompound);
        upgraded = par1nbtTagCompound.getBoolean( "u" );
    }
    
}
