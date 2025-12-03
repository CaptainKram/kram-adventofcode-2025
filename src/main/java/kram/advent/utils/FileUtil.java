package kram.advent.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {

    private static final ClassLoader cl = FileUtil.class.getClassLoader();

    public static List<String> fileToList(String location) {
        try {
            URI uri = cl.getResource(location).toURI();
            return Files.readAllLines(Path.of(uri), StandardCharsets.UTF_8);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String fileToString(String location) {
        try {
            URI uri = cl.getResource(location).toURI();
            return Files.readString(Path.of(uri), StandardCharsets.UTF_8);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
