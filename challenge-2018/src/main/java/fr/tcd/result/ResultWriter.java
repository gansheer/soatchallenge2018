package fr.tcd.result;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class ResultWriter {

    public static void write(String dataset, Object data) throws IOException {
        FileUtils.writeLines(new File(dataset + ".txt"), getLines(data));

    }

    private static Collection<String> getLines(final Object data) {
        return null;
    }
}
