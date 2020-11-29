package me.thevipershow.viperscript.plugin;

import java.awt.image.ColorConvertOp;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class ColouredLogger {

    @RequiredArgsConstructor
    @Getter
    public static final class ConsoleColour {
        private final int color;

        public static final String RESET = "\u001B[0m";
        private static final Pattern colourPattern = Pattern.compile("[0-9]+#[0-9]+#[0-9]+");
        private static final Pattern splitPattern = Pattern.compile("#");
        private static final String placeholder = "{ID}";
        private static final String form = "\u001B[" + placeholder + "m";

        private static void checkNumber(int i) {
            if (i < 0 || i >= 256)
                throw new IllegalArgumentException("Illegal RGB value");
        }

        /**
         * Creates a ConsoleColour from a string of text.
         * Sample: 5#15#3
         *
         * @param text The text.
         * @return The ConsoleColour, null if not could not be parsed.
         */
        public static ConsoleColour fromString(final String text) {
            if (colourPattern.matcher(text).matches()) {
                final String[] rgbValues = splitPattern.split(text);
                final int r = Integer.parseInt(rgbValues[0]), g = Integer.parseInt(rgbValues[1]), b = Integer.parseInt(rgbValues[2]);
                checkNumber(r);
                checkNumber(g);
                checkNumber(b);
                final int color = (r * 6 / 256) * 36 + (g * 6 / 256) * 6 + (b * 6 / 256);
                return new ConsoleColour(color);
            }
            return null;
        }

        public final String generateANSI() {
            return new String(form.replace(placeholder, Integer.toString(this.color)).getBytes(), StandardCharsets.UTF_8);
        }
    }

    private final Logger logger;

    public static String translateColorCodes(String s) {
        final Matcher matcher = ConsoleColour.colourPattern.matcher(s);
        while (matcher.find()) {
            String g = matcher.group();
            s = s.replace(g, ConsoleColour.fromString(g).generateANSI());
        }
        return s;
    }

    public final void info(String txt) {
        logger.info(translateColorCodes(txt) + ConsoleColour.RESET);
    }

    public final void warn(String txt) {
        logger.warning(translateColorCodes(txt) + ConsoleColour.RESET);
    }
}
