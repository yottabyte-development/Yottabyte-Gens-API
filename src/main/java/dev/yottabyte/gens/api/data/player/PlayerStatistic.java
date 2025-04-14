package dev.yottabyte.gens.api.data.player;

/**
 * Represents player statistics.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public enum PlayerStatistic {
    /**
     * The number of generators the player has upgraded.
     *
     * @since 1.0
     */
    GENS_UPGRADED,
    /**
     * The number of generators the player has purchased.
     *
     * @since 1.0
     */
    GENS_PURCHASED,
    /**
     * The number of items the player has sold.
     *
     * @since 1.0
     */
    ITEMS_SOLD,
    /**
     * The amount of money the player has earned selling generator drops.
     *
     * @since 1.0
     */
    MONEY_EARNED,
    /**
     * The amount of XP the player has earned selling generator drops.
     *
     * @since 1.0
     */
    XP_EARNED,
    /**
     * The number of times the player has used a sell wand.
     *
     * @since 1.0
     */
    SELL_WAND_USES
}
