package me.thevipershow.viperscript.core.lexer.vpsco;

import me.thevipershow.viperscript.core.FileExtension;
import me.thevipershow.viperscript.core.lexer.vpsc.ViperScriptFile;

/**
 * This files represents a ViperScript object.
 * It is characterized by the ".vpsco" file extension.
 * The standard encoding for this type of file is UTF-8 {@link java.nio.charset.StandardCharsets#UTF_8}
 */

@FileExtension(getFileExtension = ".vpsco")
public interface ViperScriptFileObject {

    /**
     * This method parses a {@link ViperScriptFile} and translates it into a
     * a {@link ViperScriptFileObject} object file.
     *
     * @param vpsc This is the {@link ViperScriptFile} that sho
     */
    void parse(ViperScriptFile vpsc);
}
