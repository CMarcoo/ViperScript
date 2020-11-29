package me.thevipershow.viperscript.core.lexer;

import java.io.File;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * A generic class representing a scripting file.
 */
@RequiredArgsConstructor
@Getter
public abstract class AbstractScriptFile {

    /**
     * The source file of the script.
     */
    private final File sourceFile;

    /**
     * The extension type of this file.
     * Either {@link ScriptExtension#VIPER_SCRIPT}
     * or {@link ScriptExtension#VIPER_SCRIPT_OBJECT}
     */
    private final ScriptExtension extension;
}
