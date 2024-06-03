package com.yottabyte.generators.api.sell;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Used for calculating the sell data of items.
 *
 * @since 1.0
 */
public interface SellDataCalculator {
    /**
     * Returns the total item count, sell price, and sell level XP of the item. (includes multiplier)
     *
     * @param player    the player to calculate the worth for
     * @param itemStack the item to calculate the worth of
     * @return the {@link SellData} object containing the total item count, sell price, and sell level XP
     * @since 1.0
     */
    SellData getSellValue(Player player, ItemStack itemStack);

    /**
     * Returns the total item count, sell price, and sell level XP of the items. (includes multiplier)
     *
     * @param player     the player to calculate the worth for
     * @param itemStacks the items to calculate the worth of
     * @return the {@link SellData} object containing the total item count, sell price, and sell level XP
     * @since 1.0
     */
    SellData getSellValue(Player player, ItemStack[] itemStacks);

    /**
     * Returns the total item count, sell price, and sell level XP of the item in the player's main hand. (includes multiplier)
     *
     * @param player the player to calculate the worth for
     * @return the {@link SellData} object containing the total item count, sell price, and sell level XP
     * @since 1.0
     */
    SellData getTotalMainHandWorth(Player player);

    /**
     * Returns the total item count, sell price, and sell level XP of the items in the player's inventory. (includes multiplier)
     *
     * @param player the player to calculate the worth for
     * @return the {@link SellData} object containing the total item count, sell price, and sell level XP
     * @since 1.0
     */
    SellData getTotalInventoryWorth(Player player);
}
