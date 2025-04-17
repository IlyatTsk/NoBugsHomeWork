package funcInterfacesAndStreamApi.StreamAgregateOperations.Task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        var result = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(result);
    }
}
