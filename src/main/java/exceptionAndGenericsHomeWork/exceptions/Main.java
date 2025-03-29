package exceptionAndGenericsHomeWork.exceptions;

import static exceptionAndGenericsHomeWork.exceptions.Util.*;

public class Main {
    public static void main(String[] args) {

        //Задача 2
        divideTwoNumber(1, 0);

        //Задача 3
        try {
            checkAge(151);
        } catch (InvalidAgeException e) {
            System.out.println("Сообщение об ошибке " + e.getMessage());
        }

        //Задача 4
        //checkEmail("123");

        try {
            checkEmail("123");
        } catch (InvalidEmailException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}