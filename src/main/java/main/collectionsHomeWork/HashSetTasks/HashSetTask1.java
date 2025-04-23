package main.collectionsHomeWork.HashSetTasks;
/*
Создайте HashSet из 5 чисел и выведите его содержимое.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetTask1 {

    Set<Integer> numbers;

    public HashSetTask1() {
        this.numbers = new HashSet<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printNumbers() {
        System.out.println(numbers);
    }
}
