package hashSetTasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        HashSetTask1 setNumber = new HashSetTask1();

        setNumber.printSetNumber();

        setNumber.addNumber(1);
        setNumber.addNumber(2);
        setNumber.addNumber(3);
        setNumber.addNumber(4);
        setNumber.addNumber(5);

        setNumber.printSetNumber();

        //Задача 2
        System.out.println("Задача 2");
        HashSetTask2 setNumbers = new HashSetTask2();

        setNumbers.addNumbers();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска");
        int numberToCheck = scanner.nextInt();

        setNumbers.isNumberInSet(numberToCheck);
    }
}
