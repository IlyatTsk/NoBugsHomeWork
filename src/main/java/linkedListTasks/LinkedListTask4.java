package linkedListTasks;

import java.util.LinkedList;
import java.util.List;

/*
Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
 */
public class LinkedListTask4 {

    List<Integer> numbers;

    public LinkedListTask4() {
        this.numbers = new LinkedList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printSumElements() {
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
