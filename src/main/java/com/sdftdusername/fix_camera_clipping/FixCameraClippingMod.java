package com.sdftdusername.fix_camera_clipping;

import dev.crmodders.cosmicquilt.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FixCameraClippingMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Fix Camera Clipping");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Fix Camera Clipping Initialized!");
	}
}

