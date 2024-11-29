package dev.yottabyte.gens.api.multiplier;

import dev.yottabyte.gens.api.BaseEnum;

/**
 * Represents a multiplier type.
 *
 * @since 1.0
 */
public enum MultiplierType implements BaseEnum {
    /**
     * Represents a money multiplier.
     */
    MONEY,
    /**
     * Represents an XP multiplier.
     */
    XP,
    /**
     * Represents a drops multiplier.
     */
    DROPS;

    /**
     * {@inheritDoc}
     *
     * @return the default value for the enum
     * @since 1.0
     */
    @Override
    public BaseEnum getDefaultValue() {
        return MultiplierType.MONEY;
    }
}
