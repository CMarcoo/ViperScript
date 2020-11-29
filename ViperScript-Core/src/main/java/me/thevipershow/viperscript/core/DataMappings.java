package me.thevipershow.viperscript.core;

import java.util.HashMap;
import lombok.Getter;

/**
 * This class represents a container for mapped data.
 * It can be used to easily store and access data.
 * Examples of implementations: {@link SpigotEventMappings}
 *
 * @param <K> The key type.
 * @param <V> The Value type.
 */
@Getter
public abstract class DataMappings<K, V> {

    protected final HashMap<K, V> mappings = new HashMap<>();

    /**
     * Load all of the desired data into the {@link #mappings}
     */
    public abstract void loadMappings();

    /**
     * Updates the currently loaded mappings
     * with new ones. This operation may result
     * in un-changed results.
     */
    public abstract void updateMappings();

    /**
     * Clear all of the currently loaded mappings.
     */
    public void clearMappings() {
        this.mappings.clear();
    }
}
