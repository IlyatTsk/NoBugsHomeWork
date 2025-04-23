package main.funcInterfacesAndStreamApi.StreamAPIBase.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        var result = numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
