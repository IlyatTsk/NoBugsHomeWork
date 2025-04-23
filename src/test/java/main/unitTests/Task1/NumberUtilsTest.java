package main.unitTests.Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Тесты для метода isEven()")
public class NumberUtilsTest {

    private NumberUtils numberUtils;

    @BeforeEach
    void setUp() {
        numberUtils = new NumberUtils();
    }

    @Nested
    @DisplayName("Проверка положительных четных и нечетных чисел")
    class EvenAndOddNumbers {

        @Test
        @DisplayName("Положительные четные числа")
        public void checkEvenNumber() {
            assertTrue(numberUtils.isEven(2));
        }

        @Test
        @DisplayName("Положительные нечетные числа")
        public void checkOddNumber() {
            assertFalse(numberUtils.isEven(1));
        }
    }

    @Test
    @DisplayName("Проверка нулевого значения")
    public void checkZeroNumber() {
        assertTrue(numberUtils.isEven(0));
    }


    @Nested
    @DisplayName("Проверка отрицательных четных и нечетных чисел")
    class NegativeNumbers {
        @Test
        @DisplayName("Отрицательное четное число")
        public void checkNegativeEvenNumber() {
            assertTrue(numberUtils.isEven(-2));
        }

        @Test
        @DisplayName("Отрицательное нечетное число")
        void checkNegativeOddNumber() {
            assertFalse(numberUtils.isEven(-1));
        }
    }
}
