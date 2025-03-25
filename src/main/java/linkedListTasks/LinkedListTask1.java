package linkedListTasks;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTask1 {

    List<String> strings;

    public LinkedListTask1() {
        this.strings = new LinkedList<>();
    }

    public void addString(String newString) {
        strings.add(newString);
    }

    public void printListString() {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
