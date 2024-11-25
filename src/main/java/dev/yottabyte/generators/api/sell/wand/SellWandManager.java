package dev.yottabyte.generators.api.sell.wand;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

/**
 * The manager for all sell wand related operations.
 *
 * @since 1.0
 */
public interface SellWandManager {
    /**
     * Returns an unmodifiable list of all sell wand IDs.
     *
     * @return the list of all sell wand IDs
     * @see #getSellWandIds
     * @since 1.0
     */
    List<String> getSellWandIds();

    /**
     * Returns a sell wand by its ID.
     *
     * @param id the ID of the sell wand to retrieve
     * @return the sell wand with the specified ID, or an empty Optional if no sell wand was found
     * @since 1.0
     */
    Optional<SellWand> getSellWandById(String id);

    /**
     * Builds a sell wand item with a specified amount of uses.
     * <p>
     * The sell wand item is specified in the sell-wand's configuration file.
     * The configuration section: <code>sell-wands</code>
     *
     * @param sellWand the sell wand for which to build the item
     * @param uses     the amount of uses the sell wand has (use -1 for infinite uses, null for default uses)
     * @return the sell wand item
     * @since 1.0
     */
    ItemStack buildSellWandItem(SellWand sellWand, Integer uses);

    /**
     * Gives a sell wand to an online player.
     *
     * @param player   the player to give the sell wand to
     * @param sellWand the sell wand to build and give
     * @param uses     the amount of uses the sell wand has (use -1 for infinite uses, null for default uses)
     * @since 1.0
     */
    void giveSellWand(Player player, SellWand sellWand, Integer uses);

    /**
     * Returns the amount of uses a sell wand has from an item stack.
     *
     * @param itemStack the item stack to get the uses from
     * @return the amount of uses the sell wand has left; null if the item stack is not a sell wand
     * @since 1.0
     */
    Integer getSellWandUses(ItemStack itemStack);
}
