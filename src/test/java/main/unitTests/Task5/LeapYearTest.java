package main.unitTests.Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты по проверки метода является ли год високосным")
class LeapYearTest {

    private LeapYear leapYear;

    @BeforeEach
    void setUp() {
        leapYear = new LeapYear();
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    @DisplayName("Проверки на високосные года 2020, 2000, 1600")
    void checkLeapYears(int years) {
        assertTrue(leapYear.isLeapYear(years));
    }

    @ParameterizedTest
    @ValueSource(ints = {2021, 2022, 2023})
    @DisplayName("Проверки на НЕвисокосные года 2021, 2022, 2023")
    void checkNotLeapYears(int years) {
        assertFalse(leapYear.isLeapYear(years));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    @DisplayName("Проверки на года, которые делятся на 100, но не на 400 (1900, 2100)")
    void checkYearsWhichDivideOn1900And2100(int years) {
        assertFalse(leapYear.isLeapYear(years));
    }
}