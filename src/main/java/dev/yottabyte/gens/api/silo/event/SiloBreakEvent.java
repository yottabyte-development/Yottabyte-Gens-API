package dev.yottabyte.gens.api.silo.event;

import dev.yottabyte.gens.api.silo.SiloLocation;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player breaks a silo.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class SiloBreakEvent extends SiloEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    /**
     * Creates a new instance of the event.
     *
     * @param player   the player who broke the silo
     * @param location the location of the broken silo
     * @since 1.0
     */
    public SiloBreakEvent(@NotNull Player player, @NotNull SiloLocation location) {
        super(player, location);
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
