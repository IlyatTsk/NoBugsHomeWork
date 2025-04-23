package main.unitTests.Task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты по проверке метода, считающего количество слов в строке")
class CountWordsInStringTest {

    private CountWordsInString inputString;

    @BeforeEach
    void setUp() {
        inputString = new CountWordsInString();
    }

    @Test
    @DisplayName("Строка с несколькими пробелами")
    void checkStringWithSeveralSpaces() {
        assertEquals(4, inputString.countWords("Строка с несколькими пробелами"));
    }

    @Test
    @DisplayName("Пустая строка")
    void checkEmptyString() {
        assertEquals(0, inputString.countWords(""));
    }

    //Тест падает необходимо обрабатывать исключение в методе
    @Test
    @DisplayName("null")
    void checkWhenStringIsNull() {
        assertNull(inputString.countWords(null));
    }
}