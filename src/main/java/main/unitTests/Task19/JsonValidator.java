package main.unitTests.Task19;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidator {

    public static boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
