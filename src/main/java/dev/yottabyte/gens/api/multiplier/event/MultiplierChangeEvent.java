package dev.yottabyte.gens.api.multiplier.event;

import dev.yottabyte.gens.api.multiplier.MultiplierType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Called when a player's multiplier changes.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class MultiplierChangeEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final UUID uuid;
    private final MultiplierType multiplierType;
    private final double previousMultiplier;
    private final double newMultiplier;

    /**
     * Creates a new instance of the event.
     *
     * @param uuid               the UUID of the player the multiplier belongs to
     * @param multiplierType     the multiplier type that was changed
     * @param previousMultiplier the player's previous multiplier
     * @param newMultiplier      the player's new multiplier
     * @since 1.0
     */
    public MultiplierChangeEvent(@NotNull UUID uuid, @NotNull MultiplierType multiplierType,
                                 double previousMultiplier, double newMultiplier) {
        this.uuid = uuid;
        this.multiplierType = multiplierType;
        this.previousMultiplier = previousMultiplier;
        this.newMultiplier = newMultiplier;
    }

    /**
     * Returns the UUID of the player the multiplier belongs to.
     *
     * @return the UUID of the player the multiplier belongs to
     * @since 1.0
     */
    public @NotNull UUID getUuid() {
        return this.uuid;
    }

    /**
     * Returns the multiplier type that was changed.
     *
     * @return the multiplier type that was changed
     * @since 1.0
     */
    public @NotNull MultiplierType getMultiplierType() {
        return this.multiplierType;
    }

    /**
     * Returns the player's previous multiplier.
     *
     * @return the player's previous multiplier
     * @since 1.0
     */
    public double getPreviousMultiplier() {
        return this.previousMultiplier;
    }

    /**
     * Returns the player's new multiplier.
     *
     * @return the player's new multiplier
     * @since 1.0
     */
    public double getNewMultiplier() {
        return this.newMultiplier;
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
