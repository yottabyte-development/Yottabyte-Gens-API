package dev.yottabyte.gens.api.silo;

import dev.yottabyte.gens.api.generator.GeneratorDrop;

/**
 * Represents collected items in a silo.
 *
 * @since 1.0
 */
public interface SiloContent {

    /**
     * Returns the collected generator drop.
     *
     * @return the collected generator drop
     * @since 1.0
     */
    GeneratorDrop getGeneratorDrop();

    /**
     * Returns the amount of drops collected.
     *
     * @return the amount of drops collected
     * @since 1.0
     */
    long getAmount();

    /**
     * Increments the amount of drops collected.
     *
     * @param amount the amount to increment by
     * @since 1.0
     */
    void incrementAmount(int amount);
}
