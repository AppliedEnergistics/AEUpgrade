package aeupgrade.common;

import net.minecraftforge.client.event.TextureStitchEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TextureReg {

	@SubscribeEvent
	public void updateTextureSheet(TextureStitchEvent.Pre ev)
	{

		if ( ev.map.getTextureType() == 0 )
			AE1Texture.QuestionBlock.registerIcon(ev.map);

		if ( ev.map.getTextureType() == 1 )
			AE1Texture.QuestionItem.registerIcon(ev.map);

	}
	
}
