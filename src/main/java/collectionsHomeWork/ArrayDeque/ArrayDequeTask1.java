package collectionsHomeWork.ArrayDeque;

/*
Создайте ArrayDeque, добавьте 5 элементов и выведите их.
 */

import java.util.ArrayDeque;

public class ArrayDequeTask1 {

    ArrayDeque<Integer> numbers;

    public ArrayDequeTask1() {
        this.numbers = new ArrayDeque<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printNumbers() {
        System.out.println(numbers);
    }
}
