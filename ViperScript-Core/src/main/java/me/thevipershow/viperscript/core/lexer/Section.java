package me.thevipershow.viperscript.core.lexer;

/**
 * A section represents a container for something inside
 * another bigger object. Its sole purpose is to separate
 * something from a greater object in order to "break it down",
 * making the actions effectively easier.
 *
 * @param <T> The data contained in this section.
 */
public interface Section<T> {

    /**
     * Get the data that this entire section contains.
     *
     * @return The contained data.
     */
    T getSectionData();
}
