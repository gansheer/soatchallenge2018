package fr.tcd;

import java.util.stream.Stream;

import fr.tcd.input.DataReader;
import fr.tcd.input.Input;
import fr.tcd.result.ResultWriter;

public class Main {

    public static void main(String[] args) {
        Stream.of("crypto-input.txt").forEach(Main::runOnDataset);
    }

    private static void runOnDataset(final String dataset) {
        try {
            final Input data = DataReader.load(dataset);
            final Object result = Algo.run(data);
            ResultWriter.write(dataset, result);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
