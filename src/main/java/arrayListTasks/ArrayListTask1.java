package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTask1 {

    private final List<Integer> numbers;

    public ArrayListTask1() {
        this.numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    public void addNumbers(int number) {
        numbers.add(number);
    }

    public void printNumbers() {
        System.out.println(numbers);
    }
}
