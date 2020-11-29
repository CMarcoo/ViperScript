package me.thevipershow.viperscript.core;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ClassFinder {

    private final char PKG_SEPARATOR = '.';

    private final char DIR_SEPARATOR = '/';

    private final String CLASS_FILE_SUFFIX = ".class";

    private final String BAD_PACKAGE_ERROR = "Unable to get resources from path '%s'. Are you sure the package '%s' exists?";

    public <T> List<Class<? extends T>> findAndFilter(String scannedPackage, Class<T> baseClass) {
        List<Class<?>> found = find(scannedPackage);
        List<Class<? extends T>> foundFilter = new ArrayList<>();
        for (Class<?> aClass : found) {
            if (baseClass.isAssignableFrom(aClass)) {
                foundFilter.add((Class<? extends T>) aClass);
            }
        }
        return foundFilter;
    }

    /**
     * Tries to load all of the classes from the current package.
     * This algorithm is recursive and will look deeply in all of
     * the packages if more are nested.
     *
     * @param scannedPackage The package name to search in.
     * @return The List of classes inside that package.
     */
    public List<Class<?>> find(String scannedPackage) {
        final String scannedPath = scannedPackage.replace(PKG_SEPARATOR, DIR_SEPARATOR);
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        final URL scannedUrl = classLoader.getResource(scannedPath);
        if (scannedUrl == null) {
            throw new IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage));
        }
        final File scannedDir = new File(scannedUrl.getPath());

        //if (!scannedDir.exists()) {
        //    throw new IllegalArgumentException(String.format("This file did not exist? (%s)", scannedUrl.getPath()));
        //}
        final List<Class<?>> classes = new ArrayList<>();
        if (!scannedDir.isDirectory()) {
            throw new IllegalArgumentException("This is not a directory.");
        }
        for (File file : Objects.requireNonNull(scannedDir.listFiles(), "The directory did not have any files.")) {
            classes.addAll(find(file, scannedPackage));
        }
        return classes;
    }

    /**
     * Tries to load all of the classes from the current package.
     * This algorithm is recursive and will look deeply in all of
     * the packages if more are nested.
     *
     * @param file           The file to search from.
     * @param scannedPackage The package name to search in.
     * @return The List of classes inside that package.
     */
    private List<Class<?>> find(File file, String scannedPackage) {
        List<Class<?>> classes = new ArrayList<>();
        String resource = scannedPackage + PKG_SEPARATOR + file.getName();
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                classes.addAll(find(child, resource));
            }
        } else if (resource.endsWith(CLASS_FILE_SUFFIX)) {
            int endIndex = resource.length() - CLASS_FILE_SUFFIX.length();
            String className = resource.substring(0, endIndex);
            try {
                classes.add(Class.forName(className));
            } catch (ClassNotFoundException ignore) {
            }
        }
        return classes;

    }
}
