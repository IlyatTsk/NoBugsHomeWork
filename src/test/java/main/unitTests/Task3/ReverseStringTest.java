package main.unitTests.Task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Тесты для проверки работы метода reverse")
class ReverseStringTest {

    private ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Nested
    class UsuallyStringsTests {

        @Test
        @DisplayName("Проверка работы метода строке 'qwerty' ")
        void checkSimpleString() {
            assertEquals("ytrewq", reverseString.reverse("qwerty"));
        }

        @Test
        @DisplayName("Проверка работы метода на строке палиндроме 'abba'")
        void palindromeString() {
            assertEquals("abba", reverseString.reverse("abba"));
        }

        @Test
        @DisplayName("Проверка работы метода на строке 'ddd'")
        void similarString() {
            assertEquals("ddd", reverseString.reverse("ddd"));
        }
    }

    @Test
    @DisplayName("Проверка пустой строки")
    void EmptyString() {
        assertEquals("", reverseString.reverse(""));
    }

    @Test
    @DisplayName("Проверка работы метода с null")
    void checkNullString() {
        assertNull(reverseString.reverse(null));
    }
}