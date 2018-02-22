package fr.tcd.result;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class ResultWriter {

    public static void write(String dataset, List<ResultLine> data, int nbDays) throws IOException {
        FileUtils.writeLines(new File(dataset + ".txt"), getLines(data, nbDays));

    }

    private static Collection<String> getLines(final List<ResultLine> data, int nbDays) {
    	return data.stream().map(line -> line.printLine(nbDays)).collect(Collectors.toList());
    }
}
