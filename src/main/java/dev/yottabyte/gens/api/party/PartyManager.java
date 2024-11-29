package dev.yottabyte.gens.api.party;

/**
 * The manager for all party related operations.
 *
 * @since 1.0
 */
public interface PartyManager {

    /**
     * Returns whether the party is running.
     *
     * @return <code>true</code> if the party is running; <code>false</code> otherwise
     * @since 1.0
     */
    boolean isRunning();

    /**
     * Returns the current party running.
     *
     * @return the current party running or <code>null</code> if no party is running
     * @since 1.0
     */
    Party getParty();

    /**
     * Returns the time left for the current party in milliseconds.
     *
     * @return the time left for the current party in milliseconds or <code>-1</code> if no party is running
     * @since 1.0
     */
    long getTimeLeft();

    /**
     * Starts a new party.
     *
     * @param party the party to start
     * @return <code>true</code> if the party was started; <code>false</code> otherwise
     * @since 1.0
     */
    boolean start(Party party);

    /**
     * Stops the current party.
     *
     * @return the party stopped or <code>null</code> if no party was running
     * @since 1.0
     */
    Party stop();
}
