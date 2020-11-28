package me.thevipershow.viperscript.core.lexer.tokens;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Keyword {

    /**
     * When keyword, used to listen to events.
     */
    WHEN("when"),
    /**
     * Do keyword, used to start an instruction.
     */
    DO("do"),
    /**
     * For keyword, used in loops.
     */
    FOR("for");

    /**
     * This is the reserved string for the keyword.
     * The word cannot be used in places such as variable names.
     */
    public final String keyword;
}
