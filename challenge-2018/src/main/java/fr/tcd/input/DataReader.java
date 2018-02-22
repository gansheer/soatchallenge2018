package fr.tcd.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author patrick.allain@soat.fr - 2/22/18.
 */
public class DataReader {

    public static Input load(final String dataset) {
        try {
            final List<String> lines = Files.readAllLines(Paths.get("src/main/resources/", dataset));
            final int[] split = Stream.of(lines.get(0).split("\\s+")).mapToInt(Integer::valueOf).toArray();
            final List<Info> infos = lines.stream()
                    .skip(1)
                    .map(String::trim)
                    .map(l -> l.split("\\s+"))
                    .map(DataReader::toInfo)
                    .collect(Collectors.toList());
            return new Input(split[0], split[1], split[2], split[3], infos);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load file", e);
        }
    }

    private static Info toInfo(final String[] cryptoLine) {
        final List<Integer> values = Stream.of(cryptoLine).skip(1).map(Integer::valueOf).collect(Collectors.toList());
        return new Info(cryptoLine[0], values);
    }
}
