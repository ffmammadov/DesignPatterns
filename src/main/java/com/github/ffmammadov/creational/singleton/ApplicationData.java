package com.github.ffmammadov.creational.singleton;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * {@link ApplicationData} is the implementation of
 * <code>Singleton</code> pattern
 */
public class ApplicationData {

    //Thread safe initialization
    private static final ApplicationData INSTANCE = new ApplicationData();

    //Could be anything that need to be shared across app
    //In this case the data
    private List<String> data;

    /*
     * First part of realization <code>Singleton</code> pattern.
     * The private constructor will guarantee that the other parts of program
     * can't create instances with <code>new</code>.
     */
    private ApplicationData() {
        //Initialization logic. In this example, reading the data from the file
        try {
            var pathToData = Paths.get(getClass().getClassLoader()
                    .getResource("data.txt").toURI());
            data = Files.readAllLines(pathToData);
        } catch (URISyntaxException | NullPointerException | IOException e) {
            Logger.getAnonymousLogger().log(Level.WARNING, e, () -> "Can't read the data");
            data = Collections.emptyList();
        }
    }

    /**
     * Second part of realization <code>Singleton</code> pattern is
     * <code>public static</code> method with return type of
     * <code>Singleton</code> class (in our case {@link ApplicationData})).
     *
     * @return The only instance of ApplicationData
     */
    public static ApplicationData getInstance() {
        return INSTANCE;
    }

    /**
     * @return Stored data within instance
     */
    public List<String> getData() {
        return data;
    }
}
