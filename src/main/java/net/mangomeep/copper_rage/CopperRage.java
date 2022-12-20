package net.mangomeep.copper_rage;

import net.fabricmc.api.ModInitializer;
import net.mangomeep.copper_rage.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperRage implements ModInitializer {
	public static final String MOD_ID = "copper_rage";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		ModItems.registerModItems();
		
		
	}
}
