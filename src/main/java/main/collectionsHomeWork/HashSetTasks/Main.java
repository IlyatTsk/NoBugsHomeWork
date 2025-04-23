package main.collectionsHomeWork.HashSetTasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        HashSetTask1 listNumber = new HashSetTask1();
//
//        listNumber.addNumber(1);
//        listNumber.addNumber(2);
//        listNumber.addNumber(3);
//        listNumber.addNumber(4);
//        listNumber.addNumber(5);
//
//        listNumber.

        HashSetTask2 listNumber = new HashSetTask2();

        listNumber.addNumber();

        System.out.println("Введите проверяемое число");
        Scanner scanner = new Scanner(System.in);

        int checkNumber = scanner.nextInt();
        listNumber.isNumberInSet(checkNumber);
    }
}
