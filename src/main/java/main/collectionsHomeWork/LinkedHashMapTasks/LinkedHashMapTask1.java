package main.collectionsHomeWork.LinkedHashMapTasks;

/*
Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
 */


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTask1 {

    Map<String, Integer> elements;

    public LinkedHashMapTask1() {
        this.elements = new LinkedHashMap<>();
    }

    public void addElement(String name, int value) {
        elements.put(name, value);
    }

    public void printElements() {
        System.out.println(elements);
    }
}
