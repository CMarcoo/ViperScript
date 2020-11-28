package me.thevipershow.viperscript.core.lexer.tokens;

import java.util.regex.Pattern;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * This class contains literals and
 * regex matchers for their structure.
 */
@Getter
@RequiredArgsConstructor
public enum Literal {

    /**
     * String literal.
     * "This is a valid string".
     */
    STRING(Pattern.compile("^.+$")),
    /**
     * An integer number.
     * (0 , 235, -222 , +5)
     */
    INTEGER(Pattern.compile("^[0-9]+$|[+-][0-9]+^$")),
    /**
     * A decimal number.
     * (0.25, +0.106, -0.5)
     */
    DECIMAL(Pattern.compile("^[0-9]+\\.[0-9]+$|^[+-][0-9]+\\.[0-9]+$")),
    /**
     * Boolean value.
     */
    BOOLEAN(Pattern.compile("^true|false$"));
    public final Pattern pattern;
}
