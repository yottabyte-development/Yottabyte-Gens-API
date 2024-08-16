package com.yottabyte.generators.api.data.player;

import com.yottabyte.generators.api.generator.Generator;
import com.yottabyte.generators.api.generator.GeneratorLocation;

import java.util.UUID;

/**
 * Represents a generator owned by a player.
 *
 * @since 1.0
 */
public interface PlayerGenerator {
    /**
     * Returns the owner UUID of the generator.
     *
     * @return the owner UUID of the generator
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
     * Returns the generator.
     *
     * @return the generator
     * @since 1.0
     */
    Generator getGenerator();

    /**
     * Returns the location of the generator.
     *
     * @return the location of the generator
     * @since 1.0
     */
    GeneratorLocation getLocation();

    /**
     * Starts the generator and begins generating items.
     *
     * @since 1.0
     */
    void start();

    /**
     * Stops the generator and stops generating items.
     *
     * @since 1.0
     */
    void stop();
}
