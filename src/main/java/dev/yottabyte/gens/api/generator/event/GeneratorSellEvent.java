package dev.yottabyte.gens.api.generator.event;

import dev.yottabyte.gens.api.generator.Generator;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player sells a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class GeneratorSellEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Generator generator;
    private final int amount;
    private final double sellPrice;

    /**
     * Creates a new instance of the event.
     *
     * @param player    the player who sold the generator
     * @param generator the generator that was sold
     * @param amount    the amount of generators that were sold
     * @param sellPrice the total sell price of the generators that were sold
     * @since 1.0
     */
    public GeneratorSellEvent(@NotNull Player player, @NotNull Generator generator, int amount, double sellPrice) {
        super(player);
        this.generator = generator;
        this.amount = amount;
        this.sellPrice = sellPrice;
    }

    /**
     * Returns the generator that was sold.
     *
     * @return the generator that was sold
     * @since 1.0
     */
    public @NotNull Generator getGenerator() {
        return this.generator;
    }

    /**
     * Returns the total sell price of the generators that were sold.
     *
     * @return the total sell price of the generators that were sold
     * @since 1.0
     */
    public double getSellPrice() {
        return this.sellPrice;
    }

    /**
     * Returns the amount of generators that were sold.
     *
     * @return the amount of generators that were sold
     * @since 1.0
     */
    public int getAmount() {
        return this.amount;
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
