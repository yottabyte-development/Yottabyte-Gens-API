package dev.yottabyte.generators.api.prestige;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

/**
 * The manager for prestige related operations.
 *
 * @since 1.0
 */
public interface PrestigeManager {

    /**
     * Returns the registered/loaded prestige levels.
     *
     * @return the list of prestige levels
     * @since 1.0
     */
    List<Prestige> getPrestiges();

    /**
     * Returns the player's prestige level.
     *
     * @param uuid the player's UUID
     * @return the player's prestige level
     * @since 1.0
     */
    int getPrestigeLevel(UUID uuid);

    /**
     * Adds prestige levels to a player.
     *
     * @param uuid   the player's UUID
     * @param amount the amount to add
     * @since 1.0
     */
    void addPrestigeLevel(UUID uuid, int amount);

    /**
     * Returns the player's next prestige level.
     *
     * @param uuid the player's UUID
     * @return the player's next prestige level (-1 if the player is at the max prestige level)
     * @since 1.0
     */
    int getNextPrestigeLevel(UUID uuid);

    /**
     * Returns the player's next prestige.
     *
     * @param uuid the player's UUID
     * @return the player's next prestige (null if the player is at the max prestige level OR the next prestige level isn't loaded)
     * @since 1.0
     */
    Prestige getNextPrestige(UUID uuid);

    /**
     * Checks if the player can prestige.
     *
     * @param uuid the player's UUID
     * @return <code>true</code> if the player can prestige; otherwise <code>false</code>
     * @since 1.0
     */
    boolean canPrestige(UUID uuid);

    /**
     * Opens the prestige menu for a player.
     *
     * @param player the player to open the menu for
     * @since 1.0
     */
    void openPrestigeMenu(Player player);
}
