package com.yottabyte.generators.api.prestige;

import java.util.List;

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

    /**
     * Returns the list of commands to be run on prestige-up.
     *
     * @return the list of commands to be run on prestige-up
     * @since 1.0
     */
    List<String> getCommands();
}
