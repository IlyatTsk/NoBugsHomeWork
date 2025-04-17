package funcInterfacesAndStreamApi.StreamAgregateOperations.Task4;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Один", "Два", "Три", "Бугага", "Четыре", "Ббб");

        var result = strings.stream()
                .filter(s-> s.startsWith("Б"))
                .findFirst();

        System.out.println(result);
    }
}
