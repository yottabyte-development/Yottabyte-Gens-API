package dev.yottabyte.generators.api.generator;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a drop for a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public interface GeneratorDrop {
    /**
     * Returns the id of the drop.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>drops.id</code>
     *
     * @return the id of the drop
     * @since 1.0
     */
    String getId();

    /**
     * Returns the chance of the drop dropping. (a normalized value between 0 and 1)
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>drops.id.chance</code>
     * <p>
     * Disclaimer: The chance in the configuration is a percentage, but this function
     * returns a normalized value between 0 and 1.
     *
     * @return the normalized chance of the drop
     * @since 1.0
     */
    double getChance();

    /**
     * Returns the sell price of one drop item.
     *
     * @return the sell price of one drop item
     * @since 1.0
     */
    double getSellPrice();

    /**
     * Gets the sell Level XP of one drop item.
     *
     * @return the sell Level XP of one drop item
     * @since 1.0
     */
    int getSellLevelXp();

    /**
     * Returns the item stack of the drop.
     *
     * @return the item stack of the drop
     * @since 1.0
     */
    ItemStack getItem();
}
