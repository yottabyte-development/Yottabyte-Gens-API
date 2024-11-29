package dev.yottabyte.gens.api.multiplier;

import dev.yottabyte.gens.api.sell.wand.SellWand;
import org.bukkit.entity.Player;

/**
 * Used for calculating the multiplier data of players.
 *
 * @since 1.0
 */
public interface MultiplierDataCalculator {
    /**
     * Returns the calculated {@link MultiplierData} for the player.
     *
     * @param player the player to calculate the multiplier for
     * @param types  the multiplier types populate the {@link MultiplierData} with
     * @return the calculated {@link MultiplierData}
     * @since 1.0
     */
    MultiplierData getMultiplier(Player player, MultiplierType... types);

    /**
     * Returns the calculated {@link MultiplierData} for the player.
     *
     * @param player   the player to calculate the multiplier for
     * @param sellWand the sell wand to calculate the multiplier for (can be <code>null</code>)
     * @param types    the multiplier types populate the {@link MultiplierData} with
     * @return the calculated {@link MultiplierData}
     * @since 1.0
     */
    MultiplierData getMultiplier(Player player, SellWand sellWand, MultiplierType... types);
}
