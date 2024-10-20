package dev.yottabyte.generators.api;

/**
 * The base interface for all enums.
 *
 * @since 1.0
 */
public interface BaseEnum {

    /**
     * Returns the name of this enum constant, exactly as declared in its enum declaration.
     *
     * @return the name of this enum constant
     * @since 1.0
     */
    String name();

    /**
     * Returns the default value for this enum.
     *
     * @return the default value for this enum
     * @since 1.0
     */
    BaseEnum getDefaultValue();
}
