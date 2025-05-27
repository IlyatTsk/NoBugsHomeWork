package main.unitTests.Task20;

import org.junit.jupiter.api.Test;

import static main.unitTests.Task20.DuplicateChecker.hasDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateCheckerTest {

    @Test
    void testArrayWithoutDuplicates() {
        int[] input = {1, 2, 3, 4, 5};
        assertFalse(hasDuplicates(input));
    }
    @Test
    void testArrayWithDuplicates() {
        int[] input = {1, 2, 2, 3};
        assertTrue(hasDuplicates(input));
    }
    @Test
    void testArrayWithAllDuplicates() {
        int[] input = {5, 5, 5, 5};
        assertTrue(hasDuplicates(input));
    }
    @Test
    void testEmptyArray() {
        int[] input = {};
        assertFalse(hasDuplicates(input));
    }

}