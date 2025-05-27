package main.unitTests.Task19;

import org.junit.jupiter.api.Test;

import static main.unitTests.Task19.JsonValidator.isValidJson;
import static org.junit.jupiter.api.Assertions.*;

class JsonValidatorTest {

    @Test
    void testValidJsonObjects() {
        assertTrue(isValidJson("{\"key\":\"value\"}"));
        assertTrue(isValidJson("[1, 2, 3]"));
        assertTrue(isValidJson("{\"a\":[1,2], \"b\":true}"));
    }
    @Test
    void testInvalidJsonStrings() {
        assertFalse(isValidJson("invalid json"));
        assertFalse(isValidJson("{key: value}"));
        assertFalse(isValidJson("{\"key\":}"));
        assertFalse(isValidJson(""));
    }
    @Test
    void testNullJson() {
        assertFalse(isValidJson(null));
    }
}