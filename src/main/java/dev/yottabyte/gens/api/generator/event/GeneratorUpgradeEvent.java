package dev.yottabyte.gens.api.generator.event;

import dev.yottabyte.gens.api.generator.GeneratorLocation;
import dev.yottabyte.gens.api.generator.GeneratorUpgrade;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player upgrades a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class GeneratorUpgradeEvent extends PlayerEvent {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final GeneratorUpgrade generatorUpgrade;
    private final GeneratorLocation location;

    /**
     * Creates a new instance of the event.
     *
     * @param player           the player who upgraded the generator
     * @param generatorUpgrade the generator upgrade information
     * @param location         the location of the generator that was upgraded
     * @since 1.0
     */
    public GeneratorUpgradeEvent(@NotNull Player player, @NotNull GeneratorUpgrade generatorUpgrade,
                                 @NotNull GeneratorLocation location) {
        super(player);
        this.generatorUpgrade = generatorUpgrade;
        this.location = location;
    }

    /**
     * Returns the generator upgrade information.
     *
     * @return the generator upgrade information
     * @since 1.0
     */
    public @NotNull GeneratorUpgrade getGeneratorUpgrade() {
        return this.generatorUpgrade;
    }

    /**
     * Returns the location of the generator that was upgraded.
     *
     * @return the location of the generator that was upgraded
     * @since 1.0
     */
    public @NotNull GeneratorLocation getLocation() {
        return this.location;
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
