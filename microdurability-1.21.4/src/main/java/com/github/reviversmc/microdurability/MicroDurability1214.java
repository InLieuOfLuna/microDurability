package com.github.reviversmc.microdurability;

import java.util.function.Supplier;

import com.github.reviversmc.microdurability.compat.minecraft.McVersionCompatInitializer;
import com.github.reviversmc.microdurability.compat.minecraft.McVersionHelper;

public class MicroDurability1214 extends McVersionCompatInitializer {
	static final Supplier<Boolean> IS_COMPATIBLE = () -> McVersionHelper.isWithin("1.21.4", McVersionHelper.INFINITY);

	@Override
	public boolean isCompatible() {
		return IS_COMPATIBLE.get();
	}

	@Override
	protected void initialize() {
		MicroDurability.renderer = new Renderer1214();
	}
}
