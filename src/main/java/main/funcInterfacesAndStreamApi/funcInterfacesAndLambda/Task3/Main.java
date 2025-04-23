package main.funcInterfacesAndStreamApi.funcInterfacesAndLambda.Task3;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> isNumberEven = number -> number % 2 == 0;

        System.out.println(isNumberEven.test(3));
    }
}
