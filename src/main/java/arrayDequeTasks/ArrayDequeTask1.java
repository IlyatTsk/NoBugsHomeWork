package arrayDequeTasks;

import java.util.ArrayDeque;

public class ArrayDequeTask1 {

    ArrayDeque<Integer> numbers;

    public ArrayDequeTask1() {
        this.numbers = new ArrayDeque<>();
    }

    public void addNumber() {
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
