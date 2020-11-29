package me.thevipershow.viperscript.core.lexer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * An abstract check that implements an Integrity check.
 *
 * @param <T> The data type (passed down to IntegrityCheck interface).
 */
@RequiredArgsConstructor
@Getter
public abstract class AbstractCheck<T> implements IntegrityCheck<T> {

    /**
     * The check type of this class.
     */
    private final CheckType checkType;

    /**
     * The data.
     */
    private final T t;
}
