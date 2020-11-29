package me.thevipershow.viperscript.plugin;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

public final class PluginTests {

    @Test
    public final void testColours() throws IOException {
        Logger logger = Logger.getGlobal();
        ColouredLogger colouredLogger = new ColouredLogger(logger);
        Assert.assertNotNull(colouredLogger);
        String colored = ColouredLogger.translateColorCodes(ColouredLogger.ConsoleColour.fromString("215#135#0").generateANSI() + " Orange text!");
        System.out.write(colored.getBytes(StandardCharsets.UTF_8));
    }
}
