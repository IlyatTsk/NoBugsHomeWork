package main.unitTests.Task14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static main.unitTests.Task14.AverageCalculator.findAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AverageCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideArraysForAverage")
    @DisplayName("Проверка корректного среднего значения")
    void testFindAverageParameterized(int[] input, double expected) {
        assertEquals(expected, findAverage(input));
    }

    static Stream<Arguments> provideArraysForAverage() {
        return Stream.of(
                Arguments.of(new int[]{2, 4, 6, 8}, 5.0),
                Arguments.of(new int[]{10}, 10.0),
                Arguments.of(new int[]{-1, -3, -5}, -3.0),
                Arguments.of(new int[]{-2, 0, 2}, 0.0)
        );
    }

    @Test
    @DisplayName("Пустой массив вызывает NoSuchElementException")
    void testFindAverageThrowsOnEmptyArray() {
        int[] numbers = {};
        assertThrows(NoSuchElementException.class, () -> findAverage(numbers));
    }
}