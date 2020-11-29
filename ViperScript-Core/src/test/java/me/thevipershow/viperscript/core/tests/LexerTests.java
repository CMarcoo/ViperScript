package me.thevipershow.viperscript.core.tests;

import java.io.File;
import java.net.URL;
import me.thevipershow.viperscript.core.lexer.Lexer;
import me.thevipershow.viperscript.core.lexer.LexerParseOutput;
import me.thevipershow.viperscript.core.lexer.ScriptExtension;
import me.thevipershow.viperscript.core.lexer.vpsc.ViperScriptFile;
import me.thevipershow.viperscript.core.lexer.vpsc.ViperScriptLexer;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

public final class LexerTests {

    private static final String[] fileNames = {"script-sample-1.vpsc"};

    public static Lexer<ViperScriptFile, LexerParseOutput> vpscLexer;
    public static ViperScriptFile viperScriptFile;

    public static File tempViperScriptFile(int fileNumber) {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        final URL resourceUrl = loader.getResource(File.separator + fileNames[fileNumber - 1]);
        assert resourceUrl != null;
        return new File(resourceUrl.getPath());
    }

    @BeforeClass
    public static void setUpClass() {
        vpscLexer = new ViperScriptLexer();

        File tempVpscFile = tempViperScriptFile(1);
        assertNotNull("The File was found to be null!", tempVpscFile);

        viperScriptFile = new ViperScriptFile(tempVpscFile, ScriptExtension.VIPER_SCRIPT);
        assertNotNull("The ViperScriptFile object was found to be null!", viperScriptFile);
        assertNotNull("The extension was null", viperScriptFile.getExtension());
    }

    //@Test
    //public final void testMappings() {
    //    DataMappings<String, Class<? extends Event>> mappings = new SpigotEventMappings();
    //    mappings.loadMappings();
    //    assertFalse("The event mappings were empty!", mappings.getMappings().isEmpty());
    //}

    @Test
    public final void testLexer() {
        assertNotNull("The lexer was null!", vpscLexer);
    }

}
