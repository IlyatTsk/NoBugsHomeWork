package main.unitTests.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Получаем текущую дату
        LocalDate today = LocalDate.now();
        // Форматируем дату в нужный формат "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = "\"" + today.format(formatter) + "\",";
        // Выводим результат
        System.out.println(formattedDate);
    }
}