package main.collectionsHomeWork.LinkedHashSet;


/*
Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTask1 {

    private final Set<String> strings;

    public LinkedHashSetTask1() {
        this.strings = new LinkedHashSet<>();
    }

    public void addString(String newString) {
        strings.add(newString);
    }

    public void printListStrings() {
        System.out.println(strings);
    }
}
