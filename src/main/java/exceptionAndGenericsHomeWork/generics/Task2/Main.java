package exceptionAndGenericsHomeWork.generics.Task2;

import static exceptionAndGenericsHomeWork.generics.Task2.Box.printArray;

public class Main {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Один", "Два", "Три"};
        Boolean[] booleansArray = {true, true, false};

        printArray(intArray);
        printArray(stringArray);
        printArray(booleansArray);
    }
}
