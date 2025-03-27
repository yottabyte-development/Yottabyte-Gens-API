package dev.yottabyte.gens.api.level.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player levels up.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class LevelUpEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final int previousLevel;
    private final int newLevel;

    /**
     * Creates a new instance of the event.
     *
     * @param player        the player who leveled up
     * @param previousLevel the player's previous level
     * @param newLevel      the player's new level
     * @since 1.0
     */
    public LevelUpEvent(@NotNull Player player, int previousLevel, int newLevel) {
        super(player);
        this.previousLevel = previousLevel;
        this.newLevel = newLevel;
    }

    /**
     * Returns the player's previous level.
     *
     * @return the player's previous level
     * @since 1.0
     */
    public int getPreviousLevel() {
        return this.previousLevel;
    }

    /**
     * Returns the player's new level.
     *
     * @return the player's new level
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
