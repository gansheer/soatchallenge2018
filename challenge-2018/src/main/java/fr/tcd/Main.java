package fr.tcd;

import fr.tcd.input.DataReader;
import fr.tcd.result.ResultWriter;

import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        Stream.of("toto").forEach(i -> runOnDataset("filename"));
    }

    private static void runOnDataset(final String dataset) {
        try {
            final Object data = DataReader.load(dataset);
            final Object result = Algo.run(data);
            ResultWriter.write(dataset, result);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
