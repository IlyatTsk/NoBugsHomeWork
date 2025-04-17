package funcInterfacesAndStreamApi.StreamGroup.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Один", "Два", "Три");

        var res = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(res);
    }
}
