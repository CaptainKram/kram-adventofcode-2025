package kram.advent.day1;

import kram.advent.AdventOfCode2025;
import kram.advent.utils.FileUtil;

import java.util.List;

public class SecretEntrance extends AdventOfCode2025 {


    public static void main(String[] args) {
        input = FileUtil.fileToList(location.concat("day1/SecretEntrance"));

        int dial = 50;
        int password = 0;
//        password = getPasswordV1(input, dial, password);
        password = getPasswordV2(input, dial, password);
        System.out.println(password);
    }

    public static int getPasswordV1(List<String> input, int dial, int password) {
        for (String s : input) {
            int delta = Integer.parseInt(s.substring(1));
            if (s.startsWith("L")) {
                dial -= delta;
            } else if (s.startsWith("R")) {
                dial += delta;
            }
            while (dial < 0) {
                dial += 100;
            }
            while (dial > 100) {
                dial -= 100;
            }
            if (dial == 0) {
                password++;
            } else if (dial == 100) {
                password++;
            }
        }
        return password;
    }

    public static int getPasswordV2(List<String> input, int dial, int password) {
        for (String s : input) {
            int delta = Integer.parseInt(s.substring(1));
            password += delta / 100;
            delta %= 100;
            if (s.startsWith("L")) {
                boolean startedZero = dial == 0;
                dial -= delta;
                if (dial == 0) {
                    password++;
                } else if (dial < 0) {
                    dial += 100;
                    if (!startedZero) {
                        password++;
                    }
                }
            } else {
                dial += delta;
                if (dial >= 100) {
                    dial -= 100;
                    password++;
                }
            }
        }
        return password;
    }

}
