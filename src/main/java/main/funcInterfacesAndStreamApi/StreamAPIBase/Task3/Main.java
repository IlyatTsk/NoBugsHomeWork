package main.funcInterfacesAndStreamApi.StreamAPIBase.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Один", "Два", "Три");

        var result = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
