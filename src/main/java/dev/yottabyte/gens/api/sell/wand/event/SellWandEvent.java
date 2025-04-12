package dev.yottabyte.gens.api.sell.wand.event;

import dev.yottabyte.gens.api.sell.SellData;
import dev.yottabyte.gens.api.sell.wand.SellWand;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player uses a sell wand
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class SellWandEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final SellData sellData;
    private final SellWand sellWand;
    private final int currentUses;
    private final int previousUses;

    /**
     * Creates a new instance of the event.
     *
     * @param player   the player who used the sell wand
     * @param sellData the sell data containing the information about the sell action
     * @param sellWand the sell wand used
     * @param currentUses the uses on the sell wand used after the sell action
     * @param previousUses the uses on the sell wand used before the sell action
     * @since 1.0
     */
    public SellWandEvent(@NotNull Player player, @NotNull SellData sellData, @NotNull SellWand sellWand,
                         int currentUses, int previousUses) {
        super(player);
        this.sellData = sellData;
        this.sellWand = sellWand;
        this.currentUses = currentUses;
        this.previousUses = previousUses;
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
     * Returns the sell wand used.
     *
     * @return the sell wand used
     * @since 1.0
     */
    public SellWand getSellWand() {
        return this.sellWand;
    }

    /**
     * Returns the uses on the sell wand used after the sell action.
     *
     * @return the uses on the sell wand used after the sell action
     * @since 1.0
     */
    public int getCurrentUses() {
        return this.currentUses;
    }

    /**
     * Returns the uses on the sell wand used before the sell action.
     *
     * @return the uses on the sell wand used before the sell action
     * @since 1.0
     */
    public int getPreviousUses() {
        return this.previousUses;
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
