package fr.tcd.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author patrick.allain@soat.fr - 2/22/18.
 */
public class DataReader {

    public static Object load(final String dataset) {
//        final Scanner in = new Scanner(ClassLoader.getSystemResourceAsStream(dataset));
        try {
            Files.readAllLines(Paths.get("src/main/java/", dataset));
            return null;
        } catch (IOException e) {
            throw new RuntimeException("Failed to load file");
        }
    }
}
