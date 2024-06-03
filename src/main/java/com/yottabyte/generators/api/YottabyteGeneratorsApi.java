package com.yottabyte.generators.api;

import com.yottabyte.generators.api.data.DataManager;
import com.yottabyte.generators.api.generator.GeneratorManager;
import com.yottabyte.generators.api.level.LevelManager;
import com.yottabyte.generators.api.prestige.PrestigeManager;
import com.yottabyte.generators.api.sell.SellManager;
import com.yottabyte.generators.api.silo.SiloManager;

/**
 * Entry point for the Yottabyte-Generators API
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class YottabyteGeneratorsApi implements YottabyteGenerators {
    private static YottabyteGeneratorsApi instance;
    private final YottabyteGenerators plugin;

    /**
     * The constructor the Yottabyte-Generators plugin uses to initialize the API
     *
     * @param plugin the Yottabyte-Generators plugin
     * @since 1.0
     */
    public YottabyteGeneratorsApi(YottabyteGenerators plugin) {
        this.plugin = plugin;
        YottabyteGeneratorsApi.instance = this; // NOSONAR
    }

    /**
     * Returns the instance of the API
     *
     * @return the instance of the API
     * @since 1.0
     */
    public static YottabyteGenerators getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     *
     * @return the generator manager
     * @since 1.0
     */
    @Override
    public GeneratorManager getGeneratorManager() {
        return this.plugin.getGeneratorManager();
    }

    /**
     * {@inheritDoc}
     *
     * @return the silo manager
     * @since 1.0
     */
    @Override
    public SiloManager getSiloManager() {
        return this.plugin.getSiloManager();
    }

    /**
     * {@inheritDoc}
     *
     * @return the sell manager
     * @since 1.0
     */
    @Override
    public SellManager getSellManager() {
        return this.plugin.getSellManager();
    }

    /**
     * {@inheritDoc}
     *
     * @return the level manager
     * @since 1.0
     */
    @Override
    public LevelManager getLevelManager() {
        return this.plugin.getLevelManager();
    }

    /**
     * {@inheritDoc}
     *
     * @return the prestige manager
     */
    @Override
    public PrestigeManager getPrestigeManager() {
        return this.plugin.getPrestigeManager();
    }

    /**
     * {@inheritDoc}
     *
     * @return the data manager
     * @since 1.0
     */
    @Override
    public DataManager getDataManager() {
        return this.plugin.getDataManager();
    }
}
