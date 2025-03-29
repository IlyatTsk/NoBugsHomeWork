package collectionsHomeWork.HashSetTasks;

/*
Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetTask2 {

    Set<Integer> numbers;

    public HashSetTask2() {
        this.numbers = new HashSet<>();
    }

    public void addNumber() {
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }

    public void isNumberInSet(int checkNumber) {
        if (numbers.contains(checkNumber)) {
            System.out.println("Число " + checkNumber + " есть в коллекции");
        } else {
            System.out.println("Числа " + checkNumber + " нет в коллекции");
        }
    }
}
