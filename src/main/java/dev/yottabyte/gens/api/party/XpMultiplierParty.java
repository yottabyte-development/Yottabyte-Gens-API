package dev.yottabyte.gens.api.party;

/**
 * Represents a XP multiplier party.
 *
 * @since 1.0
 */
public interface XpMultiplierParty extends Party {
    /**
     * Returns the XP multiplier.
     *
     * @return the XP multiplier
     * @since 1.0
     */
    double getMultiplier();
}
