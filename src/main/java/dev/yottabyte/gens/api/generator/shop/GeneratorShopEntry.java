package dev.yottabyte.gens.api.generator.shop;

import dev.yottabyte.gens.api.generator.Generator;
import org.bukkit.inventory.ItemStack;

/**
 * Represents a generator shop entry.
 *
 * @since 1.0
 */
public interface GeneratorShopEntry extends Comparable<GeneratorShopEntry> {
    /**
     * Returns the index of the shop entry.
     *
     * @return the index of the shop entry
     * @since 1.0
     */
    int getIndex();

    /**
     * Returns the generator of the shop entry.
     *
     * @return the generator of the shop entry
     * @since 1.0
     */
    Generator getGenerator();

    /**
     * Returns the buy price of the shop entry. (-1 if the generator cannot be bought).
     *
     * @return the buy price of the shop entry
     * @since 1.0
     */
    double getBuyPrice();

    /**
     * Returns the sell price of the shop entry (-1 if the generator cannot be sold).
     *
     * @return the sell price of the shop entry
     * @since 1.0
     */
    double getSellPrice();

    /**
     * Returns the level requirement of the shop entry. (0 if there is no requirement).
     *
     * @return the level requirement of the shop entry
     * @since 1.0
     */
    int getLevelRequirement();

    /**
     * Returns the display item of the shop entry.
     *
     * @return the display item of the shop entry
     * @since 1.0
     */
    ItemStack getDisplayItem();
}
