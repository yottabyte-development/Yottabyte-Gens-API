package dev.yottabyte.gens.api.silo;

/**
 * Represents the index of a silo content.
 *
 * @since 1.0
 */
public interface SiloContentIndex {

    /**
     * Returns the page of the silo content.
     *
     * @return the page of the silo content
     * @since 1.0
     */
    int getPage();

    /**
     * Returns the slot of the silo content.
     *
     * @return the slot of the silo content
     * @since 1.0
     */
    int getSlot();
}
