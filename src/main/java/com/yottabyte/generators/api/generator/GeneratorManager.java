package com.yottabyte.generators.api.generator;

import com.yottabyte.generators.api.data.player.PlayerGenerator;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * The manager for all generators related operations.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public interface GeneratorManager {
    /**
     * Reloads generators and everything related to them.
     *
     * @since 1.0
     */
    void reload();

    /**
     * Returns an unmodifiable list of all loaded/registered generators.
     *
     * @return the list of all loaded/registered generators
     * @see #getGeneratorIds
     * @since 1.0
     */
    List<Generator> getGenerators();

    /**
     * Returns an unmodifiable list of all generator IDs.
     *
     * @return the list of all generator IDs
     * @see #getGeneratorById
     * @since 1.0
     */
    List<String> getGeneratorIds();

    /**
     * Returns a generator by its ID.
     *
     * @param id the ID of the generator to retrieve
     * @return the generator with the specified ID, or an empty Optional if no generator was found
     * @since 1.0
     */
    Optional<Generator> getGeneratorById(String id);

    /**
     * Returns a generator by its item.
     *
     * @param itemStack the presumed generator item
     * @return the generator associated with the item, or an empty Optional if no generator was found
     * @see #buildGeneratorItem
     * @see #giveGeneratorItem
     * @since 1.0
     */
    Optional<Generator> getGeneratorByItem(ItemStack itemStack);

    /**
     * Builds a generator item with a specified amount.
     * <p>
     * The generator item is specified in the generator's configuration file.
     * The configuration section: <code>item</code>
     *
     * @param generator the generator for which to build the item
     * @param amount    the amount of items to build
     * @return the generator item
     * @since 1.0
     */
    ItemStack buildGeneratorItem(Generator generator, int amount);

    /**
     * Gives a generator item to an online player.
     *
     * @param player    the player to give the generator item to
     * @param generator the generator item to build and give
     * @param amount    the amount of items to build and give
     * @since 1.0
     */
    void giveGeneratorItem(Player player, Generator generator, int amount);

    /**
     * Creates a generator at a specified block location.
     *
     * @param player    the player creating the generator (owner of the generator)
     * @param generator the generator to create
     * @param location  the location at which to create the generator
     * @since 1.0
     */
    void createGenerator(Player player, Generator generator, Location location);

    /**
     * Removes a player's generator.
     *
     * @param player          the online owner of the generator
     * @param playerGenerator the generator to remove
     * @since 1.0
     */
    void removeGenerator(Player player, PlayerGenerator playerGenerator);

    /**
     * Disables all generators on the server.
     *
     * @param initiator the initiator of the action (e.g. console or the player's name)
     * @since 1.0
     */
    void disableGenerators(String initiator);

    /**
     * Enables all generators on the server.
     *
     * @param initiator the initiator of the action (e.g. console or the player's name)
     * @since 1.0
     */
    void enableGenerators(String initiator);

    /**
     * Checks if a specified world name is a generator world.
     *
     * @param world the world name
     * @return <code>true</code> if the world is a generator world; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean isGeneratorWorld(String world);

    /**
     * Returns an unmodifiable set of all player generators owned by a player.
     *
     * @param player the online owner of the generators
     * @return the set of all player generators owned by the player
     * @see #getPlayerGenerator
     * @see #isPlayerGenerator(UUID, Location)
     * @since 1.0
     */
    Set<PlayerGenerator> getPlayerGenerators(Player player);

    /**
     * Returns a player generator by its owner and location.
     *
     * @param owner    the online owner of the generator
     * @param location the location of the generator
     * @return the player generator, or an empty Optional if no player generator was found
     * @see #isPlayerGenerator(UUID, Location)
     * @since 1.0
     */
    Optional<PlayerGenerator> getPlayerGenerator(Player owner, Location location);

    /**
     * Checks if a specified location is a player generator owned by a player.
     *
     * @param uuid     the owner's UUID (can be offline)
     * @param location the presumed location of the generator
     * @return <code>true</code> if the location is a player generator owned by the player; <code>false</code> otherwise.
     * @see #isPlayerGenerator(Location)
     * @since 1.0
     */
    boolean isPlayerGenerator(UUID uuid, Location location);

    /**
     * Checks if a specified location is a player generator.
     * <p>
     * Note: This method iterates over <b>all</b> player generators on the server.
     * Although this method uses a <code>parallelStream()</code>, only use if necessary.
     * It's recommended to use {@link #isPlayerGenerator(UUID, Location)} instead.
     *
     * @param location the presumed location of the generator
     * @return <code>true</code> if the location is a player generator; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean isPlayerGenerator(Location location);

    /**
     * Stops all generators owned by a player.
     *
     * @param owner the online owner of the generators
     * @return <code>true</code> if the generators were stopped; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean stopPlayerGenerators(Player owner);

    /**
     * Starts all generators owned by a player.
     *
     * @param owner the online owner of the generators
     * @return <code>true</code> if the generators were started; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean startGenerators(Player owner);

    /**
     * Returns the maximum number of generators a player can have at once.
     *
     * @param uuid the player's UUID
     * @return the maximum number of generators the player can have at once
     * @since 1.0
     */
    int getMaximumGenerators(UUID uuid);

    /**
     * Adds to the maximum number of generators a player can have at once.
     *
     * @param uuid              the player's UUID
     * @param maximumGenerators the maximum number of generators to add
     * @return <code>true</code> if the maximum generators were added; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean addMaximumGenerators(UUID uuid, int maximumGenerators);

    /**
     * Sets the maximum number of generators a player can have at once.
     *
     * @param uuid              the player's UUID
     * @param maximumGenerators the maximum number of generators the player can have at once
     * @return <code>true</code> if the maximum generators were set; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean setMaximumGenerators(UUID uuid, int maximumGenerators);

    /**
     * Returns the generator upgrade for a generator by its ID.
     *
     * @param generatorId the ID of the generator
     * @return the generator upgrade for the generator, or an empty Optional if no generator upgrade was found
     * @since 1.0
     */
    Optional<GeneratorUpgrade> getGeneratorUpgradeByGeneratorId(String generatorId);

    /**
     * Opens the generator upgrade menu for a player.
     *
     * @param player          the player to open the menu for
     * @param playerGenerator the generator to upgrade
     * @since 1.0
     */
    void openGeneratorUpgradeMenu(Player player, PlayerGenerator playerGenerator);
}
