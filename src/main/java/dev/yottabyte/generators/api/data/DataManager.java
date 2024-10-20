package dev.yottabyte.generators.api.data;

import dev.yottabyte.generators.api.data.player.PlayerData;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * The manager for all data related operations.
 *
 * @since 1.0
 */
@SuppressWarnings("unused")
public interface DataManager {

    /**
     * Reloads everything data related.
     *
     * @since 1.0
     */
    void reload();

    /**
     * Saves all data to the data pool and then shuts all data pools down.
     *
     * @since 1.0
     */
    void shutdown();

    /**
     * Returns the player data from the data source via the <code>data-read-pool</code>.
     *
     * @param uuid the player's UUID
     * @return the player data
     * @since 1.0
     */
    CompletableFuture<PlayerData> fetchPlayerData(UUID uuid);

    /**
     * Loads the player data from the data source via the <code>data-read-pool</code> and caches it.
     *
     * @param uuid the player's UUID
     * @return the loaded player data
     * @since 1.0
     */
    CompletableFuture<PlayerData> loadPlayerData(UUID uuid);

    /**
     * Unloads the player data from the cache and saves it to the data source via the <code>data-write-pool</code>.
     *
     * @param uuid the player's UUID
     * @return the unloaded player data
     * @since 1.0
     */
    CompletableFuture<PlayerData> unloadPlayerData(UUID uuid);

    /**
     * Returns the player data from the cache.
     *
     * @param uuid the player's UUID
     * @return the player data
     * @since 1.0
     */
    PlayerData getPlayerData(UUID uuid);
}