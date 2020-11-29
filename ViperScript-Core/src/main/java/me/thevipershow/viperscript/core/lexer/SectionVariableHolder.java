package me.thevipershow.viperscript.core.lexer;

import lombok.Getter;

@Getter
public final class SectionVariableHolder<T> extends AbstractVariableHolder<T> {

    private final Section<Integer> lineValiditySection;

    public SectionVariableHolder(T data, String placeholder, Section<Integer> lineValiditySection) {
        super(data, placeholder);
        this.lineValiditySection = lineValiditySection;
    }
}
