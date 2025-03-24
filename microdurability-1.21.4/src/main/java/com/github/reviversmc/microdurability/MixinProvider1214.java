package com.github.reviversmc.microdurability;

import java.util.List;

import com.github.reviversmc.microdurability.compat.minecraft.McVersionMixinProvider;

public class MixinProvider1214 extends McVersionMixinProvider {
	@Override
	public List<String> getMixins() {
		if (MicroDurability1214.IS_COMPATIBLE.get()) {
			return List.of("InGameHudMixin1214");
		}

		return null;
	}
}
