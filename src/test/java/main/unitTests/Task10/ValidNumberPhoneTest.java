package main.unitTests.Task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты по проверке валидности номера телефона")
class ValidNumberPhoneTest {

    private ValidNumberPhone numberPhone;

    @BeforeEach
    void setUp() {
        numberPhone = new ValidNumberPhone();
    }

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+7 1234567890"})
    @DisplayName("Корректные номера")
    void checkValidNumberPhone(String inputNumberPhone) {
        assertTrue(numberPhone.isValidPhoneNumber(inputNumberPhone));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid"})
    @DisplayName("Некорректные номера")
    void checkNotValidNumberPhone(String inputNumberPhone) {
        assertFalse(numberPhone.isValidPhoneNumber(inputNumberPhone));
    }
}