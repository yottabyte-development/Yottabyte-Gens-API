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
 * Entry point for the Yottabyte-Generators API
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public class YottabyteGensApi implements YottabyteGens {
    private static YottabyteGensApi instance;
    private final YottabyteGens plugin;

    /**
     * The constructor the Yottabyte-Generators plugin uses to initialize the API
     *
     * @param plugin the Yottabyte-Generators plugin
     * @since 1.0
     */
    public YottabyteGensApi(YottabyteGens plugin) {
        this.plugin = plugin;
        YottabyteGensApi.instance = this; // NOSONAR
    }

    /**
     * Returns the instance of the API
     *
     * @return the instance of the API
     * @since 1.0
     */
    public static YottabyteGens getInstance() {
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
     * @return the multiplier manager
     * @since 1.0
     */
    @Override
    public MultiplierManager getMultiplierManager() {
        return this.plugin.getMultiplierManager();
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
