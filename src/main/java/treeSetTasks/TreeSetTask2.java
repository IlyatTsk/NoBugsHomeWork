package treeSetTasks;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTask2 {

    Set<Integer> numbers;

    public TreeSetTask2() {
        this.numbers = new TreeSet<>();
    }

    public void checkUniqueNumber() {
        for (int i = 5; i > 0; i--) {
            numbers.add(i);
            System.out.println(numbers);
        }
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
    }

    public void addNumber(int number) {
        if (!numbers.contains(number)) {
            numbers.add(number);
        } else {
            System.out.println("Дубликат! Число " + number + " уже есть в коллекции");
        }
        System.out.println(numbers);
    }
}
