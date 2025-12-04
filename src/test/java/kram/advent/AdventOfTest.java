package kram.advent;

import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class AdventOfTest {

    @BeforeEach
    void setUp() {
        if (AdventOfCode2025.inputList != null) {
            AdventOfCode2025.inputList.clear();
        }
    }
}
