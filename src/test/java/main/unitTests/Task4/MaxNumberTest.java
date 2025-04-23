package main.unitTests.Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты для проверки метода findMax")
class MaxNumberTest {

    MaxNumber maxNumber = new MaxNumber();
    @BeforeEach
    void setUp() {
        maxNumber = new MaxNumber();
    }

    @Test
    @DisplayName("Обычный массив '[3, 5, 7, 2]'")
    void checkUsuallyArray() {
        assertEquals(7, maxNumber.findMax(new int[]{3,5,7,2}));
    }

    @Test
    @DisplayName("Один элемент в массиве '[10]'")
    void checkOneElementInArray() {
        assertEquals(10, maxNumber.findMax(new int[]{10}));
    }

    @Test
    @DisplayName("Отрицательные числа в массиве '[-1, -2, 3]'")
    void checkNegativeNumbersInArray() {
        assertEquals(-1, maxNumber.findMax(new int[]{-1, -2, 3}));
    }

    @Test
    @DisplayName("Проверка исключения при пустом массиве '[]'")
    void checkExceptionWhenArrayIsEmpty() {
        assertThrows(NoSuchElementException.class, () -> maxNumber.findMax(new int[]{}));
    }
}