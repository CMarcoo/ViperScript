package me.thevipershow.viperscript.core.lexer.vpsc;

import java.io.File;
import me.thevipershow.viperscript.core.lexer.AbstractScriptFile;
import me.thevipershow.viperscript.core.lexer.ScriptExtension;

/**
 * This class represents a ViperScript File.
 * It is passed around and its purpose is to link
 * the file that contains the script.
 */
public final class ViperScriptFile extends AbstractScriptFile {

    public ViperScriptFile(File sourceFile, ScriptExtension extension) {
        super(sourceFile, extension);
    }
}
