package net.fabricmc.cynical_villagers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CVillagersCore implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("cynical_villagers");

	public static Identifier getID(String path){
		return new Identifier("cynical_villagers", path);
	}

	static final Item INFINITE_EMERALDS	=  new Item(new Item.Settings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM,  getID("infinite_emeralds"), INFINITE_EMERALDS);
		LOGGER.info("a");
	}
}
