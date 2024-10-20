package dev.yottabyte.generators.api.generator;

/**
 * Represents a generator upgrade.
 *
 * @since 1.0
 */
public interface GeneratorUpgrade {
    /**
     * Returns the generator this upgrade is for.
     *
     * @return the generator this upgrade is for
     * @since 1.0
     */
    Generator getGenerator();

    /**
     * Returns the next generator upgrade.
     *
     * @return the next generator upgrade
     * @since 1.0
     */
    Generator getNextGenerator();

    /**
     * Returns the cost of the upgrade.
     *
     * @return the cost of the upgrade
     * @since 1.0
     */
    double getCost();

    /**
     * Returns the required level of the upgrade.
     *
     * @return the required level of the upgrade
     * @since 1.0
     */
    int getRequiredLevel();
}
