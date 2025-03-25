package linkedHashSetTasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTask1 {

    Set<String> strings;

    public LinkedHashSetTask1() {
        this.strings = new LinkedHashSet<>();
    }

    public void addString() {
        for (int i = 1; i <= 5; i++) {
            strings.add("Строка " + i);
        }
        System.out.println(strings);
    }
}
