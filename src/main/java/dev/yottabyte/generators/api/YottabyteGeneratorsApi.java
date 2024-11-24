package dev.yottabyte.generators.api;

import dev.yottabyte.generators.api.data.DataManager;
import dev.yottabyte.generators.api.generator.GeneratorManager;
import dev.yottabyte.generators.api.level.LevelManager;
import dev.yottabyte.generators.api.party.PartyManager;
import dev.yottabyte.generators.api.prestige.PrestigeManager;
import dev.yottabyte.generators.api.sell.SellManager;
import dev.yottabyte.generators.api.sell.wand.SellWandManager;
import dev.yottabyte.generators.api.silo.SiloManager;

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
     * @return the sell wand manager
     * @since 1.0
     */
    @Override
    public SellWandManager getSellWandManager() {
        return this.plugin.getSellWandManager();
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
     * @since 1.0
     */
    @Override
    public PrestigeManager getPrestigeManager() {
        return this.plugin.getPrestigeManager();
    }

    /**
     * {@inheritDoc}
     *
     * @return the party manager
     * @since 1.0
     */
    @Override
    public PartyManager getPartyManager() {
        return this.plugin.getPartyManager();
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
