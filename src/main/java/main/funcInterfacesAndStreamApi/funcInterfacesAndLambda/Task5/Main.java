package main.funcInterfacesAndStreamApi.funcInterfacesAndLambda.Task5;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> string = System.out::println;

        string.accept("Привет, Мир!");
    }
}
