package funcInterfacesAndStreamApi.StreamGroup.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        var res = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(res);
    }
}
