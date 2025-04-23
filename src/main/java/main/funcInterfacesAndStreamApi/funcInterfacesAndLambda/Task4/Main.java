package main.funcInterfacesAndStreamApi.funcInterfacesAndLambda.Task4;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<String, Integer> legthString = s -> s.length();

        System.out.println(legthString.apply("Три"));
    }
}
