package main.unitTests.Task16;

import org.junit.jupiter.api.Test;

import static main.unitTests.Task16.StringSplitter.splitString;
import static org.junit.jupiter.api.Assertions.*;

class StringSplitterTest {

    @Test
    void testSplitStringWithDelimiter() {
        String input = "Java,Python,C++";
        String[] expected = {"Java", "Python", "C++"};
        assertArrayEquals(expected, splitString(input, ","));
    }

    @Test
    void testSplitEmptyString() {
        String input = "";
        String[] expected = {""};
        assertArrayEquals(expected, splitString(input, ","));
    }

    @Test
    void testSplitWithoutDelimiter() {
        String input = "word";
        String[] expected = {"word"};
        assertArrayEquals(expected, splitString(input, ","));
    }
}