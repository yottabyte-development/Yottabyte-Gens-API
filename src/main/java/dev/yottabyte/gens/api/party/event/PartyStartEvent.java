package dev.yottabyte.gens.api.party.event;

import dev.yottabyte.gens.api.party.Party;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a party starts.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class PartyStartEvent extends PartyEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    /**
     * Creates a new instance of the event.
     *
     * @param party the party that was started
     * @since 1.0
     */
    public PartyStartEvent(@NotNull Party party) {
        super(party);
    }

    /**
     * Returns the handler list for this event.
     *
     * @return the handler list for this event
     * @since 1.0
     */
    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    /**
     * Returns the handler list for this event statically.
     *
     * @return the handler list for this event
     * @since 1.0
     */
    public static @NotNull HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
