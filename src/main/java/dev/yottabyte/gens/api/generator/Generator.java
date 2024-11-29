package dev.yottabyte.gens.api.generator;

import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Represents a generator.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public interface Generator {
    /**
     * Returns the generator's ID.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>id</code>
     *
     * @return the generator ID
     * @since 1.0
     */
    String getId();

    /**
     * Returns the generator's display name.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>display-name</code>
     *
     * @return the display name for the generator
     * @since 1.0
     */
    String getDisplayName();

    /**
     * Returns the drop interval for the generator in seconds.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>drop-interval</code>
     *
     * @return the drop interval for the generator in seconds
     * @since 1.0
     */
    int getDropInterval();

    /**
     * Checks whether the hologram for the generator is enabled.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>hologram.enabled</code>
     *
     * @return <code>true</code> if the hologram is enabled; <code>false</code> otherwise
     * @since 1.0
     */
    boolean isHologramEnabled();

    /**
     * Returns the hologram lines for the generator.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>hologram.lines</code>
     *
     * @return the list of hologram lines
     * @since 1.0
     */
    List<String> getHologramLines();

    /**
     * Returns the generator item.
     * <p>
     * This is specified in the generator's configuration file.
     * The configuration section: <code>item</code>
     *
     * @return the generator item
     * @since 1.0
     */
    ItemStack getItem();

    /**
     * Returns the list of drops for the generator.
     *
     * @return the list of drops
     * @since 1.0
     */
    List<GeneratorDrop> getDrops();
}
