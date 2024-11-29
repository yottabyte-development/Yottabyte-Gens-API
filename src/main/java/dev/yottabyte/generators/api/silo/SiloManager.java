package dev.yottabyte.generators.api.silo;

import dev.yottabyte.generators.api.data.player.PlayerSilo;
import dev.yottabyte.generators.api.sell.SellData;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

/**
 * The manager for all silo related operations.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public interface SiloManager {
    /**
     * Reloads everything related to silos.
     *
     * @since 1.0
     */
    void reload();

    /**
     * Returns the registered silo.
     *
     * @return the registered silo
     * @since 1.0
     */
    Silo getSilo();

    /**
     * Checks if an item is a silo.
     *
     * @param itemStack the presumed silo item
     * @return <code>true</code> if the item is a silo; <code>false</code> otherwise
     * @since 1.0
     */
    boolean isSiloByItem(ItemStack itemStack);

    /**
     * Builds a silo item.
     * <p>
     * The silo item is specified in the <code>config.yml</code> configuration file.
     * The configuration section: <code>silos.item</code>
     *
     * @return the silo item
     * @since 1.0
     */
    ItemStack buildSiloItem();

    /**
     * Gives a silo item to an online player.
     *
     * @param player the player to give the silo item to
     * @since 1.0
     */
    void giveSiloItem(Player player);

    /**
     * Creates a silo at a specified location.
     *
     * @param player   the player creating the silo (owner of the silo)
     * @param location the location at which to create the silo
     * @since 1.0
     */
    void createSilo(Player player, Location location);

    /**
     * Removes player's silo.
     *
     * @param player     the online owner of the silo
     * @param playerSilo the silo to remove
     * @since 1.0
     */
    void removeSilo(Player player, PlayerSilo playerSilo);

    /**
     * Returns whether a player silo by its owner and location.
     *
     * @param owner    the online owner of the silo
     * @param location the location of the silo
     * @return the player silo, or an empty Optional if no player silo was found
     * @since 1.0
     */
    Optional<PlayerSilo> getPlayerSilo(Player owner, Location location);

    /**
     * Returns whether a location is a player silo.
     *
     * @param location the location to check
     * @return <code>true</code> if the location is a player silo; <code>false</code> otherwise
     * @since 1.0
     */
    boolean isPlayerSilo(Location location);

    /**
     * Opens the silo menu for a player.
     *
     * @param player     the player to open the menu for
     * @param playerSilo the player's silo
     * @see #openPlayerSiloMenu(Player)
     * @since 1.0
     */
    void openPlayerSiloMenu(Player player, PlayerSilo playerSilo);

    /**
     * Opens the silo menu for a player.
     *
     * @param player the player to open the menu for
     * @since 1.0
     */
    void openPlayerSiloMenu(Player player);

    /**
     * Sells the player's silo contents.
     *
     * @param player     the player selling the silo contents
     * @param playerSilo the player's silo
     * @return <code>true</code> if the silo contents were sold; <code>false</code> otherwise
     * @see #getSiloSellData
     * @since 1.0
     */
    boolean sellSiloContents(Player player, PlayerSilo playerSilo);

    /**
     * Calculates the silo sell data for a player silo.
     * <p>
     * The sell data includes the total items, total price, and total level XP.
     *
     * @param player     the player to calculate the sell data for
     * @param playerSilo the silo to calculate the sell data for
     * @return the silo sell data
     * @see #sellSiloContents
     * @since 1.0
     */
    SellData getSiloSellData(Player player, PlayerSilo playerSilo);
}
