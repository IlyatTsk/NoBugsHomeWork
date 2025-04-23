package main.unitTests.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Тесты для проверки метода countVowels()")
class CountVowelLettersTest {

    private CountVowelLetters countVowelLetters;

    @BeforeEach
    void setUp() {
        countVowelLetters = new CountVowelLetters();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "Hello"})
    @DisplayName("Проверка работы метода на строках 'Hello' и 'HELLO'")
    public void shouldCountVowelsInHelloVariants(String input) {
        assertEquals(2, countVowelLetters.countVowels(input));
    }

    @Test
    @DisplayName("Проверка работы метода с null")
    void checkIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            countVowelLetters.countVowels(null);
        });
    }

    @Test
    @DisplayName("Проверка работы метода на пустой строке '' ")
    public void shouldReturnZeroForEmptyString() {
        assertEquals(0, countVowelLetters.countVowels(""));
    }

    @Test
    @DisplayName("Проверка работы метода на строке без гласных букв")
    void shouldReturnZeroForStringWithoutVowels() {
        assertEquals(0, countVowelLetters.countVowels("sdfg"));
    }

}