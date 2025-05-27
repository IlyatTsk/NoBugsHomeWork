package main.unitTests.Task13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static main.unitTests.Task13.AnagramChecker.isAnagram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramCheckerTest {

    @ParameterizedTest
    @CsvSource({"listen, silent",
            "'a gentleman', 'elegant man'",
            "School MASTER, The Classroom"})
    void testAnagrams(String firstString, String secondString) {
        assertTrue(isAnagram(firstString, secondString));
    }

    @ParameterizedTest
    @CsvSource({
            "java, python",
            "hello, helloo",
            "word,",
            ", word",
            ","})
    void testNonAnagrams(String firstString, String secondString) {
        assertFalse(isAnagram(firstString, secondString));
    }
}