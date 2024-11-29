package dev.yottabyte.generators.api.sell;

import dev.yottabyte.generators.api.sell.wand.SellWand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * The manager for sell related operations.
 *
 * @since 1.0
 */
public interface SellManager {
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
     * @param sellWand  the sell wand used to sell the items with (can be <code>null</code>)
     * @return the {@link SellData} object containing the total item count, sell price, and sell level XP
     * @since 1.0
     */
    SellData sellInventory(Player player, Inventory inventory, SellWand sellWand);

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
