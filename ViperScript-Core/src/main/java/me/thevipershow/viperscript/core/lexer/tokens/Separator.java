package me.thevipershow.viperscript.core.lexer.tokens;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * A list of characters that indicate
 * separators. A separator indicates the start or
 * the end of something in the code flow.
 */
@RequiredArgsConstructor
@Getter
public enum Separator {

    /**
     * {
     */
    OPEN_CURLY_BRACKET((char) 0x7b),
    /**
     * }
     */
    CLOSE_CURLY_BRACKET((char) 0x7d),
    /**
     * (
     */
    OPEN_ROUND_BRACKET((char) 0x28),
    /**
     * )
     */
    CLOSE_ROUND_BRACKET((char) 0x29),
    /**
     * ,
     */
    COMMA((char) 0x2c),
    /**
     * "
     */
    STRING_SECTION((char) 0x22),
    /**
     * ;
     */
    SEMICOLON((char) 0x3b),
    /**
     * #
     */
    COMMENT((char) 0x23);

    public final char separator;
}
