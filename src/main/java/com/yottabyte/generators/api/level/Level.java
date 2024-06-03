package com.yottabyte.generators.api.level;

import java.util.List;

/**
 * Represents a level
 *
 * @since 1.0
 */
public interface Level {
    /**
     * Returns the level.
     *
     * @return the level
     * @since 1.0
     */
    int getLevel();

    /**
     * Returns the required XP to level-up.
     *
     * @return the required XP to level-up.
     * @since 1.0
     */
    long getExperience();

    /**
     * Returns the list of commands to be run on level-up.
     *
     * @return the list of commands to be run on level-up
     * @since 1.0
     */
    List<String> getCommands();
}
