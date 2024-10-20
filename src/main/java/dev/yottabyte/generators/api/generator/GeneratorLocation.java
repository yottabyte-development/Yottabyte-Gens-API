package dev.yottabyte.generators.api.generator;

import org.bukkit.Location;

import java.util.UUID;

/**
 * Represents a generator location.
 *
 * @since 1.0
 */
public interface GeneratorLocation {
    /**
     * Returns the owner UUID of the generator.
     *
     * @return the owner's UUID
     * @since 1.0
     */
    UUID getOwner();

    /**
     * Returns the UUID of the generator.
     *
     * @return the UUID of the generator
     * @since 1.0
     */
    UUID getUuid();

    /**
     * Returns the x coordinate of the generator.
     *
     * @return the x coordinate of the generator
     * @since 1.0
     */
    int getX();

    /**
     * Returns the y coordinate of the generator.
     *
     * @return the y coordinate of the generator
     * @since 1.0
     */
    int getY();

    /**
     * Returns the z coordinate of the generator.
     *
     * @return the z coordinate of the generator
     * @since 1.0
     */
    int getZ();

    /**
     * Returns the world of the generator.
     *
     * @return the world of the generator
     * @since 1.0
     */
    String getWorld();

    /**
     * Returns the generator.
     *
     * @return the generator
     * @since 1.0
     */
    Generator getGenerator();

    /**
     * Updates the generator at the location.
     *
     * @param generator the generator to update
     * @since 1.0
     */
    void updateGenerator(Generator generator);

    /**
     * Converts the generator location to a Bukkit location.
     *
     * @return the Bukkit location
     * @since 1.0
     */
    Location toBukkitLocation();

    /**
     * Checks whether the bukkit location is equal to the generator location.
     *
     * @param location the bukkit location
     * @return <code>true</code> if the locations are equal; <code>false</code> otherwise
     * @since 1.0
     */
    boolean equalsBukkitLocation(Location location);

    /**
     * Checks whether the generator location is synced with the data source.
     *
     * @return <code>true</code> if the generator location is synced; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean isSynced();

    /**
     * Sets whether the generator location is synced with the data source.
     *
     * @param synced <code>true</code> if the generator location is synced and <code>false</code> otherwise.
     * @since 1.0
     */
    void setSynced(boolean synced);

    /**
     * Checks whether the generator location is deleted.
     *
     * @return <code>true</code> if the generator location is deleted; <code>false</code> otherwise.
     * @since 1.0
     */
    boolean isDeleted();

    /**
     * Sets whether the generator location is deleted.
     *
     * @param deleted <code>true</code> if the generator location is deleted and <code>false</code> otherwise.
     * @since 1.0
     */
    void setDeleted(boolean deleted);
}
