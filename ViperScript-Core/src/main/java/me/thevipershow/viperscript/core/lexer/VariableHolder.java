package me.thevipershow.viperscript.core.lexer;

import org.jetbrains.annotations.NotNull;

/**
 * An interface for representing a placeholder.
 * @param <T> The data that the placeholder contains.
 */
public interface VariableHolder<T> {

    /**
     * The data that the placeholder contains.
     * @return The data.
     */
    @NotNull
    T getData();

    /**
     * Get the placeholder string.
     * @return The placeholder String.
     */
    @NotNull
    String getPlaceholder();
}
