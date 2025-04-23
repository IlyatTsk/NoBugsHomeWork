package main.unitTests.Task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Тесты на проверку метода валидации email")
class ValidateEmailTest {

    private ValidateEmail email;

    @BeforeEach
    void setUp() {
        email = new ValidateEmail();
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "test@yandex.ru"})
    @DisplayName("Проверка валидных email")
    void checkValidEmail(String emails) {
        assertTrue(email.isValidEmail(emails));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol"})
    @DisplayName("Проверка валидных email")
    void checkNotValidEmail(String emails) {
        assertFalse(email.isValidEmail(emails));
    }

    @Test
    @DisplayName("Проверка на null")
    void checkNullEmail() {
        assertFalse(email.isValidEmail(null));
    }
}