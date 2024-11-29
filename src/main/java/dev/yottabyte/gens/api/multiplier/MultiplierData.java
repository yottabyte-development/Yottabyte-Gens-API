package dev.yottabyte.gens.api.multiplier;

/**
 * Used for calculating the multiplier data for a player.
 *
 * @since 1.0
 */
public interface MultiplierData {
    /**
     * Returns the player's multiplier for the given multiplier type.
     *
     * @param type the multiplier type
     * @return the player's multiplier
     * @since 1.0
     */
    double getPlayerMultiplier(MultiplierType type);

    /**
     * Returns the total multiplier for the given multiplier type.
     *
     * @param type the multiplier type
     * @return the total multiplier
     * @since 1.0
     */
    double getTotalMultiplier(MultiplierType type);
}
