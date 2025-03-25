package hashSetTasks;

import java.util.HashSet;
import java.util.Set;

public class HashSetTask1 {

    Set<Integer> setNumber;

    public HashSetTask1() {
        this.setNumber = new HashSet<>();
    }

    public void addNumber(int newNumber) {
        setNumber.add(newNumber);
    }

    public void printSetNumber() {
        System.out.println(setNumber);
    }
}
