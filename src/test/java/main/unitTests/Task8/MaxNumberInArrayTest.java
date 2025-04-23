package main.unitTests.Task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты на проверку поиска второго максимального числа в массиве")
class MaxNumberInArrayTest {

    private MaxSecondNumberInArray number;

    @BeforeEach
    void setUp() {
        number = new MaxSecondNumberInArray();
    }

    @Test
    @DisplayName("Обычный массив [7, 3, 6, 1]")
    void checkUsuallyArray() {
            assertEquals(6, number.findSecondMax(new int[]{7,3,6,1}));
    }

    //Тест падает, в логике метода баг, так как функция исключает дубликаты из массива
    @Test
    @DisplayName("Массив с одинаковыми числами [7, 7, 7, 7]")
    void checkArrayWithSameNumbers() {
            assertEquals(7, number.findSecondMax(new int[]{7, 7, 7, 7}));
    }

    @Test
    @DisplayName("Один элемент в массиве [7]")
    void checkExceptionWhenInArrayIsOneNumber() {
        assertThrows(Throwable.class, () -> number.findSecondMax(new int[]{7}));
    }
}