package kram.advent.day1;

import kram.advent.utils.StringUtil;
import kram.advent.AdventOfTest;
import org.junit.jupiter.api.Test;

import static kram.advent.day1.SecretEntrance.getPasswordV1;
import static kram.advent.day1.SecretEntrance.getPasswordV2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class SecretEntranceTest extends AdventOfTest {

    static String entranceTest1 = """
            L68
            L30
            R48
            L5
            R60
            L55
            L1
            L99
            R14
            L82
            """;

    @Test
    public void day1Test1() {
        List<String> input = StringUtil.stringToList(entranceTest1);

        int dial = 50;
        int password = 0;
        int result = getPasswordV1(input, dial, password);

        assertEquals(3, result);
    }

    @Test
    public void day1Test2() {
        List<String> input = StringUtil.stringToList(entranceTest1);

        int dial = 50;
        int password = 0;
        int result = getPasswordV2(input, dial, password);

        assertEquals(6, result);
    }
}
