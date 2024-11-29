package dev.yottabyte.gens.api.party;

import dev.yottabyte.gens.api.BaseEnum;

/**
 * Represents a party type.
 *
 * @since 1.0
 */
public enum PartyType implements BaseEnum {
    MONEY_MULTIPLIER,
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
        return PartyType.MONEY_MULTIPLIER;
    }
}
