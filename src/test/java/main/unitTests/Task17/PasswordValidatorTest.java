package main.unitTests.Task17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static main.unitTests.Task17.PasswordValidator.isValidPassword;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "Password1",
            "A1b2c3d4",
            "Test1234"
    })
    void testValidPasswords(String password) {
        assertTrue(isValidPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "pass",
            "password",
            "PASSWORD"
    })
    void testInvalidPasswords(String password) {
        assertFalse(isValidPassword(password));
    }

    @Test
    void testNullPassword() {
        assertFalse(isValidPassword(null));
    }
}