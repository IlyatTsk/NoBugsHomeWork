package main.unitTests.Task15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static main.unitTests.Task15.StringLengthMapper.mapToLength;
import static org.junit.jupiter.api.Assertions.*;

class StringLengthMapperTest {
    @Test
    void testMapToLengthWithNormalList() {
        List<String> input = Arrays.asList("Java", "C++", "Go");
        List<Integer> expected = Arrays.asList(4,3,2);
        assertEquals(expected, mapToLength(input));
    }

    @Test
    void testMapToLengthWithEmptyList() {
        List<String> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, mapToLength(input));
    }
}