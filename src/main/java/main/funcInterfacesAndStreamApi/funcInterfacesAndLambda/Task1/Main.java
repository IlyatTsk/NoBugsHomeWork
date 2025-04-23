package main.funcInterfacesAndStreamApi.funcInterfacesAndLambda.Task1;

public class Main {
    public static void main(String[] args) {
        MathOperations additional = (a, b) -> a + b;
        MathOperations substraction = (a,b) -> a - b;
        MathOperations multiply = (a,b) -> a * b;
        MathOperations divide = (a,b) -> a / b;

        double a = 1;
        double b = 2;

        System.out.println(additional.operate(a,b));
        System.out.println(substraction.operate(a,b));
        System.out.println(multiply.operate(a,b));
        System.out.println(divide.operate(a,b));
    }
}
