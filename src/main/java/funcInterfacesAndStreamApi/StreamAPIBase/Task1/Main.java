package funcInterfacesAndStreamApi.StreamAPIBase.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");

        List<String> result =
                strings.stream()
                        .filter(s -> s.length() > 5)
                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
