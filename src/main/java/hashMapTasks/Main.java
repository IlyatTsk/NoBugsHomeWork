package hashMapTasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        HashMapTask1 persons = new HashMapTask1();

        persons.addPerson("Ilya", 31);
        persons.addPerson("Max", 32);
        persons.addPerson("Tima", 33);

        persons.printPersons();

        //Задача 2
        System.out.println("Задача 2");

        HashMapTask2 persons2 = new HashMapTask2();

        persons2.addPerson("Ilya", 31);
        persons2.addPerson("Max", 32);
        persons2.addPerson("Tima", 33);

        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String checkName = scanner.nextLine();
        persons2.isPersonInCollection(checkName);
    }
}
