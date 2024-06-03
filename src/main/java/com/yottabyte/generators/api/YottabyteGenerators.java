package com.yottabyte.generators.api;

import com.yottabyte.generators.api.data.DataManager;
import com.yottabyte.generators.api.generator.GeneratorManager;
import com.yottabyte.generators.api.level.LevelManager;
import com.yottabyte.generators.api.prestige.PrestigeManager;
import com.yottabyte.generators.api.sell.SellManager;
import com.yottabyte.generators.api.silo.SiloManager;

/**
 * Represents the Yottabyte-Generators API
 *
 * @since 1.0
 */
public interface YottabyteGenerators {

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
     * Returns the sell manager.
     *
     * @return the sell manager
     * @since 1.0
     */
    SellManager getSellManager();

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
     */
    PrestigeManager getPrestigeManager();

    /**
     * Gets the data manager.
     *
     * @return the data manager
     * @since 1.0
     */
    DataManager getDataManager();
}
