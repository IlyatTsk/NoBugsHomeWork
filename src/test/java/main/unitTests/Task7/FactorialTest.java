package main.unitTests.Task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Тесты по проверке метода, который вычисляет факториал числа")
class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    @DisplayName("0! = 1")
    void checkZeroNumber() {
        assertEquals(1, factorial.factorial(0));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "5, 120", "7, 5040"})
    @DisplayName("Маленькие числа")
    void littleNumbers(int input, int expected) {
        assertEquals(expected, factorial.factorial(input));
    }

    @Test
    @DisplayName("Проверка исключения на отрицательных числах")
    void checkNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(-1));
    }

}