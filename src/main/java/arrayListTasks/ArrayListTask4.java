package arrayListTasks;

import java.util.ArrayList;
import java.util.List;

/*
Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех
чисел в списке.
 */

public class ArrayListTask4 {

    List<Integer> numbers;

    public ArrayListTask4() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void sumNumbers() {
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
