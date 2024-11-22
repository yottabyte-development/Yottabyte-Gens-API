package dev.yottabyte.generators.api.party;

/**
 * Represents a party.
 *
 * @since 1.0
 */
public interface Party {
    /**
     * Returns the party type.
     *
     * @return the party type
     * @since 1.0
     */
    PartyType getPartyType();

    /**
     * Returns the duration of the party in milliseconds.
     *
     * @return the duration of the party in milliseconds
     * @since 1.0
     */
    long getDuration();
}
