package main.unitTests.Task4;

import java.util.Arrays;

public class MaxNumber {

    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
