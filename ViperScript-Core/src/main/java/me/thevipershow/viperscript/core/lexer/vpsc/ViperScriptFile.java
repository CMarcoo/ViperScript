package me.thevipershow.viperscript.core.lexer.vpsc;

import me.thevipershow.viperscript.core.FileExtension;

/**
 * This file represents a ViperScript script. It cannot be run directly, and should be later
 * translated into the {@link me.thevipershow.viperscript.core.lexer.vpsco.ViperScriptFileObject file}
 * It is characterized by the ".vpsc" file extension.
 * The standard encoding for this type of file is UTF-8 {@link java.nio.charset.StandardCharsets#UTF_8}
 */
@FileExtension(getFileExtension = ".vpsc")
public interface ViperScriptFile {

    /**
     * Parse the file and obtain meaningful information from this script.
     * When the current file presents a correct usage of the ViperScript
     * syntax, it is marked as ready for translation to ViperScript Object.
     */
    void parse();
}
