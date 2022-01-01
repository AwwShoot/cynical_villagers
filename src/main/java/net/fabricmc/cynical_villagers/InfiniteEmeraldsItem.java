package net.fabricmc.cynical_villagers;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class InfiniteEmeraldsItem extends Item {
    public InfiniteEmeraldsItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }


    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        world.playSound(player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_VILLAGER_AMBIENT,
            SoundCategory.PLAYERS, 0.5f, 1.0f, false);

    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.cynical_villagers.infinite_emeralds.tooltip_1"));
        tooltip.add(new TranslatableText("item.cynical_villagers.infinite_emeralds.tooltip_2"));
    }

}
