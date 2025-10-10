package dev.yottabyte.gens.api.prestige;

/**
 * Represents a prestige threshold.
 *
 * @since 1.0
 */
public interface Prestige {

    /**
     * Returns the prestige level.
     *
     * @return the prestige level
     * @since 1.0
     */
    int getLevel();

    /**
     * Returns the cost to prestige.
     *
     * @return the cost to prestige
     * @since 1.0
     */
    double getCost();

    /**
     * Returns the required player level to prestige.
     *
     * @return the required player level to prestige
     * @since 1.0
     */
    int getRequiredLevel();
}
