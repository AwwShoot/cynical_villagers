package net.fabricmc.cynical_villagers;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class InfiniteEmeraldsRecipe extends SpecialCraftingRecipe {
    public InfiniteEmeraldsRecipe(Identifier id) {
        super(id);
    }

    @Override
    public boolean matches(CraftingInventory inventory, World world) {
        boolean hasPotion = false;
        boolean hasApple = false;
        for(int i = 0; i < inventory.size(); i++) {
            ItemStack stack = inventory.getStack(i);
            if (stack.isOf(Items.GOLDEN_APPLE)) {
                if (hasApple) {
                    return false;
                }
                hasApple = true;
            }
            if (stack.isOf(Items.SPLASH_POTION) && PotionUtil.getPotion(stack) == Potions.WEAKNESS) {
                if (hasPotion) {
                    return false;
                }
                hasPotion = true;
            }
        }
        return (hasApple && hasPotion);
    }

    @Override
    public ItemStack craft(CraftingInventory inventory) {
        return new ItemStack(CVillagersCore.INFINITE_EMERALDS);
    }

    @Override
    public boolean fits(int width, int height) {
        return (width >= 2 || height >= 2);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }
}
