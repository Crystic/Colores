package net.crystic.colores.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.crystic.colores.Colores;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class FossilItem extends Item {

	public FossilItem() {
		this.setCreativeTab(Colores.coloresTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Colores.modid + ":"
				+ this.getUnlocalizedName().substring(5));
	}

}
