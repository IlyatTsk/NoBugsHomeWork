package main.unitTests.Task14;

import java.util.Arrays;

public class AverageCalculator {

    public static double findAverage(int[] numbers) {
        return Arrays.stream(numbers)
                .average()
                .orElseThrow();
    }
}
