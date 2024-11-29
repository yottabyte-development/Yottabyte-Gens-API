package dev.yottabyte.gens.api.silo;

import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Represents a silo.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public interface Silo {
    /**
     * Checks whether the hologram for the silo is enabled.
     * <p>
     * This is specified in the <code>config.yml</code> configuration file.
     * The configuration section: <code>silos.hologram.enabled</code>.
     *
     * @return <code>true</code> if the hologram is enabled; <code>false</code> otherwise
     * @since 1.0
     */
    boolean isHologramEnabled();

    /**
     * Returns the hologram lines for the silo.
     * <p>
     * This is specified in the <code>config.yml</code> configuration file.
     * The configuration section: <code>silos.hologram.lines</code>.
     *
     * @return the list of hologram lines
     * @since 1.0
     */
    List<String> getHologramLines();

    /**
     * Returns silo item.
     * <p>
     * This is specified in the <code>config.yml</code> configuration file.
     * The configuration section: <code>silos.item</code>.
     *
     * @return the silo item
     * @since 1.0
     */
    ItemStack getItem();
}
