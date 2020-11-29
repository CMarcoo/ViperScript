package me.thevipershow.viperscript.core.lexer;

import java.util.EnumMap;
import java.util.Map;
import lombok.Getter;

@Getter
public abstract class AbstractLexer<T extends AbstractScriptFile, R> implements Lexer<T, R> {

    /**
     * Loaded checks.
     */
    private final Map<CheckType, IntegrityCheck<?>> loadedIntegrityChecks = new EnumMap<>(CheckType.class);

    /**
     * Separate code sections.
     *
     * @param target The target.
     */
    public abstract void separateCodeSections(T target);

    /**
     * Load all of the data into some structure.
     */
    public abstract void loadData();

    /**
     * Generate tokens and structures for lexicon analysis.
     *
     * @param target The target.
     * @return R the parsed data.
     */
    @Override
    public R tokenize(final T target) {
        this.separateCodeSections(target);
        this.loadData();
        return null;
    }
}
