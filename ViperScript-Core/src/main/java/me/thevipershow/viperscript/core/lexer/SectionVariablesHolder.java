package me.thevipershow.viperscript.core.lexer;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * This class holds all of the placeholders for
 * a certain section of code.
 */
@Getter
@RequiredArgsConstructor
public class SectionVariablesHolder {

    /**
     * The section of code.
     */
    private final Section<String> section;

    /**
     * The list of placeholders available.
     */
    private final List<AbstractVariableHolder<?>> codeSectionVariables = new ArrayList<>();
}
