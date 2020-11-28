package me.thevipershow.viperscript.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@java.lang.annotation.Target(ElementType.TYPE)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface FileExtension {

    /**
     * Get this file standard's file extension.
     */
    String getFileExtension();
}
