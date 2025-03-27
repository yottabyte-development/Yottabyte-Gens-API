package dev.yottabyte.gens.api.generator.event;

import dev.yottabyte.gens.api.data.player.PlayerGenerator;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

/**
 * Represents an event that is related to a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public abstract class GeneratorEvent extends PlayerEvent {
    private final PlayerGenerator generator;

    /**
     * Creates a new instance of the event.
     *
     * @param player    the player involved in the event
     * @param generator the generator involved in the event
     * @since 1.0
     */
    protected GeneratorEvent(Player player, PlayerGenerator generator) {
        super(player);
        this.generator = generator;
    }

    /**
     * Returns the generator involved in the event.
     *
     * @return the generator involved in the event
     * @since 1.0
     */
    public PlayerGenerator getGenerator() {
        return this.generator;
    }
}
