package net.dracus.daotsyringes;

import net.dracus.daotsyringes.config.ModGameRules;
import net.dracus.daotsyringes.item.ModItemGroups;
import net.dracus.daotsyringes.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DAOTSyringes implements ModInitializer {
	public static final String MOD_ID = "daotsyringes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModGameRules.register();

	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
