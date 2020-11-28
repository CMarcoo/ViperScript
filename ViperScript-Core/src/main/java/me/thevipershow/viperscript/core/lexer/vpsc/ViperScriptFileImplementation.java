package me.thevipershow.viperscript.core.lexer.vpsc;

import java.io.File;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * An implementation of {@link ViperScriptFile}
 */
@RequiredArgsConstructor
@Getter
public abstract class ViperScriptFileImplementation implements ViperScriptFile {

    protected final File scriptFile;
}
