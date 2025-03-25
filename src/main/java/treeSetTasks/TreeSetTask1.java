package treeSetTasks;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTask1 {

    Set<Integer> numbers;

    public TreeSetTask1() {
        this.numbers = new TreeSet<>();
    }

    public void addNumber() {
        for (int i = 5; i > 0; i--) {
            numbers.add(i);
            System.out.println(numbers);
        }
    }
}
