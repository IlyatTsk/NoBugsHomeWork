package main.unitTests.Task18;

public class MathUtils {

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b,a % b);
    }
}
