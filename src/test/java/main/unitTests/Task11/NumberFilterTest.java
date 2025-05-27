package main.unitTests.Task11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static main.unitTests.Task11.NumberFilter.filterEvenNumbers;
import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {

    @Test
    void testFilterEvenFromMixedList() {
        List<Integer> input = Arrays.asList(1,2,3,4,5,6);
        List<Integer> expected = Arrays.asList(2,4,6);
        assertEquals(expected, filterEvenNumbers(input));
    }

    @Test
    void testFilterEvenFromOddOnlyList() {
        List<Integer> input = Arrays.asList(1,3,5);
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, filterEvenNumbers(input));
    }

    @Test
    void testFilterEvenFromEmptyList() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, filterEvenNumbers(input));
    }
}