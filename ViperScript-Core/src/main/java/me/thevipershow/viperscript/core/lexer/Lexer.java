package me.thevipershow.viperscript.core.lexer;

/**
 * This interface represents a Lexer.
 * More about this topic can be found here:
 * <br>
 * https://en.wikipedia.org/wiki/Lexical_analysis
 */
public interface Lexer<T extends AbstractScriptFile, R> {

    /**
     * This action performs lexical analysis on
     * a file of text, and is supposed to produce
     * a meaningful structure that represents the
     * contents of the read file.
     * 
     * @param target The target to check.
     * @return R parsed data.
     */
    R tokenize(T target);
}
