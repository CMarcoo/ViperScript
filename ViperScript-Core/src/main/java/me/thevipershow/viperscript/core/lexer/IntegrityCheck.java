package me.thevipershow.viperscript.core.lexer;

/**
 * An interface for checks.
 * @param <T> The type of the object to check.
 */
public interface IntegrityCheck<T> {

    /**
     * Verify the integrity of the defined object.
     * @param t The object.
     * @return True is the object is considered valid, false otherwise.
     */
    boolean isValid(T t);
}
