package dev.yottabyte.generators.api.sell;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

/**
 * The manager for sell related operations.
 *
 * @since 1.0
 */
public interface SellManager {
    /**
     * Returns the sell multiplier for the player.
     *
     * @param uuid the player's UUID
     * @return the player's sell multiplier
     * @since 1.0
     */
    double getPlayerMultiplier(UUID uuid);

    /**
     * Adds to the sell multiplier for the player.
     *
     * @param uuid       the player's UUID
     * @param multiplier the multiplier value to add
     * @return <code>true</code> if the multiplier was added; otherwise <code>false</code>
     * @since 1.0
     */
    boolean addPlayerMultiplier(UUID uuid, double multiplier);

    /**
     * Sets the sell multiplier for the player.
     *
     * @param uuid       the player's UUID
     * @param multiplier the multiplier to set
     * @return <code>true</code> if the multiplier was set; otherwise <code>false</code>
     * @since 1.0
     */
    boolean setPlayerMultiplier(UUID uuid, double multiplier);

    /**
     * Returns the sell data calculator.
     *
     * @return the sell data calculator
     * @since 1.0
     */
    SellDataCalculator getSellDataCalculator();

    /**
     * Sells the item in the player's main hand.
     *
     * @param player the player to sell the item for
     * @return the {@link SellData} object containing the total item count, sell price, and sell level XP
     * @since 1.0
     */
    SellData sellMainHand(Player player);

    /**
     * Sells all items in an inventory.
     *
     * @param player    the player to sell the items for
     * @param inventory the inventory to sell the items for
     * @return the {@link SellData} object containing the total item count, sell price, and sell level XP
     * @since 1.0
     */
    SellData sellInventory(Player player, Inventory inventory);

    /**
     * Creates a sellable item.
     *
     * @param itemStack the item stack to make sellable
     * @param sellPrice the sell price of one item
     * @return the sellable item
     */
    ItemStack createSellableItem(ItemStack itemStack, double sellPrice);

    /**
     * Creates a sellable item.
     *
     * @param itemStack the item stack to make sellable
     * @param sellPrice the sell price of one item
     * @param sellXp    the sell XP of one item
     * @return the sellable item
     */
    ItemStack createSellableItem(ItemStack itemStack, double sellPrice, int sellXp);
}
