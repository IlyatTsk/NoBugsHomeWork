package funcInterfacesAndStreamApi.StreamAgregateOperations.Task5;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        var result = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(result);
    }
}
