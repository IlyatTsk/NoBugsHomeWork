package exceptionAndGenericsHomeWork.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

public class Util {

    public static void processCheckedException() {
        try {
            FileReader fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден" + e.getMessage());
        }
    }

    public static int divideTwoNumber(int a, int b) {
        int i = 0;
        try {
            i = a / b;
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя!" + e.getMessage());
        }
        return i;
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст некорреткный");
        }
    }

    public static void checkEmail(String email) {

        String emailRegex = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$";

        if (!Pattern.matches(emailRegex, email)) {
            throw new InvalidEmailException("Email не соответствует формату: " + email);
        }
    }
}
