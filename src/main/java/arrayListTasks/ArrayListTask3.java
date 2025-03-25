package arrayListTasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTask3 {

    private final List<String> strings;

    public ArrayListTask3() {
        this.strings = new ArrayList<>();
    }

    public void addString(String newString) {
        strings.add(newString);
    }

    public void printLongestString() {
        String longest = "";
        for (String item : strings) {
            if (item.length() > longest.length()) {
                longest = item;
            }
        }
        System.out.println("Самая длинная строка: " + longest);
    }
}
