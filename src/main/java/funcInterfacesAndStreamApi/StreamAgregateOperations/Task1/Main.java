package funcInterfacesAndStreamApi.StreamAgregateOperations.Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        var result = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(result);
    }
}
