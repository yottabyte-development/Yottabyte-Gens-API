package dev.yottabyte.gens.api.party.event;

import dev.yottabyte.gens.api.party.Party;
import org.bukkit.event.Event;

/**
 * Represents an event that is related to a party.
 *
 * @since 1.0
 */
public abstract class PartyEvent extends Event {
    private final Party party;

    /**
     * Creates a new instance of the event.
     *
     * @param party the party involved in the event
     * @since 1.0
     */
    public PartyEvent(Party party) {
        this.party = party;
    }

    /**
     * Returns the party involved in the event.
     *
     * @return the party involved in the event
     * @since 1.0
     */
    public Party getParty() {
        return this.party;
    }
}
