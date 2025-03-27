package dev.yottabyte.gens.api.generator.event;

import dev.yottabyte.gens.api.generator.Generator;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player purchases a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class GeneratorPurchaseEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Generator generator;
    private final int amount;
    private final double buyPrice;

    /**
     * Creates a new instance of the event.
     *
     * @param player    the player who purchased the generator
     * @param generator the generator that was purchased
     * @param amount    the amount of generators that were purchased
     * @param buyPrice  the total buy price of the generators that were purchased
     * @since 1.0
     */
    public GeneratorPurchaseEvent(@NotNull Player player, @NotNull Generator generator, int amount, double buyPrice) {
        super(player);
        this.generator = generator;
        this.amount = amount;
        this.buyPrice = buyPrice;
    }

    /**
     * Returns the generator that was purchased.
     *
     * @return the generator that was purchased
     * @since 1.0
     */
    public @NotNull Generator getGenerator() {
        return this.generator;
    }

    /**
     * Returns the amount of generators that were purchased.
     *
     * @return the amount of generators that were purchased
     * @since 1.0
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * Returns the total buy price of the generators that were purchased.
     *
     * @return the total buy price of the generators that were purchased
     * @since 1.0
     */
    public double getBuyPrice() {
        return this.buyPrice;
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
