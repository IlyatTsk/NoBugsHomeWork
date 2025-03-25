package linkedListTasks;

/*
Создайте LinkedList, содержащий несколько строк.
Напишите программу, которая печатает первый и последний элементы списка.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListTask3 {

    List<String> strings;

    public LinkedListTask3() {
        this.strings = new LinkedList<>();
    }

    public void addString(String newString) {
        strings.add(newString);
    }

    public void printFirstAndLastElement() {
        if (!strings.isEmpty()) {
            System.out.println(strings.getFirst());
            System.out.println(strings.getLast());
        }
    }
}
