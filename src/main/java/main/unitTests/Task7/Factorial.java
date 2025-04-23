package main.unitTests.Task7;

public class Factorial {

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
       Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(1));
    }
}
