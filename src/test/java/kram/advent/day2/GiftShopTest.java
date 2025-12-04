package kram.advent.day2;

import kram.advent.AdventOfTest;
import kram.advent.utils.FileUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static kram.advent.day2.GiftShop.invalidIDsV1;
import static kram.advent.day2.GiftShop.invalidIDsV2;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GiftShopTest extends AdventOfTest {

    static String testInput = FileUtil.fileToString("inputs/day2/testIDRanges");

    @Test
    void day2Test1() {
        List<String> invalidIdsList = new ArrayList<>();
        long sum = invalidIDsV1(testInput, invalidIdsList);
        assertEquals(1227775554L, sum);
    }

    @Test
    void day2Test2() {
        List<String> invalidIdsList = new ArrayList<>();
        long sum = invalidIDsV2(testInput, invalidIdsList);
        assertEquals(4174379265L, sum);
    }

}
