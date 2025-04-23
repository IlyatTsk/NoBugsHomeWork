package main.funcInterfacesAndStreamApi.StreamAPIBase.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3);

        var result = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
