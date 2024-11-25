package dev.yottabyte.generators.api.party;

/**
 * Represents a drops multiplier party.
 *
 * @since 1.0
 */
public interface DropsMultiplierParty extends Party {
    /**
     * Returns the drops multiplier.
     *
     * @return the drops multiplier
     * @since 1.0
     */
    int getMultiplier();
}
