package dev.yottabyte.gens.api.prestige;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.UUID;
import java.util.function.Consumer;

/**
 * The manager for prestige related operations.
 *
 * @since 1.0
 */
public interface PrestigeManager {

    /**
     * Returns a prestige instance for the given level, computed from the formula.
     *
     * @param level the prestige level
     * @return the prestige for the given level
     * @since 1.0
     */
    Prestige getPrestige(long level);

    /**
     * Returns the player's prestige level.
     *
     * @param uuid the player's UUID
     * @return the player's prestige level
     * @since 1.0
     */
    long getPrestigeLevel(UUID uuid);

    /**
     * Adds prestige levels to a player.
     *
     * @param uuid   the player's UUID
     * @param amount the amount to add
     * @since 1.0
     */
    void addPrestigeLevel(UUID uuid, long amount);

    /**
     * Returns the player's next prestige level.
     *
     * @param uuid the player's UUID
     * @return the player's next prestige level (-1 if the player is at the max prestige level)
     * @since 1.0
     */
    long getNextPrestigeLevel(UUID uuid);

    /**
     * Returns the player's next prestige.
     *
     * @param uuid the player's UUID
     * @return the player's next prestige (null if the player is at the max prestige level)
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

    /**
     * Opens the prestige menu for a player.
     *
     * @param player       the player to open the menu for
     * @param previousMenu a consumer that handles the previous menu's click events
     * @since 1.0
     */
    void openPrestigeMenu(Player player, Consumer<InventoryClickEvent> previousMenu);
}
