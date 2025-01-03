package dev.yottabyte.gens.api.generator.shop;

import dev.yottabyte.gens.api.generator.Generator;
import dev.yottabyte.gens.api.sell.SellData;
import org.bukkit.entity.Player;

/**
 * Represents a generator shop.
 *
 * @since 1.0
 */
public interface GeneratorShop {
    /**
     * Sells a generator item in the player's inventory and returns the sell data.
     *
     * @param player    the player to sell the generator item for
     * @param generator the generator to sell
     * @param amount    the amount of the generator items to sell
     * @return the sell data
     * @since 1.0
     */
    SellData sellGeneratorItem(Player player, Generator generator, int amount);

    /**
     * Sells all generator items in the player's inventory and returns the sell data.
     *
     * @param player    the player to sell the generator items for
     * @param generator the generator to sell
     * @return the sell data
     * @since 1.0
     */
    SellData sellGeneratorItems(Player player, Generator generator);

    /**
     * Opens the generator shop menu for the player.
     *
     * @param player the player to open the shop for
     * @since 1.0
     */
    void open(Player player);
}
