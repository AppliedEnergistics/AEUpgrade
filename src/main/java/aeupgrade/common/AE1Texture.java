package aeupgrade.common;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;

public enum AE1Texture
{

	QuestionBlock("QuestionBlock"),
	QuestionItem("QuestionItem");

	final private String name;
	public IIcon IIcon;

	public String getName()
	{
		return name;
	}

	private AE1Texture(String name) {
		this.name = name;
	}

	public IIcon getIcon()
	{
		return IIcon;
	}

	public void registerIcon(TextureMap map)
	{
		IIcon = map.registerIcon( "AppliedEnergistics:" + name );
	}
	
}
