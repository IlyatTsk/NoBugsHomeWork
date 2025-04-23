package main.exceptionAndGenericsHomeWork.generics.Task2;

public class Box {

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
