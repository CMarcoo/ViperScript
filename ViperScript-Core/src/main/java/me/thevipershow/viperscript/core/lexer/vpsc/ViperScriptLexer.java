package me.thevipershow.viperscript.core.lexer.vpsc;

import lombok.NoArgsConstructor;
import me.thevipershow.viperscript.core.lexer.AbstractLexer;
import me.thevipershow.viperscript.core.lexer.LexerParseOutput;

/**
 * This is the implementation of a Lexer for the the lexing
 * of ViperScriptFile objects.
 */
@NoArgsConstructor
public final class ViperScriptLexer extends AbstractLexer<ViperScriptFile, LexerParseOutput> {

    /**
     * Separate code sections.
     *
     * @param target The target.
     */
    @Override
    public final void separateCodeSections(ViperScriptFile target) {

    }

    /**
     * Load all of the data into some structure.
     */
    @Override
    public final void loadData() {

    }
}
