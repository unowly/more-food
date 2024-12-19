package dev.unowly;

import dev.unowly.init.ItemInit;
import dev.unowly.tab.MoreFoodCreativeTab;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFood implements ModInitializer {
	public static final String MOD_ID = "more-food";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemInit.init();
		MoreFoodCreativeTab.init();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}