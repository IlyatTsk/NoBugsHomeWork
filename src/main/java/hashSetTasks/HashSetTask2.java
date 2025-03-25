package hashSetTasks;

import java.util.HashSet;
import java.util.Set;

public class HashSetTask2 {

    Set<Integer> setNumbers;

    public HashSetTask2() {
        this.setNumbers = new HashSet<>();
    }

    public void addNumbers() {
        for (int i = 1; i <= 10; i++) {
            setNumbers.add(i);
        }
        System.out.println(setNumbers);
    }

    public void isNumberInSet(int numberToCheck) {
        if (setNumbers.contains(numberToCheck)) {
            System.out.println("Число " + numberToCheck + " есть в коллекции");
        } else {
            System.out.println("Числа " + numberToCheck + " нет в коллекции");
        }
    }
}