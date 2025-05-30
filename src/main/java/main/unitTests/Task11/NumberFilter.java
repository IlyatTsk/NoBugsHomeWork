package main.unitTests.Task11;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
