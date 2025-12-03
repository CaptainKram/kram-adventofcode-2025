package kram.advent;

import org.junit.jupiter.api.BeforeEach;

import static kram.advent.AdventOfCode2025.input;

public class AdventOfTest {

    @BeforeEach
    void setUp() {
        if (input != null) {
            input.clear();
        }
    }
}
