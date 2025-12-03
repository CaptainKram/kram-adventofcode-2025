package kram.advent.utils;

import java.util.List;
import java.util.stream.Stream;

public class StringUtil {

    public static List<String> stringToList(String s) {
        Stream<String> linesStream =  s.lines();
        return linesStream.toList();
    }

}
