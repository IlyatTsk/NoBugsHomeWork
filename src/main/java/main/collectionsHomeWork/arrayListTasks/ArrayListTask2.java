package main.collectionsHomeWork.arrayListTasks;

/*
Напишите программу, которая выводит все чётные числа из ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTask2 {

    private final List<Integer> numbers;

    public ArrayListTask2() {
        this.numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    }

    public void printEvenNumbers() {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
