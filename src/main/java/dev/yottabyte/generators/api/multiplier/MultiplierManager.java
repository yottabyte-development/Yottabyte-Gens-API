package dev.yottabyte.generators.api.multiplier;

import java.util.UUID;

/**
 * The manager for all multiplier related operations.
 *
 * @since 1.0
 */
public interface MultiplierManager {
    /**
     * Returns the multiplier data calculator.
     *
     * @return the multiplier data calculator
     * @since 1.0
     */
    MultiplierDataCalculator getMultiplierDataCalculator();

    /**
     * Returns the multiplier for the player.
     *
     * @param uuid the player's UUID
     * @param type the multiplier type
     * @return the player's multiplier
     * @since 1.0
     */
    double getPlayerMultiplier(UUID uuid, MultiplierType type);

    /**
     * Adds to the multiplier for the player.
     *
     * @param uuid       the player's UUID
     * @param type       the multiplier type
     * @param multiplier the multiplier value to add
     * @return <code>true</code> if the multiplier was added; otherwise <code>false</code>
     * @since 1.0
     */
    boolean addPlayerMultiplier(UUID uuid, MultiplierType type, double multiplier);

    /**
     * Sets the multiplier for the player.
     *
     * @param uuid       the player's UUID
     * @param type       the multiplier type
     * @param multiplier the multiplier to set
     * @return <code>true</code> if the multiplier was set; otherwise <code>false</code>
     * @since 1.0
     */
    boolean setPlayerMultiplier(UUID uuid, MultiplierType type, double multiplier);
}
