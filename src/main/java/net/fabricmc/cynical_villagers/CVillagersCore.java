package net.fabricmc.cynical_villagers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CVillagersCore implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("cynical_villagers");

	public static Identifier getID(String path){
		return new Identifier("cynical_villagers", path);
	}

	static final InfiniteEmeraldsItem INFINITE_EMERALDS	=  new InfiniteEmeraldsItem(new Item.Settings().group(ItemGroup.MISC));

	static final SpecialRecipeSerializer<InfiniteEmeraldsRecipe> INFINITE_EMERALDS_RECIPE =
		RecipeSerializer.register("crafting_special_infinite_emeralds", new SpecialRecipeSerializer<InfiniteEmeraldsRecipe>(InfiniteEmeraldsRecipe::new));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM,  getID("infinite_emeralds"), INFINITE_EMERALDS);
		LOGGER.info(INFINITE_EMERALDS.getClass());
	}
}
