package core.basesyntax.service.impl;

import core.basesyntax.service.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderImpl implements FileReader {
    @Override
    public List<String> read(String fileName) {
        List<String> dataFromFile;
        try {
            dataFromFile = Files.readAllLines(Path.of(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Can't read file" + fileName);
        }
        return dataFromFile;
    }
}