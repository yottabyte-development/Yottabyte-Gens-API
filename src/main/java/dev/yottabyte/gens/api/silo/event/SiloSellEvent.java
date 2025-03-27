package dev.yottabyte.gens.api.silo.event;

import dev.yottabyte.gens.api.data.player.PlayerSilo;
import dev.yottabyte.gens.api.sell.SellData;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player sells the contents of a silo.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class SiloSellEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final PlayerSilo silo;
    private final SellData sellData;

    /**
     * Creates a new instance of the event.
     *
     * @param player   the player who sold the contents of the silo
     * @param silo     the silo whose contents were sold
     * @param sellData the sell data containing the information about the sell action
     * @since 1.0
     */
    public SiloSellEvent(@NotNull Player player, @NotNull PlayerSilo silo, @NotNull SellData sellData) {
        super(player);
        this.silo = silo;
        this.sellData = sellData;
    }

    /**
     * Returns the silo whose contents were sold.
     *
     * @return the silo whose contents were sold
     * @since 1.0
     */
    public @NotNull PlayerSilo getSilo() {
        return this.silo;
    }

    /**
     * Returns the sell data containing the information about the sell action.
     *
     * @return the sell data containing the information about the sell action
     * @since 1.0
     */
    public @NotNull SellData getSellData() {
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
