package collectionsHomeWork.HashMapTasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        HashMapTask1 persons = new HashMapTask1();
//
//        persons.addPerson("Bob", 10);
//        persons.addPerson("Max", 12);
//        persons.addPerson("Tim", 15);
//        persons.addPerson("Oleg", 20);
//
//        persons.printPersons();

        HashMapTask2 persons = new HashMapTask2();

        persons.addPerson("Bob", 10);
        persons.addPerson("Max", 12);
        persons.addPerson("Tim", 15);
        persons.addPerson("Oleg", 20);

        Scanner scanner = new Scanner(System.in);
        String checkName = scanner.nextLine();
        persons.isPersonInCollection(checkName);
    }
}