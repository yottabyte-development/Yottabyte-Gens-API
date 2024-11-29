package dev.yottabyte.gens.api;

import dev.yottabyte.gens.api.data.DataManager;
import dev.yottabyte.gens.api.generator.GeneratorManager;
import dev.yottabyte.gens.api.level.LevelManager;
import dev.yottabyte.gens.api.multiplier.MultiplierManager;
import dev.yottabyte.gens.api.party.PartyManager;
import dev.yottabyte.gens.api.prestige.PrestigeManager;
import dev.yottabyte.gens.api.sell.SellManager;
import dev.yottabyte.gens.api.sell.wand.SellWandManager;
import dev.yottabyte.gens.api.silo.SiloManager;

/**
 * Represents the Yottabyte-Generators API
 *
 * @since 1.0
 */
public interface YottabyteGens {

    /**
     * Returns the generator manager.
     *
     * @return the generator manager
     * @since 1.0
     */
    GeneratorManager getGeneratorManager();

    /**
     * Returns the silo manager.
     *
     * @return the silo manager
     * @since 1.0
     */
    SiloManager getSiloManager();

    /**
     * Returns the multiplier manager.
     *
     * @return the multiplier manager
     * @since 1.0
     */
    MultiplierManager getMultiplierManager();

    /**
     * Returns the sell manager.
     *
     * @return the sell manager
     * @since 1.0
     */
    SellManager getSellManager();

    /**
     * Returns the sell wand manager.
     *
     * @return the sell wand manager
     * @since 1.0
     */
    SellWandManager getSellWandManager();

    /**
     * Returns the level manager.
     *
     * @return the level manager
     * @since 1.0
     */
    LevelManager getLevelManager();

    /**
     * Returns the prestige manager.
     *
     * @return the prestige manager
     * @since 1.0
     */
    PrestigeManager getPrestigeManager();

    /**
     * Returns the party manager.
     *
     * @return the party manager
     * @since 1.0
     */
    PartyManager getPartyManager();

    /**
     * Gets the data manager.
     *
     * @return the data manager
     * @since 1.0
     */
    DataManager getDataManager();
}
