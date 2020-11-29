package me.thevipershow.viperscript.core.lexer;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

/**
 * A class that holds data for a placeholder.
 *
 * @param <T> The object that the placeholder holds.
 */
@RequiredArgsConstructor
public abstract class AbstractVariableHolder<T> implements VariableHolder<T> {

    private final T data;
    private final String placeholder;

    /**
     * The data that the placeholder contains.
     *
     * @return The data.
     */
    @Override
    @NotNull
    public T getData() {
        return this.data;
    }

    /**
     * Get the placeholder string.
     *
     * @return The placeholder String.
     */
    @Override
    @NotNull
    public String getPlaceholder() {
        return this.placeholder;
    }
}
