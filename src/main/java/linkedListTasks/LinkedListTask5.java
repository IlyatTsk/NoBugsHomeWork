package linkedListTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Используйте ListIterator для прохода по LinkedList в обоих направлениях.
 */

public class LinkedListTask5 {

    List<String> strings;

    public LinkedListTask5() {
        this.strings = new LinkedList<>();
    }

    public void addString(String newString) {
        strings.add(newString);
    }

    public void printStrings() {
        ListIterator<String> it = strings.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}