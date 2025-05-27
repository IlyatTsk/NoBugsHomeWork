package main.unitTests.Task17;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
    }
}
