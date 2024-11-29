package dev.yottabyte.generators.api.sell.wand;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a sell wand.
 *
 * @since 1.0
 */
public interface SellWand {
    /**
     * Returns the id of the sell wand.
     * <p>
     * This is specified in the sell wand's configuration file.
     * The configuration section: <code>sell-wands.wand.id</code>
     *
     * @return the id of the sell wand
     * @since 1.0
     */
    String getId();

    /**
     * Returns the money multiplier of the sell wand.
     * <p>
     * This is specified in the sell wand's configuration file.
     * The configuration section: <code>sell-wands.wand.money-multiplier</code>
     *
     * @return the money multiplier of the sell wand
     * @since 1.0
     */
    double getMoneyMultiplier();

    /**
     * Returns the XP multiplier of the sell wand.
     * <p>
     * This is specified in the sell wand's configuration file.
     * The configuration section: <code>sell-wands.wand.xp-multiplier</code>
     *
     * @return the XP multiplier of the sell wand
     * @since 1.0
     */
    double getXpMultiplier();

    /**
     * Returns the default amount of uses a sell wand has.
     * <p>
     * This is specified in the sell wand's configuration file.
     * The configuration section: <code>sell-wands.wand.default-uses</code>
     *
     * @return the default amount of uses
     * @since 1.0
     */
    int getDefaultUses();

    /**
     * Returns the sell wand item.
     * <p>
     * This is specified in the sell wand's configuration file.
     * The configuration section: <code>sell-wands.wand.item</code>
     *
     * @return the sell wand item
     * @since 1.0
     */
    ItemStack getItem();
}
