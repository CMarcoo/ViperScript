package me.thevipershow.viperscript.core.lexer;

import java.awt.Event;

/**
 * This variable holder binds a placeholder to a corresponding Bukkit event class object.
 */
public final class EventClassVariableHolder extends AbstractVariableHolder<Class<? extends Event>> {



    public EventClassVariableHolder(String bukkitEventName, String placeholder) {
        super(null, placeholder);
    }

    public EventClassVariableHolder(Class<? extends Event> data, String placeholder) {
        super(data, placeholder);
    }
}
