package io.github.sdftdusername.fixcameraclipping;

import dev.crmodders.cosmicquilt.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FixCameraClipping implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Fix Camera Clipping");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Fix Camera Clipping Mod Initialized!");
	}
}

