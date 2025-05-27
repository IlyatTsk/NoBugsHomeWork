package main.unitTests.Task12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static main.unitTests.Task12.StringSorter.sortByLength;
import static org.junit.jupiter.api.Assertions.*;

class StringSorterTest {

    @Test
    void testSortByLengthWithDifferentLengths() {
        List<String> input = Arrays.asList("Один", "Два", "Четыре");
        List<String> expected = Arrays.asList("Два", "Один", "Четыре");
        assertEquals(expected, sortByLength(input));
    }

    @Test
    void testSortByLengthWithSameLengths() {
        List<String> input = Arrays.asList("aa", "bb", "cc");
        List<String> expected = Arrays.asList("aa", "bb", "cc");
        assertEquals(expected, sortByLength(input));
    }

    @Test
    void testSortByLengthWithEmptyList() {
        List<String> input = Collections.emptyList();
        List<String> expected = Collections.emptyList();
        assertEquals(expected, sortByLength(input));
    }

}