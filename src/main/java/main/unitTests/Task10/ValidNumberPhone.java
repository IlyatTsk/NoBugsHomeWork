package main.unitTests.Task10;

public class ValidNumberPhone {

    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
