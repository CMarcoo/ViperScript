package me.thevipershow.viperscript.core;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.event.Event;

/**
 * This class purpose is to map all of the Event names to their currently
 * loaded class. This allows for easy research and access of listened events
 * inside ViperScript files.
 */
public final class SpigotEventMappings extends DataMappings<String, Class<? extends Event>> {

    /**
     * All currently loaded events. ( Bukkit + Spigot ) NO PAPER.
     */
    private final List<Class<? extends Event>> allEvents = new ArrayList<>();

    /**
     * Load all of the desired data into the {@link #mappings}
     */
    @Override
    public final void loadMappings() {
        this.updateMappings();
        this.allEvents.forEach(eventClass -> super.mappings.put(eventClass.getSimpleName(), eventClass));
    }

    /**
     * Updates the currently loaded mappings
     * with new ones. This operation may result
     * in un-changed results.
     */
    @Override
    public final void updateMappings() {
        List<Class<? extends Event>> bukkitEvents = ClassFinder.findAndFilter("org.bukkit.event", Event.class);
        List<Class<? extends Event>> spigotEvents = ClassFinder.findAndFilter("org.spigotmc.event", Event.class);
        allEvents.addAll(bukkitEvents);
        allEvents.addAll(spigotEvents);
    }
}
