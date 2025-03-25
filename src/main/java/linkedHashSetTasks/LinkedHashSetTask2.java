package linkedHashSetTasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTask2 {

    Set<String> strings;

    public LinkedHashSetTask2() {
        this.strings = new LinkedHashSet<>();
    }

    public void addUnique(String element) {
        if (strings.contains(element)) {
            System.out.println("Элемент " + element + " уже есть в коллекции");
        } else {
            System.out.println("Элемент " + element + " добавлен");
            strings.add(element);
        }
        System.out.println(strings);
    }
}