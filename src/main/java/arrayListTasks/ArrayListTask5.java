package arrayListTasks;

/*
Создайте ArrayList из целых чисел.
Напишите программу, которая находит и выводит максимальное число из списка.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTask5 {

    private final List<Integer> numbers;

    public ArrayListTask5() {
        this.numbers = new ArrayList<>();
    }

    public void addNumbers(int number) {
        numbers.add(number);
    }

    public void printMaxNumber() {
        int max = numbers.getFirst();
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }

    public void printMaxNumber2() {
        System.out.println(Collections.max(numbers));
    }
}
