package main.collectionsHomeWork.LinkedListTasks;
/*
Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListTask1 {

    private final List<String> strings;

    public LinkedListTask1() {
        this.strings = new LinkedList<>();
    }

    public void addString(String newString) {
        strings.add(newString);
    }

    public void printStrings() {
        System.out.println(strings);
    }
}
