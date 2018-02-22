package fr.tcd;

import java.util.List;
import java.util.stream.Stream;

import fr.tcd.input.DataReader;
import fr.tcd.input.Input;
import fr.tcd.result.ResultLine;
import fr.tcd.result.ResultWriter;

public class Main {

    public static void main(String[] args) {
        Stream.of("crypto-input.txt").forEach(Main::runOnDataset);
    }

    private static void runOnDataset(final String dataset) {
        try {
            final Input data = DataReader.load(dataset);
            final List<ResultLine> result = Algo.run(data);
            ResultWriter.write(dataset, result, data.p);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
