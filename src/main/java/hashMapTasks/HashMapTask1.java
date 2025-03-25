package hashMapTasks;

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
