package me.thevipershow.viperscript.core.lexer.tokens;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * A list of operators that are used to
 * perform actions between literals.
 */
@Getter
@RequiredArgsConstructor
public enum Operator {

    /**
     * Used to sum two numbers
     */
    SUM((char) 0x2B),
    /**
     * Used to subtract two numbers
     */
    SUBTRACT((char) 0x2D),
    /**
     * Used to divide two numbers
     * Note that division by 0 is illegal
     * and will throw {@link ArithmeticException}
     */
    DIVIDE((char) 0x2F),
    /**
     * Used to multiply two numbers
     */
    MULTIPLY((char) 0x2A),
    /**
     * Used to elevate a number to a certain power.
     */
    POWER((char) 0x5E),
    /**
     * Equality checks.
     */
    EQUAL((char) 0x3D),
    /**
     * Number size comparison.
     * A > B ?
     */
    GREATER((char) 0x3E),
    /**
     * Number size comparison.
     * A < B ?
     */
    SMALLER((char) 0x3C)
    ;

    public final char operator;
}
