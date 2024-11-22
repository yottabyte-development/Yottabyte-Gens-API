package dev.yottabyte.generators.api.party;

/**
 * Represents a sell multiplier party.
 *
 * @since 1.0
 */
public interface SellMultiplierParty extends Party {
    /**
     * Returns the multiplier.
     *
     * @return the multiplier
     * @since 1.0
     */
    double getMultiplier();
}
