package me.thevipershow.viperscript.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ViperScriptPlugin extends JavaPlugin {

    private ColouredLogger colouredLogger;

    private void printLogo() {
        String logo = "\n__   __ _  _ __            ___           _  _ __  _   \n" +
                "\\ \\ / /(_)| '_ \\ ___  _ _ / __| __  _ _ (_)| '_ \\| |_ \n" +
                " \\   / | || .__// -_)| '_|\\__ \\/ _|| '_|| || .__/|  _|\n" +
                "  \\_/  |_||_|   \\___||_|  |___/\\__||_|  |_||_|    \\__|\n";
        colouredLogger.info("125#50#177" + logo);
    }

    @Override
    public final void onLoad() {
        this.colouredLogger = new ColouredLogger(super.getLogger());
        printLogo();
    }

    @Override
    public final void onEnable() {

    }

    @Override
    public final void onDisable() {

    }
}
