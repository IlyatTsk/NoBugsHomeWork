package main.unitTests.Task12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }
}
