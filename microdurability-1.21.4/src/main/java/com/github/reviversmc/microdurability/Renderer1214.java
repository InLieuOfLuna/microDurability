package com.github.reviversmc.microdurability;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.ColorHelper;

import com.github.reviversmc.microdurability.compat.mods.RaisedCompat;

public class Renderer1214 extends Renderer121 {
	@Override
	protected void renderGuiQuad(Object context, int x, int y, int width, int height, int red, int green, int blue, int alpha) {
		if (RaisedCompat.isInstalled() && !RaisedCompat.isV3OrLater()) {
			y += getRaisedOffset();
		}

		((DrawContext) context).fill(RenderLayer.getGuiOverlay(), x, y, x + width, y + height, ColorHelper.getArgb(alpha, red, green, blue));
	}
}
