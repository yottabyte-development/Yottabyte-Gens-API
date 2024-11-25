package dev.yottabyte.generators.api.party;

import dev.yottabyte.generators.api.BaseEnum;

/**
 * Represents a party type.
 *
 * @since 1.0
 */
public enum PartyType implements BaseEnum {
    SELL_MULTIPLIER,
    XP_MULTIPLIER,
    DROPS_MULTIPLIER;

    /**
     * {@inheritDoc}
     *
     * @return the default value for the enum
     * @since 1.0
     */
    @Override
    public BaseEnum getDefaultValue() {
        return PartyType.SELL_MULTIPLIER;
    }
}
