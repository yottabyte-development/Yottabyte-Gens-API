package dev.yottabyte.gens.api.level;

import java.util.List;
import java.util.UUID;

/**
 * The manager for level and xp related operations.
 *
 * @since 1.0
 */
public interface LevelManager {

    /**
     * Returns the registered/loaded levels.
     *
     * @return the list of levels
     * @since 1.0
     */
    List<Level> getLevels();

    /**
     * Returns the player's level.
     *
     * @param uuid the player's UUID
     * @return the player's level
     * @since 1.0
     */
    int getPlayerLevel(UUID uuid);

    /**
     * Returns the player's next level.
     *
     * @param uuid the player's UUID
     * @return the player's next level (null if the player is at the max level)
     * @since 1.0
     */
    Level getPlayerNextLevel(UUID uuid);

    /**
     * Returns the player's level XP.
     *
     * @param uuid the player's UUID
     * @return the player's level XP
     * @since 1.0
     */
    long getPlayerXP(UUID uuid);

    /**
     * Adds to the player's level XP.
     *
     * @param uuid the player's UUID
     * @param xp   the level XP to add
     * @since 1.0
     */
    void addPlayerXP(UUID uuid, long xp);

    /**
     * Sets the player's level XP.
     *
     * @param uuid the player's UUID
     * @param xp   the level XP to set
     * @since 1.0
     */
    void setPlayerXP(UUID uuid, long xp);

    /**
     * Remove the player's level XP.
     *
     * @param uuid the player's UUID
     * @param xp   the level XP to remove
     * @since 1.0
     */
    void removePlayerXP(UUID uuid, long xp);

    /**
     * Returns the total amount of XP required to level up.
     *
     * @param uuid the player's UUID
     * @return the total amount of XP required to level up (-1 if the player is at the max level OR the next level isn't loaded)
     * @since 1.0
     */
    long getPlayerNextLevelXP(UUID uuid);

    /**
     * Returns the player's remaining XP to level up.
     *
     * @param uuid the player's UUID
     * @return the player's remaining XP to level up (-1 if the player is at the max level)
     * @since 1.0
     */
    long getPlayerRemainingXP(UUID uuid);

    /**
     * Checks if the player can level up.
     *
     * @param uuid the player's UUID
     * @return <code>true</code> if the player can level up; otherwise <code>false</code>
     * @since 1.0
     */
    boolean canLevelUp(UUID uuid);
}
