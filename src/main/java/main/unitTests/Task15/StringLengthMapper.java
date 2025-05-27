package main.unitTests.Task15;

import java.util.List;
import java.util.stream.Collectors;

public class StringLengthMapper {

    public static List<Integer> mapToLength(List<String> words) {
        return words.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
}
