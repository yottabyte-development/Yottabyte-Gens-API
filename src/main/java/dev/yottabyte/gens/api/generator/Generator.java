package dev.yottabyte.gens.api.generator;

import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Represents a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public interface Generator {
    /**
     * Returns the generator's ID.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>id</code>
     *
     * @return the generator ID
     * @since 1.0
     */
    String getId();

    /**
     * Returns the generator's order. This is used to determine the order in which the generators are displayed.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>order</code>
     *
     * @return the generator order
     * @since 1.0
     */
    int getOrder();

    /**
     * Returns the generator's color code.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>color</code>
     *
     * @return the color code for the generator
     * @since 1.0
     */
    String getColor();

    /**
     * Returns the generator's display name.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>display-name</code>
     *
     * @return the display name for the generator
     * @since 1.0
     */
    String getDisplayName();

    /**
     * Returns the buy price of the generator. (-1 if the generator cannot be bought).
     *
     * @return the buy price of the generator
     * @since 1.0
     */
    double getBuyPrice();

    /**
     * Returns the sell price of the generator (-1 if the generator cannot be sold).
     *
     * @return the sell price of the generator
     * @since 1.0
     */
    double getSellPrice();

    /**
     * Returns the buy level requirement of the generator. (0 if there is no requirement).
     *
     * @return the buy level requirement of generator
     * @since 1.0
     */
    int getBuyLevelRequirement();

    /**
     * Returns the drop interval for the generator in seconds.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>drop-interval</code>
     *
     * @return the drop interval for the generator in seconds
     * @since 1.0
     */
    int getDropInterval();

    /**
     * Checks whether the hologram for the generator is enabled.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>hologram.enabled</code>
     *
     * @return <code>true</code> if the hologram is enabled; <code>false</code> otherwise
     * @since 1.0
     */
    boolean isHologramEnabled();

    /**
     * Returns the hologram lines for the generator.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>hologram.lines</code>
     *
     * @return the list of hologram lines
     * @since 1.0
     */
    List<String> getHologramLines();

    /**
     * Returns the generator item.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>item</code>
     *
     * @return the generator item
     * @since 1.0
     */
    ItemStack getItem();

    /**
     * Returns the list of drops for the generator.
     *
     * @return the list of drops
     * @since 1.0
     */
    List<GeneratorDrop> getDrops();
}
