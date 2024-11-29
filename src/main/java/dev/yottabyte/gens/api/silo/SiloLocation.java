package dev.yottabyte.gens.api.silo;

import org.bukkit.Location;

import java.util.UUID;

/**
 * Represents a silo location.
 *
 * @since 1.0
 */
public interface SiloLocation {
    /**
     * Returns the owner UUID of the silo.
     *
     * @return the owner's UUID
     * @since 1.0
     */
    UUID getOwner();

    /**
     * Returns the x coordinate of the silo.
     *
     * @return the x coordinate of the silo
     * @since 1.0
     */
    int getX();

    /**
     * Returns the y coordinate of the silo.
     *
     * @return the y coordinate of the silo
     * @since 1.0
     */
    int getY();

    /**
     * Returns the z coordinate of the silo.
     *
     * @return the z coordinate of the silo
     * @since 1.0
     */
    int getZ();

    /**
     * Returns the world of the silo.
     *
     * @return the world of the silo
     * @since 1.0
     */
    String getWorld();

    /**
     * Converts the silo location to a Bukkit location.
     *
     * @return the Bukkit location
     * @since 1.0
     */
    Location toBukkitLocation();

    /**
     * Checks whether the bukkit location is equal to the silo location.
     *
     * @param location the bukkit location
     * @return <code>true</code> if the locations are equal; <code>false</code> otherwise
     * @since 1.0
     */
    boolean equalsBukkitLocation(Location location);
}
