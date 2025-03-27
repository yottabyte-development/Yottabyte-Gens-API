package dev.yottabyte.gens.api.sell.event;

import dev.yottabyte.gens.api.sell.SellData;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player performs a sell action.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class SellEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final SellData sellData;

    /**
     * Creates a new instance of the event.
     *
     * @param player   the player who performed the sell action
     * @param sellData the sell data containing the information about the sell action
     * @since 1.0
     */
    public SellEvent(@NotNull Player player, @NotNull SellData sellData) {
        super(player);
        this.sellData = sellData;
    }

    /**
     * Returns the sell data containing the information about the sell action.
     *
     * @return the sell data containing the information about the sell action
     * @since 1.0
     */
    public SellData getSellData() {
        return this.sellData;
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
