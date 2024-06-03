package com.yottabyte.generators.api.data.player;

import com.yottabyte.generators.api.generator.Generator;
import org.bukkit.Location;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * Represents the data of a player.
 *
 * @since 1.0
 */
public interface PlayerData {

    /**
     * Returns the player's UUID.
     *
     * @return the player's UUID
     * @since 1.0
     */
    UUID getUuid();

    /**
     * Checks if the player has any data.
     *
     * @return <code>true</code> if the player has data; otherwise <code>false</code>
     * @since 1.0
     */
    boolean hasData();

    /**
     * Returns the maximum number of generators the player can have.
     *
     * @return the maximum number of generators (null if not set)
     * @since 1.0
     */
    Integer getMaxGenerators();

    /**
     * Adds to the maximum number of generators the player can have.
     *
     * @param maxGenerators the maximum number of generators to add
     * @since 1.0
     */
    void addMaxGenerators(int maxGenerators);

    /**
     * Sets the maximum number of generators the player can have.
     *
     * @param maxGenerators the maximum number of generators
     * @since 1.0
     */
    void setMaxGenerators(int maxGenerators);

    /**
     * Returns the generators of the player.
     *
     * @return the generators of the player
     * @since 1.0
     */
    Set<PlayerGenerator> getGenerators();

    /**
     * Returns the amount of generators the player has currently.
     *
     * @return the amount of generators
     * @since 1.0
     */
    int getGeneratorsCount();

    /**
     * Returns one of the player's generators by its location.
     *
     * @param location the supposed location of the generator
     * @return the player generator, on an empty Optional if no player generator was found
     * @since 1.0
     */
    Optional<PlayerGenerator> getGeneratorByLocation(Location location);

    /**
     * Adds a generator to the player's data.
     *
     * @param location  the location of the generator
     * @param generator the generator to add
     * @return the added player generator
     * @since 1.0
     */
    PlayerGenerator addGenerator(Location location, Generator generator);

    /**
     * Removes a generator from the player's data.
     *
     * @param playerGenerator the generator to remove
     * @since 1.0
     */
    void removeGenerator(PlayerGenerator playerGenerator);

    /**
     * Checks if the generators of the player are running.
     *
     * @return <code>true</code> if the generators are running; otherwise <code>false</code>
     * @since 1.0
     */
    boolean isGeneratorsRunning();

    /**
     * Runs all the generators of the player.
     * <p>
     * This method doesn't check if the player is in a generator world.
     *
     * @since 1.0
     */
    void runGenerators();

    /**
     * Stops all the generators of the player.
     *
     * @since 1.0
     */
    void stopGenerators();

    /**
     * Returns the player's silo.
     *
     * @return the player's silo (null if not set)
     * @since 1.0
     */
    PlayerSilo getSilo();

    /**
     * Returns the player's silo by its location.
     *
     * @param location the location of the presumed silo
     * @return the player's silo, or an empty Optional if no silo was found
     * @since 1.0
     */
    Optional<PlayerSilo> getSiloByLocation(Location location);

    /**
     * Checks if the player has a silo.
     * <p>
     * Use this method instead of checking if {@code getSilo()} is not <code>null</code>.
     *
     * @return {@code true} if the player has a silo, otherwise {@code false}
     * @since 1.0
     */
    boolean hasSilo();

    /**
     * Creates a silo in the player's data.
     *
     * @param location the location of the created silo
     * @return the created silo
     * @since 1.0
     */
    PlayerSilo setSilo(Location location);

    /**
     * Removes the silo from the player's data.
     *
     * @param playerSilo the silo to remove
     * @since 1.0
     */
    void removeSilo(PlayerSilo playerSilo);

    /**
     * Returns the player's XP.
     *
     * @return the player's XP (null if not set)
     * @since 1.0
     */
    Long getXP();

    /**
     * Adds XP to the player.
     *
     * @param xp the amount of XP to add
     * @since 1.0
     */
    void addXP(long xp);

    /**
     * Sets the player's XP.
     *
     * @param xp the XP to set
     * @since 1.0
     */
    void setXP(long xp);

    /**
     * Returns the player's level.
     *
     * @return the player's level (null if not set)
     * @since 1.0
     */
    Integer getLevel();

    /**
     * Adds levels to the player.
     *
     * @param level the amount of levels to add
     * @since 1.0
     */
    void addLevel(int level);

    /**
     * Sets the player's level.
     *
     * @param level the level to set
     * @since 1.0
     */
    void setLevel(int level);

    /**
     * Returns the player's prestige level.
     *
     * @return the player's prestige level (null it not set)
     * @since 1.0
     */
    Integer getPrestigeLevel();

    /**
     * Adds prestige levels to the player.
     *
     * @param prestigeLevel the amount of prestige levels to add
     * @since 1.0
     */
    void addPrestigeLevel(int prestigeLevel);

    /**
     * Sets the player's prestige level.
     *
     * @param prestigeLevel the prestige level to set
     * @since 1.0
     */
    void setPrestigeLevel(int prestigeLevel);

    /**
     * Returns the player's multiplier.
     *
     * @return the player's multiplier (null if not set)
     * @since 1.0
     */
    Double getMultiplier();

    /**
     * Adds to the player's multiplier.
     *
     * @param multiplier the multiplier value to add
     * @since 1.0
     */
    void addMultiplier(double multiplier);

    /**
     * Sets the player's multiplier.
     *
     * @param multiplier the multiplier to set
     * @since 1.0
     */
    void setMultiplier(double multiplier);
}
