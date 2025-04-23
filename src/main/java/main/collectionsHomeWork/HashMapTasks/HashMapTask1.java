package main.collectionsHomeWork.HashMapTasks;

/*
Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapTask1 {

    Map<String, Integer> persons;

    public HashMapTask1() {
        this.persons = new HashMap<>();
    }

    public void addPerson(String name, int age) {
        persons.put(name, age);
    }

    public void printPersons() {
        System.out.println(persons);
    }
}
