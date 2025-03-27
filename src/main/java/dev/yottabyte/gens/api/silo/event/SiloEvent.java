package dev.yottabyte.gens.api.silo.event;

import dev.yottabyte.gens.api.silo.SiloLocation;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

/**
 * Represents an event that is related to a silo.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public abstract class SiloEvent extends PlayerEvent {
    private final SiloLocation location;

    /**
     * Creates a new instance of the event.
     *
     * @param player   the player involved in the event
     * @param location the location of the silo
     * @since 1.0
     */
    protected SiloEvent(Player player, SiloLocation location) {
        super(player);
        this.location = location;
    }

    /**
     * Returns the location of the silo involved in the event.
     *
     * @return the location of the silo involved in the event
     * @since 1.0
     */
    public SiloLocation getSilo() {
        return this.location;
    }
}
