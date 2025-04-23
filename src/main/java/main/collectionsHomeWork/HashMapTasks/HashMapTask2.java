package main.collectionsHomeWork.HashMapTasks;

/*
Проверьте, есть ли определённое имя в HashMap.
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapTask2 {

    Map<String, Integer> persons;

    public HashMapTask2() {
        this.persons = new HashMap<>();
    }

    public void addPerson(String name, int age) {
        persons.put(name, age);
    }

    public void isPersonInCollection(String name) {
        if (persons.containsKey(name)) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }
}
