package main.collectionsHomeWork.TreeSet;

/*
Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок
 */


import java.util.Set;
import java.util.TreeSet;

public class TreeSetTask1 {

    Set<Integer> numbers;

    public TreeSetTask1() {
        this.numbers = new TreeSet<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printNumbers() {
        System.out.println(numbers);
    }
}
