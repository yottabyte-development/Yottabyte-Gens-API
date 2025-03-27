package dev.yottabyte.gens.api.generator.event;

import dev.yottabyte.gens.api.data.player.PlayerGenerator;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player breaks a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class GeneratorBreakEvent extends GeneratorEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    /**
     * Creates a new instance of the event.
     *
     * @param player    the player who broke the generator
     * @param generator the generator that was broken
     * @since 1.0
     */
    public GeneratorBreakEvent(@NotNull Player player, @NotNull PlayerGenerator generator) {
        super(player, generator);
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
