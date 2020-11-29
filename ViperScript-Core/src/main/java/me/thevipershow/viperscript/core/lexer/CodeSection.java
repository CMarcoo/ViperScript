package me.thevipershow.viperscript.core.lexer;

import lombok.Getter;

/**
 * A code section represents the data contained
 * in an enclosed set of instructions.
 */
@Getter
public final class CodeSection implements Section<String> {

    private final SectionVariablesHolder variablesHolder;
    private final String text;

    public CodeSection(String text) {
        this.text = text;
        this.variablesHolder = new SectionVariablesHolder(this);
    }

    /**
     * Get the data that this entire section contains.
     *
     * @return The contained data.
     */
    @Override
    public final String getSectionData() {
        return this.text;
    }
}
