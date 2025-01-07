package dev.yottabyte.gens.api.level;

import java.util.List;

/**
 * Represents a level reward
 *
 * @since 1.0
 */
public interface LevelReward {
    /**
     * Returns the level.
     *
     * @return the level
     * @since 1.0
     */
    int getLevel();

    /**
     * Returns the list of commands to be run on level-up.
     *
     * @return the list of commands to be run on level-up
     * @since 1.0
     */
    List<String> getCommands();
}
