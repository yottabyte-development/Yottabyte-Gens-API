package dev.yottabyte.gens.api.prestige.event;

import dev.yottabyte.gens.api.prestige.Prestige;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player levels up their prestige.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class PrestigeUpEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Prestige prestige;
    private final int previousLevel;
    private final int newLevel;

    /**
     * Creates a new instance of the event.
     *
     * @param player        the player who leveled up their prestige
     * @param prestige      the prestige that was obtained
     * @param previousLevel the player's previous prestige level
     * @param newLevel      the player's new prestige level
     * @since 1.0
     */
    public PrestigeUpEvent(@NotNull Player player, @NotNull Prestige prestige, int previousLevel, int newLevel) {
        super(player);
        this.prestige = prestige;
        this.previousLevel = previousLevel;
        this.newLevel = newLevel;
    }

    /**
     * Returns the prestige that was obtained.
     *
     * @return the prestige that was obtained
     * @since 1.0
     */
    public @NotNull Prestige getPrestige() {
        return this.prestige;
    }

    /**
     * Returns the player's previous prestige level.
     *
     * @return the player's previous prestige level
     * @since 1.0
     */
    public int getPreviousLevel() {
        return this.previousLevel;
    }

    /**
     * Returns the player's new prestige level.
     *
     * @return the player's new prestige level
     * @since 1.0
     */
    public int getNewLevel() {
        return this.newLevel;
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
