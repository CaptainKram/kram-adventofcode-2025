package kram.advent.day2;

import kram.advent.AdventOfCode2025;
import kram.advent.utils.FileUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GiftShop extends AdventOfCode2025 {

    public static void main(String[] args) {
        AdventOfCode2025.inputString = FileUtil.fileToString(location.concat("day2/InvalidIDs"));

        List<String> invalidIdsList = new ArrayList<>();
        long sum = invalidIDsV2(inputString, invalidIdsList);
        System.out.println(sum);
    }

    public static long invalidIDsV1(String input, List<String> invalidIdsList) {
        String[] idRanges = input.split(",");
        long sum = 0;
        for (String idRange : idRanges) {
            String[] ranges = idRange.split("-");
            for (long i = Long.parseLong(ranges[0]); i <= Long.parseLong(ranges[1]); i++) {
                String currentID = String.valueOf(i);
                if (currentID.length() % 2 == 0) {
                    int halfLen = currentID.length() / 2;
                    String part1 = currentID.substring(0, halfLen);
                    String part2 = currentID.substring(halfLen);
                    if (part1.equals(part2)) {
                        invalidIdsList.add(currentID);
                        sum += Long.parseLong(currentID);
                    }
                }
            }
        }
        return sum;
    }

    public static long invalidIDsV2(String input, List<String> invalidIdsList) {
        String[] idRanges = input.split(",");
        long sum = 0;
        for (String idRange : idRanges) {
            String[] ranges = idRange.split("-");
            for (long i = Long.parseLong(ranges[0]); i <= Long.parseLong(ranges[1]); i++) {
                String currentID = String.valueOf(i);
                if (isInvalid(currentID)) {
                    invalidIdsList.add(currentID);
                    sum += Long.parseLong(currentID);
                }
            }
        }
        return sum;
    }

    private static boolean isInvalid(String id) {
        int len = id.length();
        boolean invalid = false;

        for (int i = 1; i < len; i++) {
            String token = id.substring(0, i);
            String[] parts = id.split(token);
            if (parts.length == 0) {
                invalid = true;
                break;
            }
        }

        return invalid;
    }
}
