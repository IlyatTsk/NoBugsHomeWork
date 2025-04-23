package main.collectionsHomeWork.PriorityQueueTasks;


/*
Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTask1 {

    Queue<Integer> numbers;

    public PriorityQueueTask1() {
        this.numbers = new PriorityQueue<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printNumbers() {
        if (!numbers.isEmpty()) {
            numbers.poll();
            System.out.println(numbers);
        }
    }
}
