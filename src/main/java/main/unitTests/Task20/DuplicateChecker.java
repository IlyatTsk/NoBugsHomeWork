package main.unitTests.Task20;

import java.util.Arrays;

public class DuplicateChecker {
    public static boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() !=
               numbers.length;
    }
}
