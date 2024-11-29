package dev.yottabyte.gens.api.data.player;

import dev.yottabyte.gens.api.generator.GeneratorDrop;
import dev.yottabyte.gens.api.silo.SiloContent;
import dev.yottabyte.gens.api.silo.SiloLocation;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Represents a silo owned by a player.
 *
 * @since 1.0
 */
public interface PlayerSilo {
    /**
     * Returns the owner UUID of the silo.
     *
     * @return the owner UUID of the silo
     * @since 1.0
     */
    UUID getOwner();

    /**
     * Returns the location of the silo.
     *
     * @return the location of the silo
     * @since 1.0
     */
    SiloLocation getLocation();

    /**
     * Sets the location of the silo.
     *
     * @param location the location of the silo
     * @since 1.0
     */
    void setLocation(SiloLocation location);

    /**
     * Returns contents of the silo.
     * <p>
     * The key is the slot in the GUI and the value is the collected drops.
     *
     * @return the contents of the silo
     * @since 1.0
     */
    ConcurrentHashMap<Integer, SiloContent> getContents();

    /**
     * Clears all silo content
     * <p>
     * Use this method instead of calling {@code getContents().clear()}
     *
     * @since 1.0
     */
    void clearContents();

    /**
     * Collects a generator drop in the silo.
     *
     * @param generatorDrop the generator drop to collect
     * @param amount        the amount to add
     * @since 1.0
     */
    void collectDrop(GeneratorDrop generatorDrop, int amount);

    /**
     * Returns the total amount of collected items in the silo.
     *
     * @return the total amount of collected items
     * @since 1.0
     */
    long getCollectedItems();

    /**
     * Returns the total amount of collected items in the silo during its lifetime.
     *
     * @return the total amount of collected items during its lifetime
     * @since 1.0
     */
    long getLifetimeCollectedItems();
}
