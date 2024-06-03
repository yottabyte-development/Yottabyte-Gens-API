package com.yottabyte.generators.api.sell;

/**
 * POJO used to store calculated sell data.
 *
 * @since 1.0
 */
public interface SellData {

    /**
     * Returns the amount of items that are to be sold.
     *
     * @return the amount of items that are to be sold
     * @since 1.0
     */
    long getItemCount();

    /**
     * Returns the total sell price of the items. (includes the sell multiplier)
     *
     * @return the total sell price of the items
     * @since 1.0
     */
    double getTotalSellPrice();

    /**
     * Returns the total sell XP of the items.
     *
     * @return the total sell XP of the items
     * @since 1.0
     */
    long getTotalSellXP();
}
