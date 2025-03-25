package arrayListTasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTask2 {

    private final List<Integer> numbers;

    public ArrayListTask2() {
        this.numbers = new ArrayList<>();
    }

    public void addNumbers(int number) {
        numbers.add(number);
    }

    public void printEvenNumbers() {
        for (Integer item : numbers) {
            if (item % 2 == 0) System.out.println(item);
        }
    }
}
