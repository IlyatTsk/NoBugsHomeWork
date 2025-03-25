package priorityQueueTasks;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTask1 {

    Queue<Integer> numbers;

    public PriorityQueueTask1() {
        this.numbers = new PriorityQueue<>();
    }

    public void addNumber() {
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }

    public void printElements() {
        while (!numbers.isEmpty()) {
            numbers.poll();
            System.out.println(numbers);
        }
    }

}
